
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteEvent
    extends IDeviceEntity
{


    void setMteEventFailures(int mteEventFailures);

    int getMteEventFailures();

    IMteEvent clone();

}
