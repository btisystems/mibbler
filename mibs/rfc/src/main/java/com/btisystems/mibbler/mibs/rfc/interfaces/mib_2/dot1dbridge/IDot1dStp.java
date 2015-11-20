
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dStp
    extends IDeviceEntity
{


    void setDot1dStpProtocolSpecification(int dot1dStpProtocolSpecification);

    int getDot1dStpProtocolSpecification();

    void setDot1dStpPriority(int dot1dStpPriority);

    int getDot1dStpPriority();

    void setDot1dStpTimeSinceTopologyChange(int dot1dStpTimeSinceTopologyChange);

    int getDot1dStpTimeSinceTopologyChange();

    void setDot1dStpTopChanges(int dot1dStpTopChanges);

    int getDot1dStpTopChanges();

    void setDot1dStpDesignatedRoot(String dot1dStpDesignatedRoot);

    String getDot1dStpDesignatedRoot();

    void setDot1dStpRootCost(int dot1dStpRootCost);

    int getDot1dStpRootCost();

    void setDot1dStpRootPort(int dot1dStpRootPort);

    int getDot1dStpRootPort();

    void setDot1dStpMaxAge(int dot1dStpMaxAge);

    int getDot1dStpMaxAge();

    void setDot1dStpHelloTime(int dot1dStpHelloTime);

    int getDot1dStpHelloTime();

    void setDot1dStpHoldTime(int dot1dStpHoldTime);

    int getDot1dStpHoldTime();

    void setDot1dStpForwardDelay(int dot1dStpForwardDelay);

    int getDot1dStpForwardDelay();

    void setDot1dStpBridgeMaxAge(int dot1dStpBridgeMaxAge);

    int getDot1dStpBridgeMaxAge();

    void setDot1dStpBridgeHelloTime(int dot1dStpBridgeHelloTime);

    int getDot1dStpBridgeHelloTime();

    void setDot1dStpBridgeForwardDelay(int dot1dStpBridgeForwardDelay);

    int getDot1dStpBridgeForwardDelay();

    IDot1dStp clone();

}
