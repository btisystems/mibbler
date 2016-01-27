
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.ifmibobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects.IIfXTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects.ifxtable.IIfXEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.ifmibobjects.ifxtable.IfXEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IfXTable
    extends DeviceEntity
    implements Serializable, IIfXTable, ITableAccess<IIfXEntry>
{

    private Map<String, IIfXEntry> ifXEntry = new TreeMap<String, IIfXEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfXTable() {
    }

    public Map<String, IIfXEntry> getIfXEntry() {
        return this.ifXEntry;
    }

    public IIfXEntry getEntry(String key) {
        return ifXEntry.get(key);
    }

    public void setEntry(String key, IIfXEntry value) {
        ifXEntry.put(key, value);
        ((IfXEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIfXEntry> getEntries() {
        return ifXEntry;
    }

    public IfXEntry createEntry(String entryIndex) {
        IfXEntry newEntry = new IfXEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.31.1.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifXEntry", ifXEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifXEntry).toHashCode();
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
        IfXTable rhs = ((IfXTable) obj);
        return new EqualsBuilder().append(ifXEntry, rhs.ifXEntry).isEquals();
    }

    public IfXTable clone() {
        IfXTable _copy = new IfXTable();
        for (Map.Entry<String, IIfXEntry> _entry: ifXEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.31.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifXEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
