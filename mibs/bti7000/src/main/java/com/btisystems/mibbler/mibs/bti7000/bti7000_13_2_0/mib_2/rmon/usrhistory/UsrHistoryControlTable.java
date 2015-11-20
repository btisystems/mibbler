
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.usrhistory;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.usrhistory.usrhistorycontroltable.UsrHistoryControlEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory.IUsrHistoryControlTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory.usrhistorycontroltable.IUsrHistoryControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class UsrHistoryControlTable
    extends DeviceEntity
    implements Serializable, IUsrHistoryControlTable, ITableAccess<IUsrHistoryControlEntry>
{

    private Map<String, IUsrHistoryControlEntry> usrHistoryControlEntry = new TreeMap<String, IUsrHistoryControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public UsrHistoryControlTable() {
    }

    public Map<String, IUsrHistoryControlEntry> getUsrHistoryControlEntry() {
        return this.usrHistoryControlEntry;
    }

    public IUsrHistoryControlEntry getEntry(String key) {
        return usrHistoryControlEntry.get(key);
    }

    public void setEntry(String key, IUsrHistoryControlEntry value) {
        usrHistoryControlEntry.put(key, value);
        ((UsrHistoryControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IUsrHistoryControlEntry> getEntries() {
        return usrHistoryControlEntry;
    }

    public UsrHistoryControlEntry createEntry(String entryIndex) {
        UsrHistoryControlEntry newEntry = new UsrHistoryControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.18.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("usrHistoryControlEntry", usrHistoryControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(usrHistoryControlEntry).toHashCode();
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
        UsrHistoryControlTable rhs = ((UsrHistoryControlTable) obj);
        return new EqualsBuilder().append(usrHistoryControlEntry, rhs.usrHistoryControlEntry).isEquals();
    }

    public UsrHistoryControlTable clone() {
        UsrHistoryControlTable _copy = new UsrHistoryControlTable();
        for (Map.Entry<String, IUsrHistoryControlEntry> _entry: usrHistoryControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.18.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "usrHistoryControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
