
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.IDot1qVlan;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class Dot1qVlan
    extends DeviceEntity
    implements Serializable, IDot1qVlan, IVariableBindingSetter
{

    private int dot1qVlanNumDeletes;
    private int dot1qNextFreeLocalVlanIndex;
    private int dot1qConstraintSetDefault;
    private int dot1qConstraintTypeDefault;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qVlan() {
    }

    public int getDot1qVlanNumDeletes() {
        return this.dot1qVlanNumDeletes;
    }

    public void setDot1qVlanNumDeletes(int dot1qVlanNumDeletes) {
        int oldValue = getDot1qVlanNumDeletes();
        this.dot1qVlanNumDeletes = dot1qVlanNumDeletes;
        notifyChange(1, oldValue, dot1qVlanNumDeletes);
    }

    public int getDot1qNextFreeLocalVlanIndex() {
        return this.dot1qNextFreeLocalVlanIndex;
    }

    public void setDot1qNextFreeLocalVlanIndex(int dot1qNextFreeLocalVlanIndex) {
        int oldValue = getDot1qNextFreeLocalVlanIndex();
        this.dot1qNextFreeLocalVlanIndex = dot1qNextFreeLocalVlanIndex;
        notifyChange(4, oldValue, dot1qNextFreeLocalVlanIndex);
    }

    public int getDot1qConstraintSetDefault() {
        return this.dot1qConstraintSetDefault;
    }

    public void setDot1qConstraintSetDefault(int dot1qConstraintSetDefault) {
        int oldValue = getDot1qConstraintSetDefault();
        this.dot1qConstraintSetDefault = dot1qConstraintSetDefault;
        notifyChange(9, oldValue, dot1qConstraintSetDefault);
    }

    public int getDot1qConstraintTypeDefault() {
        return this.dot1qConstraintTypeDefault;
    }

    public void setDot1qConstraintTypeDefault(int dot1qConstraintTypeDefault) {
        int oldValue = getDot1qConstraintTypeDefault();
        this.dot1qConstraintTypeDefault = dot1qConstraintTypeDefault;
        notifyChange(10, oldValue, dot1qConstraintTypeDefault);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot1qVlanNumDeletes(binding.getVariable().toInt());
                break;
            case  4 :
                setDot1qNextFreeLocalVlanIndex(binding.getVariable().toInt());
                break;
            case  9 :
                setDot1qConstraintSetDefault(binding.getVariable().toInt());
                break;
            case  10 :
                setDot1qConstraintTypeDefault(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qVlanNumDeletes", dot1qVlanNumDeletes).append("dot1qNextFreeLocalVlanIndex", dot1qNextFreeLocalVlanIndex).append("dot1qConstraintSetDefault", dot1qConstraintSetDefault).append("dot1qConstraintTypeDefault", dot1qConstraintTypeDefault).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qVlanNumDeletes).append(dot1qNextFreeLocalVlanIndex).append(dot1qConstraintSetDefault).append(dot1qConstraintTypeDefault).toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass()!= this.getClass()) {
            return false;
        }
        Dot1qVlan rhs = ((Dot1qVlan) obj);
        return new EqualsBuilder().append(dot1qVlanNumDeletes, rhs.dot1qVlanNumDeletes).append(dot1qNextFreeLocalVlanIndex, rhs.dot1qNextFreeLocalVlanIndex).append(dot1qConstraintSetDefault, rhs.dot1qConstraintSetDefault).append(dot1qConstraintTypeDefault, rhs.dot1qConstraintTypeDefault).isEquals();
    }

    public Dot1qVlan clone() {
        Dot1qVlan _copy = new Dot1qVlan();
        _copy.dot1qVlanNumDeletes = dot1qVlanNumDeletes;
        _copy.dot1qNextFreeLocalVlanIndex = dot1qNextFreeLocalVlanIndex;
        _copy.dot1qConstraintSetDefault = dot1qConstraintSetDefault;
        _copy.dot1qConstraintTypeDefault = dot1qConstraintTypeDefault;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qVlanNumDeletes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1qNextFreeLocalVlanIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "dot1qConstraintSetDefault", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "dot1qConstraintTypeDefault", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
