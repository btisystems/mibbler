
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ip;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpForward
    extends IDeviceEntity
{


    void setIpForwardNumber(int ipForwardNumber);

    int getIpForwardNumber();

    void setIpCidrRouteNumber(int ipCidrRouteNumber);

    int getIpCidrRouteNumber();

    IIpForward clone();

}
