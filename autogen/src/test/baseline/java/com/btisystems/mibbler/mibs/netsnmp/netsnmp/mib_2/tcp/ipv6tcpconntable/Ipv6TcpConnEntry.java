
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.ipv6tcpconntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.ipv6tcpconntable.IIpv6TcpConnEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.Ipv6TcpConnTable;
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

public class Ipv6TcpConnEntry
    extends DeviceEntity
    implements Serializable, IIpv6TcpConnEntry, IIndexed, IVariableBindingSetter
{

    private String ipv6TcpConnLocalAddress;
    private int ipv6TcpConnLocalPort;
    private String ipv6TcpConnRemAddress;
    private int ipv6TcpConnRemPort;
    private int ipv6TcpConnIfIndex;
    private int ipv6TcpConnState;
    private String _index;
    private Ipv6TcpConnTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6TcpConnEntry() {
    }

    public String getIpv6TcpConnLocalAddress() {
        return this.ipv6TcpConnLocalAddress;
    }

    public void setIpv6TcpConnLocalAddress(String ipv6TcpConnLocalAddress) {
        String oldValue = getIpv6TcpConnLocalAddress();
        this.ipv6TcpConnLocalAddress = ipv6TcpConnLocalAddress;
        notifyChange(1, oldValue, ipv6TcpConnLocalAddress);
    }

    public int getIpv6TcpConnLocalPort() {
        return this.ipv6TcpConnLocalPort;
    }

    public void setIpv6TcpConnLocalPort(int ipv6TcpConnLocalPort) {
        int oldValue = getIpv6TcpConnLocalPort();
        this.ipv6TcpConnLocalPort = ipv6TcpConnLocalPort;
        notifyChange(2, oldValue, ipv6TcpConnLocalPort);
    }

    public String getIpv6TcpConnRemAddress() {
        return this.ipv6TcpConnRemAddress;
    }

    public void setIpv6TcpConnRemAddress(String ipv6TcpConnRemAddress) {
        String oldValue = getIpv6TcpConnRemAddress();
        this.ipv6TcpConnRemAddress = ipv6TcpConnRemAddress;
        notifyChange(3, oldValue, ipv6TcpConnRemAddress);
    }

    public int getIpv6TcpConnRemPort() {
        return this.ipv6TcpConnRemPort;
    }

    public void setIpv6TcpConnRemPort(int ipv6TcpConnRemPort) {
        int oldValue = getIpv6TcpConnRemPort();
        this.ipv6TcpConnRemPort = ipv6TcpConnRemPort;
        notifyChange(4, oldValue, ipv6TcpConnRemPort);
    }

    public int getIpv6TcpConnIfIndex() {
        return this.ipv6TcpConnIfIndex;
    }

    public void setIpv6TcpConnIfIndex(int ipv6TcpConnIfIndex) {
        int oldValue = getIpv6TcpConnIfIndex();
        this.ipv6TcpConnIfIndex = ipv6TcpConnIfIndex;
        notifyChange(5, oldValue, ipv6TcpConnIfIndex);
    }

    public int getIpv6TcpConnState() {
        return this.ipv6TcpConnState;
    }

    public void setIpv6TcpConnState(int ipv6TcpConnState) {
        int oldValue = getIpv6TcpConnState();
        this.ipv6TcpConnState = ipv6TcpConnState;
        notifyChange(6, oldValue, ipv6TcpConnState);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpv6TcpConnLocalAddress(binding.getVariable().toString());
                break;
            case  2 :
                setIpv6TcpConnLocalPort(binding.getVariable().toInt());
                break;
            case  3 :
                setIpv6TcpConnRemAddress(binding.getVariable().toString());
                break;
            case  4 :
                setIpv6TcpConnRemPort(binding.getVariable().toInt());
                break;
            case  5 :
                setIpv6TcpConnIfIndex(binding.getVariable().toInt());
                break;
            case  6 :
                setIpv6TcpConnState(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpv6TcpConnLocalAddress(new String(_oidBytes, arrayOffset, 16));
        arrayOffset += 16;
        setIpv6TcpConnLocalPort(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIpv6TcpConnRemAddress(new String(_oidBytes, arrayOffset, 16));
        arrayOffset += 16;
        setIpv6TcpConnRemPort(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIpv6TcpConnIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Ipv6TcpConnTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6TcpConnLocalAddress", ipv6TcpConnLocalAddress).append("ipv6TcpConnLocalPort", ipv6TcpConnLocalPort).append("ipv6TcpConnRemAddress", ipv6TcpConnRemAddress).append("ipv6TcpConnRemPort", ipv6TcpConnRemPort).append("ipv6TcpConnIfIndex", ipv6TcpConnIfIndex).append("ipv6TcpConnState", ipv6TcpConnState).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6TcpConnLocalAddress).append(ipv6TcpConnLocalPort).append(ipv6TcpConnRemAddress).append(ipv6TcpConnRemPort).append(ipv6TcpConnIfIndex).append(ipv6TcpConnState).append(_index).toHashCode();
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
        Ipv6TcpConnEntry rhs = ((Ipv6TcpConnEntry) obj);
        return new EqualsBuilder().append(ipv6TcpConnLocalAddress, rhs.ipv6TcpConnLocalAddress).append(ipv6TcpConnLocalPort, rhs.ipv6TcpConnLocalPort).append(ipv6TcpConnRemAddress, rhs.ipv6TcpConnRemAddress).append(ipv6TcpConnRemPort, rhs.ipv6TcpConnRemPort).append(ipv6TcpConnIfIndex, rhs.ipv6TcpConnIfIndex).append(ipv6TcpConnState, rhs.ipv6TcpConnState).append(_index, rhs._index).isEquals();
    }

    public Ipv6TcpConnEntry clone() {
        Ipv6TcpConnEntry _copy = new Ipv6TcpConnEntry();
        _copy.ipv6TcpConnLocalAddress = ipv6TcpConnLocalAddress;
        _copy.ipv6TcpConnLocalPort = ipv6TcpConnLocalPort;
        _copy.ipv6TcpConnRemAddress = ipv6TcpConnRemAddress;
        _copy.ipv6TcpConnRemPort = ipv6TcpConnRemPort;
        _copy.ipv6TcpConnIfIndex = ipv6TcpConnIfIndex;
        _copy.ipv6TcpConnState = ipv6TcpConnState;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.6.16.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6TcpConnLocalAddress", DeviceEntityDescription.FieldType.STRING, 40));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6TcpConnLocalPort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6TcpConnRemAddress", DeviceEntityDescription.FieldType.STRING, 40));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipv6TcpConnRemPort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipv6TcpConnIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipv6TcpConnState", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
