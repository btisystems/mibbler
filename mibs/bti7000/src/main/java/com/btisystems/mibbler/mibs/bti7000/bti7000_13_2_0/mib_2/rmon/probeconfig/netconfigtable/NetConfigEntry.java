
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.probeconfig.netconfigtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.probeconfig.NetConfigTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.probeconfig.netconfigtable.INetConfigEntry;
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

public class NetConfigEntry
    extends DeviceEntity
    implements Serializable, INetConfigEntry, IIndexed, IVariableBindingSetter
{

    private String netConfigIPAddress;
    private String netConfigSubnetMask;
    private int netConfigStatus;
    private String _index;
    private NetConfigTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NetConfigEntry() {
    }

    public String getNetConfigIPAddress() {
        return this.netConfigIPAddress;
    }

    public void setNetConfigIPAddress(String netConfigIPAddress) {
        String oldValue = getNetConfigIPAddress();
        this.netConfigIPAddress = netConfigIPAddress;
        notifyChange(1, oldValue, netConfigIPAddress);
    }

    public String getNetConfigSubnetMask() {
        return this.netConfigSubnetMask;
    }

    public void setNetConfigSubnetMask(String netConfigSubnetMask) {
        String oldValue = getNetConfigSubnetMask();
        this.netConfigSubnetMask = netConfigSubnetMask;
        notifyChange(2, oldValue, netConfigSubnetMask);
    }

    public int getNetConfigStatus() {
        return this.netConfigStatus;
    }

    public void setNetConfigStatus(int netConfigStatus) {
        int oldValue = getNetConfigStatus();
        this.netConfigStatus = netConfigStatus;
        notifyChange(3, oldValue, netConfigStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setNetConfigIPAddress(binding.getVariable().toString());
                break;
            case  2 :
                setNetConfigSubnetMask(binding.getVariable().toString());
                break;
            case  3 :
                setNetConfigStatus(binding.getVariable().toInt());
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

    public void _setTable(NetConfigTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("netConfigIPAddress", netConfigIPAddress).append("netConfigSubnetMask", netConfigSubnetMask).append("netConfigStatus", netConfigStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(netConfigIPAddress).append(netConfigSubnetMask).append(netConfigStatus).append(_index).toHashCode();
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
        NetConfigEntry rhs = ((NetConfigEntry) obj);
        return new EqualsBuilder().append(netConfigIPAddress, rhs.netConfigIPAddress).append(netConfigSubnetMask, rhs.netConfigSubnetMask).append(netConfigStatus, rhs.netConfigStatus).append(_index, rhs._index).isEquals();
    }

    public NetConfigEntry clone() {
        NetConfigEntry _copy = new NetConfigEntry();
        _copy.netConfigIPAddress = netConfigIPAddress;
        _copy.netConfigSubnetMask = netConfigSubnetMask;
        _copy.netConfigStatus = netConfigStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.19.11.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "netConfigIPAddress", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "netConfigSubnetMask", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "netConfigStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
