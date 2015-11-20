
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.dot1qstaticmulticasttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qStaticMulticastEntry
    extends IDeviceEntity
{


    void setDot1qStaticMulticastAddress(String dot1qStaticMulticastAddress);

    String getDot1qStaticMulticastAddress();

    void setDot1qStaticMulticastReceivePort(int dot1qStaticMulticastReceivePort);

    int getDot1qStaticMulticastReceivePort();

    void setDot1qStaticMulticastStaticEgressPorts(String dot1qStaticMulticastStaticEgressPorts);

    String getDot1qStaticMulticastStaticEgressPorts();

    void setDot1qStaticMulticastForbiddenEgressPorts(String dot1qStaticMulticastForbiddenEgressPorts);

    String getDot1qStaticMulticastForbiddenEgressPorts();

    void setDot1qStaticMulticastStatus(int dot1qStaticMulticastStatus);

    int getDot1qStaticMulticastStatus();

    boolean isDot1qStaticMulticastStatusDefined();

    IDot1qStaticMulticastEntry clone();

}
