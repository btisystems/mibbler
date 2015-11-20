
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ip.ipforward;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ip.ipforward.IIpForwardTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ip.ipforward.ipforwardtable.IIpForwardEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ip.ipforward.ipforwardtable.IpForwardEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IpForwardTable
    extends DeviceEntity
    implements Serializable, IIpForwardTable, ITableAccess<IIpForwardEntry>
{

    private Map<String, IIpForwardEntry> ipForwardEntry = new TreeMap<String, IIpForwardEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpForwardTable() {
    }

    public Map<String, IIpForwardEntry> getIpForwardEntry() {
        return this.ipForwardEntry;
    }

    public IIpForwardEntry getEntry(String key) {
        return ipForwardEntry.get(key);
    }

    public void setEntry(String key, IIpForwardEntry value) {
        ipForwardEntry.put(key, value);
        ((IpForwardEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpForwardEntry> getEntries() {
        return ipForwardEntry;
    }

    public IpForwardEntry createEntry(String entryIndex) {
        IpForwardEntry newEntry = new IpForwardEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.24.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipForwardEntry", ipForwardEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipForwardEntry).toHashCode();
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
        IpForwardTable rhs = ((IpForwardTable) obj);
        return new EqualsBuilder().append(ipForwardEntry, rhs.ipForwardEntry).isEquals();
    }

    public IpForwardTable clone() {
        IpForwardTable _copy = new IpForwardTable();
        for (Map.Entry<String, IIpForwardEntry> _entry: ipForwardEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.24.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipForwardEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
