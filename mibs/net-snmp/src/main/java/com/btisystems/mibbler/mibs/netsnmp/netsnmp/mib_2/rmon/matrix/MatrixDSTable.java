
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.matrix;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.matrix.IMatrixDSTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.matrix.matrixdstable.IMatrixDSEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.matrix.matrixdstable.MatrixDSEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MatrixDSTable
    extends DeviceEntity
    implements Serializable, IMatrixDSTable, ITableAccess<IMatrixDSEntry>
{

    private Map<String, IMatrixDSEntry> matrixDSEntry = new TreeMap<String, IMatrixDSEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MatrixDSTable() {
    }

    public Map<String, IMatrixDSEntry> getMatrixDSEntry() {
        return this.matrixDSEntry;
    }

    public IMatrixDSEntry getEntry(String key) {
        return matrixDSEntry.get(key);
    }

    public void setEntry(String key, IMatrixDSEntry value) {
        matrixDSEntry.put(key, value);
        ((MatrixDSEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMatrixDSEntry> getEntries() {
        return matrixDSEntry;
    }

    public MatrixDSEntry createEntry(String entryIndex) {
        MatrixDSEntry newEntry = new MatrixDSEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.6.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("matrixDSEntry", matrixDSEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(matrixDSEntry).toHashCode();
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
        MatrixDSTable rhs = ((MatrixDSTable) obj);
        return new EqualsBuilder().append(matrixDSEntry, rhs.matrixDSEntry).isEquals();
    }

    public MatrixDSTable clone() {
        MatrixDSTable _copy = new MatrixDSTable();
        for (Map.Entry<String, IMatrixDSEntry> _entry: matrixDSEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.6.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "matrixDSEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
