
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.almatrix;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix.IAlMatrixDSTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix.almatrixdstable.IAlMatrixDSEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.almatrix.almatrixdstable.AlMatrixDSEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AlMatrixDSTable
    extends DeviceEntity
    implements Serializable, IAlMatrixDSTable, ITableAccess<IAlMatrixDSEntry>
{

    private Map<String, IAlMatrixDSEntry> alMatrixDSEntry = new TreeMap<String, IAlMatrixDSEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AlMatrixDSTable() {
    }

    public Map<String, IAlMatrixDSEntry> getAlMatrixDSEntry() {
        return this.alMatrixDSEntry;
    }

    public IAlMatrixDSEntry getEntry(String key) {
        return alMatrixDSEntry.get(key);
    }

    public void setEntry(String key, IAlMatrixDSEntry value) {
        alMatrixDSEntry.put(key, value);
        ((AlMatrixDSEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAlMatrixDSEntry> getEntries() {
        return alMatrixDSEntry;
    }

    public AlMatrixDSEntry createEntry(String entryIndex) {
        AlMatrixDSEntry newEntry = new AlMatrixDSEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.17.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alMatrixDSEntry", alMatrixDSEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alMatrixDSEntry).toHashCode();
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
        AlMatrixDSTable rhs = ((AlMatrixDSTable) obj);
        return new EqualsBuilder().append(alMatrixDSEntry, rhs.alMatrixDSEntry).isEquals();
    }

    public AlMatrixDSTable clone() {
        AlMatrixDSTable _copy = new AlMatrixDSTable();
        for (Map.Entry<String, IAlMatrixDSEntry> _entry: alMatrixDSEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.17.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alMatrixDSEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
