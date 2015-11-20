
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.filter;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.filter.IFilter2Table;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.filter.filter2table.IFilter2Entry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.filter.filter2table.Filter2Entry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Filter2Table
    extends DeviceEntity
    implements Serializable, IFilter2Table, ITableAccess<IFilter2Entry>
{

    private Map<String, IFilter2Entry> filter2Entry = new TreeMap<String, IFilter2Entry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Filter2Table() {
    }

    public Map<String, IFilter2Entry> getFilter2Entry() {
        return this.filter2Entry;
    }

    public IFilter2Entry getEntry(String key) {
        return filter2Entry.get(key);
    }

    public void setEntry(String key, IFilter2Entry value) {
        filter2Entry.put(key, value);
        ((Filter2Entry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IFilter2Entry> getEntries() {
        return filter2Entry;
    }

    public Filter2Entry createEntry(String entryIndex) {
        Filter2Entry newEntry = new Filter2Entry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.7.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("filter2Entry", filter2Entry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(filter2Entry).toHashCode();
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
        Filter2Table rhs = ((Filter2Table) obj);
        return new EqualsBuilder().append(filter2Entry, rhs.filter2Entry).isEquals();
    }

    public Filter2Table clone() {
        Filter2Table _copy = new Filter2Table();
        for (Map.Entry<String, IFilter2Entry> _entry: filter2Entry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.7.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "filter2Entry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
