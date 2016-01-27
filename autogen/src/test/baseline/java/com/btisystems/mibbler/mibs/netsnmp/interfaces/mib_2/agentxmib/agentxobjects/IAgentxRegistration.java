
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAgentxRegistration
    extends IDeviceEntity
{


    void setAgentxRegistrationTableLastChange(int agentxRegistrationTableLastChange);

    int getAgentxRegistrationTableLastChange();

    IAgentxRegistration clone();

}
