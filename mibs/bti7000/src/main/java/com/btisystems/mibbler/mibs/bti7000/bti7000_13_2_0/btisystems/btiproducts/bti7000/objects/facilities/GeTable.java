
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.getable.GeEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IGeTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.getable.IGeEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class GeTable
    extends DeviceEntity
    implements Serializable, IGeTable, ITableAccess<IGeEntry>
{

    private Map<String, IGeEntry> geEntry = new TreeMap<String, IGeEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public GeTable() {
    }

    public Map<String, IGeEntry> getGeEntry() {
        return this.geEntry;
    }

    public IGeEntry getEntry(String key) {
        return geEntry.get(key);
    }

    public void setEntry(String key, IGeEntry value) {
        geEntry.put(key, value);
        ((GeEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IGeEntry> getEntries() {
        return geEntry;
    }

    public GeEntry createEntry(String entryIndex) {
        GeEntry newEntry = new GeEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.9.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("geEntry", geEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(geEntry).toHashCode();
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
        GeTable rhs = ((GeTable) obj);
        return new EqualsBuilder().append(geEntry, rhs.geEntry).isEquals();
    }

    public GeTable clone() {
        GeTable _copy = new GeTable();
        for (Map.Entry<String, IGeEntry> _entry: geEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.9"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "geEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
