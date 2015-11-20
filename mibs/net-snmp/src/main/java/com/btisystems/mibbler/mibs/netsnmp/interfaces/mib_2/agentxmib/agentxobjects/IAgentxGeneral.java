
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAgentxGeneral
    extends IDeviceEntity
{


    void setAgentxDefaultTimeout(int agentxDefaultTimeout);

    int getAgentxDefaultTimeout();

    boolean isAgentxDefaultTimeoutDefined();

    void setAgentxMasterAgentXVer(int agentxMasterAgentXVer);

    int getAgentxMasterAgentXVer();

    IAgentxGeneral clone();

}
