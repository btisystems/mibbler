
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.ifmibobjects.ifrcvaddresstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects.ifrcvaddresstable.IIfRcvAddressEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.ifmibobjects.IfRcvAddressTable;
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

public class IfRcvAddressEntry
    extends DeviceEntity
    implements Serializable, IIfRcvAddressEntry, IIndexed, IVariableBindingSetter
{

    private String ifRcvAddressAddress;
    private int ifRcvAddressStatus;
    private Integer ifRcvAddressType;
    private String _index;
    private IfRcvAddressTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfRcvAddressEntry() {
    }

    public String getIfRcvAddressAddress() {
        return this.ifRcvAddressAddress;
    }

    public void setIfRcvAddressAddress(String ifRcvAddressAddress) {
        String oldValue = getIfRcvAddressAddress();
        this.ifRcvAddressAddress = ifRcvAddressAddress;
        notifyChange(1, oldValue, ifRcvAddressAddress);
    }

    public int getIfRcvAddressStatus() {
        return this.ifRcvAddressStatus;
    }

    public void setIfRcvAddressStatus(int ifRcvAddressStatus) {
        int oldValue = getIfRcvAddressStatus();
        this.ifRcvAddressStatus = ifRcvAddressStatus;
        notifyChange(2, oldValue, ifRcvAddressStatus);
    }

    public int getIfRcvAddressType() {
        if (this.ifRcvAddressType == null) {
            return  2;
        }
        return this.ifRcvAddressType;
    }

    public boolean isIfRcvAddressTypeDefined() {
        return (this.ifRcvAddressType!= null);
    }

    public void setIfRcvAddressType(int ifRcvAddressType) {
        int oldValue = getIfRcvAddressType();
        this.ifRcvAddressType = ifRcvAddressType;
        notifyChange(3, oldValue, ifRcvAddressType);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIfRcvAddressAddress(binding.getVariable().toString());
                break;
            case  2 :
                setIfRcvAddressStatus(binding.getVariable().toInt());
                break;
            case  3 :
                setIfRcvAddressType(binding.getVariable().toInt());
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
        _len = _oidInts[arrayOffset ++];
        setIfRcvAddressAddress(_getMacAddress(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IfRcvAddressTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifRcvAddressAddress", ifRcvAddressAddress).append("ifRcvAddressStatus", ifRcvAddressStatus).append("ifRcvAddressType", ifRcvAddressType).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifRcvAddressAddress).append(ifRcvAddressStatus).append(ifRcvAddressType).append(_index).toHashCode();
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
        IfRcvAddressEntry rhs = ((IfRcvAddressEntry) obj);
        return new EqualsBuilder().append(ifRcvAddressAddress, rhs.ifRcvAddressAddress).append(ifRcvAddressStatus, rhs.ifRcvAddressStatus).append(ifRcvAddressType, rhs.ifRcvAddressType).append(_index, rhs._index).isEquals();
    }

    public IfRcvAddressEntry clone() {
        IfRcvAddressEntry _copy = new IfRcvAddressEntry();
        _copy.ifRcvAddressAddress = ifRcvAddressAddress;
        _copy.ifRcvAddressStatus = ifRcvAddressStatus;
        _copy.ifRcvAddressType = ifRcvAddressType;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.31.1.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifRcvAddressAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ifRcvAddressStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ifRcvAddressType", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
