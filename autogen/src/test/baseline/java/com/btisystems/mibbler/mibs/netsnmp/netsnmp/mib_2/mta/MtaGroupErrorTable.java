
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.IMtaGroupErrorTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtagrouperrortable.IMtaGroupErrorEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.mtagrouperrortable.MtaGroupErrorEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MtaGroupErrorTable
    extends DeviceEntity
    implements Serializable, IMtaGroupErrorTable, ITableAccess<IMtaGroupErrorEntry>
{

    private Map<String, IMtaGroupErrorEntry> mtaGroupErrorEntry = new TreeMap<String, IMtaGroupErrorEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MtaGroupErrorTable() {
    }

    public Map<String, IMtaGroupErrorEntry> getMtaGroupErrorEntry() {
        return this.mtaGroupErrorEntry;
    }

    public IMtaGroupErrorEntry getEntry(String key) {
        return mtaGroupErrorEntry.get(key);
    }

    public void setEntry(String key, IMtaGroupErrorEntry value) {
        mtaGroupErrorEntry.put(key, value);
        ((MtaGroupErrorEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMtaGroupErrorEntry> getEntries() {
        return mtaGroupErrorEntry;
    }

    public MtaGroupErrorEntry createEntry(String entryIndex) {
        MtaGroupErrorEntry newEntry = new MtaGroupErrorEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.28.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mtaGroupErrorEntry", mtaGroupErrorEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mtaGroupErrorEntry).toHashCode();
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
        MtaGroupErrorTable rhs = ((MtaGroupErrorTable) obj);
        return new EqualsBuilder().append(mtaGroupErrorEntry, rhs.mtaGroupErrorEntry).isEquals();
    }

    public MtaGroupErrorTable clone() {
        MtaGroupErrorTable _copy = new MtaGroupErrorTable();
        for (Map.Entry<String, IMtaGroupErrorEntry> _entry: mtaGroupErrorEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.28.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mtaGroupErrorEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
