
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.dot1dtp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.dot1dtp.dot1dtpfdbtable.Dot1dTpFdbEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp.IDot1dTpFdbTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtpfdbtable.IDot1dTpFdbEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dTpFdbTable
    extends DeviceEntity
    implements Serializable, IDot1dTpFdbTable, ITableAccess<IDot1dTpFdbEntry>
{

    private Map<String, IDot1dTpFdbEntry> dot1dTpFdbEntry = new TreeMap<String, IDot1dTpFdbEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dTpFdbTable() {
    }

    public Map<String, IDot1dTpFdbEntry> getDot1dTpFdbEntry() {
        return this.dot1dTpFdbEntry;
    }

    public IDot1dTpFdbEntry getEntry(String key) {
        return dot1dTpFdbEntry.get(key);
    }

    public void setEntry(String key, IDot1dTpFdbEntry value) {
        dot1dTpFdbEntry.put(key, value);
        ((Dot1dTpFdbEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dTpFdbEntry> getEntries() {
        return dot1dTpFdbEntry;
    }

    public Dot1dTpFdbEntry createEntry(String entryIndex) {
        Dot1dTpFdbEntry newEntry = new Dot1dTpFdbEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.4.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dTpFdbEntry", dot1dTpFdbEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dTpFdbEntry).toHashCode();
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
        Dot1dTpFdbTable rhs = ((Dot1dTpFdbTable) obj);
        return new EqualsBuilder().append(dot1dTpFdbEntry, rhs.dot1dTpFdbEntry).isEquals();
    }

    public Dot1dTpFdbTable clone() {
        Dot1dTpFdbTable _copy = new Dot1dTpFdbTable();
        for (Map.Entry<String, IDot1dTpFdbEntry> _entry: dot1dTpFdbEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.4.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dTpFdbEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
