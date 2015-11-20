
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.shelfinvtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IShelfInvEntry
    extends IDeviceEntity
{


    void setShelfInvIdx(int shelfInvIdx);

    int getShelfInvIdx();

    void setShelfInvExpectedNEName(String shelfInvExpectedNEName);

    String getShelfInvExpectedNEName();

    void setShelfInvExpectedIPAddress(String shelfInvExpectedIPAddress);

    String getShelfInvExpectedIPAddress();

    void setShelfInvExpectedShelfNum(int shelfInvExpectedShelfNum);

    int getShelfInvExpectedShelfNum();

    void setShelfInvExpectedMSISerialNum(String shelfInvExpectedMSISerialNum);

    String getShelfInvExpectedMSISerialNum();

    void setShelfInvDiscoveredNEName(String shelfInvDiscoveredNEName);

    String getShelfInvDiscoveredNEName();

    void setShelfInvDiscoveredIPAddress(String shelfInvDiscoveredIPAddress);

    String getShelfInvDiscoveredIPAddress();

    void setShelfInvDiscoveredShelfNum(int shelfInvDiscoveredShelfNum);

    int getShelfInvDiscoveredShelfNum();

    void setShelfInvDiscoveredMSISerialNum(String shelfInvDiscoveredMSISerialNum);

    String getShelfInvDiscoveredMSISerialNum();

    void setShelfInvType(int shelfInvType);

    int getShelfInvType();

    void setShelfInvShortName(String shelfInvShortName);

    String getShelfInvShortName();

    void setShelfInvName(String shelfInvName);

    String getShelfInvName();

    void setShelfInvChassisPEC(String shelfInvChassisPEC);

    String getShelfInvChassisPEC();

    void setShelfInvChassisCLEI(String shelfInvChassisCLEI);

    String getShelfInvChassisCLEI();

    void setShelfInvAssemblyPEC(String shelfInvAssemblyPEC);

    String getShelfInvAssemblyPEC();

    void setShelfInvRev(int shelfInvRev);

    int getShelfInvRev();

    void setShelfInvConfig(int shelfInvConfig);

    int getShelfInvConfig();

    void setShelfInvUSI(String shelfInvUSI);

    String getShelfInvUSI();

    void setShelfInvSerialNum(String shelfInvSerialNum);

    String getShelfInvSerialNum();

    void setShelfInvMfgDate(String shelfInvMfgDate);

    String getShelfInvMfgDate();

    void setShelfInvMfgLoc(String shelfInvMfgLoc);

    String getShelfInvMfgLoc();

    void setShelfInvTestDate(String shelfInvTestDate);

    String getShelfInvTestDate();

    void setShelfInvTestLoc(String shelfInvTestLoc);

    String getShelfInvTestLoc();

    IShelfInvEntry clone();

}
