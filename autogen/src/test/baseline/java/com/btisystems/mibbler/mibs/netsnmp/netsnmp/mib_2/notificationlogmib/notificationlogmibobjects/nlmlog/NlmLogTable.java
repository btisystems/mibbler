
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.INlmLogTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.nlmlogtable.INlmLogEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.nlmlogtable.NlmLogEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NlmLogTable
    extends DeviceEntity
    implements Serializable, INlmLogTable, ITableAccess<INlmLogEntry>
{

    private Map<String, INlmLogEntry> nlmLogEntry = new TreeMap<String, INlmLogEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlmLogTable() {
    }

    public Map<String, INlmLogEntry> getNlmLogEntry() {
        return this.nlmLogEntry;
    }

    public INlmLogEntry getEntry(String key) {
        return nlmLogEntry.get(key);
    }

    public void setEntry(String key, INlmLogEntry value) {
        nlmLogEntry.put(key, value);
        ((NlmLogEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, INlmLogEntry> getEntries() {
        return nlmLogEntry;
    }

    public NlmLogEntry createEntry(String entryIndex) {
        NlmLogEntry newEntry = new NlmLogEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.92.1.3.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlmLogEntry", nlmLogEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlmLogEntry).toHashCode();
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
        NlmLogTable rhs = ((NlmLogTable) obj);
        return new EqualsBuilder().append(nlmLogEntry, rhs.nlmLogEntry).isEquals();
    }

    public NlmLogTable clone() {
        NlmLogTable _copy = new NlmLogTable();
        for (Map.Entry<String, INlmLogEntry> _entry: nlmLogEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.92.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlmLogEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
