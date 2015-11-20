
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.notifications.eventnotifications;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEvtNotificationObjects
    extends IDeviceEntity
{


    void setEvtDateAndTime(String evtDateAndTime);

    String getEvtDateAndTime();

    void setTcaIntervalType(int tcaIntervalType);

    int getTcaIntervalType();

    void setTcaDateAndTime(String tcaDateAndTime);

    String getTcaDateAndTime();

    void setTcaMontype(int tcaMontype);

    int getTcaMontype();

    void setTcaValue(int tcaValue);

    int getTcaValue();

    void setTcaThreshold(int tcaThreshold);

    int getTcaThreshold();

    void setEvtDescription(String evtDescription);

    String getEvtDescription();

    void setEvtObjectType(int evtObjectType);

    int getEvtObjectType();

    void setEvtCodeType(int evtCodeType);

    int getEvtCodeType();

    IEvtNotificationObjects clone();

}
