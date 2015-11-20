
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.IDot1qPortVlanStatisticsTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlanstatisticstable.IDot1qPortVlanStatisticsEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlanstatisticstable.Dot1qPortVlanStatisticsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qPortVlanStatisticsTable
    extends DeviceEntity
    implements Serializable, IDot1qPortVlanStatisticsTable, ITableAccess<IDot1qPortVlanStatisticsEntry>
{

    private Map<String, IDot1qPortVlanStatisticsEntry> dot1qPortVlanStatisticsEntry = new TreeMap<String, IDot1qPortVlanStatisticsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qPortVlanStatisticsTable() {
    }

    public Map<String, IDot1qPortVlanStatisticsEntry> getDot1qPortVlanStatisticsEntry() {
        return this.dot1qPortVlanStatisticsEntry;
    }

    public IDot1qPortVlanStatisticsEntry getEntry(String key) {
        return dot1qPortVlanStatisticsEntry.get(key);
    }

    public void setEntry(String key, IDot1qPortVlanStatisticsEntry value) {
        dot1qPortVlanStatisticsEntry.put(key, value);
        ((Dot1qPortVlanStatisticsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qPortVlanStatisticsEntry> getEntries() {
        return dot1qPortVlanStatisticsEntry;
    }

    public Dot1qPortVlanStatisticsEntry createEntry(String entryIndex) {
        Dot1qPortVlanStatisticsEntry newEntry = new Dot1qPortVlanStatisticsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.4.6.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qPortVlanStatisticsEntry", dot1qPortVlanStatisticsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qPortVlanStatisticsEntry).toHashCode();
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
        Dot1qPortVlanStatisticsTable rhs = ((Dot1qPortVlanStatisticsTable) obj);
        return new EqualsBuilder().append(dot1qPortVlanStatisticsEntry, rhs.dot1qPortVlanStatisticsEntry).isEquals();
    }

    public Dot1qPortVlanStatisticsTable clone() {
        Dot1qPortVlanStatisticsTable _copy = new Dot1qPortVlanStatisticsTable();
        for (Map.Entry<String, IDot1qPortVlanStatisticsEntry> _entry: dot1qPortVlanStatisticsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4.6"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qPortVlanStatisticsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
