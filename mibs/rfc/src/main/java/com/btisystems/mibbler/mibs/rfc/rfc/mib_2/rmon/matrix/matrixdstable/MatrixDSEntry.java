
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.matrix.matrixdstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.matrix.matrixdstable.IMatrixDSEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.matrix.MatrixDSTable;
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

public class MatrixDSEntry
    extends DeviceEntity
    implements Serializable, IMatrixDSEntry, IIndexed, IVariableBindingSetter
{

    private String matrixDSSourceAddress;
    private String matrixDSDestAddress;
    private int matrixDSIndex;
    private int matrixDSPkts;
    private int matrixDSOctets;
    private int matrixDSErrors;
    private String _index;
    private MatrixDSTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MatrixDSEntry() {
    }

    public String getMatrixDSSourceAddress() {
        return this.matrixDSSourceAddress;
    }

    public void setMatrixDSSourceAddress(String matrixDSSourceAddress) {
        String oldValue = getMatrixDSSourceAddress();
        this.matrixDSSourceAddress = matrixDSSourceAddress;
        notifyChange(1, oldValue, matrixDSSourceAddress);
    }

    public String getMatrixDSDestAddress() {
        return this.matrixDSDestAddress;
    }

    public void setMatrixDSDestAddress(String matrixDSDestAddress) {
        String oldValue = getMatrixDSDestAddress();
        this.matrixDSDestAddress = matrixDSDestAddress;
        notifyChange(2, oldValue, matrixDSDestAddress);
    }

    public int getMatrixDSIndex() {
        return this.matrixDSIndex;
    }

    public void setMatrixDSIndex(int matrixDSIndex) {
        int oldValue = getMatrixDSIndex();
        this.matrixDSIndex = matrixDSIndex;
        notifyChange(3, oldValue, matrixDSIndex);
    }

    public int getMatrixDSPkts() {
        return this.matrixDSPkts;
    }

    public void setMatrixDSPkts(int matrixDSPkts) {
        int oldValue = getMatrixDSPkts();
        this.matrixDSPkts = matrixDSPkts;
        notifyChange(4, oldValue, matrixDSPkts);
    }

    public int getMatrixDSOctets() {
        return this.matrixDSOctets;
    }

    public void setMatrixDSOctets(int matrixDSOctets) {
        int oldValue = getMatrixDSOctets();
        this.matrixDSOctets = matrixDSOctets;
        notifyChange(5, oldValue, matrixDSOctets);
    }

    public int getMatrixDSErrors() {
        return this.matrixDSErrors;
    }

    public void setMatrixDSErrors(int matrixDSErrors) {
        int oldValue = getMatrixDSErrors();
        this.matrixDSErrors = matrixDSErrors;
        notifyChange(6, oldValue, matrixDSErrors);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setMatrixDSSourceAddress(binding.getVariable().toString());
                break;
            case  2 :
                setMatrixDSDestAddress(binding.getVariable().toString());
                break;
            case  3 :
                setMatrixDSIndex(binding.getVariable().toInt());
                break;
            case  4 :
                setMatrixDSPkts(binding.getVariable().toInt());
                break;
            case  5 :
                setMatrixDSOctets(binding.getVariable().toInt());
                break;
            case  6 :
                setMatrixDSErrors(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setMatrixDSIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setMatrixDSDestAddress(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setMatrixDSSourceAddress(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MatrixDSTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("matrixDSSourceAddress", matrixDSSourceAddress).append("matrixDSDestAddress", matrixDSDestAddress).append("matrixDSIndex", matrixDSIndex).append("matrixDSPkts", matrixDSPkts).append("matrixDSOctets", matrixDSOctets).append("matrixDSErrors", matrixDSErrors).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(matrixDSSourceAddress).append(matrixDSDestAddress).append(matrixDSIndex).append(matrixDSPkts).append(matrixDSOctets).append(matrixDSErrors).append(_index).toHashCode();
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
        MatrixDSEntry rhs = ((MatrixDSEntry) obj);
        return new EqualsBuilder().append(matrixDSSourceAddress, rhs.matrixDSSourceAddress).append(matrixDSDestAddress, rhs.matrixDSDestAddress).append(matrixDSIndex, rhs.matrixDSIndex).append(matrixDSPkts, rhs.matrixDSPkts).append(matrixDSOctets, rhs.matrixDSOctets).append(matrixDSErrors, rhs.matrixDSErrors).append(_index, rhs._index).isEquals();
    }

    public MatrixDSEntry clone() {
        MatrixDSEntry _copy = new MatrixDSEntry();
        _copy.matrixDSSourceAddress = matrixDSSourceAddress;
        _copy.matrixDSDestAddress = matrixDSDestAddress;
        _copy.matrixDSIndex = matrixDSIndex;
        _copy.matrixDSPkts = matrixDSPkts;
        _copy.matrixDSOctets = matrixDSOctets;
        _copy.matrixDSErrors = matrixDSErrors;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.6.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "matrixDSSourceAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "matrixDSDestAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "matrixDSIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "matrixDSPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "matrixDSOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "matrixDSErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
