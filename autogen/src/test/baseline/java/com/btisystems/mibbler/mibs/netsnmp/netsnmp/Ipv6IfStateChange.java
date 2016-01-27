
package com.btisystems.mibbler.mibs.netsnmp.netsnmp;

import java.io.Serializable;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.INotification;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class Ipv6IfStateChange
    extends DeviceEntity
    implements Serializable, INotification
{

    private String ipv6IfDescr;
    private int ipv6IfOperStatus;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6IfStateChange() {
    }

    public String getIpv6IfDescr() {
        return this.ipv6IfDescr;
    }

    public void setIpv6IfDescr(String ipv6IfDescr) {
        String oldValue = getIpv6IfDescr();
        this.ipv6IfDescr = ipv6IfDescr;
        notifyChange(2, oldValue, ipv6IfDescr);
    }

    public int getIpv6IfOperStatus() {
        return this.ipv6IfOperStatus;
    }

    public void setIpv6IfOperStatus(int ipv6IfOperStatus) {
        int oldValue = getIpv6IfOperStatus();
        this.ipv6IfOperStatus = ipv6IfOperStatus;
        notifyChange(10, oldValue, ipv6IfOperStatus);
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6IfDescr", ipv6IfDescr).append("ipv6IfOperStatus", ipv6IfOperStatus).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6IfDescr).append(ipv6IfOperStatus).toHashCode();
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
        Ipv6IfStateChange rhs = ((Ipv6IfStateChange) obj);
        return new EqualsBuilder().append(ipv6IfDescr, rhs.ipv6IfDescr).append(ipv6IfOperStatus, rhs.ipv6IfOperStatus).isEquals();
    }

    public Ipv6IfStateChange clone() {
        Ipv6IfStateChange _copy = new Ipv6IfStateChange();
        _copy.ipv6IfDescr = ipv6IfDescr;
        _copy.ipv6IfOperStatus = ipv6IfOperStatus;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.2.0.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6IfDescr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipv6IfOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
