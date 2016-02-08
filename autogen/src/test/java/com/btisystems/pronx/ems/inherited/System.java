package com.btisystems.pronx.ems.inherited;

import java.io.Serializable;
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

public class System extends DeviceEntity implements Serializable, IVariableBindingSetter {

    private String sysDescr;
    private String sysObjectID;
    private int sysUpTime;
    private String sysContact;
    private String sysName;
    private String sysLocation;
    private int sysServices;
    private int sysORLastChange;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public System() {
    }

    public String getSysDescr() {
        return this.sysDescr;
    }

    public void setSysDescr(String sysDescr) {
        String oldValue = getSysDescr();
        this.sysDescr = sysDescr;
        notifyChange(1, oldValue, sysDescr);
    }

    public String getSysObjectID() {
        return this.sysObjectID;
    }

    public void setSysObjectID(String sysObjectID) {
        String oldValue = getSysObjectID();
        this.sysObjectID = sysObjectID;
        notifyChange(2, oldValue, sysObjectID);
    }

    public int getSysUpTime() {
        return this.sysUpTime;
    }

    public void setSysUpTime(int sysUpTime) {
        int oldValue = getSysUpTime();
        this.sysUpTime = sysUpTime;
        notifyChange(3, oldValue, sysUpTime);
    }

    public String getSysContact() {
        return this.sysContact;
    }

    public void setSysContact(String sysContact) {
        String oldValue = getSysContact();
        this.sysContact = sysContact;
        notifyChange(4, oldValue, sysContact);
    }

    public String getSysName() {
        return this.sysName;
    }

    public void setSysName(String sysName) {
        String oldValue = getSysName();
        this.sysName = sysName;
        notifyChange(5, oldValue, sysName);
    }

    public String getSysLocation() {
        return this.sysLocation;
    }

    public void setSysLocation(String sysLocation) {
        String oldValue = getSysLocation();
        this.sysLocation = sysLocation;
        notifyChange(6, oldValue, sysLocation);
    }

    public int getSysServices() {
        return this.sysServices;
    }

    public void setSysServices(int sysServices) {
        int oldValue = getSysServices();
        this.sysServices = sysServices;
        notifyChange(7, oldValue, sysServices);
    }

    public int getSysORLastChange() {
        return this.sysORLastChange;
    }

    public void setSysORLastChange(int sysORLastChange) {
        int oldValue = getSysORLastChange();
        this.sysORLastChange = sysORLastChange;
        notifyChange(8, oldValue, sysORLastChange);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(7)) {
        case 1:
            setSysDescr(binding.getVariable().toString());
            break;
        case 2:
            setSysObjectID(binding.getVariable().toString());
            break;
        case 3:
            setSysUpTime(binding.getVariable().toInt());
            break;
        case 4:
            setSysContact(binding.getVariable().toString());
            break;
        case 5:
            setSysName(binding.getVariable().toString());
            break;
        case 6:
            setSysLocation(binding.getVariable().toString());
            break;
        case 7:
            setSysServices(binding.getVariable().toInt());
            break;
        case 8:
            setSysORLastChange(binding.getVariable().toInt());
            break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sysDescr", sysDescr)
                .append("sysObjectID", sysObjectID).append("sysUpTime", sysUpTime).append("sysContact", sysContact)
                .append("sysName", sysName).append("sysLocation", sysLocation).append("sysServices", sysServices)
                .append("sysORLastChange", sysORLastChange).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sysDescr).append(sysObjectID).append(sysUpTime).append(sysContact)
                .append(sysName).append(sysLocation).append(sysServices).append(sysORLastChange).toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        System rhs = ((System) obj);
        return new EqualsBuilder().append(sysDescr, rhs.sysDescr).append(sysObjectID, rhs.sysObjectID)
                .append(sysUpTime, rhs.sysUpTime).append(sysContact, rhs.sysContact).append(sysName, rhs.sysName)
                .append(sysLocation, rhs.sysLocation).append(sysServices, rhs.sysServices)
                .append(sysORLastChange, rhs.sysORLastChange).isEquals();
    }

    public System clone() {
        System _copy = new System();
        _copy.sysDescr = sysDescr;
        _copy.sysObjectID = sysObjectID;
        _copy.sysUpTime = sysUpTime;
        _copy.sysContact = sysContact;
        _copy.sysName = sysName;
        _copy.sysLocation = sysLocation;
        _copy.sysServices = sysServices;
        _copy.sysORLastChange = sysORLastChange;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sysDescr",
                DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "sysObjectID",
                DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "sysUpTime",
                DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "sysContact",
                DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "sysName",
                DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "sysLocation",
                DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "sysServices",
                DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "sysORLastChange",
                DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}