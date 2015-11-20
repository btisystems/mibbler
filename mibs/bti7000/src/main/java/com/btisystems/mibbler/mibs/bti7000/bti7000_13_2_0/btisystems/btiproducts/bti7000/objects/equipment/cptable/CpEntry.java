
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.equipment.cptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.equipment.CpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.equipment.cptable.ICpEntry;
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

public class CpEntry
    extends DeviceEntity
    implements Serializable, ICpEntry, IIndexed, IVariableBindingSetter
{

    private int cpTypeIdx;
    private int cpShelfIdx;
    private int cpSlotIdx;
    private String cpPEC;
    private Integer cpAdminStatus;
    private int cpOperStatus;
    private String cpOperStatQlfr;
    private String cpId;
    private String cpCustom1;
    private String cpCustom2;
    private String cpCustom3;
    private int cpUpgradeStage;
    private int cpUpgradeResult;
    private int cpRowStatus;
    private String _index;
    private CpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public CpEntry() {
    }

    public int getCpTypeIdx() {
        return this.cpTypeIdx;
    }

    public void setCpTypeIdx(int cpTypeIdx) {
        int oldValue = getCpTypeIdx();
        this.cpTypeIdx = cpTypeIdx;
        notifyChange(1, oldValue, cpTypeIdx);
    }

    public int getCpShelfIdx() {
        return this.cpShelfIdx;
    }

    public void setCpShelfIdx(int cpShelfIdx) {
        int oldValue = getCpShelfIdx();
        this.cpShelfIdx = cpShelfIdx;
        notifyChange(2, oldValue, cpShelfIdx);
    }

    public int getCpSlotIdx() {
        return this.cpSlotIdx;
    }

    public void setCpSlotIdx(int cpSlotIdx) {
        int oldValue = getCpSlotIdx();
        this.cpSlotIdx = cpSlotIdx;
        notifyChange(3, oldValue, cpSlotIdx);
    }

    public String getCpPEC() {
        return this.cpPEC;
    }

    public void setCpPEC(String cpPEC) {
        String oldValue = getCpPEC();
        this.cpPEC = cpPEC;
        notifyChange(4, oldValue, cpPEC);
    }

    public int getCpAdminStatus() {
        if (this.cpAdminStatus == null) {
            return  1;
        }
        return this.cpAdminStatus;
    }

    public boolean isCpAdminStatusDefined() {
        return (this.cpAdminStatus!= null);
    }

    public void setCpAdminStatus(int cpAdminStatus) {
        int oldValue = getCpAdminStatus();
        this.cpAdminStatus = cpAdminStatus;
        notifyChange(5, oldValue, cpAdminStatus);
    }

    public int getCpOperStatus() {
        return this.cpOperStatus;
    }

    public void setCpOperStatus(int cpOperStatus) {
        int oldValue = getCpOperStatus();
        this.cpOperStatus = cpOperStatus;
        notifyChange(6, oldValue, cpOperStatus);
    }

    public String getCpOperStatQlfr() {
        return this.cpOperStatQlfr;
    }

    public void setCpOperStatQlfr(String cpOperStatQlfr) {
        String oldValue = getCpOperStatQlfr();
        this.cpOperStatQlfr = cpOperStatQlfr;
        notifyChange(7, oldValue, cpOperStatQlfr);
    }

    public String getCpId() {
        if (this.cpId == null) {
            return "";
        }
        return this.cpId;
    }

    public boolean isCpIdDefined() {
        return (this.cpId!= null);
    }

    public void setCpId(String cpId) {
        String oldValue = getCpId();
        this.cpId = cpId;
        notifyChange(8, oldValue, cpId);
    }

    public String getCpCustom1() {
        if (this.cpCustom1 == null) {
            return "";
        }
        return this.cpCustom1;
    }

    public boolean isCpCustom1Defined() {
        return (this.cpCustom1 != null);
    }

    public void setCpCustom1(String cpCustom1) {
        String oldValue = getCpCustom1();
        this.cpCustom1 = cpCustom1;
        notifyChange(9, oldValue, cpCustom1);
    }

    public String getCpCustom2() {
        if (this.cpCustom2 == null) {
            return "";
        }
        return this.cpCustom2;
    }

    public boolean isCpCustom2Defined() {
        return (this.cpCustom2 != null);
    }

    public void setCpCustom2(String cpCustom2) {
        String oldValue = getCpCustom2();
        this.cpCustom2 = cpCustom2;
        notifyChange(10, oldValue, cpCustom2);
    }

    public String getCpCustom3() {
        if (this.cpCustom3 == null) {
            return "";
        }
        return this.cpCustom3;
    }

    public boolean isCpCustom3Defined() {
        return (this.cpCustom3 != null);
    }

    public void setCpCustom3(String cpCustom3) {
        String oldValue = getCpCustom3();
        this.cpCustom3 = cpCustom3;
        notifyChange(11, oldValue, cpCustom3);
    }

    public int getCpUpgradeStage() {
        return this.cpUpgradeStage;
    }

    public void setCpUpgradeStage(int cpUpgradeStage) {
        int oldValue = getCpUpgradeStage();
        this.cpUpgradeStage = cpUpgradeStage;
        notifyChange(12, oldValue, cpUpgradeStage);
    }

    public int getCpUpgradeResult() {
        return this.cpUpgradeResult;
    }

    public void setCpUpgradeResult(int cpUpgradeResult) {
        int oldValue = getCpUpgradeResult();
        this.cpUpgradeResult = cpUpgradeResult;
        notifyChange(13, oldValue, cpUpgradeResult);
    }

    public int getCpRowStatus() {
        return this.cpRowStatus;
    }

    public void setCpRowStatus(int cpRowStatus) {
        int oldValue = getCpRowStatus();
        this.cpRowStatus = cpRowStatus;
        notifyChange(100, oldValue, cpRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setCpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setCpShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setCpSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setCpPEC(binding.getVariable().toString());
                break;
            case  5 :
                setCpAdminStatus(binding.getVariable().toInt());
                break;
            case  6 :
                setCpOperStatus(binding.getVariable().toInt());
                break;
            case  7 :
                setCpOperStatQlfr(binding.getVariable().toString());
                break;
            case  8 :
                setCpId(binding.getVariable().toString());
                break;
            case  9 :
                setCpCustom1(binding.getVariable().toString());
                break;
            case  10 :
                setCpCustom2(binding.getVariable().toString());
                break;
            case  11 :
                setCpCustom3(binding.getVariable().toString());
                break;
            case  12 :
                setCpUpgradeStage(binding.getVariable().toInt());
                break;
            case  13 :
                setCpUpgradeResult(binding.getVariable().toInt());
                break;
            case  100 :
                setCpRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setCpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setCpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setCpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(CpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("cpTypeIdx", cpTypeIdx).append("cpShelfIdx", cpShelfIdx).append("cpSlotIdx", cpSlotIdx).append("cpPEC", cpPEC).append("cpAdminStatus", cpAdminStatus).append("cpOperStatus", cpOperStatus).append("cpOperStatQlfr", cpOperStatQlfr).append("cpId", cpId).append("cpCustom1", cpCustom1).append("cpCustom2", cpCustom2).append("cpCustom3", cpCustom3).append("cpUpgradeStage", cpUpgradeStage).append("cpUpgradeResult", cpUpgradeResult).append("cpRowStatus", cpRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(cpTypeIdx).append(cpShelfIdx).append(cpSlotIdx).append(cpPEC).append(cpAdminStatus).append(cpOperStatus).append(cpOperStatQlfr).append(cpId).append(cpCustom1).append(cpCustom2).append(cpCustom3).append(cpUpgradeStage).append(cpUpgradeResult).append(cpRowStatus).append(_index).toHashCode();
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
        CpEntry rhs = ((CpEntry) obj);
        return new EqualsBuilder().append(cpTypeIdx, rhs.cpTypeIdx).append(cpShelfIdx, rhs.cpShelfIdx).append(cpSlotIdx, rhs.cpSlotIdx).append(cpPEC, rhs.cpPEC).append(cpAdminStatus, rhs.cpAdminStatus).append(cpOperStatus, rhs.cpOperStatus).append(cpOperStatQlfr, rhs.cpOperStatQlfr).append(cpId, rhs.cpId).append(cpCustom1, rhs.cpCustom1).append(cpCustom2, rhs.cpCustom2).append(cpCustom3, rhs.cpCustom3).append(cpUpgradeStage, rhs.cpUpgradeStage).append(cpUpgradeResult, rhs.cpUpgradeResult).append(cpRowStatus, rhs.cpRowStatus).append(_index, rhs._index).isEquals();
    }

    public CpEntry clone() {
        CpEntry _copy = new CpEntry();
        _copy.cpTypeIdx = cpTypeIdx;
        _copy.cpShelfIdx = cpShelfIdx;
        _copy.cpSlotIdx = cpSlotIdx;
        _copy.cpPEC = cpPEC;
        _copy.cpAdminStatus = cpAdminStatus;
        _copy.cpOperStatus = cpOperStatus;
        _copy.cpOperStatQlfr = cpOperStatQlfr;
        _copy.cpId = cpId;
        _copy.cpCustom1 = cpCustom1;
        _copy.cpCustom2 = cpCustom2;
        _copy.cpCustom3 = cpCustom3;
        _copy.cpUpgradeStage = cpUpgradeStage;
        _copy.cpUpgradeResult = cpUpgradeResult;
        _copy.cpRowStatus = cpRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.3.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "cpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "cpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "cpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "cpPEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "cpAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "cpOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "cpOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "cpId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "cpCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "cpCustom2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "cpCustom3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "cpUpgradeStage", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "cpUpgradeResult", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "cpRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
