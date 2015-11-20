
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.datacommsoperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.datacommsoperations.datacommspingtable.DataCommsPingEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.datacommsoperations.IDataCommsPingTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.datacommsoperations.datacommspingtable.IDataCommsPingEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class DataCommsPingTable
    extends DeviceEntity
    implements Serializable, IDataCommsPingTable, ITableAccess<IDataCommsPingEntry>
{

    private Map<String, IDataCommsPingEntry> dataCommsPingEntry = new TreeMap<String, IDataCommsPingEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public DataCommsPingTable() {
    }

    public Map<String, IDataCommsPingEntry> getDataCommsPingEntry() {
        return this.dataCommsPingEntry;
    }

    public IDataCommsPingEntry getEntry(String key) {
        return dataCommsPingEntry.get(key);
    }

    public void setEntry(String key, IDataCommsPingEntry value) {
        dataCommsPingEntry.put(key, value);
        ((DataCommsPingEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IDataCommsPingEntry> getEntries() {
        return dataCommsPingEntry;
    }

    public DataCommsPingEntry createEntry(String entryIndex) {
        DataCommsPingEntry newEntry = new DataCommsPingEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.7.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dataCommsPingEntry", dataCommsPingEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dataCommsPingEntry).toHashCode();
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
        DataCommsPingTable rhs = ((DataCommsPingTable) obj);
        return new EqualsBuilder().append(dataCommsPingEntry, rhs.dataCommsPingEntry).isEquals();
    }

    public DataCommsPingTable clone() {
        DataCommsPingTable _copy = new DataCommsPingTable();
        for (Map.Entry<String, IDataCommsPingEntry> _entry: dataCommsPingEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.7.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dataCommsPingEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
