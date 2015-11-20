
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.alarm.alarmtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.alarm.alarmtable.IAlarmEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.alarm.AlarmTable;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IIndexed;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class AlarmEntry
    extends DeviceEntity
    implements Serializable, IAlarmEntry, IIndexed, IVariableBindingSetter
{

    private int alarmIndex;
    private int alarmInterval;
    private String alarmVariable;
    private int alarmSampleType;
    private int alarmValue;
    private int alarmStartupAlarm;
    private int alarmRisingThreshold;
    private int alarmFallingThreshold;
    private int alarmRisingEventIndex;
    private int alarmFallingEventIndex;
    private String alarmOwner;
    private int alarmStatus;
    private String _index;
    private AlarmTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AlarmEntry() {
    }

    public int getAlarmIndex() {
        return this.alarmIndex;
    }

    public void setAlarmIndex(int alarmIndex) {
        int oldValue = getAlarmIndex();
        this.alarmIndex = alarmIndex;
        notifyChange(1, oldValue, alarmIndex);
    }

    public int getAlarmInterval() {
        return this.alarmInterval;
    }

    public void setAlarmInterval(int alarmInterval) {
        int oldValue = getAlarmInterval();
        this.alarmInterval = alarmInterval;
        notifyChange(2, oldValue, alarmInterval);
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

    public int getAlarmStartupAlarm() {
        return this.alarmStartupAlarm;
    }

    public void setAlarmStartupAlarm(int alarmStartupAlarm) {
        int oldValue = getAlarmStartupAlarm();
        this.alarmStartupAlarm = alarmStartupAlarm;
        notifyChange(6, oldValue, alarmStartupAlarm);
    }

    public int getAlarmRisingThreshold() {
        return this.alarmRisingThreshold;
    }

    public void setAlarmRisingThreshold(int alarmRisingThreshold) {
        int oldValue = getAlarmRisingThreshold();
        this.alarmRisingThreshold = alarmRisingThreshold;
        notifyChange(7, oldValue, alarmRisingThreshold);
    }

    public int getAlarmFallingThreshold() {
        return this.alarmFallingThreshold;
    }

    public void setAlarmFallingThreshold(int alarmFallingThreshold) {
        int oldValue = getAlarmFallingThreshold();
        this.alarmFallingThreshold = alarmFallingThreshold;
        notifyChange(8, oldValue, alarmFallingThreshold);
    }

    public int getAlarmRisingEventIndex() {
        return this.alarmRisingEventIndex;
    }

    public void setAlarmRisingEventIndex(int alarmRisingEventIndex) {
        int oldValue = getAlarmRisingEventIndex();
        this.alarmRisingEventIndex = alarmRisingEventIndex;
        notifyChange(9, oldValue, alarmRisingEventIndex);
    }

    public int getAlarmFallingEventIndex() {
        return this.alarmFallingEventIndex;
    }

    public void setAlarmFallingEventIndex(int alarmFallingEventIndex) {
        int oldValue = getAlarmFallingEventIndex();
        this.alarmFallingEventIndex = alarmFallingEventIndex;
        notifyChange(10, oldValue, alarmFallingEventIndex);
    }

    public String getAlarmOwner() {
        return this.alarmOwner;
    }

    public void setAlarmOwner(String alarmOwner) {
        String oldValue = getAlarmOwner();
        this.alarmOwner = alarmOwner;
        notifyChange(11, oldValue, alarmOwner);
    }

    public int getAlarmStatus() {
        return this.alarmStatus;
    }

    public void setAlarmStatus(int alarmStatus) {
        int oldValue = getAlarmStatus();
        this.alarmStatus = alarmStatus;
        notifyChange(12, oldValue, alarmStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setAlarmIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setAlarmInterval(binding.getVariable().toInt());
                break;
            case  3 :
                setAlarmVariable(binding.getVariable().toString());
                break;
            case  4 :
                setAlarmSampleType(binding.getVariable().toInt());
                break;
            case  5 :
                setAlarmValue(binding.getVariable().toInt());
                break;
            case  6 :
                setAlarmStartupAlarm(binding.getVariable().toInt());
                break;
            case  7 :
                setAlarmRisingThreshold(binding.getVariable().toInt());
                break;
            case  8 :
                setAlarmFallingThreshold(binding.getVariable().toInt());
                break;
            case  9 :
                setAlarmRisingEventIndex(binding.getVariable().toInt());
                break;
            case  10 :
                setAlarmFallingEventIndex(binding.getVariable().toInt());
                break;
            case  11 :
                setAlarmOwner(binding.getVariable().toString());
                break;
            case  12 :
                setAlarmStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setAlarmIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AlarmTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alarmIndex", alarmIndex).append("alarmInterval", alarmInterval).append("alarmVariable", alarmVariable).append("alarmSampleType", alarmSampleType).append("alarmValue", alarmValue).append("alarmStartupAlarm", alarmStartupAlarm).append("alarmRisingThreshold", alarmRisingThreshold).append("alarmFallingThreshold", alarmFallingThreshold).append("alarmRisingEventIndex", alarmRisingEventIndex).append("alarmFallingEventIndex", alarmFallingEventIndex).append("alarmOwner", alarmOwner).append("alarmStatus", alarmStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alarmIndex).append(alarmInterval).append(alarmVariable).append(alarmSampleType).append(alarmValue).append(alarmStartupAlarm).append(alarmRisingThreshold).append(alarmFallingThreshold).append(alarmRisingEventIndex).append(alarmFallingEventIndex).append(alarmOwner).append(alarmStatus).append(_index).toHashCode();
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
        AlarmEntry rhs = ((AlarmEntry) obj);
        return new EqualsBuilder().append(alarmIndex, rhs.alarmIndex).append(alarmInterval, rhs.alarmInterval).append(alarmVariable, rhs.alarmVariable).append(alarmSampleType, rhs.alarmSampleType).append(alarmValue, rhs.alarmValue).append(alarmStartupAlarm, rhs.alarmStartupAlarm).append(alarmRisingThreshold, rhs.alarmRisingThreshold).append(alarmFallingThreshold, rhs.alarmFallingThreshold).append(alarmRisingEventIndex, rhs.alarmRisingEventIndex).append(alarmFallingEventIndex, rhs.alarmFallingEventIndex).append(alarmOwner, rhs.alarmOwner).append(alarmStatus, rhs.alarmStatus).append(_index, rhs._index).isEquals();
    }

    public AlarmEntry clone() {
        AlarmEntry _copy = new AlarmEntry();
        _copy.alarmIndex = alarmIndex;
        _copy.alarmInterval = alarmInterval;
        _copy.alarmVariable = alarmVariable;
        _copy.alarmSampleType = alarmSampleType;
        _copy.alarmValue = alarmValue;
        _copy.alarmStartupAlarm = alarmStartupAlarm;
        _copy.alarmRisingThreshold = alarmRisingThreshold;
        _copy.alarmFallingThreshold = alarmFallingThreshold;
        _copy.alarmRisingEventIndex = alarmRisingEventIndex;
        _copy.alarmFallingEventIndex = alarmFallingEventIndex;
        _copy.alarmOwner = alarmOwner;
        _copy.alarmStatus = alarmStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.3.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alarmIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "alarmInterval", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "alarmVariable", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "alarmSampleType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "alarmValue", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "alarmStartupAlarm", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "alarmRisingThreshold", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "alarmFallingThreshold", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "alarmRisingEventIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "alarmFallingEventIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "alarmOwner", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "alarmStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
