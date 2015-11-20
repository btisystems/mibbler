
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.ospfnbrtable.OspfNbrEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.IOspfNbrTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospfnbrtable.IOspfNbrEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OspfNbrTable
    extends DeviceEntity
    implements Serializable, IOspfNbrTable, ITableAccess<IOspfNbrEntry>
{

    private Map<String, IOspfNbrEntry> ospfNbrEntry = new TreeMap<String, IOspfNbrEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OspfNbrTable() {
    }

    public Map<String, IOspfNbrEntry> getOspfNbrEntry() {
        return this.ospfNbrEntry;
    }

    public IOspfNbrEntry getEntry(String key) {
        return ospfNbrEntry.get(key);
    }

    public void setEntry(String key, IOspfNbrEntry value) {
        ospfNbrEntry.put(key, value);
        ((OspfNbrEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOspfNbrEntry> getEntries() {
        return ospfNbrEntry;
    }

    public OspfNbrEntry createEntry(String entryIndex) {
        OspfNbrEntry newEntry = new OspfNbrEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.13.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ospfNbrEntry", ospfNbrEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ospfNbrEntry).toHashCode();
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
        OspfNbrTable rhs = ((OspfNbrTable) obj);
        return new EqualsBuilder().append(ospfNbrEntry, rhs.ospfNbrEntry).isEquals();
    }

    public OspfNbrTable clone() {
        OspfNbrTable _copy = new OspfNbrTable();
        for (Map.Entry<String, IOspfNbrEntry> _entry: ospfNbrEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.13.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ospfNbrEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
