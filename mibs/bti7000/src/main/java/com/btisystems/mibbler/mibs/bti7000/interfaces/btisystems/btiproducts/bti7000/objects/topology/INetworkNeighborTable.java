
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.networkneighbortable.INetworkNeighborEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INetworkNeighborTable
    extends IDeviceEntity
{


    Map<String, INetworkNeighborEntry> getNetworkNeighborEntry();

    INetworkNeighborTable clone();

}
