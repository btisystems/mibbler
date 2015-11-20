
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.amdtable.AmdEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IAmdTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.amdtable.IAmdEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AmdTable
    extends DeviceEntity
    implements Serializable, IAmdTable, ITableAccess<IAmdEntry>
{

    private Map<String, IAmdEntry> amdEntry = new TreeMap<String, IAmdEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AmdTable() {
    }

    public Map<String, IAmdEntry> getAmdEntry() {
        return this.amdEntry;
    }

    public IAmdEntry getEntry(String key) {
        return amdEntry.get(key);
    }

    public void setEntry(String key, IAmdEntry value) {
        amdEntry.put(key, value);
        ((AmdEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAmdEntry> getEntries() {
        return amdEntry;
    }

    public AmdEntry createEntry(String entryIndex) {
        AmdEntry newEntry = new AmdEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("amdEntry", amdEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(amdEntry).toHashCode();
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
        AmdTable rhs = ((AmdTable) obj);
        return new EqualsBuilder().append(amdEntry, rhs.amdEntry).isEquals();
    }

    public AmdTable clone() {
        AmdTable _copy = new AmdTable();
        for (Map.Entry<String, IAmdEntry> _entry: amdEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "amdEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
