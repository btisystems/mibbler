
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmconfig;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmconfig.INlmConfigLogTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmconfig.nlmconfiglogtable.INlmConfigLogEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmconfig.nlmconfiglogtable.NlmConfigLogEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NlmConfigLogTable
    extends DeviceEntity
    implements Serializable, INlmConfigLogTable, ITableAccess<INlmConfigLogEntry>
{

    private Map<String, INlmConfigLogEntry> nlmConfigLogEntry = new TreeMap<String, INlmConfigLogEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlmConfigLogTable() {
    }

    public Map<String, INlmConfigLogEntry> getNlmConfigLogEntry() {
        return this.nlmConfigLogEntry;
    }

    public INlmConfigLogEntry getEntry(String key) {
        return nlmConfigLogEntry.get(key);
    }

    public void setEntry(String key, INlmConfigLogEntry value) {
        nlmConfigLogEntry.put(key, value);
        ((NlmConfigLogEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, INlmConfigLogEntry> getEntries() {
        return nlmConfigLogEntry;
    }

    public NlmConfigLogEntry createEntry(String entryIndex) {
        NlmConfigLogEntry newEntry = new NlmConfigLogEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.92.1.1.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlmConfigLogEntry", nlmConfigLogEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlmConfigLogEntry).toHashCode();
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
        NlmConfigLogTable rhs = ((NlmConfigLogTable) obj);
        return new EqualsBuilder().append(nlmConfigLogEntry, rhs.nlmConfigLogEntry).isEquals();
    }

    public NlmConfigLogTable clone() {
        NlmConfigLogTable _copy = new NlmConfigLogTable();
        for (Map.Entry<String, INlmConfigLogEntry> _entry: nlmConfigLogEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.92.1.1.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlmConfigLogEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
