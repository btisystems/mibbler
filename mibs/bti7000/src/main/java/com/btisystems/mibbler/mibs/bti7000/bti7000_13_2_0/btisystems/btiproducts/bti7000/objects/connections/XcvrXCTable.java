
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.xcvrxctable.XcvrXCEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.IXcvrXCTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.xcvrxctable.IXcvrXCEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class XcvrXCTable
    extends DeviceEntity
    implements Serializable, IXcvrXCTable, ITableAccess<IXcvrXCEntry>
{

    private Map<String, IXcvrXCEntry> xcvrXCEntry = new TreeMap<String, IXcvrXCEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public XcvrXCTable() {
    }

    public Map<String, IXcvrXCEntry> getXcvrXCEntry() {
        return this.xcvrXCEntry;
    }

    public IXcvrXCEntry getEntry(String key) {
        return xcvrXCEntry.get(key);
    }

    public void setEntry(String key, IXcvrXCEntry value) {
        xcvrXCEntry.put(key, value);
        ((XcvrXCEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IXcvrXCEntry> getEntries() {
        return xcvrXCEntry;
    }

    public XcvrXCEntry createEntry(String entryIndex) {
        XcvrXCEntry newEntry = new XcvrXCEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.9.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("xcvrXCEntry", xcvrXCEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(xcvrXCEntry).toHashCode();
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
        XcvrXCTable rhs = ((XcvrXCTable) obj);
        return new EqualsBuilder().append(xcvrXCEntry, rhs.xcvrXCEntry).isEquals();
    }

    public XcvrXCTable clone() {
        XcvrXCTable _copy = new XcvrXCTable();
        for (Map.Entry<String, IXcvrXCEntry> _entry: xcvrXCEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.9.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "xcvrXCEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
