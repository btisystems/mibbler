
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.IMtaGroupTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtagrouptable.IMtaGroupEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.mtagrouptable.MtaGroupEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MtaGroupTable
    extends DeviceEntity
    implements Serializable, IMtaGroupTable, ITableAccess<IMtaGroupEntry>
{

    private Map<String, IMtaGroupEntry> mtaGroupEntry = new TreeMap<String, IMtaGroupEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MtaGroupTable() {
    }

    public Map<String, IMtaGroupEntry> getMtaGroupEntry() {
        return this.mtaGroupEntry;
    }

    public IMtaGroupEntry getEntry(String key) {
        return mtaGroupEntry.get(key);
    }

    public void setEntry(String key, IMtaGroupEntry value) {
        mtaGroupEntry.put(key, value);
        ((MtaGroupEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMtaGroupEntry> getEntries() {
        return mtaGroupEntry;
    }

    public MtaGroupEntry createEntry(String entryIndex) {
        MtaGroupEntry newEntry = new MtaGroupEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.28.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mtaGroupEntry", mtaGroupEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mtaGroupEntry).toHashCode();
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
        MtaGroupTable rhs = ((MtaGroupTable) obj);
        return new EqualsBuilder().append(mtaGroupEntry, rhs.mtaGroupEntry).isEquals();
    }

    public MtaGroupTable clone() {
        MtaGroupTable _copy = new MtaGroupTable();
        for (Map.Entry<String, IMtaGroupEntry> _entry: mtaGroupEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.28.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mtaGroupEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
