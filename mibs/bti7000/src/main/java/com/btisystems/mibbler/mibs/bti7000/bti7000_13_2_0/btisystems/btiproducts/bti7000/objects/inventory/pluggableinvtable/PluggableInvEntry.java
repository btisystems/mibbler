
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory.pluggableinvtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory.PluggableInvTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.pluggableinvtable.IPluggableInvEntry;
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

public class PluggableInvEntry
    extends DeviceEntity
    implements Serializable, IPluggableInvEntry, IIndexed, IVariableBindingSetter
{

    private int pluggableInvShelfIdx;
    private int pluggableInvSlotTypeIdx;
    private int pluggableInvSlotIdx;
    private int pluggableInvPortIdx;
    private int pluggableInvType;
    private String pluggableInvPEC;
    private String pluggableInvCLEI;
    private String pluggableInvVendorName;
    private String pluggableInvVendorOUI;
    private String pluggableInvVendorPartNum;
    private String pluggableInvVendorRev;
    private String pluggableInvVendorSerialNum;
    private String pluggableInvMfgDate;
    private int pluggableInvConnectorType;
    private int pluggableInvMinBitRate;
    private int pluggableInvMaxBitRate;
    private int pluggableInvNomBitRate;
    private String pluggableInvEncoding;
    private int pluggableInvWavelength;
    private int pluggableInvReach;
    private int pluggableInvTxFaultImpl;
    private int pluggableInvLOSImpl;
    private int pluggableInvDDiagImpl;
    private int pluggableInvTxDisableImpl;
    private int pluggableInvMedia;
    private String pluggableInvUSI;
    private int pluggableInvWavelengthMin;
    private int pluggableInvWavelengthMax;
    private int pluggableInvWavelengthSpacing;
    private String _index;
    private PluggableInvTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public PluggableInvEntry() {
    }

    public int getPluggableInvShelfIdx() {
        return this.pluggableInvShelfIdx;
    }

    public void setPluggableInvShelfIdx(int pluggableInvShelfIdx) {
        int oldValue = getPluggableInvShelfIdx();
        this.pluggableInvShelfIdx = pluggableInvShelfIdx;
        notifyChange(1, oldValue, pluggableInvShelfIdx);
    }

    public int getPluggableInvSlotTypeIdx() {
        return this.pluggableInvSlotTypeIdx;
    }

    public void setPluggableInvSlotTypeIdx(int pluggableInvSlotTypeIdx) {
        int oldValue = getPluggableInvSlotTypeIdx();
        this.pluggableInvSlotTypeIdx = pluggableInvSlotTypeIdx;
        notifyChange(2, oldValue, pluggableInvSlotTypeIdx);
    }

    public int getPluggableInvSlotIdx() {
        return this.pluggableInvSlotIdx;
    }

    public void setPluggableInvSlotIdx(int pluggableInvSlotIdx) {
        int oldValue = getPluggableInvSlotIdx();
        this.pluggableInvSlotIdx = pluggableInvSlotIdx;
        notifyChange(3, oldValue, pluggableInvSlotIdx);
    }

    public int getPluggableInvPortIdx() {
        return this.pluggableInvPortIdx;
    }

    public void setPluggableInvPortIdx(int pluggableInvPortIdx) {
        int oldValue = getPluggableInvPortIdx();
        this.pluggableInvPortIdx = pluggableInvPortIdx;
        notifyChange(4, oldValue, pluggableInvPortIdx);
    }

    public int getPluggableInvType() {
        return this.pluggableInvType;
    }

    public void setPluggableInvType(int pluggableInvType) {
        int oldValue = getPluggableInvType();
        this.pluggableInvType = pluggableInvType;
        notifyChange(5, oldValue, pluggableInvType);
    }

    public String getPluggableInvPEC() {
        return this.pluggableInvPEC;
    }

    public void setPluggableInvPEC(String pluggableInvPEC) {
        String oldValue = getPluggableInvPEC();
        this.pluggableInvPEC = pluggableInvPEC;
        notifyChange(6, oldValue, pluggableInvPEC);
    }

    public String getPluggableInvCLEI() {
        return this.pluggableInvCLEI;
    }

    public void setPluggableInvCLEI(String pluggableInvCLEI) {
        String oldValue = getPluggableInvCLEI();
        this.pluggableInvCLEI = pluggableInvCLEI;
        notifyChange(7, oldValue, pluggableInvCLEI);
    }

    public String getPluggableInvVendorName() {
        return this.pluggableInvVendorName;
    }

    public void setPluggableInvVendorName(String pluggableInvVendorName) {
        String oldValue = getPluggableInvVendorName();
        this.pluggableInvVendorName = pluggableInvVendorName;
        notifyChange(8, oldValue, pluggableInvVendorName);
    }

    public String getPluggableInvVendorOUI() {
        return this.pluggableInvVendorOUI;
    }

    public void setPluggableInvVendorOUI(String pluggableInvVendorOUI) {
        String oldValue = getPluggableInvVendorOUI();
        this.pluggableInvVendorOUI = pluggableInvVendorOUI;
        notifyChange(9, oldValue, pluggableInvVendorOUI);
    }

    public String getPluggableInvVendorPartNum() {
        return this.pluggableInvVendorPartNum;
    }

    public void setPluggableInvVendorPartNum(String pluggableInvVendorPartNum) {
        String oldValue = getPluggableInvVendorPartNum();
        this.pluggableInvVendorPartNum = pluggableInvVendorPartNum;
        notifyChange(10, oldValue, pluggableInvVendorPartNum);
    }

    public String getPluggableInvVendorRev() {
        return this.pluggableInvVendorRev;
    }

    public void setPluggableInvVendorRev(String pluggableInvVendorRev) {
        String oldValue = getPluggableInvVendorRev();
        this.pluggableInvVendorRev = pluggableInvVendorRev;
        notifyChange(11, oldValue, pluggableInvVendorRev);
    }

    public String getPluggableInvVendorSerialNum() {
        return this.pluggableInvVendorSerialNum;
    }

    public void setPluggableInvVendorSerialNum(String pluggableInvVendorSerialNum) {
        String oldValue = getPluggableInvVendorSerialNum();
        this.pluggableInvVendorSerialNum = pluggableInvVendorSerialNum;
        notifyChange(12, oldValue, pluggableInvVendorSerialNum);
    }

    public String getPluggableInvMfgDate() {
        return this.pluggableInvMfgDate;
    }

    public void setPluggableInvMfgDate(String pluggableInvMfgDate) {
        String oldValue = getPluggableInvMfgDate();
        this.pluggableInvMfgDate = pluggableInvMfgDate;
        notifyChange(13, oldValue, pluggableInvMfgDate);
    }

    public int getPluggableInvConnectorType() {
        return this.pluggableInvConnectorType;
    }

    public void setPluggableInvConnectorType(int pluggableInvConnectorType) {
        int oldValue = getPluggableInvConnectorType();
        this.pluggableInvConnectorType = pluggableInvConnectorType;
        notifyChange(14, oldValue, pluggableInvConnectorType);
    }

    public int getPluggableInvMinBitRate() {
        return this.pluggableInvMinBitRate;
    }

    public void setPluggableInvMinBitRate(int pluggableInvMinBitRate) {
        int oldValue = getPluggableInvMinBitRate();
        this.pluggableInvMinBitRate = pluggableInvMinBitRate;
        notifyChange(15, oldValue, pluggableInvMinBitRate);
    }

    public int getPluggableInvMaxBitRate() {
        return this.pluggableInvMaxBitRate;
    }

    public void setPluggableInvMaxBitRate(int pluggableInvMaxBitRate) {
        int oldValue = getPluggableInvMaxBitRate();
        this.pluggableInvMaxBitRate = pluggableInvMaxBitRate;
        notifyChange(16, oldValue, pluggableInvMaxBitRate);
    }

    public int getPluggableInvNomBitRate() {
        return this.pluggableInvNomBitRate;
    }

    public void setPluggableInvNomBitRate(int pluggableInvNomBitRate) {
        int oldValue = getPluggableInvNomBitRate();
        this.pluggableInvNomBitRate = pluggableInvNomBitRate;
        notifyChange(17, oldValue, pluggableInvNomBitRate);
    }

    public String getPluggableInvEncoding() {
        return this.pluggableInvEncoding;
    }

    public void setPluggableInvEncoding(String pluggableInvEncoding) {
        String oldValue = getPluggableInvEncoding();
        this.pluggableInvEncoding = pluggableInvEncoding;
        notifyChange(18, oldValue, pluggableInvEncoding);
    }

    public int getPluggableInvWavelength() {
        return this.pluggableInvWavelength;
    }

    public void setPluggableInvWavelength(int pluggableInvWavelength) {
        int oldValue = getPluggableInvWavelength();
        this.pluggableInvWavelength = pluggableInvWavelength;
        notifyChange(19, oldValue, pluggableInvWavelength);
    }

    public int getPluggableInvReach() {
        return this.pluggableInvReach;
    }

    public void setPluggableInvReach(int pluggableInvReach) {
        int oldValue = getPluggableInvReach();
        this.pluggableInvReach = pluggableInvReach;
        notifyChange(20, oldValue, pluggableInvReach);
    }

    public int getPluggableInvTxFaultImpl() {
        return this.pluggableInvTxFaultImpl;
    }

    public void setPluggableInvTxFaultImpl(int pluggableInvTxFaultImpl) {
        int oldValue = getPluggableInvTxFaultImpl();
        this.pluggableInvTxFaultImpl = pluggableInvTxFaultImpl;
        notifyChange(21, oldValue, pluggableInvTxFaultImpl);
    }

    public int getPluggableInvLOSImpl() {
        return this.pluggableInvLOSImpl;
    }

    public void setPluggableInvLOSImpl(int pluggableInvLOSImpl) {
        int oldValue = getPluggableInvLOSImpl();
        this.pluggableInvLOSImpl = pluggableInvLOSImpl;
        notifyChange(22, oldValue, pluggableInvLOSImpl);
    }

    public int getPluggableInvDDiagImpl() {
        return this.pluggableInvDDiagImpl;
    }

    public void setPluggableInvDDiagImpl(int pluggableInvDDiagImpl) {
        int oldValue = getPluggableInvDDiagImpl();
        this.pluggableInvDDiagImpl = pluggableInvDDiagImpl;
        notifyChange(23, oldValue, pluggableInvDDiagImpl);
    }

    public int getPluggableInvTxDisableImpl() {
        return this.pluggableInvTxDisableImpl;
    }

    public void setPluggableInvTxDisableImpl(int pluggableInvTxDisableImpl) {
        int oldValue = getPluggableInvTxDisableImpl();
        this.pluggableInvTxDisableImpl = pluggableInvTxDisableImpl;
        notifyChange(24, oldValue, pluggableInvTxDisableImpl);
    }

    public int getPluggableInvMedia() {
        return this.pluggableInvMedia;
    }

    public void setPluggableInvMedia(int pluggableInvMedia) {
        int oldValue = getPluggableInvMedia();
        this.pluggableInvMedia = pluggableInvMedia;
        notifyChange(25, oldValue, pluggableInvMedia);
    }

    public String getPluggableInvUSI() {
        return this.pluggableInvUSI;
    }

    public void setPluggableInvUSI(String pluggableInvUSI) {
        String oldValue = getPluggableInvUSI();
        this.pluggableInvUSI = pluggableInvUSI;
        notifyChange(26, oldValue, pluggableInvUSI);
    }

    public int getPluggableInvWavelengthMin() {
        return this.pluggableInvWavelengthMin;
    }

    public void setPluggableInvWavelengthMin(int pluggableInvWavelengthMin) {
        int oldValue = getPluggableInvWavelengthMin();
        this.pluggableInvWavelengthMin = pluggableInvWavelengthMin;
        notifyChange(27, oldValue, pluggableInvWavelengthMin);
    }

    public int getPluggableInvWavelengthMax() {
        return this.pluggableInvWavelengthMax;
    }

    public void setPluggableInvWavelengthMax(int pluggableInvWavelengthMax) {
        int oldValue = getPluggableInvWavelengthMax();
        this.pluggableInvWavelengthMax = pluggableInvWavelengthMax;
        notifyChange(28, oldValue, pluggableInvWavelengthMax);
    }

    public int getPluggableInvWavelengthSpacing() {
        return this.pluggableInvWavelengthSpacing;
    }

    public void setPluggableInvWavelengthSpacing(int pluggableInvWavelengthSpacing) {
        int oldValue = getPluggableInvWavelengthSpacing();
        this.pluggableInvWavelengthSpacing = pluggableInvWavelengthSpacing;
        notifyChange(29, oldValue, pluggableInvWavelengthSpacing);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setPluggableInvShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setPluggableInvSlotTypeIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setPluggableInvSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setPluggableInvPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setPluggableInvType(binding.getVariable().toInt());
                break;
            case  6 :
                setPluggableInvPEC(binding.getVariable().toString());
                break;
            case  7 :
                setPluggableInvCLEI(binding.getVariable().toString());
                break;
            case  8 :
                setPluggableInvVendorName(binding.getVariable().toString());
                break;
            case  9 :
                setPluggableInvVendorOUI(binding.getVariable().toString());
                break;
            case  10 :
                setPluggableInvVendorPartNum(binding.getVariable().toString());
                break;
            case  11 :
                setPluggableInvVendorRev(binding.getVariable().toString());
                break;
            case  12 :
                setPluggableInvVendorSerialNum(binding.getVariable().toString());
                break;
            case  13 :
                setPluggableInvMfgDate(binding.getVariable().toString());
                break;
            case  14 :
                setPluggableInvConnectorType(binding.getVariable().toInt());
                break;
            case  15 :
                setPluggableInvMinBitRate(binding.getVariable().toInt());
                break;
            case  16 :
                setPluggableInvMaxBitRate(binding.getVariable().toInt());
                break;
            case  17 :
                setPluggableInvNomBitRate(binding.getVariable().toInt());
                break;
            case  18 :
                setPluggableInvEncoding(binding.getVariable().toString());
                break;
            case  19 :
                setPluggableInvWavelength(binding.getVariable().toInt());
                break;
            case  20 :
                setPluggableInvReach(binding.getVariable().toInt());
                break;
            case  21 :
                setPluggableInvTxFaultImpl(binding.getVariable().toInt());
                break;
            case  22 :
                setPluggableInvLOSImpl(binding.getVariable().toInt());
                break;
            case  23 :
                setPluggableInvDDiagImpl(binding.getVariable().toInt());
                break;
            case  24 :
                setPluggableInvTxDisableImpl(binding.getVariable().toInt());
                break;
            case  25 :
                setPluggableInvMedia(binding.getVariable().toInt());
                break;
            case  26 :
                setPluggableInvUSI(binding.getVariable().toString());
                break;
            case  27 :
                setPluggableInvWavelengthMin(binding.getVariable().toInt());
                break;
            case  28 :
                setPluggableInvWavelengthMax(binding.getVariable().toInt());
                break;
            case  29 :
                setPluggableInvWavelengthSpacing(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setPluggableInvShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPluggableInvSlotTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPluggableInvSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPluggableInvPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(PluggableInvTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("pluggableInvShelfIdx", pluggableInvShelfIdx).append("pluggableInvSlotTypeIdx", pluggableInvSlotTypeIdx).append("pluggableInvSlotIdx", pluggableInvSlotIdx).append("pluggableInvPortIdx", pluggableInvPortIdx).append("pluggableInvType", pluggableInvType).append("pluggableInvPEC", pluggableInvPEC).append("pluggableInvCLEI", pluggableInvCLEI).append("pluggableInvVendorName", pluggableInvVendorName).append("pluggableInvVendorOUI", pluggableInvVendorOUI).append("pluggableInvVendorPartNum", pluggableInvVendorPartNum).append("pluggableInvVendorRev", pluggableInvVendorRev).append("pluggableInvVendorSerialNum", pluggableInvVendorSerialNum).append("pluggableInvMfgDate", pluggableInvMfgDate).append("pluggableInvConnectorType", pluggableInvConnectorType).append("pluggableInvMinBitRate", pluggableInvMinBitRate).append("pluggableInvMaxBitRate", pluggableInvMaxBitRate).append("pluggableInvNomBitRate", pluggableInvNomBitRate).append("pluggableInvEncoding", pluggableInvEncoding).append("pluggableInvWavelength", pluggableInvWavelength).append("pluggableInvReach", pluggableInvReach).append("pluggableInvTxFaultImpl", pluggableInvTxFaultImpl).append("pluggableInvLOSImpl", pluggableInvLOSImpl).append("pluggableInvDDiagImpl", pluggableInvDDiagImpl).append("pluggableInvTxDisableImpl", pluggableInvTxDisableImpl).append("pluggableInvMedia", pluggableInvMedia).append("pluggableInvUSI", pluggableInvUSI).append("pluggableInvWavelengthMin", pluggableInvWavelengthMin).append("pluggableInvWavelengthMax", pluggableInvWavelengthMax).append("pluggableInvWavelengthSpacing", pluggableInvWavelengthSpacing).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(pluggableInvShelfIdx).append(pluggableInvSlotTypeIdx).append(pluggableInvSlotIdx).append(pluggableInvPortIdx).append(pluggableInvType).append(pluggableInvPEC).append(pluggableInvCLEI).append(pluggableInvVendorName).append(pluggableInvVendorOUI).append(pluggableInvVendorPartNum).append(pluggableInvVendorRev).append(pluggableInvVendorSerialNum).append(pluggableInvMfgDate).append(pluggableInvConnectorType).append(pluggableInvMinBitRate).append(pluggableInvMaxBitRate).append(pluggableInvNomBitRate).append(pluggableInvEncoding).append(pluggableInvWavelength).append(pluggableInvReach).append(pluggableInvTxFaultImpl).append(pluggableInvLOSImpl).append(pluggableInvDDiagImpl).append(pluggableInvTxDisableImpl).append(pluggableInvMedia).append(pluggableInvUSI).append(pluggableInvWavelengthMin).append(pluggableInvWavelengthMax).append(pluggableInvWavelengthSpacing).append(_index).toHashCode();
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
        PluggableInvEntry rhs = ((PluggableInvEntry) obj);
        return new EqualsBuilder().append(pluggableInvShelfIdx, rhs.pluggableInvShelfIdx).append(pluggableInvSlotTypeIdx, rhs.pluggableInvSlotTypeIdx).append(pluggableInvSlotIdx, rhs.pluggableInvSlotIdx).append(pluggableInvPortIdx, rhs.pluggableInvPortIdx).append(pluggableInvType, rhs.pluggableInvType).append(pluggableInvPEC, rhs.pluggableInvPEC).append(pluggableInvCLEI, rhs.pluggableInvCLEI).append(pluggableInvVendorName, rhs.pluggableInvVendorName).append(pluggableInvVendorOUI, rhs.pluggableInvVendorOUI).append(pluggableInvVendorPartNum, rhs.pluggableInvVendorPartNum).append(pluggableInvVendorRev, rhs.pluggableInvVendorRev).append(pluggableInvVendorSerialNum, rhs.pluggableInvVendorSerialNum).append(pluggableInvMfgDate, rhs.pluggableInvMfgDate).append(pluggableInvConnectorType, rhs.pluggableInvConnectorType).append(pluggableInvMinBitRate, rhs.pluggableInvMinBitRate).append(pluggableInvMaxBitRate, rhs.pluggableInvMaxBitRate).append(pluggableInvNomBitRate, rhs.pluggableInvNomBitRate).append(pluggableInvEncoding, rhs.pluggableInvEncoding).append(pluggableInvWavelength, rhs.pluggableInvWavelength).append(pluggableInvReach, rhs.pluggableInvReach).append(pluggableInvTxFaultImpl, rhs.pluggableInvTxFaultImpl).append(pluggableInvLOSImpl, rhs.pluggableInvLOSImpl).append(pluggableInvDDiagImpl, rhs.pluggableInvDDiagImpl).append(pluggableInvTxDisableImpl, rhs.pluggableInvTxDisableImpl).append(pluggableInvMedia, rhs.pluggableInvMedia).append(pluggableInvUSI, rhs.pluggableInvUSI).append(pluggableInvWavelengthMin, rhs.pluggableInvWavelengthMin).append(pluggableInvWavelengthMax, rhs.pluggableInvWavelengthMax).append(pluggableInvWavelengthSpacing, rhs.pluggableInvWavelengthSpacing).append(_index, rhs._index).isEquals();
    }

    public PluggableInvEntry clone() {
        PluggableInvEntry _copy = new PluggableInvEntry();
        _copy.pluggableInvShelfIdx = pluggableInvShelfIdx;
        _copy.pluggableInvSlotTypeIdx = pluggableInvSlotTypeIdx;
        _copy.pluggableInvSlotIdx = pluggableInvSlotIdx;
        _copy.pluggableInvPortIdx = pluggableInvPortIdx;
        _copy.pluggableInvType = pluggableInvType;
        _copy.pluggableInvPEC = pluggableInvPEC;
        _copy.pluggableInvCLEI = pluggableInvCLEI;
        _copy.pluggableInvVendorName = pluggableInvVendorName;
        _copy.pluggableInvVendorOUI = pluggableInvVendorOUI;
        _copy.pluggableInvVendorPartNum = pluggableInvVendorPartNum;
        _copy.pluggableInvVendorRev = pluggableInvVendorRev;
        _copy.pluggableInvVendorSerialNum = pluggableInvVendorSerialNum;
        _copy.pluggableInvMfgDate = pluggableInvMfgDate;
        _copy.pluggableInvConnectorType = pluggableInvConnectorType;
        _copy.pluggableInvMinBitRate = pluggableInvMinBitRate;
        _copy.pluggableInvMaxBitRate = pluggableInvMaxBitRate;
        _copy.pluggableInvNomBitRate = pluggableInvNomBitRate;
        _copy.pluggableInvEncoding = pluggableInvEncoding;
        _copy.pluggableInvWavelength = pluggableInvWavelength;
        _copy.pluggableInvReach = pluggableInvReach;
        _copy.pluggableInvTxFaultImpl = pluggableInvTxFaultImpl;
        _copy.pluggableInvLOSImpl = pluggableInvLOSImpl;
        _copy.pluggableInvDDiagImpl = pluggableInvDDiagImpl;
        _copy.pluggableInvTxDisableImpl = pluggableInvTxDisableImpl;
        _copy.pluggableInvMedia = pluggableInvMedia;
        _copy.pluggableInvUSI = pluggableInvUSI;
        _copy.pluggableInvWavelengthMin = pluggableInvWavelengthMin;
        _copy.pluggableInvWavelengthMax = pluggableInvWavelengthMax;
        _copy.pluggableInvWavelengthSpacing = pluggableInvWavelengthSpacing;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.2.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "pluggableInvShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "pluggableInvSlotTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "pluggableInvSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "pluggableInvPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "pluggableInvType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "pluggableInvPEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "pluggableInvCLEI", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "pluggableInvVendorName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "pluggableInvVendorOUI", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "pluggableInvVendorPartNum", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "pluggableInvVendorRev", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "pluggableInvVendorSerialNum", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "pluggableInvMfgDate", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "pluggableInvConnectorType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "pluggableInvMinBitRate", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "pluggableInvMaxBitRate", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "pluggableInvNomBitRate", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "pluggableInvEncoding", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "pluggableInvWavelength", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "pluggableInvReach", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "pluggableInvTxFaultImpl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "pluggableInvLOSImpl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "pluggableInvDDiagImpl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "pluggableInvTxDisableImpl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "pluggableInvMedia", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "pluggableInvUSI", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "pluggableInvWavelengthMin", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "pluggableInvWavelengthMax", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "pluggableInvWavelengthSpacing", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
