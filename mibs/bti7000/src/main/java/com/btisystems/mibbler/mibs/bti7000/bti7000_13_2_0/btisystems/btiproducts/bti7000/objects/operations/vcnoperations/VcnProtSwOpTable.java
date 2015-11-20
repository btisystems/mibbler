
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.vcnoperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.vcnoperations.vcnprotswoptable.VcnProtSwOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.vcnoperations.IVcnProtSwOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.vcnoperations.vcnprotswoptable.IVcnProtSwOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class VcnProtSwOpTable
    extends DeviceEntity
    implements Serializable, IVcnProtSwOpTable, ITableAccess<IVcnProtSwOpEntry>
{

    private Map<String, IVcnProtSwOpEntry> vcnProtSwOpEntry = new TreeMap<String, IVcnProtSwOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public VcnProtSwOpTable() {
    }

    public Map<String, IVcnProtSwOpEntry> getVcnProtSwOpEntry() {
        return this.vcnProtSwOpEntry;
    }

    public IVcnProtSwOpEntry getEntry(String key) {
        return vcnProtSwOpEntry.get(key);
    }

    public void setEntry(String key, IVcnProtSwOpEntry value) {
        vcnProtSwOpEntry.put(key, value);
        ((VcnProtSwOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IVcnProtSwOpEntry> getEntries() {
        return vcnProtSwOpEntry;
    }

    public VcnProtSwOpEntry createEntry(String entryIndex) {
        VcnProtSwOpEntry newEntry = new VcnProtSwOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.15.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("vcnProtSwOpEntry", vcnProtSwOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(vcnProtSwOpEntry).toHashCode();
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
        VcnProtSwOpTable rhs = ((VcnProtSwOpTable) obj);
        return new EqualsBuilder().append(vcnProtSwOpEntry, rhs.vcnProtSwOpEntry).isEquals();
    }

    public VcnProtSwOpTable clone() {
        VcnProtSwOpTable _copy = new VcnProtSwOpTable();
        for (Map.Entry<String, IVcnProtSwOpEntry> _entry: vcnProtSwOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.15.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "vcnProtSwOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
