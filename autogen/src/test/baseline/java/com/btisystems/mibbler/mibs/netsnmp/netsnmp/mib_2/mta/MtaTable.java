
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.IMtaTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtatable.IMtaEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.mtatable.MtaEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MtaTable
    extends DeviceEntity
    implements Serializable, IMtaTable, ITableAccess<IMtaEntry>
{

    private Map<String, IMtaEntry> mtaEntry = new TreeMap<String, IMtaEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MtaTable() {
    }

    public Map<String, IMtaEntry> getMtaEntry() {
        return this.mtaEntry;
    }

    public IMtaEntry getEntry(String key) {
        return mtaEntry.get(key);
    }

    public void setEntry(String key, IMtaEntry value) {
        mtaEntry.put(key, value);
        ((MtaEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMtaEntry> getEntries() {
        return mtaEntry;
    }

    public MtaEntry createEntry(String entryIndex) {
        MtaEntry newEntry = new MtaEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.28.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mtaEntry", mtaEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mtaEntry).toHashCode();
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
        MtaTable rhs = ((MtaTable) obj);
        return new EqualsBuilder().append(mtaEntry, rhs.mtaEntry).isEquals();
    }

    public MtaTable clone() {
        MtaTable _copy = new MtaTable();
        for (Map.Entry<String, IMtaEntry> _entry: mtaEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.28.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mtaEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
