
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRadiusAuthClient
    extends IDeviceEntity
{


    void setRadiusAuthClientInvalidServerAddresses(int radiusAuthClientInvalidServerAddresses);

    int getRadiusAuthClientInvalidServerAddresses();

    void setRadiusAuthClientIdentifier(String radiusAuthClientIdentifier);

    String getRadiusAuthClientIdentifier();

    IRadiusAuthClient clone();

}
