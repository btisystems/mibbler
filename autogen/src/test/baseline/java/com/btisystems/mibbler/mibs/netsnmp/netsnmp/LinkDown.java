
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

public class LinkDown
    extends DeviceEntity
    implements Serializable, INotification
{

    private int ifIndex;
    private int ifAdminStatus;
    private int ifOperStatus;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public LinkDown() {
    }

    public int getIfIndex() {
        return this.ifIndex;
    }

    public void setIfIndex(int ifIndex) {
        int oldValue = getIfIndex();
        this.ifIndex = ifIndex;
        notifyChange(1, oldValue, ifIndex);
    }

    public int getIfAdminStatus() {
        return this.ifAdminStatus;
    }

    public void setIfAdminStatus(int ifAdminStatus) {
        int oldValue = getIfAdminStatus();
        this.ifAdminStatus = ifAdminStatus;
        notifyChange(7, oldValue, ifAdminStatus);
    }

    public int getIfOperStatus() {
        return this.ifOperStatus;
    }

    public void setIfOperStatus(int ifOperStatus) {
        int oldValue = getIfOperStatus();
        this.ifOperStatus = ifOperStatus;
        notifyChange(8, oldValue, ifOperStatus);
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifIndex", ifIndex).append("ifAdminStatus", ifAdminStatus).append("ifOperStatus", ifOperStatus).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifIndex).append(ifAdminStatus).append(ifOperStatus).toHashCode();
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
        LinkDown rhs = ((LinkDown) obj);
        return new EqualsBuilder().append(ifIndex, rhs.ifIndex).append(ifAdminStatus, rhs.ifAdminStatus).append(ifOperStatus, rhs.ifOperStatus).isEquals();
    }

    public LinkDown clone() {
        LinkDown _copy = new LinkDown();
        _copy.ifIndex = ifIndex;
        _copy.ifAdminStatus = ifAdminStatus;
        _copy.ifOperStatus = ifOperStatus;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.6.3.1.1.5.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ifAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ifOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
