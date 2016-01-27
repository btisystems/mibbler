
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

public class NetSnmpExampleHeartbeatNotification
    extends DeviceEntity
    implements Serializable, INotification
{

    private int netSnmpExampleHeartbeatRate;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NetSnmpExampleHeartbeatNotification() {
    }

    public int getNetSnmpExampleHeartbeatRate() {
        return this.netSnmpExampleHeartbeatRate;
    }

    public void setNetSnmpExampleHeartbeatRate(int netSnmpExampleHeartbeatRate) {
        int oldValue = getNetSnmpExampleHeartbeatRate();
        this.netSnmpExampleHeartbeatRate = netSnmpExampleHeartbeatRate;
        notifyChange(1, oldValue, netSnmpExampleHeartbeatRate);
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("netSnmpExampleHeartbeatRate", netSnmpExampleHeartbeatRate).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(netSnmpExampleHeartbeatRate).toHashCode();
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
        NetSnmpExampleHeartbeatNotification rhs = ((NetSnmpExampleHeartbeatNotification) obj);
        return new EqualsBuilder().append(netSnmpExampleHeartbeatRate, rhs.netSnmpExampleHeartbeatRate).isEquals();
    }

    public NetSnmpExampleHeartbeatNotification clone() {
        NetSnmpExampleHeartbeatNotification _copy = new NetSnmpExampleHeartbeatNotification();
        _copy.netSnmpExampleHeartbeatRate = netSnmpExampleHeartbeatRate;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.8072.2.3.0.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "netSnmpExampleHeartbeatRate", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
