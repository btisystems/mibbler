
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.dot3statstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3statstable.IDot3StatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.Dot3StatsTable;
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

public class Dot3StatsEntry
    extends DeviceEntity
    implements Serializable, IDot3StatsEntry, IIndexed, IVariableBindingSetter
{

    private int dot3StatsIndex;
    private int dot3StatsAlignmentErrors;
    private int dot3StatsFCSErrors;
    private int dot3StatsSingleCollisionFrames;
    private int dot3StatsMultipleCollisionFrames;
    private int dot3StatsSQETestErrors;
    private int dot3StatsDeferredTransmissions;
    private int dot3StatsLateCollisions;
    private int dot3StatsExcessiveCollisions;
    private int dot3StatsInternalMacTransmitErrors;
    private int dot3StatsCarrierSenseErrors;
    private int dot3StatsFrameTooLongs;
    private int dot3StatsInternalMacReceiveErrors;
    private String dot3StatsEtherChipSet;
    private int dot3StatsSymbolErrors;
    private int dot3StatsDuplexStatus;
    private int dot3StatsRateControlAbility;
    private int dot3StatsRateControlStatus;
    private String _index;
    private Dot3StatsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot3StatsEntry() {
    }

    public int getDot3StatsIndex() {
        return this.dot3StatsIndex;
    }

    public void setDot3StatsIndex(int dot3StatsIndex) {
        int oldValue = getDot3StatsIndex();
        this.dot3StatsIndex = dot3StatsIndex;
        notifyChange(1, oldValue, dot3StatsIndex);
    }

    public int getDot3StatsAlignmentErrors() {
        return this.dot3StatsAlignmentErrors;
    }

    public void setDot3StatsAlignmentErrors(int dot3StatsAlignmentErrors) {
        int oldValue = getDot3StatsAlignmentErrors();
        this.dot3StatsAlignmentErrors = dot3StatsAlignmentErrors;
        notifyChange(2, oldValue, dot3StatsAlignmentErrors);
    }

    public int getDot3StatsFCSErrors() {
        return this.dot3StatsFCSErrors;
    }

    public void setDot3StatsFCSErrors(int dot3StatsFCSErrors) {
        int oldValue = getDot3StatsFCSErrors();
        this.dot3StatsFCSErrors = dot3StatsFCSErrors;
        notifyChange(3, oldValue, dot3StatsFCSErrors);
    }

    public int getDot3StatsSingleCollisionFrames() {
        return this.dot3StatsSingleCollisionFrames;
    }

    public void setDot3StatsSingleCollisionFrames(int dot3StatsSingleCollisionFrames) {
        int oldValue = getDot3StatsSingleCollisionFrames();
        this.dot3StatsSingleCollisionFrames = dot3StatsSingleCollisionFrames;
        notifyChange(4, oldValue, dot3StatsSingleCollisionFrames);
    }

    public int getDot3StatsMultipleCollisionFrames() {
        return this.dot3StatsMultipleCollisionFrames;
    }

    public void setDot3StatsMultipleCollisionFrames(int dot3StatsMultipleCollisionFrames) {
        int oldValue = getDot3StatsMultipleCollisionFrames();
        this.dot3StatsMultipleCollisionFrames = dot3StatsMultipleCollisionFrames;
        notifyChange(5, oldValue, dot3StatsMultipleCollisionFrames);
    }

    public int getDot3StatsSQETestErrors() {
        return this.dot3StatsSQETestErrors;
    }

    public void setDot3StatsSQETestErrors(int dot3StatsSQETestErrors) {
        int oldValue = getDot3StatsSQETestErrors();
        this.dot3StatsSQETestErrors = dot3StatsSQETestErrors;
        notifyChange(6, oldValue, dot3StatsSQETestErrors);
    }

    public int getDot3StatsDeferredTransmissions() {
        return this.dot3StatsDeferredTransmissions;
    }

    public void setDot3StatsDeferredTransmissions(int dot3StatsDeferredTransmissions) {
        int oldValue = getDot3StatsDeferredTransmissions();
        this.dot3StatsDeferredTransmissions = dot3StatsDeferredTransmissions;
        notifyChange(7, oldValue, dot3StatsDeferredTransmissions);
    }

    public int getDot3StatsLateCollisions() {
        return this.dot3StatsLateCollisions;
    }

    public void setDot3StatsLateCollisions(int dot3StatsLateCollisions) {
        int oldValue = getDot3StatsLateCollisions();
        this.dot3StatsLateCollisions = dot3StatsLateCollisions;
        notifyChange(8, oldValue, dot3StatsLateCollisions);
    }

    public int getDot3StatsExcessiveCollisions() {
        return this.dot3StatsExcessiveCollisions;
    }

    public void setDot3StatsExcessiveCollisions(int dot3StatsExcessiveCollisions) {
        int oldValue = getDot3StatsExcessiveCollisions();
        this.dot3StatsExcessiveCollisions = dot3StatsExcessiveCollisions;
        notifyChange(9, oldValue, dot3StatsExcessiveCollisions);
    }

    public int getDot3StatsInternalMacTransmitErrors() {
        return this.dot3StatsInternalMacTransmitErrors;
    }

    public void setDot3StatsInternalMacTransmitErrors(int dot3StatsInternalMacTransmitErrors) {
        int oldValue = getDot3StatsInternalMacTransmitErrors();
        this.dot3StatsInternalMacTransmitErrors = dot3StatsInternalMacTransmitErrors;
        notifyChange(10, oldValue, dot3StatsInternalMacTransmitErrors);
    }

    public int getDot3StatsCarrierSenseErrors() {
        return this.dot3StatsCarrierSenseErrors;
    }

    public void setDot3StatsCarrierSenseErrors(int dot3StatsCarrierSenseErrors) {
        int oldValue = getDot3StatsCarrierSenseErrors();
        this.dot3StatsCarrierSenseErrors = dot3StatsCarrierSenseErrors;
        notifyChange(11, oldValue, dot3StatsCarrierSenseErrors);
    }

    public int getDot3StatsFrameTooLongs() {
        return this.dot3StatsFrameTooLongs;
    }

    public void setDot3StatsFrameTooLongs(int dot3StatsFrameTooLongs) {
        int oldValue = getDot3StatsFrameTooLongs();
        this.dot3StatsFrameTooLongs = dot3StatsFrameTooLongs;
        notifyChange(13, oldValue, dot3StatsFrameTooLongs);
    }

    public int getDot3StatsInternalMacReceiveErrors() {
        return this.dot3StatsInternalMacReceiveErrors;
    }

    public void setDot3StatsInternalMacReceiveErrors(int dot3StatsInternalMacReceiveErrors) {
        int oldValue = getDot3StatsInternalMacReceiveErrors();
        this.dot3StatsInternalMacReceiveErrors = dot3StatsInternalMacReceiveErrors;
        notifyChange(16, oldValue, dot3StatsInternalMacReceiveErrors);
    }

    public String getDot3StatsEtherChipSet() {
        return this.dot3StatsEtherChipSet;
    }

    public void setDot3StatsEtherChipSet(String dot3StatsEtherChipSet) {
        String oldValue = getDot3StatsEtherChipSet();
        this.dot3StatsEtherChipSet = dot3StatsEtherChipSet;
        notifyChange(17, oldValue, dot3StatsEtherChipSet);
    }

    public int getDot3StatsSymbolErrors() {
        return this.dot3StatsSymbolErrors;
    }

    public void setDot3StatsSymbolErrors(int dot3StatsSymbolErrors) {
        int oldValue = getDot3StatsSymbolErrors();
        this.dot3StatsSymbolErrors = dot3StatsSymbolErrors;
        notifyChange(18, oldValue, dot3StatsSymbolErrors);
    }

    public int getDot3StatsDuplexStatus() {
        return this.dot3StatsDuplexStatus;
    }

    public void setDot3StatsDuplexStatus(int dot3StatsDuplexStatus) {
        int oldValue = getDot3StatsDuplexStatus();
        this.dot3StatsDuplexStatus = dot3StatsDuplexStatus;
        notifyChange(19, oldValue, dot3StatsDuplexStatus);
    }

    public int getDot3StatsRateControlAbility() {
        return this.dot3StatsRateControlAbility;
    }

    public void setDot3StatsRateControlAbility(int dot3StatsRateControlAbility) {
        int oldValue = getDot3StatsRateControlAbility();
        this.dot3StatsRateControlAbility = dot3StatsRateControlAbility;
        notifyChange(20, oldValue, dot3StatsRateControlAbility);
    }

    public int getDot3StatsRateControlStatus() {
        return this.dot3StatsRateControlStatus;
    }

    public void setDot3StatsRateControlStatus(int dot3StatsRateControlStatus) {
        int oldValue = getDot3StatsRateControlStatus();
        this.dot3StatsRateControlStatus = dot3StatsRateControlStatus;
        notifyChange(21, oldValue, dot3StatsRateControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot3StatsIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setDot3StatsAlignmentErrors(binding.getVariable().toInt());
                break;
            case  3 :
                setDot3StatsFCSErrors(binding.getVariable().toInt());
                break;
            case  4 :
                setDot3StatsSingleCollisionFrames(binding.getVariable().toInt());
                break;
            case  5 :
                setDot3StatsMultipleCollisionFrames(binding.getVariable().toInt());
                break;
            case  6 :
                setDot3StatsSQETestErrors(binding.getVariable().toInt());
                break;
            case  7 :
                setDot3StatsDeferredTransmissions(binding.getVariable().toInt());
                break;
            case  8 :
                setDot3StatsLateCollisions(binding.getVariable().toInt());
                break;
            case  9 :
                setDot3StatsExcessiveCollisions(binding.getVariable().toInt());
                break;
            case  10 :
                setDot3StatsInternalMacTransmitErrors(binding.getVariable().toInt());
                break;
            case  11 :
                setDot3StatsCarrierSenseErrors(binding.getVariable().toInt());
                break;
            case  13 :
                setDot3StatsFrameTooLongs(binding.getVariable().toInt());
                break;
            case  16 :
                setDot3StatsInternalMacReceiveErrors(binding.getVariable().toInt());
                break;
            case  17 :
                setDot3StatsEtherChipSet(binding.getVariable().toString());
                break;
            case  18 :
                setDot3StatsSymbolErrors(binding.getVariable().toInt());
                break;
            case  19 :
                setDot3StatsDuplexStatus(binding.getVariable().toInt());
                break;
            case  20 :
                setDot3StatsRateControlAbility(binding.getVariable().toInt());
                break;
            case  21 :
                setDot3StatsRateControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setDot3StatsIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot3StatsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot3StatsIndex", dot3StatsIndex).append("dot3StatsAlignmentErrors", dot3StatsAlignmentErrors).append("dot3StatsFCSErrors", dot3StatsFCSErrors).append("dot3StatsSingleCollisionFrames", dot3StatsSingleCollisionFrames).append("dot3StatsMultipleCollisionFrames", dot3StatsMultipleCollisionFrames).append("dot3StatsSQETestErrors", dot3StatsSQETestErrors).append("dot3StatsDeferredTransmissions", dot3StatsDeferredTransmissions).append("dot3StatsLateCollisions", dot3StatsLateCollisions).append("dot3StatsExcessiveCollisions", dot3StatsExcessiveCollisions).append("dot3StatsInternalMacTransmitErrors", dot3StatsInternalMacTransmitErrors).append("dot3StatsCarrierSenseErrors", dot3StatsCarrierSenseErrors).append("dot3StatsFrameTooLongs", dot3StatsFrameTooLongs).append("dot3StatsInternalMacReceiveErrors", dot3StatsInternalMacReceiveErrors).append("dot3StatsEtherChipSet", dot3StatsEtherChipSet).append("dot3StatsSymbolErrors", dot3StatsSymbolErrors).append("dot3StatsDuplexStatus", dot3StatsDuplexStatus).append("dot3StatsRateControlAbility", dot3StatsRateControlAbility).append("dot3StatsRateControlStatus", dot3StatsRateControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot3StatsIndex).append(dot3StatsAlignmentErrors).append(dot3StatsFCSErrors).append(dot3StatsSingleCollisionFrames).append(dot3StatsMultipleCollisionFrames).append(dot3StatsSQETestErrors).append(dot3StatsDeferredTransmissions).append(dot3StatsLateCollisions).append(dot3StatsExcessiveCollisions).append(dot3StatsInternalMacTransmitErrors).append(dot3StatsCarrierSenseErrors).append(dot3StatsFrameTooLongs).append(dot3StatsInternalMacReceiveErrors).append(dot3StatsEtherChipSet).append(dot3StatsSymbolErrors).append(dot3StatsDuplexStatus).append(dot3StatsRateControlAbility).append(dot3StatsRateControlStatus).append(_index).toHashCode();
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
        Dot3StatsEntry rhs = ((Dot3StatsEntry) obj);
        return new EqualsBuilder().append(dot3StatsIndex, rhs.dot3StatsIndex).append(dot3StatsAlignmentErrors, rhs.dot3StatsAlignmentErrors).append(dot3StatsFCSErrors, rhs.dot3StatsFCSErrors).append(dot3StatsSingleCollisionFrames, rhs.dot3StatsSingleCollisionFrames).append(dot3StatsMultipleCollisionFrames, rhs.dot3StatsMultipleCollisionFrames).append(dot3StatsSQETestErrors, rhs.dot3StatsSQETestErrors).append(dot3StatsDeferredTransmissions, rhs.dot3StatsDeferredTransmissions).append(dot3StatsLateCollisions, rhs.dot3StatsLateCollisions).append(dot3StatsExcessiveCollisions, rhs.dot3StatsExcessiveCollisions).append(dot3StatsInternalMacTransmitErrors, rhs.dot3StatsInternalMacTransmitErrors).append(dot3StatsCarrierSenseErrors, rhs.dot3StatsCarrierSenseErrors).append(dot3StatsFrameTooLongs, rhs.dot3StatsFrameTooLongs).append(dot3StatsInternalMacReceiveErrors, rhs.dot3StatsInternalMacReceiveErrors).append(dot3StatsEtherChipSet, rhs.dot3StatsEtherChipSet).append(dot3StatsSymbolErrors, rhs.dot3StatsSymbolErrors).append(dot3StatsDuplexStatus, rhs.dot3StatsDuplexStatus).append(dot3StatsRateControlAbility, rhs.dot3StatsRateControlAbility).append(dot3StatsRateControlStatus, rhs.dot3StatsRateControlStatus).append(_index, rhs._index).isEquals();
    }

    public Dot3StatsEntry clone() {
        Dot3StatsEntry _copy = new Dot3StatsEntry();
        _copy.dot3StatsIndex = dot3StatsIndex;
        _copy.dot3StatsAlignmentErrors = dot3StatsAlignmentErrors;
        _copy.dot3StatsFCSErrors = dot3StatsFCSErrors;
        _copy.dot3StatsSingleCollisionFrames = dot3StatsSingleCollisionFrames;
        _copy.dot3StatsMultipleCollisionFrames = dot3StatsMultipleCollisionFrames;
        _copy.dot3StatsSQETestErrors = dot3StatsSQETestErrors;
        _copy.dot3StatsDeferredTransmissions = dot3StatsDeferredTransmissions;
        _copy.dot3StatsLateCollisions = dot3StatsLateCollisions;
        _copy.dot3StatsExcessiveCollisions = dot3StatsExcessiveCollisions;
        _copy.dot3StatsInternalMacTransmitErrors = dot3StatsInternalMacTransmitErrors;
        _copy.dot3StatsCarrierSenseErrors = dot3StatsCarrierSenseErrors;
        _copy.dot3StatsFrameTooLongs = dot3StatsFrameTooLongs;
        _copy.dot3StatsInternalMacReceiveErrors = dot3StatsInternalMacReceiveErrors;
        _copy.dot3StatsEtherChipSet = dot3StatsEtherChipSet;
        _copy.dot3StatsSymbolErrors = dot3StatsSymbolErrors;
        _copy.dot3StatsDuplexStatus = dot3StatsDuplexStatus;
        _copy.dot3StatsRateControlAbility = dot3StatsRateControlAbility;
        _copy.dot3StatsRateControlStatus = dot3StatsRateControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.10.7.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot3StatsIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot3StatsAlignmentErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot3StatsFCSErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot3StatsSingleCollisionFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot3StatsMultipleCollisionFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "dot3StatsSQETestErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "dot3StatsDeferredTransmissions", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "dot3StatsLateCollisions", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "dot3StatsExcessiveCollisions", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "dot3StatsInternalMacTransmitErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "dot3StatsCarrierSenseErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "dot3StatsFrameTooLongs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "dot3StatsInternalMacReceiveErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "dot3StatsEtherChipSet", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "dot3StatsSymbolErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "dot3StatsDuplexStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "dot3StatsRateControlAbility", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "dot3StatsRateControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
