
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.ipv6addrtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6addrtable.IIpv6AddrEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.Ipv6AddrTable;
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

public class Ipv6AddrEntry
    extends DeviceEntity
    implements Serializable, IIpv6AddrEntry, IIndexed, IVariableBindingSetter
{

    private String ipv6AddrAddress;
    private int ipv6AddrPfxLength;
    private int ipv6AddrType;
    private int ipv6AddrAnycastFlag;
    private int ipv6AddrStatus;
    private String _index;
    private Ipv6AddrTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6AddrEntry() {
    }

    public String getIpv6AddrAddress() {
        return this.ipv6AddrAddress;
    }

    public void setIpv6AddrAddress(String ipv6AddrAddress) {
        String oldValue = getIpv6AddrAddress();
        this.ipv6AddrAddress = ipv6AddrAddress;
        notifyChange(1, oldValue, ipv6AddrAddress);
    }

    public int getIpv6AddrPfxLength() {
        return this.ipv6AddrPfxLength;
    }

    public void setIpv6AddrPfxLength(int ipv6AddrPfxLength) {
        int oldValue = getIpv6AddrPfxLength();
        this.ipv6AddrPfxLength = ipv6AddrPfxLength;
        notifyChange(2, oldValue, ipv6AddrPfxLength);
    }

    public int getIpv6AddrType() {
        return this.ipv6AddrType;
    }

    public void setIpv6AddrType(int ipv6AddrType) {
        int oldValue = getIpv6AddrType();
        this.ipv6AddrType = ipv6AddrType;
        notifyChange(3, oldValue, ipv6AddrType);
    }

    public int getIpv6AddrAnycastFlag() {
        return this.ipv6AddrAnycastFlag;
    }

    public void setIpv6AddrAnycastFlag(int ipv6AddrAnycastFlag) {
        int oldValue = getIpv6AddrAnycastFlag();
        this.ipv6AddrAnycastFlag = ipv6AddrAnycastFlag;
        notifyChange(4, oldValue, ipv6AddrAnycastFlag);
    }

    public int getIpv6AddrStatus() {
        return this.ipv6AddrStatus;
    }

    public void setIpv6AddrStatus(int ipv6AddrStatus) {
        int oldValue = getIpv6AddrStatus();
        this.ipv6AddrStatus = ipv6AddrStatus;
        notifyChange(5, oldValue, ipv6AddrStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIpv6AddrAddress(binding.getVariable().toString());
                break;
            case  2 :
                setIpv6AddrPfxLength(binding.getVariable().toInt());
                break;
            case  3 :
                setIpv6AddrType(binding.getVariable().toInt());
                break;
            case  4 :
                setIpv6AddrAnycastFlag(binding.getVariable().toInt());
                break;
            case  5 :
                setIpv6AddrStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        arrayOffset += 1;
        setIpv6AddrAddress(new String(_oidBytes, arrayOffset, 16));
        arrayOffset += 16;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Ipv6AddrTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6AddrAddress", ipv6AddrAddress).append("ipv6AddrPfxLength", ipv6AddrPfxLength).append("ipv6AddrType", ipv6AddrType).append("ipv6AddrAnycastFlag", ipv6AddrAnycastFlag).append("ipv6AddrStatus", ipv6AddrStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6AddrAddress).append(ipv6AddrPfxLength).append(ipv6AddrType).append(ipv6AddrAnycastFlag).append(ipv6AddrStatus).append(_index).toHashCode();
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
        Ipv6AddrEntry rhs = ((Ipv6AddrEntry) obj);
        return new EqualsBuilder().append(ipv6AddrAddress, rhs.ipv6AddrAddress).append(ipv6AddrPfxLength, rhs.ipv6AddrPfxLength).append(ipv6AddrType, rhs.ipv6AddrType).append(ipv6AddrAnycastFlag, rhs.ipv6AddrAnycastFlag).append(ipv6AddrStatus, rhs.ipv6AddrStatus).append(_index, rhs._index).isEquals();
    }

    public Ipv6AddrEntry clone() {
        Ipv6AddrEntry _copy = new Ipv6AddrEntry();
        _copy.ipv6AddrAddress = ipv6AddrAddress;
        _copy.ipv6AddrPfxLength = ipv6AddrPfxLength;
        _copy.ipv6AddrType = ipv6AddrType;
        _copy.ipv6AddrAnycastFlag = ipv6AddrAnycastFlag;
        _copy.ipv6AddrStatus = ipv6AddrStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1.8.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6AddrAddress", DeviceEntityDescription.FieldType.STRING, 40));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6AddrPfxLength", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6AddrType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipv6AddrAnycastFlag", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipv6AddrStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
