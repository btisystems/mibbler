
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dextbase;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dextbase.IDot1dPortCapabilitiesTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dextbase.dot1dportcapabilitiestable.IDot1dPortCapabilitiesEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dextbase.dot1dportcapabilitiestable.Dot1dPortCapabilitiesEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dPortCapabilitiesTable
    extends DeviceEntity
    implements Serializable, IDot1dPortCapabilitiesTable, ITableAccess<IDot1dPortCapabilitiesEntry>
{

    private Map<String, IDot1dPortCapabilitiesEntry> dot1dPortCapabilitiesEntry = new TreeMap<String, IDot1dPortCapabilitiesEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dPortCapabilitiesTable() {
    }

    public Map<String, IDot1dPortCapabilitiesEntry> getDot1dPortCapabilitiesEntry() {
        return this.dot1dPortCapabilitiesEntry;
    }

    public IDot1dPortCapabilitiesEntry getEntry(String key) {
        return dot1dPortCapabilitiesEntry.get(key);
    }

    public void setEntry(String key, IDot1dPortCapabilitiesEntry value) {
        dot1dPortCapabilitiesEntry.put(key, value);
        ((Dot1dPortCapabilitiesEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dPortCapabilitiesEntry> getEntries() {
        return dot1dPortCapabilitiesEntry;
    }

    public Dot1dPortCapabilitiesEntry createEntry(String entryIndex) {
        Dot1dPortCapabilitiesEntry newEntry = new Dot1dPortCapabilitiesEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.6.1.1.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dPortCapabilitiesEntry", dot1dPortCapabilitiesEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dPortCapabilitiesEntry).toHashCode();
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
        Dot1dPortCapabilitiesTable rhs = ((Dot1dPortCapabilitiesTable) obj);
        return new EqualsBuilder().append(dot1dPortCapabilitiesEntry, rhs.dot1dPortCapabilitiesEntry).isEquals();
    }

    public Dot1dPortCapabilitiesTable clone() {
        Dot1dPortCapabilitiesTable _copy = new Dot1dPortCapabilitiesTable();
        for (Map.Entry<String, IDot1dPortCapabilitiesEntry> _entry: dot1dPortCapabilitiesEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.1.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dPortCapabilitiesEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
