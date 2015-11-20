
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxsession;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxsession.agentxsessiontable.IAgentxSessionEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAgentxSessionTable
    extends IDeviceEntity
{


    Map<String, IAgentxSessionEntry> getAgentxSessionEntry();

    IAgentxSessionTable clone();

}
