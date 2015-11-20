
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smscriptobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smscriptobjects.ISmCodeTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smscriptobjects.smcodetable.ISmCodeEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smscriptobjects.smcodetable.SmCodeEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SmCodeTable
    extends DeviceEntity
    implements Serializable, ISmCodeTable, ITableAccess<ISmCodeEntry>
{

    private Map<String, ISmCodeEntry> smCodeEntry = new TreeMap<String, ISmCodeEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmCodeTable() {
    }

    public Map<String, ISmCodeEntry> getSmCodeEntry() {
        return this.smCodeEntry;
    }

    public ISmCodeEntry getEntry(String key) {
        return smCodeEntry.get(key);
    }

    public void setEntry(String key, ISmCodeEntry value) {
        smCodeEntry.put(key, value);
        ((SmCodeEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISmCodeEntry> getEntries() {
        return smCodeEntry;
    }

    public SmCodeEntry createEntry(String entryIndex) {
        SmCodeEntry newEntry = new SmCodeEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.64.1.3.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smCodeEntry", smCodeEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smCodeEntry).toHashCode();
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
        SmCodeTable rhs = ((SmCodeTable) obj);
        return new EqualsBuilder().append(smCodeEntry, rhs.smCodeEntry).isEquals();
    }

    public SmCodeTable clone() {
        SmCodeTable _copy = new SmCodeTable();
        for (Map.Entry<String, ISmCodeEntry> _entry: smCodeEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.1.3.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "smCodeEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
