
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.interfaces.iftable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfEntry
    extends IDeviceEntity
{


    void setIfIndex(int ifIndex);

    int getIfIndex();

    void setIfDescr(String ifDescr);

    String getIfDescr();

    void setIfType(int ifType);

    int getIfType();

    void setIfMtu(int ifMtu);

    int getIfMtu();

    void setIfSpeed(int ifSpeed);

    int getIfSpeed();

    void setIfPhysAddress(String ifPhysAddress);

    String getIfPhysAddress();

    void setIfAdminStatus(int ifAdminStatus);

    int getIfAdminStatus();

    void setIfOperStatus(int ifOperStatus);

    int getIfOperStatus();

    void setIfLastChange(int ifLastChange);

    int getIfLastChange();

    void setIfInOctets(int ifInOctets);

    int getIfInOctets();

    void setIfInUcastPkts(int ifInUcastPkts);

    int getIfInUcastPkts();

    void setIfInNUcastPkts(int ifInNUcastPkts);

    int getIfInNUcastPkts();

    void setIfInDiscards(int ifInDiscards);

    int getIfInDiscards();

    void setIfInErrors(int ifInErrors);

    int getIfInErrors();

    void setIfInUnknownProtos(int ifInUnknownProtos);

    int getIfInUnknownProtos();

    void setIfOutOctets(int ifOutOctets);

    int getIfOutOctets();

    void setIfOutUcastPkts(int ifOutUcastPkts);

    int getIfOutUcastPkts();

    void setIfOutNUcastPkts(int ifOutNUcastPkts);

    int getIfOutNUcastPkts();

    void setIfOutDiscards(int ifOutDiscards);

    int getIfOutDiscards();

    void setIfOutErrors(int ifOutErrors);

    int getIfOutErrors();

    void setIfOutQLen(int ifOutQLen);

    int getIfOutQLen();

    void setIfSpecific(String ifSpecific);

    String getIfSpecific();

    IIfEntry clone();

}
