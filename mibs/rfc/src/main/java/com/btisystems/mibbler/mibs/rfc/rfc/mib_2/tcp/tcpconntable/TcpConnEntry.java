
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.tcp.tcpconntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.tcp.tcpconntable.ITcpConnEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.tcp.TcpConnTable;
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

public class TcpConnEntry
    extends DeviceEntity
    implements Serializable, ITcpConnEntry, IIndexed, IVariableBindingSetter
{

    private int tcpConnState;
    private String tcpConnLocalAddress;
    private int tcpConnLocalPort;
    private String tcpConnRemAddress;
    private int tcpConnRemPort;
    private String _index;
    private TcpConnTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TcpConnEntry() {
    }

    public int getTcpConnState() {
        return this.tcpConnState;
    }

    public void setTcpConnState(int tcpConnState) {
        int oldValue = getTcpConnState();
        this.tcpConnState = tcpConnState;
        notifyChange(1, oldValue, tcpConnState);
    }

    public String getTcpConnLocalAddress() {
        return this.tcpConnLocalAddress;
    }

    public void setTcpConnLocalAddress(String tcpConnLocalAddress) {
        String oldValue = getTcpConnLocalAddress();
        this.tcpConnLocalAddress = tcpConnLocalAddress;
        notifyChange(2, oldValue, tcpConnLocalAddress);
    }

    public int getTcpConnLocalPort() {
        return this.tcpConnLocalPort;
    }

    public void setTcpConnLocalPort(int tcpConnLocalPort) {
        int oldValue = getTcpConnLocalPort();
        this.tcpConnLocalPort = tcpConnLocalPort;
        notifyChange(3, oldValue, tcpConnLocalPort);
    }

    public String getTcpConnRemAddress() {
        return this.tcpConnRemAddress;
    }

    public void setTcpConnRemAddress(String tcpConnRemAddress) {
        String oldValue = getTcpConnRemAddress();
        this.tcpConnRemAddress = tcpConnRemAddress;
        notifyChange(4, oldValue, tcpConnRemAddress);
    }

    public int getTcpConnRemPort() {
        return this.tcpConnRemPort;
    }

    public void setTcpConnRemPort(int tcpConnRemPort) {
        int oldValue = getTcpConnRemPort();
        this.tcpConnRemPort = tcpConnRemPort;
        notifyChange(5, oldValue, tcpConnRemPort);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setTcpConnState(binding.getVariable().toInt());
                break;
            case  2 :
                setTcpConnLocalAddress(binding.getVariable().toString());
                break;
            case  3 :
                setTcpConnLocalPort(binding.getVariable().toInt());
                break;
            case  4 :
                setTcpConnRemAddress(binding.getVariable().toString());
                break;
            case  5 :
                setTcpConnRemPort(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setTcpConnLocalAddress(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
        setTcpConnLocalPort(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setTcpConnRemAddress(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
        setTcpConnRemPort(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(TcpConnTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tcpConnState", tcpConnState).append("tcpConnLocalAddress", tcpConnLocalAddress).append("tcpConnLocalPort", tcpConnLocalPort).append("tcpConnRemAddress", tcpConnRemAddress).append("tcpConnRemPort", tcpConnRemPort).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tcpConnState).append(tcpConnLocalAddress).append(tcpConnLocalPort).append(tcpConnRemAddress).append(tcpConnRemPort).append(_index).toHashCode();
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
        TcpConnEntry rhs = ((TcpConnEntry) obj);
        return new EqualsBuilder().append(tcpConnState, rhs.tcpConnState).append(tcpConnLocalAddress, rhs.tcpConnLocalAddress).append(tcpConnLocalPort, rhs.tcpConnLocalPort).append(tcpConnRemAddress, rhs.tcpConnRemAddress).append(tcpConnRemPort, rhs.tcpConnRemPort).append(_index, rhs._index).isEquals();
    }

    public TcpConnEntry clone() {
        TcpConnEntry _copy = new TcpConnEntry();
        _copy.tcpConnState = tcpConnState;
        _copy.tcpConnLocalAddress = tcpConnLocalAddress;
        _copy.tcpConnLocalPort = tcpConnLocalPort;
        _copy.tcpConnRemAddress = tcpConnRemAddress;
        _copy.tcpConnRemPort = tcpConnRemPort;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.6.13.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tcpConnState", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "tcpConnLocalAddress", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "tcpConnLocalPort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "tcpConnRemAddress", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "tcpConnRemPort", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
