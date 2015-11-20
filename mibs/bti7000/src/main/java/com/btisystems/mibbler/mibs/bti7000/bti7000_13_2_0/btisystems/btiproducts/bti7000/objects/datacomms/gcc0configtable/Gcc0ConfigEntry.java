
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.gcc0configtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.Gcc0ConfigTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.gcc0configtable.IGcc0ConfigEntry;
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

public class Gcc0ConfigEntry
    extends DeviceEntity
    implements Serializable, IGcc0ConfigEntry, IIndexed, IVariableBindingSetter
{

    private int gcc0ConfigCpTypeIdx;
    private int gcc0ConfigShelfIdx;
    private int gcc0ConfigSlotIdx;
    private int gcc0ConfigPortIdx;
    private Integer gcc0ConfigMode;
    private Integer gcc0ConfigAdminStatus;
    private int gcc0ConfigOperStatus;
    private String gcc0ConfigOperStatQlfr;
    private int gcc0ConfigRowStatus;
    private String _index;
    private Gcc0ConfigTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Gcc0ConfigEntry() {
    }

    public int getGcc0ConfigCpTypeIdx() {
        return this.gcc0ConfigCpTypeIdx;
    }

    public void setGcc0ConfigCpTypeIdx(int gcc0ConfigCpTypeIdx) {
        int oldValue = getGcc0ConfigCpTypeIdx();
        this.gcc0ConfigCpTypeIdx = gcc0ConfigCpTypeIdx;
        notifyChange(1, oldValue, gcc0ConfigCpTypeIdx);
    }

    public int getGcc0ConfigShelfIdx() {
        return this.gcc0ConfigShelfIdx;
    }

    public void setGcc0ConfigShelfIdx(int gcc0ConfigShelfIdx) {
        int oldValue = getGcc0ConfigShelfIdx();
        this.gcc0ConfigShelfIdx = gcc0ConfigShelfIdx;
        notifyChange(2, oldValue, gcc0ConfigShelfIdx);
    }

    public int getGcc0ConfigSlotIdx() {
        return this.gcc0ConfigSlotIdx;
    }

    public void setGcc0ConfigSlotIdx(int gcc0ConfigSlotIdx) {
        int oldValue = getGcc0ConfigSlotIdx();
        this.gcc0ConfigSlotIdx = gcc0ConfigSlotIdx;
        notifyChange(3, oldValue, gcc0ConfigSlotIdx);
    }

    public int getGcc0ConfigPortIdx() {
        return this.gcc0ConfigPortIdx;
    }

    public void setGcc0ConfigPortIdx(int gcc0ConfigPortIdx) {
        int oldValue = getGcc0ConfigPortIdx();
        this.gcc0ConfigPortIdx = gcc0ConfigPortIdx;
        notifyChange(4, oldValue, gcc0ConfigPortIdx);
    }

    public int getGcc0ConfigMode() {
        if (this.gcc0ConfigMode == null) {
            return  1;
        }
        return this.gcc0ConfigMode;
    }

    public boolean isGcc0ConfigModeDefined() {
        return (this.gcc0ConfigMode!= null);
    }

    public void setGcc0ConfigMode(int gcc0ConfigMode) {
        int oldValue = getGcc0ConfigMode();
        this.gcc0ConfigMode = gcc0ConfigMode;
        notifyChange(5, oldValue, gcc0ConfigMode);
    }

    public int getGcc0ConfigAdminStatus() {
        if (this.gcc0ConfigAdminStatus == null) {
            return  1;
        }
        return this.gcc0ConfigAdminStatus;
    }

    public boolean isGcc0ConfigAdminStatusDefined() {
        return (this.gcc0ConfigAdminStatus!= null);
    }

    public void setGcc0ConfigAdminStatus(int gcc0ConfigAdminStatus) {
        int oldValue = getGcc0ConfigAdminStatus();
        this.gcc0ConfigAdminStatus = gcc0ConfigAdminStatus;
        notifyChange(6, oldValue, gcc0ConfigAdminStatus);
    }

    public int getGcc0ConfigOperStatus() {
        return this.gcc0ConfigOperStatus;
    }

    public void setGcc0ConfigOperStatus(int gcc0ConfigOperStatus) {
        int oldValue = getGcc0ConfigOperStatus();
        this.gcc0ConfigOperStatus = gcc0ConfigOperStatus;
        notifyChange(7, oldValue, gcc0ConfigOperStatus);
    }

    public String getGcc0ConfigOperStatQlfr() {
        return this.gcc0ConfigOperStatQlfr;
    }

    public void setGcc0ConfigOperStatQlfr(String gcc0ConfigOperStatQlfr) {
        String oldValue = getGcc0ConfigOperStatQlfr();
        this.gcc0ConfigOperStatQlfr = gcc0ConfigOperStatQlfr;
        notifyChange(8, oldValue, gcc0ConfigOperStatQlfr);
    }

    public int getGcc0ConfigRowStatus() {
        return this.gcc0ConfigRowStatus;
    }

    public void setGcc0ConfigRowStatus(int gcc0ConfigRowStatus) {
        int oldValue = getGcc0ConfigRowStatus();
        this.gcc0ConfigRowStatus = gcc0ConfigRowStatus;
        notifyChange(9, oldValue, gcc0ConfigRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setGcc0ConfigCpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setGcc0ConfigShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setGcc0ConfigSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setGcc0ConfigPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setGcc0ConfigMode(binding.getVariable().toInt());
                break;
            case  6 :
                setGcc0ConfigAdminStatus(binding.getVariable().toInt());
                break;
            case  7 :
                setGcc0ConfigOperStatus(binding.getVariable().toInt());
                break;
            case  8 :
                setGcc0ConfigOperStatQlfr(binding.getVariable().toString());
                break;
            case  9 :
                setGcc0ConfigRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setGcc0ConfigCpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setGcc0ConfigShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setGcc0ConfigSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setGcc0ConfigPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Gcc0ConfigTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("gcc0ConfigCpTypeIdx", gcc0ConfigCpTypeIdx).append("gcc0ConfigShelfIdx", gcc0ConfigShelfIdx).append("gcc0ConfigSlotIdx", gcc0ConfigSlotIdx).append("gcc0ConfigPortIdx", gcc0ConfigPortIdx).append("gcc0ConfigMode", gcc0ConfigMode).append("gcc0ConfigAdminStatus", gcc0ConfigAdminStatus).append("gcc0ConfigOperStatus", gcc0ConfigOperStatus).append("gcc0ConfigOperStatQlfr", gcc0ConfigOperStatQlfr).append("gcc0ConfigRowStatus", gcc0ConfigRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(gcc0ConfigCpTypeIdx).append(gcc0ConfigShelfIdx).append(gcc0ConfigSlotIdx).append(gcc0ConfigPortIdx).append(gcc0ConfigMode).append(gcc0ConfigAdminStatus).append(gcc0ConfigOperStatus).append(gcc0ConfigOperStatQlfr).append(gcc0ConfigRowStatus).append(_index).toHashCode();
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
        Gcc0ConfigEntry rhs = ((Gcc0ConfigEntry) obj);
        return new EqualsBuilder().append(gcc0ConfigCpTypeIdx, rhs.gcc0ConfigCpTypeIdx).append(gcc0ConfigShelfIdx, rhs.gcc0ConfigShelfIdx).append(gcc0ConfigSlotIdx, rhs.gcc0ConfigSlotIdx).append(gcc0ConfigPortIdx, rhs.gcc0ConfigPortIdx).append(gcc0ConfigMode, rhs.gcc0ConfigMode).append(gcc0ConfigAdminStatus, rhs.gcc0ConfigAdminStatus).append(gcc0ConfigOperStatus, rhs.gcc0ConfigOperStatus).append(gcc0ConfigOperStatQlfr, rhs.gcc0ConfigOperStatQlfr).append(gcc0ConfigRowStatus, rhs.gcc0ConfigRowStatus).append(_index, rhs._index).isEquals();
    }

    public Gcc0ConfigEntry clone() {
        Gcc0ConfigEntry _copy = new Gcc0ConfigEntry();
        _copy.gcc0ConfigCpTypeIdx = gcc0ConfigCpTypeIdx;
        _copy.gcc0ConfigShelfIdx = gcc0ConfigShelfIdx;
        _copy.gcc0ConfigSlotIdx = gcc0ConfigSlotIdx;
        _copy.gcc0ConfigPortIdx = gcc0ConfigPortIdx;
        _copy.gcc0ConfigMode = gcc0ConfigMode;
        _copy.gcc0ConfigAdminStatus = gcc0ConfigAdminStatus;
        _copy.gcc0ConfigOperStatus = gcc0ConfigOperStatus;
        _copy.gcc0ConfigOperStatQlfr = gcc0ConfigOperStatQlfr;
        _copy.gcc0ConfigRowStatus = gcc0ConfigRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.5.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "gcc0ConfigCpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "gcc0ConfigShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "gcc0ConfigSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "gcc0ConfigPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "gcc0ConfigMode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "gcc0ConfigAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "gcc0ConfigOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "gcc0ConfigOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "gcc0ConfigRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
