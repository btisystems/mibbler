
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.ringstationordertable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.RingStationOrderTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationordertable.IRingStationOrderEntry;
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

public class RingStationOrderEntry
    extends DeviceEntity
    implements Serializable, IRingStationOrderEntry, IIndexed, IVariableBindingSetter
{

    private int ringStationOrderIfIndex;
    private int ringStationOrderOrderIndex;
    private String ringStationOrderMacAddress;
    private String _index;
    private RingStationOrderTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RingStationOrderEntry() {
    }

    public int getRingStationOrderIfIndex() {
        return this.ringStationOrderIfIndex;
    }

    public void setRingStationOrderIfIndex(int ringStationOrderIfIndex) {
        int oldValue = getRingStationOrderIfIndex();
        this.ringStationOrderIfIndex = ringStationOrderIfIndex;
        notifyChange(1, oldValue, ringStationOrderIfIndex);
    }

    public int getRingStationOrderOrderIndex() {
        return this.ringStationOrderOrderIndex;
    }

    public void setRingStationOrderOrderIndex(int ringStationOrderOrderIndex) {
        int oldValue = getRingStationOrderOrderIndex();
        this.ringStationOrderOrderIndex = ringStationOrderOrderIndex;
        notifyChange(2, oldValue, ringStationOrderOrderIndex);
    }

    public String getRingStationOrderMacAddress() {
        return this.ringStationOrderMacAddress;
    }

    public void setRingStationOrderMacAddress(String ringStationOrderMacAddress) {
        String oldValue = getRingStationOrderMacAddress();
        this.ringStationOrderMacAddress = ringStationOrderMacAddress;
        notifyChange(3, oldValue, ringStationOrderMacAddress);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setRingStationOrderIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setRingStationOrderOrderIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setRingStationOrderMacAddress(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setRingStationOrderIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setRingStationOrderOrderIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(RingStationOrderTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ringStationOrderIfIndex", ringStationOrderIfIndex).append("ringStationOrderOrderIndex", ringStationOrderOrderIndex).append("ringStationOrderMacAddress", ringStationOrderMacAddress).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ringStationOrderIfIndex).append(ringStationOrderOrderIndex).append(ringStationOrderMacAddress).append(_index).toHashCode();
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
        RingStationOrderEntry rhs = ((RingStationOrderEntry) obj);
        return new EqualsBuilder().append(ringStationOrderIfIndex, rhs.ringStationOrderIfIndex).append(ringStationOrderOrderIndex, rhs.ringStationOrderOrderIndex).append(ringStationOrderMacAddress, rhs.ringStationOrderMacAddress).append(_index, rhs._index).isEquals();
    }

    public RingStationOrderEntry clone() {
        RingStationOrderEntry _copy = new RingStationOrderEntry();
        _copy.ringStationOrderIfIndex = ringStationOrderIfIndex;
        _copy.ringStationOrderOrderIndex = ringStationOrderOrderIndex;
        _copy.ringStationOrderMacAddress = ringStationOrderMacAddress;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ringStationOrderIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ringStationOrderOrderIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ringStationOrderMacAddress", DeviceEntityDescription.FieldType.STRING, 24));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
