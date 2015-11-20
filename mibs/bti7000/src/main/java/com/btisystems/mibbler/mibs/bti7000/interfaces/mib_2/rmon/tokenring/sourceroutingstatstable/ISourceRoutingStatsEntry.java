
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.sourceroutingstatstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISourceRoutingStatsEntry
    extends IDeviceEntity
{


    void setSourceRoutingStatsIfIndex(int sourceRoutingStatsIfIndex);

    int getSourceRoutingStatsIfIndex();

    void setSourceRoutingStatsRingNumber(int sourceRoutingStatsRingNumber);

    int getSourceRoutingStatsRingNumber();

    void setSourceRoutingStatsInFrames(int sourceRoutingStatsInFrames);

    int getSourceRoutingStatsInFrames();

    void setSourceRoutingStatsOutFrames(int sourceRoutingStatsOutFrames);

    int getSourceRoutingStatsOutFrames();

    void setSourceRoutingStatsThroughFrames(int sourceRoutingStatsThroughFrames);

    int getSourceRoutingStatsThroughFrames();

    void setSourceRoutingStatsAllRoutesBroadcastFrames(int sourceRoutingStatsAllRoutesBroadcastFrames);

    int getSourceRoutingStatsAllRoutesBroadcastFrames();

    void setSourceRoutingStatsSingleRouteBroadcastFrames(int sourceRoutingStatsSingleRouteBroadcastFrames);

    int getSourceRoutingStatsSingleRouteBroadcastFrames();

    void setSourceRoutingStatsInOctets(int sourceRoutingStatsInOctets);

    int getSourceRoutingStatsInOctets();

    void setSourceRoutingStatsOutOctets(int sourceRoutingStatsOutOctets);

    int getSourceRoutingStatsOutOctets();

    void setSourceRoutingStatsThroughOctets(int sourceRoutingStatsThroughOctets);

    int getSourceRoutingStatsThroughOctets();

    void setSourceRoutingStatsAllRoutesBroadcastOctets(int sourceRoutingStatsAllRoutesBroadcastOctets);

    int getSourceRoutingStatsAllRoutesBroadcastOctets();

    void setSourceRoutingStatsSingleRoutesBroadcastOctets(int sourceRoutingStatsSingleRoutesBroadcastOctets);

    int getSourceRoutingStatsSingleRoutesBroadcastOctets();

    void setSourceRoutingStatsLocalLLCFrames(int sourceRoutingStatsLocalLLCFrames);

    int getSourceRoutingStatsLocalLLCFrames();

    void setSourceRoutingStats1HopFrames(int sourceRoutingStats1HopFrames);

    int getSourceRoutingStats1HopFrames();

    void setSourceRoutingStats2HopsFrames(int sourceRoutingStats2HopsFrames);

    int getSourceRoutingStats2HopsFrames();

    void setSourceRoutingStats3HopsFrames(int sourceRoutingStats3HopsFrames);

    int getSourceRoutingStats3HopsFrames();

    void setSourceRoutingStats4HopsFrames(int sourceRoutingStats4HopsFrames);

    int getSourceRoutingStats4HopsFrames();

    void setSourceRoutingStats5HopsFrames(int sourceRoutingStats5HopsFrames);

    int getSourceRoutingStats5HopsFrames();

    void setSourceRoutingStats6HopsFrames(int sourceRoutingStats6HopsFrames);

    int getSourceRoutingStats6HopsFrames();

    void setSourceRoutingStats7HopsFrames(int sourceRoutingStats7HopsFrames);

    int getSourceRoutingStats7HopsFrames();

    void setSourceRoutingStats8HopsFrames(int sourceRoutingStats8HopsFrames);

    int getSourceRoutingStats8HopsFrames();

    void setSourceRoutingStatsMoreThan8HopsFrames(int sourceRoutingStatsMoreThan8HopsFrames);

    int getSourceRoutingStatsMoreThan8HopsFrames();

    void setSourceRoutingStatsOwner(String sourceRoutingStatsOwner);

    String getSourceRoutingStatsOwner();

    void setSourceRoutingStatsStatus(int sourceRoutingStatsStatus);

    int getSourceRoutingStatsStatus();

    ISourceRoutingStatsEntry clone();

}
