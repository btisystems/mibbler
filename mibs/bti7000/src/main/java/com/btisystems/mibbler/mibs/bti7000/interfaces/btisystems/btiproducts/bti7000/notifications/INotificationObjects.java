
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.notifications;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INotificationObjects
    extends IDeviceEntity
{


    void setTrapSeqNum(int trapSeqNum);

    int getTrapSeqNum();

    INotificationObjects clone();

}
