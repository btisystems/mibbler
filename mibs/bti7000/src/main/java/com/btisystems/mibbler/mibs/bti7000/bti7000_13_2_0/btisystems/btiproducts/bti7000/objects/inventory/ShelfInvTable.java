
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory.shelfinvtable.ShelfInvEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.IShelfInvTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.shelfinvtable.IShelfInvEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class ShelfInvTable
    extends DeviceEntity
    implements Serializable, IShelfInvTable, ITableAccess<IShelfInvEntry>
{

    private Map<String, IShelfInvEntry> shelfInvEntry = new TreeMap<String, IShelfInvEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ShelfInvTable() {
    }

    public Map<String, IShelfInvEntry> getShelfInvEntry() {
        return this.shelfInvEntry;
    }

    public IShelfInvEntry getEntry(String key) {
        return shelfInvEntry.get(key);
    }

    public void setEntry(String key, IShelfInvEntry value) {
        shelfInvEntry.put(key, value);
        ((ShelfInvEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IShelfInvEntry> getEntries() {
        return shelfInvEntry;
    }

    public ShelfInvEntry createEntry(String entryIndex) {
        ShelfInvEntry newEntry = new ShelfInvEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.2.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("shelfInvEntry", shelfInvEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(shelfInvEntry).toHashCode();
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
        ShelfInvTable rhs = ((ShelfInvTable) obj);
        return new EqualsBuilder().append(shelfInvEntry, rhs.shelfInvEntry).isEquals();
    }

    public ShelfInvTable clone() {
        ShelfInvTable _copy = new ShelfInvTable();
        for (Map.Entry<String, IShelfInvEntry> _entry: shelfInvEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "shelfInvEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
