
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.stmnoperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.stmnprotswoptable.StmnProtSwOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.IStmnProtSwOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.stmnprotswoptable.IStmnProtSwOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class StmnProtSwOpTable
    extends DeviceEntity
    implements Serializable, IStmnProtSwOpTable, ITableAccess<IStmnProtSwOpEntry>
{

    private Map<String, IStmnProtSwOpEntry> stmnProtSwOpEntry = new TreeMap<String, IStmnProtSwOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StmnProtSwOpTable() {
    }

    public Map<String, IStmnProtSwOpEntry> getStmnProtSwOpEntry() {
        return this.stmnProtSwOpEntry;
    }

    public IStmnProtSwOpEntry getEntry(String key) {
        return stmnProtSwOpEntry.get(key);
    }

    public void setEntry(String key, IStmnProtSwOpEntry value) {
        stmnProtSwOpEntry.put(key, value);
        ((StmnProtSwOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IStmnProtSwOpEntry> getEntries() {
        return stmnProtSwOpEntry;
    }

    public StmnProtSwOpEntry createEntry(String entryIndex) {
        StmnProtSwOpEntry newEntry = new StmnProtSwOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.14.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stmnProtSwOpEntry", stmnProtSwOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stmnProtSwOpEntry).toHashCode();
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
        StmnProtSwOpTable rhs = ((StmnProtSwOpTable) obj);
        return new EqualsBuilder().append(stmnProtSwOpEntry, rhs.stmnProtSwOpEntry).isEquals();
    }

    public StmnProtSwOpTable clone() {
        StmnProtSwOpTable _copy = new StmnProtSwOpTable();
        for (Map.Entry<String, IStmnProtSwOpEntry> _entry: stmnProtSwOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.14.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stmnProtSwOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
