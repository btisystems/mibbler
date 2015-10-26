/**
 *
 * Copyright (C) BTI Systems Inc. 2001-2009. All Rights Reserved.
 *
 * The information contained herein is the property of BTI Systems
 * Inc. and is strictly confidential. Except as expressly authorized
 * in writing by BTI Systems Inc., the holder shall keep all
 * information contained herein confidential, shall disclose the
 * information only to its employees with a need to know, and shall
 * protect the information, in whole or in part, from disclosure and
 * dissemination to third parties with the same degree of care it uses
 * to protect its own confidential information, but with no less than
 * reasonable care. Except as expressly authorized in writing by BTI
 * Systems Inc., the holder is granted no rights to use the
 * information contained herein.
 *
 * Unpublished. All rights reserved under the copyright laws of
 * Canada.
 *
 * $Id: AbstractMibCompiler.java 16710 2014-11-03 08:17:34Z sjames $
 */

package com.btisystems.pronx.ems;

import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription.FieldDescription;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription.FieldType;
import com.btisystems.pronx.ems.core.model.GeneratedIdentifiers;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JForEach;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;
import net.percederberg.mibble.Mib;
import net.percederberg.mibble.MibType;
import net.percederberg.mibble.MibTypeTag;
import net.percederberg.mibble.MibValue;
import net.percederberg.mibble.MibValueSymbol;
import net.percederberg.mibble.snmp.SnmpNotificationType;
import net.percederberg.mibble.snmp.SnmpObjectType;
import net.percederberg.mibble.snmp.SnmpTextualConvention;
import net.percederberg.mibble.type.BitSetType;
import net.percederberg.mibble.type.ChoiceType;
import net.percederberg.mibble.type.Constraint;
import net.percederberg.mibble.type.IntegerType;
import net.percederberg.mibble.type.ObjectIdentifierType;
import net.percederberg.mibble.type.SizeConstraint;
import net.percederberg.mibble.type.StringType;
import net.percederberg.mibble.type.ValueConstraint;
import net.percederberg.mibble.type.ValueRangeConstraint;
import net.percederberg.mibble.value.NumberValue;
import net.percederberg.mibble.value.ObjectIdentifierValue;
import net.percederberg.mibble.value.StringValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snmp4j.smi.OID;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Base class for MIB compilers, containing useful methods common to different
 * compilers.
 */
