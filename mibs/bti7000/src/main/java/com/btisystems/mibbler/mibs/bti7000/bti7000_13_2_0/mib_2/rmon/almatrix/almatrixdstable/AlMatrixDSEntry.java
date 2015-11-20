
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.almatrix.almatrixdstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.almatrix.AlMatrixDSTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.almatrix.almatrixdstable.IAlMatrixDSEntry;
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

public class AlMatrixDSEntry
    extends DeviceEntity
    implements Serializable, IAlMatrixDSEntry, IIndexed, IVariableBindingSetter
{

    private int alMatrixDSTimeMark;
    private int alMatrixDSPkts;
    private int alMatrixDSOctets;
    private int alMatrixDSCreateTime;
    private String _index;
    private AlMatrixDSTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AlMatrixDSEntry() {
    }

    public int getAlMatrixDSTimeMark() {
        return this.alMatrixDSTimeMark;
    }

    public void setAlMatrixDSTimeMark(int alMatrixDSTimeMark) {
        int oldValue = getAlMatrixDSTimeMark();
        this.alMatrixDSTimeMark = alMatrixDSTimeMark;
        notifyChange(1, oldValue, alMatrixDSTimeMark);
    }

    public int getAlMatrixDSPkts() {
        return this.alMatrixDSPkts;
    }

    public void setAlMatrixDSPkts(int alMatrixDSPkts) {
        int oldValue = getAlMatrixDSPkts();
        this.alMatrixDSPkts = alMatrixDSPkts;
        notifyChange(2, oldValue, alMatrixDSPkts);
    }

    public int getAlMatrixDSOctets() {
        return this.alMatrixDSOctets;
    }

    public void setAlMatrixDSOctets(int alMatrixDSOctets) {
        int oldValue = getAlMatrixDSOctets();
        this.alMatrixDSOctets = alMatrixDSOctets;
        notifyChange(3, oldValue, alMatrixDSOctets);
    }

    public int getAlMatrixDSCreateTime() {
        return this.alMatrixDSCreateTime;
    }

    public void setAlMatrixDSCreateTime(int alMatrixDSCreateTime) {
        int oldValue = getAlMatrixDSCreateTime();
        this.alMatrixDSCreateTime = alMatrixDSCreateTime;
        notifyChange(4, oldValue, alMatrixDSCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setAlMatrixDSTimeMark(binding.getVariable().toInt());
                break;
            case  2 :
                setAlMatrixDSPkts(binding.getVariable().toInt());
                break;
            case  3 :
                setAlMatrixDSOctets(binding.getVariable().toInt());
                break;
            case  4 :
                setAlMatrixDSCreateTime(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        arrayOffset += 1;
        setAlMatrixDSTimeMark(_oidInts[arrayOffset]);
        arrayOffset += 1;
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        arrayOffset += _len;
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AlMatrixDSTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alMatrixDSTimeMark", alMatrixDSTimeMark).append("alMatrixDSPkts", alMatrixDSPkts).append("alMatrixDSOctets", alMatrixDSOctets).append("alMatrixDSCreateTime", alMatrixDSCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alMatrixDSTimeMark).append(alMatrixDSPkts).append(alMatrixDSOctets).append(alMatrixDSCreateTime).append(_index).toHashCode();
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
        AlMatrixDSEntry rhs = ((AlMatrixDSEntry) obj);
        return new EqualsBuilder().append(alMatrixDSTimeMark, rhs.alMatrixDSTimeMark).append(alMatrixDSPkts, rhs.alMatrixDSPkts).append(alMatrixDSOctets, rhs.alMatrixDSOctets).append(alMatrixDSCreateTime, rhs.alMatrixDSCreateTime).append(_index, rhs._index).isEquals();
    }

    public AlMatrixDSEntry clone() {
        AlMatrixDSEntry _copy = new AlMatrixDSEntry();
        _copy.alMatrixDSTimeMark = alMatrixDSTimeMark;
        _copy.alMatrixDSPkts = alMatrixDSPkts;
        _copy.alMatrixDSOctets = alMatrixDSOctets;
        _copy.alMatrixDSCreateTime = alMatrixDSCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.17.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alMatrixDSTimeMark", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "alMatrixDSPkts", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "alMatrixDSOctets", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "alMatrixDSCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
