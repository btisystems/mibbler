
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.usrhistory.usrhistorycontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IUsrHistoryControlEntry
    extends IDeviceEntity
{


    void setUsrHistoryControlIndex(int usrHistoryControlIndex);

    int getUsrHistoryControlIndex();

    void setUsrHistoryControlObjects(int usrHistoryControlObjects);

    int getUsrHistoryControlObjects();

    void setUsrHistoryControlBucketsRequested(int usrHistoryControlBucketsRequested);

    int getUsrHistoryControlBucketsRequested();

    boolean isUsrHistoryControlBucketsRequestedDefined();

    void setUsrHistoryControlBucketsGranted(int usrHistoryControlBucketsGranted);

    int getUsrHistoryControlBucketsGranted();

    void setUsrHistoryControlInterval(int usrHistoryControlInterval);

    int getUsrHistoryControlInterval();

    boolean isUsrHistoryControlIntervalDefined();

    void setUsrHistoryControlOwner(String usrHistoryControlOwner);

    String getUsrHistoryControlOwner();

    void setUsrHistoryControlStatus(int usrHistoryControlStatus);

    int getUsrHistoryControlStatus();

    IUsrHistoryControlEntry clone();

}
