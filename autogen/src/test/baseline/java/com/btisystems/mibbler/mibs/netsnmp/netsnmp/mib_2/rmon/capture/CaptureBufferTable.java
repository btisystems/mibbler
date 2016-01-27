
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.capture;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.capture.ICaptureBufferTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.capture.capturebuffertable.ICaptureBufferEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.capture.capturebuffertable.CaptureBufferEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class CaptureBufferTable
    extends DeviceEntity
    implements Serializable, ICaptureBufferTable, ITableAccess<ICaptureBufferEntry>
{

    private Map<String, ICaptureBufferEntry> captureBufferEntry = new TreeMap<String, ICaptureBufferEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public CaptureBufferTable() {
    }

    public Map<String, ICaptureBufferEntry> getCaptureBufferEntry() {
        return this.captureBufferEntry;
    }

    public ICaptureBufferEntry getEntry(String key) {
        return captureBufferEntry.get(key);
    }

    public void setEntry(String key, ICaptureBufferEntry value) {
        captureBufferEntry.put(key, value);
        ((CaptureBufferEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ICaptureBufferEntry> getEntries() {
        return captureBufferEntry;
    }

    public CaptureBufferEntry createEntry(String entryIndex) {
        CaptureBufferEntry newEntry = new CaptureBufferEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.8.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("captureBufferEntry", captureBufferEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(captureBufferEntry).toHashCode();
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
        CaptureBufferTable rhs = ((CaptureBufferTable) obj);
        return new EqualsBuilder().append(captureBufferEntry, rhs.captureBufferEntry).isEquals();
    }

    public CaptureBufferTable clone() {
        CaptureBufferTable _copy = new CaptureBufferTable();
        for (Map.Entry<String, ICaptureBufferEntry> _entry: captureBufferEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.8.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "captureBufferEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
