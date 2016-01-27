
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipv6interfacetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv6interfacetable.IIpv6InterfaceEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.Ipv6InterfaceTable;
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

public class Ipv6InterfaceEntry
    extends DeviceEntity
    implements Serializable, IIpv6InterfaceEntry, IIndexed, IVariableBindingSetter
{

    private int ipv6InterfaceIfIndex;
    private int ipv6InterfaceReasmMaxSize;
    private String ipv6InterfaceIdentifier;
    private int ipv6InterfaceEnableStatus;
    private int ipv6InterfaceReachableTime;
    private int ipv6InterfaceRetransmitTime;
    private int ipv6InterfaceForwarding;
    private String _index;
    private Ipv6InterfaceTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6InterfaceEntry() {
    }

    public int getIpv6InterfaceIfIndex() {
        return this.ipv6InterfaceIfIndex;
    }

    public void setIpv6InterfaceIfIndex(int ipv6InterfaceIfIndex) {
        int oldValue = getIpv6InterfaceIfIndex();
        this.ipv6InterfaceIfIndex = ipv6InterfaceIfIndex;
        notifyChange(1, oldValue, ipv6InterfaceIfIndex);
    }

    public int getIpv6InterfaceReasmMaxSize() {
        return this.ipv6InterfaceReasmMaxSize;
    }

    public void setIpv6InterfaceReasmMaxSize(int ipv6InterfaceReasmMaxSize) {
        int oldValue = getIpv6InterfaceReasmMaxSize();
        this.ipv6InterfaceReasmMaxSize = ipv6InterfaceReasmMaxSize;
        notifyChange(2, oldValue, ipv6InterfaceReasmMaxSize);
    }

    public String getIpv6InterfaceIdentifier() {
        return this.ipv6InterfaceIdentifier;
    }

    public void setIpv6InterfaceIdentifier(String ipv6InterfaceIdentifier) {
        String oldValue = getIpv6InterfaceIdentifier();
        this.ipv6InterfaceIdentifier = ipv6InterfaceIdentifier;
        notifyChange(3, oldValue, ipv6InterfaceIdentifier);
    }

    public int getIpv6InterfaceEnableStatus() {
        return this.ipv6InterfaceEnableStatus;
    }

    public void setIpv6InterfaceEnableStatus(int ipv6InterfaceEnableStatus) {
        int oldValue = getIpv6InterfaceEnableStatus();
        this.ipv6InterfaceEnableStatus = ipv6InterfaceEnableStatus;
        notifyChange(5, oldValue, ipv6InterfaceEnableStatus);
    }

    public int getIpv6InterfaceReachableTime() {
        return this.ipv6InterfaceReachableTime;
    }

    public void setIpv6InterfaceReachableTime(int ipv6InterfaceReachableTime) {
        int oldValue = getIpv6InterfaceReachableTime();
        this.ipv6InterfaceReachableTime = ipv6InterfaceReachableTime;
        notifyChange(6, oldValue, ipv6InterfaceReachableTime);
    }

    public int getIpv6InterfaceRetransmitTime() {
        return this.ipv6InterfaceRetransmitTime;
    }

    public void setIpv6InterfaceRetransmitTime(int ipv6InterfaceRetransmitTime) {
        int oldValue = getIpv6InterfaceRetransmitTime();
        this.ipv6InterfaceRetransmitTime = ipv6InterfaceRetransmitTime;
        notifyChange(7, oldValue, ipv6InterfaceRetransmitTime);
    }

    public int getIpv6InterfaceForwarding() {
        return this.ipv6InterfaceForwarding;
    }

    public void setIpv6InterfaceForwarding(int ipv6InterfaceForwarding) {
        int oldValue = getIpv6InterfaceForwarding();
        this.ipv6InterfaceForwarding = ipv6InterfaceForwarding;
        notifyChange(8, oldValue, ipv6InterfaceForwarding);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpv6InterfaceIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setIpv6InterfaceReasmMaxSize(binding.getVariable().toInt());
                break;
            case  3 :
                setIpv6InterfaceIdentifier(binding.getVariable().toString());
                break;
            case  5 :
                setIpv6InterfaceEnableStatus(binding.getVariable().toInt());
                break;
            case  6 :
                setIpv6InterfaceReachableTime(binding.getVariable().toInt());
                break;
            case  7 :
                setIpv6InterfaceRetransmitTime(binding.getVariable().toInt());
                break;
            case  8 :
                setIpv6InterfaceForwarding(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpv6InterfaceIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Ipv6InterfaceTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6InterfaceIfIndex", ipv6InterfaceIfIndex).append("ipv6InterfaceReasmMaxSize", ipv6InterfaceReasmMaxSize).append("ipv6InterfaceIdentifier", ipv6InterfaceIdentifier).append("ipv6InterfaceEnableStatus", ipv6InterfaceEnableStatus).append("ipv6InterfaceReachableTime", ipv6InterfaceReachableTime).append("ipv6InterfaceRetransmitTime", ipv6InterfaceRetransmitTime).append("ipv6InterfaceForwarding", ipv6InterfaceForwarding).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6InterfaceIfIndex).append(ipv6InterfaceReasmMaxSize).append(ipv6InterfaceIdentifier).append(ipv6InterfaceEnableStatus).append(ipv6InterfaceReachableTime).append(ipv6InterfaceRetransmitTime).append(ipv6InterfaceForwarding).append(_index).toHashCode();
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
        Ipv6InterfaceEntry rhs = ((Ipv6InterfaceEntry) obj);
        return new EqualsBuilder().append(ipv6InterfaceIfIndex, rhs.ipv6InterfaceIfIndex).append(ipv6InterfaceReasmMaxSize, rhs.ipv6InterfaceReasmMaxSize).append(ipv6InterfaceIdentifier, rhs.ipv6InterfaceIdentifier).append(ipv6InterfaceEnableStatus, rhs.ipv6InterfaceEnableStatus).append(ipv6InterfaceReachableTime, rhs.ipv6InterfaceReachableTime).append(ipv6InterfaceRetransmitTime, rhs.ipv6InterfaceRetransmitTime).append(ipv6InterfaceForwarding, rhs.ipv6InterfaceForwarding).append(_index, rhs._index).isEquals();
    }

    public Ipv6InterfaceEntry clone() {
        Ipv6InterfaceEntry _copy = new Ipv6InterfaceEntry();
        _copy.ipv6InterfaceIfIndex = ipv6InterfaceIfIndex;
        _copy.ipv6InterfaceReasmMaxSize = ipv6InterfaceReasmMaxSize;
        _copy.ipv6InterfaceIdentifier = ipv6InterfaceIdentifier;
        _copy.ipv6InterfaceEnableStatus = ipv6InterfaceEnableStatus;
        _copy.ipv6InterfaceReachableTime = ipv6InterfaceReachableTime;
        _copy.ipv6InterfaceRetransmitTime = ipv6InterfaceRetransmitTime;
        _copy.ipv6InterfaceForwarding = ipv6InterfaceForwarding;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.30.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6InterfaceIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6InterfaceReasmMaxSize", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6InterfaceIdentifier", DeviceEntityDescription.FieldType.STRING, 20));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipv6InterfaceEnableStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipv6InterfaceReachableTime", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipv6InterfaceRetransmitTime", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipv6InterfaceForwarding", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
