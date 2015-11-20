
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.sourceroutingstats2table.SourceRoutingStats2Entry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ISourceRoutingStats2Table;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.sourceroutingstats2table.ISourceRoutingStats2Entry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SourceRoutingStats2Table
    extends DeviceEntity
    implements Serializable, ISourceRoutingStats2Table, ITableAccess<ISourceRoutingStats2Entry>
{

    private Map<String, ISourceRoutingStats2Entry> sourceRoutingStats2Entry = new TreeMap<String, ISourceRoutingStats2Entry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SourceRoutingStats2Table() {
    }

    public Map<String, ISourceRoutingStats2Entry> getSourceRoutingStats2Entry() {
        return this.sourceRoutingStats2Entry;
    }

    public ISourceRoutingStats2Entry getEntry(String key) {
        return sourceRoutingStats2Entry.get(key);
    }

    public void setEntry(String key, ISourceRoutingStats2Entry value) {
        sourceRoutingStats2Entry.put(key, value);
        ((SourceRoutingStats2Entry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISourceRoutingStats2Entry> getEntries() {
        return sourceRoutingStats2Entry;
    }

    public SourceRoutingStats2Entry createEntry(String entryIndex) {
        SourceRoutingStats2Entry newEntry = new SourceRoutingStats2Entry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.10.8.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sourceRoutingStats2Entry", sourceRoutingStats2Entry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sourceRoutingStats2Entry).toHashCode();
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
        SourceRoutingStats2Table rhs = ((SourceRoutingStats2Table) obj);
        return new EqualsBuilder().append(sourceRoutingStats2Entry, rhs.sourceRoutingStats2Entry).isEquals();
    }

    public SourceRoutingStats2Table clone() {
        SourceRoutingStats2Table _copy = new SourceRoutingStats2Table();
        for (Map.Entry<String, ISourceRoutingStats2Entry> _entry: sourceRoutingStats2Entry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.8"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sourceRoutingStats2Entry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
