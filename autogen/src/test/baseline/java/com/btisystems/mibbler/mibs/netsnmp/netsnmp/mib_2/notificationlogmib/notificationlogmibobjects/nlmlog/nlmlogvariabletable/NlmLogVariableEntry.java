
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.nlmlogvariabletable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.nlmlogvariabletable.INlmLogVariableEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.NlmLogVariableTable;
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

public class NlmLogVariableEntry
    extends DeviceEntity
    implements Serializable, INlmLogVariableEntry, IIndexed, IVariableBindingSetter
{

    private int nlmLogVariableIndex;
    private String nlmLogVariableID;
    private int nlmLogVariableValueType;
    private int nlmLogVariableCounter32Val;
    private int nlmLogVariableUnsigned32Val;
    private int nlmLogVariableTimeTicksVal;
    private int nlmLogVariableInteger32Val;
    private String nlmLogVariableOctetStringVal;
    private String nlmLogVariableIpAddressVal;
    private String nlmLogVariableOidVal;
    private long nlmLogVariableCounter64Val;
    private String nlmLogVariableOpaqueVal;
    private String _index;
    private NlmLogVariableTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlmLogVariableEntry() {
    }

    public int getNlmLogVariableIndex() {
        return this.nlmLogVariableIndex;
    }

    public void setNlmLogVariableIndex(int nlmLogVariableIndex) {
        int oldValue = getNlmLogVariableIndex();
        this.nlmLogVariableIndex = nlmLogVariableIndex;
        notifyChange(1, oldValue, nlmLogVariableIndex);
    }

    public String getNlmLogVariableID() {
        return this.nlmLogVariableID;
    }

    public void setNlmLogVariableID(String nlmLogVariableID) {
        String oldValue = getNlmLogVariableID();
        this.nlmLogVariableID = nlmLogVariableID;
        notifyChange(2, oldValue, nlmLogVariableID);
    }

    public int getNlmLogVariableValueType() {
        return this.nlmLogVariableValueType;
    }

    public void setNlmLogVariableValueType(int nlmLogVariableValueType) {
        int oldValue = getNlmLogVariableValueType();
        this.nlmLogVariableValueType = nlmLogVariableValueType;
        notifyChange(3, oldValue, nlmLogVariableValueType);
    }

    public int getNlmLogVariableCounter32Val() {
        return this.nlmLogVariableCounter32Val;
    }

    public void setNlmLogVariableCounter32Val(int nlmLogVariableCounter32Val) {
        int oldValue = getNlmLogVariableCounter32Val();
        this.nlmLogVariableCounter32Val = nlmLogVariableCounter32Val;
        notifyChange(4, oldValue, nlmLogVariableCounter32Val);
    }

    public int getNlmLogVariableUnsigned32Val() {
        return this.nlmLogVariableUnsigned32Val;
    }

    public void setNlmLogVariableUnsigned32Val(int nlmLogVariableUnsigned32Val) {
        int oldValue = getNlmLogVariableUnsigned32Val();
        this.nlmLogVariableUnsigned32Val = nlmLogVariableUnsigned32Val;
        notifyChange(5, oldValue, nlmLogVariableUnsigned32Val);
    }

    public int getNlmLogVariableTimeTicksVal() {
        return this.nlmLogVariableTimeTicksVal;
    }

    public void setNlmLogVariableTimeTicksVal(int nlmLogVariableTimeTicksVal) {
        int oldValue = getNlmLogVariableTimeTicksVal();
        this.nlmLogVariableTimeTicksVal = nlmLogVariableTimeTicksVal;
        notifyChange(6, oldValue, nlmLogVariableTimeTicksVal);
    }

    public int getNlmLogVariableInteger32Val() {
        return this.nlmLogVariableInteger32Val;
    }

    public void setNlmLogVariableInteger32Val(int nlmLogVariableInteger32Val) {
        int oldValue = getNlmLogVariableInteger32Val();
        this.nlmLogVariableInteger32Val = nlmLogVariableInteger32Val;
        notifyChange(7, oldValue, nlmLogVariableInteger32Val);
    }

    public String getNlmLogVariableOctetStringVal() {
        return this.nlmLogVariableOctetStringVal;
    }

    public void setNlmLogVariableOctetStringVal(String nlmLogVariableOctetStringVal) {
        String oldValue = getNlmLogVariableOctetStringVal();
        this.nlmLogVariableOctetStringVal = nlmLogVariableOctetStringVal;
        notifyChange(8, oldValue, nlmLogVariableOctetStringVal);
    }

    public String getNlmLogVariableIpAddressVal() {
        return this.nlmLogVariableIpAddressVal;
    }

    public void setNlmLogVariableIpAddressVal(String nlmLogVariableIpAddressVal) {
        String oldValue = getNlmLogVariableIpAddressVal();
        this.nlmLogVariableIpAddressVal = nlmLogVariableIpAddressVal;
        notifyChange(9, oldValue, nlmLogVariableIpAddressVal);
    }

    public String getNlmLogVariableOidVal() {
        return this.nlmLogVariableOidVal;
    }

    public void setNlmLogVariableOidVal(String nlmLogVariableOidVal) {
        String oldValue = getNlmLogVariableOidVal();
        this.nlmLogVariableOidVal = nlmLogVariableOidVal;
        notifyChange(10, oldValue, nlmLogVariableOidVal);
    }

    public long getNlmLogVariableCounter64Val() {
        return this.nlmLogVariableCounter64Val;
    }

    public void setNlmLogVariableCounter64Val(long nlmLogVariableCounter64Val) {
        long oldValue = getNlmLogVariableCounter64Val();
        this.nlmLogVariableCounter64Val = nlmLogVariableCounter64Val;
        notifyChange(11, oldValue, nlmLogVariableCounter64Val);
    }

    public String getNlmLogVariableOpaqueVal() {
        return this.nlmLogVariableOpaqueVal;
    }

    public void setNlmLogVariableOpaqueVal(String nlmLogVariableOpaqueVal) {
        String oldValue = getNlmLogVariableOpaqueVal();
        this.nlmLogVariableOpaqueVal = nlmLogVariableOpaqueVal;
        notifyChange(12, oldValue, nlmLogVariableOpaqueVal);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setNlmLogVariableIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setNlmLogVariableID(binding.getVariable().toString());
                break;
            case  3 :
                setNlmLogVariableValueType(binding.getVariable().toInt());
                break;
            case  4 :
                setNlmLogVariableCounter32Val(binding.getVariable().toInt());
                break;
            case  5 :
                setNlmLogVariableUnsigned32Val(binding.getVariable().toInt());
                break;
            case  6 :
                setNlmLogVariableTimeTicksVal(binding.getVariable().toInt());
                break;
            case  7 :
                setNlmLogVariableInteger32Val(binding.getVariable().toInt());
                break;
            case  8 :
                setNlmLogVariableOctetStringVal(binding.getVariable().toString());
                break;
            case  9 :
                setNlmLogVariableIpAddressVal(binding.getVariable().toString());
                break;
            case  10 :
                setNlmLogVariableOidVal(binding.getVariable().toString());
                break;
            case  11 :
                setNlmLogVariableCounter64Val(binding.getVariable().toLong());
                break;
            case  12 :
                setNlmLogVariableOpaqueVal(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 12;
        int _len;
        _index = new OID(_oidInts, 12, (oid.size()- 12)).toString();
        _len = _oidInts[arrayOffset ++];
        arrayOffset += _len;
        arrayOffset += 1;
        setNlmLogVariableIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(NlmLogVariableTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlmLogVariableIndex", nlmLogVariableIndex).append("nlmLogVariableID", nlmLogVariableID).append("nlmLogVariableValueType", nlmLogVariableValueType).append("nlmLogVariableCounter32Val", nlmLogVariableCounter32Val).append("nlmLogVariableUnsigned32Val", nlmLogVariableUnsigned32Val).append("nlmLogVariableTimeTicksVal", nlmLogVariableTimeTicksVal).append("nlmLogVariableInteger32Val", nlmLogVariableInteger32Val).append("nlmLogVariableOctetStringVal", nlmLogVariableOctetStringVal).append("nlmLogVariableIpAddressVal", nlmLogVariableIpAddressVal).append("nlmLogVariableOidVal", nlmLogVariableOidVal).append("nlmLogVariableCounter64Val", nlmLogVariableCounter64Val).append("nlmLogVariableOpaqueVal", nlmLogVariableOpaqueVal).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlmLogVariableIndex).append(nlmLogVariableID).append(nlmLogVariableValueType).append(nlmLogVariableCounter32Val).append(nlmLogVariableUnsigned32Val).append(nlmLogVariableTimeTicksVal).append(nlmLogVariableInteger32Val).append(nlmLogVariableOctetStringVal).append(nlmLogVariableIpAddressVal).append(nlmLogVariableOidVal).append(nlmLogVariableCounter64Val).append(nlmLogVariableOpaqueVal).append(_index).toHashCode();
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
        NlmLogVariableEntry rhs = ((NlmLogVariableEntry) obj);
        return new EqualsBuilder().append(nlmLogVariableIndex, rhs.nlmLogVariableIndex).append(nlmLogVariableID, rhs.nlmLogVariableID).append(nlmLogVariableValueType, rhs.nlmLogVariableValueType).append(nlmLogVariableCounter32Val, rhs.nlmLogVariableCounter32Val).append(nlmLogVariableUnsigned32Val, rhs.nlmLogVariableUnsigned32Val).append(nlmLogVariableTimeTicksVal, rhs.nlmLogVariableTimeTicksVal).append(nlmLogVariableInteger32Val, rhs.nlmLogVariableInteger32Val).append(nlmLogVariableOctetStringVal, rhs.nlmLogVariableOctetStringVal).append(nlmLogVariableIpAddressVal, rhs.nlmLogVariableIpAddressVal).append(nlmLogVariableOidVal, rhs.nlmLogVariableOidVal).append(nlmLogVariableCounter64Val, rhs.nlmLogVariableCounter64Val).append(nlmLogVariableOpaqueVal, rhs.nlmLogVariableOpaqueVal).append(_index, rhs._index).isEquals();
    }

    public NlmLogVariableEntry clone() {
        NlmLogVariableEntry _copy = new NlmLogVariableEntry();
        _copy.nlmLogVariableIndex = nlmLogVariableIndex;
        _copy.nlmLogVariableID = nlmLogVariableID;
        _copy.nlmLogVariableValueType = nlmLogVariableValueType;
        _copy.nlmLogVariableCounter32Val = nlmLogVariableCounter32Val;
        _copy.nlmLogVariableUnsigned32Val = nlmLogVariableUnsigned32Val;
        _copy.nlmLogVariableTimeTicksVal = nlmLogVariableTimeTicksVal;
        _copy.nlmLogVariableInteger32Val = nlmLogVariableInteger32Val;
        _copy.nlmLogVariableOctetStringVal = nlmLogVariableOctetStringVal;
        _copy.nlmLogVariableIpAddressVal = nlmLogVariableIpAddressVal;
        _copy.nlmLogVariableOidVal = nlmLogVariableOidVal;
        _copy.nlmLogVariableCounter64Val = nlmLogVariableCounter64Val;
        _copy.nlmLogVariableOpaqueVal = nlmLogVariableOpaqueVal;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.92.1.3.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlmLogVariableIndex", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "nlmLogVariableID", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "nlmLogVariableValueType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "nlmLogVariableCounter32Val", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "nlmLogVariableUnsigned32Val", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "nlmLogVariableTimeTicksVal", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "nlmLogVariableInteger32Val", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "nlmLogVariableOctetStringVal", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "nlmLogVariableIpAddressVal", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "nlmLogVariableOidVal", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "nlmLogVariableCounter64Val", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "nlmLogVariableOpaqueVal", DeviceEntityDescription.FieldType.STRING, 1024));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
