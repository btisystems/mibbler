
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.dot3hcstatstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3hcstatstable.IDot3HCStatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.Dot3HCStatsTable;
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

public class Dot3HCStatsEntry
    extends DeviceEntity
    implements Serializable, IDot3HCStatsEntry, IIndexed, IVariableBindingSetter
{

    private long dot3HCStatsAlignmentErrors;
    private long dot3HCStatsFCSErrors;
    private long dot3HCStatsInternalMacTransmitErrors;
    private long dot3HCStatsFrameTooLongs;
    private long dot3HCStatsInternalMacReceiveErrors;
    private long dot3HCStatsSymbolErrors;
    private String _index;
    private Dot3HCStatsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot3HCStatsEntry() {
    }

    public long getDot3HCStatsAlignmentErrors() {
        return this.dot3HCStatsAlignmentErrors;
    }

    public void setDot3HCStatsAlignmentErrors(long dot3HCStatsAlignmentErrors) {
        long oldValue = getDot3HCStatsAlignmentErrors();
        this.dot3HCStatsAlignmentErrors = dot3HCStatsAlignmentErrors;
        notifyChange(1, oldValue, dot3HCStatsAlignmentErrors);
    }

    public long getDot3HCStatsFCSErrors() {
        return this.dot3HCStatsFCSErrors;
    }

    public void setDot3HCStatsFCSErrors(long dot3HCStatsFCSErrors) {
        long oldValue = getDot3HCStatsFCSErrors();
        this.dot3HCStatsFCSErrors = dot3HCStatsFCSErrors;
        notifyChange(2, oldValue, dot3HCStatsFCSErrors);
    }

    public long getDot3HCStatsInternalMacTransmitErrors() {
        return this.dot3HCStatsInternalMacTransmitErrors;
    }

    public void setDot3HCStatsInternalMacTransmitErrors(long dot3HCStatsInternalMacTransmitErrors) {
        long oldValue = getDot3HCStatsInternalMacTransmitErrors();
        this.dot3HCStatsInternalMacTransmitErrors = dot3HCStatsInternalMacTransmitErrors;
        notifyChange(3, oldValue, dot3HCStatsInternalMacTransmitErrors);
    }

    public long getDot3HCStatsFrameTooLongs() {
        return this.dot3HCStatsFrameTooLongs;
    }

    public void setDot3HCStatsFrameTooLongs(long dot3HCStatsFrameTooLongs) {
        long oldValue = getDot3HCStatsFrameTooLongs();
        this.dot3HCStatsFrameTooLongs = dot3HCStatsFrameTooLongs;
        notifyChange(4, oldValue, dot3HCStatsFrameTooLongs);
    }

    public long getDot3HCStatsInternalMacReceiveErrors() {
        return this.dot3HCStatsInternalMacReceiveErrors;
    }

    public void setDot3HCStatsInternalMacReceiveErrors(long dot3HCStatsInternalMacReceiveErrors) {
        long oldValue = getDot3HCStatsInternalMacReceiveErrors();
        this.dot3HCStatsInternalMacReceiveErrors = dot3HCStatsInternalMacReceiveErrors;
        notifyChange(5, oldValue, dot3HCStatsInternalMacReceiveErrors);
    }

    public long getDot3HCStatsSymbolErrors() {
        return this.dot3HCStatsSymbolErrors;
    }

    public void setDot3HCStatsSymbolErrors(long dot3HCStatsSymbolErrors) {
        long oldValue = getDot3HCStatsSymbolErrors();
        this.dot3HCStatsSymbolErrors = dot3HCStatsSymbolErrors;
        notifyChange(6, oldValue, dot3HCStatsSymbolErrors);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot3HCStatsAlignmentErrors(binding.getVariable().toLong());
                break;
            case  2 :
                setDot3HCStatsFCSErrors(binding.getVariable().toLong());
                break;
            case  3 :
                setDot3HCStatsInternalMacTransmitErrors(binding.getVariable().toLong());
                break;
            case  4 :
                setDot3HCStatsFrameTooLongs(binding.getVariable().toLong());
                break;
            case  5 :
                setDot3HCStatsInternalMacReceiveErrors(binding.getVariable().toLong());
                break;
            case  6 :
                setDot3HCStatsSymbolErrors(binding.getVariable().toLong());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot3HCStatsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot3HCStatsAlignmentErrors", dot3HCStatsAlignmentErrors).append("dot3HCStatsFCSErrors", dot3HCStatsFCSErrors).append("dot3HCStatsInternalMacTransmitErrors", dot3HCStatsInternalMacTransmitErrors).append("dot3HCStatsFrameTooLongs", dot3HCStatsFrameTooLongs).append("dot3HCStatsInternalMacReceiveErrors", dot3HCStatsInternalMacReceiveErrors).append("dot3HCStatsSymbolErrors", dot3HCStatsSymbolErrors).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot3HCStatsAlignmentErrors).append(dot3HCStatsFCSErrors).append(dot3HCStatsInternalMacTransmitErrors).append(dot3HCStatsFrameTooLongs).append(dot3HCStatsInternalMacReceiveErrors).append(dot3HCStatsSymbolErrors).append(_index).toHashCode();
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
        Dot3HCStatsEntry rhs = ((Dot3HCStatsEntry) obj);
        return new EqualsBuilder().append(dot3HCStatsAlignmentErrors, rhs.dot3HCStatsAlignmentErrors).append(dot3HCStatsFCSErrors, rhs.dot3HCStatsFCSErrors).append(dot3HCStatsInternalMacTransmitErrors, rhs.dot3HCStatsInternalMacTransmitErrors).append(dot3HCStatsFrameTooLongs, rhs.dot3HCStatsFrameTooLongs).append(dot3HCStatsInternalMacReceiveErrors, rhs.dot3HCStatsInternalMacReceiveErrors).append(dot3HCStatsSymbolErrors, rhs.dot3HCStatsSymbolErrors).append(_index, rhs._index).isEquals();
    }

    public Dot3HCStatsEntry clone() {
        Dot3HCStatsEntry _copy = new Dot3HCStatsEntry();
        _copy.dot3HCStatsAlignmentErrors = dot3HCStatsAlignmentErrors;
        _copy.dot3HCStatsFCSErrors = dot3HCStatsFCSErrors;
        _copy.dot3HCStatsInternalMacTransmitErrors = dot3HCStatsInternalMacTransmitErrors;
        _copy.dot3HCStatsFrameTooLongs = dot3HCStatsFrameTooLongs;
        _copy.dot3HCStatsInternalMacReceiveErrors = dot3HCStatsInternalMacReceiveErrors;
        _copy.dot3HCStatsSymbolErrors = dot3HCStatsSymbolErrors;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.10.7.11.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot3HCStatsAlignmentErrors", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot3HCStatsFCSErrors", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot3HCStatsInternalMacTransmitErrors", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot3HCStatsFrameTooLongs", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot3HCStatsInternalMacReceiveErrors", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "dot3HCStatsSymbolErrors", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
