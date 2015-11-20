
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.probeconfig;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.probeconfig.serialconfigtable.SerialConfigEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.probeconfig.ISerialConfigTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.probeconfig.serialconfigtable.ISerialConfigEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SerialConfigTable
    extends DeviceEntity
    implements Serializable, ISerialConfigTable, ITableAccess<ISerialConfigEntry>
{

    private Map<String, ISerialConfigEntry> serialConfigEntry = new TreeMap<String, ISerialConfigEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SerialConfigTable() {
    }

    public Map<String, ISerialConfigEntry> getSerialConfigEntry() {
        return this.serialConfigEntry;
    }

    public ISerialConfigEntry getEntry(String key) {
        return serialConfigEntry.get(key);
    }

    public void setEntry(String key, ISerialConfigEntry value) {
        serialConfigEntry.put(key, value);
        ((SerialConfigEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISerialConfigEntry> getEntries() {
        return serialConfigEntry;
    }

    public SerialConfigEntry createEntry(String entryIndex) {
        SerialConfigEntry newEntry = new SerialConfigEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.19.10.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("serialConfigEntry", serialConfigEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(serialConfigEntry).toHashCode();
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
        SerialConfigTable rhs = ((SerialConfigTable) obj);
        return new EqualsBuilder().append(serialConfigEntry, rhs.serialConfigEntry).isEquals();
    }

    public SerialConfigTable clone() {
        SerialConfigTable _copy = new SerialConfigTable();
        for (Map.Entry<String, ISerialConfigEntry> _entry: serialConfigEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.19.10"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "serialConfigEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
