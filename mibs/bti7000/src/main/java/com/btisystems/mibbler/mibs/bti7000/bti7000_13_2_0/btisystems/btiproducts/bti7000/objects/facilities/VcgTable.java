
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.vcgtable.VcgEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IVcgTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.vcgtable.IVcgEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class VcgTable
    extends DeviceEntity
    implements Serializable, IVcgTable, ITableAccess<IVcgEntry>
{

    private Map<String, IVcgEntry> vcgEntry = new TreeMap<String, IVcgEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public VcgTable() {
    }

    public Map<String, IVcgEntry> getVcgEntry() {
        return this.vcgEntry;
    }

    public IVcgEntry getEntry(String key) {
        return vcgEntry.get(key);
    }

    public void setEntry(String key, IVcgEntry value) {
        vcgEntry.put(key, value);
        ((VcgEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IVcgEntry> getEntries() {
        return vcgEntry;
    }

    public VcgEntry createEntry(String entryIndex) {
        VcgEntry newEntry = new VcgEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.11.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("vcgEntry", vcgEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(vcgEntry).toHashCode();
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
        VcgTable rhs = ((VcgTable) obj);
        return new EqualsBuilder().append(vcgEntry, rhs.vcgEntry).isEquals();
    }

    public VcgTable clone() {
        VcgTable _copy = new VcgTable();
        for (Map.Entry<String, IVcgEntry> _entry: vcgEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.11"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "vcgEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
