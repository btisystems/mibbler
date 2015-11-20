
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.IDot1qPortVlanHCStatisticsTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlanhcstatisticstable.IDot1qPortVlanHCStatisticsEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlanhcstatisticstable.Dot1qPortVlanHCStatisticsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qPortVlanHCStatisticsTable
    extends DeviceEntity
    implements Serializable, IDot1qPortVlanHCStatisticsTable, ITableAccess<IDot1qPortVlanHCStatisticsEntry>
{

    private Map<String, IDot1qPortVlanHCStatisticsEntry> dot1qPortVlanHCStatisticsEntry = new TreeMap<String, IDot1qPortVlanHCStatisticsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qPortVlanHCStatisticsTable() {
    }

    public Map<String, IDot1qPortVlanHCStatisticsEntry> getDot1qPortVlanHCStatisticsEntry() {
        return this.dot1qPortVlanHCStatisticsEntry;
    }

    public IDot1qPortVlanHCStatisticsEntry getEntry(String key) {
        return dot1qPortVlanHCStatisticsEntry.get(key);
    }

    public void setEntry(String key, IDot1qPortVlanHCStatisticsEntry value) {
        dot1qPortVlanHCStatisticsEntry.put(key, value);
        ((Dot1qPortVlanHCStatisticsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qPortVlanHCStatisticsEntry> getEntries() {
        return dot1qPortVlanHCStatisticsEntry;
    }

    public Dot1qPortVlanHCStatisticsEntry createEntry(String entryIndex) {
        Dot1qPortVlanHCStatisticsEntry newEntry = new Dot1qPortVlanHCStatisticsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.4.7.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qPortVlanHCStatisticsEntry", dot1qPortVlanHCStatisticsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qPortVlanHCStatisticsEntry).toHashCode();
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
        Dot1qPortVlanHCStatisticsTable rhs = ((Dot1qPortVlanHCStatisticsTable) obj);
        return new EqualsBuilder().append(dot1qPortVlanHCStatisticsEntry, rhs.dot1qPortVlanHCStatisticsEntry).isEquals();
    }

    public Dot1qPortVlanHCStatisticsTable clone() {
        Dot1qPortVlanHCStatisticsTable _copy = new Dot1qPortVlanHCStatisticsTable();
        for (Map.Entry<String, IDot1qPortVlanHCStatisticsEntry> _entry: dot1qPortVlanHCStatisticsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4.7"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qPortVlanHCStatisticsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
