
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.almatrix.almatrixsdtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix.almatrixsdtable.IAlMatrixSDEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.almatrix.AlMatrixSDTable;
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

public class AlMatrixSDEntry
    extends DeviceEntity
    implements Serializable, IAlMatrixSDEntry, IIndexed, IVariableBindingSetter
{

    private int alMatrixSDTimeMark;
    private int alMatrixSDPkts;
    private int alMatrixSDOctets;
    private int alMatrixSDCreateTime;
    private String _index;
    private AlMatrixSDTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AlMatrixSDEntry() {
    }

    public int getAlMatrixSDTimeMark() {
        return this.alMatrixSDTimeMark;
    }

    public void setAlMatrixSDTimeMark(int alMatrixSDTimeMark) {
        int oldValue = getAlMatrixSDTimeMark();
        this.alMatrixSDTimeMark = alMatrixSDTimeMark;
        notifyChange(1, oldValue, alMatrixSDTimeMark);
    }

    public int getAlMatrixSDPkts() {
        return this.alMatrixSDPkts;
    }

    public void setAlMatrixSDPkts(int alMatrixSDPkts) {
        int oldValue = getAlMatrixSDPkts();
        this.alMatrixSDPkts = alMatrixSDPkts;
        notifyChange(2, oldValue, alMatrixSDPkts);
    }

    public int getAlMatrixSDOctets() {
        return this.alMatrixSDOctets;
    }

    public void setAlMatrixSDOctets(int alMatrixSDOctets) {
        int oldValue = getAlMatrixSDOctets();
        this.alMatrixSDOctets = alMatrixSDOctets;
        notifyChange(3, oldValue, alMatrixSDOctets);
    }

    public int getAlMatrixSDCreateTime() {
        return this.alMatrixSDCreateTime;
    }

    public void setAlMatrixSDCreateTime(int alMatrixSDCreateTime) {
        int oldValue = getAlMatrixSDCreateTime();
        this.alMatrixSDCreateTime = alMatrixSDCreateTime;
        notifyChange(4, oldValue, alMatrixSDCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setAlMatrixSDTimeMark(binding.getVariable().toInt());
                break;
            case  2 :
                setAlMatrixSDPkts(binding.getVariable().toInt());
                break;
            case  3 :
                setAlMatrixSDOctets(binding.getVariable().toInt());
                break;
            case  4 :
                setAlMatrixSDCreateTime(binding.getVariable().toInt());
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
        setAlMatrixSDTimeMark(_oidInts[arrayOffset]);
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

    public void _setTable(AlMatrixSDTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alMatrixSDTimeMark", alMatrixSDTimeMark).append("alMatrixSDPkts", alMatrixSDPkts).append("alMatrixSDOctets", alMatrixSDOctets).append("alMatrixSDCreateTime", alMatrixSDCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alMatrixSDTimeMark).append(alMatrixSDPkts).append(alMatrixSDOctets).append(alMatrixSDCreateTime).append(_index).toHashCode();
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
        AlMatrixSDEntry rhs = ((AlMatrixSDEntry) obj);
        return new EqualsBuilder().append(alMatrixSDTimeMark, rhs.alMatrixSDTimeMark).append(alMatrixSDPkts, rhs.alMatrixSDPkts).append(alMatrixSDOctets, rhs.alMatrixSDOctets).append(alMatrixSDCreateTime, rhs.alMatrixSDCreateTime).append(_index, rhs._index).isEquals();
    }

    public AlMatrixSDEntry clone() {
        AlMatrixSDEntry _copy = new AlMatrixSDEntry();
        _copy.alMatrixSDTimeMark = alMatrixSDTimeMark;
        _copy.alMatrixSDPkts = alMatrixSDPkts;
        _copy.alMatrixSDOctets = alMatrixSDOctets;
        _copy.alMatrixSDCreateTime = alMatrixSDCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.17.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alMatrixSDTimeMark", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "alMatrixSDPkts", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "alMatrixSDOctets", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "alMatrixSDCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
