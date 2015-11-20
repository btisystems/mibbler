
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IUdp
    extends IDeviceEntity
{


    void setUdpInDatagrams(int udpInDatagrams);

    int getUdpInDatagrams();

    void setUdpNoPorts(int udpNoPorts);

    int getUdpNoPorts();

    void setUdpInErrors(int udpInErrors);

    int getUdpInErrors();

    void setUdpOutDatagrams(int udpOutDatagrams);

    int getUdpOutDatagrams();

    IUdp clone();

}
