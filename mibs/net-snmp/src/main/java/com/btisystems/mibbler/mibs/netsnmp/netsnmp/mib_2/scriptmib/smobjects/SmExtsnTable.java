
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.ISmExtsnTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smextsntable.ISmExtsnEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smextsntable.SmExtsnEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SmExtsnTable
    extends DeviceEntity
    implements Serializable, ISmExtsnTable, ITableAccess<ISmExtsnEntry>
{

    private Map<String, ISmExtsnEntry> smExtsnEntry = new TreeMap<String, ISmExtsnEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmExtsnTable() {
    }

    public Map<String, ISmExtsnEntry> getSmExtsnEntry() {
        return this.smExtsnEntry;
    }

    public ISmExtsnEntry getEntry(String key) {
        return smExtsnEntry.get(key);
    }

    public void setEntry(String key, ISmExtsnEntry value) {
        smExtsnEntry.put(key, value);
        ((SmExtsnEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISmExtsnEntry> getEntries() {
        return smExtsnEntry;
    }

    public SmExtsnEntry createEntry(String entryIndex) {
        SmExtsnEntry newEntry = new SmExtsnEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.64.1.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smExtsnEntry", smExtsnEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smExtsnEntry).toHashCode();
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
        SmExtsnTable rhs = ((SmExtsnTable) obj);
        return new EqualsBuilder().append(smExtsnEntry, rhs.smExtsnEntry).isEquals();
    }

    public SmExtsnTable clone() {
        SmExtsnTable _copy = new SmExtsnTable();
        for (Map.Entry<String, ISmExtsnEntry> _entry: smExtsnEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.1.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "smExtsnEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
