
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ip;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ip.IIpNetToMediaTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ip.ipnettomediatable.IIpNetToMediaEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ip.ipnettomediatable.IpNetToMediaEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IpNetToMediaTable
    extends DeviceEntity
    implements Serializable, IIpNetToMediaTable, ITableAccess<IIpNetToMediaEntry>
{

    private Map<String, IIpNetToMediaEntry> ipNetToMediaEntry = new TreeMap<String, IIpNetToMediaEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpNetToMediaTable() {
    }

    public Map<String, IIpNetToMediaEntry> getIpNetToMediaEntry() {
        return this.ipNetToMediaEntry;
    }

    public IIpNetToMediaEntry getEntry(String key) {
        return ipNetToMediaEntry.get(key);
    }

    public void setEntry(String key, IIpNetToMediaEntry value) {
        ipNetToMediaEntry.put(key, value);
        ((IpNetToMediaEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpNetToMediaEntry> getEntries() {
        return ipNetToMediaEntry;
    }

    public IpNetToMediaEntry createEntry(String entryIndex) {
        IpNetToMediaEntry newEntry = new IpNetToMediaEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.4.22.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipNetToMediaEntry", ipNetToMediaEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipNetToMediaEntry).toHashCode();
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
        IpNetToMediaTable rhs = ((IpNetToMediaTable) obj);
        return new EqualsBuilder().append(ipNetToMediaEntry, rhs.ipNetToMediaEntry).isEquals();
    }

    public IpNetToMediaTable clone() {
        IpNetToMediaTable _copy = new IpNetToMediaTable();
        for (Map.Entry<String, IIpNetToMediaEntry> _entry: ipNetToMediaEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.22"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipNetToMediaEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
