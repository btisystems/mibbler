
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifinvertedstackmib.ifinvmibobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifinvertedstackmib.ifinvmibobjects.IIfInvStackTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifinvertedstackmib.ifinvmibobjects.ifinvstacktable.IIfInvStackEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifinvertedstackmib.ifinvmibobjects.ifinvstacktable.IfInvStackEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IfInvStackTable
    extends DeviceEntity
    implements Serializable, IIfInvStackTable, ITableAccess<IIfInvStackEntry>
{

    private Map<String, IIfInvStackEntry> ifInvStackEntry = new TreeMap<String, IIfInvStackEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfInvStackTable() {
    }

    public Map<String, IIfInvStackEntry> getIfInvStackEntry() {
        return this.ifInvStackEntry;
    }

    public IIfInvStackEntry getEntry(String key) {
        return ifInvStackEntry.get(key);
    }

    public void setEntry(String key, IIfInvStackEntry value) {
        ifInvStackEntry.put(key, value);
        ((IfInvStackEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIfInvStackEntry> getEntries() {
        return ifInvStackEntry;
    }

    public IfInvStackEntry createEntry(String entryIndex) {
        IfInvStackEntry newEntry = new IfInvStackEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.77.1.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifInvStackEntry", ifInvStackEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifInvStackEntry).toHashCode();
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
        IfInvStackTable rhs = ((IfInvStackTable) obj);
        return new EqualsBuilder().append(ifInvStackEntry, rhs.ifInvStackEntry).isEquals();
    }

    public IfInvStackTable clone() {
        IfInvStackTable _copy = new IfInvStackTable();
        for (Map.Entry<String, IIfInvStackEntry> _entry: ifInvStackEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.77.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifInvStackEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
