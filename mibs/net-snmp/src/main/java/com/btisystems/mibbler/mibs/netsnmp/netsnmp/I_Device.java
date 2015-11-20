
package com.btisystems.mibbler.mibs.netsnmp.netsnmp;

import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.Egp;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.Icmp;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.Interfaces;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.Ip;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.Snmp;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.System;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.Tcp;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.Udp;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.AgentxConnection;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.AgentxGeneral;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.AgentxRegistration;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.AgentxSession;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxconnection.AgentxConnectionTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxregistration.AgentxRegistrationTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxsession.AgentxSessionTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.application.ApplTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.application.AssocTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.at.AtTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibnotificationprefix.DismanEventMIBNotificationObjects;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.MteEvent;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.MteResource;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.MteTrigger;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.MteEventNotificationTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.MteEventSetTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.MteEventTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteobjects.MteObjectsTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.MteTriggerBooleanTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.MteTriggerDeltaTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.MteTriggerExistenceTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.MteTriggerTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.MteTriggerThresholdTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.egp.EgpNeighTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.HrSWInstalled;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.HrSWRun;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.HrStorage;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.HrSystem;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrDeviceTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrDiskStorageTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrFSTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrNetworkTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrPartitionTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrPrinterTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrProcessorTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrstorage.HrStorageTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswinstalled.HrSWInstalledTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswrun.HrSWRunTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswrunperf.HrSWRunPerfTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.icmp.IcmpMsgStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.icmp.IcmpStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifinvertedstackmib.ifinvmibobjects.IfInvStackTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.IfMIBObjects;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.ifmibobjects.IfRcvAddressTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.ifmibobjects.IfStackTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.ifmibobjects.IfTestTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.ifmibobjects.IfXTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.interfaces.IfTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpAddrTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpAddressPrefixTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpAddressTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpDefaultRouterTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpForward;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpNetToMediaTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpNetToPhysicalTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpRouteTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpTrafficStats;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.Ipv4InterfaceTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.Ipv6InterfaceTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.Ipv6RouterAdvertTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.Ipv6ScopeZoneIndexTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipforward.InetCidrRouteTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipforward.IpCidrRouteTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipforward.IpForwardTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.iptrafficstats.IpIfStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.iptrafficstats.IpSystemStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6icmpmib.ipv6icmpmibobjects.Ipv6IfIcmpTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.Ipv6MIBObjects;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.Ipv6AddrPrefixTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.Ipv6AddrTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.Ipv6IfStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.Ipv6IfTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.Ipv6NetToMediaTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.Ipv6RouteTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.MtaGroupAssociationTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.MtaGroupErrorTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.MtaGroupTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.MtaTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.NlmConfig;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.NlmStats;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmconfig.NlmConfigLogTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.NlmLogTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.NlmLogVariableTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmstats.NlmStatsLogTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.alarm.AlarmTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.capture.BufferControlTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.capture.CaptureBufferTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.event.EventTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.event.LogTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.filter.ChannelTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.filter.FilterTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.history.EtherHistoryTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.history.HistoryControlTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosts.HostControlTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosts.HostTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosts.HostTimeTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosttopn.HostTopNControlTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosttopn.HostTopNTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.matrix.MatrixControlTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.matrix.MatrixDSTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.matrix.MatrixSDTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.statistics.EtherStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.schedmib.SchedObjects;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.schedmib.schedobjects.SchedTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.SmExtsnTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.SmLangTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smrunobjects.SmLaunchTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smrunobjects.SmRunTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smscriptobjects.SmCodeTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smscriptobjects.SmScriptTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpAssocLocalAddrTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpAssocRemAddrTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpAssocTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpLookupLocalPortTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpLookupRemHostNameTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpLookupRemIPAddrTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpLookupRemPortTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpLookupRemPrimIPAddrTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpParams;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpStats;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.system.SysORTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.Ipv6TcpConnTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.TcpConnTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.TcpConnectionTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.tcp.TcpListenerTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.Dot3CollTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.Dot3ControlTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.Dot3HCStatsTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.Dot3PauseTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.Dot3StatsTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.udp.Ipv6UdpTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.udp.UdpEndpointTable;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.udp.UdpTable;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class I_Device
    extends AbstractRootEntity
{

    private System system;
    private SysORTable sysORTable;
    private Dot3PauseTable dot3PauseTable;
    private Dot3HCStatsTable dot3HCStatsTable;
    private Dot3StatsTable dot3StatsTable;
    private Dot3CollTable dot3CollTable;
    private Dot3ControlTable dot3ControlTable;
    private SctpStats sctpStats;
    private SctpLookupRemIPAddrTable sctpLookupRemIPAddrTable;
    private SctpParams sctpParams;
    private SctpAssocTable sctpAssocTable;
    private SctpAssocLocalAddrTable sctpAssocLocalAddrTable;
    private SctpAssocRemAddrTable sctpAssocRemAddrTable;
    private SctpLookupLocalPortTable sctpLookupLocalPortTable;
    private SctpLookupRemPortTable sctpLookupRemPortTable;
    private SctpLookupRemHostNameTable sctpLookupRemHostNameTable;
    private SctpLookupRemPrimIPAddrTable sctpLookupRemPrimIPAddrTable;
    private Snmp snmp;
    private EtherStatsTable etherStatsTable;
    private HistoryControlTable historyControlTable;
    private EtherHistoryTable etherHistoryTable;
    private AlarmTable alarmTable;
    private HostControlTable hostControlTable;
    private HostTable hostTable;
    private HostTimeTable hostTimeTable;
    private HostTopNControlTable hostTopNControlTable;
    private HostTopNTable hostTopNTable;
    private MatrixControlTable matrixControlTable;
    private MatrixSDTable matrixSDTable;
    private MatrixDSTable matrixDSTable;
    private FilterTable filterTable;
    private ChannelTable channelTable;
    private BufferControlTable bufferControlTable;
    private CaptureBufferTable captureBufferTable;
    private EventTable eventTable;
    private LogTable logTable;
    private Interfaces interfaces;
    private IfTable ifTable;
    private HrSystem hrSystem;
    private HrStorage hrStorage;
    private HrStorageTable hrStorageTable;
    private HrDeviceTable hrDeviceTable;
    private HrProcessorTable hrProcessorTable;
    private HrNetworkTable hrNetworkTable;
    private HrPrinterTable hrPrinterTable;
    private HrDiskStorageTable hrDiskStorageTable;
    private HrPartitionTable hrPartitionTable;
    private HrFSTable hrFSTable;
    private HrSWRun hrSWRun;
    private HrSWRunTable hrSWRunTable;
    private HrSWRunPerfTable hrSWRunPerfTable;
    private HrSWInstalled hrSWInstalled;
    private HrSWInstalledTable hrSWInstalledTable;
    private ApplTable applTable;
    private AssocTable assocTable;
    private MtaTable mtaTable;
    private MtaGroupTable mtaGroupTable;
    private MtaGroupAssociationTable mtaGroupAssociationTable;
    private MtaGroupErrorTable mtaGroupErrorTable;
    private AtTable atTable;
    private IfMIBObjects ifMIBObjects;
    private IfXTable ifXTable;
    private IfStackTable ifStackTable;
    private IfTestTable ifTestTable;
    private IfRcvAddressTable ifRcvAddressTable;
    private Ip ip;
    private IpAddrTable ipAddrTable;
    private IpRouteTable ipRouteTable;
    private IpNetToMediaTable ipNetToMediaTable;
    private IpForward ipForward;
    private IpForwardTable ipForwardTable;
    private IpCidrRouteTable ipCidrRouteTable;
    private InetCidrRouteTable inetCidrRouteTable;
    private Ipv4InterfaceTable ipv4InterfaceTable;
    private Ipv6InterfaceTable ipv6InterfaceTable;
    private IpTrafficStats ipTrafficStats;
    private IpSystemStatsTable ipSystemStatsTable;
    private IpIfStatsTable ipIfStatsTable;
    private IpAddressPrefixTable ipAddressPrefixTable;
    private IpAddressTable ipAddressTable;
    private IpNetToPhysicalTable ipNetToPhysicalTable;
    private Ipv6ScopeZoneIndexTable ipv6ScopeZoneIndexTable;
    private IpDefaultRouterTable ipDefaultRouterTable;
    private Ipv6RouterAdvertTable ipv6RouterAdvertTable;
    private Icmp icmp;
    private IcmpStatsTable icmpStatsTable;
    private IcmpMsgStatsTable icmpMsgStatsTable;
    private Ipv6MIBObjects ipv6MIBObjects;
    private Ipv6RouteTable ipv6RouteTable;
    private Ipv6NetToMediaTable ipv6NetToMediaTable;
    private Ipv6IfTable ipv6IfTable;
    private Ipv6IfStatsTable ipv6IfStatsTable;
    private Ipv6AddrPrefixTable ipv6AddrPrefixTable;
    private Ipv6AddrTable ipv6AddrTable;
    private Ipv6IfIcmpTable ipv6IfIcmpTable;
    private Tcp tcp;
    private TcpConnTable tcpConnTable;
    private Ipv6TcpConnTable ipv6TcpConnTable;
    private TcpConnectionTable tcpConnectionTable;
    private TcpListenerTable tcpListenerTable;
    private SchedObjects schedObjects;
    private SchedTable schedTable;
    private SmLangTable smLangTable;
    private SmExtsnTable smExtsnTable;
    private SmScriptTable smScriptTable;
    private SmCodeTable smCodeTable;
    private SmLaunchTable smLaunchTable;
    private SmRunTable smRunTable;
    private Udp udp;
    private UdpTable udpTable;
    private Ipv6UdpTable ipv6UdpTable;
    private UdpEndpointTable udpEndpointTable;
    private AgentxGeneral agentxGeneral;
    private AgentxConnection agentxConnection;
    private AgentxConnectionTable agentxConnectionTable;
    private AgentxSession agentxSession;
    private AgentxSessionTable agentxSessionTable;
    private AgentxRegistration agentxRegistration;
    private AgentxRegistrationTable agentxRegistrationTable;
    private IfInvStackTable ifInvStackTable;
    private Egp egp;
    private EgpNeighTable egpNeighTable;
    private MteResource mteResource;
    private MteTrigger mteTrigger;
    private MteTriggerTable mteTriggerTable;
    private MteTriggerDeltaTable mteTriggerDeltaTable;
    private MteTriggerExistenceTable mteTriggerExistenceTable;
    private MteTriggerBooleanTable mteTriggerBooleanTable;
    private MteTriggerThresholdTable mteTriggerThresholdTable;
    private MteObjectsTable mteObjectsTable;
    private MteEvent mteEvent;
    private MteEventTable mteEventTable;
    private MteEventNotificationTable mteEventNotificationTable;
    private MteEventSetTable mteEventSetTable;
    private DismanEventMIBNotificationObjects dismanEventMIBNotificationObjects;
    private NlmConfig nlmConfig;
    private NlmConfigLogTable nlmConfigLogTable;
    private NlmStats nlmStats;
    private NlmStatsLogTable nlmStatsLogTable;
    private NlmLogTable nlmLogTable;
    private NlmLogVariableTable nlmLogVariableTable;

    public System getSystem() {
        return this.system;
    }

    public void setSystem(System system) {
        System oldValue = getSystem();
        this.system = system;
        replaceChild(oldValue, system);
    }

    public SysORTable getSysORTable() {
        return this.sysORTable;
    }

    public void setSysORTable(SysORTable sysORTable) {
        SysORTable oldValue = getSysORTable();
        this.sysORTable = sysORTable;
        replaceChild(oldValue, sysORTable);
    }

    public Dot3PauseTable getDot3PauseTable() {
        return this.dot3PauseTable;
    }

    public void setDot3PauseTable(Dot3PauseTable dot3PauseTable) {
        Dot3PauseTable oldValue = getDot3PauseTable();
        this.dot3PauseTable = dot3PauseTable;
        replaceChild(oldValue, dot3PauseTable);
    }

    public Dot3HCStatsTable getDot3HCStatsTable() {
        return this.dot3HCStatsTable;
    }

    public void setDot3HCStatsTable(Dot3HCStatsTable dot3HCStatsTable) {
        Dot3HCStatsTable oldValue = getDot3HCStatsTable();
        this.dot3HCStatsTable = dot3HCStatsTable;
        replaceChild(oldValue, dot3HCStatsTable);
    }

    public Dot3StatsTable getDot3StatsTable() {
        return this.dot3StatsTable;
    }

    public void setDot3StatsTable(Dot3StatsTable dot3StatsTable) {
        Dot3StatsTable oldValue = getDot3StatsTable();
        this.dot3StatsTable = dot3StatsTable;
        replaceChild(oldValue, dot3StatsTable);
    }

    public Dot3CollTable getDot3CollTable() {
        return this.dot3CollTable;
    }

    public void setDot3CollTable(Dot3CollTable dot3CollTable) {
        Dot3CollTable oldValue = getDot3CollTable();
        this.dot3CollTable = dot3CollTable;
        replaceChild(oldValue, dot3CollTable);
    }

    public Dot3ControlTable getDot3ControlTable() {
        return this.dot3ControlTable;
    }

    public void setDot3ControlTable(Dot3ControlTable dot3ControlTable) {
        Dot3ControlTable oldValue = getDot3ControlTable();
        this.dot3ControlTable = dot3ControlTable;
        replaceChild(oldValue, dot3ControlTable);
    }

    public SctpStats getSctpStats() {
        return this.sctpStats;
    }

    public void setSctpStats(SctpStats sctpStats) {
        SctpStats oldValue = getSctpStats();
        this.sctpStats = sctpStats;
        replaceChild(oldValue, sctpStats);
    }

    public SctpLookupRemIPAddrTable getSctpLookupRemIPAddrTable() {
        return this.sctpLookupRemIPAddrTable;
    }

    public void setSctpLookupRemIPAddrTable(SctpLookupRemIPAddrTable sctpLookupRemIPAddrTable) {
        SctpLookupRemIPAddrTable oldValue = getSctpLookupRemIPAddrTable();
        this.sctpLookupRemIPAddrTable = sctpLookupRemIPAddrTable;
        replaceChild(oldValue, sctpLookupRemIPAddrTable);
    }

    public SctpParams getSctpParams() {
        return this.sctpParams;
    }

    public void setSctpParams(SctpParams sctpParams) {
        SctpParams oldValue = getSctpParams();
        this.sctpParams = sctpParams;
        replaceChild(oldValue, sctpParams);
    }

    public SctpAssocTable getSctpAssocTable() {
        return this.sctpAssocTable;
    }

    public void setSctpAssocTable(SctpAssocTable sctpAssocTable) {
        SctpAssocTable oldValue = getSctpAssocTable();
        this.sctpAssocTable = sctpAssocTable;
        replaceChild(oldValue, sctpAssocTable);
    }

    public SctpAssocLocalAddrTable getSctpAssocLocalAddrTable() {
        return this.sctpAssocLocalAddrTable;
    }

    public void setSctpAssocLocalAddrTable(SctpAssocLocalAddrTable sctpAssocLocalAddrTable) {
        SctpAssocLocalAddrTable oldValue = getSctpAssocLocalAddrTable();
        this.sctpAssocLocalAddrTable = sctpAssocLocalAddrTable;
        replaceChild(oldValue, sctpAssocLocalAddrTable);
    }

    public SctpAssocRemAddrTable getSctpAssocRemAddrTable() {
        return this.sctpAssocRemAddrTable;
    }

    public void setSctpAssocRemAddrTable(SctpAssocRemAddrTable sctpAssocRemAddrTable) {
        SctpAssocRemAddrTable oldValue = getSctpAssocRemAddrTable();
        this.sctpAssocRemAddrTable = sctpAssocRemAddrTable;
        replaceChild(oldValue, sctpAssocRemAddrTable);
    }

    public SctpLookupLocalPortTable getSctpLookupLocalPortTable() {
        return this.sctpLookupLocalPortTable;
    }

    public void setSctpLookupLocalPortTable(SctpLookupLocalPortTable sctpLookupLocalPortTable) {
        SctpLookupLocalPortTable oldValue = getSctpLookupLocalPortTable();
        this.sctpLookupLocalPortTable = sctpLookupLocalPortTable;
        replaceChild(oldValue, sctpLookupLocalPortTable);
    }

    public SctpLookupRemPortTable getSctpLookupRemPortTable() {
        return this.sctpLookupRemPortTable;
    }

    public void setSctpLookupRemPortTable(SctpLookupRemPortTable sctpLookupRemPortTable) {
        SctpLookupRemPortTable oldValue = getSctpLookupRemPortTable();
        this.sctpLookupRemPortTable = sctpLookupRemPortTable;
        replaceChild(oldValue, sctpLookupRemPortTable);
    }

    public SctpLookupRemHostNameTable getSctpLookupRemHostNameTable() {
        return this.sctpLookupRemHostNameTable;
    }

    public void setSctpLookupRemHostNameTable(SctpLookupRemHostNameTable sctpLookupRemHostNameTable) {
        SctpLookupRemHostNameTable oldValue = getSctpLookupRemHostNameTable();
        this.sctpLookupRemHostNameTable = sctpLookupRemHostNameTable;
        replaceChild(oldValue, sctpLookupRemHostNameTable);
    }

    public SctpLookupRemPrimIPAddrTable getSctpLookupRemPrimIPAddrTable() {
        return this.sctpLookupRemPrimIPAddrTable;
    }

    public void setSctpLookupRemPrimIPAddrTable(SctpLookupRemPrimIPAddrTable sctpLookupRemPrimIPAddrTable) {
        SctpLookupRemPrimIPAddrTable oldValue = getSctpLookupRemPrimIPAddrTable();
        this.sctpLookupRemPrimIPAddrTable = sctpLookupRemPrimIPAddrTable;
        replaceChild(oldValue, sctpLookupRemPrimIPAddrTable);
    }

    public Snmp getSnmp() {
        return this.snmp;
    }

    public void setSnmp(Snmp snmp) {
        Snmp oldValue = getSnmp();
        this.snmp = snmp;
        replaceChild(oldValue, snmp);
    }

    public EtherStatsTable getEtherStatsTable() {
        return this.etherStatsTable;
    }

    public void setEtherStatsTable(EtherStatsTable etherStatsTable) {
        EtherStatsTable oldValue = getEtherStatsTable();
        this.etherStatsTable = etherStatsTable;
        replaceChild(oldValue, etherStatsTable);
    }

    public HistoryControlTable getHistoryControlTable() {
        return this.historyControlTable;
    }

    public void setHistoryControlTable(HistoryControlTable historyControlTable) {
        HistoryControlTable oldValue = getHistoryControlTable();
        this.historyControlTable = historyControlTable;
        replaceChild(oldValue, historyControlTable);
    }

    public EtherHistoryTable getEtherHistoryTable() {
        return this.etherHistoryTable;
    }

    public void setEtherHistoryTable(EtherHistoryTable etherHistoryTable) {
        EtherHistoryTable oldValue = getEtherHistoryTable();
        this.etherHistoryTable = etherHistoryTable;
        replaceChild(oldValue, etherHistoryTable);
    }

    public AlarmTable getAlarmTable() {
        return this.alarmTable;
    }

    public void setAlarmTable(AlarmTable alarmTable) {
        AlarmTable oldValue = getAlarmTable();
        this.alarmTable = alarmTable;
        replaceChild(oldValue, alarmTable);
    }

    public HostControlTable getHostControlTable() {
        return this.hostControlTable;
    }

    public void setHostControlTable(HostControlTable hostControlTable) {
        HostControlTable oldValue = getHostControlTable();
        this.hostControlTable = hostControlTable;
        replaceChild(oldValue, hostControlTable);
    }

    public HostTable getHostTable() {
        return this.hostTable;
    }

    public void setHostTable(HostTable hostTable) {
        HostTable oldValue = getHostTable();
        this.hostTable = hostTable;
        replaceChild(oldValue, hostTable);
    }

    public HostTimeTable getHostTimeTable() {
        return this.hostTimeTable;
    }

    public void setHostTimeTable(HostTimeTable hostTimeTable) {
        HostTimeTable oldValue = getHostTimeTable();
        this.hostTimeTable = hostTimeTable;
        replaceChild(oldValue, hostTimeTable);
    }

    public HostTopNControlTable getHostTopNControlTable() {
        return this.hostTopNControlTable;
    }

    public void setHostTopNControlTable(HostTopNControlTable hostTopNControlTable) {
        HostTopNControlTable oldValue = getHostTopNControlTable();
        this.hostTopNControlTable = hostTopNControlTable;
        replaceChild(oldValue, hostTopNControlTable);
    }

    public HostTopNTable getHostTopNTable() {
        return this.hostTopNTable;
    }

    public void setHostTopNTable(HostTopNTable hostTopNTable) {
        HostTopNTable oldValue = getHostTopNTable();
        this.hostTopNTable = hostTopNTable;
        replaceChild(oldValue, hostTopNTable);
    }

    public MatrixControlTable getMatrixControlTable() {
        return this.matrixControlTable;
    }

    public void setMatrixControlTable(MatrixControlTable matrixControlTable) {
        MatrixControlTable oldValue = getMatrixControlTable();
        this.matrixControlTable = matrixControlTable;
        replaceChild(oldValue, matrixControlTable);
    }

    public MatrixSDTable getMatrixSDTable() {
        return this.matrixSDTable;
    }

    public void setMatrixSDTable(MatrixSDTable matrixSDTable) {
        MatrixSDTable oldValue = getMatrixSDTable();
        this.matrixSDTable = matrixSDTable;
        replaceChild(oldValue, matrixSDTable);
    }

    public MatrixDSTable getMatrixDSTable() {
        return this.matrixDSTable;
    }

    public void setMatrixDSTable(MatrixDSTable matrixDSTable) {
        MatrixDSTable oldValue = getMatrixDSTable();
        this.matrixDSTable = matrixDSTable;
        replaceChild(oldValue, matrixDSTable);
    }

    public FilterTable getFilterTable() {
        return this.filterTable;
    }

    public void setFilterTable(FilterTable filterTable) {
        FilterTable oldValue = getFilterTable();
        this.filterTable = filterTable;
        replaceChild(oldValue, filterTable);
    }

    public ChannelTable getChannelTable() {
        return this.channelTable;
    }

    public void setChannelTable(ChannelTable channelTable) {
        ChannelTable oldValue = getChannelTable();
        this.channelTable = channelTable;
        replaceChild(oldValue, channelTable);
    }

    public BufferControlTable getBufferControlTable() {
        return this.bufferControlTable;
    }

    public void setBufferControlTable(BufferControlTable bufferControlTable) {
        BufferControlTable oldValue = getBufferControlTable();
        this.bufferControlTable = bufferControlTable;
        replaceChild(oldValue, bufferControlTable);
    }

    public CaptureBufferTable getCaptureBufferTable() {
        return this.captureBufferTable;
    }

    public void setCaptureBufferTable(CaptureBufferTable captureBufferTable) {
        CaptureBufferTable oldValue = getCaptureBufferTable();
        this.captureBufferTable = captureBufferTable;
        replaceChild(oldValue, captureBufferTable);
    }

    public EventTable getEventTable() {
        return this.eventTable;
    }

    public void setEventTable(EventTable eventTable) {
        EventTable oldValue = getEventTable();
        this.eventTable = eventTable;
        replaceChild(oldValue, eventTable);
    }

    public LogTable getLogTable() {
        return this.logTable;
    }

    public void setLogTable(LogTable logTable) {
        LogTable oldValue = getLogTable();
        this.logTable = logTable;
        replaceChild(oldValue, logTable);
    }

    public Interfaces getInterfaces() {
        return this.interfaces;
    }

    public void setInterfaces(Interfaces interfaces) {
        Interfaces oldValue = getInterfaces();
        this.interfaces = interfaces;
        replaceChild(oldValue, interfaces);
    }

    public IfTable getIfTable() {
        return this.ifTable;
    }

    public void setIfTable(IfTable ifTable) {
        IfTable oldValue = getIfTable();
        this.ifTable = ifTable;
        replaceChild(oldValue, ifTable);
    }

    public HrSystem getHrSystem() {
        return this.hrSystem;
    }

    public void setHrSystem(HrSystem hrSystem) {
        HrSystem oldValue = getHrSystem();
        this.hrSystem = hrSystem;
        replaceChild(oldValue, hrSystem);
    }

    public HrStorage getHrStorage() {
        return this.hrStorage;
    }

    public void setHrStorage(HrStorage hrStorage) {
        HrStorage oldValue = getHrStorage();
        this.hrStorage = hrStorage;
        replaceChild(oldValue, hrStorage);
    }

    public HrStorageTable getHrStorageTable() {
        return this.hrStorageTable;
    }

    public void setHrStorageTable(HrStorageTable hrStorageTable) {
        HrStorageTable oldValue = getHrStorageTable();
        this.hrStorageTable = hrStorageTable;
        replaceChild(oldValue, hrStorageTable);
    }

    public HrDeviceTable getHrDeviceTable() {
        return this.hrDeviceTable;
    }

    public void setHrDeviceTable(HrDeviceTable hrDeviceTable) {
        HrDeviceTable oldValue = getHrDeviceTable();
        this.hrDeviceTable = hrDeviceTable;
        replaceChild(oldValue, hrDeviceTable);
    }

    public HrProcessorTable getHrProcessorTable() {
        return this.hrProcessorTable;
    }

    public void setHrProcessorTable(HrProcessorTable hrProcessorTable) {
        HrProcessorTable oldValue = getHrProcessorTable();
        this.hrProcessorTable = hrProcessorTable;
        replaceChild(oldValue, hrProcessorTable);
    }

    public HrNetworkTable getHrNetworkTable() {
        return this.hrNetworkTable;
    }

    public void setHrNetworkTable(HrNetworkTable hrNetworkTable) {
        HrNetworkTable oldValue = getHrNetworkTable();
        this.hrNetworkTable = hrNetworkTable;
        replaceChild(oldValue, hrNetworkTable);
    }

    public HrPrinterTable getHrPrinterTable() {
        return this.hrPrinterTable;
    }

    public void setHrPrinterTable(HrPrinterTable hrPrinterTable) {
        HrPrinterTable oldValue = getHrPrinterTable();
        this.hrPrinterTable = hrPrinterTable;
        replaceChild(oldValue, hrPrinterTable);
    }

    public HrDiskStorageTable getHrDiskStorageTable() {
        return this.hrDiskStorageTable;
    }

    public void setHrDiskStorageTable(HrDiskStorageTable hrDiskStorageTable) {
        HrDiskStorageTable oldValue = getHrDiskStorageTable();
        this.hrDiskStorageTable = hrDiskStorageTable;
        replaceChild(oldValue, hrDiskStorageTable);
    }

    public HrPartitionTable getHrPartitionTable() {
        return this.hrPartitionTable;
    }

    public void setHrPartitionTable(HrPartitionTable hrPartitionTable) {
        HrPartitionTable oldValue = getHrPartitionTable();
        this.hrPartitionTable = hrPartitionTable;
        replaceChild(oldValue, hrPartitionTable);
    }

    public HrFSTable getHrFSTable() {
        return this.hrFSTable;
    }

    public void setHrFSTable(HrFSTable hrFSTable) {
        HrFSTable oldValue = getHrFSTable();
        this.hrFSTable = hrFSTable;
        replaceChild(oldValue, hrFSTable);
    }

    public HrSWRun getHrSWRun() {
        return this.hrSWRun;
    }

    public void setHrSWRun(HrSWRun hrSWRun) {
        HrSWRun oldValue = getHrSWRun();
        this.hrSWRun = hrSWRun;
        replaceChild(oldValue, hrSWRun);
    }

    public HrSWRunTable getHrSWRunTable() {
        return this.hrSWRunTable;
    }

    public void setHrSWRunTable(HrSWRunTable hrSWRunTable) {
        HrSWRunTable oldValue = getHrSWRunTable();
        this.hrSWRunTable = hrSWRunTable;
        replaceChild(oldValue, hrSWRunTable);
    }

    public HrSWRunPerfTable getHrSWRunPerfTable() {
        return this.hrSWRunPerfTable;
    }

    public void setHrSWRunPerfTable(HrSWRunPerfTable hrSWRunPerfTable) {
        HrSWRunPerfTable oldValue = getHrSWRunPerfTable();
        this.hrSWRunPerfTable = hrSWRunPerfTable;
        replaceChild(oldValue, hrSWRunPerfTable);
    }

    public HrSWInstalled getHrSWInstalled() {
        return this.hrSWInstalled;
    }

    public void setHrSWInstalled(HrSWInstalled hrSWInstalled) {
        HrSWInstalled oldValue = getHrSWInstalled();
        this.hrSWInstalled = hrSWInstalled;
        replaceChild(oldValue, hrSWInstalled);
    }

    public HrSWInstalledTable getHrSWInstalledTable() {
        return this.hrSWInstalledTable;
    }

    public void setHrSWInstalledTable(HrSWInstalledTable hrSWInstalledTable) {
        HrSWInstalledTable oldValue = getHrSWInstalledTable();
        this.hrSWInstalledTable = hrSWInstalledTable;
        replaceChild(oldValue, hrSWInstalledTable);
    }

    public ApplTable getApplTable() {
        return this.applTable;
    }

    public void setApplTable(ApplTable applTable) {
        ApplTable oldValue = getApplTable();
        this.applTable = applTable;
        replaceChild(oldValue, applTable);
    }

    public AssocTable getAssocTable() {
        return this.assocTable;
    }

    public void setAssocTable(AssocTable assocTable) {
        AssocTable oldValue = getAssocTable();
        this.assocTable = assocTable;
        replaceChild(oldValue, assocTable);
    }

    public MtaTable getMtaTable() {
        return this.mtaTable;
    }

    public void setMtaTable(MtaTable mtaTable) {
        MtaTable oldValue = getMtaTable();
        this.mtaTable = mtaTable;
        replaceChild(oldValue, mtaTable);
    }

    public MtaGroupTable getMtaGroupTable() {
        return this.mtaGroupTable;
    }

    public void setMtaGroupTable(MtaGroupTable mtaGroupTable) {
        MtaGroupTable oldValue = getMtaGroupTable();
        this.mtaGroupTable = mtaGroupTable;
        replaceChild(oldValue, mtaGroupTable);
    }

    public MtaGroupAssociationTable getMtaGroupAssociationTable() {
        return this.mtaGroupAssociationTable;
    }

    public void setMtaGroupAssociationTable(MtaGroupAssociationTable mtaGroupAssociationTable) {
        MtaGroupAssociationTable oldValue = getMtaGroupAssociationTable();
        this.mtaGroupAssociationTable = mtaGroupAssociationTable;
        replaceChild(oldValue, mtaGroupAssociationTable);
    }

    public MtaGroupErrorTable getMtaGroupErrorTable() {
        return this.mtaGroupErrorTable;
    }

    public void setMtaGroupErrorTable(MtaGroupErrorTable mtaGroupErrorTable) {
        MtaGroupErrorTable oldValue = getMtaGroupErrorTable();
        this.mtaGroupErrorTable = mtaGroupErrorTable;
        replaceChild(oldValue, mtaGroupErrorTable);
    }

    public AtTable getAtTable() {
        return this.atTable;
    }

    public void setAtTable(AtTable atTable) {
        AtTable oldValue = getAtTable();
        this.atTable = atTable;
        replaceChild(oldValue, atTable);
    }

    public IfMIBObjects getIfMIBObjects() {
        return this.ifMIBObjects;
    }

    public void setIfMIBObjects(IfMIBObjects ifMIBObjects) {
        IfMIBObjects oldValue = getIfMIBObjects();
        this.ifMIBObjects = ifMIBObjects;
        replaceChild(oldValue, ifMIBObjects);
    }

    public IfXTable getIfXTable() {
        return this.ifXTable;
    }

    public void setIfXTable(IfXTable ifXTable) {
        IfXTable oldValue = getIfXTable();
        this.ifXTable = ifXTable;
        replaceChild(oldValue, ifXTable);
    }

    public IfStackTable getIfStackTable() {
        return this.ifStackTable;
    }

    public void setIfStackTable(IfStackTable ifStackTable) {
        IfStackTable oldValue = getIfStackTable();
        this.ifStackTable = ifStackTable;
        replaceChild(oldValue, ifStackTable);
    }

    public IfTestTable getIfTestTable() {
        return this.ifTestTable;
    }

    public void setIfTestTable(IfTestTable ifTestTable) {
        IfTestTable oldValue = getIfTestTable();
        this.ifTestTable = ifTestTable;
        replaceChild(oldValue, ifTestTable);
    }

    public IfRcvAddressTable getIfRcvAddressTable() {
        return this.ifRcvAddressTable;
    }

    public void setIfRcvAddressTable(IfRcvAddressTable ifRcvAddressTable) {
        IfRcvAddressTable oldValue = getIfRcvAddressTable();
        this.ifRcvAddressTable = ifRcvAddressTable;
        replaceChild(oldValue, ifRcvAddressTable);
    }

    public Ip getIp() {
        return this.ip;
    }

    public void setIp(Ip ip) {
        Ip oldValue = getIp();
        this.ip = ip;
        replaceChild(oldValue, ip);
    }

    public IpAddrTable getIpAddrTable() {
        return this.ipAddrTable;
    }

    public void setIpAddrTable(IpAddrTable ipAddrTable) {
        IpAddrTable oldValue = getIpAddrTable();
        this.ipAddrTable = ipAddrTable;
        replaceChild(oldValue, ipAddrTable);
    }

    public IpRouteTable getIpRouteTable() {
        return this.ipRouteTable;
    }

    public void setIpRouteTable(IpRouteTable ipRouteTable) {
        IpRouteTable oldValue = getIpRouteTable();
        this.ipRouteTable = ipRouteTable;
        replaceChild(oldValue, ipRouteTable);
    }

    public IpNetToMediaTable getIpNetToMediaTable() {
        return this.ipNetToMediaTable;
    }

    public void setIpNetToMediaTable(IpNetToMediaTable ipNetToMediaTable) {
        IpNetToMediaTable oldValue = getIpNetToMediaTable();
        this.ipNetToMediaTable = ipNetToMediaTable;
        replaceChild(oldValue, ipNetToMediaTable);
    }

    public IpForward getIpForward() {
        return this.ipForward;
    }

    public void setIpForward(IpForward ipForward) {
        IpForward oldValue = getIpForward();
        this.ipForward = ipForward;
        replaceChild(oldValue, ipForward);
    }

    public IpForwardTable getIpForwardTable() {
        return this.ipForwardTable;
    }

    public void setIpForwardTable(IpForwardTable ipForwardTable) {
        IpForwardTable oldValue = getIpForwardTable();
        this.ipForwardTable = ipForwardTable;
        replaceChild(oldValue, ipForwardTable);
    }

    public IpCidrRouteTable getIpCidrRouteTable() {
        return this.ipCidrRouteTable;
    }

    public void setIpCidrRouteTable(IpCidrRouteTable ipCidrRouteTable) {
        IpCidrRouteTable oldValue = getIpCidrRouteTable();
        this.ipCidrRouteTable = ipCidrRouteTable;
        replaceChild(oldValue, ipCidrRouteTable);
    }

    public InetCidrRouteTable getInetCidrRouteTable() {
        return this.inetCidrRouteTable;
    }

    public void setInetCidrRouteTable(InetCidrRouteTable inetCidrRouteTable) {
        InetCidrRouteTable oldValue = getInetCidrRouteTable();
        this.inetCidrRouteTable = inetCidrRouteTable;
        replaceChild(oldValue, inetCidrRouteTable);
    }

    public Ipv4InterfaceTable getIpv4InterfaceTable() {
        return this.ipv4InterfaceTable;
    }

    public void setIpv4InterfaceTable(Ipv4InterfaceTable ipv4InterfaceTable) {
        Ipv4InterfaceTable oldValue = getIpv4InterfaceTable();
        this.ipv4InterfaceTable = ipv4InterfaceTable;
        replaceChild(oldValue, ipv4InterfaceTable);
    }

    public Ipv6InterfaceTable getIpv6InterfaceTable() {
        return this.ipv6InterfaceTable;
    }

    public void setIpv6InterfaceTable(Ipv6InterfaceTable ipv6InterfaceTable) {
        Ipv6InterfaceTable oldValue = getIpv6InterfaceTable();
        this.ipv6InterfaceTable = ipv6InterfaceTable;
        replaceChild(oldValue, ipv6InterfaceTable);
    }

    public IpTrafficStats getIpTrafficStats() {
        return this.ipTrafficStats;
    }

    public void setIpTrafficStats(IpTrafficStats ipTrafficStats) {
        IpTrafficStats oldValue = getIpTrafficStats();
        this.ipTrafficStats = ipTrafficStats;
        replaceChild(oldValue, ipTrafficStats);
    }

    public IpSystemStatsTable getIpSystemStatsTable() {
        return this.ipSystemStatsTable;
    }

    public void setIpSystemStatsTable(IpSystemStatsTable ipSystemStatsTable) {
        IpSystemStatsTable oldValue = getIpSystemStatsTable();
        this.ipSystemStatsTable = ipSystemStatsTable;
        replaceChild(oldValue, ipSystemStatsTable);
    }

    public IpIfStatsTable getIpIfStatsTable() {
        return this.ipIfStatsTable;
    }

    public void setIpIfStatsTable(IpIfStatsTable ipIfStatsTable) {
        IpIfStatsTable oldValue = getIpIfStatsTable();
        this.ipIfStatsTable = ipIfStatsTable;
        replaceChild(oldValue, ipIfStatsTable);
    }

    public IpAddressPrefixTable getIpAddressPrefixTable() {
        return this.ipAddressPrefixTable;
    }

    public void setIpAddressPrefixTable(IpAddressPrefixTable ipAddressPrefixTable) {
        IpAddressPrefixTable oldValue = getIpAddressPrefixTable();
        this.ipAddressPrefixTable = ipAddressPrefixTable;
        replaceChild(oldValue, ipAddressPrefixTable);
    }

    public IpAddressTable getIpAddressTable() {
        return this.ipAddressTable;
    }

    public void setIpAddressTable(IpAddressTable ipAddressTable) {
        IpAddressTable oldValue = getIpAddressTable();
        this.ipAddressTable = ipAddressTable;
        replaceChild(oldValue, ipAddressTable);
    }

    public IpNetToPhysicalTable getIpNetToPhysicalTable() {
        return this.ipNetToPhysicalTable;
    }

    public void setIpNetToPhysicalTable(IpNetToPhysicalTable ipNetToPhysicalTable) {
        IpNetToPhysicalTable oldValue = getIpNetToPhysicalTable();
        this.ipNetToPhysicalTable = ipNetToPhysicalTable;
        replaceChild(oldValue, ipNetToPhysicalTable);
    }

    public Ipv6ScopeZoneIndexTable getIpv6ScopeZoneIndexTable() {
        return this.ipv6ScopeZoneIndexTable;
    }

    public void setIpv6ScopeZoneIndexTable(Ipv6ScopeZoneIndexTable ipv6ScopeZoneIndexTable) {
        Ipv6ScopeZoneIndexTable oldValue = getIpv6ScopeZoneIndexTable();
        this.ipv6ScopeZoneIndexTable = ipv6ScopeZoneIndexTable;
        replaceChild(oldValue, ipv6ScopeZoneIndexTable);
    }

    public IpDefaultRouterTable getIpDefaultRouterTable() {
        return this.ipDefaultRouterTable;
    }

    public void setIpDefaultRouterTable(IpDefaultRouterTable ipDefaultRouterTable) {
        IpDefaultRouterTable oldValue = getIpDefaultRouterTable();
        this.ipDefaultRouterTable = ipDefaultRouterTable;
        replaceChild(oldValue, ipDefaultRouterTable);
    }

    public Ipv6RouterAdvertTable getIpv6RouterAdvertTable() {
        return this.ipv6RouterAdvertTable;
    }

    public void setIpv6RouterAdvertTable(Ipv6RouterAdvertTable ipv6RouterAdvertTable) {
        Ipv6RouterAdvertTable oldValue = getIpv6RouterAdvertTable();
        this.ipv6RouterAdvertTable = ipv6RouterAdvertTable;
        replaceChild(oldValue, ipv6RouterAdvertTable);
    }

    public Icmp getIcmp() {
        return this.icmp;
    }

    public void setIcmp(Icmp icmp) {
        Icmp oldValue = getIcmp();
        this.icmp = icmp;
        replaceChild(oldValue, icmp);
    }

    public IcmpStatsTable getIcmpStatsTable() {
        return this.icmpStatsTable;
    }

    public void setIcmpStatsTable(IcmpStatsTable icmpStatsTable) {
        IcmpStatsTable oldValue = getIcmpStatsTable();
        this.icmpStatsTable = icmpStatsTable;
        replaceChild(oldValue, icmpStatsTable);
    }

    public IcmpMsgStatsTable getIcmpMsgStatsTable() {
        return this.icmpMsgStatsTable;
    }

    public void setIcmpMsgStatsTable(IcmpMsgStatsTable icmpMsgStatsTable) {
        IcmpMsgStatsTable oldValue = getIcmpMsgStatsTable();
        this.icmpMsgStatsTable = icmpMsgStatsTable;
        replaceChild(oldValue, icmpMsgStatsTable);
    }

    public Ipv6MIBObjects getIpv6MIBObjects() {
        return this.ipv6MIBObjects;
    }

    public void setIpv6MIBObjects(Ipv6MIBObjects ipv6MIBObjects) {
        Ipv6MIBObjects oldValue = getIpv6MIBObjects();
        this.ipv6MIBObjects = ipv6MIBObjects;
        replaceChild(oldValue, ipv6MIBObjects);
    }

    public Ipv6RouteTable getIpv6RouteTable() {
        return this.ipv6RouteTable;
    }

    public void setIpv6RouteTable(Ipv6RouteTable ipv6RouteTable) {
        Ipv6RouteTable oldValue = getIpv6RouteTable();
        this.ipv6RouteTable = ipv6RouteTable;
        replaceChild(oldValue, ipv6RouteTable);
    }

    public Ipv6NetToMediaTable getIpv6NetToMediaTable() {
        return this.ipv6NetToMediaTable;
    }

    public void setIpv6NetToMediaTable(Ipv6NetToMediaTable ipv6NetToMediaTable) {
        Ipv6NetToMediaTable oldValue = getIpv6NetToMediaTable();
        this.ipv6NetToMediaTable = ipv6NetToMediaTable;
        replaceChild(oldValue, ipv6NetToMediaTable);
    }

    public Ipv6IfTable getIpv6IfTable() {
        return this.ipv6IfTable;
    }

    public void setIpv6IfTable(Ipv6IfTable ipv6IfTable) {
        Ipv6IfTable oldValue = getIpv6IfTable();
        this.ipv6IfTable = ipv6IfTable;
        replaceChild(oldValue, ipv6IfTable);
    }

    public Ipv6IfStatsTable getIpv6IfStatsTable() {
        return this.ipv6IfStatsTable;
    }

    public void setIpv6IfStatsTable(Ipv6IfStatsTable ipv6IfStatsTable) {
        Ipv6IfStatsTable oldValue = getIpv6IfStatsTable();
        this.ipv6IfStatsTable = ipv6IfStatsTable;
        replaceChild(oldValue, ipv6IfStatsTable);
    }

    public Ipv6AddrPrefixTable getIpv6AddrPrefixTable() {
        return this.ipv6AddrPrefixTable;
    }

    public void setIpv6AddrPrefixTable(Ipv6AddrPrefixTable ipv6AddrPrefixTable) {
        Ipv6AddrPrefixTable oldValue = getIpv6AddrPrefixTable();
        this.ipv6AddrPrefixTable = ipv6AddrPrefixTable;
        replaceChild(oldValue, ipv6AddrPrefixTable);
    }

    public Ipv6AddrTable getIpv6AddrTable() {
        return this.ipv6AddrTable;
    }

    public void setIpv6AddrTable(Ipv6AddrTable ipv6AddrTable) {
        Ipv6AddrTable oldValue = getIpv6AddrTable();
        this.ipv6AddrTable = ipv6AddrTable;
        replaceChild(oldValue, ipv6AddrTable);
    }

    public Ipv6IfIcmpTable getIpv6IfIcmpTable() {
        return this.ipv6IfIcmpTable;
    }

    public void setIpv6IfIcmpTable(Ipv6IfIcmpTable ipv6IfIcmpTable) {
        Ipv6IfIcmpTable oldValue = getIpv6IfIcmpTable();
        this.ipv6IfIcmpTable = ipv6IfIcmpTable;
        replaceChild(oldValue, ipv6IfIcmpTable);
    }

    public Tcp getTcp() {
        return this.tcp;
    }

    public void setTcp(Tcp tcp) {
        Tcp oldValue = getTcp();
        this.tcp = tcp;
        replaceChild(oldValue, tcp);
    }

    public TcpConnTable getTcpConnTable() {
        return this.tcpConnTable;
    }

    public void setTcpConnTable(TcpConnTable tcpConnTable) {
        TcpConnTable oldValue = getTcpConnTable();
        this.tcpConnTable = tcpConnTable;
        replaceChild(oldValue, tcpConnTable);
    }

    public Ipv6TcpConnTable getIpv6TcpConnTable() {
        return this.ipv6TcpConnTable;
    }

    public void setIpv6TcpConnTable(Ipv6TcpConnTable ipv6TcpConnTable) {
        Ipv6TcpConnTable oldValue = getIpv6TcpConnTable();
        this.ipv6TcpConnTable = ipv6TcpConnTable;
        replaceChild(oldValue, ipv6TcpConnTable);
    }

    public TcpConnectionTable getTcpConnectionTable() {
        return this.tcpConnectionTable;
    }

    public void setTcpConnectionTable(TcpConnectionTable tcpConnectionTable) {
        TcpConnectionTable oldValue = getTcpConnectionTable();
        this.tcpConnectionTable = tcpConnectionTable;
        replaceChild(oldValue, tcpConnectionTable);
    }

    public TcpListenerTable getTcpListenerTable() {
        return this.tcpListenerTable;
    }

    public void setTcpListenerTable(TcpListenerTable tcpListenerTable) {
        TcpListenerTable oldValue = getTcpListenerTable();
        this.tcpListenerTable = tcpListenerTable;
        replaceChild(oldValue, tcpListenerTable);
    }

    public SchedObjects getSchedObjects() {
        return this.schedObjects;
    }

    public void setSchedObjects(SchedObjects schedObjects) {
        SchedObjects oldValue = getSchedObjects();
        this.schedObjects = schedObjects;
        replaceChild(oldValue, schedObjects);
    }

    public SchedTable getSchedTable() {
        return this.schedTable;
    }

    public void setSchedTable(SchedTable schedTable) {
        SchedTable oldValue = getSchedTable();
        this.schedTable = schedTable;
        replaceChild(oldValue, schedTable);
    }

    public SmLangTable getSmLangTable() {
        return this.smLangTable;
    }

    public void setSmLangTable(SmLangTable smLangTable) {
        SmLangTable oldValue = getSmLangTable();
        this.smLangTable = smLangTable;
        replaceChild(oldValue, smLangTable);
    }

    public SmExtsnTable getSmExtsnTable() {
        return this.smExtsnTable;
    }

    public void setSmExtsnTable(SmExtsnTable smExtsnTable) {
        SmExtsnTable oldValue = getSmExtsnTable();
        this.smExtsnTable = smExtsnTable;
        replaceChild(oldValue, smExtsnTable);
    }

    public SmScriptTable getSmScriptTable() {
        return this.smScriptTable;
    }

    public void setSmScriptTable(SmScriptTable smScriptTable) {
        SmScriptTable oldValue = getSmScriptTable();
        this.smScriptTable = smScriptTable;
        replaceChild(oldValue, smScriptTable);
    }

    public SmCodeTable getSmCodeTable() {
        return this.smCodeTable;
    }

    public void setSmCodeTable(SmCodeTable smCodeTable) {
        SmCodeTable oldValue = getSmCodeTable();
        this.smCodeTable = smCodeTable;
        replaceChild(oldValue, smCodeTable);
    }

    public SmLaunchTable getSmLaunchTable() {
        return this.smLaunchTable;
    }

    public void setSmLaunchTable(SmLaunchTable smLaunchTable) {
        SmLaunchTable oldValue = getSmLaunchTable();
        this.smLaunchTable = smLaunchTable;
        replaceChild(oldValue, smLaunchTable);
    }

    public SmRunTable getSmRunTable() {
        return this.smRunTable;
    }

    public void setSmRunTable(SmRunTable smRunTable) {
        SmRunTable oldValue = getSmRunTable();
        this.smRunTable = smRunTable;
        replaceChild(oldValue, smRunTable);
    }

    public Udp getUdp() {
        return this.udp;
    }

    public void setUdp(Udp udp) {
        Udp oldValue = getUdp();
        this.udp = udp;
        replaceChild(oldValue, udp);
    }

    public UdpTable getUdpTable() {
        return this.udpTable;
    }

    public void setUdpTable(UdpTable udpTable) {
        UdpTable oldValue = getUdpTable();
        this.udpTable = udpTable;
        replaceChild(oldValue, udpTable);
    }

    public Ipv6UdpTable getIpv6UdpTable() {
        return this.ipv6UdpTable;
    }

    public void setIpv6UdpTable(Ipv6UdpTable ipv6UdpTable) {
        Ipv6UdpTable oldValue = getIpv6UdpTable();
        this.ipv6UdpTable = ipv6UdpTable;
        replaceChild(oldValue, ipv6UdpTable);
    }

    public UdpEndpointTable getUdpEndpointTable() {
        return this.udpEndpointTable;
    }

    public void setUdpEndpointTable(UdpEndpointTable udpEndpointTable) {
        UdpEndpointTable oldValue = getUdpEndpointTable();
        this.udpEndpointTable = udpEndpointTable;
        replaceChild(oldValue, udpEndpointTable);
    }

    public AgentxGeneral getAgentxGeneral() {
        return this.agentxGeneral;
    }

    public void setAgentxGeneral(AgentxGeneral agentxGeneral) {
        AgentxGeneral oldValue = getAgentxGeneral();
        this.agentxGeneral = agentxGeneral;
        replaceChild(oldValue, agentxGeneral);
    }

    public AgentxConnection getAgentxConnection() {
        return this.agentxConnection;
    }

    public void setAgentxConnection(AgentxConnection agentxConnection) {
        AgentxConnection oldValue = getAgentxConnection();
        this.agentxConnection = agentxConnection;
        replaceChild(oldValue, agentxConnection);
    }

    public AgentxConnectionTable getAgentxConnectionTable() {
        return this.agentxConnectionTable;
    }

    public void setAgentxConnectionTable(AgentxConnectionTable agentxConnectionTable) {
        AgentxConnectionTable oldValue = getAgentxConnectionTable();
        this.agentxConnectionTable = agentxConnectionTable;
        replaceChild(oldValue, agentxConnectionTable);
    }

    public AgentxSession getAgentxSession() {
        return this.agentxSession;
    }

    public void setAgentxSession(AgentxSession agentxSession) {
        AgentxSession oldValue = getAgentxSession();
        this.agentxSession = agentxSession;
        replaceChild(oldValue, agentxSession);
    }

    public AgentxSessionTable getAgentxSessionTable() {
        return this.agentxSessionTable;
    }

    public void setAgentxSessionTable(AgentxSessionTable agentxSessionTable) {
        AgentxSessionTable oldValue = getAgentxSessionTable();
        this.agentxSessionTable = agentxSessionTable;
        replaceChild(oldValue, agentxSessionTable);
    }

    public AgentxRegistration getAgentxRegistration() {
        return this.agentxRegistration;
    }

    public void setAgentxRegistration(AgentxRegistration agentxRegistration) {
        AgentxRegistration oldValue = getAgentxRegistration();
        this.agentxRegistration = agentxRegistration;
        replaceChild(oldValue, agentxRegistration);
    }

    public AgentxRegistrationTable getAgentxRegistrationTable() {
        return this.agentxRegistrationTable;
    }

    public void setAgentxRegistrationTable(AgentxRegistrationTable agentxRegistrationTable) {
        AgentxRegistrationTable oldValue = getAgentxRegistrationTable();
        this.agentxRegistrationTable = agentxRegistrationTable;
        replaceChild(oldValue, agentxRegistrationTable);
    }

    public IfInvStackTable getIfInvStackTable() {
        return this.ifInvStackTable;
    }

    public void setIfInvStackTable(IfInvStackTable ifInvStackTable) {
        IfInvStackTable oldValue = getIfInvStackTable();
        this.ifInvStackTable = ifInvStackTable;
        replaceChild(oldValue, ifInvStackTable);
    }

    public Egp getEgp() {
        return this.egp;
    }

    public void setEgp(Egp egp) {
        Egp oldValue = getEgp();
        this.egp = egp;
        replaceChild(oldValue, egp);
    }

    public EgpNeighTable getEgpNeighTable() {
        return this.egpNeighTable;
    }

    public void setEgpNeighTable(EgpNeighTable egpNeighTable) {
        EgpNeighTable oldValue = getEgpNeighTable();
        this.egpNeighTable = egpNeighTable;
        replaceChild(oldValue, egpNeighTable);
    }

    public MteResource getMteResource() {
        return this.mteResource;
    }

    public void setMteResource(MteResource mteResource) {
        MteResource oldValue = getMteResource();
        this.mteResource = mteResource;
        replaceChild(oldValue, mteResource);
    }

    public MteTrigger getMteTrigger() {
        return this.mteTrigger;
    }

    public void setMteTrigger(MteTrigger mteTrigger) {
        MteTrigger oldValue = getMteTrigger();
        this.mteTrigger = mteTrigger;
        replaceChild(oldValue, mteTrigger);
    }

    public MteTriggerTable getMteTriggerTable() {
        return this.mteTriggerTable;
    }

    public void setMteTriggerTable(MteTriggerTable mteTriggerTable) {
        MteTriggerTable oldValue = getMteTriggerTable();
        this.mteTriggerTable = mteTriggerTable;
        replaceChild(oldValue, mteTriggerTable);
    }

    public MteTriggerDeltaTable getMteTriggerDeltaTable() {
        return this.mteTriggerDeltaTable;
    }

    public void setMteTriggerDeltaTable(MteTriggerDeltaTable mteTriggerDeltaTable) {
        MteTriggerDeltaTable oldValue = getMteTriggerDeltaTable();
        this.mteTriggerDeltaTable = mteTriggerDeltaTable;
        replaceChild(oldValue, mteTriggerDeltaTable);
    }

    public MteTriggerExistenceTable getMteTriggerExistenceTable() {
        return this.mteTriggerExistenceTable;
    }

    public void setMteTriggerExistenceTable(MteTriggerExistenceTable mteTriggerExistenceTable) {
        MteTriggerExistenceTable oldValue = getMteTriggerExistenceTable();
        this.mteTriggerExistenceTable = mteTriggerExistenceTable;
        replaceChild(oldValue, mteTriggerExistenceTable);
    }

    public MteTriggerBooleanTable getMteTriggerBooleanTable() {
        return this.mteTriggerBooleanTable;
    }

    public void setMteTriggerBooleanTable(MteTriggerBooleanTable mteTriggerBooleanTable) {
        MteTriggerBooleanTable oldValue = getMteTriggerBooleanTable();
        this.mteTriggerBooleanTable = mteTriggerBooleanTable;
        replaceChild(oldValue, mteTriggerBooleanTable);
    }

    public MteTriggerThresholdTable getMteTriggerThresholdTable() {
        return this.mteTriggerThresholdTable;
    }

    public void setMteTriggerThresholdTable(MteTriggerThresholdTable mteTriggerThresholdTable) {
        MteTriggerThresholdTable oldValue = getMteTriggerThresholdTable();
        this.mteTriggerThresholdTable = mteTriggerThresholdTable;
        replaceChild(oldValue, mteTriggerThresholdTable);
    }

    public MteObjectsTable getMteObjectsTable() {
        return this.mteObjectsTable;
    }

    public void setMteObjectsTable(MteObjectsTable mteObjectsTable) {
        MteObjectsTable oldValue = getMteObjectsTable();
        this.mteObjectsTable = mteObjectsTable;
        replaceChild(oldValue, mteObjectsTable);
    }

    public MteEvent getMteEvent() {
        return this.mteEvent;
    }

    public void setMteEvent(MteEvent mteEvent) {
        MteEvent oldValue = getMteEvent();
        this.mteEvent = mteEvent;
        replaceChild(oldValue, mteEvent);
    }

    public MteEventTable getMteEventTable() {
        return this.mteEventTable;
    }

    public void setMteEventTable(MteEventTable mteEventTable) {
        MteEventTable oldValue = getMteEventTable();
        this.mteEventTable = mteEventTable;
        replaceChild(oldValue, mteEventTable);
    }

    public MteEventNotificationTable getMteEventNotificationTable() {
        return this.mteEventNotificationTable;
    }

    public void setMteEventNotificationTable(MteEventNotificationTable mteEventNotificationTable) {
        MteEventNotificationTable oldValue = getMteEventNotificationTable();
        this.mteEventNotificationTable = mteEventNotificationTable;
        replaceChild(oldValue, mteEventNotificationTable);
    }

    public MteEventSetTable getMteEventSetTable() {
        return this.mteEventSetTable;
    }

    public void setMteEventSetTable(MteEventSetTable mteEventSetTable) {
        MteEventSetTable oldValue = getMteEventSetTable();
        this.mteEventSetTable = mteEventSetTable;
        replaceChild(oldValue, mteEventSetTable);
    }

    public DismanEventMIBNotificationObjects getDismanEventMIBNotificationObjects() {
        return this.dismanEventMIBNotificationObjects;
    }

    public void setDismanEventMIBNotificationObjects(DismanEventMIBNotificationObjects dismanEventMIBNotificationObjects) {
        DismanEventMIBNotificationObjects oldValue = getDismanEventMIBNotificationObjects();
        this.dismanEventMIBNotificationObjects = dismanEventMIBNotificationObjects;
        replaceChild(oldValue, dismanEventMIBNotificationObjects);
    }

    public NlmConfig getNlmConfig() {
        return this.nlmConfig;
    }

    public void setNlmConfig(NlmConfig nlmConfig) {
        NlmConfig oldValue = getNlmConfig();
        this.nlmConfig = nlmConfig;
        replaceChild(oldValue, nlmConfig);
    }

    public NlmConfigLogTable getNlmConfigLogTable() {
        return this.nlmConfigLogTable;
    }

    public void setNlmConfigLogTable(NlmConfigLogTable nlmConfigLogTable) {
        NlmConfigLogTable oldValue = getNlmConfigLogTable();
        this.nlmConfigLogTable = nlmConfigLogTable;
        replaceChild(oldValue, nlmConfigLogTable);
    }

    public NlmStats getNlmStats() {
        return this.nlmStats;
    }

    public void setNlmStats(NlmStats nlmStats) {
        NlmStats oldValue = getNlmStats();
        this.nlmStats = nlmStats;
        replaceChild(oldValue, nlmStats);
    }

    public NlmStatsLogTable getNlmStatsLogTable() {
        return this.nlmStatsLogTable;
    }

    public void setNlmStatsLogTable(NlmStatsLogTable nlmStatsLogTable) {
        NlmStatsLogTable oldValue = getNlmStatsLogTable();
        this.nlmStatsLogTable = nlmStatsLogTable;
        replaceChild(oldValue, nlmStatsLogTable);
    }

    public NlmLogTable getNlmLogTable() {
        return this.nlmLogTable;
    }

    public void setNlmLogTable(NlmLogTable nlmLogTable) {
        NlmLogTable oldValue = getNlmLogTable();
        this.nlmLogTable = nlmLogTable;
        replaceChild(oldValue, nlmLogTable);
    }

    public NlmLogVariableTable getNlmLogVariableTable() {
        return this.nlmLogVariableTable;
    }

    public void setNlmLogVariableTable(NlmLogVariableTable nlmLogVariableTable) {
        NlmLogVariableTable oldValue = getNlmLogVariableTable();
        this.nlmLogVariableTable = nlmLogVariableTable;
        replaceChild(oldValue, nlmLogVariableTable);
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("system", system).append("sysORTable", sysORTable).append("dot3PauseTable", dot3PauseTable).append("dot3HCStatsTable", dot3HCStatsTable).append("dot3StatsTable", dot3StatsTable).append("dot3CollTable", dot3CollTable).append("dot3ControlTable", dot3ControlTable).append("sctpStats", sctpStats).append("sctpLookupRemIPAddrTable", sctpLookupRemIPAddrTable).append("sctpParams", sctpParams).append("sctpAssocTable", sctpAssocTable).append("sctpAssocLocalAddrTable", sctpAssocLocalAddrTable).append("sctpAssocRemAddrTable", sctpAssocRemAddrTable).append("sctpLookupLocalPortTable", sctpLookupLocalPortTable).append("sctpLookupRemPortTable", sctpLookupRemPortTable).append("sctpLookupRemHostNameTable", sctpLookupRemHostNameTable).append("sctpLookupRemPrimIPAddrTable", sctpLookupRemPrimIPAddrTable).append("snmp", snmp).append("etherStatsTable", etherStatsTable).append("historyControlTable", historyControlTable).append("etherHistoryTable", etherHistoryTable).append("alarmTable", alarmTable).append("hostControlTable", hostControlTable).append("hostTable", hostTable).append("hostTimeTable", hostTimeTable).append("hostTopNControlTable", hostTopNControlTable).append("hostTopNTable", hostTopNTable).append("matrixControlTable", matrixControlTable).append("matrixSDTable", matrixSDTable).append("matrixDSTable", matrixDSTable).append("filterTable", filterTable).append("channelTable", channelTable).append("bufferControlTable", bufferControlTable).append("captureBufferTable", captureBufferTable).append("eventTable", eventTable).append("logTable", logTable).append("interfaces", interfaces).append("ifTable", ifTable).append("hrSystem", hrSystem).append("hrStorage", hrStorage).append("hrStorageTable", hrStorageTable).append("hrDeviceTable", hrDeviceTable).append("hrProcessorTable", hrProcessorTable).append("hrNetworkTable", hrNetworkTable).append("hrPrinterTable", hrPrinterTable).append("hrDiskStorageTable", hrDiskStorageTable).append("hrPartitionTable", hrPartitionTable).append("hrFSTable", hrFSTable).append("hrSWRun", hrSWRun).append("hrSWRunTable", hrSWRunTable).append("hrSWRunPerfTable", hrSWRunPerfTable).append("hrSWInstalled", hrSWInstalled).append("hrSWInstalledTable", hrSWInstalledTable).append("applTable", applTable).append("assocTable", assocTable).append("mtaTable", mtaTable).append("mtaGroupTable", mtaGroupTable).append("mtaGroupAssociationTable", mtaGroupAssociationTable).append("mtaGroupErrorTable", mtaGroupErrorTable).append("atTable", atTable).append("ifMIBObjects", ifMIBObjects).append("ifXTable", ifXTable).append("ifStackTable", ifStackTable).append("ifTestTable", ifTestTable).append("ifRcvAddressTable", ifRcvAddressTable).append("ip", ip).append("ipAddrTable", ipAddrTable).append("ipRouteTable", ipRouteTable).append("ipNetToMediaTable", ipNetToMediaTable).append("ipForward", ipForward).append("ipForwardTable", ipForwardTable).append("ipCidrRouteTable", ipCidrRouteTable).append("inetCidrRouteTable", inetCidrRouteTable).append("ipv4InterfaceTable", ipv4InterfaceTable).append("ipv6InterfaceTable", ipv6InterfaceTable).append("ipTrafficStats", ipTrafficStats).append("ipSystemStatsTable", ipSystemStatsTable).append("ipIfStatsTable", ipIfStatsTable).append("ipAddressPrefixTable", ipAddressPrefixTable).append("ipAddressTable", ipAddressTable).append("ipNetToPhysicalTable", ipNetToPhysicalTable).append("ipv6ScopeZoneIndexTable", ipv6ScopeZoneIndexTable).append("ipDefaultRouterTable", ipDefaultRouterTable).append("ipv6RouterAdvertTable", ipv6RouterAdvertTable).append("icmp", icmp).append("icmpStatsTable", icmpStatsTable).append("icmpMsgStatsTable", icmpMsgStatsTable).append("ipv6MIBObjects", ipv6MIBObjects).append("ipv6RouteTable", ipv6RouteTable).append("ipv6NetToMediaTable", ipv6NetToMediaTable).append("ipv6IfTable", ipv6IfTable).append("ipv6IfStatsTable", ipv6IfStatsTable).append("ipv6AddrPrefixTable", ipv6AddrPrefixTable).append("ipv6AddrTable", ipv6AddrTable).append("ipv6IfIcmpTable", ipv6IfIcmpTable).append("tcp", tcp).append("tcpConnTable", tcpConnTable).append("ipv6TcpConnTable", ipv6TcpConnTable).append("tcpConnectionTable", tcpConnectionTable).append("tcpListenerTable", tcpListenerTable).append("schedObjects", schedObjects).append("schedTable", schedTable).append("smLangTable", smLangTable).append("smExtsnTable", smExtsnTable).append("smScriptTable", smScriptTable).append("smCodeTable", smCodeTable).append("smLaunchTable", smLaunchTable).append("smRunTable", smRunTable).append("udp", udp).append("udpTable", udpTable).append("ipv6UdpTable", ipv6UdpTable).append("udpEndpointTable", udpEndpointTable).append("agentxGeneral", agentxGeneral).append("agentxConnection", agentxConnection).append("agentxConnectionTable", agentxConnectionTable).append("agentxSession", agentxSession).append("agentxSessionTable", agentxSessionTable).append("agentxRegistration", agentxRegistration).append("agentxRegistrationTable", agentxRegistrationTable).append("ifInvStackTable", ifInvStackTable).append("egp", egp).append("egpNeighTable", egpNeighTable).append("mteResource", mteResource).append("mteTrigger", mteTrigger).append("mteTriggerTable", mteTriggerTable).append("mteTriggerDeltaTable", mteTriggerDeltaTable).append("mteTriggerExistenceTable", mteTriggerExistenceTable).append("mteTriggerBooleanTable", mteTriggerBooleanTable).append("mteTriggerThresholdTable", mteTriggerThresholdTable).append("mteObjectsTable", mteObjectsTable).append("mteEvent", mteEvent).append("mteEventTable", mteEventTable).append("mteEventNotificationTable", mteEventNotificationTable).append("mteEventSetTable", mteEventSetTable).append("dismanEventMIBNotificationObjects", dismanEventMIBNotificationObjects).append("nlmConfig", nlmConfig).append("nlmConfigLogTable", nlmConfigLogTable).append("nlmStats", nlmStats).append("nlmStatsLogTable", nlmStatsLogTable).append("nlmLogTable", nlmLogTable).append("nlmLogVariableTable", nlmLogVariableTable).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(system).append(sysORTable).append(dot3PauseTable).append(dot3HCStatsTable).append(dot3StatsTable).append(dot3CollTable).append(dot3ControlTable).append(sctpStats).append(sctpLookupRemIPAddrTable).append(sctpParams).append(sctpAssocTable).append(sctpAssocLocalAddrTable).append(sctpAssocRemAddrTable).append(sctpLookupLocalPortTable).append(sctpLookupRemPortTable).append(sctpLookupRemHostNameTable).append(sctpLookupRemPrimIPAddrTable).append(snmp).append(etherStatsTable).append(historyControlTable).append(etherHistoryTable).append(alarmTable).append(hostControlTable).append(hostTable).append(hostTimeTable).append(hostTopNControlTable).append(hostTopNTable).append(matrixControlTable).append(matrixSDTable).append(matrixDSTable).append(filterTable).append(channelTable).append(bufferControlTable).append(captureBufferTable).append(eventTable).append(logTable).append(interfaces).append(ifTable).append(hrSystem).append(hrStorage).append(hrStorageTable).append(hrDeviceTable).append(hrProcessorTable).append(hrNetworkTable).append(hrPrinterTable).append(hrDiskStorageTable).append(hrPartitionTable).append(hrFSTable).append(hrSWRun).append(hrSWRunTable).append(hrSWRunPerfTable).append(hrSWInstalled).append(hrSWInstalledTable).append(applTable).append(assocTable).append(mtaTable).append(mtaGroupTable).append(mtaGroupAssociationTable).append(mtaGroupErrorTable).append(atTable).append(ifMIBObjects).append(ifXTable).append(ifStackTable).append(ifTestTable).append(ifRcvAddressTable).append(ip).append(ipAddrTable).append(ipRouteTable).append(ipNetToMediaTable).append(ipForward).append(ipForwardTable).append(ipCidrRouteTable).append(inetCidrRouteTable).append(ipv4InterfaceTable).append(ipv6InterfaceTable).append(ipTrafficStats).append(ipSystemStatsTable).append(ipIfStatsTable).append(ipAddressPrefixTable).append(ipAddressTable).append(ipNetToPhysicalTable).append(ipv6ScopeZoneIndexTable).append(ipDefaultRouterTable).append(ipv6RouterAdvertTable).append(icmp).append(icmpStatsTable).append(icmpMsgStatsTable).append(ipv6MIBObjects).append(ipv6RouteTable).append(ipv6NetToMediaTable).append(ipv6IfTable).append(ipv6IfStatsTable).append(ipv6AddrPrefixTable).append(ipv6AddrTable).append(ipv6IfIcmpTable).append(tcp).append(tcpConnTable).append(ipv6TcpConnTable).append(tcpConnectionTable).append(tcpListenerTable).append(schedObjects).append(schedTable).append(smLangTable).append(smExtsnTable).append(smScriptTable).append(smCodeTable).append(smLaunchTable).append(smRunTable).append(udp).append(udpTable).append(ipv6UdpTable).append(udpEndpointTable).append(agentxGeneral).append(agentxConnection).append(agentxConnectionTable).append(agentxSession).append(agentxSessionTable).append(agentxRegistration).append(agentxRegistrationTable).append(ifInvStackTable).append(egp).append(egpNeighTable).append(mteResource).append(mteTrigger).append(mteTriggerTable).append(mteTriggerDeltaTable).append(mteTriggerExistenceTable).append(mteTriggerBooleanTable).append(mteTriggerThresholdTable).append(mteObjectsTable).append(mteEvent).append(mteEventTable).append(mteEventNotificationTable).append(mteEventSetTable).append(dismanEventMIBNotificationObjects).append(nlmConfig).append(nlmConfigLogTable).append(nlmStats).append(nlmStatsLogTable).append(nlmLogTable).append(nlmLogVariableTable).toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass()!= this.getClass()) {
            return false;
        }
        I_Device rhs = ((I_Device) obj);
        return new EqualsBuilder().append(system, rhs.system).append(sysORTable, rhs.sysORTable).append(dot3PauseTable, rhs.dot3PauseTable).append(dot3HCStatsTable, rhs.dot3HCStatsTable).append(dot3StatsTable, rhs.dot3StatsTable).append(dot3CollTable, rhs.dot3CollTable).append(dot3ControlTable, rhs.dot3ControlTable).append(sctpStats, rhs.sctpStats).append(sctpLookupRemIPAddrTable, rhs.sctpLookupRemIPAddrTable).append(sctpParams, rhs.sctpParams).append(sctpAssocTable, rhs.sctpAssocTable).append(sctpAssocLocalAddrTable, rhs.sctpAssocLocalAddrTable).append(sctpAssocRemAddrTable, rhs.sctpAssocRemAddrTable).append(sctpLookupLocalPortTable, rhs.sctpLookupLocalPortTable).append(sctpLookupRemPortTable, rhs.sctpLookupRemPortTable).append(sctpLookupRemHostNameTable, rhs.sctpLookupRemHostNameTable).append(sctpLookupRemPrimIPAddrTable, rhs.sctpLookupRemPrimIPAddrTable).append(snmp, rhs.snmp).append(etherStatsTable, rhs.etherStatsTable).append(historyControlTable, rhs.historyControlTable).append(etherHistoryTable, rhs.etherHistoryTable).append(alarmTable, rhs.alarmTable).append(hostControlTable, rhs.hostControlTable).append(hostTable, rhs.hostTable).append(hostTimeTable, rhs.hostTimeTable).append(hostTopNControlTable, rhs.hostTopNControlTable).append(hostTopNTable, rhs.hostTopNTable).append(matrixControlTable, rhs.matrixControlTable).append(matrixSDTable, rhs.matrixSDTable).append(matrixDSTable, rhs.matrixDSTable).append(filterTable, rhs.filterTable).append(channelTable, rhs.channelTable).append(bufferControlTable, rhs.bufferControlTable).append(captureBufferTable, rhs.captureBufferTable).append(eventTable, rhs.eventTable).append(logTable, rhs.logTable).append(interfaces, rhs.interfaces).append(ifTable, rhs.ifTable).append(hrSystem, rhs.hrSystem).append(hrStorage, rhs.hrStorage).append(hrStorageTable, rhs.hrStorageTable).append(hrDeviceTable, rhs.hrDeviceTable).append(hrProcessorTable, rhs.hrProcessorTable).append(hrNetworkTable, rhs.hrNetworkTable).append(hrPrinterTable, rhs.hrPrinterTable).append(hrDiskStorageTable, rhs.hrDiskStorageTable).append(hrPartitionTable, rhs.hrPartitionTable).append(hrFSTable, rhs.hrFSTable).append(hrSWRun, rhs.hrSWRun).append(hrSWRunTable, rhs.hrSWRunTable).append(hrSWRunPerfTable, rhs.hrSWRunPerfTable).append(hrSWInstalled, rhs.hrSWInstalled).append(hrSWInstalledTable, rhs.hrSWInstalledTable).append(applTable, rhs.applTable).append(assocTable, rhs.assocTable).append(mtaTable, rhs.mtaTable).append(mtaGroupTable, rhs.mtaGroupTable).append(mtaGroupAssociationTable, rhs.mtaGroupAssociationTable).append(mtaGroupErrorTable, rhs.mtaGroupErrorTable).append(atTable, rhs.atTable).append(ifMIBObjects, rhs.ifMIBObjects).append(ifXTable, rhs.ifXTable).append(ifStackTable, rhs.ifStackTable).append(ifTestTable, rhs.ifTestTable).append(ifRcvAddressTable, rhs.ifRcvAddressTable).append(ip, rhs.ip).append(ipAddrTable, rhs.ipAddrTable).append(ipRouteTable, rhs.ipRouteTable).append(ipNetToMediaTable, rhs.ipNetToMediaTable).append(ipForward, rhs.ipForward).append(ipForwardTable, rhs.ipForwardTable).append(ipCidrRouteTable, rhs.ipCidrRouteTable).append(inetCidrRouteTable, rhs.inetCidrRouteTable).append(ipv4InterfaceTable, rhs.ipv4InterfaceTable).append(ipv6InterfaceTable, rhs.ipv6InterfaceTable).append(ipTrafficStats, rhs.ipTrafficStats).append(ipSystemStatsTable, rhs.ipSystemStatsTable).append(ipIfStatsTable, rhs.ipIfStatsTable).append(ipAddressPrefixTable, rhs.ipAddressPrefixTable).append(ipAddressTable, rhs.ipAddressTable).append(ipNetToPhysicalTable, rhs.ipNetToPhysicalTable).append(ipv6ScopeZoneIndexTable, rhs.ipv6ScopeZoneIndexTable).append(ipDefaultRouterTable, rhs.ipDefaultRouterTable).append(ipv6RouterAdvertTable, rhs.ipv6RouterAdvertTable).append(icmp, rhs.icmp).append(icmpStatsTable, rhs.icmpStatsTable).append(icmpMsgStatsTable, rhs.icmpMsgStatsTable).append(ipv6MIBObjects, rhs.ipv6MIBObjects).append(ipv6RouteTable, rhs.ipv6RouteTable).append(ipv6NetToMediaTable, rhs.ipv6NetToMediaTable).append(ipv6IfTable, rhs.ipv6IfTable).append(ipv6IfStatsTable, rhs.ipv6IfStatsTable).append(ipv6AddrPrefixTable, rhs.ipv6AddrPrefixTable).append(ipv6AddrTable, rhs.ipv6AddrTable).append(ipv6IfIcmpTable, rhs.ipv6IfIcmpTable).append(tcp, rhs.tcp).append(tcpConnTable, rhs.tcpConnTable).append(ipv6TcpConnTable, rhs.ipv6TcpConnTable).append(tcpConnectionTable, rhs.tcpConnectionTable).append(tcpListenerTable, rhs.tcpListenerTable).append(schedObjects, rhs.schedObjects).append(schedTable, rhs.schedTable).append(smLangTable, rhs.smLangTable).append(smExtsnTable, rhs.smExtsnTable).append(smScriptTable, rhs.smScriptTable).append(smCodeTable, rhs.smCodeTable).append(smLaunchTable, rhs.smLaunchTable).append(smRunTable, rhs.smRunTable).append(udp, rhs.udp).append(udpTable, rhs.udpTable).append(ipv6UdpTable, rhs.ipv6UdpTable).append(udpEndpointTable, rhs.udpEndpointTable).append(agentxGeneral, rhs.agentxGeneral).append(agentxConnection, rhs.agentxConnection).append(agentxConnectionTable, rhs.agentxConnectionTable).append(agentxSession, rhs.agentxSession).append(agentxSessionTable, rhs.agentxSessionTable).append(agentxRegistration, rhs.agentxRegistration).append(agentxRegistrationTable, rhs.agentxRegistrationTable).append(ifInvStackTable, rhs.ifInvStackTable).append(egp, rhs.egp).append(egpNeighTable, rhs.egpNeighTable).append(mteResource, rhs.mteResource).append(mteTrigger, rhs.mteTrigger).append(mteTriggerTable, rhs.mteTriggerTable).append(mteTriggerDeltaTable, rhs.mteTriggerDeltaTable).append(mteTriggerExistenceTable, rhs.mteTriggerExistenceTable).append(mteTriggerBooleanTable, rhs.mteTriggerBooleanTable).append(mteTriggerThresholdTable, rhs.mteTriggerThresholdTable).append(mteObjectsTable, rhs.mteObjectsTable).append(mteEvent, rhs.mteEvent).append(mteEventTable, rhs.mteEventTable).append(mteEventNotificationTable, rhs.mteEventNotificationTable).append(mteEventSetTable, rhs.mteEventSetTable).append(dismanEventMIBNotificationObjects, rhs.dismanEventMIBNotificationObjects).append(nlmConfig, rhs.nlmConfig).append(nlmConfigLogTable, rhs.nlmConfigLogTable).append(nlmStats, rhs.nlmStats).append(nlmStatsLogTable, rhs.nlmStatsLogTable).append(nlmLogTable, rhs.nlmLogTable).append(nlmLogVariableTable, rhs.nlmLogVariableTable).isEquals();
    }

    public I_Device clone() {
        I_Device _copy = new I_Device();
        if (system!= null) {
            _copy.system = system.clone();
            _copy.system.set_ParentEntity(_copy);
        }
        if (sysORTable!= null) {
            _copy.sysORTable = sysORTable.clone();
            _copy.sysORTable.set_ParentEntity(_copy);
        }
        if (dot3PauseTable!= null) {
            _copy.dot3PauseTable = dot3PauseTable.clone();
            _copy.dot3PauseTable.set_ParentEntity(_copy);
        }
        if (dot3HCStatsTable!= null) {
            _copy.dot3HCStatsTable = dot3HCStatsTable.clone();
            _copy.dot3HCStatsTable.set_ParentEntity(_copy);
        }
        if (dot3StatsTable!= null) {
            _copy.dot3StatsTable = dot3StatsTable.clone();
            _copy.dot3StatsTable.set_ParentEntity(_copy);
        }
        if (dot3CollTable!= null) {
            _copy.dot3CollTable = dot3CollTable.clone();
            _copy.dot3CollTable.set_ParentEntity(_copy);
        }
        if (dot3ControlTable!= null) {
            _copy.dot3ControlTable = dot3ControlTable.clone();
            _copy.dot3ControlTable.set_ParentEntity(_copy);
        }
        if (sctpStats!= null) {
            _copy.sctpStats = sctpStats.clone();
            _copy.sctpStats.set_ParentEntity(_copy);
        }
        if (sctpLookupRemIPAddrTable!= null) {
            _copy.sctpLookupRemIPAddrTable = sctpLookupRemIPAddrTable.clone();
            _copy.sctpLookupRemIPAddrTable.set_ParentEntity(_copy);
        }
        if (sctpParams!= null) {
            _copy.sctpParams = sctpParams.clone();
            _copy.sctpParams.set_ParentEntity(_copy);
        }
        if (sctpAssocTable!= null) {
            _copy.sctpAssocTable = sctpAssocTable.clone();
            _copy.sctpAssocTable.set_ParentEntity(_copy);
        }
        if (sctpAssocLocalAddrTable!= null) {
            _copy.sctpAssocLocalAddrTable = sctpAssocLocalAddrTable.clone();
            _copy.sctpAssocLocalAddrTable.set_ParentEntity(_copy);
        }
        if (sctpAssocRemAddrTable!= null) {
            _copy.sctpAssocRemAddrTable = sctpAssocRemAddrTable.clone();
            _copy.sctpAssocRemAddrTable.set_ParentEntity(_copy);
        }
        if (sctpLookupLocalPortTable!= null) {
            _copy.sctpLookupLocalPortTable = sctpLookupLocalPortTable.clone();
            _copy.sctpLookupLocalPortTable.set_ParentEntity(_copy);
        }
        if (sctpLookupRemPortTable!= null) {
            _copy.sctpLookupRemPortTable = sctpLookupRemPortTable.clone();
            _copy.sctpLookupRemPortTable.set_ParentEntity(_copy);
        }
        if (sctpLookupRemHostNameTable!= null) {
            _copy.sctpLookupRemHostNameTable = sctpLookupRemHostNameTable.clone();
            _copy.sctpLookupRemHostNameTable.set_ParentEntity(_copy);
        }
        if (sctpLookupRemPrimIPAddrTable!= null) {
            _copy.sctpLookupRemPrimIPAddrTable = sctpLookupRemPrimIPAddrTable.clone();
            _copy.sctpLookupRemPrimIPAddrTable.set_ParentEntity(_copy);
        }
        if (snmp!= null) {
            _copy.snmp = snmp.clone();
            _copy.snmp.set_ParentEntity(_copy);
        }
        if (etherStatsTable!= null) {
            _copy.etherStatsTable = etherStatsTable.clone();
            _copy.etherStatsTable.set_ParentEntity(_copy);
        }
        if (historyControlTable!= null) {
            _copy.historyControlTable = historyControlTable.clone();
            _copy.historyControlTable.set_ParentEntity(_copy);
        }
        if (etherHistoryTable!= null) {
            _copy.etherHistoryTable = etherHistoryTable.clone();
            _copy.etherHistoryTable.set_ParentEntity(_copy);
        }
        if (alarmTable!= null) {
            _copy.alarmTable = alarmTable.clone();
            _copy.alarmTable.set_ParentEntity(_copy);
        }
        if (hostControlTable!= null) {
            _copy.hostControlTable = hostControlTable.clone();
            _copy.hostControlTable.set_ParentEntity(_copy);
        }
        if (hostTable!= null) {
            _copy.hostTable = hostTable.clone();
            _copy.hostTable.set_ParentEntity(_copy);
        }
        if (hostTimeTable!= null) {
            _copy.hostTimeTable = hostTimeTable.clone();
            _copy.hostTimeTable.set_ParentEntity(_copy);
        }
        if (hostTopNControlTable!= null) {
            _copy.hostTopNControlTable = hostTopNControlTable.clone();
            _copy.hostTopNControlTable.set_ParentEntity(_copy);
        }
        if (hostTopNTable!= null) {
            _copy.hostTopNTable = hostTopNTable.clone();
            _copy.hostTopNTable.set_ParentEntity(_copy);
        }
        if (matrixControlTable!= null) {
            _copy.matrixControlTable = matrixControlTable.clone();
            _copy.matrixControlTable.set_ParentEntity(_copy);
        }
        if (matrixSDTable!= null) {
            _copy.matrixSDTable = matrixSDTable.clone();
            _copy.matrixSDTable.set_ParentEntity(_copy);
        }
        if (matrixDSTable!= null) {
            _copy.matrixDSTable = matrixDSTable.clone();
            _copy.matrixDSTable.set_ParentEntity(_copy);
        }
        if (filterTable!= null) {
            _copy.filterTable = filterTable.clone();
            _copy.filterTable.set_ParentEntity(_copy);
        }
        if (channelTable!= null) {
            _copy.channelTable = channelTable.clone();
            _copy.channelTable.set_ParentEntity(_copy);
        }
        if (bufferControlTable!= null) {
            _copy.bufferControlTable = bufferControlTable.clone();
            _copy.bufferControlTable.set_ParentEntity(_copy);
        }
        if (captureBufferTable!= null) {
            _copy.captureBufferTable = captureBufferTable.clone();
            _copy.captureBufferTable.set_ParentEntity(_copy);
        }
        if (eventTable!= null) {
            _copy.eventTable = eventTable.clone();
            _copy.eventTable.set_ParentEntity(_copy);
        }
        if (logTable!= null) {
            _copy.logTable = logTable.clone();
            _copy.logTable.set_ParentEntity(_copy);
        }
        if (interfaces!= null) {
            _copy.interfaces = interfaces.clone();
            _copy.interfaces.set_ParentEntity(_copy);
        }
        if (ifTable!= null) {
            _copy.ifTable = ifTable.clone();
            _copy.ifTable.set_ParentEntity(_copy);
        }
        if (hrSystem!= null) {
            _copy.hrSystem = hrSystem.clone();
            _copy.hrSystem.set_ParentEntity(_copy);
        }
        if (hrStorage!= null) {
            _copy.hrStorage = hrStorage.clone();
            _copy.hrStorage.set_ParentEntity(_copy);
        }
        if (hrStorageTable!= null) {
            _copy.hrStorageTable = hrStorageTable.clone();
            _copy.hrStorageTable.set_ParentEntity(_copy);
        }
        if (hrDeviceTable!= null) {
            _copy.hrDeviceTable = hrDeviceTable.clone();
            _copy.hrDeviceTable.set_ParentEntity(_copy);
        }
        if (hrProcessorTable!= null) {
            _copy.hrProcessorTable = hrProcessorTable.clone();
            _copy.hrProcessorTable.set_ParentEntity(_copy);
        }
        if (hrNetworkTable!= null) {
            _copy.hrNetworkTable = hrNetworkTable.clone();
            _copy.hrNetworkTable.set_ParentEntity(_copy);
        }
        if (hrPrinterTable!= null) {
            _copy.hrPrinterTable = hrPrinterTable.clone();
            _copy.hrPrinterTable.set_ParentEntity(_copy);
        }
        if (hrDiskStorageTable!= null) {
            _copy.hrDiskStorageTable = hrDiskStorageTable.clone();
            _copy.hrDiskStorageTable.set_ParentEntity(_copy);
        }
        if (hrPartitionTable!= null) {
            _copy.hrPartitionTable = hrPartitionTable.clone();
            _copy.hrPartitionTable.set_ParentEntity(_copy);
        }
        if (hrFSTable!= null) {
            _copy.hrFSTable = hrFSTable.clone();
            _copy.hrFSTable.set_ParentEntity(_copy);
        }
        if (hrSWRun!= null) {
            _copy.hrSWRun = hrSWRun.clone();
            _copy.hrSWRun.set_ParentEntity(_copy);
        }
        if (hrSWRunTable!= null) {
            _copy.hrSWRunTable = hrSWRunTable.clone();
            _copy.hrSWRunTable.set_ParentEntity(_copy);
        }
        if (hrSWRunPerfTable!= null) {
            _copy.hrSWRunPerfTable = hrSWRunPerfTable.clone();
            _copy.hrSWRunPerfTable.set_ParentEntity(_copy);
        }
        if (hrSWInstalled!= null) {
            _copy.hrSWInstalled = hrSWInstalled.clone();
            _copy.hrSWInstalled.set_ParentEntity(_copy);
        }
        if (hrSWInstalledTable!= null) {
            _copy.hrSWInstalledTable = hrSWInstalledTable.clone();
            _copy.hrSWInstalledTable.set_ParentEntity(_copy);
        }
        if (applTable!= null) {
            _copy.applTable = applTable.clone();
            _copy.applTable.set_ParentEntity(_copy);
        }
        if (assocTable!= null) {
            _copy.assocTable = assocTable.clone();
            _copy.assocTable.set_ParentEntity(_copy);
        }
        if (mtaTable!= null) {
            _copy.mtaTable = mtaTable.clone();
            _copy.mtaTable.set_ParentEntity(_copy);
        }
        if (mtaGroupTable!= null) {
            _copy.mtaGroupTable = mtaGroupTable.clone();
            _copy.mtaGroupTable.set_ParentEntity(_copy);
        }
        if (mtaGroupAssociationTable!= null) {
            _copy.mtaGroupAssociationTable = mtaGroupAssociationTable.clone();
            _copy.mtaGroupAssociationTable.set_ParentEntity(_copy);
        }
        if (mtaGroupErrorTable!= null) {
            _copy.mtaGroupErrorTable = mtaGroupErrorTable.clone();
            _copy.mtaGroupErrorTable.set_ParentEntity(_copy);
        }
        if (atTable!= null) {
            _copy.atTable = atTable.clone();
            _copy.atTable.set_ParentEntity(_copy);
        }
        if (ifMIBObjects!= null) {
            _copy.ifMIBObjects = ifMIBObjects.clone();
            _copy.ifMIBObjects.set_ParentEntity(_copy);
        }
        if (ifXTable!= null) {
            _copy.ifXTable = ifXTable.clone();
            _copy.ifXTable.set_ParentEntity(_copy);
        }
        if (ifStackTable!= null) {
            _copy.ifStackTable = ifStackTable.clone();
            _copy.ifStackTable.set_ParentEntity(_copy);
        }
        if (ifTestTable!= null) {
            _copy.ifTestTable = ifTestTable.clone();
            _copy.ifTestTable.set_ParentEntity(_copy);
        }
        if (ifRcvAddressTable!= null) {
            _copy.ifRcvAddressTable = ifRcvAddressTable.clone();
            _copy.ifRcvAddressTable.set_ParentEntity(_copy);
        }
        if (ip!= null) {
            _copy.ip = ip.clone();
            _copy.ip.set_ParentEntity(_copy);
        }
        if (ipAddrTable!= null) {
            _copy.ipAddrTable = ipAddrTable.clone();
            _copy.ipAddrTable.set_ParentEntity(_copy);
        }
        if (ipRouteTable!= null) {
            _copy.ipRouteTable = ipRouteTable.clone();
            _copy.ipRouteTable.set_ParentEntity(_copy);
        }
        if (ipNetToMediaTable!= null) {
            _copy.ipNetToMediaTable = ipNetToMediaTable.clone();
            _copy.ipNetToMediaTable.set_ParentEntity(_copy);
        }
        if (ipForward!= null) {
            _copy.ipForward = ipForward.clone();
            _copy.ipForward.set_ParentEntity(_copy);
        }
        if (ipForwardTable!= null) {
            _copy.ipForwardTable = ipForwardTable.clone();
            _copy.ipForwardTable.set_ParentEntity(_copy);
        }
        if (ipCidrRouteTable!= null) {
            _copy.ipCidrRouteTable = ipCidrRouteTable.clone();
            _copy.ipCidrRouteTable.set_ParentEntity(_copy);
        }
        if (inetCidrRouteTable!= null) {
            _copy.inetCidrRouteTable = inetCidrRouteTable.clone();
            _copy.inetCidrRouteTable.set_ParentEntity(_copy);
        }
        if (ipv4InterfaceTable!= null) {
            _copy.ipv4InterfaceTable = ipv4InterfaceTable.clone();
            _copy.ipv4InterfaceTable.set_ParentEntity(_copy);
        }
        if (ipv6InterfaceTable!= null) {
            _copy.ipv6InterfaceTable = ipv6InterfaceTable.clone();
            _copy.ipv6InterfaceTable.set_ParentEntity(_copy);
        }
        if (ipTrafficStats!= null) {
            _copy.ipTrafficStats = ipTrafficStats.clone();
            _copy.ipTrafficStats.set_ParentEntity(_copy);
        }
        if (ipSystemStatsTable!= null) {
            _copy.ipSystemStatsTable = ipSystemStatsTable.clone();
            _copy.ipSystemStatsTable.set_ParentEntity(_copy);
        }
        if (ipIfStatsTable!= null) {
            _copy.ipIfStatsTable = ipIfStatsTable.clone();
            _copy.ipIfStatsTable.set_ParentEntity(_copy);
        }
        if (ipAddressPrefixTable!= null) {
            _copy.ipAddressPrefixTable = ipAddressPrefixTable.clone();
            _copy.ipAddressPrefixTable.set_ParentEntity(_copy);
        }
        if (ipAddressTable!= null) {
            _copy.ipAddressTable = ipAddressTable.clone();
            _copy.ipAddressTable.set_ParentEntity(_copy);
        }
        if (ipNetToPhysicalTable!= null) {
            _copy.ipNetToPhysicalTable = ipNetToPhysicalTable.clone();
            _copy.ipNetToPhysicalTable.set_ParentEntity(_copy);
        }
        if (ipv6ScopeZoneIndexTable!= null) {
            _copy.ipv6ScopeZoneIndexTable = ipv6ScopeZoneIndexTable.clone();
            _copy.ipv6ScopeZoneIndexTable.set_ParentEntity(_copy);
        }
        if (ipDefaultRouterTable!= null) {
            _copy.ipDefaultRouterTable = ipDefaultRouterTable.clone();
            _copy.ipDefaultRouterTable.set_ParentEntity(_copy);
        }
        if (ipv6RouterAdvertTable!= null) {
            _copy.ipv6RouterAdvertTable = ipv6RouterAdvertTable.clone();
            _copy.ipv6RouterAdvertTable.set_ParentEntity(_copy);
        }
        if (icmp!= null) {
            _copy.icmp = icmp.clone();
            _copy.icmp.set_ParentEntity(_copy);
        }
        if (icmpStatsTable!= null) {
            _copy.icmpStatsTable = icmpStatsTable.clone();
            _copy.icmpStatsTable.set_ParentEntity(_copy);
        }
        if (icmpMsgStatsTable!= null) {
            _copy.icmpMsgStatsTable = icmpMsgStatsTable.clone();
            _copy.icmpMsgStatsTable.set_ParentEntity(_copy);
        }
        if (ipv6MIBObjects!= null) {
            _copy.ipv6MIBObjects = ipv6MIBObjects.clone();
            _copy.ipv6MIBObjects.set_ParentEntity(_copy);
        }
        if (ipv6RouteTable!= null) {
            _copy.ipv6RouteTable = ipv6RouteTable.clone();
            _copy.ipv6RouteTable.set_ParentEntity(_copy);
        }
        if (ipv6NetToMediaTable!= null) {
            _copy.ipv6NetToMediaTable = ipv6NetToMediaTable.clone();
            _copy.ipv6NetToMediaTable.set_ParentEntity(_copy);
        }
        if (ipv6IfTable!= null) {
            _copy.ipv6IfTable = ipv6IfTable.clone();
            _copy.ipv6IfTable.set_ParentEntity(_copy);
        }
        if (ipv6IfStatsTable!= null) {
            _copy.ipv6IfStatsTable = ipv6IfStatsTable.clone();
            _copy.ipv6IfStatsTable.set_ParentEntity(_copy);
        }
        if (ipv6AddrPrefixTable!= null) {
            _copy.ipv6AddrPrefixTable = ipv6AddrPrefixTable.clone();
            _copy.ipv6AddrPrefixTable.set_ParentEntity(_copy);
        }
        if (ipv6AddrTable!= null) {
            _copy.ipv6AddrTable = ipv6AddrTable.clone();
            _copy.ipv6AddrTable.set_ParentEntity(_copy);
        }
        if (ipv6IfIcmpTable!= null) {
            _copy.ipv6IfIcmpTable = ipv6IfIcmpTable.clone();
            _copy.ipv6IfIcmpTable.set_ParentEntity(_copy);
        }
        if (tcp!= null) {
            _copy.tcp = tcp.clone();
            _copy.tcp.set_ParentEntity(_copy);
        }
        if (tcpConnTable!= null) {
            _copy.tcpConnTable = tcpConnTable.clone();
            _copy.tcpConnTable.set_ParentEntity(_copy);
        }
        if (ipv6TcpConnTable!= null) {
            _copy.ipv6TcpConnTable = ipv6TcpConnTable.clone();
            _copy.ipv6TcpConnTable.set_ParentEntity(_copy);
        }
        if (tcpConnectionTable!= null) {
            _copy.tcpConnectionTable = tcpConnectionTable.clone();
            _copy.tcpConnectionTable.set_ParentEntity(_copy);
        }
        if (tcpListenerTable!= null) {
            _copy.tcpListenerTable = tcpListenerTable.clone();
            _copy.tcpListenerTable.set_ParentEntity(_copy);
        }
        if (schedObjects!= null) {
            _copy.schedObjects = schedObjects.clone();
            _copy.schedObjects.set_ParentEntity(_copy);
        }
        if (schedTable!= null) {
            _copy.schedTable = schedTable.clone();
            _copy.schedTable.set_ParentEntity(_copy);
        }
        if (smLangTable!= null) {
            _copy.smLangTable = smLangTable.clone();
            _copy.smLangTable.set_ParentEntity(_copy);
        }
        if (smExtsnTable!= null) {
            _copy.smExtsnTable = smExtsnTable.clone();
            _copy.smExtsnTable.set_ParentEntity(_copy);
        }
        if (smScriptTable!= null) {
            _copy.smScriptTable = smScriptTable.clone();
            _copy.smScriptTable.set_ParentEntity(_copy);
        }
        if (smCodeTable!= null) {
            _copy.smCodeTable = smCodeTable.clone();
            _copy.smCodeTable.set_ParentEntity(_copy);
        }
        if (smLaunchTable!= null) {
            _copy.smLaunchTable = smLaunchTable.clone();
            _copy.smLaunchTable.set_ParentEntity(_copy);
        }
        if (smRunTable!= null) {
            _copy.smRunTable = smRunTable.clone();
            _copy.smRunTable.set_ParentEntity(_copy);
        }
        if (udp!= null) {
            _copy.udp = udp.clone();
            _copy.udp.set_ParentEntity(_copy);
        }
        if (udpTable!= null) {
            _copy.udpTable = udpTable.clone();
            _copy.udpTable.set_ParentEntity(_copy);
        }
        if (ipv6UdpTable!= null) {
            _copy.ipv6UdpTable = ipv6UdpTable.clone();
            _copy.ipv6UdpTable.set_ParentEntity(_copy);
        }
        if (udpEndpointTable!= null) {
            _copy.udpEndpointTable = udpEndpointTable.clone();
            _copy.udpEndpointTable.set_ParentEntity(_copy);
        }
        if (agentxGeneral!= null) {
            _copy.agentxGeneral = agentxGeneral.clone();
            _copy.agentxGeneral.set_ParentEntity(_copy);
        }
        if (agentxConnection!= null) {
            _copy.agentxConnection = agentxConnection.clone();
            _copy.agentxConnection.set_ParentEntity(_copy);
        }
        if (agentxConnectionTable!= null) {
            _copy.agentxConnectionTable = agentxConnectionTable.clone();
            _copy.agentxConnectionTable.set_ParentEntity(_copy);
        }
        if (agentxSession!= null) {
            _copy.agentxSession = agentxSession.clone();
            _copy.agentxSession.set_ParentEntity(_copy);
        }
        if (agentxSessionTable!= null) {
            _copy.agentxSessionTable = agentxSessionTable.clone();
            _copy.agentxSessionTable.set_ParentEntity(_copy);
        }
        if (agentxRegistration!= null) {
            _copy.agentxRegistration = agentxRegistration.clone();
            _copy.agentxRegistration.set_ParentEntity(_copy);
        }
        if (agentxRegistrationTable!= null) {
            _copy.agentxRegistrationTable = agentxRegistrationTable.clone();
            _copy.agentxRegistrationTable.set_ParentEntity(_copy);
        }
        if (ifInvStackTable!= null) {
            _copy.ifInvStackTable = ifInvStackTable.clone();
            _copy.ifInvStackTable.set_ParentEntity(_copy);
        }
        if (egp!= null) {
            _copy.egp = egp.clone();
            _copy.egp.set_ParentEntity(_copy);
        }
        if (egpNeighTable!= null) {
            _copy.egpNeighTable = egpNeighTable.clone();
            _copy.egpNeighTable.set_ParentEntity(_copy);
        }
        if (mteResource!= null) {
            _copy.mteResource = mteResource.clone();
            _copy.mteResource.set_ParentEntity(_copy);
        }
        if (mteTrigger!= null) {
            _copy.mteTrigger = mteTrigger.clone();
            _copy.mteTrigger.set_ParentEntity(_copy);
        }
        if (mteTriggerTable!= null) {
            _copy.mteTriggerTable = mteTriggerTable.clone();
            _copy.mteTriggerTable.set_ParentEntity(_copy);
        }
        if (mteTriggerDeltaTable!= null) {
            _copy.mteTriggerDeltaTable = mteTriggerDeltaTable.clone();
            _copy.mteTriggerDeltaTable.set_ParentEntity(_copy);
        }
        if (mteTriggerExistenceTable!= null) {
            _copy.mteTriggerExistenceTable = mteTriggerExistenceTable.clone();
            _copy.mteTriggerExistenceTable.set_ParentEntity(_copy);
        }
        if (mteTriggerBooleanTable!= null) {
            _copy.mteTriggerBooleanTable = mteTriggerBooleanTable.clone();
            _copy.mteTriggerBooleanTable.set_ParentEntity(_copy);
        }
        if (mteTriggerThresholdTable!= null) {
            _copy.mteTriggerThresholdTable = mteTriggerThresholdTable.clone();
            _copy.mteTriggerThresholdTable.set_ParentEntity(_copy);
        }
        if (mteObjectsTable!= null) {
            _copy.mteObjectsTable = mteObjectsTable.clone();
            _copy.mteObjectsTable.set_ParentEntity(_copy);
        }
        if (mteEvent!= null) {
            _copy.mteEvent = mteEvent.clone();
            _copy.mteEvent.set_ParentEntity(_copy);
        }
        if (mteEventTable!= null) {
            _copy.mteEventTable = mteEventTable.clone();
            _copy.mteEventTable.set_ParentEntity(_copy);
        }
        if (mteEventNotificationTable!= null) {
            _copy.mteEventNotificationTable = mteEventNotificationTable.clone();
            _copy.mteEventNotificationTable.set_ParentEntity(_copy);
        }
        if (mteEventSetTable!= null) {
            _copy.mteEventSetTable = mteEventSetTable.clone();
            _copy.mteEventSetTable.set_ParentEntity(_copy);
        }
        if (dismanEventMIBNotificationObjects!= null) {
            _copy.dismanEventMIBNotificationObjects = dismanEventMIBNotificationObjects.clone();
            _copy.dismanEventMIBNotificationObjects.set_ParentEntity(_copy);
        }
        if (nlmConfig!= null) {
            _copy.nlmConfig = nlmConfig.clone();
            _copy.nlmConfig.set_ParentEntity(_copy);
        }
        if (nlmConfigLogTable!= null) {
            _copy.nlmConfigLogTable = nlmConfigLogTable.clone();
            _copy.nlmConfigLogTable.set_ParentEntity(_copy);
        }
        if (nlmStats!= null) {
            _copy.nlmStats = nlmStats.clone();
            _copy.nlmStats.set_ParentEntity(_copy);
        }
        if (nlmStatsLogTable!= null) {
            _copy.nlmStatsLogTable = nlmStatsLogTable.clone();
            _copy.nlmStatsLogTable.set_ParentEntity(_copy);
        }
        if (nlmLogTable!= null) {
            _copy.nlmLogTable = nlmLogTable.clone();
            _copy.nlmLogTable.set_ParentEntity(_copy);
        }
        if (nlmLogVariableTable!= null) {
            _copy.nlmLogVariableTable = nlmLogVariableTable.clone();
            _copy.nlmLogVariableTable.set_ParentEntity(_copy);
        }
        return _copy;
    }

    public DeviceEntity[] getRoots() {
        return new DeviceEntity[] {tcpConnectionTable, dot3HCStatsTable, ipv6IfTable, ipv6IfStatsTable, ipv6AddrPrefixTable, ipv6AddrTable, ipv6TcpConnTable, tcpConnTable, ipAddrTable, ipRouteTable, tcpListenerTable, dot3PauseTable, egp, tcp, udp, ipNetToMediaTable, ipForward, ipv4InterfaceTable, agentxConnectionTable, ipv6InterfaceTable, ipTrafficStats, ipAddressPrefixTable, system, agentxSessionTable, eventTable, logTable, icmp, ip, interfaces, mteObjectsTable, hostTopNControlTable, hostTopNTable, ifRcvAddressTable, ifTestTable, ipv6RouterAdvertTable, snmp, ipDefaultRouterTable, ipv6ScopeZoneIndexTable, ipNetToPhysicalTable, ifStackTable, ipAddressTable, ifXTable, channelTable, ifInvStackTable, filterTable, dismanEventMIBNotificationObjects, schedObjects, nlmLogTable, nlmLogVariableTable, icmpStatsTable, atTable, sysORTable, ipv6MIBObjects, agentxRegistration, agentxGeneral, icmpMsgStatsTable, agentxSession, agentxConnection, dot3CollTable, historyControlTable, etherHistoryTable, smScriptTable, dot3StatsTable, dot3ControlTable, etherStatsTable, nlmConfigLogTable, ipIfStatsTable, schedTable, ipSystemStatsTable, mteEvent, mteResource, ipv6IfIcmpTable, mteTrigger, nlmStatsLogTable, smCodeTable, ipv6RouteTable, mtaTable, ipv6NetToMediaTable, smRunTable, smLaunchTable, captureBufferTable, bufferControlTable, applTable, assocTable, smLangTable, smExtsnTable, alarmTable, mtaGroupTable, mtaGroupAssociationTable, mtaGroupErrorTable, hostTimeTable, hostControlTable, hostTable, mteTriggerBooleanTable, mteTriggerThresholdTable, sctpLookupRemPrimIPAddrTable, sctpLookupRemHostNameTable, sctpLookupRemPortTable, hrSWInstalled, mteTriggerTable, sctpLookupLocalPortTable, ipCidrRouteTable, mteTriggerDeltaTable, sctpAssocRemAddrTable, inetCidrRouteTable, mteTriggerExistenceTable, sctpAssocLocalAddrTable, sctpAssocTable, hrStorageTable, sctpParams, sctpStats, ipForwardTable, agentxRegistrationTable, matrixDSTable, mteEventSetTable, hrSystem, mteEventNotificationTable, hrStorage, matrixSDTable, matrixControlTable, hrSWRun, mteEventTable, nlmConfig, egpNeighTable, nlmStats, ifTable, udpTable, hrSWRunTable, ipv6UdpTable, udpEndpointTable, hrFSTable, hrSWRunPerfTable, ifMIBObjects, hrPartitionTable, hrDiskStorageTable, hrPrinterTable, hrNetworkTable, hrProcessorTable, hrDeviceTable, sctpLookupRemIPAddrTable, hrSWInstalledTable };
    }

}
