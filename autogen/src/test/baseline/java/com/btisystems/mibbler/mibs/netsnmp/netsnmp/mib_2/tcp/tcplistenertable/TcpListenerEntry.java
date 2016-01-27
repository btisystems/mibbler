
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.tcplistenertable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.tcplistenertable.ITcpListenerEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.TcpListenerTable;
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

public class TcpListenerEntry
    extends DeviceEntity
    implements Serializable, ITcpListenerEntry, IIndexed, IVariableBindingSetter
{

    private int tcpListenerLocalAddressType;
    private String tcpListenerLocalAddress;
    private int tcpListenerLocalPort;
    private int tcpListenerProcess;
    private String _index;
    private TcpListenerTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TcpListenerEntry() {
    }

    public int getTcpListenerLocalAddressType() {
        return this.tcpListenerLocalAddressType;
    }

    public void setTcpListenerLocalAddressType(int tcpListenerLocalAddressType) {
        int oldValue = getTcpListenerLocalAddressType();
        this.tcpListenerLocalAddressType = tcpListenerLocalAddressType;
        notifyChange(1, oldValue, tcpListenerLocalAddressType);
    }

    public String getTcpListenerLocalAddress() {
        return this.tcpListenerLocalAddress;
    }

    public void setTcpListenerLocalAddress(String tcpListenerLocalAddress) {
        String oldValue = getTcpListenerLocalAddress();
        this.tcpListenerLocalAddress = tcpListenerLocalAddress;
        notifyChange(2, oldValue, tcpListenerLocalAddress);
    }

    public int getTcpListenerLocalPort() {
        return this.tcpListenerLocalPort;
    }

    public void setTcpListenerLocalPort(int tcpListenerLocalPort) {
        int oldValue = getTcpListenerLocalPort();
        this.tcpListenerLocalPort = tcpListenerLocalPort;
        notifyChange(3, oldValue, tcpListenerLocalPort);
    }

    public int getTcpListenerProcess() {
        return this.tcpListenerProcess;
    }

    public void setTcpListenerProcess(int tcpListenerProcess) {
        int oldValue = getTcpListenerProcess();
        this.tcpListenerProcess = tcpListenerProcess;
        notifyChange(4, oldValue, tcpListenerProcess);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setTcpListenerLocalAddressType(binding.getVariable().toInt());
                break;
            case  2 :
                setTcpListenerLocalAddress(binding.getVariable().toString());
                break;
            case  3 :
                setTcpListenerLocalPort(binding.getVariable().toInt());
                break;
            case  4 :
                setTcpListenerProcess(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setTcpListenerLocalAddressType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setTcpListenerLocalAddress(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        setTcpListenerLocalPort(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(TcpListenerTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tcpListenerLocalAddressType", tcpListenerLocalAddressType).append("tcpListenerLocalAddress", tcpListenerLocalAddress).append("tcpListenerLocalPort", tcpListenerLocalPort).append("tcpListenerProcess", tcpListenerProcess).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tcpListenerLocalAddressType).append(tcpListenerLocalAddress).append(tcpListenerLocalPort).append(tcpListenerProcess).append(_index).toHashCode();
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
        TcpListenerEntry rhs = ((TcpListenerEntry) obj);
        return new EqualsBuilder().append(tcpListenerLocalAddressType, rhs.tcpListenerLocalAddressType).append(tcpListenerLocalAddress, rhs.tcpListenerLocalAddress).append(tcpListenerLocalPort, rhs.tcpListenerLocalPort).append(tcpListenerProcess, rhs.tcpListenerProcess).append(_index, rhs._index).isEquals();
    }

    public TcpListenerEntry clone() {
        TcpListenerEntry _copy = new TcpListenerEntry();
        _copy.tcpListenerLocalAddressType = tcpListenerLocalAddressType;
        _copy.tcpListenerLocalAddress = tcpListenerLocalAddress;
        _copy.tcpListenerLocalPort = tcpListenerLocalPort;
        _copy.tcpListenerProcess = tcpListenerProcess;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.6.20.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tcpListenerLocalAddressType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "tcpListenerLocalAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "tcpListenerLocalPort", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "tcpListenerProcess", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
