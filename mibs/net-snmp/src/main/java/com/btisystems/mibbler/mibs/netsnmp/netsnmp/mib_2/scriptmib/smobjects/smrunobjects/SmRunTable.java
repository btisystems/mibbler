
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smrunobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smrunobjects.ISmRunTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smrunobjects.smruntable.ISmRunEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smrunobjects.smruntable.SmRunEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SmRunTable
    extends DeviceEntity
    implements Serializable, ISmRunTable, ITableAccess<ISmRunEntry>
{

    private Map<String, ISmRunEntry> smRunEntry = new TreeMap<String, ISmRunEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmRunTable() {
    }

    public Map<String, ISmRunEntry> getSmRunEntry() {
        return this.smRunEntry;
    }

    public ISmRunEntry getEntry(String key) {
        return smRunEntry.get(key);
    }

    public void setEntry(String key, ISmRunEntry value) {
        smRunEntry.put(key, value);
        ((SmRunEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISmRunEntry> getEntries() {
        return smRunEntry;
    }

    public SmRunEntry createEntry(String entryIndex) {
        SmRunEntry newEntry = new SmRunEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.64.1.4.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smRunEntry", smRunEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smRunEntry).toHashCode();
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
        SmRunTable rhs = ((SmRunTable) obj);
        return new EqualsBuilder().append(smRunEntry, rhs.smRunEntry).isEquals();
    }

    public SmRunTable clone() {
        SmRunTable _copy = new SmRunTable();
        for (Map.Entry<String, ISmRunEntry> _entry: smRunEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.1.4.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "smRunEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
