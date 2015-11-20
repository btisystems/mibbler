
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.synchronization.cpsynchronizationtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.synchronization.CpSynchronizationTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.synchronization.cpsynchronizationtable.ICpSynchronizationEntry;
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

public class CpSynchronizationEntry
    extends DeviceEntity
    implements Serializable, ICpSynchronizationEntry, IIndexed, IVariableBindingSetter
{

    private int cpSynchronizationTypeIdx;
    private int cpSynchronizationShelfIdx;
    private int cpSynchronizationSlotIdx;
    private int cpSynchronizationTimingMode;
    private int cpSynchronizationPrimRefSrcPortNum;
    private int cpSynchronizationPrimRefProtStatus;
    private String cpSynchronizationPrimProtStatQlfr;
    private int cpSynchronizationSecRefSrcPortNum;
    private int cpSynchronizationSecRefProtStatus;
    private String cpSynchronizationSecProtStatQlfr;
    private Integer cpSynchronizationPrimRefBasicSSM;
    private Integer cpSynchronizationSecRefBasicSSM;
    private int cpSynchronizationSwEvtType;
    private String _index;
    private CpSynchronizationTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public CpSynchronizationEntry() {
    }

    public int getCpSynchronizationTypeIdx() {
        return this.cpSynchronizationTypeIdx;
    }

    public void setCpSynchronizationTypeIdx(int cpSynchronizationTypeIdx) {
        int oldValue = getCpSynchronizationTypeIdx();
        this.cpSynchronizationTypeIdx = cpSynchronizationTypeIdx;
        notifyChange(1, oldValue, cpSynchronizationTypeIdx);
    }

    public int getCpSynchronizationShelfIdx() {
        return this.cpSynchronizationShelfIdx;
    }

    public void setCpSynchronizationShelfIdx(int cpSynchronizationShelfIdx) {
        int oldValue = getCpSynchronizationShelfIdx();
        this.cpSynchronizationShelfIdx = cpSynchronizationShelfIdx;
        notifyChange(2, oldValue, cpSynchronizationShelfIdx);
    }

    public int getCpSynchronizationSlotIdx() {
        return this.cpSynchronizationSlotIdx;
    }

    public void setCpSynchronizationSlotIdx(int cpSynchronizationSlotIdx) {
        int oldValue = getCpSynchronizationSlotIdx();
        this.cpSynchronizationSlotIdx = cpSynchronizationSlotIdx;
        notifyChange(3, oldValue, cpSynchronizationSlotIdx);
    }

    public int getCpSynchronizationTimingMode() {
        return this.cpSynchronizationTimingMode;
    }

    public void setCpSynchronizationTimingMode(int cpSynchronizationTimingMode) {
        int oldValue = getCpSynchronizationTimingMode();
        this.cpSynchronizationTimingMode = cpSynchronizationTimingMode;
        notifyChange(4, oldValue, cpSynchronizationTimingMode);
    }

    public int getCpSynchronizationPrimRefSrcPortNum() {
        return this.cpSynchronizationPrimRefSrcPortNum;
    }

    public void setCpSynchronizationPrimRefSrcPortNum(int cpSynchronizationPrimRefSrcPortNum) {
        int oldValue = getCpSynchronizationPrimRefSrcPortNum();
        this.cpSynchronizationPrimRefSrcPortNum = cpSynchronizationPrimRefSrcPortNum;
        notifyChange(5, oldValue, cpSynchronizationPrimRefSrcPortNum);
    }

    public int getCpSynchronizationPrimRefProtStatus() {
        return this.cpSynchronizationPrimRefProtStatus;
    }

    public void setCpSynchronizationPrimRefProtStatus(int cpSynchronizationPrimRefProtStatus) {
        int oldValue = getCpSynchronizationPrimRefProtStatus();
        this.cpSynchronizationPrimRefProtStatus = cpSynchronizationPrimRefProtStatus;
        notifyChange(6, oldValue, cpSynchronizationPrimRefProtStatus);
    }

    public String getCpSynchronizationPrimProtStatQlfr() {
        return this.cpSynchronizationPrimProtStatQlfr;
    }

    public void setCpSynchronizationPrimProtStatQlfr(String cpSynchronizationPrimProtStatQlfr) {
        String oldValue = getCpSynchronizationPrimProtStatQlfr();
        this.cpSynchronizationPrimProtStatQlfr = cpSynchronizationPrimProtStatQlfr;
        notifyChange(7, oldValue, cpSynchronizationPrimProtStatQlfr);
    }

    public int getCpSynchronizationSecRefSrcPortNum() {
        return this.cpSynchronizationSecRefSrcPortNum;
    }

    public void setCpSynchronizationSecRefSrcPortNum(int cpSynchronizationSecRefSrcPortNum) {
        int oldValue = getCpSynchronizationSecRefSrcPortNum();
        this.cpSynchronizationSecRefSrcPortNum = cpSynchronizationSecRefSrcPortNum;
        notifyChange(8, oldValue, cpSynchronizationSecRefSrcPortNum);
    }

    public int getCpSynchronizationSecRefProtStatus() {
        return this.cpSynchronizationSecRefProtStatus;
    }

    public void setCpSynchronizationSecRefProtStatus(int cpSynchronizationSecRefProtStatus) {
        int oldValue = getCpSynchronizationSecRefProtStatus();
        this.cpSynchronizationSecRefProtStatus = cpSynchronizationSecRefProtStatus;
        notifyChange(9, oldValue, cpSynchronizationSecRefProtStatus);
    }

    public String getCpSynchronizationSecProtStatQlfr() {
        return this.cpSynchronizationSecProtStatQlfr;
    }

    public void setCpSynchronizationSecProtStatQlfr(String cpSynchronizationSecProtStatQlfr) {
        String oldValue = getCpSynchronizationSecProtStatQlfr();
        this.cpSynchronizationSecProtStatQlfr = cpSynchronizationSecProtStatQlfr;
        notifyChange(10, oldValue, cpSynchronizationSecProtStatQlfr);
    }

    public int getCpSynchronizationPrimRefBasicSSM() {
        if (this.cpSynchronizationPrimRefBasicSSM == null) {
            return  2;
        }
        return this.cpSynchronizationPrimRefBasicSSM;
    }

    public boolean isCpSynchronizationPrimRefBasicSSMDefined() {
        return (this.cpSynchronizationPrimRefBasicSSM!= null);
    }

    public void setCpSynchronizationPrimRefBasicSSM(int cpSynchronizationPrimRefBasicSSM) {
        int oldValue = getCpSynchronizationPrimRefBasicSSM();
        this.cpSynchronizationPrimRefBasicSSM = cpSynchronizationPrimRefBasicSSM;
        notifyChange(11, oldValue, cpSynchronizationPrimRefBasicSSM);
    }

    public int getCpSynchronizationSecRefBasicSSM() {
        if (this.cpSynchronizationSecRefBasicSSM == null) {
            return  2;
        }
        return this.cpSynchronizationSecRefBasicSSM;
    }

    public boolean isCpSynchronizationSecRefBasicSSMDefined() {
        return (this.cpSynchronizationSecRefBasicSSM!= null);
    }

    public void setCpSynchronizationSecRefBasicSSM(int cpSynchronizationSecRefBasicSSM) {
        int oldValue = getCpSynchronizationSecRefBasicSSM();
        this.cpSynchronizationSecRefBasicSSM = cpSynchronizationSecRefBasicSSM;
        notifyChange(12, oldValue, cpSynchronizationSecRefBasicSSM);
    }

    public int getCpSynchronizationSwEvtType() {
        return this.cpSynchronizationSwEvtType;
    }

    public void setCpSynchronizationSwEvtType(int cpSynchronizationSwEvtType) {
        int oldValue = getCpSynchronizationSwEvtType();
        this.cpSynchronizationSwEvtType = cpSynchronizationSwEvtType;
        notifyChange(13, oldValue, cpSynchronizationSwEvtType);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setCpSynchronizationTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setCpSynchronizationShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setCpSynchronizationSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setCpSynchronizationTimingMode(binding.getVariable().toInt());
                break;
            case  5 :
                setCpSynchronizationPrimRefSrcPortNum(binding.getVariable().toInt());
                break;
            case  6 :
                setCpSynchronizationPrimRefProtStatus(binding.getVariable().toInt());
                break;
            case  7 :
                setCpSynchronizationPrimProtStatQlfr(binding.getVariable().toString());
                break;
            case  8 :
                setCpSynchronizationSecRefSrcPortNum(binding.getVariable().toInt());
                break;
            case  9 :
                setCpSynchronizationSecRefProtStatus(binding.getVariable().toInt());
                break;
            case  10 :
                setCpSynchronizationSecProtStatQlfr(binding.getVariable().toString());
                break;
            case  11 :
                setCpSynchronizationPrimRefBasicSSM(binding.getVariable().toInt());
                break;
            case  12 :
                setCpSynchronizationSecRefBasicSSM(binding.getVariable().toInt());
                break;
            case  13 :
                setCpSynchronizationSwEvtType(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setCpSynchronizationTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setCpSynchronizationShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setCpSynchronizationSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(CpSynchronizationTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("cpSynchronizationTypeIdx", cpSynchronizationTypeIdx).append("cpSynchronizationShelfIdx", cpSynchronizationShelfIdx).append("cpSynchronizationSlotIdx", cpSynchronizationSlotIdx).append("cpSynchronizationTimingMode", cpSynchronizationTimingMode).append("cpSynchronizationPrimRefSrcPortNum", cpSynchronizationPrimRefSrcPortNum).append("cpSynchronizationPrimRefProtStatus", cpSynchronizationPrimRefProtStatus).append("cpSynchronizationPrimProtStatQlfr", cpSynchronizationPrimProtStatQlfr).append("cpSynchronizationSecRefSrcPortNum", cpSynchronizationSecRefSrcPortNum).append("cpSynchronizationSecRefProtStatus", cpSynchronizationSecRefProtStatus).append("cpSynchronizationSecProtStatQlfr", cpSynchronizationSecProtStatQlfr).append("cpSynchronizationPrimRefBasicSSM", cpSynchronizationPrimRefBasicSSM).append("cpSynchronizationSecRefBasicSSM", cpSynchronizationSecRefBasicSSM).append("cpSynchronizationSwEvtType", cpSynchronizationSwEvtType).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(cpSynchronizationTypeIdx).append(cpSynchronizationShelfIdx).append(cpSynchronizationSlotIdx).append(cpSynchronizationTimingMode).append(cpSynchronizationPrimRefSrcPortNum).append(cpSynchronizationPrimRefProtStatus).append(cpSynchronizationPrimProtStatQlfr).append(cpSynchronizationSecRefSrcPortNum).append(cpSynchronizationSecRefProtStatus).append(cpSynchronizationSecProtStatQlfr).append(cpSynchronizationPrimRefBasicSSM).append(cpSynchronizationSecRefBasicSSM).append(cpSynchronizationSwEvtType).append(_index).toHashCode();
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
        CpSynchronizationEntry rhs = ((CpSynchronizationEntry) obj);
        return new EqualsBuilder().append(cpSynchronizationTypeIdx, rhs.cpSynchronizationTypeIdx).append(cpSynchronizationShelfIdx, rhs.cpSynchronizationShelfIdx).append(cpSynchronizationSlotIdx, rhs.cpSynchronizationSlotIdx).append(cpSynchronizationTimingMode, rhs.cpSynchronizationTimingMode).append(cpSynchronizationPrimRefSrcPortNum, rhs.cpSynchronizationPrimRefSrcPortNum).append(cpSynchronizationPrimRefProtStatus, rhs.cpSynchronizationPrimRefProtStatus).append(cpSynchronizationPrimProtStatQlfr, rhs.cpSynchronizationPrimProtStatQlfr).append(cpSynchronizationSecRefSrcPortNum, rhs.cpSynchronizationSecRefSrcPortNum).append(cpSynchronizationSecRefProtStatus, rhs.cpSynchronizationSecRefProtStatus).append(cpSynchronizationSecProtStatQlfr, rhs.cpSynchronizationSecProtStatQlfr).append(cpSynchronizationPrimRefBasicSSM, rhs.cpSynchronizationPrimRefBasicSSM).append(cpSynchronizationSecRefBasicSSM, rhs.cpSynchronizationSecRefBasicSSM).append(cpSynchronizationSwEvtType, rhs.cpSynchronizationSwEvtType).append(_index, rhs._index).isEquals();
    }

    public CpSynchronizationEntry clone() {
        CpSynchronizationEntry _copy = new CpSynchronizationEntry();
        _copy.cpSynchronizationTypeIdx = cpSynchronizationTypeIdx;
        _copy.cpSynchronizationShelfIdx = cpSynchronizationShelfIdx;
        _copy.cpSynchronizationSlotIdx = cpSynchronizationSlotIdx;
        _copy.cpSynchronizationTimingMode = cpSynchronizationTimingMode;
        _copy.cpSynchronizationPrimRefSrcPortNum = cpSynchronizationPrimRefSrcPortNum;
        _copy.cpSynchronizationPrimRefProtStatus = cpSynchronizationPrimRefProtStatus;
        _copy.cpSynchronizationPrimProtStatQlfr = cpSynchronizationPrimProtStatQlfr;
        _copy.cpSynchronizationSecRefSrcPortNum = cpSynchronizationSecRefSrcPortNum;
        _copy.cpSynchronizationSecRefProtStatus = cpSynchronizationSecRefProtStatus;
        _copy.cpSynchronizationSecProtStatQlfr = cpSynchronizationSecProtStatQlfr;
        _copy.cpSynchronizationPrimRefBasicSSM = cpSynchronizationPrimRefBasicSSM;
        _copy.cpSynchronizationSecRefBasicSSM = cpSynchronizationSecRefBasicSSM;
        _copy.cpSynchronizationSwEvtType = cpSynchronizationSwEvtType;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.12.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "cpSynchronizationTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "cpSynchronizationShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "cpSynchronizationSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "cpSynchronizationTimingMode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "cpSynchronizationPrimRefSrcPortNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "cpSynchronizationPrimRefProtStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "cpSynchronizationPrimProtStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "cpSynchronizationSecRefSrcPortNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "cpSynchronizationSecRefProtStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "cpSynchronizationSecProtStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "cpSynchronizationPrimRefBasicSSM", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "cpSynchronizationSecRefBasicSSM", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "cpSynchronizationSwEvtType", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
