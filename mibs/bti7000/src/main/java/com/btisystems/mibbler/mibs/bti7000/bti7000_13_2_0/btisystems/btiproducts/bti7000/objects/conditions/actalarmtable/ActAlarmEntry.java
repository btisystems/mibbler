
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.conditions.actalarmtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.conditions.ActAlarmTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions.actalarmtable.IActAlarmEntry;
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

public class ActAlarmEntry
    extends DeviceEntity
    implements Serializable, IActAlarmEntry, IIndexed, IVariableBindingSetter
{

    private String actAlarmNotifIdx;
    private String actAlarmTableEntryIdx;
    private String actAlarmInstanceIdx;
    private int actAlarmReportType;
    private String actAlarmDateAndTime;
    private int actAlarmSeverity;
    private int actAlarmServiceAffecting;
    private String actAlarmDescription;
    private int actAlarmObjectType;
    private int actAlarmCodeType;
    private String _index;
    private ActAlarmTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ActAlarmEntry() {
    }

    public String getActAlarmNotifIdx() {
        return this.actAlarmNotifIdx;
    }

    public void setActAlarmNotifIdx(String actAlarmNotifIdx) {
        String oldValue = getActAlarmNotifIdx();
        this.actAlarmNotifIdx = actAlarmNotifIdx;
        notifyChange(1, oldValue, actAlarmNotifIdx);
    }

    public String getActAlarmTableEntryIdx() {
        return this.actAlarmTableEntryIdx;
    }

    public void setActAlarmTableEntryIdx(String actAlarmTableEntryIdx) {
        String oldValue = getActAlarmTableEntryIdx();
        this.actAlarmTableEntryIdx = actAlarmTableEntryIdx;
        notifyChange(2, oldValue, actAlarmTableEntryIdx);
    }

    public String getActAlarmInstanceIdx() {
        return this.actAlarmInstanceIdx;
    }

    public void setActAlarmInstanceIdx(String actAlarmInstanceIdx) {
        String oldValue = getActAlarmInstanceIdx();
        this.actAlarmInstanceIdx = actAlarmInstanceIdx;
        notifyChange(3, oldValue, actAlarmInstanceIdx);
    }

    public int getActAlarmReportType() {
        return this.actAlarmReportType;
    }

    public void setActAlarmReportType(int actAlarmReportType) {
        int oldValue = getActAlarmReportType();
        this.actAlarmReportType = actAlarmReportType;
        notifyChange(4, oldValue, actAlarmReportType);
    }

    public String getActAlarmDateAndTime() {
        return this.actAlarmDateAndTime;
    }

    public void setActAlarmDateAndTime(String actAlarmDateAndTime) {
        String oldValue = getActAlarmDateAndTime();
        this.actAlarmDateAndTime = actAlarmDateAndTime;
        notifyChange(5, oldValue, actAlarmDateAndTime);
    }

    public int getActAlarmSeverity() {
        return this.actAlarmSeverity;
    }

    public void setActAlarmSeverity(int actAlarmSeverity) {
        int oldValue = getActAlarmSeverity();
        this.actAlarmSeverity = actAlarmSeverity;
        notifyChange(6, oldValue, actAlarmSeverity);
    }

    public int getActAlarmServiceAffecting() {
        return this.actAlarmServiceAffecting;
    }

    public void setActAlarmServiceAffecting(int actAlarmServiceAffecting) {
        int oldValue = getActAlarmServiceAffecting();
        this.actAlarmServiceAffecting = actAlarmServiceAffecting;
        notifyChange(7, oldValue, actAlarmServiceAffecting);
    }

    public String getActAlarmDescription() {
        return this.actAlarmDescription;
    }

    public void setActAlarmDescription(String actAlarmDescription) {
        String oldValue = getActAlarmDescription();
        this.actAlarmDescription = actAlarmDescription;
        notifyChange(8, oldValue, actAlarmDescription);
    }

    public int getActAlarmObjectType() {
        return this.actAlarmObjectType;
    }

    public void setActAlarmObjectType(int actAlarmObjectType) {
        int oldValue = getActAlarmObjectType();
        this.actAlarmObjectType = actAlarmObjectType;
        notifyChange(9, oldValue, actAlarmObjectType);
    }

    public int getActAlarmCodeType() {
        return this.actAlarmCodeType;
    }

    public void setActAlarmCodeType(int actAlarmCodeType) {
        int oldValue = getActAlarmCodeType();
        this.actAlarmCodeType = actAlarmCodeType;
        notifyChange(10, oldValue, actAlarmCodeType);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setActAlarmNotifIdx(binding.getVariable().toString());
                break;
            case  2 :
                setActAlarmTableEntryIdx(binding.getVariable().toString());
                break;
            case  3 :
                setActAlarmInstanceIdx(binding.getVariable().toString());
                break;
            case  4 :
                setActAlarmReportType(binding.getVariable().toInt());
                break;
            case  5 :
                setActAlarmDateAndTime(binding.getVariable().toString());
                break;
            case  6 :
                setActAlarmSeverity(binding.getVariable().toInt());
                break;
            case  7 :
                setActAlarmServiceAffecting(binding.getVariable().toInt());
                break;
            case  8 :
                setActAlarmDescription(binding.getVariable().toString());
                break;
            case  9 :
                setActAlarmObjectType(binding.getVariable().toInt());
                break;
            case  10 :
                setActAlarmCodeType(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        _len = _oidInts[arrayOffset ++];
        setActAlarmNotifIdx(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setActAlarmTableEntryIdx(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setActAlarmInstanceIdx(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(ActAlarmTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("actAlarmNotifIdx", actAlarmNotifIdx).append("actAlarmTableEntryIdx", actAlarmTableEntryIdx).append("actAlarmInstanceIdx", actAlarmInstanceIdx).append("actAlarmReportType", actAlarmReportType).append("actAlarmDateAndTime", actAlarmDateAndTime).append("actAlarmSeverity", actAlarmSeverity).append("actAlarmServiceAffecting", actAlarmServiceAffecting).append("actAlarmDescription", actAlarmDescription).append("actAlarmObjectType", actAlarmObjectType).append("actAlarmCodeType", actAlarmCodeType).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(actAlarmNotifIdx).append(actAlarmTableEntryIdx).append(actAlarmInstanceIdx).append(actAlarmReportType).append(actAlarmDateAndTime).append(actAlarmSeverity).append(actAlarmServiceAffecting).append(actAlarmDescription).append(actAlarmObjectType).append(actAlarmCodeType).append(_index).toHashCode();
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
        ActAlarmEntry rhs = ((ActAlarmEntry) obj);
        return new EqualsBuilder().append(actAlarmNotifIdx, rhs.actAlarmNotifIdx).append(actAlarmTableEntryIdx, rhs.actAlarmTableEntryIdx).append(actAlarmInstanceIdx, rhs.actAlarmInstanceIdx).append(actAlarmReportType, rhs.actAlarmReportType).append(actAlarmDateAndTime, rhs.actAlarmDateAndTime).append(actAlarmSeverity, rhs.actAlarmSeverity).append(actAlarmServiceAffecting, rhs.actAlarmServiceAffecting).append(actAlarmDescription, rhs.actAlarmDescription).append(actAlarmObjectType, rhs.actAlarmObjectType).append(actAlarmCodeType, rhs.actAlarmCodeType).append(_index, rhs._index).isEquals();
    }

    public ActAlarmEntry clone() {
        ActAlarmEntry _copy = new ActAlarmEntry();
        _copy.actAlarmNotifIdx = actAlarmNotifIdx;
        _copy.actAlarmTableEntryIdx = actAlarmTableEntryIdx;
        _copy.actAlarmInstanceIdx = actAlarmInstanceIdx;
        _copy.actAlarmReportType = actAlarmReportType;
        _copy.actAlarmDateAndTime = actAlarmDateAndTime;
        _copy.actAlarmSeverity = actAlarmSeverity;
        _copy.actAlarmServiceAffecting = actAlarmServiceAffecting;
        _copy.actAlarmDescription = actAlarmDescription;
        _copy.actAlarmObjectType = actAlarmObjectType;
        _copy.actAlarmCodeType = actAlarmCodeType;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.7.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "actAlarmNotifIdx", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "actAlarmTableEntryIdx", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "actAlarmInstanceIdx", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "actAlarmReportType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "actAlarmDateAndTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "actAlarmSeverity", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "actAlarmServiceAffecting", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "actAlarmDescription", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "actAlarmObjectType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "actAlarmCodeType", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
