
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxregistration;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxregistration.agentxregistrationtable.IAgentxRegistrationEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAgentxRegistrationTable
    extends IDeviceEntity
{


    Map<String, IAgentxRegistrationEntry> getAgentxRegistrationEntry();

    IAgentxRegistrationTable clone();

}
