
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qtpgrouptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qTpGroupEntry
    extends IDeviceEntity
{


    void setDot1qTpGroupAddress(String dot1qTpGroupAddress);

    String getDot1qTpGroupAddress();

    void setDot1qTpGroupEgressPorts(String dot1qTpGroupEgressPorts);

    String getDot1qTpGroupEgressPorts();

    void setDot1qTpGroupLearnt(String dot1qTpGroupLearnt);

    String getDot1qTpGroupLearnt();

    IDot1qTpGroupEntry clone();

}
