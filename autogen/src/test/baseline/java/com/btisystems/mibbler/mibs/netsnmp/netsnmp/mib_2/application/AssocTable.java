
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.application;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.application.IAssocTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.application.assoctable.IAssocEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.application.assoctable.AssocEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AssocTable
    extends DeviceEntity
    implements Serializable, IAssocTable, ITableAccess<IAssocEntry>
{

    private Map<String, IAssocEntry> assocEntry = new TreeMap<String, IAssocEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AssocTable() {
    }

    public Map<String, IAssocEntry> getAssocEntry() {
        return this.assocEntry;
    }

    public IAssocEntry getEntry(String key) {
        return assocEntry.get(key);
    }

    public void setEntry(String key, IAssocEntry value) {
        assocEntry.put(key, value);
        ((AssocEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAssocEntry> getEntries() {
        return assocEntry;
    }

    public AssocEntry createEntry(String entryIndex) {
        AssocEntry newEntry = new AssocEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.27.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("assocEntry", assocEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(assocEntry).toHashCode();
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
        AssocTable rhs = ((AssocTable) obj);
        return new EqualsBuilder().append(assocEntry, rhs.assocEntry).isEquals();
    }

    public AssocTable clone() {
        AssocTable _copy = new AssocTable();
        for (Map.Entry<String, IAssocEntry> _entry: assocEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.27.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "assocEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
