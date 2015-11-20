
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.administration;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.administration.snmptraprcvtable.SnmpTrapRcvEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.administration.ISnmpTrapRcvTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.administration.snmptraprcvtable.ISnmpTrapRcvEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SnmpTrapRcvTable
    extends DeviceEntity
    implements Serializable, ISnmpTrapRcvTable, ITableAccess<ISnmpTrapRcvEntry>
{

    private Map<String, ISnmpTrapRcvEntry> snmpTrapRcvEntry = new TreeMap<String, ISnmpTrapRcvEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SnmpTrapRcvTable() {
    }

    public Map<String, ISnmpTrapRcvEntry> getSnmpTrapRcvEntry() {
        return this.snmpTrapRcvEntry;
    }

    public ISnmpTrapRcvEntry getEntry(String key) {
        return snmpTrapRcvEntry.get(key);
    }

    public void setEntry(String key, ISnmpTrapRcvEntry value) {
        snmpTrapRcvEntry.put(key, value);
        ((SnmpTrapRcvEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISnmpTrapRcvEntry> getEntries() {
        return snmpTrapRcvEntry;
    }

    public SnmpTrapRcvEntry createEntry(String entryIndex) {
        SnmpTrapRcvEntry newEntry = new SnmpTrapRcvEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.8.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("snmpTrapRcvEntry", snmpTrapRcvEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(snmpTrapRcvEntry).toHashCode();
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
        SnmpTrapRcvTable rhs = ((SnmpTrapRcvTable) obj);
        return new EqualsBuilder().append(snmpTrapRcvEntry, rhs.snmpTrapRcvEntry).isEquals();
    }

    public SnmpTrapRcvTable clone() {
        SnmpTrapRcvTable _copy = new SnmpTrapRcvTable();
        for (Map.Entry<String, ISnmpTrapRcvEntry> _entry: snmpTrapRcvEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.8.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "snmpTrapRcvEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
