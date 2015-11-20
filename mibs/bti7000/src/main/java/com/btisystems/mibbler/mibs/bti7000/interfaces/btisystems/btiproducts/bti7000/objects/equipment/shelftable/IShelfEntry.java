
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.equipment.shelftable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IShelfEntry
    extends IDeviceEntity
{


    void setShelfIdx(int shelfIdx);

    int getShelfIdx();

    void setShelfProvConfig(int shelfProvConfig);

    int getShelfProvConfig();

    boolean isShelfProvConfigDefined();

    void setShelfDiscConfig(int shelfDiscConfig);

    int getShelfDiscConfig();

    void setShelfType(int shelfType);

    int getShelfType();

    boolean isShelfTypeDefined();

    void setShelfPEC(String shelfPEC);

    String getShelfPEC();

    void setShelfAdminStatus(int shelfAdminStatus);

    int getShelfAdminStatus();

    boolean isShelfAdminStatusDefined();

    void setShelfOperStatus(int shelfOperStatus);

    int getShelfOperStatus();

    void setShelfOperStatQlfr(String shelfOperStatQlfr);

    String getShelfOperStatQlfr();

    void setShelfId(String shelfId);

    String getShelfId();

    boolean isShelfIdDefined();

    void setShelfCustom1(String shelfCustom1);

    String getShelfCustom1();

    boolean isShelfCustom1Defined();

    void setShelfCustom2(String shelfCustom2);

    String getShelfCustom2();

    boolean isShelfCustom2Defined();

    void setShelfCustom3(String shelfCustom3);

    String getShelfCustom3();

    boolean isShelfCustom3Defined();

    void setShelfPowerFeedA(int shelfPowerFeedA);

    int getShelfPowerFeedA();

    boolean isShelfPowerFeedADefined();

    void setShelfPowerFeedB(int shelfPowerFeedB);

    int getShelfPowerFeedB();

    boolean isShelfPowerFeedBDefined();

    void setShelfRowStatus(int shelfRowStatus);

    int getShelfRowStatus();

    IShelfEntry clone();

}
