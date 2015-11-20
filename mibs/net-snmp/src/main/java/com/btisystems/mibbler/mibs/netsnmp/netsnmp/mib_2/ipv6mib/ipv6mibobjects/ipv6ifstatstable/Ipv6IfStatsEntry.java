
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.ipv6ifstatstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6ifstatstable.IIpv6IfStatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.Ipv6IfStatsTable;
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

public class Ipv6IfStatsEntry
    extends DeviceEntity
    implements Serializable, IIpv6IfStatsEntry, IIndexed, IVariableBindingSetter
{

    private int ipv6IfStatsInReceives;
    private int ipv6IfStatsInHdrErrors;
    private int ipv6IfStatsInTooBigErrors;
    private int ipv6IfStatsInNoRoutes;
    private int ipv6IfStatsInAddrErrors;
    private int ipv6IfStatsInUnknownProtos;
    private int ipv6IfStatsInTruncatedPkts;
    private int ipv6IfStatsInDiscards;
    private int ipv6IfStatsInDelivers;
    private int ipv6IfStatsOutForwDatagrams;
    private int ipv6IfStatsOutRequests;
    private int ipv6IfStatsOutDiscards;
    private int ipv6IfStatsOutFragOKs;
    private int ipv6IfStatsOutFragFails;
    private int ipv6IfStatsOutFragCreates;
    private int ipv6IfStatsReasmReqds;
    private int ipv6IfStatsReasmOKs;
    private int ipv6IfStatsReasmFails;
    private int ipv6IfStatsInMcastPkts;
    private int ipv6IfStatsOutMcastPkts;
    private String _index;
    private Ipv6IfStatsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6IfStatsEntry() {
    }

    public int getIpv6IfStatsInReceives() {
        return this.ipv6IfStatsInReceives;
    }

    public void setIpv6IfStatsInReceives(int ipv6IfStatsInReceives) {
        int oldValue = getIpv6IfStatsInReceives();
        this.ipv6IfStatsInReceives = ipv6IfStatsInReceives;
        notifyChange(1, oldValue, ipv6IfStatsInReceives);
    }

    public int getIpv6IfStatsInHdrErrors() {
        return this.ipv6IfStatsInHdrErrors;
    }

    public void setIpv6IfStatsInHdrErrors(int ipv6IfStatsInHdrErrors) {
        int oldValue = getIpv6IfStatsInHdrErrors();
        this.ipv6IfStatsInHdrErrors = ipv6IfStatsInHdrErrors;
        notifyChange(2, oldValue, ipv6IfStatsInHdrErrors);
    }

    public int getIpv6IfStatsInTooBigErrors() {
        return this.ipv6IfStatsInTooBigErrors;
    }

    public void setIpv6IfStatsInTooBigErrors(int ipv6IfStatsInTooBigErrors) {
        int oldValue = getIpv6IfStatsInTooBigErrors();
        this.ipv6IfStatsInTooBigErrors = ipv6IfStatsInTooBigErrors;
        notifyChange(3, oldValue, ipv6IfStatsInTooBigErrors);
    }

    public int getIpv6IfStatsInNoRoutes() {
        return this.ipv6IfStatsInNoRoutes;
    }

    public void setIpv6IfStatsInNoRoutes(int ipv6IfStatsInNoRoutes) {
        int oldValue = getIpv6IfStatsInNoRoutes();
        this.ipv6IfStatsInNoRoutes = ipv6IfStatsInNoRoutes;
        notifyChange(4, oldValue, ipv6IfStatsInNoRoutes);
    }

    public int getIpv6IfStatsInAddrErrors() {
        return this.ipv6IfStatsInAddrErrors;
    }

    public void setIpv6IfStatsInAddrErrors(int ipv6IfStatsInAddrErrors) {
        int oldValue = getIpv6IfStatsInAddrErrors();
        this.ipv6IfStatsInAddrErrors = ipv6IfStatsInAddrErrors;
        notifyChange(5, oldValue, ipv6IfStatsInAddrErrors);
    }

    public int getIpv6IfStatsInUnknownProtos() {
        return this.ipv6IfStatsInUnknownProtos;
    }

    public void setIpv6IfStatsInUnknownProtos(int ipv6IfStatsInUnknownProtos) {
        int oldValue = getIpv6IfStatsInUnknownProtos();
        this.ipv6IfStatsInUnknownProtos = ipv6IfStatsInUnknownProtos;
        notifyChange(6, oldValue, ipv6IfStatsInUnknownProtos);
    }

    public int getIpv6IfStatsInTruncatedPkts() {
        return this.ipv6IfStatsInTruncatedPkts;
    }

    public void setIpv6IfStatsInTruncatedPkts(int ipv6IfStatsInTruncatedPkts) {
        int oldValue = getIpv6IfStatsInTruncatedPkts();
        this.ipv6IfStatsInTruncatedPkts = ipv6IfStatsInTruncatedPkts;
        notifyChange(7, oldValue, ipv6IfStatsInTruncatedPkts);
    }

    public int getIpv6IfStatsInDiscards() {
        return this.ipv6IfStatsInDiscards;
    }

    public void setIpv6IfStatsInDiscards(int ipv6IfStatsInDiscards) {
        int oldValue = getIpv6IfStatsInDiscards();
        this.ipv6IfStatsInDiscards = ipv6IfStatsInDiscards;
        notifyChange(8, oldValue, ipv6IfStatsInDiscards);
    }

    public int getIpv6IfStatsInDelivers() {
        return this.ipv6IfStatsInDelivers;
    }

    public void setIpv6IfStatsInDelivers(int ipv6IfStatsInDelivers) {
        int oldValue = getIpv6IfStatsInDelivers();
        this.ipv6IfStatsInDelivers = ipv6IfStatsInDelivers;
        notifyChange(9, oldValue, ipv6IfStatsInDelivers);
    }

    public int getIpv6IfStatsOutForwDatagrams() {
        return this.ipv6IfStatsOutForwDatagrams;
    }

    public void setIpv6IfStatsOutForwDatagrams(int ipv6IfStatsOutForwDatagrams) {
        int oldValue = getIpv6IfStatsOutForwDatagrams();
        this.ipv6IfStatsOutForwDatagrams = ipv6IfStatsOutForwDatagrams;
        notifyChange(10, oldValue, ipv6IfStatsOutForwDatagrams);
    }

    public int getIpv6IfStatsOutRequests() {
        return this.ipv6IfStatsOutRequests;
    }

    public void setIpv6IfStatsOutRequests(int ipv6IfStatsOutRequests) {
        int oldValue = getIpv6IfStatsOutRequests();
        this.ipv6IfStatsOutRequests = ipv6IfStatsOutRequests;
        notifyChange(11, oldValue, ipv6IfStatsOutRequests);
    }

    public int getIpv6IfStatsOutDiscards() {
        return this.ipv6IfStatsOutDiscards;
    }

    public void setIpv6IfStatsOutDiscards(int ipv6IfStatsOutDiscards) {
        int oldValue = getIpv6IfStatsOutDiscards();
        this.ipv6IfStatsOutDiscards = ipv6IfStatsOutDiscards;
        notifyChange(12, oldValue, ipv6IfStatsOutDiscards);
    }

    public int getIpv6IfStatsOutFragOKs() {
        return this.ipv6IfStatsOutFragOKs;
    }

    public void setIpv6IfStatsOutFragOKs(int ipv6IfStatsOutFragOKs) {
        int oldValue = getIpv6IfStatsOutFragOKs();
        this.ipv6IfStatsOutFragOKs = ipv6IfStatsOutFragOKs;
        notifyChange(13, oldValue, ipv6IfStatsOutFragOKs);
    }

    public int getIpv6IfStatsOutFragFails() {
        return this.ipv6IfStatsOutFragFails;
    }

    public void setIpv6IfStatsOutFragFails(int ipv6IfStatsOutFragFails) {
        int oldValue = getIpv6IfStatsOutFragFails();
        this.ipv6IfStatsOutFragFails = ipv6IfStatsOutFragFails;
        notifyChange(14, oldValue, ipv6IfStatsOutFragFails);
    }

    public int getIpv6IfStatsOutFragCreates() {
        return this.ipv6IfStatsOutFragCreates;
    }

    public void setIpv6IfStatsOutFragCreates(int ipv6IfStatsOutFragCreates) {
        int oldValue = getIpv6IfStatsOutFragCreates();
        this.ipv6IfStatsOutFragCreates = ipv6IfStatsOutFragCreates;
        notifyChange(15, oldValue, ipv6IfStatsOutFragCreates);
    }

    public int getIpv6IfStatsReasmReqds() {
        return this.ipv6IfStatsReasmReqds;
    }

    public void setIpv6IfStatsReasmReqds(int ipv6IfStatsReasmReqds) {
        int oldValue = getIpv6IfStatsReasmReqds();
        this.ipv6IfStatsReasmReqds = ipv6IfStatsReasmReqds;
        notifyChange(16, oldValue, ipv6IfStatsReasmReqds);
    }

    public int getIpv6IfStatsReasmOKs() {
        return this.ipv6IfStatsReasmOKs;
    }

    public void setIpv6IfStatsReasmOKs(int ipv6IfStatsReasmOKs) {
        int oldValue = getIpv6IfStatsReasmOKs();
        this.ipv6IfStatsReasmOKs = ipv6IfStatsReasmOKs;
        notifyChange(17, oldValue, ipv6IfStatsReasmOKs);
    }

    public int getIpv6IfStatsReasmFails() {
        return this.ipv6IfStatsReasmFails;
    }

    public void setIpv6IfStatsReasmFails(int ipv6IfStatsReasmFails) {
        int oldValue = getIpv6IfStatsReasmFails();
        this.ipv6IfStatsReasmFails = ipv6IfStatsReasmFails;
        notifyChange(18, oldValue, ipv6IfStatsReasmFails);
    }

    public int getIpv6IfStatsInMcastPkts() {
        return this.ipv6IfStatsInMcastPkts;
    }

    public void setIpv6IfStatsInMcastPkts(int ipv6IfStatsInMcastPkts) {
        int oldValue = getIpv6IfStatsInMcastPkts();
        this.ipv6IfStatsInMcastPkts = ipv6IfStatsInMcastPkts;
        notifyChange(19, oldValue, ipv6IfStatsInMcastPkts);
    }

    public int getIpv6IfStatsOutMcastPkts() {
        return this.ipv6IfStatsOutMcastPkts;
    }

    public void setIpv6IfStatsOutMcastPkts(int ipv6IfStatsOutMcastPkts) {
        int oldValue = getIpv6IfStatsOutMcastPkts();
        this.ipv6IfStatsOutMcastPkts = ipv6IfStatsOutMcastPkts;
        notifyChange(20, oldValue, ipv6IfStatsOutMcastPkts);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIpv6IfStatsInReceives(binding.getVariable().toInt());
                break;
            case  2 :
                setIpv6IfStatsInHdrErrors(binding.getVariable().toInt());
                break;
            case  3 :
                setIpv6IfStatsInTooBigErrors(binding.getVariable().toInt());
                break;
            case  4 :
                setIpv6IfStatsInNoRoutes(binding.getVariable().toInt());
                break;
            case  5 :
                setIpv6IfStatsInAddrErrors(binding.getVariable().toInt());
                break;
            case  6 :
                setIpv6IfStatsInUnknownProtos(binding.getVariable().toInt());
                break;
            case  7 :
                setIpv6IfStatsInTruncatedPkts(binding.getVariable().toInt());
                break;
            case  8 :
                setIpv6IfStatsInDiscards(binding.getVariable().toInt());
                break;
            case  9 :
                setIpv6IfStatsInDelivers(binding.getVariable().toInt());
                break;
            case  10 :
                setIpv6IfStatsOutForwDatagrams(binding.getVariable().toInt());
                break;
            case  11 :
                setIpv6IfStatsOutRequests(binding.getVariable().toInt());
                break;
            case  12 :
                setIpv6IfStatsOutDiscards(binding.getVariable().toInt());
                break;
            case  13 :
                setIpv6IfStatsOutFragOKs(binding.getVariable().toInt());
                break;
            case  14 :
                setIpv6IfStatsOutFragFails(binding.getVariable().toInt());
                break;
            case  15 :
                setIpv6IfStatsOutFragCreates(binding.getVariable().toInt());
                break;
            case  16 :
                setIpv6IfStatsReasmReqds(binding.getVariable().toInt());
                break;
            case  17 :
                setIpv6IfStatsReasmOKs(binding.getVariable().toInt());
                break;
            case  18 :
                setIpv6IfStatsReasmFails(binding.getVariable().toInt());
                break;
            case  19 :
                setIpv6IfStatsInMcastPkts(binding.getVariable().toInt());
                break;
            case  20 :
                setIpv6IfStatsOutMcastPkts(binding.getVariable().toInt());
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

    public void _setTable(Ipv6IfStatsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6IfStatsInReceives", ipv6IfStatsInReceives).append("ipv6IfStatsInHdrErrors", ipv6IfStatsInHdrErrors).append("ipv6IfStatsInTooBigErrors", ipv6IfStatsInTooBigErrors).append("ipv6IfStatsInNoRoutes", ipv6IfStatsInNoRoutes).append("ipv6IfStatsInAddrErrors", ipv6IfStatsInAddrErrors).append("ipv6IfStatsInUnknownProtos", ipv6IfStatsInUnknownProtos).append("ipv6IfStatsInTruncatedPkts", ipv6IfStatsInTruncatedPkts).append("ipv6IfStatsInDiscards", ipv6IfStatsInDiscards).append("ipv6IfStatsInDelivers", ipv6IfStatsInDelivers).append("ipv6IfStatsOutForwDatagrams", ipv6IfStatsOutForwDatagrams).append("ipv6IfStatsOutRequests", ipv6IfStatsOutRequests).append("ipv6IfStatsOutDiscards", ipv6IfStatsOutDiscards).append("ipv6IfStatsOutFragOKs", ipv6IfStatsOutFragOKs).append("ipv6IfStatsOutFragFails", ipv6IfStatsOutFragFails).append("ipv6IfStatsOutFragCreates", ipv6IfStatsOutFragCreates).append("ipv6IfStatsReasmReqds", ipv6IfStatsReasmReqds).append("ipv6IfStatsReasmOKs", ipv6IfStatsReasmOKs).append("ipv6IfStatsReasmFails", ipv6IfStatsReasmFails).append("ipv6IfStatsInMcastPkts", ipv6IfStatsInMcastPkts).append("ipv6IfStatsOutMcastPkts", ipv6IfStatsOutMcastPkts).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6IfStatsInReceives).append(ipv6IfStatsInHdrErrors).append(ipv6IfStatsInTooBigErrors).append(ipv6IfStatsInNoRoutes).append(ipv6IfStatsInAddrErrors).append(ipv6IfStatsInUnknownProtos).append(ipv6IfStatsInTruncatedPkts).append(ipv6IfStatsInDiscards).append(ipv6IfStatsInDelivers).append(ipv6IfStatsOutForwDatagrams).append(ipv6IfStatsOutRequests).append(ipv6IfStatsOutDiscards).append(ipv6IfStatsOutFragOKs).append(ipv6IfStatsOutFragFails).append(ipv6IfStatsOutFragCreates).append(ipv6IfStatsReasmReqds).append(ipv6IfStatsReasmOKs).append(ipv6IfStatsReasmFails).append(ipv6IfStatsInMcastPkts).append(ipv6IfStatsOutMcastPkts).append(_index).toHashCode();
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
        Ipv6IfStatsEntry rhs = ((Ipv6IfStatsEntry) obj);
        return new EqualsBuilder().append(ipv6IfStatsInReceives, rhs.ipv6IfStatsInReceives).append(ipv6IfStatsInHdrErrors, rhs.ipv6IfStatsInHdrErrors).append(ipv6IfStatsInTooBigErrors, rhs.ipv6IfStatsInTooBigErrors).append(ipv6IfStatsInNoRoutes, rhs.ipv6IfStatsInNoRoutes).append(ipv6IfStatsInAddrErrors, rhs.ipv6IfStatsInAddrErrors).append(ipv6IfStatsInUnknownProtos, rhs.ipv6IfStatsInUnknownProtos).append(ipv6IfStatsInTruncatedPkts, rhs.ipv6IfStatsInTruncatedPkts).append(ipv6IfStatsInDiscards, rhs.ipv6IfStatsInDiscards).append(ipv6IfStatsInDelivers, rhs.ipv6IfStatsInDelivers).append(ipv6IfStatsOutForwDatagrams, rhs.ipv6IfStatsOutForwDatagrams).append(ipv6IfStatsOutRequests, rhs.ipv6IfStatsOutRequests).append(ipv6IfStatsOutDiscards, rhs.ipv6IfStatsOutDiscards).append(ipv6IfStatsOutFragOKs, rhs.ipv6IfStatsOutFragOKs).append(ipv6IfStatsOutFragFails, rhs.ipv6IfStatsOutFragFails).append(ipv6IfStatsOutFragCreates, rhs.ipv6IfStatsOutFragCreates).append(ipv6IfStatsReasmReqds, rhs.ipv6IfStatsReasmReqds).append(ipv6IfStatsReasmOKs, rhs.ipv6IfStatsReasmOKs).append(ipv6IfStatsReasmFails, rhs.ipv6IfStatsReasmFails).append(ipv6IfStatsInMcastPkts, rhs.ipv6IfStatsInMcastPkts).append(ipv6IfStatsOutMcastPkts, rhs.ipv6IfStatsOutMcastPkts).append(_index, rhs._index).isEquals();
    }

    public Ipv6IfStatsEntry clone() {
        Ipv6IfStatsEntry _copy = new Ipv6IfStatsEntry();
        _copy.ipv6IfStatsInReceives = ipv6IfStatsInReceives;
        _copy.ipv6IfStatsInHdrErrors = ipv6IfStatsInHdrErrors;
        _copy.ipv6IfStatsInTooBigErrors = ipv6IfStatsInTooBigErrors;
        _copy.ipv6IfStatsInNoRoutes = ipv6IfStatsInNoRoutes;
        _copy.ipv6IfStatsInAddrErrors = ipv6IfStatsInAddrErrors;
        _copy.ipv6IfStatsInUnknownProtos = ipv6IfStatsInUnknownProtos;
        _copy.ipv6IfStatsInTruncatedPkts = ipv6IfStatsInTruncatedPkts;
        _copy.ipv6IfStatsInDiscards = ipv6IfStatsInDiscards;
        _copy.ipv6IfStatsInDelivers = ipv6IfStatsInDelivers;
        _copy.ipv6IfStatsOutForwDatagrams = ipv6IfStatsOutForwDatagrams;
        _copy.ipv6IfStatsOutRequests = ipv6IfStatsOutRequests;
        _copy.ipv6IfStatsOutDiscards = ipv6IfStatsOutDiscards;
        _copy.ipv6IfStatsOutFragOKs = ipv6IfStatsOutFragOKs;
        _copy.ipv6IfStatsOutFragFails = ipv6IfStatsOutFragFails;
        _copy.ipv6IfStatsOutFragCreates = ipv6IfStatsOutFragCreates;
        _copy.ipv6IfStatsReasmReqds = ipv6IfStatsReasmReqds;
        _copy.ipv6IfStatsReasmOKs = ipv6IfStatsReasmOKs;
        _copy.ipv6IfStatsReasmFails = ipv6IfStatsReasmFails;
        _copy.ipv6IfStatsInMcastPkts = ipv6IfStatsInMcastPkts;
        _copy.ipv6IfStatsOutMcastPkts = ipv6IfStatsOutMcastPkts;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6IfStatsInReceives", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6IfStatsInHdrErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6IfStatsInTooBigErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipv6IfStatsInNoRoutes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipv6IfStatsInAddrErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipv6IfStatsInUnknownProtos", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipv6IfStatsInTruncatedPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipv6IfStatsInDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipv6IfStatsInDelivers", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipv6IfStatsOutForwDatagrams", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipv6IfStatsOutRequests", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ipv6IfStatsOutDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ipv6IfStatsOutFragOKs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ipv6IfStatsOutFragFails", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ipv6IfStatsOutFragCreates", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "ipv6IfStatsReasmReqds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "ipv6IfStatsReasmOKs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "ipv6IfStatsReasmFails", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "ipv6IfStatsInMcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "ipv6IfStatsOutMcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
