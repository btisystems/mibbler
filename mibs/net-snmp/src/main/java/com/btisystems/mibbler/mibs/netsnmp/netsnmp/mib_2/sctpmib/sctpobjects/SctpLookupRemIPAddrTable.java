
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.ISctpLookupRemIPAddrTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremipaddrtable.ISctpLookupRemIPAddrEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctplookupremipaddrtable.SctpLookupRemIPAddrEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SctpLookupRemIPAddrTable
    extends DeviceEntity
    implements Serializable, ISctpLookupRemIPAddrTable, ITableAccess<ISctpLookupRemIPAddrEntry>
{

    private Map<String, ISctpLookupRemIPAddrEntry> sctpLookupRemIPAddrEntry = new TreeMap<String, ISctpLookupRemIPAddrEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpLookupRemIPAddrTable() {
    }

    public Map<String, ISctpLookupRemIPAddrEntry> getSctpLookupRemIPAddrEntry() {
        return this.sctpLookupRemIPAddrEntry;
    }

    public ISctpLookupRemIPAddrEntry getEntry(String key) {
        return sctpLookupRemIPAddrEntry.get(key);
    }

    public void setEntry(String key, ISctpLookupRemIPAddrEntry value) {
        sctpLookupRemIPAddrEntry.put(key, value);
        ((SctpLookupRemIPAddrEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISctpLookupRemIPAddrEntry> getEntries() {
        return sctpLookupRemIPAddrEntry;
    }

    public SctpLookupRemIPAddrEntry createEntry(String entryIndex) {
        SctpLookupRemIPAddrEntry newEntry = new SctpLookupRemIPAddrEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.104.1.10.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpLookupRemIPAddrEntry", sctpLookupRemIPAddrEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpLookupRemIPAddrEntry).toHashCode();
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
        SctpLookupRemIPAddrTable rhs = ((SctpLookupRemIPAddrTable) obj);
        return new EqualsBuilder().append(sctpLookupRemIPAddrEntry, rhs.sctpLookupRemIPAddrEntry).isEquals();
    }

    public SctpLookupRemIPAddrTable clone() {
        SctpLookupRemIPAddrTable _copy = new SctpLookupRemIPAddrTable();
        for (Map.Entry<String, ISctpLookupRemIPAddrEntry> _entry: sctpLookupRemIPAddrEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.10"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpLookupRemIPAddrEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
