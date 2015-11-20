
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.stsnoperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.stsnoperations.stsnprotswoptable.StsnProtSwOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stsnoperations.IStsnProtSwOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stsnoperations.stsnprotswoptable.IStsnProtSwOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class StsnProtSwOpTable
    extends DeviceEntity
    implements Serializable, IStsnProtSwOpTable, ITableAccess<IStsnProtSwOpEntry>
{

    private Map<String, IStsnProtSwOpEntry> stsnProtSwOpEntry = new TreeMap<String, IStsnProtSwOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StsnProtSwOpTable() {
    }

    public Map<String, IStsnProtSwOpEntry> getStsnProtSwOpEntry() {
        return this.stsnProtSwOpEntry;
    }

    public IStsnProtSwOpEntry getEntry(String key) {
        return stsnProtSwOpEntry.get(key);
    }

    public void setEntry(String key, IStsnProtSwOpEntry value) {
        stsnProtSwOpEntry.put(key, value);
        ((StsnProtSwOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IStsnProtSwOpEntry> getEntries() {
        return stsnProtSwOpEntry;
    }

    public StsnProtSwOpEntry createEntry(String entryIndex) {
        StsnProtSwOpEntry newEntry = new StsnProtSwOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.13.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stsnProtSwOpEntry", stsnProtSwOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stsnProtSwOpEntry).toHashCode();
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
        StsnProtSwOpTable rhs = ((StsnProtSwOpTable) obj);
        return new EqualsBuilder().append(stsnProtSwOpEntry, rhs.stsnProtSwOpEntry).isEquals();
    }

    public StsnProtSwOpTable clone() {
        StsnProtSwOpTable _copy = new StsnProtSwOpTable();
        for (Map.Entry<String, IStsnProtSwOpEntry> _entry: stsnProtSwOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.13.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stsnProtSwOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
