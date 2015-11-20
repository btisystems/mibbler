
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.ospfiftable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.OspfIfTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospfiftable.IOspfIfEntry;
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

public class OspfIfEntry
    extends DeviceEntity
    implements Serializable, IOspfIfEntry, IIndexed, IVariableBindingSetter
{

    private Integer ospfIfSwitchId;
    private int ospfIfShelfIdx;
    private int ospfIfSlotIdx;
    private Integer ospfIfType;
    private int ospfIfIdx;
    private Integer ospfIfSubIdx;
    private String ospfIfAreaId;
    private Integer ospfIfAdminStat;
    private Integer ospfIfRtrPriority;
    private Integer ospfIfTransitDelay;
    private Integer ospfIfRetransInterval;
    private Integer ospfIfHelloInterval;
    private Integer ospfIfRtrDeadInterval;
    private Integer ospfIfMetricValue;
    private int ospfIfStatus;
    private String _index;
    private OspfIfTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OspfIfEntry() {
    }

    public int getOspfIfSwitchId() {
        if (this.ospfIfSwitchId == null) {
            return  0;
        }
        return this.ospfIfSwitchId;
    }

    public boolean isOspfIfSwitchIdDefined() {
        return (this.ospfIfSwitchId!= null);
    }

    public void setOspfIfSwitchId(int ospfIfSwitchId) {
        int oldValue = getOspfIfSwitchId();
        this.ospfIfSwitchId = ospfIfSwitchId;
        notifyChange(1, oldValue, ospfIfSwitchId);
    }

    public int getOspfIfShelfIdx() {
        return this.ospfIfShelfIdx;
    }

    public void setOspfIfShelfIdx(int ospfIfShelfIdx) {
        int oldValue = getOspfIfShelfIdx();
        this.ospfIfShelfIdx = ospfIfShelfIdx;
        notifyChange(2, oldValue, ospfIfShelfIdx);
    }

    public int getOspfIfSlotIdx() {
        return this.ospfIfSlotIdx;
    }

    public void setOspfIfSlotIdx(int ospfIfSlotIdx) {
        int oldValue = getOspfIfSlotIdx();
        this.ospfIfSlotIdx = ospfIfSlotIdx;
        notifyChange(3, oldValue, ospfIfSlotIdx);
    }

    public int getOspfIfType() {
        if (this.ospfIfType == null) {
            return  0;
        }
        return this.ospfIfType;
    }

    public boolean isOspfIfTypeDefined() {
        return (this.ospfIfType!= null);
    }

    public void setOspfIfType(int ospfIfType) {
        int oldValue = getOspfIfType();
        this.ospfIfType = ospfIfType;
        notifyChange(4, oldValue, ospfIfType);
    }

    public int getOspfIfIdx() {
        return this.ospfIfIdx;
    }

    public void setOspfIfIdx(int ospfIfIdx) {
        int oldValue = getOspfIfIdx();
        this.ospfIfIdx = ospfIfIdx;
        notifyChange(5, oldValue, ospfIfIdx);
    }

    public int getOspfIfSubIdx() {
        if (this.ospfIfSubIdx == null) {
            return  0;
        }
        return this.ospfIfSubIdx;
    }

    public boolean isOspfIfSubIdxDefined() {
        return (this.ospfIfSubIdx!= null);
    }

    public void setOspfIfSubIdx(int ospfIfSubIdx) {
        int oldValue = getOspfIfSubIdx();
        this.ospfIfSubIdx = ospfIfSubIdx;
        notifyChange(6, oldValue, ospfIfSubIdx);
    }

    public String getOspfIfAreaId() {
        return this.ospfIfAreaId;
    }

    public void setOspfIfAreaId(String ospfIfAreaId) {
        String oldValue = getOspfIfAreaId();
        this.ospfIfAreaId = ospfIfAreaId;
        notifyChange(7, oldValue, ospfIfAreaId);
    }

    public int getOspfIfAdminStat() {
        if (this.ospfIfAdminStat == null) {
            return  1;
        }
        return this.ospfIfAdminStat;
    }

    public boolean isOspfIfAdminStatDefined() {
        return (this.ospfIfAdminStat!= null);
    }

    public void setOspfIfAdminStat(int ospfIfAdminStat) {
        int oldValue = getOspfIfAdminStat();
        this.ospfIfAdminStat = ospfIfAdminStat;
        notifyChange(8, oldValue, ospfIfAdminStat);
    }

    public int getOspfIfRtrPriority() {
        if (this.ospfIfRtrPriority == null) {
            return  1;
        }
        return this.ospfIfRtrPriority;
    }

    public boolean isOspfIfRtrPriorityDefined() {
        return (this.ospfIfRtrPriority!= null);
    }

    public void setOspfIfRtrPriority(int ospfIfRtrPriority) {
        int oldValue = getOspfIfRtrPriority();
        this.ospfIfRtrPriority = ospfIfRtrPriority;
        notifyChange(9, oldValue, ospfIfRtrPriority);
    }

    public int getOspfIfTransitDelay() {
        if (this.ospfIfTransitDelay == null) {
            return  1;
        }
        return this.ospfIfTransitDelay;
    }

    public boolean isOspfIfTransitDelayDefined() {
        return (this.ospfIfTransitDelay!= null);
    }

    public void setOspfIfTransitDelay(int ospfIfTransitDelay) {
        int oldValue = getOspfIfTransitDelay();
        this.ospfIfTransitDelay = ospfIfTransitDelay;
        notifyChange(10, oldValue, ospfIfTransitDelay);
    }

    public int getOspfIfRetransInterval() {
        if (this.ospfIfRetransInterval == null) {
            return  5;
        }
        return this.ospfIfRetransInterval;
    }

    public boolean isOspfIfRetransIntervalDefined() {
        return (this.ospfIfRetransInterval!= null);
    }

    public void setOspfIfRetransInterval(int ospfIfRetransInterval) {
        int oldValue = getOspfIfRetransInterval();
        this.ospfIfRetransInterval = ospfIfRetransInterval;
        notifyChange(11, oldValue, ospfIfRetransInterval);
    }

    public int getOspfIfHelloInterval() {
        if (this.ospfIfHelloInterval == null) {
            return  10;
        }
        return this.ospfIfHelloInterval;
    }

    public boolean isOspfIfHelloIntervalDefined() {
        return (this.ospfIfHelloInterval!= null);
    }

    public void setOspfIfHelloInterval(int ospfIfHelloInterval) {
        int oldValue = getOspfIfHelloInterval();
        this.ospfIfHelloInterval = ospfIfHelloInterval;
        notifyChange(12, oldValue, ospfIfHelloInterval);
    }

    public int getOspfIfRtrDeadInterval() {
        if (this.ospfIfRtrDeadInterval == null) {
            return  40;
        }
        return this.ospfIfRtrDeadInterval;
    }

    public boolean isOspfIfRtrDeadIntervalDefined() {
        return (this.ospfIfRtrDeadInterval!= null);
    }

    public void setOspfIfRtrDeadInterval(int ospfIfRtrDeadInterval) {
        int oldValue = getOspfIfRtrDeadInterval();
        this.ospfIfRtrDeadInterval = ospfIfRtrDeadInterval;
        notifyChange(13, oldValue, ospfIfRtrDeadInterval);
    }

    public int getOspfIfMetricValue() {
        if (this.ospfIfMetricValue == null) {
            return  10;
        }
        return this.ospfIfMetricValue;
    }

    public boolean isOspfIfMetricValueDefined() {
        return (this.ospfIfMetricValue!= null);
    }

    public void setOspfIfMetricValue(int ospfIfMetricValue) {
        int oldValue = getOspfIfMetricValue();
        this.ospfIfMetricValue = ospfIfMetricValue;
        notifyChange(14, oldValue, ospfIfMetricValue);
    }

    public int getOspfIfStatus() {
        return this.ospfIfStatus;
    }

    public void setOspfIfStatus(int ospfIfStatus) {
        int oldValue = getOspfIfStatus();
        this.ospfIfStatus = ospfIfStatus;
        notifyChange(15, oldValue, ospfIfStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setOspfIfSwitchId(binding.getVariable().toInt());
                break;
            case  2 :
                setOspfIfShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setOspfIfSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setOspfIfType(binding.getVariable().toInt());
                break;
            case  5 :
                setOspfIfIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setOspfIfSubIdx(binding.getVariable().toInt());
                break;
            case  7 :
                setOspfIfAreaId(binding.getVariable().toString());
                break;
            case  8 :
                setOspfIfAdminStat(binding.getVariable().toInt());
                break;
            case  9 :
                setOspfIfRtrPriority(binding.getVariable().toInt());
                break;
            case  10 :
                setOspfIfTransitDelay(binding.getVariable().toInt());
                break;
            case  11 :
                setOspfIfRetransInterval(binding.getVariable().toInt());
                break;
            case  12 :
                setOspfIfHelloInterval(binding.getVariable().toInt());
                break;
            case  13 :
                setOspfIfRtrDeadInterval(binding.getVariable().toInt());
                break;
            case  14 :
                setOspfIfMetricValue(binding.getVariable().toInt());
                break;
            case  15 :
                setOspfIfStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setOspfIfSwitchId(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOspfIfShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOspfIfSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOspfIfType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOspfIfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOspfIfSubIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OspfIfTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ospfIfSwitchId", ospfIfSwitchId).append("ospfIfShelfIdx", ospfIfShelfIdx).append("ospfIfSlotIdx", ospfIfSlotIdx).append("ospfIfType", ospfIfType).append("ospfIfIdx", ospfIfIdx).append("ospfIfSubIdx", ospfIfSubIdx).append("ospfIfAreaId", ospfIfAreaId).append("ospfIfAdminStat", ospfIfAdminStat).append("ospfIfRtrPriority", ospfIfRtrPriority).append("ospfIfTransitDelay", ospfIfTransitDelay).append("ospfIfRetransInterval", ospfIfRetransInterval).append("ospfIfHelloInterval", ospfIfHelloInterval).append("ospfIfRtrDeadInterval", ospfIfRtrDeadInterval).append("ospfIfMetricValue", ospfIfMetricValue).append("ospfIfStatus", ospfIfStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ospfIfSwitchId).append(ospfIfShelfIdx).append(ospfIfSlotIdx).append(ospfIfType).append(ospfIfIdx).append(ospfIfSubIdx).append(ospfIfAreaId).append(ospfIfAdminStat).append(ospfIfRtrPriority).append(ospfIfTransitDelay).append(ospfIfRetransInterval).append(ospfIfHelloInterval).append(ospfIfRtrDeadInterval).append(ospfIfMetricValue).append(ospfIfStatus).append(_index).toHashCode();
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
        OspfIfEntry rhs = ((OspfIfEntry) obj);
        return new EqualsBuilder().append(ospfIfSwitchId, rhs.ospfIfSwitchId).append(ospfIfShelfIdx, rhs.ospfIfShelfIdx).append(ospfIfSlotIdx, rhs.ospfIfSlotIdx).append(ospfIfType, rhs.ospfIfType).append(ospfIfIdx, rhs.ospfIfIdx).append(ospfIfSubIdx, rhs.ospfIfSubIdx).append(ospfIfAreaId, rhs.ospfIfAreaId).append(ospfIfAdminStat, rhs.ospfIfAdminStat).append(ospfIfRtrPriority, rhs.ospfIfRtrPriority).append(ospfIfTransitDelay, rhs.ospfIfTransitDelay).append(ospfIfRetransInterval, rhs.ospfIfRetransInterval).append(ospfIfHelloInterval, rhs.ospfIfHelloInterval).append(ospfIfRtrDeadInterval, rhs.ospfIfRtrDeadInterval).append(ospfIfMetricValue, rhs.ospfIfMetricValue).append(ospfIfStatus, rhs.ospfIfStatus).append(_index, rhs._index).isEquals();
    }

    public OspfIfEntry clone() {
        OspfIfEntry _copy = new OspfIfEntry();
        _copy.ospfIfSwitchId = ospfIfSwitchId;
        _copy.ospfIfShelfIdx = ospfIfShelfIdx;
        _copy.ospfIfSlotIdx = ospfIfSlotIdx;
        _copy.ospfIfType = ospfIfType;
        _copy.ospfIfIdx = ospfIfIdx;
        _copy.ospfIfSubIdx = ospfIfSubIdx;
        _copy.ospfIfAreaId = ospfIfAreaId;
        _copy.ospfIfAdminStat = ospfIfAdminStat;
        _copy.ospfIfRtrPriority = ospfIfRtrPriority;
        _copy.ospfIfTransitDelay = ospfIfTransitDelay;
        _copy.ospfIfRetransInterval = ospfIfRetransInterval;
        _copy.ospfIfHelloInterval = ospfIfHelloInterval;
        _copy.ospfIfRtrDeadInterval = ospfIfRtrDeadInterval;
        _copy.ospfIfMetricValue = ospfIfMetricValue;
        _copy.ospfIfStatus = ospfIfStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.13.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ospfIfSwitchId", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ospfIfShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ospfIfSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ospfIfType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ospfIfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ospfIfSubIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ospfIfAreaId", DeviceEntityDescription.FieldType.STRING, 1024));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ospfIfAdminStat", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ospfIfRtrPriority", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ospfIfTransitDelay", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ospfIfRetransInterval", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ospfIfHelloInterval", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ospfIfRtrDeadInterval", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ospfIfMetricValue", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ospfIfStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
