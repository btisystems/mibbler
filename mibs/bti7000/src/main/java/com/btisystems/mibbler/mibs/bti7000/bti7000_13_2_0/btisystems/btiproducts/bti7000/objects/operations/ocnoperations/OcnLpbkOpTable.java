
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.ocnoperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.ocnlpbkoptable.OcnLpbkOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.IOcnLpbkOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.ocnoperations.ocnlpbkoptable.IOcnLpbkOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OcnLpbkOpTable
    extends DeviceEntity
    implements Serializable, IOcnLpbkOpTable, ITableAccess<IOcnLpbkOpEntry>
{

    private Map<String, IOcnLpbkOpEntry> ocnLpbkOpEntry = new TreeMap<String, IOcnLpbkOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OcnLpbkOpTable() {
    }

    public Map<String, IOcnLpbkOpEntry> getOcnLpbkOpEntry() {
        return this.ocnLpbkOpEntry;
    }

    public IOcnLpbkOpEntry getEntry(String key) {
        return ocnLpbkOpEntry.get(key);
    }

    public void setEntry(String key, IOcnLpbkOpEntry value) {
        ocnLpbkOpEntry.put(key, value);
        ((OcnLpbkOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOcnLpbkOpEntry> getEntries() {
        return ocnLpbkOpEntry;
    }

    public OcnLpbkOpEntry createEntry(String entryIndex) {
        OcnLpbkOpEntry newEntry = new OcnLpbkOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.12.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ocnLpbkOpEntry", ocnLpbkOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ocnLpbkOpEntry).toHashCode();
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
        OcnLpbkOpTable rhs = ((OcnLpbkOpTable) obj);
        return new EqualsBuilder().append(ocnLpbkOpEntry, rhs.ocnLpbkOpEntry).isEquals();
    }

    public OcnLpbkOpTable clone() {
        OcnLpbkOpTable _copy = new OcnLpbkOpTable();
        for (Map.Entry<String, IOcnLpbkOpEntry> _entry: ocnLpbkOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.12.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ocnLpbkOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
