
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.addressmap.addressmaptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.addressmap.AddressMapTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.addressmap.addressmaptable.IAddressMapEntry;
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

public class AddressMapEntry
    extends DeviceEntity
    implements Serializable, IAddressMapEntry, IIndexed, IVariableBindingSetter
{

    private int addressMapTimeMark;
    private String addressMapNetworkAddress;
    private String addressMapSource;
    private String addressMapPhysicalAddress;
    private int addressMapLastChange;
    private String _index;
    private AddressMapTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AddressMapEntry() {
    }

    public int getAddressMapTimeMark() {
        return this.addressMapTimeMark;
    }

    public void setAddressMapTimeMark(int addressMapTimeMark) {
        int oldValue = getAddressMapTimeMark();
        this.addressMapTimeMark = addressMapTimeMark;
        notifyChange(1, oldValue, addressMapTimeMark);
    }

    public String getAddressMapNetworkAddress() {
        return this.addressMapNetworkAddress;
    }

    public void setAddressMapNetworkAddress(String addressMapNetworkAddress) {
        String oldValue = getAddressMapNetworkAddress();
        this.addressMapNetworkAddress = addressMapNetworkAddress;
        notifyChange(2, oldValue, addressMapNetworkAddress);
    }

    public String getAddressMapSource() {
        return this.addressMapSource;
    }

    public void setAddressMapSource(String addressMapSource) {
        String oldValue = getAddressMapSource();
        this.addressMapSource = addressMapSource;
        notifyChange(3, oldValue, addressMapSource);
    }

    public String getAddressMapPhysicalAddress() {
        return this.addressMapPhysicalAddress;
    }

    public void setAddressMapPhysicalAddress(String addressMapPhysicalAddress) {
        String oldValue = getAddressMapPhysicalAddress();
        this.addressMapPhysicalAddress = addressMapPhysicalAddress;
        notifyChange(4, oldValue, addressMapPhysicalAddress);
    }

    public int getAddressMapLastChange() {
        return this.addressMapLastChange;
    }

    public void setAddressMapLastChange(int addressMapLastChange) {
        int oldValue = getAddressMapLastChange();
        this.addressMapLastChange = addressMapLastChange;
        notifyChange(5, oldValue, addressMapLastChange);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setAddressMapTimeMark(binding.getVariable().toInt());
                break;
            case  2 :
                setAddressMapNetworkAddress(binding.getVariable().toString());
                break;
            case  3 :
                setAddressMapSource(binding.getVariable().toString());
                break;
            case  4 :
                setAddressMapPhysicalAddress(binding.getVariable().toString());
                break;
            case  5 :
                setAddressMapLastChange(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setAddressMapTimeMark(_oidInts[arrayOffset]);
        arrayOffset += 1;
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setAddressMapNetworkAddress(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setAddressMapSource(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AddressMapTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("addressMapTimeMark", addressMapTimeMark).append("addressMapNetworkAddress", addressMapNetworkAddress).append("addressMapSource", addressMapSource).append("addressMapPhysicalAddress", addressMapPhysicalAddress).append("addressMapLastChange", addressMapLastChange).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(addressMapTimeMark).append(addressMapNetworkAddress).append(addressMapSource).append(addressMapPhysicalAddress).append(addressMapLastChange).append(_index).toHashCode();
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
        AddressMapEntry rhs = ((AddressMapEntry) obj);
        return new EqualsBuilder().append(addressMapTimeMark, rhs.addressMapTimeMark).append(addressMapNetworkAddress, rhs.addressMapNetworkAddress).append(addressMapSource, rhs.addressMapSource).append(addressMapPhysicalAddress, rhs.addressMapPhysicalAddress).append(addressMapLastChange, rhs.addressMapLastChange).append(_index, rhs._index).isEquals();
    }

    public AddressMapEntry clone() {
        AddressMapEntry _copy = new AddressMapEntry();
        _copy.addressMapTimeMark = addressMapTimeMark;
        _copy.addressMapNetworkAddress = addressMapNetworkAddress;
        _copy.addressMapSource = addressMapSource;
        _copy.addressMapPhysicalAddress = addressMapPhysicalAddress;
        _copy.addressMapLastChange = addressMapLastChange;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.13.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "addressMapTimeMark", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "addressMapNetworkAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "addressMapSource", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "addressMapPhysicalAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "addressMapLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
