
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.equipment;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.equipment.shelftable.ShelfEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.equipment.IShelfTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.equipment.shelftable.IShelfEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class ShelfTable
    extends DeviceEntity
    implements Serializable, IShelfTable, ITableAccess<IShelfEntry>
{

    private Map<String, IShelfEntry> shelfEntry = new TreeMap<String, IShelfEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ShelfTable() {
    }

    public Map<String, IShelfEntry> getShelfEntry() {
        return this.shelfEntry;
    }

    public IShelfEntry getEntry(String key) {
        return shelfEntry.get(key);
    }

    public void setEntry(String key, IShelfEntry value) {
        shelfEntry.put(key, value);
        ((ShelfEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IShelfEntry> getEntries() {
        return shelfEntry;
    }

    public ShelfEntry createEntry(String entryIndex) {
        ShelfEntry newEntry = new ShelfEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.3.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("shelfEntry", shelfEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(shelfEntry).toHashCode();
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
        ShelfTable rhs = ((ShelfTable) obj);
        return new EqualsBuilder().append(shelfEntry, rhs.shelfEntry).isEquals();
    }

    public ShelfTable clone() {
        ShelfTable _copy = new ShelfTable();
        for (Map.Entry<String, IShelfEntry> _entry: shelfEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "shelfEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
