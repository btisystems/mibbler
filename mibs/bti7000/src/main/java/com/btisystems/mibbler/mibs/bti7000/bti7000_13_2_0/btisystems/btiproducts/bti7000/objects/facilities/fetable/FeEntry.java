
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.fetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.FeTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.fetable.IFeEntry;
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

public class FeEntry
    extends DeviceEntity
    implements Serializable, IFeEntry, IIndexed, IVariableBindingSetter
{

    private int feShelfIdx;
    private int feSlotIdx;
    private int fePortIdx;
    private String feId1;
    private String feCustom1;
    private int feSpeed;
    private int feDuplex;
    private int feMediaRate;
    private int feMTU;
    private String feMACAddr;
    private String feRemoteId;
    private int feRowStatus;
    private String _index;
    private FeTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public FeEntry() {
    }

    public int getFeShelfIdx() {
        return this.feShelfIdx;
    }

    public void setFeShelfIdx(int feShelfIdx) {
        int oldValue = getFeShelfIdx();
        this.feShelfIdx = feShelfIdx;
        notifyChange(1, oldValue, feShelfIdx);
    }

    public int getFeSlotIdx() {
        return this.feSlotIdx;
    }

    public void setFeSlotIdx(int feSlotIdx) {
        int oldValue = getFeSlotIdx();
        this.feSlotIdx = feSlotIdx;
        notifyChange(2, oldValue, feSlotIdx);
    }

    public int getFePortIdx() {
        return this.fePortIdx;
    }

    public void setFePortIdx(int fePortIdx) {
        int oldValue = getFePortIdx();
        this.fePortIdx = fePortIdx;
        notifyChange(3, oldValue, fePortIdx);
    }

    public String getFeId1() {
        if (this.feId1 == null) {
            return "";
        }
        return this.feId1;
    }

    public boolean isFeId1Defined() {
        return (this.feId1 != null);
    }

    public void setFeId1(String feId1) {
        String oldValue = getFeId1();
        this.feId1 = feId1;
        notifyChange(4, oldValue, feId1);
    }

    public String getFeCustom1() {
        if (this.feCustom1 == null) {
            return "";
        }
        return this.feCustom1;
    }

    public boolean isFeCustom1Defined() {
        return (this.feCustom1 != null);
    }

    public void setFeCustom1(String feCustom1) {
        String oldValue = getFeCustom1();
        this.feCustom1 = feCustom1;
        notifyChange(5, oldValue, feCustom1);
    }

    public int getFeSpeed() {
        return this.feSpeed;
    }

    public void setFeSpeed(int feSpeed) {
        int oldValue = getFeSpeed();
        this.feSpeed = feSpeed;
        notifyChange(6, oldValue, feSpeed);
    }

    public int getFeDuplex() {
        return this.feDuplex;
    }

    public void setFeDuplex(int feDuplex) {
        int oldValue = getFeDuplex();
        this.feDuplex = feDuplex;
        notifyChange(7, oldValue, feDuplex);
    }

    public int getFeMediaRate() {
        return this.feMediaRate;
    }

    public void setFeMediaRate(int feMediaRate) {
        int oldValue = getFeMediaRate();
        this.feMediaRate = feMediaRate;
        notifyChange(8, oldValue, feMediaRate);
    }

    public int getFeMTU() {
        return this.feMTU;
    }

    public void setFeMTU(int feMTU) {
        int oldValue = getFeMTU();
        this.feMTU = feMTU;
        notifyChange(9, oldValue, feMTU);
    }

    public String getFeMACAddr() {
        return this.feMACAddr;
    }

    public void setFeMACAddr(String feMACAddr) {
        String oldValue = getFeMACAddr();
        this.feMACAddr = feMACAddr;
        notifyChange(10, oldValue, feMACAddr);
    }

    public String getFeRemoteId() {
        if (this.feRemoteId == null) {
            return "";
        }
        return this.feRemoteId;
    }

    public boolean isFeRemoteIdDefined() {
        return (this.feRemoteId!= null);
    }

    public void setFeRemoteId(String feRemoteId) {
        String oldValue = getFeRemoteId();
        this.feRemoteId = feRemoteId;
        notifyChange(11, oldValue, feRemoteId);
    }

    public int getFeRowStatus() {
        return this.feRowStatus;
    }

    public void setFeRowStatus(int feRowStatus) {
        int oldValue = getFeRowStatus();
        this.feRowStatus = feRowStatus;
        notifyChange(100, oldValue, feRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setFeShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setFeSlotIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setFePortIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setFeId1(binding.getVariable().toString());
                break;
            case  5 :
                setFeCustom1(binding.getVariable().toString());
                break;
            case  6 :
                setFeSpeed(binding.getVariable().toInt());
                break;
            case  7 :
                setFeDuplex(binding.getVariable().toInt());
                break;
            case  8 :
                setFeMediaRate(binding.getVariable().toInt());
                break;
            case  9 :
                setFeMTU(binding.getVariable().toInt());
                break;
            case  10 :
                setFeMACAddr(binding.getVariable().toString());
                break;
            case  11 :
                setFeRemoteId(binding.getVariable().toString());
                break;
            case  100 :
                setFeRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setFeShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setFeSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setFePortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(FeTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("feShelfIdx", feShelfIdx).append("feSlotIdx", feSlotIdx).append("fePortIdx", fePortIdx).append("feId1", feId1).append("feCustom1", feCustom1).append("feSpeed", feSpeed).append("feDuplex", feDuplex).append("feMediaRate", feMediaRate).append("feMTU", feMTU).append("feMACAddr", feMACAddr).append("feRemoteId", feRemoteId).append("feRowStatus", feRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(feShelfIdx).append(feSlotIdx).append(fePortIdx).append(feId1).append(feCustom1).append(feSpeed).append(feDuplex).append(feMediaRate).append(feMTU).append(feMACAddr).append(feRemoteId).append(feRowStatus).append(_index).toHashCode();
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
        FeEntry rhs = ((FeEntry) obj);
        return new EqualsBuilder().append(feShelfIdx, rhs.feShelfIdx).append(feSlotIdx, rhs.feSlotIdx).append(fePortIdx, rhs.fePortIdx).append(feId1, rhs.feId1).append(feCustom1, rhs.feCustom1).append(feSpeed, rhs.feSpeed).append(feDuplex, rhs.feDuplex).append(feMediaRate, rhs.feMediaRate).append(feMTU, rhs.feMTU).append(feMACAddr, rhs.feMACAddr).append(feRemoteId, rhs.feRemoteId).append(feRowStatus, rhs.feRowStatus).append(_index, rhs._index).isEquals();
    }

    public FeEntry clone() {
        FeEntry _copy = new FeEntry();
        _copy.feShelfIdx = feShelfIdx;
        _copy.feSlotIdx = feSlotIdx;
        _copy.fePortIdx = fePortIdx;
        _copy.feId1 = feId1;
        _copy.feCustom1 = feCustom1;
        _copy.feSpeed = feSpeed;
        _copy.feDuplex = feDuplex;
        _copy.feMediaRate = feMediaRate;
        _copy.feMTU = feMTU;
        _copy.feMACAddr = feMACAddr;
        _copy.feRemoteId = feRemoteId;
        _copy.feRowStatus = feRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.10.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "feShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "feSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "fePortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "feId1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "feCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "feSpeed", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "feDuplex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "feMediaRate", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "feMTU", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "feMACAddr", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "feRemoteId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "feRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
