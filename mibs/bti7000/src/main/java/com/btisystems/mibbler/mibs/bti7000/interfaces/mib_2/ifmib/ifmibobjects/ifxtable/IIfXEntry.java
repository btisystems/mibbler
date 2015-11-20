
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ifmib.ifmibobjects.ifxtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfXEntry
    extends IDeviceEntity
{


    void setIfName(String ifName);

    String getIfName();

    void setIfInMulticastPkts(int ifInMulticastPkts);

    int getIfInMulticastPkts();

    void setIfInBroadcastPkts(int ifInBroadcastPkts);

    int getIfInBroadcastPkts();

    void setIfOutMulticastPkts(int ifOutMulticastPkts);

    int getIfOutMulticastPkts();

    void setIfOutBroadcastPkts(int ifOutBroadcastPkts);

    int getIfOutBroadcastPkts();

    void setIfHCInOctets(long ifHCInOctets);

    long getIfHCInOctets();

    void setIfHCInUcastPkts(long ifHCInUcastPkts);

    long getIfHCInUcastPkts();

    void setIfHCInMulticastPkts(long ifHCInMulticastPkts);

    long getIfHCInMulticastPkts();

    void setIfHCInBroadcastPkts(long ifHCInBroadcastPkts);

    long getIfHCInBroadcastPkts();

    void setIfHCOutOctets(long ifHCOutOctets);

    long getIfHCOutOctets();

    void setIfHCOutUcastPkts(long ifHCOutUcastPkts);

    long getIfHCOutUcastPkts();

    void setIfHCOutMulticastPkts(long ifHCOutMulticastPkts);

    long getIfHCOutMulticastPkts();

    void setIfHCOutBroadcastPkts(long ifHCOutBroadcastPkts);

    long getIfHCOutBroadcastPkts();

    void setIfLinkUpDownTrapEnable(int ifLinkUpDownTrapEnable);

    int getIfLinkUpDownTrapEnable();

    void setIfHighSpeed(int ifHighSpeed);

    int getIfHighSpeed();

    void setIfPromiscuousMode(int ifPromiscuousMode);

    int getIfPromiscuousMode();

    void setIfConnectorPresent(int ifConnectorPresent);

    int getIfConnectorPresent();

    void setIfAlias(String ifAlias);

    String getIfAlias();

    void setIfCounterDiscontinuityTime(int ifCounterDiscontinuityTime);

    int getIfCounterDiscontinuityTime();

    IIfXEntry clone();

}
