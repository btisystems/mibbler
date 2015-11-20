
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.hosts.hosttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.hosts.HostTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.hosts.hosttable.IHostEntry;
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

public class HostEntry
    extends DeviceEntity
    implements Serializable, IHostEntry, IIndexed, IVariableBindingSetter
{

    private String hostAddress;
    private int hostCreationOrder;
    private int hostIndex;
    private int hostInPkts;
    private int hostOutPkts;
    private int hostInOctets;
    private int hostOutOctets;
    private int hostOutErrors;
    private int hostOutBroadcastPkts;
    private int hostOutMulticastPkts;
    private String _index;
    private HostTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HostEntry() {
    }

    public String getHostAddress() {
        return this.hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        String oldValue = getHostAddress();
        this.hostAddress = hostAddress;
        notifyChange(1, oldValue, hostAddress);
    }

    public int getHostCreationOrder() {
        return this.hostCreationOrder;
    }

    public void setHostCreationOrder(int hostCreationOrder) {
        int oldValue = getHostCreationOrder();
        this.hostCreationOrder = hostCreationOrder;
        notifyChange(2, oldValue, hostCreationOrder);
    }

    public int getHostIndex() {
        return this.hostIndex;
    }

    public void setHostIndex(int hostIndex) {
        int oldValue = getHostIndex();
        this.hostIndex = hostIndex;
        notifyChange(3, oldValue, hostIndex);
    }

    public int getHostInPkts() {
        return this.hostInPkts;
    }

    public void setHostInPkts(int hostInPkts) {
        int oldValue = getHostInPkts();
        this.hostInPkts = hostInPkts;
        notifyChange(4, oldValue, hostInPkts);
    }

    public int getHostOutPkts() {
        return this.hostOutPkts;
    }

    public void setHostOutPkts(int hostOutPkts) {
        int oldValue = getHostOutPkts();
        this.hostOutPkts = hostOutPkts;
        notifyChange(5, oldValue, hostOutPkts);
    }

    public int getHostInOctets() {
        return this.hostInOctets;
    }

    public void setHostInOctets(int hostInOctets) {
        int oldValue = getHostInOctets();
        this.hostInOctets = hostInOctets;
        notifyChange(6, oldValue, hostInOctets);
    }

    public int getHostOutOctets() {
        return this.hostOutOctets;
    }

    public void setHostOutOctets(int hostOutOctets) {
        int oldValue = getHostOutOctets();
        this.hostOutOctets = hostOutOctets;
        notifyChange(7, oldValue, hostOutOctets);
    }

    public int getHostOutErrors() {
        return this.hostOutErrors;
    }

    public void setHostOutErrors(int hostOutErrors) {
        int oldValue = getHostOutErrors();
        this.hostOutErrors = hostOutErrors;
        notifyChange(8, oldValue, hostOutErrors);
    }

    public int getHostOutBroadcastPkts() {
        return this.hostOutBroadcastPkts;
    }

    public void setHostOutBroadcastPkts(int hostOutBroadcastPkts) {
        int oldValue = getHostOutBroadcastPkts();
        this.hostOutBroadcastPkts = hostOutBroadcastPkts;
        notifyChange(9, oldValue, hostOutBroadcastPkts);
    }

    public int getHostOutMulticastPkts() {
        return this.hostOutMulticastPkts;
    }

    public void setHostOutMulticastPkts(int hostOutMulticastPkts) {
        int oldValue = getHostOutMulticastPkts();
        this.hostOutMulticastPkts = hostOutMulticastPkts;
        notifyChange(10, oldValue, hostOutMulticastPkts);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHostAddress(binding.getVariable().toString());
                break;
            case  2 :
                setHostCreationOrder(binding.getVariable().toInt());
                break;
            case  3 :
                setHostIndex(binding.getVariable().toInt());
                break;
            case  4 :
                setHostInPkts(binding.getVariable().toInt());
                break;
            case  5 :
                setHostOutPkts(binding.getVariable().toInt());
                break;
            case  6 :
                setHostInOctets(binding.getVariable().toInt());
                break;
            case  7 :
                setHostOutOctets(binding.getVariable().toInt());
                break;
            case  8 :
                setHostOutErrors(binding.getVariable().toInt());
                break;
            case  9 :
                setHostOutBroadcastPkts(binding.getVariable().toInt());
                break;
            case  10 :
                setHostOutMulticastPkts(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHostIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setHostAddress(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HostTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hostAddress", hostAddress).append("hostCreationOrder", hostCreationOrder).append("hostIndex", hostIndex).append("hostInPkts", hostInPkts).append("hostOutPkts", hostOutPkts).append("hostInOctets", hostInOctets).append("hostOutOctets", hostOutOctets).append("hostOutErrors", hostOutErrors).append("hostOutBroadcastPkts", hostOutBroadcastPkts).append("hostOutMulticastPkts", hostOutMulticastPkts).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hostAddress).append(hostCreationOrder).append(hostIndex).append(hostInPkts).append(hostOutPkts).append(hostInOctets).append(hostOutOctets).append(hostOutErrors).append(hostOutBroadcastPkts).append(hostOutMulticastPkts).append(_index).toHashCode();
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
        HostEntry rhs = ((HostEntry) obj);
        return new EqualsBuilder().append(hostAddress, rhs.hostAddress).append(hostCreationOrder, rhs.hostCreationOrder).append(hostIndex, rhs.hostIndex).append(hostInPkts, rhs.hostInPkts).append(hostOutPkts, rhs.hostOutPkts).append(hostInOctets, rhs.hostInOctets).append(hostOutOctets, rhs.hostOutOctets).append(hostOutErrors, rhs.hostOutErrors).append(hostOutBroadcastPkts, rhs.hostOutBroadcastPkts).append(hostOutMulticastPkts, rhs.hostOutMulticastPkts).append(_index, rhs._index).isEquals();
    }

    public HostEntry clone() {
        HostEntry _copy = new HostEntry();
        _copy.hostAddress = hostAddress;
        _copy.hostCreationOrder = hostCreationOrder;
        _copy.hostIndex = hostIndex;
        _copy.hostInPkts = hostInPkts;
        _copy.hostOutPkts = hostOutPkts;
        _copy.hostInOctets = hostInOctets;
        _copy.hostOutOctets = hostOutOctets;
        _copy.hostOutErrors = hostOutErrors;
        _copy.hostOutBroadcastPkts = hostOutBroadcastPkts;
        _copy.hostOutMulticastPkts = hostOutMulticastPkts;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.4.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hostAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hostCreationOrder", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hostIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hostInPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hostOutPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "hostInOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "hostOutOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "hostOutErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "hostOutBroadcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "hostOutMulticastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
