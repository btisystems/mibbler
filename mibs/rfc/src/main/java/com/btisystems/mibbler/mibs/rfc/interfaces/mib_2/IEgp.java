
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEgp
    extends IDeviceEntity
{


    void setEgpInMsgs(int egpInMsgs);

    int getEgpInMsgs();

    void setEgpInErrors(int egpInErrors);

    int getEgpInErrors();

    void setEgpOutMsgs(int egpOutMsgs);

    int getEgpOutMsgs();

    void setEgpOutErrors(int egpOutErrors);

    int getEgpOutErrors();

    void setEgpAs(int egpAs);

    int getEgpAs();

    IEgp clone();

}
