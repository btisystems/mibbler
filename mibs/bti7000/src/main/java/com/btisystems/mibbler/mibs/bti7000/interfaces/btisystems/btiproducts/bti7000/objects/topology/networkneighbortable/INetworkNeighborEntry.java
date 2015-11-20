
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.networkneighbortable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INetworkNeighborEntry
    extends IDeviceEntity
{


    void setNetworkNeighborIdx(String networkNeighborIdx);

    String getNetworkNeighborIdx();

    void setNetworkNeighborIPAddr(String networkNeighborIPAddr);

    String getNetworkNeighborIPAddr();

    void setNetworkNeighborRowStatus(int networkNeighborRowStatus);

    int getNetworkNeighborRowStatus();

    INetworkNeighborEntry clone();

}
