
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.udp.udpendpointtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.udp.udpendpointtable.IUdpEndpointEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.udp.UdpEndpointTable;
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

public class UdpEndpointEntry
    extends DeviceEntity
    implements Serializable, IUdpEndpointEntry, IIndexed, IVariableBindingSetter
{

    private int udpEndpointLocalAddressType;
    private String udpEndpointLocalAddress;
    private int udpEndpointLocalPort;
    private int udpEndpointRemoteAddressType;
    private String udpEndpointRemoteAddress;
    private int udpEndpointRemotePort;
    private int udpEndpointInstance;
    private int udpEndpointProcess;
    private String _index;
    private UdpEndpointTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public UdpEndpointEntry() {
    }

    public int getUdpEndpointLocalAddressType() {
        return this.udpEndpointLocalAddressType;
    }

    public void setUdpEndpointLocalAddressType(int udpEndpointLocalAddressType) {
        int oldValue = getUdpEndpointLocalAddressType();
        this.udpEndpointLocalAddressType = udpEndpointLocalAddressType;
        notifyChange(1, oldValue, udpEndpointLocalAddressType);
    }

    public String getUdpEndpointLocalAddress() {
        return this.udpEndpointLocalAddress;
    }

    public void setUdpEndpointLocalAddress(String udpEndpointLocalAddress) {
        String oldValue = getUdpEndpointLocalAddress();
        this.udpEndpointLocalAddress = udpEndpointLocalAddress;
        notifyChange(2, oldValue, udpEndpointLocalAddress);
    }

    public int getUdpEndpointLocalPort() {
        return this.udpEndpointLocalPort;
    }

    public void setUdpEndpointLocalPort(int udpEndpointLocalPort) {
        int oldValue = getUdpEndpointLocalPort();
        this.udpEndpointLocalPort = udpEndpointLocalPort;
        notifyChange(3, oldValue, udpEndpointLocalPort);
    }

    public int getUdpEndpointRemoteAddressType() {
        return this.udpEndpointRemoteAddressType;
    }

    public void setUdpEndpointRemoteAddressType(int udpEndpointRemoteAddressType) {
        int oldValue = getUdpEndpointRemoteAddressType();
        this.udpEndpointRemoteAddressType = udpEndpointRemoteAddressType;
        notifyChange(4, oldValue, udpEndpointRemoteAddressType);
    }

    public String getUdpEndpointRemoteAddress() {
        return this.udpEndpointRemoteAddress;
    }

    public void setUdpEndpointRemoteAddress(String udpEndpointRemoteAddress) {
        String oldValue = getUdpEndpointRemoteAddress();
        this.udpEndpointRemoteAddress = udpEndpointRemoteAddress;
        notifyChange(5, oldValue, udpEndpointRemoteAddress);
    }

    public int getUdpEndpointRemotePort() {
        return this.udpEndpointRemotePort;
    }

    public void setUdpEndpointRemotePort(int udpEndpointRemotePort) {
        int oldValue = getUdpEndpointRemotePort();
        this.udpEndpointRemotePort = udpEndpointRemotePort;
        notifyChange(6, oldValue, udpEndpointRemotePort);
    }

    public int getUdpEndpointInstance() {
        return this.udpEndpointInstance;
    }

    public void setUdpEndpointInstance(int udpEndpointInstance) {
        int oldValue = getUdpEndpointInstance();
        this.udpEndpointInstance = udpEndpointInstance;
        notifyChange(7, oldValue, udpEndpointInstance);
    }

    public int getUdpEndpointProcess() {
        return this.udpEndpointProcess;
    }

    public void setUdpEndpointProcess(int udpEndpointProcess) {
        int oldValue = getUdpEndpointProcess();
        this.udpEndpointProcess = udpEndpointProcess;
        notifyChange(8, oldValue, udpEndpointProcess);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setUdpEndpointLocalAddressType(binding.getVariable().toInt());
                break;
            case  2 :
                setUdpEndpointLocalAddress(binding.getVariable().toString());
                break;
            case  3 :
                setUdpEndpointLocalPort(binding.getVariable().toInt());
                break;
            case  4 :
                setUdpEndpointRemoteAddressType(binding.getVariable().toInt());
                break;
            case  5 :
                setUdpEndpointRemoteAddress(binding.getVariable().toString());
                break;
            case  6 :
                setUdpEndpointRemotePort(binding.getVariable().toInt());
                break;
            case  7 :
                setUdpEndpointInstance(binding.getVariable().toInt());
                break;
            case  8 :
                setUdpEndpointProcess(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setUdpEndpointLocalAddressType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setUdpEndpointLocalAddress(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        setUdpEndpointLocalPort(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setUdpEndpointRemoteAddressType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setUdpEndpointRemoteAddress(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        setUdpEndpointRemotePort(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setUdpEndpointInstance(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(UdpEndpointTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("udpEndpointLocalAddressType", udpEndpointLocalAddressType).append("udpEndpointLocalAddress", udpEndpointLocalAddress).append("udpEndpointLocalPort", udpEndpointLocalPort).append("udpEndpointRemoteAddressType", udpEndpointRemoteAddressType).append("udpEndpointRemoteAddress", udpEndpointRemoteAddress).append("udpEndpointRemotePort", udpEndpointRemotePort).append("udpEndpointInstance", udpEndpointInstance).append("udpEndpointProcess", udpEndpointProcess).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(udpEndpointLocalAddressType).append(udpEndpointLocalAddress).append(udpEndpointLocalPort).append(udpEndpointRemoteAddressType).append(udpEndpointRemoteAddress).append(udpEndpointRemotePort).append(udpEndpointInstance).append(udpEndpointProcess).append(_index).toHashCode();
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
        UdpEndpointEntry rhs = ((UdpEndpointEntry) obj);
        return new EqualsBuilder().append(udpEndpointLocalAddressType, rhs.udpEndpointLocalAddressType).append(udpEndpointLocalAddress, rhs.udpEndpointLocalAddress).append(udpEndpointLocalPort, rhs.udpEndpointLocalPort).append(udpEndpointRemoteAddressType, rhs.udpEndpointRemoteAddressType).append(udpEndpointRemoteAddress, rhs.udpEndpointRemoteAddress).append(udpEndpointRemotePort, rhs.udpEndpointRemotePort).append(udpEndpointInstance, rhs.udpEndpointInstance).append(udpEndpointProcess, rhs.udpEndpointProcess).append(_index, rhs._index).isEquals();
    }

    public UdpEndpointEntry clone() {
        UdpEndpointEntry _copy = new UdpEndpointEntry();
        _copy.udpEndpointLocalAddressType = udpEndpointLocalAddressType;
        _copy.udpEndpointLocalAddress = udpEndpointLocalAddress;
        _copy.udpEndpointLocalPort = udpEndpointLocalPort;
        _copy.udpEndpointRemoteAddressType = udpEndpointRemoteAddressType;
        _copy.udpEndpointRemoteAddress = udpEndpointRemoteAddress;
        _copy.udpEndpointRemotePort = udpEndpointRemotePort;
        _copy.udpEndpointInstance = udpEndpointInstance;
        _copy.udpEndpointProcess = udpEndpointProcess;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.7.7.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "udpEndpointLocalAddressType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "udpEndpointLocalAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "udpEndpointLocalPort", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "udpEndpointRemoteAddressType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "udpEndpointRemoteAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "udpEndpointRemotePort", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "udpEndpointInstance", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "udpEndpointProcess", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
