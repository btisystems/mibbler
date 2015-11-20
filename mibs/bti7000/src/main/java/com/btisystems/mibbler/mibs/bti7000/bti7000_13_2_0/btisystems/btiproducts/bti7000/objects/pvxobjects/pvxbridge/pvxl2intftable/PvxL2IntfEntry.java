
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.pvxobjects.pvxbridge.pvxl2intftable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.pvxobjects.pvxbridge.PvxL2IntfTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.pvxobjects.pvxbridge.pvxl2intftable.IPvxL2IntfEntry;
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

public class PvxL2IntfEntry
    extends DeviceEntity
    implements Serializable, IPvxL2IntfEntry, IIndexed, IVariableBindingSetter
{

    private int pvxL2IntfSwitchIdx;
    private int pvxL2IntfShelfIdx;
    private int pvxL2IntfSlotIdx;
    private int pvxL2IntfPortTypeIdx;
    private int pvxL2IntfPortIdx;
    private Integer pvxL2IntfAdminStatus;
    private int pvxL2IntfOperStatus;
    private Integer pvxL2IntfType;
    private Integer pvxL2IntfSTpid;
    private int pvxL2IntfPvid;
    private int pvxL2IntfDefaultPriority;
    private int pvxL2IntfAllowedFrames;
    private int pvxL2IntfIngressFiltering;
    private int pvxL2IntfCtrlFrmProfileId;
    private String pvxL2IntfMACAddr;
    private int pvxL2IntfRateLimit;
    private int pvxL2IntfCoSProfileId;
    private int pvxL2IntfIsUNI;
    private String pvxL2IntfSchedProfName;
    private String pvxL2IntfPriTCMapProfName;
    private String pvxL2IntfPCPCodingProfName;
    private String pvxL2IntfDscpPHBProfName;
    private String pvxL2IntfCtrlFrmProfileName;
    private int pvxL2IntfUseDei;
    private String pvxL2IntfIngressBandwidthProfile;
    private String pvxL2IntfEgressBandwidthProfile;
    private int pvxL2IntfTrustIncomingPCP;
    private int pvxL2IntfTrustIncomingDscp;
    private Integer pvxL2IntfBcastLimit;
    private Integer pvxL2IntfMcastLimit;
    private Integer pvxL2IntfDlfLimit;
    private int pvxL2IntfRowStatus;
    private String _index;
    private PvxL2IntfTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public PvxL2IntfEntry() {
    }

    public int getPvxL2IntfSwitchIdx() {
        return this.pvxL2IntfSwitchIdx;
    }

    public void setPvxL2IntfSwitchIdx(int pvxL2IntfSwitchIdx) {
        int oldValue = getPvxL2IntfSwitchIdx();
        this.pvxL2IntfSwitchIdx = pvxL2IntfSwitchIdx;
        notifyChange(1, oldValue, pvxL2IntfSwitchIdx);
    }

    public int getPvxL2IntfShelfIdx() {
        return this.pvxL2IntfShelfIdx;
    }

    public void setPvxL2IntfShelfIdx(int pvxL2IntfShelfIdx) {
        int oldValue = getPvxL2IntfShelfIdx();
        this.pvxL2IntfShelfIdx = pvxL2IntfShelfIdx;
        notifyChange(2, oldValue, pvxL2IntfShelfIdx);
    }

    public int getPvxL2IntfSlotIdx() {
        return this.pvxL2IntfSlotIdx;
    }

    public void setPvxL2IntfSlotIdx(int pvxL2IntfSlotIdx) {
        int oldValue = getPvxL2IntfSlotIdx();
        this.pvxL2IntfSlotIdx = pvxL2IntfSlotIdx;
        notifyChange(3, oldValue, pvxL2IntfSlotIdx);
    }

    public int getPvxL2IntfPortTypeIdx() {
        return this.pvxL2IntfPortTypeIdx;
    }

    public void setPvxL2IntfPortTypeIdx(int pvxL2IntfPortTypeIdx) {
        int oldValue = getPvxL2IntfPortTypeIdx();
        this.pvxL2IntfPortTypeIdx = pvxL2IntfPortTypeIdx;
        notifyChange(4, oldValue, pvxL2IntfPortTypeIdx);
    }

    public int getPvxL2IntfPortIdx() {
        return this.pvxL2IntfPortIdx;
    }

    public void setPvxL2IntfPortIdx(int pvxL2IntfPortIdx) {
        int oldValue = getPvxL2IntfPortIdx();
        this.pvxL2IntfPortIdx = pvxL2IntfPortIdx;
        notifyChange(5, oldValue, pvxL2IntfPortIdx);
    }

    public int getPvxL2IntfAdminStatus() {
        if (this.pvxL2IntfAdminStatus == null) {
            return  1;
        }
        return this.pvxL2IntfAdminStatus;
    }

    public boolean isPvxL2IntfAdminStatusDefined() {
        return (this.pvxL2IntfAdminStatus!= null);
    }

    public void setPvxL2IntfAdminStatus(int pvxL2IntfAdminStatus) {
        int oldValue = getPvxL2IntfAdminStatus();
        this.pvxL2IntfAdminStatus = pvxL2IntfAdminStatus;
        notifyChange(6, oldValue, pvxL2IntfAdminStatus);
    }

    public int getPvxL2IntfOperStatus() {
        return this.pvxL2IntfOperStatus;
    }

    public void setPvxL2IntfOperStatus(int pvxL2IntfOperStatus) {
        int oldValue = getPvxL2IntfOperStatus();
        this.pvxL2IntfOperStatus = pvxL2IntfOperStatus;
        notifyChange(7, oldValue, pvxL2IntfOperStatus);
    }

    public int getPvxL2IntfType() {
        if (this.pvxL2IntfType == null) {
            return  1;
        }
        return this.pvxL2IntfType;
    }

    public boolean isPvxL2IntfTypeDefined() {
        return (this.pvxL2IntfType!= null);
    }

    public void setPvxL2IntfType(int pvxL2IntfType) {
        int oldValue = getPvxL2IntfType();
        this.pvxL2IntfType = pvxL2IntfType;
        notifyChange(8, oldValue, pvxL2IntfType);
    }

    public int getPvxL2IntfSTpid() {
        if (this.pvxL2IntfSTpid == null) {
            return  1;
        }
        return this.pvxL2IntfSTpid;
    }

    public boolean isPvxL2IntfSTpidDefined() {
        return (this.pvxL2IntfSTpid!= null);
    }

    public void setPvxL2IntfSTpid(int pvxL2IntfSTpid) {
        int oldValue = getPvxL2IntfSTpid();
        this.pvxL2IntfSTpid = pvxL2IntfSTpid;
        notifyChange(9, oldValue, pvxL2IntfSTpid);
    }

    public int getPvxL2IntfPvid() {
        return this.pvxL2IntfPvid;
    }

    public void setPvxL2IntfPvid(int pvxL2IntfPvid) {
        int oldValue = getPvxL2IntfPvid();
        this.pvxL2IntfPvid = pvxL2IntfPvid;
        notifyChange(10, oldValue, pvxL2IntfPvid);
    }

    public int getPvxL2IntfDefaultPriority() {
        return this.pvxL2IntfDefaultPriority;
    }

    public void setPvxL2IntfDefaultPriority(int pvxL2IntfDefaultPriority) {
        int oldValue = getPvxL2IntfDefaultPriority();
        this.pvxL2IntfDefaultPriority = pvxL2IntfDefaultPriority;
        notifyChange(11, oldValue, pvxL2IntfDefaultPriority);
    }

    public int getPvxL2IntfAllowedFrames() {
        return this.pvxL2IntfAllowedFrames;
    }

    public void setPvxL2IntfAllowedFrames(int pvxL2IntfAllowedFrames) {
        int oldValue = getPvxL2IntfAllowedFrames();
        this.pvxL2IntfAllowedFrames = pvxL2IntfAllowedFrames;
        notifyChange(12, oldValue, pvxL2IntfAllowedFrames);
    }

    public int getPvxL2IntfIngressFiltering() {
        return this.pvxL2IntfIngressFiltering;
    }

    public void setPvxL2IntfIngressFiltering(int pvxL2IntfIngressFiltering) {
        int oldValue = getPvxL2IntfIngressFiltering();
        this.pvxL2IntfIngressFiltering = pvxL2IntfIngressFiltering;
        notifyChange(13, oldValue, pvxL2IntfIngressFiltering);
    }

    public int getPvxL2IntfCtrlFrmProfileId() {
        return this.pvxL2IntfCtrlFrmProfileId;
    }

    public void setPvxL2IntfCtrlFrmProfileId(int pvxL2IntfCtrlFrmProfileId) {
        int oldValue = getPvxL2IntfCtrlFrmProfileId();
        this.pvxL2IntfCtrlFrmProfileId = pvxL2IntfCtrlFrmProfileId;
        notifyChange(14, oldValue, pvxL2IntfCtrlFrmProfileId);
    }

    public String getPvxL2IntfMACAddr() {
        return this.pvxL2IntfMACAddr;
    }

    public void setPvxL2IntfMACAddr(String pvxL2IntfMACAddr) {
        String oldValue = getPvxL2IntfMACAddr();
        this.pvxL2IntfMACAddr = pvxL2IntfMACAddr;
        notifyChange(15, oldValue, pvxL2IntfMACAddr);
    }

    public int getPvxL2IntfRateLimit() {
        return this.pvxL2IntfRateLimit;
    }

    public void setPvxL2IntfRateLimit(int pvxL2IntfRateLimit) {
        int oldValue = getPvxL2IntfRateLimit();
        this.pvxL2IntfRateLimit = pvxL2IntfRateLimit;
        notifyChange(16, oldValue, pvxL2IntfRateLimit);
    }

    public int getPvxL2IntfCoSProfileId() {
        return this.pvxL2IntfCoSProfileId;
    }

    public void setPvxL2IntfCoSProfileId(int pvxL2IntfCoSProfileId) {
        int oldValue = getPvxL2IntfCoSProfileId();
        this.pvxL2IntfCoSProfileId = pvxL2IntfCoSProfileId;
        notifyChange(17, oldValue, pvxL2IntfCoSProfileId);
    }

    public int getPvxL2IntfIsUNI() {
        return this.pvxL2IntfIsUNI;
    }

    public void setPvxL2IntfIsUNI(int pvxL2IntfIsUNI) {
        int oldValue = getPvxL2IntfIsUNI();
        this.pvxL2IntfIsUNI = pvxL2IntfIsUNI;
        notifyChange(18, oldValue, pvxL2IntfIsUNI);
    }

    public String getPvxL2IntfSchedProfName() {
        return this.pvxL2IntfSchedProfName;
    }

    public void setPvxL2IntfSchedProfName(String pvxL2IntfSchedProfName) {
        String oldValue = getPvxL2IntfSchedProfName();
        this.pvxL2IntfSchedProfName = pvxL2IntfSchedProfName;
        notifyChange(19, oldValue, pvxL2IntfSchedProfName);
    }

    public String getPvxL2IntfPriTCMapProfName() {
        return this.pvxL2IntfPriTCMapProfName;
    }

    public void setPvxL2IntfPriTCMapProfName(String pvxL2IntfPriTCMapProfName) {
        String oldValue = getPvxL2IntfPriTCMapProfName();
        this.pvxL2IntfPriTCMapProfName = pvxL2IntfPriTCMapProfName;
        notifyChange(20, oldValue, pvxL2IntfPriTCMapProfName);
    }

    public String getPvxL2IntfPCPCodingProfName() {
        return this.pvxL2IntfPCPCodingProfName;
    }

    public void setPvxL2IntfPCPCodingProfName(String pvxL2IntfPCPCodingProfName) {
        String oldValue = getPvxL2IntfPCPCodingProfName();
        this.pvxL2IntfPCPCodingProfName = pvxL2IntfPCPCodingProfName;
        notifyChange(21, oldValue, pvxL2IntfPCPCodingProfName);
    }

    public String getPvxL2IntfDscpPHBProfName() {
        return this.pvxL2IntfDscpPHBProfName;
    }

    public void setPvxL2IntfDscpPHBProfName(String pvxL2IntfDscpPHBProfName) {
        String oldValue = getPvxL2IntfDscpPHBProfName();
        this.pvxL2IntfDscpPHBProfName = pvxL2IntfDscpPHBProfName;
        notifyChange(22, oldValue, pvxL2IntfDscpPHBProfName);
    }

    public String getPvxL2IntfCtrlFrmProfileName() {
        return this.pvxL2IntfCtrlFrmProfileName;
    }

    public void setPvxL2IntfCtrlFrmProfileName(String pvxL2IntfCtrlFrmProfileName) {
        String oldValue = getPvxL2IntfCtrlFrmProfileName();
        this.pvxL2IntfCtrlFrmProfileName = pvxL2IntfCtrlFrmProfileName;
        notifyChange(23, oldValue, pvxL2IntfCtrlFrmProfileName);
    }

    public int getPvxL2IntfUseDei() {
        return this.pvxL2IntfUseDei;
    }

    public void setPvxL2IntfUseDei(int pvxL2IntfUseDei) {
        int oldValue = getPvxL2IntfUseDei();
        this.pvxL2IntfUseDei = pvxL2IntfUseDei;
        notifyChange(24, oldValue, pvxL2IntfUseDei);
    }

    public String getPvxL2IntfIngressBandwidthProfile() {
        return this.pvxL2IntfIngressBandwidthProfile;
    }

    public void setPvxL2IntfIngressBandwidthProfile(String pvxL2IntfIngressBandwidthProfile) {
        String oldValue = getPvxL2IntfIngressBandwidthProfile();
        this.pvxL2IntfIngressBandwidthProfile = pvxL2IntfIngressBandwidthProfile;
        notifyChange(25, oldValue, pvxL2IntfIngressBandwidthProfile);
    }

    public String getPvxL2IntfEgressBandwidthProfile() {
        return this.pvxL2IntfEgressBandwidthProfile;
    }

    public void setPvxL2IntfEgressBandwidthProfile(String pvxL2IntfEgressBandwidthProfile) {
        String oldValue = getPvxL2IntfEgressBandwidthProfile();
        this.pvxL2IntfEgressBandwidthProfile = pvxL2IntfEgressBandwidthProfile;
        notifyChange(26, oldValue, pvxL2IntfEgressBandwidthProfile);
    }

    public int getPvxL2IntfTrustIncomingPCP() {
        return this.pvxL2IntfTrustIncomingPCP;
    }

    public void setPvxL2IntfTrustIncomingPCP(int pvxL2IntfTrustIncomingPCP) {
        int oldValue = getPvxL2IntfTrustIncomingPCP();
        this.pvxL2IntfTrustIncomingPCP = pvxL2IntfTrustIncomingPCP;
        notifyChange(27, oldValue, pvxL2IntfTrustIncomingPCP);
    }

    public int getPvxL2IntfTrustIncomingDscp() {
        return this.pvxL2IntfTrustIncomingDscp;
    }

    public void setPvxL2IntfTrustIncomingDscp(int pvxL2IntfTrustIncomingDscp) {
        int oldValue = getPvxL2IntfTrustIncomingDscp();
        this.pvxL2IntfTrustIncomingDscp = pvxL2IntfTrustIncomingDscp;
        notifyChange(28, oldValue, pvxL2IntfTrustIncomingDscp);
    }

    public int getPvxL2IntfBcastLimit() {
        if (this.pvxL2IntfBcastLimit == null) {
            return  100;
        }
        return this.pvxL2IntfBcastLimit;
    }

    public boolean isPvxL2IntfBcastLimitDefined() {
        return (this.pvxL2IntfBcastLimit!= null);
    }

    public void setPvxL2IntfBcastLimit(int pvxL2IntfBcastLimit) {
        int oldValue = getPvxL2IntfBcastLimit();
        this.pvxL2IntfBcastLimit = pvxL2IntfBcastLimit;
        notifyChange(29, oldValue, pvxL2IntfBcastLimit);
    }

    public int getPvxL2IntfMcastLimit() {
        if (this.pvxL2IntfMcastLimit == null) {
            return  100;
        }
        return this.pvxL2IntfMcastLimit;
    }

    public boolean isPvxL2IntfMcastLimitDefined() {
        return (this.pvxL2IntfMcastLimit!= null);
    }

    public void setPvxL2IntfMcastLimit(int pvxL2IntfMcastLimit) {
        int oldValue = getPvxL2IntfMcastLimit();
        this.pvxL2IntfMcastLimit = pvxL2IntfMcastLimit;
        notifyChange(30, oldValue, pvxL2IntfMcastLimit);
    }

    public int getPvxL2IntfDlfLimit() {
        if (this.pvxL2IntfDlfLimit == null) {
            return  100;
        }
        return this.pvxL2IntfDlfLimit;
    }

    public boolean isPvxL2IntfDlfLimitDefined() {
        return (this.pvxL2IntfDlfLimit!= null);
    }

    public void setPvxL2IntfDlfLimit(int pvxL2IntfDlfLimit) {
        int oldValue = getPvxL2IntfDlfLimit();
        this.pvxL2IntfDlfLimit = pvxL2IntfDlfLimit;
        notifyChange(31, oldValue, pvxL2IntfDlfLimit);
    }

    public int getPvxL2IntfRowStatus() {
        return this.pvxL2IntfRowStatus;
    }

    public void setPvxL2IntfRowStatus(int pvxL2IntfRowStatus) {
        int oldValue = getPvxL2IntfRowStatus();
        this.pvxL2IntfRowStatus = pvxL2IntfRowStatus;
        notifyChange(100, oldValue, pvxL2IntfRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setPvxL2IntfSwitchIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setPvxL2IntfShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setPvxL2IntfSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setPvxL2IntfPortTypeIdx(binding.getVariable().toInt());
                break;
            case  5 :
                setPvxL2IntfPortIdx(binding.getVariable().toInt());
                break;
            case  6 :
                setPvxL2IntfAdminStatus(binding.getVariable().toInt());
                break;
            case  7 :
                setPvxL2IntfOperStatus(binding.getVariable().toInt());
                break;
            case  8 :
                setPvxL2IntfType(binding.getVariable().toInt());
                break;
            case  9 :
                setPvxL2IntfSTpid(binding.getVariable().toInt());
                break;
            case  10 :
                setPvxL2IntfPvid(binding.getVariable().toInt());
                break;
            case  11 :
                setPvxL2IntfDefaultPriority(binding.getVariable().toInt());
                break;
            case  12 :
                setPvxL2IntfAllowedFrames(binding.getVariable().toInt());
                break;
            case  13 :
                setPvxL2IntfIngressFiltering(binding.getVariable().toInt());
                break;
            case  14 :
                setPvxL2IntfCtrlFrmProfileId(binding.getVariable().toInt());
                break;
            case  15 :
                setPvxL2IntfMACAddr(binding.getVariable().toString());
                break;
            case  16 :
                setPvxL2IntfRateLimit(binding.getVariable().toInt());
                break;
            case  17 :
                setPvxL2IntfCoSProfileId(binding.getVariable().toInt());
                break;
            case  18 :
                setPvxL2IntfIsUNI(binding.getVariable().toInt());
                break;
            case  19 :
                setPvxL2IntfSchedProfName(binding.getVariable().toString());
                break;
            case  20 :
                setPvxL2IntfPriTCMapProfName(binding.getVariable().toString());
                break;
            case  21 :
                setPvxL2IntfPCPCodingProfName(binding.getVariable().toString());
                break;
            case  22 :
                setPvxL2IntfDscpPHBProfName(binding.getVariable().toString());
                break;
            case  23 :
                setPvxL2IntfCtrlFrmProfileName(binding.getVariable().toString());
                break;
            case  24 :
                setPvxL2IntfUseDei(binding.getVariable().toInt());
                break;
            case  25 :
                setPvxL2IntfIngressBandwidthProfile(binding.getVariable().toString());
                break;
            case  26 :
                setPvxL2IntfEgressBandwidthProfile(binding.getVariable().toString());
                break;
            case  27 :
                setPvxL2IntfTrustIncomingPCP(binding.getVariable().toInt());
                break;
            case  28 :
                setPvxL2IntfTrustIncomingDscp(binding.getVariable().toInt());
                break;
            case  29 :
                setPvxL2IntfBcastLimit(binding.getVariable().toInt());
                break;
            case  30 :
                setPvxL2IntfMcastLimit(binding.getVariable().toInt());
                break;
            case  31 :
                setPvxL2IntfDlfLimit(binding.getVariable().toInt());
                break;
            case  100 :
                setPvxL2IntfRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setPvxL2IntfSwitchIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPvxL2IntfShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPvxL2IntfSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPvxL2IntfPortTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setPvxL2IntfPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(PvxL2IntfTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("pvxL2IntfSwitchIdx", pvxL2IntfSwitchIdx).append("pvxL2IntfShelfIdx", pvxL2IntfShelfIdx).append("pvxL2IntfSlotIdx", pvxL2IntfSlotIdx).append("pvxL2IntfPortTypeIdx", pvxL2IntfPortTypeIdx).append("pvxL2IntfPortIdx", pvxL2IntfPortIdx).append("pvxL2IntfAdminStatus", pvxL2IntfAdminStatus).append("pvxL2IntfOperStatus", pvxL2IntfOperStatus).append("pvxL2IntfType", pvxL2IntfType).append("pvxL2IntfSTpid", pvxL2IntfSTpid).append("pvxL2IntfPvid", pvxL2IntfPvid).append("pvxL2IntfDefaultPriority", pvxL2IntfDefaultPriority).append("pvxL2IntfAllowedFrames", pvxL2IntfAllowedFrames).append("pvxL2IntfIngressFiltering", pvxL2IntfIngressFiltering).append("pvxL2IntfCtrlFrmProfileId", pvxL2IntfCtrlFrmProfileId).append("pvxL2IntfMACAddr", pvxL2IntfMACAddr).append("pvxL2IntfRateLimit", pvxL2IntfRateLimit).append("pvxL2IntfCoSProfileId", pvxL2IntfCoSProfileId).append("pvxL2IntfIsUNI", pvxL2IntfIsUNI).append("pvxL2IntfSchedProfName", pvxL2IntfSchedProfName).append("pvxL2IntfPriTCMapProfName", pvxL2IntfPriTCMapProfName).append("pvxL2IntfPCPCodingProfName", pvxL2IntfPCPCodingProfName).append("pvxL2IntfDscpPHBProfName", pvxL2IntfDscpPHBProfName).append("pvxL2IntfCtrlFrmProfileName", pvxL2IntfCtrlFrmProfileName).append("pvxL2IntfUseDei", pvxL2IntfUseDei).append("pvxL2IntfIngressBandwidthProfile", pvxL2IntfIngressBandwidthProfile).append("pvxL2IntfEgressBandwidthProfile", pvxL2IntfEgressBandwidthProfile).append("pvxL2IntfTrustIncomingPCP", pvxL2IntfTrustIncomingPCP).append("pvxL2IntfTrustIncomingDscp", pvxL2IntfTrustIncomingDscp).append("pvxL2IntfBcastLimit", pvxL2IntfBcastLimit).append("pvxL2IntfMcastLimit", pvxL2IntfMcastLimit).append("pvxL2IntfDlfLimit", pvxL2IntfDlfLimit).append("pvxL2IntfRowStatus", pvxL2IntfRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(pvxL2IntfSwitchIdx).append(pvxL2IntfShelfIdx).append(pvxL2IntfSlotIdx).append(pvxL2IntfPortTypeIdx).append(pvxL2IntfPortIdx).append(pvxL2IntfAdminStatus).append(pvxL2IntfOperStatus).append(pvxL2IntfType).append(pvxL2IntfSTpid).append(pvxL2IntfPvid).append(pvxL2IntfDefaultPriority).append(pvxL2IntfAllowedFrames).append(pvxL2IntfIngressFiltering).append(pvxL2IntfCtrlFrmProfileId).append(pvxL2IntfMACAddr).append(pvxL2IntfRateLimit).append(pvxL2IntfCoSProfileId).append(pvxL2IntfIsUNI).append(pvxL2IntfSchedProfName).append(pvxL2IntfPriTCMapProfName).append(pvxL2IntfPCPCodingProfName).append(pvxL2IntfDscpPHBProfName).append(pvxL2IntfCtrlFrmProfileName).append(pvxL2IntfUseDei).append(pvxL2IntfIngressBandwidthProfile).append(pvxL2IntfEgressBandwidthProfile).append(pvxL2IntfTrustIncomingPCP).append(pvxL2IntfTrustIncomingDscp).append(pvxL2IntfBcastLimit).append(pvxL2IntfMcastLimit).append(pvxL2IntfDlfLimit).append(pvxL2IntfRowStatus).append(_index).toHashCode();
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
        PvxL2IntfEntry rhs = ((PvxL2IntfEntry) obj);
        return new EqualsBuilder().append(pvxL2IntfSwitchIdx, rhs.pvxL2IntfSwitchIdx).append(pvxL2IntfShelfIdx, rhs.pvxL2IntfShelfIdx).append(pvxL2IntfSlotIdx, rhs.pvxL2IntfSlotIdx).append(pvxL2IntfPortTypeIdx, rhs.pvxL2IntfPortTypeIdx).append(pvxL2IntfPortIdx, rhs.pvxL2IntfPortIdx).append(pvxL2IntfAdminStatus, rhs.pvxL2IntfAdminStatus).append(pvxL2IntfOperStatus, rhs.pvxL2IntfOperStatus).append(pvxL2IntfType, rhs.pvxL2IntfType).append(pvxL2IntfSTpid, rhs.pvxL2IntfSTpid).append(pvxL2IntfPvid, rhs.pvxL2IntfPvid).append(pvxL2IntfDefaultPriority, rhs.pvxL2IntfDefaultPriority).append(pvxL2IntfAllowedFrames, rhs.pvxL2IntfAllowedFrames).append(pvxL2IntfIngressFiltering, rhs.pvxL2IntfIngressFiltering).append(pvxL2IntfCtrlFrmProfileId, rhs.pvxL2IntfCtrlFrmProfileId).append(pvxL2IntfMACAddr, rhs.pvxL2IntfMACAddr).append(pvxL2IntfRateLimit, rhs.pvxL2IntfRateLimit).append(pvxL2IntfCoSProfileId, rhs.pvxL2IntfCoSProfileId).append(pvxL2IntfIsUNI, rhs.pvxL2IntfIsUNI).append(pvxL2IntfSchedProfName, rhs.pvxL2IntfSchedProfName).append(pvxL2IntfPriTCMapProfName, rhs.pvxL2IntfPriTCMapProfName).append(pvxL2IntfPCPCodingProfName, rhs.pvxL2IntfPCPCodingProfName).append(pvxL2IntfDscpPHBProfName, rhs.pvxL2IntfDscpPHBProfName).append(pvxL2IntfCtrlFrmProfileName, rhs.pvxL2IntfCtrlFrmProfileName).append(pvxL2IntfUseDei, rhs.pvxL2IntfUseDei).append(pvxL2IntfIngressBandwidthProfile, rhs.pvxL2IntfIngressBandwidthProfile).append(pvxL2IntfEgressBandwidthProfile, rhs.pvxL2IntfEgressBandwidthProfile).append(pvxL2IntfTrustIncomingPCP, rhs.pvxL2IntfTrustIncomingPCP).append(pvxL2IntfTrustIncomingDscp, rhs.pvxL2IntfTrustIncomingDscp).append(pvxL2IntfBcastLimit, rhs.pvxL2IntfBcastLimit).append(pvxL2IntfMcastLimit, rhs.pvxL2IntfMcastLimit).append(pvxL2IntfDlfLimit, rhs.pvxL2IntfDlfLimit).append(pvxL2IntfRowStatus, rhs.pvxL2IntfRowStatus).append(_index, rhs._index).isEquals();
    }

    public PvxL2IntfEntry clone() {
        PvxL2IntfEntry _copy = new PvxL2IntfEntry();
        _copy.pvxL2IntfSwitchIdx = pvxL2IntfSwitchIdx;
        _copy.pvxL2IntfShelfIdx = pvxL2IntfShelfIdx;
        _copy.pvxL2IntfSlotIdx = pvxL2IntfSlotIdx;
        _copy.pvxL2IntfPortTypeIdx = pvxL2IntfPortTypeIdx;
        _copy.pvxL2IntfPortIdx = pvxL2IntfPortIdx;
        _copy.pvxL2IntfAdminStatus = pvxL2IntfAdminStatus;
        _copy.pvxL2IntfOperStatus = pvxL2IntfOperStatus;
        _copy.pvxL2IntfType = pvxL2IntfType;
        _copy.pvxL2IntfSTpid = pvxL2IntfSTpid;
        _copy.pvxL2IntfPvid = pvxL2IntfPvid;
        _copy.pvxL2IntfDefaultPriority = pvxL2IntfDefaultPriority;
        _copy.pvxL2IntfAllowedFrames = pvxL2IntfAllowedFrames;
        _copy.pvxL2IntfIngressFiltering = pvxL2IntfIngressFiltering;
        _copy.pvxL2IntfCtrlFrmProfileId = pvxL2IntfCtrlFrmProfileId;
        _copy.pvxL2IntfMACAddr = pvxL2IntfMACAddr;
        _copy.pvxL2IntfRateLimit = pvxL2IntfRateLimit;
        _copy.pvxL2IntfCoSProfileId = pvxL2IntfCoSProfileId;
        _copy.pvxL2IntfIsUNI = pvxL2IntfIsUNI;
        _copy.pvxL2IntfSchedProfName = pvxL2IntfSchedProfName;
        _copy.pvxL2IntfPriTCMapProfName = pvxL2IntfPriTCMapProfName;
        _copy.pvxL2IntfPCPCodingProfName = pvxL2IntfPCPCodingProfName;
        _copy.pvxL2IntfDscpPHBProfName = pvxL2IntfDscpPHBProfName;
        _copy.pvxL2IntfCtrlFrmProfileName = pvxL2IntfCtrlFrmProfileName;
        _copy.pvxL2IntfUseDei = pvxL2IntfUseDei;
        _copy.pvxL2IntfIngressBandwidthProfile = pvxL2IntfIngressBandwidthProfile;
        _copy.pvxL2IntfEgressBandwidthProfile = pvxL2IntfEgressBandwidthProfile;
        _copy.pvxL2IntfTrustIncomingPCP = pvxL2IntfTrustIncomingPCP;
        _copy.pvxL2IntfTrustIncomingDscp = pvxL2IntfTrustIncomingDscp;
        _copy.pvxL2IntfBcastLimit = pvxL2IntfBcastLimit;
        _copy.pvxL2IntfMcastLimit = pvxL2IntfMcastLimit;
        _copy.pvxL2IntfDlfLimit = pvxL2IntfDlfLimit;
        _copy.pvxL2IntfRowStatus = pvxL2IntfRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.14.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "pvxL2IntfSwitchIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "pvxL2IntfShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "pvxL2IntfSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "pvxL2IntfPortTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "pvxL2IntfPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "pvxL2IntfAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "pvxL2IntfOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "pvxL2IntfType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "pvxL2IntfSTpid", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "pvxL2IntfPvid", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "pvxL2IntfDefaultPriority", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "pvxL2IntfAllowedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "pvxL2IntfIngressFiltering", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "pvxL2IntfCtrlFrmProfileId", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "pvxL2IntfMACAddr", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "pvxL2IntfRateLimit", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "pvxL2IntfCoSProfileId", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "pvxL2IntfIsUNI", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "pvxL2IntfSchedProfName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "pvxL2IntfPriTCMapProfName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "pvxL2IntfPCPCodingProfName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "pvxL2IntfDscpPHBProfName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "pvxL2IntfCtrlFrmProfileName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "pvxL2IntfUseDei", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "pvxL2IntfIngressBandwidthProfile", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "pvxL2IntfEgressBandwidthProfile", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "pvxL2IntfTrustIncomingPCP", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "pvxL2IntfTrustIncomingDscp", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "pvxL2IntfBcastLimit", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(30, "pvxL2IntfMcastLimit", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(31, "pvxL2IntfDlfLimit", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "pvxL2IntfRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
