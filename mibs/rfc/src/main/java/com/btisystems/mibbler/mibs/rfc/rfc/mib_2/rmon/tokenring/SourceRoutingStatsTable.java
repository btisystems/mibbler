
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.ISourceRoutingStatsTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.tokenring.sourceroutingstatstable.ISourceRoutingStatsEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.sourceroutingstatstable.SourceRoutingStatsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SourceRoutingStatsTable
    extends DeviceEntity
    implements Serializable, ISourceRoutingStatsTable, ITableAccess<ISourceRoutingStatsEntry>
{

    private Map<String, ISourceRoutingStatsEntry> sourceRoutingStatsEntry = new TreeMap<String, ISourceRoutingStatsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SourceRoutingStatsTable() {
    }

    public Map<String, ISourceRoutingStatsEntry> getSourceRoutingStatsEntry() {
        return this.sourceRoutingStatsEntry;
    }

    public ISourceRoutingStatsEntry getEntry(String key) {
        return sourceRoutingStatsEntry.get(key);
    }

    public void setEntry(String key, ISourceRoutingStatsEntry value) {
        sourceRoutingStatsEntry.put(key, value);
        ((SourceRoutingStatsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISourceRoutingStatsEntry> getEntries() {
        return sourceRoutingStatsEntry;
    }

    public SourceRoutingStatsEntry createEntry(String entryIndex) {
        SourceRoutingStatsEntry newEntry = new SourceRoutingStatsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.10.6.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sourceRoutingStatsEntry", sourceRoutingStatsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sourceRoutingStatsEntry).toHashCode();
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
        SourceRoutingStatsTable rhs = ((SourceRoutingStatsTable) obj);
        return new EqualsBuilder().append(sourceRoutingStatsEntry, rhs.sourceRoutingStatsEntry).isEquals();
    }

    public SourceRoutingStatsTable clone() {
        SourceRoutingStatsTable _copy = new SourceRoutingStatsTable();
        for (Map.Entry<String, ISourceRoutingStatsEntry> _entry: sourceRoutingStatsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.6"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sourceRoutingStatsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
