
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlhost;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlhost.IHlHostControlTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlhost.hlhostcontroltable.IHlHostControlEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlhost.hlhostcontroltable.HlHostControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HlHostControlTable
    extends DeviceEntity
    implements Serializable, IHlHostControlTable, ITableAccess<IHlHostControlEntry>
{

    private Map<String, IHlHostControlEntry> hlHostControlEntry = new TreeMap<String, IHlHostControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HlHostControlTable() {
    }

    public Map<String, IHlHostControlEntry> getHlHostControlEntry() {
        return this.hlHostControlEntry;
    }

    public IHlHostControlEntry getEntry(String key) {
        return hlHostControlEntry.get(key);
    }

    public void setEntry(String key, IHlHostControlEntry value) {
        hlHostControlEntry.put(key, value);
        ((HlHostControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHlHostControlEntry> getEntries() {
        return hlHostControlEntry;
    }

    public HlHostControlEntry createEntry(String entryIndex) {
        HlHostControlEntry newEntry = new HlHostControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.14.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hlHostControlEntry", hlHostControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hlHostControlEntry).toHashCode();
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
        HlHostControlTable rhs = ((HlHostControlTable) obj);
        return new EqualsBuilder().append(hlHostControlEntry, rhs.hlHostControlEntry).isEquals();
    }

    public HlHostControlTable clone() {
        HlHostControlTable _copy = new HlHostControlTable();
        for (Map.Entry<String, IHlHostControlEntry> _entry: hlHostControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.14.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hlHostControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
