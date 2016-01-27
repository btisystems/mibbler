
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.IIpForward;
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

public class IpForward
    extends DeviceEntity
    implements Serializable, IIpForward, IVariableBindingSetter
{

    private int ipForwardNumber;
    private int ipCidrRouteNumber;
    private int inetCidrRouteNumber;
    private int inetCidrRouteDiscards;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpForward() {
    }

    public int getIpForwardNumber() {
        return this.ipForwardNumber;
    }

    public void setIpForwardNumber(int ipForwardNumber) {
        int oldValue = getIpForwardNumber();
        this.ipForwardNumber = ipForwardNumber;
        notifyChange(1, oldValue, ipForwardNumber);
    }

    public int getIpCidrRouteNumber() {
        return this.ipCidrRouteNumber;
    }

    public void setIpCidrRouteNumber(int ipCidrRouteNumber) {
        int oldValue = getIpCidrRouteNumber();
        this.ipCidrRouteNumber = ipCidrRouteNumber;
        notifyChange(3, oldValue, ipCidrRouteNumber);
    }

    public int getInetCidrRouteNumber() {
        return this.inetCidrRouteNumber;
    }

    public void setInetCidrRouteNumber(int inetCidrRouteNumber) {
        int oldValue = getInetCidrRouteNumber();
        this.inetCidrRouteNumber = inetCidrRouteNumber;
        notifyChange(6, oldValue, inetCidrRouteNumber);
    }

    public int getInetCidrRouteDiscards() {
        return this.inetCidrRouteDiscards;
    }

    public void setInetCidrRouteDiscards(int inetCidrRouteDiscards) {
        int oldValue = getInetCidrRouteDiscards();
        this.inetCidrRouteDiscards = inetCidrRouteDiscards;
        notifyChange(8, oldValue, inetCidrRouteDiscards);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  1 :
                setIpForwardNumber(binding.getVariable().toInt());
                break;
            case  3 :
                setIpCidrRouteNumber(binding.getVariable().toInt());
                break;
            case  6 :
                setInetCidrRouteNumber(binding.getVariable().toInt());
                break;
            case  8 :
                setInetCidrRouteDiscards(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipForwardNumber", ipForwardNumber).append("ipCidrRouteNumber", ipCidrRouteNumber).append("inetCidrRouteNumber", inetCidrRouteNumber).append("inetCidrRouteDiscards", inetCidrRouteDiscards).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipForwardNumber).append(ipCidrRouteNumber).append(inetCidrRouteNumber).append(inetCidrRouteDiscards).toHashCode();
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
        IpForward rhs = ((IpForward) obj);
        return new EqualsBuilder().append(ipForwardNumber, rhs.ipForwardNumber).append(ipCidrRouteNumber, rhs.ipCidrRouteNumber).append(inetCidrRouteNumber, rhs.inetCidrRouteNumber).append(inetCidrRouteDiscards, rhs.inetCidrRouteDiscards).isEquals();
    }

    public IpForward clone() {
        IpForward _copy = new IpForward();
        _copy.ipForwardNumber = ipForwardNumber;
        _copy.ipCidrRouteNumber = ipCidrRouteNumber;
        _copy.inetCidrRouteNumber = inetCidrRouteNumber;
        _copy.inetCidrRouteDiscards = inetCidrRouteDiscards;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.24"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipForwardNumber", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipCidrRouteNumber", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "inetCidrRouteNumber", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "inetCidrRouteDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
