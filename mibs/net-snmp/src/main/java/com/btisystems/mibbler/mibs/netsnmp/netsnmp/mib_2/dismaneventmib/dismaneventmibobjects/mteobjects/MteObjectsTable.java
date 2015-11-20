
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteobjects;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteobjects.IMteObjectsTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteobjects.mteobjectstable.IMteObjectsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteobjects.mteobjectstable.MteObjectsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MteObjectsTable
    extends DeviceEntity
    implements Serializable, IMteObjectsTable, ITableAccess<IMteObjectsEntry>
{

    private Map<String, IMteObjectsEntry> mteObjectsEntry = new TreeMap<String, IMteObjectsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteObjectsTable() {
    }

    public Map<String, IMteObjectsEntry> getMteObjectsEntry() {
        return this.mteObjectsEntry;
    }

    public IMteObjectsEntry getEntry(String key) {
        return mteObjectsEntry.get(key);
    }

    public void setEntry(String key, IMteObjectsEntry value) {
        mteObjectsEntry.put(key, value);
        ((MteObjectsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMteObjectsEntry> getEntries() {
        return mteObjectsEntry;
    }

    public MteObjectsEntry createEntry(String entryIndex) {
        MteObjectsEntry newEntry = new MteObjectsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.88.1.3.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteObjectsEntry", mteObjectsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteObjectsEntry).toHashCode();
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
        MteObjectsTable rhs = ((MteObjectsTable) obj);
        return new EqualsBuilder().append(mteObjectsEntry, rhs.mteObjectsEntry).isEquals();
    }

    public MteObjectsTable clone() {
        MteObjectsTable _copy = new MteObjectsTable();
        for (Map.Entry<String, IMteObjectsEntry> _entry: mteObjectsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteObjectsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
