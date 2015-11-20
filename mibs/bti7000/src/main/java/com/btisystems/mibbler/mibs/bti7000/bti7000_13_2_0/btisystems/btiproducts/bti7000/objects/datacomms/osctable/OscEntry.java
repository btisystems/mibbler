
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.osctable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.OscTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.osctable.IOscEntry;
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

public class OscEntry
    extends DeviceEntity
    implements Serializable, IOscEntry, IIndexed, IVariableBindingSetter
{

    private int oscShelfIdx;
    private int oscSlotIdx;
    private int oscIdx;
    private Integer oscAdminStatus;
    private int oscOperStatus;
    private String oscOperStatQlfr;
    private String oscCustom1;
    private int oscType;
    private int oscUnmbrd;
    private int oscSpeed;
    private int oscDuplex;
    private int oscMediaRate;
    private int oscMTU;
    private String oscMACAddr;
    private String oscIPAddr;
    private String oscIPMask;
    private String oscIPBcast;
    private int oscRowStatus;
    private String _index;
    private OscTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OscEntry() {
    }

    public int getOscShelfIdx() {
        return this.oscShelfIdx;
    }

    public void setOscShelfIdx(int oscShelfIdx) {
        int oldValue = getOscShelfIdx();
        this.oscShelfIdx = oscShelfIdx;
        notifyChange(1, oldValue, oscShelfIdx);
    }

    public int getOscSlotIdx() {
        return this.oscSlotIdx;
    }

    public void setOscSlotIdx(int oscSlotIdx) {
        int oldValue = getOscSlotIdx();
        this.oscSlotIdx = oscSlotIdx;
        notifyChange(2, oldValue, oscSlotIdx);
    }

    public int getOscIdx() {
        return this.oscIdx;
    }

    public void setOscIdx(int oscIdx) {
        int oldValue = getOscIdx();
        this.oscIdx = oscIdx;
        notifyChange(3, oldValue, oscIdx);
    }

    public int getOscAdminStatus() {
        if (this.oscAdminStatus == null) {
            return  1;
        }
        return this.oscAdminStatus;
    }

    public boolean isOscAdminStatusDefined() {
        return (this.oscAdminStatus!= null);
    }

    public void setOscAdminStatus(int oscAdminStatus) {
        int oldValue = getOscAdminStatus();
        this.oscAdminStatus = oscAdminStatus;
        notifyChange(4, oldValue, oscAdminStatus);
    }

    public int getOscOperStatus() {
        return this.oscOperStatus;
    }

    public void setOscOperStatus(int oscOperStatus) {
        int oldValue = getOscOperStatus();
        this.oscOperStatus = oscOperStatus;
        notifyChange(5, oldValue, oscOperStatus);
    }

    public String getOscOperStatQlfr() {
        return this.oscOperStatQlfr;
    }

    public void setOscOperStatQlfr(String oscOperStatQlfr) {
        String oldValue = getOscOperStatQlfr();
        this.oscOperStatQlfr = oscOperStatQlfr;
        notifyChange(6, oldValue, oscOperStatQlfr);
    }

    public String getOscCustom1() {
        if (this.oscCustom1 == null) {
            return "";
        }
        return this.oscCustom1;
    }

    public boolean isOscCustom1Defined() {
        return (this.oscCustom1 != null);
    }

    public void setOscCustom1(String oscCustom1) {
        String oldValue = getOscCustom1();
        this.oscCustom1 = oscCustom1;
        notifyChange(7, oldValue, oscCustom1);
    }

    public int getOscType() {
        return this.oscType;
    }

    public void setOscType(int oscType) {
        int oldValue = getOscType();
        this.oscType = oscType;
        notifyChange(8, oldValue, oscType);
    }

    public int getOscUnmbrd() {
        return this.oscUnmbrd;
    }

    public void setOscUnmbrd(int oscUnmbrd) {
        int oldValue = getOscUnmbrd();
        this.oscUnmbrd = oscUnmbrd;
        notifyChange(9, oldValue, oscUnmbrd);
    }

    public int getOscSpeed() {
        return this.oscSpeed;
    }

    public void setOscSpeed(int oscSpeed) {
        int oldValue = getOscSpeed();
        this.oscSpeed = oscSpeed;
        notifyChange(10, oldValue, oscSpeed);
    }

    public int getOscDuplex() {
        return this.oscDuplex;
    }

    public void setOscDuplex(int oscDuplex) {
        int oldValue = getOscDuplex();
        this.oscDuplex = oscDuplex;
        notifyChange(11, oldValue, oscDuplex);
    }

    public int getOscMediaRate() {
        return this.oscMediaRate;
    }

    public void setOscMediaRate(int oscMediaRate) {
        int oldValue = getOscMediaRate();
        this.oscMediaRate = oscMediaRate;
        notifyChange(12, oldValue, oscMediaRate);
    }

    public int getOscMTU() {
        return this.oscMTU;
    }

    public void setOscMTU(int oscMTU) {
        int oldValue = getOscMTU();
        this.oscMTU = oscMTU;
        notifyChange(13, oldValue, oscMTU);
    }

    public String getOscMACAddr() {
        return this.oscMACAddr;
    }

    public void setOscMACAddr(String oscMACAddr) {
        String oldValue = getOscMACAddr();
        this.oscMACAddr = oscMACAddr;
        notifyChange(14, oldValue, oscMACAddr);
    }

    public String getOscIPAddr() {
        return this.oscIPAddr;
    }

    public void setOscIPAddr(String oscIPAddr) {
        String oldValue = getOscIPAddr();
        this.oscIPAddr = oscIPAddr;
        notifyChange(15, oldValue, oscIPAddr);
    }

    public String getOscIPMask() {
        return this.oscIPMask;
    }

    public void setOscIPMask(String oscIPMask) {
        String oldValue = getOscIPMask();
        this.oscIPMask = oscIPMask;
        notifyChange(16, oldValue, oscIPMask);
    }

    public String getOscIPBcast() {
        return this.oscIPBcast;
    }

    public void setOscIPBcast(String oscIPBcast) {
        String oldValue = getOscIPBcast();
        this.oscIPBcast = oscIPBcast;
        notifyChange(17, oldValue, oscIPBcast);
    }

    public int getOscRowStatus() {
        return this.oscRowStatus;
    }

    public void setOscRowStatus(int oscRowStatus) {
        int oldValue = getOscRowStatus();
        this.oscRowStatus = oscRowStatus;
        notifyChange(100, oldValue, oscRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setOscShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setOscSlotIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setOscIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setOscAdminStatus(binding.getVariable().toInt());
                break;
            case  5 :
                setOscOperStatus(binding.getVariable().toInt());
                break;
            case  6 :
                setOscOperStatQlfr(binding.getVariable().toString());
                break;
            case  7 :
                setOscCustom1(binding.getVariable().toString());
                break;
            case  8 :
                setOscType(binding.getVariable().toInt());
                break;
            case  9 :
                setOscUnmbrd(binding.getVariable().toInt());
                break;
            case  10 :
                setOscSpeed(binding.getVariable().toInt());
                break;
            case  11 :
                setOscDuplex(binding.getVariable().toInt());
                break;
            case  12 :
                setOscMediaRate(binding.getVariable().toInt());
                break;
            case  13 :
                setOscMTU(binding.getVariable().toInt());
                break;
            case  14 :
                setOscMACAddr(binding.getVariable().toString());
                break;
            case  15 :
                setOscIPAddr(binding.getVariable().toString());
                break;
            case  16 :
                setOscIPMask(binding.getVariable().toString());
                break;
            case  17 :
                setOscIPBcast(binding.getVariable().toString());
                break;
            case  100 :
                setOscRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setOscShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOscSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOscIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OscTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("oscShelfIdx", oscShelfIdx).append("oscSlotIdx", oscSlotIdx).append("oscIdx", oscIdx).append("oscAdminStatus", oscAdminStatus).append("oscOperStatus", oscOperStatus).append("oscOperStatQlfr", oscOperStatQlfr).append("oscCustom1", oscCustom1).append("oscType", oscType).append("oscUnmbrd", oscUnmbrd).append("oscSpeed", oscSpeed).append("oscDuplex", oscDuplex).append("oscMediaRate", oscMediaRate).append("oscMTU", oscMTU).append("oscMACAddr", oscMACAddr).append("oscIPAddr", oscIPAddr).append("oscIPMask", oscIPMask).append("oscIPBcast", oscIPBcast).append("oscRowStatus", oscRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(oscShelfIdx).append(oscSlotIdx).append(oscIdx).append(oscAdminStatus).append(oscOperStatus).append(oscOperStatQlfr).append(oscCustom1).append(oscType).append(oscUnmbrd).append(oscSpeed).append(oscDuplex).append(oscMediaRate).append(oscMTU).append(oscMACAddr).append(oscIPAddr).append(oscIPMask).append(oscIPBcast).append(oscRowStatus).append(_index).toHashCode();
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
        OscEntry rhs = ((OscEntry) obj);
        return new EqualsBuilder().append(oscShelfIdx, rhs.oscShelfIdx).append(oscSlotIdx, rhs.oscSlotIdx).append(oscIdx, rhs.oscIdx).append(oscAdminStatus, rhs.oscAdminStatus).append(oscOperStatus, rhs.oscOperStatus).append(oscOperStatQlfr, rhs.oscOperStatQlfr).append(oscCustom1, rhs.oscCustom1).append(oscType, rhs.oscType).append(oscUnmbrd, rhs.oscUnmbrd).append(oscSpeed, rhs.oscSpeed).append(oscDuplex, rhs.oscDuplex).append(oscMediaRate, rhs.oscMediaRate).append(oscMTU, rhs.oscMTU).append(oscMACAddr, rhs.oscMACAddr).append(oscIPAddr, rhs.oscIPAddr).append(oscIPMask, rhs.oscIPMask).append(oscIPBcast, rhs.oscIPBcast).append(oscRowStatus, rhs.oscRowStatus).append(_index, rhs._index).isEquals();
    }

    public OscEntry clone() {
        OscEntry _copy = new OscEntry();
        _copy.oscShelfIdx = oscShelfIdx;
        _copy.oscSlotIdx = oscSlotIdx;
        _copy.oscIdx = oscIdx;
        _copy.oscAdminStatus = oscAdminStatus;
        _copy.oscOperStatus = oscOperStatus;
        _copy.oscOperStatQlfr = oscOperStatQlfr;
        _copy.oscCustom1 = oscCustom1;
        _copy.oscType = oscType;
        _copy.oscUnmbrd = oscUnmbrd;
        _copy.oscSpeed = oscSpeed;
        _copy.oscDuplex = oscDuplex;
        _copy.oscMediaRate = oscMediaRate;
        _copy.oscMTU = oscMTU;
        _copy.oscMACAddr = oscMACAddr;
        _copy.oscIPAddr = oscIPAddr;
        _copy.oscIPMask = oscIPMask;
        _copy.oscIPBcast = oscIPBcast;
        _copy.oscRowStatus = oscRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.5.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "oscShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "oscSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "oscIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "oscAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "oscOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "oscOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "oscCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "oscType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "oscUnmbrd", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "oscSpeed", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "oscDuplex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "oscMediaRate", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "oscMTU", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "oscMACAddr", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "oscIPAddr", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "oscIPMask", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "oscIPBcast", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "oscRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
