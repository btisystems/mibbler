
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxconnection.agentxconnectiontable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAgentxConnectionEntry
    extends IDeviceEntity
{


    void setAgentxConnIndex(int agentxConnIndex);

    int getAgentxConnIndex();

    void setAgentxConnOpenTime(int agentxConnOpenTime);

    int getAgentxConnOpenTime();

    void setAgentxConnTransportDomain(String agentxConnTransportDomain);

    String getAgentxConnTransportDomain();

    void setAgentxConnTransportAddress(String agentxConnTransportAddress);

    String getAgentxConnTransportAddress();

    IAgentxConnectionEntry clone();

}
