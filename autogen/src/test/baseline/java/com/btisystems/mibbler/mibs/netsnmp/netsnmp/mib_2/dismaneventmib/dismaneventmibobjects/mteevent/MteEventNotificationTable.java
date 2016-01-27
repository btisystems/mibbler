
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.IMteEventNotificationTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventnotificationtable.IMteEventNotificationEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventnotificationtable.MteEventNotificationEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MteEventNotificationTable
    extends DeviceEntity
    implements Serializable, IMteEventNotificationTable, ITableAccess<IMteEventNotificationEntry>
{

    private Map<String, IMteEventNotificationEntry> mteEventNotificationEntry = new TreeMap<String, IMteEventNotificationEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteEventNotificationTable() {
    }

    public Map<String, IMteEventNotificationEntry> getMteEventNotificationEntry() {
        return this.mteEventNotificationEntry;
    }

    public IMteEventNotificationEntry getEntry(String key) {
        return mteEventNotificationEntry.get(key);
    }

    public void setEntry(String key, IMteEventNotificationEntry value) {
        mteEventNotificationEntry.put(key, value);
        ((MteEventNotificationEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMteEventNotificationEntry> getEntries() {
        return mteEventNotificationEntry;
    }

    public MteEventNotificationEntry createEntry(String entryIndex) {
        MteEventNotificationEntry newEntry = new MteEventNotificationEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.88.1.4.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteEventNotificationEntry", mteEventNotificationEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteEventNotificationEntry).toHashCode();
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
        MteEventNotificationTable rhs = ((MteEventNotificationTable) obj);
        return new EqualsBuilder().append(mteEventNotificationEntry, rhs.mteEventNotificationEntry).isEquals();
    }

    public MteEventNotificationTable clone() {
        MteEventNotificationTable _copy = new MteEventNotificationTable();
        for (Map.Entry<String, IMteEventNotificationEntry> _entry: mteEventNotificationEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.4.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteEventNotificationEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
