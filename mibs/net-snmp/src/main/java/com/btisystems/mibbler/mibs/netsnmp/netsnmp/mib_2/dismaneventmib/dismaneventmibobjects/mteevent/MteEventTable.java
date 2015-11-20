
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.IMteEventTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventtable.IMteEventEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventtable.MteEventEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MteEventTable
    extends DeviceEntity
    implements Serializable, IMteEventTable, ITableAccess<IMteEventEntry>
{

    private Map<String, IMteEventEntry> mteEventEntry = new TreeMap<String, IMteEventEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteEventTable() {
    }

    public Map<String, IMteEventEntry> getMteEventEntry() {
        return this.mteEventEntry;
    }

    public IMteEventEntry getEntry(String key) {
        return mteEventEntry.get(key);
    }

    public void setEntry(String key, IMteEventEntry value) {
        mteEventEntry.put(key, value);
        ((MteEventEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMteEventEntry> getEntries() {
        return mteEventEntry;
    }

    public MteEventEntry createEntry(String entryIndex) {
        MteEventEntry newEntry = new MteEventEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.88.1.4.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteEventEntry", mteEventEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteEventEntry).toHashCode();
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
        MteEventTable rhs = ((MteEventTable) obj);
        return new EqualsBuilder().append(mteEventEntry, rhs.mteEventEntry).isEquals();
    }

    public MteEventTable clone() {
        MteEventTable _copy = new MteEventTable();
        for (Map.Entry<String, IMteEventEntry> _entry: mteEventEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.4.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteEventEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
