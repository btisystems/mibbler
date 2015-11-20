
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRadiusAccClient
    extends IDeviceEntity
{


    void setRadiusAccClientInvalidServerAddresses(int radiusAccClientInvalidServerAddresses);

    int getRadiusAccClientInvalidServerAddresses();

    void setRadiusAccClientIdentifier(String radiusAccClientIdentifier);

    String getRadiusAccClientIdentifier();

    IRadiusAccClient clone();

}
