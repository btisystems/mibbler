
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.matrix;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.matrix.matrixsdtable.MatrixSDEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.matrix.IMatrixSDTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.matrix.matrixsdtable.IMatrixSDEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MatrixSDTable
    extends DeviceEntity
    implements Serializable, IMatrixSDTable, ITableAccess<IMatrixSDEntry>
{

    private Map<String, IMatrixSDEntry> matrixSDEntry = new TreeMap<String, IMatrixSDEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MatrixSDTable() {
    }

    public Map<String, IMatrixSDEntry> getMatrixSDEntry() {
        return this.matrixSDEntry;
    }

    public IMatrixSDEntry getEntry(String key) {
        return matrixSDEntry.get(key);
    }

    public void setEntry(String key, IMatrixSDEntry value) {
        matrixSDEntry.put(key, value);
        ((MatrixSDEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMatrixSDEntry> getEntries() {
        return matrixSDEntry;
    }

    public MatrixSDEntry createEntry(String entryIndex) {
        MatrixSDEntry newEntry = new MatrixSDEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.6.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("matrixSDEntry", matrixSDEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(matrixSDEntry).toHashCode();
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
        MatrixSDTable rhs = ((MatrixSDTable) obj);
        return new EqualsBuilder().append(matrixSDEntry, rhs.matrixSDEntry).isEquals();
    }

    public MatrixSDTable clone() {
        MatrixSDTable _copy = new MatrixSDTable();
        for (Map.Entry<String, IMatrixSDEntry> _entry: matrixSDEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.6.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "matrixSDEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
