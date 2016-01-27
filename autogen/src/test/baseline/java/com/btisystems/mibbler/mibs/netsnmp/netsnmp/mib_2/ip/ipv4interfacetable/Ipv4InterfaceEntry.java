
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipv4interfacetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv4interfacetable.IIpv4InterfaceEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.Ipv4InterfaceTable;
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

public class Ipv4InterfaceEntry
    extends DeviceEntity
    implements Serializable, IIpv4InterfaceEntry, IIndexed, IVariableBindingSetter
{

    private int ipv4InterfaceIfIndex;
    private int ipv4InterfaceReasmMaxSize;
    private int ipv4InterfaceEnableStatus;
    private Integer ipv4InterfaceRetransmitTime;
    private String _index;
    private Ipv4InterfaceTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv4InterfaceEntry() {
    }

    public int getIpv4InterfaceIfIndex() {
        return this.ipv4InterfaceIfIndex;
    }

    public void setIpv4InterfaceIfIndex(int ipv4InterfaceIfIndex) {
        int oldValue = getIpv4InterfaceIfIndex();
        this.ipv4InterfaceIfIndex = ipv4InterfaceIfIndex;
        notifyChange(1, oldValue, ipv4InterfaceIfIndex);
    }

    public int getIpv4InterfaceReasmMaxSize() {
        return this.ipv4InterfaceReasmMaxSize;
    }

    public void setIpv4InterfaceReasmMaxSize(int ipv4InterfaceReasmMaxSize) {
        int oldValue = getIpv4InterfaceReasmMaxSize();
        this.ipv4InterfaceReasmMaxSize = ipv4InterfaceReasmMaxSize;
        notifyChange(2, oldValue, ipv4InterfaceReasmMaxSize);
    }

    public int getIpv4InterfaceEnableStatus() {
        return this.ipv4InterfaceEnableStatus;
    }

    public void setIpv4InterfaceEnableStatus(int ipv4InterfaceEnableStatus) {
        int oldValue = getIpv4InterfaceEnableStatus();
        this.ipv4InterfaceEnableStatus = ipv4InterfaceEnableStatus;
        notifyChange(3, oldValue, ipv4InterfaceEnableStatus);
    }

    public int getIpv4InterfaceRetransmitTime() {
        if (this.ipv4InterfaceRetransmitTime == null) {
            return  1000;
        }
        return this.ipv4InterfaceRetransmitTime;
    }

    public boolean isIpv4InterfaceRetransmitTimeDefined() {
        return (this.ipv4InterfaceRetransmitTime!= null);
    }

    public void setIpv4InterfaceRetransmitTime(int ipv4InterfaceRetransmitTime) {
        int oldValue = getIpv4InterfaceRetransmitTime();
        this.ipv4InterfaceRetransmitTime = ipv4InterfaceRetransmitTime;
        notifyChange(4, oldValue, ipv4InterfaceRetransmitTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpv4InterfaceIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setIpv4InterfaceReasmMaxSize(binding.getVariable().toInt());
                break;
            case  3 :
                setIpv4InterfaceEnableStatus(binding.getVariable().toInt());
                break;
            case  4 :
                setIpv4InterfaceRetransmitTime(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpv4InterfaceIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Ipv4InterfaceTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv4InterfaceIfIndex", ipv4InterfaceIfIndex).append("ipv4InterfaceReasmMaxSize", ipv4InterfaceReasmMaxSize).append("ipv4InterfaceEnableStatus", ipv4InterfaceEnableStatus).append("ipv4InterfaceRetransmitTime", ipv4InterfaceRetransmitTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv4InterfaceIfIndex).append(ipv4InterfaceReasmMaxSize).append(ipv4InterfaceEnableStatus).append(ipv4InterfaceRetransmitTime).append(_index).toHashCode();
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
        Ipv4InterfaceEntry rhs = ((Ipv4InterfaceEntry) obj);
        return new EqualsBuilder().append(ipv4InterfaceIfIndex, rhs.ipv4InterfaceIfIndex).append(ipv4InterfaceReasmMaxSize, rhs.ipv4InterfaceReasmMaxSize).append(ipv4InterfaceEnableStatus, rhs.ipv4InterfaceEnableStatus).append(ipv4InterfaceRetransmitTime, rhs.ipv4InterfaceRetransmitTime).append(_index, rhs._index).isEquals();
    }

    public Ipv4InterfaceEntry clone() {
        Ipv4InterfaceEntry _copy = new Ipv4InterfaceEntry();
        _copy.ipv4InterfaceIfIndex = ipv4InterfaceIfIndex;
        _copy.ipv4InterfaceReasmMaxSize = ipv4InterfaceReasmMaxSize;
        _copy.ipv4InterfaceEnableStatus = ipv4InterfaceEnableStatus;
        _copy.ipv4InterfaceRetransmitTime = ipv4InterfaceRetransmitTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.28.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv4InterfaceIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv4InterfaceReasmMaxSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv4InterfaceEnableStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipv4InterfaceRetransmitTime", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
