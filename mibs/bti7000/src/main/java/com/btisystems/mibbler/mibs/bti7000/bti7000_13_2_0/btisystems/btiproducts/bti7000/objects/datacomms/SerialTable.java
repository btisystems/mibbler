
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.serialtable.SerialEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.ISerialTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.serialtable.ISerialEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class SerialTable
    extends DeviceEntity
    implements Serializable, ISerialTable, ITableAccess<ISerialEntry>
{

    private Map<String, ISerialEntry> serialEntry = new TreeMap<String, ISerialEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SerialTable() {
    }

    public Map<String, ISerialEntry> getSerialEntry() {
        return this.serialEntry;
    }

    public ISerialEntry getEntry(String key) {
        return serialEntry.get(key);
    }

    public void setEntry(String key, ISerialEntry value) {
        serialEntry.put(key, value);
        ((SerialEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ISerialEntry> getEntries() {
        return serialEntry;
    }

    public SerialEntry createEntry(String entryIndex) {
        SerialEntry newEntry = new SerialEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.5.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("serialEntry", serialEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(serialEntry).toHashCode();
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
        SerialTable rhs = ((SerialTable) obj);
        return new EqualsBuilder().append(serialEntry, rhs.serialEntry).isEquals();
    }

    public SerialTable clone() {
        SerialTable _copy = new SerialTable();
        for (Map.Entry<String, ISerialEntry> _entry: serialEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.5.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "serialEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
