
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.IMteEventSetTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventsettable.IMteEventSetEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventsettable.MteEventSetEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MteEventSetTable
    extends DeviceEntity
    implements Serializable, IMteEventSetTable, ITableAccess<IMteEventSetEntry>
{

    private Map<String, IMteEventSetEntry> mteEventSetEntry = new TreeMap<String, IMteEventSetEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteEventSetTable() {
    }

    public Map<String, IMteEventSetEntry> getMteEventSetEntry() {
        return this.mteEventSetEntry;
    }

    public IMteEventSetEntry getEntry(String key) {
        return mteEventSetEntry.get(key);
    }

    public void setEntry(String key, IMteEventSetEntry value) {
        mteEventSetEntry.put(key, value);
        ((MteEventSetEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMteEventSetEntry> getEntries() {
        return mteEventSetEntry;
    }

    public MteEventSetEntry createEntry(String entryIndex) {
        MteEventSetEntry newEntry = new MteEventSetEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.88.1.4.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteEventSetEntry", mteEventSetEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteEventSetEntry).toHashCode();
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
        MteEventSetTable rhs = ((MteEventSetTable) obj);
        return new EqualsBuilder().append(mteEventSetEntry, rhs.mteEventSetEntry).isEquals();
    }

    public MteEventSetTable clone() {
        MteEventSetTable _copy = new MteEventSetTable();
        for (Map.Entry<String, IMteEventSetEntry> _entry: mteEventSetEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.4.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteEventSetEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
