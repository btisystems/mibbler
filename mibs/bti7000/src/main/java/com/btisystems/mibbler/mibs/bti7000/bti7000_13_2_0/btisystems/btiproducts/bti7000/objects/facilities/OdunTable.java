
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.oduntable.OdunEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IOdunTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.oduntable.IOdunEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OdunTable
    extends DeviceEntity
    implements Serializable, IOdunTable, ITableAccess<IOdunEntry>
{

    private Map<String, IOdunEntry> odunEntry = new TreeMap<String, IOdunEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OdunTable() {
    }

    public Map<String, IOdunEntry> getOdunEntry() {
        return this.odunEntry;
    }

    public IOdunEntry getEntry(String key) {
        return odunEntry.get(key);
    }

    public void setEntry(String key, IOdunEntry value) {
        odunEntry.put(key, value);
        ((OdunEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOdunEntry> getEntries() {
        return odunEntry;
    }

    public OdunEntry createEntry(String entryIndex) {
        OdunEntry newEntry = new OdunEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.15.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("odunEntry", odunEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(odunEntry).toHashCode();
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
        OdunTable rhs = ((OdunTable) obj);
        return new EqualsBuilder().append(odunEntry, rhs.odunEntry).isEquals();
    }

    public OdunTable clone() {
        OdunTable _copy = new OdunTable();
        for (Map.Entry<String, IOdunEntry> _entry: odunEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.15"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "odunEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
