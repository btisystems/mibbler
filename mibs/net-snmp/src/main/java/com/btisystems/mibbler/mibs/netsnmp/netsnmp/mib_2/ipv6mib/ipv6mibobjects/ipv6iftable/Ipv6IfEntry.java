
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.ipv6iftable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6iftable.IIpv6IfEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.Ipv6IfTable;
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

public class Ipv6IfEntry
    extends DeviceEntity
    implements Serializable, IIpv6IfEntry, IIndexed, IVariableBindingSetter
{

    private int ipv6IfIndex;
    private String ipv6IfDescr;
    private String ipv6IfLowerLayer;
    private int ipv6IfEffectiveMtu;
    private int ipv6IfReasmMaxSize;
    private String ipv6IfIdentifier;
    private int ipv6IfIdentifierLength;
    private String ipv6IfPhysicalAddress;
    private int ipv6IfAdminStatus;
    private int ipv6IfOperStatus;
    private int ipv6IfLastChange;
    private String _index;
    private Ipv6IfTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6IfEntry() {
    }

    public int getIpv6IfIndex() {
        return this.ipv6IfIndex;
    }

    public void setIpv6IfIndex(int ipv6IfIndex) {
        int oldValue = getIpv6IfIndex();
        this.ipv6IfIndex = ipv6IfIndex;
        notifyChange(1, oldValue, ipv6IfIndex);
    }

    public String getIpv6IfDescr() {
        return this.ipv6IfDescr;
    }

    public void setIpv6IfDescr(String ipv6IfDescr) {
        String oldValue = getIpv6IfDescr();
        this.ipv6IfDescr = ipv6IfDescr;
        notifyChange(2, oldValue, ipv6IfDescr);
    }

    public String getIpv6IfLowerLayer() {
        return this.ipv6IfLowerLayer;
    }

    public void setIpv6IfLowerLayer(String ipv6IfLowerLayer) {
        String oldValue = getIpv6IfLowerLayer();
        this.ipv6IfLowerLayer = ipv6IfLowerLayer;
        notifyChange(3, oldValue, ipv6IfLowerLayer);
    }

    public int getIpv6IfEffectiveMtu() {
        return this.ipv6IfEffectiveMtu;
    }

    public void setIpv6IfEffectiveMtu(int ipv6IfEffectiveMtu) {
        int oldValue = getIpv6IfEffectiveMtu();
        this.ipv6IfEffectiveMtu = ipv6IfEffectiveMtu;
        notifyChange(4, oldValue, ipv6IfEffectiveMtu);
    }

    public int getIpv6IfReasmMaxSize() {
        return this.ipv6IfReasmMaxSize;
    }

    public void setIpv6IfReasmMaxSize(int ipv6IfReasmMaxSize) {
        int oldValue = getIpv6IfReasmMaxSize();
        this.ipv6IfReasmMaxSize = ipv6IfReasmMaxSize;
        notifyChange(5, oldValue, ipv6IfReasmMaxSize);
    }

    public String getIpv6IfIdentifier() {
        return this.ipv6IfIdentifier;
    }

    public void setIpv6IfIdentifier(String ipv6IfIdentifier) {
        String oldValue = getIpv6IfIdentifier();
        this.ipv6IfIdentifier = ipv6IfIdentifier;
        notifyChange(6, oldValue, ipv6IfIdentifier);
    }

    public int getIpv6IfIdentifierLength() {
        return this.ipv6IfIdentifierLength;
    }

    public void setIpv6IfIdentifierLength(int ipv6IfIdentifierLength) {
        int oldValue = getIpv6IfIdentifierLength();
        this.ipv6IfIdentifierLength = ipv6IfIdentifierLength;
        notifyChange(7, oldValue, ipv6IfIdentifierLength);
    }

    public String getIpv6IfPhysicalAddress() {
        return this.ipv6IfPhysicalAddress;
    }

    public void setIpv6IfPhysicalAddress(String ipv6IfPhysicalAddress) {
        String oldValue = getIpv6IfPhysicalAddress();
        this.ipv6IfPhysicalAddress = ipv6IfPhysicalAddress;
        notifyChange(8, oldValue, ipv6IfPhysicalAddress);
    }

    public int getIpv6IfAdminStatus() {
        return this.ipv6IfAdminStatus;
    }

    public void setIpv6IfAdminStatus(int ipv6IfAdminStatus) {
        int oldValue = getIpv6IfAdminStatus();
        this.ipv6IfAdminStatus = ipv6IfAdminStatus;
        notifyChange(9, oldValue, ipv6IfAdminStatus);
    }

    public int getIpv6IfOperStatus() {
        return this.ipv6IfOperStatus;
    }

    public void setIpv6IfOperStatus(int ipv6IfOperStatus) {
        int oldValue = getIpv6IfOperStatus();
        this.ipv6IfOperStatus = ipv6IfOperStatus;
        notifyChange(10, oldValue, ipv6IfOperStatus);
    }

    public int getIpv6IfLastChange() {
        return this.ipv6IfLastChange;
    }

    public void setIpv6IfLastChange(int ipv6IfLastChange) {
        int oldValue = getIpv6IfLastChange();
        this.ipv6IfLastChange = ipv6IfLastChange;
        notifyChange(11, oldValue, ipv6IfLastChange);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIpv6IfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setIpv6IfDescr(binding.getVariable().toString());
                break;
            case  3 :
                setIpv6IfLowerLayer(binding.getVariable().toString());
                break;
            case  4 :
                setIpv6IfEffectiveMtu(binding.getVariable().toInt());
                break;
            case  5 :
                setIpv6IfReasmMaxSize(binding.getVariable().toInt());
                break;
            case  6 :
                setIpv6IfIdentifier(binding.getVariable().toString());
                break;
            case  7 :
                setIpv6IfIdentifierLength(binding.getVariable().toInt());
                break;
            case  8 :
                setIpv6IfPhysicalAddress(binding.getVariable().toString());
                break;
            case  9 :
                setIpv6IfAdminStatus(binding.getVariable().toInt());
                break;
            case  10 :
                setIpv6IfOperStatus(binding.getVariable().toInt());
                break;
            case  11 :
                setIpv6IfLastChange(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setIpv6IfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Ipv6IfTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6IfIndex", ipv6IfIndex).append("ipv6IfDescr", ipv6IfDescr).append("ipv6IfLowerLayer", ipv6IfLowerLayer).append("ipv6IfEffectiveMtu", ipv6IfEffectiveMtu).append("ipv6IfReasmMaxSize", ipv6IfReasmMaxSize).append("ipv6IfIdentifier", ipv6IfIdentifier).append("ipv6IfIdentifierLength", ipv6IfIdentifierLength).append("ipv6IfPhysicalAddress", ipv6IfPhysicalAddress).append("ipv6IfAdminStatus", ipv6IfAdminStatus).append("ipv6IfOperStatus", ipv6IfOperStatus).append("ipv6IfLastChange", ipv6IfLastChange).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6IfIndex).append(ipv6IfDescr).append(ipv6IfLowerLayer).append(ipv6IfEffectiveMtu).append(ipv6IfReasmMaxSize).append(ipv6IfIdentifier).append(ipv6IfIdentifierLength).append(ipv6IfPhysicalAddress).append(ipv6IfAdminStatus).append(ipv6IfOperStatus).append(ipv6IfLastChange).append(_index).toHashCode();
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
        Ipv6IfEntry rhs = ((Ipv6IfEntry) obj);
        return new EqualsBuilder().append(ipv6IfIndex, rhs.ipv6IfIndex).append(ipv6IfDescr, rhs.ipv6IfDescr).append(ipv6IfLowerLayer, rhs.ipv6IfLowerLayer).append(ipv6IfEffectiveMtu, rhs.ipv6IfEffectiveMtu).append(ipv6IfReasmMaxSize, rhs.ipv6IfReasmMaxSize).append(ipv6IfIdentifier, rhs.ipv6IfIdentifier).append(ipv6IfIdentifierLength, rhs.ipv6IfIdentifierLength).append(ipv6IfPhysicalAddress, rhs.ipv6IfPhysicalAddress).append(ipv6IfAdminStatus, rhs.ipv6IfAdminStatus).append(ipv6IfOperStatus, rhs.ipv6IfOperStatus).append(ipv6IfLastChange, rhs.ipv6IfLastChange).append(_index, rhs._index).isEquals();
    }

    public Ipv6IfEntry clone() {
        Ipv6IfEntry _copy = new Ipv6IfEntry();
        _copy.ipv6IfIndex = ipv6IfIndex;
        _copy.ipv6IfDescr = ipv6IfDescr;
        _copy.ipv6IfLowerLayer = ipv6IfLowerLayer;
        _copy.ipv6IfEffectiveMtu = ipv6IfEffectiveMtu;
        _copy.ipv6IfReasmMaxSize = ipv6IfReasmMaxSize;
        _copy.ipv6IfIdentifier = ipv6IfIdentifier;
        _copy.ipv6IfIdentifierLength = ipv6IfIdentifierLength;
        _copy.ipv6IfPhysicalAddress = ipv6IfPhysicalAddress;
        _copy.ipv6IfAdminStatus = ipv6IfAdminStatus;
        _copy.ipv6IfOperStatus = ipv6IfOperStatus;
        _copy.ipv6IfLastChange = ipv6IfLastChange;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6IfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6IfDescr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6IfLowerLayer", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipv6IfEffectiveMtu", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipv6IfReasmMaxSize", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipv6IfIdentifier", DeviceEntityDescription.FieldType.STRING, 20));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipv6IfIdentifierLength", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipv6IfPhysicalAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipv6IfAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipv6IfOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipv6IfLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
