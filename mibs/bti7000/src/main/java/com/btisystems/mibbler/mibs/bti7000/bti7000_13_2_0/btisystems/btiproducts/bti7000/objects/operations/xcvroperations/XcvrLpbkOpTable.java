
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.xcvroperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.xcvrlpbkoptable.XcvrLpbkOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.IXcvrLpbkOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.xcvrlpbkoptable.IXcvrLpbkOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class XcvrLpbkOpTable
    extends DeviceEntity
    implements Serializable, IXcvrLpbkOpTable, ITableAccess<IXcvrLpbkOpEntry>
{

    private Map<String, IXcvrLpbkOpEntry> xcvrLpbkOpEntry = new TreeMap<String, IXcvrLpbkOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public XcvrLpbkOpTable() {
    }

    public Map<String, IXcvrLpbkOpEntry> getXcvrLpbkOpEntry() {
        return this.xcvrLpbkOpEntry;
    }

    public IXcvrLpbkOpEntry getEntry(String key) {
        return xcvrLpbkOpEntry.get(key);
    }

    public void setEntry(String key, IXcvrLpbkOpEntry value) {
        xcvrLpbkOpEntry.put(key, value);
        ((XcvrLpbkOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IXcvrLpbkOpEntry> getEntries() {
        return xcvrLpbkOpEntry;
    }

    public XcvrLpbkOpEntry createEntry(String entryIndex) {
        XcvrLpbkOpEntry newEntry = new XcvrLpbkOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.9.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("xcvrLpbkOpEntry", xcvrLpbkOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(xcvrLpbkOpEntry).toHashCode();
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
        XcvrLpbkOpTable rhs = ((XcvrLpbkOpTable) obj);
        return new EqualsBuilder().append(xcvrLpbkOpEntry, rhs.xcvrLpbkOpEntry).isEquals();
    }

    public XcvrLpbkOpTable clone() {
        XcvrLpbkOpTable _copy = new XcvrLpbkOpTable();
        for (Map.Entry<String, IXcvrLpbkOpEntry> _entry: xcvrLpbkOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.9.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "xcvrLpbkOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
