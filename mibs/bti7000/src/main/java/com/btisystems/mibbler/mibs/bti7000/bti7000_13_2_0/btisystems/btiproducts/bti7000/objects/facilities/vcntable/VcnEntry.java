
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.vcntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.VcnTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.vcntable.IVcnEntry;
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

public class VcnEntry
    extends DeviceEntity
    implements Serializable, IVcnEntry, IIndexed, IVariableBindingSetter
{

    private int vcnTypeIdx;
    private int vcnShelfIdx;
    private int vcnSlotIdx;
    private int vcnPortIdx;
    private int vcnIdx;
    private int vcnProtSwEvtType;
    private int vcnBER;
    private int vcnBERTh;
    private String vcnProtSwStatus;
    private String _index;
    private VcnTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public VcnEntry() {
    }

    public int getVcnTypeIdx() {
        return this.vcnTypeIdx;
    }

    public void setVcnTypeIdx(int vcnTypeIdx) {
        int oldValue = getVcnTypeIdx();
        this.vcnTypeIdx = vcnTypeIdx;
        notifyChange(1, oldValue, vcnTypeIdx);
    }

    public int getVcnShelfIdx() {
        return this.vcnShelfIdx;
    }

    public void setVcnShelfIdx(int vcnShelfIdx) {
        int oldValue = getVcnShelfIdx();
        this.vcnShelfIdx = vcnShelfIdx;
        notifyChange(2, oldValue, vcnShelfIdx);
    }

    public int getVcnSlotIdx() {
        return this.vcnSlotIdx;
    }

    public void setVcnSlotIdx(int vcnSlotIdx) {
        int oldValue = getVcnSlotIdx();
        this.vcnSlotIdx = vcnSlotIdx;
        notifyChange(3, oldValue, vcnSlotIdx);
    }

    public int getVcnPortIdx() {
        return this.vcnPortIdx;
    }

    public void setVcnPortIdx(int vcnPortIdx) {
        int oldValue = getVcnPortIdx();
        this.vcnPortIdx = vcnPortIdx;
        notifyChange(4, oldValue, vcnPortIdx);
    }

    public int getVcnIdx() {
        return this.vcnIdx;
    }

    public void setVcnIdx(int vcnIdx) {
        int oldValue = getVcnIdx();
        this.vcnIdx = vcnIdx;
        notifyChange(5, oldValue, vcnIdx);
    }

    public int getVcnProtSwEvtType() {
        return this.vcnProtSwEvtType;
    }

    public void setVcnProtSwEvtType(int vcnProtSwEvtType) {
        int oldValue = getVcnProtSwEvtType();
        this.vcnProtSwEvtType = vcnProtSwEvtType;
        notifyChange(6, oldValue, vcnProtSwEvtType);
    }

    public int getVcnBER() {
        return this.vcnBER;
    }

    public void setVcnBER(int vcnBER) {
        int oldValue = getVcnBER();
        this.vcnBER = vcnBER;
        notifyChange(7, oldValue, vcnBER);
    }

    public int getVcnBERTh() {
        return this.vcnBERTh;
    }

    public void setVcnBERTh(int vcnBERTh) {
        int oldValue = getVcnBERTh();
        this.vcnBERTh = vcnBERTh;
        notifyChange(8, oldValue, vcnBERTh);
    }

    public String getVcnProtSwStatus() {
        return this.vcnProtSwStatus;
    }

    public void setVcnProtSwStatus(String vcnProtSwStatus) {
        String oldValue = getVcnProtSwStatus();
        this.vcnProtSwStatus = vcnProtSwStatus;
        notifyChange(9, oldValue, vcnProtSwStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setVcnTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setVcnShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setVcnSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setVcnPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setVcnIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setVcnProtSwEvtType(binding.getVariable().toInt());
                break;
            case  7 :
                setVcnBER(binding.getVariable().toInt());
                break;
            case  8 :
                setVcnBERTh(binding.getVariable().toInt());
                break;
            case  9 :
                setVcnProtSwStatus(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setVcnTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcnIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(VcnTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("vcnTypeIdx", vcnTypeIdx).append("vcnShelfIdx", vcnShelfIdx).append("vcnSlotIdx", vcnSlotIdx).append("vcnPortIdx", vcnPortIdx).append("vcnIdx", vcnIdx).append("vcnProtSwEvtType", vcnProtSwEvtType).append("vcnBER", vcnBER).append("vcnBERTh", vcnBERTh).append("vcnProtSwStatus", vcnProtSwStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(vcnTypeIdx).append(vcnShelfIdx).append(vcnSlotIdx).append(vcnPortIdx).append(vcnIdx).append(vcnProtSwEvtType).append(vcnBER).append(vcnBERTh).append(vcnProtSwStatus).append(_index).toHashCode();
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
        VcnEntry rhs = ((VcnEntry) obj);
        return new EqualsBuilder().append(vcnTypeIdx, rhs.vcnTypeIdx).append(vcnShelfIdx, rhs.vcnShelfIdx).append(vcnSlotIdx, rhs.vcnSlotIdx).append(vcnPortIdx, rhs.vcnPortIdx).append(vcnIdx, rhs.vcnIdx).append(vcnProtSwEvtType, rhs.vcnProtSwEvtType).append(vcnBER, rhs.vcnBER).append(vcnBERTh, rhs.vcnBERTh).append(vcnProtSwStatus, rhs.vcnProtSwStatus).append(_index, rhs._index).isEquals();
    }

    public VcnEntry clone() {
        VcnEntry _copy = new VcnEntry();
        _copy.vcnTypeIdx = vcnTypeIdx;
        _copy.vcnShelfIdx = vcnShelfIdx;
        _copy.vcnSlotIdx = vcnSlotIdx;
        _copy.vcnPortIdx = vcnPortIdx;
        _copy.vcnIdx = vcnIdx;
        _copy.vcnProtSwEvtType = vcnProtSwEvtType;
        _copy.vcnBER = vcnBER;
        _copy.vcnBERTh = vcnBERTh;
        _copy.vcnProtSwStatus = vcnProtSwStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.8.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "vcnTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "vcnShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "vcnSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "vcnPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "vcnIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "vcnProtSwEvtType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "vcnBER", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "vcnBERTh", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "vcnProtSwStatus", DeviceEntityDescription.FieldType.STRING, 65));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
