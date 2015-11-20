
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.vcgtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.VcgTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.vcgtable.IVcgEntry;
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

public class VcgEntry
    extends DeviceEntity
    implements Serializable, IVcgEntry, IIndexed, IVariableBindingSetter
{

    private int vcgShelfIdx;
    private int vcgSlotIdx;
    private int vcgPortIdx;
    private int vcgIdx;
    private int vcgType;
    private String vcgTimeSlotIndices;
    private int vcgRowStatus;
    private String _index;
    private VcgTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public VcgEntry() {
    }

    public int getVcgShelfIdx() {
        return this.vcgShelfIdx;
    }

    public void setVcgShelfIdx(int vcgShelfIdx) {
        int oldValue = getVcgShelfIdx();
        this.vcgShelfIdx = vcgShelfIdx;
        notifyChange(1, oldValue, vcgShelfIdx);
    }

    public int getVcgSlotIdx() {
        return this.vcgSlotIdx;
    }

    public void setVcgSlotIdx(int vcgSlotIdx) {
        int oldValue = getVcgSlotIdx();
        this.vcgSlotIdx = vcgSlotIdx;
        notifyChange(2, oldValue, vcgSlotIdx);
    }

    public int getVcgPortIdx() {
        return this.vcgPortIdx;
    }

    public void setVcgPortIdx(int vcgPortIdx) {
        int oldValue = getVcgPortIdx();
        this.vcgPortIdx = vcgPortIdx;
        notifyChange(3, oldValue, vcgPortIdx);
    }

    public int getVcgIdx() {
        return this.vcgIdx;
    }

    public void setVcgIdx(int vcgIdx) {
        int oldValue = getVcgIdx();
        this.vcgIdx = vcgIdx;
        notifyChange(4, oldValue, vcgIdx);
    }

    public int getVcgType() {
        return this.vcgType;
    }

    public void setVcgType(int vcgType) {
        int oldValue = getVcgType();
        this.vcgType = vcgType;
        notifyChange(5, oldValue, vcgType);
    }

    public String getVcgTimeSlotIndices() {
        return this.vcgTimeSlotIndices;
    }

    public void setVcgTimeSlotIndices(String vcgTimeSlotIndices) {
        String oldValue = getVcgTimeSlotIndices();
        this.vcgTimeSlotIndices = vcgTimeSlotIndices;
        notifyChange(6, oldValue, vcgTimeSlotIndices);
    }

    public int getVcgRowStatus() {
        return this.vcgRowStatus;
    }

    public void setVcgRowStatus(int vcgRowStatus) {
        int oldValue = getVcgRowStatus();
        this.vcgRowStatus = vcgRowStatus;
        notifyChange(100, oldValue, vcgRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setVcgShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setVcgSlotIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setVcgPortIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setVcgIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setVcgType(binding.getVariable().toInt());
                break;
            case  6 :
                setVcgTimeSlotIndices(binding.getVariable().toString());
                break;
            case  100 :
                setVcgRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setVcgShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcgSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcgPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setVcgIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(VcgTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("vcgShelfIdx", vcgShelfIdx).append("vcgSlotIdx", vcgSlotIdx).append("vcgPortIdx", vcgPortIdx).append("vcgIdx", vcgIdx).append("vcgType", vcgType).append("vcgTimeSlotIndices", vcgTimeSlotIndices).append("vcgRowStatus", vcgRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(vcgShelfIdx).append(vcgSlotIdx).append(vcgPortIdx).append(vcgIdx).append(vcgType).append(vcgTimeSlotIndices).append(vcgRowStatus).append(_index).toHashCode();
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
        VcgEntry rhs = ((VcgEntry) obj);
        return new EqualsBuilder().append(vcgShelfIdx, rhs.vcgShelfIdx).append(vcgSlotIdx, rhs.vcgSlotIdx).append(vcgPortIdx, rhs.vcgPortIdx).append(vcgIdx, rhs.vcgIdx).append(vcgType, rhs.vcgType).append(vcgTimeSlotIndices, rhs.vcgTimeSlotIndices).append(vcgRowStatus, rhs.vcgRowStatus).append(_index, rhs._index).isEquals();
    }

    public VcgEntry clone() {
        VcgEntry _copy = new VcgEntry();
        _copy.vcgShelfIdx = vcgShelfIdx;
        _copy.vcgSlotIdx = vcgSlotIdx;
        _copy.vcgPortIdx = vcgPortIdx;
        _copy.vcgIdx = vcgIdx;
        _copy.vcgType = vcgType;
        _copy.vcgTimeSlotIndices = vcgTimeSlotIndices;
        _copy.vcgRowStatus = vcgRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.11.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "vcgShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "vcgSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "vcgPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "vcgIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "vcgType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "vcgTimeSlotIndices", DeviceEntityDescription.FieldType.STRING, 510));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "vcgRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
