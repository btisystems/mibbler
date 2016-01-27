
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.application;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.application.IApplTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.application.appltable.IApplEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.application.appltable.ApplEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class ApplTable
    extends DeviceEntity
    implements Serializable, IApplTable, ITableAccess<IApplEntry>
{

    private Map<String, IApplEntry> applEntry = new TreeMap<String, IApplEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ApplTable() {
    }

    public Map<String, IApplEntry> getApplEntry() {
        return this.applEntry;
    }

    public IApplEntry getEntry(String key) {
        return applEntry.get(key);
    }

    public void setEntry(String key, IApplEntry value) {
        applEntry.put(key, value);
        ((ApplEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IApplEntry> getEntries() {
        return applEntry;
    }

    public ApplEntry createEntry(String entryIndex) {
        ApplEntry newEntry = new ApplEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.27.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("applEntry", applEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(applEntry).toHashCode();
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
        ApplTable rhs = ((ApplTable) obj);
        return new EqualsBuilder().append(applEntry, rhs.applEntry).isEquals();
    }

    public ApplTable clone() {
        ApplTable _copy = new ApplTable();
        for (Map.Entry<String, IApplEntry> _entry: applEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.27.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "applEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
