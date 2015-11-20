
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.statistics.etherstatstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.statistics.EtherStatsTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.etherstatstable.IEtherStatsEntry;
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

public class EtherStatsEntry
    extends DeviceEntity
    implements Serializable, IEtherStatsEntry, IIndexed, IVariableBindingSetter
{

    private int etherStatsIndex;
    private String etherStatsDataSource;
    private int etherStatsDropEvents;
    private int etherStatsOctets;
    private int etherStatsPkts;
    private int etherStatsBroadcastPkts;
    private int etherStatsMulticastPkts;
    private int etherStatsCRCAlignErrors;
    private int etherStatsUndersizePkts;
    private int etherStatsOversizePkts;
    private int etherStatsFragments;
    private int etherStatsJabbers;
    private int etherStatsCollisions;
    private int etherStatsPkts64Octets;
    private int etherStatsPkts65to127Octets;
    private int etherStatsPkts128to255Octets;
    private int etherStatsPkts256to511Octets;
    private int etherStatsPkts512to1023Octets;
    private int etherStatsPkts1024to1518Octets;
    private String etherStatsOwner;
    private int etherStatsStatus;
    private String _index;
    private EtherStatsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public EtherStatsEntry() {
    }

    public int getEtherStatsIndex() {
        return this.etherStatsIndex;
    }

    public void setEtherStatsIndex(int etherStatsIndex) {
        int oldValue = getEtherStatsIndex();
        this.etherStatsIndex = etherStatsIndex;
        notifyChange(1, oldValue, etherStatsIndex);
    }

    public String getEtherStatsDataSource() {
        return this.etherStatsDataSource;
    }

    public void setEtherStatsDataSource(String etherStatsDataSource) {
        String oldValue = getEtherStatsDataSource();
        this.etherStatsDataSource = etherStatsDataSource;
        notifyChange(2, oldValue, etherStatsDataSource);
    }

    public int getEtherStatsDropEvents() {
        return this.etherStatsDropEvents;
    }

    public void setEtherStatsDropEvents(int etherStatsDropEvents) {
        int oldValue = getEtherStatsDropEvents();
        this.etherStatsDropEvents = etherStatsDropEvents;
        notifyChange(3, oldValue, etherStatsDropEvents);
    }

    public int getEtherStatsOctets() {
        return this.etherStatsOctets;
    }

    public void setEtherStatsOctets(int etherStatsOctets) {
        int oldValue = getEtherStatsOctets();
        this.etherStatsOctets = etherStatsOctets;
        notifyChange(4, oldValue, etherStatsOctets);
    }

    public int getEtherStatsPkts() {
        return this.etherStatsPkts;
    }

    public void setEtherStatsPkts(int etherStatsPkts) {
        int oldValue = getEtherStatsPkts();
        this.etherStatsPkts = etherStatsPkts;
        notifyChange(5, oldValue, etherStatsPkts);
    }

    public int getEtherStatsBroadcastPkts() {
        return this.etherStatsBroadcastPkts;
    }

    public void setEtherStatsBroadcastPkts(int etherStatsBroadcastPkts) {
        int oldValue = getEtherStatsBroadcastPkts();
        this.etherStatsBroadcastPkts = etherStatsBroadcastPkts;
        notifyChange(6, oldValue, etherStatsBroadcastPkts);
    }

    public int getEtherStatsMulticastPkts() {
        return this.etherStatsMulticastPkts;
    }

    public void setEtherStatsMulticastPkts(int etherStatsMulticastPkts) {
        int oldValue = getEtherStatsMulticastPkts();
        this.etherStatsMulticastPkts = etherStatsMulticastPkts;
        notifyChange(7, oldValue, etherStatsMulticastPkts);
    }

    public int getEtherStatsCRCAlignErrors() {
        return this.etherStatsCRCAlignErrors;
    }

    public void setEtherStatsCRCAlignErrors(int etherStatsCRCAlignErrors) {
        int oldValue = getEtherStatsCRCAlignErrors();
        this.etherStatsCRCAlignErrors = etherStatsCRCAlignErrors;
        notifyChange(8, oldValue, etherStatsCRCAlignErrors);
    }

    public int getEtherStatsUndersizePkts() {
        return this.etherStatsUndersizePkts;
    }

    public void setEtherStatsUndersizePkts(int etherStatsUndersizePkts) {
        int oldValue = getEtherStatsUndersizePkts();
        this.etherStatsUndersizePkts = etherStatsUndersizePkts;
        notifyChange(9, oldValue, etherStatsUndersizePkts);
    }

    public int getEtherStatsOversizePkts() {
        return this.etherStatsOversizePkts;
    }

    public void setEtherStatsOversizePkts(int etherStatsOversizePkts) {
        int oldValue = getEtherStatsOversizePkts();
        this.etherStatsOversizePkts = etherStatsOversizePkts;
        notifyChange(10, oldValue, etherStatsOversizePkts);
    }

    public int getEtherStatsFragments() {
        return this.etherStatsFragments;
    }

    public void setEtherStatsFragments(int etherStatsFragments) {
        int oldValue = getEtherStatsFragments();
        this.etherStatsFragments = etherStatsFragments;
        notifyChange(11, oldValue, etherStatsFragments);
    }

    public int getEtherStatsJabbers() {
        return this.etherStatsJabbers;
    }

    public void setEtherStatsJabbers(int etherStatsJabbers) {
        int oldValue = getEtherStatsJabbers();
        this.etherStatsJabbers = etherStatsJabbers;
        notifyChange(12, oldValue, etherStatsJabbers);
    }

    public int getEtherStatsCollisions() {
        return this.etherStatsCollisions;
    }

    public void setEtherStatsCollisions(int etherStatsCollisions) {
        int oldValue = getEtherStatsCollisions();
        this.etherStatsCollisions = etherStatsCollisions;
        notifyChange(13, oldValue, etherStatsCollisions);
    }

    public int getEtherStatsPkts64Octets() {
        return this.etherStatsPkts64Octets;
    }

    public void setEtherStatsPkts64Octets(int etherStatsPkts64Octets) {
        int oldValue = getEtherStatsPkts64Octets();
        this.etherStatsPkts64Octets = etherStatsPkts64Octets;
        notifyChange(14, oldValue, etherStatsPkts64Octets);
    }

    public int getEtherStatsPkts65to127Octets() {
        return this.etherStatsPkts65to127Octets;
    }

    public void setEtherStatsPkts65to127Octets(int etherStatsPkts65to127Octets) {
        int oldValue = getEtherStatsPkts65to127Octets();
        this.etherStatsPkts65to127Octets = etherStatsPkts65to127Octets;
        notifyChange(15, oldValue, etherStatsPkts65to127Octets);
    }

    public int getEtherStatsPkts128to255Octets() {
        return this.etherStatsPkts128to255Octets;
    }

    public void setEtherStatsPkts128to255Octets(int etherStatsPkts128to255Octets) {
        int oldValue = getEtherStatsPkts128to255Octets();
        this.etherStatsPkts128to255Octets = etherStatsPkts128to255Octets;
        notifyChange(16, oldValue, etherStatsPkts128to255Octets);
    }

    public int getEtherStatsPkts256to511Octets() {
        return this.etherStatsPkts256to511Octets;
    }

    public void setEtherStatsPkts256to511Octets(int etherStatsPkts256to511Octets) {
        int oldValue = getEtherStatsPkts256to511Octets();
        this.etherStatsPkts256to511Octets = etherStatsPkts256to511Octets;
        notifyChange(17, oldValue, etherStatsPkts256to511Octets);
    }

    public int getEtherStatsPkts512to1023Octets() {
        return this.etherStatsPkts512to1023Octets;
    }

    public void setEtherStatsPkts512to1023Octets(int etherStatsPkts512to1023Octets) {
        int oldValue = getEtherStatsPkts512to1023Octets();
        this.etherStatsPkts512to1023Octets = etherStatsPkts512to1023Octets;
        notifyChange(18, oldValue, etherStatsPkts512to1023Octets);
    }

    public int getEtherStatsPkts1024to1518Octets() {
        return this.etherStatsPkts1024to1518Octets;
    }

    public void setEtherStatsPkts1024to1518Octets(int etherStatsPkts1024to1518Octets) {
        int oldValue = getEtherStatsPkts1024to1518Octets();
        this.etherStatsPkts1024to1518Octets = etherStatsPkts1024to1518Octets;
        notifyChange(19, oldValue, etherStatsPkts1024to1518Octets);
    }

    public String getEtherStatsOwner() {
        return this.etherStatsOwner;
    }

    public void setEtherStatsOwner(String etherStatsOwner) {
        String oldValue = getEtherStatsOwner();
        this.etherStatsOwner = etherStatsOwner;
        notifyChange(20, oldValue, etherStatsOwner);
    }

    public int getEtherStatsStatus() {
        return this.etherStatsStatus;
    }

    public void setEtherStatsStatus(int etherStatsStatus) {
        int oldValue = getEtherStatsStatus();
        this.etherStatsStatus = etherStatsStatus;
        notifyChange(21, oldValue, etherStatsStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setEtherStatsIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setEtherStatsDataSource(binding.getVariable().toString());
                break;
            case  3 :
                setEtherStatsDropEvents(binding.getVariable().toInt());
                break;
            case  4 :
                setEtherStatsOctets(binding.getVariable().toInt());
                break;
            case  5 :
                setEtherStatsPkts(binding.getVariable().toInt());
                break;
            case  6 :
                setEtherStatsBroadcastPkts(binding.getVariable().toInt());
                break;
            case  7 :
                setEtherStatsMulticastPkts(binding.getVariable().toInt());
                break;
            case  8 :
                setEtherStatsCRCAlignErrors(binding.getVariable().toInt());
                break;
            case  9 :
                setEtherStatsUndersizePkts(binding.getVariable().toInt());
                break;
            case  10 :
                setEtherStatsOversizePkts(binding.getVariable().toInt());
                break;
            case  11 :
                setEtherStatsFragments(binding.getVariable().toInt());
                break;
            case  12 :
                setEtherStatsJabbers(binding.getVariable().toInt());
                break;
            case  13 :
                setEtherStatsCollisions(binding.getVariable().toInt());
                break;
            case  14 :
                setEtherStatsPkts64Octets(binding.getVariable().toInt());
                break;
            case  15 :
                setEtherStatsPkts65to127Octets(binding.getVariable().toInt());
                break;
            case  16 :
                setEtherStatsPkts128to255Octets(binding.getVariable().toInt());
                break;
            case  17 :
                setEtherStatsPkts256to511Octets(binding.getVariable().toInt());
                break;
            case  18 :
                setEtherStatsPkts512to1023Octets(binding.getVariable().toInt());
                break;
            case  19 :
                setEtherStatsPkts1024to1518Octets(binding.getVariable().toInt());
                break;
            case  20 :
                setEtherStatsOwner(binding.getVariable().toString());
                break;
            case  21 :
                setEtherStatsStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setEtherStatsIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(EtherStatsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("etherStatsIndex", etherStatsIndex).append("etherStatsDataSource", etherStatsDataSource).append("etherStatsDropEvents", etherStatsDropEvents).append("etherStatsOctets", etherStatsOctets).append("etherStatsPkts", etherStatsPkts).append("etherStatsBroadcastPkts", etherStatsBroadcastPkts).append("etherStatsMulticastPkts", etherStatsMulticastPkts).append("etherStatsCRCAlignErrors", etherStatsCRCAlignErrors).append("etherStatsUndersizePkts", etherStatsUndersizePkts).append("etherStatsOversizePkts", etherStatsOversizePkts).append("etherStatsFragments", etherStatsFragments).append("etherStatsJabbers", etherStatsJabbers).append("etherStatsCollisions", etherStatsCollisions).append("etherStatsPkts64Octets", etherStatsPkts64Octets).append("etherStatsPkts65to127Octets", etherStatsPkts65to127Octets).append("etherStatsPkts128to255Octets", etherStatsPkts128to255Octets).append("etherStatsPkts256to511Octets", etherStatsPkts256to511Octets).append("etherStatsPkts512to1023Octets", etherStatsPkts512to1023Octets).append("etherStatsPkts1024to1518Octets", etherStatsPkts1024to1518Octets).append("etherStatsOwner", etherStatsOwner).append("etherStatsStatus", etherStatsStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(etherStatsIndex).append(etherStatsDataSource).append(etherStatsDropEvents).append(etherStatsOctets).append(etherStatsPkts).append(etherStatsBroadcastPkts).append(etherStatsMulticastPkts).append(etherStatsCRCAlignErrors).append(etherStatsUndersizePkts).append(etherStatsOversizePkts).append(etherStatsFragments).append(etherStatsJabbers).append(etherStatsCollisions).append(etherStatsPkts64Octets).append(etherStatsPkts65to127Octets).append(etherStatsPkts128to255Octets).append(etherStatsPkts256to511Octets).append(etherStatsPkts512to1023Octets).append(etherStatsPkts1024to1518Octets).append(etherStatsOwner).append(etherStatsStatus).append(_index).toHashCode();
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
        EtherStatsEntry rhs = ((EtherStatsEntry) obj);
        return new EqualsBuilder().append(etherStatsIndex, rhs.etherStatsIndex).append(etherStatsDataSource, rhs.etherStatsDataSource).append(etherStatsDropEvents, rhs.etherStatsDropEvents).append(etherStatsOctets, rhs.etherStatsOctets).append(etherStatsPkts, rhs.etherStatsPkts).append(etherStatsBroadcastPkts, rhs.etherStatsBroadcastPkts).append(etherStatsMulticastPkts, rhs.etherStatsMulticastPkts).append(etherStatsCRCAlignErrors, rhs.etherStatsCRCAlignErrors).append(etherStatsUndersizePkts, rhs.etherStatsUndersizePkts).append(etherStatsOversizePkts, rhs.etherStatsOversizePkts).append(etherStatsFragments, rhs.etherStatsFragments).append(etherStatsJabbers, rhs.etherStatsJabbers).append(etherStatsCollisions, rhs.etherStatsCollisions).append(etherStatsPkts64Octets, rhs.etherStatsPkts64Octets).append(etherStatsPkts65to127Octets, rhs.etherStatsPkts65to127Octets).append(etherStatsPkts128to255Octets, rhs.etherStatsPkts128to255Octets).append(etherStatsPkts256to511Octets, rhs.etherStatsPkts256to511Octets).append(etherStatsPkts512to1023Octets, rhs.etherStatsPkts512to1023Octets).append(etherStatsPkts1024to1518Octets, rhs.etherStatsPkts1024to1518Octets).append(etherStatsOwner, rhs.etherStatsOwner).append(etherStatsStatus, rhs.etherStatsStatus).append(_index, rhs._index).isEquals();
    }

    public EtherStatsEntry clone() {
        EtherStatsEntry _copy = new EtherStatsEntry();
        _copy.etherStatsIndex = etherStatsIndex;
        _copy.etherStatsDataSource = etherStatsDataSource;
        _copy.etherStatsDropEvents = etherStatsDropEvents;
        _copy.etherStatsOctets = etherStatsOctets;
        _copy.etherStatsPkts = etherStatsPkts;
        _copy.etherStatsBroadcastPkts = etherStatsBroadcastPkts;
        _copy.etherStatsMulticastPkts = etherStatsMulticastPkts;
        _copy.etherStatsCRCAlignErrors = etherStatsCRCAlignErrors;
        _copy.etherStatsUndersizePkts = etherStatsUndersizePkts;
        _copy.etherStatsOversizePkts = etherStatsOversizePkts;
        _copy.etherStatsFragments = etherStatsFragments;
        _copy.etherStatsJabbers = etherStatsJabbers;
        _copy.etherStatsCollisions = etherStatsCollisions;
        _copy.etherStatsPkts64Octets = etherStatsPkts64Octets;
        _copy.etherStatsPkts65to127Octets = etherStatsPkts65to127Octets;
        _copy.etherStatsPkts128to255Octets = etherStatsPkts128to255Octets;
        _copy.etherStatsPkts256to511Octets = etherStatsPkts256to511Octets;
        _copy.etherStatsPkts512to1023Octets = etherStatsPkts512to1023Octets;
        _copy.etherStatsPkts1024to1518Octets = etherStatsPkts1024to1518Octets;
        _copy.etherStatsOwner = etherStatsOwner;
        _copy.etherStatsStatus = etherStatsStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.1.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "etherStatsIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "etherStatsDataSource", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "etherStatsDropEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "etherStatsOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "etherStatsPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "etherStatsBroadcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "etherStatsMulticastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "etherStatsCRCAlignErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "etherStatsUndersizePkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "etherStatsOversizePkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "etherStatsFragments", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "etherStatsJabbers", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "etherStatsCollisions", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "etherStatsPkts64Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "etherStatsPkts65to127Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "etherStatsPkts128to255Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "etherStatsPkts256to511Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "etherStatsPkts512to1023Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "etherStatsPkts1024to1518Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "etherStatsOwner", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "etherStatsStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
