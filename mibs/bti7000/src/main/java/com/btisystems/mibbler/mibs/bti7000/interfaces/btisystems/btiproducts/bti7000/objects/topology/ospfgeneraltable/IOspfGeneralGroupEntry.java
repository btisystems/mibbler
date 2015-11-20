
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospfgeneraltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOspfGeneralGroupEntry
    extends IDeviceEntity
{


    void setOspfIdx(int ospfIdx);

    int getOspfIdx();

    boolean isOspfIdxDefined();

    void setOspfRouterId(String ospfRouterId);

    String getOspfRouterId();

    void setOspfAdminStat(int ospfAdminStat);

    int getOspfAdminStat();

    boolean isOspfAdminStatDefined();

    void setOspfVersionNumber(int ospfVersionNumber);

    int getOspfVersionNumber();

    void setOspfAreaBdrRtrStatus(int ospfAreaBdrRtrStatus);

    int getOspfAreaBdrRtrStatus();

    void setOspfRouteRedist(int ospfRouteRedist);

    int getOspfRouteRedist();

    boolean isOspfRouteRedistDefined();

    void setOspfAreaId(String ospfAreaId);

    String getOspfAreaId();

    void setOspfRowStatus(int ospfRowStatus);

    int getOspfRowStatus();

    IOspfGeneralGroupEntry clone();

}
