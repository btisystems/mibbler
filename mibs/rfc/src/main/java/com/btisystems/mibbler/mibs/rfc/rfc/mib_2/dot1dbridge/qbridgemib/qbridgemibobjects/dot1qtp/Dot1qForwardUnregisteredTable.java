
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.IDot1qForwardUnregisteredTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qforwardunregisteredtable.IDot1qForwardUnregisteredEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qforwardunregisteredtable.Dot1qForwardUnregisteredEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qForwardUnregisteredTable
    extends DeviceEntity
    implements Serializable, IDot1qForwardUnregisteredTable, ITableAccess<IDot1qForwardUnregisteredEntry>
{

    private Map<String, IDot1qForwardUnregisteredEntry> dot1qForwardUnregisteredEntry = new TreeMap<String, IDot1qForwardUnregisteredEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qForwardUnregisteredTable() {
    }

    public Map<String, IDot1qForwardUnregisteredEntry> getDot1qForwardUnregisteredEntry() {
        return this.dot1qForwardUnregisteredEntry;
    }

    public IDot1qForwardUnregisteredEntry getEntry(String key) {
        return dot1qForwardUnregisteredEntry.get(key);
    }

    public void setEntry(String key, IDot1qForwardUnregisteredEntry value) {
        dot1qForwardUnregisteredEntry.put(key, value);
        ((Dot1qForwardUnregisteredEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qForwardUnregisteredEntry> getEntries() {
        return dot1qForwardUnregisteredEntry;
    }

    public Dot1qForwardUnregisteredEntry createEntry(String entryIndex) {
        Dot1qForwardUnregisteredEntry newEntry = new Dot1qForwardUnregisteredEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.2.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qForwardUnregisteredEntry", dot1qForwardUnregisteredEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qForwardUnregisteredEntry).toHashCode();
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
        Dot1qForwardUnregisteredTable rhs = ((Dot1qForwardUnregisteredTable) obj);
        return new EqualsBuilder().append(dot1qForwardUnregisteredEntry, rhs.dot1qForwardUnregisteredEntry).isEquals();
    }

    public Dot1qForwardUnregisteredTable clone() {
        Dot1qForwardUnregisteredTable _copy = new Dot1qForwardUnregisteredTable();
        for (Map.Entry<String, IDot1qForwardUnregisteredEntry> _entry: dot1qForwardUnregisteredEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.2.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qForwardUnregisteredEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
