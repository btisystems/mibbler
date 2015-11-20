
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.synchronization;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.synchronization.cpsynchronizationtable.CpSynchronizationEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.synchronization.ICpSynchronizationTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.synchronization.cpsynchronizationtable.ICpSynchronizationEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class CpSynchronizationTable
    extends DeviceEntity
    implements Serializable, ICpSynchronizationTable, ITableAccess<ICpSynchronizationEntry>
{

    private Map<String, ICpSynchronizationEntry> cpSynchronizationEntry = new TreeMap<String, ICpSynchronizationEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public CpSynchronizationTable() {
    }

    public Map<String, ICpSynchronizationEntry> getCpSynchronizationEntry() {
        return this.cpSynchronizationEntry;
    }

    public ICpSynchronizationEntry getEntry(String key) {
        return cpSynchronizationEntry.get(key);
    }

    public void setEntry(String key, ICpSynchronizationEntry value) {
        cpSynchronizationEntry.put(key, value);
        ((CpSynchronizationEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ICpSynchronizationEntry> getEntries() {
        return cpSynchronizationEntry;
    }

    public CpSynchronizationEntry createEntry(String entryIndex) {
        CpSynchronizationEntry newEntry = new CpSynchronizationEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.12.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("cpSynchronizationEntry", cpSynchronizationEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(cpSynchronizationEntry).toHashCode();
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
        CpSynchronizationTable rhs = ((CpSynchronizationTable) obj);
        return new EqualsBuilder().append(cpSynchronizationEntry, rhs.cpSynchronizationEntry).isEquals();
    }

    public CpSynchronizationTable clone() {
        CpSynchronizationTable _copy = new CpSynchronizationTable();
        for (Map.Entry<String, ICpSynchronizationEntry> _entry: cpSynchronizationEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.12.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "cpSynchronizationEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
