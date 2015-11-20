
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ifmib.ifmibobjects.ifstacktable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfStackEntry
    extends IDeviceEntity
{


    void setIfStackHigherLayer(int ifStackHigherLayer);

    int getIfStackHigherLayer();

    void setIfStackLowerLayer(int ifStackLowerLayer);

    int getIfStackLowerLayer();

    void setIfStackStatus(int ifStackStatus);

    int getIfStackStatus();

    IIfStackEntry clone();

}
