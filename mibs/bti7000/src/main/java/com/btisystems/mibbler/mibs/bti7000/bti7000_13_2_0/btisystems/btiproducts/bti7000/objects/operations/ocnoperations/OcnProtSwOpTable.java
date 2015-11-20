
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.ocnoperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.ocnprotswoptable.OcnProtSwOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.IOcnProtSwOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.ocnprotswoptable.IOcnProtSwOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OcnProtSwOpTable
    extends DeviceEntity
    implements Serializable, IOcnProtSwOpTable, ITableAccess<IOcnProtSwOpEntry>
{

    private Map<String, IOcnProtSwOpEntry> ocnProtSwOpEntry = new TreeMap<String, IOcnProtSwOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OcnProtSwOpTable() {
    }

    public Map<String, IOcnProtSwOpEntry> getOcnProtSwOpEntry() {
        return this.ocnProtSwOpEntry;
    }

    public IOcnProtSwOpEntry getEntry(String key) {
        return ocnProtSwOpEntry.get(key);
    }

    public void setEntry(String key, IOcnProtSwOpEntry value) {
        ocnProtSwOpEntry.put(key, value);
        ((OcnProtSwOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOcnProtSwOpEntry> getEntries() {
        return ocnProtSwOpEntry;
    }

    public OcnProtSwOpEntry createEntry(String entryIndex) {
        OcnProtSwOpEntry newEntry = new OcnProtSwOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.12.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ocnProtSwOpEntry", ocnProtSwOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ocnProtSwOpEntry).toHashCode();
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
        OcnProtSwOpTable rhs = ((OcnProtSwOpTable) obj);
        return new EqualsBuilder().append(ocnProtSwOpEntry, rhs.ocnProtSwOpEntry).isEquals();
    }

    public OcnProtSwOpTable clone() {
        OcnProtSwOpTable _copy = new OcnProtSwOpTable();
        for (Map.Entry<String, IOcnProtSwOpEntry> _entry: ocnProtSwOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.12.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ocnProtSwOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
