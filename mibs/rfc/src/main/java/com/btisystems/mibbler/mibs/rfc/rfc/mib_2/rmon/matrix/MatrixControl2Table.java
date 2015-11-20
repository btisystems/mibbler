
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.matrix;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.matrix.IMatrixControl2Table;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.matrix.matrixcontrol2table.IMatrixControl2Entry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.matrix.matrixcontrol2table.MatrixControl2Entry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MatrixControl2Table
    extends DeviceEntity
    implements Serializable, IMatrixControl2Table, ITableAccess<IMatrixControl2Entry>
{

    private Map<String, IMatrixControl2Entry> matrixControl2Entry = new TreeMap<String, IMatrixControl2Entry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MatrixControl2Table() {
    }

    public Map<String, IMatrixControl2Entry> getMatrixControl2Entry() {
        return this.matrixControl2Entry;
    }

    public IMatrixControl2Entry getEntry(String key) {
        return matrixControl2Entry.get(key);
    }

    public void setEntry(String key, IMatrixControl2Entry value) {
        matrixControl2Entry.put(key, value);
        ((MatrixControl2Entry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMatrixControl2Entry> getEntries() {
        return matrixControl2Entry;
    }

    public MatrixControl2Entry createEntry(String entryIndex) {
        MatrixControl2Entry newEntry = new MatrixControl2Entry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.6.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("matrixControl2Entry", matrixControl2Entry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(matrixControl2Entry).toHashCode();
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
        MatrixControl2Table rhs = ((MatrixControl2Table) obj);
        return new EqualsBuilder().append(matrixControl2Entry, rhs.matrixControl2Entry).isEquals();
    }

    public MatrixControl2Table clone() {
        MatrixControl2Table _copy = new MatrixControl2Table();
        for (Map.Entry<String, IMatrixControl2Entry> _entry: matrixControl2Entry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.6.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "matrixControl2Entry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
