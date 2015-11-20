
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.vcnxctable.VcnXCEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.IVcnXCTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.vcnxctable.IVcnXCEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class VcnXCTable
    extends DeviceEntity
    implements Serializable, IVcnXCTable, ITableAccess<IVcnXCEntry>
{

    private Map<String, IVcnXCEntry> vcnXCEntry = new TreeMap<String, IVcnXCEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public VcnXCTable() {
    }

    public Map<String, IVcnXCEntry> getVcnXCEntry() {
        return this.vcnXCEntry;
    }

    public IVcnXCEntry getEntry(String key) {
        return vcnXCEntry.get(key);
    }

    public void setEntry(String key, IVcnXCEntry value) {
        vcnXCEntry.put(key, value);
        ((VcnXCEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IVcnXCEntry> getEntries() {
        return vcnXCEntry;
    }

    public VcnXCEntry createEntry(String entryIndex) {
        VcnXCEntry newEntry = new VcnXCEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.9.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("vcnXCEntry", vcnXCEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(vcnXCEntry).toHashCode();
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
        VcnXCTable rhs = ((VcnXCTable) obj);
        return new EqualsBuilder().append(vcnXCEntry, rhs.vcnXCEntry).isEquals();
    }

    public VcnXCTable clone() {
        VcnXCTable _copy = new VcnXCTable();
        for (Map.Entry<String, IVcnXCEntry> _entry: vcnXCEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.9.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "vcnXCEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
