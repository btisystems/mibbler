
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.iptrafficstats.ipsystemstatstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iptrafficstats.ipsystemstatstable.IIpSystemStatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.iptrafficstats.IpSystemStatsTable;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IIndexed;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class IpSystemStatsEntry
    extends DeviceEntity
    implements Serializable, IIpSystemStatsEntry, IIndexed, IVariableBindingSetter
{

    private int ipSystemStatsIPVersion;
    private int ipSystemStatsInReceives;
    private long ipSystemStatsHCInReceives;
    private int ipSystemStatsInOctets;
    private long ipSystemStatsHCInOctets;
    private int ipSystemStatsInHdrErrors;
    private int ipSystemStatsInNoRoutes;
    private int ipSystemStatsInAddrErrors;
    private int ipSystemStatsInUnknownProtos;
    private int ipSystemStatsInTruncatedPkts;
    private int ipSystemStatsInForwDatagrams;
    private long ipSystemStatsHCInForwDatagrams;
    private int ipSystemStatsReasmReqds;
    private int ipSystemStatsReasmOKs;
    private int ipSystemStatsReasmFails;
    private int ipSystemStatsInDiscards;
    private int ipSystemStatsInDelivers;
    private long ipSystemStatsHCInDelivers;
    private int ipSystemStatsOutRequests;
    private long ipSystemStatsHCOutRequests;
    private int ipSystemStatsOutNoRoutes;
    private int ipSystemStatsOutForwDatagrams;
    private long ipSystemStatsHCOutForwDatagrams;
    private int ipSystemStatsOutDiscards;
    private int ipSystemStatsOutFragReqds;
    private int ipSystemStatsOutFragOKs;
    private int ipSystemStatsOutFragFails;
    private int ipSystemStatsOutFragCreates;
    private int ipSystemStatsOutTransmits;
    private long ipSystemStatsHCOutTransmits;
    private int ipSystemStatsOutOctets;
    private long ipSystemStatsHCOutOctets;
    private int ipSystemStatsInMcastPkts;
    private long ipSystemStatsHCInMcastPkts;
    private int ipSystemStatsInMcastOctets;
    private long ipSystemStatsHCInMcastOctets;
    private int ipSystemStatsOutMcastPkts;
    private long ipSystemStatsHCOutMcastPkts;
    private int ipSystemStatsOutMcastOctets;
    private long ipSystemStatsHCOutMcastOctets;
    private int ipSystemStatsInBcastPkts;
    private long ipSystemStatsHCInBcastPkts;
    private int ipSystemStatsOutBcastPkts;
    private long ipSystemStatsHCOutBcastPkts;
    private int ipSystemStatsDiscontinuityTime;
    private int ipSystemStatsRefreshRate;
    private String _index;
    private IpSystemStatsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpSystemStatsEntry() {
    }

    public int getIpSystemStatsIPVersion() {
        return this.ipSystemStatsIPVersion;
    }

    public void setIpSystemStatsIPVersion(int ipSystemStatsIPVersion) {
        int oldValue = getIpSystemStatsIPVersion();
        this.ipSystemStatsIPVersion = ipSystemStatsIPVersion;
        notifyChange(1, oldValue, ipSystemStatsIPVersion);
    }

    public int getIpSystemStatsInReceives() {
        return this.ipSystemStatsInReceives;
    }

    public void setIpSystemStatsInReceives(int ipSystemStatsInReceives) {
        int oldValue = getIpSystemStatsInReceives();
        this.ipSystemStatsInReceives = ipSystemStatsInReceives;
        notifyChange(3, oldValue, ipSystemStatsInReceives);
    }

    public long getIpSystemStatsHCInReceives() {
        return this.ipSystemStatsHCInReceives;
    }

    public void setIpSystemStatsHCInReceives(long ipSystemStatsHCInReceives) {
        long oldValue = getIpSystemStatsHCInReceives();
        this.ipSystemStatsHCInReceives = ipSystemStatsHCInReceives;
        notifyChange(4, oldValue, ipSystemStatsHCInReceives);
    }

    public int getIpSystemStatsInOctets() {
        return this.ipSystemStatsInOctets;
    }

    public void setIpSystemStatsInOctets(int ipSystemStatsInOctets) {
        int oldValue = getIpSystemStatsInOctets();
        this.ipSystemStatsInOctets = ipSystemStatsInOctets;
        notifyChange(5, oldValue, ipSystemStatsInOctets);
    }

    public long getIpSystemStatsHCInOctets() {
        return this.ipSystemStatsHCInOctets;
    }

    public void setIpSystemStatsHCInOctets(long ipSystemStatsHCInOctets) {
        long oldValue = getIpSystemStatsHCInOctets();
        this.ipSystemStatsHCInOctets = ipSystemStatsHCInOctets;
        notifyChange(6, oldValue, ipSystemStatsHCInOctets);
    }

    public int getIpSystemStatsInHdrErrors() {
        return this.ipSystemStatsInHdrErrors;
    }

    public void setIpSystemStatsInHdrErrors(int ipSystemStatsInHdrErrors) {
        int oldValue = getIpSystemStatsInHdrErrors();
        this.ipSystemStatsInHdrErrors = ipSystemStatsInHdrErrors;
        notifyChange(7, oldValue, ipSystemStatsInHdrErrors);
    }

    public int getIpSystemStatsInNoRoutes() {
        return this.ipSystemStatsInNoRoutes;
    }

    public void setIpSystemStatsInNoRoutes(int ipSystemStatsInNoRoutes) {
        int oldValue = getIpSystemStatsInNoRoutes();
        this.ipSystemStatsInNoRoutes = ipSystemStatsInNoRoutes;
        notifyChange(8, oldValue, ipSystemStatsInNoRoutes);
    }

    public int getIpSystemStatsInAddrErrors() {
        return this.ipSystemStatsInAddrErrors;
    }

    public void setIpSystemStatsInAddrErrors(int ipSystemStatsInAddrErrors) {
        int oldValue = getIpSystemStatsInAddrErrors();
        this.ipSystemStatsInAddrErrors = ipSystemStatsInAddrErrors;
        notifyChange(9, oldValue, ipSystemStatsInAddrErrors);
    }

    public int getIpSystemStatsInUnknownProtos() {
        return this.ipSystemStatsInUnknownProtos;
    }

    public void setIpSystemStatsInUnknownProtos(int ipSystemStatsInUnknownProtos) {
        int oldValue = getIpSystemStatsInUnknownProtos();
        this.ipSystemStatsInUnknownProtos = ipSystemStatsInUnknownProtos;
        notifyChange(10, oldValue, ipSystemStatsInUnknownProtos);
    }

    public int getIpSystemStatsInTruncatedPkts() {
        return this.ipSystemStatsInTruncatedPkts;
    }

    public void setIpSystemStatsInTruncatedPkts(int ipSystemStatsInTruncatedPkts) {
        int oldValue = getIpSystemStatsInTruncatedPkts();
        this.ipSystemStatsInTruncatedPkts = ipSystemStatsInTruncatedPkts;
        notifyChange(11, oldValue, ipSystemStatsInTruncatedPkts);
    }

    public int getIpSystemStatsInForwDatagrams() {
        return this.ipSystemStatsInForwDatagrams;
    }

    public void setIpSystemStatsInForwDatagrams(int ipSystemStatsInForwDatagrams) {
        int oldValue = getIpSystemStatsInForwDatagrams();
        this.ipSystemStatsInForwDatagrams = ipSystemStatsInForwDatagrams;
        notifyChange(12, oldValue, ipSystemStatsInForwDatagrams);
    }

    public long getIpSystemStatsHCInForwDatagrams() {
        return this.ipSystemStatsHCInForwDatagrams;
    }

    public void setIpSystemStatsHCInForwDatagrams(long ipSystemStatsHCInForwDatagrams) {
        long oldValue = getIpSystemStatsHCInForwDatagrams();
        this.ipSystemStatsHCInForwDatagrams = ipSystemStatsHCInForwDatagrams;
        notifyChange(13, oldValue, ipSystemStatsHCInForwDatagrams);
    }

    public int getIpSystemStatsReasmReqds() {
        return this.ipSystemStatsReasmReqds;
    }

    public void setIpSystemStatsReasmReqds(int ipSystemStatsReasmReqds) {
        int oldValue = getIpSystemStatsReasmReqds();
        this.ipSystemStatsReasmReqds = ipSystemStatsReasmReqds;
        notifyChange(14, oldValue, ipSystemStatsReasmReqds);
    }

    public int getIpSystemStatsReasmOKs() {
        return this.ipSystemStatsReasmOKs;
    }

    public void setIpSystemStatsReasmOKs(int ipSystemStatsReasmOKs) {
        int oldValue = getIpSystemStatsReasmOKs();
        this.ipSystemStatsReasmOKs = ipSystemStatsReasmOKs;
        notifyChange(15, oldValue, ipSystemStatsReasmOKs);
    }

    public int getIpSystemStatsReasmFails() {
        return this.ipSystemStatsReasmFails;
    }

    public void setIpSystemStatsReasmFails(int ipSystemStatsReasmFails) {
        int oldValue = getIpSystemStatsReasmFails();
        this.ipSystemStatsReasmFails = ipSystemStatsReasmFails;
        notifyChange(16, oldValue, ipSystemStatsReasmFails);
    }

    public int getIpSystemStatsInDiscards() {
        return this.ipSystemStatsInDiscards;
    }

    public void setIpSystemStatsInDiscards(int ipSystemStatsInDiscards) {
        int oldValue = getIpSystemStatsInDiscards();
        this.ipSystemStatsInDiscards = ipSystemStatsInDiscards;
        notifyChange(17, oldValue, ipSystemStatsInDiscards);
    }

    public int getIpSystemStatsInDelivers() {
        return this.ipSystemStatsInDelivers;
    }

    public void setIpSystemStatsInDelivers(int ipSystemStatsInDelivers) {
        int oldValue = getIpSystemStatsInDelivers();
        this.ipSystemStatsInDelivers = ipSystemStatsInDelivers;
        notifyChange(18, oldValue, ipSystemStatsInDelivers);
    }

    public long getIpSystemStatsHCInDelivers() {
        return this.ipSystemStatsHCInDelivers;
    }

    public void setIpSystemStatsHCInDelivers(long ipSystemStatsHCInDelivers) {
        long oldValue = getIpSystemStatsHCInDelivers();
        this.ipSystemStatsHCInDelivers = ipSystemStatsHCInDelivers;
        notifyChange(19, oldValue, ipSystemStatsHCInDelivers);
    }

    public int getIpSystemStatsOutRequests() {
        return this.ipSystemStatsOutRequests;
    }

    public void setIpSystemStatsOutRequests(int ipSystemStatsOutRequests) {
        int oldValue = getIpSystemStatsOutRequests();
        this.ipSystemStatsOutRequests = ipSystemStatsOutRequests;
        notifyChange(20, oldValue, ipSystemStatsOutRequests);
    }

    public long getIpSystemStatsHCOutRequests() {
        return this.ipSystemStatsHCOutRequests;
    }

    public void setIpSystemStatsHCOutRequests(long ipSystemStatsHCOutRequests) {
        long oldValue = getIpSystemStatsHCOutRequests();
        this.ipSystemStatsHCOutRequests = ipSystemStatsHCOutRequests;
        notifyChange(21, oldValue, ipSystemStatsHCOutRequests);
    }

    public int getIpSystemStatsOutNoRoutes() {
        return this.ipSystemStatsOutNoRoutes;
    }

    public void setIpSystemStatsOutNoRoutes(int ipSystemStatsOutNoRoutes) {
        int oldValue = getIpSystemStatsOutNoRoutes();
        this.ipSystemStatsOutNoRoutes = ipSystemStatsOutNoRoutes;
        notifyChange(22, oldValue, ipSystemStatsOutNoRoutes);
    }

    public int getIpSystemStatsOutForwDatagrams() {
        return this.ipSystemStatsOutForwDatagrams;
    }

    public void setIpSystemStatsOutForwDatagrams(int ipSystemStatsOutForwDatagrams) {
        int oldValue = getIpSystemStatsOutForwDatagrams();
        this.ipSystemStatsOutForwDatagrams = ipSystemStatsOutForwDatagrams;
        notifyChange(23, oldValue, ipSystemStatsOutForwDatagrams);
    }

    public long getIpSystemStatsHCOutForwDatagrams() {
        return this.ipSystemStatsHCOutForwDatagrams;
    }

    public void setIpSystemStatsHCOutForwDatagrams(long ipSystemStatsHCOutForwDatagrams) {
        long oldValue = getIpSystemStatsHCOutForwDatagrams();
        this.ipSystemStatsHCOutForwDatagrams = ipSystemStatsHCOutForwDatagrams;
        notifyChange(24, oldValue, ipSystemStatsHCOutForwDatagrams);
    }

    public int getIpSystemStatsOutDiscards() {
        return this.ipSystemStatsOutDiscards;
    }

    public void setIpSystemStatsOutDiscards(int ipSystemStatsOutDiscards) {
        int oldValue = getIpSystemStatsOutDiscards();
        this.ipSystemStatsOutDiscards = ipSystemStatsOutDiscards;
        notifyChange(25, oldValue, ipSystemStatsOutDiscards);
    }

    public int getIpSystemStatsOutFragReqds() {
        return this.ipSystemStatsOutFragReqds;
    }

    public void setIpSystemStatsOutFragReqds(int ipSystemStatsOutFragReqds) {
        int oldValue = getIpSystemStatsOutFragReqds();
        this.ipSystemStatsOutFragReqds = ipSystemStatsOutFragReqds;
        notifyChange(26, oldValue, ipSystemStatsOutFragReqds);
    }

    public int getIpSystemStatsOutFragOKs() {
        return this.ipSystemStatsOutFragOKs;
    }

    public void setIpSystemStatsOutFragOKs(int ipSystemStatsOutFragOKs) {
        int oldValue = getIpSystemStatsOutFragOKs();
        this.ipSystemStatsOutFragOKs = ipSystemStatsOutFragOKs;
        notifyChange(27, oldValue, ipSystemStatsOutFragOKs);
    }

    public int getIpSystemStatsOutFragFails() {
        return this.ipSystemStatsOutFragFails;
    }

    public void setIpSystemStatsOutFragFails(int ipSystemStatsOutFragFails) {
        int oldValue = getIpSystemStatsOutFragFails();
        this.ipSystemStatsOutFragFails = ipSystemStatsOutFragFails;
        notifyChange(28, oldValue, ipSystemStatsOutFragFails);
    }

    public int getIpSystemStatsOutFragCreates() {
        return this.ipSystemStatsOutFragCreates;
    }

    public void setIpSystemStatsOutFragCreates(int ipSystemStatsOutFragCreates) {
        int oldValue = getIpSystemStatsOutFragCreates();
        this.ipSystemStatsOutFragCreates = ipSystemStatsOutFragCreates;
        notifyChange(29, oldValue, ipSystemStatsOutFragCreates);
    }

    public int getIpSystemStatsOutTransmits() {
        return this.ipSystemStatsOutTransmits;
    }

    public void setIpSystemStatsOutTransmits(int ipSystemStatsOutTransmits) {
        int oldValue = getIpSystemStatsOutTransmits();
        this.ipSystemStatsOutTransmits = ipSystemStatsOutTransmits;
        notifyChange(30, oldValue, ipSystemStatsOutTransmits);
    }

    public long getIpSystemStatsHCOutTransmits() {
        return this.ipSystemStatsHCOutTransmits;
    }

    public void setIpSystemStatsHCOutTransmits(long ipSystemStatsHCOutTransmits) {
        long oldValue = getIpSystemStatsHCOutTransmits();
        this.ipSystemStatsHCOutTransmits = ipSystemStatsHCOutTransmits;
        notifyChange(31, oldValue, ipSystemStatsHCOutTransmits);
    }

    public int getIpSystemStatsOutOctets() {
        return this.ipSystemStatsOutOctets;
    }

    public void setIpSystemStatsOutOctets(int ipSystemStatsOutOctets) {
        int oldValue = getIpSystemStatsOutOctets();
        this.ipSystemStatsOutOctets = ipSystemStatsOutOctets;
        notifyChange(32, oldValue, ipSystemStatsOutOctets);
    }

    public long getIpSystemStatsHCOutOctets() {
        return this.ipSystemStatsHCOutOctets;
    }

    public void setIpSystemStatsHCOutOctets(long ipSystemStatsHCOutOctets) {
        long oldValue = getIpSystemStatsHCOutOctets();
        this.ipSystemStatsHCOutOctets = ipSystemStatsHCOutOctets;
        notifyChange(33, oldValue, ipSystemStatsHCOutOctets);
    }

    public int getIpSystemStatsInMcastPkts() {
        return this.ipSystemStatsInMcastPkts;
    }

    public void setIpSystemStatsInMcastPkts(int ipSystemStatsInMcastPkts) {
        int oldValue = getIpSystemStatsInMcastPkts();
        this.ipSystemStatsInMcastPkts = ipSystemStatsInMcastPkts;
        notifyChange(34, oldValue, ipSystemStatsInMcastPkts);
    }

    public long getIpSystemStatsHCInMcastPkts() {
        return this.ipSystemStatsHCInMcastPkts;
    }

    public void setIpSystemStatsHCInMcastPkts(long ipSystemStatsHCInMcastPkts) {
        long oldValue = getIpSystemStatsHCInMcastPkts();
        this.ipSystemStatsHCInMcastPkts = ipSystemStatsHCInMcastPkts;
        notifyChange(35, oldValue, ipSystemStatsHCInMcastPkts);
    }

    public int getIpSystemStatsInMcastOctets() {
        return this.ipSystemStatsInMcastOctets;
    }

    public void setIpSystemStatsInMcastOctets(int ipSystemStatsInMcastOctets) {
        int oldValue = getIpSystemStatsInMcastOctets();
        this.ipSystemStatsInMcastOctets = ipSystemStatsInMcastOctets;
        notifyChange(36, oldValue, ipSystemStatsInMcastOctets);
    }

    public long getIpSystemStatsHCInMcastOctets() {
        return this.ipSystemStatsHCInMcastOctets;
    }

    public void setIpSystemStatsHCInMcastOctets(long ipSystemStatsHCInMcastOctets) {
        long oldValue = getIpSystemStatsHCInMcastOctets();
        this.ipSystemStatsHCInMcastOctets = ipSystemStatsHCInMcastOctets;
        notifyChange(37, oldValue, ipSystemStatsHCInMcastOctets);
    }

    public int getIpSystemStatsOutMcastPkts() {
        return this.ipSystemStatsOutMcastPkts;
    }

    public void setIpSystemStatsOutMcastPkts(int ipSystemStatsOutMcastPkts) {
        int oldValue = getIpSystemStatsOutMcastPkts();
        this.ipSystemStatsOutMcastPkts = ipSystemStatsOutMcastPkts;
        notifyChange(38, oldValue, ipSystemStatsOutMcastPkts);
    }

    public long getIpSystemStatsHCOutMcastPkts() {
        return this.ipSystemStatsHCOutMcastPkts;
    }

    public void setIpSystemStatsHCOutMcastPkts(long ipSystemStatsHCOutMcastPkts) {
        long oldValue = getIpSystemStatsHCOutMcastPkts();
        this.ipSystemStatsHCOutMcastPkts = ipSystemStatsHCOutMcastPkts;
        notifyChange(39, oldValue, ipSystemStatsHCOutMcastPkts);
    }

    public int getIpSystemStatsOutMcastOctets() {
        return this.ipSystemStatsOutMcastOctets;
    }

    public void setIpSystemStatsOutMcastOctets(int ipSystemStatsOutMcastOctets) {
        int oldValue = getIpSystemStatsOutMcastOctets();
        this.ipSystemStatsOutMcastOctets = ipSystemStatsOutMcastOctets;
        notifyChange(40, oldValue, ipSystemStatsOutMcastOctets);
    }

    public long getIpSystemStatsHCOutMcastOctets() {
        return this.ipSystemStatsHCOutMcastOctets;
    }

    public void setIpSystemStatsHCOutMcastOctets(long ipSystemStatsHCOutMcastOctets) {
        long oldValue = getIpSystemStatsHCOutMcastOctets();
        this.ipSystemStatsHCOutMcastOctets = ipSystemStatsHCOutMcastOctets;
        notifyChange(41, oldValue, ipSystemStatsHCOutMcastOctets);
    }

    public int getIpSystemStatsInBcastPkts() {
        return this.ipSystemStatsInBcastPkts;
    }

    public void setIpSystemStatsInBcastPkts(int ipSystemStatsInBcastPkts) {
        int oldValue = getIpSystemStatsInBcastPkts();
        this.ipSystemStatsInBcastPkts = ipSystemStatsInBcastPkts;
        notifyChange(42, oldValue, ipSystemStatsInBcastPkts);
    }

    public long getIpSystemStatsHCInBcastPkts() {
        return this.ipSystemStatsHCInBcastPkts;
    }

    public void setIpSystemStatsHCInBcastPkts(long ipSystemStatsHCInBcastPkts) {
        long oldValue = getIpSystemStatsHCInBcastPkts();
        this.ipSystemStatsHCInBcastPkts = ipSystemStatsHCInBcastPkts;
        notifyChange(43, oldValue, ipSystemStatsHCInBcastPkts);
    }

    public int getIpSystemStatsOutBcastPkts() {
        return this.ipSystemStatsOutBcastPkts;
    }

    public void setIpSystemStatsOutBcastPkts(int ipSystemStatsOutBcastPkts) {
        int oldValue = getIpSystemStatsOutBcastPkts();
        this.ipSystemStatsOutBcastPkts = ipSystemStatsOutBcastPkts;
        notifyChange(44, oldValue, ipSystemStatsOutBcastPkts);
    }

    public long getIpSystemStatsHCOutBcastPkts() {
        return this.ipSystemStatsHCOutBcastPkts;
    }

    public void setIpSystemStatsHCOutBcastPkts(long ipSystemStatsHCOutBcastPkts) {
        long oldValue = getIpSystemStatsHCOutBcastPkts();
        this.ipSystemStatsHCOutBcastPkts = ipSystemStatsHCOutBcastPkts;
        notifyChange(45, oldValue, ipSystemStatsHCOutBcastPkts);
    }

    public int getIpSystemStatsDiscontinuityTime() {
        return this.ipSystemStatsDiscontinuityTime;
    }

    public void setIpSystemStatsDiscontinuityTime(int ipSystemStatsDiscontinuityTime) {
        int oldValue = getIpSystemStatsDiscontinuityTime();
        this.ipSystemStatsDiscontinuityTime = ipSystemStatsDiscontinuityTime;
        notifyChange(46, oldValue, ipSystemStatsDiscontinuityTime);
    }

    public int getIpSystemStatsRefreshRate() {
        return this.ipSystemStatsRefreshRate;
    }

    public void setIpSystemStatsRefreshRate(int ipSystemStatsRefreshRate) {
        int oldValue = getIpSystemStatsRefreshRate();
        this.ipSystemStatsRefreshRate = ipSystemStatsRefreshRate;
        notifyChange(47, oldValue, ipSystemStatsRefreshRate);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIpSystemStatsIPVersion(binding.getVariable().toInt());
                break;
            case  3 :
                setIpSystemStatsInReceives(binding.getVariable().toInt());
                break;
            case  4 :
                setIpSystemStatsHCInReceives(binding.getVariable().toLong());
                break;
            case  5 :
                setIpSystemStatsInOctets(binding.getVariable().toInt());
                break;
            case  6 :
                setIpSystemStatsHCInOctets(binding.getVariable().toLong());
                break;
            case  7 :
                setIpSystemStatsInHdrErrors(binding.getVariable().toInt());
                break;
            case  8 :
                setIpSystemStatsInNoRoutes(binding.getVariable().toInt());
                break;
            case  9 :
                setIpSystemStatsInAddrErrors(binding.getVariable().toInt());
                break;
            case  10 :
                setIpSystemStatsInUnknownProtos(binding.getVariable().toInt());
                break;
            case  11 :
                setIpSystemStatsInTruncatedPkts(binding.getVariable().toInt());
                break;
            case  12 :
                setIpSystemStatsInForwDatagrams(binding.getVariable().toInt());
                break;
            case  13 :
                setIpSystemStatsHCInForwDatagrams(binding.getVariable().toLong());
                break;
            case  14 :
                setIpSystemStatsReasmReqds(binding.getVariable().toInt());
                break;
            case  15 :
                setIpSystemStatsReasmOKs(binding.getVariable().toInt());
                break;
            case  16 :
                setIpSystemStatsReasmFails(binding.getVariable().toInt());
                break;
            case  17 :
                setIpSystemStatsInDiscards(binding.getVariable().toInt());
                break;
            case  18 :
                setIpSystemStatsInDelivers(binding.getVariable().toInt());
                break;
            case  19 :
                setIpSystemStatsHCInDelivers(binding.getVariable().toLong());
                break;
            case  20 :
                setIpSystemStatsOutRequests(binding.getVariable().toInt());
                break;
            case  21 :
                setIpSystemStatsHCOutRequests(binding.getVariable().toLong());
                break;
            case  22 :
                setIpSystemStatsOutNoRoutes(binding.getVariable().toInt());
                break;
            case  23 :
                setIpSystemStatsOutForwDatagrams(binding.getVariable().toInt());
                break;
            case  24 :
                setIpSystemStatsHCOutForwDatagrams(binding.getVariable().toLong());
                break;
            case  25 :
                setIpSystemStatsOutDiscards(binding.getVariable().toInt());
                break;
            case  26 :
                setIpSystemStatsOutFragReqds(binding.getVariable().toInt());
                break;
            case  27 :
                setIpSystemStatsOutFragOKs(binding.getVariable().toInt());
                break;
            case  28 :
                setIpSystemStatsOutFragFails(binding.getVariable().toInt());
                break;
            case  29 :
                setIpSystemStatsOutFragCreates(binding.getVariable().toInt());
                break;
            case  30 :
                setIpSystemStatsOutTransmits(binding.getVariable().toInt());
                break;
            case  31 :
                setIpSystemStatsHCOutTransmits(binding.getVariable().toLong());
                break;
            case  32 :
                setIpSystemStatsOutOctets(binding.getVariable().toInt());
                break;
            case  33 :
                setIpSystemStatsHCOutOctets(binding.getVariable().toLong());
                break;
            case  34 :
                setIpSystemStatsInMcastPkts(binding.getVariable().toInt());
                break;
            case  35 :
                setIpSystemStatsHCInMcastPkts(binding.getVariable().toLong());
                break;
            case  36 :
                setIpSystemStatsInMcastOctets(binding.getVariable().toInt());
                break;
            case  37 :
                setIpSystemStatsHCInMcastOctets(binding.getVariable().toLong());
                break;
            case  38 :
                setIpSystemStatsOutMcastPkts(binding.getVariable().toInt());
                break;
            case  39 :
                setIpSystemStatsHCOutMcastPkts(binding.getVariable().toLong());
                break;
            case  40 :
                setIpSystemStatsOutMcastOctets(binding.getVariable().toInt());
                break;
            case  41 :
                setIpSystemStatsHCOutMcastOctets(binding.getVariable().toLong());
                break;
            case  42 :
                setIpSystemStatsInBcastPkts(binding.getVariable().toInt());
                break;
            case  43 :
                setIpSystemStatsHCInBcastPkts(binding.getVariable().toLong());
                break;
            case  44 :
                setIpSystemStatsOutBcastPkts(binding.getVariable().toInt());
                break;
            case  45 :
                setIpSystemStatsHCOutBcastPkts(binding.getVariable().toLong());
                break;
            case  46 :
                setIpSystemStatsDiscontinuityTime(binding.getVariable().toInt());
                break;
            case  47 :
                setIpSystemStatsRefreshRate(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setIpSystemStatsIPVersion(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IpSystemStatsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipSystemStatsIPVersion", ipSystemStatsIPVersion).append("ipSystemStatsInReceives", ipSystemStatsInReceives).append("ipSystemStatsHCInReceives", ipSystemStatsHCInReceives).append("ipSystemStatsInOctets", ipSystemStatsInOctets).append("ipSystemStatsHCInOctets", ipSystemStatsHCInOctets).append("ipSystemStatsInHdrErrors", ipSystemStatsInHdrErrors).append("ipSystemStatsInNoRoutes", ipSystemStatsInNoRoutes).append("ipSystemStatsInAddrErrors", ipSystemStatsInAddrErrors).append("ipSystemStatsInUnknownProtos", ipSystemStatsInUnknownProtos).append("ipSystemStatsInTruncatedPkts", ipSystemStatsInTruncatedPkts).append("ipSystemStatsInForwDatagrams", ipSystemStatsInForwDatagrams).append("ipSystemStatsHCInForwDatagrams", ipSystemStatsHCInForwDatagrams).append("ipSystemStatsReasmReqds", ipSystemStatsReasmReqds).append("ipSystemStatsReasmOKs", ipSystemStatsReasmOKs).append("ipSystemStatsReasmFails", ipSystemStatsReasmFails).append("ipSystemStatsInDiscards", ipSystemStatsInDiscards).append("ipSystemStatsInDelivers", ipSystemStatsInDelivers).append("ipSystemStatsHCInDelivers", ipSystemStatsHCInDelivers).append("ipSystemStatsOutRequests", ipSystemStatsOutRequests).append("ipSystemStatsHCOutRequests", ipSystemStatsHCOutRequests).append("ipSystemStatsOutNoRoutes", ipSystemStatsOutNoRoutes).append("ipSystemStatsOutForwDatagrams", ipSystemStatsOutForwDatagrams).append("ipSystemStatsHCOutForwDatagrams", ipSystemStatsHCOutForwDatagrams).append("ipSystemStatsOutDiscards", ipSystemStatsOutDiscards).append("ipSystemStatsOutFragReqds", ipSystemStatsOutFragReqds).append("ipSystemStatsOutFragOKs", ipSystemStatsOutFragOKs).append("ipSystemStatsOutFragFails", ipSystemStatsOutFragFails).append("ipSystemStatsOutFragCreates", ipSystemStatsOutFragCreates).append("ipSystemStatsOutTransmits", ipSystemStatsOutTransmits).append("ipSystemStatsHCOutTransmits", ipSystemStatsHCOutTransmits).append("ipSystemStatsOutOctets", ipSystemStatsOutOctets).append("ipSystemStatsHCOutOctets", ipSystemStatsHCOutOctets).append("ipSystemStatsInMcastPkts", ipSystemStatsInMcastPkts).append("ipSystemStatsHCInMcastPkts", ipSystemStatsHCInMcastPkts).append("ipSystemStatsInMcastOctets", ipSystemStatsInMcastOctets).append("ipSystemStatsHCInMcastOctets", ipSystemStatsHCInMcastOctets).append("ipSystemStatsOutMcastPkts", ipSystemStatsOutMcastPkts).append("ipSystemStatsHCOutMcastPkts", ipSystemStatsHCOutMcastPkts).append("ipSystemStatsOutMcastOctets", ipSystemStatsOutMcastOctets).append("ipSystemStatsHCOutMcastOctets", ipSystemStatsHCOutMcastOctets).append("ipSystemStatsInBcastPkts", ipSystemStatsInBcastPkts).append("ipSystemStatsHCInBcastPkts", ipSystemStatsHCInBcastPkts).append("ipSystemStatsOutBcastPkts", ipSystemStatsOutBcastPkts).append("ipSystemStatsHCOutBcastPkts", ipSystemStatsHCOutBcastPkts).append("ipSystemStatsDiscontinuityTime", ipSystemStatsDiscontinuityTime).append("ipSystemStatsRefreshRate", ipSystemStatsRefreshRate).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipSystemStatsIPVersion).append(ipSystemStatsInReceives).append(ipSystemStatsHCInReceives).append(ipSystemStatsInOctets).append(ipSystemStatsHCInOctets).append(ipSystemStatsInHdrErrors).append(ipSystemStatsInNoRoutes).append(ipSystemStatsInAddrErrors).append(ipSystemStatsInUnknownProtos).append(ipSystemStatsInTruncatedPkts).append(ipSystemStatsInForwDatagrams).append(ipSystemStatsHCInForwDatagrams).append(ipSystemStatsReasmReqds).append(ipSystemStatsReasmOKs).append(ipSystemStatsReasmFails).append(ipSystemStatsInDiscards).append(ipSystemStatsInDelivers).append(ipSystemStatsHCInDelivers).append(ipSystemStatsOutRequests).append(ipSystemStatsHCOutRequests).append(ipSystemStatsOutNoRoutes).append(ipSystemStatsOutForwDatagrams).append(ipSystemStatsHCOutForwDatagrams).append(ipSystemStatsOutDiscards).append(ipSystemStatsOutFragReqds).append(ipSystemStatsOutFragOKs).append(ipSystemStatsOutFragFails).append(ipSystemStatsOutFragCreates).append(ipSystemStatsOutTransmits).append(ipSystemStatsHCOutTransmits).append(ipSystemStatsOutOctets).append(ipSystemStatsHCOutOctets).append(ipSystemStatsInMcastPkts).append(ipSystemStatsHCInMcastPkts).append(ipSystemStatsInMcastOctets).append(ipSystemStatsHCInMcastOctets).append(ipSystemStatsOutMcastPkts).append(ipSystemStatsHCOutMcastPkts).append(ipSystemStatsOutMcastOctets).append(ipSystemStatsHCOutMcastOctets).append(ipSystemStatsInBcastPkts).append(ipSystemStatsHCInBcastPkts).append(ipSystemStatsOutBcastPkts).append(ipSystemStatsHCOutBcastPkts).append(ipSystemStatsDiscontinuityTime).append(ipSystemStatsRefreshRate).append(_index).toHashCode();
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
        IpSystemStatsEntry rhs = ((IpSystemStatsEntry) obj);
        return new EqualsBuilder().append(ipSystemStatsIPVersion, rhs.ipSystemStatsIPVersion).append(ipSystemStatsInReceives, rhs.ipSystemStatsInReceives).append(ipSystemStatsHCInReceives, rhs.ipSystemStatsHCInReceives).append(ipSystemStatsInOctets, rhs.ipSystemStatsInOctets).append(ipSystemStatsHCInOctets, rhs.ipSystemStatsHCInOctets).append(ipSystemStatsInHdrErrors, rhs.ipSystemStatsInHdrErrors).append(ipSystemStatsInNoRoutes, rhs.ipSystemStatsInNoRoutes).append(ipSystemStatsInAddrErrors, rhs.ipSystemStatsInAddrErrors).append(ipSystemStatsInUnknownProtos, rhs.ipSystemStatsInUnknownProtos).append(ipSystemStatsInTruncatedPkts, rhs.ipSystemStatsInTruncatedPkts).append(ipSystemStatsInForwDatagrams, rhs.ipSystemStatsInForwDatagrams).append(ipSystemStatsHCInForwDatagrams, rhs.ipSystemStatsHCInForwDatagrams).append(ipSystemStatsReasmReqds, rhs.ipSystemStatsReasmReqds).append(ipSystemStatsReasmOKs, rhs.ipSystemStatsReasmOKs).append(ipSystemStatsReasmFails, rhs.ipSystemStatsReasmFails).append(ipSystemStatsInDiscards, rhs.ipSystemStatsInDiscards).append(ipSystemStatsInDelivers, rhs.ipSystemStatsInDelivers).append(ipSystemStatsHCInDelivers, rhs.ipSystemStatsHCInDelivers).append(ipSystemStatsOutRequests, rhs.ipSystemStatsOutRequests).append(ipSystemStatsHCOutRequests, rhs.ipSystemStatsHCOutRequests).append(ipSystemStatsOutNoRoutes, rhs.ipSystemStatsOutNoRoutes).append(ipSystemStatsOutForwDatagrams, rhs.ipSystemStatsOutForwDatagrams).append(ipSystemStatsHCOutForwDatagrams, rhs.ipSystemStatsHCOutForwDatagrams).append(ipSystemStatsOutDiscards, rhs.ipSystemStatsOutDiscards).append(ipSystemStatsOutFragReqds, rhs.ipSystemStatsOutFragReqds).append(ipSystemStatsOutFragOKs, rhs.ipSystemStatsOutFragOKs).append(ipSystemStatsOutFragFails, rhs.ipSystemStatsOutFragFails).append(ipSystemStatsOutFragCreates, rhs.ipSystemStatsOutFragCreates).append(ipSystemStatsOutTransmits, rhs.ipSystemStatsOutTransmits).append(ipSystemStatsHCOutTransmits, rhs.ipSystemStatsHCOutTransmits).append(ipSystemStatsOutOctets, rhs.ipSystemStatsOutOctets).append(ipSystemStatsHCOutOctets, rhs.ipSystemStatsHCOutOctets).append(ipSystemStatsInMcastPkts, rhs.ipSystemStatsInMcastPkts).append(ipSystemStatsHCInMcastPkts, rhs.ipSystemStatsHCInMcastPkts).append(ipSystemStatsInMcastOctets, rhs.ipSystemStatsInMcastOctets).append(ipSystemStatsHCInMcastOctets, rhs.ipSystemStatsHCInMcastOctets).append(ipSystemStatsOutMcastPkts, rhs.ipSystemStatsOutMcastPkts).append(ipSystemStatsHCOutMcastPkts, rhs.ipSystemStatsHCOutMcastPkts).append(ipSystemStatsOutMcastOctets, rhs.ipSystemStatsOutMcastOctets).append(ipSystemStatsHCOutMcastOctets, rhs.ipSystemStatsHCOutMcastOctets).append(ipSystemStatsInBcastPkts, rhs.ipSystemStatsInBcastPkts).append(ipSystemStatsHCInBcastPkts, rhs.ipSystemStatsHCInBcastPkts).append(ipSystemStatsOutBcastPkts, rhs.ipSystemStatsOutBcastPkts).append(ipSystemStatsHCOutBcastPkts, rhs.ipSystemStatsHCOutBcastPkts).append(ipSystemStatsDiscontinuityTime, rhs.ipSystemStatsDiscontinuityTime).append(ipSystemStatsRefreshRate, rhs.ipSystemStatsRefreshRate).append(_index, rhs._index).isEquals();
    }

    public IpSystemStatsEntry clone() {
        IpSystemStatsEntry _copy = new IpSystemStatsEntry();
        _copy.ipSystemStatsIPVersion = ipSystemStatsIPVersion;
        _copy.ipSystemStatsInReceives = ipSystemStatsInReceives;
        _copy.ipSystemStatsHCInReceives = ipSystemStatsHCInReceives;
        _copy.ipSystemStatsInOctets = ipSystemStatsInOctets;
        _copy.ipSystemStatsHCInOctets = ipSystemStatsHCInOctets;
        _copy.ipSystemStatsInHdrErrors = ipSystemStatsInHdrErrors;
        _copy.ipSystemStatsInNoRoutes = ipSystemStatsInNoRoutes;
        _copy.ipSystemStatsInAddrErrors = ipSystemStatsInAddrErrors;
        _copy.ipSystemStatsInUnknownProtos = ipSystemStatsInUnknownProtos;
        _copy.ipSystemStatsInTruncatedPkts = ipSystemStatsInTruncatedPkts;
        _copy.ipSystemStatsInForwDatagrams = ipSystemStatsInForwDatagrams;
        _copy.ipSystemStatsHCInForwDatagrams = ipSystemStatsHCInForwDatagrams;
        _copy.ipSystemStatsReasmReqds = ipSystemStatsReasmReqds;
        _copy.ipSystemStatsReasmOKs = ipSystemStatsReasmOKs;
        _copy.ipSystemStatsReasmFails = ipSystemStatsReasmFails;
        _copy.ipSystemStatsInDiscards = ipSystemStatsInDiscards;
        _copy.ipSystemStatsInDelivers = ipSystemStatsInDelivers;
        _copy.ipSystemStatsHCInDelivers = ipSystemStatsHCInDelivers;
        _copy.ipSystemStatsOutRequests = ipSystemStatsOutRequests;
        _copy.ipSystemStatsHCOutRequests = ipSystemStatsHCOutRequests;
        _copy.ipSystemStatsOutNoRoutes = ipSystemStatsOutNoRoutes;
        _copy.ipSystemStatsOutForwDatagrams = ipSystemStatsOutForwDatagrams;
        _copy.ipSystemStatsHCOutForwDatagrams = ipSystemStatsHCOutForwDatagrams;
        _copy.ipSystemStatsOutDiscards = ipSystemStatsOutDiscards;
        _copy.ipSystemStatsOutFragReqds = ipSystemStatsOutFragReqds;
        _copy.ipSystemStatsOutFragOKs = ipSystemStatsOutFragOKs;
        _copy.ipSystemStatsOutFragFails = ipSystemStatsOutFragFails;
        _copy.ipSystemStatsOutFragCreates = ipSystemStatsOutFragCreates;
        _copy.ipSystemStatsOutTransmits = ipSystemStatsOutTransmits;
        _copy.ipSystemStatsHCOutTransmits = ipSystemStatsHCOutTransmits;
        _copy.ipSystemStatsOutOctets = ipSystemStatsOutOctets;
        _copy.ipSystemStatsHCOutOctets = ipSystemStatsHCOutOctets;
        _copy.ipSystemStatsInMcastPkts = ipSystemStatsInMcastPkts;
        _copy.ipSystemStatsHCInMcastPkts = ipSystemStatsHCInMcastPkts;
        _copy.ipSystemStatsInMcastOctets = ipSystemStatsInMcastOctets;
        _copy.ipSystemStatsHCInMcastOctets = ipSystemStatsHCInMcastOctets;
        _copy.ipSystemStatsOutMcastPkts = ipSystemStatsOutMcastPkts;
        _copy.ipSystemStatsHCOutMcastPkts = ipSystemStatsHCOutMcastPkts;
        _copy.ipSystemStatsOutMcastOctets = ipSystemStatsOutMcastOctets;
        _copy.ipSystemStatsHCOutMcastOctets = ipSystemStatsHCOutMcastOctets;
        _copy.ipSystemStatsInBcastPkts = ipSystemStatsInBcastPkts;
        _copy.ipSystemStatsHCInBcastPkts = ipSystemStatsHCInBcastPkts;
        _copy.ipSystemStatsOutBcastPkts = ipSystemStatsOutBcastPkts;
        _copy.ipSystemStatsHCOutBcastPkts = ipSystemStatsHCOutBcastPkts;
        _copy.ipSystemStatsDiscontinuityTime = ipSystemStatsDiscontinuityTime;
        _copy.ipSystemStatsRefreshRate = ipSystemStatsRefreshRate;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.31.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipSystemStatsIPVersion", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipSystemStatsInReceives", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipSystemStatsHCInReceives", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipSystemStatsInOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipSystemStatsHCInOctets", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipSystemStatsInHdrErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipSystemStatsInNoRoutes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipSystemStatsInAddrErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipSystemStatsInUnknownProtos", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipSystemStatsInTruncatedPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ipSystemStatsInForwDatagrams", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ipSystemStatsHCInForwDatagrams", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ipSystemStatsReasmReqds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ipSystemStatsReasmOKs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "ipSystemStatsReasmFails", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "ipSystemStatsInDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "ipSystemStatsInDelivers", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "ipSystemStatsHCInDelivers", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "ipSystemStatsOutRequests", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "ipSystemStatsHCOutRequests", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "ipSystemStatsOutNoRoutes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "ipSystemStatsOutForwDatagrams", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "ipSystemStatsHCOutForwDatagrams", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "ipSystemStatsOutDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "ipSystemStatsOutFragReqds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "ipSystemStatsOutFragOKs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "ipSystemStatsOutFragFails", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "ipSystemStatsOutFragCreates", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(30, "ipSystemStatsOutTransmits", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(31, "ipSystemStatsHCOutTransmits", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(32, "ipSystemStatsOutOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(33, "ipSystemStatsHCOutOctets", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(34, "ipSystemStatsInMcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(35, "ipSystemStatsHCInMcastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(36, "ipSystemStatsInMcastOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(37, "ipSystemStatsHCInMcastOctets", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(38, "ipSystemStatsOutMcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(39, "ipSystemStatsHCOutMcastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(40, "ipSystemStatsOutMcastOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(41, "ipSystemStatsHCOutMcastOctets", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(42, "ipSystemStatsInBcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(43, "ipSystemStatsHCInBcastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(44, "ipSystemStatsOutBcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(45, "ipSystemStatsHCOutBcastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(46, "ipSystemStatsDiscontinuityTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(47, "ipSystemStatsRefreshRate", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
