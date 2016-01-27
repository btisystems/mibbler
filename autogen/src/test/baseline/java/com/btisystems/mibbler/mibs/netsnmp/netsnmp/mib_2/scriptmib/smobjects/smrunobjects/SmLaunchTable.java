
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smrunobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smrunobjects.ISmLaunchTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smrunobjects.smlaunchtable.ISmLaunchEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smrunobjects.smlaunchtable.SmLaunchEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SmLaunchTable
    extends DeviceEntity
    implements Serializable, ISmLaunchTable, ITableAccess<ISmLaunchEntry>
{

    private Map<String, ISmLaunchEntry> smLaunchEntry = new TreeMap<String, ISmLaunchEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmLaunchTable() {
    }

    public Map<String, ISmLaunchEntry> getSmLaunchEntry() {
        return this.smLaunchEntry;
    }

    public ISmLaunchEntry getEntry(String key) {
        return smLaunchEntry.get(key);
    }

    public void setEntry(String key, ISmLaunchEntry value) {
        smLaunchEntry.put(key, value);
        ((SmLaunchEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISmLaunchEntry> getEntries() {
        return smLaunchEntry;
    }

    public SmLaunchEntry createEntry(String entryIndex) {
        SmLaunchEntry newEntry = new SmLaunchEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.64.1.4.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smLaunchEntry", smLaunchEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smLaunchEntry).toHashCode();
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
        SmLaunchTable rhs = ((SmLaunchTable) obj);
        return new EqualsBuilder().append(smLaunchEntry, rhs.smLaunchEntry).isEquals();
    }

    public SmLaunchTable clone() {
        SmLaunchTable _copy = new SmLaunchTable();
        for (Map.Entry<String, ISmLaunchEntry> _entry: smLaunchEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.1.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "smLaunchEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
