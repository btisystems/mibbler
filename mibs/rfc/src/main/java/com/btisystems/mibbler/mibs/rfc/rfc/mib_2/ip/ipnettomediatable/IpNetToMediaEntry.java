
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ip.ipnettomediatable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ip.ipnettomediatable.IIpNetToMediaEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ip.IpNetToMediaTable;
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

public class IpNetToMediaEntry
    extends DeviceEntity
    implements Serializable, IIpNetToMediaEntry, IIndexed, IVariableBindingSetter
{

    private int ipNetToMediaIfIndex;
    private String ipNetToMediaPhysAddress;
    private String ipNetToMediaNetAddress;
    private int ipNetToMediaType;
    private int ipNetToMediaPhyIfUnit;
    private int ipNetToMediaAgingTime;
    private String _index;
    private IpNetToMediaTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpNetToMediaEntry() {
    }

    public int getIpNetToMediaIfIndex() {
        return this.ipNetToMediaIfIndex;
    }

    public void setIpNetToMediaIfIndex(int ipNetToMediaIfIndex) {
        int oldValue = getIpNetToMediaIfIndex();
        this.ipNetToMediaIfIndex = ipNetToMediaIfIndex;
        notifyChange(1, oldValue, ipNetToMediaIfIndex);
    }

    public String getIpNetToMediaPhysAddress() {
        return this.ipNetToMediaPhysAddress;
    }

    public void setIpNetToMediaPhysAddress(String ipNetToMediaPhysAddress) {
        String oldValue = getIpNetToMediaPhysAddress();
        this.ipNetToMediaPhysAddress = ipNetToMediaPhysAddress;
        notifyChange(2, oldValue, ipNetToMediaPhysAddress);
    }

    public String getIpNetToMediaNetAddress() {
        return this.ipNetToMediaNetAddress;
    }

    public void setIpNetToMediaNetAddress(String ipNetToMediaNetAddress) {
        String oldValue = getIpNetToMediaNetAddress();
        this.ipNetToMediaNetAddress = ipNetToMediaNetAddress;
        notifyChange(3, oldValue, ipNetToMediaNetAddress);
    }

    public int getIpNetToMediaType() {
        return this.ipNetToMediaType;
    }

    public void setIpNetToMediaType(int ipNetToMediaType) {
        int oldValue = getIpNetToMediaType();
        this.ipNetToMediaType = ipNetToMediaType;
        notifyChange(4, oldValue, ipNetToMediaType);
    }

    public int getIpNetToMediaPhyIfUnit() {
        return this.ipNetToMediaPhyIfUnit;
    }

    public void setIpNetToMediaPhyIfUnit(int ipNetToMediaPhyIfUnit) {
        int oldValue = getIpNetToMediaPhyIfUnit();
        this.ipNetToMediaPhyIfUnit = ipNetToMediaPhyIfUnit;
        notifyChange(5, oldValue, ipNetToMediaPhyIfUnit);
    }

    public int getIpNetToMediaAgingTime() {
        return this.ipNetToMediaAgingTime;
    }

    public void setIpNetToMediaAgingTime(int ipNetToMediaAgingTime) {
        int oldValue = getIpNetToMediaAgingTime();
        this.ipNetToMediaAgingTime = ipNetToMediaAgingTime;
        notifyChange(6, oldValue, ipNetToMediaAgingTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpNetToMediaIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setIpNetToMediaPhysAddress(binding.getVariable().toString());
                break;
            case  3 :
                setIpNetToMediaNetAddress(binding.getVariable().toString());
                break;
            case  4 :
                setIpNetToMediaType(binding.getVariable().toInt());
                break;
            case  5 :
                setIpNetToMediaPhyIfUnit(binding.getVariable().toInt());
                break;
            case  6 :
                setIpNetToMediaAgingTime(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpNetToMediaIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIpNetToMediaNetAddress(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IpNetToMediaTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipNetToMediaIfIndex", ipNetToMediaIfIndex).append("ipNetToMediaPhysAddress", ipNetToMediaPhysAddress).append("ipNetToMediaNetAddress", ipNetToMediaNetAddress).append("ipNetToMediaType", ipNetToMediaType).append("ipNetToMediaPhyIfUnit", ipNetToMediaPhyIfUnit).append("ipNetToMediaAgingTime", ipNetToMediaAgingTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipNetToMediaIfIndex).append(ipNetToMediaPhysAddress).append(ipNetToMediaNetAddress).append(ipNetToMediaType).append(ipNetToMediaPhyIfUnit).append(ipNetToMediaAgingTime).append(_index).toHashCode();
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
        IpNetToMediaEntry rhs = ((IpNetToMediaEntry) obj);
        return new EqualsBuilder().append(ipNetToMediaIfIndex, rhs.ipNetToMediaIfIndex).append(ipNetToMediaPhysAddress, rhs.ipNetToMediaPhysAddress).append(ipNetToMediaNetAddress, rhs.ipNetToMediaNetAddress).append(ipNetToMediaType, rhs.ipNetToMediaType).append(ipNetToMediaPhyIfUnit, rhs.ipNetToMediaPhyIfUnit).append(ipNetToMediaAgingTime, rhs.ipNetToMediaAgingTime).append(_index, rhs._index).isEquals();
    }

    public IpNetToMediaEntry clone() {
        IpNetToMediaEntry _copy = new IpNetToMediaEntry();
        _copy.ipNetToMediaIfIndex = ipNetToMediaIfIndex;
        _copy.ipNetToMediaPhysAddress = ipNetToMediaPhysAddress;
        _copy.ipNetToMediaNetAddress = ipNetToMediaNetAddress;
        _copy.ipNetToMediaType = ipNetToMediaType;
        _copy.ipNetToMediaPhyIfUnit = ipNetToMediaPhyIfUnit;
        _copy.ipNetToMediaAgingTime = ipNetToMediaAgingTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.22.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipNetToMediaIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipNetToMediaPhysAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipNetToMediaNetAddress", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipNetToMediaType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipNetToMediaPhyIfUnit", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipNetToMediaAgingTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
