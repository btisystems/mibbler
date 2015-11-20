
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.probeconfig;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig.ISerialConnectionTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig.serialconnectiontable.ISerialConnectionEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.probeconfig.serialconnectiontable.SerialConnectionEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SerialConnectionTable
    extends DeviceEntity
    implements Serializable, ISerialConnectionTable, ITableAccess<ISerialConnectionEntry>
{

    private Map<String, ISerialConnectionEntry> serialConnectionEntry = new TreeMap<String, ISerialConnectionEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SerialConnectionTable() {
    }

    public Map<String, ISerialConnectionEntry> getSerialConnectionEntry() {
        return this.serialConnectionEntry;
    }

    public ISerialConnectionEntry getEntry(String key) {
        return serialConnectionEntry.get(key);
    }

    public void setEntry(String key, ISerialConnectionEntry value) {
        serialConnectionEntry.put(key, value);
        ((SerialConnectionEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISerialConnectionEntry> getEntries() {
        return serialConnectionEntry;
    }

    public SerialConnectionEntry createEntry(String entryIndex) {
        SerialConnectionEntry newEntry = new SerialConnectionEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.19.14.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("serialConnectionEntry", serialConnectionEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(serialConnectionEntry).toHashCode();
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
        SerialConnectionTable rhs = ((SerialConnectionTable) obj);
        return new EqualsBuilder().append(serialConnectionEntry, rhs.serialConnectionEntry).isEquals();
    }

    public SerialConnectionTable clone() {
        SerialConnectionTable _copy = new SerialConnectionTable();
        for (Map.Entry<String, ISerialConnectionEntry> _entry: serialConnectionEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.19.14"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "serialConnectionEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
