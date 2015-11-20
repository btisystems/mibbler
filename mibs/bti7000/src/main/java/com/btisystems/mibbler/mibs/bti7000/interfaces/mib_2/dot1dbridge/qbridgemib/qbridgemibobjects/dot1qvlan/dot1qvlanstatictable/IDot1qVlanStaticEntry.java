
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qvlanstatictable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qVlanStaticEntry
    extends IDeviceEntity
{


    void setDot1qVlanStaticName(String dot1qVlanStaticName);

    String getDot1qVlanStaticName();

    void setDot1qVlanStaticEgressPorts(String dot1qVlanStaticEgressPorts);

    String getDot1qVlanStaticEgressPorts();

    void setDot1qVlanForbiddenEgressPorts(String dot1qVlanForbiddenEgressPorts);

    String getDot1qVlanForbiddenEgressPorts();

    void setDot1qVlanStaticUntaggedPorts(String dot1qVlanStaticUntaggedPorts);

    String getDot1qVlanStaticUntaggedPorts();

    void setDot1qVlanStaticRowStatus(int dot1qVlanStaticRowStatus);

    int getDot1qVlanStaticRowStatus();

    IDot1qVlanStaticEntry clone();

}
