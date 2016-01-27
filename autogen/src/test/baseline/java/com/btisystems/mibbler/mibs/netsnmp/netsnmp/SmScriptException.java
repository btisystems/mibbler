
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

public class SmScriptException
    extends DeviceEntity
    implements Serializable, INotification
{

    private String smRunError;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmScriptException() {
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
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smRunError", smRunError).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smRunError).toHashCode();
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
        SmScriptException rhs = ((SmScriptException) obj);
        return new EqualsBuilder().append(smRunError, rhs.smRunError).isEquals();
    }

    public SmScriptException clone() {
        SmScriptException _copy = new SmScriptException();
        _copy.smRunError = smRunError;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.2.0.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "smRunError", DeviceEntityDescription.FieldType.STRING, 765));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
