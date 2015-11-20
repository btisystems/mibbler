
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.IDot1qTpFdbTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qtpfdbtable.IDot1qTpFdbEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qtpfdbtable.Dot1qTpFdbEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qTpFdbTable
    extends DeviceEntity
    implements Serializable, IDot1qTpFdbTable, ITableAccess<IDot1qTpFdbEntry>
{

    private Map<String, IDot1qTpFdbEntry> dot1qTpFdbEntry = new TreeMap<String, IDot1qTpFdbEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qTpFdbTable() {
    }

    public Map<String, IDot1qTpFdbEntry> getDot1qTpFdbEntry() {
        return this.dot1qTpFdbEntry;
    }

    public IDot1qTpFdbEntry getEntry(String key) {
        return dot1qTpFdbEntry.get(key);
    }

    public void setEntry(String key, IDot1qTpFdbEntry value) {
        dot1qTpFdbEntry.put(key, value);
        ((Dot1qTpFdbEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qTpFdbEntry> getEntries() {
        return dot1qTpFdbEntry;
    }

    public Dot1qTpFdbEntry createEntry(String entryIndex) {
        Dot1qTpFdbEntry newEntry = new Dot1qTpFdbEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.2.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qTpFdbEntry", dot1qTpFdbEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qTpFdbEntry).toHashCode();
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
        Dot1qTpFdbTable rhs = ((Dot1qTpFdbTable) obj);
        return new EqualsBuilder().append(dot1qTpFdbEntry, rhs.dot1qTpFdbEntry).isEquals();
    }

    public Dot1qTpFdbTable clone() {
        Dot1qTpFdbTable _copy = new Dot1qTpFdbTable();
        for (Map.Entry<String, IDot1qTpFdbEntry> _entry: dot1qTpFdbEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.2.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qTpFdbEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
