
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipaddressprefixtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpAddressPrefixEntry
    extends IDeviceEntity
{


    void setIpAddressPrefixIfIndex(int ipAddressPrefixIfIndex);

    int getIpAddressPrefixIfIndex();

    void setIpAddressPrefixType(int ipAddressPrefixType);

    int getIpAddressPrefixType();

    void setIpAddressPrefixPrefix(String ipAddressPrefixPrefix);

    String getIpAddressPrefixPrefix();

    void setIpAddressPrefixLength(int ipAddressPrefixLength);

    int getIpAddressPrefixLength();

    void setIpAddressPrefixOrigin(int ipAddressPrefixOrigin);

    int getIpAddressPrefixOrigin();

    void setIpAddressPrefixOnLinkFlag(int ipAddressPrefixOnLinkFlag);

    int getIpAddressPrefixOnLinkFlag();

    void setIpAddressPrefixAutonomousFlag(int ipAddressPrefixAutonomousFlag);

    int getIpAddressPrefixAutonomousFlag();

    void setIpAddressPrefixAdvPreferredLifetime(int ipAddressPrefixAdvPreferredLifetime);

    int getIpAddressPrefixAdvPreferredLifetime();

    void setIpAddressPrefixAdvValidLifetime(int ipAddressPrefixAdvValidLifetime);

    int getIpAddressPrefixAdvValidLifetime();

    IIpAddressPrefixEntry clone();

}
