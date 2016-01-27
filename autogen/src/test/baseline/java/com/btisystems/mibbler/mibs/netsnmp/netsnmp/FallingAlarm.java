
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

public class FallingAlarm
    extends DeviceEntity
    implements Serializable, INotification
{

    private int alarmIndex;
    private String alarmVariable;
    private int alarmSampleType;
    private int alarmValue;
    private int alarmFallingThreshold;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public FallingAlarm() {
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

    public int getAlarmFallingThreshold() {
        return this.alarmFallingThreshold;
    }

    public void setAlarmFallingThreshold(int alarmFallingThreshold) {
        int oldValue = getAlarmFallingThreshold();
        this.alarmFallingThreshold = alarmFallingThreshold;
        notifyChange(8, oldValue, alarmFallingThreshold);
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alarmIndex", alarmIndex).append("alarmVariable", alarmVariable).append("alarmSampleType", alarmSampleType).append("alarmValue", alarmValue).append("alarmFallingThreshold", alarmFallingThreshold).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alarmIndex).append(alarmVariable).append(alarmSampleType).append(alarmValue).append(alarmFallingThreshold).toHashCode();
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
        FallingAlarm rhs = ((FallingAlarm) obj);
        return new EqualsBuilder().append(alarmIndex, rhs.alarmIndex).append(alarmVariable, rhs.alarmVariable).append(alarmSampleType, rhs.alarmSampleType).append(alarmValue, rhs.alarmValue).append(alarmFallingThreshold, rhs.alarmFallingThreshold).isEquals();
    }

    public FallingAlarm clone() {
        FallingAlarm _copy = new FallingAlarm();
        _copy.alarmIndex = alarmIndex;
        _copy.alarmVariable = alarmVariable;
        _copy.alarmSampleType = alarmSampleType;
        _copy.alarmValue = alarmValue;
        _copy.alarmFallingThreshold = alarmFallingThreshold;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.0.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alarmIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "alarmVariable", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "alarmSampleType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "alarmValue", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "alarmFallingThreshold", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
