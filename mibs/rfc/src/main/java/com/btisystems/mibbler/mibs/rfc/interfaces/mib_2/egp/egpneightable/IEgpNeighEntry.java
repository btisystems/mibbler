
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.egp.egpneightable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEgpNeighEntry
    extends IDeviceEntity
{


    void setEgpNeighState(int egpNeighState);

    int getEgpNeighState();

    void setEgpNeighAddr(String egpNeighAddr);

    String getEgpNeighAddr();

    void setEgpNeighAs(int egpNeighAs);

    int getEgpNeighAs();

    void setEgpNeighInMsgs(int egpNeighInMsgs);

    int getEgpNeighInMsgs();

    void setEgpNeighInErrs(int egpNeighInErrs);

    int getEgpNeighInErrs();

    void setEgpNeighOutMsgs(int egpNeighOutMsgs);

    int getEgpNeighOutMsgs();

    void setEgpNeighOutErrs(int egpNeighOutErrs);

    int getEgpNeighOutErrs();

    void setEgpNeighInErrMsgs(int egpNeighInErrMsgs);

    int getEgpNeighInErrMsgs();

    void setEgpNeighOutErrMsgs(int egpNeighOutErrMsgs);

    int getEgpNeighOutErrMsgs();

    void setEgpNeighStateUps(int egpNeighStateUps);

    int getEgpNeighStateUps();

    void setEgpNeighStateDowns(int egpNeighStateDowns);

    int getEgpNeighStateDowns();

    void setEgpNeighIntervalHello(int egpNeighIntervalHello);

    int getEgpNeighIntervalHello();

    void setEgpNeighIntervalPoll(int egpNeighIntervalPoll);

    int getEgpNeighIntervalPoll();

    void setEgpNeighMode(int egpNeighMode);

    int getEgpNeighMode();

    void setEgpNeighEventTrigger(int egpNeighEventTrigger);

    int getEgpNeighEventTrigger();

    IEgpNeighEntry clone();

}
