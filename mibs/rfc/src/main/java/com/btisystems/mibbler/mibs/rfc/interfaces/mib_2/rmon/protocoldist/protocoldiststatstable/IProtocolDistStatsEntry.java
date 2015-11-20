
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.protocoldist.protocoldiststatstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IProtocolDistStatsEntry
    extends IDeviceEntity
{


    void setProtocolDistStatsPkts(int protocolDistStatsPkts);

    int getProtocolDistStatsPkts();

    void setProtocolDistStatsOctets(int protocolDistStatsOctets);

    int getProtocolDistStatsOctets();

    IProtocolDistStatsEntry clone();

}
