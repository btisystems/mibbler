
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.ISctpAssocTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctpassoctable.ISctpAssocEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctpassoctable.SctpAssocEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SctpAssocTable
    extends DeviceEntity
    implements Serializable, ISctpAssocTable, ITableAccess<ISctpAssocEntry>
{

    private Map<String, ISctpAssocEntry> sctpAssocEntry = new TreeMap<String, ISctpAssocEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpAssocTable() {
    }

    public Map<String, ISctpAssocEntry> getSctpAssocEntry() {
        return this.sctpAssocEntry;
    }

    public ISctpAssocEntry getEntry(String key) {
        return sctpAssocEntry.get(key);
    }

    public void setEntry(String key, ISctpAssocEntry value) {
        sctpAssocEntry.put(key, value);
        ((SctpAssocEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISctpAssocEntry> getEntries() {
        return sctpAssocEntry;
    }

    public SctpAssocEntry createEntry(String entryIndex) {
        SctpAssocEntry newEntry = new SctpAssocEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.104.1.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpAssocEntry", sctpAssocEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpAssocEntry).toHashCode();
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
        SctpAssocTable rhs = ((SctpAssocTable) obj);
        return new EqualsBuilder().append(sctpAssocEntry, rhs.sctpAssocEntry).isEquals();
    }

    public SctpAssocTable clone() {
        SctpAssocTable _copy = new SctpAssocTable();
        for (Map.Entry<String, ISctpAssocEntry> _entry: sctpAssocEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpAssocEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
