
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.netmgmttable.NetMgmtEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.INetMgmtTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.netmgmttable.INetMgmtEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NetMgmtTable
    extends DeviceEntity
    implements Serializable, INetMgmtTable, ITableAccess<INetMgmtEntry>
{

    private Map<String, INetMgmtEntry> netMgmtEntry = new TreeMap<String, INetMgmtEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NetMgmtTable() {
    }

    public Map<String, INetMgmtEntry> getNetMgmtEntry() {
        return this.netMgmtEntry;
    }

    public INetMgmtEntry getEntry(String key) {
        return netMgmtEntry.get(key);
    }

    public void setEntry(String key, INetMgmtEntry value) {
        netMgmtEntry.put(key, value);
        ((NetMgmtEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, INetMgmtEntry> getEntries() {
        return netMgmtEntry;
    }

    public NetMgmtEntry createEntry(String entryIndex) {
        NetMgmtEntry newEntry = new NetMgmtEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.5.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("netMgmtEntry", netMgmtEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(netMgmtEntry).toHashCode();
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
        NetMgmtTable rhs = ((NetMgmtTable) obj);
        return new EqualsBuilder().append(netMgmtEntry, rhs.netMgmtEntry).isEquals();
    }

    public NetMgmtTable clone() {
        NetMgmtTable _copy = new NetMgmtTable();
        for (Map.Entry<String, INetMgmtEntry> _entry: netMgmtEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.5.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "netMgmtEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
