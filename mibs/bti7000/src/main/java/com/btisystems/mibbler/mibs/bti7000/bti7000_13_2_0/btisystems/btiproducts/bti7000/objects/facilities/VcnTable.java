
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.vcntable.VcnEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IVcnTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.vcntable.IVcnEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class VcnTable
    extends DeviceEntity
    implements Serializable, IVcnTable, ITableAccess<IVcnEntry>
{

    private Map<String, IVcnEntry> vcnEntry = new TreeMap<String, IVcnEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public VcnTable() {
    }

    public Map<String, IVcnEntry> getVcnEntry() {
        return this.vcnEntry;
    }

    public IVcnEntry getEntry(String key) {
        return vcnEntry.get(key);
    }

    public void setEntry(String key, IVcnEntry value) {
        vcnEntry.put(key, value);
        ((VcnEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IVcnEntry> getEntries() {
        return vcnEntry;
    }

    public VcnEntry createEntry(String entryIndex) {
        VcnEntry newEntry = new VcnEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.8.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("vcnEntry", vcnEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(vcnEntry).toHashCode();
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
        VcnTable rhs = ((VcnTable) obj);
        return new EqualsBuilder().append(vcnEntry, rhs.vcnEntry).isEquals();
    }

    public VcnTable clone() {
        VcnTable _copy = new VcnTable();
        for (Map.Entry<String, IVcnEntry> _entry: vcnEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.8"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "vcnEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
