
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qvlancurrenttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qVlanCurrentEntry
    extends IDeviceEntity
{


    void setDot1qVlanTimeMark(int dot1qVlanTimeMark);

    int getDot1qVlanTimeMark();

    void setDot1qVlanIndex(int dot1qVlanIndex);

    int getDot1qVlanIndex();

    void setDot1qVlanFdbId(int dot1qVlanFdbId);

    int getDot1qVlanFdbId();

    void setDot1qVlanCurrentEgressPorts(String dot1qVlanCurrentEgressPorts);

    String getDot1qVlanCurrentEgressPorts();

    void setDot1qVlanCurrentUntaggedPorts(String dot1qVlanCurrentUntaggedPorts);

    String getDot1qVlanCurrentUntaggedPorts();

    void setDot1qVlanStatus(int dot1qVlanStatus);

    int getDot1qVlanStatus();

    void setDot1qVlanCreationTime(int dot1qVlanCreationTime);

    int getDot1qVlanCreationTime();

    IDot1qVlanCurrentEntry clone();

}
