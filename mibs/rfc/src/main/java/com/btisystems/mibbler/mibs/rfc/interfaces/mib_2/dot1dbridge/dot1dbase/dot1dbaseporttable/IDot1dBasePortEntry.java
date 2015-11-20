
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dbase.dot1dbaseporttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dBasePortEntry
    extends IDeviceEntity
{


    void setDot1dBasePort(int dot1dBasePort);

    int getDot1dBasePort();

    void setDot1dBasePortIfIndex(int dot1dBasePortIfIndex);

    int getDot1dBasePortIfIndex();

    void setDot1dBasePortCircuit(String dot1dBasePortCircuit);

    String getDot1dBasePortCircuit();

    void setDot1dBasePortDelayExceededDiscards(int dot1dBasePortDelayExceededDiscards);

    int getDot1dBasePortDelayExceededDiscards();

    void setDot1dBasePortMtuExceededDiscards(int dot1dBasePortMtuExceededDiscards);

    int getDot1dBasePortMtuExceededDiscards();

    IDot1dBasePortEntry clone();

}
