
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smscriptobjects.smcodetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISmCodeEntry
    extends IDeviceEntity
{


    void setSmCodeIndex(int smCodeIndex);

    int getSmCodeIndex();

    void setSmCodeText(String smCodeText);

    String getSmCodeText();

    void setSmCodeRowStatus(int smCodeRowStatus);

    int getSmCodeRowStatus();

    ISmCodeEntry clone();

}
