
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibnotificationprefix;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibnotificationprefix.IDismanEventMIBNotificationObjects;
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

public class DismanEventMIBNotificationObjects
    extends DeviceEntity
    implements Serializable, IDismanEventMIBNotificationObjects, IVariableBindingSetter
{

    private String mteHotTrigger;
    private String mteHotTargetName;
    private String mteHotContextName;
    private String mteHotOID;
    private int mteHotValue;
    private int mteFailedReason;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public DismanEventMIBNotificationObjects() {
    }

    public String getMteHotTrigger() {
        return this.mteHotTrigger;
    }

    public void setMteHotTrigger(String mteHotTrigger) {
        String oldValue = getMteHotTrigger();
        this.mteHotTrigger = mteHotTrigger;
        notifyChange(1, oldValue, mteHotTrigger);
    }

    public String getMteHotTargetName() {
        return this.mteHotTargetName;
    }

    public void setMteHotTargetName(String mteHotTargetName) {
        String oldValue = getMteHotTargetName();
        this.mteHotTargetName = mteHotTargetName;
        notifyChange(2, oldValue, mteHotTargetName);
    }

    public String getMteHotContextName() {
        return this.mteHotContextName;
    }

    public void setMteHotContextName(String mteHotContextName) {
        String oldValue = getMteHotContextName();
        this.mteHotContextName = mteHotContextName;
        notifyChange(3, oldValue, mteHotContextName);
    }

    public String getMteHotOID() {
        return this.mteHotOID;
    }

    public void setMteHotOID(String mteHotOID) {
        String oldValue = getMteHotOID();
        this.mteHotOID = mteHotOID;
        notifyChange(4, oldValue, mteHotOID);
    }

    public int getMteHotValue() {
        return this.mteHotValue;
    }

    public void setMteHotValue(int mteHotValue) {
        int oldValue = getMteHotValue();
        this.mteHotValue = mteHotValue;
        notifyChange(5, oldValue, mteHotValue);
    }

    public int getMteFailedReason() {
        return this.mteFailedReason;
    }

    public void setMteFailedReason(int mteFailedReason) {
        int oldValue = getMteFailedReason();
        this.mteFailedReason = mteFailedReason;
        notifyChange(6, oldValue, mteFailedReason);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setMteHotTrigger(binding.getVariable().toString());
                break;
            case  2 :
                setMteHotTargetName(binding.getVariable().toString());
                break;
            case  3 :
                setMteHotContextName(binding.getVariable().toString());
                break;
            case  4 :
                setMteHotOID(binding.getVariable().toString());
                break;
            case  5 :
                setMteHotValue(binding.getVariable().toInt());
                break;
            case  6 :
                setMteFailedReason(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteHotTrigger", mteHotTrigger).append("mteHotTargetName", mteHotTargetName).append("mteHotContextName", mteHotContextName).append("mteHotOID", mteHotOID).append("mteHotValue", mteHotValue).append("mteFailedReason", mteFailedReason).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteHotTrigger).append(mteHotTargetName).append(mteHotContextName).append(mteHotOID).append(mteHotValue).append(mteFailedReason).toHashCode();
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
        DismanEventMIBNotificationObjects rhs = ((DismanEventMIBNotificationObjects) obj);
        return new EqualsBuilder().append(mteHotTrigger, rhs.mteHotTrigger).append(mteHotTargetName, rhs.mteHotTargetName).append(mteHotContextName, rhs.mteHotContextName).append(mteHotOID, rhs.mteHotOID).append(mteHotValue, rhs.mteHotValue).append(mteFailedReason, rhs.mteFailedReason).isEquals();
    }

    public DismanEventMIBNotificationObjects clone() {
        DismanEventMIBNotificationObjects _copy = new DismanEventMIBNotificationObjects();
        _copy.mteHotTrigger = mteHotTrigger;
        _copy.mteHotTargetName = mteHotTargetName;
        _copy.mteHotContextName = mteHotContextName;
        _copy.mteHotOID = mteHotOID;
        _copy.mteHotValue = mteHotValue;
        _copy.mteFailedReason = mteFailedReason;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteHotTrigger", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mteHotTargetName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mteHotContextName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mteHotOID", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "mteHotValue", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "mteFailedReason", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
