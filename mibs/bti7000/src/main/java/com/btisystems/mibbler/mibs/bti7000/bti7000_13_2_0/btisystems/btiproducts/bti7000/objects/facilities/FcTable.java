
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.fctable.FcEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IFcTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.fctable.IFcEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class FcTable
    extends DeviceEntity
    implements Serializable, IFcTable, ITableAccess<IFcEntry>
{

    private Map<String, IFcEntry> fcEntry = new TreeMap<String, IFcEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public FcTable() {
    }

    public Map<String, IFcEntry> getFcEntry() {
        return this.fcEntry;
    }

    public IFcEntry getEntry(String key) {
        return fcEntry.get(key);
    }

    public void setEntry(String key, IFcEntry value) {
        fcEntry.put(key, value);
        ((FcEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IFcEntry> getEntries() {
        return fcEntry;
    }

    public FcEntry createEntry(String entryIndex) {
        FcEntry newEntry = new FcEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.12.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("fcEntry", fcEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(fcEntry).toHashCode();
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
        FcTable rhs = ((FcTable) obj);
        return new EqualsBuilder().append(fcEntry, rhs.fcEntry).isEquals();
    }

    public FcTable clone() {
        FcTable _copy = new FcTable();
        for (Map.Entry<String, IFcEntry> _entry: fcEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.12"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "fcEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
