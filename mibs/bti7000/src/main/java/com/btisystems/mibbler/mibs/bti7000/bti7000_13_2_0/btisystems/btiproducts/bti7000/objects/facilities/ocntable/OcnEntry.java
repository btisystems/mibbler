
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.ocntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.OcnTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.ocntable.IOcnEntry;
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

public class OcnEntry
    extends DeviceEntity
    implements Serializable, IOcnEntry, IIndexed, IVariableBindingSetter
{

    private int ocnTypeIdx;
    private int ocnShelfIdx;
    private int ocnSlotIdx;
    private int ocnPortIdx;
    private int ocnOpticalPwrReceivedMinTh;
    private int ocnOpticalPwrReceivedMaxTh;
    private int ocnOpticalPwrTransmittedMinTh;
    private int ocnOpticalPwrTransmittedMaxTh;
    private int ocnOpticalPwrReceived;
    private int ocnOpticalPwrTransmitted;
    private int ocnBER;
    private Integer ocnBERTh;
    private String ocnPEC;
    private Integer ocnAdminStatus;
    private int ocnOperStatus;
    private String ocnOperStatQlfr;
    private String ocnAutoEnableTimer;
    private String ocnActAutoEnableTimer;
    private int ocnWavelength;
    private String ocnVendorPN1;
    private String ocnVendorPN2;
    private String ocnVendorPN3;
    private Integer ocnPhyPMMon;
    private int ocnLaserStatus;
    private String ocnId1;
    private Integer ocnFiberType;
    private String ocnCustom1;
    private Integer ocnTOHTransparency;
    private Integer ocnLineMapping;
    private int ocnProtSwEvtType;
    private Integer ocnDCCTransparency;
    private Integer ocnTransparencyChannel;
    private String ocnRemoteId;
    private int ocnLaserControl;
    private int ocnRowStatus;
    private String _index;
    private OcnTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OcnEntry() {
    }

    public int getOcnTypeIdx() {
        return this.ocnTypeIdx;
    }

    public void setOcnTypeIdx(int ocnTypeIdx) {
        int oldValue = getOcnTypeIdx();
        this.ocnTypeIdx = ocnTypeIdx;
        notifyChange(1, oldValue, ocnTypeIdx);
    }

    public int getOcnShelfIdx() {
        return this.ocnShelfIdx;
    }

    public void setOcnShelfIdx(int ocnShelfIdx) {
        int oldValue = getOcnShelfIdx();
        this.ocnShelfIdx = ocnShelfIdx;
        notifyChange(2, oldValue, ocnShelfIdx);
    }

    public int getOcnSlotIdx() {
        return this.ocnSlotIdx;
    }

    public void setOcnSlotIdx(int ocnSlotIdx) {
        int oldValue = getOcnSlotIdx();
        this.ocnSlotIdx = ocnSlotIdx;
        notifyChange(3, oldValue, ocnSlotIdx);
    }

    public int getOcnPortIdx() {
        return this.ocnPortIdx;
    }

    public void setOcnPortIdx(int ocnPortIdx) {
        int oldValue = getOcnPortIdx();
        this.ocnPortIdx = ocnPortIdx;
        notifyChange(4, oldValue, ocnPortIdx);
    }

    public int getOcnOpticalPwrReceivedMinTh() {
        return this.ocnOpticalPwrReceivedMinTh;
    }

    public void setOcnOpticalPwrReceivedMinTh(int ocnOpticalPwrReceivedMinTh) {
        int oldValue = getOcnOpticalPwrReceivedMinTh();
        this.ocnOpticalPwrReceivedMinTh = ocnOpticalPwrReceivedMinTh;
        notifyChange(5, oldValue, ocnOpticalPwrReceivedMinTh);
    }

    public int getOcnOpticalPwrReceivedMaxTh() {
        return this.ocnOpticalPwrReceivedMaxTh;
    }

    public void setOcnOpticalPwrReceivedMaxTh(int ocnOpticalPwrReceivedMaxTh) {
        int oldValue = getOcnOpticalPwrReceivedMaxTh();
        this.ocnOpticalPwrReceivedMaxTh = ocnOpticalPwrReceivedMaxTh;
        notifyChange(6, oldValue, ocnOpticalPwrReceivedMaxTh);
    }

    public int getOcnOpticalPwrTransmittedMinTh() {
        return this.ocnOpticalPwrTransmittedMinTh;
    }

    public void setOcnOpticalPwrTransmittedMinTh(int ocnOpticalPwrTransmittedMinTh) {
        int oldValue = getOcnOpticalPwrTransmittedMinTh();
        this.ocnOpticalPwrTransmittedMinTh = ocnOpticalPwrTransmittedMinTh;
        notifyChange(7, oldValue, ocnOpticalPwrTransmittedMinTh);
    }

    public int getOcnOpticalPwrTransmittedMaxTh() {
        return this.ocnOpticalPwrTransmittedMaxTh;
    }

    public void setOcnOpticalPwrTransmittedMaxTh(int ocnOpticalPwrTransmittedMaxTh) {
        int oldValue = getOcnOpticalPwrTransmittedMaxTh();
        this.ocnOpticalPwrTransmittedMaxTh = ocnOpticalPwrTransmittedMaxTh;
        notifyChange(8, oldValue, ocnOpticalPwrTransmittedMaxTh);
    }

    public int getOcnOpticalPwrReceived() {
        return this.ocnOpticalPwrReceived;
    }

    public void setOcnOpticalPwrReceived(int ocnOpticalPwrReceived) {
        int oldValue = getOcnOpticalPwrReceived();
        this.ocnOpticalPwrReceived = ocnOpticalPwrReceived;
        notifyChange(9, oldValue, ocnOpticalPwrReceived);
    }

    public int getOcnOpticalPwrTransmitted() {
        return this.ocnOpticalPwrTransmitted;
    }

    public void setOcnOpticalPwrTransmitted(int ocnOpticalPwrTransmitted) {
        int oldValue = getOcnOpticalPwrTransmitted();
        this.ocnOpticalPwrTransmitted = ocnOpticalPwrTransmitted;
        notifyChange(10, oldValue, ocnOpticalPwrTransmitted);
    }

    public int getOcnBER() {
        return this.ocnBER;
    }

    public void setOcnBER(int ocnBER) {
        int oldValue = getOcnBER();
        this.ocnBER = ocnBER;
        notifyChange(11, oldValue, ocnBER);
    }

    public int getOcnBERTh() {
        if (this.ocnBERTh == null) {
            return  6;
        }
        return this.ocnBERTh;
    }

    public boolean isOcnBERThDefined() {
        return (this.ocnBERTh!= null);
    }

    public void setOcnBERTh(int ocnBERTh) {
        int oldValue = getOcnBERTh();
        this.ocnBERTh = ocnBERTh;
        notifyChange(12, oldValue, ocnBERTh);
    }

    public String getOcnPEC() {
        if (this.ocnPEC == null) {
            return "";
        }
        return this.ocnPEC;
    }

    public boolean isOcnPECDefined() {
        return (this.ocnPEC!= null);
    }

    public void setOcnPEC(String ocnPEC) {
        String oldValue = getOcnPEC();
        this.ocnPEC = ocnPEC;
        notifyChange(13, oldValue, ocnPEC);
    }

    public int getOcnAdminStatus() {
        if (this.ocnAdminStatus == null) {
            return  1;
        }
        return this.ocnAdminStatus;
    }

    public boolean isOcnAdminStatusDefined() {
        return (this.ocnAdminStatus!= null);
    }

    public void setOcnAdminStatus(int ocnAdminStatus) {
        int oldValue = getOcnAdminStatus();
        this.ocnAdminStatus = ocnAdminStatus;
        notifyChange(14, oldValue, ocnAdminStatus);
    }

    public int getOcnOperStatus() {
        return this.ocnOperStatus;
    }

    public void setOcnOperStatus(int ocnOperStatus) {
        int oldValue = getOcnOperStatus();
        this.ocnOperStatus = ocnOperStatus;
        notifyChange(15, oldValue, ocnOperStatus);
    }

    public String getOcnOperStatQlfr() {
        return this.ocnOperStatQlfr;
    }

    public void setOcnOperStatQlfr(String ocnOperStatQlfr) {
        String oldValue = getOcnOperStatQlfr();
        this.ocnOperStatQlfr = ocnOperStatQlfr;
        notifyChange(16, oldValue, ocnOperStatQlfr);
    }

    public String getOcnAutoEnableTimer() {
        if (this.ocnAutoEnableTimer == null) {
            return "008-00";
        }
        return this.ocnAutoEnableTimer;
    }

    public boolean isOcnAutoEnableTimerDefined() {
        return (this.ocnAutoEnableTimer!= null);
    }

    public void setOcnAutoEnableTimer(String ocnAutoEnableTimer) {
        String oldValue = getOcnAutoEnableTimer();
        this.ocnAutoEnableTimer = ocnAutoEnableTimer;
        notifyChange(17, oldValue, ocnAutoEnableTimer);
    }

    public String getOcnActAutoEnableTimer() {
        return this.ocnActAutoEnableTimer;
    }

    public void setOcnActAutoEnableTimer(String ocnActAutoEnableTimer) {
        String oldValue = getOcnActAutoEnableTimer();
        this.ocnActAutoEnableTimer = ocnActAutoEnableTimer;
        notifyChange(18, oldValue, ocnActAutoEnableTimer);
    }

    public int getOcnWavelength() {
        return this.ocnWavelength;
    }

    public void setOcnWavelength(int ocnWavelength) {
        int oldValue = getOcnWavelength();
        this.ocnWavelength = ocnWavelength;
        notifyChange(19, oldValue, ocnWavelength);
    }

    public String getOcnVendorPN1() {
        if (this.ocnVendorPN1 == null) {
            return "";
        }
        return this.ocnVendorPN1;
    }

    public boolean isOcnVendorPN1Defined() {
        return (this.ocnVendorPN1 != null);
    }

    public void setOcnVendorPN1(String ocnVendorPN1) {
        String oldValue = getOcnVendorPN1();
        this.ocnVendorPN1 = ocnVendorPN1;
        notifyChange(20, oldValue, ocnVendorPN1);
    }

    public String getOcnVendorPN2() {
        if (this.ocnVendorPN2 == null) {
            return "";
        }
        return this.ocnVendorPN2;
    }

    public boolean isOcnVendorPN2Defined() {
        return (this.ocnVendorPN2 != null);
    }

    public void setOcnVendorPN2(String ocnVendorPN2) {
        String oldValue = getOcnVendorPN2();
        this.ocnVendorPN2 = ocnVendorPN2;
        notifyChange(21, oldValue, ocnVendorPN2);
    }

    public String getOcnVendorPN3() {
        if (this.ocnVendorPN3 == null) {
            return "";
        }
        return this.ocnVendorPN3;
    }

    public boolean isOcnVendorPN3Defined() {
        return (this.ocnVendorPN3 != null);
    }

    public void setOcnVendorPN3(String ocnVendorPN3) {
        String oldValue = getOcnVendorPN3();
        this.ocnVendorPN3 = ocnVendorPN3;
        notifyChange(22, oldValue, ocnVendorPN3);
    }

    public int getOcnPhyPMMon() {
        if (this.ocnPhyPMMon == null) {
            return  2;
        }
        return this.ocnPhyPMMon;
    }

    public boolean isOcnPhyPMMonDefined() {
        return (this.ocnPhyPMMon!= null);
    }

    public void setOcnPhyPMMon(int ocnPhyPMMon) {
        int oldValue = getOcnPhyPMMon();
        this.ocnPhyPMMon = ocnPhyPMMon;
        notifyChange(23, oldValue, ocnPhyPMMon);
    }

    public int getOcnLaserStatus() {
        return this.ocnLaserStatus;
    }

    public void setOcnLaserStatus(int ocnLaserStatus) {
        int oldValue = getOcnLaserStatus();
        this.ocnLaserStatus = ocnLaserStatus;
        notifyChange(24, oldValue, ocnLaserStatus);
    }

    public String getOcnId1() {
        if (this.ocnId1 == null) {
            return "";
        }
        return this.ocnId1;
    }

    public boolean isOcnId1Defined() {
        return (this.ocnId1 != null);
    }

    public void setOcnId1(String ocnId1) {
        String oldValue = getOcnId1();
        this.ocnId1 = ocnId1;
        notifyChange(25, oldValue, ocnId1);
    }

    public int getOcnFiberType() {
        if (this.ocnFiberType == null) {
            return  1;
        }
        return this.ocnFiberType;
    }

    public boolean isOcnFiberTypeDefined() {
        return (this.ocnFiberType!= null);
    }

    public void setOcnFiberType(int ocnFiberType) {
        int oldValue = getOcnFiberType();
        this.ocnFiberType = ocnFiberType;
        notifyChange(26, oldValue, ocnFiberType);
    }

    public String getOcnCustom1() {
        if (this.ocnCustom1 == null) {
            return "";
        }
        return this.ocnCustom1;
    }

    public boolean isOcnCustom1Defined() {
        return (this.ocnCustom1 != null);
    }

    public void setOcnCustom1(String ocnCustom1) {
        String oldValue = getOcnCustom1();
        this.ocnCustom1 = ocnCustom1;
        notifyChange(27, oldValue, ocnCustom1);
    }

    public int getOcnTOHTransparency() {
        if (this.ocnTOHTransparency == null) {
            return  2;
        }
        return this.ocnTOHTransparency;
    }

    public boolean isOcnTOHTransparencyDefined() {
        return (this.ocnTOHTransparency!= null);
    }

    public void setOcnTOHTransparency(int ocnTOHTransparency) {
        int oldValue = getOcnTOHTransparency();
        this.ocnTOHTransparency = ocnTOHTransparency;
        notifyChange(28, oldValue, ocnTOHTransparency);
    }

    public int getOcnLineMapping() {
        if (this.ocnLineMapping == null) {
            return  3;
        }
        return this.ocnLineMapping;
    }

    public boolean isOcnLineMappingDefined() {
        return (this.ocnLineMapping!= null);
    }

    public void setOcnLineMapping(int ocnLineMapping) {
        int oldValue = getOcnLineMapping();
        this.ocnLineMapping = ocnLineMapping;
        notifyChange(29, oldValue, ocnLineMapping);
    }

    public int getOcnProtSwEvtType() {
        return this.ocnProtSwEvtType;
    }

    public void setOcnProtSwEvtType(int ocnProtSwEvtType) {
        int oldValue = getOcnProtSwEvtType();
        this.ocnProtSwEvtType = ocnProtSwEvtType;
        notifyChange(30, oldValue, ocnProtSwEvtType);
    }

    public int getOcnDCCTransparency() {
        if (this.ocnDCCTransparency == null) {
            return  2;
        }
        return this.ocnDCCTransparency;
    }

    public boolean isOcnDCCTransparencyDefined() {
        return (this.ocnDCCTransparency!= null);
    }

    public void setOcnDCCTransparency(int ocnDCCTransparency) {
        int oldValue = getOcnDCCTransparency();
        this.ocnDCCTransparency = ocnDCCTransparency;
        notifyChange(31, oldValue, ocnDCCTransparency);
    }

    public int getOcnTransparencyChannel() {
        if (this.ocnTransparencyChannel == null) {
            return  1;
        }
        return this.ocnTransparencyChannel;
    }

    public boolean isOcnTransparencyChannelDefined() {
        return (this.ocnTransparencyChannel!= null);
    }

    public void setOcnTransparencyChannel(int ocnTransparencyChannel) {
        int oldValue = getOcnTransparencyChannel();
        this.ocnTransparencyChannel = ocnTransparencyChannel;
        notifyChange(32, oldValue, ocnTransparencyChannel);
    }

    public String getOcnRemoteId() {
        if (this.ocnRemoteId == null) {
            return "";
        }
        return this.ocnRemoteId;
    }

    public boolean isOcnRemoteIdDefined() {
        return (this.ocnRemoteId!= null);
    }

    public void setOcnRemoteId(String ocnRemoteId) {
        String oldValue = getOcnRemoteId();
        this.ocnRemoteId = ocnRemoteId;
        notifyChange(33, oldValue, ocnRemoteId);
    }

    public int getOcnLaserControl() {
        return this.ocnLaserControl;
    }

    public void setOcnLaserControl(int ocnLaserControl) {
        int oldValue = getOcnLaserControl();
        this.ocnLaserControl = ocnLaserControl;
        notifyChange(34, oldValue, ocnLaserControl);
    }

    public int getOcnRowStatus() {
        return this.ocnRowStatus;
    }

    public void setOcnRowStatus(int ocnRowStatus) {
        int oldValue = getOcnRowStatus();
        this.ocnRowStatus = ocnRowStatus;
        notifyChange(100, oldValue, ocnRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setOcnTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setOcnShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setOcnSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setOcnPortIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setOcnOpticalPwrReceivedMinTh(binding.getVariable().toInt());
                break;
            case  6 :
                setOcnOpticalPwrReceivedMaxTh(binding.getVariable().toInt());
                break;
            case  7 :
                setOcnOpticalPwrTransmittedMinTh(binding.getVariable().toInt());
                break;
            case  8 :
                setOcnOpticalPwrTransmittedMaxTh(binding.getVariable().toInt());
                break;
            case  9 :
                setOcnOpticalPwrReceived(binding.getVariable().toInt());
                break;
            case  10 :
                setOcnOpticalPwrTransmitted(binding.getVariable().toInt());
                break;
            case  11 :
                setOcnBER(binding.getVariable().toInt());
                break;
            case  12 :
                setOcnBERTh(binding.getVariable().toInt());
                break;
            case  13 :
                setOcnPEC(binding.getVariable().toString());
                break;
            case  14 :
                setOcnAdminStatus(binding.getVariable().toInt());
                break;
            case  15 :
                setOcnOperStatus(binding.getVariable().toInt());
                break;
            case  16 :
                setOcnOperStatQlfr(binding.getVariable().toString());
                break;
            case  17 :
                setOcnAutoEnableTimer(binding.getVariable().toString());
                break;
            case  18 :
                setOcnActAutoEnableTimer(binding.getVariable().toString());
                break;
            case  19 :
                setOcnWavelength(binding.getVariable().toInt());
                break;
            case  20 :
                setOcnVendorPN1(binding.getVariable().toString());
                break;
            case  21 :
                setOcnVendorPN2(binding.getVariable().toString());
                break;
            case  22 :
                setOcnVendorPN3(binding.getVariable().toString());
                break;
            case  23 :
                setOcnPhyPMMon(binding.getVariable().toInt());
                break;
            case  24 :
                setOcnLaserStatus(binding.getVariable().toInt());
                break;
            case  25 :
                setOcnId1(binding.getVariable().toString());
                break;
            case  26 :
                setOcnFiberType(binding.getVariable().toInt());
                break;
            case  27 :
                setOcnCustom1(binding.getVariable().toString());
                break;
            case  28 :
                setOcnTOHTransparency(binding.getVariable().toInt());
                break;
            case  29 :
                setOcnLineMapping(binding.getVariable().toInt());
                break;
            case  30 :
                setOcnProtSwEvtType(binding.getVariable().toInt());
                break;
            case  31 :
                setOcnDCCTransparency(binding.getVariable().toInt());
                break;
            case  32 :
                setOcnTransparencyChannel(binding.getVariable().toInt());
                break;
            case  33 :
                setOcnRemoteId(binding.getVariable().toString());
                break;
            case  34 :
                setOcnLaserControl(binding.getVariable().toInt());
                break;
            case  100 :
                setOcnRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setOcnTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOcnPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OcnTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ocnTypeIdx", ocnTypeIdx).append("ocnShelfIdx", ocnShelfIdx).append("ocnSlotIdx", ocnSlotIdx).append("ocnPortIdx", ocnPortIdx).append("ocnOpticalPwrReceivedMinTh", ocnOpticalPwrReceivedMinTh).append("ocnOpticalPwrReceivedMaxTh", ocnOpticalPwrReceivedMaxTh).append("ocnOpticalPwrTransmittedMinTh", ocnOpticalPwrTransmittedMinTh).append("ocnOpticalPwrTransmittedMaxTh", ocnOpticalPwrTransmittedMaxTh).append("ocnOpticalPwrReceived", ocnOpticalPwrReceived).append("ocnOpticalPwrTransmitted", ocnOpticalPwrTransmitted).append("ocnBER", ocnBER).append("ocnBERTh", ocnBERTh).append("ocnPEC", ocnPEC).append("ocnAdminStatus", ocnAdminStatus).append("ocnOperStatus", ocnOperStatus).append("ocnOperStatQlfr", ocnOperStatQlfr).append("ocnAutoEnableTimer", ocnAutoEnableTimer).append("ocnActAutoEnableTimer", ocnActAutoEnableTimer).append("ocnWavelength", ocnWavelength).append("ocnVendorPN1", ocnVendorPN1).append("ocnVendorPN2", ocnVendorPN2).append("ocnVendorPN3", ocnVendorPN3).append("ocnPhyPMMon", ocnPhyPMMon).append("ocnLaserStatus", ocnLaserStatus).append("ocnId1", ocnId1).append("ocnFiberType", ocnFiberType).append("ocnCustom1", ocnCustom1).append("ocnTOHTransparency", ocnTOHTransparency).append("ocnLineMapping", ocnLineMapping).append("ocnProtSwEvtType", ocnProtSwEvtType).append("ocnDCCTransparency", ocnDCCTransparency).append("ocnTransparencyChannel", ocnTransparencyChannel).append("ocnRemoteId", ocnRemoteId).append("ocnLaserControl", ocnLaserControl).append("ocnRowStatus", ocnRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ocnTypeIdx).append(ocnShelfIdx).append(ocnSlotIdx).append(ocnPortIdx).append(ocnOpticalPwrReceivedMinTh).append(ocnOpticalPwrReceivedMaxTh).append(ocnOpticalPwrTransmittedMinTh).append(ocnOpticalPwrTransmittedMaxTh).append(ocnOpticalPwrReceived).append(ocnOpticalPwrTransmitted).append(ocnBER).append(ocnBERTh).append(ocnPEC).append(ocnAdminStatus).append(ocnOperStatus).append(ocnOperStatQlfr).append(ocnAutoEnableTimer).append(ocnActAutoEnableTimer).append(ocnWavelength).append(ocnVendorPN1).append(ocnVendorPN2).append(ocnVendorPN3).append(ocnPhyPMMon).append(ocnLaserStatus).append(ocnId1).append(ocnFiberType).append(ocnCustom1).append(ocnTOHTransparency).append(ocnLineMapping).append(ocnProtSwEvtType).append(ocnDCCTransparency).append(ocnTransparencyChannel).append(ocnRemoteId).append(ocnLaserControl).append(ocnRowStatus).append(_index).toHashCode();
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
        OcnEntry rhs = ((OcnEntry) obj);
        return new EqualsBuilder().append(ocnTypeIdx, rhs.ocnTypeIdx).append(ocnShelfIdx, rhs.ocnShelfIdx).append(ocnSlotIdx, rhs.ocnSlotIdx).append(ocnPortIdx, rhs.ocnPortIdx).append(ocnOpticalPwrReceivedMinTh, rhs.ocnOpticalPwrReceivedMinTh).append(ocnOpticalPwrReceivedMaxTh, rhs.ocnOpticalPwrReceivedMaxTh).append(ocnOpticalPwrTransmittedMinTh, rhs.ocnOpticalPwrTransmittedMinTh).append(ocnOpticalPwrTransmittedMaxTh, rhs.ocnOpticalPwrTransmittedMaxTh).append(ocnOpticalPwrReceived, rhs.ocnOpticalPwrReceived).append(ocnOpticalPwrTransmitted, rhs.ocnOpticalPwrTransmitted).append(ocnBER, rhs.ocnBER).append(ocnBERTh, rhs.ocnBERTh).append(ocnPEC, rhs.ocnPEC).append(ocnAdminStatus, rhs.ocnAdminStatus).append(ocnOperStatus, rhs.ocnOperStatus).append(ocnOperStatQlfr, rhs.ocnOperStatQlfr).append(ocnAutoEnableTimer, rhs.ocnAutoEnableTimer).append(ocnActAutoEnableTimer, rhs.ocnActAutoEnableTimer).append(ocnWavelength, rhs.ocnWavelength).append(ocnVendorPN1, rhs.ocnVendorPN1).append(ocnVendorPN2, rhs.ocnVendorPN2).append(ocnVendorPN3, rhs.ocnVendorPN3).append(ocnPhyPMMon, rhs.ocnPhyPMMon).append(ocnLaserStatus, rhs.ocnLaserStatus).append(ocnId1, rhs.ocnId1).append(ocnFiberType, rhs.ocnFiberType).append(ocnCustom1, rhs.ocnCustom1).append(ocnTOHTransparency, rhs.ocnTOHTransparency).append(ocnLineMapping, rhs.ocnLineMapping).append(ocnProtSwEvtType, rhs.ocnProtSwEvtType).append(ocnDCCTransparency, rhs.ocnDCCTransparency).append(ocnTransparencyChannel, rhs.ocnTransparencyChannel).append(ocnRemoteId, rhs.ocnRemoteId).append(ocnLaserControl, rhs.ocnLaserControl).append(ocnRowStatus, rhs.ocnRowStatus).append(_index, rhs._index).isEquals();
    }

    public OcnEntry clone() {
        OcnEntry _copy = new OcnEntry();
        _copy.ocnTypeIdx = ocnTypeIdx;
        _copy.ocnShelfIdx = ocnShelfIdx;
        _copy.ocnSlotIdx = ocnSlotIdx;
        _copy.ocnPortIdx = ocnPortIdx;
        _copy.ocnOpticalPwrReceivedMinTh = ocnOpticalPwrReceivedMinTh;
        _copy.ocnOpticalPwrReceivedMaxTh = ocnOpticalPwrReceivedMaxTh;
        _copy.ocnOpticalPwrTransmittedMinTh = ocnOpticalPwrTransmittedMinTh;
        _copy.ocnOpticalPwrTransmittedMaxTh = ocnOpticalPwrTransmittedMaxTh;
        _copy.ocnOpticalPwrReceived = ocnOpticalPwrReceived;
        _copy.ocnOpticalPwrTransmitted = ocnOpticalPwrTransmitted;
        _copy.ocnBER = ocnBER;
        _copy.ocnBERTh = ocnBERTh;
        _copy.ocnPEC = ocnPEC;
        _copy.ocnAdminStatus = ocnAdminStatus;
        _copy.ocnOperStatus = ocnOperStatus;
        _copy.ocnOperStatQlfr = ocnOperStatQlfr;
        _copy.ocnAutoEnableTimer = ocnAutoEnableTimer;
        _copy.ocnActAutoEnableTimer = ocnActAutoEnableTimer;
        _copy.ocnWavelength = ocnWavelength;
        _copy.ocnVendorPN1 = ocnVendorPN1;
        _copy.ocnVendorPN2 = ocnVendorPN2;
        _copy.ocnVendorPN3 = ocnVendorPN3;
        _copy.ocnPhyPMMon = ocnPhyPMMon;
        _copy.ocnLaserStatus = ocnLaserStatus;
        _copy.ocnId1 = ocnId1;
        _copy.ocnFiberType = ocnFiberType;
        _copy.ocnCustom1 = ocnCustom1;
        _copy.ocnTOHTransparency = ocnTOHTransparency;
        _copy.ocnLineMapping = ocnLineMapping;
        _copy.ocnProtSwEvtType = ocnProtSwEvtType;
        _copy.ocnDCCTransparency = ocnDCCTransparency;
        _copy.ocnTransparencyChannel = ocnTransparencyChannel;
        _copy.ocnRemoteId = ocnRemoteId;
        _copy.ocnLaserControl = ocnLaserControl;
        _copy.ocnRowStatus = ocnRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ocnTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ocnShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ocnSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ocnPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ocnOpticalPwrReceivedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ocnOpticalPwrReceivedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ocnOpticalPwrTransmittedMinTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ocnOpticalPwrTransmittedMaxTh", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ocnOpticalPwrReceived", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ocnOpticalPwrTransmitted", DeviceEntityDescription.FieldType.FIXED_X10, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ocnBER", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ocnBERTh", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ocnPEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ocnAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ocnOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "ocnOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "ocnAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "ocnActAutoEnableTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "ocnWavelength", DeviceEntityDescription.FieldType.FIXED_X100, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "ocnVendorPN1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "ocnVendorPN2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "ocnVendorPN3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "ocnPhyPMMon", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "ocnLaserStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "ocnId1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "ocnFiberType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "ocnCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "ocnTOHTransparency", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "ocnLineMapping", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(30, "ocnProtSwEvtType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(31, "ocnDCCTransparency", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(32, "ocnTransparencyChannel", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(33, "ocnRemoteId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(34, "ocnLaserControl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "ocnRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
