
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.addressmap;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.addressmap.addressmaptable.AddressMapEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.addressmap.IAddressMapTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.addressmap.addressmaptable.IAddressMapEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AddressMapTable
    extends DeviceEntity
    implements Serializable, IAddressMapTable, ITableAccess<IAddressMapEntry>
{

    private Map<String, IAddressMapEntry> addressMapEntry = new TreeMap<String, IAddressMapEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AddressMapTable() {
    }

    public Map<String, IAddressMapEntry> getAddressMapEntry() {
        return this.addressMapEntry;
    }

    public IAddressMapEntry getEntry(String key) {
        return addressMapEntry.get(key);
    }

    public void setEntry(String key, IAddressMapEntry value) {
        addressMapEntry.put(key, value);
        ((AddressMapEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAddressMapEntry> getEntries() {
        return addressMapEntry;
    }

    public AddressMapEntry createEntry(String entryIndex) {
        AddressMapEntry newEntry = new AddressMapEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.13.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("addressMapEntry", addressMapEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(addressMapEntry).toHashCode();
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
        AddressMapTable rhs = ((AddressMapTable) obj);
        return new EqualsBuilder().append(addressMapEntry, rhs.addressMapEntry).isEquals();
    }

    public AddressMapTable clone() {
        AddressMapTable _copy = new AddressMapTable();
        for (Map.Entry<String, IAddressMapEntry> _entry: addressMapEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.13.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "addressMapEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
