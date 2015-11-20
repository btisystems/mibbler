
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.usrhistory;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.usrhistory.IUsrHistoryObjectTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.usrhistory.usrhistoryobjecttable.IUsrHistoryObjectEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.usrhistory.usrhistoryobjecttable.UsrHistoryObjectEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class UsrHistoryObjectTable
    extends DeviceEntity
    implements Serializable, IUsrHistoryObjectTable, ITableAccess<IUsrHistoryObjectEntry>
{

    private Map<String, IUsrHistoryObjectEntry> usrHistoryObjectEntry = new TreeMap<String, IUsrHistoryObjectEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public UsrHistoryObjectTable() {
    }

    public Map<String, IUsrHistoryObjectEntry> getUsrHistoryObjectEntry() {
        return this.usrHistoryObjectEntry;
    }

    public IUsrHistoryObjectEntry getEntry(String key) {
        return usrHistoryObjectEntry.get(key);
    }

    public void setEntry(String key, IUsrHistoryObjectEntry value) {
        usrHistoryObjectEntry.put(key, value);
        ((UsrHistoryObjectEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IUsrHistoryObjectEntry> getEntries() {
        return usrHistoryObjectEntry;
    }

    public UsrHistoryObjectEntry createEntry(String entryIndex) {
        UsrHistoryObjectEntry newEntry = new UsrHistoryObjectEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.18.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("usrHistoryObjectEntry", usrHistoryObjectEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(usrHistoryObjectEntry).toHashCode();
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
        UsrHistoryObjectTable rhs = ((UsrHistoryObjectTable) obj);
        return new EqualsBuilder().append(usrHistoryObjectEntry, rhs.usrHistoryObjectEntry).isEquals();
    }

    public UsrHistoryObjectTable clone() {
        UsrHistoryObjectTable _copy = new UsrHistoryObjectTable();
        for (Map.Entry<String, IUsrHistoryObjectEntry> _entry: usrHistoryObjectEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.18.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "usrHistoryObjectEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
