
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.fcoperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.fcoperations.fclpbkoptable.FcLpbkOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.fcoperations.IFcLpbkOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.fcoperations.fclpbkoptable.IFcLpbkOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class FcLpbkOpTable
    extends DeviceEntity
    implements Serializable, IFcLpbkOpTable, ITableAccess<IFcLpbkOpEntry>
{

    private Map<String, IFcLpbkOpEntry> fcLpbkOpEntry = new TreeMap<String, IFcLpbkOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public FcLpbkOpTable() {
    }

    public Map<String, IFcLpbkOpEntry> getFcLpbkOpEntry() {
        return this.fcLpbkOpEntry;
    }

    public IFcLpbkOpEntry getEntry(String key) {
        return fcLpbkOpEntry.get(key);
    }

    public void setEntry(String key, IFcLpbkOpEntry value) {
        fcLpbkOpEntry.put(key, value);
        ((FcLpbkOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IFcLpbkOpEntry> getEntries() {
        return fcLpbkOpEntry;
    }

    public FcLpbkOpEntry createEntry(String entryIndex) {
        FcLpbkOpEntry newEntry = new FcLpbkOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.17.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("fcLpbkOpEntry", fcLpbkOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(fcLpbkOpEntry).toHashCode();
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
        FcLpbkOpTable rhs = ((FcLpbkOpTable) obj);
        return new EqualsBuilder().append(fcLpbkOpEntry, rhs.fcLpbkOpEntry).isEquals();
    }

    public FcLpbkOpTable clone() {
        FcLpbkOpTable _copy = new FcLpbkOpTable();
        for (Map.Entry<String, IFcLpbkOpEntry> _entry: fcLpbkOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.17.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "fcLpbkOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
