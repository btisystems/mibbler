
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.protection;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.protection.xcvrprotgrptable.XcvrProtGrpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.IXcvrProtGrpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.xcvrprotgrptable.IXcvrProtGrpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class XcvrProtGrpTable
    extends DeviceEntity
    implements Serializable, IXcvrProtGrpTable, ITableAccess<IXcvrProtGrpEntry>
{

    private Map<String, IXcvrProtGrpEntry> xcvrProtGrpEntry = new TreeMap<String, IXcvrProtGrpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public XcvrProtGrpTable() {
    }

    public Map<String, IXcvrProtGrpEntry> getXcvrProtGrpEntry() {
        return this.xcvrProtGrpEntry;
    }

    public IXcvrProtGrpEntry getEntry(String key) {
        return xcvrProtGrpEntry.get(key);
    }

    public void setEntry(String key, IXcvrProtGrpEntry value) {
        xcvrProtGrpEntry.put(key, value);
        ((XcvrProtGrpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IXcvrProtGrpEntry> getEntries() {
        return xcvrProtGrpEntry;
    }

    public XcvrProtGrpEntry createEntry(String entryIndex) {
        XcvrProtGrpEntry newEntry = new XcvrProtGrpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.10.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("xcvrProtGrpEntry", xcvrProtGrpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(xcvrProtGrpEntry).toHashCode();
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
        XcvrProtGrpTable rhs = ((XcvrProtGrpTable) obj);
        return new EqualsBuilder().append(xcvrProtGrpEntry, rhs.xcvrProtGrpEntry).isEquals();
    }

    public XcvrProtGrpTable clone() {
        XcvrProtGrpTable _copy = new XcvrProtGrpTable();
        for (Map.Entry<String, IXcvrProtGrpEntry> _entry: xcvrProtGrpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.10.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "xcvrProtGrpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
