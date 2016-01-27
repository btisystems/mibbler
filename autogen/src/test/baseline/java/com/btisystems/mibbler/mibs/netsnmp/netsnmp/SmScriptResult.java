
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

public class SmScriptResult
    extends DeviceEntity
    implements Serializable, INotification
{

    private String smRunResult;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmScriptResult() {
    }

    public String getSmRunResult() {
        return this.smRunResult;
    }

    public void setSmRunResult(String smRunResult) {
        String oldValue = getSmRunResult();
        this.smRunResult = smRunResult;
        notifyChange(8, oldValue, smRunResult);
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smRunResult", smRunResult).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smRunResult).toHashCode();
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
        SmScriptResult rhs = ((SmScriptResult) obj);
        return new EqualsBuilder().append(smRunResult, rhs.smRunResult).isEquals();
    }

    public SmScriptResult clone() {
        SmScriptResult _copy = new SmScriptResult();
        _copy.smRunResult = smRunResult;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.2.0.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "smRunResult", DeviceEntityDescription.FieldType.STRING, 65535));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
