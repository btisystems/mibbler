
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.equipment.cptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ICpEntry
    extends IDeviceEntity
{


    void setCpTypeIdx(int cpTypeIdx);

    int getCpTypeIdx();

    void setCpShelfIdx(int cpShelfIdx);

    int getCpShelfIdx();

    void setCpSlotIdx(int cpSlotIdx);

    int getCpSlotIdx();

    void setCpPEC(String cpPEC);

    String getCpPEC();

    void setCpAdminStatus(int cpAdminStatus);

    int getCpAdminStatus();

    boolean isCpAdminStatusDefined();

    void setCpOperStatus(int cpOperStatus);

    int getCpOperStatus();

    void setCpOperStatQlfr(String cpOperStatQlfr);

    String getCpOperStatQlfr();

    void setCpId(String cpId);

    String getCpId();

    boolean isCpIdDefined();

    void setCpCustom1(String cpCustom1);

    String getCpCustom1();

    boolean isCpCustom1Defined();

    void setCpCustom2(String cpCustom2);

    String getCpCustom2();

    boolean isCpCustom2Defined();

    void setCpCustom3(String cpCustom3);

    String getCpCustom3();

    boolean isCpCustom3Defined();

    void setCpUpgradeStage(int cpUpgradeStage);

    int getCpUpgradeStage();

    void setCpUpgradeResult(int cpUpgradeResult);

    int getCpUpgradeResult();

    void setCpRowStatus(int cpRowStatus);

    int getCpRowStatus();

    ICpEntry clone();

}
