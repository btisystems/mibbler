
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswinstalled;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswinstalled.IHrSWInstalledTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswinstalled.hrswinstalledtable.IHrSWInstalledEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswinstalled.hrswinstalledtable.HrSWInstalledEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HrSWInstalledTable
    extends DeviceEntity
    implements Serializable, IHrSWInstalledTable, ITableAccess<IHrSWInstalledEntry>
{

    private Map<String, IHrSWInstalledEntry> hrSWInstalledEntry = new TreeMap<String, IHrSWInstalledEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrSWInstalledTable() {
    }

    public Map<String, IHrSWInstalledEntry> getHrSWInstalledEntry() {
        return this.hrSWInstalledEntry;
    }

    public IHrSWInstalledEntry getEntry(String key) {
        return hrSWInstalledEntry.get(key);
    }

    public void setEntry(String key, IHrSWInstalledEntry value) {
        hrSWInstalledEntry.put(key, value);
        ((HrSWInstalledEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHrSWInstalledEntry> getEntries() {
        return hrSWInstalledEntry;
    }

    public HrSWInstalledEntry createEntry(String entryIndex) {
        HrSWInstalledEntry newEntry = new HrSWInstalledEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.25.6.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrSWInstalledEntry", hrSWInstalledEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrSWInstalledEntry).toHashCode();
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
        HrSWInstalledTable rhs = ((HrSWInstalledTable) obj);
        return new EqualsBuilder().append(hrSWInstalledEntry, rhs.hrSWInstalledEntry).isEquals();
    }

    public HrSWInstalledTable clone() {
        HrSWInstalledTable _copy = new HrSWInstalledTable();
        for (Map.Entry<String, IHrSWInstalledEntry> _entry: hrSWInstalledEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.6.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrSWInstalledEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
