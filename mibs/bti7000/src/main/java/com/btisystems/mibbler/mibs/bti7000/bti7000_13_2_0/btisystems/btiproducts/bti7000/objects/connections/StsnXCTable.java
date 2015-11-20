
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.stsnxctable.StsnXCEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.IStsnXCTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.stsnxctable.IStsnXCEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class StsnXCTable
    extends DeviceEntity
    implements Serializable, IStsnXCTable, ITableAccess<IStsnXCEntry>
{

    private Map<String, IStsnXCEntry> stsnXCEntry = new TreeMap<String, IStsnXCEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StsnXCTable() {
    }

    public Map<String, IStsnXCEntry> getStsnXCEntry() {
        return this.stsnXCEntry;
    }

    public IStsnXCEntry getEntry(String key) {
        return stsnXCEntry.get(key);
    }

    public void setEntry(String key, IStsnXCEntry value) {
        stsnXCEntry.put(key, value);
        ((StsnXCEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IStsnXCEntry> getEntries() {
        return stsnXCEntry;
    }

    public StsnXCEntry createEntry(String entryIndex) {
        StsnXCEntry newEntry = new StsnXCEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.9.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stsnXCEntry", stsnXCEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stsnXCEntry).toHashCode();
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
        StsnXCTable rhs = ((StsnXCTable) obj);
        return new EqualsBuilder().append(stsnXCEntry, rhs.stsnXCEntry).isEquals();
    }

    public StsnXCTable clone() {
        StsnXCTable _copy = new StsnXCTable();
        for (Map.Entry<String, IStsnXCEntry> _entry: stsnXCEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.9.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stsnXCEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
