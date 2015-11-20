
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dportoutboundaccessprioritytable.Dot1dPortOutboundAccessPriorityEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.IDot1dPortOutboundAccessPriorityTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dportoutboundaccessprioritytable.IDot1dPortOutboundAccessPriorityEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Dot1dPortOutboundAccessPriorityTable
    extends DeviceEntity
    implements Serializable, IDot1dPortOutboundAccessPriorityTable, ITableAccess<IDot1dPortOutboundAccessPriorityEntry>
{

    private Map<String, IDot1dPortOutboundAccessPriorityEntry> dot1dPortOutboundAccessPriorityEntry = new TreeMap<String, IDot1dPortOutboundAccessPriorityEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dPortOutboundAccessPriorityTable() {
    }

    public Map<String, IDot1dPortOutboundAccessPriorityEntry> getDot1dPortOutboundAccessPriorityEntry() {
        return this.dot1dPortOutboundAccessPriorityEntry;
    }

    public IDot1dPortOutboundAccessPriorityEntry getEntry(String key) {
        return dot1dPortOutboundAccessPriorityEntry.get(key);
    }

    public void setEntry(String key, IDot1dPortOutboundAccessPriorityEntry value) {
        dot1dPortOutboundAccessPriorityEntry.put(key, value);
        ((Dot1dPortOutboundAccessPriorityEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDot1dPortOutboundAccessPriorityEntry> getEntries() {
        return dot1dPortOutboundAccessPriorityEntry;
    }

    public Dot1dPortOutboundAccessPriorityEntry createEntry(String entryIndex) {
        Dot1dPortOutboundAccessPriorityEntry newEntry = new Dot1dPortOutboundAccessPriorityEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.17.6.1.2.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dPortOutboundAccessPriorityEntry", dot1dPortOutboundAccessPriorityEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dPortOutboundAccessPriorityEntry).toHashCode();
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
        Dot1dPortOutboundAccessPriorityTable rhs = ((Dot1dPortOutboundAccessPriorityTable) obj);
        return new EqualsBuilder().append(dot1dPortOutboundAccessPriorityEntry, rhs.dot1dPortOutboundAccessPriorityEntry).isEquals();
    }

    public Dot1dPortOutboundAccessPriorityTable clone() {
        Dot1dPortOutboundAccessPriorityTable _copy = new Dot1dPortOutboundAccessPriorityTable();
        for (Map.Entry<String, IDot1dPortOutboundAccessPriorityEntry> _entry: dot1dPortOutboundAccessPriorityEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.2.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dPortOutboundAccessPriorityEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
