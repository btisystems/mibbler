
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.netmgmttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INetMgmtEntry
    extends IDeviceEntity
{


    void setNetMgmtIdx(int netMgmtIdx);

    int getNetMgmtIdx();

    void setNetMgmtAdminStatus(int netMgmtAdminStatus);

    int getNetMgmtAdminStatus();

    boolean isNetMgmtAdminStatusDefined();

    void setNetMgmtOperStatus(int netMgmtOperStatus);

    int getNetMgmtOperStatus();

    void setNetMgmtOperStatQlfr(String netMgmtOperStatQlfr);

    String getNetMgmtOperStatQlfr();

    void setNetMgmtIPAddr(String netMgmtIPAddr);

    String getNetMgmtIPAddr();

    void setNetMgmtIPMask(String netMgmtIPMask);

    String getNetMgmtIPMask();

    void setNetMgmtIPBcast(String netMgmtIPBcast);

    String getNetMgmtIPBcast();

    void setNetMgmtCustom1(String netMgmtCustom1);

    String getNetMgmtCustom1();

    boolean isNetMgmtCustom1Defined();

    void setNetMgmtType(int netMgmtType);

    int getNetMgmtType();

    void setNetMgmtUnmbrd(int netMgmtUnmbrd);

    int getNetMgmtUnmbrd();

    void setNetMgmtSpeed(int netMgmtSpeed);

    int getNetMgmtSpeed();

    void setNetMgmtDuplex(int netMgmtDuplex);

    int getNetMgmtDuplex();

    void setNetMgmtMediaRate(int netMgmtMediaRate);

    int getNetMgmtMediaRate();

    void setNetMgmtMTU(int netMgmtMTU);

    int getNetMgmtMTU();

    void setNetMgmtMACAddr(String netMgmtMACAddr);

    String getNetMgmtMACAddr();

    INetMgmtEntry clone();

}
