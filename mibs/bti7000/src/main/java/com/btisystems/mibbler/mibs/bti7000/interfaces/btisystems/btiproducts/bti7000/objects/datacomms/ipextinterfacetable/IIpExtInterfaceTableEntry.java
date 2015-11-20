
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.ipextinterfacetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpExtInterfaceTableEntry
    extends IDeviceEntity
{


    void setPvxL2IntfSubPortNumber(int pvxL2IntfSubPortNumber);

    int getPvxL2IntfSubPortNumber();

    void setIpExtIntfPrimaryState(int ipExtIntfPrimaryState);

    int getIpExtIntfPrimaryState();

    void setIpExtIntfSecondaryState(String ipExtIntfSecondaryState);

    String getIpExtIntfSecondaryState();

    void setIpExtIntfCmdPrimaryState(int ipExtIntfCmdPrimaryState);

    int getIpExtIntfCmdPrimaryState();

    void setIpExtIntfNumberedStatus(int ipExtIntfNumberedStatus);

    int getIpExtIntfNumberedStatus();

    void setIpExtIntfAddressType(int ipExtIntfAddressType);

    int getIpExtIntfAddressType();

    void setIpExtIntfAddress(String ipExtIntfAddress);

    String getIpExtIntfAddress();

    void setIpExtIntfSubnetMask(String ipExtIntfSubnetMask);

    String getIpExtIntfSubnetMask();

    void setIpExtIntfProxyARPStatus(int ipExtIntfProxyARPStatus);

    int getIpExtIntfProxyARPStatus();

    void setIpExtIntfDescription(String ipExtIntfDescription);

    String getIpExtIntfDescription();

    void setIpExtIntfMACAddr(String ipExtIntfMACAddr);

    String getIpExtIntfMACAddr();

    void setIpExtIntfOperStatus(int ipExtIntfOperStatus);

    int getIpExtIntfOperStatus();

    void setIpExtIntfType(int ipExtIntfType);

    int getIpExtIntfType();

    void setIpExtIntfBroadcastAddress(String ipExtIntfBroadcastAddress);

    String getIpExtIntfBroadcastAddress();

    void setIpExtIntfSpeed(int ipExtIntfSpeed);

    int getIpExtIntfSpeed();

    void setIpExtIntfMode(int ipExtIntfMode);

    int getIpExtIntfMode();

    void setIpExtIntfMTUSize(int ipExtIntfMTUSize);

    int getIpExtIntfMTUSize();

    void setIpExtIntfLastChange(int ipExtIntfLastChange);

    int getIpExtIntfLastChange();

    void setIpExtIntfGateway(String ipExtIntfGateway);

    String getIpExtIntfGateway();

    void setIpExtIntfRowStatus(int ipExtIntfRowStatus);

    int getIpExtIntfRowStatus();

    IIpExtInterfaceTableEntry clone();

}
