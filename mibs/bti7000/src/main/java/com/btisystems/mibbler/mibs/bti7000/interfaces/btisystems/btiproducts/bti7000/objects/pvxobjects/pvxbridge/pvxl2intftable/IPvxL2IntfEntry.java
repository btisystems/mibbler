
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.pvxobjects.pvxbridge.pvxl2intftable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IPvxL2IntfEntry
    extends IDeviceEntity
{


    void setPvxL2IntfSwitchIdx(int pvxL2IntfSwitchIdx);

    int getPvxL2IntfSwitchIdx();

    void setPvxL2IntfShelfIdx(int pvxL2IntfShelfIdx);

    int getPvxL2IntfShelfIdx();

    void setPvxL2IntfSlotIdx(int pvxL2IntfSlotIdx);

    int getPvxL2IntfSlotIdx();

    void setPvxL2IntfPortTypeIdx(int pvxL2IntfPortTypeIdx);

    int getPvxL2IntfPortTypeIdx();

    void setPvxL2IntfPortIdx(int pvxL2IntfPortIdx);

    int getPvxL2IntfPortIdx();

    void setPvxL2IntfAdminStatus(int pvxL2IntfAdminStatus);

    int getPvxL2IntfAdminStatus();

    boolean isPvxL2IntfAdminStatusDefined();

    void setPvxL2IntfOperStatus(int pvxL2IntfOperStatus);

    int getPvxL2IntfOperStatus();

    void setPvxL2IntfType(int pvxL2IntfType);

    int getPvxL2IntfType();

    boolean isPvxL2IntfTypeDefined();

    void setPvxL2IntfSTpid(int pvxL2IntfSTpid);

    int getPvxL2IntfSTpid();

    boolean isPvxL2IntfSTpidDefined();

    void setPvxL2IntfPvid(int pvxL2IntfPvid);

    int getPvxL2IntfPvid();

    void setPvxL2IntfDefaultPriority(int pvxL2IntfDefaultPriority);

    int getPvxL2IntfDefaultPriority();

    void setPvxL2IntfAllowedFrames(int pvxL2IntfAllowedFrames);

    int getPvxL2IntfAllowedFrames();

    void setPvxL2IntfIngressFiltering(int pvxL2IntfIngressFiltering);

    int getPvxL2IntfIngressFiltering();

    void setPvxL2IntfCtrlFrmProfileId(int pvxL2IntfCtrlFrmProfileId);

    int getPvxL2IntfCtrlFrmProfileId();

    void setPvxL2IntfMACAddr(String pvxL2IntfMACAddr);

    String getPvxL2IntfMACAddr();

    void setPvxL2IntfRateLimit(int pvxL2IntfRateLimit);

    int getPvxL2IntfRateLimit();

    void setPvxL2IntfCoSProfileId(int pvxL2IntfCoSProfileId);

    int getPvxL2IntfCoSProfileId();

    void setPvxL2IntfIsUNI(int pvxL2IntfIsUNI);

    int getPvxL2IntfIsUNI();

    void setPvxL2IntfSchedProfName(String pvxL2IntfSchedProfName);

    String getPvxL2IntfSchedProfName();

    void setPvxL2IntfPriTCMapProfName(String pvxL2IntfPriTCMapProfName);

    String getPvxL2IntfPriTCMapProfName();

    void setPvxL2IntfPCPCodingProfName(String pvxL2IntfPCPCodingProfName);

    String getPvxL2IntfPCPCodingProfName();

    void setPvxL2IntfDscpPHBProfName(String pvxL2IntfDscpPHBProfName);

    String getPvxL2IntfDscpPHBProfName();

    void setPvxL2IntfCtrlFrmProfileName(String pvxL2IntfCtrlFrmProfileName);

    String getPvxL2IntfCtrlFrmProfileName();

    void setPvxL2IntfUseDei(int pvxL2IntfUseDei);

    int getPvxL2IntfUseDei();

    void setPvxL2IntfIngressBandwidthProfile(String pvxL2IntfIngressBandwidthProfile);

    String getPvxL2IntfIngressBandwidthProfile();

    void setPvxL2IntfEgressBandwidthProfile(String pvxL2IntfEgressBandwidthProfile);

    String getPvxL2IntfEgressBandwidthProfile();

    void setPvxL2IntfTrustIncomingPCP(int pvxL2IntfTrustIncomingPCP);

    int getPvxL2IntfTrustIncomingPCP();

    void setPvxL2IntfTrustIncomingDscp(int pvxL2IntfTrustIncomingDscp);

    int getPvxL2IntfTrustIncomingDscp();

    void setPvxL2IntfBcastLimit(int pvxL2IntfBcastLimit);

    int getPvxL2IntfBcastLimit();

    boolean isPvxL2IntfBcastLimitDefined();

    void setPvxL2IntfMcastLimit(int pvxL2IntfMcastLimit);

    int getPvxL2IntfMcastLimit();

    boolean isPvxL2IntfMcastLimitDefined();

    void setPvxL2IntfDlfLimit(int pvxL2IntfDlfLimit);

    int getPvxL2IntfDlfLimit();

    boolean isPvxL2IntfDlfLimitDefined();

    void setPvxL2IntfRowStatus(int pvxL2IntfRowStatus);

    int getPvxL2IntfRowStatus();

    IPvxL2IntfEntry clone();

}
