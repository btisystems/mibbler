
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAdministration
    extends IDeviceEntity
{


    void setTl1IpLockoutAddr(String tl1IpLockoutAddr);

    String getTl1IpLockoutAddr();

    void setLatestTl1LogNum(int latestTl1LogNum);

    int getLatestTl1LogNum();

    IAdministration clone();

}
