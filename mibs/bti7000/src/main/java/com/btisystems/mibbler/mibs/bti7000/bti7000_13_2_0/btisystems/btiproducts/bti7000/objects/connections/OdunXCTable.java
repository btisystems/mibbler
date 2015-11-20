
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.odunxctable.OdunXCEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.IOdunXCTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.odunxctable.IOdunXCEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OdunXCTable
    extends DeviceEntity
    implements Serializable, IOdunXCTable, ITableAccess<IOdunXCEntry>
{

    private Map<String, IOdunXCEntry> odunXCEntry = new TreeMap<String, IOdunXCEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OdunXCTable() {
    }

    public Map<String, IOdunXCEntry> getOdunXCEntry() {
        return this.odunXCEntry;
    }

    public IOdunXCEntry getEntry(String key) {
        return odunXCEntry.get(key);
    }

    public void setEntry(String key, IOdunXCEntry value) {
        odunXCEntry.put(key, value);
        ((OdunXCEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOdunXCEntry> getEntries() {
        return odunXCEntry;
    }

    public OdunXCEntry createEntry(String entryIndex) {
        OdunXCEntry newEntry = new OdunXCEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.9.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("odunXCEntry", odunXCEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(odunXCEntry).toHashCode();
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
        OdunXCTable rhs = ((OdunXCTable) obj);
        return new EqualsBuilder().append(odunXCEntry, rhs.odunXCEntry).isEquals();
    }

    public OdunXCTable clone() {
        OdunXCTable _copy = new OdunXCTable();
        for (Map.Entry<String, IOdunXCEntry> _entry: odunXCEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.9.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "odunXCEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
