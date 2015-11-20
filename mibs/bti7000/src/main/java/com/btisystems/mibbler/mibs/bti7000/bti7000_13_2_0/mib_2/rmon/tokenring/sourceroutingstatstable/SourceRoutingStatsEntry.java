
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.sourceroutingstatstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.SourceRoutingStatsTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.sourceroutingstatstable.ISourceRoutingStatsEntry;
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

public class SourceRoutingStatsEntry
    extends DeviceEntity
    implements Serializable, ISourceRoutingStatsEntry, IIndexed, IVariableBindingSetter
{

    private int sourceRoutingStatsIfIndex;
    private int sourceRoutingStatsRingNumber;
    private int sourceRoutingStatsInFrames;
    private int sourceRoutingStatsOutFrames;
    private int sourceRoutingStatsThroughFrames;
    private int sourceRoutingStatsAllRoutesBroadcastFrames;
    private int sourceRoutingStatsSingleRouteBroadcastFrames;
    private int sourceRoutingStatsInOctets;
    private int sourceRoutingStatsOutOctets;
    private int sourceRoutingStatsThroughOctets;
    private int sourceRoutingStatsAllRoutesBroadcastOctets;
    private int sourceRoutingStatsSingleRoutesBroadcastOctets;
    private int sourceRoutingStatsLocalLLCFrames;
    private int sourceRoutingStats1HopFrames;
    private int sourceRoutingStats2HopsFrames;
    private int sourceRoutingStats3HopsFrames;
    private int sourceRoutingStats4HopsFrames;
    private int sourceRoutingStats5HopsFrames;
    private int sourceRoutingStats6HopsFrames;
    private int sourceRoutingStats7HopsFrames;
    private int sourceRoutingStats8HopsFrames;
    private int sourceRoutingStatsMoreThan8HopsFrames;
    private String sourceRoutingStatsOwner;
    private int sourceRoutingStatsStatus;
    private String _index;
    private SourceRoutingStatsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SourceRoutingStatsEntry() {
    }

    public int getSourceRoutingStatsIfIndex() {
        return this.sourceRoutingStatsIfIndex;
    }

    public void setSourceRoutingStatsIfIndex(int sourceRoutingStatsIfIndex) {
        int oldValue = getSourceRoutingStatsIfIndex();
        this.sourceRoutingStatsIfIndex = sourceRoutingStatsIfIndex;
        notifyChange(1, oldValue, sourceRoutingStatsIfIndex);
    }

    public int getSourceRoutingStatsRingNumber() {
        return this.sourceRoutingStatsRingNumber;
    }

    public void setSourceRoutingStatsRingNumber(int sourceRoutingStatsRingNumber) {
        int oldValue = getSourceRoutingStatsRingNumber();
        this.sourceRoutingStatsRingNumber = sourceRoutingStatsRingNumber;
        notifyChange(2, oldValue, sourceRoutingStatsRingNumber);
    }

    public int getSourceRoutingStatsInFrames() {
        return this.sourceRoutingStatsInFrames;
    }

    public void setSourceRoutingStatsInFrames(int sourceRoutingStatsInFrames) {
        int oldValue = getSourceRoutingStatsInFrames();
        this.sourceRoutingStatsInFrames = sourceRoutingStatsInFrames;
        notifyChange(3, oldValue, sourceRoutingStatsInFrames);
    }

    public int getSourceRoutingStatsOutFrames() {
        return this.sourceRoutingStatsOutFrames;
    }

    public void setSourceRoutingStatsOutFrames(int sourceRoutingStatsOutFrames) {
        int oldValue = getSourceRoutingStatsOutFrames();
        this.sourceRoutingStatsOutFrames = sourceRoutingStatsOutFrames;
        notifyChange(4, oldValue, sourceRoutingStatsOutFrames);
    }

    public int getSourceRoutingStatsThroughFrames() {
        return this.sourceRoutingStatsThroughFrames;
    }

    public void setSourceRoutingStatsThroughFrames(int sourceRoutingStatsThroughFrames) {
        int oldValue = getSourceRoutingStatsThroughFrames();
        this.sourceRoutingStatsThroughFrames = sourceRoutingStatsThroughFrames;
        notifyChange(5, oldValue, sourceRoutingStatsThroughFrames);
    }

    public int getSourceRoutingStatsAllRoutesBroadcastFrames() {
        return this.sourceRoutingStatsAllRoutesBroadcastFrames;
    }

    public void setSourceRoutingStatsAllRoutesBroadcastFrames(int sourceRoutingStatsAllRoutesBroadcastFrames) {
        int oldValue = getSourceRoutingStatsAllRoutesBroadcastFrames();
        this.sourceRoutingStatsAllRoutesBroadcastFrames = sourceRoutingStatsAllRoutesBroadcastFrames;
        notifyChange(6, oldValue, sourceRoutingStatsAllRoutesBroadcastFrames);
    }

    public int getSourceRoutingStatsSingleRouteBroadcastFrames() {
        return this.sourceRoutingStatsSingleRouteBroadcastFrames;
    }

    public void setSourceRoutingStatsSingleRouteBroadcastFrames(int sourceRoutingStatsSingleRouteBroadcastFrames) {
        int oldValue = getSourceRoutingStatsSingleRouteBroadcastFrames();
        this.sourceRoutingStatsSingleRouteBroadcastFrames = sourceRoutingStatsSingleRouteBroadcastFrames;
        notifyChange(7, oldValue, sourceRoutingStatsSingleRouteBroadcastFrames);
    }

    public int getSourceRoutingStatsInOctets() {
        return this.sourceRoutingStatsInOctets;
    }

    public void setSourceRoutingStatsInOctets(int sourceRoutingStatsInOctets) {
        int oldValue = getSourceRoutingStatsInOctets();
        this.sourceRoutingStatsInOctets = sourceRoutingStatsInOctets;
        notifyChange(8, oldValue, sourceRoutingStatsInOctets);
    }

    public int getSourceRoutingStatsOutOctets() {
        return this.sourceRoutingStatsOutOctets;
    }

    public void setSourceRoutingStatsOutOctets(int sourceRoutingStatsOutOctets) {
        int oldValue = getSourceRoutingStatsOutOctets();
        this.sourceRoutingStatsOutOctets = sourceRoutingStatsOutOctets;
        notifyChange(9, oldValue, sourceRoutingStatsOutOctets);
    }

    public int getSourceRoutingStatsThroughOctets() {
        return this.sourceRoutingStatsThroughOctets;
    }

    public void setSourceRoutingStatsThroughOctets(int sourceRoutingStatsThroughOctets) {
        int oldValue = getSourceRoutingStatsThroughOctets();
        this.sourceRoutingStatsThroughOctets = sourceRoutingStatsThroughOctets;
        notifyChange(10, oldValue, sourceRoutingStatsThroughOctets);
    }

    public int getSourceRoutingStatsAllRoutesBroadcastOctets() {
        return this.sourceRoutingStatsAllRoutesBroadcastOctets;
    }

    public void setSourceRoutingStatsAllRoutesBroadcastOctets(int sourceRoutingStatsAllRoutesBroadcastOctets) {
        int oldValue = getSourceRoutingStatsAllRoutesBroadcastOctets();
        this.sourceRoutingStatsAllRoutesBroadcastOctets = sourceRoutingStatsAllRoutesBroadcastOctets;
        notifyChange(11, oldValue, sourceRoutingStatsAllRoutesBroadcastOctets);
    }

    public int getSourceRoutingStatsSingleRoutesBroadcastOctets() {
        return this.sourceRoutingStatsSingleRoutesBroadcastOctets;
    }

    public void setSourceRoutingStatsSingleRoutesBroadcastOctets(int sourceRoutingStatsSingleRoutesBroadcastOctets) {
        int oldValue = getSourceRoutingStatsSingleRoutesBroadcastOctets();
        this.sourceRoutingStatsSingleRoutesBroadcastOctets = sourceRoutingStatsSingleRoutesBroadcastOctets;
        notifyChange(12, oldValue, sourceRoutingStatsSingleRoutesBroadcastOctets);
    }

    public int getSourceRoutingStatsLocalLLCFrames() {
        return this.sourceRoutingStatsLocalLLCFrames;
    }

    public void setSourceRoutingStatsLocalLLCFrames(int sourceRoutingStatsLocalLLCFrames) {
        int oldValue = getSourceRoutingStatsLocalLLCFrames();
        this.sourceRoutingStatsLocalLLCFrames = sourceRoutingStatsLocalLLCFrames;
        notifyChange(13, oldValue, sourceRoutingStatsLocalLLCFrames);
    }

    public int getSourceRoutingStats1HopFrames() {
        return this.sourceRoutingStats1HopFrames;
    }

    public void setSourceRoutingStats1HopFrames(int sourceRoutingStats1HopFrames) {
        int oldValue = getSourceRoutingStats1HopFrames();
        this.sourceRoutingStats1HopFrames = sourceRoutingStats1HopFrames;
        notifyChange(14, oldValue, sourceRoutingStats1HopFrames);
    }

    public int getSourceRoutingStats2HopsFrames() {
        return this.sourceRoutingStats2HopsFrames;
    }

    public void setSourceRoutingStats2HopsFrames(int sourceRoutingStats2HopsFrames) {
        int oldValue = getSourceRoutingStats2HopsFrames();
        this.sourceRoutingStats2HopsFrames = sourceRoutingStats2HopsFrames;
        notifyChange(15, oldValue, sourceRoutingStats2HopsFrames);
    }

    public int getSourceRoutingStats3HopsFrames() {
        return this.sourceRoutingStats3HopsFrames;
    }

    public void setSourceRoutingStats3HopsFrames(int sourceRoutingStats3HopsFrames) {
        int oldValue = getSourceRoutingStats3HopsFrames();
        this.sourceRoutingStats3HopsFrames = sourceRoutingStats3HopsFrames;
        notifyChange(16, oldValue, sourceRoutingStats3HopsFrames);
    }

    public int getSourceRoutingStats4HopsFrames() {
        return this.sourceRoutingStats4HopsFrames;
    }

    public void setSourceRoutingStats4HopsFrames(int sourceRoutingStats4HopsFrames) {
        int oldValue = getSourceRoutingStats4HopsFrames();
        this.sourceRoutingStats4HopsFrames = sourceRoutingStats4HopsFrames;
        notifyChange(17, oldValue, sourceRoutingStats4HopsFrames);
    }

    public int getSourceRoutingStats5HopsFrames() {
        return this.sourceRoutingStats5HopsFrames;
    }

    public void setSourceRoutingStats5HopsFrames(int sourceRoutingStats5HopsFrames) {
        int oldValue = getSourceRoutingStats5HopsFrames();
        this.sourceRoutingStats5HopsFrames = sourceRoutingStats5HopsFrames;
        notifyChange(18, oldValue, sourceRoutingStats5HopsFrames);
    }

    public int getSourceRoutingStats6HopsFrames() {
        return this.sourceRoutingStats6HopsFrames;
    }

    public void setSourceRoutingStats6HopsFrames(int sourceRoutingStats6HopsFrames) {
        int oldValue = getSourceRoutingStats6HopsFrames();
        this.sourceRoutingStats6HopsFrames = sourceRoutingStats6HopsFrames;
        notifyChange(19, oldValue, sourceRoutingStats6HopsFrames);
    }

    public int getSourceRoutingStats7HopsFrames() {
        return this.sourceRoutingStats7HopsFrames;
    }

    public void setSourceRoutingStats7HopsFrames(int sourceRoutingStats7HopsFrames) {
        int oldValue = getSourceRoutingStats7HopsFrames();
        this.sourceRoutingStats7HopsFrames = sourceRoutingStats7HopsFrames;
        notifyChange(20, oldValue, sourceRoutingStats7HopsFrames);
    }

    public int getSourceRoutingStats8HopsFrames() {
        return this.sourceRoutingStats8HopsFrames;
    }

    public void setSourceRoutingStats8HopsFrames(int sourceRoutingStats8HopsFrames) {
        int oldValue = getSourceRoutingStats8HopsFrames();
        this.sourceRoutingStats8HopsFrames = sourceRoutingStats8HopsFrames;
        notifyChange(21, oldValue, sourceRoutingStats8HopsFrames);
    }

    public int getSourceRoutingStatsMoreThan8HopsFrames() {
        return this.sourceRoutingStatsMoreThan8HopsFrames;
    }

    public void setSourceRoutingStatsMoreThan8HopsFrames(int sourceRoutingStatsMoreThan8HopsFrames) {
        int oldValue = getSourceRoutingStatsMoreThan8HopsFrames();
        this.sourceRoutingStatsMoreThan8HopsFrames = sourceRoutingStatsMoreThan8HopsFrames;
        notifyChange(22, oldValue, sourceRoutingStatsMoreThan8HopsFrames);
    }

    public String getSourceRoutingStatsOwner() {
        return this.sourceRoutingStatsOwner;
    }

    public void setSourceRoutingStatsOwner(String sourceRoutingStatsOwner) {
        String oldValue = getSourceRoutingStatsOwner();
        this.sourceRoutingStatsOwner = sourceRoutingStatsOwner;
        notifyChange(23, oldValue, sourceRoutingStatsOwner);
    }

    public int getSourceRoutingStatsStatus() {
        return this.sourceRoutingStatsStatus;
    }

    public void setSourceRoutingStatsStatus(int sourceRoutingStatsStatus) {
        int oldValue = getSourceRoutingStatsStatus();
        this.sourceRoutingStatsStatus = sourceRoutingStatsStatus;
        notifyChange(24, oldValue, sourceRoutingStatsStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSourceRoutingStatsIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setSourceRoutingStatsRingNumber(binding.getVariable().toInt());
                break;
            case  3 :
                setSourceRoutingStatsInFrames(binding.getVariable().toInt());
                break;
            case  4 :
                setSourceRoutingStatsOutFrames(binding.getVariable().toInt());
                break;
            case  5 :
                setSourceRoutingStatsThroughFrames(binding.getVariable().toInt());
                break;
            case  6 :
                setSourceRoutingStatsAllRoutesBroadcastFrames(binding.getVariable().toInt());
                break;
            case  7 :
                setSourceRoutingStatsSingleRouteBroadcastFrames(binding.getVariable().toInt());
                break;
            case  8 :
                setSourceRoutingStatsInOctets(binding.getVariable().toInt());
                break;
            case  9 :
                setSourceRoutingStatsOutOctets(binding.getVariable().toInt());
                break;
            case  10 :
                setSourceRoutingStatsThroughOctets(binding.getVariable().toInt());
                break;
            case  11 :
                setSourceRoutingStatsAllRoutesBroadcastOctets(binding.getVariable().toInt());
                break;
            case  12 :
                setSourceRoutingStatsSingleRoutesBroadcastOctets(binding.getVariable().toInt());
                break;
            case  13 :
                setSourceRoutingStatsLocalLLCFrames(binding.getVariable().toInt());
                break;
            case  14 :
                setSourceRoutingStats1HopFrames(binding.getVariable().toInt());
                break;
            case  15 :
                setSourceRoutingStats2HopsFrames(binding.getVariable().toInt());
                break;
            case  16 :
                setSourceRoutingStats3HopsFrames(binding.getVariable().toInt());
                break;
            case  17 :
                setSourceRoutingStats4HopsFrames(binding.getVariable().toInt());
                break;
            case  18 :
                setSourceRoutingStats5HopsFrames(binding.getVariable().toInt());
                break;
            case  19 :
                setSourceRoutingStats6HopsFrames(binding.getVariable().toInt());
                break;
            case  20 :
                setSourceRoutingStats7HopsFrames(binding.getVariable().toInt());
                break;
            case  21 :
                setSourceRoutingStats8HopsFrames(binding.getVariable().toInt());
                break;
            case  22 :
                setSourceRoutingStatsMoreThan8HopsFrames(binding.getVariable().toInt());
                break;
            case  23 :
                setSourceRoutingStatsOwner(binding.getVariable().toString());
                break;
            case  24 :
                setSourceRoutingStatsStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setSourceRoutingStatsIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SourceRoutingStatsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sourceRoutingStatsIfIndex", sourceRoutingStatsIfIndex).append("sourceRoutingStatsRingNumber", sourceRoutingStatsRingNumber).append("sourceRoutingStatsInFrames", sourceRoutingStatsInFrames).append("sourceRoutingStatsOutFrames", sourceRoutingStatsOutFrames).append("sourceRoutingStatsThroughFrames", sourceRoutingStatsThroughFrames).append("sourceRoutingStatsAllRoutesBroadcastFrames", sourceRoutingStatsAllRoutesBroadcastFrames).append("sourceRoutingStatsSingleRouteBroadcastFrames", sourceRoutingStatsSingleRouteBroadcastFrames).append("sourceRoutingStatsInOctets", sourceRoutingStatsInOctets).append("sourceRoutingStatsOutOctets", sourceRoutingStatsOutOctets).append("sourceRoutingStatsThroughOctets", sourceRoutingStatsThroughOctets).append("sourceRoutingStatsAllRoutesBroadcastOctets", sourceRoutingStatsAllRoutesBroadcastOctets).append("sourceRoutingStatsSingleRoutesBroadcastOctets", sourceRoutingStatsSingleRoutesBroadcastOctets).append("sourceRoutingStatsLocalLLCFrames", sourceRoutingStatsLocalLLCFrames).append("sourceRoutingStats1HopFrames", sourceRoutingStats1HopFrames).append("sourceRoutingStats2HopsFrames", sourceRoutingStats2HopsFrames).append("sourceRoutingStats3HopsFrames", sourceRoutingStats3HopsFrames).append("sourceRoutingStats4HopsFrames", sourceRoutingStats4HopsFrames).append("sourceRoutingStats5HopsFrames", sourceRoutingStats5HopsFrames).append("sourceRoutingStats6HopsFrames", sourceRoutingStats6HopsFrames).append("sourceRoutingStats7HopsFrames", sourceRoutingStats7HopsFrames).append("sourceRoutingStats8HopsFrames", sourceRoutingStats8HopsFrames).append("sourceRoutingStatsMoreThan8HopsFrames", sourceRoutingStatsMoreThan8HopsFrames).append("sourceRoutingStatsOwner", sourceRoutingStatsOwner).append("sourceRoutingStatsStatus", sourceRoutingStatsStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sourceRoutingStatsIfIndex).append(sourceRoutingStatsRingNumber).append(sourceRoutingStatsInFrames).append(sourceRoutingStatsOutFrames).append(sourceRoutingStatsThroughFrames).append(sourceRoutingStatsAllRoutesBroadcastFrames).append(sourceRoutingStatsSingleRouteBroadcastFrames).append(sourceRoutingStatsInOctets).append(sourceRoutingStatsOutOctets).append(sourceRoutingStatsThroughOctets).append(sourceRoutingStatsAllRoutesBroadcastOctets).append(sourceRoutingStatsSingleRoutesBroadcastOctets).append(sourceRoutingStatsLocalLLCFrames).append(sourceRoutingStats1HopFrames).append(sourceRoutingStats2HopsFrames).append(sourceRoutingStats3HopsFrames).append(sourceRoutingStats4HopsFrames).append(sourceRoutingStats5HopsFrames).append(sourceRoutingStats6HopsFrames).append(sourceRoutingStats7HopsFrames).append(sourceRoutingStats8HopsFrames).append(sourceRoutingStatsMoreThan8HopsFrames).append(sourceRoutingStatsOwner).append(sourceRoutingStatsStatus).append(_index).toHashCode();
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
        SourceRoutingStatsEntry rhs = ((SourceRoutingStatsEntry) obj);
        return new EqualsBuilder().append(sourceRoutingStatsIfIndex, rhs.sourceRoutingStatsIfIndex).append(sourceRoutingStatsRingNumber, rhs.sourceRoutingStatsRingNumber).append(sourceRoutingStatsInFrames, rhs.sourceRoutingStatsInFrames).append(sourceRoutingStatsOutFrames, rhs.sourceRoutingStatsOutFrames).append(sourceRoutingStatsThroughFrames, rhs.sourceRoutingStatsThroughFrames).append(sourceRoutingStatsAllRoutesBroadcastFrames, rhs.sourceRoutingStatsAllRoutesBroadcastFrames).append(sourceRoutingStatsSingleRouteBroadcastFrames, rhs.sourceRoutingStatsSingleRouteBroadcastFrames).append(sourceRoutingStatsInOctets, rhs.sourceRoutingStatsInOctets).append(sourceRoutingStatsOutOctets, rhs.sourceRoutingStatsOutOctets).append(sourceRoutingStatsThroughOctets, rhs.sourceRoutingStatsThroughOctets).append(sourceRoutingStatsAllRoutesBroadcastOctets, rhs.sourceRoutingStatsAllRoutesBroadcastOctets).append(sourceRoutingStatsSingleRoutesBroadcastOctets, rhs.sourceRoutingStatsSingleRoutesBroadcastOctets).append(sourceRoutingStatsLocalLLCFrames, rhs.sourceRoutingStatsLocalLLCFrames).append(sourceRoutingStats1HopFrames, rhs.sourceRoutingStats1HopFrames).append(sourceRoutingStats2HopsFrames, rhs.sourceRoutingStats2HopsFrames).append(sourceRoutingStats3HopsFrames, rhs.sourceRoutingStats3HopsFrames).append(sourceRoutingStats4HopsFrames, rhs.sourceRoutingStats4HopsFrames).append(sourceRoutingStats5HopsFrames, rhs.sourceRoutingStats5HopsFrames).append(sourceRoutingStats6HopsFrames, rhs.sourceRoutingStats6HopsFrames).append(sourceRoutingStats7HopsFrames, rhs.sourceRoutingStats7HopsFrames).append(sourceRoutingStats8HopsFrames, rhs.sourceRoutingStats8HopsFrames).append(sourceRoutingStatsMoreThan8HopsFrames, rhs.sourceRoutingStatsMoreThan8HopsFrames).append(sourceRoutingStatsOwner, rhs.sourceRoutingStatsOwner).append(sourceRoutingStatsStatus, rhs.sourceRoutingStatsStatus).append(_index, rhs._index).isEquals();
    }

    public SourceRoutingStatsEntry clone() {
        SourceRoutingStatsEntry _copy = new SourceRoutingStatsEntry();
        _copy.sourceRoutingStatsIfIndex = sourceRoutingStatsIfIndex;
        _copy.sourceRoutingStatsRingNumber = sourceRoutingStatsRingNumber;
        _copy.sourceRoutingStatsInFrames = sourceRoutingStatsInFrames;
        _copy.sourceRoutingStatsOutFrames = sourceRoutingStatsOutFrames;
        _copy.sourceRoutingStatsThroughFrames = sourceRoutingStatsThroughFrames;
        _copy.sourceRoutingStatsAllRoutesBroadcastFrames = sourceRoutingStatsAllRoutesBroadcastFrames;
        _copy.sourceRoutingStatsSingleRouteBroadcastFrames = sourceRoutingStatsSingleRouteBroadcastFrames;
        _copy.sourceRoutingStatsInOctets = sourceRoutingStatsInOctets;
        _copy.sourceRoutingStatsOutOctets = sourceRoutingStatsOutOctets;
        _copy.sourceRoutingStatsThroughOctets = sourceRoutingStatsThroughOctets;
        _copy.sourceRoutingStatsAllRoutesBroadcastOctets = sourceRoutingStatsAllRoutesBroadcastOctets;
        _copy.sourceRoutingStatsSingleRoutesBroadcastOctets = sourceRoutingStatsSingleRoutesBroadcastOctets;
        _copy.sourceRoutingStatsLocalLLCFrames = sourceRoutingStatsLocalLLCFrames;
        _copy.sourceRoutingStats1HopFrames = sourceRoutingStats1HopFrames;
        _copy.sourceRoutingStats2HopsFrames = sourceRoutingStats2HopsFrames;
        _copy.sourceRoutingStats3HopsFrames = sourceRoutingStats3HopsFrames;
        _copy.sourceRoutingStats4HopsFrames = sourceRoutingStats4HopsFrames;
        _copy.sourceRoutingStats5HopsFrames = sourceRoutingStats5HopsFrames;
        _copy.sourceRoutingStats6HopsFrames = sourceRoutingStats6HopsFrames;
        _copy.sourceRoutingStats7HopsFrames = sourceRoutingStats7HopsFrames;
        _copy.sourceRoutingStats8HopsFrames = sourceRoutingStats8HopsFrames;
        _copy.sourceRoutingStatsMoreThan8HopsFrames = sourceRoutingStatsMoreThan8HopsFrames;
        _copy.sourceRoutingStatsOwner = sourceRoutingStatsOwner;
        _copy.sourceRoutingStatsStatus = sourceRoutingStatsStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sourceRoutingStatsIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "sourceRoutingStatsRingNumber", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "sourceRoutingStatsInFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "sourceRoutingStatsOutFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "sourceRoutingStatsThroughFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "sourceRoutingStatsAllRoutesBroadcastFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "sourceRoutingStatsSingleRouteBroadcastFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "sourceRoutingStatsInOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "sourceRoutingStatsOutOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "sourceRoutingStatsThroughOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "sourceRoutingStatsAllRoutesBroadcastOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "sourceRoutingStatsSingleRoutesBroadcastOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "sourceRoutingStatsLocalLLCFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "sourceRoutingStats1HopFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "sourceRoutingStats2HopsFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "sourceRoutingStats3HopsFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "sourceRoutingStats4HopsFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "sourceRoutingStats5HopsFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "sourceRoutingStats6HopsFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "sourceRoutingStats7HopsFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "sourceRoutingStats8HopsFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "sourceRoutingStatsMoreThan8HopsFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "sourceRoutingStatsOwner", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "sourceRoutingStatsStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
