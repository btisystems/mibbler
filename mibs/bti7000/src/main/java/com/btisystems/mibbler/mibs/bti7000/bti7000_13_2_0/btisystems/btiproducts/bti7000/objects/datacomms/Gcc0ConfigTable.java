
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.gcc0configtable.Gcc0ConfigEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.IGcc0ConfigTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.gcc0configtable.IGcc0ConfigEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Gcc0ConfigTable
    extends DeviceEntity
    implements Serializable, IGcc0ConfigTable, ITableAccess<IGcc0ConfigEntry>
{

    private Map<String, IGcc0ConfigEntry> gcc0ConfigEntry = new TreeMap<String, IGcc0ConfigEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Gcc0ConfigTable() {
    }

    public Map<String, IGcc0ConfigEntry> getGcc0ConfigEntry() {
        return this.gcc0ConfigEntry;
    }

    public IGcc0ConfigEntry getEntry(String key) {
        return gcc0ConfigEntry.get(key);
    }

    public void setEntry(String key, IGcc0ConfigEntry value) {
        gcc0ConfigEntry.put(key, value);
        ((Gcc0ConfigEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IGcc0ConfigEntry> getEntries() {
        return gcc0ConfigEntry;
    }

    public Gcc0ConfigEntry createEntry(String entryIndex) {
        Gcc0ConfigEntry newEntry = new Gcc0ConfigEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.5.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("gcc0ConfigEntry", gcc0ConfigEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(gcc0ConfigEntry).toHashCode();
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
        Gcc0ConfigTable rhs = ((Gcc0ConfigTable) obj);
        return new EqualsBuilder().append(gcc0ConfigEntry, rhs.gcc0ConfigEntry).isEquals();
    }

    public Gcc0ConfigTable clone() {
        Gcc0ConfigTable _copy = new Gcc0ConfigTable();
        for (Map.Entry<String, IGcc0ConfigEntry> _entry: gcc0ConfigEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.5.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "gcc0ConfigEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
