
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.ipv6nettomediatable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6nettomediatable.IIpv6NetToMediaEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.Ipv6NetToMediaTable;
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

public class Ipv6NetToMediaEntry
    extends DeviceEntity
    implements Serializable, IIpv6NetToMediaEntry, IIndexed, IVariableBindingSetter
{

    private String ipv6NetToMediaNetAddress;
    private String ipv6NetToMediaPhysAddress;
    private int ipv6NetToMediaType;
    private int ipv6IfNetToMediaState;
    private int ipv6IfNetToMediaLastUpdated;
    private Integer ipv6NetToMediaValid;
    private String _index;
    private Ipv6NetToMediaTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6NetToMediaEntry() {
    }

    public String getIpv6NetToMediaNetAddress() {
        return this.ipv6NetToMediaNetAddress;
    }

    public void setIpv6NetToMediaNetAddress(String ipv6NetToMediaNetAddress) {
        String oldValue = getIpv6NetToMediaNetAddress();
        this.ipv6NetToMediaNetAddress = ipv6NetToMediaNetAddress;
        notifyChange(1, oldValue, ipv6NetToMediaNetAddress);
    }

    public String getIpv6NetToMediaPhysAddress() {
        return this.ipv6NetToMediaPhysAddress;
    }

    public void setIpv6NetToMediaPhysAddress(String ipv6NetToMediaPhysAddress) {
        String oldValue = getIpv6NetToMediaPhysAddress();
        this.ipv6NetToMediaPhysAddress = ipv6NetToMediaPhysAddress;
        notifyChange(2, oldValue, ipv6NetToMediaPhysAddress);
    }

    public int getIpv6NetToMediaType() {
        return this.ipv6NetToMediaType;
    }

    public void setIpv6NetToMediaType(int ipv6NetToMediaType) {
        int oldValue = getIpv6NetToMediaType();
        this.ipv6NetToMediaType = ipv6NetToMediaType;
        notifyChange(3, oldValue, ipv6NetToMediaType);
    }

    public int getIpv6IfNetToMediaState() {
        return this.ipv6IfNetToMediaState;
    }

    public void setIpv6IfNetToMediaState(int ipv6IfNetToMediaState) {
        int oldValue = getIpv6IfNetToMediaState();
        this.ipv6IfNetToMediaState = ipv6IfNetToMediaState;
        notifyChange(4, oldValue, ipv6IfNetToMediaState);
    }

    public int getIpv6IfNetToMediaLastUpdated() {
        return this.ipv6IfNetToMediaLastUpdated;
    }

    public void setIpv6IfNetToMediaLastUpdated(int ipv6IfNetToMediaLastUpdated) {
        int oldValue = getIpv6IfNetToMediaLastUpdated();
        this.ipv6IfNetToMediaLastUpdated = ipv6IfNetToMediaLastUpdated;
        notifyChange(5, oldValue, ipv6IfNetToMediaLastUpdated);
    }

    public int getIpv6NetToMediaValid() {
        if (this.ipv6NetToMediaValid == null) {
            return  1;
        }
        return this.ipv6NetToMediaValid;
    }

    public boolean isIpv6NetToMediaValidDefined() {
        return (this.ipv6NetToMediaValid!= null);
    }

    public void setIpv6NetToMediaValid(int ipv6NetToMediaValid) {
        int oldValue = getIpv6NetToMediaValid();
        this.ipv6NetToMediaValid = ipv6NetToMediaValid;
        notifyChange(6, oldValue, ipv6NetToMediaValid);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIpv6NetToMediaNetAddress(binding.getVariable().toString());
                break;
            case  2 :
                setIpv6NetToMediaPhysAddress(binding.getVariable().toString());
                break;
            case  3 :
                setIpv6NetToMediaType(binding.getVariable().toInt());
                break;
            case  4 :
                setIpv6IfNetToMediaState(binding.getVariable().toInt());
                break;
            case  5 :
                setIpv6IfNetToMediaLastUpdated(binding.getVariable().toInt());
                break;
            case  6 :
                setIpv6NetToMediaValid(binding.getVariable().toInt());
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
        setIpv6NetToMediaNetAddress(new String(_oidBytes, arrayOffset, 16));
        arrayOffset += 16;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Ipv6NetToMediaTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6NetToMediaNetAddress", ipv6NetToMediaNetAddress).append("ipv6NetToMediaPhysAddress", ipv6NetToMediaPhysAddress).append("ipv6NetToMediaType", ipv6NetToMediaType).append("ipv6IfNetToMediaState", ipv6IfNetToMediaState).append("ipv6IfNetToMediaLastUpdated", ipv6IfNetToMediaLastUpdated).append("ipv6NetToMediaValid", ipv6NetToMediaValid).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6NetToMediaNetAddress).append(ipv6NetToMediaPhysAddress).append(ipv6NetToMediaType).append(ipv6IfNetToMediaState).append(ipv6IfNetToMediaLastUpdated).append(ipv6NetToMediaValid).append(_index).toHashCode();
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
        Ipv6NetToMediaEntry rhs = ((Ipv6NetToMediaEntry) obj);
        return new EqualsBuilder().append(ipv6NetToMediaNetAddress, rhs.ipv6NetToMediaNetAddress).append(ipv6NetToMediaPhysAddress, rhs.ipv6NetToMediaPhysAddress).append(ipv6NetToMediaType, rhs.ipv6NetToMediaType).append(ipv6IfNetToMediaState, rhs.ipv6IfNetToMediaState).append(ipv6IfNetToMediaLastUpdated, rhs.ipv6IfNetToMediaLastUpdated).append(ipv6NetToMediaValid, rhs.ipv6NetToMediaValid).append(_index, rhs._index).isEquals();
    }

    public Ipv6NetToMediaEntry clone() {
        Ipv6NetToMediaEntry _copy = new Ipv6NetToMediaEntry();
        _copy.ipv6NetToMediaNetAddress = ipv6NetToMediaNetAddress;
        _copy.ipv6NetToMediaPhysAddress = ipv6NetToMediaPhysAddress;
        _copy.ipv6NetToMediaType = ipv6NetToMediaType;
        _copy.ipv6IfNetToMediaState = ipv6IfNetToMediaState;
        _copy.ipv6IfNetToMediaLastUpdated = ipv6IfNetToMediaLastUpdated;
        _copy.ipv6NetToMediaValid = ipv6NetToMediaValid;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1.12.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6NetToMediaNetAddress", DeviceEntityDescription.FieldType.STRING, 40));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6NetToMediaPhysAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6NetToMediaType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipv6IfNetToMediaState", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipv6IfNetToMediaLastUpdated", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipv6NetToMediaValid", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
