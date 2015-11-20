
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.administration;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.administration.tl1usertable.Tl1UserEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.administration.ITl1UserTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.administration.tl1usertable.ITl1UserEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Tl1UserTable
    extends DeviceEntity
    implements Serializable, ITl1UserTable, ITableAccess<ITl1UserEntry>
{

    private Map<String, ITl1UserEntry> tl1UserEntry = new TreeMap<String, ITl1UserEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Tl1UserTable() {
    }

    public Map<String, ITl1UserEntry> getTl1UserEntry() {
        return this.tl1UserEntry;
    }

    public ITl1UserEntry getEntry(String key) {
        return tl1UserEntry.get(key);
    }

    public void setEntry(String key, ITl1UserEntry value) {
        tl1UserEntry.put(key, value);
        ((Tl1UserEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ITl1UserEntry> getEntries() {
        return tl1UserEntry;
    }

    public Tl1UserEntry createEntry(String entryIndex) {
        Tl1UserEntry newEntry = new Tl1UserEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.8.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tl1UserEntry", tl1UserEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tl1UserEntry).toHashCode();
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
        Tl1UserTable rhs = ((Tl1UserTable) obj);
        return new EqualsBuilder().append(tl1UserEntry, rhs.tl1UserEntry).isEquals();
    }

    public Tl1UserTable clone() {
        Tl1UserTable _copy = new Tl1UserTable();
        for (Map.Entry<String, ITl1UserEntry> _entry: tl1UserEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.8.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tl1UserEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
