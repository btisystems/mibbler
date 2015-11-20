
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.brioperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.brioperations.brilpbkoptable.BriLpbkOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.brioperations.IBriLpbkOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.brioperations.brilpbkoptable.IBriLpbkOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class BriLpbkOpTable
    extends DeviceEntity
    implements Serializable, IBriLpbkOpTable, ITableAccess<IBriLpbkOpEntry>
{

    private Map<String, IBriLpbkOpEntry> briLpbkOpEntry = new TreeMap<String, IBriLpbkOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public BriLpbkOpTable() {
    }

    public Map<String, IBriLpbkOpEntry> getBriLpbkOpEntry() {
        return this.briLpbkOpEntry;
    }

    public IBriLpbkOpEntry getEntry(String key) {
        return briLpbkOpEntry.get(key);
    }

    public void setEntry(String key, IBriLpbkOpEntry value) {
        briLpbkOpEntry.put(key, value);
        ((BriLpbkOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IBriLpbkOpEntry> getEntries() {
        return briLpbkOpEntry;
    }

    public BriLpbkOpEntry createEntry(String entryIndex) {
        BriLpbkOpEntry newEntry = new BriLpbkOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.18.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("briLpbkOpEntry", briLpbkOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(briLpbkOpEntry).toHashCode();
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
        BriLpbkOpTable rhs = ((BriLpbkOpTable) obj);
        return new EqualsBuilder().append(briLpbkOpEntry, rhs.briLpbkOpEntry).isEquals();
    }

    public BriLpbkOpTable clone() {
        BriLpbkOpTable _copy = new BriLpbkOpTable();
        for (Map.Entry<String, IBriLpbkOpEntry> _entry: briLpbkOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.18.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "briLpbkOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
