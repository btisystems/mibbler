
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.ospflsdbtable.OspfLsdbEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.IOspfLsdbTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospflsdbtable.IOspfLsdbEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OspfLsdbTable
    extends DeviceEntity
    implements Serializable, IOspfLsdbTable, ITableAccess<IOspfLsdbEntry>
{

    private Map<String, IOspfLsdbEntry> ospfLsdbEntry = new TreeMap<String, IOspfLsdbEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OspfLsdbTable() {
    }

    public Map<String, IOspfLsdbEntry> getOspfLsdbEntry() {
        return this.ospfLsdbEntry;
    }

    public IOspfLsdbEntry getEntry(String key) {
        return ospfLsdbEntry.get(key);
    }

    public void setEntry(String key, IOspfLsdbEntry value) {
        ospfLsdbEntry.put(key, value);
        ((OspfLsdbEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOspfLsdbEntry> getEntries() {
        return ospfLsdbEntry;
    }

    public OspfLsdbEntry createEntry(String entryIndex) {
        OspfLsdbEntry newEntry = new OspfLsdbEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.13.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ospfLsdbEntry", ospfLsdbEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ospfLsdbEntry).toHashCode();
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
        OspfLsdbTable rhs = ((OspfLsdbTable) obj);
        return new EqualsBuilder().append(ospfLsdbEntry, rhs.ospfLsdbEntry).isEquals();
    }

    public OspfLsdbTable clone() {
        OspfLsdbTable _copy = new OspfLsdbTable();
        for (Map.Entry<String, IOspfLsdbEntry> _entry: ospfLsdbEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.13.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ospfLsdbEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
