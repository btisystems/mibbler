
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.protection.ocnprotgrptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.protection.OcnProtGrpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.ocnprotgrptable.IOcnProtGrpEntry;
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

public class OcnProtGrpEntry
    extends DeviceEntity
    implements Serializable, IOcnProtGrpEntry, IIndexed, IVariableBindingSetter
{

    private int ocnProtGrpWorkTypeIdx;
    private int ocnProtGrpWorkShelfIdx;
    private int ocnProtGrpWorkSlotIdx;
    private int ocnProtGrpWorkPortIdx;
    private int ocnProtGrpProtTypeIdx;
    private int ocnProtGrpProtShelfIdx;
    private int ocnProtGrpProtSlotIdx;
    private int ocnProtGrpProtPortIdx;
    private String ocnProtGrpId;
    private int ocnProtGrpRowStatus;
    private String _index;
    private OcnProtGrpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OcnProtGrpEntry() {
    }

    public int getOcnProtGrpWorkTypeIdx() {
        return this.ocnProtGrpWorkTypeIdx;
    }

    public void setOcnProtGrpWorkTypeIdx(int ocnProtGrpWorkTypeIdx) {
        int oldValue = getOcnProtGrpWorkTypeIdx();
        this.ocnProtGrpWorkTypeIdx = ocnProtGrpWorkTypeIdx;
        notifyChange(1, oldValue, ocnProtGrpWorkTypeIdx);
    }

    public int getOcnProtGrpWorkShelfIdx() {
        return this.ocnProtGrpWorkShelfIdx;
    }

    public void setOcnProtGrpWorkShelfIdx(int ocnProtGrpWorkShelfIdx) {
        int oldValue = getOcnProtGrpWorkShelfIdx();
        this.ocnProtGrpWorkShelfIdx = ocnProtGrpWorkShelfIdx;
        notifyChange(2, oldValue, ocnProtGrpWorkShelfIdx);
    }

    public int getOcnProtGrpWorkSlotIdx() {
        return this.ocnProtGrpWorkSlotIdx;
    }

    public void setOcnProtGrpWorkSlotIdx(int ocnProtGrpWorkSlotIdx) {
        int oldValue = getOcnProtGrpWorkSlotIdx();
        this.ocnProtGrpWorkSlotIdx = ocnProtGrpWorkSlotIdx;
        notifyChange(3, oldValue, ocnProtGrpWorkSlotIdx);
    }

    public int getOcnProtGrpWorkPortIdx() {
        return this.ocnProtGrpWorkPortIdx;
    }

    public void setOcnProtGrpWorkPortIdx(int ocnProtGrpWorkPortIdx) {
        int oldValue = getOcnProtGrpWorkPortIdx();
        this.ocnProtGrpWorkPortIdx = ocnProtGrpWorkPortIdx;
        notifyChange(4, oldValue, ocnProtGrpWorkPortIdx);
    }

    public int getOcnProtGrpProtTypeIdx() {
        return this.ocnProtGrpProtTypeIdx;
    }

    public void setOcnProtGrpProtTypeIdx(int ocnProtGrpProtTypeIdx) {
        int oldValue = getOcnProtGrpProtTypeIdx();
        this.ocnProtGrpProtTypeIdx = ocnProtGrpProtTypeIdx;
        notifyChange(5, oldValue, ocnProtGrpProtTypeIdx);
    }

    public int getOcnProtGrpProtShelfIdx() {
        return this.ocnProtGrpProtShelfIdx;
    }

    public void setOcnProtGrpProtShelfIdx(int ocnProtGrpProtShelfIdx) {
        int oldValue = getOcnProtGrpProtShelfIdx();
        this.ocnProtGrpProtShelfIdx = ocnProtGrpProtShelfIdx;
        notifyChange(6, oldValue, ocnProtGrpProtShelfIdx);
    }

    public int getOcnProtGrpProtSlotIdx() {
        return this.ocnProtGrpProtSlotIdx;
    }

    public void setOcnProtGrpProtSlotIdx(int ocnProtGrpProtSlotIdx) {
        int oldValue = getOcnProtGrpProtSlotIdx();
        this.ocnProtGrpProtSlotIdx = ocnProtGrpProtSlotIdx;
        notifyChange(7, oldValue, ocnProtGrpProtSlotIdx);
    }

    public int getOcnProtGrpProtPortIdx() {
        return this.ocnProtGrpProtPortIdx;
    }

    public void setOcnProtGrpProtPortIdx(int ocnProtGrpProtPortIdx) {
        int oldValue = getOcnProtGrpProtPortIdx();
        this.ocnProtGrpProtPortIdx = ocnProtGrpProtPortIdx;
        notifyChange(8, oldValue, ocnProtGrpProtPortIdx);
    }

    public String getOcnProtGrpId() {
        if (this.ocnProtGrpId == null) {
            return "";
        }
        return this.ocnProtGrpId;
    }

    public boolean isOcnProtGrpIdDefined() {
        return (this.ocnProtGrpId!= null);
    }

    public void setOcnProtGrpId(String ocnProtGrpId) {
        String oldValue = getOcnProtGrpId();
        this.ocnProtGrpId = ocnProtGrpId;
        notifyChange(9, oldValue, ocnProtGrpId);
    }

    public int getOcnProtGrpRowStatus() {
        return this.ocnProtGrpRowStatus;
    }

    public void setOcnProtGrpRowStatus(int ocnProtGrpRowStatus) {
        int oldValue = getOcnProtGrpRowStatus();
        this.ocnProtGrpRowStatus = ocnProtGrpRowStatus;
        notifyChange(100, oldValue, ocnProtGrpRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setOcnProtGrpWorkTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setOcnProtGrpWorkShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setOcnProtGrpWorkSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setOcnProtGrpWorkPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setOcnProtGrpProtTypeIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setOcnProtGrpProtShelfIdx(binding.getVariable().toInt());
                break;
            case  7 :
                setOcnProtGrpProtSlotIdx(binding.getVariable().toInt());
                break;
            case  8 :
                setOcnProtGrpProtPortIdx(binding.getVariable().toInt());
                break;
            case  9 :
                setOcnProtGrpId(binding.getVariable().toString());
                break;
            case  100 :
                setOcnProtGrpRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setOcnProtGrpWorkTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnProtGrpWorkShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnProtGrpWorkSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnProtGrpWorkPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnProtGrpProtTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnProtGrpProtShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnProtGrpProtSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnProtGrpProtPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OcnProtGrpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ocnProtGrpWorkTypeIdx", ocnProtGrpWorkTypeIdx).append("ocnProtGrpWorkShelfIdx", ocnProtGrpWorkShelfIdx).append("ocnProtGrpWorkSlotIdx", ocnProtGrpWorkSlotIdx).append("ocnProtGrpWorkPortIdx", ocnProtGrpWorkPortIdx).append("ocnProtGrpProtTypeIdx", ocnProtGrpProtTypeIdx).append("ocnProtGrpProtShelfIdx", ocnProtGrpProtShelfIdx).append("ocnProtGrpProtSlotIdx", ocnProtGrpProtSlotIdx).append("ocnProtGrpProtPortIdx", ocnProtGrpProtPortIdx).append("ocnProtGrpId", ocnProtGrpId).append("ocnProtGrpRowStatus", ocnProtGrpRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ocnProtGrpWorkTypeIdx).append(ocnProtGrpWorkShelfIdx).append(ocnProtGrpWorkSlotIdx).append(ocnProtGrpWorkPortIdx).append(ocnProtGrpProtTypeIdx).append(ocnProtGrpProtShelfIdx).append(ocnProtGrpProtSlotIdx).append(ocnProtGrpProtPortIdx).append(ocnProtGrpId).append(ocnProtGrpRowStatus).append(_index).toHashCode();
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
        OcnProtGrpEntry rhs = ((OcnProtGrpEntry) obj);
        return new EqualsBuilder().append(ocnProtGrpWorkTypeIdx, rhs.ocnProtGrpWorkTypeIdx).append(ocnProtGrpWorkShelfIdx, rhs.ocnProtGrpWorkShelfIdx).append(ocnProtGrpWorkSlotIdx, rhs.ocnProtGrpWorkSlotIdx).append(ocnProtGrpWorkPortIdx, rhs.ocnProtGrpWorkPortIdx).append(ocnProtGrpProtTypeIdx, rhs.ocnProtGrpProtTypeIdx).append(ocnProtGrpProtShelfIdx, rhs.ocnProtGrpProtShelfIdx).append(ocnProtGrpProtSlotIdx, rhs.ocnProtGrpProtSlotIdx).append(ocnProtGrpProtPortIdx, rhs.ocnProtGrpProtPortIdx).append(ocnProtGrpId, rhs.ocnProtGrpId).append(ocnProtGrpRowStatus, rhs.ocnProtGrpRowStatus).append(_index, rhs._index).isEquals();
    }

    public OcnProtGrpEntry clone() {
        OcnProtGrpEntry _copy = new OcnProtGrpEntry();
        _copy.ocnProtGrpWorkTypeIdx = ocnProtGrpWorkTypeIdx;
        _copy.ocnProtGrpWorkShelfIdx = ocnProtGrpWorkShelfIdx;
        _copy.ocnProtGrpWorkSlotIdx = ocnProtGrpWorkSlotIdx;
        _copy.ocnProtGrpWorkPortIdx = ocnProtGrpWorkPortIdx;
        _copy.ocnProtGrpProtTypeIdx = ocnProtGrpProtTypeIdx;
        _copy.ocnProtGrpProtShelfIdx = ocnProtGrpProtShelfIdx;
        _copy.ocnProtGrpProtSlotIdx = ocnProtGrpProtSlotIdx;
        _copy.ocnProtGrpProtPortIdx = ocnProtGrpProtPortIdx;
        _copy.ocnProtGrpId = ocnProtGrpId;
        _copy.ocnProtGrpRowStatus = ocnProtGrpRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.10.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ocnProtGrpWorkTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ocnProtGrpWorkShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ocnProtGrpWorkSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ocnProtGrpWorkPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ocnProtGrpProtTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ocnProtGrpProtShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ocnProtGrpProtSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ocnProtGrpProtPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ocnProtGrpId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "ocnProtGrpRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
