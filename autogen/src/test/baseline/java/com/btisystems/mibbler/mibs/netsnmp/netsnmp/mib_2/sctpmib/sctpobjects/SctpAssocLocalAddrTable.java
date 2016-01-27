
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.ISctpAssocLocalAddrTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctpassoclocaladdrtable.ISctpAssocLocalAddrEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctpassoclocaladdrtable.SctpAssocLocalAddrEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SctpAssocLocalAddrTable
    extends DeviceEntity
    implements Serializable, ISctpAssocLocalAddrTable, ITableAccess<ISctpAssocLocalAddrEntry>
{

    private Map<String, ISctpAssocLocalAddrEntry> sctpAssocLocalAddrEntry = new TreeMap<String, ISctpAssocLocalAddrEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpAssocLocalAddrTable() {
    }

    public Map<String, ISctpAssocLocalAddrEntry> getSctpAssocLocalAddrEntry() {
        return this.sctpAssocLocalAddrEntry;
    }

    public ISctpAssocLocalAddrEntry getEntry(String key) {
        return sctpAssocLocalAddrEntry.get(key);
    }

    public void setEntry(String key, ISctpAssocLocalAddrEntry value) {
        sctpAssocLocalAddrEntry.put(key, value);
        ((SctpAssocLocalAddrEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISctpAssocLocalAddrEntry> getEntries() {
        return sctpAssocLocalAddrEntry;
    }

    public SctpAssocLocalAddrEntry createEntry(String entryIndex) {
        SctpAssocLocalAddrEntry newEntry = new SctpAssocLocalAddrEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.104.1.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpAssocLocalAddrEntry", sctpAssocLocalAddrEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpAssocLocalAddrEntry).toHashCode();
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
        SctpAssocLocalAddrTable rhs = ((SctpAssocLocalAddrTable) obj);
        return new EqualsBuilder().append(sctpAssocLocalAddrEntry, rhs.sctpAssocLocalAddrEntry).isEquals();
    }

    public SctpAssocLocalAddrTable clone() {
        SctpAssocLocalAddrTable _copy = new SctpAssocLocalAddrTable();
        for (Map.Entry<String, ISctpAssocLocalAddrEntry> _entry: sctpAssocLocalAddrEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpAssocLocalAddrEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
