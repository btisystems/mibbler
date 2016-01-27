
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.matrix.matrixsdtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.matrix.matrixsdtable.IMatrixSDEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.matrix.MatrixSDTable;
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

public class MatrixSDEntry
    extends DeviceEntity
    implements Serializable, IMatrixSDEntry, IIndexed, IVariableBindingSetter
{

    private String matrixSDSourceAddress;
    private String matrixSDDestAddress;
    private int matrixSDIndex;
    private int matrixSDPkts;
    private int matrixSDOctets;
    private int matrixSDErrors;
    private String _index;
    private MatrixSDTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MatrixSDEntry() {
    }

    public String getMatrixSDSourceAddress() {
        return this.matrixSDSourceAddress;
    }

    public void setMatrixSDSourceAddress(String matrixSDSourceAddress) {
        String oldValue = getMatrixSDSourceAddress();
        this.matrixSDSourceAddress = matrixSDSourceAddress;
        notifyChange(1, oldValue, matrixSDSourceAddress);
    }

    public String getMatrixSDDestAddress() {
        return this.matrixSDDestAddress;
    }

    public void setMatrixSDDestAddress(String matrixSDDestAddress) {
        String oldValue = getMatrixSDDestAddress();
        this.matrixSDDestAddress = matrixSDDestAddress;
        notifyChange(2, oldValue, matrixSDDestAddress);
    }

    public int getMatrixSDIndex() {
        return this.matrixSDIndex;
    }

    public void setMatrixSDIndex(int matrixSDIndex) {
        int oldValue = getMatrixSDIndex();
        this.matrixSDIndex = matrixSDIndex;
        notifyChange(3, oldValue, matrixSDIndex);
    }

    public int getMatrixSDPkts() {
        return this.matrixSDPkts;
    }

    public void setMatrixSDPkts(int matrixSDPkts) {
        int oldValue = getMatrixSDPkts();
        this.matrixSDPkts = matrixSDPkts;
        notifyChange(4, oldValue, matrixSDPkts);
    }

    public int getMatrixSDOctets() {
        return this.matrixSDOctets;
    }

    public void setMatrixSDOctets(int matrixSDOctets) {
        int oldValue = getMatrixSDOctets();
        this.matrixSDOctets = matrixSDOctets;
        notifyChange(5, oldValue, matrixSDOctets);
    }

    public int getMatrixSDErrors() {
        return this.matrixSDErrors;
    }

    public void setMatrixSDErrors(int matrixSDErrors) {
        int oldValue = getMatrixSDErrors();
        this.matrixSDErrors = matrixSDErrors;
        notifyChange(6, oldValue, matrixSDErrors);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setMatrixSDSourceAddress(binding.getVariable().toString());
                break;
            case  2 :
                setMatrixSDDestAddress(binding.getVariable().toString());
                break;
            case  3 :
                setMatrixSDIndex(binding.getVariable().toInt());
                break;
            case  4 :
                setMatrixSDPkts(binding.getVariable().toInt());
                break;
            case  5 :
                setMatrixSDOctets(binding.getVariable().toInt());
                break;
            case  6 :
                setMatrixSDErrors(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setMatrixSDIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setMatrixSDSourceAddress(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setMatrixSDDestAddress(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MatrixSDTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("matrixSDSourceAddress", matrixSDSourceAddress).append("matrixSDDestAddress", matrixSDDestAddress).append("matrixSDIndex", matrixSDIndex).append("matrixSDPkts", matrixSDPkts).append("matrixSDOctets", matrixSDOctets).append("matrixSDErrors", matrixSDErrors).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(matrixSDSourceAddress).append(matrixSDDestAddress).append(matrixSDIndex).append(matrixSDPkts).append(matrixSDOctets).append(matrixSDErrors).append(_index).toHashCode();
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
        MatrixSDEntry rhs = ((MatrixSDEntry) obj);
        return new EqualsBuilder().append(matrixSDSourceAddress, rhs.matrixSDSourceAddress).append(matrixSDDestAddress, rhs.matrixSDDestAddress).append(matrixSDIndex, rhs.matrixSDIndex).append(matrixSDPkts, rhs.matrixSDPkts).append(matrixSDOctets, rhs.matrixSDOctets).append(matrixSDErrors, rhs.matrixSDErrors).append(_index, rhs._index).isEquals();
    }

    public MatrixSDEntry clone() {
        MatrixSDEntry _copy = new MatrixSDEntry();
        _copy.matrixSDSourceAddress = matrixSDSourceAddress;
        _copy.matrixSDDestAddress = matrixSDDestAddress;
        _copy.matrixSDIndex = matrixSDIndex;
        _copy.matrixSDPkts = matrixSDPkts;
        _copy.matrixSDOctets = matrixSDOctets;
        _copy.matrixSDErrors = matrixSDErrors;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.6.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "matrixSDSourceAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "matrixSDDestAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "matrixSDIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "matrixSDPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "matrixSDOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "matrixSDErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
