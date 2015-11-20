
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.cpoperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.cpoperations.cprestartoptable.CpRestartOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.cpoperations.ICpRestartOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.cpoperations.cprestartoptable.ICpRestartOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class CpRestartOpTable
    extends DeviceEntity
    implements Serializable, ICpRestartOpTable, ITableAccess<ICpRestartOpEntry>
{

    private Map<String, ICpRestartOpEntry> cpRestartOpEntry = new TreeMap<String, ICpRestartOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public CpRestartOpTable() {
    }

    public Map<String, ICpRestartOpEntry> getCpRestartOpEntry() {
        return this.cpRestartOpEntry;
    }

    public ICpRestartOpEntry getEntry(String key) {
        return cpRestartOpEntry.get(key);
    }

    public void setEntry(String key, ICpRestartOpEntry value) {
        cpRestartOpEntry.put(key, value);
        ((CpRestartOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ICpRestartOpEntry> getEntries() {
        return cpRestartOpEntry;
    }

    public CpRestartOpEntry createEntry(String entryIndex) {
        CpRestartOpEntry newEntry = new CpRestartOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.5.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("cpRestartOpEntry", cpRestartOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(cpRestartOpEntry).toHashCode();
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
        CpRestartOpTable rhs = ((CpRestartOpTable) obj);
        return new EqualsBuilder().append(cpRestartOpEntry, rhs.cpRestartOpEntry).isEquals();
    }

    public CpRestartOpTable clone() {
        CpRestartOpTable _copy = new CpRestartOpTable();
        for (Map.Entry<String, ICpRestartOpEntry> _entry: cpRestartOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "cpRestartOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
