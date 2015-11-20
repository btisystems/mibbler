
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3controltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot3ControlEntry
    extends IDeviceEntity
{


    void setDot3ControlFunctionsSupported(String dot3ControlFunctionsSupported);

    String getDot3ControlFunctionsSupported();

    void setDot3ControlInUnknownOpcodes(int dot3ControlInUnknownOpcodes);

    int getDot3ControlInUnknownOpcodes();

    void setDot3HCControlInUnknownOpcodes(long dot3HCControlInUnknownOpcodes);

    long getDot3HCControlInUnknownOpcodes();

    IDot3ControlEntry clone();

}
