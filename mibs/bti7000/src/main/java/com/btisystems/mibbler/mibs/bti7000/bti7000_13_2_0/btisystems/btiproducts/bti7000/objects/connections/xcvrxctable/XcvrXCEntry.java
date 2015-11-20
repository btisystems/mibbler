
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.xcvrxctable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.connections.XcvrXCTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.connections.xcvrxctable.IXcvrXCEntry;
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

public class XcvrXCEntry
    extends DeviceEntity
    implements Serializable, IXcvrXCEntry, IIndexed, IVariableBindingSetter
{

    private int xcvrXCSrcTypeIdx;
    private int xcvrXCSrcShelfIdx;
    private int xcvrXCSrcSlotIdx;
    private int xcvrXCSrcIdx;
    private int xcvrXCDestTypeIdx;
    private int xcvrXCDestShelfIdx;
    private int xcvrXCDestSlotIdx;
    private int xcvrXCDestIdx;
    private int xcvrXCType;
    private int xcvrXCRowStatus;
    private String _index;
    private XcvrXCTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public XcvrXCEntry() {
    }

    public int getXcvrXCSrcTypeIdx() {
        return this.xcvrXCSrcTypeIdx;
    }

    public void setXcvrXCSrcTypeIdx(int xcvrXCSrcTypeIdx) {
        int oldValue = getXcvrXCSrcTypeIdx();
        this.xcvrXCSrcTypeIdx = xcvrXCSrcTypeIdx;
        notifyChange(1, oldValue, xcvrXCSrcTypeIdx);
    }

    public int getXcvrXCSrcShelfIdx() {
        return this.xcvrXCSrcShelfIdx;
    }

    public void setXcvrXCSrcShelfIdx(int xcvrXCSrcShelfIdx) {
        int oldValue = getXcvrXCSrcShelfIdx();
        this.xcvrXCSrcShelfIdx = xcvrXCSrcShelfIdx;
        notifyChange(2, oldValue, xcvrXCSrcShelfIdx);
    }

    public int getXcvrXCSrcSlotIdx() {
        return this.xcvrXCSrcSlotIdx;
    }

    public void setXcvrXCSrcSlotIdx(int xcvrXCSrcSlotIdx) {
        int oldValue = getXcvrXCSrcSlotIdx();
        this.xcvrXCSrcSlotIdx = xcvrXCSrcSlotIdx;
        notifyChange(3, oldValue, xcvrXCSrcSlotIdx);
    }

    public int getXcvrXCSrcIdx() {
        return this.xcvrXCSrcIdx;
    }

    public void setXcvrXCSrcIdx(int xcvrXCSrcIdx) {
        int oldValue = getXcvrXCSrcIdx();
        this.xcvrXCSrcIdx = xcvrXCSrcIdx;
        notifyChange(4, oldValue, xcvrXCSrcIdx);
    }

    public int getXcvrXCDestTypeIdx() {
        return this.xcvrXCDestTypeIdx;
    }

    public void setXcvrXCDestTypeIdx(int xcvrXCDestTypeIdx) {
        int oldValue = getXcvrXCDestTypeIdx();
        this.xcvrXCDestTypeIdx = xcvrXCDestTypeIdx;
        notifyChange(5, oldValue, xcvrXCDestTypeIdx);
    }

    public int getXcvrXCDestShelfIdx() {
        return this.xcvrXCDestShelfIdx;
    }

    public void setXcvrXCDestShelfIdx(int xcvrXCDestShelfIdx) {
        int oldValue = getXcvrXCDestShelfIdx();
        this.xcvrXCDestShelfIdx = xcvrXCDestShelfIdx;
        notifyChange(6, oldValue, xcvrXCDestShelfIdx);
    }

    public int getXcvrXCDestSlotIdx() {
        return this.xcvrXCDestSlotIdx;
    }

    public void setXcvrXCDestSlotIdx(int xcvrXCDestSlotIdx) {
        int oldValue = getXcvrXCDestSlotIdx();
        this.xcvrXCDestSlotIdx = xcvrXCDestSlotIdx;
        notifyChange(7, oldValue, xcvrXCDestSlotIdx);
    }

    public int getXcvrXCDestIdx() {
        return this.xcvrXCDestIdx;
    }

    public void setXcvrXCDestIdx(int xcvrXCDestIdx) {
        int oldValue = getXcvrXCDestIdx();
        this.xcvrXCDestIdx = xcvrXCDestIdx;
        notifyChange(8, oldValue, xcvrXCDestIdx);
    }

    public int getXcvrXCType() {
        return this.xcvrXCType;
    }

    public void setXcvrXCType(int xcvrXCType) {
        int oldValue = getXcvrXCType();
        this.xcvrXCType = xcvrXCType;
        notifyChange(9, oldValue, xcvrXCType);
    }

    public int getXcvrXCRowStatus() {
        return this.xcvrXCRowStatus;
    }

    public void setXcvrXCRowStatus(int xcvrXCRowStatus) {
        int oldValue = getXcvrXCRowStatus();
        this.xcvrXCRowStatus = xcvrXCRowStatus;
        notifyChange(100, oldValue, xcvrXCRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setXcvrXCSrcTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setXcvrXCSrcShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setXcvrXCSrcSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setXcvrXCSrcIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setXcvrXCDestTypeIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setXcvrXCDestShelfIdx(binding.getVariable().toInt());
                break;
            case  7 :
                setXcvrXCDestSlotIdx(binding.getVariable().toInt());
                break;
            case  8 :
                setXcvrXCDestIdx(binding.getVariable().toInt());
                break;
            case  9 :
                setXcvrXCType(binding.getVariable().toInt());
                break;
            case  100 :
                setXcvrXCRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setXcvrXCSrcTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrXCSrcShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrXCSrcSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrXCSrcIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrXCDestTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrXCDestShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrXCDestSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrXCDestIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(XcvrXCTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("xcvrXCSrcTypeIdx", xcvrXCSrcTypeIdx).append("xcvrXCSrcShelfIdx", xcvrXCSrcShelfIdx).append("xcvrXCSrcSlotIdx", xcvrXCSrcSlotIdx).append("xcvrXCSrcIdx", xcvrXCSrcIdx).append("xcvrXCDestTypeIdx", xcvrXCDestTypeIdx).append("xcvrXCDestShelfIdx", xcvrXCDestShelfIdx).append("xcvrXCDestSlotIdx", xcvrXCDestSlotIdx).append("xcvrXCDestIdx", xcvrXCDestIdx).append("xcvrXCType", xcvrXCType).append("xcvrXCRowStatus", xcvrXCRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(xcvrXCSrcTypeIdx).append(xcvrXCSrcShelfIdx).append(xcvrXCSrcSlotIdx).append(xcvrXCSrcIdx).append(xcvrXCDestTypeIdx).append(xcvrXCDestShelfIdx).append(xcvrXCDestSlotIdx).append(xcvrXCDestIdx).append(xcvrXCType).append(xcvrXCRowStatus).append(_index).toHashCode();
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
        XcvrXCEntry rhs = ((XcvrXCEntry) obj);
        return new EqualsBuilder().append(xcvrXCSrcTypeIdx, rhs.xcvrXCSrcTypeIdx).append(xcvrXCSrcShelfIdx, rhs.xcvrXCSrcShelfIdx).append(xcvrXCSrcSlotIdx, rhs.xcvrXCSrcSlotIdx).append(xcvrXCSrcIdx, rhs.xcvrXCSrcIdx).append(xcvrXCDestTypeIdx, rhs.xcvrXCDestTypeIdx).append(xcvrXCDestShelfIdx, rhs.xcvrXCDestShelfIdx).append(xcvrXCDestSlotIdx, rhs.xcvrXCDestSlotIdx).append(xcvrXCDestIdx, rhs.xcvrXCDestIdx).append(xcvrXCType, rhs.xcvrXCType).append(xcvrXCRowStatus, rhs.xcvrXCRowStatus).append(_index, rhs._index).isEquals();
    }

    public XcvrXCEntry clone() {
        XcvrXCEntry _copy = new XcvrXCEntry();
        _copy.xcvrXCSrcTypeIdx = xcvrXCSrcTypeIdx;
        _copy.xcvrXCSrcShelfIdx = xcvrXCSrcShelfIdx;
        _copy.xcvrXCSrcSlotIdx = xcvrXCSrcSlotIdx;
        _copy.xcvrXCSrcIdx = xcvrXCSrcIdx;
        _copy.xcvrXCDestTypeIdx = xcvrXCDestTypeIdx;
        _copy.xcvrXCDestShelfIdx = xcvrXCDestShelfIdx;
        _copy.xcvrXCDestSlotIdx = xcvrXCDestSlotIdx;
        _copy.xcvrXCDestIdx = xcvrXCDestIdx;
        _copy.xcvrXCType = xcvrXCType;
        _copy.xcvrXCRowStatus = xcvrXCRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.9.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "xcvrXCSrcTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "xcvrXCSrcShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "xcvrXCSrcSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "xcvrXCSrcIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "xcvrXCDestTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "xcvrXCDestShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "xcvrXCDestSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "xcvrXCDestIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "xcvrXCType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "xcvrXCRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
