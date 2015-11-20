
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.schedmib.schedobjects.schedtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.schedmib.schedobjects.schedtable.ISchedEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.schedmib.schedobjects.SchedTable;
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

public class SchedEntry
    extends DeviceEntity
    implements Serializable, ISchedEntry, IIndexed, IVariableBindingSetter
{

    private String schedOwner;
    private String schedName;
    private String schedDescr;
    private Integer schedInterval;
    private String schedWeekDay;
    private String schedMonth;
    private String schedDay;
    private String schedHour;
    private String schedMinute;
    private String schedContextName;
    private String schedVariable;
    private Integer schedValue;
    private Integer schedType;
    private Integer schedAdminStatus;
    private int schedOperStatus;
    private int schedFailures;
    private Integer schedLastFailure;
    private String schedLastFailed;
    private Integer schedStorageType;
    private int schedRowStatus;
    private int schedTriggers;
    private String _index;
    private SchedTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SchedEntry() {
    }

    public String getSchedOwner() {
        return this.schedOwner;
    }

    public void setSchedOwner(String schedOwner) {
        String oldValue = getSchedOwner();
        this.schedOwner = schedOwner;
        notifyChange(1, oldValue, schedOwner);
    }

    public String getSchedName() {
        return this.schedName;
    }

    public void setSchedName(String schedName) {
        String oldValue = getSchedName();
        this.schedName = schedName;
        notifyChange(2, oldValue, schedName);
    }

    public String getSchedDescr() {
        if (this.schedDescr == null) {
            return "";
        }
        return this.schedDescr;
    }

    public boolean isSchedDescrDefined() {
        return (this.schedDescr!= null);
    }

    public void setSchedDescr(String schedDescr) {
        String oldValue = getSchedDescr();
        this.schedDescr = schedDescr;
        notifyChange(3, oldValue, schedDescr);
    }

    public int getSchedInterval() {
        if (this.schedInterval == null) {
            return  0;
        }
        return this.schedInterval;
    }

    public boolean isSchedIntervalDefined() {
        return (this.schedInterval!= null);
    }

    public void setSchedInterval(int schedInterval) {
        int oldValue = getSchedInterval();
        this.schedInterval = schedInterval;
        notifyChange(4, oldValue, schedInterval);
    }

    public String getSchedWeekDay() {
        return this.schedWeekDay;
    }

    public void setSchedWeekDay(String schedWeekDay) {
        String oldValue = getSchedWeekDay();
        this.schedWeekDay = schedWeekDay;
        notifyChange(5, oldValue, schedWeekDay);
    }

    public String getSchedMonth() {
        return this.schedMonth;
    }

    public void setSchedMonth(String schedMonth) {
        String oldValue = getSchedMonth();
        this.schedMonth = schedMonth;
        notifyChange(6, oldValue, schedMonth);
    }

    public String getSchedDay() {
        return this.schedDay;
    }

    public void setSchedDay(String schedDay) {
        String oldValue = getSchedDay();
        this.schedDay = schedDay;
        notifyChange(7, oldValue, schedDay);
    }

    public String getSchedHour() {
        return this.schedHour;
    }

    public void setSchedHour(String schedHour) {
        String oldValue = getSchedHour();
        this.schedHour = schedHour;
        notifyChange(8, oldValue, schedHour);
    }

    public String getSchedMinute() {
        return this.schedMinute;
    }

    public void setSchedMinute(String schedMinute) {
        String oldValue = getSchedMinute();
        this.schedMinute = schedMinute;
        notifyChange(9, oldValue, schedMinute);
    }

    public String getSchedContextName() {
        if (this.schedContextName == null) {
            return "";
        }
        return this.schedContextName;
    }

    public boolean isSchedContextNameDefined() {
        return (this.schedContextName!= null);
    }

    public void setSchedContextName(String schedContextName) {
        String oldValue = getSchedContextName();
        this.schedContextName = schedContextName;
        notifyChange(10, oldValue, schedContextName);
    }

    public String getSchedVariable() {
        return this.schedVariable;
    }

    public void setSchedVariable(String schedVariable) {
        String oldValue = getSchedVariable();
        this.schedVariable = schedVariable;
        notifyChange(11, oldValue, schedVariable);
    }

    public int getSchedValue() {
        if (this.schedValue == null) {
            return  0;
        }
        return this.schedValue;
    }

    public boolean isSchedValueDefined() {
        return (this.schedValue!= null);
    }

    public void setSchedValue(int schedValue) {
        int oldValue = getSchedValue();
        this.schedValue = schedValue;
        notifyChange(12, oldValue, schedValue);
    }

    public int getSchedType() {
        if (this.schedType == null) {
            return  1;
        }
        return this.schedType;
    }

    public boolean isSchedTypeDefined() {
        return (this.schedType!= null);
    }

    public void setSchedType(int schedType) {
        int oldValue = getSchedType();
        this.schedType = schedType;
        notifyChange(13, oldValue, schedType);
    }

    public int getSchedAdminStatus() {
        if (this.schedAdminStatus == null) {
            return  2;
        }
        return this.schedAdminStatus;
    }

    public boolean isSchedAdminStatusDefined() {
        return (this.schedAdminStatus!= null);
    }

    public void setSchedAdminStatus(int schedAdminStatus) {
        int oldValue = getSchedAdminStatus();
        this.schedAdminStatus = schedAdminStatus;
        notifyChange(14, oldValue, schedAdminStatus);
    }

    public int getSchedOperStatus() {
        return this.schedOperStatus;
    }

    public void setSchedOperStatus(int schedOperStatus) {
        int oldValue = getSchedOperStatus();
        this.schedOperStatus = schedOperStatus;
        notifyChange(15, oldValue, schedOperStatus);
    }

    public int getSchedFailures() {
        return this.schedFailures;
    }

    public void setSchedFailures(int schedFailures) {
        int oldValue = getSchedFailures();
        this.schedFailures = schedFailures;
        notifyChange(16, oldValue, schedFailures);
    }

    public int getSchedLastFailure() {
        if (this.schedLastFailure == null) {
            return  0;
        }
        return this.schedLastFailure;
    }

    public boolean isSchedLastFailureDefined() {
        return (this.schedLastFailure!= null);
    }

    public void setSchedLastFailure(int schedLastFailure) {
        int oldValue = getSchedLastFailure();
        this.schedLastFailure = schedLastFailure;
        notifyChange(17, oldValue, schedLastFailure);
    }

    public String getSchedLastFailed() {
        return this.schedLastFailed;
    }

    public void setSchedLastFailed(String schedLastFailed) {
        String oldValue = getSchedLastFailed();
        this.schedLastFailed = schedLastFailed;
        notifyChange(18, oldValue, schedLastFailed);
    }

    public int getSchedStorageType() {
        if (this.schedStorageType == null) {
            return  2;
        }
        return this.schedStorageType;
    }

    public boolean isSchedStorageTypeDefined() {
        return (this.schedStorageType!= null);
    }

    public void setSchedStorageType(int schedStorageType) {
        int oldValue = getSchedStorageType();
        this.schedStorageType = schedStorageType;
        notifyChange(19, oldValue, schedStorageType);
    }

    public int getSchedRowStatus() {
        return this.schedRowStatus;
    }

    public void setSchedRowStatus(int schedRowStatus) {
        int oldValue = getSchedRowStatus();
        this.schedRowStatus = schedRowStatus;
        notifyChange(20, oldValue, schedRowStatus);
    }

    public int getSchedTriggers() {
        return this.schedTriggers;
    }

    public void setSchedTriggers(int schedTriggers) {
        int oldValue = getSchedTriggers();
        this.schedTriggers = schedTriggers;
        notifyChange(21, oldValue, schedTriggers);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSchedOwner(binding.getVariable().toString());
                break;
            case  2 :
                setSchedName(binding.getVariable().toString());
                break;
            case  3 :
                setSchedDescr(binding.getVariable().toString());
                break;
            case  4 :
                setSchedInterval(binding.getVariable().toInt());
                break;
            case  5 :
                setSchedWeekDay(binding.getVariable().toString());
                break;
            case  6 :
                setSchedMonth(binding.getVariable().toString());
                break;
            case  7 :
                setSchedDay(binding.getVariable().toString());
                break;
            case  8 :
                setSchedHour(binding.getVariable().toString());
                break;
            case  9 :
                setSchedMinute(binding.getVariable().toString());
                break;
            case  10 :
                setSchedContextName(binding.getVariable().toString());
                break;
            case  11 :
                setSchedVariable(binding.getVariable().toString());
                break;
            case  12 :
                setSchedValue(binding.getVariable().toInt());
                break;
            case  13 :
                setSchedType(binding.getVariable().toInt());
                break;
            case  14 :
                setSchedAdminStatus(binding.getVariable().toInt());
                break;
            case  15 :
                setSchedOperStatus(binding.getVariable().toInt());
                break;
            case  16 :
                setSchedFailures(binding.getVariable().toInt());
                break;
            case  17 :
                setSchedLastFailure(binding.getVariable().toInt());
                break;
            case  18 :
                setSchedLastFailed(binding.getVariable().toString());
                break;
            case  19 :
                setSchedStorageType(binding.getVariable().toInt());
                break;
            case  20 :
                setSchedRowStatus(binding.getVariable().toInt());
                break;
            case  21 :
                setSchedTriggers(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        _len = _oidInts[arrayOffset ++];
        setSchedOwner(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setSchedName(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SchedTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("schedOwner", schedOwner).append("schedName", schedName).append("schedDescr", schedDescr).append("schedInterval", schedInterval).append("schedWeekDay", schedWeekDay).append("schedMonth", schedMonth).append("schedDay", schedDay).append("schedHour", schedHour).append("schedMinute", schedMinute).append("schedContextName", schedContextName).append("schedVariable", schedVariable).append("schedValue", schedValue).append("schedType", schedType).append("schedAdminStatus", schedAdminStatus).append("schedOperStatus", schedOperStatus).append("schedFailures", schedFailures).append("schedLastFailure", schedLastFailure).append("schedLastFailed", schedLastFailed).append("schedStorageType", schedStorageType).append("schedRowStatus", schedRowStatus).append("schedTriggers", schedTriggers).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(schedOwner).append(schedName).append(schedDescr).append(schedInterval).append(schedWeekDay).append(schedMonth).append(schedDay).append(schedHour).append(schedMinute).append(schedContextName).append(schedVariable).append(schedValue).append(schedType).append(schedAdminStatus).append(schedOperStatus).append(schedFailures).append(schedLastFailure).append(schedLastFailed).append(schedStorageType).append(schedRowStatus).append(schedTriggers).append(_index).toHashCode();
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
        SchedEntry rhs = ((SchedEntry) obj);
        return new EqualsBuilder().append(schedOwner, rhs.schedOwner).append(schedName, rhs.schedName).append(schedDescr, rhs.schedDescr).append(schedInterval, rhs.schedInterval).append(schedWeekDay, rhs.schedWeekDay).append(schedMonth, rhs.schedMonth).append(schedDay, rhs.schedDay).append(schedHour, rhs.schedHour).append(schedMinute, rhs.schedMinute).append(schedContextName, rhs.schedContextName).append(schedVariable, rhs.schedVariable).append(schedValue, rhs.schedValue).append(schedType, rhs.schedType).append(schedAdminStatus, rhs.schedAdminStatus).append(schedOperStatus, rhs.schedOperStatus).append(schedFailures, rhs.schedFailures).append(schedLastFailure, rhs.schedLastFailure).append(schedLastFailed, rhs.schedLastFailed).append(schedStorageType, rhs.schedStorageType).append(schedRowStatus, rhs.schedRowStatus).append(schedTriggers, rhs.schedTriggers).append(_index, rhs._index).isEquals();
    }

    public SchedEntry clone() {
        SchedEntry _copy = new SchedEntry();
        _copy.schedOwner = schedOwner;
        _copy.schedName = schedName;
        _copy.schedDescr = schedDescr;
        _copy.schedInterval = schedInterval;
        _copy.schedWeekDay = schedWeekDay;
        _copy.schedMonth = schedMonth;
        _copy.schedDay = schedDay;
        _copy.schedHour = schedHour;
        _copy.schedMinute = schedMinute;
        _copy.schedContextName = schedContextName;
        _copy.schedVariable = schedVariable;
        _copy.schedValue = schedValue;
        _copy.schedType = schedType;
        _copy.schedAdminStatus = schedAdminStatus;
        _copy.schedOperStatus = schedOperStatus;
        _copy.schedFailures = schedFailures;
        _copy.schedLastFailure = schedLastFailure;
        _copy.schedLastFailed = schedLastFailed;
        _copy.schedStorageType = schedStorageType;
        _copy.schedRowStatus = schedRowStatus;
        _copy.schedTriggers = schedTriggers;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.63.1.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "schedOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "schedName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "schedDescr", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "schedInterval", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "schedWeekDay", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "schedMonth", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "schedDay", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "schedHour", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "schedMinute", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "schedContextName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "schedVariable", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "schedValue", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "schedType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "schedAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "schedOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "schedFailures", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "schedLastFailure", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "schedLastFailed", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "schedStorageType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "schedRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "schedTriggers", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
