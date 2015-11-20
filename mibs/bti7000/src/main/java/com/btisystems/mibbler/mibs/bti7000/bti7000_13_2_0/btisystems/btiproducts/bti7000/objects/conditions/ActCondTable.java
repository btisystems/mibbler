
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.conditions;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.conditions.actcondtable.ActCondEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions.IActCondTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions.actcondtable.IActCondEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class ActCondTable
    extends DeviceEntity
    implements Serializable, IActCondTable, ITableAccess<IActCondEntry>
{

    private Map<String, IActCondEntry> actCondEntry = new TreeMap<String, IActCondEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ActCondTable() {
    }

    public Map<String, IActCondEntry> getActCondEntry() {
        return this.actCondEntry;
    }

    public IActCondEntry getEntry(String key) {
        return actCondEntry.get(key);
    }

    public void setEntry(String key, IActCondEntry value) {
        actCondEntry.put(key, value);
        ((ActCondEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IActCondEntry> getEntries() {
        return actCondEntry;
    }

    public ActCondEntry createEntry(String entryIndex) {
        ActCondEntry newEntry = new ActCondEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.7.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("actCondEntry", actCondEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(actCondEntry).toHashCode();
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
        ActCondTable rhs = ((ActCondTable) obj);
        return new EqualsBuilder().append(actCondEntry, rhs.actCondEntry).isEquals();
    }

    public ActCondTable clone() {
        ActCondTable _copy = new ActCondTable();
        for (Map.Entry<String, IActCondEntry> _entry: actCondEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.7.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "actCondEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
