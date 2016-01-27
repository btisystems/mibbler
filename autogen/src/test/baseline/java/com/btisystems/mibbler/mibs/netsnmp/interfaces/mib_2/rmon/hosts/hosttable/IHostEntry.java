
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosts.hosttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHostEntry
    extends IDeviceEntity
{


    void setHostAddress(String hostAddress);

    String getHostAddress();

    void setHostCreationOrder(int hostCreationOrder);

    int getHostCreationOrder();

    void setHostIndex(int hostIndex);

    int getHostIndex();

    void setHostInPkts(int hostInPkts);

    int getHostInPkts();

    void setHostOutPkts(int hostOutPkts);

    int getHostOutPkts();

    void setHostInOctets(int hostInOctets);

    int getHostInOctets();

    void setHostOutOctets(int hostOutOctets);

    int getHostOutOctets();

    void setHostOutErrors(int hostOutErrors);

    int getHostOutErrors();

    void setHostOutBroadcastPkts(int hostOutBroadcastPkts);

    int getHostOutBroadcastPkts();

    void setHostOutMulticastPkts(int hostOutMulticastPkts);

    int getHostOutMulticastPkts();

    IHostEntry clone();

}
