
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospflsdbtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOspfLsdbEntry
    extends IDeviceEntity
{


    void setOspfLsdbAreaId(String ospfLsdbAreaId);

    String getOspfLsdbAreaId();

    void setOspfLsdbType(int ospfLsdbType);

    int getOspfLsdbType();

    void setOspfLsdbLsid(String ospfLsdbLsid);

    String getOspfLsdbLsid();

    void setOspfLsdbRouterId(String ospfLsdbRouterId);

    String getOspfLsdbRouterId();

    void setOspfLsdbSequence(int ospfLsdbSequence);

    int getOspfLsdbSequence();

    void setOspfLsdbAge(int ospfLsdbAge);

    int getOspfLsdbAge();

    void setOspfLsdbChecksum(int ospfLsdbChecksum);

    int getOspfLsdbChecksum();

    IOspfLsdbEntry clone();

}
