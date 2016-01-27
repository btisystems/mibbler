
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIp
    extends IDeviceEntity
{


    void setIpForwarding(int ipForwarding);

    int getIpForwarding();

    void setIpDefaultTTL(int ipDefaultTTL);

    int getIpDefaultTTL();

    void setIpInReceives(int ipInReceives);

    int getIpInReceives();

    void setIpInHdrErrors(int ipInHdrErrors);

    int getIpInHdrErrors();

    void setIpInAddrErrors(int ipInAddrErrors);

    int getIpInAddrErrors();

    void setIpForwDatagrams(int ipForwDatagrams);

    int getIpForwDatagrams();

    void setIpInUnknownProtos(int ipInUnknownProtos);

    int getIpInUnknownProtos();

    void setIpInDiscards(int ipInDiscards);

    int getIpInDiscards();

    void setIpInDelivers(int ipInDelivers);

    int getIpInDelivers();

    void setIpOutRequests(int ipOutRequests);

    int getIpOutRequests();

    void setIpOutDiscards(int ipOutDiscards);

    int getIpOutDiscards();

    void setIpOutNoRoutes(int ipOutNoRoutes);

    int getIpOutNoRoutes();

    void setIpReasmTimeout(int ipReasmTimeout);

    int getIpReasmTimeout();

    void setIpReasmReqds(int ipReasmReqds);

    int getIpReasmReqds();

    void setIpReasmOKs(int ipReasmOKs);

    int getIpReasmOKs();

    void setIpReasmFails(int ipReasmFails);

    int getIpReasmFails();

    void setIpFragOKs(int ipFragOKs);

    int getIpFragOKs();

    void setIpFragFails(int ipFragFails);

    int getIpFragFails();

    void setIpFragCreates(int ipFragCreates);

    int getIpFragCreates();

    void setIpRoutingDiscards(int ipRoutingDiscards);

    int getIpRoutingDiscards();

    void setIpv6IpForwarding(int ipv6IpForwarding);

    int getIpv6IpForwarding();

    void setIpv6IpDefaultHopLimit(int ipv6IpDefaultHopLimit);

    int getIpv6IpDefaultHopLimit();

    void setIpv4InterfaceTableLastChange(int ipv4InterfaceTableLastChange);

    int getIpv4InterfaceTableLastChange();

    void setIpv6InterfaceTableLastChange(int ipv6InterfaceTableLastChange);

    int getIpv6InterfaceTableLastChange();

    void setIpAddressSpinLock(int ipAddressSpinLock);

    int getIpAddressSpinLock();

    void setIpv6RouterAdvertSpinLock(int ipv6RouterAdvertSpinLock);

    int getIpv6RouterAdvertSpinLock();

    IIp clone();

}
