
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.protocoldist;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.protocoldist.IProtocolDistControlTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.protocoldist.protocoldistcontroltable.IProtocolDistControlEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.protocoldist.protocoldistcontroltable.ProtocolDistControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class ProtocolDistControlTable
    extends DeviceEntity
    implements Serializable, IProtocolDistControlTable, ITableAccess<IProtocolDistControlEntry>
{

    private Map<String, IProtocolDistControlEntry> protocolDistControlEntry = new TreeMap<String, IProtocolDistControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ProtocolDistControlTable() {
    }

    public Map<String, IProtocolDistControlEntry> getProtocolDistControlEntry() {
        return this.protocolDistControlEntry;
    }

    public IProtocolDistControlEntry getEntry(String key) {
        return protocolDistControlEntry.get(key);
    }

    public void setEntry(String key, IProtocolDistControlEntry value) {
        protocolDistControlEntry.put(key, value);
        ((ProtocolDistControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IProtocolDistControlEntry> getEntries() {
        return protocolDistControlEntry;
    }

    public ProtocolDistControlEntry createEntry(String entryIndex) {
        ProtocolDistControlEntry newEntry = new ProtocolDistControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.12.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("protocolDistControlEntry", protocolDistControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(protocolDistControlEntry).toHashCode();
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
        ProtocolDistControlTable rhs = ((ProtocolDistControlTable) obj);
        return new EqualsBuilder().append(protocolDistControlEntry, rhs.protocolDistControlEntry).isEquals();
    }

    public ProtocolDistControlTable clone() {
        ProtocolDistControlTable _copy = new ProtocolDistControlTable();
        for (Map.Entry<String, IProtocolDistControlEntry> _entry: protocolDistControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.12.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "protocolDistControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