public abstract class AbstractMibCompiler {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractMibCompiler.class);

    /**
     * The constant PARENT_ENTITY_IDENTIFIER.
     */
    protected static final String PARENT_ENTITY_IDENTIFIER = "parentEntity";

    private static final int DEFAULT_STRING_COLUMN_WIDTH = 1024;
    private static final int SIXTY_FOUR = 64;
    private static final int ONE_THOUSAND_AND_TWENTY_FOUR = 1024;
    private static final int SIX = 6;
    /**
     * The constant DEFAULT_OCTET_STRING_COLUMN_WIDTH.
     */
    protected static final int DEFAULT_OCTET_STRING_COLUMN_WIDTH = (SIXTY_FOUR * ONE_THOUSAND_AND_TWENTY_FOUR) - 1;

    private static final int OCTET_STRING_DISPLAY_FACTOR = 4;
    private static final int MAXIMUM_OCTET_STRING_LENGTH_DISPLAY_FACTOR_APPLIES = 16;

    /**
     * The constant RESERVED_WORD_SET. See http://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html, using set to confirm uniqueness
     */
    protected static final Set<String> RESERVED_WORD_SET = new HashSet<>(Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
            "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
            "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"));
    private static final String UNDERSCORE = "_";
    public static final String TO_STRING = "toString";
    public static final String APPEND = "append";
    public static final String CLONE = "clone";


    /**
     * The Code model.
     */
    protected JCodeModel codeModel;
    /**
     * The Package name.
     */
    protected final String packageName;

    /**
     * Instantiates a new Abstract mib compiler.
     *
     * @param packageName the package name
     */
    public AbstractMibCompiler(final String packageName) {
        super();
        this.packageName = packageName;
    }

    /**
     * Create class j defined class.
     *
     * @param packageName the package name
     * @param name        the name
     * @return the j defined class
     */
    protected final JDefinedClass createClass(final String packageName, final String name) {
        return createClass(packageName, name, ClassType.CLASS);
    }

    /**
     * Create interface j defined class.
     *
     * @param packageName the package name
     * @param name        the name
     * @return the j defined class
     */
    protected final JDefinedClass createInterface(final String packageName, final String name) {
        return createClass(packageName, name, ClassType.INTERFACE);
    }

    /**
     * Create class j defined class.
     *
     * @param packageName the package name
     * @param name        the name
     * @param type        the type
     * @return the j defined class
     */
    protected final JDefinedClass createClass(final String packageName, final String name, final ClassType type) {
        final String className = getFullClassName(packageName, name);
        try {
            return codeModel._class(className, type);
        } catch (final JClassAlreadyExistsException e) {
            LOG.warn("Class already exists:{}", className);
            return codeModel._getClass(className);
        }
    }

    /**
     * Gets full class name.
     *
     * @param packageName the package name
     * @param name        the name
     * @return the full class name
     */
    protected final String getFullClassName(final String packageName, final String name) {
        return packageName + "." + name;
    }

    /**
     * Gets oid from symbol.
     *
     * @param rootSymbol the root symbol
     * @return the oid from symbol
     */
    protected final String getOidFromSymbol(final MibValueSymbol rootSymbol) {
        return rootSymbol.getValue().toString();
    }

    /**
     * Gets notification fields.
     *
     * @param notificationType the notification type
     * @return the notification fields
     */
    @SuppressWarnings("unchecked")
    protected final List<ObjectIdentifierValue> getNotificationFields(final SnmpNotificationType notificationType) {
        return notificationType.getObjects();
    }

    /**
     * Gets symbol by oid.
     *
     * @param rootSymbol the root symbol
     * @param value      the value
     * @return the symbol by oid
     */
    protected final MibValueSymbol getSymbolByOid(final MibValueSymbol rootSymbol, final ObjectIdentifierValue value) {
        for (final Mib mib : rootSymbol.getMib().getLoader().getAllMibs()) {
            final MibValueSymbol symbol = mib.getSymbolByValue(value);
            if (symbol != null) {
                return symbol;
            }
        }
        return null;
    }

    /**
     * Determine the java type corresponding to a 'simple' SnmpObjectType.
     *
     * @param type the type
     * @return the j type
     */
    protected final JType mapObjectTypeToJavaType(final MibType type) {
        final MibType objectType = ((SnmpObjectType) type).getSyntax();
        return getJavaType(objectType);
    }

    /**
     * Is unsigned 32 boolean.
     *
     * @param type the type
     * @return the boolean
     */
    protected final boolean isUnsigned32(final MibType type) {
        final MibType objectType = ((SnmpObjectType) type).getSyntax();
        // Look for Application-wide type 2 (Unsigned32, Counter etc)s
        return objectType.hasTag(MibTypeTag.APPLICATION_CATEGORY, 2);
    }

    /**
     * Is ip address boolean.
     *
     * @param type the type
     * @return the boolean
     */
    protected final boolean isIpAddress(final MibType type) {
        final MibType objectType = ((SnmpObjectType) type).getSyntax();
        return objectType.hasReferenceTo("IpAddress");
    }

    /**
     * Is date and time boolean.
     *
     * @param type the type
     * @return the boolean
     */
    protected final boolean isDateAndTime(final MibType type) {
        final MibType objectType = ((SnmpObjectType) type).getSyntax();
        return objectType.hasReferenceTo("DateAndTime");
    }

    /**
     * Is fixed x 10 boolean.
     *
     * @param type the type
     * @return the boolean
     */
    protected final boolean isFixedX10(final MibType type) {
        final MibType objectType = ((SnmpObjectType) type).getSyntax();
        return objectType.hasReferenceTo("FixedX10");
    }

    /**
     * Is fixed x 100 boolean.
     *
     * @param type the type
     * @return the boolean
     */
    protected final boolean isFixedX100(final MibType type) {
        final MibType objectType = ((SnmpObjectType) type).getSyntax();
        return objectType.hasReferenceTo("FixedX100");
    }

    /**
     * Is fixed x 1000 boolean.
     *
     * @param type the type
     * @return the boolean
     */
    protected final boolean isFixedX1000(final MibType type) {
        final MibType objectType = ((SnmpObjectType) type).getSyntax();
        return objectType.hasReferenceTo("FixedX1000");
    }

    /**
     * Is bits boolean.
     *
     * @param type the type
     * @return the boolean
     */
    protected final boolean isBits(final MibType type) {
        if (type instanceof SnmpObjectType) {
            final SnmpObjectType snmpObjectType = (SnmpObjectType) type;
            if (snmpObjectType.getSyntax() instanceof BitSetType) {
                return true;
            }
        }
        return false;
    }

    /**
     * Determine the java type corresponding to a MibType.
     * @param type Java Type
     * @return
     */
    private JType getJavaType(final MibType type) {
        JType result;
        if (type instanceof IntegerType) {

            // Using approach from SnmpManager.java at
            // http://www.koders.com/java/fidF816DD93365720DD25C4DD82784EC1FCB8B4582A.aspx?s=227
            if (type.hasTag(MibTypeTag.APPLICATION_CATEGORY, SIX)) {
                //  Counter64
                result = codeModel.LONG;
            } else {
                result = codeModel.INT;
            }
        } else if (type instanceof StringType) {
            result = codeModel.ref(String.class);
        } else if (type instanceof ObjectIdentifierType) {
            result = codeModel.ref(String.class);
        } else if (type instanceof BitSetType) {
            result = codeModel.ref(String.class);
        } else if (type instanceof ChoiceType) {
            LOG.debug("Choice type resolved to:{}", ((ChoiceType) type).getAllElements()[0]);
            result = getJavaType(((ChoiceType) type).getAllElements()[0].getType());
        } else {
            assert false : "Unexpected MibType:" + type;
            LOG.warn("Unexpected type:{}", type.getClass());
            result = null;
        }
        return result;
    }

    /**
     * Add to string method.
     *
     * @param definedClass the defined class
     */
    protected final void addToStringMethod(final JDefinedClass definedClass) {
        // Generate code of the form:
        //     return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).
        //        append("field1", field1).
        //        ...
        //        append("fieldn", fieldn).
        //        toString();
        final JMethod method = definedClass.method(JMod.PUBLIC, codeModel.ref(String.class), TO_STRING);
        JInvocation newInvocation = JExpr._new(codeModel.ref(ToStringBuilder.class))
                .arg(JExpr._this())
                .arg(codeModel.ref(ToStringStyle.class).staticRef("MULTI_LINE_STYLE"));

        for (final Entry<String, JFieldVar> varEntry : definedClass.fields().entrySet()) {
            final JFieldVar field = varEntry.getValue();
            // Ignore parent entity.
            if (!fieldIsStatic(field) && !(field.name().equals(PARENT_ENTITY_IDENTIFIER))) {
                newInvocation = newInvocation.invoke(APPEND).arg(JExpr.lit(varEntry.getKey())).arg(field);
            }
        }
        method.body()._return(newInvocation.invoke(TO_STRING));
    }

    /**
     * Add hash code method.
     *
     * @param definedClass the defined class
     */
    protected final void addHashCodeMethod(final JDefinedClass definedClass) {
        // Generate code of the form:
        //     return new HashCodeBuilder().
        //        append(field1).
        //        ...
        //        append(fieldn).
        //        toHashCode();
        final JMethod method = definedClass.method(JMod.PUBLIC, codeModel.INT, "hashCode");
        JInvocation newInvocation = JExpr._new(codeModel.ref(HashCodeBuilder.class));

        for (final Entry<String, JFieldVar> varEntry : definedClass.fields().entrySet()) {
            final JFieldVar field = varEntry.getValue();
            // Ignore parent entity.
            if (!fieldIsStatic(field) && !(field.name().equals(PARENT_ENTITY_IDENTIFIER))) {
                newInvocation = newInvocation.invoke(APPEND).arg(field);
            }
        }
        method.body()._return(newInvocation.invoke("toHashCode"));
    }

    /**
     * Add equals method.
     *
     * @param definedClass the defined class
     */
    protected final void addEqualsMethod(final JDefinedClass definedClass) {
        // Generate code of the form:
        //        public boolean equals(Object obj) {
        //            if (obj == null) { return false; }
        //            if (obj == this) { return true; }
        //            if (obj.getClass() != getClass()) {
        //              return false;
        //            }
        //            ThisClass rhs = (ThisClass) obj;
        //            return new EqualsBuilder()
        //                          .append(field1, rhs.field1)
        //                          ...
        //                          .append(fieldn, rhs.fieldn)
        //                          .isEquals();
        //           }
        final JMethod method = definedClass.method(JMod.PUBLIC, codeModel.BOOLEAN, "equals");
        final JVar objVar = method.param(codeModel.ref(Object.class), "obj");
        final JBlock body = method.body();

        body._if(objVar.eq(JExpr._null()))._then()._return(JExpr.FALSE);
        body._if(objVar.eq(JExpr._this()))._then()._return(JExpr.TRUE);
        body._if(objVar.invoke("getClass").ne(JExpr._this().invoke("getClass")))._then()._return(JExpr.FALSE);

        final JVar rhsVar = body.decl(definedClass, "rhs");
        rhsVar.init(JExpr.cast(definedClass, objVar));

        JInvocation newInvocation = JExpr._new(codeModel.ref(EqualsBuilder.class));

        for (final Entry<String, JFieldVar> varEntry : definedClass.fields().entrySet()) {
            final JFieldVar field = varEntry.getValue();
            // Ignore parent entity.
            if (!fieldIsStatic(field) && !(field.name().equals(PARENT_ENTITY_IDENTIFIER))) {
                newInvocation = newInvocation.invoke(APPEND).arg(field).arg(rhsVar.ref(field));
            }
        }
        method.body()._return(newInvocation.invoke("isEquals"));
    }

    private boolean fieldIsStatic(final JFieldVar field) {
        return (field.mods().getValue() & JMod.STATIC) != 0;
    }

    /**
     * Add clone method.
     *
     * @param definedClass the defined class
     */
    protected final void addCloneMethod(final JDefinedClass definedClass) {

        final boolean isRootClass = definedClass.name().equals(GeneratedIdentifiers.ROOT_CLASS_NAME);

        // Generate code of the form:
        //   public XXX clone() {
        //      XXX copy = new XXX();
        //      copy.field1 = field1;
        //      copy.field2 = field2;
        //      // For a table:
        //      for (Entry<String, XXXEntry> entry : map.entrySet()) {
        //          copy.map.put(entry.getKey(), entry.getValue().clone());
        //      }
        //      return copy;
        //  }

        final JMethod method = definedClass.method(JMod.PUBLIC, definedClass, CLONE);

        final JVar clonedObject = method.body().decl(definedClass, "_copy").init(JExpr._new(definedClass));

        for (final Entry<String, JFieldVar> field : definedClass.fields().entrySet()) {

            if (!fieldIsStatic(field.getValue())) {

                if (isTableEntryField(field.getValue())) {
                    final JForEach forEach = method.body().forEach(getEntryType((JClass) field.getValue().type()),
                            "_entry",
                            field.getValue().invoke("entrySet"));
                    final JVar entryVar = forEach.var();
                    forEach.body().invoke(clonedObject, "setEntry")
                            .arg(entryVar.invoke("getKey"))
                            .arg(entryVar.invoke("getValue").invoke(CLONE));
                } else {
                    if (!isRootClass) {
                        method.body().assign(clonedObject.ref(field.getValue()), field.getValue());
                    } else {
                        // For the root object, assign the entity if it's not null.
                        // TODO SJ Change code generation to use setObject on the AbstractRootEntity (to ensure parent entity is set).
                        method.body()._if(field.getValue().ne(JExpr._null()))._then()
                                .assign(clonedObject.ref(field.getValue()), field.getValue().invoke(CLONE))
                                .invoke(clonedObject.ref(field.getValue()), "set_ParentEntity").arg(clonedObject);
                    }
                }
            }
        }
        method.body()._return(clonedObject);
    }

    /**
     * Determine if this field defines a set of table entries.
     *
     * @param value the value
     * @return the boolean
     */
    protected final boolean isTableEntryField(final JFieldVar value) {
        return (value.type() instanceof JClass && ((JClass) value.type()).isParameterized());
    }

    /**
     * Returns type for Entry<String, XXX> where XXX is the type of the table entry.
     *
     * @param mapType the map type
     * @return the entry type
     */
    protected final JType getEntryType(final JClass mapType) {
        JClass typeVar = codeModel.ref(Entry.class);
        final List<JClass> types = mapType.getTypeParameters();
        typeVar = typeVar.narrow(types.get(0), types.get(1));
        return typeVar;
    }

    /**
     * Generate get and set methods for named field of specified type.
     *
     * @param definedClass the defined class
     * @param child        the child
     * @param type         the type
     * @param field        the field
     */
    protected final void generateAccessors(final JDefinedClass definedClass, final MibValueSymbol child, final JType type, final String field) {
        generateGetAccessor(child, definedClass, type, field);
        if (!child.isTableRow()) {
            generateSetAccessor(definedClass, type, field, getMibIndex(child), !(isSimpleType(child) || child.isTableRow()));
        }
    }

    /**
     * Generate set accessor.
     *
     * @param definedClass             the defined class
     * @param type                     the type
     * @param field                    the field
     * @param fieldId                  the field id
     * @param shouldInvokeReplaceChild the should invoke replace child
     */
    protected final void generateSetAccessor(final JDefinedClass definedClass,
                                       final JType type,
                                       final String field,
                                       final int fieldId,
                                       final boolean shouldInvokeReplaceChild) {
        final JMethod setMethod = definedClass.method(JMod.PUBLIC, codeModel.VOID, getSetterName(field));
        setMethod.param(type, field);

        final JBlock body = setMethod.body();
        final JVar oldValueVar = body.decl(type, "oldValue").init(JExpr.invoke(getGetterName(field)));
        body.assign(JExpr.refthis(field), JExpr.ref(field));
        if (shouldInvokeReplaceChild) {
            body.invoke("replaceChild").arg(oldValueVar).arg(JExpr.ref(field));
        }

        if (fieldId != -1) {
            body.invoke("notifyChange").arg(JExpr.lit(fieldId)).arg(oldValueVar).arg(JExpr.ref(field));
        }
    }

    /**
     * Generate get accessor.
     *
     * @param child        the child
     * @param definedClass the defined class
     * @param type         the type
     * @param field        the field
     */
    protected final void generateGetAccessor(final MibValueSymbol child, final JDefinedClass definedClass, final JType type, final String field) {
        final JMethod getMethod = definedClass.method(JMod.PUBLIC, type, getGetterName(field));

        if (child != null) {
            final MibValue defaultValue = getFieldDefaultValue(child);
            if (defaultValue != null) {
                JExpression defaultReturnExpression = null;
                if (type == codeModel.INT || type == codeModel.LONG) {
                    final Number javaNumber = (Number) defaultValue.toObject();

                    if (type == codeModel.INT) {
                        defaultReturnExpression = JExpr.lit(javaNumber.intValue());
                    } else if (type == codeModel.LONG) {
                        defaultReturnExpression = JExpr.lit(javaNumber.longValue());
                    }
                } else if (type == codeModel.ref(String.class) && defaultValue instanceof StringValue) {
                    defaultReturnExpression = JExpr.lit(defaultValue.toString());
                }
                if (defaultReturnExpression != null) {
                    getMethod.body()._if(JExpr.refthis(field).eq(JExpr._null()))._then()._return(defaultReturnExpression);
                    generateIsDefinedAccessor(definedClass, field);
                }
            } else {
                generateDummyIsDefinedIfNecessary(definedClass, field);
            }
        }
        getMethod.body()._return(JExpr.refthis(field));
    }

    private void generateDummyIsDefinedIfNecessary(final JDefinedClass definedClass, final String field) {
        final String methodName = getIsDefinedName(field);
        final Iterator<JClass> iterator = definedClass._implements();
        while (iterator.hasNext()) {
            final JClass clazz = iterator.next();
            if (clazz instanceof JDefinedClass) {
                for (final JMethod method : ((JDefinedClass) clazz).methods()) {
                    if (method.name().equals(methodName)) {
                        final JMethod dummyMethod = definedClass.method(JMod.PUBLIC, codeModel.BOOLEAN, methodName);
                        dummyMethod.body()._return(JExpr.TRUE);
                        return;
                    }
                }
            }
        }
    }

    private void generateIsDefinedAccessor(final JDefinedClass definedClass, final String field) {
        final JMethod method = definedClass.method(JMod.PUBLIC, codeModel.BOOLEAN, getIsDefinedName(field));
        method.body()._return(JExpr.refthis(field).ne(JExpr._null()));
    }

    /**
     * Establish Java field type that corresponds to a MibValueSymbol, creating a class, if necessary.
     * Null is returned if the field is an object that has no variables in its tree.
     *
     * @param child the child
     * @return the java type of field
     */
    protected final JType getJavaTypeOfField(final MibValueSymbol child) {

        // If it's scalar or a table column, expect a simple java type.
        if (isSimpleType(child)) {
            return mapObjectTypeToJavaType(child.getType());
        }

        return null;
    }

    /**
     * Gets mib index.
     *
     * @param symbol the symbol
     * @return the mib index
     */
    protected final int getMibIndex(final MibValueSymbol symbol) {
        return ((ObjectIdentifierValue) symbol.getValue()).getValue();
    }

    /**
     * Get name for set accessor method.
     *
     * @param field the field
     * @return the setter name
     */
    protected final String getSetterName(final String field) {
        return "set" + capitalizeFirstCharacter(field);
    }

    /**
     * Get name for get accessor method.
     *
     * @param field the field
     * @return the getter name
     */
    protected final String getGetterName(final String field) {
        return "get" + capitalizeFirstCharacter(field);
    }

    /**
     * Get name for get accessor method.
     *
     * @param field the field
     * @return the is defined name
     */
    protected final String getIsDefinedName(final String field) {
        return "is" + capitalizeFirstCharacter(field) + "Defined";
    }

    /**
     * Determine if variable is a simple type or a compound object.
     *
     * @param symbol the symbol
     * @return the boolean
     */
    protected final boolean isSimpleType(final MibValueSymbol symbol) {
        return (symbol.isScalar() || symbol.isTableColumn());
    }

    /**
     * Generate package name for a child of a parent package.
     *
     * @param packageName the package name
     * @param name        the name
     * @return the string
     */
    protected final String generateChildPackageName(final String packageName, final String name) {
        return packageName + "." + getMappedName(name.toLowerCase());
    }

    /**
     * Get a standard class name from a Mib name.
     *
     * @param name the name
     * @return the class name
     */
    protected final String getClassName(final String name) {
        final String mappedClassName = getMappedName(name);
        return capitalizeFirstCharacter(mappedClassName);
    }

    /**
     * Capitalise first character of the specified name.
     *
     * @param name the name
     * @return the string
     */
    protected final String capitalizeFirstCharacter(final String name) {
        final StringBuilder sb = new StringBuilder(name);
        final char firstChar = sb.charAt(0);
        sb.setCharAt(0, Character.toUpperCase(firstChar));
        return sb.toString();
    }

    /**
     * Map any characters in a Mib name that are not valid in a class/package name.
     *
     * @param name the name
     * @return the mapped name
     */
    protected final String getMappedName(final String name) {
        return handleJavaReservedWords(name).replace('-', '_');
    }

    /**
     * Handle java reserved words string.
     *
     * @param name the name
     * @return the string
     */
    protected static String handleJavaReservedWords(final String name) {
        return RESERVED_WORD_SET.contains(name) ? name + UNDERSCORE : name;
    }

    /**
     * Generate standard methods - toString, hashcode etc.
     *
     * @param definedClass the defined class
     */
    protected final void addStandardMethods(final JDefinedClass definedClass) {

        addToStringMethod(definedClass);
        addHashCodeMethod(definedClass);
        addEqualsMethod(definedClass);
        addCloneMethod(definedClass);
    }

    /**
     * Generate class metadata.
     *
     * @param rootSymbol   the root symbol
     * @param definedClass the defined class
     * @param children     the children
     */
    protected final void generateClassMetadata(final MibValueSymbol rootSymbol, final JDefinedClass definedClass, final List<MibValueSymbol> children) {
        createDeviceEntityDescription(rootSymbol, definedClass, children);
        generateGetDescriptionMethod(definedClass);
    }

    /**
     * Generate method to get the device entity description
     *
     * @param definedClass the defined class
     */
    protected final void generateGetDescriptionMethod(final JDefinedClass definedClass) {
        final JClass typeVar = codeModel.ref(DeviceEntityDescription.class);
        final JMethod getMethod = definedClass.method(JMod.PUBLIC, typeVar, "get_Description");

        // Generate code of the form:
        //     return _entityDescription;
        final JVar mapVar = definedClass.fields().get("_entityDescription");
        getMethod.body()._return(mapVar);
    }

    /**
     * Gets mapped field type.
     *
     * @param child the child
     * @return the mapped field type
     */
    protected final FieldType getMappedFieldType(final MibValueSymbol child) {
        if (isSimpleType(child)) {
            final JType javaType = mapObjectTypeToJavaType(child.getType());
            if (javaType == codeModel.INT) {
                return determineIntegerFieldType(child);
            } else if (javaType == codeModel.LONG) {
                return FieldType.UNSIGNED64;
            } else {
                if (isIpAddress(child.getType())) {
                    return FieldType.IP_ADDRESS;
                } else if (isDateAndTime(child.getType())) {
                    return FieldType.DATE_AND_TIME;
                } else if (isBits(child.getType())) {
                    return FieldType.BITS;
                }

                if (((SnmpObjectType) child.getType()).getSyntax() instanceof ObjectIdentifierType) {
                    return FieldType.OID;
                }

                return FieldType.STRING;
            }
        }

        if (child.isTableRow()) {
            return FieldType.TABLE;
        }

        return FieldType.ENTITY;
    }

    private FieldType determineIntegerFieldType(final MibValueSymbol child) {
        if (isUnsigned32(child.getType())) {
            return FieldType.UNSIGNED32;
        } else if (isFixedX10(child.getType())) {
            return FieldType.FIXED_X10;
        } else if (isFixedX100(child.getType())) {
            return FieldType.FIXED_X100;
        } else if (isFixedX1000(child.getType())) {
            return FieldType.FIXED_X1000;
        }

        return FieldType.INTEGER;
    }

    /**
     * Create device entity description.
     *
     * @param rootSymbol   the root symbol
     * @param definedClass the defined class
     * @param children     the children
     */
    protected final void createDeviceEntityDescription(final MibValueSymbol rootSymbol, final JDefinedClass definedClass, final List<MibValueSymbol> children) {
        LOG.debug("Creating meta data for {} fields.", children.size());
        // Create description, initialised by call to static function.
        final JClass typeVar = codeModel.ref(DeviceEntityDescription.class);
        final JFieldVar descriptionVar = definedClass.field(JMod.PRIVATE | JMod.STATIC | JMod.FINAL, typeVar, "_entityDescription");

        final JMethod initMethod = definedClass.method(JMod.STATIC | JMod.PRIVATE, typeVar, "createEntityDescription");
        descriptionVar.init(JExpr.invoke(initMethod));

        // Instantiate the description.
        final JVar localVar = initMethod.body().decl(typeVar, "description");
        final JInvocation newInvocation = JExpr._new(codeModel.ref(OID.class));
        newInvocation.arg(rootSymbol.getValue().toString());
        localVar.init(JExpr._new(typeVar).arg(newInvocation));

        // Populate the description with field details.
        for (final MibValueSymbol child : children) {
            // For each child, generate a statement of the form:
            //     description.addField(new FieldDescription(....)
            final JInvocation addInvocation = initMethod.body().invoke(localVar, "addField");

            final int fieldId = getMibIndex(child);
            final String fieldName = getMappedName(child.getName());
            final FieldType fieldType = getMappedFieldType(child);
            final int maximumLength = (fieldType == FieldType.STRING) ? getMaximumLengthForStringField(child.getType()) : -1;
            addInvocation.arg(JExpr._new(codeModel.ref(FieldDescription.class)).arg(JExpr.lit(fieldId)).arg(JExpr.lit(fieldName))
                    .arg(codeModel.ref(FieldType.class).staticRef(fieldType.name())).arg(JExpr.lit(maximumLength)));
        }
        // Return the description.
        initMethod.body()._return(localVar);
    }


    /**
     * Return maximum length of string type field, or DEFAULT_STRING_COLUMN_LENGTH if there is no explicit maximum.
     * In fact, at present it only inspects OCTET STRINGs for size constraints.
     *
     * @param type the type
     * @return the maximum length for string field
     */
    protected final int getMaximumLengthForStringField(final MibType type) {

        LOG.debug("getMaximumLengthForStringField type={}/{}", type.getClass(), type);

        StringType objectType = null;
        LOG.debug("Syntax:{}/{}", ((SnmpObjectType) type).getSyntax().getClass(), ((SnmpObjectType) type).getSyntax());
        if (((SnmpObjectType) type).getSyntax() instanceof ChoiceType) {
            objectType = (StringType) ((ChoiceType) ((SnmpObjectType) type).getSyntax()).getAllElements()[0].getType();
            LOG.debug("resolved : {}", objectType.getClass());
        } else if (((SnmpObjectType) type).getSyntax() instanceof StringType) {
            objectType = (StringType) ((SnmpObjectType) type).getSyntax();
        }

        if (objectType != null && objectType.hasTag(MibTypeTag.OCTET_STRING)) {
            return getMaximumLengthForOctetStringField(type, objectType);
        }
        return DEFAULT_STRING_COLUMN_WIDTH;
    }

    private int getMaximumLengthForOctetStringField(final MibType type, final StringType objectType) {

        int maximumFieldWidth = 0;

        final Constraint constraint = objectType.getConstraint();
        LOG.debug("constraint : {}", constraint);
        if (constraint instanceof SizeConstraint) {
            maximumFieldWidth = getMaxFieldWidthFromSizeConstraint(type, (SizeConstraint) constraint);
        }
        return (maximumFieldWidth > 0) ? maximumFieldWidth : DEFAULT_OCTET_STRING_COLUMN_WIDTH;
    }

    private int getMaxFieldWidthFromSizeConstraint(final MibType type, final SizeConstraint sizeConstraint) {
        final int maximumFieldWidth;
        int maximumOctets = 0;
        LOG.debug("sizeConstraint : {} values={}", sizeConstraint, sizeConstraint.getValues());

        for (final Object constraintType : sizeConstraint.getValues()) {
            LOG.debug("constraintType:{}/{}", constraintType.getClass(), constraintType);

            if (constraintType instanceof ValueConstraint) {

                final MibValue value = ((ValueConstraint) constraintType).getValue();
                if (value instanceof NumberValue) {
                    final int thisSize = ((Number) (value.toObject())).intValue();
                    maximumOctets = Math.max(maximumOctets, thisSize);
                }
            } else if (constraintType instanceof ValueRangeConstraint) {
                final MibValue value = ((ValueRangeConstraint) constraintType).getUpperBound();
                if (value instanceof NumberValue) {
                    final int thisSize = ((Number) (value.toObject())).intValue();
                    maximumOctets = Math.max(maximumOctets, thisSize);
                }
            }
        }

        final DisplayHintParser displayHint = parseDisplayHint(type);
        LOG.debug("displayHint = {} maxSize = {}", displayHint, maximumOctets);
        if (displayHint != null) {

            // If the maximum size of the field in octets exceeds the number of octets consumed by
            // the display hint (excluding the case where it's repeated an unknown number of times),
            // then assume that the output width will be repeated as many times as the number of octets allows.
            // For example, given:
            //     SIZE(255)
            // and
            //     DISPLAY-HINT "1x:"
            // then:
            // - outputWidth will be 3 (2 hex digits & 1 colon)
            // - octetsConsumed will be 1
            // so, the maximum output width is determined to be 3 * (255 / 1), i.e. 765.

            if (!displayHint.isRepeated && maximumOctets > displayHint.octetsConsumed) {
                maximumFieldWidth = displayHint.outputWidth * (maximumOctets / displayHint.octetsConsumed);
            } else {
                maximumFieldWidth = displayHint.outputWidth;
            }
        } else {
            // For shorter fields without a DISPLAY HINT, give them some extra space for formatting.
            maximumFieldWidth = (maximumOctets <= MAXIMUM_OCTET_STRING_LENGTH_DISPLAY_FACTOR_APPLIES)
                    ? maximumOctets * OCTET_STRING_DISPLAY_FACTOR
                    : maximumOctets;
        }
        return maximumFieldWidth;
    }

    private DisplayHintParser parseDisplayHint(final MibType type) {
        final SnmpTextualConvention textualConvention = SnmpTextualConvention.findReference(type);
        if (textualConvention != null) {
            final String displayHint = textualConvention.getDisplayHint();
            if (displayHint != null) {
                return DisplayHintParser.parseOctetStringDisplayHint(displayHint);
            }
        }
        return null;
    }

    /**
     * Field has default value boolean.
     *
     * @param child the child
     * @return the boolean
     */
    protected final boolean fieldHasDefaultValue(final MibValueSymbol child) {
        return getFieldDefaultValue(child) != null;
    }

    /**
     * Gets field default value.
     *
     * @param child the child
     * @return the field default value
     */
    protected final MibValue getFieldDefaultValue(final MibValueSymbol child) {
        return ((SnmpObjectType) child.getType()).getDefaultValue();
    }
}
