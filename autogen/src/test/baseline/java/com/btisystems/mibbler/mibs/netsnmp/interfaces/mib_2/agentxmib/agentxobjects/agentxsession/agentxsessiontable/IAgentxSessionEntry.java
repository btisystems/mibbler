
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxsession.agentxsessiontable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAgentxSessionEntry
    extends IDeviceEntity
{


    void setAgentxSessionIndex(int agentxSessionIndex);

    int getAgentxSessionIndex();

    void setAgentxSessionObjectID(String agentxSessionObjectID);

    String getAgentxSessionObjectID();

    void setAgentxSessionDescr(String agentxSessionDescr);

    String getAgentxSessionDescr();

    void setAgentxSessionAdminStatus(int agentxSessionAdminStatus);

    int getAgentxSessionAdminStatus();

    void setAgentxSessionOpenTime(int agentxSessionOpenTime);

    int getAgentxSessionOpenTime();

    void setAgentxSessionAgentXVer(int agentxSessionAgentXVer);

    int getAgentxSessionAgentXVer();

    void setAgentxSessionTimeout(int agentxSessionTimeout);

    int getAgentxSessionTimeout();

    IAgentxSessionEntry clone();

}
