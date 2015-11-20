
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6icmpmib.ipv6icmpmibobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6icmpmib.ipv6icmpmibobjects.IIpv6IfIcmpTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6icmpmib.ipv6icmpmibobjects.ipv6ificmptable.IIpv6IfIcmpEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6icmpmib.ipv6icmpmibobjects.ipv6ificmptable.Ipv6IfIcmpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6IfIcmpTable
    extends DeviceEntity
    implements Serializable, IIpv6IfIcmpTable, ITableAccess<IIpv6IfIcmpEntry>
{

    private Map<String, IIpv6IfIcmpEntry> ipv6IfIcmpEntry = new TreeMap<String, IIpv6IfIcmpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6IfIcmpTable() {
    }

    public Map<String, IIpv6IfIcmpEntry> getIpv6IfIcmpEntry() {
        return this.ipv6IfIcmpEntry;
    }

    public IIpv6IfIcmpEntry getEntry(String key) {
        return ipv6IfIcmpEntry.get(key);
    }

    public void setEntry(String key, IIpv6IfIcmpEntry value) {
        ipv6IfIcmpEntry.put(key, value);
        ((Ipv6IfIcmpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpv6IfIcmpEntry> getEntries() {
        return ipv6IfIcmpEntry;
    }

    public Ipv6IfIcmpEntry createEntry(String entryIndex) {
        Ipv6IfIcmpEntry newEntry = new Ipv6IfIcmpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.56.1.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6IfIcmpEntry", ipv6IfIcmpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6IfIcmpEntry).toHashCode();
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
        Ipv6IfIcmpTable rhs = ((Ipv6IfIcmpTable) obj);
        return new EqualsBuilder().append(ipv6IfIcmpEntry, rhs.ipv6IfIcmpEntry).isEquals();
    }

    public Ipv6IfIcmpTable clone() {
        Ipv6IfIcmpTable _copy = new Ipv6IfIcmpTable();
        for (Map.Entry<String, IIpv6IfIcmpEntry> _entry: ipv6IfIcmpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.56.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6IfIcmpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
