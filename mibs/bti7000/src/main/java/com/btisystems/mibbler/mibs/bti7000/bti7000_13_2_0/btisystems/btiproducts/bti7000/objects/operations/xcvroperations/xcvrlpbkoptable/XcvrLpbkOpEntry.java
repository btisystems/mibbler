
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.xcvrlpbkoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.XcvrLpbkOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.xcvrlpbkoptable.IXcvrLpbkOpEntry;
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

public class XcvrLpbkOpEntry
    extends DeviceEntity
    implements Serializable, IXcvrLpbkOpEntry, IIndexed, IVariableBindingSetter
{

    private int xcvrLpbkOpTypeIdx;
    private int xcvrLpbkOpShelfIdx;
    private int xcvrLpbkOpSlotIdx;
    private int xcvrLpbkOpIdx;
    private int xcvrLpbkOpCmd;
    private String _index;
    private XcvrLpbkOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public XcvrLpbkOpEntry() {
    }

    public int getXcvrLpbkOpTypeIdx() {
        return this.xcvrLpbkOpTypeIdx;
    }

    public void setXcvrLpbkOpTypeIdx(int xcvrLpbkOpTypeIdx) {
        int oldValue = getXcvrLpbkOpTypeIdx();
        this.xcvrLpbkOpTypeIdx = xcvrLpbkOpTypeIdx;
        notifyChange(1, oldValue, xcvrLpbkOpTypeIdx);
    }

    public int getXcvrLpbkOpShelfIdx() {
        return this.xcvrLpbkOpShelfIdx;
    }

    public void setXcvrLpbkOpShelfIdx(int xcvrLpbkOpShelfIdx) {
        int oldValue = getXcvrLpbkOpShelfIdx();
        this.xcvrLpbkOpShelfIdx = xcvrLpbkOpShelfIdx;
        notifyChange(2, oldValue, xcvrLpbkOpShelfIdx);
    }

    public int getXcvrLpbkOpSlotIdx() {
        return this.xcvrLpbkOpSlotIdx;
    }

    public void setXcvrLpbkOpSlotIdx(int xcvrLpbkOpSlotIdx) {
        int oldValue = getXcvrLpbkOpSlotIdx();
        this.xcvrLpbkOpSlotIdx = xcvrLpbkOpSlotIdx;
        notifyChange(3, oldValue, xcvrLpbkOpSlotIdx);
    }

    public int getXcvrLpbkOpIdx() {
        return this.xcvrLpbkOpIdx;
    }

    public void setXcvrLpbkOpIdx(int xcvrLpbkOpIdx) {
        int oldValue = getXcvrLpbkOpIdx();
        this.xcvrLpbkOpIdx = xcvrLpbkOpIdx;
        notifyChange(4, oldValue, xcvrLpbkOpIdx);
    }

    public int getXcvrLpbkOpCmd() {
        return this.xcvrLpbkOpCmd;
    }

    public void setXcvrLpbkOpCmd(int xcvrLpbkOpCmd) {
        int oldValue = getXcvrLpbkOpCmd();
        this.xcvrLpbkOpCmd = xcvrLpbkOpCmd;
        notifyChange(5, oldValue, xcvrLpbkOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setXcvrLpbkOpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setXcvrLpbkOpShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setXcvrLpbkOpSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setXcvrLpbkOpIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setXcvrLpbkOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setXcvrLpbkOpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrLpbkOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrLpbkOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrLpbkOpIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(XcvrLpbkOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("xcvrLpbkOpTypeIdx", xcvrLpbkOpTypeIdx).append("xcvrLpbkOpShelfIdx", xcvrLpbkOpShelfIdx).append("xcvrLpbkOpSlotIdx", xcvrLpbkOpSlotIdx).append("xcvrLpbkOpIdx", xcvrLpbkOpIdx).append("xcvrLpbkOpCmd", xcvrLpbkOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(xcvrLpbkOpTypeIdx).append(xcvrLpbkOpShelfIdx).append(xcvrLpbkOpSlotIdx).append(xcvrLpbkOpIdx).append(xcvrLpbkOpCmd).append(_index).toHashCode();
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
        XcvrLpbkOpEntry rhs = ((XcvrLpbkOpEntry) obj);
        return new EqualsBuilder().append(xcvrLpbkOpTypeIdx, rhs.xcvrLpbkOpTypeIdx).append(xcvrLpbkOpShelfIdx, rhs.xcvrLpbkOpShelfIdx).append(xcvrLpbkOpSlotIdx, rhs.xcvrLpbkOpSlotIdx).append(xcvrLpbkOpIdx, rhs.xcvrLpbkOpIdx).append(xcvrLpbkOpCmd, rhs.xcvrLpbkOpCmd).append(_index, rhs._index).isEquals();
    }

    public XcvrLpbkOpEntry clone() {
        XcvrLpbkOpEntry _copy = new XcvrLpbkOpEntry();
        _copy.xcvrLpbkOpTypeIdx = xcvrLpbkOpTypeIdx;
        _copy.xcvrLpbkOpShelfIdx = xcvrLpbkOpShelfIdx;
        _copy.xcvrLpbkOpSlotIdx = xcvrLpbkOpSlotIdx;
        _copy.xcvrLpbkOpIdx = xcvrLpbkOpIdx;
        _copy.xcvrLpbkOpCmd = xcvrLpbkOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.9.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "xcvrLpbkOpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "xcvrLpbkOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "xcvrLpbkOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "xcvrLpbkOpIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "xcvrLpbkOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
