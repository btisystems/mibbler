
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.protection;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.protection.ocnprotgrptable.OcnProtGrpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.IOcnProtGrpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.ocnprotgrptable.IOcnProtGrpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OcnProtGrpTable
    extends DeviceEntity
    implements Serializable, IOcnProtGrpTable, ITableAccess<IOcnProtGrpEntry>
{

    private Map<String, IOcnProtGrpEntry> ocnProtGrpEntry = new TreeMap<String, IOcnProtGrpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OcnProtGrpTable() {
    }

    public Map<String, IOcnProtGrpEntry> getOcnProtGrpEntry() {
        return this.ocnProtGrpEntry;
    }

    public IOcnProtGrpEntry getEntry(String key) {
        return ocnProtGrpEntry.get(key);
    }

    public void setEntry(String key, IOcnProtGrpEntry value) {
        ocnProtGrpEntry.put(key, value);
        ((OcnProtGrpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOcnProtGrpEntry> getEntries() {
        return ocnProtGrpEntry;
    }

    public OcnProtGrpEntry createEntry(String entryIndex) {
        OcnProtGrpEntry newEntry = new OcnProtGrpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.10.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ocnProtGrpEntry", ocnProtGrpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ocnProtGrpEntry).toHashCode();
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
        OcnProtGrpTable rhs = ((OcnProtGrpTable) obj);
        return new EqualsBuilder().append(ocnProtGrpEntry, rhs.ocnProtGrpEntry).isEquals();
    }

    public OcnProtGrpTable clone() {
        OcnProtGrpTable _copy = new OcnProtGrpTable();
        for (Map.Entry<String, IOcnProtGrpEntry> _entry: ocnProtGrpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.10.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ocnProtGrpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
