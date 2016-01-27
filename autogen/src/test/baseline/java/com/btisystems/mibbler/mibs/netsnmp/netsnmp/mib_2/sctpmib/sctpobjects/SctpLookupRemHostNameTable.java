
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.ISctpLookupRemHostNameTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremhostnametable.ISctpLookupRemHostNameEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctplookupremhostnametable.SctpLookupRemHostNameEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SctpLookupRemHostNameTable
    extends DeviceEntity
    implements Serializable, ISctpLookupRemHostNameTable, ITableAccess<ISctpLookupRemHostNameEntry>
{

    private Map<String, ISctpLookupRemHostNameEntry> sctpLookupRemHostNameEntry = new TreeMap<String, ISctpLookupRemHostNameEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpLookupRemHostNameTable() {
    }

    public Map<String, ISctpLookupRemHostNameEntry> getSctpLookupRemHostNameEntry() {
        return this.sctpLookupRemHostNameEntry;
    }

    public ISctpLookupRemHostNameEntry getEntry(String key) {
        return sctpLookupRemHostNameEntry.get(key);
    }

    public void setEntry(String key, ISctpLookupRemHostNameEntry value) {
        sctpLookupRemHostNameEntry.put(key, value);
        ((SctpLookupRemHostNameEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISctpLookupRemHostNameEntry> getEntries() {
        return sctpLookupRemHostNameEntry;
    }

    public SctpLookupRemHostNameEntry createEntry(String entryIndex) {
        SctpLookupRemHostNameEntry newEntry = new SctpLookupRemHostNameEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.104.1.8.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpLookupRemHostNameEntry", sctpLookupRemHostNameEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpLookupRemHostNameEntry).toHashCode();
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
        SctpLookupRemHostNameTable rhs = ((SctpLookupRemHostNameTable) obj);
        return new EqualsBuilder().append(sctpLookupRemHostNameEntry, rhs.sctpLookupRemHostNameEntry).isEquals();
    }

    public SctpLookupRemHostNameTable clone() {
        SctpLookupRemHostNameTable _copy = new SctpLookupRemHostNameTable();
        for (Map.Entry<String, ISctpLookupRemHostNameEntry> _entry: sctpLookupRemHostNameEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.8"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpLookupRemHostNameEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
