
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6icmpmib.ipv6icmpmibobjects.ipv6ificmptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6icmpmib.ipv6icmpmibobjects.ipv6ificmptable.IIpv6IfIcmpEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6icmpmib.ipv6icmpmibobjects.Ipv6IfIcmpTable;
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

public class Ipv6IfIcmpEntry
    extends DeviceEntity
    implements Serializable, IIpv6IfIcmpEntry, IIndexed, IVariableBindingSetter
{

    private int ipv6IfIcmpInMsgs;
    private int ipv6IfIcmpInErrors;
    private int ipv6IfIcmpInDestUnreachs;
    private int ipv6IfIcmpInAdminProhibs;
    private int ipv6IfIcmpInTimeExcds;
    private int ipv6IfIcmpInParmProblems;
    private int ipv6IfIcmpInPktTooBigs;
    private int ipv6IfIcmpInEchos;
    private int ipv6IfIcmpInEchoReplies;
    private int ipv6IfIcmpInRouterSolicits;
    private int ipv6IfIcmpInRouterAdvertisements;
    private int ipv6IfIcmpInNeighborSolicits;
    private int ipv6IfIcmpInNeighborAdvertisements;
    private int ipv6IfIcmpInRedirects;
    private int ipv6IfIcmpInGroupMembQueries;
    private int ipv6IfIcmpInGroupMembResponses;
    private int ipv6IfIcmpInGroupMembReductions;
    private int ipv6IfIcmpOutMsgs;
    private int ipv6IfIcmpOutErrors;
    private int ipv6IfIcmpOutDestUnreachs;
    private int ipv6IfIcmpOutAdminProhibs;
    private int ipv6IfIcmpOutTimeExcds;
    private int ipv6IfIcmpOutParmProblems;
    private int ipv6IfIcmpOutPktTooBigs;
    private int ipv6IfIcmpOutEchos;
    private int ipv6IfIcmpOutEchoReplies;
    private int ipv6IfIcmpOutRouterSolicits;
    private int ipv6IfIcmpOutRouterAdvertisements;
    private int ipv6IfIcmpOutNeighborSolicits;
    private int ipv6IfIcmpOutNeighborAdvertisements;
    private int ipv6IfIcmpOutRedirects;
    private int ipv6IfIcmpOutGroupMembQueries;
    private int ipv6IfIcmpOutGroupMembResponses;
    private int ipv6IfIcmpOutGroupMembReductions;
    private String _index;
    private Ipv6IfIcmpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6IfIcmpEntry() {
    }

    public int getIpv6IfIcmpInMsgs() {
        return this.ipv6IfIcmpInMsgs;
    }

    public void setIpv6IfIcmpInMsgs(int ipv6IfIcmpInMsgs) {
        int oldValue = getIpv6IfIcmpInMsgs();
        this.ipv6IfIcmpInMsgs = ipv6IfIcmpInMsgs;
        notifyChange(1, oldValue, ipv6IfIcmpInMsgs);
    }

    public int getIpv6IfIcmpInErrors() {
        return this.ipv6IfIcmpInErrors;
    }

    public void setIpv6IfIcmpInErrors(int ipv6IfIcmpInErrors) {
        int oldValue = getIpv6IfIcmpInErrors();
        this.ipv6IfIcmpInErrors = ipv6IfIcmpInErrors;
        notifyChange(2, oldValue, ipv6IfIcmpInErrors);
    }

    public int getIpv6IfIcmpInDestUnreachs() {
        return this.ipv6IfIcmpInDestUnreachs;
    }

    public void setIpv6IfIcmpInDestUnreachs(int ipv6IfIcmpInDestUnreachs) {
        int oldValue = getIpv6IfIcmpInDestUnreachs();
        this.ipv6IfIcmpInDestUnreachs = ipv6IfIcmpInDestUnreachs;
        notifyChange(3, oldValue, ipv6IfIcmpInDestUnreachs);
    }

    public int getIpv6IfIcmpInAdminProhibs() {
        return this.ipv6IfIcmpInAdminProhibs;
    }

    public void setIpv6IfIcmpInAdminProhibs(int ipv6IfIcmpInAdminProhibs) {
        int oldValue = getIpv6IfIcmpInAdminProhibs();
        this.ipv6IfIcmpInAdminProhibs = ipv6IfIcmpInAdminProhibs;
        notifyChange(4, oldValue, ipv6IfIcmpInAdminProhibs);
    }

    public int getIpv6IfIcmpInTimeExcds() {
        return this.ipv6IfIcmpInTimeExcds;
    }

    public void setIpv6IfIcmpInTimeExcds(int ipv6IfIcmpInTimeExcds) {
        int oldValue = getIpv6IfIcmpInTimeExcds();
        this.ipv6IfIcmpInTimeExcds = ipv6IfIcmpInTimeExcds;
        notifyChange(5, oldValue, ipv6IfIcmpInTimeExcds);
    }

    public int getIpv6IfIcmpInParmProblems() {
        return this.ipv6IfIcmpInParmProblems;
    }

    public void setIpv6IfIcmpInParmProblems(int ipv6IfIcmpInParmProblems) {
        int oldValue = getIpv6IfIcmpInParmProblems();
        this.ipv6IfIcmpInParmProblems = ipv6IfIcmpInParmProblems;
        notifyChange(6, oldValue, ipv6IfIcmpInParmProblems);
    }

    public int getIpv6IfIcmpInPktTooBigs() {
        return this.ipv6IfIcmpInPktTooBigs;
    }

    public void setIpv6IfIcmpInPktTooBigs(int ipv6IfIcmpInPktTooBigs) {
        int oldValue = getIpv6IfIcmpInPktTooBigs();
        this.ipv6IfIcmpInPktTooBigs = ipv6IfIcmpInPktTooBigs;
        notifyChange(7, oldValue, ipv6IfIcmpInPktTooBigs);
    }

    public int getIpv6IfIcmpInEchos() {
        return this.ipv6IfIcmpInEchos;
    }

    public void setIpv6IfIcmpInEchos(int ipv6IfIcmpInEchos) {
        int oldValue = getIpv6IfIcmpInEchos();
        this.ipv6IfIcmpInEchos = ipv6IfIcmpInEchos;
        notifyChange(8, oldValue, ipv6IfIcmpInEchos);
    }

    public int getIpv6IfIcmpInEchoReplies() {
        return this.ipv6IfIcmpInEchoReplies;
    }

    public void setIpv6IfIcmpInEchoReplies(int ipv6IfIcmpInEchoReplies) {
        int oldValue = getIpv6IfIcmpInEchoReplies();
        this.ipv6IfIcmpInEchoReplies = ipv6IfIcmpInEchoReplies;
        notifyChange(9, oldValue, ipv6IfIcmpInEchoReplies);
    }

    public int getIpv6IfIcmpInRouterSolicits() {
        return this.ipv6IfIcmpInRouterSolicits;
    }

    public void setIpv6IfIcmpInRouterSolicits(int ipv6IfIcmpInRouterSolicits) {
        int oldValue = getIpv6IfIcmpInRouterSolicits();
        this.ipv6IfIcmpInRouterSolicits = ipv6IfIcmpInRouterSolicits;
        notifyChange(10, oldValue, ipv6IfIcmpInRouterSolicits);
    }

    public int getIpv6IfIcmpInRouterAdvertisements() {
        return this.ipv6IfIcmpInRouterAdvertisements;
    }

    public void setIpv6IfIcmpInRouterAdvertisements(int ipv6IfIcmpInRouterAdvertisements) {
        int oldValue = getIpv6IfIcmpInRouterAdvertisements();
        this.ipv6IfIcmpInRouterAdvertisements = ipv6IfIcmpInRouterAdvertisements;
        notifyChange(11, oldValue, ipv6IfIcmpInRouterAdvertisements);
    }

    public int getIpv6IfIcmpInNeighborSolicits() {
        return this.ipv6IfIcmpInNeighborSolicits;
    }

    public void setIpv6IfIcmpInNeighborSolicits(int ipv6IfIcmpInNeighborSolicits) {
        int oldValue = getIpv6IfIcmpInNeighborSolicits();
        this.ipv6IfIcmpInNeighborSolicits = ipv6IfIcmpInNeighborSolicits;
        notifyChange(12, oldValue, ipv6IfIcmpInNeighborSolicits);
    }

    public int getIpv6IfIcmpInNeighborAdvertisements() {
        return this.ipv6IfIcmpInNeighborAdvertisements;
    }

    public void setIpv6IfIcmpInNeighborAdvertisements(int ipv6IfIcmpInNeighborAdvertisements) {
        int oldValue = getIpv6IfIcmpInNeighborAdvertisements();
        this.ipv6IfIcmpInNeighborAdvertisements = ipv6IfIcmpInNeighborAdvertisements;
        notifyChange(13, oldValue, ipv6IfIcmpInNeighborAdvertisements);
    }

    public int getIpv6IfIcmpInRedirects() {
        return this.ipv6IfIcmpInRedirects;
    }

    public void setIpv6IfIcmpInRedirects(int ipv6IfIcmpInRedirects) {
        int oldValue = getIpv6IfIcmpInRedirects();
        this.ipv6IfIcmpInRedirects = ipv6IfIcmpInRedirects;
        notifyChange(14, oldValue, ipv6IfIcmpInRedirects);
    }

    public int getIpv6IfIcmpInGroupMembQueries() {
        return this.ipv6IfIcmpInGroupMembQueries;
    }

    public void setIpv6IfIcmpInGroupMembQueries(int ipv6IfIcmpInGroupMembQueries) {
        int oldValue = getIpv6IfIcmpInGroupMembQueries();
        this.ipv6IfIcmpInGroupMembQueries = ipv6IfIcmpInGroupMembQueries;
        notifyChange(15, oldValue, ipv6IfIcmpInGroupMembQueries);
    }

    public int getIpv6IfIcmpInGroupMembResponses() {
        return this.ipv6IfIcmpInGroupMembResponses;
    }

    public void setIpv6IfIcmpInGroupMembResponses(int ipv6IfIcmpInGroupMembResponses) {
        int oldValue = getIpv6IfIcmpInGroupMembResponses();
        this.ipv6IfIcmpInGroupMembResponses = ipv6IfIcmpInGroupMembResponses;
        notifyChange(16, oldValue, ipv6IfIcmpInGroupMembResponses);
    }

    public int getIpv6IfIcmpInGroupMembReductions() {
        return this.ipv6IfIcmpInGroupMembReductions;
    }

    public void setIpv6IfIcmpInGroupMembReductions(int ipv6IfIcmpInGroupMembReductions) {
        int oldValue = getIpv6IfIcmpInGroupMembReductions();
        this.ipv6IfIcmpInGroupMembReductions = ipv6IfIcmpInGroupMembReductions;
        notifyChange(17, oldValue, ipv6IfIcmpInGroupMembReductions);
    }

    public int getIpv6IfIcmpOutMsgs() {
        return this.ipv6IfIcmpOutMsgs;
    }

    public void setIpv6IfIcmpOutMsgs(int ipv6IfIcmpOutMsgs) {
        int oldValue = getIpv6IfIcmpOutMsgs();
        this.ipv6IfIcmpOutMsgs = ipv6IfIcmpOutMsgs;
        notifyChange(18, oldValue, ipv6IfIcmpOutMsgs);
    }

    public int getIpv6IfIcmpOutErrors() {
        return this.ipv6IfIcmpOutErrors;
    }

    public void setIpv6IfIcmpOutErrors(int ipv6IfIcmpOutErrors) {
        int oldValue = getIpv6IfIcmpOutErrors();
        this.ipv6IfIcmpOutErrors = ipv6IfIcmpOutErrors;
        notifyChange(19, oldValue, ipv6IfIcmpOutErrors);
    }

    public int getIpv6IfIcmpOutDestUnreachs() {
        return this.ipv6IfIcmpOutDestUnreachs;
    }

    public void setIpv6IfIcmpOutDestUnreachs(int ipv6IfIcmpOutDestUnreachs) {
        int oldValue = getIpv6IfIcmpOutDestUnreachs();
        this.ipv6IfIcmpOutDestUnreachs = ipv6IfIcmpOutDestUnreachs;
        notifyChange(20, oldValue, ipv6IfIcmpOutDestUnreachs);
    }

    public int getIpv6IfIcmpOutAdminProhibs() {
        return this.ipv6IfIcmpOutAdminProhibs;
    }

    public void setIpv6IfIcmpOutAdminProhibs(int ipv6IfIcmpOutAdminProhibs) {
        int oldValue = getIpv6IfIcmpOutAdminProhibs();
        this.ipv6IfIcmpOutAdminProhibs = ipv6IfIcmpOutAdminProhibs;
        notifyChange(21, oldValue, ipv6IfIcmpOutAdminProhibs);
    }

    public int getIpv6IfIcmpOutTimeExcds() {
        return this.ipv6IfIcmpOutTimeExcds;
    }

    public void setIpv6IfIcmpOutTimeExcds(int ipv6IfIcmpOutTimeExcds) {
        int oldValue = getIpv6IfIcmpOutTimeExcds();
        this.ipv6IfIcmpOutTimeExcds = ipv6IfIcmpOutTimeExcds;
        notifyChange(22, oldValue, ipv6IfIcmpOutTimeExcds);
    }

    public int getIpv6IfIcmpOutParmProblems() {
        return this.ipv6IfIcmpOutParmProblems;
    }

    public void setIpv6IfIcmpOutParmProblems(int ipv6IfIcmpOutParmProblems) {
        int oldValue = getIpv6IfIcmpOutParmProblems();
        this.ipv6IfIcmpOutParmProblems = ipv6IfIcmpOutParmProblems;
        notifyChange(23, oldValue, ipv6IfIcmpOutParmProblems);
    }

    public int getIpv6IfIcmpOutPktTooBigs() {
        return this.ipv6IfIcmpOutPktTooBigs;
    }

    public void setIpv6IfIcmpOutPktTooBigs(int ipv6IfIcmpOutPktTooBigs) {
        int oldValue = getIpv6IfIcmpOutPktTooBigs();
        this.ipv6IfIcmpOutPktTooBigs = ipv6IfIcmpOutPktTooBigs;
        notifyChange(24, oldValue, ipv6IfIcmpOutPktTooBigs);
    }

    public int getIpv6IfIcmpOutEchos() {
        return this.ipv6IfIcmpOutEchos;
    }

    public void setIpv6IfIcmpOutEchos(int ipv6IfIcmpOutEchos) {
        int oldValue = getIpv6IfIcmpOutEchos();
        this.ipv6IfIcmpOutEchos = ipv6IfIcmpOutEchos;
        notifyChange(25, oldValue, ipv6IfIcmpOutEchos);
    }

    public int getIpv6IfIcmpOutEchoReplies() {
        return this.ipv6IfIcmpOutEchoReplies;
    }

    public void setIpv6IfIcmpOutEchoReplies(int ipv6IfIcmpOutEchoReplies) {
        int oldValue = getIpv6IfIcmpOutEchoReplies();
        this.ipv6IfIcmpOutEchoReplies = ipv6IfIcmpOutEchoReplies;
        notifyChange(26, oldValue, ipv6IfIcmpOutEchoReplies);
    }

    public int getIpv6IfIcmpOutRouterSolicits() {
        return this.ipv6IfIcmpOutRouterSolicits;
    }

    public void setIpv6IfIcmpOutRouterSolicits(int ipv6IfIcmpOutRouterSolicits) {
        int oldValue = getIpv6IfIcmpOutRouterSolicits();
        this.ipv6IfIcmpOutRouterSolicits = ipv6IfIcmpOutRouterSolicits;
        notifyChange(27, oldValue, ipv6IfIcmpOutRouterSolicits);
    }

    public int getIpv6IfIcmpOutRouterAdvertisements() {
        return this.ipv6IfIcmpOutRouterAdvertisements;
    }

    public void setIpv6IfIcmpOutRouterAdvertisements(int ipv6IfIcmpOutRouterAdvertisements) {
        int oldValue = getIpv6IfIcmpOutRouterAdvertisements();
        this.ipv6IfIcmpOutRouterAdvertisements = ipv6IfIcmpOutRouterAdvertisements;
        notifyChange(28, oldValue, ipv6IfIcmpOutRouterAdvertisements);
    }

    public int getIpv6IfIcmpOutNeighborSolicits() {
        return this.ipv6IfIcmpOutNeighborSolicits;
    }

    public void setIpv6IfIcmpOutNeighborSolicits(int ipv6IfIcmpOutNeighborSolicits) {
        int oldValue = getIpv6IfIcmpOutNeighborSolicits();
        this.ipv6IfIcmpOutNeighborSolicits = ipv6IfIcmpOutNeighborSolicits;
        notifyChange(29, oldValue, ipv6IfIcmpOutNeighborSolicits);
    }

    public int getIpv6IfIcmpOutNeighborAdvertisements() {
        return this.ipv6IfIcmpOutNeighborAdvertisements;
    }

    public void setIpv6IfIcmpOutNeighborAdvertisements(int ipv6IfIcmpOutNeighborAdvertisements) {
        int oldValue = getIpv6IfIcmpOutNeighborAdvertisements();
        this.ipv6IfIcmpOutNeighborAdvertisements = ipv6IfIcmpOutNeighborAdvertisements;
        notifyChange(30, oldValue, ipv6IfIcmpOutNeighborAdvertisements);
    }

    public int getIpv6IfIcmpOutRedirects() {
        return this.ipv6IfIcmpOutRedirects;
    }

    public void setIpv6IfIcmpOutRedirects(int ipv6IfIcmpOutRedirects) {
        int oldValue = getIpv6IfIcmpOutRedirects();
        this.ipv6IfIcmpOutRedirects = ipv6IfIcmpOutRedirects;
        notifyChange(31, oldValue, ipv6IfIcmpOutRedirects);
    }

    public int getIpv6IfIcmpOutGroupMembQueries() {
        return this.ipv6IfIcmpOutGroupMembQueries;
    }

    public void setIpv6IfIcmpOutGroupMembQueries(int ipv6IfIcmpOutGroupMembQueries) {
        int oldValue = getIpv6IfIcmpOutGroupMembQueries();
        this.ipv6IfIcmpOutGroupMembQueries = ipv6IfIcmpOutGroupMembQueries;
        notifyChange(32, oldValue, ipv6IfIcmpOutGroupMembQueries);
    }

    public int getIpv6IfIcmpOutGroupMembResponses() {
        return this.ipv6IfIcmpOutGroupMembResponses;
    }

    public void setIpv6IfIcmpOutGroupMembResponses(int ipv6IfIcmpOutGroupMembResponses) {
        int oldValue = getIpv6IfIcmpOutGroupMembResponses();
        this.ipv6IfIcmpOutGroupMembResponses = ipv6IfIcmpOutGroupMembResponses;
        notifyChange(33, oldValue, ipv6IfIcmpOutGroupMembResponses);
    }

    public int getIpv6IfIcmpOutGroupMembReductions() {
        return this.ipv6IfIcmpOutGroupMembReductions;
    }

    public void setIpv6IfIcmpOutGroupMembReductions(int ipv6IfIcmpOutGroupMembReductions) {
        int oldValue = getIpv6IfIcmpOutGroupMembReductions();
        this.ipv6IfIcmpOutGroupMembReductions = ipv6IfIcmpOutGroupMembReductions;
        notifyChange(34, oldValue, ipv6IfIcmpOutGroupMembReductions);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIpv6IfIcmpInMsgs(binding.getVariable().toInt());
                break;
            case  2 :
                setIpv6IfIcmpInErrors(binding.getVariable().toInt());
                break;
            case  3 :
                setIpv6IfIcmpInDestUnreachs(binding.getVariable().toInt());
                break;
            case  4 :
                setIpv6IfIcmpInAdminProhibs(binding.getVariable().toInt());
                break;
            case  5 :
                setIpv6IfIcmpInTimeExcds(binding.getVariable().toInt());
                break;
            case  6 :
                setIpv6IfIcmpInParmProblems(binding.getVariable().toInt());
                break;
            case  7 :
                setIpv6IfIcmpInPktTooBigs(binding.getVariable().toInt());
                break;
            case  8 :
                setIpv6IfIcmpInEchos(binding.getVariable().toInt());
                break;
            case  9 :
                setIpv6IfIcmpInEchoReplies(binding.getVariable().toInt());
                break;
            case  10 :
                setIpv6IfIcmpInRouterSolicits(binding.getVariable().toInt());
                break;
            case  11 :
                setIpv6IfIcmpInRouterAdvertisements(binding.getVariable().toInt());
                break;
            case  12 :
                setIpv6IfIcmpInNeighborSolicits(binding.getVariable().toInt());
                break;
            case  13 :
                setIpv6IfIcmpInNeighborAdvertisements(binding.getVariable().toInt());
                break;
            case  14 :
                setIpv6IfIcmpInRedirects(binding.getVariable().toInt());
                break;
            case  15 :
                setIpv6IfIcmpInGroupMembQueries(binding.getVariable().toInt());
                break;
            case  16 :
                setIpv6IfIcmpInGroupMembResponses(binding.getVariable().toInt());
                break;
            case  17 :
                setIpv6IfIcmpInGroupMembReductions(binding.getVariable().toInt());
                break;
            case  18 :
                setIpv6IfIcmpOutMsgs(binding.getVariable().toInt());
                break;
            case  19 :
                setIpv6IfIcmpOutErrors(binding.getVariable().toInt());
                break;
            case  20 :
                setIpv6IfIcmpOutDestUnreachs(binding.getVariable().toInt());
                break;
            case  21 :
                setIpv6IfIcmpOutAdminProhibs(binding.getVariable().toInt());
                break;
            case  22 :
                setIpv6IfIcmpOutTimeExcds(binding.getVariable().toInt());
                break;
            case  23 :
                setIpv6IfIcmpOutParmProblems(binding.getVariable().toInt());
                break;
            case  24 :
                setIpv6IfIcmpOutPktTooBigs(binding.getVariable().toInt());
                break;
            case  25 :
                setIpv6IfIcmpOutEchos(binding.getVariable().toInt());
                break;
            case  26 :
                setIpv6IfIcmpOutEchoReplies(binding.getVariable().toInt());
                break;
            case  27 :
                setIpv6IfIcmpOutRouterSolicits(binding.getVariable().toInt());
                break;
            case  28 :
                setIpv6IfIcmpOutRouterAdvertisements(binding.getVariable().toInt());
                break;
            case  29 :
                setIpv6IfIcmpOutNeighborSolicits(binding.getVariable().toInt());
                break;
            case  30 :
                setIpv6IfIcmpOutNeighborAdvertisements(binding.getVariable().toInt());
                break;
            case  31 :
                setIpv6IfIcmpOutRedirects(binding.getVariable().toInt());
                break;
            case  32 :
                setIpv6IfIcmpOutGroupMembQueries(binding.getVariable().toInt());
                break;
            case  33 :
                setIpv6IfIcmpOutGroupMembResponses(binding.getVariable().toInt());
                break;
            case  34 :
                setIpv6IfIcmpOutGroupMembReductions(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Ipv6IfIcmpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6IfIcmpInMsgs", ipv6IfIcmpInMsgs).append("ipv6IfIcmpInErrors", ipv6IfIcmpInErrors).append("ipv6IfIcmpInDestUnreachs", ipv6IfIcmpInDestUnreachs).append("ipv6IfIcmpInAdminProhibs", ipv6IfIcmpInAdminProhibs).append("ipv6IfIcmpInTimeExcds", ipv6IfIcmpInTimeExcds).append("ipv6IfIcmpInParmProblems", ipv6IfIcmpInParmProblems).append("ipv6IfIcmpInPktTooBigs", ipv6IfIcmpInPktTooBigs).append("ipv6IfIcmpInEchos", ipv6IfIcmpInEchos).append("ipv6IfIcmpInEchoReplies", ipv6IfIcmpInEchoReplies).append("ipv6IfIcmpInRouterSolicits", ipv6IfIcmpInRouterSolicits).append("ipv6IfIcmpInRouterAdvertisements", ipv6IfIcmpInRouterAdvertisements).append("ipv6IfIcmpInNeighborSolicits", ipv6IfIcmpInNeighborSolicits).append("ipv6IfIcmpInNeighborAdvertisements", ipv6IfIcmpInNeighborAdvertisements).append("ipv6IfIcmpInRedirects", ipv6IfIcmpInRedirects).append("ipv6IfIcmpInGroupMembQueries", ipv6IfIcmpInGroupMembQueries).append("ipv6IfIcmpInGroupMembResponses", ipv6IfIcmpInGroupMembResponses).append("ipv6IfIcmpInGroupMembReductions", ipv6IfIcmpInGroupMembReductions).append("ipv6IfIcmpOutMsgs", ipv6IfIcmpOutMsgs).append("ipv6IfIcmpOutErrors", ipv6IfIcmpOutErrors).append("ipv6IfIcmpOutDestUnreachs", ipv6IfIcmpOutDestUnreachs).append("ipv6IfIcmpOutAdminProhibs", ipv6IfIcmpOutAdminProhibs).append("ipv6IfIcmpOutTimeExcds", ipv6IfIcmpOutTimeExcds).append("ipv6IfIcmpOutParmProblems", ipv6IfIcmpOutParmProblems).append("ipv6IfIcmpOutPktTooBigs", ipv6IfIcmpOutPktTooBigs).append("ipv6IfIcmpOutEchos", ipv6IfIcmpOutEchos).append("ipv6IfIcmpOutEchoReplies", ipv6IfIcmpOutEchoReplies).append("ipv6IfIcmpOutRouterSolicits", ipv6IfIcmpOutRouterSolicits).append("ipv6IfIcmpOutRouterAdvertisements", ipv6IfIcmpOutRouterAdvertisements).append("ipv6IfIcmpOutNeighborSolicits", ipv6IfIcmpOutNeighborSolicits).append("ipv6IfIcmpOutNeighborAdvertisements", ipv6IfIcmpOutNeighborAdvertisements).append("ipv6IfIcmpOutRedirects", ipv6IfIcmpOutRedirects).append("ipv6IfIcmpOutGroupMembQueries", ipv6IfIcmpOutGroupMembQueries).append("ipv6IfIcmpOutGroupMembResponses", ipv6IfIcmpOutGroupMembResponses).append("ipv6IfIcmpOutGroupMembReductions", ipv6IfIcmpOutGroupMembReductions).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6IfIcmpInMsgs).append(ipv6IfIcmpInErrors).append(ipv6IfIcmpInDestUnreachs).append(ipv6IfIcmpInAdminProhibs).append(ipv6IfIcmpInTimeExcds).append(ipv6IfIcmpInParmProblems).append(ipv6IfIcmpInPktTooBigs).append(ipv6IfIcmpInEchos).append(ipv6IfIcmpInEchoReplies).append(ipv6IfIcmpInRouterSolicits).append(ipv6IfIcmpInRouterAdvertisements).append(ipv6IfIcmpInNeighborSolicits).append(ipv6IfIcmpInNeighborAdvertisements).append(ipv6IfIcmpInRedirects).append(ipv6IfIcmpInGroupMembQueries).append(ipv6IfIcmpInGroupMembResponses).append(ipv6IfIcmpInGroupMembReductions).append(ipv6IfIcmpOutMsgs).append(ipv6IfIcmpOutErrors).append(ipv6IfIcmpOutDestUnreachs).append(ipv6IfIcmpOutAdminProhibs).append(ipv6IfIcmpOutTimeExcds).append(ipv6IfIcmpOutParmProblems).append(ipv6IfIcmpOutPktTooBigs).append(ipv6IfIcmpOutEchos).append(ipv6IfIcmpOutEchoReplies).append(ipv6IfIcmpOutRouterSolicits).append(ipv6IfIcmpOutRouterAdvertisements).append(ipv6IfIcmpOutNeighborSolicits).append(ipv6IfIcmpOutNeighborAdvertisements).append(ipv6IfIcmpOutRedirects).append(ipv6IfIcmpOutGroupMembQueries).append(ipv6IfIcmpOutGroupMembResponses).append(ipv6IfIcmpOutGroupMembReductions).append(_index).toHashCode();
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
        Ipv6IfIcmpEntry rhs = ((Ipv6IfIcmpEntry) obj);
        return new EqualsBuilder().append(ipv6IfIcmpInMsgs, rhs.ipv6IfIcmpInMsgs).append(ipv6IfIcmpInErrors, rhs.ipv6IfIcmpInErrors).append(ipv6IfIcmpInDestUnreachs, rhs.ipv6IfIcmpInDestUnreachs).append(ipv6IfIcmpInAdminProhibs, rhs.ipv6IfIcmpInAdminProhibs).append(ipv6IfIcmpInTimeExcds, rhs.ipv6IfIcmpInTimeExcds).append(ipv6IfIcmpInParmProblems, rhs.ipv6IfIcmpInParmProblems).append(ipv6IfIcmpInPktTooBigs, rhs.ipv6IfIcmpInPktTooBigs).append(ipv6IfIcmpInEchos, rhs.ipv6IfIcmpInEchos).append(ipv6IfIcmpInEchoReplies, rhs.ipv6IfIcmpInEchoReplies).append(ipv6IfIcmpInRouterSolicits, rhs.ipv6IfIcmpInRouterSolicits).append(ipv6IfIcmpInRouterAdvertisements, rhs.ipv6IfIcmpInRouterAdvertisements).append(ipv6IfIcmpInNeighborSolicits, rhs.ipv6IfIcmpInNeighborSolicits).append(ipv6IfIcmpInNeighborAdvertisements, rhs.ipv6IfIcmpInNeighborAdvertisements).append(ipv6IfIcmpInRedirects, rhs.ipv6IfIcmpInRedirects).append(ipv6IfIcmpInGroupMembQueries, rhs.ipv6IfIcmpInGroupMembQueries).append(ipv6IfIcmpInGroupMembResponses, rhs.ipv6IfIcmpInGroupMembResponses).append(ipv6IfIcmpInGroupMembReductions, rhs.ipv6IfIcmpInGroupMembReductions).append(ipv6IfIcmpOutMsgs, rhs.ipv6IfIcmpOutMsgs).append(ipv6IfIcmpOutErrors, rhs.ipv6IfIcmpOutErrors).append(ipv6IfIcmpOutDestUnreachs, rhs.ipv6IfIcmpOutDestUnreachs).append(ipv6IfIcmpOutAdminProhibs, rhs.ipv6IfIcmpOutAdminProhibs).append(ipv6IfIcmpOutTimeExcds, rhs.ipv6IfIcmpOutTimeExcds).append(ipv6IfIcmpOutParmProblems, rhs.ipv6IfIcmpOutParmProblems).append(ipv6IfIcmpOutPktTooBigs, rhs.ipv6IfIcmpOutPktTooBigs).append(ipv6IfIcmpOutEchos, rhs.ipv6IfIcmpOutEchos).append(ipv6IfIcmpOutEchoReplies, rhs.ipv6IfIcmpOutEchoReplies).append(ipv6IfIcmpOutRouterSolicits, rhs.ipv6IfIcmpOutRouterSolicits).append(ipv6IfIcmpOutRouterAdvertisements, rhs.ipv6IfIcmpOutRouterAdvertisements).append(ipv6IfIcmpOutNeighborSolicits, rhs.ipv6IfIcmpOutNeighborSolicits).append(ipv6IfIcmpOutNeighborAdvertisements, rhs.ipv6IfIcmpOutNeighborAdvertisements).append(ipv6IfIcmpOutRedirects, rhs.ipv6IfIcmpOutRedirects).append(ipv6IfIcmpOutGroupMembQueries, rhs.ipv6IfIcmpOutGroupMembQueries).append(ipv6IfIcmpOutGroupMembResponses, rhs.ipv6IfIcmpOutGroupMembResponses).append(ipv6IfIcmpOutGroupMembReductions, rhs.ipv6IfIcmpOutGroupMembReductions).append(_index, rhs._index).isEquals();
    }

    public Ipv6IfIcmpEntry clone() {
        Ipv6IfIcmpEntry _copy = new Ipv6IfIcmpEntry();
        _copy.ipv6IfIcmpInMsgs = ipv6IfIcmpInMsgs;
        _copy.ipv6IfIcmpInErrors = ipv6IfIcmpInErrors;
        _copy.ipv6IfIcmpInDestUnreachs = ipv6IfIcmpInDestUnreachs;
        _copy.ipv6IfIcmpInAdminProhibs = ipv6IfIcmpInAdminProhibs;
        _copy.ipv6IfIcmpInTimeExcds = ipv6IfIcmpInTimeExcds;
        _copy.ipv6IfIcmpInParmProblems = ipv6IfIcmpInParmProblems;
        _copy.ipv6IfIcmpInPktTooBigs = ipv6IfIcmpInPktTooBigs;
        _copy.ipv6IfIcmpInEchos = ipv6IfIcmpInEchos;
        _copy.ipv6IfIcmpInEchoReplies = ipv6IfIcmpInEchoReplies;
        _copy.ipv6IfIcmpInRouterSolicits = ipv6IfIcmpInRouterSolicits;
        _copy.ipv6IfIcmpInRouterAdvertisements = ipv6IfIcmpInRouterAdvertisements;
        _copy.ipv6IfIcmpInNeighborSolicits = ipv6IfIcmpInNeighborSolicits;
        _copy.ipv6IfIcmpInNeighborAdvertisements = ipv6IfIcmpInNeighborAdvertisements;
        _copy.ipv6IfIcmpInRedirects = ipv6IfIcmpInRedirects;
        _copy.ipv6IfIcmpInGroupMembQueries = ipv6IfIcmpInGroupMembQueries;
        _copy.ipv6IfIcmpInGroupMembResponses = ipv6IfIcmpInGroupMembResponses;
        _copy.ipv6IfIcmpInGroupMembReductions = ipv6IfIcmpInGroupMembReductions;
        _copy.ipv6IfIcmpOutMsgs = ipv6IfIcmpOutMsgs;
        _copy.ipv6IfIcmpOutErrors = ipv6IfIcmpOutErrors;
        _copy.ipv6IfIcmpOutDestUnreachs = ipv6IfIcmpOutDestUnreachs;
        _copy.ipv6IfIcmpOutAdminProhibs = ipv6IfIcmpOutAdminProhibs;
        _copy.ipv6IfIcmpOutTimeExcds = ipv6IfIcmpOutTimeExcds;
        _copy.ipv6IfIcmpOutParmProblems = ipv6IfIcmpOutParmProblems;
        _copy.ipv6IfIcmpOutPktTooBigs = ipv6IfIcmpOutPktTooBigs;
        _copy.ipv6IfIcmpOutEchos = ipv6IfIcmpOutEchos;
        _copy.ipv6IfIcmpOutEchoReplies = ipv6IfIcmpOutEchoReplies;
        _copy.ipv6IfIcmpOutRouterSolicits = ipv6IfIcmpOutRouterSolicits;
        _copy.ipv6IfIcmpOutRouterAdvertisements = ipv6IfIcmpOutRouterAdvertisements;
        _copy.ipv6IfIcmpOutNeighborSolicits = ipv6IfIcmpOutNeighborSolicits;
        _copy.ipv6IfIcmpOutNeighborAdvertisements = ipv6IfIcmpOutNeighborAdvertisements;
        _copy.ipv6IfIcmpOutRedirects = ipv6IfIcmpOutRedirects;
        _copy.ipv6IfIcmpOutGroupMembQueries = ipv6IfIcmpOutGroupMembQueries;
        _copy.ipv6IfIcmpOutGroupMembResponses = ipv6IfIcmpOutGroupMembResponses;
        _copy.ipv6IfIcmpOutGroupMembReductions = ipv6IfIcmpOutGroupMembReductions;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.56.1.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6IfIcmpInMsgs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6IfIcmpInErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6IfIcmpInDestUnreachs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipv6IfIcmpInAdminProhibs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipv6IfIcmpInTimeExcds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipv6IfIcmpInParmProblems", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipv6IfIcmpInPktTooBigs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipv6IfIcmpInEchos", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipv6IfIcmpInEchoReplies", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipv6IfIcmpInRouterSolicits", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipv6IfIcmpInRouterAdvertisements", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ipv6IfIcmpInNeighborSolicits", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ipv6IfIcmpInNeighborAdvertisements", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ipv6IfIcmpInRedirects", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ipv6IfIcmpInGroupMembQueries", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "ipv6IfIcmpInGroupMembResponses", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "ipv6IfIcmpInGroupMembReductions", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "ipv6IfIcmpOutMsgs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "ipv6IfIcmpOutErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "ipv6IfIcmpOutDestUnreachs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "ipv6IfIcmpOutAdminProhibs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "ipv6IfIcmpOutTimeExcds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "ipv6IfIcmpOutParmProblems", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "ipv6IfIcmpOutPktTooBigs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "ipv6IfIcmpOutEchos", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "ipv6IfIcmpOutEchoReplies", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "ipv6IfIcmpOutRouterSolicits", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "ipv6IfIcmpOutRouterAdvertisements", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "ipv6IfIcmpOutNeighborSolicits", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(30, "ipv6IfIcmpOutNeighborAdvertisements", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(31, "ipv6IfIcmpOutRedirects", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(32, "ipv6IfIcmpOutGroupMembQueries", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(33, "ipv6IfIcmpOutGroupMembResponses", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(34, "ipv6IfIcmpOutGroupMembReductions", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
