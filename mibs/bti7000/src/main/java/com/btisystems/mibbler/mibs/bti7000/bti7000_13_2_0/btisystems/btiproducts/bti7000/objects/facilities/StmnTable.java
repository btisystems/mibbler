
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.stmntable.StmnEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IStmnTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.stmntable.IStmnEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class StmnTable
    extends DeviceEntity
    implements Serializable, IStmnTable, ITableAccess<IStmnEntry>
{

    private Map<String, IStmnEntry> stmnEntry = new TreeMap<String, IStmnEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StmnTable() {
    }

    public Map<String, IStmnEntry> getStmnEntry() {
        return this.stmnEntry;
    }

    public IStmnEntry getEntry(String key) {
        return stmnEntry.get(key);
    }

    public void setEntry(String key, IStmnEntry value) {
        stmnEntry.put(key, value);
        ((StmnEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IStmnEntry> getEntries() {
        return stmnEntry;
    }

    public StmnEntry createEntry(String entryIndex) {
        StmnEntry newEntry = new StmnEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.7.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stmnEntry", stmnEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stmnEntry).toHashCode();
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
        StmnTable rhs = ((StmnTable) obj);
        return new EqualsBuilder().append(stmnEntry, rhs.stmnEntry).isEquals();
    }

    public StmnTable clone() {
        StmnTable _copy = new StmnTable();
        for (Map.Entry<String, IStmnEntry> _entry: stmnEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.7"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stmnEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
