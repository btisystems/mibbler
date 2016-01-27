
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipaddresstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipaddresstable.IIpAddressEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpAddressTable;
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

public class IpAddressEntry
    extends DeviceEntity
    implements Serializable, IIpAddressEntry, IIndexed, IVariableBindingSetter
{

    private int ipAddressAddrType;
    private String ipAddressAddr;
    private int ipAddressIfIndex;
    private Integer ipAddressType;
    private String ipAddressPrefix;
    private int ipAddressOrigin;
    private Integer ipAddressStatus;
    private int ipAddressCreated;
    private int ipAddressLastChanged;
    private int ipAddressRowStatus;
    private Integer ipAddressStorageType;
    private String _index;
    private IpAddressTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpAddressEntry() {
    }

    public int getIpAddressAddrType() {
        return this.ipAddressAddrType;
    }

    public void setIpAddressAddrType(int ipAddressAddrType) {
        int oldValue = getIpAddressAddrType();
        this.ipAddressAddrType = ipAddressAddrType;
        notifyChange(1, oldValue, ipAddressAddrType);
    }

    public String getIpAddressAddr() {
        return this.ipAddressAddr;
    }

    public void setIpAddressAddr(String ipAddressAddr) {
        String oldValue = getIpAddressAddr();
        this.ipAddressAddr = ipAddressAddr;
        notifyChange(2, oldValue, ipAddressAddr);
    }

    public int getIpAddressIfIndex() {
        return this.ipAddressIfIndex;
    }

    public void setIpAddressIfIndex(int ipAddressIfIndex) {
        int oldValue = getIpAddressIfIndex();
        this.ipAddressIfIndex = ipAddressIfIndex;
        notifyChange(3, oldValue, ipAddressIfIndex);
    }

    public int getIpAddressType() {
        if (this.ipAddressType == null) {
            return  1;
        }
        return this.ipAddressType;
    }

    public boolean isIpAddressTypeDefined() {
        return (this.ipAddressType!= null);
    }

    public void setIpAddressType(int ipAddressType) {
        int oldValue = getIpAddressType();
        this.ipAddressType = ipAddressType;
        notifyChange(4, oldValue, ipAddressType);
    }

    public String getIpAddressPrefix() {
        return this.ipAddressPrefix;
    }

    public void setIpAddressPrefix(String ipAddressPrefix) {
        String oldValue = getIpAddressPrefix();
        this.ipAddressPrefix = ipAddressPrefix;
        notifyChange(5, oldValue, ipAddressPrefix);
    }

    public int getIpAddressOrigin() {
        return this.ipAddressOrigin;
    }

    public void setIpAddressOrigin(int ipAddressOrigin) {
        int oldValue = getIpAddressOrigin();
        this.ipAddressOrigin = ipAddressOrigin;
        notifyChange(6, oldValue, ipAddressOrigin);
    }

    public int getIpAddressStatus() {
        if (this.ipAddressStatus == null) {
            return  1;
        }
        return this.ipAddressStatus;
    }

    public boolean isIpAddressStatusDefined() {
        return (this.ipAddressStatus!= null);
    }

    public void setIpAddressStatus(int ipAddressStatus) {
        int oldValue = getIpAddressStatus();
        this.ipAddressStatus = ipAddressStatus;
        notifyChange(7, oldValue, ipAddressStatus);
    }

    public int getIpAddressCreated() {
        return this.ipAddressCreated;
    }

    public void setIpAddressCreated(int ipAddressCreated) {
        int oldValue = getIpAddressCreated();
        this.ipAddressCreated = ipAddressCreated;
        notifyChange(8, oldValue, ipAddressCreated);
    }

    public int getIpAddressLastChanged() {
        return this.ipAddressLastChanged;
    }

    public void setIpAddressLastChanged(int ipAddressLastChanged) {
        int oldValue = getIpAddressLastChanged();
        this.ipAddressLastChanged = ipAddressLastChanged;
        notifyChange(9, oldValue, ipAddressLastChanged);
    }

    public int getIpAddressRowStatus() {
        return this.ipAddressRowStatus;
    }

    public void setIpAddressRowStatus(int ipAddressRowStatus) {
        int oldValue = getIpAddressRowStatus();
        this.ipAddressRowStatus = ipAddressRowStatus;
        notifyChange(10, oldValue, ipAddressRowStatus);
    }

    public int getIpAddressStorageType() {
        if (this.ipAddressStorageType == null) {
            return  2;
        }
        return this.ipAddressStorageType;
    }

    public boolean isIpAddressStorageTypeDefined() {
        return (this.ipAddressStorageType!= null);
    }

    public void setIpAddressStorageType(int ipAddressStorageType) {
        int oldValue = getIpAddressStorageType();
        this.ipAddressStorageType = ipAddressStorageType;
        notifyChange(11, oldValue, ipAddressStorageType);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpAddressAddrType(binding.getVariable().toInt());
                break;
            case  2 :
                setIpAddressAddr(binding.getVariable().toString());
                break;
            case  3 :
                setIpAddressIfIndex(binding.getVariable().toInt());
                break;
            case  4 :
                setIpAddressType(binding.getVariable().toInt());
                break;
            case  5 :
                setIpAddressPrefix(binding.getVariable().toString());
                break;
            case  6 :
                setIpAddressOrigin(binding.getVariable().toInt());
                break;
            case  7 :
                setIpAddressStatus(binding.getVariable().toInt());
                break;
            case  8 :
                setIpAddressCreated(binding.getVariable().toInt());
                break;
            case  9 :
                setIpAddressLastChanged(binding.getVariable().toInt());
                break;
            case  10 :
                setIpAddressRowStatus(binding.getVariable().toInt());
                break;
            case  11 :
                setIpAddressStorageType(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpAddressAddrType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setIpAddressAddr(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IpAddressTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipAddressAddrType", ipAddressAddrType).append("ipAddressAddr", ipAddressAddr).append("ipAddressIfIndex", ipAddressIfIndex).append("ipAddressType", ipAddressType).append("ipAddressPrefix", ipAddressPrefix).append("ipAddressOrigin", ipAddressOrigin).append("ipAddressStatus", ipAddressStatus).append("ipAddressCreated", ipAddressCreated).append("ipAddressLastChanged", ipAddressLastChanged).append("ipAddressRowStatus", ipAddressRowStatus).append("ipAddressStorageType", ipAddressStorageType).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipAddressAddrType).append(ipAddressAddr).append(ipAddressIfIndex).append(ipAddressType).append(ipAddressPrefix).append(ipAddressOrigin).append(ipAddressStatus).append(ipAddressCreated).append(ipAddressLastChanged).append(ipAddressRowStatus).append(ipAddressStorageType).append(_index).toHashCode();
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
        IpAddressEntry rhs = ((IpAddressEntry) obj);
        return new EqualsBuilder().append(ipAddressAddrType, rhs.ipAddressAddrType).append(ipAddressAddr, rhs.ipAddressAddr).append(ipAddressIfIndex, rhs.ipAddressIfIndex).append(ipAddressType, rhs.ipAddressType).append(ipAddressPrefix, rhs.ipAddressPrefix).append(ipAddressOrigin, rhs.ipAddressOrigin).append(ipAddressStatus, rhs.ipAddressStatus).append(ipAddressCreated, rhs.ipAddressCreated).append(ipAddressLastChanged, rhs.ipAddressLastChanged).append(ipAddressRowStatus, rhs.ipAddressRowStatus).append(ipAddressStorageType, rhs.ipAddressStorageType).append(_index, rhs._index).isEquals();
    }

    public IpAddressEntry clone() {
        IpAddressEntry _copy = new IpAddressEntry();
        _copy.ipAddressAddrType = ipAddressAddrType;
        _copy.ipAddressAddr = ipAddressAddr;
        _copy.ipAddressIfIndex = ipAddressIfIndex;
        _copy.ipAddressType = ipAddressType;
        _copy.ipAddressPrefix = ipAddressPrefix;
        _copy.ipAddressOrigin = ipAddressOrigin;
        _copy.ipAddressStatus = ipAddressStatus;
        _copy.ipAddressCreated = ipAddressCreated;
        _copy.ipAddressLastChanged = ipAddressLastChanged;
        _copy.ipAddressRowStatus = ipAddressRowStatus;
        _copy.ipAddressStorageType = ipAddressStorageType;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.34.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipAddressAddrType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipAddressAddr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipAddressIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipAddressType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipAddressPrefix", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipAddressOrigin", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipAddressStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipAddressCreated", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipAddressLastChanged", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipAddressRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipAddressStorageType", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
