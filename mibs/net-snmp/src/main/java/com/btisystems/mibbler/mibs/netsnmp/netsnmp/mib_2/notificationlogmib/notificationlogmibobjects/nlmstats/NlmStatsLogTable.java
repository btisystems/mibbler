
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmstats;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmstats.INlmStatsLogTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmstats.nlmstatslogtable.INlmStatsLogEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmstats.nlmstatslogtable.NlmStatsLogEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NlmStatsLogTable
    extends DeviceEntity
    implements Serializable, INlmStatsLogTable, ITableAccess<INlmStatsLogEntry>
{

    private Map<String, INlmStatsLogEntry> nlmStatsLogEntry = new TreeMap<String, INlmStatsLogEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlmStatsLogTable() {
    }

    public Map<String, INlmStatsLogEntry> getNlmStatsLogEntry() {
        return this.nlmStatsLogEntry;
    }

    public INlmStatsLogEntry getEntry(String key) {
        return nlmStatsLogEntry.get(key);
    }

    public void setEntry(String key, INlmStatsLogEntry value) {
        nlmStatsLogEntry.put(key, value);
        ((NlmStatsLogEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, INlmStatsLogEntry> getEntries() {
        return nlmStatsLogEntry;
    }

    public NlmStatsLogEntry createEntry(String entryIndex) {
        NlmStatsLogEntry newEntry = new NlmStatsLogEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.92.1.2.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlmStatsLogEntry", nlmStatsLogEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlmStatsLogEntry).toHashCode();
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
        NlmStatsLogTable rhs = ((NlmStatsLogTable) obj);
        return new EqualsBuilder().append(nlmStatsLogEntry, rhs.nlmStatsLogEntry).isEquals();
    }

    public NlmStatsLogTable clone() {
        NlmStatsLogTable _copy = new NlmStatsLogTable();
        for (Map.Entry<String, INlmStatsLogEntry> _entry: nlmStatsLogEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.92.1.2.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlmStatsLogEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
