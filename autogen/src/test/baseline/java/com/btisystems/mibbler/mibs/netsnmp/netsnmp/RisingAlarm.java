
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

public class RisingAlarm
    extends DeviceEntity
    implements Serializable, INotification
{

    private int alarmIndex;
    private String alarmVariable;
    private int alarmSampleType;
    private int alarmValue;
    private int alarmRisingThreshold;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RisingAlarm() {
    }

    public int getAlarmIndex() {
        return this.alarmIndex;
    }

    public void setAlarmIndex(int alarmIndex) {
        int oldValue = getAlarmIndex();
        this.alarmIndex = alarmIndex;
        notifyChange(1, oldValue, alarmIndex);
    }

    public String getAlarmVariable() {
        return this.alarmVariable;
    }

    public void setAlarmVariable(String alarmVariable) {
        String oldValue = getAlarmVariable();
        this.alarmVariable = alarmVariable;
        notifyChange(3, oldValue, alarmVariable);
    }

    public int getAlarmSampleType() {
        return this.alarmSampleType;
    }

    public void setAlarmSampleType(int alarmSampleType) {
        int oldValue = getAlarmSampleType();
        this.alarmSampleType = alarmSampleType;
        notifyChange(4, oldValue, alarmSampleType);
    }

    public int getAlarmValue() {
        return this.alarmValue;
    }

    public void setAlarmValue(int alarmValue) {
        int oldValue = getAlarmValue();
        this.alarmValue = alarmValue;
        notifyChange(5, oldValue, alarmValue);
    }

    public int getAlarmRisingThreshold() {
        return this.alarmRisingThreshold;
    }

    public void setAlarmRisingThreshold(int alarmRisingThreshold) {
        int oldValue = getAlarmRisingThreshold();
        this.alarmRisingThreshold = alarmRisingThreshold;
        notifyChange(7, oldValue, alarmRisingThreshold);
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alarmIndex", alarmIndex).append("alarmVariable", alarmVariable).append("alarmSampleType", alarmSampleType).append("alarmValue", alarmValue).append("alarmRisingThreshold", alarmRisingThreshold).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alarmIndex).append(alarmVariable).append(alarmSampleType).append(alarmValue).append(alarmRisingThreshold).toHashCode();
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
        RisingAlarm rhs = ((RisingAlarm) obj);
        return new EqualsBuilder().append(alarmIndex, rhs.alarmIndex).append(alarmVariable, rhs.alarmVariable).append(alarmSampleType, rhs.alarmSampleType).append(alarmValue, rhs.alarmValue).append(alarmRisingThreshold, rhs.alarmRisingThreshold).isEquals();
    }

    public RisingAlarm clone() {
        RisingAlarm _copy = new RisingAlarm();
        _copy.alarmIndex = alarmIndex;
        _copy.alarmVariable = alarmVariable;
        _copy.alarmSampleType = alarmSampleType;
        _copy.alarmValue = alarmValue;
        _copy.alarmRisingThreshold = alarmRisingThreshold;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.0.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alarmIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "alarmVariable", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "alarmSampleType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "alarmValue", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "alarmRisingThreshold", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
