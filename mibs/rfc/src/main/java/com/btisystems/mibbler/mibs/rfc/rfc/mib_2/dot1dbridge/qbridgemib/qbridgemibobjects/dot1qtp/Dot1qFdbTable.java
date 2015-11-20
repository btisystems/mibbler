
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.IDot1qFdbTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qfdbtable.IDot1qFdbEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qfdbtable.Dot1qFdbEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qFdbTable
    extends DeviceEntity
    implements Serializable, IDot1qFdbTable, ITableAccess<IDot1qFdbEntry>
{

    private Map<String, IDot1qFdbEntry> dot1qFdbEntry = new TreeMap<String, IDot1qFdbEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qFdbTable() {
    }

    public Map<String, IDot1qFdbEntry> getDot1qFdbEntry() {
        return this.dot1qFdbEntry;
    }

    public IDot1qFdbEntry getEntry(String key) {
        return dot1qFdbEntry.get(key);
    }

    public void setEntry(String key, IDot1qFdbEntry value) {
        dot1qFdbEntry.put(key, value);
        ((Dot1qFdbEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qFdbEntry> getEntries() {
        return dot1qFdbEntry;
    }

    public Dot1qFdbEntry createEntry(String entryIndex) {
        Dot1qFdbEntry newEntry = new Dot1qFdbEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.2.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qFdbEntry", dot1qFdbEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qFdbEntry).toHashCode();
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
        Dot1qFdbTable rhs = ((Dot1qFdbTable) obj);
        return new EqualsBuilder().append(dot1qFdbEntry, rhs.dot1qFdbEntry).isEquals();
    }

    public Dot1qFdbTable clone() {
        Dot1qFdbTable _copy = new Dot1qFdbTable();
        for (Map.Entry<String, IDot1qFdbEntry> _entry: dot1qFdbEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qFdbEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
