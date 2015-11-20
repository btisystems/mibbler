
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qBase
    extends IDeviceEntity
{


    void setDot1qVlanVersionNumber(int dot1qVlanVersionNumber);

    int getDot1qVlanVersionNumber();

    void setDot1qMaxVlanId(int dot1qMaxVlanId);

    int getDot1qMaxVlanId();

    void setDot1qMaxSupportedVlans(int dot1qMaxSupportedVlans);

    int getDot1qMaxSupportedVlans();

    void setDot1qNumVlans(int dot1qNumVlans);

    int getDot1qNumVlans();

    void setDot1qGvrpStatus(int dot1qGvrpStatus);

    int getDot1qGvrpStatus();

    boolean isDot1qGvrpStatusDefined();

    IDot1qBase clone();

}
