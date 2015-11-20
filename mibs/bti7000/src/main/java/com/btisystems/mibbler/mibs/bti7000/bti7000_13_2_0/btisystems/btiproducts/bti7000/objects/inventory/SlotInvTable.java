
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory.slotinvtable.SlotInvEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.ISlotInvTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.slotinvtable.ISlotInvEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SlotInvTable
    extends DeviceEntity
    implements Serializable, ISlotInvTable, ITableAccess<ISlotInvEntry>
{

    private Map<String, ISlotInvEntry> slotInvEntry = new TreeMap<String, ISlotInvEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SlotInvTable() {
    }

    public Map<String, ISlotInvEntry> getSlotInvEntry() {
        return this.slotInvEntry;
    }

    public ISlotInvEntry getEntry(String key) {
        return slotInvEntry.get(key);
    }

    public void setEntry(String key, ISlotInvEntry value) {
        slotInvEntry.put(key, value);
        ((SlotInvEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISlotInvEntry> getEntries() {
        return slotInvEntry;
    }

    public SlotInvEntry createEntry(String entryIndex) {
        SlotInvEntry newEntry = new SlotInvEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.2.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("slotInvEntry", slotInvEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(slotInvEntry).toHashCode();
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
        SlotInvTable rhs = ((SlotInvTable) obj);
        return new EqualsBuilder().append(slotInvEntry, rhs.slotInvEntry).isEquals();
    }

    public SlotInvTable clone() {
        SlotInvTable _copy = new SlotInvTable();
        for (Map.Entry<String, ISlotInvEntry> _entry: slotInvEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.2.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "slotInvEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
