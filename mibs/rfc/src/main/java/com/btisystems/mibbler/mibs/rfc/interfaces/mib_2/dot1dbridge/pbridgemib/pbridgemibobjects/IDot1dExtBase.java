
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dExtBase
    extends IDeviceEntity
{


    void setDot1dDeviceCapabilities(String dot1dDeviceCapabilities);

    String getDot1dDeviceCapabilities();

    void setDot1dTrafficClassesEnabled(int dot1dTrafficClassesEnabled);

    int getDot1dTrafficClassesEnabled();

    boolean isDot1dTrafficClassesEnabledDefined();

    void setDot1dGmrpStatus(int dot1dGmrpStatus);

    int getDot1dGmrpStatus();

    boolean isDot1dGmrpStatusDefined();

    IDot1dExtBase clone();

}
