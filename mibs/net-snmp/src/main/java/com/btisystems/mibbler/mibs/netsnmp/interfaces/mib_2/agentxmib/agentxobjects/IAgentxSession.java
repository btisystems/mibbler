
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAgentxSession
    extends IDeviceEntity
{


    void setAgentxSessionTableLastChange(int agentxSessionTableLastChange);

    int getAgentxSessionTableLastChange();

    IAgentxSession clone();

}
