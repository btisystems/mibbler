
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
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.Dot1dBase;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.Dot1dStp;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.Dot1dTp;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dbase.Dot1dBasePortTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dstatic.Dot1dStaticTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dstp.Dot1dStpPortTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dtp.Dot1dTpFdbTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dtp.Dot1dTpHCPortTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dtp.Dot1dTpPortOverflowTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dtp.Dot1dTpPortTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.Dot1dExtBase;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dextbase.Dot1dPortCapabilitiesTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgarp.Dot1dPortGarpTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgmrp.Dot1dPortGmrpTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.Dot1dPortOutboundAccessPriorityTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.Dot1dPortPriorityTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.Dot1dTrafficClassTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.Dot1dUserPriorityRegenTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.Dot1qBase;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.Dot1qVlan;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.Dot1qStaticMulticastTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.Dot1qStaticUnicastTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.Dot1qFdbTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.Dot1qForwardAllTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.Dot1qForwardUnregisteredTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.Dot1qTpFdbTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.Dot1qTpGroupTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.Dot1qLearningConstraintsTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.Dot1qPortVlanHCStatisticsTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.Dot1qPortVlanStatisticsTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.Dot1qPortVlanTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.Dot1qVlanCurrentTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.Dot1qVlanStaticTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.RadiusAccClient;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.radiusaccclient.RadiusAccServerTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.RadiusAuthClient;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.radiusauthclient.RadiusAuthServerTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.AddressMap;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.ProbeConfig;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.ProtocolDir;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.addressmap.AddressMapControlTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.addressmap.AddressMapTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.alhost.AlHostTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.almatrix.AlMatrixDSTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.almatrix.AlMatrixSDTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.almatrix.AlMatrixTopNControlTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.almatrix.AlMatrixTopNTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.filter.Channel2Table;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.filter.Filter2Table;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.history.HistoryControl2Table;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.history.TokenRingMLHistoryTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.history.TokenRingPHistoryTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.hosts.HostControl2Table;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.matrix.MatrixControl2Table;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlhost.HlHostControlTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlhost.NlHostTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.HlMatrixControlTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.NlMatrixDSTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.NlMatrixSDTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.NlMatrixTopNControlTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.NlMatrixTopNTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.probeconfig.NetConfigTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.probeconfig.SerialConfigTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.probeconfig.SerialConnectionTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.probeconfig.TrapDestTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.protocoldir.ProtocolDirTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.protocoldist.ProtocolDistControlTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.protocoldist.ProtocolDistStatsTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.EtherStats2Table;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.TokenRingMLStats2Table;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.TokenRingMLStatsTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.TokenRingPStats2Table;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.TokenRingPStatsTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.RingStationConfigControlTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.RingStationConfigTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.RingStationControl2Table;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.RingStationControlTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.RingStationOrderTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.RingStationTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.SourceRoutingStats2Table;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.tokenring.SourceRoutingStatsTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.usrhistory.UsrHistoryControlTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.usrhistory.UsrHistoryObjectTable;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.usrhistory.UsrHistoryTable;
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
    private TokenRingMLStatsTable tokenRingMLStatsTable;
    private TokenRingPStatsTable tokenRingPStatsTable;
    private EtherStats2Table etherStats2Table;
    private TokenRingMLStats2Table tokenRingMLStats2Table;
    private TokenRingPStats2Table tokenRingPStats2Table;
    private RingStationControlTable ringStationControlTable;
    private RingStationTable ringStationTable;
    private RingStationOrderTable ringStationOrderTable;
    private RingStationConfigControlTable ringStationConfigControlTable;
    private RingStationConfigTable ringStationConfigTable;
    private SourceRoutingStatsTable sourceRoutingStatsTable;
    private RingStationControl2Table ringStationControl2Table;
    private SourceRoutingStats2Table sourceRoutingStats2Table;
    private ProtocolDir protocolDir;
    private ProtocolDirTable protocolDirTable;
    private ProtocolDistControlTable protocolDistControlTable;
    private ProtocolDistStatsTable protocolDistStatsTable;
    private AddressMap addressMap;
    private AddressMapControlTable addressMapControlTable;
    private AddressMapTable addressMapTable;
    private HlHostControlTable hlHostControlTable;
    private NlHostTable nlHostTable;
    private HlMatrixControlTable hlMatrixControlTable;
    private NlMatrixSDTable nlMatrixSDTable;
    private NlMatrixDSTable nlMatrixDSTable;
    private NlMatrixTopNControlTable nlMatrixTopNControlTable;
    private NlMatrixTopNTable nlMatrixTopNTable;
    private AlHostTable alHostTable;
    private AlMatrixSDTable alMatrixSDTable;
    private AlMatrixDSTable alMatrixDSTable;
    private AlMatrixTopNControlTable alMatrixTopNControlTable;
    private AlMatrixTopNTable alMatrixTopNTable;
    private UsrHistoryControlTable usrHistoryControlTable;
    private UsrHistoryObjectTable usrHistoryObjectTable;
    private UsrHistoryTable usrHistoryTable;
    private ProbeConfig probeConfig;
    private SerialConfigTable serialConfigTable;
    private NetConfigTable netConfigTable;
    private TrapDestTable trapDestTable;
    private SerialConnectionTable serialConnectionTable;
    private HistoryControlTable historyControlTable;
    private EtherHistoryTable etherHistoryTable;
    private TokenRingMLHistoryTable tokenRingMLHistoryTable;
    private TokenRingPHistoryTable tokenRingPHistoryTable;
    private HistoryControl2Table historyControl2Table;
    private AlarmTable alarmTable;
    private HostControlTable hostControlTable;
    private HostTable hostTable;
    private HostTimeTable hostTimeTable;
    private HostControl2Table hostControl2Table;
    private HostTopNControlTable hostTopNControlTable;
    private HostTopNTable hostTopNTable;
    private MatrixControlTable matrixControlTable;
    private MatrixSDTable matrixSDTable;
    private MatrixDSTable matrixDSTable;
    private MatrixControl2Table matrixControl2Table;
    private FilterTable filterTable;
    private ChannelTable channelTable;
    private Channel2Table channel2Table;
    private Filter2Table filter2Table;
    private BufferControlTable bufferControlTable;
    private CaptureBufferTable captureBufferTable;
    private EventTable eventTable;
    private LogTable logTable;
    private Dot1dBase dot1dBase;
    private Dot1dBasePortTable dot1dBasePortTable;
    private Dot1dStp dot1dStp;
    private Dot1dStpPortTable dot1dStpPortTable;
    private Dot1dTp dot1dTp;
    private Dot1dTpFdbTable dot1dTpFdbTable;
    private Dot1dTpPortTable dot1dTpPortTable;
    private Dot1dTpHCPortTable dot1dTpHCPortTable;
    private Dot1dTpPortOverflowTable dot1dTpPortOverflowTable;
    private Dot1dStaticTable dot1dStaticTable;
    private Dot1dExtBase dot1dExtBase;
    private Dot1dPortCapabilitiesTable dot1dPortCapabilitiesTable;
    private Dot1dPortPriorityTable dot1dPortPriorityTable;
    private Dot1dUserPriorityRegenTable dot1dUserPriorityRegenTable;
    private Dot1dTrafficClassTable dot1dTrafficClassTable;
    private Dot1dPortOutboundAccessPriorityTable dot1dPortOutboundAccessPriorityTable;
    private Dot1dPortGarpTable dot1dPortGarpTable;
    private Dot1dPortGmrpTable dot1dPortGmrpTable;
    private Dot1qBase dot1qBase;
    private Dot1qFdbTable dot1qFdbTable;
    private Dot1qTpFdbTable dot1qTpFdbTable;
    private Dot1qTpGroupTable dot1qTpGroupTable;
    private Dot1qForwardAllTable dot1qForwardAllTable;
    private Dot1qForwardUnregisteredTable dot1qForwardUnregisteredTable;
    private Dot1qStaticUnicastTable dot1qStaticUnicastTable;
    private Dot1qStaticMulticastTable dot1qStaticMulticastTable;
    private Dot1qVlan dot1qVlan;
    private Dot1qVlanCurrentTable dot1qVlanCurrentTable;
    private Dot1qVlanStaticTable dot1qVlanStaticTable;
    private Dot1qPortVlanTable dot1qPortVlanTable;
    private Dot1qPortVlanStatisticsTable dot1qPortVlanStatisticsTable;
    private Dot1qPortVlanHCStatisticsTable dot1qPortVlanHCStatisticsTable;
    private Dot1qLearningConstraintsTable dot1qLearningConstraintsTable;
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
    private RadiusAuthClient radiusAuthClient;
    private RadiusAuthServerTable radiusAuthServerTable;
    private RadiusAccClient radiusAccClient;
    private RadiusAccServerTable radiusAccServerTable;
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

    public TokenRingMLStatsTable getTokenRingMLStatsTable() {
        return this.tokenRingMLStatsTable;
    }

    public void setTokenRingMLStatsTable(TokenRingMLStatsTable tokenRingMLStatsTable) {
        TokenRingMLStatsTable oldValue = getTokenRingMLStatsTable();
        this.tokenRingMLStatsTable = tokenRingMLStatsTable;
        replaceChild(oldValue, tokenRingMLStatsTable);
    }

    public TokenRingPStatsTable getTokenRingPStatsTable() {
        return this.tokenRingPStatsTable;
    }

    public void setTokenRingPStatsTable(TokenRingPStatsTable tokenRingPStatsTable) {
        TokenRingPStatsTable oldValue = getTokenRingPStatsTable();
        this.tokenRingPStatsTable = tokenRingPStatsTable;
        replaceChild(oldValue, tokenRingPStatsTable);
    }

    public EtherStats2Table getEtherStats2Table() {
        return this.etherStats2Table;
    }

    public void setEtherStats2Table(EtherStats2Table etherStats2Table) {
        EtherStats2Table oldValue = getEtherStats2Table();
        this.etherStats2Table = etherStats2Table;
        replaceChild(oldValue, etherStats2Table);
    }

    public TokenRingMLStats2Table getTokenRingMLStats2Table() {
        return this.tokenRingMLStats2Table;
    }

    public void setTokenRingMLStats2Table(TokenRingMLStats2Table tokenRingMLStats2Table) {
        TokenRingMLStats2Table oldValue = getTokenRingMLStats2Table();
        this.tokenRingMLStats2Table = tokenRingMLStats2Table;
        replaceChild(oldValue, tokenRingMLStats2Table);
    }

    public TokenRingPStats2Table getTokenRingPStats2Table() {
        return this.tokenRingPStats2Table;
    }

    public void setTokenRingPStats2Table(TokenRingPStats2Table tokenRingPStats2Table) {
        TokenRingPStats2Table oldValue = getTokenRingPStats2Table();
        this.tokenRingPStats2Table = tokenRingPStats2Table;
        replaceChild(oldValue, tokenRingPStats2Table);
    }

    public RingStationControlTable getRingStationControlTable() {
        return this.ringStationControlTable;
    }

    public void setRingStationControlTable(RingStationControlTable ringStationControlTable) {
        RingStationControlTable oldValue = getRingStationControlTable();
        this.ringStationControlTable = ringStationControlTable;
        replaceChild(oldValue, ringStationControlTable);
    }

    public RingStationTable getRingStationTable() {
        return this.ringStationTable;
    }

    public void setRingStationTable(RingStationTable ringStationTable) {
        RingStationTable oldValue = getRingStationTable();
        this.ringStationTable = ringStationTable;
        replaceChild(oldValue, ringStationTable);
    }

    public RingStationOrderTable getRingStationOrderTable() {
        return this.ringStationOrderTable;
    }

    public void setRingStationOrderTable(RingStationOrderTable ringStationOrderTable) {
        RingStationOrderTable oldValue = getRingStationOrderTable();
        this.ringStationOrderTable = ringStationOrderTable;
        replaceChild(oldValue, ringStationOrderTable);
    }

    public RingStationConfigControlTable getRingStationConfigControlTable() {
        return this.ringStationConfigControlTable;
    }

    public void setRingStationConfigControlTable(RingStationConfigControlTable ringStationConfigControlTable) {
        RingStationConfigControlTable oldValue = getRingStationConfigControlTable();
        this.ringStationConfigControlTable = ringStationConfigControlTable;
        replaceChild(oldValue, ringStationConfigControlTable);
    }

    public RingStationConfigTable getRingStationConfigTable() {
        return this.ringStationConfigTable;
    }

    public void setRingStationConfigTable(RingStationConfigTable ringStationConfigTable) {
        RingStationConfigTable oldValue = getRingStationConfigTable();
        this.ringStationConfigTable = ringStationConfigTable;
        replaceChild(oldValue, ringStationConfigTable);
    }

    public SourceRoutingStatsTable getSourceRoutingStatsTable() {
        return this.sourceRoutingStatsTable;
    }

    public void setSourceRoutingStatsTable(SourceRoutingStatsTable sourceRoutingStatsTable) {
        SourceRoutingStatsTable oldValue = getSourceRoutingStatsTable();
        this.sourceRoutingStatsTable = sourceRoutingStatsTable;
        replaceChild(oldValue, sourceRoutingStatsTable);
    }

    public RingStationControl2Table getRingStationControl2Table() {
        return this.ringStationControl2Table;
    }

    public void setRingStationControl2Table(RingStationControl2Table ringStationControl2Table) {
        RingStationControl2Table oldValue = getRingStationControl2Table();
        this.ringStationControl2Table = ringStationControl2Table;
        replaceChild(oldValue, ringStationControl2Table);
    }

    public SourceRoutingStats2Table getSourceRoutingStats2Table() {
        return this.sourceRoutingStats2Table;
    }

    public void setSourceRoutingStats2Table(SourceRoutingStats2Table sourceRoutingStats2Table) {
        SourceRoutingStats2Table oldValue = getSourceRoutingStats2Table();
        this.sourceRoutingStats2Table = sourceRoutingStats2Table;
        replaceChild(oldValue, sourceRoutingStats2Table);
    }

    public ProtocolDir getProtocolDir() {
        return this.protocolDir;
    }

    public void setProtocolDir(ProtocolDir protocolDir) {
        ProtocolDir oldValue = getProtocolDir();
        this.protocolDir = protocolDir;
        replaceChild(oldValue, protocolDir);
    }

    public ProtocolDirTable getProtocolDirTable() {
        return this.protocolDirTable;
    }

    public void setProtocolDirTable(ProtocolDirTable protocolDirTable) {
        ProtocolDirTable oldValue = getProtocolDirTable();
        this.protocolDirTable = protocolDirTable;
        replaceChild(oldValue, protocolDirTable);
    }

    public ProtocolDistControlTable getProtocolDistControlTable() {
        return this.protocolDistControlTable;
    }

    public void setProtocolDistControlTable(ProtocolDistControlTable protocolDistControlTable) {
        ProtocolDistControlTable oldValue = getProtocolDistControlTable();
        this.protocolDistControlTable = protocolDistControlTable;
        replaceChild(oldValue, protocolDistControlTable);
    }

    public ProtocolDistStatsTable getProtocolDistStatsTable() {
        return this.protocolDistStatsTable;
    }

    public void setProtocolDistStatsTable(ProtocolDistStatsTable protocolDistStatsTable) {
        ProtocolDistStatsTable oldValue = getProtocolDistStatsTable();
        this.protocolDistStatsTable = protocolDistStatsTable;
        replaceChild(oldValue, protocolDistStatsTable);
    }

    public AddressMap getAddressMap() {
        return this.addressMap;
    }

    public void setAddressMap(AddressMap addressMap) {
        AddressMap oldValue = getAddressMap();
        this.addressMap = addressMap;
        replaceChild(oldValue, addressMap);
    }

    public AddressMapControlTable getAddressMapControlTable() {
        return this.addressMapControlTable;
    }

    public void setAddressMapControlTable(AddressMapControlTable addressMapControlTable) {
        AddressMapControlTable oldValue = getAddressMapControlTable();
        this.addressMapControlTable = addressMapControlTable;
        replaceChild(oldValue, addressMapControlTable);
    }

    public AddressMapTable getAddressMapTable() {
        return this.addressMapTable;
    }

    public void setAddressMapTable(AddressMapTable addressMapTable) {
        AddressMapTable oldValue = getAddressMapTable();
        this.addressMapTable = addressMapTable;
        replaceChild(oldValue, addressMapTable);
    }

    public HlHostControlTable getHlHostControlTable() {
        return this.hlHostControlTable;
    }

    public void setHlHostControlTable(HlHostControlTable hlHostControlTable) {
        HlHostControlTable oldValue = getHlHostControlTable();
        this.hlHostControlTable = hlHostControlTable;
        replaceChild(oldValue, hlHostControlTable);
    }

    public NlHostTable getNlHostTable() {
        return this.nlHostTable;
    }

    public void setNlHostTable(NlHostTable nlHostTable) {
        NlHostTable oldValue = getNlHostTable();
        this.nlHostTable = nlHostTable;
        replaceChild(oldValue, nlHostTable);
    }

    public HlMatrixControlTable getHlMatrixControlTable() {
        return this.hlMatrixControlTable;
    }

    public void setHlMatrixControlTable(HlMatrixControlTable hlMatrixControlTable) {
        HlMatrixControlTable oldValue = getHlMatrixControlTable();
        this.hlMatrixControlTable = hlMatrixControlTable;
        replaceChild(oldValue, hlMatrixControlTable);
    }

    public NlMatrixSDTable getNlMatrixSDTable() {
        return this.nlMatrixSDTable;
    }

    public void setNlMatrixSDTable(NlMatrixSDTable nlMatrixSDTable) {
        NlMatrixSDTable oldValue = getNlMatrixSDTable();
        this.nlMatrixSDTable = nlMatrixSDTable;
        replaceChild(oldValue, nlMatrixSDTable);
    }

    public NlMatrixDSTable getNlMatrixDSTable() {
        return this.nlMatrixDSTable;
    }

    public void setNlMatrixDSTable(NlMatrixDSTable nlMatrixDSTable) {
        NlMatrixDSTable oldValue = getNlMatrixDSTable();
        this.nlMatrixDSTable = nlMatrixDSTable;
        replaceChild(oldValue, nlMatrixDSTable);
    }

    public NlMatrixTopNControlTable getNlMatrixTopNControlTable() {
        return this.nlMatrixTopNControlTable;
    }

    public void setNlMatrixTopNControlTable(NlMatrixTopNControlTable nlMatrixTopNControlTable) {
        NlMatrixTopNControlTable oldValue = getNlMatrixTopNControlTable();
        this.nlMatrixTopNControlTable = nlMatrixTopNControlTable;
        replaceChild(oldValue, nlMatrixTopNControlTable);
    }

    public NlMatrixTopNTable getNlMatrixTopNTable() {
        return this.nlMatrixTopNTable;
    }

    public void setNlMatrixTopNTable(NlMatrixTopNTable nlMatrixTopNTable) {
        NlMatrixTopNTable oldValue = getNlMatrixTopNTable();
        this.nlMatrixTopNTable = nlMatrixTopNTable;
        replaceChild(oldValue, nlMatrixTopNTable);
    }

    public AlHostTable getAlHostTable() {
        return this.alHostTable;
    }

    public void setAlHostTable(AlHostTable alHostTable) {
        AlHostTable oldValue = getAlHostTable();
        this.alHostTable = alHostTable;
        replaceChild(oldValue, alHostTable);
    }

    public AlMatrixSDTable getAlMatrixSDTable() {
        return this.alMatrixSDTable;
    }

    public void setAlMatrixSDTable(AlMatrixSDTable alMatrixSDTable) {
        AlMatrixSDTable oldValue = getAlMatrixSDTable();
        this.alMatrixSDTable = alMatrixSDTable;
        replaceChild(oldValue, alMatrixSDTable);
    }

    public AlMatrixDSTable getAlMatrixDSTable() {
        return this.alMatrixDSTable;
    }

    public void setAlMatrixDSTable(AlMatrixDSTable alMatrixDSTable) {
        AlMatrixDSTable oldValue = getAlMatrixDSTable();
        this.alMatrixDSTable = alMatrixDSTable;
        replaceChild(oldValue, alMatrixDSTable);
    }

    public AlMatrixTopNControlTable getAlMatrixTopNControlTable() {
        return this.alMatrixTopNControlTable;
    }

    public void setAlMatrixTopNControlTable(AlMatrixTopNControlTable alMatrixTopNControlTable) {
        AlMatrixTopNControlTable oldValue = getAlMatrixTopNControlTable();
        this.alMatrixTopNControlTable = alMatrixTopNControlTable;
        replaceChild(oldValue, alMatrixTopNControlTable);
    }

    public AlMatrixTopNTable getAlMatrixTopNTable() {
        return this.alMatrixTopNTable;
    }

    public void setAlMatrixTopNTable(AlMatrixTopNTable alMatrixTopNTable) {
        AlMatrixTopNTable oldValue = getAlMatrixTopNTable();
        this.alMatrixTopNTable = alMatrixTopNTable;
        replaceChild(oldValue, alMatrixTopNTable);
    }

    public UsrHistoryControlTable getUsrHistoryControlTable() {
        return this.usrHistoryControlTable;
    }

    public void setUsrHistoryControlTable(UsrHistoryControlTable usrHistoryControlTable) {
        UsrHistoryControlTable oldValue = getUsrHistoryControlTable();
        this.usrHistoryControlTable = usrHistoryControlTable;
        replaceChild(oldValue, usrHistoryControlTable);
    }

    public UsrHistoryObjectTable getUsrHistoryObjectTable() {
        return this.usrHistoryObjectTable;
    }

    public void setUsrHistoryObjectTable(UsrHistoryObjectTable usrHistoryObjectTable) {
        UsrHistoryObjectTable oldValue = getUsrHistoryObjectTable();
        this.usrHistoryObjectTable = usrHistoryObjectTable;
        replaceChild(oldValue, usrHistoryObjectTable);
    }

    public UsrHistoryTable getUsrHistoryTable() {
        return this.usrHistoryTable;
    }

    public void setUsrHistoryTable(UsrHistoryTable usrHistoryTable) {
        UsrHistoryTable oldValue = getUsrHistoryTable();
        this.usrHistoryTable = usrHistoryTable;
        replaceChild(oldValue, usrHistoryTable);
    }

    public ProbeConfig getProbeConfig() {
        return this.probeConfig;
    }

    public void setProbeConfig(ProbeConfig probeConfig) {
        ProbeConfig oldValue = getProbeConfig();
        this.probeConfig = probeConfig;
        replaceChild(oldValue, probeConfig);
    }

    public SerialConfigTable getSerialConfigTable() {
        return this.serialConfigTable;
    }

    public void setSerialConfigTable(SerialConfigTable serialConfigTable) {
        SerialConfigTable oldValue = getSerialConfigTable();
        this.serialConfigTable = serialConfigTable;
        replaceChild(oldValue, serialConfigTable);
    }

    public NetConfigTable getNetConfigTable() {
        return this.netConfigTable;
    }

    public void setNetConfigTable(NetConfigTable netConfigTable) {
        NetConfigTable oldValue = getNetConfigTable();
        this.netConfigTable = netConfigTable;
        replaceChild(oldValue, netConfigTable);
    }

    public TrapDestTable getTrapDestTable() {
        return this.trapDestTable;
    }

    public void setTrapDestTable(TrapDestTable trapDestTable) {
        TrapDestTable oldValue = getTrapDestTable();
        this.trapDestTable = trapDestTable;
        replaceChild(oldValue, trapDestTable);
    }

    public SerialConnectionTable getSerialConnectionTable() {
        return this.serialConnectionTable;
    }

    public void setSerialConnectionTable(SerialConnectionTable serialConnectionTable) {
        SerialConnectionTable oldValue = getSerialConnectionTable();
        this.serialConnectionTable = serialConnectionTable;
        replaceChild(oldValue, serialConnectionTable);
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

    public TokenRingMLHistoryTable getTokenRingMLHistoryTable() {
        return this.tokenRingMLHistoryTable;
    }

    public void setTokenRingMLHistoryTable(TokenRingMLHistoryTable tokenRingMLHistoryTable) {
        TokenRingMLHistoryTable oldValue = getTokenRingMLHistoryTable();
        this.tokenRingMLHistoryTable = tokenRingMLHistoryTable;
        replaceChild(oldValue, tokenRingMLHistoryTable);
    }

    public TokenRingPHistoryTable getTokenRingPHistoryTable() {
        return this.tokenRingPHistoryTable;
    }

    public void setTokenRingPHistoryTable(TokenRingPHistoryTable tokenRingPHistoryTable) {
        TokenRingPHistoryTable oldValue = getTokenRingPHistoryTable();
        this.tokenRingPHistoryTable = tokenRingPHistoryTable;
        replaceChild(oldValue, tokenRingPHistoryTable);
    }

    public HistoryControl2Table getHistoryControl2Table() {
        return this.historyControl2Table;
    }

    public void setHistoryControl2Table(HistoryControl2Table historyControl2Table) {
        HistoryControl2Table oldValue = getHistoryControl2Table();
        this.historyControl2Table = historyControl2Table;
        replaceChild(oldValue, historyControl2Table);
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

    public HostControl2Table getHostControl2Table() {
        return this.hostControl2Table;
    }

    public void setHostControl2Table(HostControl2Table hostControl2Table) {
        HostControl2Table oldValue = getHostControl2Table();
        this.hostControl2Table = hostControl2Table;
        replaceChild(oldValue, hostControl2Table);
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

    public MatrixControl2Table getMatrixControl2Table() {
        return this.matrixControl2Table;
    }

    public void setMatrixControl2Table(MatrixControl2Table matrixControl2Table) {
        MatrixControl2Table oldValue = getMatrixControl2Table();
        this.matrixControl2Table = matrixControl2Table;
        replaceChild(oldValue, matrixControl2Table);
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

    public Channel2Table getChannel2Table() {
        return this.channel2Table;
    }

    public void setChannel2Table(Channel2Table channel2Table) {
        Channel2Table oldValue = getChannel2Table();
        this.channel2Table = channel2Table;
        replaceChild(oldValue, channel2Table);
    }

    public Filter2Table getFilter2Table() {
        return this.filter2Table;
    }

    public void setFilter2Table(Filter2Table filter2Table) {
        Filter2Table oldValue = getFilter2Table();
        this.filter2Table = filter2Table;
        replaceChild(oldValue, filter2Table);
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

    public Dot1dBase getDot1dBase() {
        return this.dot1dBase;
    }

    public void setDot1dBase(Dot1dBase dot1dBase) {
        Dot1dBase oldValue = getDot1dBase();
        this.dot1dBase = dot1dBase;
        replaceChild(oldValue, dot1dBase);
    }

    public Dot1dBasePortTable getDot1dBasePortTable() {
        return this.dot1dBasePortTable;
    }

    public void setDot1dBasePortTable(Dot1dBasePortTable dot1dBasePortTable) {
        Dot1dBasePortTable oldValue = getDot1dBasePortTable();
        this.dot1dBasePortTable = dot1dBasePortTable;
        replaceChild(oldValue, dot1dBasePortTable);
    }

    public Dot1dStp getDot1dStp() {
        return this.dot1dStp;
    }

    public void setDot1dStp(Dot1dStp dot1dStp) {
        Dot1dStp oldValue = getDot1dStp();
        this.dot1dStp = dot1dStp;
        replaceChild(oldValue, dot1dStp);
    }

    public Dot1dStpPortTable getDot1dStpPortTable() {
        return this.dot1dStpPortTable;
    }

    public void setDot1dStpPortTable(Dot1dStpPortTable dot1dStpPortTable) {
        Dot1dStpPortTable oldValue = getDot1dStpPortTable();
        this.dot1dStpPortTable = dot1dStpPortTable;
        replaceChild(oldValue, dot1dStpPortTable);
    }

    public Dot1dTp getDot1dTp() {
        return this.dot1dTp;
    }

    public void setDot1dTp(Dot1dTp dot1dTp) {
        Dot1dTp oldValue = getDot1dTp();
        this.dot1dTp = dot1dTp;
        replaceChild(oldValue, dot1dTp);
    }

    public Dot1dTpFdbTable getDot1dTpFdbTable() {
        return this.dot1dTpFdbTable;
    }

    public void setDot1dTpFdbTable(Dot1dTpFdbTable dot1dTpFdbTable) {
        Dot1dTpFdbTable oldValue = getDot1dTpFdbTable();
        this.dot1dTpFdbTable = dot1dTpFdbTable;
        replaceChild(oldValue, dot1dTpFdbTable);
    }

    public Dot1dTpPortTable getDot1dTpPortTable() {
        return this.dot1dTpPortTable;
    }

    public void setDot1dTpPortTable(Dot1dTpPortTable dot1dTpPortTable) {
        Dot1dTpPortTable oldValue = getDot1dTpPortTable();
        this.dot1dTpPortTable = dot1dTpPortTable;
        replaceChild(oldValue, dot1dTpPortTable);
    }

    public Dot1dTpHCPortTable getDot1dTpHCPortTable() {
        return this.dot1dTpHCPortTable;
    }

    public void setDot1dTpHCPortTable(Dot1dTpHCPortTable dot1dTpHCPortTable) {
        Dot1dTpHCPortTable oldValue = getDot1dTpHCPortTable();
        this.dot1dTpHCPortTable = dot1dTpHCPortTable;
        replaceChild(oldValue, dot1dTpHCPortTable);
    }

    public Dot1dTpPortOverflowTable getDot1dTpPortOverflowTable() {
        return this.dot1dTpPortOverflowTable;
    }

    public void setDot1dTpPortOverflowTable(Dot1dTpPortOverflowTable dot1dTpPortOverflowTable) {
        Dot1dTpPortOverflowTable oldValue = getDot1dTpPortOverflowTable();
        this.dot1dTpPortOverflowTable = dot1dTpPortOverflowTable;
        replaceChild(oldValue, dot1dTpPortOverflowTable);
    }

    public Dot1dStaticTable getDot1dStaticTable() {
        return this.dot1dStaticTable;
    }

    public void setDot1dStaticTable(Dot1dStaticTable dot1dStaticTable) {
        Dot1dStaticTable oldValue = getDot1dStaticTable();
        this.dot1dStaticTable = dot1dStaticTable;
        replaceChild(oldValue, dot1dStaticTable);
    }

    public Dot1dExtBase getDot1dExtBase() {
        return this.dot1dExtBase;
    }

    public void setDot1dExtBase(Dot1dExtBase dot1dExtBase) {
        Dot1dExtBase oldValue = getDot1dExtBase();
        this.dot1dExtBase = dot1dExtBase;
        replaceChild(oldValue, dot1dExtBase);
    }

    public Dot1dPortCapabilitiesTable getDot1dPortCapabilitiesTable() {
        return this.dot1dPortCapabilitiesTable;
    }

    public void setDot1dPortCapabilitiesTable(Dot1dPortCapabilitiesTable dot1dPortCapabilitiesTable) {
        Dot1dPortCapabilitiesTable oldValue = getDot1dPortCapabilitiesTable();
        this.dot1dPortCapabilitiesTable = dot1dPortCapabilitiesTable;
        replaceChild(oldValue, dot1dPortCapabilitiesTable);
    }

    public Dot1dPortPriorityTable getDot1dPortPriorityTable() {
        return this.dot1dPortPriorityTable;
    }

    public void setDot1dPortPriorityTable(Dot1dPortPriorityTable dot1dPortPriorityTable) {
        Dot1dPortPriorityTable oldValue = getDot1dPortPriorityTable();
        this.dot1dPortPriorityTable = dot1dPortPriorityTable;
        replaceChild(oldValue, dot1dPortPriorityTable);
    }

    public Dot1dUserPriorityRegenTable getDot1dUserPriorityRegenTable() {
        return this.dot1dUserPriorityRegenTable;
    }

    public void setDot1dUserPriorityRegenTable(Dot1dUserPriorityRegenTable dot1dUserPriorityRegenTable) {
        Dot1dUserPriorityRegenTable oldValue = getDot1dUserPriorityRegenTable();
        this.dot1dUserPriorityRegenTable = dot1dUserPriorityRegenTable;
        replaceChild(oldValue, dot1dUserPriorityRegenTable);
    }

    public Dot1dTrafficClassTable getDot1dTrafficClassTable() {
        return this.dot1dTrafficClassTable;
    }

    public void setDot1dTrafficClassTable(Dot1dTrafficClassTable dot1dTrafficClassTable) {
        Dot1dTrafficClassTable oldValue = getDot1dTrafficClassTable();
        this.dot1dTrafficClassTable = dot1dTrafficClassTable;
        replaceChild(oldValue, dot1dTrafficClassTable);
    }

    public Dot1dPortOutboundAccessPriorityTable getDot1dPortOutboundAccessPriorityTable() {
        return this.dot1dPortOutboundAccessPriorityTable;
    }

    public void setDot1dPortOutboundAccessPriorityTable(Dot1dPortOutboundAccessPriorityTable dot1dPortOutboundAccessPriorityTable) {
        Dot1dPortOutboundAccessPriorityTable oldValue = getDot1dPortOutboundAccessPriorityTable();
        this.dot1dPortOutboundAccessPriorityTable = dot1dPortOutboundAccessPriorityTable;
        replaceChild(oldValue, dot1dPortOutboundAccessPriorityTable);
    }

    public Dot1dPortGarpTable getDot1dPortGarpTable() {
        return this.dot1dPortGarpTable;
    }

    public void setDot1dPortGarpTable(Dot1dPortGarpTable dot1dPortGarpTable) {
        Dot1dPortGarpTable oldValue = getDot1dPortGarpTable();
        this.dot1dPortGarpTable = dot1dPortGarpTable;
        replaceChild(oldValue, dot1dPortGarpTable);
    }

    public Dot1dPortGmrpTable getDot1dPortGmrpTable() {
        return this.dot1dPortGmrpTable;
    }

    public void setDot1dPortGmrpTable(Dot1dPortGmrpTable dot1dPortGmrpTable) {
        Dot1dPortGmrpTable oldValue = getDot1dPortGmrpTable();
        this.dot1dPortGmrpTable = dot1dPortGmrpTable;
        replaceChild(oldValue, dot1dPortGmrpTable);
    }

    public Dot1qBase getDot1qBase() {
        return this.dot1qBase;
    }

    public void setDot1qBase(Dot1qBase dot1qBase) {
        Dot1qBase oldValue = getDot1qBase();
        this.dot1qBase = dot1qBase;
        replaceChild(oldValue, dot1qBase);
    }

    public Dot1qFdbTable getDot1qFdbTable() {
        return this.dot1qFdbTable;
    }

    public void setDot1qFdbTable(Dot1qFdbTable dot1qFdbTable) {
        Dot1qFdbTable oldValue = getDot1qFdbTable();
        this.dot1qFdbTable = dot1qFdbTable;
        replaceChild(oldValue, dot1qFdbTable);
    }

    public Dot1qTpFdbTable getDot1qTpFdbTable() {
        return this.dot1qTpFdbTable;
    }

    public void setDot1qTpFdbTable(Dot1qTpFdbTable dot1qTpFdbTable) {
        Dot1qTpFdbTable oldValue = getDot1qTpFdbTable();
        this.dot1qTpFdbTable = dot1qTpFdbTable;
        replaceChild(oldValue, dot1qTpFdbTable);
    }

    public Dot1qTpGroupTable getDot1qTpGroupTable() {
        return this.dot1qTpGroupTable;
    }

    public void setDot1qTpGroupTable(Dot1qTpGroupTable dot1qTpGroupTable) {
        Dot1qTpGroupTable oldValue = getDot1qTpGroupTable();
        this.dot1qTpGroupTable = dot1qTpGroupTable;
        replaceChild(oldValue, dot1qTpGroupTable);
    }

    public Dot1qForwardAllTable getDot1qForwardAllTable() {
        return this.dot1qForwardAllTable;
    }

    public void setDot1qForwardAllTable(Dot1qForwardAllTable dot1qForwardAllTable) {
        Dot1qForwardAllTable oldValue = getDot1qForwardAllTable();
        this.dot1qForwardAllTable = dot1qForwardAllTable;
        replaceChild(oldValue, dot1qForwardAllTable);
    }

    public Dot1qForwardUnregisteredTable getDot1qForwardUnregisteredTable() {
        return this.dot1qForwardUnregisteredTable;
    }

    public void setDot1qForwardUnregisteredTable(Dot1qForwardUnregisteredTable dot1qForwardUnregisteredTable) {
        Dot1qForwardUnregisteredTable oldValue = getDot1qForwardUnregisteredTable();
        this.dot1qForwardUnregisteredTable = dot1qForwardUnregisteredTable;
        replaceChild(oldValue, dot1qForwardUnregisteredTable);
    }

    public Dot1qStaticUnicastTable getDot1qStaticUnicastTable() {
        return this.dot1qStaticUnicastTable;
    }

    public void setDot1qStaticUnicastTable(Dot1qStaticUnicastTable dot1qStaticUnicastTable) {
        Dot1qStaticUnicastTable oldValue = getDot1qStaticUnicastTable();
        this.dot1qStaticUnicastTable = dot1qStaticUnicastTable;
        replaceChild(oldValue, dot1qStaticUnicastTable);
    }

    public Dot1qStaticMulticastTable getDot1qStaticMulticastTable() {
        return this.dot1qStaticMulticastTable;
    }

    public void setDot1qStaticMulticastTable(Dot1qStaticMulticastTable dot1qStaticMulticastTable) {
        Dot1qStaticMulticastTable oldValue = getDot1qStaticMulticastTable();
        this.dot1qStaticMulticastTable = dot1qStaticMulticastTable;
        replaceChild(oldValue, dot1qStaticMulticastTable);
    }

    public Dot1qVlan getDot1qVlan() {
        return this.dot1qVlan;
    }

    public void setDot1qVlan(Dot1qVlan dot1qVlan) {
        Dot1qVlan oldValue = getDot1qVlan();
        this.dot1qVlan = dot1qVlan;
        replaceChild(oldValue, dot1qVlan);
    }

    public Dot1qVlanCurrentTable getDot1qVlanCurrentTable() {
        return this.dot1qVlanCurrentTable;
    }

    public void setDot1qVlanCurrentTable(Dot1qVlanCurrentTable dot1qVlanCurrentTable) {
        Dot1qVlanCurrentTable oldValue = getDot1qVlanCurrentTable();
        this.dot1qVlanCurrentTable = dot1qVlanCurrentTable;
        replaceChild(oldValue, dot1qVlanCurrentTable);
    }

    public Dot1qVlanStaticTable getDot1qVlanStaticTable() {
        return this.dot1qVlanStaticTable;
    }

    public void setDot1qVlanStaticTable(Dot1qVlanStaticTable dot1qVlanStaticTable) {
        Dot1qVlanStaticTable oldValue = getDot1qVlanStaticTable();
        this.dot1qVlanStaticTable = dot1qVlanStaticTable;
        replaceChild(oldValue, dot1qVlanStaticTable);
    }

    public Dot1qPortVlanTable getDot1qPortVlanTable() {
        return this.dot1qPortVlanTable;
    }

    public void setDot1qPortVlanTable(Dot1qPortVlanTable dot1qPortVlanTable) {
        Dot1qPortVlanTable oldValue = getDot1qPortVlanTable();
        this.dot1qPortVlanTable = dot1qPortVlanTable;
        replaceChild(oldValue, dot1qPortVlanTable);
    }

    public Dot1qPortVlanStatisticsTable getDot1qPortVlanStatisticsTable() {
        return this.dot1qPortVlanStatisticsTable;
    }

    public void setDot1qPortVlanStatisticsTable(Dot1qPortVlanStatisticsTable dot1qPortVlanStatisticsTable) {
        Dot1qPortVlanStatisticsTable oldValue = getDot1qPortVlanStatisticsTable();
        this.dot1qPortVlanStatisticsTable = dot1qPortVlanStatisticsTable;
        replaceChild(oldValue, dot1qPortVlanStatisticsTable);
    }

    public Dot1qPortVlanHCStatisticsTable getDot1qPortVlanHCStatisticsTable() {
        return this.dot1qPortVlanHCStatisticsTable;
    }

    public void setDot1qPortVlanHCStatisticsTable(Dot1qPortVlanHCStatisticsTable dot1qPortVlanHCStatisticsTable) {
        Dot1qPortVlanHCStatisticsTable oldValue = getDot1qPortVlanHCStatisticsTable();
        this.dot1qPortVlanHCStatisticsTable = dot1qPortVlanHCStatisticsTable;
        replaceChild(oldValue, dot1qPortVlanHCStatisticsTable);
    }

    public Dot1qLearningConstraintsTable getDot1qLearningConstraintsTable() {
        return this.dot1qLearningConstraintsTable;
    }

    public void setDot1qLearningConstraintsTable(Dot1qLearningConstraintsTable dot1qLearningConstraintsTable) {
        Dot1qLearningConstraintsTable oldValue = getDot1qLearningConstraintsTable();
        this.dot1qLearningConstraintsTable = dot1qLearningConstraintsTable;
        replaceChild(oldValue, dot1qLearningConstraintsTable);
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

    public RadiusAuthClient getRadiusAuthClient() {
        return this.radiusAuthClient;
    }

    public void setRadiusAuthClient(RadiusAuthClient radiusAuthClient) {
        RadiusAuthClient oldValue = getRadiusAuthClient();
        this.radiusAuthClient = radiusAuthClient;
        replaceChild(oldValue, radiusAuthClient);
    }

    public RadiusAuthServerTable getRadiusAuthServerTable() {
        return this.radiusAuthServerTable;
    }

    public void setRadiusAuthServerTable(RadiusAuthServerTable radiusAuthServerTable) {
        RadiusAuthServerTable oldValue = getRadiusAuthServerTable();
        this.radiusAuthServerTable = radiusAuthServerTable;
        replaceChild(oldValue, radiusAuthServerTable);
    }

    public RadiusAccClient getRadiusAccClient() {
        return this.radiusAccClient;
    }

    public void setRadiusAccClient(RadiusAccClient radiusAccClient) {
        RadiusAccClient oldValue = getRadiusAccClient();
        this.radiusAccClient = radiusAccClient;
        replaceChild(oldValue, radiusAccClient);
    }

    public RadiusAccServerTable getRadiusAccServerTable() {
        return this.radiusAccServerTable;
    }

    public void setRadiusAccServerTable(RadiusAccServerTable radiusAccServerTable) {
        RadiusAccServerTable oldValue = getRadiusAccServerTable();
        this.radiusAccServerTable = radiusAccServerTable;
        replaceChild(oldValue, radiusAccServerTable);
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
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("system", system).append("sysORTable", sysORTable).append("dot3PauseTable", dot3PauseTable).append("dot3HCStatsTable", dot3HCStatsTable).append("dot3StatsTable", dot3StatsTable).append("dot3CollTable", dot3CollTable).append("dot3ControlTable", dot3ControlTable).append("sctpStats", sctpStats).append("sctpLookupRemIPAddrTable", sctpLookupRemIPAddrTable).append("sctpParams", sctpParams).append("sctpAssocTable", sctpAssocTable).append("sctpAssocLocalAddrTable", sctpAssocLocalAddrTable).append("sctpAssocRemAddrTable", sctpAssocRemAddrTable).append("sctpLookupLocalPortTable", sctpLookupLocalPortTable).append("sctpLookupRemPortTable", sctpLookupRemPortTable).append("sctpLookupRemHostNameTable", sctpLookupRemHostNameTable).append("sctpLookupRemPrimIPAddrTable", sctpLookupRemPrimIPAddrTable).append("snmp", snmp).append("etherStatsTable", etherStatsTable).append("tokenRingMLStatsTable", tokenRingMLStatsTable).append("tokenRingPStatsTable", tokenRingPStatsTable).append("etherStats2Table", etherStats2Table).append("tokenRingMLStats2Table", tokenRingMLStats2Table).append("tokenRingPStats2Table", tokenRingPStats2Table).append("ringStationControlTable", ringStationControlTable).append("ringStationTable", ringStationTable).append("ringStationOrderTable", ringStationOrderTable).append("ringStationConfigControlTable", ringStationConfigControlTable).append("ringStationConfigTable", ringStationConfigTable).append("sourceRoutingStatsTable", sourceRoutingStatsTable).append("ringStationControl2Table", ringStationControl2Table).append("sourceRoutingStats2Table", sourceRoutingStats2Table).append("protocolDir", protocolDir).append("protocolDirTable", protocolDirTable).append("protocolDistControlTable", protocolDistControlTable).append("protocolDistStatsTable", protocolDistStatsTable).append("addressMap", addressMap).append("addressMapControlTable", addressMapControlTable).append("addressMapTable", addressMapTable).append("hlHostControlTable", hlHostControlTable).append("nlHostTable", nlHostTable).append("hlMatrixControlTable", hlMatrixControlTable).append("nlMatrixSDTable", nlMatrixSDTable).append("nlMatrixDSTable", nlMatrixDSTable).append("nlMatrixTopNControlTable", nlMatrixTopNControlTable).append("nlMatrixTopNTable", nlMatrixTopNTable).append("alHostTable", alHostTable).append("alMatrixSDTable", alMatrixSDTable).append("alMatrixDSTable", alMatrixDSTable).append("alMatrixTopNControlTable", alMatrixTopNControlTable).append("alMatrixTopNTable", alMatrixTopNTable).append("usrHistoryControlTable", usrHistoryControlTable).append("usrHistoryObjectTable", usrHistoryObjectTable).append("usrHistoryTable", usrHistoryTable).append("probeConfig", probeConfig).append("serialConfigTable", serialConfigTable).append("netConfigTable", netConfigTable).append("trapDestTable", trapDestTable).append("serialConnectionTable", serialConnectionTable).append("historyControlTable", historyControlTable).append("etherHistoryTable", etherHistoryTable).append("tokenRingMLHistoryTable", tokenRingMLHistoryTable).append("tokenRingPHistoryTable", tokenRingPHistoryTable).append("historyControl2Table", historyControl2Table).append("alarmTable", alarmTable).append("hostControlTable", hostControlTable).append("hostTable", hostTable).append("hostTimeTable", hostTimeTable).append("hostControl2Table", hostControl2Table).append("hostTopNControlTable", hostTopNControlTable).append("hostTopNTable", hostTopNTable).append("matrixControlTable", matrixControlTable).append("matrixSDTable", matrixSDTable).append("matrixDSTable", matrixDSTable).append("matrixControl2Table", matrixControl2Table).append("filterTable", filterTable).append("channelTable", channelTable).append("channel2Table", channel2Table).append("filter2Table", filter2Table).append("bufferControlTable", bufferControlTable).append("captureBufferTable", captureBufferTable).append("eventTable", eventTable).append("logTable", logTable).append("dot1dBase", dot1dBase).append("dot1dBasePortTable", dot1dBasePortTable).append("dot1dStp", dot1dStp).append("dot1dStpPortTable", dot1dStpPortTable).append("dot1dTp", dot1dTp).append("dot1dTpFdbTable", dot1dTpFdbTable).append("dot1dTpPortTable", dot1dTpPortTable).append("dot1dTpHCPortTable", dot1dTpHCPortTable).append("dot1dTpPortOverflowTable", dot1dTpPortOverflowTable).append("dot1dStaticTable", dot1dStaticTable).append("dot1dExtBase", dot1dExtBase).append("dot1dPortCapabilitiesTable", dot1dPortCapabilitiesTable).append("dot1dPortPriorityTable", dot1dPortPriorityTable).append("dot1dUserPriorityRegenTable", dot1dUserPriorityRegenTable).append("dot1dTrafficClassTable", dot1dTrafficClassTable).append("dot1dPortOutboundAccessPriorityTable", dot1dPortOutboundAccessPriorityTable).append("dot1dPortGarpTable", dot1dPortGarpTable).append("dot1dPortGmrpTable", dot1dPortGmrpTable).append("dot1qBase", dot1qBase).append("dot1qFdbTable", dot1qFdbTable).append("dot1qTpFdbTable", dot1qTpFdbTable).append("dot1qTpGroupTable", dot1qTpGroupTable).append("dot1qForwardAllTable", dot1qForwardAllTable).append("dot1qForwardUnregisteredTable", dot1qForwardUnregisteredTable).append("dot1qStaticUnicastTable", dot1qStaticUnicastTable).append("dot1qStaticMulticastTable", dot1qStaticMulticastTable).append("dot1qVlan", dot1qVlan).append("dot1qVlanCurrentTable", dot1qVlanCurrentTable).append("dot1qVlanStaticTable", dot1qVlanStaticTable).append("dot1qPortVlanTable", dot1qPortVlanTable).append("dot1qPortVlanStatisticsTable", dot1qPortVlanStatisticsTable).append("dot1qPortVlanHCStatisticsTable", dot1qPortVlanHCStatisticsTable).append("dot1qLearningConstraintsTable", dot1qLearningConstraintsTable).append("interfaces", interfaces).append("ifTable", ifTable).append("hrSystem", hrSystem).append("hrStorage", hrStorage).append("hrStorageTable", hrStorageTable).append("hrDeviceTable", hrDeviceTable).append("hrProcessorTable", hrProcessorTable).append("hrNetworkTable", hrNetworkTable).append("hrPrinterTable", hrPrinterTable).append("hrDiskStorageTable", hrDiskStorageTable).append("hrPartitionTable", hrPartitionTable).append("hrFSTable", hrFSTable).append("hrSWRun", hrSWRun).append("hrSWRunTable", hrSWRunTable).append("hrSWRunPerfTable", hrSWRunPerfTable).append("hrSWInstalled", hrSWInstalled).append("hrSWInstalledTable", hrSWInstalledTable).append("applTable", applTable).append("assocTable", assocTable).append("mtaTable", mtaTable).append("mtaGroupTable", mtaGroupTable).append("mtaGroupAssociationTable", mtaGroupAssociationTable).append("mtaGroupErrorTable", mtaGroupErrorTable).append("atTable", atTable).append("ifMIBObjects", ifMIBObjects).append("ifXTable", ifXTable).append("ifStackTable", ifStackTable).append("ifTestTable", ifTestTable).append("ifRcvAddressTable", ifRcvAddressTable).append("ip", ip).append("ipAddrTable", ipAddrTable).append("ipRouteTable", ipRouteTable).append("ipNetToMediaTable", ipNetToMediaTable).append("ipForward", ipForward).append("ipForwardTable", ipForwardTable).append("ipCidrRouteTable", ipCidrRouteTable).append("inetCidrRouteTable", inetCidrRouteTable).append("ipv4InterfaceTable", ipv4InterfaceTable).append("ipv6InterfaceTable", ipv6InterfaceTable).append("ipTrafficStats", ipTrafficStats).append("ipSystemStatsTable", ipSystemStatsTable).append("ipIfStatsTable", ipIfStatsTable).append("ipAddressPrefixTable", ipAddressPrefixTable).append("ipAddressTable", ipAddressTable).append("ipNetToPhysicalTable", ipNetToPhysicalTable).append("ipv6ScopeZoneIndexTable", ipv6ScopeZoneIndexTable).append("ipDefaultRouterTable", ipDefaultRouterTable).append("ipv6RouterAdvertTable", ipv6RouterAdvertTable).append("icmp", icmp).append("icmpStatsTable", icmpStatsTable).append("icmpMsgStatsTable", icmpMsgStatsTable).append("ipv6MIBObjects", ipv6MIBObjects).append("ipv6RouteTable", ipv6RouteTable).append("ipv6NetToMediaTable", ipv6NetToMediaTable).append("ipv6IfTable", ipv6IfTable).append("ipv6IfStatsTable", ipv6IfStatsTable).append("ipv6AddrPrefixTable", ipv6AddrPrefixTable).append("ipv6AddrTable", ipv6AddrTable).append("ipv6IfIcmpTable", ipv6IfIcmpTable).append("tcp", tcp).append("tcpConnTable", tcpConnTable).append("ipv6TcpConnTable", ipv6TcpConnTable).append("tcpConnectionTable", tcpConnectionTable).append("tcpListenerTable", tcpListenerTable).append("schedObjects", schedObjects).append("schedTable", schedTable).append("smLangTable", smLangTable).append("smExtsnTable", smExtsnTable).append("smScriptTable", smScriptTable).append("smCodeTable", smCodeTable).append("smLaunchTable", smLaunchTable).append("smRunTable", smRunTable).append("radiusAuthClient", radiusAuthClient).append("radiusAuthServerTable", radiusAuthServerTable).append("radiusAccClient", radiusAccClient).append("radiusAccServerTable", radiusAccServerTable).append("udp", udp).append("udpTable", udpTable).append("ipv6UdpTable", ipv6UdpTable).append("udpEndpointTable", udpEndpointTable).append("agentxGeneral", agentxGeneral).append("agentxConnection", agentxConnection).append("agentxConnectionTable", agentxConnectionTable).append("agentxSession", agentxSession).append("agentxSessionTable", agentxSessionTable).append("agentxRegistration", agentxRegistration).append("agentxRegistrationTable", agentxRegistrationTable).append("ifInvStackTable", ifInvStackTable).append("egp", egp).append("egpNeighTable", egpNeighTable).append("mteResource", mteResource).append("mteTrigger", mteTrigger).append("mteTriggerTable", mteTriggerTable).append("mteTriggerDeltaTable", mteTriggerDeltaTable).append("mteTriggerExistenceTable", mteTriggerExistenceTable).append("mteTriggerBooleanTable", mteTriggerBooleanTable).append("mteTriggerThresholdTable", mteTriggerThresholdTable).append("mteObjectsTable", mteObjectsTable).append("mteEvent", mteEvent).append("mteEventTable", mteEventTable).append("mteEventNotificationTable", mteEventNotificationTable).append("mteEventSetTable", mteEventSetTable).append("dismanEventMIBNotificationObjects", dismanEventMIBNotificationObjects).append("nlmConfig", nlmConfig).append("nlmConfigLogTable", nlmConfigLogTable).append("nlmStats", nlmStats).append("nlmStatsLogTable", nlmStatsLogTable).append("nlmLogTable", nlmLogTable).append("nlmLogVariableTable", nlmLogVariableTable).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(system).append(sysORTable).append(dot3PauseTable).append(dot3HCStatsTable).append(dot3StatsTable).append(dot3CollTable).append(dot3ControlTable).append(sctpStats).append(sctpLookupRemIPAddrTable).append(sctpParams).append(sctpAssocTable).append(sctpAssocLocalAddrTable).append(sctpAssocRemAddrTable).append(sctpLookupLocalPortTable).append(sctpLookupRemPortTable).append(sctpLookupRemHostNameTable).append(sctpLookupRemPrimIPAddrTable).append(snmp).append(etherStatsTable).append(tokenRingMLStatsTable).append(tokenRingPStatsTable).append(etherStats2Table).append(tokenRingMLStats2Table).append(tokenRingPStats2Table).append(ringStationControlTable).append(ringStationTable).append(ringStationOrderTable).append(ringStationConfigControlTable).append(ringStationConfigTable).append(sourceRoutingStatsTable).append(ringStationControl2Table).append(sourceRoutingStats2Table).append(protocolDir).append(protocolDirTable).append(protocolDistControlTable).append(protocolDistStatsTable).append(addressMap).append(addressMapControlTable).append(addressMapTable).append(hlHostControlTable).append(nlHostTable).append(hlMatrixControlTable).append(nlMatrixSDTable).append(nlMatrixDSTable).append(nlMatrixTopNControlTable).append(nlMatrixTopNTable).append(alHostTable).append(alMatrixSDTable).append(alMatrixDSTable).append(alMatrixTopNControlTable).append(alMatrixTopNTable).append(usrHistoryControlTable).append(usrHistoryObjectTable).append(usrHistoryTable).append(probeConfig).append(serialConfigTable).append(netConfigTable).append(trapDestTable).append(serialConnectionTable).append(historyControlTable).append(etherHistoryTable).append(tokenRingMLHistoryTable).append(tokenRingPHistoryTable).append(historyControl2Table).append(alarmTable).append(hostControlTable).append(hostTable).append(hostTimeTable).append(hostControl2Table).append(hostTopNControlTable).append(hostTopNTable).append(matrixControlTable).append(matrixSDTable).append(matrixDSTable).append(matrixControl2Table).append(filterTable).append(channelTable).append(channel2Table).append(filter2Table).append(bufferControlTable).append(captureBufferTable).append(eventTable).append(logTable).append(dot1dBase).append(dot1dBasePortTable).append(dot1dStp).append(dot1dStpPortTable).append(dot1dTp).append(dot1dTpFdbTable).append(dot1dTpPortTable).append(dot1dTpHCPortTable).append(dot1dTpPortOverflowTable).append(dot1dStaticTable).append(dot1dExtBase).append(dot1dPortCapabilitiesTable).append(dot1dPortPriorityTable).append(dot1dUserPriorityRegenTable).append(dot1dTrafficClassTable).append(dot1dPortOutboundAccessPriorityTable).append(dot1dPortGarpTable).append(dot1dPortGmrpTable).append(dot1qBase).append(dot1qFdbTable).append(dot1qTpFdbTable).append(dot1qTpGroupTable).append(dot1qForwardAllTable).append(dot1qForwardUnregisteredTable).append(dot1qStaticUnicastTable).append(dot1qStaticMulticastTable).append(dot1qVlan).append(dot1qVlanCurrentTable).append(dot1qVlanStaticTable).append(dot1qPortVlanTable).append(dot1qPortVlanStatisticsTable).append(dot1qPortVlanHCStatisticsTable).append(dot1qLearningConstraintsTable).append(interfaces).append(ifTable).append(hrSystem).append(hrStorage).append(hrStorageTable).append(hrDeviceTable).append(hrProcessorTable).append(hrNetworkTable).append(hrPrinterTable).append(hrDiskStorageTable).append(hrPartitionTable).append(hrFSTable).append(hrSWRun).append(hrSWRunTable).append(hrSWRunPerfTable).append(hrSWInstalled).append(hrSWInstalledTable).append(applTable).append(assocTable).append(mtaTable).append(mtaGroupTable).append(mtaGroupAssociationTable).append(mtaGroupErrorTable).append(atTable).append(ifMIBObjects).append(ifXTable).append(ifStackTable).append(ifTestTable).append(ifRcvAddressTable).append(ip).append(ipAddrTable).append(ipRouteTable).append(ipNetToMediaTable).append(ipForward).append(ipForwardTable).append(ipCidrRouteTable).append(inetCidrRouteTable).append(ipv4InterfaceTable).append(ipv6InterfaceTable).append(ipTrafficStats).append(ipSystemStatsTable).append(ipIfStatsTable).append(ipAddressPrefixTable).append(ipAddressTable).append(ipNetToPhysicalTable).append(ipv6ScopeZoneIndexTable).append(ipDefaultRouterTable).append(ipv6RouterAdvertTable).append(icmp).append(icmpStatsTable).append(icmpMsgStatsTable).append(ipv6MIBObjects).append(ipv6RouteTable).append(ipv6NetToMediaTable).append(ipv6IfTable).append(ipv6IfStatsTable).append(ipv6AddrPrefixTable).append(ipv6AddrTable).append(ipv6IfIcmpTable).append(tcp).append(tcpConnTable).append(ipv6TcpConnTable).append(tcpConnectionTable).append(tcpListenerTable).append(schedObjects).append(schedTable).append(smLangTable).append(smExtsnTable).append(smScriptTable).append(smCodeTable).append(smLaunchTable).append(smRunTable).append(radiusAuthClient).append(radiusAuthServerTable).append(radiusAccClient).append(radiusAccServerTable).append(udp).append(udpTable).append(ipv6UdpTable).append(udpEndpointTable).append(agentxGeneral).append(agentxConnection).append(agentxConnectionTable).append(agentxSession).append(agentxSessionTable).append(agentxRegistration).append(agentxRegistrationTable).append(ifInvStackTable).append(egp).append(egpNeighTable).append(mteResource).append(mteTrigger).append(mteTriggerTable).append(mteTriggerDeltaTable).append(mteTriggerExistenceTable).append(mteTriggerBooleanTable).append(mteTriggerThresholdTable).append(mteObjectsTable).append(mteEvent).append(mteEventTable).append(mteEventNotificationTable).append(mteEventSetTable).append(dismanEventMIBNotificationObjects).append(nlmConfig).append(nlmConfigLogTable).append(nlmStats).append(nlmStatsLogTable).append(nlmLogTable).append(nlmLogVariableTable).toHashCode();
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
        return new EqualsBuilder().append(system, rhs.system).append(sysORTable, rhs.sysORTable).append(dot3PauseTable, rhs.dot3PauseTable).append(dot3HCStatsTable, rhs.dot3HCStatsTable).append(dot3StatsTable, rhs.dot3StatsTable).append(dot3CollTable, rhs.dot3CollTable).append(dot3ControlTable, rhs.dot3ControlTable).append(sctpStats, rhs.sctpStats).append(sctpLookupRemIPAddrTable, rhs.sctpLookupRemIPAddrTable).append(sctpParams, rhs.sctpParams).append(sctpAssocTable, rhs.sctpAssocTable).append(sctpAssocLocalAddrTable, rhs.sctpAssocLocalAddrTable).append(sctpAssocRemAddrTable, rhs.sctpAssocRemAddrTable).append(sctpLookupLocalPortTable, rhs.sctpLookupLocalPortTable).append(sctpLookupRemPortTable, rhs.sctpLookupRemPortTable).append(sctpLookupRemHostNameTable, rhs.sctpLookupRemHostNameTable).append(sctpLookupRemPrimIPAddrTable, rhs.sctpLookupRemPrimIPAddrTable).append(snmp, rhs.snmp).append(etherStatsTable, rhs.etherStatsTable).append(tokenRingMLStatsTable, rhs.tokenRingMLStatsTable).append(tokenRingPStatsTable, rhs.tokenRingPStatsTable).append(etherStats2Table, rhs.etherStats2Table).append(tokenRingMLStats2Table, rhs.tokenRingMLStats2Table).append(tokenRingPStats2Table, rhs.tokenRingPStats2Table).append(ringStationControlTable, rhs.ringStationControlTable).append(ringStationTable, rhs.ringStationTable).append(ringStationOrderTable, rhs.ringStationOrderTable).append(ringStationConfigControlTable, rhs.ringStationConfigControlTable).append(ringStationConfigTable, rhs.ringStationConfigTable).append(sourceRoutingStatsTable, rhs.sourceRoutingStatsTable).append(ringStationControl2Table, rhs.ringStationControl2Table).append(sourceRoutingStats2Table, rhs.sourceRoutingStats2Table).append(protocolDir, rhs.protocolDir).append(protocolDirTable, rhs.protocolDirTable).append(protocolDistControlTable, rhs.protocolDistControlTable).append(protocolDistStatsTable, rhs.protocolDistStatsTable).append(addressMap, rhs.addressMap).append(addressMapControlTable, rhs.addressMapControlTable).append(addressMapTable, rhs.addressMapTable).append(hlHostControlTable, rhs.hlHostControlTable).append(nlHostTable, rhs.nlHostTable).append(hlMatrixControlTable, rhs.hlMatrixControlTable).append(nlMatrixSDTable, rhs.nlMatrixSDTable).append(nlMatrixDSTable, rhs.nlMatrixDSTable).append(nlMatrixTopNControlTable, rhs.nlMatrixTopNControlTable).append(nlMatrixTopNTable, rhs.nlMatrixTopNTable).append(alHostTable, rhs.alHostTable).append(alMatrixSDTable, rhs.alMatrixSDTable).append(alMatrixDSTable, rhs.alMatrixDSTable).append(alMatrixTopNControlTable, rhs.alMatrixTopNControlTable).append(alMatrixTopNTable, rhs.alMatrixTopNTable).append(usrHistoryControlTable, rhs.usrHistoryControlTable).append(usrHistoryObjectTable, rhs.usrHistoryObjectTable).append(usrHistoryTable, rhs.usrHistoryTable).append(probeConfig, rhs.probeConfig).append(serialConfigTable, rhs.serialConfigTable).append(netConfigTable, rhs.netConfigTable).append(trapDestTable, rhs.trapDestTable).append(serialConnectionTable, rhs.serialConnectionTable).append(historyControlTable, rhs.historyControlTable).append(etherHistoryTable, rhs.etherHistoryTable).append(tokenRingMLHistoryTable, rhs.tokenRingMLHistoryTable).append(tokenRingPHistoryTable, rhs.tokenRingPHistoryTable).append(historyControl2Table, rhs.historyControl2Table).append(alarmTable, rhs.alarmTable).append(hostControlTable, rhs.hostControlTable).append(hostTable, rhs.hostTable).append(hostTimeTable, rhs.hostTimeTable).append(hostControl2Table, rhs.hostControl2Table).append(hostTopNControlTable, rhs.hostTopNControlTable).append(hostTopNTable, rhs.hostTopNTable).append(matrixControlTable, rhs.matrixControlTable).append(matrixSDTable, rhs.matrixSDTable).append(matrixDSTable, rhs.matrixDSTable).append(matrixControl2Table, rhs.matrixControl2Table).append(filterTable, rhs.filterTable).append(channelTable, rhs.channelTable).append(channel2Table, rhs.channel2Table).append(filter2Table, rhs.filter2Table).append(bufferControlTable, rhs.bufferControlTable).append(captureBufferTable, rhs.captureBufferTable).append(eventTable, rhs.eventTable).append(logTable, rhs.logTable).append(dot1dBase, rhs.dot1dBase).append(dot1dBasePortTable, rhs.dot1dBasePortTable).append(dot1dStp, rhs.dot1dStp).append(dot1dStpPortTable, rhs.dot1dStpPortTable).append(dot1dTp, rhs.dot1dTp).append(dot1dTpFdbTable, rhs.dot1dTpFdbTable).append(dot1dTpPortTable, rhs.dot1dTpPortTable).append(dot1dTpHCPortTable, rhs.dot1dTpHCPortTable).append(dot1dTpPortOverflowTable, rhs.dot1dTpPortOverflowTable).append(dot1dStaticTable, rhs.dot1dStaticTable).append(dot1dExtBase, rhs.dot1dExtBase).append(dot1dPortCapabilitiesTable, rhs.dot1dPortCapabilitiesTable).append(dot1dPortPriorityTable, rhs.dot1dPortPriorityTable).append(dot1dUserPriorityRegenTable, rhs.dot1dUserPriorityRegenTable).append(dot1dTrafficClassTable, rhs.dot1dTrafficClassTable).append(dot1dPortOutboundAccessPriorityTable, rhs.dot1dPortOutboundAccessPriorityTable).append(dot1dPortGarpTable, rhs.dot1dPortGarpTable).append(dot1dPortGmrpTable, rhs.dot1dPortGmrpTable).append(dot1qBase, rhs.dot1qBase).append(dot1qFdbTable, rhs.dot1qFdbTable).append(dot1qTpFdbTable, rhs.dot1qTpFdbTable).append(dot1qTpGroupTable, rhs.dot1qTpGroupTable).append(dot1qForwardAllTable, rhs.dot1qForwardAllTable).append(dot1qForwardUnregisteredTable, rhs.dot1qForwardUnregisteredTable).append(dot1qStaticUnicastTable, rhs.dot1qStaticUnicastTable).append(dot1qStaticMulticastTable, rhs.dot1qStaticMulticastTable).append(dot1qVlan, rhs.dot1qVlan).append(dot1qVlanCurrentTable, rhs.dot1qVlanCurrentTable).append(dot1qVlanStaticTable, rhs.dot1qVlanStaticTable).append(dot1qPortVlanTable, rhs.dot1qPortVlanTable).append(dot1qPortVlanStatisticsTable, rhs.dot1qPortVlanStatisticsTable).append(dot1qPortVlanHCStatisticsTable, rhs.dot1qPortVlanHCStatisticsTable).append(dot1qLearningConstraintsTable, rhs.dot1qLearningConstraintsTable).append(interfaces, rhs.interfaces).append(ifTable, rhs.ifTable).append(hrSystem, rhs.hrSystem).append(hrStorage, rhs.hrStorage).append(hrStorageTable, rhs.hrStorageTable).append(hrDeviceTable, rhs.hrDeviceTable).append(hrProcessorTable, rhs.hrProcessorTable).append(hrNetworkTable, rhs.hrNetworkTable).append(hrPrinterTable, rhs.hrPrinterTable).append(hrDiskStorageTable, rhs.hrDiskStorageTable).append(hrPartitionTable, rhs.hrPartitionTable).append(hrFSTable, rhs.hrFSTable).append(hrSWRun, rhs.hrSWRun).append(hrSWRunTable, rhs.hrSWRunTable).append(hrSWRunPerfTable, rhs.hrSWRunPerfTable).append(hrSWInstalled, rhs.hrSWInstalled).append(hrSWInstalledTable, rhs.hrSWInstalledTable).append(applTable, rhs.applTable).append(assocTable, rhs.assocTable).append(mtaTable, rhs.mtaTable).append(mtaGroupTable, rhs.mtaGroupTable).append(mtaGroupAssociationTable, rhs.mtaGroupAssociationTable).append(mtaGroupErrorTable, rhs.mtaGroupErrorTable).append(atTable, rhs.atTable).append(ifMIBObjects, rhs.ifMIBObjects).append(ifXTable, rhs.ifXTable).append(ifStackTable, rhs.ifStackTable).append(ifTestTable, rhs.ifTestTable).append(ifRcvAddressTable, rhs.ifRcvAddressTable).append(ip, rhs.ip).append(ipAddrTable, rhs.ipAddrTable).append(ipRouteTable, rhs.ipRouteTable).append(ipNetToMediaTable, rhs.ipNetToMediaTable).append(ipForward, rhs.ipForward).append(ipForwardTable, rhs.ipForwardTable).append(ipCidrRouteTable, rhs.ipCidrRouteTable).append(inetCidrRouteTable, rhs.inetCidrRouteTable).append(ipv4InterfaceTable, rhs.ipv4InterfaceTable).append(ipv6InterfaceTable, rhs.ipv6InterfaceTable).append(ipTrafficStats, rhs.ipTrafficStats).append(ipSystemStatsTable, rhs.ipSystemStatsTable).append(ipIfStatsTable, rhs.ipIfStatsTable).append(ipAddressPrefixTable, rhs.ipAddressPrefixTable).append(ipAddressTable, rhs.ipAddressTable).append(ipNetToPhysicalTable, rhs.ipNetToPhysicalTable).append(ipv6ScopeZoneIndexTable, rhs.ipv6ScopeZoneIndexTable).append(ipDefaultRouterTable, rhs.ipDefaultRouterTable).append(ipv6RouterAdvertTable, rhs.ipv6RouterAdvertTable).append(icmp, rhs.icmp).append(icmpStatsTable, rhs.icmpStatsTable).append(icmpMsgStatsTable, rhs.icmpMsgStatsTable).append(ipv6MIBObjects, rhs.ipv6MIBObjects).append(ipv6RouteTable, rhs.ipv6RouteTable).append(ipv6NetToMediaTable, rhs.ipv6NetToMediaTable).append(ipv6IfTable, rhs.ipv6IfTable).append(ipv6IfStatsTable, rhs.ipv6IfStatsTable).append(ipv6AddrPrefixTable, rhs.ipv6AddrPrefixTable).append(ipv6AddrTable, rhs.ipv6AddrTable).append(ipv6IfIcmpTable, rhs.ipv6IfIcmpTable).append(tcp, rhs.tcp).append(tcpConnTable, rhs.tcpConnTable).append(ipv6TcpConnTable, rhs.ipv6TcpConnTable).append(tcpConnectionTable, rhs.tcpConnectionTable).append(tcpListenerTable, rhs.tcpListenerTable).append(schedObjects, rhs.schedObjects).append(schedTable, rhs.schedTable).append(smLangTable, rhs.smLangTable).append(smExtsnTable, rhs.smExtsnTable).append(smScriptTable, rhs.smScriptTable).append(smCodeTable, rhs.smCodeTable).append(smLaunchTable, rhs.smLaunchTable).append(smRunTable, rhs.smRunTable).append(radiusAuthClient, rhs.radiusAuthClient).append(radiusAuthServerTable, rhs.radiusAuthServerTable).append(radiusAccClient, rhs.radiusAccClient).append(radiusAccServerTable, rhs.radiusAccServerTable).append(udp, rhs.udp).append(udpTable, rhs.udpTable).append(ipv6UdpTable, rhs.ipv6UdpTable).append(udpEndpointTable, rhs.udpEndpointTable).append(agentxGeneral, rhs.agentxGeneral).append(agentxConnection, rhs.agentxConnection).append(agentxConnectionTable, rhs.agentxConnectionTable).append(agentxSession, rhs.agentxSession).append(agentxSessionTable, rhs.agentxSessionTable).append(agentxRegistration, rhs.agentxRegistration).append(agentxRegistrationTable, rhs.agentxRegistrationTable).append(ifInvStackTable, rhs.ifInvStackTable).append(egp, rhs.egp).append(egpNeighTable, rhs.egpNeighTable).append(mteResource, rhs.mteResource).append(mteTrigger, rhs.mteTrigger).append(mteTriggerTable, rhs.mteTriggerTable).append(mteTriggerDeltaTable, rhs.mteTriggerDeltaTable).append(mteTriggerExistenceTable, rhs.mteTriggerExistenceTable).append(mteTriggerBooleanTable, rhs.mteTriggerBooleanTable).append(mteTriggerThresholdTable, rhs.mteTriggerThresholdTable).append(mteObjectsTable, rhs.mteObjectsTable).append(mteEvent, rhs.mteEvent).append(mteEventTable, rhs.mteEventTable).append(mteEventNotificationTable, rhs.mteEventNotificationTable).append(mteEventSetTable, rhs.mteEventSetTable).append(dismanEventMIBNotificationObjects, rhs.dismanEventMIBNotificationObjects).append(nlmConfig, rhs.nlmConfig).append(nlmConfigLogTable, rhs.nlmConfigLogTable).append(nlmStats, rhs.nlmStats).append(nlmStatsLogTable, rhs.nlmStatsLogTable).append(nlmLogTable, rhs.nlmLogTable).append(nlmLogVariableTable, rhs.nlmLogVariableTable).isEquals();
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
        if (tokenRingMLStatsTable!= null) {
            _copy.tokenRingMLStatsTable = tokenRingMLStatsTable.clone();
            _copy.tokenRingMLStatsTable.set_ParentEntity(_copy);
        }
        if (tokenRingPStatsTable!= null) {
            _copy.tokenRingPStatsTable = tokenRingPStatsTable.clone();
            _copy.tokenRingPStatsTable.set_ParentEntity(_copy);
        }
        if (etherStats2Table!= null) {
            _copy.etherStats2Table = etherStats2Table.clone();
            _copy.etherStats2Table.set_ParentEntity(_copy);
        }
        if (tokenRingMLStats2Table!= null) {
            _copy.tokenRingMLStats2Table = tokenRingMLStats2Table.clone();
            _copy.tokenRingMLStats2Table.set_ParentEntity(_copy);
        }
        if (tokenRingPStats2Table!= null) {
            _copy.tokenRingPStats2Table = tokenRingPStats2Table.clone();
            _copy.tokenRingPStats2Table.set_ParentEntity(_copy);
        }
        if (ringStationControlTable!= null) {
            _copy.ringStationControlTable = ringStationControlTable.clone();
            _copy.ringStationControlTable.set_ParentEntity(_copy);
        }
        if (ringStationTable!= null) {
            _copy.ringStationTable = ringStationTable.clone();
            _copy.ringStationTable.set_ParentEntity(_copy);
        }
        if (ringStationOrderTable!= null) {
            _copy.ringStationOrderTable = ringStationOrderTable.clone();
            _copy.ringStationOrderTable.set_ParentEntity(_copy);
        }
        if (ringStationConfigControlTable!= null) {
            _copy.ringStationConfigControlTable = ringStationConfigControlTable.clone();
            _copy.ringStationConfigControlTable.set_ParentEntity(_copy);
        }
        if (ringStationConfigTable!= null) {
            _copy.ringStationConfigTable = ringStationConfigTable.clone();
            _copy.ringStationConfigTable.set_ParentEntity(_copy);
        }
        if (sourceRoutingStatsTable!= null) {
            _copy.sourceRoutingStatsTable = sourceRoutingStatsTable.clone();
            _copy.sourceRoutingStatsTable.set_ParentEntity(_copy);
        }
        if (ringStationControl2Table!= null) {
            _copy.ringStationControl2Table = ringStationControl2Table.clone();
            _copy.ringStationControl2Table.set_ParentEntity(_copy);
        }
        if (sourceRoutingStats2Table!= null) {
            _copy.sourceRoutingStats2Table = sourceRoutingStats2Table.clone();
            _copy.sourceRoutingStats2Table.set_ParentEntity(_copy);
        }
        if (protocolDir!= null) {
            _copy.protocolDir = protocolDir.clone();
            _copy.protocolDir.set_ParentEntity(_copy);
        }
        if (protocolDirTable!= null) {
            _copy.protocolDirTable = protocolDirTable.clone();
            _copy.protocolDirTable.set_ParentEntity(_copy);
        }
        if (protocolDistControlTable!= null) {
            _copy.protocolDistControlTable = protocolDistControlTable.clone();
            _copy.protocolDistControlTable.set_ParentEntity(_copy);
        }
        if (protocolDistStatsTable!= null) {
            _copy.protocolDistStatsTable = protocolDistStatsTable.clone();
            _copy.protocolDistStatsTable.set_ParentEntity(_copy);
        }
        if (addressMap!= null) {
            _copy.addressMap = addressMap.clone();
            _copy.addressMap.set_ParentEntity(_copy);
        }
        if (addressMapControlTable!= null) {
            _copy.addressMapControlTable = addressMapControlTable.clone();
            _copy.addressMapControlTable.set_ParentEntity(_copy);
        }
        if (addressMapTable!= null) {
            _copy.addressMapTable = addressMapTable.clone();
            _copy.addressMapTable.set_ParentEntity(_copy);
        }
        if (hlHostControlTable!= null) {
            _copy.hlHostControlTable = hlHostControlTable.clone();
            _copy.hlHostControlTable.set_ParentEntity(_copy);
        }
        if (nlHostTable!= null) {
            _copy.nlHostTable = nlHostTable.clone();
            _copy.nlHostTable.set_ParentEntity(_copy);
        }
        if (hlMatrixControlTable!= null) {
            _copy.hlMatrixControlTable = hlMatrixControlTable.clone();
            _copy.hlMatrixControlTable.set_ParentEntity(_copy);
        }
        if (nlMatrixSDTable!= null) {
            _copy.nlMatrixSDTable = nlMatrixSDTable.clone();
            _copy.nlMatrixSDTable.set_ParentEntity(_copy);
        }
        if (nlMatrixDSTable!= null) {
            _copy.nlMatrixDSTable = nlMatrixDSTable.clone();
            _copy.nlMatrixDSTable.set_ParentEntity(_copy);
        }
        if (nlMatrixTopNControlTable!= null) {
            _copy.nlMatrixTopNControlTable = nlMatrixTopNControlTable.clone();
            _copy.nlMatrixTopNControlTable.set_ParentEntity(_copy);
        }
        if (nlMatrixTopNTable!= null) {
            _copy.nlMatrixTopNTable = nlMatrixTopNTable.clone();
            _copy.nlMatrixTopNTable.set_ParentEntity(_copy);
        }
        if (alHostTable!= null) {
            _copy.alHostTable = alHostTable.clone();
            _copy.alHostTable.set_ParentEntity(_copy);
        }
        if (alMatrixSDTable!= null) {
            _copy.alMatrixSDTable = alMatrixSDTable.clone();
            _copy.alMatrixSDTable.set_ParentEntity(_copy);
        }
        if (alMatrixDSTable!= null) {
            _copy.alMatrixDSTable = alMatrixDSTable.clone();
            _copy.alMatrixDSTable.set_ParentEntity(_copy);
        }
        if (alMatrixTopNControlTable!= null) {
            _copy.alMatrixTopNControlTable = alMatrixTopNControlTable.clone();
            _copy.alMatrixTopNControlTable.set_ParentEntity(_copy);
        }
        if (alMatrixTopNTable!= null) {
            _copy.alMatrixTopNTable = alMatrixTopNTable.clone();
            _copy.alMatrixTopNTable.set_ParentEntity(_copy);
        }
        if (usrHistoryControlTable!= null) {
            _copy.usrHistoryControlTable = usrHistoryControlTable.clone();
            _copy.usrHistoryControlTable.set_ParentEntity(_copy);
        }
        if (usrHistoryObjectTable!= null) {
            _copy.usrHistoryObjectTable = usrHistoryObjectTable.clone();
            _copy.usrHistoryObjectTable.set_ParentEntity(_copy);
        }
        if (usrHistoryTable!= null) {
            _copy.usrHistoryTable = usrHistoryTable.clone();
            _copy.usrHistoryTable.set_ParentEntity(_copy);
        }
        if (probeConfig!= null) {
            _copy.probeConfig = probeConfig.clone();
            _copy.probeConfig.set_ParentEntity(_copy);
        }
        if (serialConfigTable!= null) {
            _copy.serialConfigTable = serialConfigTable.clone();
            _copy.serialConfigTable.set_ParentEntity(_copy);
        }
        if (netConfigTable!= null) {
            _copy.netConfigTable = netConfigTable.clone();
            _copy.netConfigTable.set_ParentEntity(_copy);
        }
        if (trapDestTable!= null) {
            _copy.trapDestTable = trapDestTable.clone();
            _copy.trapDestTable.set_ParentEntity(_copy);
        }
        if (serialConnectionTable!= null) {
            _copy.serialConnectionTable = serialConnectionTable.clone();
            _copy.serialConnectionTable.set_ParentEntity(_copy);
        }
        if (historyControlTable!= null) {
            _copy.historyControlTable = historyControlTable.clone();
            _copy.historyControlTable.set_ParentEntity(_copy);
        }
        if (etherHistoryTable!= null) {
            _copy.etherHistoryTable = etherHistoryTable.clone();
            _copy.etherHistoryTable.set_ParentEntity(_copy);
        }
        if (tokenRingMLHistoryTable!= null) {
            _copy.tokenRingMLHistoryTable = tokenRingMLHistoryTable.clone();
            _copy.tokenRingMLHistoryTable.set_ParentEntity(_copy);
        }
        if (tokenRingPHistoryTable!= null) {
            _copy.tokenRingPHistoryTable = tokenRingPHistoryTable.clone();
            _copy.tokenRingPHistoryTable.set_ParentEntity(_copy);
        }
        if (historyControl2Table!= null) {
            _copy.historyControl2Table = historyControl2Table.clone();
            _copy.historyControl2Table.set_ParentEntity(_copy);
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
        if (hostControl2Table!= null) {
            _copy.hostControl2Table = hostControl2Table.clone();
            _copy.hostControl2Table.set_ParentEntity(_copy);
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
        if (matrixControl2Table!= null) {
            _copy.matrixControl2Table = matrixControl2Table.clone();
            _copy.matrixControl2Table.set_ParentEntity(_copy);
        }
        if (filterTable!= null) {
            _copy.filterTable = filterTable.clone();
            _copy.filterTable.set_ParentEntity(_copy);
        }
        if (channelTable!= null) {
            _copy.channelTable = channelTable.clone();
            _copy.channelTable.set_ParentEntity(_copy);
        }
        if (channel2Table!= null) {
            _copy.channel2Table = channel2Table.clone();
            _copy.channel2Table.set_ParentEntity(_copy);
        }
        if (filter2Table!= null) {
            _copy.filter2Table = filter2Table.clone();
            _copy.filter2Table.set_ParentEntity(_copy);
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
        if (dot1dBase!= null) {
            _copy.dot1dBase = dot1dBase.clone();
            _copy.dot1dBase.set_ParentEntity(_copy);
        }
        if (dot1dBasePortTable!= null) {
            _copy.dot1dBasePortTable = dot1dBasePortTable.clone();
            _copy.dot1dBasePortTable.set_ParentEntity(_copy);
        }
        if (dot1dStp!= null) {
            _copy.dot1dStp = dot1dStp.clone();
            _copy.dot1dStp.set_ParentEntity(_copy);
        }
        if (dot1dStpPortTable!= null) {
            _copy.dot1dStpPortTable = dot1dStpPortTable.clone();
            _copy.dot1dStpPortTable.set_ParentEntity(_copy);
        }
        if (dot1dTp!= null) {
            _copy.dot1dTp = dot1dTp.clone();
            _copy.dot1dTp.set_ParentEntity(_copy);
        }
        if (dot1dTpFdbTable!= null) {
            _copy.dot1dTpFdbTable = dot1dTpFdbTable.clone();
            _copy.dot1dTpFdbTable.set_ParentEntity(_copy);
        }
        if (dot1dTpPortTable!= null) {
            _copy.dot1dTpPortTable = dot1dTpPortTable.clone();
            _copy.dot1dTpPortTable.set_ParentEntity(_copy);
        }
        if (dot1dTpHCPortTable!= null) {
            _copy.dot1dTpHCPortTable = dot1dTpHCPortTable.clone();
            _copy.dot1dTpHCPortTable.set_ParentEntity(_copy);
        }
        if (dot1dTpPortOverflowTable!= null) {
            _copy.dot1dTpPortOverflowTable = dot1dTpPortOverflowTable.clone();
            _copy.dot1dTpPortOverflowTable.set_ParentEntity(_copy);
        }
        if (dot1dStaticTable!= null) {
            _copy.dot1dStaticTable = dot1dStaticTable.clone();
            _copy.dot1dStaticTable.set_ParentEntity(_copy);
        }
        if (dot1dExtBase!= null) {
            _copy.dot1dExtBase = dot1dExtBase.clone();
            _copy.dot1dExtBase.set_ParentEntity(_copy);
        }
        if (dot1dPortCapabilitiesTable!= null) {
            _copy.dot1dPortCapabilitiesTable = dot1dPortCapabilitiesTable.clone();
            _copy.dot1dPortCapabilitiesTable.set_ParentEntity(_copy);
        }
        if (dot1dPortPriorityTable!= null) {
            _copy.dot1dPortPriorityTable = dot1dPortPriorityTable.clone();
            _copy.dot1dPortPriorityTable.set_ParentEntity(_copy);
        }
        if (dot1dUserPriorityRegenTable!= null) {
            _copy.dot1dUserPriorityRegenTable = dot1dUserPriorityRegenTable.clone();
            _copy.dot1dUserPriorityRegenTable.set_ParentEntity(_copy);
        }
        if (dot1dTrafficClassTable!= null) {
            _copy.dot1dTrafficClassTable = dot1dTrafficClassTable.clone();
            _copy.dot1dTrafficClassTable.set_ParentEntity(_copy);
        }
        if (dot1dPortOutboundAccessPriorityTable!= null) {
            _copy.dot1dPortOutboundAccessPriorityTable = dot1dPortOutboundAccessPriorityTable.clone();
            _copy.dot1dPortOutboundAccessPriorityTable.set_ParentEntity(_copy);
        }
        if (dot1dPortGarpTable!= null) {
            _copy.dot1dPortGarpTable = dot1dPortGarpTable.clone();
            _copy.dot1dPortGarpTable.set_ParentEntity(_copy);
        }
        if (dot1dPortGmrpTable!= null) {
            _copy.dot1dPortGmrpTable = dot1dPortGmrpTable.clone();
            _copy.dot1dPortGmrpTable.set_ParentEntity(_copy);
        }
        if (dot1qBase!= null) {
            _copy.dot1qBase = dot1qBase.clone();
            _copy.dot1qBase.set_ParentEntity(_copy);
        }
        if (dot1qFdbTable!= null) {
            _copy.dot1qFdbTable = dot1qFdbTable.clone();
            _copy.dot1qFdbTable.set_ParentEntity(_copy);
        }
        if (dot1qTpFdbTable!= null) {
            _copy.dot1qTpFdbTable = dot1qTpFdbTable.clone();
            _copy.dot1qTpFdbTable.set_ParentEntity(_copy);
        }
        if (dot1qTpGroupTable!= null) {
            _copy.dot1qTpGroupTable = dot1qTpGroupTable.clone();
            _copy.dot1qTpGroupTable.set_ParentEntity(_copy);
        }
        if (dot1qForwardAllTable!= null) {
            _copy.dot1qForwardAllTable = dot1qForwardAllTable.clone();
            _copy.dot1qForwardAllTable.set_ParentEntity(_copy);
        }
        if (dot1qForwardUnregisteredTable!= null) {
            _copy.dot1qForwardUnregisteredTable = dot1qForwardUnregisteredTable.clone();
            _copy.dot1qForwardUnregisteredTable.set_ParentEntity(_copy);
        }
        if (dot1qStaticUnicastTable!= null) {
            _copy.dot1qStaticUnicastTable = dot1qStaticUnicastTable.clone();
            _copy.dot1qStaticUnicastTable.set_ParentEntity(_copy);
        }
        if (dot1qStaticMulticastTable!= null) {
            _copy.dot1qStaticMulticastTable = dot1qStaticMulticastTable.clone();
            _copy.dot1qStaticMulticastTable.set_ParentEntity(_copy);
        }
        if (dot1qVlan!= null) {
            _copy.dot1qVlan = dot1qVlan.clone();
            _copy.dot1qVlan.set_ParentEntity(_copy);
        }
        if (dot1qVlanCurrentTable!= null) {
            _copy.dot1qVlanCurrentTable = dot1qVlanCurrentTable.clone();
            _copy.dot1qVlanCurrentTable.set_ParentEntity(_copy);
        }
        if (dot1qVlanStaticTable!= null) {
            _copy.dot1qVlanStaticTable = dot1qVlanStaticTable.clone();
            _copy.dot1qVlanStaticTable.set_ParentEntity(_copy);
        }
        if (dot1qPortVlanTable!= null) {
            _copy.dot1qPortVlanTable = dot1qPortVlanTable.clone();
            _copy.dot1qPortVlanTable.set_ParentEntity(_copy);
        }
        if (dot1qPortVlanStatisticsTable!= null) {
            _copy.dot1qPortVlanStatisticsTable = dot1qPortVlanStatisticsTable.clone();
            _copy.dot1qPortVlanStatisticsTable.set_ParentEntity(_copy);
        }
        if (dot1qPortVlanHCStatisticsTable!= null) {
            _copy.dot1qPortVlanHCStatisticsTable = dot1qPortVlanHCStatisticsTable.clone();
            _copy.dot1qPortVlanHCStatisticsTable.set_ParentEntity(_copy);
        }
        if (dot1qLearningConstraintsTable!= null) {
            _copy.dot1qLearningConstraintsTable = dot1qLearningConstraintsTable.clone();
            _copy.dot1qLearningConstraintsTable.set_ParentEntity(_copy);
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
        if (radiusAuthClient!= null) {
            _copy.radiusAuthClient = radiusAuthClient.clone();
            _copy.radiusAuthClient.set_ParentEntity(_copy);
        }
        if (radiusAuthServerTable!= null) {
            _copy.radiusAuthServerTable = radiusAuthServerTable.clone();
            _copy.radiusAuthServerTable.set_ParentEntity(_copy);
        }
        if (radiusAccClient!= null) {
            _copy.radiusAccClient = radiusAccClient.clone();
            _copy.radiusAccClient.set_ParentEntity(_copy);
        }
        if (radiusAccServerTable!= null) {
            _copy.radiusAccServerTable = radiusAccServerTable.clone();
            _copy.radiusAccServerTable.set_ParentEntity(_copy);
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
        return new DeviceEntity[] {dot1dStpPortTable, ipAddrTable, ipRouteTable, dot3PauseTable, dot1qStaticUnicastTable, dot1qStaticMulticastTable, radiusAuthClient, ipNetToMediaTable, ipForward, ipv4InterfaceTable, ipv6InterfaceTable, ipTrafficStats, ipAddressPrefixTable, mteObjectsTable, ipv6RouterAdvertTable, ipDefaultRouterTable, ipv6ScopeZoneIndexTable, ipNetToPhysicalTable, ipAddressTable, dot1qVlan, dot1qBase, dismanEventMIBNotificationObjects, nlmLogTable, nlmLogVariableTable, atTable, ipv6MIBObjects, dot3CollTable, dot1qFdbTable, dot3StatsTable, dot3ControlTable, schedTable, protocolDistStatsTable, ipv6RouteTable, ipv6NetToMediaTable, smRunTable, smLaunchTable, captureBufferTable, bufferControlTable, protocolDistControlTable, trapDestTable, serialConnectionTable, dot1dPortGarpTable, alarmTable, serialConfigTable, netConfigTable, dot1qTpFdbTable, dot1qTpGroupTable, dot1qForwardAllTable, dot1qForwardUnregisteredTable, hostTimeTable, hostControl2Table, hostControlTable, hostTable, mteTriggerBooleanTable, mteTriggerThresholdTable, mteTriggerTable, mteTriggerDeltaTable, mteTriggerExistenceTable, radiusAuthServerTable, mteEventSetTable, mteEventNotificationTable, mteEventTable, dot1dBasePortTable, nlmConfig, egpNeighTable, nlmStats, ifTable, udpTable, hrSWRunTable, ipv6UdpTable, udpEndpointTable, probeConfig, hrFSTable, ifMIBObjects, addressMap, hrPartitionTable, hrDiskStorageTable, hrPrinterTable, hrNetworkTable, hrProcessorTable, hrDeviceTable, sctpLookupRemIPAddrTable, protocolDir, dot1dPortPriorityTable, dot3HCStatsTable, ipv6IfTable, tcpConnectionTable, dot1dUserPriorityRegenTable, ipv6IfStatsTable, ipv6AddrPrefixTable, ipv6AddrTable, ipv6TcpConnTable, tcpConnTable, radiusAccClient, dot1dStaticTable, tcpListenerTable, egp, tcp, udp, dot1dBase, dot1dTp, dot1dStp, agentxConnectionTable, system, agentxSessionTable, eventTable, logTable, dot1dPortOutboundAccessPriorityTable, icmp, dot1dTrafficClassTable, ip, interfaces, hlMatrixControlTable, nlMatrixSDTable, hostTopNControlTable, nlMatrixTopNTable, nlMatrixDSTable, hostTopNTable, nlMatrixTopNControlTable, ifRcvAddressTable, ifTestTable, snmp, alHostTable, ifStackTable, ifXTable, channelTable, protocolDirTable, channel2Table, filter2Table, nlHostTable, hlHostControlTable, addressMapControlTable, ifInvStackTable, filterTable, addressMapTable, usrHistoryControlTable, usrHistoryObjectTable, schedObjects, usrHistoryTable, icmpStatsTable, alMatrixSDTable, alMatrixDSTable, alMatrixTopNControlTable, alMatrixTopNTable, sysORTable, agentxRegistration, agentxGeneral, icmpMsgStatsTable, agentxSession, agentxConnection, historyControlTable, etherHistoryTable, smScriptTable, historyControl2Table, dot1dTpPortOverflowTable, dot1dTpHCPortTable, tokenRingMLHistoryTable, dot1dTpPortTable, tokenRingPHistoryTable, dot1dTpFdbTable, tokenRingPStats2Table, etherStats2Table, tokenRingMLStats2Table, tokenRingMLStatsTable, tokenRingPStatsTable, etherStatsTable, nlmConfigLogTable, ipIfStatsTable, ipSystemStatsTable, mteEvent, mteResource, ipv6IfIcmpTable, mteTrigger, nlmStatsLogTable, smCodeTable, dot1dPortCapabilitiesTable, mtaTable, dot1qVlanStaticTable, dot1qVlanCurrentTable, applTable, assocTable, dot1qPortVlanHCStatisticsTable, smLangTable, dot1qPortVlanStatisticsTable, smExtsnTable, dot1qPortVlanTable, mtaGroupTable, mtaGroupAssociationTable, dot1qLearningConstraintsTable, mtaGroupErrorTable, sctpLookupRemPrimIPAddrTable, sctpLookupRemHostNameTable, sctpLookupRemPortTable, hrSWInstalled, sctpLookupLocalPortTable, ipCidrRouteTable, sctpAssocRemAddrTable, inetCidrRouteTable, sctpAssocLocalAddrTable, sctpAssocTable, sctpParams, hrStorageTable, sctpStats, ipForwardTable, agentxRegistrationTable, matrixControl2Table, ringStationTable, matrixDSTable, ringStationOrderTable, ringStationControlTable, sourceRoutingStatsTable, hrSystem, ringStationControl2Table, hrStorage, matrixSDTable, ringStationConfigControlTable, matrixControlTable, ringStationConfigTable, hrSWRun, sourceRoutingStats2Table, radiusAccServerTable, dot1dPortGmrpTable, hrSWRunPerfTable, dot1dExtBase, hrSWInstalledTable };
    }

}
