
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.IIpNetToPhysicalTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipnettophysicaltable.IIpNetToPhysicalEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipnettophysicaltable.IpNetToPhysicalEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IpNetToPhysicalTable
    extends DeviceEntity
    implements Serializable, IIpNetToPhysicalTable, ITableAccess<IIpNetToPhysicalEntry>
{

    private Map<String, IIpNetToPhysicalEntry> ipNetToPhysicalEntry = new TreeMap<String, IIpNetToPhysicalEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpNetToPhysicalTable() {
    }

    public Map<String, IIpNetToPhysicalEntry> getIpNetToPhysicalEntry() {
        return this.ipNetToPhysicalEntry;
    }

    public IIpNetToPhysicalEntry getEntry(String key) {
        return ipNetToPhysicalEntry.get(key);
    }

    public void setEntry(String key, IIpNetToPhysicalEntry value) {
        ipNetToPhysicalEntry.put(key, value);
        ((IpNetToPhysicalEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpNetToPhysicalEntry> getEntries() {
        return ipNetToPhysicalEntry;
    }

    public IpNetToPhysicalEntry createEntry(String entryIndex) {
        IpNetToPhysicalEntry newEntry = new IpNetToPhysicalEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.35.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipNetToPhysicalEntry", ipNetToPhysicalEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipNetToPhysicalEntry).toHashCode();
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
        IpNetToPhysicalTable rhs = ((IpNetToPhysicalTable) obj);
        return new EqualsBuilder().append(ipNetToPhysicalEntry, rhs.ipNetToPhysicalEntry).isEquals();
    }

    public IpNetToPhysicalTable clone() {
        IpNetToPhysicalTable _copy = new IpNetToPhysicalTable();
        for (Map.Entry<String, IIpNetToPhysicalEntry> _entry: ipNetToPhysicalEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.35"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipNetToPhysicalEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
