
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.almatrix;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix.IAlMatrixTopNTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix.almatrixtopntable.IAlMatrixTopNEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.almatrix.almatrixtopntable.AlMatrixTopNEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AlMatrixTopNTable
    extends DeviceEntity
    implements Serializable, IAlMatrixTopNTable, ITableAccess<IAlMatrixTopNEntry>
{

    private Map<String, IAlMatrixTopNEntry> alMatrixTopNEntry = new TreeMap<String, IAlMatrixTopNEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AlMatrixTopNTable() {
    }

    public Map<String, IAlMatrixTopNEntry> getAlMatrixTopNEntry() {
        return this.alMatrixTopNEntry;
    }

    public IAlMatrixTopNEntry getEntry(String key) {
        return alMatrixTopNEntry.get(key);
    }

    public void setEntry(String key, IAlMatrixTopNEntry value) {
        alMatrixTopNEntry.put(key, value);
        ((AlMatrixTopNEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAlMatrixTopNEntry> getEntries() {
        return alMatrixTopNEntry;
    }

    public AlMatrixTopNEntry createEntry(String entryIndex) {
        AlMatrixTopNEntry newEntry = new AlMatrixTopNEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.17.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alMatrixTopNEntry", alMatrixTopNEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alMatrixTopNEntry).toHashCode();
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
        AlMatrixTopNTable rhs = ((AlMatrixTopNTable) obj);
        return new EqualsBuilder().append(alMatrixTopNEntry, rhs.alMatrixTopNEntry).isEquals();
    }

    public AlMatrixTopNTable clone() {
        AlMatrixTopNTable _copy = new AlMatrixTopNTable();
        for (Map.Entry<String, IAlMatrixTopNEntry> _entry: alMatrixTopNEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.17.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alMatrixTopNEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
