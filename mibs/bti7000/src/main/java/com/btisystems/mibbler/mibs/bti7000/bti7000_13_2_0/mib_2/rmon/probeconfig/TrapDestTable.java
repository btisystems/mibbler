
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.probeconfig;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.probeconfig.trapdesttable.TrapDestEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.probeconfig.ITrapDestTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.probeconfig.trapdesttable.ITrapDestEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class TrapDestTable
    extends DeviceEntity
    implements Serializable, ITrapDestTable, ITableAccess<ITrapDestEntry>
{

    private Map<String, ITrapDestEntry> trapDestEntry = new TreeMap<String, ITrapDestEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TrapDestTable() {
    }

    public Map<String, ITrapDestEntry> getTrapDestEntry() {
        return this.trapDestEntry;
    }

    public ITrapDestEntry getEntry(String key) {
        return trapDestEntry.get(key);
    }

    public void setEntry(String key, ITrapDestEntry value) {
        trapDestEntry.put(key, value);
        ((TrapDestEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ITrapDestEntry> getEntries() {
        return trapDestEntry;
    }

    public TrapDestEntry createEntry(String entryIndex) {
        TrapDestEntry newEntry = new TrapDestEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.19.13.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("trapDestEntry", trapDestEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(trapDestEntry).toHashCode();
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
        TrapDestTable rhs = ((TrapDestTable) obj);
        return new EqualsBuilder().append(trapDestEntry, rhs.trapDestEntry).isEquals();
    }

    public TrapDestTable clone() {
        TrapDestTable _copy = new TrapDestTable();
        for (Map.Entry<String, ITrapDestEntry> _entry: trapDestEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.19.13"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "trapDestEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
