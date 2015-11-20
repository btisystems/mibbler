
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.notifications.eventnotifications;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.notifications.eventnotifications.IEvtNotificationObjects;
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

public class EvtNotificationObjects
    extends DeviceEntity
    implements Serializable, IEvtNotificationObjects, IVariableBindingSetter
{

    private String evtDateAndTime;
    private int tcaIntervalType;
    private String tcaDateAndTime;
    private int tcaMontype;
    private int tcaValue;
    private int tcaThreshold;
    private String evtDescription;
    private int evtObjectType;
    private int evtCodeType;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public EvtNotificationObjects() {
    }

    public String getEvtDateAndTime() {
        return this.evtDateAndTime;
    }

    public void setEvtDateAndTime(String evtDateAndTime) {
        String oldValue = getEvtDateAndTime();
        this.evtDateAndTime = evtDateAndTime;
        notifyChange(1, oldValue, evtDateAndTime);
    }

    public int getTcaIntervalType() {
        return this.tcaIntervalType;
    }

    public void setTcaIntervalType(int tcaIntervalType) {
        int oldValue = getTcaIntervalType();
        this.tcaIntervalType = tcaIntervalType;
        notifyChange(2, oldValue, tcaIntervalType);
    }

    public String getTcaDateAndTime() {
        return this.tcaDateAndTime;
    }

    public void setTcaDateAndTime(String tcaDateAndTime) {
        String oldValue = getTcaDateAndTime();
        this.tcaDateAndTime = tcaDateAndTime;
        notifyChange(3, oldValue, tcaDateAndTime);
    }

    public int getTcaMontype() {
        return this.tcaMontype;
    }

    public void setTcaMontype(int tcaMontype) {
        int oldValue = getTcaMontype();
        this.tcaMontype = tcaMontype;
        notifyChange(4, oldValue, tcaMontype);
    }

    public int getTcaValue() {
        return this.tcaValue;
    }

    public void setTcaValue(int tcaValue) {
        int oldValue = getTcaValue();
        this.tcaValue = tcaValue;
        notifyChange(5, oldValue, tcaValue);
    }

    public int getTcaThreshold() {
        return this.tcaThreshold;
    }

    public void setTcaThreshold(int tcaThreshold) {
        int oldValue = getTcaThreshold();
        this.tcaThreshold = tcaThreshold;
        notifyChange(6, oldValue, tcaThreshold);
    }

    public String getEvtDescription() {
        return this.evtDescription;
    }

    public void setEvtDescription(String evtDescription) {
        String oldValue = getEvtDescription();
        this.evtDescription = evtDescription;
        notifyChange(7, oldValue, evtDescription);
    }

    public int getEvtObjectType() {
        return this.evtObjectType;
    }

    public void setEvtObjectType(int evtObjectType) {
        int oldValue = getEvtObjectType();
        this.evtObjectType = evtObjectType;
        notifyChange(8, oldValue, evtObjectType);
    }

    public int getEvtCodeType() {
        return this.evtCodeType;
    }

    public void setEvtCodeType(int evtCodeType) {
        int oldValue = getEvtCodeType();
        this.evtCodeType = evtCodeType;
        notifyChange(9, oldValue, evtCodeType);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setEvtDateAndTime(binding.getVariable().toString());
                break;
            case  2 :
                setTcaIntervalType(binding.getVariable().toInt());
                break;
            case  3 :
                setTcaDateAndTime(binding.getVariable().toString());
                break;
            case  4 :
                setTcaMontype(binding.getVariable().toInt());
                break;
            case  5 :
                setTcaValue(binding.getVariable().toInt());
                break;
            case  6 :
                setTcaThreshold(binding.getVariable().toInt());
                break;
            case  7 :
                setEvtDescription(binding.getVariable().toString());
                break;
            case  8 :
                setEvtObjectType(binding.getVariable().toInt());
                break;
            case  9 :
                setEvtCodeType(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("evtDateAndTime", evtDateAndTime).append("tcaIntervalType", tcaIntervalType).append("tcaDateAndTime", tcaDateAndTime).append("tcaMontype", tcaMontype).append("tcaValue", tcaValue).append("tcaThreshold", tcaThreshold).append("evtDescription", evtDescription).append("evtObjectType", evtObjectType).append("evtCodeType", evtCodeType).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(evtDateAndTime).append(tcaIntervalType).append(tcaDateAndTime).append(tcaMontype).append(tcaValue).append(tcaThreshold).append(evtDescription).append(evtObjectType).append(evtCodeType).toHashCode();
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
        EvtNotificationObjects rhs = ((EvtNotificationObjects) obj);
        return new EqualsBuilder().append(evtDateAndTime, rhs.evtDateAndTime).append(tcaIntervalType, rhs.tcaIntervalType).append(tcaDateAndTime, rhs.tcaDateAndTime).append(tcaMontype, rhs.tcaMontype).append(tcaValue, rhs.tcaValue).append(tcaThreshold, rhs.tcaThreshold).append(evtDescription, rhs.evtDescription).append(evtObjectType, rhs.evtObjectType).append(evtCodeType, rhs.evtCodeType).isEquals();
    }

    public EvtNotificationObjects clone() {
        EvtNotificationObjects _copy = new EvtNotificationObjects();
        _copy.evtDateAndTime = evtDateAndTime;
        _copy.tcaIntervalType = tcaIntervalType;
        _copy.tcaDateAndTime = tcaDateAndTime;
        _copy.tcaMontype = tcaMontype;
        _copy.tcaValue = tcaValue;
        _copy.tcaThreshold = tcaThreshold;
        _copy.evtDescription = evtDescription;
        _copy.evtObjectType = evtObjectType;
        _copy.evtCodeType = evtCodeType;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.2.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "evtDateAndTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "tcaIntervalType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "tcaDateAndTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "tcaMontype", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "tcaValue", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "tcaThreshold", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "evtDescription", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "evtObjectType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "evtCodeType", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
