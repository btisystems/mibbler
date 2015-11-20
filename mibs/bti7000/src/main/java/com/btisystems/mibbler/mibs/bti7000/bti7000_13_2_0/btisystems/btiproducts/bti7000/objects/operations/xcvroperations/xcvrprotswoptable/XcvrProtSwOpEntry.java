
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.xcvrprotswoptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.XcvrProtSwOpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.xcvrprotswoptable.IXcvrProtSwOpEntry;
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

public class XcvrProtSwOpEntry
    extends DeviceEntity
    implements Serializable, IXcvrProtSwOpEntry, IIndexed, IVariableBindingSetter
{

    private int xcvrProtSwOpTypeIdx;
    private int xcvrProtSwOpShelfIdx;
    private int xcvrProtSwOpSlotIdx;
    private int xcvrProtSwOpIdx;
    private int xcvrProtSwOpCmd;
    private String _index;
    private XcvrProtSwOpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public XcvrProtSwOpEntry() {
    }

    public int getXcvrProtSwOpTypeIdx() {
        return this.xcvrProtSwOpTypeIdx;
    }

    public void setXcvrProtSwOpTypeIdx(int xcvrProtSwOpTypeIdx) {
        int oldValue = getXcvrProtSwOpTypeIdx();
        this.xcvrProtSwOpTypeIdx = xcvrProtSwOpTypeIdx;
        notifyChange(1, oldValue, xcvrProtSwOpTypeIdx);
    }

    public int getXcvrProtSwOpShelfIdx() {
        return this.xcvrProtSwOpShelfIdx;
    }

    public void setXcvrProtSwOpShelfIdx(int xcvrProtSwOpShelfIdx) {
        int oldValue = getXcvrProtSwOpShelfIdx();
        this.xcvrProtSwOpShelfIdx = xcvrProtSwOpShelfIdx;
        notifyChange(2, oldValue, xcvrProtSwOpShelfIdx);
    }

    public int getXcvrProtSwOpSlotIdx() {
        return this.xcvrProtSwOpSlotIdx;
    }

    public void setXcvrProtSwOpSlotIdx(int xcvrProtSwOpSlotIdx) {
        int oldValue = getXcvrProtSwOpSlotIdx();
        this.xcvrProtSwOpSlotIdx = xcvrProtSwOpSlotIdx;
        notifyChange(3, oldValue, xcvrProtSwOpSlotIdx);
    }

    public int getXcvrProtSwOpIdx() {
        return this.xcvrProtSwOpIdx;
    }

    public void setXcvrProtSwOpIdx(int xcvrProtSwOpIdx) {
        int oldValue = getXcvrProtSwOpIdx();
        this.xcvrProtSwOpIdx = xcvrProtSwOpIdx;
        notifyChange(4, oldValue, xcvrProtSwOpIdx);
    }

    public int getXcvrProtSwOpCmd() {
        return this.xcvrProtSwOpCmd;
    }

    public void setXcvrProtSwOpCmd(int xcvrProtSwOpCmd) {
        int oldValue = getXcvrProtSwOpCmd();
        this.xcvrProtSwOpCmd = xcvrProtSwOpCmd;
        notifyChange(5, oldValue, xcvrProtSwOpCmd);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setXcvrProtSwOpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setXcvrProtSwOpShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setXcvrProtSwOpSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setXcvrProtSwOpIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setXcvrProtSwOpCmd(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setXcvrProtSwOpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrProtSwOpShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrProtSwOpSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setXcvrProtSwOpIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(XcvrProtSwOpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("xcvrProtSwOpTypeIdx", xcvrProtSwOpTypeIdx).append("xcvrProtSwOpShelfIdx", xcvrProtSwOpShelfIdx).append("xcvrProtSwOpSlotIdx", xcvrProtSwOpSlotIdx).append("xcvrProtSwOpIdx", xcvrProtSwOpIdx).append("xcvrProtSwOpCmd", xcvrProtSwOpCmd).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(xcvrProtSwOpTypeIdx).append(xcvrProtSwOpShelfIdx).append(xcvrProtSwOpSlotIdx).append(xcvrProtSwOpIdx).append(xcvrProtSwOpCmd).append(_index).toHashCode();
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
        XcvrProtSwOpEntry rhs = ((XcvrProtSwOpEntry) obj);
        return new EqualsBuilder().append(xcvrProtSwOpTypeIdx, rhs.xcvrProtSwOpTypeIdx).append(xcvrProtSwOpShelfIdx, rhs.xcvrProtSwOpShelfIdx).append(xcvrProtSwOpSlotIdx, rhs.xcvrProtSwOpSlotIdx).append(xcvrProtSwOpIdx, rhs.xcvrProtSwOpIdx).append(xcvrProtSwOpCmd, rhs.xcvrProtSwOpCmd).append(_index, rhs._index).isEquals();
    }

    public XcvrProtSwOpEntry clone() {
        XcvrProtSwOpEntry _copy = new XcvrProtSwOpEntry();
        _copy.xcvrProtSwOpTypeIdx = xcvrProtSwOpTypeIdx;
        _copy.xcvrProtSwOpShelfIdx = xcvrProtSwOpShelfIdx;
        _copy.xcvrProtSwOpSlotIdx = xcvrProtSwOpSlotIdx;
        _copy.xcvrProtSwOpIdx = xcvrProtSwOpIdx;
        _copy.xcvrProtSwOpCmd = xcvrProtSwOpCmd;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.9.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "xcvrProtSwOpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "xcvrProtSwOpShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "xcvrProtSwOpSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "xcvrProtSwOpIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "xcvrProtSwOpCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
