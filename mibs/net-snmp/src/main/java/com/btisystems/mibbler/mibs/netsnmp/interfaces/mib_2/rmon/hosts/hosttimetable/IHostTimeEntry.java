
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosts.hosttimetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHostTimeEntry
    extends IDeviceEntity
{


    void setHostTimeAddress(String hostTimeAddress);

    String getHostTimeAddress();

    void setHostTimeCreationOrder(int hostTimeCreationOrder);

    int getHostTimeCreationOrder();

    void setHostTimeIndex(int hostTimeIndex);

    int getHostTimeIndex();

    void setHostTimeInPkts(int hostTimeInPkts);

    int getHostTimeInPkts();

    void setHostTimeOutPkts(int hostTimeOutPkts);

    int getHostTimeOutPkts();

    void setHostTimeInOctets(int hostTimeInOctets);

    int getHostTimeInOctets();

    void setHostTimeOutOctets(int hostTimeOutOctets);

    int getHostTimeOutOctets();

    void setHostTimeOutErrors(int hostTimeOutErrors);

    int getHostTimeOutErrors();

    void setHostTimeOutBroadcastPkts(int hostTimeOutBroadcastPkts);

    int getHostTimeOutBroadcastPkts();

    void setHostTimeOutMulticastPkts(int hostTimeOutMulticastPkts);

    int getHostTimeOutMulticastPkts();

    IHostTimeEntry clone();

}
