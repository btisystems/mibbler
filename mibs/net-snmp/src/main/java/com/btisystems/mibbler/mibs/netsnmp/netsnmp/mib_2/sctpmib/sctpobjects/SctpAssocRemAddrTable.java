
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.ISctpAssocRemAddrTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctpassocremaddrtable.ISctpAssocRemAddrEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctpassocremaddrtable.SctpAssocRemAddrEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SctpAssocRemAddrTable
    extends DeviceEntity
    implements Serializable, ISctpAssocRemAddrTable, ITableAccess<ISctpAssocRemAddrEntry>
{

    private Map<String, ISctpAssocRemAddrEntry> sctpAssocRemAddrEntry = new TreeMap<String, ISctpAssocRemAddrEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpAssocRemAddrTable() {
    }

    public Map<String, ISctpAssocRemAddrEntry> getSctpAssocRemAddrEntry() {
        return this.sctpAssocRemAddrEntry;
    }

    public ISctpAssocRemAddrEntry getEntry(String key) {
        return sctpAssocRemAddrEntry.get(key);
    }

    public void setEntry(String key, ISctpAssocRemAddrEntry value) {
        sctpAssocRemAddrEntry.put(key, value);
        ((SctpAssocRemAddrEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISctpAssocRemAddrEntry> getEntries() {
        return sctpAssocRemAddrEntry;
    }

    public SctpAssocRemAddrEntry createEntry(String entryIndex) {
        SctpAssocRemAddrEntry newEntry = new SctpAssocRemAddrEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.104.1.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpAssocRemAddrEntry", sctpAssocRemAddrEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpAssocRemAddrEntry).toHashCode();
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
        SctpAssocRemAddrTable rhs = ((SctpAssocRemAddrTable) obj);
        return new EqualsBuilder().append(sctpAssocRemAddrEntry, rhs.sctpAssocRemAddrEntry).isEquals();
    }

    public SctpAssocRemAddrTable clone() {
        SctpAssocRemAddrTable _copy = new SctpAssocRemAddrTable();
        for (Map.Entry<String, ISctpAssocRemAddrEntry> _entry: sctpAssocRemAddrEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpAssocRemAddrEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
