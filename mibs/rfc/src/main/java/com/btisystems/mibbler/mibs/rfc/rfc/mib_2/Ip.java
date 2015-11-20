
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.IIp;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class Ip
    extends DeviceEntity
    implements Serializable, IIp, IVariableBindingSetter
{

    private int ipForwarding;
    private int ipDefaultTTL;
    private int ipInReceives;
    private int ipInHdrErrors;
    private int ipInAddrErrors;
    private int ipForwDatagrams;
    private int ipInUnknownProtos;
    private int ipInDiscards;
    private int ipInDelivers;
    private int ipOutRequests;
    private int ipOutDiscards;
    private int ipOutNoRoutes;
    private int ipReasmTimeout;
    private int ipReasmReqds;
    private int ipReasmOKs;
    private int ipReasmFails;
    private int ipFragOKs;
    private int ipFragFails;
    private int ipFragCreates;
    private int ipRoutingDiscards;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ip() {
    }

    public int getIpForwarding() {
        return this.ipForwarding;
    }

    public void setIpForwarding(int ipForwarding) {
        int oldValue = getIpForwarding();
        this.ipForwarding = ipForwarding;
        notifyChange(1, oldValue, ipForwarding);
    }

    public int getIpDefaultTTL() {
        return this.ipDefaultTTL;
    }

    public void setIpDefaultTTL(int ipDefaultTTL) {
        int oldValue = getIpDefaultTTL();
        this.ipDefaultTTL = ipDefaultTTL;
        notifyChange(2, oldValue, ipDefaultTTL);
    }

    public int getIpInReceives() {
        return this.ipInReceives;
    }

    public void setIpInReceives(int ipInReceives) {
        int oldValue = getIpInReceives();
        this.ipInReceives = ipInReceives;
        notifyChange(3, oldValue, ipInReceives);
    }

    public int getIpInHdrErrors() {
        return this.ipInHdrErrors;
    }

    public void setIpInHdrErrors(int ipInHdrErrors) {
        int oldValue = getIpInHdrErrors();
        this.ipInHdrErrors = ipInHdrErrors;
        notifyChange(4, oldValue, ipInHdrErrors);
    }

    public int getIpInAddrErrors() {
        return this.ipInAddrErrors;
    }

    public void setIpInAddrErrors(int ipInAddrErrors) {
        int oldValue = getIpInAddrErrors();
        this.ipInAddrErrors = ipInAddrErrors;
        notifyChange(5, oldValue, ipInAddrErrors);
    }

    public int getIpForwDatagrams() {
        return this.ipForwDatagrams;
    }

    public void setIpForwDatagrams(int ipForwDatagrams) {
        int oldValue = getIpForwDatagrams();
        this.ipForwDatagrams = ipForwDatagrams;
        notifyChange(6, oldValue, ipForwDatagrams);
    }

    public int getIpInUnknownProtos() {
        return this.ipInUnknownProtos;
    }

    public void setIpInUnknownProtos(int ipInUnknownProtos) {
        int oldValue = getIpInUnknownProtos();
        this.ipInUnknownProtos = ipInUnknownProtos;
        notifyChange(7, oldValue, ipInUnknownProtos);
    }

    public int getIpInDiscards() {
        return this.ipInDiscards;
    }

    public void setIpInDiscards(int ipInDiscards) {
        int oldValue = getIpInDiscards();
        this.ipInDiscards = ipInDiscards;
        notifyChange(8, oldValue, ipInDiscards);
    }

    public int getIpInDelivers() {
        return this.ipInDelivers;
    }

    public void setIpInDelivers(int ipInDelivers) {
        int oldValue = getIpInDelivers();
        this.ipInDelivers = ipInDelivers;
        notifyChange(9, oldValue, ipInDelivers);
    }

    public int getIpOutRequests() {
        return this.ipOutRequests;
    }

    public void setIpOutRequests(int ipOutRequests) {
        int oldValue = getIpOutRequests();
        this.ipOutRequests = ipOutRequests;
        notifyChange(10, oldValue, ipOutRequests);
    }

    public int getIpOutDiscards() {
        return this.ipOutDiscards;
    }

    public void setIpOutDiscards(int ipOutDiscards) {
        int oldValue = getIpOutDiscards();
        this.ipOutDiscards = ipOutDiscards;
        notifyChange(11, oldValue, ipOutDiscards);
    }

    public int getIpOutNoRoutes() {
        return this.ipOutNoRoutes;
    }

    public void setIpOutNoRoutes(int ipOutNoRoutes) {
        int oldValue = getIpOutNoRoutes();
        this.ipOutNoRoutes = ipOutNoRoutes;
        notifyChange(12, oldValue, ipOutNoRoutes);
    }

    public int getIpReasmTimeout() {
        return this.ipReasmTimeout;
    }

    public void setIpReasmTimeout(int ipReasmTimeout) {
        int oldValue = getIpReasmTimeout();
        this.ipReasmTimeout = ipReasmTimeout;
        notifyChange(13, oldValue, ipReasmTimeout);
    }

    public int getIpReasmReqds() {
        return this.ipReasmReqds;
    }

    public void setIpReasmReqds(int ipReasmReqds) {
        int oldValue = getIpReasmReqds();
        this.ipReasmReqds = ipReasmReqds;
        notifyChange(14, oldValue, ipReasmReqds);
    }

    public int getIpReasmOKs() {
        return this.ipReasmOKs;
    }

    public void setIpReasmOKs(int ipReasmOKs) {
        int oldValue = getIpReasmOKs();
        this.ipReasmOKs = ipReasmOKs;
        notifyChange(15, oldValue, ipReasmOKs);
    }

    public int getIpReasmFails() {
        return this.ipReasmFails;
    }

    public void setIpReasmFails(int ipReasmFails) {
        int oldValue = getIpReasmFails();
        this.ipReasmFails = ipReasmFails;
        notifyChange(16, oldValue, ipReasmFails);
    }

    public int getIpFragOKs() {
        return this.ipFragOKs;
    }

    public void setIpFragOKs(int ipFragOKs) {
        int oldValue = getIpFragOKs();
        this.ipFragOKs = ipFragOKs;
        notifyChange(17, oldValue, ipFragOKs);
    }

    public int getIpFragFails() {
        return this.ipFragFails;
    }

    public void setIpFragFails(int ipFragFails) {
        int oldValue = getIpFragFails();
        this.ipFragFails = ipFragFails;
        notifyChange(18, oldValue, ipFragFails);
    }

    public int getIpFragCreates() {
        return this.ipFragCreates;
    }

    public void setIpFragCreates(int ipFragCreates) {
        int oldValue = getIpFragCreates();
        this.ipFragCreates = ipFragCreates;
        notifyChange(19, oldValue, ipFragCreates);
    }

    public int getIpRoutingDiscards() {
        return this.ipRoutingDiscards;
    }

    public void setIpRoutingDiscards(int ipRoutingDiscards) {
        int oldValue = getIpRoutingDiscards();
        this.ipRoutingDiscards = ipRoutingDiscards;
        notifyChange(23, oldValue, ipRoutingDiscards);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(7)) {
            case  1 :
                setIpForwarding(binding.getVariable().toInt());
                break;
            case  2 :
                setIpDefaultTTL(binding.getVariable().toInt());
                break;
            case  3 :
                setIpInReceives(binding.getVariable().toInt());
                break;
            case  4 :
                setIpInHdrErrors(binding.getVariable().toInt());
                break;
            case  5 :
                setIpInAddrErrors(binding.getVariable().toInt());
                break;
            case  6 :
                setIpForwDatagrams(binding.getVariable().toInt());
                break;
            case  7 :
                setIpInUnknownProtos(binding.getVariable().toInt());
                break;
            case  8 :
                setIpInDiscards(binding.getVariable().toInt());
                break;
            case  9 :
                setIpInDelivers(binding.getVariable().toInt());
                break;
            case  10 :
                setIpOutRequests(binding.getVariable().toInt());
                break;
            case  11 :
                setIpOutDiscards(binding.getVariable().toInt());
                break;
            case  12 :
                setIpOutNoRoutes(binding.getVariable().toInt());
                break;
            case  13 :
                setIpReasmTimeout(binding.getVariable().toInt());
                break;
            case  14 :
                setIpReasmReqds(binding.getVariable().toInt());
                break;
            case  15 :
                setIpReasmOKs(binding.getVariable().toInt());
                break;
            case  16 :
                setIpReasmFails(binding.getVariable().toInt());
                break;
            case  17 :
                setIpFragOKs(binding.getVariable().toInt());
                break;
            case  18 :
                setIpFragFails(binding.getVariable().toInt());
                break;
            case  19 :
                setIpFragCreates(binding.getVariable().toInt());
                break;
            case  23 :
                setIpRoutingDiscards(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipForwarding", ipForwarding).append("ipDefaultTTL", ipDefaultTTL).append("ipInReceives", ipInReceives).append("ipInHdrErrors", ipInHdrErrors).append("ipInAddrErrors", ipInAddrErrors).append("ipForwDatagrams", ipForwDatagrams).append("ipInUnknownProtos", ipInUnknownProtos).append("ipInDiscards", ipInDiscards).append("ipInDelivers", ipInDelivers).append("ipOutRequests", ipOutRequests).append("ipOutDiscards", ipOutDiscards).append("ipOutNoRoutes", ipOutNoRoutes).append("ipReasmTimeout", ipReasmTimeout).append("ipReasmReqds", ipReasmReqds).append("ipReasmOKs", ipReasmOKs).append("ipReasmFails", ipReasmFails).append("ipFragOKs", ipFragOKs).append("ipFragFails", ipFragFails).append("ipFragCreates", ipFragCreates).append("ipRoutingDiscards", ipRoutingDiscards).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipForwarding).append(ipDefaultTTL).append(ipInReceives).append(ipInHdrErrors).append(ipInAddrErrors).append(ipForwDatagrams).append(ipInUnknownProtos).append(ipInDiscards).append(ipInDelivers).append(ipOutRequests).append(ipOutDiscards).append(ipOutNoRoutes).append(ipReasmTimeout).append(ipReasmReqds).append(ipReasmOKs).append(ipReasmFails).append(ipFragOKs).append(ipFragFails).append(ipFragCreates).append(ipRoutingDiscards).toHashCode();
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
        Ip rhs = ((Ip) obj);
        return new EqualsBuilder().append(ipForwarding, rhs.ipForwarding).append(ipDefaultTTL, rhs.ipDefaultTTL).append(ipInReceives, rhs.ipInReceives).append(ipInHdrErrors, rhs.ipInHdrErrors).append(ipInAddrErrors, rhs.ipInAddrErrors).append(ipForwDatagrams, rhs.ipForwDatagrams).append(ipInUnknownProtos, rhs.ipInUnknownProtos).append(ipInDiscards, rhs.ipInDiscards).append(ipInDelivers, rhs.ipInDelivers).append(ipOutRequests, rhs.ipOutRequests).append(ipOutDiscards, rhs.ipOutDiscards).append(ipOutNoRoutes, rhs.ipOutNoRoutes).append(ipReasmTimeout, rhs.ipReasmTimeout).append(ipReasmReqds, rhs.ipReasmReqds).append(ipReasmOKs, rhs.ipReasmOKs).append(ipReasmFails, rhs.ipReasmFails).append(ipFragOKs, rhs.ipFragOKs).append(ipFragFails, rhs.ipFragFails).append(ipFragCreates, rhs.ipFragCreates).append(ipRoutingDiscards, rhs.ipRoutingDiscards).isEquals();
    }

    public Ip clone() {
        Ip _copy = new Ip();
        _copy.ipForwarding = ipForwarding;
        _copy.ipDefaultTTL = ipDefaultTTL;
        _copy.ipInReceives = ipInReceives;
        _copy.ipInHdrErrors = ipInHdrErrors;
        _copy.ipInAddrErrors = ipInAddrErrors;
        _copy.ipForwDatagrams = ipForwDatagrams;
        _copy.ipInUnknownProtos = ipInUnknownProtos;
        _copy.ipInDiscards = ipInDiscards;
        _copy.ipInDelivers = ipInDelivers;
        _copy.ipOutRequests = ipOutRequests;
        _copy.ipOutDiscards = ipOutDiscards;
        _copy.ipOutNoRoutes = ipOutNoRoutes;
        _copy.ipReasmTimeout = ipReasmTimeout;
        _copy.ipReasmReqds = ipReasmReqds;
        _copy.ipReasmOKs = ipReasmOKs;
        _copy.ipReasmFails = ipReasmFails;
        _copy.ipFragOKs = ipFragOKs;
        _copy.ipFragFails = ipFragFails;
        _copy.ipFragCreates = ipFragCreates;
        _copy.ipRoutingDiscards = ipRoutingDiscards;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipForwarding", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipDefaultTTL", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipInReceives", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipInHdrErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipInAddrErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipForwDatagrams", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipInUnknownProtos", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipInDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipInDelivers", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipOutRequests", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipOutDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ipOutNoRoutes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ipReasmTimeout", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ipReasmReqds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ipReasmOKs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "ipReasmFails", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "ipFragOKs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "ipFragFails", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "ipFragCreates", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "ipRoutingDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
