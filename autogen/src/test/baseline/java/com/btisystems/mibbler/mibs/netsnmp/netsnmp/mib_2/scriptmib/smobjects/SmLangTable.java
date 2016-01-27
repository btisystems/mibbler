
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.ISmLangTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smlangtable.ISmLangEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smlangtable.SmLangEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SmLangTable
    extends DeviceEntity
    implements Serializable, ISmLangTable, ITableAccess<ISmLangEntry>
{

    private Map<String, ISmLangEntry> smLangEntry = new TreeMap<String, ISmLangEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmLangTable() {
    }

    public Map<String, ISmLangEntry> getSmLangEntry() {
        return this.smLangEntry;
    }

    public ISmLangEntry getEntry(String key) {
        return smLangEntry.get(key);
    }

    public void setEntry(String key, ISmLangEntry value) {
        smLangEntry.put(key, value);
        ((SmLangEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISmLangEntry> getEntries() {
        return smLangEntry;
    }

    public SmLangEntry createEntry(String entryIndex) {
        SmLangEntry newEntry = new SmLangEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.64.1.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smLangEntry", smLangEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smLangEntry).toHashCode();
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
        SmLangTable rhs = ((SmLangTable) obj);
        return new EqualsBuilder().append(smLangEntry, rhs.smLangEntry).isEquals();
    }

    public SmLangTable clone() {
        SmLangTable _copy = new SmLangTable();
        for (Map.Entry<String, ISmLangEntry> _entry: smLangEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "smLangEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
