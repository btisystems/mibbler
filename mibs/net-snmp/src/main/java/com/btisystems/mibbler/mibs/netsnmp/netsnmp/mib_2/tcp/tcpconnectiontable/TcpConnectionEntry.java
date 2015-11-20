
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.tcpconnectiontable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.tcp.tcpconnectiontable.ITcpConnectionEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.TcpConnectionTable;
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

public class TcpConnectionEntry
    extends DeviceEntity
    implements Serializable, ITcpConnectionEntry, IIndexed, IVariableBindingSetter
{

    private int tcpConnectionLocalAddressType;
    private String tcpConnectionLocalAddress;
    private int tcpConnectionLocalPort;
    private int tcpConnectionRemAddressType;
    private String tcpConnectionRemAddress;
    private int tcpConnectionRemPort;
    private int tcpConnectionState;
    private int tcpConnectionProcess;
    private String _index;
    private TcpConnectionTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TcpConnectionEntry() {
    }

    public int getTcpConnectionLocalAddressType() {
        return this.tcpConnectionLocalAddressType;
    }

    public void setTcpConnectionLocalAddressType(int tcpConnectionLocalAddressType) {
        int oldValue = getTcpConnectionLocalAddressType();
        this.tcpConnectionLocalAddressType = tcpConnectionLocalAddressType;
        notifyChange(1, oldValue, tcpConnectionLocalAddressType);
    }

    public String getTcpConnectionLocalAddress() {
        return this.tcpConnectionLocalAddress;
    }

    public void setTcpConnectionLocalAddress(String tcpConnectionLocalAddress) {
        String oldValue = getTcpConnectionLocalAddress();
        this.tcpConnectionLocalAddress = tcpConnectionLocalAddress;
        notifyChange(2, oldValue, tcpConnectionLocalAddress);
    }

    public int getTcpConnectionLocalPort() {
        return this.tcpConnectionLocalPort;
    }

    public void setTcpConnectionLocalPort(int tcpConnectionLocalPort) {
        int oldValue = getTcpConnectionLocalPort();
        this.tcpConnectionLocalPort = tcpConnectionLocalPort;
        notifyChange(3, oldValue, tcpConnectionLocalPort);
    }

    public int getTcpConnectionRemAddressType() {
        return this.tcpConnectionRemAddressType;
    }

    public void setTcpConnectionRemAddressType(int tcpConnectionRemAddressType) {
        int oldValue = getTcpConnectionRemAddressType();
        this.tcpConnectionRemAddressType = tcpConnectionRemAddressType;
        notifyChange(4, oldValue, tcpConnectionRemAddressType);
    }

    public String getTcpConnectionRemAddress() {
        return this.tcpConnectionRemAddress;
    }

    public void setTcpConnectionRemAddress(String tcpConnectionRemAddress) {
        String oldValue = getTcpConnectionRemAddress();
        this.tcpConnectionRemAddress = tcpConnectionRemAddress;
        notifyChange(5, oldValue, tcpConnectionRemAddress);
    }

    public int getTcpConnectionRemPort() {
        return this.tcpConnectionRemPort;
    }

    public void setTcpConnectionRemPort(int tcpConnectionRemPort) {
        int oldValue = getTcpConnectionRemPort();
        this.tcpConnectionRemPort = tcpConnectionRemPort;
        notifyChange(6, oldValue, tcpConnectionRemPort);
    }

    public int getTcpConnectionState() {
        return this.tcpConnectionState;
    }

    public void setTcpConnectionState(int tcpConnectionState) {
        int oldValue = getTcpConnectionState();
        this.tcpConnectionState = tcpConnectionState;
        notifyChange(7, oldValue, tcpConnectionState);
    }

    public int getTcpConnectionProcess() {
        return this.tcpConnectionProcess;
    }

    public void setTcpConnectionProcess(int tcpConnectionProcess) {
        int oldValue = getTcpConnectionProcess();
        this.tcpConnectionProcess = tcpConnectionProcess;
        notifyChange(8, oldValue, tcpConnectionProcess);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setTcpConnectionLocalAddressType(binding.getVariable().toInt());
                break;
            case  2 :
                setTcpConnectionLocalAddress(binding.getVariable().toString());
                break;
            case  3 :
                setTcpConnectionLocalPort(binding.getVariable().toInt());
                break;
            case  4 :
                setTcpConnectionRemAddressType(binding.getVariable().toInt());
                break;
            case  5 :
                setTcpConnectionRemAddress(binding.getVariable().toString());
                break;
            case  6 :
                setTcpConnectionRemPort(binding.getVariable().toInt());
                break;
            case  7 :
                setTcpConnectionState(binding.getVariable().toInt());
                break;
            case  8 :
                setTcpConnectionProcess(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setTcpConnectionLocalAddressType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setTcpConnectionLocalAddress(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        setTcpConnectionLocalPort(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setTcpConnectionRemAddressType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setTcpConnectionRemAddress(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        setTcpConnectionRemPort(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(TcpConnectionTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tcpConnectionLocalAddressType", tcpConnectionLocalAddressType).append("tcpConnectionLocalAddress", tcpConnectionLocalAddress).append("tcpConnectionLocalPort", tcpConnectionLocalPort).append("tcpConnectionRemAddressType", tcpConnectionRemAddressType).append("tcpConnectionRemAddress", tcpConnectionRemAddress).append("tcpConnectionRemPort", tcpConnectionRemPort).append("tcpConnectionState", tcpConnectionState).append("tcpConnectionProcess", tcpConnectionProcess).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tcpConnectionLocalAddressType).append(tcpConnectionLocalAddress).append(tcpConnectionLocalPort).append(tcpConnectionRemAddressType).append(tcpConnectionRemAddress).append(tcpConnectionRemPort).append(tcpConnectionState).append(tcpConnectionProcess).append(_index).toHashCode();
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
        TcpConnectionEntry rhs = ((TcpConnectionEntry) obj);
        return new EqualsBuilder().append(tcpConnectionLocalAddressType, rhs.tcpConnectionLocalAddressType).append(tcpConnectionLocalAddress, rhs.tcpConnectionLocalAddress).append(tcpConnectionLocalPort, rhs.tcpConnectionLocalPort).append(tcpConnectionRemAddressType, rhs.tcpConnectionRemAddressType).append(tcpConnectionRemAddress, rhs.tcpConnectionRemAddress).append(tcpConnectionRemPort, rhs.tcpConnectionRemPort).append(tcpConnectionState, rhs.tcpConnectionState).append(tcpConnectionProcess, rhs.tcpConnectionProcess).append(_index, rhs._index).isEquals();
    }

    public TcpConnectionEntry clone() {
        TcpConnectionEntry _copy = new TcpConnectionEntry();
        _copy.tcpConnectionLocalAddressType = tcpConnectionLocalAddressType;
        _copy.tcpConnectionLocalAddress = tcpConnectionLocalAddress;
        _copy.tcpConnectionLocalPort = tcpConnectionLocalPort;
        _copy.tcpConnectionRemAddressType = tcpConnectionRemAddressType;
        _copy.tcpConnectionRemAddress = tcpConnectionRemAddress;
        _copy.tcpConnectionRemPort = tcpConnectionRemPort;
        _copy.tcpConnectionState = tcpConnectionState;
        _copy.tcpConnectionProcess = tcpConnectionProcess;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.6.19.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tcpConnectionLocalAddressType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "tcpConnectionLocalAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "tcpConnectionLocalPort", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "tcpConnectionRemAddressType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "tcpConnectionRemAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "tcpConnectionRemPort", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "tcpConnectionState", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "tcpConnectionProcess", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
