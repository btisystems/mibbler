
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.passiveporttable.PassivePortEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IPassivePortTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.passiveporttable.IPassivePortEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class PassivePortTable
    extends DeviceEntity
    implements Serializable, IPassivePortTable, ITableAccess<IPassivePortEntry>
{

    private Map<String, IPassivePortEntry> passivePortEntry = new TreeMap<String, IPassivePortEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public PassivePortTable() {
    }

    public Map<String, IPassivePortEntry> getPassivePortEntry() {
        return this.passivePortEntry;
    }

    public IPassivePortEntry getEntry(String key) {
        return passivePortEntry.get(key);
    }

    public void setEntry(String key, IPassivePortEntry value) {
        passivePortEntry.put(key, value);
        ((PassivePortEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IPassivePortEntry> getEntries() {
        return passivePortEntry;
    }

    public PassivePortEntry createEntry(String entryIndex) {
        PassivePortEntry newEntry = new PassivePortEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("passivePortEntry", passivePortEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(passivePortEntry).toHashCode();
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
        PassivePortTable rhs = ((PassivePortTable) obj);
        return new EqualsBuilder().append(passivePortEntry, rhs.passivePortEntry).isEquals();
    }

    public PassivePortTable clone() {
        PassivePortTable _copy = new PassivePortTable();
        for (Map.Entry<String, IPassivePortEntry> _entry: passivePortEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "passivePortEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
