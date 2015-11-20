
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.usrhistory;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.usrhistory.usrhistorytable.UsrHistoryEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory.IUsrHistoryTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory.usrhistorytable.IUsrHistoryEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class UsrHistoryTable
    extends DeviceEntity
    implements Serializable, IUsrHistoryTable, ITableAccess<IUsrHistoryEntry>
{

    private Map<String, IUsrHistoryEntry> usrHistoryEntry = new TreeMap<String, IUsrHistoryEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public UsrHistoryTable() {
    }

    public Map<String, IUsrHistoryEntry> getUsrHistoryEntry() {
        return this.usrHistoryEntry;
    }

    public IUsrHistoryEntry getEntry(String key) {
        return usrHistoryEntry.get(key);
    }

    public void setEntry(String key, IUsrHistoryEntry value) {
        usrHistoryEntry.put(key, value);
        ((UsrHistoryEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IUsrHistoryEntry> getEntries() {
        return usrHistoryEntry;
    }

    public UsrHistoryEntry createEntry(String entryIndex) {
        UsrHistoryEntry newEntry = new UsrHistoryEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.18.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("usrHistoryEntry", usrHistoryEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(usrHistoryEntry).toHashCode();
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
        UsrHistoryTable rhs = ((UsrHistoryTable) obj);
        return new EqualsBuilder().append(usrHistoryEntry, rhs.usrHistoryEntry).isEquals();
    }

    public UsrHistoryTable clone() {
        UsrHistoryTable _copy = new UsrHistoryTable();
        for (Map.Entry<String, IUsrHistoryEntry> _entry: usrHistoryEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.18.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "usrHistoryEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
