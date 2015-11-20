
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.administration.snmptraprcvtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISnmpTrapRcvEntry
    extends IDeviceEntity
{


    void setSnmpTrapRcvIdx(String snmpTrapRcvIdx);

    String getSnmpTrapRcvIdx();

    void setSnmpTrapRcvIPAddr(String snmpTrapRcvIPAddr);

    String getSnmpTrapRcvIPAddr();

    void setSnmpTrapRcvPort(int snmpTrapRcvPort);

    int getSnmpTrapRcvPort();

    boolean isSnmpTrapRcvPortDefined();

    void setSnmpTrapRcvNotifType(int snmpTrapRcvNotifType);

    int getSnmpTrapRcvNotifType();

    boolean isSnmpTrapRcvNotifTypeDefined();

    void setSnmpTrapRcvVersion(int snmpTrapRcvVersion);

    int getSnmpTrapRcvVersion();

    void setSnmpTrapRcvCommunity(String snmpTrapRcvCommunity);

    String getSnmpTrapRcvCommunity();

    void setSnmpTrapRcvTTL(String snmpTrapRcvTTL);

    String getSnmpTrapRcvTTL();

    boolean isSnmpTrapRcvTTLDefined();

    void setSnmpTrapRcvRowStatus(int snmpTrapRcvRowStatus);

    int getSnmpTrapRcvRowStatus();

    ISnmpTrapRcvEntry clone();

}
