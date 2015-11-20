
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.capture;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.capture.IBufferControlTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.capture.buffercontroltable.IBufferControlEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.capture.buffercontroltable.BufferControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class BufferControlTable
    extends DeviceEntity
    implements Serializable, IBufferControlTable, ITableAccess<IBufferControlEntry>
{

    private Map<String, IBufferControlEntry> bufferControlEntry = new TreeMap<String, IBufferControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public BufferControlTable() {
    }

    public Map<String, IBufferControlEntry> getBufferControlEntry() {
        return this.bufferControlEntry;
    }

    public IBufferControlEntry getEntry(String key) {
        return bufferControlEntry.get(key);
    }

    public void setEntry(String key, IBufferControlEntry value) {
        bufferControlEntry.put(key, value);
        ((BufferControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IBufferControlEntry> getEntries() {
        return bufferControlEntry;
    }

    public BufferControlEntry createEntry(String entryIndex) {
        BufferControlEntry newEntry = new BufferControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.8.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("bufferControlEntry", bufferControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(bufferControlEntry).toHashCode();
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
        BufferControlTable rhs = ((BufferControlTable) obj);
        return new EqualsBuilder().append(bufferControlEntry, rhs.bufferControlEntry).isEquals();
    }

    public BufferControlTable clone() {
        BufferControlTable _copy = new BufferControlTable();
        for (Map.Entry<String, IBufferControlEntry> _entry: bufferControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.8.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "bufferControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
