
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.ISctpLookupRemPortTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremporttable.ISctpLookupRemPortEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctplookupremporttable.SctpLookupRemPortEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SctpLookupRemPortTable
    extends DeviceEntity
    implements Serializable, ISctpLookupRemPortTable, ITableAccess<ISctpLookupRemPortEntry>
{

    private Map<String, ISctpLookupRemPortEntry> sctpLookupRemPortEntry = new TreeMap<String, ISctpLookupRemPortEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpLookupRemPortTable() {
    }

    public Map<String, ISctpLookupRemPortEntry> getSctpLookupRemPortEntry() {
        return this.sctpLookupRemPortEntry;
    }

    public ISctpLookupRemPortEntry getEntry(String key) {
        return sctpLookupRemPortEntry.get(key);
    }

    public void setEntry(String key, ISctpLookupRemPortEntry value) {
        sctpLookupRemPortEntry.put(key, value);
        ((SctpLookupRemPortEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISctpLookupRemPortEntry> getEntries() {
        return sctpLookupRemPortEntry;
    }

    public SctpLookupRemPortEntry createEntry(String entryIndex) {
        SctpLookupRemPortEntry newEntry = new SctpLookupRemPortEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.104.1.7.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpLookupRemPortEntry", sctpLookupRemPortEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpLookupRemPortEntry).toHashCode();
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
        SctpLookupRemPortTable rhs = ((SctpLookupRemPortTable) obj);
        return new EqualsBuilder().append(sctpLookupRemPortEntry, rhs.sctpLookupRemPortEntry).isEquals();
    }

    public SctpLookupRemPortTable clone() {
        SctpLookupRemPortTable _copy = new SctpLookupRemPortTable();
        for (Map.Entry<String, ISctpLookupRemPortEntry> _entry: sctpLookupRemPortEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.7"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpLookupRemPortEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
