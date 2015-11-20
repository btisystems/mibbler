
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipdefaultroutertable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpDefaultRouterEntry
    extends IDeviceEntity
{


    void setIpDefaultRouterAddressType(int ipDefaultRouterAddressType);

    int getIpDefaultRouterAddressType();

    void setIpDefaultRouterAddress(String ipDefaultRouterAddress);

    String getIpDefaultRouterAddress();

    void setIpDefaultRouterIfIndex(int ipDefaultRouterIfIndex);

    int getIpDefaultRouterIfIndex();

    void setIpDefaultRouterLifetime(int ipDefaultRouterLifetime);

    int getIpDefaultRouterLifetime();

    void setIpDefaultRouterPreference(int ipDefaultRouterPreference);

    int getIpDefaultRouterPreference();

    IIpDefaultRouterEntry clone();

}
