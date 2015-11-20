
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qforwardunregisteredtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qForwardUnregisteredEntry
    extends IDeviceEntity
{


    void setDot1qForwardUnregisteredPorts(String dot1qForwardUnregisteredPorts);

    String getDot1qForwardUnregisteredPorts();

    void setDot1qForwardUnregisteredStaticPorts(String dot1qForwardUnregisteredStaticPorts);

    String getDot1qForwardUnregisteredStaticPorts();

    void setDot1qForwardUnregisteredForbiddenPorts(String dot1qForwardUnregisteredForbiddenPorts);

    String getDot1qForwardUnregisteredForbiddenPorts();

    IDot1qForwardUnregisteredEntry clone();

}
