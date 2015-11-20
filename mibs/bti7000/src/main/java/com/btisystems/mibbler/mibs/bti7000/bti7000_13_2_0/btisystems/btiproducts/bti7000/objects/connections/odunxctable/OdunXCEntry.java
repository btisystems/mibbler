
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.odunxctable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.OdunXCTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.odunxctable.IOdunXCEntry;
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

public class OdunXCEntry
    extends DeviceEntity
    implements Serializable, IOdunXCEntry, IIndexed, IVariableBindingSetter
{

    private int odunXCOdunTypeIdx;
    private int odunXCSrcShelfIdx;
    private int odunXCSrcSlotIdx;
    private int odunXCSrcPortIdx;
    private int odunXCSrcIdx;
    private int odunXCDestShelfIdx;
    private int odunXCDestSlotIdx;
    private int odunXCDestPortIdx;
    private int odunXCDestIdx;
    private int odunXCType;
    private int odunXCProtTypeNum;
    private int odunXCProtShelfNum;
    private int odunXCProtSlotNum;
    private int odunXCProtPortNum;
    private int odunXCProtNum;
    private int odunXCRowStatus;
    private String _index;
    private OdunXCTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OdunXCEntry() {
    }

    public int getOdunXCOdunTypeIdx() {
        return this.odunXCOdunTypeIdx;
    }

    public void setOdunXCOdunTypeIdx(int odunXCOdunTypeIdx) {
        int oldValue = getOdunXCOdunTypeIdx();
        this.odunXCOdunTypeIdx = odunXCOdunTypeIdx;
        notifyChange(1, oldValue, odunXCOdunTypeIdx);
    }

    public int getOdunXCSrcShelfIdx() {
        return this.odunXCSrcShelfIdx;
    }

    public void setOdunXCSrcShelfIdx(int odunXCSrcShelfIdx) {
        int oldValue = getOdunXCSrcShelfIdx();
        this.odunXCSrcShelfIdx = odunXCSrcShelfIdx;
        notifyChange(2, oldValue, odunXCSrcShelfIdx);
    }

    public int getOdunXCSrcSlotIdx() {
        return this.odunXCSrcSlotIdx;
    }

    public void setOdunXCSrcSlotIdx(int odunXCSrcSlotIdx) {
        int oldValue = getOdunXCSrcSlotIdx();
        this.odunXCSrcSlotIdx = odunXCSrcSlotIdx;
        notifyChange(3, oldValue, odunXCSrcSlotIdx);
    }

    public int getOdunXCSrcPortIdx() {
        return this.odunXCSrcPortIdx;
    }

    public void setOdunXCSrcPortIdx(int odunXCSrcPortIdx) {
        int oldValue = getOdunXCSrcPortIdx();
        this.odunXCSrcPortIdx = odunXCSrcPortIdx;
        notifyChange(4, oldValue, odunXCSrcPortIdx);
    }

    public int getOdunXCSrcIdx() {
        return this.odunXCSrcIdx;
    }

    public void setOdunXCSrcIdx(int odunXCSrcIdx) {
        int oldValue = getOdunXCSrcIdx();
        this.odunXCSrcIdx = odunXCSrcIdx;
        notifyChange(5, oldValue, odunXCSrcIdx);
    }

    public int getOdunXCDestShelfIdx() {
        return this.odunXCDestShelfIdx;
    }

    public void setOdunXCDestShelfIdx(int odunXCDestShelfIdx) {
        int oldValue = getOdunXCDestShelfIdx();
        this.odunXCDestShelfIdx = odunXCDestShelfIdx;
        notifyChange(6, oldValue, odunXCDestShelfIdx);
    }

    public int getOdunXCDestSlotIdx() {
        return this.odunXCDestSlotIdx;
    }

    public void setOdunXCDestSlotIdx(int odunXCDestSlotIdx) {
        int oldValue = getOdunXCDestSlotIdx();
        this.odunXCDestSlotIdx = odunXCDestSlotIdx;
        notifyChange(7, oldValue, odunXCDestSlotIdx);
    }

    public int getOdunXCDestPortIdx() {
        return this.odunXCDestPortIdx;
    }

    public void setOdunXCDestPortIdx(int odunXCDestPortIdx) {
        int oldValue = getOdunXCDestPortIdx();
        this.odunXCDestPortIdx = odunXCDestPortIdx;
        notifyChange(8, oldValue, odunXCDestPortIdx);
    }

    public int getOdunXCDestIdx() {
        return this.odunXCDestIdx;
    }

    public void setOdunXCDestIdx(int odunXCDestIdx) {
        int oldValue = getOdunXCDestIdx();
        this.odunXCDestIdx = odunXCDestIdx;
        notifyChange(9, oldValue, odunXCDestIdx);
    }

    public int getOdunXCType() {
        return this.odunXCType;
    }

    public void setOdunXCType(int odunXCType) {
        int oldValue = getOdunXCType();
        this.odunXCType = odunXCType;
        notifyChange(10, oldValue, odunXCType);
    }

    public int getOdunXCProtTypeNum() {
        return this.odunXCProtTypeNum;
    }

    public void setOdunXCProtTypeNum(int odunXCProtTypeNum) {
        int oldValue = getOdunXCProtTypeNum();
        this.odunXCProtTypeNum = odunXCProtTypeNum;
        notifyChange(11, oldValue, odunXCProtTypeNum);
    }

    public int getOdunXCProtShelfNum() {
        return this.odunXCProtShelfNum;
    }

    public void setOdunXCProtShelfNum(int odunXCProtShelfNum) {
        int oldValue = getOdunXCProtShelfNum();
        this.odunXCProtShelfNum = odunXCProtShelfNum;
        notifyChange(12, oldValue, odunXCProtShelfNum);
    }

    public int getOdunXCProtSlotNum() {
        return this.odunXCProtSlotNum;
    }

    public void setOdunXCProtSlotNum(int odunXCProtSlotNum) {
        int oldValue = getOdunXCProtSlotNum();
        this.odunXCProtSlotNum = odunXCProtSlotNum;
        notifyChange(13, oldValue, odunXCProtSlotNum);
    }

    public int getOdunXCProtPortNum() {
        return this.odunXCProtPortNum;
    }

    public void setOdunXCProtPortNum(int odunXCProtPortNum) {
        int oldValue = getOdunXCProtPortNum();
        this.odunXCProtPortNum = odunXCProtPortNum;
        notifyChange(14, oldValue, odunXCProtPortNum);
    }

    public int getOdunXCProtNum() {
        return this.odunXCProtNum;
    }

    public void setOdunXCProtNum(int odunXCProtNum) {
        int oldValue = getOdunXCProtNum();
        this.odunXCProtNum = odunXCProtNum;
        notifyChange(15, oldValue, odunXCProtNum);
    }

    public int getOdunXCRowStatus() {
        return this.odunXCRowStatus;
    }

    public void setOdunXCRowStatus(int odunXCRowStatus) {
        int oldValue = getOdunXCRowStatus();
        this.odunXCRowStatus = odunXCRowStatus;
        notifyChange(100, oldValue, odunXCRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setOdunXCOdunTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setOdunXCSrcShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setOdunXCSrcSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setOdunXCSrcPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setOdunXCSrcIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setOdunXCDestShelfIdx(binding.getVariable().toInt());
                break;
            case  7 :
                setOdunXCDestSlotIdx(binding.getVariable().toInt());
                break;
            case  8 :
                setOdunXCDestPortIdx(binding.getVariable().toInt());
                break;
            case  9 :
                setOdunXCDestIdx(binding.getVariable().toInt());
                break;
            case  10 :
                setOdunXCType(binding.getVariable().toInt());
                break;
            case  11 :
                setOdunXCProtTypeNum(binding.getVariable().toInt());
                break;
            case  12 :
                setOdunXCProtShelfNum(binding.getVariable().toInt());
                break;
            case  13 :
                setOdunXCProtSlotNum(binding.getVariable().toInt());
                break;
            case  14 :
                setOdunXCProtPortNum(binding.getVariable().toInt());
                break;
            case  15 :
                setOdunXCProtNum(binding.getVariable().toInt());
                break;
            case  100 :
                setOdunXCRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setOdunXCOdunTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOdunXCSrcShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOdunXCSrcSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOdunXCSrcPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOdunXCSrcIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOdunXCDestShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOdunXCDestSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOdunXCDestPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOdunXCDestIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OdunXCTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("odunXCOdunTypeIdx", odunXCOdunTypeIdx).append("odunXCSrcShelfIdx", odunXCSrcShelfIdx).append("odunXCSrcSlotIdx", odunXCSrcSlotIdx).append("odunXCSrcPortIdx", odunXCSrcPortIdx).append("odunXCSrcIdx", odunXCSrcIdx).append("odunXCDestShelfIdx", odunXCDestShelfIdx).append("odunXCDestSlotIdx", odunXCDestSlotIdx).append("odunXCDestPortIdx", odunXCDestPortIdx).append("odunXCDestIdx", odunXCDestIdx).append("odunXCType", odunXCType).append("odunXCProtTypeNum", odunXCProtTypeNum).append("odunXCProtShelfNum", odunXCProtShelfNum).append("odunXCProtSlotNum", odunXCProtSlotNum).append("odunXCProtPortNum", odunXCProtPortNum).append("odunXCProtNum", odunXCProtNum).append("odunXCRowStatus", odunXCRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(odunXCOdunTypeIdx).append(odunXCSrcShelfIdx).append(odunXCSrcSlotIdx).append(odunXCSrcPortIdx).append(odunXCSrcIdx).append(odunXCDestShelfIdx).append(odunXCDestSlotIdx).append(odunXCDestPortIdx).append(odunXCDestIdx).append(odunXCType).append(odunXCProtTypeNum).append(odunXCProtShelfNum).append(odunXCProtSlotNum).append(odunXCProtPortNum).append(odunXCProtNum).append(odunXCRowStatus).append(_index).toHashCode();
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
        OdunXCEntry rhs = ((OdunXCEntry) obj);
        return new EqualsBuilder().append(odunXCOdunTypeIdx, rhs.odunXCOdunTypeIdx).append(odunXCSrcShelfIdx, rhs.odunXCSrcShelfIdx).append(odunXCSrcSlotIdx, rhs.odunXCSrcSlotIdx).append(odunXCSrcPortIdx, rhs.odunXCSrcPortIdx).append(odunXCSrcIdx, rhs.odunXCSrcIdx).append(odunXCDestShelfIdx, rhs.odunXCDestShelfIdx).append(odunXCDestSlotIdx, rhs.odunXCDestSlotIdx).append(odunXCDestPortIdx, rhs.odunXCDestPortIdx).append(odunXCDestIdx, rhs.odunXCDestIdx).append(odunXCType, rhs.odunXCType).append(odunXCProtTypeNum, rhs.odunXCProtTypeNum).append(odunXCProtShelfNum, rhs.odunXCProtShelfNum).append(odunXCProtSlotNum, rhs.odunXCProtSlotNum).append(odunXCProtPortNum, rhs.odunXCProtPortNum).append(odunXCProtNum, rhs.odunXCProtNum).append(odunXCRowStatus, rhs.odunXCRowStatus).append(_index, rhs._index).isEquals();
    }

    public OdunXCEntry clone() {
        OdunXCEntry _copy = new OdunXCEntry();
        _copy.odunXCOdunTypeIdx = odunXCOdunTypeIdx;
        _copy.odunXCSrcShelfIdx = odunXCSrcShelfIdx;
        _copy.odunXCSrcSlotIdx = odunXCSrcSlotIdx;
        _copy.odunXCSrcPortIdx = odunXCSrcPortIdx;
        _copy.odunXCSrcIdx = odunXCSrcIdx;
        _copy.odunXCDestShelfIdx = odunXCDestShelfIdx;
        _copy.odunXCDestSlotIdx = odunXCDestSlotIdx;
        _copy.odunXCDestPortIdx = odunXCDestPortIdx;
        _copy.odunXCDestIdx = odunXCDestIdx;
        _copy.odunXCType = odunXCType;
        _copy.odunXCProtTypeNum = odunXCProtTypeNum;
        _copy.odunXCProtShelfNum = odunXCProtShelfNum;
        _copy.odunXCProtSlotNum = odunXCProtSlotNum;
        _copy.odunXCProtPortNum = odunXCProtPortNum;
        _copy.odunXCProtNum = odunXCProtNum;
        _copy.odunXCRowStatus = odunXCRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.9.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "odunXCOdunTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "odunXCSrcShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "odunXCSrcSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "odunXCSrcPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "odunXCSrcIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "odunXCDestShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "odunXCDestSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "odunXCDestPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "odunXCDestIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "odunXCType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "odunXCProtTypeNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "odunXCProtShelfNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "odunXCProtSlotNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "odunXCProtPortNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "odunXCProtNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "odunXCRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
