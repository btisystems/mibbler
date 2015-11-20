
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxregistration.agentxregistrationtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAgentxRegistrationEntry
    extends IDeviceEntity
{


    void setAgentxRegIndex(int agentxRegIndex);

    int getAgentxRegIndex();

    void setAgentxRegContext(String agentxRegContext);

    String getAgentxRegContext();

    void setAgentxRegStart(String agentxRegStart);

    String getAgentxRegStart();

    void setAgentxRegRangeSubId(int agentxRegRangeSubId);

    int getAgentxRegRangeSubId();

    void setAgentxRegUpperBound(int agentxRegUpperBound);

    int getAgentxRegUpperBound();

    void setAgentxRegPriority(int agentxRegPriority);

    int getAgentxRegPriority();

    void setAgentxRegTimeout(int agentxRegTimeout);

    int getAgentxRegTimeout();

    void setAgentxRegInstance(int agentxRegInstance);

    int getAgentxRegInstance();

    IAgentxRegistrationEntry clone();

}
