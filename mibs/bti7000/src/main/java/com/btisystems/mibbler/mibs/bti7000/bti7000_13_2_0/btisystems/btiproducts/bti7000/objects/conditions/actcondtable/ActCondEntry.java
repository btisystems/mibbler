
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.conditions.actcondtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.conditions.ActCondTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions.actcondtable.IActCondEntry;
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

public class ActCondEntry
    extends DeviceEntity
    implements Serializable, IActCondEntry, IIndexed, IVariableBindingSetter
{

    private String actCondNotifIdx;
    private String actCondTableEntryIdx;
    private String actCondInstanceIdx;
    private int actCondReportType;
    private String actCondDateAndTime;
    private int actCondSeverity;
    private int actCondServiceAffecting;
    private String actCondDescription;
    private int actCondObjectType;
    private int actCondCodeType;
    private String _index;
    private ActCondTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ActCondEntry() {
    }

    public String getActCondNotifIdx() {
        return this.actCondNotifIdx;
    }

    public void setActCondNotifIdx(String actCondNotifIdx) {
        String oldValue = getActCondNotifIdx();
        this.actCondNotifIdx = actCondNotifIdx;
        notifyChange(1, oldValue, actCondNotifIdx);
    }

    public String getActCondTableEntryIdx() {
        return this.actCondTableEntryIdx;
    }

    public void setActCondTableEntryIdx(String actCondTableEntryIdx) {
        String oldValue = getActCondTableEntryIdx();
        this.actCondTableEntryIdx = actCondTableEntryIdx;
        notifyChange(2, oldValue, actCondTableEntryIdx);
    }

    public String getActCondInstanceIdx() {
        return this.actCondInstanceIdx;
    }

    public void setActCondInstanceIdx(String actCondInstanceIdx) {
        String oldValue = getActCondInstanceIdx();
        this.actCondInstanceIdx = actCondInstanceIdx;
        notifyChange(3, oldValue, actCondInstanceIdx);
    }

    public int getActCondReportType() {
        return this.actCondReportType;
    }

    public void setActCondReportType(int actCondReportType) {
        int oldValue = getActCondReportType();
        this.actCondReportType = actCondReportType;
        notifyChange(4, oldValue, actCondReportType);
    }

    public String getActCondDateAndTime() {
        return this.actCondDateAndTime;
    }

    public void setActCondDateAndTime(String actCondDateAndTime) {
        String oldValue = getActCondDateAndTime();
        this.actCondDateAndTime = actCondDateAndTime;
        notifyChange(5, oldValue, actCondDateAndTime);
    }

    public int getActCondSeverity() {
        return this.actCondSeverity;
    }

    public void setActCondSeverity(int actCondSeverity) {
        int oldValue = getActCondSeverity();
        this.actCondSeverity = actCondSeverity;
        notifyChange(6, oldValue, actCondSeverity);
    }

    public int getActCondServiceAffecting() {
        return this.actCondServiceAffecting;
    }

    public void setActCondServiceAffecting(int actCondServiceAffecting) {
        int oldValue = getActCondServiceAffecting();
        this.actCondServiceAffecting = actCondServiceAffecting;
        notifyChange(7, oldValue, actCondServiceAffecting);
    }

    public String getActCondDescription() {
        return this.actCondDescription;
    }

    public void setActCondDescription(String actCondDescription) {
        String oldValue = getActCondDescription();
        this.actCondDescription = actCondDescription;
        notifyChange(8, oldValue, actCondDescription);
    }

    public int getActCondObjectType() {
        return this.actCondObjectType;
    }

    public void setActCondObjectType(int actCondObjectType) {
        int oldValue = getActCondObjectType();
        this.actCondObjectType = actCondObjectType;
        notifyChange(9, oldValue, actCondObjectType);
    }

    public int getActCondCodeType() {
        return this.actCondCodeType;
    }

    public void setActCondCodeType(int actCondCodeType) {
        int oldValue = getActCondCodeType();
        this.actCondCodeType = actCondCodeType;
        notifyChange(10, oldValue, actCondCodeType);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setActCondNotifIdx(binding.getVariable().toString());
                break;
            case  2 :
                setActCondTableEntryIdx(binding.getVariable().toString());
                break;
            case  3 :
                setActCondInstanceIdx(binding.getVariable().toString());
                break;
            case  4 :
                setActCondReportType(binding.getVariable().toInt());
                break;
            case  5 :
                setActCondDateAndTime(binding.getVariable().toString());
                break;
            case  6 :
                setActCondSeverity(binding.getVariable().toInt());
                break;
            case  7 :
                setActCondServiceAffecting(binding.getVariable().toInt());
                break;
            case  8 :
                setActCondDescription(binding.getVariable().toString());
                break;
            case  9 :
                setActCondObjectType(binding.getVariable().toInt());
                break;
            case  10 :
                setActCondCodeType(binding.getVariable().toInt());
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
        setActCondNotifIdx(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setActCondTableEntryIdx(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setActCondInstanceIdx(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(ActCondTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("actCondNotifIdx", actCondNotifIdx).append("actCondTableEntryIdx", actCondTableEntryIdx).append("actCondInstanceIdx", actCondInstanceIdx).append("actCondReportType", actCondReportType).append("actCondDateAndTime", actCondDateAndTime).append("actCondSeverity", actCondSeverity).append("actCondServiceAffecting", actCondServiceAffecting).append("actCondDescription", actCondDescription).append("actCondObjectType", actCondObjectType).append("actCondCodeType", actCondCodeType).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(actCondNotifIdx).append(actCondTableEntryIdx).append(actCondInstanceIdx).append(actCondReportType).append(actCondDateAndTime).append(actCondSeverity).append(actCondServiceAffecting).append(actCondDescription).append(actCondObjectType).append(actCondCodeType).append(_index).toHashCode();
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
        ActCondEntry rhs = ((ActCondEntry) obj);
        return new EqualsBuilder().append(actCondNotifIdx, rhs.actCondNotifIdx).append(actCondTableEntryIdx, rhs.actCondTableEntryIdx).append(actCondInstanceIdx, rhs.actCondInstanceIdx).append(actCondReportType, rhs.actCondReportType).append(actCondDateAndTime, rhs.actCondDateAndTime).append(actCondSeverity, rhs.actCondSeverity).append(actCondServiceAffecting, rhs.actCondServiceAffecting).append(actCondDescription, rhs.actCondDescription).append(actCondObjectType, rhs.actCondObjectType).append(actCondCodeType, rhs.actCondCodeType).append(_index, rhs._index).isEquals();
    }

    public ActCondEntry clone() {
        ActCondEntry _copy = new ActCondEntry();
        _copy.actCondNotifIdx = actCondNotifIdx;
        _copy.actCondTableEntryIdx = actCondTableEntryIdx;
        _copy.actCondInstanceIdx = actCondInstanceIdx;
        _copy.actCondReportType = actCondReportType;
        _copy.actCondDateAndTime = actCondDateAndTime;
        _copy.actCondSeverity = actCondSeverity;
        _copy.actCondServiceAffecting = actCondServiceAffecting;
        _copy.actCondDescription = actCondDescription;
        _copy.actCondObjectType = actCondObjectType;
        _copy.actCondCodeType = actCondCodeType;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.7.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "actCondNotifIdx", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "actCondTableEntryIdx", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "actCondInstanceIdx", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "actCondReportType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "actCondDateAndTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "actCondSeverity", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "actCondServiceAffecting", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "actCondDescription", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "actCondObjectType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "actCondCodeType", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
