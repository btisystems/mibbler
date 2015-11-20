
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.notifications.dbchangenotifications;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDbChangeNotificationsObjects
    extends IDeviceEntity
{


    void setDbChangeDateAndTime(String dbChangeDateAndTime);

    String getDbChangeDateAndTime();

    void setDbChangeSeqNum(int dbChangeSeqNum);

    int getDbChangeSeqNum();

    void setDbChangeOID(String dbChangeOID);

    String getDbChangeOID();

    IDbChangeNotificationsObjects clone();

}
