
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qtpfdbtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qTpFdbEntry
    extends IDeviceEntity
{


    void setDot1qTpFdbAddress(String dot1qTpFdbAddress);

    String getDot1qTpFdbAddress();

    void setDot1qTpFdbPort(int dot1qTpFdbPort);

    int getDot1qTpFdbPort();

    void setDot1qTpFdbStatus(int dot1qTpFdbStatus);

    int getDot1qTpFdbStatus();

    IDot1qTpFdbEntry clone();

}
