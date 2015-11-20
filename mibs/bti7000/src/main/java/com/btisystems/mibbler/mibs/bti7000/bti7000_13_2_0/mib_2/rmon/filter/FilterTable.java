
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.filter;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.filter.filtertable.FilterEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.filter.IFilterTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.filter.filtertable.IFilterEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class FilterTable
    extends DeviceEntity
    implements Serializable, IFilterTable, ITableAccess<IFilterEntry>
{

    private Map<String, IFilterEntry> filterEntry = new TreeMap<String, IFilterEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public FilterTable() {
    }

    public Map<String, IFilterEntry> getFilterEntry() {
        return this.filterEntry;
    }

    public IFilterEntry getEntry(String key) {
        return filterEntry.get(key);
    }

    public void setEntry(String key, IFilterEntry value) {
        filterEntry.put(key, value);
        ((FilterEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IFilterEntry> getEntries() {
        return filterEntry;
    }

    public FilterEntry createEntry(String entryIndex) {
        FilterEntry newEntry = new FilterEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.7.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("filterEntry", filterEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(filterEntry).toHashCode();
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
        FilterTable rhs = ((FilterTable) obj);
        return new EqualsBuilder().append(filterEntry, rhs.filterEntry).isEquals();
    }

    public FilterTable clone() {
        FilterTable _copy = new FilterTable();
        for (Map.Entry<String, IFilterEntry> _entry: filterEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.7.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "filterEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
