
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.britable.BriEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IBriTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.britable.IBriEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class BriTable
    extends DeviceEntity
    implements Serializable, IBriTable, ITableAccess<IBriEntry>
{

    private Map<String, IBriEntry> briEntry = new TreeMap<String, IBriEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public BriTable() {
    }

    public Map<String, IBriEntry> getBriEntry() {
        return this.briEntry;
    }

    public IBriEntry getEntry(String key) {
        return briEntry.get(key);
    }

    public void setEntry(String key, IBriEntry value) {
        briEntry.put(key, value);
        ((BriEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IBriEntry> getEntries() {
        return briEntry;
    }

    public BriEntry createEntry(String entryIndex) {
        BriEntry newEntry = new BriEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.16.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("briEntry", briEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(briEntry).toHashCode();
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
        BriTable rhs = ((BriTable) obj);
        return new EqualsBuilder().append(briEntry, rhs.briEntry).isEquals();
    }

    public BriTable clone() {
        BriTable _copy = new BriTable();
        for (Map.Entry<String, IBriEntry> _entry: briEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.16"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "briEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
