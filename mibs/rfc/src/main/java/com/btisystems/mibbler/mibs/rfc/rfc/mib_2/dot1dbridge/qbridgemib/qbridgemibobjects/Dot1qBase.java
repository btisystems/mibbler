
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.IDot1qBase;
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

public class Dot1qBase
    extends DeviceEntity
    implements Serializable, IDot1qBase, IVariableBindingSetter
{

    private int dot1qVlanVersionNumber;
    private int dot1qMaxVlanId;
    private int dot1qMaxSupportedVlans;
    private int dot1qNumVlans;
    private Integer dot1qGvrpStatus;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qBase() {
    }

    public int getDot1qVlanVersionNumber() {
        return this.dot1qVlanVersionNumber;
    }

    public void setDot1qVlanVersionNumber(int dot1qVlanVersionNumber) {
        int oldValue = getDot1qVlanVersionNumber();
        this.dot1qVlanVersionNumber = dot1qVlanVersionNumber;
        notifyChange(1, oldValue, dot1qVlanVersionNumber);
    }

    public int getDot1qMaxVlanId() {
        return this.dot1qMaxVlanId;
    }

    public void setDot1qMaxVlanId(int dot1qMaxVlanId) {
        int oldValue = getDot1qMaxVlanId();
        this.dot1qMaxVlanId = dot1qMaxVlanId;
        notifyChange(2, oldValue, dot1qMaxVlanId);
    }

    public int getDot1qMaxSupportedVlans() {
        return this.dot1qMaxSupportedVlans;
    }

    public void setDot1qMaxSupportedVlans(int dot1qMaxSupportedVlans) {
        int oldValue = getDot1qMaxSupportedVlans();
        this.dot1qMaxSupportedVlans = dot1qMaxSupportedVlans;
        notifyChange(3, oldValue, dot1qMaxSupportedVlans);
    }

    public int getDot1qNumVlans() {
        return this.dot1qNumVlans;
    }

    public void setDot1qNumVlans(int dot1qNumVlans) {
        int oldValue = getDot1qNumVlans();
        this.dot1qNumVlans = dot1qNumVlans;
        notifyChange(4, oldValue, dot1qNumVlans);
    }

    public int getDot1qGvrpStatus() {
        if (this.dot1qGvrpStatus == null) {
            return  1;
        }
        return this.dot1qGvrpStatus;
    }

    public boolean isDot1qGvrpStatusDefined() {
        return (this.dot1qGvrpStatus!= null);
    }

    public void setDot1qGvrpStatus(int dot1qGvrpStatus) {
        int oldValue = getDot1qGvrpStatus();
        this.dot1qGvrpStatus = dot1qGvrpStatus;
        notifyChange(5, oldValue, dot1qGvrpStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot1qVlanVersionNumber(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1qMaxVlanId(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1qMaxSupportedVlans(binding.getVariable().toInt());
                break;
            case  4 :
                setDot1qNumVlans(binding.getVariable().toInt());
                break;
            case  5 :
                setDot1qGvrpStatus(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qVlanVersionNumber", dot1qVlanVersionNumber).append("dot1qMaxVlanId", dot1qMaxVlanId).append("dot1qMaxSupportedVlans", dot1qMaxSupportedVlans).append("dot1qNumVlans", dot1qNumVlans).append("dot1qGvrpStatus", dot1qGvrpStatus).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qVlanVersionNumber).append(dot1qMaxVlanId).append(dot1qMaxSupportedVlans).append(dot1qNumVlans).append(dot1qGvrpStatus).toHashCode();
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
        Dot1qBase rhs = ((Dot1qBase) obj);
        return new EqualsBuilder().append(dot1qVlanVersionNumber, rhs.dot1qVlanVersionNumber).append(dot1qMaxVlanId, rhs.dot1qMaxVlanId).append(dot1qMaxSupportedVlans, rhs.dot1qMaxSupportedVlans).append(dot1qNumVlans, rhs.dot1qNumVlans).append(dot1qGvrpStatus, rhs.dot1qGvrpStatus).isEquals();
    }

    public Dot1qBase clone() {
        Dot1qBase _copy = new Dot1qBase();
        _copy.dot1qVlanVersionNumber = dot1qVlanVersionNumber;
        _copy.dot1qMaxVlanId = dot1qMaxVlanId;
        _copy.dot1qMaxSupportedVlans = dot1qMaxSupportedVlans;
        _copy.dot1qNumVlans = dot1qNumVlans;
        _copy.dot1qGvrpStatus = dot1qGvrpStatus;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qVlanVersionNumber", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qMaxVlanId", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qMaxSupportedVlans", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1qNumVlans", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot1qGvrpStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
