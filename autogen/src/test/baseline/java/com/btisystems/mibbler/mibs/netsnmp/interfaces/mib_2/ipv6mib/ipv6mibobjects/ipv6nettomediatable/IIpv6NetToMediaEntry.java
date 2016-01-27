
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6nettomediatable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpv6NetToMediaEntry
    extends IDeviceEntity
{


    void setIpv6NetToMediaNetAddress(String ipv6NetToMediaNetAddress);

    String getIpv6NetToMediaNetAddress();

    void setIpv6NetToMediaPhysAddress(String ipv6NetToMediaPhysAddress);

    String getIpv6NetToMediaPhysAddress();

    void setIpv6NetToMediaType(int ipv6NetToMediaType);

    int getIpv6NetToMediaType();

    void setIpv6IfNetToMediaState(int ipv6IfNetToMediaState);

    int getIpv6IfNetToMediaState();

    void setIpv6IfNetToMediaLastUpdated(int ipv6IfNetToMediaLastUpdated);

    int getIpv6IfNetToMediaLastUpdated();

    void setIpv6NetToMediaValid(int ipv6NetToMediaValid);

    int getIpv6NetToMediaValid();

    boolean isIpv6NetToMediaValidDefined();

    IIpv6NetToMediaEntry clone();

}
