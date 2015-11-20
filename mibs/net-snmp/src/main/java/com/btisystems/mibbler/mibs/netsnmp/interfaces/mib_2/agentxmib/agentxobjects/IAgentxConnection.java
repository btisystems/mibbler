
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAgentxConnection
    extends IDeviceEntity
{


    void setAgentxConnTableLastChange(int agentxConnTableLastChange);

    int getAgentxConnTableLastChange();

    IAgentxConnection clone();

}
