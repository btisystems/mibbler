
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.ospfiftable.OspfIfEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.IOspfIfTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospfiftable.IOspfIfEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OspfIfTable
    extends DeviceEntity
    implements Serializable, IOspfIfTable, ITableAccess<IOspfIfEntry>
{

    private Map<String, IOspfIfEntry> ospfIfEntry = new TreeMap<String, IOspfIfEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OspfIfTable() {
    }

    public Map<String, IOspfIfEntry> getOspfIfEntry() {
        return this.ospfIfEntry;
    }

    public IOspfIfEntry getEntry(String key) {
        return ospfIfEntry.get(key);
    }

    public void setEntry(String key, IOspfIfEntry value) {
        ospfIfEntry.put(key, value);
        ((OspfIfEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOspfIfEntry> getEntries() {
        return ospfIfEntry;
    }

    public OspfIfEntry createEntry(String entryIndex) {
        OspfIfEntry newEntry = new OspfIfEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.13.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ospfIfEntry", ospfIfEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ospfIfEntry).toHashCode();
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
        OspfIfTable rhs = ((OspfIfTable) obj);
        return new EqualsBuilder().append(ospfIfEntry, rhs.ospfIfEntry).isEquals();
    }

    public OspfIfTable clone() {
        OspfIfTable _copy = new OspfIfTable();
        for (Map.Entry<String, IOspfIfEntry> _entry: ospfIfEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.13.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ospfIfEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
