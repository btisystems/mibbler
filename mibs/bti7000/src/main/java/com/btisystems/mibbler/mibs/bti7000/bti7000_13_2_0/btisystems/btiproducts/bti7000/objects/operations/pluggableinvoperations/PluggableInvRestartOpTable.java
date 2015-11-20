
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.pluggableinvoperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.pluggableinvoperations.pluggableinvrestartoptable.PluggableInvRestartOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.pluggableinvoperations.IPluggableInvRestartOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.pluggableinvoperations.pluggableinvrestartoptable.IPluggableInvRestartOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class PluggableInvRestartOpTable
    extends DeviceEntity
    implements Serializable, IPluggableInvRestartOpTable, ITableAccess<IPluggableInvRestartOpEntry>
{

    private Map<String, IPluggableInvRestartOpEntry> pluggableInvRestartOpEntry = new TreeMap<String, IPluggableInvRestartOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public PluggableInvRestartOpTable() {
    }

    public Map<String, IPluggableInvRestartOpEntry> getPluggableInvRestartOpEntry() {
        return this.pluggableInvRestartOpEntry;
    }

    public IPluggableInvRestartOpEntry getEntry(String key) {
        return pluggableInvRestartOpEntry.get(key);
    }

    public void setEntry(String key, IPluggableInvRestartOpEntry value) {
        pluggableInvRestartOpEntry.put(key, value);
        ((PluggableInvRestartOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IPluggableInvRestartOpEntry> getEntries() {
        return pluggableInvRestartOpEntry;
    }

    public PluggableInvRestartOpEntry createEntry(String entryIndex) {
        PluggableInvRestartOpEntry newEntry = new PluggableInvRestartOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.8.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("pluggableInvRestartOpEntry", pluggableInvRestartOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(pluggableInvRestartOpEntry).toHashCode();
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
        PluggableInvRestartOpTable rhs = ((PluggableInvRestartOpTable) obj);
        return new EqualsBuilder().append(pluggableInvRestartOpEntry, rhs.pluggableInvRestartOpEntry).isEquals();
    }

    public PluggableInvRestartOpTable clone() {
        PluggableInvRestartOpTable _copy = new PluggableInvRestartOpTable();
        for (Map.Entry<String, IPluggableInvRestartOpEntry> _entry: pluggableInvRestartOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.8.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "pluggableInvRestartOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
