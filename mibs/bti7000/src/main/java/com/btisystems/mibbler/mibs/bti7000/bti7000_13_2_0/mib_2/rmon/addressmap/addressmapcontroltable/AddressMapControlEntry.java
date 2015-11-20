
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.addressmap.addressmapcontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.addressmap.AddressMapControlTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.addressmap.addressmapcontroltable.IAddressMapControlEntry;
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

public class AddressMapControlEntry
    extends DeviceEntity
    implements Serializable, IAddressMapControlEntry, IIndexed, IVariableBindingSetter
{

    private int addressMapControlIndex;
    private String addressMapControlDataSource;
    private int addressMapControlDroppedFrames;
    private String addressMapControlOwner;
    private int addressMapControlStatus;
    private String _index;
    private AddressMapControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AddressMapControlEntry() {
    }

    public int getAddressMapControlIndex() {
        return this.addressMapControlIndex;
    }

    public void setAddressMapControlIndex(int addressMapControlIndex) {
        int oldValue = getAddressMapControlIndex();
        this.addressMapControlIndex = addressMapControlIndex;
        notifyChange(1, oldValue, addressMapControlIndex);
    }

    public String getAddressMapControlDataSource() {
        return this.addressMapControlDataSource;
    }

    public void setAddressMapControlDataSource(String addressMapControlDataSource) {
        String oldValue = getAddressMapControlDataSource();
        this.addressMapControlDataSource = addressMapControlDataSource;
        notifyChange(2, oldValue, addressMapControlDataSource);
    }

    public int getAddressMapControlDroppedFrames() {
        return this.addressMapControlDroppedFrames;
    }

    public void setAddressMapControlDroppedFrames(int addressMapControlDroppedFrames) {
        int oldValue = getAddressMapControlDroppedFrames();
        this.addressMapControlDroppedFrames = addressMapControlDroppedFrames;
        notifyChange(3, oldValue, addressMapControlDroppedFrames);
    }

    public String getAddressMapControlOwner() {
        return this.addressMapControlOwner;
    }

    public void setAddressMapControlOwner(String addressMapControlOwner) {
        String oldValue = getAddressMapControlOwner();
        this.addressMapControlOwner = addressMapControlOwner;
        notifyChange(4, oldValue, addressMapControlOwner);
    }

    public int getAddressMapControlStatus() {
        return this.addressMapControlStatus;
    }

    public void setAddressMapControlStatus(int addressMapControlStatus) {
        int oldValue = getAddressMapControlStatus();
        this.addressMapControlStatus = addressMapControlStatus;
        notifyChange(5, oldValue, addressMapControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setAddressMapControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setAddressMapControlDataSource(binding.getVariable().toString());
                break;
            case  3 :
                setAddressMapControlDroppedFrames(binding.getVariable().toInt());
                break;
            case  4 :
                setAddressMapControlOwner(binding.getVariable().toString());
                break;
            case  5 :
                setAddressMapControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setAddressMapControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AddressMapControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("addressMapControlIndex", addressMapControlIndex).append("addressMapControlDataSource", addressMapControlDataSource).append("addressMapControlDroppedFrames", addressMapControlDroppedFrames).append("addressMapControlOwner", addressMapControlOwner).append("addressMapControlStatus", addressMapControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(addressMapControlIndex).append(addressMapControlDataSource).append(addressMapControlDroppedFrames).append(addressMapControlOwner).append(addressMapControlStatus).append(_index).toHashCode();
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
        AddressMapControlEntry rhs = ((AddressMapControlEntry) obj);
        return new EqualsBuilder().append(addressMapControlIndex, rhs.addressMapControlIndex).append(addressMapControlDataSource, rhs.addressMapControlDataSource).append(addressMapControlDroppedFrames, rhs.addressMapControlDroppedFrames).append(addressMapControlOwner, rhs.addressMapControlOwner).append(addressMapControlStatus, rhs.addressMapControlStatus).append(_index, rhs._index).isEquals();
    }

    public AddressMapControlEntry clone() {
        AddressMapControlEntry _copy = new AddressMapControlEntry();
        _copy.addressMapControlIndex = addressMapControlIndex;
        _copy.addressMapControlDataSource = addressMapControlDataSource;
        _copy.addressMapControlDroppedFrames = addressMapControlDroppedFrames;
        _copy.addressMapControlOwner = addressMapControlOwner;
        _copy.addressMapControlStatus = addressMapControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.13.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "addressMapControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "addressMapControlDataSource", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "addressMapControlDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "addressMapControlOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "addressMapControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
