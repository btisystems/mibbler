
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.IDot1qTpGroupTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qtpgrouptable.IDot1qTpGroupEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qtpgrouptable.Dot1qTpGroupEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qTpGroupTable
    extends DeviceEntity
    implements Serializable, IDot1qTpGroupTable, ITableAccess<IDot1qTpGroupEntry>
{

    private Map<String, IDot1qTpGroupEntry> dot1qTpGroupEntry = new TreeMap<String, IDot1qTpGroupEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qTpGroupTable() {
    }

    public Map<String, IDot1qTpGroupEntry> getDot1qTpGroupEntry() {
        return this.dot1qTpGroupEntry;
    }

    public IDot1qTpGroupEntry getEntry(String key) {
        return dot1qTpGroupEntry.get(key);
    }

    public void setEntry(String key, IDot1qTpGroupEntry value) {
        dot1qTpGroupEntry.put(key, value);
        ((Dot1qTpGroupEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qTpGroupEntry> getEntries() {
        return dot1qTpGroupEntry;
    }

    public Dot1qTpGroupEntry createEntry(String entryIndex) {
        Dot1qTpGroupEntry newEntry = new Dot1qTpGroupEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.2.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qTpGroupEntry", dot1qTpGroupEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qTpGroupEntry).toHashCode();
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
        Dot1qTpGroupTable rhs = ((Dot1qTpGroupTable) obj);
        return new EqualsBuilder().append(dot1qTpGroupEntry, rhs.dot1qTpGroupEntry).isEquals();
    }

    public Dot1qTpGroupTable clone() {
        Dot1qTpGroupTable _copy = new Dot1qTpGroupTable();
        for (Map.Entry<String, IDot1qTpGroupEntry> _entry: dot1qTpGroupEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.2.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qTpGroupEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
