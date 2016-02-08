/**
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *  This program is free software: you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License as published
 *  by the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 *  FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 */
package com.btisystems.pronx.ems;

import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.INotification;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;
import net.percederberg.mibble.Mib;
import net.percederberg.mibble.MibLoader;
import net.percederberg.mibble.MibValueSymbol;
import net.percederberg.mibble.snmp.SnmpNotificationType;
import net.percederberg.mibble.value.ObjectIdentifierValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Mib notification object compiler.
 */
public class MibNotificationObjectCompiler extends AbstractMibCompiler {

    private static final Logger LOG = LoggerFactory.getLogger(MibNotificationObjectCompiler.class);

    private final MibLoader loader;

    /**
     * Instantiates a new Mib notification object compiler.
     *
     * @param loader the loader
     * @param packageName the package name
     */
    public MibNotificationObjectCompiler(final MibLoader loader, final String packageName) {
        super(packageName);
        this.loader = loader;
    }

    /**
     * Compile the Notifications in the mib to java code
     *
     * @param codeModel the Java Code Model which will hold the generated code
     */
    public final void compile(final JCodeModel codeModel) {
        this.codeModel = codeModel;

        final List<MibValueSymbol> notifications = new ArrayList<>();
        for (final Mib mib : loader.getAllMibs()) {
            for (final Object symbol : mib.getAllSymbols()) {
                if (symbol instanceof MibValueSymbol
                        && ((MibValueSymbol) symbol).getType() instanceof SnmpNotificationType) {
                    notifications.add((MibValueSymbol) symbol);
                }
            }
        }

        for (final MibValueSymbol rootSymbol : notifications) {
            buildClass(packageName, rootSymbol);
        }
    }

    /**
     * Create field in a class.
     * 
     * @param child
     * @param fieldName
     * @param type
     * @param definedClass
     */
    private void createField(final MibValueSymbol child, final String fieldName, final JType type,
            final JDefinedClass definedClass) {

        LOG.debug("Add field {} to class {}", fieldName, definedClass);

        // Add the field to the class.
        definedClass.field(JMod.PRIVATE, type, fieldName);

        generateAccessors(definedClass, child, type, fieldName);
    }

    /**
     * Build a class associated with a Mib Symbol, recursively creating any
     * classes on which the class depends.
     * 
     * @param packageName
     * @param rootSymbol
     * @return
     */
    private JDefinedClass buildClass(final String packageName, final MibValueSymbol rootSymbol) {
        LOG.debug(">>> buildClass package:{} class:{}", packageName, rootSymbol.getName());

        // Create the class, constructor and annotate.
        final JDefinedClass definedClass = createClass(packageName, getClassName(rootSymbol.getName()));
        definedClass.constructor(JMod.PUBLIC);
        definedClass._implements(Serializable.class);
        definedClass._implements(INotification.class);
        definedClass._extends(DeviceEntity.class);

        // Create class fields, creating any nested classes as necessary

        final List<ObjectIdentifierValue> fields = getNotificationFields((SnmpNotificationType) rootSymbol.getType());
        final MibValueSymbol[] children = new MibValueSymbol[fields.size()];
        for (int i = 0; i < fields.size(); i++) {
            children[i] = getSymbolByOid(rootSymbol, fields.get(i));
        }
        final List<MibValueSymbol> createdChildren = createChildFields(rootSymbol.getName(), children, definedClass);

        addStandardMethods(definedClass);

        // Create all the metadata the class will need.
        generateClassMetadata(rootSymbol, definedClass, createdChildren);

        return definedClass;
    }

    /**
     * Create the child fields for the object.
     * 
     * @param name
     * @param children
     * @param definedClass
     * @return
     */
    private List<MibValueSymbol> createChildFields(final String name, final MibValueSymbol[] children,
            final JDefinedClass definedClass) {
        final List<MibValueSymbol> childEntities = new ArrayList<>();

        LOG.debug("Creating {} child fields for {}", children.length, name);

        for (final MibValueSymbol child : children) {

            if (child != null) {

                // Establish type of field - this will create a new class if
                // necessary.
                final JType type = getJavaTypeOfField(child);
                if (type == null) {
                    LOG.debug("Not generating empty entity:{}", child.getName());
                } else {
                    final String fieldName = getMappedName(child.getName());
                    createField(child, fieldName, type, definedClass);
                    childEntities.add(child);
                }
            }
        }
        return childEntities;
    }

}
