
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipnettophysicaltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipnettophysicaltable.IIpNetToPhysicalEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpNetToPhysicalTable;
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

public class IpNetToPhysicalEntry
    extends DeviceEntity
    implements Serializable, IIpNetToPhysicalEntry, IIndexed, IVariableBindingSetter
{

    private int ipNetToPhysicalIfIndex;
    private int ipNetToPhysicalNetAddressType;
    private String ipNetToPhysicalNetAddress;
    private String ipNetToPhysicalPhysAddress;
    private int ipNetToPhysicalLastUpdated;
    private Integer ipNetToPhysicalType;
    private int ipNetToPhysicalState;
    private int ipNetToPhysicalRowStatus;
    private String _index;
    private IpNetToPhysicalTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpNetToPhysicalEntry() {
    }

    public int getIpNetToPhysicalIfIndex() {
        return this.ipNetToPhysicalIfIndex;
    }

    public void setIpNetToPhysicalIfIndex(int ipNetToPhysicalIfIndex) {
        int oldValue = getIpNetToPhysicalIfIndex();
        this.ipNetToPhysicalIfIndex = ipNetToPhysicalIfIndex;
        notifyChange(1, oldValue, ipNetToPhysicalIfIndex);
    }

    public int getIpNetToPhysicalNetAddressType() {
        return this.ipNetToPhysicalNetAddressType;
    }

    public void setIpNetToPhysicalNetAddressType(int ipNetToPhysicalNetAddressType) {
        int oldValue = getIpNetToPhysicalNetAddressType();
        this.ipNetToPhysicalNetAddressType = ipNetToPhysicalNetAddressType;
        notifyChange(2, oldValue, ipNetToPhysicalNetAddressType);
    }

    public String getIpNetToPhysicalNetAddress() {
        return this.ipNetToPhysicalNetAddress;
    }

    public void setIpNetToPhysicalNetAddress(String ipNetToPhysicalNetAddress) {
        String oldValue = getIpNetToPhysicalNetAddress();
        this.ipNetToPhysicalNetAddress = ipNetToPhysicalNetAddress;
        notifyChange(3, oldValue, ipNetToPhysicalNetAddress);
    }

    public String getIpNetToPhysicalPhysAddress() {
        return this.ipNetToPhysicalPhysAddress;
    }

    public void setIpNetToPhysicalPhysAddress(String ipNetToPhysicalPhysAddress) {
        String oldValue = getIpNetToPhysicalPhysAddress();
        this.ipNetToPhysicalPhysAddress = ipNetToPhysicalPhysAddress;
        notifyChange(4, oldValue, ipNetToPhysicalPhysAddress);
    }

    public int getIpNetToPhysicalLastUpdated() {
        return this.ipNetToPhysicalLastUpdated;
    }

    public void setIpNetToPhysicalLastUpdated(int ipNetToPhysicalLastUpdated) {
        int oldValue = getIpNetToPhysicalLastUpdated();
        this.ipNetToPhysicalLastUpdated = ipNetToPhysicalLastUpdated;
        notifyChange(5, oldValue, ipNetToPhysicalLastUpdated);
    }

    public int getIpNetToPhysicalType() {
        if (this.ipNetToPhysicalType == null) {
            return  4;
        }
        return this.ipNetToPhysicalType;
    }

    public boolean isIpNetToPhysicalTypeDefined() {
        return (this.ipNetToPhysicalType!= null);
    }

    public void setIpNetToPhysicalType(int ipNetToPhysicalType) {
        int oldValue = getIpNetToPhysicalType();
        this.ipNetToPhysicalType = ipNetToPhysicalType;
        notifyChange(6, oldValue, ipNetToPhysicalType);
    }

    public int getIpNetToPhysicalState() {
        return this.ipNetToPhysicalState;
    }

    public void setIpNetToPhysicalState(int ipNetToPhysicalState) {
        int oldValue = getIpNetToPhysicalState();
        this.ipNetToPhysicalState = ipNetToPhysicalState;
        notifyChange(7, oldValue, ipNetToPhysicalState);
    }

    public int getIpNetToPhysicalRowStatus() {
        return this.ipNetToPhysicalRowStatus;
    }

    public void setIpNetToPhysicalRowStatus(int ipNetToPhysicalRowStatus) {
        int oldValue = getIpNetToPhysicalRowStatus();
        this.ipNetToPhysicalRowStatus = ipNetToPhysicalRowStatus;
        notifyChange(8, oldValue, ipNetToPhysicalRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpNetToPhysicalIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setIpNetToPhysicalNetAddressType(binding.getVariable().toInt());
                break;
            case  3 :
                setIpNetToPhysicalNetAddress(binding.getVariable().toString());
                break;
            case  4 :
                setIpNetToPhysicalPhysAddress(binding.getVariable().toString());
                break;
            case  5 :
                setIpNetToPhysicalLastUpdated(binding.getVariable().toInt());
                break;
            case  6 :
                setIpNetToPhysicalType(binding.getVariable().toInt());
                break;
            case  7 :
                setIpNetToPhysicalState(binding.getVariable().toInt());
                break;
            case  8 :
                setIpNetToPhysicalRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpNetToPhysicalIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIpNetToPhysicalNetAddressType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setIpNetToPhysicalNetAddress(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IpNetToPhysicalTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipNetToPhysicalIfIndex", ipNetToPhysicalIfIndex).append("ipNetToPhysicalNetAddressType", ipNetToPhysicalNetAddressType).append("ipNetToPhysicalNetAddress", ipNetToPhysicalNetAddress).append("ipNetToPhysicalPhysAddress", ipNetToPhysicalPhysAddress).append("ipNetToPhysicalLastUpdated", ipNetToPhysicalLastUpdated).append("ipNetToPhysicalType", ipNetToPhysicalType).append("ipNetToPhysicalState", ipNetToPhysicalState).append("ipNetToPhysicalRowStatus", ipNetToPhysicalRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipNetToPhysicalIfIndex).append(ipNetToPhysicalNetAddressType).append(ipNetToPhysicalNetAddress).append(ipNetToPhysicalPhysAddress).append(ipNetToPhysicalLastUpdated).append(ipNetToPhysicalType).append(ipNetToPhysicalState).append(ipNetToPhysicalRowStatus).append(_index).toHashCode();
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
        IpNetToPhysicalEntry rhs = ((IpNetToPhysicalEntry) obj);
        return new EqualsBuilder().append(ipNetToPhysicalIfIndex, rhs.ipNetToPhysicalIfIndex).append(ipNetToPhysicalNetAddressType, rhs.ipNetToPhysicalNetAddressType).append(ipNetToPhysicalNetAddress, rhs.ipNetToPhysicalNetAddress).append(ipNetToPhysicalPhysAddress, rhs.ipNetToPhysicalPhysAddress).append(ipNetToPhysicalLastUpdated, rhs.ipNetToPhysicalLastUpdated).append(ipNetToPhysicalType, rhs.ipNetToPhysicalType).append(ipNetToPhysicalState, rhs.ipNetToPhysicalState).append(ipNetToPhysicalRowStatus, rhs.ipNetToPhysicalRowStatus).append(_index, rhs._index).isEquals();
    }

    public IpNetToPhysicalEntry clone() {
        IpNetToPhysicalEntry _copy = new IpNetToPhysicalEntry();
        _copy.ipNetToPhysicalIfIndex = ipNetToPhysicalIfIndex;
        _copy.ipNetToPhysicalNetAddressType = ipNetToPhysicalNetAddressType;
        _copy.ipNetToPhysicalNetAddress = ipNetToPhysicalNetAddress;
        _copy.ipNetToPhysicalPhysAddress = ipNetToPhysicalPhysAddress;
        _copy.ipNetToPhysicalLastUpdated = ipNetToPhysicalLastUpdated;
        _copy.ipNetToPhysicalType = ipNetToPhysicalType;
        _copy.ipNetToPhysicalState = ipNetToPhysicalState;
        _copy.ipNetToPhysicalRowStatus = ipNetToPhysicalRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.35.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipNetToPhysicalIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipNetToPhysicalNetAddressType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipNetToPhysicalNetAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipNetToPhysicalPhysAddress", DeviceEntityDescription.FieldType.STRING, 196605));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipNetToPhysicalLastUpdated", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipNetToPhysicalType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipNetToPhysicalState", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipNetToPhysicalRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
