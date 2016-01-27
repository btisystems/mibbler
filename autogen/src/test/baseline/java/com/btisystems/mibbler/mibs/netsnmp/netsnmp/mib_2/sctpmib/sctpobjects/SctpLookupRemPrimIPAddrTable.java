
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.ISctpLookupRemPrimIPAddrTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremprimipaddrtable.ISctpLookupRemPrimIPAddrEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctplookupremprimipaddrtable.SctpLookupRemPrimIPAddrEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SctpLookupRemPrimIPAddrTable
    extends DeviceEntity
    implements Serializable, ISctpLookupRemPrimIPAddrTable, ITableAccess<ISctpLookupRemPrimIPAddrEntry>
{

    private Map<String, ISctpLookupRemPrimIPAddrEntry> sctpLookupRemPrimIPAddrEntry = new TreeMap<String, ISctpLookupRemPrimIPAddrEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpLookupRemPrimIPAddrTable() {
    }

    public Map<String, ISctpLookupRemPrimIPAddrEntry> getSctpLookupRemPrimIPAddrEntry() {
        return this.sctpLookupRemPrimIPAddrEntry;
    }

    public ISctpLookupRemPrimIPAddrEntry getEntry(String key) {
        return sctpLookupRemPrimIPAddrEntry.get(key);
    }

    public void setEntry(String key, ISctpLookupRemPrimIPAddrEntry value) {
        sctpLookupRemPrimIPAddrEntry.put(key, value);
        ((SctpLookupRemPrimIPAddrEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISctpLookupRemPrimIPAddrEntry> getEntries() {
        return sctpLookupRemPrimIPAddrEntry;
    }

    public SctpLookupRemPrimIPAddrEntry createEntry(String entryIndex) {
        SctpLookupRemPrimIPAddrEntry newEntry = new SctpLookupRemPrimIPAddrEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.104.1.9.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpLookupRemPrimIPAddrEntry", sctpLookupRemPrimIPAddrEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpLookupRemPrimIPAddrEntry).toHashCode();
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
        SctpLookupRemPrimIPAddrTable rhs = ((SctpLookupRemPrimIPAddrTable) obj);
        return new EqualsBuilder().append(sctpLookupRemPrimIPAddrEntry, rhs.sctpLookupRemPrimIPAddrEntry).isEquals();
    }

    public SctpLookupRemPrimIPAddrTable clone() {
        SctpLookupRemPrimIPAddrTable _copy = new SctpLookupRemPrimIPAddrTable();
        for (Map.Entry<String, ISctpLookupRemPrimIPAddrEntry> _entry: sctpLookupRemPrimIPAddrEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.9"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpLookupRemPrimIPAddrEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
