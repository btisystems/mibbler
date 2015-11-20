
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.networkneighbortable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.NetworkNeighborTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.networkneighbortable.INetworkNeighborEntry;
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

public class NetworkNeighborEntry
    extends DeviceEntity
    implements Serializable, INetworkNeighborEntry, IIndexed, IVariableBindingSetter
{

    private String networkNeighborIdx;
    private String networkNeighborIPAddr;
    private int networkNeighborRowStatus;
    private String _index;
    private NetworkNeighborTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NetworkNeighborEntry() {
    }

    public String getNetworkNeighborIdx() {
        return this.networkNeighborIdx;
    }

    public void setNetworkNeighborIdx(String networkNeighborIdx) {
        String oldValue = getNetworkNeighborIdx();
        this.networkNeighborIdx = networkNeighborIdx;
        notifyChange(1, oldValue, networkNeighborIdx);
    }

    public String getNetworkNeighborIPAddr() {
        return this.networkNeighborIPAddr;
    }

    public void setNetworkNeighborIPAddr(String networkNeighborIPAddr) {
        String oldValue = getNetworkNeighborIPAddr();
        this.networkNeighborIPAddr = networkNeighborIPAddr;
        notifyChange(2, oldValue, networkNeighborIPAddr);
    }

    public int getNetworkNeighborRowStatus() {
        return this.networkNeighborRowStatus;
    }

    public void setNetworkNeighborRowStatus(int networkNeighborRowStatus) {
        int oldValue = getNetworkNeighborRowStatus();
        this.networkNeighborRowStatus = networkNeighborRowStatus;
        notifyChange(3, oldValue, networkNeighborRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setNetworkNeighborIdx(binding.getVariable().toString());
                break;
            case  2 :
                setNetworkNeighborIPAddr(binding.getVariable().toString());
                break;
            case  3 :
                setNetworkNeighborRowStatus(binding.getVariable().toInt());
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
        setNetworkNeighborIdx(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(NetworkNeighborTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("networkNeighborIdx", networkNeighborIdx).append("networkNeighborIPAddr", networkNeighborIPAddr).append("networkNeighborRowStatus", networkNeighborRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(networkNeighborIdx).append(networkNeighborIPAddr).append(networkNeighborRowStatus).append(_index).toHashCode();
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
        NetworkNeighborEntry rhs = ((NetworkNeighborEntry) obj);
        return new EqualsBuilder().append(networkNeighborIdx, rhs.networkNeighborIdx).append(networkNeighborIPAddr, rhs.networkNeighborIPAddr).append(networkNeighborRowStatus, rhs.networkNeighborRowStatus).append(_index, rhs._index).isEquals();
    }

    public NetworkNeighborEntry clone() {
        NetworkNeighborEntry _copy = new NetworkNeighborEntry();
        _copy.networkNeighborIdx = networkNeighborIdx;
        _copy.networkNeighborIPAddr = networkNeighborIPAddr;
        _copy.networkNeighborRowStatus = networkNeighborRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.13.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "networkNeighborIdx", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "networkNeighborIPAddr", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "networkNeighborRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
