
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

public class SchedActionFailure
    extends DeviceEntity
    implements Serializable, INotification
{

    private int schedLastFailure;
    private String schedLastFailed;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SchedActionFailure() {
    }

    public int getSchedLastFailure() {
        if (this.schedLastFailure == null) {
            return  0;
        }
        return this.schedLastFailure;
    }

    public boolean isSchedLastFailureDefined() {
        return (this.schedLastFailure!= null);
    }

    public void setSchedLastFailure(int schedLastFailure) {
        int oldValue = getSchedLastFailure();
        this.schedLastFailure = schedLastFailure;
        notifyChange(17, oldValue, schedLastFailure);
    }

    public String getSchedLastFailed() {
        return this.schedLastFailed;
    }

    public void setSchedLastFailed(String schedLastFailed) {
        String oldValue = getSchedLastFailed();
        this.schedLastFailed = schedLastFailed;
        notifyChange(18, oldValue, schedLastFailed);
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("schedLastFailure", schedLastFailure).append("schedLastFailed", schedLastFailed).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(schedLastFailure).append(schedLastFailed).toHashCode();
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
        SchedActionFailure rhs = ((SchedActionFailure) obj);
        return new EqualsBuilder().append(schedLastFailure, rhs.schedLastFailure).append(schedLastFailed, rhs.schedLastFailed).isEquals();
    }

    public SchedActionFailure clone() {
        SchedActionFailure _copy = new SchedActionFailure();
        _copy.schedLastFailure = schedLastFailure;
        _copy.schedLastFailed = schedLastFailed;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.63.2.0.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "schedLastFailure", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "schedLastFailed", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
