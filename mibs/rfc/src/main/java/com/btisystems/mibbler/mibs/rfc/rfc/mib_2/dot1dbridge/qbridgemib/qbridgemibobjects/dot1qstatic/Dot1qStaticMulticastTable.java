
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.IDot1qStaticMulticastTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.dot1qstaticmulticasttable.IDot1qStaticMulticastEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.dot1qstaticmulticasttable.Dot1qStaticMulticastEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qStaticMulticastTable
    extends DeviceEntity
    implements Serializable, IDot1qStaticMulticastTable, ITableAccess<IDot1qStaticMulticastEntry>
{

    private Map<String, IDot1qStaticMulticastEntry> dot1qStaticMulticastEntry = new TreeMap<String, IDot1qStaticMulticastEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qStaticMulticastTable() {
    }

    public Map<String, IDot1qStaticMulticastEntry> getDot1qStaticMulticastEntry() {
        return this.dot1qStaticMulticastEntry;
    }

    public IDot1qStaticMulticastEntry getEntry(String key) {
        return dot1qStaticMulticastEntry.get(key);
    }

    public void setEntry(String key, IDot1qStaticMulticastEntry value) {
        dot1qStaticMulticastEntry.put(key, value);
        ((Dot1qStaticMulticastEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qStaticMulticastEntry> getEntries() {
        return dot1qStaticMulticastEntry;
    }

    public Dot1qStaticMulticastEntry createEntry(String entryIndex) {
        Dot1qStaticMulticastEntry newEntry = new Dot1qStaticMulticastEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.3.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qStaticMulticastEntry", dot1qStaticMulticastEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qStaticMulticastEntry).toHashCode();
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
        Dot1qStaticMulticastTable rhs = ((Dot1qStaticMulticastTable) obj);
        return new EqualsBuilder().append(dot1qStaticMulticastEntry, rhs.dot1qStaticMulticastEntry).isEquals();
    }

    public Dot1qStaticMulticastTable clone() {
        Dot1qStaticMulticastTable _copy = new Dot1qStaticMulticastTable();
        for (Map.Entry<String, IDot1qStaticMulticastEntry> _entry: dot1qStaticMulticastEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.3.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qStaticMulticastEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
