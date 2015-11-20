
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.IIpv6MIBObjects;
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

public class Ipv6MIBObjects
    extends DeviceEntity
    implements Serializable, IIpv6MIBObjects, IVariableBindingSetter
{

    private int ipv6Forwarding;
    private Integer ipv6DefaultHopLimit;
    private int ipv6Interfaces;
    private int ipv6IfTableLastChange;
    private int ipv6RouteNumber;
    private int ipv6DiscardedRoutes;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6MIBObjects() {
    }

    public int getIpv6Forwarding() {
        return this.ipv6Forwarding;
    }

    public void setIpv6Forwarding(int ipv6Forwarding) {
        int oldValue = getIpv6Forwarding();
        this.ipv6Forwarding = ipv6Forwarding;
        notifyChange(1, oldValue, ipv6Forwarding);
    }

    public int getIpv6DefaultHopLimit() {
        if (this.ipv6DefaultHopLimit == null) {
            return  64;
        }
        return this.ipv6DefaultHopLimit;
    }

    public boolean isIpv6DefaultHopLimitDefined() {
        return (this.ipv6DefaultHopLimit!= null);
    }

    public void setIpv6DefaultHopLimit(int ipv6DefaultHopLimit) {
        int oldValue = getIpv6DefaultHopLimit();
        this.ipv6DefaultHopLimit = ipv6DefaultHopLimit;
        notifyChange(2, oldValue, ipv6DefaultHopLimit);
    }

    public int getIpv6Interfaces() {
        return this.ipv6Interfaces;
    }

    public void setIpv6Interfaces(int ipv6Interfaces) {
        int oldValue = getIpv6Interfaces();
        this.ipv6Interfaces = ipv6Interfaces;
        notifyChange(3, oldValue, ipv6Interfaces);
    }

    public int getIpv6IfTableLastChange() {
        return this.ipv6IfTableLastChange;
    }

    public void setIpv6IfTableLastChange(int ipv6IfTableLastChange) {
        int oldValue = getIpv6IfTableLastChange();
        this.ipv6IfTableLastChange = ipv6IfTableLastChange;
        notifyChange(4, oldValue, ipv6IfTableLastChange);
    }

    public int getIpv6RouteNumber() {
        return this.ipv6RouteNumber;
    }

    public void setIpv6RouteNumber(int ipv6RouteNumber) {
        int oldValue = getIpv6RouteNumber();
        this.ipv6RouteNumber = ipv6RouteNumber;
        notifyChange(9, oldValue, ipv6RouteNumber);
    }

    public int getIpv6DiscardedRoutes() {
        return this.ipv6DiscardedRoutes;
    }

    public void setIpv6DiscardedRoutes(int ipv6DiscardedRoutes) {
        int oldValue = getIpv6DiscardedRoutes();
        this.ipv6DiscardedRoutes = ipv6DiscardedRoutes;
        notifyChange(10, oldValue, ipv6DiscardedRoutes);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  1 :
                setIpv6Forwarding(binding.getVariable().toInt());
                break;
            case  2 :
                setIpv6DefaultHopLimit(binding.getVariable().toInt());
                break;
            case  3 :
                setIpv6Interfaces(binding.getVariable().toInt());
                break;
            case  4 :
                setIpv6IfTableLastChange(binding.getVariable().toInt());
                break;
            case  9 :
                setIpv6RouteNumber(binding.getVariable().toInt());
                break;
            case  10 :
                setIpv6DiscardedRoutes(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6Forwarding", ipv6Forwarding).append("ipv6DefaultHopLimit", ipv6DefaultHopLimit).append("ipv6Interfaces", ipv6Interfaces).append("ipv6IfTableLastChange", ipv6IfTableLastChange).append("ipv6RouteNumber", ipv6RouteNumber).append("ipv6DiscardedRoutes", ipv6DiscardedRoutes).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6Forwarding).append(ipv6DefaultHopLimit).append(ipv6Interfaces).append(ipv6IfTableLastChange).append(ipv6RouteNumber).append(ipv6DiscardedRoutes).toHashCode();
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
        Ipv6MIBObjects rhs = ((Ipv6MIBObjects) obj);
        return new EqualsBuilder().append(ipv6Forwarding, rhs.ipv6Forwarding).append(ipv6DefaultHopLimit, rhs.ipv6DefaultHopLimit).append(ipv6Interfaces, rhs.ipv6Interfaces).append(ipv6IfTableLastChange, rhs.ipv6IfTableLastChange).append(ipv6RouteNumber, rhs.ipv6RouteNumber).append(ipv6DiscardedRoutes, rhs.ipv6DiscardedRoutes).isEquals();
    }

    public Ipv6MIBObjects clone() {
        Ipv6MIBObjects _copy = new Ipv6MIBObjects();
        _copy.ipv6Forwarding = ipv6Forwarding;
        _copy.ipv6DefaultHopLimit = ipv6DefaultHopLimit;
        _copy.ipv6Interfaces = ipv6Interfaces;
        _copy.ipv6IfTableLastChange = ipv6IfTableLastChange;
        _copy.ipv6RouteNumber = ipv6RouteNumber;
        _copy.ipv6DiscardedRoutes = ipv6DiscardedRoutes;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6Forwarding", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6DefaultHopLimit", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6Interfaces", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipv6IfTableLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipv6RouteNumber", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipv6DiscardedRoutes", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
