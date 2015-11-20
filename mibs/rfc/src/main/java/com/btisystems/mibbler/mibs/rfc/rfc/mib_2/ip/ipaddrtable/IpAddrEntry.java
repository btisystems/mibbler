
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ip.ipaddrtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ip.ipaddrtable.IIpAddrEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ip.IpAddrTable;
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

public class IpAddrEntry
    extends DeviceEntity
    implements Serializable, IIpAddrEntry, IIndexed, IVariableBindingSetter
{

    private String ipAdEntAddr;
    private int ipAdEntIfIndex;
    private String ipAdEntNetMask;
    private int ipAdEntBcastAddr;
    private int ipAdEntReasmMaxSize;
    private String _index;
    private IpAddrTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpAddrEntry() {
    }

    public String getIpAdEntAddr() {
        return this.ipAdEntAddr;
    }

    public void setIpAdEntAddr(String ipAdEntAddr) {
        String oldValue = getIpAdEntAddr();
        this.ipAdEntAddr = ipAdEntAddr;
        notifyChange(1, oldValue, ipAdEntAddr);
    }

    public int getIpAdEntIfIndex() {
        return this.ipAdEntIfIndex;
    }

    public void setIpAdEntIfIndex(int ipAdEntIfIndex) {
        int oldValue = getIpAdEntIfIndex();
        this.ipAdEntIfIndex = ipAdEntIfIndex;
        notifyChange(2, oldValue, ipAdEntIfIndex);
    }

    public String getIpAdEntNetMask() {
        return this.ipAdEntNetMask;
    }

    public void setIpAdEntNetMask(String ipAdEntNetMask) {
        String oldValue = getIpAdEntNetMask();
        this.ipAdEntNetMask = ipAdEntNetMask;
        notifyChange(3, oldValue, ipAdEntNetMask);
    }

    public int getIpAdEntBcastAddr() {
        return this.ipAdEntBcastAddr;
    }

    public void setIpAdEntBcastAddr(int ipAdEntBcastAddr) {
        int oldValue = getIpAdEntBcastAddr();
        this.ipAdEntBcastAddr = ipAdEntBcastAddr;
        notifyChange(4, oldValue, ipAdEntBcastAddr);
    }

    public int getIpAdEntReasmMaxSize() {
        return this.ipAdEntReasmMaxSize;
    }

    public void setIpAdEntReasmMaxSize(int ipAdEntReasmMaxSize) {
        int oldValue = getIpAdEntReasmMaxSize();
        this.ipAdEntReasmMaxSize = ipAdEntReasmMaxSize;
        notifyChange(5, oldValue, ipAdEntReasmMaxSize);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpAdEntAddr(binding.getVariable().toString());
                break;
            case  2 :
                setIpAdEntIfIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setIpAdEntNetMask(binding.getVariable().toString());
                break;
            case  4 :
                setIpAdEntBcastAddr(binding.getVariable().toInt());
                break;
            case  5 :
                setIpAdEntReasmMaxSize(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpAdEntAddr(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IpAddrTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipAdEntAddr", ipAdEntAddr).append("ipAdEntIfIndex", ipAdEntIfIndex).append("ipAdEntNetMask", ipAdEntNetMask).append("ipAdEntBcastAddr", ipAdEntBcastAddr).append("ipAdEntReasmMaxSize", ipAdEntReasmMaxSize).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipAdEntAddr).append(ipAdEntIfIndex).append(ipAdEntNetMask).append(ipAdEntBcastAddr).append(ipAdEntReasmMaxSize).append(_index).toHashCode();
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
        IpAddrEntry rhs = ((IpAddrEntry) obj);
        return new EqualsBuilder().append(ipAdEntAddr, rhs.ipAdEntAddr).append(ipAdEntIfIndex, rhs.ipAdEntIfIndex).append(ipAdEntNetMask, rhs.ipAdEntNetMask).append(ipAdEntBcastAddr, rhs.ipAdEntBcastAddr).append(ipAdEntReasmMaxSize, rhs.ipAdEntReasmMaxSize).append(_index, rhs._index).isEquals();
    }

    public IpAddrEntry clone() {
        IpAddrEntry _copy = new IpAddrEntry();
        _copy.ipAdEntAddr = ipAdEntAddr;
        _copy.ipAdEntIfIndex = ipAdEntIfIndex;
        _copy.ipAdEntNetMask = ipAdEntNetMask;
        _copy.ipAdEntBcastAddr = ipAdEntBcastAddr;
        _copy.ipAdEntReasmMaxSize = ipAdEntReasmMaxSize;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.20.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipAdEntAddr", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipAdEntIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipAdEntNetMask", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipAdEntBcastAddr", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipAdEntReasmMaxSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
