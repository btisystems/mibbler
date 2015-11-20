
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.osctable.OscEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.IOscTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.osctable.IOscEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OscTable
    extends DeviceEntity
    implements Serializable, IOscTable, ITableAccess<IOscEntry>
{

    private Map<String, IOscEntry> oscEntry = new TreeMap<String, IOscEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OscTable() {
    }

    public Map<String, IOscEntry> getOscEntry() {
        return this.oscEntry;
    }

    public IOscEntry getEntry(String key) {
        return oscEntry.get(key);
    }

    public void setEntry(String key, IOscEntry value) {
        oscEntry.put(key, value);
        ((OscEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOscEntry> getEntries() {
        return oscEntry;
    }

    public OscEntry createEntry(String entryIndex) {
        OscEntry newEntry = new OscEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.5.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("oscEntry", oscEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(oscEntry).toHashCode();
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
        OscTable rhs = ((OscTable) obj);
        return new EqualsBuilder().append(oscEntry, rhs.oscEntry).isEquals();
    }

    public OscTable clone() {
        OscTable _copy = new OscTable();
        for (Map.Entry<String, IOscEntry> _entry: oscEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "oscEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
