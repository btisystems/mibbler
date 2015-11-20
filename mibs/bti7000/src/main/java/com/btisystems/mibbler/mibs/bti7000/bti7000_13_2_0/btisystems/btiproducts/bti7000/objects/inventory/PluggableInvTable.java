
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory.pluggableinvtable.PluggableInvEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.IPluggableInvTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.pluggableinvtable.IPluggableInvEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class PluggableInvTable
    extends DeviceEntity
    implements Serializable, IPluggableInvTable, ITableAccess<IPluggableInvEntry>
{

    private Map<String, IPluggableInvEntry> pluggableInvEntry = new TreeMap<String, IPluggableInvEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public PluggableInvTable() {
    }

    public Map<String, IPluggableInvEntry> getPluggableInvEntry() {
        return this.pluggableInvEntry;
    }

    public IPluggableInvEntry getEntry(String key) {
        return pluggableInvEntry.get(key);
    }

    public void setEntry(String key, IPluggableInvEntry value) {
        pluggableInvEntry.put(key, value);
        ((PluggableInvEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IPluggableInvEntry> getEntries() {
        return pluggableInvEntry;
    }

    public PluggableInvEntry createEntry(String entryIndex) {
        PluggableInvEntry newEntry = new PluggableInvEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.2.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("pluggableInvEntry", pluggableInvEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(pluggableInvEntry).toHashCode();
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
        PluggableInvTable rhs = ((PluggableInvTable) obj);
        return new EqualsBuilder().append(pluggableInvEntry, rhs.pluggableInvEntry).isEquals();
    }

    public PluggableInvTable clone() {
        PluggableInvTable _copy = new PluggableInvTable();
        for (Map.Entry<String, IPluggableInvEntry> _entry: pluggableInvEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.2.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "pluggableInvEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
