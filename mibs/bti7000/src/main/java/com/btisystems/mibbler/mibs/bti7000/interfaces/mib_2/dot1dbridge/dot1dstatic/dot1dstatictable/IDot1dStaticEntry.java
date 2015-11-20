
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dstatic.dot1dstatictable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dStaticEntry
    extends IDeviceEntity
{


    void setDot1dStaticAddress(String dot1dStaticAddress);

    String getDot1dStaticAddress();

    void setDot1dStaticReceivePort(int dot1dStaticReceivePort);

    int getDot1dStaticReceivePort();

    void setDot1dStaticAllowedToGoTo(String dot1dStaticAllowedToGoTo);

    String getDot1dStaticAllowedToGoTo();

    void setDot1dStaticStatus(int dot1dStaticStatus);

    int getDot1dStaticStatus();

    IDot1dStaticEntry clone();

}
