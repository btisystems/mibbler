
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.conditions;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.conditions.actalarmtable.ActAlarmEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions.IActAlarmTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.conditions.actalarmtable.IActAlarmEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class ActAlarmTable
    extends DeviceEntity
    implements Serializable, IActAlarmTable, ITableAccess<IActAlarmEntry>
{

    private Map<String, IActAlarmEntry> actAlarmEntry = new TreeMap<String, IActAlarmEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ActAlarmTable() {
    }

    public Map<String, IActAlarmEntry> getActAlarmEntry() {
        return this.actAlarmEntry;
    }

    public IActAlarmEntry getEntry(String key) {
        return actAlarmEntry.get(key);
    }

    public void setEntry(String key, IActAlarmEntry value) {
        actAlarmEntry.put(key, value);
        ((ActAlarmEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IActAlarmEntry> getEntries() {
        return actAlarmEntry;
    }

    public ActAlarmEntry createEntry(String entryIndex) {
        ActAlarmEntry newEntry = new ActAlarmEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.7.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("actAlarmEntry", actAlarmEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(actAlarmEntry).toHashCode();
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
        ActAlarmTable rhs = ((ActAlarmTable) obj);
        return new EqualsBuilder().append(actAlarmEntry, rhs.actAlarmEntry).isEquals();
    }

    public ActAlarmTable clone() {
        ActAlarmTable _copy = new ActAlarmTable();
        for (Map.Entry<String, IActAlarmEntry> _entry: actAlarmEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.7.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "actAlarmEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
