
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.passiveporttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.PassivePortTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.passiveporttable.IPassivePortEntry;
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

public class PassivePortEntry
    extends DeviceEntity
    implements Serializable, IPassivePortEntry, IIndexed, IVariableBindingSetter
{

    private int passivePortCpTypeIdx;
    private int passivePortShelfIdx;
    private int passivePortSlotIdx;
    private int passivePortLineIdx;
    private int passivePortTypeIdx;
    private String passivePortId1;
    private String passivePortId2;
    private int passivePortFiberType;
    private int passivePortGrid;
    private int passivePortNumChannels;
    private int passivePortWavelength;
    private String passivePortCustom1;
    private String passivePortCustom2;
    private String passivePortCustom3;
    private String passivePortRemoteId;
    private int passivePortRowStatus;
    private String _index;
    private PassivePortTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public PassivePortEntry() {
    }

    public int getPassivePortCpTypeIdx() {
        return this.passivePortCpTypeIdx;
    }

    public void setPassivePortCpTypeIdx(int passivePortCpTypeIdx) {
        int oldValue = getPassivePortCpTypeIdx();
        this.passivePortCpTypeIdx = passivePortCpTypeIdx;
        notifyChange(1, oldValue, passivePortCpTypeIdx);
    }

    public int getPassivePortShelfIdx() {
        return this.passivePortShelfIdx;
    }

    public void setPassivePortShelfIdx(int passivePortShelfIdx) {
        int oldValue = getPassivePortShelfIdx();
        this.passivePortShelfIdx = passivePortShelfIdx;
        notifyChange(2, oldValue, passivePortShelfIdx);
    }

    public int getPassivePortSlotIdx() {
        return this.passivePortSlotIdx;
    }

    public void setPassivePortSlotIdx(int passivePortSlotIdx) {
        int oldValue = getPassivePortSlotIdx();
        this.passivePortSlotIdx = passivePortSlotIdx;
        notifyChange(3, oldValue, passivePortSlotIdx);
    }

    public int getPassivePortLineIdx() {
        return this.passivePortLineIdx;
    }

    public void setPassivePortLineIdx(int passivePortLineIdx) {
        int oldValue = getPassivePortLineIdx();
        this.passivePortLineIdx = passivePortLineIdx;
        notifyChange(4, oldValue, passivePortLineIdx);
    }

    public int getPassivePortTypeIdx() {
        return this.passivePortTypeIdx;
    }

    public void setPassivePortTypeIdx(int passivePortTypeIdx) {
        int oldValue = getPassivePortTypeIdx();
        this.passivePortTypeIdx = passivePortTypeIdx;
        notifyChange(5, oldValue, passivePortTypeIdx);
    }

    public String getPassivePortId1() {
        return this.passivePortId1;
    }

    public void setPassivePortId1(String passivePortId1) {
        String oldValue = getPassivePortId1();
        this.passivePortId1 = passivePortId1;
        notifyChange(6, oldValue, passivePortId1);
    }

    public String getPassivePortId2() {
        return this.passivePortId2;
    }

    public void setPassivePortId2(String passivePortId2) {
        String oldValue = getPassivePortId2();
        this.passivePortId2 = passivePortId2;
        notifyChange(7, oldValue, passivePortId2);
    }

    public int getPassivePortFiberType() {
        return this.passivePortFiberType;
    }

    public void setPassivePortFiberType(int passivePortFiberType) {
        int oldValue = getPassivePortFiberType();
        this.passivePortFiberType = passivePortFiberType;
        notifyChange(8, oldValue, passivePortFiberType);
    }

    public int getPassivePortGrid() {
        return this.passivePortGrid;
    }

    public void setPassivePortGrid(int passivePortGrid) {
        int oldValue = getPassivePortGrid();
        this.passivePortGrid = passivePortGrid;
        notifyChange(9, oldValue, passivePortGrid);
    }

    public int getPassivePortNumChannels() {
        return this.passivePortNumChannels;
    }

    public void setPassivePortNumChannels(int passivePortNumChannels) {
        int oldValue = getPassivePortNumChannels();
        this.passivePortNumChannels = passivePortNumChannels;
        notifyChange(10, oldValue, passivePortNumChannels);
    }

    public int getPassivePortWavelength() {
        return this.passivePortWavelength;
    }

    public void setPassivePortWavelength(int passivePortWavelength) {
        int oldValue = getPassivePortWavelength();
        this.passivePortWavelength = passivePortWavelength;
        notifyChange(11, oldValue, passivePortWavelength);
    }

    public String getPassivePortCustom1() {
        return this.passivePortCustom1;
    }

    public void setPassivePortCustom1(String passivePortCustom1) {
        String oldValue = getPassivePortCustom1();
        this.passivePortCustom1 = passivePortCustom1;
        notifyChange(12, oldValue, passivePortCustom1);
    }

    public String getPassivePortCustom2() {
        return this.passivePortCustom2;
    }

    public void setPassivePortCustom2(String passivePortCustom2) {
        String oldValue = getPassivePortCustom2();
        this.passivePortCustom2 = passivePortCustom2;
        notifyChange(13, oldValue, passivePortCustom2);
    }

    public String getPassivePortCustom3() {
        return this.passivePortCustom3;
    }

    public void setPassivePortCustom3(String passivePortCustom3) {
        String oldValue = getPassivePortCustom3();
        this.passivePortCustom3 = passivePortCustom3;
        notifyChange(14, oldValue, passivePortCustom3);
    }

    public String getPassivePortRemoteId() {
        if (this.passivePortRemoteId == null) {
            return "";
        }
        return this.passivePortRemoteId;
    }

    public boolean isPassivePortRemoteIdDefined() {
        return (this.passivePortRemoteId!= null);
    }

    public void setPassivePortRemoteId(String passivePortRemoteId) {
        String oldValue = getPassivePortRemoteId();
        this.passivePortRemoteId = passivePortRemoteId;
        notifyChange(15, oldValue, passivePortRemoteId);
    }

    public int getPassivePortRowStatus() {
        return this.passivePortRowStatus;
    }

    public void setPassivePortRowStatus(int passivePortRowStatus) {
        int oldValue = getPassivePortRowStatus();
        this.passivePortRowStatus = passivePortRowStatus;
        notifyChange(100, oldValue, passivePortRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setPassivePortCpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setPassivePortShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setPassivePortSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setPassivePortLineIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setPassivePortTypeIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setPassivePortId1(binding.getVariable().toString());
                break;
            case  7 :
                setPassivePortId2(binding.getVariable().toString());
                break;
            case  8 :
                setPassivePortFiberType(binding.getVariable().toInt());
                break;
            case  9 :
                setPassivePortGrid(binding.getVariable().toInt());
                break;
            case  10 :
                setPassivePortNumChannels(binding.getVariable().toInt());
                break;
            case  11 :
                setPassivePortWavelength(binding.getVariable().toInt());
                break;
            case  12 :
                setPassivePortCustom1(binding.getVariable().toString());
                break;
            case  13 :
                setPassivePortCustom2(binding.getVariable().toString());
                break;
            case  14 :
                setPassivePortCustom3(binding.getVariable().toString());
                break;
            case  15 :
                setPassivePortRemoteId(binding.getVariable().toString());
                break;
            case  100 :
                setPassivePortRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setPassivePortCpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPassivePortShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPassivePortSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPassivePortLineIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPassivePortTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(PassivePortTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("passivePortCpTypeIdx", passivePortCpTypeIdx).append("passivePortShelfIdx", passivePortShelfIdx).append("passivePortSlotIdx", passivePortSlotIdx).append("passivePortLineIdx", passivePortLineIdx).append("passivePortTypeIdx", passivePortTypeIdx).append("passivePortId1", passivePortId1).append("passivePortId2", passivePortId2).append("passivePortFiberType", passivePortFiberType).append("passivePortGrid", passivePortGrid).append("passivePortNumChannels", passivePortNumChannels).append("passivePortWavelength", passivePortWavelength).append("passivePortCustom1", passivePortCustom1).append("passivePortCustom2", passivePortCustom2).append("passivePortCustom3", passivePortCustom3).append("passivePortRemoteId", passivePortRemoteId).append("passivePortRowStatus", passivePortRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(passivePortCpTypeIdx).append(passivePortShelfIdx).append(passivePortSlotIdx).append(passivePortLineIdx).append(passivePortTypeIdx).append(passivePortId1).append(passivePortId2).append(passivePortFiberType).append(passivePortGrid).append(passivePortNumChannels).append(passivePortWavelength).append(passivePortCustom1).append(passivePortCustom2).append(passivePortCustom3).append(passivePortRemoteId).append(passivePortRowStatus).append(_index).toHashCode();
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
        PassivePortEntry rhs = ((PassivePortEntry) obj);
        return new EqualsBuilder().append(passivePortCpTypeIdx, rhs.passivePortCpTypeIdx).append(passivePortShelfIdx, rhs.passivePortShelfIdx).append(passivePortSlotIdx, rhs.passivePortSlotIdx).append(passivePortLineIdx, rhs.passivePortLineIdx).append(passivePortTypeIdx, rhs.passivePortTypeIdx).append(passivePortId1, rhs.passivePortId1).append(passivePortId2, rhs.passivePortId2).append(passivePortFiberType, rhs.passivePortFiberType).append(passivePortGrid, rhs.passivePortGrid).append(passivePortNumChannels, rhs.passivePortNumChannels).append(passivePortWavelength, rhs.passivePortWavelength).append(passivePortCustom1, rhs.passivePortCustom1).append(passivePortCustom2, rhs.passivePortCustom2).append(passivePortCustom3, rhs.passivePortCustom3).append(passivePortRemoteId, rhs.passivePortRemoteId).append(passivePortRowStatus, rhs.passivePortRowStatus).append(_index, rhs._index).isEquals();
    }

    public PassivePortEntry clone() {
        PassivePortEntry _copy = new PassivePortEntry();
        _copy.passivePortCpTypeIdx = passivePortCpTypeIdx;
        _copy.passivePortShelfIdx = passivePortShelfIdx;
        _copy.passivePortSlotIdx = passivePortSlotIdx;
        _copy.passivePortLineIdx = passivePortLineIdx;
        _copy.passivePortTypeIdx = passivePortTypeIdx;
        _copy.passivePortId1 = passivePortId1;
        _copy.passivePortId2 = passivePortId2;
        _copy.passivePortFiberType = passivePortFiberType;
        _copy.passivePortGrid = passivePortGrid;
        _copy.passivePortNumChannels = passivePortNumChannels;
        _copy.passivePortWavelength = passivePortWavelength;
        _copy.passivePortCustom1 = passivePortCustom1;
        _copy.passivePortCustom2 = passivePortCustom2;
        _copy.passivePortCustom3 = passivePortCustom3;
        _copy.passivePortRemoteId = passivePortRemoteId;
        _copy.passivePortRowStatus = passivePortRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "passivePortCpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "passivePortShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "passivePortSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "passivePortLineIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "passivePortTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "passivePortId1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "passivePortId2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "passivePortFiberType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "passivePortGrid", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "passivePortNumChannels", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "passivePortWavelength", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "passivePortCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "passivePortCustom2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "passivePortCustom3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "passivePortRemoteId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "passivePortRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
