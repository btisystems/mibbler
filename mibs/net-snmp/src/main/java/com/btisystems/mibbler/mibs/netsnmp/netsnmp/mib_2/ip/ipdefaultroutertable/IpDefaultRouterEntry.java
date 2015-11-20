
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipdefaultroutertable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipdefaultroutertable.IIpDefaultRouterEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpDefaultRouterTable;
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

public class IpDefaultRouterEntry
    extends DeviceEntity
    implements Serializable, IIpDefaultRouterEntry, IIndexed, IVariableBindingSetter
{

    private int ipDefaultRouterAddressType;
    private String ipDefaultRouterAddress;
    private int ipDefaultRouterIfIndex;
    private int ipDefaultRouterLifetime;
    private int ipDefaultRouterPreference;
    private String _index;
    private IpDefaultRouterTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpDefaultRouterEntry() {
    }

    public int getIpDefaultRouterAddressType() {
        return this.ipDefaultRouterAddressType;
    }

    public void setIpDefaultRouterAddressType(int ipDefaultRouterAddressType) {
        int oldValue = getIpDefaultRouterAddressType();
        this.ipDefaultRouterAddressType = ipDefaultRouterAddressType;
        notifyChange(1, oldValue, ipDefaultRouterAddressType);
    }

    public String getIpDefaultRouterAddress() {
        return this.ipDefaultRouterAddress;
    }

    public void setIpDefaultRouterAddress(String ipDefaultRouterAddress) {
        String oldValue = getIpDefaultRouterAddress();
        this.ipDefaultRouterAddress = ipDefaultRouterAddress;
        notifyChange(2, oldValue, ipDefaultRouterAddress);
    }

    public int getIpDefaultRouterIfIndex() {
        return this.ipDefaultRouterIfIndex;
    }

    public void setIpDefaultRouterIfIndex(int ipDefaultRouterIfIndex) {
        int oldValue = getIpDefaultRouterIfIndex();
        this.ipDefaultRouterIfIndex = ipDefaultRouterIfIndex;
        notifyChange(3, oldValue, ipDefaultRouterIfIndex);
    }

    public int getIpDefaultRouterLifetime() {
        return this.ipDefaultRouterLifetime;
    }

    public void setIpDefaultRouterLifetime(int ipDefaultRouterLifetime) {
        int oldValue = getIpDefaultRouterLifetime();
        this.ipDefaultRouterLifetime = ipDefaultRouterLifetime;
        notifyChange(4, oldValue, ipDefaultRouterLifetime);
    }

    public int getIpDefaultRouterPreference() {
        return this.ipDefaultRouterPreference;
    }

    public void setIpDefaultRouterPreference(int ipDefaultRouterPreference) {
        int oldValue = getIpDefaultRouterPreference();
        this.ipDefaultRouterPreference = ipDefaultRouterPreference;
        notifyChange(5, oldValue, ipDefaultRouterPreference);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpDefaultRouterAddressType(binding.getVariable().toInt());
                break;
            case  2 :
                setIpDefaultRouterAddress(binding.getVariable().toString());
                break;
            case  3 :
                setIpDefaultRouterIfIndex(binding.getVariable().toInt());
                break;
            case  4 :
                setIpDefaultRouterLifetime(binding.getVariable().toInt());
                break;
            case  5 :
                setIpDefaultRouterPreference(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpDefaultRouterAddressType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setIpDefaultRouterAddress(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        setIpDefaultRouterIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IpDefaultRouterTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipDefaultRouterAddressType", ipDefaultRouterAddressType).append("ipDefaultRouterAddress", ipDefaultRouterAddress).append("ipDefaultRouterIfIndex", ipDefaultRouterIfIndex).append("ipDefaultRouterLifetime", ipDefaultRouterLifetime).append("ipDefaultRouterPreference", ipDefaultRouterPreference).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipDefaultRouterAddressType).append(ipDefaultRouterAddress).append(ipDefaultRouterIfIndex).append(ipDefaultRouterLifetime).append(ipDefaultRouterPreference).append(_index).toHashCode();
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
        IpDefaultRouterEntry rhs = ((IpDefaultRouterEntry) obj);
        return new EqualsBuilder().append(ipDefaultRouterAddressType, rhs.ipDefaultRouterAddressType).append(ipDefaultRouterAddress, rhs.ipDefaultRouterAddress).append(ipDefaultRouterIfIndex, rhs.ipDefaultRouterIfIndex).append(ipDefaultRouterLifetime, rhs.ipDefaultRouterLifetime).append(ipDefaultRouterPreference, rhs.ipDefaultRouterPreference).append(_index, rhs._index).isEquals();
    }

    public IpDefaultRouterEntry clone() {
        IpDefaultRouterEntry _copy = new IpDefaultRouterEntry();
        _copy.ipDefaultRouterAddressType = ipDefaultRouterAddressType;
        _copy.ipDefaultRouterAddress = ipDefaultRouterAddress;
        _copy.ipDefaultRouterIfIndex = ipDefaultRouterIfIndex;
        _copy.ipDefaultRouterLifetime = ipDefaultRouterLifetime;
        _copy.ipDefaultRouterPreference = ipDefaultRouterPreference;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.37.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipDefaultRouterAddressType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipDefaultRouterAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipDefaultRouterIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipDefaultRouterLifetime", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipDefaultRouterPreference", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
