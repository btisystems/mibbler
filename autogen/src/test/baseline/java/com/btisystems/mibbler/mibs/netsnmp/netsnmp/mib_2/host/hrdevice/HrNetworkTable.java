
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.IHrNetworkTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrnetworktable.IHrNetworkEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrnetworktable.HrNetworkEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HrNetworkTable
    extends DeviceEntity
    implements Serializable, IHrNetworkTable, ITableAccess<IHrNetworkEntry>
{

    private Map<String, IHrNetworkEntry> hrNetworkEntry = new TreeMap<String, IHrNetworkEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrNetworkTable() {
    }

    public Map<String, IHrNetworkEntry> getHrNetworkEntry() {
        return this.hrNetworkEntry;
    }

    public IHrNetworkEntry getEntry(String key) {
        return hrNetworkEntry.get(key);
    }

    public void setEntry(String key, IHrNetworkEntry value) {
        hrNetworkEntry.put(key, value);
        ((HrNetworkEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHrNetworkEntry> getEntries() {
        return hrNetworkEntry;
    }

    public HrNetworkEntry createEntry(String entryIndex) {
        HrNetworkEntry newEntry = new HrNetworkEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.25.3.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrNetworkEntry", hrNetworkEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrNetworkEntry).toHashCode();
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
        HrNetworkTable rhs = ((HrNetworkTable) obj);
        return new EqualsBuilder().append(hrNetworkEntry, rhs.hrNetworkEntry).isEquals();
    }

    public HrNetworkTable clone() {
        HrNetworkTable _copy = new HrNetworkTable();
        for (Map.Entry<String, IHrNetworkEntry> _entry: hrNetworkEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrNetworkEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
