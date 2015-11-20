
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.stmnoperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.stmnlpbkoptable.StmnLpbkOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.IStmnLpbkOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stmnoperations.stmnlpbkoptable.IStmnLpbkOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class StmnLpbkOpTable
    extends DeviceEntity
    implements Serializable, IStmnLpbkOpTable, ITableAccess<IStmnLpbkOpEntry>
{

    private Map<String, IStmnLpbkOpEntry> stmnLpbkOpEntry = new TreeMap<String, IStmnLpbkOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StmnLpbkOpTable() {
    }

    public Map<String, IStmnLpbkOpEntry> getStmnLpbkOpEntry() {
        return this.stmnLpbkOpEntry;
    }

    public IStmnLpbkOpEntry getEntry(String key) {
        return stmnLpbkOpEntry.get(key);
    }

    public void setEntry(String key, IStmnLpbkOpEntry value) {
        stmnLpbkOpEntry.put(key, value);
        ((StmnLpbkOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IStmnLpbkOpEntry> getEntries() {
        return stmnLpbkOpEntry;
    }

    public StmnLpbkOpEntry createEntry(String entryIndex) {
        StmnLpbkOpEntry newEntry = new StmnLpbkOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.14.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stmnLpbkOpEntry", stmnLpbkOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stmnLpbkOpEntry).toHashCode();
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
        StmnLpbkOpTable rhs = ((StmnLpbkOpTable) obj);
        return new EqualsBuilder().append(stmnLpbkOpEntry, rhs.stmnLpbkOpEntry).isEquals();
    }

    public StmnLpbkOpTable clone() {
        StmnLpbkOpTable _copy = new StmnLpbkOpTable();
        for (Map.Entry<String, IStmnLpbkOpEntry> _entry: stmnLpbkOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.14.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stmnLpbkOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
