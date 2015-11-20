
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory.slotinvdatatable.SlotInvDataEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.ISlotInvDataTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.slotinvdatatable.ISlotInvDataEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SlotInvDataTable
    extends DeviceEntity
    implements Serializable, ISlotInvDataTable, ITableAccess<ISlotInvDataEntry>
{

    private Map<String, ISlotInvDataEntry> slotInvDataEntry = new TreeMap<String, ISlotInvDataEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SlotInvDataTable() {
    }

    public Map<String, ISlotInvDataEntry> getSlotInvDataEntry() {
        return this.slotInvDataEntry;
    }

    public ISlotInvDataEntry getEntry(String key) {
        return slotInvDataEntry.get(key);
    }

    public void setEntry(String key, ISlotInvDataEntry value) {
        slotInvDataEntry.put(key, value);
        ((SlotInvDataEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISlotInvDataEntry> getEntries() {
        return slotInvDataEntry;
    }

    public SlotInvDataEntry createEntry(String entryIndex) {
        SlotInvDataEntry newEntry = new SlotInvDataEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.2.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("slotInvDataEntry", slotInvDataEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(slotInvDataEntry).toHashCode();
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
        SlotInvDataTable rhs = ((SlotInvDataTable) obj);
        return new EqualsBuilder().append(slotInvDataEntry, rhs.slotInvDataEntry).isEquals();
    }

    public SlotInvDataTable clone() {
        SlotInvDataTable _copy = new SlotInvDataTable();
        for (Map.Entry<String, ISlotInvDataEntry> _entry: slotInvDataEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.2.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "slotInvDataEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
