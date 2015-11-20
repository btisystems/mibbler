
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.radiusauthclient;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.radiusauthclient.radiusauthservertable.IRadiusAuthServerEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRadiusAuthServerTable
    extends IDeviceEntity
{


    Map<String, IRadiusAuthServerEntry> getRadiusAuthServerEntry();

    IRadiusAuthServerTable clone();

}
