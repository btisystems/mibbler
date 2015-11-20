
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ifmib.ifmibobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ifmib.ifmibobjects.IIfRcvAddressTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ifmib.ifmibobjects.ifrcvaddresstable.IIfRcvAddressEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ifmib.ifmibobjects.ifrcvaddresstable.IfRcvAddressEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class IfRcvAddressTable
    extends DeviceEntity
    implements Serializable, IIfRcvAddressTable, ITableAccess<IIfRcvAddressEntry>
{

    private Map<String, IIfRcvAddressEntry> ifRcvAddressEntry = new TreeMap<String, IIfRcvAddressEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfRcvAddressTable() {
    }

    public Map<String, IIfRcvAddressEntry> getIfRcvAddressEntry() {
        return this.ifRcvAddressEntry;
    }

    public IIfRcvAddressEntry getEntry(String key) {
        return ifRcvAddressEntry.get(key);
    }

    public void setEntry(String key, IIfRcvAddressEntry value) {
        ifRcvAddressEntry.put(key, value);
        ((IfRcvAddressEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IIfRcvAddressEntry> getEntries() {
        return ifRcvAddressEntry;
    }

    public IfRcvAddressEntry createEntry(String entryIndex) {
        IfRcvAddressEntry newEntry = new IfRcvAddressEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.31.1.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifRcvAddressEntry", ifRcvAddressEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifRcvAddressEntry).toHashCode();
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
        IfRcvAddressTable rhs = ((IfRcvAddressTable) obj);
        return new EqualsBuilder().append(ifRcvAddressEntry, rhs.ifRcvAddressEntry).isEquals();
    }

    public IfRcvAddressTable clone() {
        IfRcvAddressTable _copy = new IfRcvAddressTable();
        for (Map.Entry<String, IIfRcvAddressEntry> _entry: ifRcvAddressEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.31.1.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifRcvAddressEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
