
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory.slotinvtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory.SlotInvTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.slotinvtable.ISlotInvEntry;
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

public class SlotInvEntry
    extends DeviceEntity
    implements Serializable, ISlotInvEntry, IIndexed, IVariableBindingSetter
{

    private int slotInvShelfIdx;
    private int slotInvSlotTypeIdx;
    private int slotInvSlotIdx;
    private String slotInvSWVersion;
    private String slotInvPackShortName;
    private String slotInvPackName;
    private String slotInvPackPEC;
    private String slotInvPackCLEI;
    private String slotInvPackSerialNum;
    private int slotInvPackRev;
    private String slotInvPackMfgDate;
    private String slotInvPackMfgLoc;
    private String slotInvPackTestDate;
    private String slotInvPackTestLoc;
    private int slotInvUpgradeStage;
    private int slotInvUpgradeResult;
    private String slotInvPackUSI;
    private int slotInvTempHighTh;
    private int slotInvTempShutdownTh;
    private String _index;
    private SlotInvTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SlotInvEntry() {
    }

    public int getSlotInvShelfIdx() {
        return this.slotInvShelfIdx;
    }

    public void setSlotInvShelfIdx(int slotInvShelfIdx) {
        int oldValue = getSlotInvShelfIdx();
        this.slotInvShelfIdx = slotInvShelfIdx;
        notifyChange(1, oldValue, slotInvShelfIdx);
    }

    public int getSlotInvSlotTypeIdx() {
        return this.slotInvSlotTypeIdx;
    }

    public void setSlotInvSlotTypeIdx(int slotInvSlotTypeIdx) {
        int oldValue = getSlotInvSlotTypeIdx();
        this.slotInvSlotTypeIdx = slotInvSlotTypeIdx;
        notifyChange(2, oldValue, slotInvSlotTypeIdx);
    }

    public int getSlotInvSlotIdx() {
        return this.slotInvSlotIdx;
    }

    public void setSlotInvSlotIdx(int slotInvSlotIdx) {
        int oldValue = getSlotInvSlotIdx();
        this.slotInvSlotIdx = slotInvSlotIdx;
        notifyChange(3, oldValue, slotInvSlotIdx);
    }

    public String getSlotInvSWVersion() {
        return this.slotInvSWVersion;
    }

    public void setSlotInvSWVersion(String slotInvSWVersion) {
        String oldValue = getSlotInvSWVersion();
        this.slotInvSWVersion = slotInvSWVersion;
        notifyChange(4, oldValue, slotInvSWVersion);
    }

    public String getSlotInvPackShortName() {
        return this.slotInvPackShortName;
    }

    public void setSlotInvPackShortName(String slotInvPackShortName) {
        String oldValue = getSlotInvPackShortName();
        this.slotInvPackShortName = slotInvPackShortName;
        notifyChange(5, oldValue, slotInvPackShortName);
    }

    public String getSlotInvPackName() {
        return this.slotInvPackName;
    }

    public void setSlotInvPackName(String slotInvPackName) {
        String oldValue = getSlotInvPackName();
        this.slotInvPackName = slotInvPackName;
        notifyChange(6, oldValue, slotInvPackName);
    }

    public String getSlotInvPackPEC() {
        return this.slotInvPackPEC;
    }

    public void setSlotInvPackPEC(String slotInvPackPEC) {
        String oldValue = getSlotInvPackPEC();
        this.slotInvPackPEC = slotInvPackPEC;
        notifyChange(7, oldValue, slotInvPackPEC);
    }

    public String getSlotInvPackCLEI() {
        return this.slotInvPackCLEI;
    }

    public void setSlotInvPackCLEI(String slotInvPackCLEI) {
        String oldValue = getSlotInvPackCLEI();
        this.slotInvPackCLEI = slotInvPackCLEI;
        notifyChange(8, oldValue, slotInvPackCLEI);
    }

    public String getSlotInvPackSerialNum() {
        return this.slotInvPackSerialNum;
    }

    public void setSlotInvPackSerialNum(String slotInvPackSerialNum) {
        String oldValue = getSlotInvPackSerialNum();
        this.slotInvPackSerialNum = slotInvPackSerialNum;
        notifyChange(9, oldValue, slotInvPackSerialNum);
    }

    public int getSlotInvPackRev() {
        return this.slotInvPackRev;
    }

    public void setSlotInvPackRev(int slotInvPackRev) {
        int oldValue = getSlotInvPackRev();
        this.slotInvPackRev = slotInvPackRev;
        notifyChange(10, oldValue, slotInvPackRev);
    }

    public String getSlotInvPackMfgDate() {
        return this.slotInvPackMfgDate;
    }

    public void setSlotInvPackMfgDate(String slotInvPackMfgDate) {
        String oldValue = getSlotInvPackMfgDate();
        this.slotInvPackMfgDate = slotInvPackMfgDate;
        notifyChange(11, oldValue, slotInvPackMfgDate);
    }

    public String getSlotInvPackMfgLoc() {
        return this.slotInvPackMfgLoc;
    }

    public void setSlotInvPackMfgLoc(String slotInvPackMfgLoc) {
        String oldValue = getSlotInvPackMfgLoc();
        this.slotInvPackMfgLoc = slotInvPackMfgLoc;
        notifyChange(12, oldValue, slotInvPackMfgLoc);
    }

    public String getSlotInvPackTestDate() {
        return this.slotInvPackTestDate;
    }

    public void setSlotInvPackTestDate(String slotInvPackTestDate) {
        String oldValue = getSlotInvPackTestDate();
        this.slotInvPackTestDate = slotInvPackTestDate;
        notifyChange(13, oldValue, slotInvPackTestDate);
    }

    public String getSlotInvPackTestLoc() {
        return this.slotInvPackTestLoc;
    }

    public void setSlotInvPackTestLoc(String slotInvPackTestLoc) {
        String oldValue = getSlotInvPackTestLoc();
        this.slotInvPackTestLoc = slotInvPackTestLoc;
        notifyChange(14, oldValue, slotInvPackTestLoc);
    }

    public int getSlotInvUpgradeStage() {
        return this.slotInvUpgradeStage;
    }

    public void setSlotInvUpgradeStage(int slotInvUpgradeStage) {
        int oldValue = getSlotInvUpgradeStage();
        this.slotInvUpgradeStage = slotInvUpgradeStage;
        notifyChange(15, oldValue, slotInvUpgradeStage);
    }

    public int getSlotInvUpgradeResult() {
        return this.slotInvUpgradeResult;
    }

    public void setSlotInvUpgradeResult(int slotInvUpgradeResult) {
        int oldValue = getSlotInvUpgradeResult();
        this.slotInvUpgradeResult = slotInvUpgradeResult;
        notifyChange(16, oldValue, slotInvUpgradeResult);
    }

    public String getSlotInvPackUSI() {
        return this.slotInvPackUSI;
    }

    public void setSlotInvPackUSI(String slotInvPackUSI) {
        String oldValue = getSlotInvPackUSI();
        this.slotInvPackUSI = slotInvPackUSI;
        notifyChange(17, oldValue, slotInvPackUSI);
    }

    public int getSlotInvTempHighTh() {
        return this.slotInvTempHighTh;
    }

    public void setSlotInvTempHighTh(int slotInvTempHighTh) {
        int oldValue = getSlotInvTempHighTh();
        this.slotInvTempHighTh = slotInvTempHighTh;
        notifyChange(18, oldValue, slotInvTempHighTh);
    }

    public int getSlotInvTempShutdownTh() {
        return this.slotInvTempShutdownTh;
    }

    public void setSlotInvTempShutdownTh(int slotInvTempShutdownTh) {
        int oldValue = getSlotInvTempShutdownTh();
        this.slotInvTempShutdownTh = slotInvTempShutdownTh;
        notifyChange(19, oldValue, slotInvTempShutdownTh);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setSlotInvShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setSlotInvSlotTypeIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setSlotInvSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setSlotInvSWVersion(binding.getVariable().toString());
                break;
            case  5 :
                setSlotInvPackShortName(binding.getVariable().toString());
                break;
            case  6 :
                setSlotInvPackName(binding.getVariable().toString());
                break;
            case  7 :
                setSlotInvPackPEC(binding.getVariable().toString());
                break;
            case  8 :
                setSlotInvPackCLEI(binding.getVariable().toString());
                break;
            case  9 :
                setSlotInvPackSerialNum(binding.getVariable().toString());
                break;
            case  10 :
                setSlotInvPackRev(binding.getVariable().toInt());
                break;
            case  11 :
                setSlotInvPackMfgDate(binding.getVariable().toString());
                break;
            case  12 :
                setSlotInvPackMfgLoc(binding.getVariable().toString());
                break;
            case  13 :
                setSlotInvPackTestDate(binding.getVariable().toString());
                break;
            case  14 :
                setSlotInvPackTestLoc(binding.getVariable().toString());
                break;
            case  15 :
                setSlotInvUpgradeStage(binding.getVariable().toInt());
                break;
            case  16 :
                setSlotInvUpgradeResult(binding.getVariable().toInt());
                break;
            case  17 :
                setSlotInvPackUSI(binding.getVariable().toString());
                break;
            case  18 :
                setSlotInvTempHighTh(binding.getVariable().toInt());
                break;
            case  19 :
                setSlotInvTempShutdownTh(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setSlotInvShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setSlotInvSlotTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setSlotInvSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SlotInvTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("slotInvShelfIdx", slotInvShelfIdx).append("slotInvSlotTypeIdx", slotInvSlotTypeIdx).append("slotInvSlotIdx", slotInvSlotIdx).append("slotInvSWVersion", slotInvSWVersion).append("slotInvPackShortName", slotInvPackShortName).append("slotInvPackName", slotInvPackName).append("slotInvPackPEC", slotInvPackPEC).append("slotInvPackCLEI", slotInvPackCLEI).append("slotInvPackSerialNum", slotInvPackSerialNum).append("slotInvPackRev", slotInvPackRev).append("slotInvPackMfgDate", slotInvPackMfgDate).append("slotInvPackMfgLoc", slotInvPackMfgLoc).append("slotInvPackTestDate", slotInvPackTestDate).append("slotInvPackTestLoc", slotInvPackTestLoc).append("slotInvUpgradeStage", slotInvUpgradeStage).append("slotInvUpgradeResult", slotInvUpgradeResult).append("slotInvPackUSI", slotInvPackUSI).append("slotInvTempHighTh", slotInvTempHighTh).append("slotInvTempShutdownTh", slotInvTempShutdownTh).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(slotInvShelfIdx).append(slotInvSlotTypeIdx).append(slotInvSlotIdx).append(slotInvSWVersion).append(slotInvPackShortName).append(slotInvPackName).append(slotInvPackPEC).append(slotInvPackCLEI).append(slotInvPackSerialNum).append(slotInvPackRev).append(slotInvPackMfgDate).append(slotInvPackMfgLoc).append(slotInvPackTestDate).append(slotInvPackTestLoc).append(slotInvUpgradeStage).append(slotInvUpgradeResult).append(slotInvPackUSI).append(slotInvTempHighTh).append(slotInvTempShutdownTh).append(_index).toHashCode();
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
        SlotInvEntry rhs = ((SlotInvEntry) obj);
        return new EqualsBuilder().append(slotInvShelfIdx, rhs.slotInvShelfIdx).append(slotInvSlotTypeIdx, rhs.slotInvSlotTypeIdx).append(slotInvSlotIdx, rhs.slotInvSlotIdx).append(slotInvSWVersion, rhs.slotInvSWVersion).append(slotInvPackShortName, rhs.slotInvPackShortName).append(slotInvPackName, rhs.slotInvPackName).append(slotInvPackPEC, rhs.slotInvPackPEC).append(slotInvPackCLEI, rhs.slotInvPackCLEI).append(slotInvPackSerialNum, rhs.slotInvPackSerialNum).append(slotInvPackRev, rhs.slotInvPackRev).append(slotInvPackMfgDate, rhs.slotInvPackMfgDate).append(slotInvPackMfgLoc, rhs.slotInvPackMfgLoc).append(slotInvPackTestDate, rhs.slotInvPackTestDate).append(slotInvPackTestLoc, rhs.slotInvPackTestLoc).append(slotInvUpgradeStage, rhs.slotInvUpgradeStage).append(slotInvUpgradeResult, rhs.slotInvUpgradeResult).append(slotInvPackUSI, rhs.slotInvPackUSI).append(slotInvTempHighTh, rhs.slotInvTempHighTh).append(slotInvTempShutdownTh, rhs.slotInvTempShutdownTh).append(_index, rhs._index).isEquals();
    }

    public SlotInvEntry clone() {
        SlotInvEntry _copy = new SlotInvEntry();
        _copy.slotInvShelfIdx = slotInvShelfIdx;
        _copy.slotInvSlotTypeIdx = slotInvSlotTypeIdx;
        _copy.slotInvSlotIdx = slotInvSlotIdx;
        _copy.slotInvSWVersion = slotInvSWVersion;
        _copy.slotInvPackShortName = slotInvPackShortName;
        _copy.slotInvPackName = slotInvPackName;
        _copy.slotInvPackPEC = slotInvPackPEC;
        _copy.slotInvPackCLEI = slotInvPackCLEI;
        _copy.slotInvPackSerialNum = slotInvPackSerialNum;
        _copy.slotInvPackRev = slotInvPackRev;
        _copy.slotInvPackMfgDate = slotInvPackMfgDate;
        _copy.slotInvPackMfgLoc = slotInvPackMfgLoc;
        _copy.slotInvPackTestDate = slotInvPackTestDate;
        _copy.slotInvPackTestLoc = slotInvPackTestLoc;
        _copy.slotInvUpgradeStage = slotInvUpgradeStage;
        _copy.slotInvUpgradeResult = slotInvUpgradeResult;
        _copy.slotInvPackUSI = slotInvPackUSI;
        _copy.slotInvTempHighTh = slotInvTempHighTh;
        _copy.slotInvTempShutdownTh = slotInvTempShutdownTh;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.2.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "slotInvShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "slotInvSlotTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "slotInvSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "slotInvSWVersion", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "slotInvPackShortName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "slotInvPackName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "slotInvPackPEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "slotInvPackCLEI", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "slotInvPackSerialNum", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "slotInvPackRev", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "slotInvPackMfgDate", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "slotInvPackMfgLoc", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "slotInvPackTestDate", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "slotInvPackTestLoc", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "slotInvUpgradeStage", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "slotInvUpgradeResult", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "slotInvPackUSI", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "slotInvTempHighTh", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "slotInvTempShutdownTh", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
