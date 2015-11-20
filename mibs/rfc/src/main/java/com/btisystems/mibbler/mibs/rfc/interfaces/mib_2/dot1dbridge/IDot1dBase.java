
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dBase
    extends IDeviceEntity
{


    void setDot1dBaseBridgeAddress(String dot1dBaseBridgeAddress);

    String getDot1dBaseBridgeAddress();

    void setDot1dBaseNumPorts(int dot1dBaseNumPorts);

    int getDot1dBaseNumPorts();

    void setDot1dBaseType(int dot1dBaseType);

    int getDot1dBaseType();

    IDot1dBase clone();

}
