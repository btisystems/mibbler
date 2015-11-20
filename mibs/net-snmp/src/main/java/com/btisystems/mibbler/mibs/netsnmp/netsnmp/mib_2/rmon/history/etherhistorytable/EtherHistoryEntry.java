
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.history.etherhistorytable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.history.etherhistorytable.IEtherHistoryEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.history.EtherHistoryTable;
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

public class EtherHistoryEntry
    extends DeviceEntity
    implements Serializable, IEtherHistoryEntry, IIndexed, IVariableBindingSetter
{

    private int etherHistoryIndex;
    private int etherHistorySampleIndex;
    private int etherHistoryIntervalStart;
    private int etherHistoryDropEvents;
    private int etherHistoryOctets;
    private int etherHistoryPkts;
    private int etherHistoryBroadcastPkts;
    private int etherHistoryMulticastPkts;
    private int etherHistoryCRCAlignErrors;
    private int etherHistoryUndersizePkts;
    private int etherHistoryOversizePkts;
    private int etherHistoryFragments;
    private int etherHistoryJabbers;
    private int etherHistoryCollisions;
    private int etherHistoryUtilization;
    private String _index;
    private EtherHistoryTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public EtherHistoryEntry() {
    }

    public int getEtherHistoryIndex() {
        return this.etherHistoryIndex;
    }

    public void setEtherHistoryIndex(int etherHistoryIndex) {
        int oldValue = getEtherHistoryIndex();
        this.etherHistoryIndex = etherHistoryIndex;
        notifyChange(1, oldValue, etherHistoryIndex);
    }

    public int getEtherHistorySampleIndex() {
        return this.etherHistorySampleIndex;
    }

    public void setEtherHistorySampleIndex(int etherHistorySampleIndex) {
        int oldValue = getEtherHistorySampleIndex();
        this.etherHistorySampleIndex = etherHistorySampleIndex;
        notifyChange(2, oldValue, etherHistorySampleIndex);
    }

    public int getEtherHistoryIntervalStart() {
        return this.etherHistoryIntervalStart;
    }

    public void setEtherHistoryIntervalStart(int etherHistoryIntervalStart) {
        int oldValue = getEtherHistoryIntervalStart();
        this.etherHistoryIntervalStart = etherHistoryIntervalStart;
        notifyChange(3, oldValue, etherHistoryIntervalStart);
    }

    public int getEtherHistoryDropEvents() {
        return this.etherHistoryDropEvents;
    }

    public void setEtherHistoryDropEvents(int etherHistoryDropEvents) {
        int oldValue = getEtherHistoryDropEvents();
        this.etherHistoryDropEvents = etherHistoryDropEvents;
        notifyChange(4, oldValue, etherHistoryDropEvents);
    }

    public int getEtherHistoryOctets() {
        return this.etherHistoryOctets;
    }

    public void setEtherHistoryOctets(int etherHistoryOctets) {
        int oldValue = getEtherHistoryOctets();
        this.etherHistoryOctets = etherHistoryOctets;
        notifyChange(5, oldValue, etherHistoryOctets);
    }

    public int getEtherHistoryPkts() {
        return this.etherHistoryPkts;
    }

    public void setEtherHistoryPkts(int etherHistoryPkts) {
        int oldValue = getEtherHistoryPkts();
        this.etherHistoryPkts = etherHistoryPkts;
        notifyChange(6, oldValue, etherHistoryPkts);
    }

    public int getEtherHistoryBroadcastPkts() {
        return this.etherHistoryBroadcastPkts;
    }

    public void setEtherHistoryBroadcastPkts(int etherHistoryBroadcastPkts) {
        int oldValue = getEtherHistoryBroadcastPkts();
        this.etherHistoryBroadcastPkts = etherHistoryBroadcastPkts;
        notifyChange(7, oldValue, etherHistoryBroadcastPkts);
    }

    public int getEtherHistoryMulticastPkts() {
        return this.etherHistoryMulticastPkts;
    }

    public void setEtherHistoryMulticastPkts(int etherHistoryMulticastPkts) {
        int oldValue = getEtherHistoryMulticastPkts();
        this.etherHistoryMulticastPkts = etherHistoryMulticastPkts;
        notifyChange(8, oldValue, etherHistoryMulticastPkts);
    }

    public int getEtherHistoryCRCAlignErrors() {
        return this.etherHistoryCRCAlignErrors;
    }

    public void setEtherHistoryCRCAlignErrors(int etherHistoryCRCAlignErrors) {
        int oldValue = getEtherHistoryCRCAlignErrors();
        this.etherHistoryCRCAlignErrors = etherHistoryCRCAlignErrors;
        notifyChange(9, oldValue, etherHistoryCRCAlignErrors);
    }

    public int getEtherHistoryUndersizePkts() {
        return this.etherHistoryUndersizePkts;
    }

    public void setEtherHistoryUndersizePkts(int etherHistoryUndersizePkts) {
        int oldValue = getEtherHistoryUndersizePkts();
        this.etherHistoryUndersizePkts = etherHistoryUndersizePkts;
        notifyChange(10, oldValue, etherHistoryUndersizePkts);
    }

    public int getEtherHistoryOversizePkts() {
        return this.etherHistoryOversizePkts;
    }

    public void setEtherHistoryOversizePkts(int etherHistoryOversizePkts) {
        int oldValue = getEtherHistoryOversizePkts();
        this.etherHistoryOversizePkts = etherHistoryOversizePkts;
        notifyChange(11, oldValue, etherHistoryOversizePkts);
    }

    public int getEtherHistoryFragments() {
        return this.etherHistoryFragments;
    }

    public void setEtherHistoryFragments(int etherHistoryFragments) {
        int oldValue = getEtherHistoryFragments();
        this.etherHistoryFragments = etherHistoryFragments;
        notifyChange(12, oldValue, etherHistoryFragments);
    }

    public int getEtherHistoryJabbers() {
        return this.etherHistoryJabbers;
    }

    public void setEtherHistoryJabbers(int etherHistoryJabbers) {
        int oldValue = getEtherHistoryJabbers();
        this.etherHistoryJabbers = etherHistoryJabbers;
        notifyChange(13, oldValue, etherHistoryJabbers);
    }

    public int getEtherHistoryCollisions() {
        return this.etherHistoryCollisions;
    }

    public void setEtherHistoryCollisions(int etherHistoryCollisions) {
        int oldValue = getEtherHistoryCollisions();
        this.etherHistoryCollisions = etherHistoryCollisions;
        notifyChange(14, oldValue, etherHistoryCollisions);
    }

    public int getEtherHistoryUtilization() {
        return this.etherHistoryUtilization;
    }

    public void setEtherHistoryUtilization(int etherHistoryUtilization) {
        int oldValue = getEtherHistoryUtilization();
        this.etherHistoryUtilization = etherHistoryUtilization;
        notifyChange(15, oldValue, etherHistoryUtilization);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setEtherHistoryIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setEtherHistorySampleIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setEtherHistoryIntervalStart(binding.getVariable().toInt());
                break;
            case  4 :
                setEtherHistoryDropEvents(binding.getVariable().toInt());
                break;
            case  5 :
                setEtherHistoryOctets(binding.getVariable().toInt());
                break;
            case  6 :
                setEtherHistoryPkts(binding.getVariable().toInt());
                break;
            case  7 :
                setEtherHistoryBroadcastPkts(binding.getVariable().toInt());
                break;
            case  8 :
                setEtherHistoryMulticastPkts(binding.getVariable().toInt());
                break;
            case  9 :
                setEtherHistoryCRCAlignErrors(binding.getVariable().toInt());
                break;
            case  10 :
                setEtherHistoryUndersizePkts(binding.getVariable().toInt());
                break;
            case  11 :
                setEtherHistoryOversizePkts(binding.getVariable().toInt());
                break;
            case  12 :
                setEtherHistoryFragments(binding.getVariable().toInt());
                break;
            case  13 :
                setEtherHistoryJabbers(binding.getVariable().toInt());
                break;
            case  14 :
                setEtherHistoryCollisions(binding.getVariable().toInt());
                break;
            case  15 :
                setEtherHistoryUtilization(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setEtherHistoryIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setEtherHistorySampleIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(EtherHistoryTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("etherHistoryIndex", etherHistoryIndex).append("etherHistorySampleIndex", etherHistorySampleIndex).append("etherHistoryIntervalStart", etherHistoryIntervalStart).append("etherHistoryDropEvents", etherHistoryDropEvents).append("etherHistoryOctets", etherHistoryOctets).append("etherHistoryPkts", etherHistoryPkts).append("etherHistoryBroadcastPkts", etherHistoryBroadcastPkts).append("etherHistoryMulticastPkts", etherHistoryMulticastPkts).append("etherHistoryCRCAlignErrors", etherHistoryCRCAlignErrors).append("etherHistoryUndersizePkts", etherHistoryUndersizePkts).append("etherHistoryOversizePkts", etherHistoryOversizePkts).append("etherHistoryFragments", etherHistoryFragments).append("etherHistoryJabbers", etherHistoryJabbers).append("etherHistoryCollisions", etherHistoryCollisions).append("etherHistoryUtilization", etherHistoryUtilization).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(etherHistoryIndex).append(etherHistorySampleIndex).append(etherHistoryIntervalStart).append(etherHistoryDropEvents).append(etherHistoryOctets).append(etherHistoryPkts).append(etherHistoryBroadcastPkts).append(etherHistoryMulticastPkts).append(etherHistoryCRCAlignErrors).append(etherHistoryUndersizePkts).append(etherHistoryOversizePkts).append(etherHistoryFragments).append(etherHistoryJabbers).append(etherHistoryCollisions).append(etherHistoryUtilization).append(_index).toHashCode();
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
        EtherHistoryEntry rhs = ((EtherHistoryEntry) obj);
        return new EqualsBuilder().append(etherHistoryIndex, rhs.etherHistoryIndex).append(etherHistorySampleIndex, rhs.etherHistorySampleIndex).append(etherHistoryIntervalStart, rhs.etherHistoryIntervalStart).append(etherHistoryDropEvents, rhs.etherHistoryDropEvents).append(etherHistoryOctets, rhs.etherHistoryOctets).append(etherHistoryPkts, rhs.etherHistoryPkts).append(etherHistoryBroadcastPkts, rhs.etherHistoryBroadcastPkts).append(etherHistoryMulticastPkts, rhs.etherHistoryMulticastPkts).append(etherHistoryCRCAlignErrors, rhs.etherHistoryCRCAlignErrors).append(etherHistoryUndersizePkts, rhs.etherHistoryUndersizePkts).append(etherHistoryOversizePkts, rhs.etherHistoryOversizePkts).append(etherHistoryFragments, rhs.etherHistoryFragments).append(etherHistoryJabbers, rhs.etherHistoryJabbers).append(etherHistoryCollisions, rhs.etherHistoryCollisions).append(etherHistoryUtilization, rhs.etherHistoryUtilization).append(_index, rhs._index).isEquals();
    }

    public EtherHistoryEntry clone() {
        EtherHistoryEntry _copy = new EtherHistoryEntry();
        _copy.etherHistoryIndex = etherHistoryIndex;
        _copy.etherHistorySampleIndex = etherHistorySampleIndex;
        _copy.etherHistoryIntervalStart = etherHistoryIntervalStart;
        _copy.etherHistoryDropEvents = etherHistoryDropEvents;
        _copy.etherHistoryOctets = etherHistoryOctets;
        _copy.etherHistoryPkts = etherHistoryPkts;
        _copy.etherHistoryBroadcastPkts = etherHistoryBroadcastPkts;
        _copy.etherHistoryMulticastPkts = etherHistoryMulticastPkts;
        _copy.etherHistoryCRCAlignErrors = etherHistoryCRCAlignErrors;
        _copy.etherHistoryUndersizePkts = etherHistoryUndersizePkts;
        _copy.etherHistoryOversizePkts = etherHistoryOversizePkts;
        _copy.etherHistoryFragments = etherHistoryFragments;
        _copy.etherHistoryJabbers = etherHistoryJabbers;
        _copy.etherHistoryCollisions = etherHistoryCollisions;
        _copy.etherHistoryUtilization = etherHistoryUtilization;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.2.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "etherHistoryIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "etherHistorySampleIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "etherHistoryIntervalStart", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "etherHistoryDropEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "etherHistoryOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "etherHistoryPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "etherHistoryBroadcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "etherHistoryMulticastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "etherHistoryCRCAlignErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "etherHistoryUndersizePkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "etherHistoryOversizePkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "etherHistoryFragments", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "etherHistoryJabbers", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "etherHistoryCollisions", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "etherHistoryUtilization", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
