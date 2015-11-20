
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.ocntable.OcnEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IOcnTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.ocntable.IOcnEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OcnTable
    extends DeviceEntity
    implements Serializable, IOcnTable, ITableAccess<IOcnEntry>
{

    private Map<String, IOcnEntry> ocnEntry = new TreeMap<String, IOcnEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OcnTable() {
    }

    public Map<String, IOcnEntry> getOcnEntry() {
        return this.ocnEntry;
    }

    public IOcnEntry getEntry(String key) {
        return ocnEntry.get(key);
    }

    public void setEntry(String key, IOcnEntry value) {
        ocnEntry.put(key, value);
        ((OcnEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOcnEntry> getEntries() {
        return ocnEntry;
    }

    public OcnEntry createEntry(String entryIndex) {
        OcnEntry newEntry = new OcnEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ocnEntry", ocnEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ocnEntry).toHashCode();
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
        OcnTable rhs = ((OcnTable) obj);
        return new EqualsBuilder().append(ocnEntry, rhs.ocnEntry).isEquals();
    }

    public OcnTable clone() {
        OcnTable _copy = new OcnTable();
        for (Map.Entry<String, IOcnEntry> _entry: ocnEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ocnEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
