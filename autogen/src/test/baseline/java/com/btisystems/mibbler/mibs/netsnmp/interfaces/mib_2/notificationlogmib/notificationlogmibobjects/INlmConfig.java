
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlmConfig
    extends IDeviceEntity
{


    void setNlmConfigGlobalEntryLimit(int nlmConfigGlobalEntryLimit);

    int getNlmConfigGlobalEntryLimit();

    boolean isNlmConfigGlobalEntryLimitDefined();

    void setNlmConfigGlobalAgeOut(int nlmConfigGlobalAgeOut);

    int getNlmConfigGlobalAgeOut();

    boolean isNlmConfigGlobalAgeOutDefined();

    INlmConfig clone();

}
