
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.ISctpLookupLocalPortTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookuplocalporttable.ISctpLookupLocalPortEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctplookuplocalporttable.SctpLookupLocalPortEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SctpLookupLocalPortTable
    extends DeviceEntity
    implements Serializable, ISctpLookupLocalPortTable, ITableAccess<ISctpLookupLocalPortEntry>
{

    private Map<String, ISctpLookupLocalPortEntry> sctpLookupLocalPortEntry = new TreeMap<String, ISctpLookupLocalPortEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpLookupLocalPortTable() {
    }

    public Map<String, ISctpLookupLocalPortEntry> getSctpLookupLocalPortEntry() {
        return this.sctpLookupLocalPortEntry;
    }

    public ISctpLookupLocalPortEntry getEntry(String key) {
        return sctpLookupLocalPortEntry.get(key);
    }

    public void setEntry(String key, ISctpLookupLocalPortEntry value) {
        sctpLookupLocalPortEntry.put(key, value);
        ((SctpLookupLocalPortEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISctpLookupLocalPortEntry> getEntries() {
        return sctpLookupLocalPortEntry;
    }

    public SctpLookupLocalPortEntry createEntry(String entryIndex) {
        SctpLookupLocalPortEntry newEntry = new SctpLookupLocalPortEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.104.1.6.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpLookupLocalPortEntry", sctpLookupLocalPortEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpLookupLocalPortEntry).toHashCode();
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
        SctpLookupLocalPortTable rhs = ((SctpLookupLocalPortTable) obj);
        return new EqualsBuilder().append(sctpLookupLocalPortEntry, rhs.sctpLookupLocalPortEntry).isEquals();
    }

    public SctpLookupLocalPortTable clone() {
        SctpLookupLocalPortTable _copy = new SctpLookupLocalPortTable();
        for (Map.Entry<String, ISctpLookupLocalPortEntry> _entry: sctpLookupLocalPortEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.6"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpLookupLocalPortEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
