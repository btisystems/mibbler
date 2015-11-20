
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qforwardalltable.Dot1qForwardAllEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.IDot1qForwardAllTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qforwardalltable.IDot1qForwardAllEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1qForwardAllTable
    extends DeviceEntity
    implements Serializable, IDot1qForwardAllTable, ITableAccess<IDot1qForwardAllEntry>
{

    private Map<String, IDot1qForwardAllEntry> dot1qForwardAllEntry = new TreeMap<String, IDot1qForwardAllEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qForwardAllTable() {
    }

    public Map<String, IDot1qForwardAllEntry> getDot1qForwardAllEntry() {
        return this.dot1qForwardAllEntry;
    }

    public IDot1qForwardAllEntry getEntry(String key) {
        return dot1qForwardAllEntry.get(key);
    }

    public void setEntry(String key, IDot1qForwardAllEntry value) {
        dot1qForwardAllEntry.put(key, value);
        ((Dot1qForwardAllEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1qForwardAllEntry> getEntries() {
        return dot1qForwardAllEntry;
    }

    public Dot1qForwardAllEntry createEntry(String entryIndex) {
        Dot1qForwardAllEntry newEntry = new Dot1qForwardAllEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.7.1.2.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qForwardAllEntry", dot1qForwardAllEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qForwardAllEntry).toHashCode();
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
        Dot1qForwardAllTable rhs = ((Dot1qForwardAllTable) obj);
        return new EqualsBuilder().append(dot1qForwardAllEntry, rhs.dot1qForwardAllEntry).isEquals();
    }

    public Dot1qForwardAllTable clone() {
        Dot1qForwardAllTable _copy = new Dot1qForwardAllTable();
        for (Map.Entry<String, IDot1qForwardAllEntry> _entry: dot1qForwardAllEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.2.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qForwardAllEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
