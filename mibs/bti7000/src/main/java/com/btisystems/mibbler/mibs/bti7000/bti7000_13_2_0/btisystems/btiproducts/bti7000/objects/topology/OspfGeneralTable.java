
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.ospfgeneraltable.OspfGeneralGroupEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.IOspfGeneralTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospfgeneraltable.IOspfGeneralGroupEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OspfGeneralTable
    extends DeviceEntity
    implements Serializable, IOspfGeneralTable, ITableAccess<IOspfGeneralGroupEntry>
{

    private Map<String, IOspfGeneralGroupEntry> ospfGeneralGroupEntry = new TreeMap<String, IOspfGeneralGroupEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OspfGeneralTable() {
    }

    public Map<String, IOspfGeneralGroupEntry> getOspfGeneralGroupEntry() {
        return this.ospfGeneralGroupEntry;
    }

    public IOspfGeneralGroupEntry getEntry(String key) {
        return ospfGeneralGroupEntry.get(key);
    }

    public void setEntry(String key, IOspfGeneralGroupEntry value) {
        ospfGeneralGroupEntry.put(key, value);
        ((OspfGeneralGroupEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOspfGeneralGroupEntry> getEntries() {
        return ospfGeneralGroupEntry;
    }

    public OspfGeneralGroupEntry createEntry(String entryIndex) {
        OspfGeneralGroupEntry newEntry = new OspfGeneralGroupEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.13.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ospfGeneralGroupEntry", ospfGeneralGroupEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ospfGeneralGroupEntry).toHashCode();
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
        OspfGeneralTable rhs = ((OspfGeneralTable) obj);
        return new EqualsBuilder().append(ospfGeneralGroupEntry, rhs.ospfGeneralGroupEntry).isEquals();
    }

    public OspfGeneralTable clone() {
        OspfGeneralTable _copy = new OspfGeneralTable();
        for (Map.Entry<String, IOspfGeneralGroupEntry> _entry: ospfGeneralGroupEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.13.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ospfGeneralGroupEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
