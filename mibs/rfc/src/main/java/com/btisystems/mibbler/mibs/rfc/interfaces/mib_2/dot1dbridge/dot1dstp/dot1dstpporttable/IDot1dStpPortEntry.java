
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dstp.dot1dstpporttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dStpPortEntry
    extends IDeviceEntity
{


    void setDot1dStpPort(int dot1dStpPort);

    int getDot1dStpPort();

    void setDot1dStpPortPriority(int dot1dStpPortPriority);

    int getDot1dStpPortPriority();

    void setDot1dStpPortState(int dot1dStpPortState);

    int getDot1dStpPortState();

    void setDot1dStpPortEnable(int dot1dStpPortEnable);

    int getDot1dStpPortEnable();

    void setDot1dStpPortPathCost(int dot1dStpPortPathCost);

    int getDot1dStpPortPathCost();

    void setDot1dStpPortDesignatedRoot(String dot1dStpPortDesignatedRoot);

    String getDot1dStpPortDesignatedRoot();

    void setDot1dStpPortDesignatedCost(int dot1dStpPortDesignatedCost);

    int getDot1dStpPortDesignatedCost();

    void setDot1dStpPortDesignatedBridge(String dot1dStpPortDesignatedBridge);

    String getDot1dStpPortDesignatedBridge();

    void setDot1dStpPortDesignatedPort(String dot1dStpPortDesignatedPort);

    String getDot1dStpPortDesignatedPort();

    void setDot1dStpPortForwardTransitions(int dot1dStpPortForwardTransitions);

    int getDot1dStpPortForwardTransitions();

    void setDot1dStpPortPathCost32(int dot1dStpPortPathCost32);

    int getDot1dStpPortPathCost32();

    IDot1dStpPortEntry clone();

}
