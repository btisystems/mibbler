
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.matrix.matrixcontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.matrix.MatrixControlTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.matrix.matrixcontroltable.IMatrixControlEntry;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IIndexed;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class MatrixControlEntry
    extends DeviceEntity
    implements Serializable, IMatrixControlEntry, IIndexed, IVariableBindingSetter
{

    private int matrixControlIndex;
    private String matrixControlDataSource;
    private int matrixControlTableSize;
    private int matrixControlLastDeleteTime;
    private String matrixControlOwner;
    private int matrixControlStatus;
    private String _index;
    private MatrixControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MatrixControlEntry() {
    }

    public int getMatrixControlIndex() {
        return this.matrixControlIndex;
    }

    public void setMatrixControlIndex(int matrixControlIndex) {
        int oldValue = getMatrixControlIndex();
        this.matrixControlIndex = matrixControlIndex;
        notifyChange(1, oldValue, matrixControlIndex);
    }

    public String getMatrixControlDataSource() {
        return this.matrixControlDataSource;
    }

    public void setMatrixControlDataSource(String matrixControlDataSource) {
        String oldValue = getMatrixControlDataSource();
        this.matrixControlDataSource = matrixControlDataSource;
        notifyChange(2, oldValue, matrixControlDataSource);
    }

    public int getMatrixControlTableSize() {
        return this.matrixControlTableSize;
    }

    public void setMatrixControlTableSize(int matrixControlTableSize) {
        int oldValue = getMatrixControlTableSize();
        this.matrixControlTableSize = matrixControlTableSize;
        notifyChange(3, oldValue, matrixControlTableSize);
    }

    public int getMatrixControlLastDeleteTime() {
        return this.matrixControlLastDeleteTime;
    }

    public void setMatrixControlLastDeleteTime(int matrixControlLastDeleteTime) {
        int oldValue = getMatrixControlLastDeleteTime();
        this.matrixControlLastDeleteTime = matrixControlLastDeleteTime;
        notifyChange(4, oldValue, matrixControlLastDeleteTime);
    }

    public String getMatrixControlOwner() {
        return this.matrixControlOwner;
    }

    public void setMatrixControlOwner(String matrixControlOwner) {
        String oldValue = getMatrixControlOwner();
        this.matrixControlOwner = matrixControlOwner;
        notifyChange(5, oldValue, matrixControlOwner);
    }

    public int getMatrixControlStatus() {
        return this.matrixControlStatus;
    }

    public void setMatrixControlStatus(int matrixControlStatus) {
        int oldValue = getMatrixControlStatus();
        this.matrixControlStatus = matrixControlStatus;
        notifyChange(6, oldValue, matrixControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setMatrixControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setMatrixControlDataSource(binding.getVariable().toString());
                break;
            case  3 :
                setMatrixControlTableSize(binding.getVariable().toInt());
                break;
            case  4 :
                setMatrixControlLastDeleteTime(binding.getVariable().toInt());
                break;
            case  5 :
                setMatrixControlOwner(binding.getVariable().toString());
                break;
            case  6 :
                setMatrixControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setMatrixControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MatrixControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("matrixControlIndex", matrixControlIndex).append("matrixControlDataSource", matrixControlDataSource).append("matrixControlTableSize", matrixControlTableSize).append("matrixControlLastDeleteTime", matrixControlLastDeleteTime).append("matrixControlOwner", matrixControlOwner).append("matrixControlStatus", matrixControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(matrixControlIndex).append(matrixControlDataSource).append(matrixControlTableSize).append(matrixControlLastDeleteTime).append(matrixControlOwner).append(matrixControlStatus).append(_index).toHashCode();
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
        MatrixControlEntry rhs = ((MatrixControlEntry) obj);
        return new EqualsBuilder().append(matrixControlIndex, rhs.matrixControlIndex).append(matrixControlDataSource, rhs.matrixControlDataSource).append(matrixControlTableSize, rhs.matrixControlTableSize).append(matrixControlLastDeleteTime, rhs.matrixControlLastDeleteTime).append(matrixControlOwner, rhs.matrixControlOwner).append(matrixControlStatus, rhs.matrixControlStatus).append(_index, rhs._index).isEquals();
    }

    public MatrixControlEntry clone() {
        MatrixControlEntry _copy = new MatrixControlEntry();
        _copy.matrixControlIndex = matrixControlIndex;
        _copy.matrixControlDataSource = matrixControlDataSource;
        _copy.matrixControlTableSize = matrixControlTableSize;
        _copy.matrixControlLastDeleteTime = matrixControlLastDeleteTime;
        _copy.matrixControlOwner = matrixControlOwner;
        _copy.matrixControlStatus = matrixControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.6.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "matrixControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "matrixControlDataSource", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "matrixControlTableSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "matrixControlLastDeleteTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "matrixControlOwner", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "matrixControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
