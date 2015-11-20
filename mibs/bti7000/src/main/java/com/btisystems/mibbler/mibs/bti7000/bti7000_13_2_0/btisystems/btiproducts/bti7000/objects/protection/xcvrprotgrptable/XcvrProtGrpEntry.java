
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.protection.xcvrprotgrptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.protection.XcvrProtGrpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.xcvrprotgrptable.IXcvrProtGrpEntry;
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

public class XcvrProtGrpEntry
    extends DeviceEntity
    implements Serializable, IXcvrProtGrpEntry, IIndexed, IVariableBindingSetter
{

    private int xcvrProtGrpWorkTypeIdx;
    private int xcvrProtGrpWorkShelfIdx;
    private int xcvrProtGrpWorkSlotIdx;
    private int xcvrProtGrpWorkIdx;
    private int xcvrProtGrpProtTypeIdx;
    private int xcvrProtGrpProtShelfIdx;
    private int xcvrProtGrpProtSlotIdx;
    private int xcvrProtGrpProtIdx;
    private String xcvrProtGrpId;
    private int xcvrProtGrpPSDirn;
    private int xcvrProtGrpRowStatus;
    private String _index;
    private XcvrProtGrpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public XcvrProtGrpEntry() {
    }

    public int getXcvrProtGrpWorkTypeIdx() {
        return this.xcvrProtGrpWorkTypeIdx;
    }

    public void setXcvrProtGrpWorkTypeIdx(int xcvrProtGrpWorkTypeIdx) {
        int oldValue = getXcvrProtGrpWorkTypeIdx();
        this.xcvrProtGrpWorkTypeIdx = xcvrProtGrpWorkTypeIdx;
        notifyChange(1, oldValue, xcvrProtGrpWorkTypeIdx);
    }

    public int getXcvrProtGrpWorkShelfIdx() {
        return this.xcvrProtGrpWorkShelfIdx;
    }

    public void setXcvrProtGrpWorkShelfIdx(int xcvrProtGrpWorkShelfIdx) {
        int oldValue = getXcvrProtGrpWorkShelfIdx();
        this.xcvrProtGrpWorkShelfIdx = xcvrProtGrpWorkShelfIdx;
        notifyChange(2, oldValue, xcvrProtGrpWorkShelfIdx);
    }

    public int getXcvrProtGrpWorkSlotIdx() {
        return this.xcvrProtGrpWorkSlotIdx;
    }

    public void setXcvrProtGrpWorkSlotIdx(int xcvrProtGrpWorkSlotIdx) {
        int oldValue = getXcvrProtGrpWorkSlotIdx();
        this.xcvrProtGrpWorkSlotIdx = xcvrProtGrpWorkSlotIdx;
        notifyChange(3, oldValue, xcvrProtGrpWorkSlotIdx);
    }

    public int getXcvrProtGrpWorkIdx() {
        return this.xcvrProtGrpWorkIdx;
    }

    public void setXcvrProtGrpWorkIdx(int xcvrProtGrpWorkIdx) {
        int oldValue = getXcvrProtGrpWorkIdx();
        this.xcvrProtGrpWorkIdx = xcvrProtGrpWorkIdx;
        notifyChange(4, oldValue, xcvrProtGrpWorkIdx);
    }

    public int getXcvrProtGrpProtTypeIdx() {
        return this.xcvrProtGrpProtTypeIdx;
    }

    public void setXcvrProtGrpProtTypeIdx(int xcvrProtGrpProtTypeIdx) {
        int oldValue = getXcvrProtGrpProtTypeIdx();
        this.xcvrProtGrpProtTypeIdx = xcvrProtGrpProtTypeIdx;
        notifyChange(5, oldValue, xcvrProtGrpProtTypeIdx);
    }

    public int getXcvrProtGrpProtShelfIdx() {
        return this.xcvrProtGrpProtShelfIdx;
    }

    public void setXcvrProtGrpProtShelfIdx(int xcvrProtGrpProtShelfIdx) {
        int oldValue = getXcvrProtGrpProtShelfIdx();
        this.xcvrProtGrpProtShelfIdx = xcvrProtGrpProtShelfIdx;
        notifyChange(6, oldValue, xcvrProtGrpProtShelfIdx);
    }

    public int getXcvrProtGrpProtSlotIdx() {
        return this.xcvrProtGrpProtSlotIdx;
    }

    public void setXcvrProtGrpProtSlotIdx(int xcvrProtGrpProtSlotIdx) {
        int oldValue = getXcvrProtGrpProtSlotIdx();
        this.xcvrProtGrpProtSlotIdx = xcvrProtGrpProtSlotIdx;
        notifyChange(7, oldValue, xcvrProtGrpProtSlotIdx);
    }

    public int getXcvrProtGrpProtIdx() {
        return this.xcvrProtGrpProtIdx;
    }

    public void setXcvrProtGrpProtIdx(int xcvrProtGrpProtIdx) {
        int oldValue = getXcvrProtGrpProtIdx();
        this.xcvrProtGrpProtIdx = xcvrProtGrpProtIdx;
        notifyChange(8, oldValue, xcvrProtGrpProtIdx);
    }

    public String getXcvrProtGrpId() {
        if (this.xcvrProtGrpId == null) {
            return "";
        }
        return this.xcvrProtGrpId;
    }

    public boolean isXcvrProtGrpIdDefined() {
        return (this.xcvrProtGrpId!= null);
    }

    public void setXcvrProtGrpId(String xcvrProtGrpId) {
        String oldValue = getXcvrProtGrpId();
        this.xcvrProtGrpId = xcvrProtGrpId;
        notifyChange(9, oldValue, xcvrProtGrpId);
    }

    public int getXcvrProtGrpPSDirn() {
        return this.xcvrProtGrpPSDirn;
    }

    public void setXcvrProtGrpPSDirn(int xcvrProtGrpPSDirn) {
        int oldValue = getXcvrProtGrpPSDirn();
        this.xcvrProtGrpPSDirn = xcvrProtGrpPSDirn;
        notifyChange(10, oldValue, xcvrProtGrpPSDirn);
    }

    public int getXcvrProtGrpRowStatus() {
        return this.xcvrProtGrpRowStatus;
    }

    public void setXcvrProtGrpRowStatus(int xcvrProtGrpRowStatus) {
        int oldValue = getXcvrProtGrpRowStatus();
        this.xcvrProtGrpRowStatus = xcvrProtGrpRowStatus;
        notifyChange(100, oldValue, xcvrProtGrpRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setXcvrProtGrpWorkTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setXcvrProtGrpWorkShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setXcvrProtGrpWorkSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setXcvrProtGrpWorkIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setXcvrProtGrpProtTypeIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setXcvrProtGrpProtShelfIdx(binding.getVariable().toInt());
                break;
            case  7 :
                setXcvrProtGrpProtSlotIdx(binding.getVariable().toInt());
                break;
            case  8 :
                setXcvrProtGrpProtIdx(binding.getVariable().toInt());
                break;
            case  9 :
                setXcvrProtGrpId(binding.getVariable().toString());
                break;
            case  10 :
                setXcvrProtGrpPSDirn(binding.getVariable().toInt());
                break;
            case  100 :
                setXcvrProtGrpRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setXcvrProtGrpWorkTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrProtGrpWorkShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrProtGrpWorkSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrProtGrpWorkIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrProtGrpProtTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrProtGrpProtShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrProtGrpProtSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrProtGrpProtIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(XcvrProtGrpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("xcvrProtGrpWorkTypeIdx", xcvrProtGrpWorkTypeIdx).append("xcvrProtGrpWorkShelfIdx", xcvrProtGrpWorkShelfIdx).append("xcvrProtGrpWorkSlotIdx", xcvrProtGrpWorkSlotIdx).append("xcvrProtGrpWorkIdx", xcvrProtGrpWorkIdx).append("xcvrProtGrpProtTypeIdx", xcvrProtGrpProtTypeIdx).append("xcvrProtGrpProtShelfIdx", xcvrProtGrpProtShelfIdx).append("xcvrProtGrpProtSlotIdx", xcvrProtGrpProtSlotIdx).append("xcvrProtGrpProtIdx", xcvrProtGrpProtIdx).append("xcvrProtGrpId", xcvrProtGrpId).append("xcvrProtGrpPSDirn", xcvrProtGrpPSDirn).append("xcvrProtGrpRowStatus", xcvrProtGrpRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(xcvrProtGrpWorkTypeIdx).append(xcvrProtGrpWorkShelfIdx).append(xcvrProtGrpWorkSlotIdx).append(xcvrProtGrpWorkIdx).append(xcvrProtGrpProtTypeIdx).append(xcvrProtGrpProtShelfIdx).append(xcvrProtGrpProtSlotIdx).append(xcvrProtGrpProtIdx).append(xcvrProtGrpId).append(xcvrProtGrpPSDirn).append(xcvrProtGrpRowStatus).append(_index).toHashCode();
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
        XcvrProtGrpEntry rhs = ((XcvrProtGrpEntry) obj);
        return new EqualsBuilder().append(xcvrProtGrpWorkTypeIdx, rhs.xcvrProtGrpWorkTypeIdx).append(xcvrProtGrpWorkShelfIdx, rhs.xcvrProtGrpWorkShelfIdx).append(xcvrProtGrpWorkSlotIdx, rhs.xcvrProtGrpWorkSlotIdx).append(xcvrProtGrpWorkIdx, rhs.xcvrProtGrpWorkIdx).append(xcvrProtGrpProtTypeIdx, rhs.xcvrProtGrpProtTypeIdx).append(xcvrProtGrpProtShelfIdx, rhs.xcvrProtGrpProtShelfIdx).append(xcvrProtGrpProtSlotIdx, rhs.xcvrProtGrpProtSlotIdx).append(xcvrProtGrpProtIdx, rhs.xcvrProtGrpProtIdx).append(xcvrProtGrpId, rhs.xcvrProtGrpId).append(xcvrProtGrpPSDirn, rhs.xcvrProtGrpPSDirn).append(xcvrProtGrpRowStatus, rhs.xcvrProtGrpRowStatus).append(_index, rhs._index).isEquals();
    }

    public XcvrProtGrpEntry clone() {
        XcvrProtGrpEntry _copy = new XcvrProtGrpEntry();
        _copy.xcvrProtGrpWorkTypeIdx = xcvrProtGrpWorkTypeIdx;
        _copy.xcvrProtGrpWorkShelfIdx = xcvrProtGrpWorkShelfIdx;
        _copy.xcvrProtGrpWorkSlotIdx = xcvrProtGrpWorkSlotIdx;
        _copy.xcvrProtGrpWorkIdx = xcvrProtGrpWorkIdx;
        _copy.xcvrProtGrpProtTypeIdx = xcvrProtGrpProtTypeIdx;
        _copy.xcvrProtGrpProtShelfIdx = xcvrProtGrpProtShelfIdx;
        _copy.xcvrProtGrpProtSlotIdx = xcvrProtGrpProtSlotIdx;
        _copy.xcvrProtGrpProtIdx = xcvrProtGrpProtIdx;
        _copy.xcvrProtGrpId = xcvrProtGrpId;
        _copy.xcvrProtGrpPSDirn = xcvrProtGrpPSDirn;
        _copy.xcvrProtGrpRowStatus = xcvrProtGrpRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.10.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "xcvrProtGrpWorkTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "xcvrProtGrpWorkShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "xcvrProtGrpWorkSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "xcvrProtGrpWorkIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "xcvrProtGrpProtTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "xcvrProtGrpProtShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "xcvrProtGrpProtSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "xcvrProtGrpProtIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "xcvrProtGrpId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "xcvrProtGrpPSDirn", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "xcvrProtGrpRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
