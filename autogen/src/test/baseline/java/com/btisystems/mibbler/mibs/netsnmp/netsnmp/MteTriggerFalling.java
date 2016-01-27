
package com.btisystems.mibbler.mibs.netsnmp.netsnmp;

import java.io.Serializable;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.INotification;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MteTriggerFalling
    extends DeviceEntity
    implements Serializable, INotification
{

    private String mteHotTrigger;
    private String mteHotTargetName;
    private String mteHotContextName;
    private String mteHotOID;
    private int mteHotValue;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteTriggerFalling() {
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

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteHotTrigger", mteHotTrigger).append("mteHotTargetName", mteHotTargetName).append("mteHotContextName", mteHotContextName).append("mteHotOID", mteHotOID).append("mteHotValue", mteHotValue).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteHotTrigger).append(mteHotTargetName).append(mteHotContextName).append(mteHotOID).append(mteHotValue).toHashCode();
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
        MteTriggerFalling rhs = ((MteTriggerFalling) obj);
        return new EqualsBuilder().append(mteHotTrigger, rhs.mteHotTrigger).append(mteHotTargetName, rhs.mteHotTargetName).append(mteHotContextName, rhs.mteHotContextName).append(mteHotOID, rhs.mteHotOID).append(mteHotValue, rhs.mteHotValue).isEquals();
    }

    public MteTriggerFalling clone() {
        MteTriggerFalling _copy = new MteTriggerFalling();
        _copy.mteHotTrigger = mteHotTrigger;
        _copy.mteHotTargetName = mteHotTargetName;
        _copy.mteHotContextName = mteHotContextName;
        _copy.mteHotOID = mteHotOID;
        _copy.mteHotValue = mteHotValue;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.2.0.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteHotTrigger", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mteHotTargetName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mteHotContextName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mteHotOID", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "mteHotValue", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
