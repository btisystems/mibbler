
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.osctable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOscEntry
    extends IDeviceEntity
{


    void setOscShelfIdx(int oscShelfIdx);

    int getOscShelfIdx();

    void setOscSlotIdx(int oscSlotIdx);

    int getOscSlotIdx();

    void setOscIdx(int oscIdx);

    int getOscIdx();

    void setOscAdminStatus(int oscAdminStatus);

    int getOscAdminStatus();

    boolean isOscAdminStatusDefined();

    void setOscOperStatus(int oscOperStatus);

    int getOscOperStatus();

    void setOscOperStatQlfr(String oscOperStatQlfr);

    String getOscOperStatQlfr();

    void setOscCustom1(String oscCustom1);

    String getOscCustom1();

    boolean isOscCustom1Defined();

    void setOscType(int oscType);

    int getOscType();

    void setOscUnmbrd(int oscUnmbrd);

    int getOscUnmbrd();

    void setOscSpeed(int oscSpeed);

    int getOscSpeed();

    void setOscDuplex(int oscDuplex);

    int getOscDuplex();

    void setOscMediaRate(int oscMediaRate);

    int getOscMediaRate();

    void setOscMTU(int oscMTU);

    int getOscMTU();

    void setOscMACAddr(String oscMACAddr);

    String getOscMACAddr();

    void setOscIPAddr(String oscIPAddr);

    String getOscIPAddr();

    void setOscIPMask(String oscIPMask);

    String getOscIPMask();

    void setOscIPBcast(String oscIPBcast);

    String getOscIPBcast();

    void setOscRowStatus(int oscRowStatus);

    int getOscRowStatus();

    IOscEntry clone();

}
