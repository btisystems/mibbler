
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.oaoperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.oaoperations.oaoobrsdoptable.OaOOBRSDOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.oaoperations.IOaOOBRSDOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.oaoperations.oaoobrsdoptable.IOaOOBRSDOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OaOOBRSDOpTable
    extends DeviceEntity
    implements Serializable, IOaOOBRSDOpTable, ITableAccess<IOaOOBRSDOpEntry>
{

    private Map<String, IOaOOBRSDOpEntry> oaOOBRSDOpEntry = new TreeMap<String, IOaOOBRSDOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OaOOBRSDOpTable() {
    }

    public Map<String, IOaOOBRSDOpEntry> getOaOOBRSDOpEntry() {
        return this.oaOOBRSDOpEntry;
    }

    public IOaOOBRSDOpEntry getEntry(String key) {
        return oaOOBRSDOpEntry.get(key);
    }

    public void setEntry(String key, IOaOOBRSDOpEntry value) {
        oaOOBRSDOpEntry.put(key, value);
        ((OaOOBRSDOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOaOOBRSDOpEntry> getEntries() {
        return oaOOBRSDOpEntry;
    }

    public OaOOBRSDOpEntry createEntry(String entryIndex) {
        OaOOBRSDOpEntry newEntry = new OaOOBRSDOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.6.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("oaOOBRSDOpEntry", oaOOBRSDOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(oaOOBRSDOpEntry).toHashCode();
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
        OaOOBRSDOpTable rhs = ((OaOOBRSDOpTable) obj);
        return new EqualsBuilder().append(oaOOBRSDOpEntry, rhs.oaOOBRSDOpEntry).isEquals();
    }

    public OaOOBRSDOpTable clone() {
        OaOOBRSDOpTable _copy = new OaOOBRSDOpTable();
        for (Map.Entry<String, IOaOOBRSDOpEntry> _entry: oaOOBRSDOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "oaOOBRSDOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
