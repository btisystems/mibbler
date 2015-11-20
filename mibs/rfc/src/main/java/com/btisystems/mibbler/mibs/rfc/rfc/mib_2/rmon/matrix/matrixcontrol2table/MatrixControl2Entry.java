
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.matrix.matrixcontrol2table;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.matrix.matrixcontrol2table.IMatrixControl2Entry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.matrix.MatrixControl2Table;
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

public class MatrixControl2Entry
    extends DeviceEntity
    implements Serializable, IMatrixControl2Entry, IIndexed, IVariableBindingSetter
{

    private int matrixControlDroppedFrames;
    private int matrixControlCreateTime;
    private String _index;
    private MatrixControl2Table parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MatrixControl2Entry() {
    }

    public int getMatrixControlDroppedFrames() {
        return this.matrixControlDroppedFrames;
    }

    public void setMatrixControlDroppedFrames(int matrixControlDroppedFrames) {
        int oldValue = getMatrixControlDroppedFrames();
        this.matrixControlDroppedFrames = matrixControlDroppedFrames;
        notifyChange(1, oldValue, matrixControlDroppedFrames);
    }

    public int getMatrixControlCreateTime() {
        return this.matrixControlCreateTime;
    }

    public void setMatrixControlCreateTime(int matrixControlCreateTime) {
        int oldValue = getMatrixControlCreateTime();
        this.matrixControlCreateTime = matrixControlCreateTime;
        notifyChange(2, oldValue, matrixControlCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setMatrixControlDroppedFrames(binding.getVariable().toInt());
                break;
            case  2 :
                setMatrixControlCreateTime(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MatrixControl2Table table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("matrixControlDroppedFrames", matrixControlDroppedFrames).append("matrixControlCreateTime", matrixControlCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(matrixControlDroppedFrames).append(matrixControlCreateTime).append(_index).toHashCode();
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
        MatrixControl2Entry rhs = ((MatrixControl2Entry) obj);
        return new EqualsBuilder().append(matrixControlDroppedFrames, rhs.matrixControlDroppedFrames).append(matrixControlCreateTime, rhs.matrixControlCreateTime).append(_index, rhs._index).isEquals();
    }

    public MatrixControl2Entry clone() {
        MatrixControl2Entry _copy = new MatrixControl2Entry();
        _copy.matrixControlDroppedFrames = matrixControlDroppedFrames;
        _copy.matrixControlCreateTime = matrixControlCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.6.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "matrixControlDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "matrixControlCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
