
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtpfdbtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dTpFdbEntry
    extends IDeviceEntity
{


    void setDot1dTpFdbAddress(String dot1dTpFdbAddress);

    String getDot1dTpFdbAddress();

    void setDot1dTpFdbPort(int dot1dTpFdbPort);

    int getDot1dTpFdbPort();

    void setDot1dTpFdbStatus(int dot1dTpFdbStatus);

    int getDot1dTpFdbStatus();

    IDot1dTpFdbEntry clone();

}
