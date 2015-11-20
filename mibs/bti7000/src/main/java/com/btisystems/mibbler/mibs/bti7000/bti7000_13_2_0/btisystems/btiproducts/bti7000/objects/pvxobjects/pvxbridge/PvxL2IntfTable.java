
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.pvxobjects.pvxbridge;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.pvxobjects.pvxbridge.pvxl2intftable.PvxL2IntfEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.pvxobjects.pvxbridge.IPvxL2IntfTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.pvxobjects.pvxbridge.pvxl2intftable.IPvxL2IntfEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class PvxL2IntfTable
    extends DeviceEntity
    implements Serializable, IPvxL2IntfTable, ITableAccess<IPvxL2IntfEntry>
{

    private Map<String, IPvxL2IntfEntry> pvxL2IntfEntry = new TreeMap<String, IPvxL2IntfEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public PvxL2IntfTable() {
    }

    public Map<String, IPvxL2IntfEntry> getPvxL2IntfEntry() {
        return this.pvxL2IntfEntry;
    }

    public IPvxL2IntfEntry getEntry(String key) {
        return pvxL2IntfEntry.get(key);
    }

    public void setEntry(String key, IPvxL2IntfEntry value) {
        pvxL2IntfEntry.put(key, value);
        ((PvxL2IntfEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IPvxL2IntfEntry> getEntries() {
        return pvxL2IntfEntry;
    }

    public PvxL2IntfEntry createEntry(String entryIndex) {
        PvxL2IntfEntry newEntry = new PvxL2IntfEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.14.1.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("pvxL2IntfEntry", pvxL2IntfEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(pvxL2IntfEntry).toHashCode();
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
        PvxL2IntfTable rhs = ((PvxL2IntfTable) obj);
        return new EqualsBuilder().append(pvxL2IntfEntry, rhs.pvxL2IntfEntry).isEquals();
    }

    public PvxL2IntfTable clone() {
        PvxL2IntfTable _copy = new PvxL2IntfTable();
        for (Map.Entry<String, IPvxL2IntfEntry> _entry: pvxL2IntfEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.14.1.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "pvxL2IntfEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
