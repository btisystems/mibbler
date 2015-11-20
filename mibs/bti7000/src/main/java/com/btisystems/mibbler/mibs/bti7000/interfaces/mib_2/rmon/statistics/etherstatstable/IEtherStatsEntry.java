
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.etherstatstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEtherStatsEntry
    extends IDeviceEntity
{


    void setEtherStatsIndex(int etherStatsIndex);

    int getEtherStatsIndex();

    void setEtherStatsDataSource(String etherStatsDataSource);

    String getEtherStatsDataSource();

    void setEtherStatsDropEvents(int etherStatsDropEvents);

    int getEtherStatsDropEvents();

    void setEtherStatsOctets(int etherStatsOctets);

    int getEtherStatsOctets();

    void setEtherStatsPkts(int etherStatsPkts);

    int getEtherStatsPkts();

    void setEtherStatsBroadcastPkts(int etherStatsBroadcastPkts);

    int getEtherStatsBroadcastPkts();

    void setEtherStatsMulticastPkts(int etherStatsMulticastPkts);

    int getEtherStatsMulticastPkts();

    void setEtherStatsCRCAlignErrors(int etherStatsCRCAlignErrors);

    int getEtherStatsCRCAlignErrors();

    void setEtherStatsUndersizePkts(int etherStatsUndersizePkts);

    int getEtherStatsUndersizePkts();

    void setEtherStatsOversizePkts(int etherStatsOversizePkts);

    int getEtherStatsOversizePkts();

    void setEtherStatsFragments(int etherStatsFragments);

    int getEtherStatsFragments();

    void setEtherStatsJabbers(int etherStatsJabbers);

    int getEtherStatsJabbers();

    void setEtherStatsCollisions(int etherStatsCollisions);

    int getEtherStatsCollisions();

    void setEtherStatsPkts64Octets(int etherStatsPkts64Octets);

    int getEtherStatsPkts64Octets();

    void setEtherStatsPkts65to127Octets(int etherStatsPkts65to127Octets);

    int getEtherStatsPkts65to127Octets();

    void setEtherStatsPkts128to255Octets(int etherStatsPkts128to255Octets);

    int getEtherStatsPkts128to255Octets();

    void setEtherStatsPkts256to511Octets(int etherStatsPkts256to511Octets);

    int getEtherStatsPkts256to511Octets();

    void setEtherStatsPkts512to1023Octets(int etherStatsPkts512to1023Octets);

    int getEtherStatsPkts512to1023Octets();

    void setEtherStatsPkts1024to1518Octets(int etherStatsPkts1024to1518Octets);

    int getEtherStatsPkts1024to1518Octets();

    void setEtherStatsOwner(String etherStatsOwner);

    String getEtherStatsOwner();

    void setEtherStatsStatus(int etherStatsStatus);

    int getEtherStatsStatus();

    IEtherStatsEntry clone();

}
