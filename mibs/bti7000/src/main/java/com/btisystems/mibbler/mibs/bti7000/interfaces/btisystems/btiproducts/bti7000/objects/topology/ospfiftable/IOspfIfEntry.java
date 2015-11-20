
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospfiftable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOspfIfEntry
    extends IDeviceEntity
{


    void setOspfIfSwitchId(int ospfIfSwitchId);

    int getOspfIfSwitchId();

    boolean isOspfIfSwitchIdDefined();

    void setOspfIfShelfIdx(int ospfIfShelfIdx);

    int getOspfIfShelfIdx();

    void setOspfIfSlotIdx(int ospfIfSlotIdx);

    int getOspfIfSlotIdx();

    void setOspfIfType(int ospfIfType);

    int getOspfIfType();

    boolean isOspfIfTypeDefined();

    void setOspfIfIdx(int ospfIfIdx);

    int getOspfIfIdx();

    void setOspfIfSubIdx(int ospfIfSubIdx);

    int getOspfIfSubIdx();

    boolean isOspfIfSubIdxDefined();

    void setOspfIfAreaId(String ospfIfAreaId);

    String getOspfIfAreaId();

    void setOspfIfAdminStat(int ospfIfAdminStat);

    int getOspfIfAdminStat();

    boolean isOspfIfAdminStatDefined();

    void setOspfIfRtrPriority(int ospfIfRtrPriority);

    int getOspfIfRtrPriority();

    boolean isOspfIfRtrPriorityDefined();

    void setOspfIfTransitDelay(int ospfIfTransitDelay);

    int getOspfIfTransitDelay();

    boolean isOspfIfTransitDelayDefined();

    void setOspfIfRetransInterval(int ospfIfRetransInterval);

    int getOspfIfRetransInterval();

    boolean isOspfIfRetransIntervalDefined();

    void setOspfIfHelloInterval(int ospfIfHelloInterval);

    int getOspfIfHelloInterval();

    boolean isOspfIfHelloIntervalDefined();

    void setOspfIfRtrDeadInterval(int ospfIfRtrDeadInterval);

    int getOspfIfRtrDeadInterval();

    boolean isOspfIfRtrDeadIntervalDefined();

    void setOspfIfMetricValue(int ospfIfMetricValue);

    int getOspfIfMetricValue();

    boolean isOspfIfMetricValueDefined();

    void setOspfIfStatus(int ospfIfStatus);

    int getOspfIfStatus();

    IOspfIfEntry clone();

}
