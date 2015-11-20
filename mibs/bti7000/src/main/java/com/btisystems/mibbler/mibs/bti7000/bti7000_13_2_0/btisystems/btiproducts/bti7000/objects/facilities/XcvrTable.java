
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.xcvrtable.XcvrEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IXcvrTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.xcvrtable.IXcvrEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class XcvrTable
    extends DeviceEntity
    implements Serializable, IXcvrTable, ITableAccess<IXcvrEntry>
{

    private Map<String, IXcvrEntry> xcvrEntry = new TreeMap<String, IXcvrEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public XcvrTable() {
    }

    public Map<String, IXcvrEntry> getXcvrEntry() {
        return this.xcvrEntry;
    }

    public IXcvrEntry getEntry(String key) {
        return xcvrEntry.get(key);
    }

    public void setEntry(String key, IXcvrEntry value) {
        xcvrEntry.put(key, value);
        ((XcvrEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IXcvrEntry> getEntries() {
        return xcvrEntry;
    }

    public XcvrEntry createEntry(String entryIndex) {
        XcvrEntry newEntry = new XcvrEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("xcvrEntry", xcvrEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(xcvrEntry).toHashCode();
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
        XcvrTable rhs = ((XcvrTable) obj);
        return new EqualsBuilder().append(xcvrEntry, rhs.xcvrEntry).isEquals();
    }

    public XcvrTable clone() {
        XcvrTable _copy = new XcvrTable();
        for (Map.Entry<String, IXcvrEntry> _entry: xcvrEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "xcvrEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
