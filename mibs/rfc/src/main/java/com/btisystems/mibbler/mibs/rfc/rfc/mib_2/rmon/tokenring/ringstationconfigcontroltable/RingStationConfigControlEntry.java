
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.ringstationconfigcontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.ringstationconfigcontroltable.IRingStationConfigControlEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.RingStationConfigControlTable;
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

public class RingStationConfigControlEntry
    extends DeviceEntity
    implements Serializable, IRingStationConfigControlEntry, IIndexed, IVariableBindingSetter
{

    private int ringStationConfigControlIfIndex;
    private String ringStationConfigControlMacAddress;
    private int ringStationConfigControlRemove;
    private int ringStationConfigControlUpdateStats;
    private String _index;
    private RingStationConfigControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RingStationConfigControlEntry() {
    }

    public int getRingStationConfigControlIfIndex() {
        return this.ringStationConfigControlIfIndex;
    }

    public void setRingStationConfigControlIfIndex(int ringStationConfigControlIfIndex) {
        int oldValue = getRingStationConfigControlIfIndex();
        this.ringStationConfigControlIfIndex = ringStationConfigControlIfIndex;
        notifyChange(1, oldValue, ringStationConfigControlIfIndex);
    }

    public String getRingStationConfigControlMacAddress() {
        return this.ringStationConfigControlMacAddress;
    }

    public void setRingStationConfigControlMacAddress(String ringStationConfigControlMacAddress) {
        String oldValue = getRingStationConfigControlMacAddress();
        this.ringStationConfigControlMacAddress = ringStationConfigControlMacAddress;
        notifyChange(2, oldValue, ringStationConfigControlMacAddress);
    }

    public int getRingStationConfigControlRemove() {
        return this.ringStationConfigControlRemove;
    }

    public void setRingStationConfigControlRemove(int ringStationConfigControlRemove) {
        int oldValue = getRingStationConfigControlRemove();
        this.ringStationConfigControlRemove = ringStationConfigControlRemove;
        notifyChange(3, oldValue, ringStationConfigControlRemove);
    }

    public int getRingStationConfigControlUpdateStats() {
        return this.ringStationConfigControlUpdateStats;
    }

    public void setRingStationConfigControlUpdateStats(int ringStationConfigControlUpdateStats) {
        int oldValue = getRingStationConfigControlUpdateStats();
        this.ringStationConfigControlUpdateStats = ringStationConfigControlUpdateStats;
        notifyChange(4, oldValue, ringStationConfigControlUpdateStats);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setRingStationConfigControlIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setRingStationConfigControlMacAddress(binding.getVariable().toString());
                break;
            case  3 :
                setRingStationConfigControlRemove(binding.getVariable().toInt());
                break;
            case  4 :
                setRingStationConfigControlUpdateStats(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setRingStationConfigControlIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setRingStationConfigControlMacAddress(_getMacAddress(_oidInts, arrayOffset, 6));
        arrayOffset += 6;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(RingStationConfigControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ringStationConfigControlIfIndex", ringStationConfigControlIfIndex).append("ringStationConfigControlMacAddress", ringStationConfigControlMacAddress).append("ringStationConfigControlRemove", ringStationConfigControlRemove).append("ringStationConfigControlUpdateStats", ringStationConfigControlUpdateStats).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ringStationConfigControlIfIndex).append(ringStationConfigControlMacAddress).append(ringStationConfigControlRemove).append(ringStationConfigControlUpdateStats).append(_index).toHashCode();
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
        RingStationConfigControlEntry rhs = ((RingStationConfigControlEntry) obj);
        return new EqualsBuilder().append(ringStationConfigControlIfIndex, rhs.ringStationConfigControlIfIndex).append(ringStationConfigControlMacAddress, rhs.ringStationConfigControlMacAddress).append(ringStationConfigControlRemove, rhs.ringStationConfigControlRemove).append(ringStationConfigControlUpdateStats, rhs.ringStationConfigControlUpdateStats).append(_index, rhs._index).isEquals();
    }

    public RingStationConfigControlEntry clone() {
        RingStationConfigControlEntry _copy = new RingStationConfigControlEntry();
        _copy.ringStationConfigControlIfIndex = ringStationConfigControlIfIndex;
        _copy.ringStationConfigControlMacAddress = ringStationConfigControlMacAddress;
        _copy.ringStationConfigControlRemove = ringStationConfigControlRemove;
        _copy.ringStationConfigControlUpdateStats = ringStationConfigControlUpdateStats;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ringStationConfigControlIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ringStationConfigControlMacAddress", DeviceEntityDescription.FieldType.STRING, 24));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ringStationConfigControlRemove", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ringStationConfigControlUpdateStats", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
