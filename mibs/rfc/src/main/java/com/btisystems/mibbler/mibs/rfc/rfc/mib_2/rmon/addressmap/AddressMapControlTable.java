
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.addressmap;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.addressmap.IAddressMapControlTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.addressmap.addressmapcontroltable.IAddressMapControlEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.addressmap.addressmapcontroltable.AddressMapControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AddressMapControlTable
    extends DeviceEntity
    implements Serializable, IAddressMapControlTable, ITableAccess<IAddressMapControlEntry>
{

    private Map<String, IAddressMapControlEntry> addressMapControlEntry = new TreeMap<String, IAddressMapControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AddressMapControlTable() {
    }

    public Map<String, IAddressMapControlEntry> getAddressMapControlEntry() {
        return this.addressMapControlEntry;
    }

    public IAddressMapControlEntry getEntry(String key) {
        return addressMapControlEntry.get(key);
    }

    public void setEntry(String key, IAddressMapControlEntry value) {
        addressMapControlEntry.put(key, value);
        ((AddressMapControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAddressMapControlEntry> getEntries() {
        return addressMapControlEntry;
    }

    public AddressMapControlEntry createEntry(String entryIndex) {
        AddressMapControlEntry newEntry = new AddressMapControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.13.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("addressMapControlEntry", addressMapControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(addressMapControlEntry).toHashCode();
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
        AddressMapControlTable rhs = ((AddressMapControlTable) obj);
        return new EqualsBuilder().append(addressMapControlEntry, rhs.addressMapControlEntry).isEquals();
    }

    public AddressMapControlTable clone() {
        AddressMapControlTable _copy = new AddressMapControlTable();
        for (Map.Entry<String, IAddressMapControlEntry> _entry: addressMapControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.13.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "addressMapControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
