
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.geoperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.geoperations.gelpbkoptable.GeLpbkOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.geoperations.IGeLpbkOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.geoperations.gelpbkoptable.IGeLpbkOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class GeLpbkOpTable
    extends DeviceEntity
    implements Serializable, IGeLpbkOpTable, ITableAccess<IGeLpbkOpEntry>
{

    private Map<String, IGeLpbkOpEntry> geLpbkOpEntry = new TreeMap<String, IGeLpbkOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public GeLpbkOpTable() {
    }

    public Map<String, IGeLpbkOpEntry> getGeLpbkOpEntry() {
        return this.geLpbkOpEntry;
    }

    public IGeLpbkOpEntry getEntry(String key) {
        return geLpbkOpEntry.get(key);
    }

    public void setEntry(String key, IGeLpbkOpEntry value) {
        geLpbkOpEntry.put(key, value);
        ((GeLpbkOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IGeLpbkOpEntry> getEntries() {
        return geLpbkOpEntry;
    }

    public GeLpbkOpEntry createEntry(String entryIndex) {
        GeLpbkOpEntry newEntry = new GeLpbkOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.16.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("geLpbkOpEntry", geLpbkOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(geLpbkOpEntry).toHashCode();
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
        GeLpbkOpTable rhs = ((GeLpbkOpTable) obj);
        return new EqualsBuilder().append(geLpbkOpEntry, rhs.geLpbkOpEntry).isEquals();
    }

    public GeLpbkOpTable clone() {
        GeLpbkOpTable _copy = new GeLpbkOpTable();
        for (Map.Entry<String, IGeLpbkOpEntry> _entry: geLpbkOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.16.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "geLpbkOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
