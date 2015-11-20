
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory.usrhistoryobjecttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IUsrHistoryObjectEntry
    extends IDeviceEntity
{


    void setUsrHistoryObjectIndex(int usrHistoryObjectIndex);

    int getUsrHistoryObjectIndex();

    void setUsrHistoryObjectVariable(String usrHistoryObjectVariable);

    String getUsrHistoryObjectVariable();

    void setUsrHistoryObjectSampleType(int usrHistoryObjectSampleType);

    int getUsrHistoryObjectSampleType();

    IUsrHistoryObjectEntry clone();

}
