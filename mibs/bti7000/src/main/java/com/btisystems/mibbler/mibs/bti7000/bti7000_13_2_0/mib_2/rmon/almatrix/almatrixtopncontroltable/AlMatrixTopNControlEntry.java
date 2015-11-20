
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.almatrix.almatrixtopncontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.almatrix.AlMatrixTopNControlTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.almatrix.almatrixtopncontroltable.IAlMatrixTopNControlEntry;
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

public class AlMatrixTopNControlEntry
    extends DeviceEntity
    implements Serializable, IAlMatrixTopNControlEntry, IIndexed, IVariableBindingSetter
{

    private int alMatrixTopNControlIndex;
    private int alMatrixTopNControlMatrixIndex;
    private int alMatrixTopNControlRateBase;
    private Integer alMatrixTopNControlTimeRemaining;
    private int alMatrixTopNControlGeneratedReports;
    private int alMatrixTopNControlDuration;
    private Integer alMatrixTopNControlRequestedSize;
    private int alMatrixTopNControlGrantedSize;
    private int alMatrixTopNControlStartTime;
    private String alMatrixTopNControlOwner;
    private int alMatrixTopNControlStatus;
    private String _index;
    private AlMatrixTopNControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AlMatrixTopNControlEntry() {
    }

    public int getAlMatrixTopNControlIndex() {
        return this.alMatrixTopNControlIndex;
    }

    public void setAlMatrixTopNControlIndex(int alMatrixTopNControlIndex) {
        int oldValue = getAlMatrixTopNControlIndex();
        this.alMatrixTopNControlIndex = alMatrixTopNControlIndex;
        notifyChange(1, oldValue, alMatrixTopNControlIndex);
    }

    public int getAlMatrixTopNControlMatrixIndex() {
        return this.alMatrixTopNControlMatrixIndex;
    }

    public void setAlMatrixTopNControlMatrixIndex(int alMatrixTopNControlMatrixIndex) {
        int oldValue = getAlMatrixTopNControlMatrixIndex();
        this.alMatrixTopNControlMatrixIndex = alMatrixTopNControlMatrixIndex;
        notifyChange(2, oldValue, alMatrixTopNControlMatrixIndex);
    }

    public int getAlMatrixTopNControlRateBase() {
        return this.alMatrixTopNControlRateBase;
    }

    public void setAlMatrixTopNControlRateBase(int alMatrixTopNControlRateBase) {
        int oldValue = getAlMatrixTopNControlRateBase();
        this.alMatrixTopNControlRateBase = alMatrixTopNControlRateBase;
        notifyChange(3, oldValue, alMatrixTopNControlRateBase);
    }

    public int getAlMatrixTopNControlTimeRemaining() {
        if (this.alMatrixTopNControlTimeRemaining == null) {
            return  1800;
        }
        return this.alMatrixTopNControlTimeRemaining;
    }

    public boolean isAlMatrixTopNControlTimeRemainingDefined() {
        return (this.alMatrixTopNControlTimeRemaining!= null);
    }

    public void setAlMatrixTopNControlTimeRemaining(int alMatrixTopNControlTimeRemaining) {
        int oldValue = getAlMatrixTopNControlTimeRemaining();
        this.alMatrixTopNControlTimeRemaining = alMatrixTopNControlTimeRemaining;
        notifyChange(4, oldValue, alMatrixTopNControlTimeRemaining);
    }

    public int getAlMatrixTopNControlGeneratedReports() {
        return this.alMatrixTopNControlGeneratedReports;
    }

    public void setAlMatrixTopNControlGeneratedReports(int alMatrixTopNControlGeneratedReports) {
        int oldValue = getAlMatrixTopNControlGeneratedReports();
        this.alMatrixTopNControlGeneratedReports = alMatrixTopNControlGeneratedReports;
        notifyChange(5, oldValue, alMatrixTopNControlGeneratedReports);
    }

    public int getAlMatrixTopNControlDuration() {
        return this.alMatrixTopNControlDuration;
    }

    public void setAlMatrixTopNControlDuration(int alMatrixTopNControlDuration) {
        int oldValue = getAlMatrixTopNControlDuration();
        this.alMatrixTopNControlDuration = alMatrixTopNControlDuration;
        notifyChange(6, oldValue, alMatrixTopNControlDuration);
    }

    public int getAlMatrixTopNControlRequestedSize() {
        if (this.alMatrixTopNControlRequestedSize == null) {
            return  150;
        }
        return this.alMatrixTopNControlRequestedSize;
    }

    public boolean isAlMatrixTopNControlRequestedSizeDefined() {
        return (this.alMatrixTopNControlRequestedSize!= null);
    }

    public void setAlMatrixTopNControlRequestedSize(int alMatrixTopNControlRequestedSize) {
        int oldValue = getAlMatrixTopNControlRequestedSize();
        this.alMatrixTopNControlRequestedSize = alMatrixTopNControlRequestedSize;
        notifyChange(7, oldValue, alMatrixTopNControlRequestedSize);
    }

    public int getAlMatrixTopNControlGrantedSize() {
        return this.alMatrixTopNControlGrantedSize;
    }

    public void setAlMatrixTopNControlGrantedSize(int alMatrixTopNControlGrantedSize) {
        int oldValue = getAlMatrixTopNControlGrantedSize();
        this.alMatrixTopNControlGrantedSize = alMatrixTopNControlGrantedSize;
        notifyChange(8, oldValue, alMatrixTopNControlGrantedSize);
    }

    public int getAlMatrixTopNControlStartTime() {
        return this.alMatrixTopNControlStartTime;
    }

    public void setAlMatrixTopNControlStartTime(int alMatrixTopNControlStartTime) {
        int oldValue = getAlMatrixTopNControlStartTime();
        this.alMatrixTopNControlStartTime = alMatrixTopNControlStartTime;
        notifyChange(9, oldValue, alMatrixTopNControlStartTime);
    }

    public String getAlMatrixTopNControlOwner() {
        return this.alMatrixTopNControlOwner;
    }

    public void setAlMatrixTopNControlOwner(String alMatrixTopNControlOwner) {
        String oldValue = getAlMatrixTopNControlOwner();
        this.alMatrixTopNControlOwner = alMatrixTopNControlOwner;
        notifyChange(10, oldValue, alMatrixTopNControlOwner);
    }

    public int getAlMatrixTopNControlStatus() {
        return this.alMatrixTopNControlStatus;
    }

    public void setAlMatrixTopNControlStatus(int alMatrixTopNControlStatus) {
        int oldValue = getAlMatrixTopNControlStatus();
        this.alMatrixTopNControlStatus = alMatrixTopNControlStatus;
        notifyChange(11, oldValue, alMatrixTopNControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setAlMatrixTopNControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setAlMatrixTopNControlMatrixIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setAlMatrixTopNControlRateBase(binding.getVariable().toInt());
                break;
            case  4 :
                setAlMatrixTopNControlTimeRemaining(binding.getVariable().toInt());
                break;
            case  5 :
                setAlMatrixTopNControlGeneratedReports(binding.getVariable().toInt());
                break;
            case  6 :
                setAlMatrixTopNControlDuration(binding.getVariable().toInt());
                break;
            case  7 :
                setAlMatrixTopNControlRequestedSize(binding.getVariable().toInt());
                break;
            case  8 :
                setAlMatrixTopNControlGrantedSize(binding.getVariable().toInt());
                break;
            case  9 :
                setAlMatrixTopNControlStartTime(binding.getVariable().toInt());
                break;
            case  10 :
                setAlMatrixTopNControlOwner(binding.getVariable().toString());
                break;
            case  11 :
                setAlMatrixTopNControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setAlMatrixTopNControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AlMatrixTopNControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alMatrixTopNControlIndex", alMatrixTopNControlIndex).append("alMatrixTopNControlMatrixIndex", alMatrixTopNControlMatrixIndex).append("alMatrixTopNControlRateBase", alMatrixTopNControlRateBase).append("alMatrixTopNControlTimeRemaining", alMatrixTopNControlTimeRemaining).append("alMatrixTopNControlGeneratedReports", alMatrixTopNControlGeneratedReports).append("alMatrixTopNControlDuration", alMatrixTopNControlDuration).append("alMatrixTopNControlRequestedSize", alMatrixTopNControlRequestedSize).append("alMatrixTopNControlGrantedSize", alMatrixTopNControlGrantedSize).append("alMatrixTopNControlStartTime", alMatrixTopNControlStartTime).append("alMatrixTopNControlOwner", alMatrixTopNControlOwner).append("alMatrixTopNControlStatus", alMatrixTopNControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alMatrixTopNControlIndex).append(alMatrixTopNControlMatrixIndex).append(alMatrixTopNControlRateBase).append(alMatrixTopNControlTimeRemaining).append(alMatrixTopNControlGeneratedReports).append(alMatrixTopNControlDuration).append(alMatrixTopNControlRequestedSize).append(alMatrixTopNControlGrantedSize).append(alMatrixTopNControlStartTime).append(alMatrixTopNControlOwner).append(alMatrixTopNControlStatus).append(_index).toHashCode();
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
        AlMatrixTopNControlEntry rhs = ((AlMatrixTopNControlEntry) obj);
        return new EqualsBuilder().append(alMatrixTopNControlIndex, rhs.alMatrixTopNControlIndex).append(alMatrixTopNControlMatrixIndex, rhs.alMatrixTopNControlMatrixIndex).append(alMatrixTopNControlRateBase, rhs.alMatrixTopNControlRateBase).append(alMatrixTopNControlTimeRemaining, rhs.alMatrixTopNControlTimeRemaining).append(alMatrixTopNControlGeneratedReports, rhs.alMatrixTopNControlGeneratedReports).append(alMatrixTopNControlDuration, rhs.alMatrixTopNControlDuration).append(alMatrixTopNControlRequestedSize, rhs.alMatrixTopNControlRequestedSize).append(alMatrixTopNControlGrantedSize, rhs.alMatrixTopNControlGrantedSize).append(alMatrixTopNControlStartTime, rhs.alMatrixTopNControlStartTime).append(alMatrixTopNControlOwner, rhs.alMatrixTopNControlOwner).append(alMatrixTopNControlStatus, rhs.alMatrixTopNControlStatus).append(_index, rhs._index).isEquals();
    }

    public AlMatrixTopNControlEntry clone() {
        AlMatrixTopNControlEntry _copy = new AlMatrixTopNControlEntry();
        _copy.alMatrixTopNControlIndex = alMatrixTopNControlIndex;
        _copy.alMatrixTopNControlMatrixIndex = alMatrixTopNControlMatrixIndex;
        _copy.alMatrixTopNControlRateBase = alMatrixTopNControlRateBase;
        _copy.alMatrixTopNControlTimeRemaining = alMatrixTopNControlTimeRemaining;
        _copy.alMatrixTopNControlGeneratedReports = alMatrixTopNControlGeneratedReports;
        _copy.alMatrixTopNControlDuration = alMatrixTopNControlDuration;
        _copy.alMatrixTopNControlRequestedSize = alMatrixTopNControlRequestedSize;
        _copy.alMatrixTopNControlGrantedSize = alMatrixTopNControlGrantedSize;
        _copy.alMatrixTopNControlStartTime = alMatrixTopNControlStartTime;
        _copy.alMatrixTopNControlOwner = alMatrixTopNControlOwner;
        _copy.alMatrixTopNControlStatus = alMatrixTopNControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.17.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alMatrixTopNControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "alMatrixTopNControlMatrixIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "alMatrixTopNControlRateBase", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "alMatrixTopNControlTimeRemaining", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "alMatrixTopNControlGeneratedReports", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "alMatrixTopNControlDuration", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "alMatrixTopNControlRequestedSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "alMatrixTopNControlGrantedSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "alMatrixTopNControlStartTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "alMatrixTopNControlOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "alMatrixTopNControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
