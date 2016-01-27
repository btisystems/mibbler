
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxconnection;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxconnection.agentxconnectiontable.IAgentxConnectionEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAgentxConnectionTable
    extends IDeviceEntity
{


    Map<String, IAgentxConnectionEntry> getAgentxConnectionEntry();

    IAgentxConnectionTable clone();

}
