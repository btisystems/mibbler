
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlmatrix.nlmatrixtopncontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlmatrix.NlMatrixTopNControlTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlmatrix.nlmatrixtopncontroltable.INlMatrixTopNControlEntry;
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

public class NlMatrixTopNControlEntry
    extends DeviceEntity
    implements Serializable, INlMatrixTopNControlEntry, IIndexed, IVariableBindingSetter
{

    private int nlMatrixTopNControlIndex;
    private int nlMatrixTopNControlMatrixIndex;
    private int nlMatrixTopNControlRateBase;
    private Integer nlMatrixTopNControlTimeRemaining;
    private int nlMatrixTopNControlGeneratedReports;
    private int nlMatrixTopNControlDuration;
    private Integer nlMatrixTopNControlRequestedSize;
    private int nlMatrixTopNControlGrantedSize;
    private int nlMatrixTopNControlStartTime;
    private String nlMatrixTopNControlOwner;
    private int nlMatrixTopNControlStatus;
    private String _index;
    private NlMatrixTopNControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlMatrixTopNControlEntry() {
    }

    public int getNlMatrixTopNControlIndex() {
        return this.nlMatrixTopNControlIndex;
    }

    public void setNlMatrixTopNControlIndex(int nlMatrixTopNControlIndex) {
        int oldValue = getNlMatrixTopNControlIndex();
        this.nlMatrixTopNControlIndex = nlMatrixTopNControlIndex;
        notifyChange(1, oldValue, nlMatrixTopNControlIndex);
    }

    public int getNlMatrixTopNControlMatrixIndex() {
        return this.nlMatrixTopNControlMatrixIndex;
    }

    public void setNlMatrixTopNControlMatrixIndex(int nlMatrixTopNControlMatrixIndex) {
        int oldValue = getNlMatrixTopNControlMatrixIndex();
        this.nlMatrixTopNControlMatrixIndex = nlMatrixTopNControlMatrixIndex;
        notifyChange(2, oldValue, nlMatrixTopNControlMatrixIndex);
    }

    public int getNlMatrixTopNControlRateBase() {
        return this.nlMatrixTopNControlRateBase;
    }

    public void setNlMatrixTopNControlRateBase(int nlMatrixTopNControlRateBase) {
        int oldValue = getNlMatrixTopNControlRateBase();
        this.nlMatrixTopNControlRateBase = nlMatrixTopNControlRateBase;
        notifyChange(3, oldValue, nlMatrixTopNControlRateBase);
    }

    public int getNlMatrixTopNControlTimeRemaining() {
        if (this.nlMatrixTopNControlTimeRemaining == null) {
            return  1800;
        }
        return this.nlMatrixTopNControlTimeRemaining;
    }

    public boolean isNlMatrixTopNControlTimeRemainingDefined() {
        return (this.nlMatrixTopNControlTimeRemaining!= null);
    }

    public void setNlMatrixTopNControlTimeRemaining(int nlMatrixTopNControlTimeRemaining) {
        int oldValue = getNlMatrixTopNControlTimeRemaining();
        this.nlMatrixTopNControlTimeRemaining = nlMatrixTopNControlTimeRemaining;
        notifyChange(4, oldValue, nlMatrixTopNControlTimeRemaining);
    }

    public int getNlMatrixTopNControlGeneratedReports() {
        return this.nlMatrixTopNControlGeneratedReports;
    }

    public void setNlMatrixTopNControlGeneratedReports(int nlMatrixTopNControlGeneratedReports) {
        int oldValue = getNlMatrixTopNControlGeneratedReports();
        this.nlMatrixTopNControlGeneratedReports = nlMatrixTopNControlGeneratedReports;
        notifyChange(5, oldValue, nlMatrixTopNControlGeneratedReports);
    }

    public int getNlMatrixTopNControlDuration() {
        return this.nlMatrixTopNControlDuration;
    }

    public void setNlMatrixTopNControlDuration(int nlMatrixTopNControlDuration) {
        int oldValue = getNlMatrixTopNControlDuration();
        this.nlMatrixTopNControlDuration = nlMatrixTopNControlDuration;
        notifyChange(6, oldValue, nlMatrixTopNControlDuration);
    }

    public int getNlMatrixTopNControlRequestedSize() {
        if (this.nlMatrixTopNControlRequestedSize == null) {
            return  150;
        }
        return this.nlMatrixTopNControlRequestedSize;
    }

    public boolean isNlMatrixTopNControlRequestedSizeDefined() {
        return (this.nlMatrixTopNControlRequestedSize!= null);
    }

    public void setNlMatrixTopNControlRequestedSize(int nlMatrixTopNControlRequestedSize) {
        int oldValue = getNlMatrixTopNControlRequestedSize();
        this.nlMatrixTopNControlRequestedSize = nlMatrixTopNControlRequestedSize;
        notifyChange(7, oldValue, nlMatrixTopNControlRequestedSize);
    }

    public int getNlMatrixTopNControlGrantedSize() {
        return this.nlMatrixTopNControlGrantedSize;
    }

    public void setNlMatrixTopNControlGrantedSize(int nlMatrixTopNControlGrantedSize) {
        int oldValue = getNlMatrixTopNControlGrantedSize();
        this.nlMatrixTopNControlGrantedSize = nlMatrixTopNControlGrantedSize;
        notifyChange(8, oldValue, nlMatrixTopNControlGrantedSize);
    }

    public int getNlMatrixTopNControlStartTime() {
        return this.nlMatrixTopNControlStartTime;
    }

    public void setNlMatrixTopNControlStartTime(int nlMatrixTopNControlStartTime) {
        int oldValue = getNlMatrixTopNControlStartTime();
        this.nlMatrixTopNControlStartTime = nlMatrixTopNControlStartTime;
        notifyChange(9, oldValue, nlMatrixTopNControlStartTime);
    }

    public String getNlMatrixTopNControlOwner() {
        return this.nlMatrixTopNControlOwner;
    }

    public void setNlMatrixTopNControlOwner(String nlMatrixTopNControlOwner) {
        String oldValue = getNlMatrixTopNControlOwner();
        this.nlMatrixTopNControlOwner = nlMatrixTopNControlOwner;
        notifyChange(10, oldValue, nlMatrixTopNControlOwner);
    }

    public int getNlMatrixTopNControlStatus() {
        return this.nlMatrixTopNControlStatus;
    }

    public void setNlMatrixTopNControlStatus(int nlMatrixTopNControlStatus) {
        int oldValue = getNlMatrixTopNControlStatus();
        this.nlMatrixTopNControlStatus = nlMatrixTopNControlStatus;
        notifyChange(11, oldValue, nlMatrixTopNControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setNlMatrixTopNControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setNlMatrixTopNControlMatrixIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setNlMatrixTopNControlRateBase(binding.getVariable().toInt());
                break;
            case  4 :
                setNlMatrixTopNControlTimeRemaining(binding.getVariable().toInt());
                break;
            case  5 :
                setNlMatrixTopNControlGeneratedReports(binding.getVariable().toInt());
                break;
            case  6 :
                setNlMatrixTopNControlDuration(binding.getVariable().toInt());
                break;
            case  7 :
                setNlMatrixTopNControlRequestedSize(binding.getVariable().toInt());
                break;
            case  8 :
                setNlMatrixTopNControlGrantedSize(binding.getVariable().toInt());
                break;
            case  9 :
                setNlMatrixTopNControlStartTime(binding.getVariable().toInt());
                break;
            case  10 :
                setNlMatrixTopNControlOwner(binding.getVariable().toString());
                break;
            case  11 :
                setNlMatrixTopNControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setNlMatrixTopNControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(NlMatrixTopNControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlMatrixTopNControlIndex", nlMatrixTopNControlIndex).append("nlMatrixTopNControlMatrixIndex", nlMatrixTopNControlMatrixIndex).append("nlMatrixTopNControlRateBase", nlMatrixTopNControlRateBase).append("nlMatrixTopNControlTimeRemaining", nlMatrixTopNControlTimeRemaining).append("nlMatrixTopNControlGeneratedReports", nlMatrixTopNControlGeneratedReports).append("nlMatrixTopNControlDuration", nlMatrixTopNControlDuration).append("nlMatrixTopNControlRequestedSize", nlMatrixTopNControlRequestedSize).append("nlMatrixTopNControlGrantedSize", nlMatrixTopNControlGrantedSize).append("nlMatrixTopNControlStartTime", nlMatrixTopNControlStartTime).append("nlMatrixTopNControlOwner", nlMatrixTopNControlOwner).append("nlMatrixTopNControlStatus", nlMatrixTopNControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlMatrixTopNControlIndex).append(nlMatrixTopNControlMatrixIndex).append(nlMatrixTopNControlRateBase).append(nlMatrixTopNControlTimeRemaining).append(nlMatrixTopNControlGeneratedReports).append(nlMatrixTopNControlDuration).append(nlMatrixTopNControlRequestedSize).append(nlMatrixTopNControlGrantedSize).append(nlMatrixTopNControlStartTime).append(nlMatrixTopNControlOwner).append(nlMatrixTopNControlStatus).append(_index).toHashCode();
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
        NlMatrixTopNControlEntry rhs = ((NlMatrixTopNControlEntry) obj);
        return new EqualsBuilder().append(nlMatrixTopNControlIndex, rhs.nlMatrixTopNControlIndex).append(nlMatrixTopNControlMatrixIndex, rhs.nlMatrixTopNControlMatrixIndex).append(nlMatrixTopNControlRateBase, rhs.nlMatrixTopNControlRateBase).append(nlMatrixTopNControlTimeRemaining, rhs.nlMatrixTopNControlTimeRemaining).append(nlMatrixTopNControlGeneratedReports, rhs.nlMatrixTopNControlGeneratedReports).append(nlMatrixTopNControlDuration, rhs.nlMatrixTopNControlDuration).append(nlMatrixTopNControlRequestedSize, rhs.nlMatrixTopNControlRequestedSize).append(nlMatrixTopNControlGrantedSize, rhs.nlMatrixTopNControlGrantedSize).append(nlMatrixTopNControlStartTime, rhs.nlMatrixTopNControlStartTime).append(nlMatrixTopNControlOwner, rhs.nlMatrixTopNControlOwner).append(nlMatrixTopNControlStatus, rhs.nlMatrixTopNControlStatus).append(_index, rhs._index).isEquals();
    }

    public NlMatrixTopNControlEntry clone() {
        NlMatrixTopNControlEntry _copy = new NlMatrixTopNControlEntry();
        _copy.nlMatrixTopNControlIndex = nlMatrixTopNControlIndex;
        _copy.nlMatrixTopNControlMatrixIndex = nlMatrixTopNControlMatrixIndex;
        _copy.nlMatrixTopNControlRateBase = nlMatrixTopNControlRateBase;
        _copy.nlMatrixTopNControlTimeRemaining = nlMatrixTopNControlTimeRemaining;
        _copy.nlMatrixTopNControlGeneratedReports = nlMatrixTopNControlGeneratedReports;
        _copy.nlMatrixTopNControlDuration = nlMatrixTopNControlDuration;
        _copy.nlMatrixTopNControlRequestedSize = nlMatrixTopNControlRequestedSize;
        _copy.nlMatrixTopNControlGrantedSize = nlMatrixTopNControlGrantedSize;
        _copy.nlMatrixTopNControlStartTime = nlMatrixTopNControlStartTime;
        _copy.nlMatrixTopNControlOwner = nlMatrixTopNControlOwner;
        _copy.nlMatrixTopNControlStatus = nlMatrixTopNControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.15.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlMatrixTopNControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "nlMatrixTopNControlMatrixIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "nlMatrixTopNControlRateBase", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "nlMatrixTopNControlTimeRemaining", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "nlMatrixTopNControlGeneratedReports", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "nlMatrixTopNControlDuration", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "nlMatrixTopNControlRequestedSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "nlMatrixTopNControlGrantedSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "nlMatrixTopNControlStartTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "nlMatrixTopNControlOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "nlMatrixTopNControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
