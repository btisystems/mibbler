
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.equipment;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.equipment.cptable.CpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.equipment.ICpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.equipment.cptable.ICpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class CpTable
    extends DeviceEntity
    implements Serializable, ICpTable, ITableAccess<ICpEntry>
{

    private Map<String, ICpEntry> cpEntry = new TreeMap<String, ICpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public CpTable() {
    }

    public Map<String, ICpEntry> getCpEntry() {
        return this.cpEntry;
    }

    public ICpEntry getEntry(String key) {
        return cpEntry.get(key);
    }

    public void setEntry(String key, ICpEntry value) {
        cpEntry.put(key, value);
        ((CpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ICpEntry> getEntries() {
        return cpEntry;
    }

    public CpEntry createEntry(String entryIndex) {
        CpEntry newEntry = new CpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.3.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("cpEntry", cpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(cpEntry).toHashCode();
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
        CpTable rhs = ((CpTable) obj);
        return new EqualsBuilder().append(cpEntry, rhs.cpEntry).isEquals();
    }

    public CpTable clone() {
        CpTable _copy = new CpTable();
        for (Map.Entry<String, ICpEntry> _entry: cpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.3.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "cpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
