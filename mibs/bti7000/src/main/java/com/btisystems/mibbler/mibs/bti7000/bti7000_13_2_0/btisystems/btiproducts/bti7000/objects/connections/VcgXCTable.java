
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.vcgxctable.VcgXCEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.IVcgXCTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.vcgxctable.IVcgXCEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class VcgXCTable
    extends DeviceEntity
    implements Serializable, IVcgXCTable, ITableAccess<IVcgXCEntry>
{

    private Map<String, IVcgXCEntry> vcgXCEntry = new TreeMap<String, IVcgXCEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public VcgXCTable() {
    }

    public Map<String, IVcgXCEntry> getVcgXCEntry() {
        return this.vcgXCEntry;
    }

    public IVcgXCEntry getEntry(String key) {
        return vcgXCEntry.get(key);
    }

    public void setEntry(String key, IVcgXCEntry value) {
        vcgXCEntry.put(key, value);
        ((VcgXCEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IVcgXCEntry> getEntries() {
        return vcgXCEntry;
    }

    public VcgXCEntry createEntry(String entryIndex) {
        VcgXCEntry newEntry = new VcgXCEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.9.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("vcgXCEntry", vcgXCEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(vcgXCEntry).toHashCode();
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
        VcgXCTable rhs = ((VcgXCTable) obj);
        return new EqualsBuilder().append(vcgXCEntry, rhs.vcgXCEntry).isEquals();
    }

    public VcgXCTable clone() {
        VcgXCTable _copy = new VcgXCTable();
        for (Map.Entry<String, IVcgXCEntry> _entry: vcgXCEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.9.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "vcgXCEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
