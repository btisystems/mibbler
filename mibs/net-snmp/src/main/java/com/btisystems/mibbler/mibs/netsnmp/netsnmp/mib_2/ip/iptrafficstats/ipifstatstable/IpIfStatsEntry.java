
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.iptrafficstats.ipifstatstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.iptrafficstats.ipifstatstable.IIpIfStatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.iptrafficstats.IpIfStatsTable;
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

public class IpIfStatsEntry
    extends DeviceEntity
    implements Serializable, IIpIfStatsEntry, IIndexed, IVariableBindingSetter
{

    private int ipIfStatsIPVersion;
    private int ipIfStatsIfIndex;
    private int ipIfStatsInReceives;
    private long ipIfStatsHCInReceives;
    private int ipIfStatsInOctets;
    private long ipIfStatsHCInOctets;
    private int ipIfStatsInHdrErrors;
    private int ipIfStatsInNoRoutes;
    private int ipIfStatsInAddrErrors;
    private int ipIfStatsInUnknownProtos;
    private int ipIfStatsInTruncatedPkts;
    private int ipIfStatsInForwDatagrams;
    private long ipIfStatsHCInForwDatagrams;
    private int ipIfStatsReasmReqds;
    private int ipIfStatsReasmOKs;
    private int ipIfStatsReasmFails;
    private int ipIfStatsInDiscards;
    private int ipIfStatsInDelivers;
    private long ipIfStatsHCInDelivers;
    private int ipIfStatsOutRequests;
    private long ipIfStatsHCOutRequests;
    private int ipIfStatsOutForwDatagrams;
    private long ipIfStatsHCOutForwDatagrams;
    private int ipIfStatsOutDiscards;
    private int ipIfStatsOutFragReqds;
    private int ipIfStatsOutFragOKs;
    private int ipIfStatsOutFragFails;
    private int ipIfStatsOutFragCreates;
    private int ipIfStatsOutTransmits;
    private long ipIfStatsHCOutTransmits;
    private int ipIfStatsOutOctets;
    private long ipIfStatsHCOutOctets;
    private int ipIfStatsInMcastPkts;
    private long ipIfStatsHCInMcastPkts;
    private int ipIfStatsInMcastOctets;
    private long ipIfStatsHCInMcastOctets;
    private int ipIfStatsOutMcastPkts;
    private long ipIfStatsHCOutMcastPkts;
    private int ipIfStatsOutMcastOctets;
    private long ipIfStatsHCOutMcastOctets;
    private int ipIfStatsInBcastPkts;
    private long ipIfStatsHCInBcastPkts;
    private int ipIfStatsOutBcastPkts;
    private long ipIfStatsHCOutBcastPkts;
    private int ipIfStatsDiscontinuityTime;
    private int ipIfStatsRefreshRate;
    private String _index;
    private IpIfStatsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpIfStatsEntry() {
    }

    public int getIpIfStatsIPVersion() {
        return this.ipIfStatsIPVersion;
    }

    public void setIpIfStatsIPVersion(int ipIfStatsIPVersion) {
        int oldValue = getIpIfStatsIPVersion();
        this.ipIfStatsIPVersion = ipIfStatsIPVersion;
        notifyChange(1, oldValue, ipIfStatsIPVersion);
    }

    public int getIpIfStatsIfIndex() {
        return this.ipIfStatsIfIndex;
    }

    public void setIpIfStatsIfIndex(int ipIfStatsIfIndex) {
        int oldValue = getIpIfStatsIfIndex();
        this.ipIfStatsIfIndex = ipIfStatsIfIndex;
        notifyChange(2, oldValue, ipIfStatsIfIndex);
    }

    public int getIpIfStatsInReceives() {
        return this.ipIfStatsInReceives;
    }

    public void setIpIfStatsInReceives(int ipIfStatsInReceives) {
        int oldValue = getIpIfStatsInReceives();
        this.ipIfStatsInReceives = ipIfStatsInReceives;
        notifyChange(3, oldValue, ipIfStatsInReceives);
    }

    public long getIpIfStatsHCInReceives() {
        return this.ipIfStatsHCInReceives;
    }

    public void setIpIfStatsHCInReceives(long ipIfStatsHCInReceives) {
        long oldValue = getIpIfStatsHCInReceives();
        this.ipIfStatsHCInReceives = ipIfStatsHCInReceives;
        notifyChange(4, oldValue, ipIfStatsHCInReceives);
    }

    public int getIpIfStatsInOctets() {
        return this.ipIfStatsInOctets;
    }

    public void setIpIfStatsInOctets(int ipIfStatsInOctets) {
        int oldValue = getIpIfStatsInOctets();
        this.ipIfStatsInOctets = ipIfStatsInOctets;
        notifyChange(5, oldValue, ipIfStatsInOctets);
    }

    public long getIpIfStatsHCInOctets() {
        return this.ipIfStatsHCInOctets;
    }

    public void setIpIfStatsHCInOctets(long ipIfStatsHCInOctets) {
        long oldValue = getIpIfStatsHCInOctets();
        this.ipIfStatsHCInOctets = ipIfStatsHCInOctets;
        notifyChange(6, oldValue, ipIfStatsHCInOctets);
    }

    public int getIpIfStatsInHdrErrors() {
        return this.ipIfStatsInHdrErrors;
    }

    public void setIpIfStatsInHdrErrors(int ipIfStatsInHdrErrors) {
        int oldValue = getIpIfStatsInHdrErrors();
        this.ipIfStatsInHdrErrors = ipIfStatsInHdrErrors;
        notifyChange(7, oldValue, ipIfStatsInHdrErrors);
    }

    public int getIpIfStatsInNoRoutes() {
        return this.ipIfStatsInNoRoutes;
    }

    public void setIpIfStatsInNoRoutes(int ipIfStatsInNoRoutes) {
        int oldValue = getIpIfStatsInNoRoutes();
        this.ipIfStatsInNoRoutes = ipIfStatsInNoRoutes;
        notifyChange(8, oldValue, ipIfStatsInNoRoutes);
    }

    public int getIpIfStatsInAddrErrors() {
        return this.ipIfStatsInAddrErrors;
    }

    public void setIpIfStatsInAddrErrors(int ipIfStatsInAddrErrors) {
        int oldValue = getIpIfStatsInAddrErrors();
        this.ipIfStatsInAddrErrors = ipIfStatsInAddrErrors;
        notifyChange(9, oldValue, ipIfStatsInAddrErrors);
    }

    public int getIpIfStatsInUnknownProtos() {
        return this.ipIfStatsInUnknownProtos;
    }

    public void setIpIfStatsInUnknownProtos(int ipIfStatsInUnknownProtos) {
        int oldValue = getIpIfStatsInUnknownProtos();
        this.ipIfStatsInUnknownProtos = ipIfStatsInUnknownProtos;
        notifyChange(10, oldValue, ipIfStatsInUnknownProtos);
    }

    public int getIpIfStatsInTruncatedPkts() {
        return this.ipIfStatsInTruncatedPkts;
    }

    public void setIpIfStatsInTruncatedPkts(int ipIfStatsInTruncatedPkts) {
        int oldValue = getIpIfStatsInTruncatedPkts();
        this.ipIfStatsInTruncatedPkts = ipIfStatsInTruncatedPkts;
        notifyChange(11, oldValue, ipIfStatsInTruncatedPkts);
    }

    public int getIpIfStatsInForwDatagrams() {
        return this.ipIfStatsInForwDatagrams;
    }

    public void setIpIfStatsInForwDatagrams(int ipIfStatsInForwDatagrams) {
        int oldValue = getIpIfStatsInForwDatagrams();
        this.ipIfStatsInForwDatagrams = ipIfStatsInForwDatagrams;
        notifyChange(12, oldValue, ipIfStatsInForwDatagrams);
    }

    public long getIpIfStatsHCInForwDatagrams() {
        return this.ipIfStatsHCInForwDatagrams;
    }

    public void setIpIfStatsHCInForwDatagrams(long ipIfStatsHCInForwDatagrams) {
        long oldValue = getIpIfStatsHCInForwDatagrams();
        this.ipIfStatsHCInForwDatagrams = ipIfStatsHCInForwDatagrams;
        notifyChange(13, oldValue, ipIfStatsHCInForwDatagrams);
    }

    public int getIpIfStatsReasmReqds() {
        return this.ipIfStatsReasmReqds;
    }

    public void setIpIfStatsReasmReqds(int ipIfStatsReasmReqds) {
        int oldValue = getIpIfStatsReasmReqds();
        this.ipIfStatsReasmReqds = ipIfStatsReasmReqds;
        notifyChange(14, oldValue, ipIfStatsReasmReqds);
    }

    public int getIpIfStatsReasmOKs() {
        return this.ipIfStatsReasmOKs;
    }

    public void setIpIfStatsReasmOKs(int ipIfStatsReasmOKs) {
        int oldValue = getIpIfStatsReasmOKs();
        this.ipIfStatsReasmOKs = ipIfStatsReasmOKs;
        notifyChange(15, oldValue, ipIfStatsReasmOKs);
    }

    public int getIpIfStatsReasmFails() {
        return this.ipIfStatsReasmFails;
    }

    public void setIpIfStatsReasmFails(int ipIfStatsReasmFails) {
        int oldValue = getIpIfStatsReasmFails();
        this.ipIfStatsReasmFails = ipIfStatsReasmFails;
        notifyChange(16, oldValue, ipIfStatsReasmFails);
    }

    public int getIpIfStatsInDiscards() {
        return this.ipIfStatsInDiscards;
    }

    public void setIpIfStatsInDiscards(int ipIfStatsInDiscards) {
        int oldValue = getIpIfStatsInDiscards();
        this.ipIfStatsInDiscards = ipIfStatsInDiscards;
        notifyChange(17, oldValue, ipIfStatsInDiscards);
    }

    public int getIpIfStatsInDelivers() {
        return this.ipIfStatsInDelivers;
    }

    public void setIpIfStatsInDelivers(int ipIfStatsInDelivers) {
        int oldValue = getIpIfStatsInDelivers();
        this.ipIfStatsInDelivers = ipIfStatsInDelivers;
        notifyChange(18, oldValue, ipIfStatsInDelivers);
    }

    public long getIpIfStatsHCInDelivers() {
        return this.ipIfStatsHCInDelivers;
    }

    public void setIpIfStatsHCInDelivers(long ipIfStatsHCInDelivers) {
        long oldValue = getIpIfStatsHCInDelivers();
        this.ipIfStatsHCInDelivers = ipIfStatsHCInDelivers;
        notifyChange(19, oldValue, ipIfStatsHCInDelivers);
    }

    public int getIpIfStatsOutRequests() {
        return this.ipIfStatsOutRequests;
    }

    public void setIpIfStatsOutRequests(int ipIfStatsOutRequests) {
        int oldValue = getIpIfStatsOutRequests();
        this.ipIfStatsOutRequests = ipIfStatsOutRequests;
        notifyChange(20, oldValue, ipIfStatsOutRequests);
    }

    public long getIpIfStatsHCOutRequests() {
        return this.ipIfStatsHCOutRequests;
    }

    public void setIpIfStatsHCOutRequests(long ipIfStatsHCOutRequests) {
        long oldValue = getIpIfStatsHCOutRequests();
        this.ipIfStatsHCOutRequests = ipIfStatsHCOutRequests;
        notifyChange(21, oldValue, ipIfStatsHCOutRequests);
    }

    public int getIpIfStatsOutForwDatagrams() {
        return this.ipIfStatsOutForwDatagrams;
    }

    public void setIpIfStatsOutForwDatagrams(int ipIfStatsOutForwDatagrams) {
        int oldValue = getIpIfStatsOutForwDatagrams();
        this.ipIfStatsOutForwDatagrams = ipIfStatsOutForwDatagrams;
        notifyChange(23, oldValue, ipIfStatsOutForwDatagrams);
    }

    public long getIpIfStatsHCOutForwDatagrams() {
        return this.ipIfStatsHCOutForwDatagrams;
    }

    public void setIpIfStatsHCOutForwDatagrams(long ipIfStatsHCOutForwDatagrams) {
        long oldValue = getIpIfStatsHCOutForwDatagrams();
        this.ipIfStatsHCOutForwDatagrams = ipIfStatsHCOutForwDatagrams;
        notifyChange(24, oldValue, ipIfStatsHCOutForwDatagrams);
    }

    public int getIpIfStatsOutDiscards() {
        return this.ipIfStatsOutDiscards;
    }

    public void setIpIfStatsOutDiscards(int ipIfStatsOutDiscards) {
        int oldValue = getIpIfStatsOutDiscards();
        this.ipIfStatsOutDiscards = ipIfStatsOutDiscards;
        notifyChange(25, oldValue, ipIfStatsOutDiscards);
    }

    public int getIpIfStatsOutFragReqds() {
        return this.ipIfStatsOutFragReqds;
    }

    public void setIpIfStatsOutFragReqds(int ipIfStatsOutFragReqds) {
        int oldValue = getIpIfStatsOutFragReqds();
        this.ipIfStatsOutFragReqds = ipIfStatsOutFragReqds;
        notifyChange(26, oldValue, ipIfStatsOutFragReqds);
    }

    public int getIpIfStatsOutFragOKs() {
        return this.ipIfStatsOutFragOKs;
    }

    public void setIpIfStatsOutFragOKs(int ipIfStatsOutFragOKs) {
        int oldValue = getIpIfStatsOutFragOKs();
        this.ipIfStatsOutFragOKs = ipIfStatsOutFragOKs;
        notifyChange(27, oldValue, ipIfStatsOutFragOKs);
    }

    public int getIpIfStatsOutFragFails() {
        return this.ipIfStatsOutFragFails;
    }

    public void setIpIfStatsOutFragFails(int ipIfStatsOutFragFails) {
        int oldValue = getIpIfStatsOutFragFails();
        this.ipIfStatsOutFragFails = ipIfStatsOutFragFails;
        notifyChange(28, oldValue, ipIfStatsOutFragFails);
    }

    public int getIpIfStatsOutFragCreates() {
        return this.ipIfStatsOutFragCreates;
    }

    public void setIpIfStatsOutFragCreates(int ipIfStatsOutFragCreates) {
        int oldValue = getIpIfStatsOutFragCreates();
        this.ipIfStatsOutFragCreates = ipIfStatsOutFragCreates;
        notifyChange(29, oldValue, ipIfStatsOutFragCreates);
    }

    public int getIpIfStatsOutTransmits() {
        return this.ipIfStatsOutTransmits;
    }

    public void setIpIfStatsOutTransmits(int ipIfStatsOutTransmits) {
        int oldValue = getIpIfStatsOutTransmits();
        this.ipIfStatsOutTransmits = ipIfStatsOutTransmits;
        notifyChange(30, oldValue, ipIfStatsOutTransmits);
    }

    public long getIpIfStatsHCOutTransmits() {
        return this.ipIfStatsHCOutTransmits;
    }

    public void setIpIfStatsHCOutTransmits(long ipIfStatsHCOutTransmits) {
        long oldValue = getIpIfStatsHCOutTransmits();
        this.ipIfStatsHCOutTransmits = ipIfStatsHCOutTransmits;
        notifyChange(31, oldValue, ipIfStatsHCOutTransmits);
    }

    public int getIpIfStatsOutOctets() {
        return this.ipIfStatsOutOctets;
    }

    public void setIpIfStatsOutOctets(int ipIfStatsOutOctets) {
        int oldValue = getIpIfStatsOutOctets();
        this.ipIfStatsOutOctets = ipIfStatsOutOctets;
        notifyChange(32, oldValue, ipIfStatsOutOctets);
    }

    public long getIpIfStatsHCOutOctets() {
        return this.ipIfStatsHCOutOctets;
    }

    public void setIpIfStatsHCOutOctets(long ipIfStatsHCOutOctets) {
        long oldValue = getIpIfStatsHCOutOctets();
        this.ipIfStatsHCOutOctets = ipIfStatsHCOutOctets;
        notifyChange(33, oldValue, ipIfStatsHCOutOctets);
    }

    public int getIpIfStatsInMcastPkts() {
        return this.ipIfStatsInMcastPkts;
    }

    public void setIpIfStatsInMcastPkts(int ipIfStatsInMcastPkts) {
        int oldValue = getIpIfStatsInMcastPkts();
        this.ipIfStatsInMcastPkts = ipIfStatsInMcastPkts;
        notifyChange(34, oldValue, ipIfStatsInMcastPkts);
    }

    public long getIpIfStatsHCInMcastPkts() {
        return this.ipIfStatsHCInMcastPkts;
    }

    public void setIpIfStatsHCInMcastPkts(long ipIfStatsHCInMcastPkts) {
        long oldValue = getIpIfStatsHCInMcastPkts();
        this.ipIfStatsHCInMcastPkts = ipIfStatsHCInMcastPkts;
        notifyChange(35, oldValue, ipIfStatsHCInMcastPkts);
    }

    public int getIpIfStatsInMcastOctets() {
        return this.ipIfStatsInMcastOctets;
    }

    public void setIpIfStatsInMcastOctets(int ipIfStatsInMcastOctets) {
        int oldValue = getIpIfStatsInMcastOctets();
        this.ipIfStatsInMcastOctets = ipIfStatsInMcastOctets;
        notifyChange(36, oldValue, ipIfStatsInMcastOctets);
    }

    public long getIpIfStatsHCInMcastOctets() {
        return this.ipIfStatsHCInMcastOctets;
    }

    public void setIpIfStatsHCInMcastOctets(long ipIfStatsHCInMcastOctets) {
        long oldValue = getIpIfStatsHCInMcastOctets();
        this.ipIfStatsHCInMcastOctets = ipIfStatsHCInMcastOctets;
        notifyChange(37, oldValue, ipIfStatsHCInMcastOctets);
    }

    public int getIpIfStatsOutMcastPkts() {
        return this.ipIfStatsOutMcastPkts;
    }

    public void setIpIfStatsOutMcastPkts(int ipIfStatsOutMcastPkts) {
        int oldValue = getIpIfStatsOutMcastPkts();
        this.ipIfStatsOutMcastPkts = ipIfStatsOutMcastPkts;
        notifyChange(38, oldValue, ipIfStatsOutMcastPkts);
    }

    public long getIpIfStatsHCOutMcastPkts() {
        return this.ipIfStatsHCOutMcastPkts;
    }

    public void setIpIfStatsHCOutMcastPkts(long ipIfStatsHCOutMcastPkts) {
        long oldValue = getIpIfStatsHCOutMcastPkts();
        this.ipIfStatsHCOutMcastPkts = ipIfStatsHCOutMcastPkts;
        notifyChange(39, oldValue, ipIfStatsHCOutMcastPkts);
    }

    public int getIpIfStatsOutMcastOctets() {
        return this.ipIfStatsOutMcastOctets;
    }

    public void setIpIfStatsOutMcastOctets(int ipIfStatsOutMcastOctets) {
        int oldValue = getIpIfStatsOutMcastOctets();
        this.ipIfStatsOutMcastOctets = ipIfStatsOutMcastOctets;
        notifyChange(40, oldValue, ipIfStatsOutMcastOctets);
    }

    public long getIpIfStatsHCOutMcastOctets() {
        return this.ipIfStatsHCOutMcastOctets;
    }

    public void setIpIfStatsHCOutMcastOctets(long ipIfStatsHCOutMcastOctets) {
        long oldValue = getIpIfStatsHCOutMcastOctets();
        this.ipIfStatsHCOutMcastOctets = ipIfStatsHCOutMcastOctets;
        notifyChange(41, oldValue, ipIfStatsHCOutMcastOctets);
    }

    public int getIpIfStatsInBcastPkts() {
        return this.ipIfStatsInBcastPkts;
    }

    public void setIpIfStatsInBcastPkts(int ipIfStatsInBcastPkts) {
        int oldValue = getIpIfStatsInBcastPkts();
        this.ipIfStatsInBcastPkts = ipIfStatsInBcastPkts;
        notifyChange(42, oldValue, ipIfStatsInBcastPkts);
    }

    public long getIpIfStatsHCInBcastPkts() {
        return this.ipIfStatsHCInBcastPkts;
    }

    public void setIpIfStatsHCInBcastPkts(long ipIfStatsHCInBcastPkts) {
        long oldValue = getIpIfStatsHCInBcastPkts();
        this.ipIfStatsHCInBcastPkts = ipIfStatsHCInBcastPkts;
        notifyChange(43, oldValue, ipIfStatsHCInBcastPkts);
    }

    public int getIpIfStatsOutBcastPkts() {
        return this.ipIfStatsOutBcastPkts;
    }

    public void setIpIfStatsOutBcastPkts(int ipIfStatsOutBcastPkts) {
        int oldValue = getIpIfStatsOutBcastPkts();
        this.ipIfStatsOutBcastPkts = ipIfStatsOutBcastPkts;
        notifyChange(44, oldValue, ipIfStatsOutBcastPkts);
    }

    public long getIpIfStatsHCOutBcastPkts() {
        return this.ipIfStatsHCOutBcastPkts;
    }

    public void setIpIfStatsHCOutBcastPkts(long ipIfStatsHCOutBcastPkts) {
        long oldValue = getIpIfStatsHCOutBcastPkts();
        this.ipIfStatsHCOutBcastPkts = ipIfStatsHCOutBcastPkts;
        notifyChange(45, oldValue, ipIfStatsHCOutBcastPkts);
    }

    public int getIpIfStatsDiscontinuityTime() {
        return this.ipIfStatsDiscontinuityTime;
    }

    public void setIpIfStatsDiscontinuityTime(int ipIfStatsDiscontinuityTime) {
        int oldValue = getIpIfStatsDiscontinuityTime();
        this.ipIfStatsDiscontinuityTime = ipIfStatsDiscontinuityTime;
        notifyChange(46, oldValue, ipIfStatsDiscontinuityTime);
    }

    public int getIpIfStatsRefreshRate() {
        return this.ipIfStatsRefreshRate;
    }

    public void setIpIfStatsRefreshRate(int ipIfStatsRefreshRate) {
        int oldValue = getIpIfStatsRefreshRate();
        this.ipIfStatsRefreshRate = ipIfStatsRefreshRate;
        notifyChange(47, oldValue, ipIfStatsRefreshRate);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIpIfStatsIPVersion(binding.getVariable().toInt());
                break;
            case  2 :
                setIpIfStatsIfIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setIpIfStatsInReceives(binding.getVariable().toInt());
                break;
            case  4 :
                setIpIfStatsHCInReceives(binding.getVariable().toLong());
                break;
            case  5 :
                setIpIfStatsInOctets(binding.getVariable().toInt());
                break;
            case  6 :
                setIpIfStatsHCInOctets(binding.getVariable().toLong());
                break;
            case  7 :
                setIpIfStatsInHdrErrors(binding.getVariable().toInt());
                break;
            case  8 :
                setIpIfStatsInNoRoutes(binding.getVariable().toInt());
                break;
            case  9 :
                setIpIfStatsInAddrErrors(binding.getVariable().toInt());
                break;
            case  10 :
                setIpIfStatsInUnknownProtos(binding.getVariable().toInt());
                break;
            case  11 :
                setIpIfStatsInTruncatedPkts(binding.getVariable().toInt());
                break;
            case  12 :
                setIpIfStatsInForwDatagrams(binding.getVariable().toInt());
                break;
            case  13 :
                setIpIfStatsHCInForwDatagrams(binding.getVariable().toLong());
                break;
            case  14 :
                setIpIfStatsReasmReqds(binding.getVariable().toInt());
                break;
            case  15 :
                setIpIfStatsReasmOKs(binding.getVariable().toInt());
                break;
            case  16 :
                setIpIfStatsReasmFails(binding.getVariable().toInt());
                break;
            case  17 :
                setIpIfStatsInDiscards(binding.getVariable().toInt());
                break;
            case  18 :
                setIpIfStatsInDelivers(binding.getVariable().toInt());
                break;
            case  19 :
                setIpIfStatsHCInDelivers(binding.getVariable().toLong());
                break;
            case  20 :
                setIpIfStatsOutRequests(binding.getVariable().toInt());
                break;
            case  21 :
                setIpIfStatsHCOutRequests(binding.getVariable().toLong());
                break;
            case  23 :
                setIpIfStatsOutForwDatagrams(binding.getVariable().toInt());
                break;
            case  24 :
                setIpIfStatsHCOutForwDatagrams(binding.getVariable().toLong());
                break;
            case  25 :
                setIpIfStatsOutDiscards(binding.getVariable().toInt());
                break;
            case  26 :
                setIpIfStatsOutFragReqds(binding.getVariable().toInt());
                break;
            case  27 :
                setIpIfStatsOutFragOKs(binding.getVariable().toInt());
                break;
            case  28 :
                setIpIfStatsOutFragFails(binding.getVariable().toInt());
                break;
            case  29 :
                setIpIfStatsOutFragCreates(binding.getVariable().toInt());
                break;
            case  30 :
                setIpIfStatsOutTransmits(binding.getVariable().toInt());
                break;
            case  31 :
                setIpIfStatsHCOutTransmits(binding.getVariable().toLong());
                break;
            case  32 :
                setIpIfStatsOutOctets(binding.getVariable().toInt());
                break;
            case  33 :
                setIpIfStatsHCOutOctets(binding.getVariable().toLong());
                break;
            case  34 :
                setIpIfStatsInMcastPkts(binding.getVariable().toInt());
                break;
            case  35 :
                setIpIfStatsHCInMcastPkts(binding.getVariable().toLong());
                break;
            case  36 :
                setIpIfStatsInMcastOctets(binding.getVariable().toInt());
                break;
            case  37 :
                setIpIfStatsHCInMcastOctets(binding.getVariable().toLong());
                break;
            case  38 :
                setIpIfStatsOutMcastPkts(binding.getVariable().toInt());
                break;
            case  39 :
                setIpIfStatsHCOutMcastPkts(binding.getVariable().toLong());
                break;
            case  40 :
                setIpIfStatsOutMcastOctets(binding.getVariable().toInt());
                break;
            case  41 :
                setIpIfStatsHCOutMcastOctets(binding.getVariable().toLong());
                break;
            case  42 :
                setIpIfStatsInBcastPkts(binding.getVariable().toInt());
                break;
            case  43 :
                setIpIfStatsHCInBcastPkts(binding.getVariable().toLong());
                break;
            case  44 :
                setIpIfStatsOutBcastPkts(binding.getVariable().toInt());
                break;
            case  45 :
                setIpIfStatsHCOutBcastPkts(binding.getVariable().toLong());
                break;
            case  46 :
                setIpIfStatsDiscontinuityTime(binding.getVariable().toInt());
                break;
            case  47 :
                setIpIfStatsRefreshRate(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setIpIfStatsIPVersion(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIpIfStatsIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IpIfStatsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipIfStatsIPVersion", ipIfStatsIPVersion).append("ipIfStatsIfIndex", ipIfStatsIfIndex).append("ipIfStatsInReceives", ipIfStatsInReceives).append("ipIfStatsHCInReceives", ipIfStatsHCInReceives).append("ipIfStatsInOctets", ipIfStatsInOctets).append("ipIfStatsHCInOctets", ipIfStatsHCInOctets).append("ipIfStatsInHdrErrors", ipIfStatsInHdrErrors).append("ipIfStatsInNoRoutes", ipIfStatsInNoRoutes).append("ipIfStatsInAddrErrors", ipIfStatsInAddrErrors).append("ipIfStatsInUnknownProtos", ipIfStatsInUnknownProtos).append("ipIfStatsInTruncatedPkts", ipIfStatsInTruncatedPkts).append("ipIfStatsInForwDatagrams", ipIfStatsInForwDatagrams).append("ipIfStatsHCInForwDatagrams", ipIfStatsHCInForwDatagrams).append("ipIfStatsReasmReqds", ipIfStatsReasmReqds).append("ipIfStatsReasmOKs", ipIfStatsReasmOKs).append("ipIfStatsReasmFails", ipIfStatsReasmFails).append("ipIfStatsInDiscards", ipIfStatsInDiscards).append("ipIfStatsInDelivers", ipIfStatsInDelivers).append("ipIfStatsHCInDelivers", ipIfStatsHCInDelivers).append("ipIfStatsOutRequests", ipIfStatsOutRequests).append("ipIfStatsHCOutRequests", ipIfStatsHCOutRequests).append("ipIfStatsOutForwDatagrams", ipIfStatsOutForwDatagrams).append("ipIfStatsHCOutForwDatagrams", ipIfStatsHCOutForwDatagrams).append("ipIfStatsOutDiscards", ipIfStatsOutDiscards).append("ipIfStatsOutFragReqds", ipIfStatsOutFragReqds).append("ipIfStatsOutFragOKs", ipIfStatsOutFragOKs).append("ipIfStatsOutFragFails", ipIfStatsOutFragFails).append("ipIfStatsOutFragCreates", ipIfStatsOutFragCreates).append("ipIfStatsOutTransmits", ipIfStatsOutTransmits).append("ipIfStatsHCOutTransmits", ipIfStatsHCOutTransmits).append("ipIfStatsOutOctets", ipIfStatsOutOctets).append("ipIfStatsHCOutOctets", ipIfStatsHCOutOctets).append("ipIfStatsInMcastPkts", ipIfStatsInMcastPkts).append("ipIfStatsHCInMcastPkts", ipIfStatsHCInMcastPkts).append("ipIfStatsInMcastOctets", ipIfStatsInMcastOctets).append("ipIfStatsHCInMcastOctets", ipIfStatsHCInMcastOctets).append("ipIfStatsOutMcastPkts", ipIfStatsOutMcastPkts).append("ipIfStatsHCOutMcastPkts", ipIfStatsHCOutMcastPkts).append("ipIfStatsOutMcastOctets", ipIfStatsOutMcastOctets).append("ipIfStatsHCOutMcastOctets", ipIfStatsHCOutMcastOctets).append("ipIfStatsInBcastPkts", ipIfStatsInBcastPkts).append("ipIfStatsHCInBcastPkts", ipIfStatsHCInBcastPkts).append("ipIfStatsOutBcastPkts", ipIfStatsOutBcastPkts).append("ipIfStatsHCOutBcastPkts", ipIfStatsHCOutBcastPkts).append("ipIfStatsDiscontinuityTime", ipIfStatsDiscontinuityTime).append("ipIfStatsRefreshRate", ipIfStatsRefreshRate).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipIfStatsIPVersion).append(ipIfStatsIfIndex).append(ipIfStatsInReceives).append(ipIfStatsHCInReceives).append(ipIfStatsInOctets).append(ipIfStatsHCInOctets).append(ipIfStatsInHdrErrors).append(ipIfStatsInNoRoutes).append(ipIfStatsInAddrErrors).append(ipIfStatsInUnknownProtos).append(ipIfStatsInTruncatedPkts).append(ipIfStatsInForwDatagrams).append(ipIfStatsHCInForwDatagrams).append(ipIfStatsReasmReqds).append(ipIfStatsReasmOKs).append(ipIfStatsReasmFails).append(ipIfStatsInDiscards).append(ipIfStatsInDelivers).append(ipIfStatsHCInDelivers).append(ipIfStatsOutRequests).append(ipIfStatsHCOutRequests).append(ipIfStatsOutForwDatagrams).append(ipIfStatsHCOutForwDatagrams).append(ipIfStatsOutDiscards).append(ipIfStatsOutFragReqds).append(ipIfStatsOutFragOKs).append(ipIfStatsOutFragFails).append(ipIfStatsOutFragCreates).append(ipIfStatsOutTransmits).append(ipIfStatsHCOutTransmits).append(ipIfStatsOutOctets).append(ipIfStatsHCOutOctets).append(ipIfStatsInMcastPkts).append(ipIfStatsHCInMcastPkts).append(ipIfStatsInMcastOctets).append(ipIfStatsHCInMcastOctets).append(ipIfStatsOutMcastPkts).append(ipIfStatsHCOutMcastPkts).append(ipIfStatsOutMcastOctets).append(ipIfStatsHCOutMcastOctets).append(ipIfStatsInBcastPkts).append(ipIfStatsHCInBcastPkts).append(ipIfStatsOutBcastPkts).append(ipIfStatsHCOutBcastPkts).append(ipIfStatsDiscontinuityTime).append(ipIfStatsRefreshRate).append(_index).toHashCode();
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
        IpIfStatsEntry rhs = ((IpIfStatsEntry) obj);
        return new EqualsBuilder().append(ipIfStatsIPVersion, rhs.ipIfStatsIPVersion).append(ipIfStatsIfIndex, rhs.ipIfStatsIfIndex).append(ipIfStatsInReceives, rhs.ipIfStatsInReceives).append(ipIfStatsHCInReceives, rhs.ipIfStatsHCInReceives).append(ipIfStatsInOctets, rhs.ipIfStatsInOctets).append(ipIfStatsHCInOctets, rhs.ipIfStatsHCInOctets).append(ipIfStatsInHdrErrors, rhs.ipIfStatsInHdrErrors).append(ipIfStatsInNoRoutes, rhs.ipIfStatsInNoRoutes).append(ipIfStatsInAddrErrors, rhs.ipIfStatsInAddrErrors).append(ipIfStatsInUnknownProtos, rhs.ipIfStatsInUnknownProtos).append(ipIfStatsInTruncatedPkts, rhs.ipIfStatsInTruncatedPkts).append(ipIfStatsInForwDatagrams, rhs.ipIfStatsInForwDatagrams).append(ipIfStatsHCInForwDatagrams, rhs.ipIfStatsHCInForwDatagrams).append(ipIfStatsReasmReqds, rhs.ipIfStatsReasmReqds).append(ipIfStatsReasmOKs, rhs.ipIfStatsReasmOKs).append(ipIfStatsReasmFails, rhs.ipIfStatsReasmFails).append(ipIfStatsInDiscards, rhs.ipIfStatsInDiscards).append(ipIfStatsInDelivers, rhs.ipIfStatsInDelivers).append(ipIfStatsHCInDelivers, rhs.ipIfStatsHCInDelivers).append(ipIfStatsOutRequests, rhs.ipIfStatsOutRequests).append(ipIfStatsHCOutRequests, rhs.ipIfStatsHCOutRequests).append(ipIfStatsOutForwDatagrams, rhs.ipIfStatsOutForwDatagrams).append(ipIfStatsHCOutForwDatagrams, rhs.ipIfStatsHCOutForwDatagrams).append(ipIfStatsOutDiscards, rhs.ipIfStatsOutDiscards).append(ipIfStatsOutFragReqds, rhs.ipIfStatsOutFragReqds).append(ipIfStatsOutFragOKs, rhs.ipIfStatsOutFragOKs).append(ipIfStatsOutFragFails, rhs.ipIfStatsOutFragFails).append(ipIfStatsOutFragCreates, rhs.ipIfStatsOutFragCreates).append(ipIfStatsOutTransmits, rhs.ipIfStatsOutTransmits).append(ipIfStatsHCOutTransmits, rhs.ipIfStatsHCOutTransmits).append(ipIfStatsOutOctets, rhs.ipIfStatsOutOctets).append(ipIfStatsHCOutOctets, rhs.ipIfStatsHCOutOctets).append(ipIfStatsInMcastPkts, rhs.ipIfStatsInMcastPkts).append(ipIfStatsHCInMcastPkts, rhs.ipIfStatsHCInMcastPkts).append(ipIfStatsInMcastOctets, rhs.ipIfStatsInMcastOctets).append(ipIfStatsHCInMcastOctets, rhs.ipIfStatsHCInMcastOctets).append(ipIfStatsOutMcastPkts, rhs.ipIfStatsOutMcastPkts).append(ipIfStatsHCOutMcastPkts, rhs.ipIfStatsHCOutMcastPkts).append(ipIfStatsOutMcastOctets, rhs.ipIfStatsOutMcastOctets).append(ipIfStatsHCOutMcastOctets, rhs.ipIfStatsHCOutMcastOctets).append(ipIfStatsInBcastPkts, rhs.ipIfStatsInBcastPkts).append(ipIfStatsHCInBcastPkts, rhs.ipIfStatsHCInBcastPkts).append(ipIfStatsOutBcastPkts, rhs.ipIfStatsOutBcastPkts).append(ipIfStatsHCOutBcastPkts, rhs.ipIfStatsHCOutBcastPkts).append(ipIfStatsDiscontinuityTime, rhs.ipIfStatsDiscontinuityTime).append(ipIfStatsRefreshRate, rhs.ipIfStatsRefreshRate).append(_index, rhs._index).isEquals();
    }

    public IpIfStatsEntry clone() {
        IpIfStatsEntry _copy = new IpIfStatsEntry();
        _copy.ipIfStatsIPVersion = ipIfStatsIPVersion;
        _copy.ipIfStatsIfIndex = ipIfStatsIfIndex;
        _copy.ipIfStatsInReceives = ipIfStatsInReceives;
        _copy.ipIfStatsHCInReceives = ipIfStatsHCInReceives;
        _copy.ipIfStatsInOctets = ipIfStatsInOctets;
        _copy.ipIfStatsHCInOctets = ipIfStatsHCInOctets;
        _copy.ipIfStatsInHdrErrors = ipIfStatsInHdrErrors;
        _copy.ipIfStatsInNoRoutes = ipIfStatsInNoRoutes;
        _copy.ipIfStatsInAddrErrors = ipIfStatsInAddrErrors;
        _copy.ipIfStatsInUnknownProtos = ipIfStatsInUnknownProtos;
        _copy.ipIfStatsInTruncatedPkts = ipIfStatsInTruncatedPkts;
        _copy.ipIfStatsInForwDatagrams = ipIfStatsInForwDatagrams;
        _copy.ipIfStatsHCInForwDatagrams = ipIfStatsHCInForwDatagrams;
        _copy.ipIfStatsReasmReqds = ipIfStatsReasmReqds;
        _copy.ipIfStatsReasmOKs = ipIfStatsReasmOKs;
        _copy.ipIfStatsReasmFails = ipIfStatsReasmFails;
        _copy.ipIfStatsInDiscards = ipIfStatsInDiscards;
        _copy.ipIfStatsInDelivers = ipIfStatsInDelivers;
        _copy.ipIfStatsHCInDelivers = ipIfStatsHCInDelivers;
        _copy.ipIfStatsOutRequests = ipIfStatsOutRequests;
        _copy.ipIfStatsHCOutRequests = ipIfStatsHCOutRequests;
        _copy.ipIfStatsOutForwDatagrams = ipIfStatsOutForwDatagrams;
        _copy.ipIfStatsHCOutForwDatagrams = ipIfStatsHCOutForwDatagrams;
        _copy.ipIfStatsOutDiscards = ipIfStatsOutDiscards;
        _copy.ipIfStatsOutFragReqds = ipIfStatsOutFragReqds;
        _copy.ipIfStatsOutFragOKs = ipIfStatsOutFragOKs;
        _copy.ipIfStatsOutFragFails = ipIfStatsOutFragFails;
        _copy.ipIfStatsOutFragCreates = ipIfStatsOutFragCreates;
        _copy.ipIfStatsOutTransmits = ipIfStatsOutTransmits;
        _copy.ipIfStatsHCOutTransmits = ipIfStatsHCOutTransmits;
        _copy.ipIfStatsOutOctets = ipIfStatsOutOctets;
        _copy.ipIfStatsHCOutOctets = ipIfStatsHCOutOctets;
        _copy.ipIfStatsInMcastPkts = ipIfStatsInMcastPkts;
        _copy.ipIfStatsHCInMcastPkts = ipIfStatsHCInMcastPkts;
        _copy.ipIfStatsInMcastOctets = ipIfStatsInMcastOctets;
        _copy.ipIfStatsHCInMcastOctets = ipIfStatsHCInMcastOctets;
        _copy.ipIfStatsOutMcastPkts = ipIfStatsOutMcastPkts;
        _copy.ipIfStatsHCOutMcastPkts = ipIfStatsHCOutMcastPkts;
        _copy.ipIfStatsOutMcastOctets = ipIfStatsOutMcastOctets;
        _copy.ipIfStatsHCOutMcastOctets = ipIfStatsHCOutMcastOctets;
        _copy.ipIfStatsInBcastPkts = ipIfStatsInBcastPkts;
        _copy.ipIfStatsHCInBcastPkts = ipIfStatsHCInBcastPkts;
        _copy.ipIfStatsOutBcastPkts = ipIfStatsOutBcastPkts;
        _copy.ipIfStatsHCOutBcastPkts = ipIfStatsHCOutBcastPkts;
        _copy.ipIfStatsDiscontinuityTime = ipIfStatsDiscontinuityTime;
        _copy.ipIfStatsRefreshRate = ipIfStatsRefreshRate;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.31.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipIfStatsIPVersion", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipIfStatsIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipIfStatsInReceives", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipIfStatsHCInReceives", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipIfStatsInOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipIfStatsHCInOctets", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipIfStatsInHdrErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipIfStatsInNoRoutes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipIfStatsInAddrErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipIfStatsInUnknownProtos", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipIfStatsInTruncatedPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ipIfStatsInForwDatagrams", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ipIfStatsHCInForwDatagrams", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ipIfStatsReasmReqds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ipIfStatsReasmOKs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "ipIfStatsReasmFails", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "ipIfStatsInDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "ipIfStatsInDelivers", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "ipIfStatsHCInDelivers", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "ipIfStatsOutRequests", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "ipIfStatsHCOutRequests", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "ipIfStatsOutForwDatagrams", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "ipIfStatsHCOutForwDatagrams", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "ipIfStatsOutDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "ipIfStatsOutFragReqds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "ipIfStatsOutFragOKs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "ipIfStatsOutFragFails", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "ipIfStatsOutFragCreates", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(30, "ipIfStatsOutTransmits", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(31, "ipIfStatsHCOutTransmits", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(32, "ipIfStatsOutOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(33, "ipIfStatsHCOutOctets", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(34, "ipIfStatsInMcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(35, "ipIfStatsHCInMcastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(36, "ipIfStatsInMcastOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(37, "ipIfStatsHCInMcastOctets", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(38, "ipIfStatsOutMcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(39, "ipIfStatsHCOutMcastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(40, "ipIfStatsOutMcastOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(41, "ipIfStatsHCOutMcastOctets", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(42, "ipIfStatsInBcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(43, "ipIfStatsHCInBcastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(44, "ipIfStatsOutBcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(45, "ipIfStatsHCOutBcastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(46, "ipIfStatsDiscontinuityTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(47, "ipIfStatsRefreshRate", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
