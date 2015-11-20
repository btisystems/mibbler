
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgmrp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgmrp.IDot1dPortGmrpTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgmrp.dot1dportgmrptable.IDot1dPortGmrpEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgmrp.dot1dportgmrptable.Dot1dPortGmrpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dPortGmrpTable
    extends DeviceEntity
    implements Serializable, IDot1dPortGmrpTable, ITableAccess<IDot1dPortGmrpEntry>
{

    private Map<String, IDot1dPortGmrpEntry> dot1dPortGmrpEntry = new TreeMap<String, IDot1dPortGmrpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dPortGmrpTable() {
    }

    public Map<String, IDot1dPortGmrpEntry> getDot1dPortGmrpEntry() {
        return this.dot1dPortGmrpEntry;
    }

    public IDot1dPortGmrpEntry getEntry(String key) {
        return dot1dPortGmrpEntry.get(key);
    }

    public void setEntry(String key, IDot1dPortGmrpEntry value) {
        dot1dPortGmrpEntry.put(key, value);
        ((Dot1dPortGmrpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dPortGmrpEntry> getEntries() {
        return dot1dPortGmrpEntry;
    }

    public Dot1dPortGmrpEntry createEntry(String entryIndex) {
        Dot1dPortGmrpEntry newEntry = new Dot1dPortGmrpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.6.1.4.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dPortGmrpEntry", dot1dPortGmrpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dPortGmrpEntry).toHashCode();
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
        Dot1dPortGmrpTable rhs = ((Dot1dPortGmrpTable) obj);
        return new EqualsBuilder().append(dot1dPortGmrpEntry, rhs.dot1dPortGmrpEntry).isEquals();
    }

    public Dot1dPortGmrpTable clone() {
        Dot1dPortGmrpTable _copy = new Dot1dPortGmrpTable();
        for (Map.Entry<String, IDot1dPortGmrpEntry> _entry: dot1dPortGmrpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dPortGmrpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
