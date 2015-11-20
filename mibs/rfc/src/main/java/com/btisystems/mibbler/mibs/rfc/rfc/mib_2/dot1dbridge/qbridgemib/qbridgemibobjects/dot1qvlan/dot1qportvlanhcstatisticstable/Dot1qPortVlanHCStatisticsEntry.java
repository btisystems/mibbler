
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlanhcstatisticstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlanhcstatisticstable.IDot1qPortVlanHCStatisticsEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.Dot1qPortVlanHCStatisticsTable;
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

public class Dot1qPortVlanHCStatisticsEntry
    extends DeviceEntity
    implements Serializable, IDot1qPortVlanHCStatisticsEntry, IIndexed, IVariableBindingSetter
{

    private long dot1qTpVlanPortHCInFrames;
    private long dot1qTpVlanPortHCOutFrames;
    private long dot1qTpVlanPortHCInDiscards;
    private String _index;
    private Dot1qPortVlanHCStatisticsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qPortVlanHCStatisticsEntry() {
    }

    public long getDot1qTpVlanPortHCInFrames() {
        return this.dot1qTpVlanPortHCInFrames;
    }

    public void setDot1qTpVlanPortHCInFrames(long dot1qTpVlanPortHCInFrames) {
        long oldValue = getDot1qTpVlanPortHCInFrames();
        this.dot1qTpVlanPortHCInFrames = dot1qTpVlanPortHCInFrames;
        notifyChange(1, oldValue, dot1qTpVlanPortHCInFrames);
    }

    public long getDot1qTpVlanPortHCOutFrames() {
        return this.dot1qTpVlanPortHCOutFrames;
    }

    public void setDot1qTpVlanPortHCOutFrames(long dot1qTpVlanPortHCOutFrames) {
        long oldValue = getDot1qTpVlanPortHCOutFrames();
        this.dot1qTpVlanPortHCOutFrames = dot1qTpVlanPortHCOutFrames;
        notifyChange(2, oldValue, dot1qTpVlanPortHCOutFrames);
    }

    public long getDot1qTpVlanPortHCInDiscards() {
        return this.dot1qTpVlanPortHCInDiscards;
    }

    public void setDot1qTpVlanPortHCInDiscards(long dot1qTpVlanPortHCInDiscards) {
        long oldValue = getDot1qTpVlanPortHCInDiscards();
        this.dot1qTpVlanPortHCInDiscards = dot1qTpVlanPortHCInDiscards;
        notifyChange(3, oldValue, dot1qTpVlanPortHCInDiscards);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qTpVlanPortHCInFrames(binding.getVariable().toLong());
                break;
            case  2 :
                setDot1qTpVlanPortHCOutFrames(binding.getVariable().toLong());
                break;
            case  3 :
                setDot1qTpVlanPortHCInDiscards(binding.getVariable().toLong());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 13;
        int _len;
        _index = new OID(_oidInts, 13, (oid.size()- 13)).toString();
        arrayOffset += 1;
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1qPortVlanHCStatisticsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qTpVlanPortHCInFrames", dot1qTpVlanPortHCInFrames).append("dot1qTpVlanPortHCOutFrames", dot1qTpVlanPortHCOutFrames).append("dot1qTpVlanPortHCInDiscards", dot1qTpVlanPortHCInDiscards).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qTpVlanPortHCInFrames).append(dot1qTpVlanPortHCOutFrames).append(dot1qTpVlanPortHCInDiscards).append(_index).toHashCode();
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
        Dot1qPortVlanHCStatisticsEntry rhs = ((Dot1qPortVlanHCStatisticsEntry) obj);
        return new EqualsBuilder().append(dot1qTpVlanPortHCInFrames, rhs.dot1qTpVlanPortHCInFrames).append(dot1qTpVlanPortHCOutFrames, rhs.dot1qTpVlanPortHCOutFrames).append(dot1qTpVlanPortHCInDiscards, rhs.dot1qTpVlanPortHCInDiscards).append(_index, rhs._index).isEquals();
    }

    public Dot1qPortVlanHCStatisticsEntry clone() {
        Dot1qPortVlanHCStatisticsEntry _copy = new Dot1qPortVlanHCStatisticsEntry();
        _copy.dot1qTpVlanPortHCInFrames = dot1qTpVlanPortHCInFrames;
        _copy.dot1qTpVlanPortHCOutFrames = dot1qTpVlanPortHCOutFrames;
        _copy.dot1qTpVlanPortHCInDiscards = dot1qTpVlanPortHCInDiscards;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4.7.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qTpVlanPortHCInFrames", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qTpVlanPortHCOutFrames", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qTpVlanPortHCInDiscards", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
