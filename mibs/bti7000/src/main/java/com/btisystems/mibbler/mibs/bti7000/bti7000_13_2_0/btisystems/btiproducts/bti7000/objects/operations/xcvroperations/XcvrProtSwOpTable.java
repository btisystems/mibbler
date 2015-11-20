
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.xcvroperations;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.xcvrprotswoptable.XcvrProtSwOpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.IXcvrProtSwOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.xcvrprotswoptable.IXcvrProtSwOpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class XcvrProtSwOpTable
    extends DeviceEntity
    implements Serializable, IXcvrProtSwOpTable, ITableAccess<IXcvrProtSwOpEntry>
{

    private Map<String, IXcvrProtSwOpEntry> xcvrProtSwOpEntry = new TreeMap<String, IXcvrProtSwOpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public XcvrProtSwOpTable() {
    }

    public Map<String, IXcvrProtSwOpEntry> getXcvrProtSwOpEntry() {
        return this.xcvrProtSwOpEntry;
    }

    public IXcvrProtSwOpEntry getEntry(String key) {
        return xcvrProtSwOpEntry.get(key);
    }

    public void setEntry(String key, IXcvrProtSwOpEntry value) {
        xcvrProtSwOpEntry.put(key, value);
        ((XcvrProtSwOpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IXcvrProtSwOpEntry> getEntries() {
        return xcvrProtSwOpEntry;
    }

    public XcvrProtSwOpEntry createEntry(String entryIndex) {
        XcvrProtSwOpEntry newEntry = new XcvrProtSwOpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.11.9.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("xcvrProtSwOpEntry", xcvrProtSwOpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(xcvrProtSwOpEntry).toHashCode();
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
        XcvrProtSwOpTable rhs = ((XcvrProtSwOpTable) obj);
        return new EqualsBuilder().append(xcvrProtSwOpEntry, rhs.xcvrProtSwOpEntry).isEquals();
    }

    public XcvrProtSwOpTable clone() {
        XcvrProtSwOpTable _copy = new XcvrProtSwOpTable();
        for (Map.Entry<String, IXcvrProtSwOpEntry> _entry: xcvrProtSwOpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.9.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "xcvrProtSwOpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
