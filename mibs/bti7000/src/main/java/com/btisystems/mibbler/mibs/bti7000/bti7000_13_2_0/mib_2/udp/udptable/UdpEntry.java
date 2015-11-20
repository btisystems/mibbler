
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.udp.udptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.udp.UdpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.udp.udptable.IUdpEntry;
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

public class UdpEntry
    extends DeviceEntity
    implements Serializable, IUdpEntry, IIndexed, IVariableBindingSetter
{

    private String udpLocalAddress;
    private int udpLocalPort;
    private String _index;
    private UdpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public UdpEntry() {
    }

    public String getUdpLocalAddress() {
        return this.udpLocalAddress;
    }

    public void setUdpLocalAddress(String udpLocalAddress) {
        String oldValue = getUdpLocalAddress();
        this.udpLocalAddress = udpLocalAddress;
        notifyChange(1, oldValue, udpLocalAddress);
    }

    public int getUdpLocalPort() {
        return this.udpLocalPort;
    }

    public void setUdpLocalPort(int udpLocalPort) {
        int oldValue = getUdpLocalPort();
        this.udpLocalPort = udpLocalPort;
        notifyChange(2, oldValue, udpLocalPort);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setUdpLocalAddress(binding.getVariable().toString());
                break;
            case  2 :
                setUdpLocalPort(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setUdpLocalAddress(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
        setUdpLocalPort(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(UdpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("udpLocalAddress", udpLocalAddress).append("udpLocalPort", udpLocalPort).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(udpLocalAddress).append(udpLocalPort).append(_index).toHashCode();
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
        UdpEntry rhs = ((UdpEntry) obj);
        return new EqualsBuilder().append(udpLocalAddress, rhs.udpLocalAddress).append(udpLocalPort, rhs.udpLocalPort).append(_index, rhs._index).isEquals();
    }

    public UdpEntry clone() {
        UdpEntry _copy = new UdpEntry();
        _copy.udpLocalAddress = udpLocalAddress;
        _copy.udpLocalPort = udpLocalPort;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.7.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "udpLocalAddress", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "udpLocalPort", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
