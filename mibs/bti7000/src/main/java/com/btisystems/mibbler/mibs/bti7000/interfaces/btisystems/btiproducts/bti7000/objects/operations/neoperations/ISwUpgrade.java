
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.neoperations;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISwUpgrade
    extends IDeviceEntity
{


    void setSwUpgradeCmd(int swUpgradeCmd);

    int getSwUpgradeCmd();

    void setSwUpgradeAddress(String swUpgradeAddress);

    String getSwUpgradeAddress();

    void setSwUpgradePath(String swUpgradePath);

    String getSwUpgradePath();

    void setSwUpgradeFtpUser(String swUpgradeFtpUser);

    String getSwUpgradeFtpUser();

    void setSwUpgradeFtpPswd(String swUpgradeFtpPswd);

    String getSwUpgradeFtpPswd();

    void setSwUpgradeInvokeRelNum(String swUpgradeInvokeRelNum);

    String getSwUpgradeInvokeRelNum();

    void setSwUpgradeCheckAlm(int swUpgradeCheckAlm);

    int getSwUpgradeCheckAlm();

    void setSwUpgradeActiveRelNum(String swUpgradeActiveRelNum);

    String getSwUpgradeActiveRelNum();

    void setSwUpgradeInactiveRelNum(String swUpgradeInactiveRelNum);

    String getSwUpgradeInactiveRelNum();

    void setSwUpgradeFileTransferType(int swUpgradeFileTransferType);

    int getSwUpgradeFileTransferType();

    ISwUpgrade clone();

}
