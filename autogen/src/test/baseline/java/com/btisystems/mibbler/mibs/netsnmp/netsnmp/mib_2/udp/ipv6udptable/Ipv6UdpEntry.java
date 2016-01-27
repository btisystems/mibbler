
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.udp.ipv6udptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp.ipv6udptable.IIpv6UdpEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.udp.Ipv6UdpTable;
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

public class Ipv6UdpEntry
    extends DeviceEntity
    implements Serializable, IIpv6UdpEntry, IIndexed, IVariableBindingSetter
{

    private String ipv6UdpLocalAddress;
    private int ipv6UdpLocalPort;
    private int ipv6UdpIfIndex;
    private String _index;
    private Ipv6UdpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6UdpEntry() {
    }

    public String getIpv6UdpLocalAddress() {
        return this.ipv6UdpLocalAddress;
    }

    public void setIpv6UdpLocalAddress(String ipv6UdpLocalAddress) {
        String oldValue = getIpv6UdpLocalAddress();
        this.ipv6UdpLocalAddress = ipv6UdpLocalAddress;
        notifyChange(1, oldValue, ipv6UdpLocalAddress);
    }

    public int getIpv6UdpLocalPort() {
        return this.ipv6UdpLocalPort;
    }

    public void setIpv6UdpLocalPort(int ipv6UdpLocalPort) {
        int oldValue = getIpv6UdpLocalPort();
        this.ipv6UdpLocalPort = ipv6UdpLocalPort;
        notifyChange(2, oldValue, ipv6UdpLocalPort);
    }

    public int getIpv6UdpIfIndex() {
        return this.ipv6UdpIfIndex;
    }

    public void setIpv6UdpIfIndex(int ipv6UdpIfIndex) {
        int oldValue = getIpv6UdpIfIndex();
        this.ipv6UdpIfIndex = ipv6UdpIfIndex;
        notifyChange(3, oldValue, ipv6UdpIfIndex);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpv6UdpLocalAddress(binding.getVariable().toString());
                break;
            case  2 :
                setIpv6UdpLocalPort(binding.getVariable().toInt());
                break;
            case  3 :
                setIpv6UdpIfIndex(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpv6UdpLocalAddress(new String(_oidBytes, arrayOffset, 16));
        arrayOffset += 16;
        setIpv6UdpLocalPort(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIpv6UdpIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Ipv6UdpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6UdpLocalAddress", ipv6UdpLocalAddress).append("ipv6UdpLocalPort", ipv6UdpLocalPort).append("ipv6UdpIfIndex", ipv6UdpIfIndex).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6UdpLocalAddress).append(ipv6UdpLocalPort).append(ipv6UdpIfIndex).append(_index).toHashCode();
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
        Ipv6UdpEntry rhs = ((Ipv6UdpEntry) obj);
        return new EqualsBuilder().append(ipv6UdpLocalAddress, rhs.ipv6UdpLocalAddress).append(ipv6UdpLocalPort, rhs.ipv6UdpLocalPort).append(ipv6UdpIfIndex, rhs.ipv6UdpIfIndex).append(_index, rhs._index).isEquals();
    }

    public Ipv6UdpEntry clone() {
        Ipv6UdpEntry _copy = new Ipv6UdpEntry();
        _copy.ipv6UdpLocalAddress = ipv6UdpLocalAddress;
        _copy.ipv6UdpLocalPort = ipv6UdpLocalPort;
        _copy.ipv6UdpIfIndex = ipv6UdpIfIndex;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.7.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6UdpLocalAddress", DeviceEntityDescription.FieldType.STRING, 40));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6UdpLocalPort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6UdpIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
