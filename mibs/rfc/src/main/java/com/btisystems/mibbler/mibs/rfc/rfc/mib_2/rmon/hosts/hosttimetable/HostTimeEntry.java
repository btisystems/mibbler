
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.hosts.hosttimetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.hosts.hosttimetable.IHostTimeEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.hosts.HostTimeTable;
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

public class HostTimeEntry
    extends DeviceEntity
    implements Serializable, IHostTimeEntry, IIndexed, IVariableBindingSetter
{

    private String hostTimeAddress;
    private int hostTimeCreationOrder;
    private int hostTimeIndex;
    private int hostTimeInPkts;
    private int hostTimeOutPkts;
    private int hostTimeInOctets;
    private int hostTimeOutOctets;
    private int hostTimeOutErrors;
    private int hostTimeOutBroadcastPkts;
    private int hostTimeOutMulticastPkts;
    private String _index;
    private HostTimeTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HostTimeEntry() {
    }

    public String getHostTimeAddress() {
        return this.hostTimeAddress;
    }

    public void setHostTimeAddress(String hostTimeAddress) {
        String oldValue = getHostTimeAddress();
        this.hostTimeAddress = hostTimeAddress;
        notifyChange(1, oldValue, hostTimeAddress);
    }

    public int getHostTimeCreationOrder() {
        return this.hostTimeCreationOrder;
    }

    public void setHostTimeCreationOrder(int hostTimeCreationOrder) {
        int oldValue = getHostTimeCreationOrder();
        this.hostTimeCreationOrder = hostTimeCreationOrder;
        notifyChange(2, oldValue, hostTimeCreationOrder);
    }

    public int getHostTimeIndex() {
        return this.hostTimeIndex;
    }

    public void setHostTimeIndex(int hostTimeIndex) {
        int oldValue = getHostTimeIndex();
        this.hostTimeIndex = hostTimeIndex;
        notifyChange(3, oldValue, hostTimeIndex);
    }

    public int getHostTimeInPkts() {
        return this.hostTimeInPkts;
    }

    public void setHostTimeInPkts(int hostTimeInPkts) {
        int oldValue = getHostTimeInPkts();
        this.hostTimeInPkts = hostTimeInPkts;
        notifyChange(4, oldValue, hostTimeInPkts);
    }

    public int getHostTimeOutPkts() {
        return this.hostTimeOutPkts;
    }

    public void setHostTimeOutPkts(int hostTimeOutPkts) {
        int oldValue = getHostTimeOutPkts();
        this.hostTimeOutPkts = hostTimeOutPkts;
        notifyChange(5, oldValue, hostTimeOutPkts);
    }

    public int getHostTimeInOctets() {
        return this.hostTimeInOctets;
    }

    public void setHostTimeInOctets(int hostTimeInOctets) {
        int oldValue = getHostTimeInOctets();
        this.hostTimeInOctets = hostTimeInOctets;
        notifyChange(6, oldValue, hostTimeInOctets);
    }

    public int getHostTimeOutOctets() {
        return this.hostTimeOutOctets;
    }

    public void setHostTimeOutOctets(int hostTimeOutOctets) {
        int oldValue = getHostTimeOutOctets();
        this.hostTimeOutOctets = hostTimeOutOctets;
        notifyChange(7, oldValue, hostTimeOutOctets);
    }

    public int getHostTimeOutErrors() {
        return this.hostTimeOutErrors;
    }

    public void setHostTimeOutErrors(int hostTimeOutErrors) {
        int oldValue = getHostTimeOutErrors();
        this.hostTimeOutErrors = hostTimeOutErrors;
        notifyChange(8, oldValue, hostTimeOutErrors);
    }

    public int getHostTimeOutBroadcastPkts() {
        return this.hostTimeOutBroadcastPkts;
    }

    public void setHostTimeOutBroadcastPkts(int hostTimeOutBroadcastPkts) {
        int oldValue = getHostTimeOutBroadcastPkts();
        this.hostTimeOutBroadcastPkts = hostTimeOutBroadcastPkts;
        notifyChange(9, oldValue, hostTimeOutBroadcastPkts);
    }

    public int getHostTimeOutMulticastPkts() {
        return this.hostTimeOutMulticastPkts;
    }

    public void setHostTimeOutMulticastPkts(int hostTimeOutMulticastPkts) {
        int oldValue = getHostTimeOutMulticastPkts();
        this.hostTimeOutMulticastPkts = hostTimeOutMulticastPkts;
        notifyChange(10, oldValue, hostTimeOutMulticastPkts);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHostTimeAddress(binding.getVariable().toString());
                break;
            case  2 :
                setHostTimeCreationOrder(binding.getVariable().toInt());
                break;
            case  3 :
                setHostTimeIndex(binding.getVariable().toInt());
                break;
            case  4 :
                setHostTimeInPkts(binding.getVariable().toInt());
                break;
            case  5 :
                setHostTimeOutPkts(binding.getVariable().toInt());
                break;
            case  6 :
                setHostTimeInOctets(binding.getVariable().toInt());
                break;
            case  7 :
                setHostTimeOutOctets(binding.getVariable().toInt());
                break;
            case  8 :
                setHostTimeOutErrors(binding.getVariable().toInt());
                break;
            case  9 :
                setHostTimeOutBroadcastPkts(binding.getVariable().toInt());
                break;
            case  10 :
                setHostTimeOutMulticastPkts(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHostTimeIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setHostTimeCreationOrder(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HostTimeTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hostTimeAddress", hostTimeAddress).append("hostTimeCreationOrder", hostTimeCreationOrder).append("hostTimeIndex", hostTimeIndex).append("hostTimeInPkts", hostTimeInPkts).append("hostTimeOutPkts", hostTimeOutPkts).append("hostTimeInOctets", hostTimeInOctets).append("hostTimeOutOctets", hostTimeOutOctets).append("hostTimeOutErrors", hostTimeOutErrors).append("hostTimeOutBroadcastPkts", hostTimeOutBroadcastPkts).append("hostTimeOutMulticastPkts", hostTimeOutMulticastPkts).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hostTimeAddress).append(hostTimeCreationOrder).append(hostTimeIndex).append(hostTimeInPkts).append(hostTimeOutPkts).append(hostTimeInOctets).append(hostTimeOutOctets).append(hostTimeOutErrors).append(hostTimeOutBroadcastPkts).append(hostTimeOutMulticastPkts).append(_index).toHashCode();
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
        HostTimeEntry rhs = ((HostTimeEntry) obj);
        return new EqualsBuilder().append(hostTimeAddress, rhs.hostTimeAddress).append(hostTimeCreationOrder, rhs.hostTimeCreationOrder).append(hostTimeIndex, rhs.hostTimeIndex).append(hostTimeInPkts, rhs.hostTimeInPkts).append(hostTimeOutPkts, rhs.hostTimeOutPkts).append(hostTimeInOctets, rhs.hostTimeInOctets).append(hostTimeOutOctets, rhs.hostTimeOutOctets).append(hostTimeOutErrors, rhs.hostTimeOutErrors).append(hostTimeOutBroadcastPkts, rhs.hostTimeOutBroadcastPkts).append(hostTimeOutMulticastPkts, rhs.hostTimeOutMulticastPkts).append(_index, rhs._index).isEquals();
    }

    public HostTimeEntry clone() {
        HostTimeEntry _copy = new HostTimeEntry();
        _copy.hostTimeAddress = hostTimeAddress;
        _copy.hostTimeCreationOrder = hostTimeCreationOrder;
        _copy.hostTimeIndex = hostTimeIndex;
        _copy.hostTimeInPkts = hostTimeInPkts;
        _copy.hostTimeOutPkts = hostTimeOutPkts;
        _copy.hostTimeInOctets = hostTimeInOctets;
        _copy.hostTimeOutOctets = hostTimeOutOctets;
        _copy.hostTimeOutErrors = hostTimeOutErrors;
        _copy.hostTimeOutBroadcastPkts = hostTimeOutBroadcastPkts;
        _copy.hostTimeOutMulticastPkts = hostTimeOutMulticastPkts;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.4.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hostTimeAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hostTimeCreationOrder", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hostTimeIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hostTimeInPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hostTimeOutPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "hostTimeInOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "hostTimeOutOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "hostTimeOutErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "hostTimeOutBroadcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "hostTimeOutMulticastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
