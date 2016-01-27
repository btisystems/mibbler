
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.IDot3CollTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3colltable.IDot3CollEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.dot3colltable.Dot3CollEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot3CollTable
    extends DeviceEntity
    implements Serializable, IDot3CollTable, ITableAccess<IDot3CollEntry>
{

    private Map<String, IDot3CollEntry> dot3CollEntry = new TreeMap<String, IDot3CollEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot3CollTable() {
    }

    public Map<String, IDot3CollEntry> getDot3CollEntry() {
        return this.dot3CollEntry;
    }

    public IDot3CollEntry getEntry(String key) {
        return dot3CollEntry.get(key);
    }

    public void setEntry(String key, IDot3CollEntry value) {
        dot3CollEntry.put(key, value);
        ((Dot3CollEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot3CollEntry> getEntries() {
        return dot3CollEntry;
    }

    public Dot3CollEntry createEntry(String entryIndex) {
        Dot3CollEntry newEntry = new Dot3CollEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.10.7.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot3CollEntry", dot3CollEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot3CollEntry).toHashCode();
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
        Dot3CollTable rhs = ((Dot3CollTable) obj);
        return new EqualsBuilder().append(dot3CollEntry, rhs.dot3CollEntry).isEquals();
    }

    public Dot3CollTable clone() {
        Dot3CollTable _copy = new Dot3CollTable();
        for (Map.Entry<String, IDot3CollEntry> _entry: dot3CollEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.10.7.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot3CollEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
