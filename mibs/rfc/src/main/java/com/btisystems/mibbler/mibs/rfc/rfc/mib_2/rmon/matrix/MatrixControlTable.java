
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.matrix;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.matrix.IMatrixControlTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.matrix.matrixcontroltable.IMatrixControlEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.matrix.matrixcontroltable.MatrixControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MatrixControlTable
    extends DeviceEntity
    implements Serializable, IMatrixControlTable, ITableAccess<IMatrixControlEntry>
{

    private Map<String, IMatrixControlEntry> matrixControlEntry = new TreeMap<String, IMatrixControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MatrixControlTable() {
    }

    public Map<String, IMatrixControlEntry> getMatrixControlEntry() {
        return this.matrixControlEntry;
    }

    public IMatrixControlEntry getEntry(String key) {
        return matrixControlEntry.get(key);
    }

    public void setEntry(String key, IMatrixControlEntry value) {
        matrixControlEntry.put(key, value);
        ((MatrixControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMatrixControlEntry> getEntries() {
        return matrixControlEntry;
    }

    public MatrixControlEntry createEntry(String entryIndex) {
        MatrixControlEntry newEntry = new MatrixControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.6.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("matrixControlEntry", matrixControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(matrixControlEntry).toHashCode();
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
        MatrixControlTable rhs = ((MatrixControlTable) obj);
        return new EqualsBuilder().append(matrixControlEntry, rhs.matrixControlEntry).isEquals();
    }

    public MatrixControlTable clone() {
        MatrixControlTable _copy = new MatrixControlTable();
        for (Map.Entry<String, IMatrixControlEntry> _entry: matrixControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "matrixControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
