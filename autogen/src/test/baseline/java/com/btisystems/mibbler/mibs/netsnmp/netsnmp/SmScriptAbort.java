
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

public class SmScriptAbort
    extends DeviceEntity
    implements Serializable, INotification
{

    private int smRunExitCode;
    private String smRunEndTime;
    private String smRunError;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmScriptAbort() {
    }

    public int getSmRunExitCode() {
        if (this.smRunExitCode == null) {
            return  1;
        }
        return this.smRunExitCode;
    }

    public boolean isSmRunExitCodeDefined() {
        return (this.smRunExitCode!= null);
    }

    public void setSmRunExitCode(int smRunExitCode) {
        int oldValue = getSmRunExitCode();
        this.smRunExitCode = smRunExitCode;
        notifyChange(7, oldValue, smRunExitCode);
    }

    public String getSmRunEndTime() {
        return this.smRunEndTime;
    }

    public void setSmRunEndTime(String smRunEndTime) {
        String oldValue = getSmRunEndTime();
        this.smRunEndTime = smRunEndTime;
        notifyChange(4, oldValue, smRunEndTime);
    }

    public String getSmRunError() {
        return this.smRunError;
    }

    public void setSmRunError(String smRunError) {
        String oldValue = getSmRunError();
        this.smRunError = smRunError;
        notifyChange(11, oldValue, smRunError);
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smRunExitCode", smRunExitCode).append("smRunEndTime", smRunEndTime).append("smRunError", smRunError).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smRunExitCode).append(smRunEndTime).append(smRunError).toHashCode();
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
        SmScriptAbort rhs = ((SmScriptAbort) obj);
        return new EqualsBuilder().append(smRunExitCode, rhs.smRunExitCode).append(smRunEndTime, rhs.smRunEndTime).append(smRunError, rhs.smRunError).isEquals();
    }

    public SmScriptAbort clone() {
        SmScriptAbort _copy = new SmScriptAbort();
        _copy.smRunExitCode = smRunExitCode;
        _copy.smRunEndTime = smRunEndTime;
        _copy.smRunError = smRunError;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.2.0.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "smRunExitCode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "smRunEndTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "smRunError", DeviceEntityDescription.FieldType.STRING, 765));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
