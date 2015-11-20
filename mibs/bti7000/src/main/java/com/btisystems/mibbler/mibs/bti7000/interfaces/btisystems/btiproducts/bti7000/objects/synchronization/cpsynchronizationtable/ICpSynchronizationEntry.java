
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.synchronization.cpsynchronizationtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ICpSynchronizationEntry
    extends IDeviceEntity
{


    void setCpSynchronizationTypeIdx(int cpSynchronizationTypeIdx);

    int getCpSynchronizationTypeIdx();

    void setCpSynchronizationShelfIdx(int cpSynchronizationShelfIdx);

    int getCpSynchronizationShelfIdx();

    void setCpSynchronizationSlotIdx(int cpSynchronizationSlotIdx);

    int getCpSynchronizationSlotIdx();

    void setCpSynchronizationTimingMode(int cpSynchronizationTimingMode);

    int getCpSynchronizationTimingMode();

    void setCpSynchronizationPrimRefSrcPortNum(int cpSynchronizationPrimRefSrcPortNum);

    int getCpSynchronizationPrimRefSrcPortNum();

    void setCpSynchronizationPrimRefProtStatus(int cpSynchronizationPrimRefProtStatus);

    int getCpSynchronizationPrimRefProtStatus();

    void setCpSynchronizationPrimProtStatQlfr(String cpSynchronizationPrimProtStatQlfr);

    String getCpSynchronizationPrimProtStatQlfr();

    void setCpSynchronizationSecRefSrcPortNum(int cpSynchronizationSecRefSrcPortNum);

    int getCpSynchronizationSecRefSrcPortNum();

    void setCpSynchronizationSecRefProtStatus(int cpSynchronizationSecRefProtStatus);

    int getCpSynchronizationSecRefProtStatus();

    void setCpSynchronizationSecProtStatQlfr(String cpSynchronizationSecProtStatQlfr);

    String getCpSynchronizationSecProtStatQlfr();

    void setCpSynchronizationPrimRefBasicSSM(int cpSynchronizationPrimRefBasicSSM);

    int getCpSynchronizationPrimRefBasicSSM();

    boolean isCpSynchronizationPrimRefBasicSSMDefined();

    void setCpSynchronizationSecRefBasicSSM(int cpSynchronizationSecRefBasicSSM);

    int getCpSynchronizationSecRefBasicSSM();

    boolean isCpSynchronizationSecRefBasicSSMDefined();

    void setCpSynchronizationSwEvtType(int cpSynchronizationSwEvtType);

    int getCpSynchronizationSwEvtType();

    ICpSynchronizationEntry clone();

}
