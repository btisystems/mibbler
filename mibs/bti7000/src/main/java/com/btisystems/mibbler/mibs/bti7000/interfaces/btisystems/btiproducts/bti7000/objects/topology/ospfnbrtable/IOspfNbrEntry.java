
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospfnbrtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOspfNbrEntry
    extends IDeviceEntity
{


    void setOspfNbrIpAddr(String ospfNbrIpAddr);

    String getOspfNbrIpAddr();

    void setOspfNbrAddressLessIndex(int ospfNbrAddressLessIndex);

    int getOspfNbrAddressLessIndex();

    void setOspfNbrRtrId(String ospfNbrRtrId);

    String getOspfNbrRtrId();

    void setOspfNbrOptions(int ospfNbrOptions);

    int getOspfNbrOptions();

    void setOspfNbrPriority(int ospfNbrPriority);

    int getOspfNbrPriority();

    void setOspfNbrState(int ospfNbrState);

    int getOspfNbrState();

    IOspfNbrEntry clone();

}
