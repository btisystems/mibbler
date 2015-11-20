
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.alhost;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.alhost.alhosttable.AlHostEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.alhost.IAlHostTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.alhost.alhosttable.IAlHostEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AlHostTable
    extends DeviceEntity
    implements Serializable, IAlHostTable, ITableAccess<IAlHostEntry>
{

    private Map<String, IAlHostEntry> alHostEntry = new TreeMap<String, IAlHostEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AlHostTable() {
    }

    public Map<String, IAlHostEntry> getAlHostEntry() {
        return this.alHostEntry;
    }

    public IAlHostEntry getEntry(String key) {
        return alHostEntry.get(key);
    }

    public void setEntry(String key, IAlHostEntry value) {
        alHostEntry.put(key, value);
        ((AlHostEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAlHostEntry> getEntries() {
        return alHostEntry;
    }

    public AlHostEntry createEntry(String entryIndex) {
        AlHostEntry newEntry = new AlHostEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.16.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alHostEntry", alHostEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alHostEntry).toHashCode();
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
        AlHostTable rhs = ((AlHostTable) obj);
        return new EqualsBuilder().append(alHostEntry, rhs.alHostEntry).isEquals();
    }

    public AlHostTable clone() {
        AlHostTable _copy = new AlHostTable();
        for (Map.Entry<String, IAlHostEntry> _entry: alHostEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.16.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alHostEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
