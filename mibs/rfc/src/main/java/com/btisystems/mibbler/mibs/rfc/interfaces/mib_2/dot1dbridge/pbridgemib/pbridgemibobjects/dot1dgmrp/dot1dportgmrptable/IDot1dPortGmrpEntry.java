
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgmrp.dot1dportgmrptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dPortGmrpEntry
    extends IDeviceEntity
{


    void setDot1dPortGmrpStatus(int dot1dPortGmrpStatus);

    int getDot1dPortGmrpStatus();

    boolean isDot1dPortGmrpStatusDefined();

    void setDot1dPortGmrpFailedRegistrations(int dot1dPortGmrpFailedRegistrations);

    int getDot1dPortGmrpFailedRegistrations();

    void setDot1dPortGmrpLastPduOrigin(String dot1dPortGmrpLastPduOrigin);

    String getDot1dPortGmrpLastPduOrigin();

    IDot1dPortGmrpEntry clone();

}
