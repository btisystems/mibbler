
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.ipextinterfacetable.IpExtInterfaceTableEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.IIpExtInterfaceTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.ipextinterfacetable.IIpExtInterfaceTableEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IpExtInterfaceTable
    extends DeviceEntity
    implements Serializable, IIpExtInterfaceTable, ITableAccess<IIpExtInterfaceTableEntry>
{

    private Map<String, IIpExtInterfaceTableEntry> ipExtInterfaceTableEntry = new TreeMap<String, IIpExtInterfaceTableEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpExtInterfaceTable() {
    }

    public Map<String, IIpExtInterfaceTableEntry> getIpExtInterfaceTableEntry() {
        return this.ipExtInterfaceTableEntry;
    }

    public IIpExtInterfaceTableEntry getEntry(String key) {
        return ipExtInterfaceTableEntry.get(key);
    }

    public void setEntry(String key, IIpExtInterfaceTableEntry value) {
        ipExtInterfaceTableEntry.put(key, value);
        ((IpExtInterfaceTableEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIpExtInterfaceTableEntry> getEntries() {
        return ipExtInterfaceTableEntry;
    }

    public IpExtInterfaceTableEntry createEntry(String entryIndex) {
        IpExtInterfaceTableEntry newEntry = new IpExtInterfaceTableEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.5.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipExtInterfaceTableEntry", ipExtInterfaceTableEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipExtInterfaceTableEntry).toHashCode();
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
        IpExtInterfaceTable rhs = ((IpExtInterfaceTable) obj);
        return new EqualsBuilder().append(ipExtInterfaceTableEntry, rhs.ipExtInterfaceTableEntry).isEquals();
    }

    public IpExtInterfaceTable clone() {
        IpExtInterfaceTable _copy = new IpExtInterfaceTable();
        for (Map.Entry<String, IIpExtInterfaceTableEntry> _entry: ipExtInterfaceTableEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.5.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipExtInterfaceTableEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
