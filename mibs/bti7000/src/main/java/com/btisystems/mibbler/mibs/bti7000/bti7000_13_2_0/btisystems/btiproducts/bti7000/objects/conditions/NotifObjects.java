
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.conditions;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions.INotifObjects;
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

public class NotifObjects
    extends DeviceEntity
    implements Serializable, INotifObjects, IVariableBindingSetter
{

    private String condDateAndTime;
    private int condReportType;
    private int condSeverity;
    private int condServiceAffecting;
    private String condDescription;
    private int condObjectType;
    private int condCodeType;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NotifObjects() {
    }

    public String getCondDateAndTime() {
        return this.condDateAndTime;
    }

    public void setCondDateAndTime(String condDateAndTime) {
        String oldValue = getCondDateAndTime();
        this.condDateAndTime = condDateAndTime;
        notifyChange(1, oldValue, condDateAndTime);
    }

    public int getCondReportType() {
        return this.condReportType;
    }

    public void setCondReportType(int condReportType) {
        int oldValue = getCondReportType();
        this.condReportType = condReportType;
        notifyChange(2, oldValue, condReportType);
    }

    public int getCondSeverity() {
        return this.condSeverity;
    }

    public void setCondSeverity(int condSeverity) {
        int oldValue = getCondSeverity();
        this.condSeverity = condSeverity;
        notifyChange(3, oldValue, condSeverity);
    }

    public int getCondServiceAffecting() {
        return this.condServiceAffecting;
    }

    public void setCondServiceAffecting(int condServiceAffecting) {
        int oldValue = getCondServiceAffecting();
        this.condServiceAffecting = condServiceAffecting;
        notifyChange(4, oldValue, condServiceAffecting);
    }

    public String getCondDescription() {
        return this.condDescription;
    }

    public void setCondDescription(String condDescription) {
        String oldValue = getCondDescription();
        this.condDescription = condDescription;
        notifyChange(5, oldValue, condDescription);
    }

    public int getCondObjectType() {
        return this.condObjectType;
    }

    public void setCondObjectType(int condObjectType) {
        int oldValue = getCondObjectType();
        this.condObjectType = condObjectType;
        notifyChange(6, oldValue, condObjectType);
    }

    public int getCondCodeType() {
        return this.condCodeType;
    }

    public void setCondCodeType(int condCodeType) {
        int oldValue = getCondCodeType();
        this.condCodeType = condCodeType;
        notifyChange(7, oldValue, condCodeType);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setCondDateAndTime(binding.getVariable().toString());
                break;
            case  2 :
                setCondReportType(binding.getVariable().toInt());
                break;
            case  3 :
                setCondSeverity(binding.getVariable().toInt());
                break;
            case  4 :
                setCondServiceAffecting(binding.getVariable().toInt());
                break;
            case  5 :
                setCondDescription(binding.getVariable().toString());
                break;
            case  6 :
                setCondObjectType(binding.getVariable().toInt());
                break;
            case  7 :
                setCondCodeType(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("condDateAndTime", condDateAndTime).append("condReportType", condReportType).append("condSeverity", condSeverity).append("condServiceAffecting", condServiceAffecting).append("condDescription", condDescription).append("condObjectType", condObjectType).append("condCodeType", condCodeType).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(condDateAndTime).append(condReportType).append(condSeverity).append(condServiceAffecting).append(condDescription).append(condObjectType).append(condCodeType).toHashCode();
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
        NotifObjects rhs = ((NotifObjects) obj);
        return new EqualsBuilder().append(condDateAndTime, rhs.condDateAndTime).append(condReportType, rhs.condReportType).append(condSeverity, rhs.condSeverity).append(condServiceAffecting, rhs.condServiceAffecting).append(condDescription, rhs.condDescription).append(condObjectType, rhs.condObjectType).append(condCodeType, rhs.condCodeType).isEquals();
    }

    public NotifObjects clone() {
        NotifObjects _copy = new NotifObjects();
        _copy.condDateAndTime = condDateAndTime;
        _copy.condReportType = condReportType;
        _copy.condSeverity = condSeverity;
        _copy.condServiceAffecting = condServiceAffecting;
        _copy.condDescription = condDescription;
        _copy.condObjectType = condObjectType;
        _copy.condCodeType = condCodeType;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.7.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "condDateAndTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "condReportType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "condSeverity", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "condServiceAffecting", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "condDescription", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "condObjectType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "condCodeType", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
