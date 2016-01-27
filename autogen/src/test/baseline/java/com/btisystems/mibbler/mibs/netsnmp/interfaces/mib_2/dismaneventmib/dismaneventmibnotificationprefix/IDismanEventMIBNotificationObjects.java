
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibnotificationprefix;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDismanEventMIBNotificationObjects
    extends IDeviceEntity
{


    void setMteHotTrigger(String mteHotTrigger);

    String getMteHotTrigger();

    void setMteHotTargetName(String mteHotTargetName);

    String getMteHotTargetName();

    void setMteHotContextName(String mteHotContextName);

    String getMteHotContextName();

    void setMteHotOID(String mteHotOID);

    String getMteHotOID();

    void setMteHotValue(int mteHotValue);

    int getMteHotValue();

    void setMteFailedReason(int mteFailedReason);

    int getMteFailedReason();

    IDismanEventMIBNotificationObjects clone();

}
