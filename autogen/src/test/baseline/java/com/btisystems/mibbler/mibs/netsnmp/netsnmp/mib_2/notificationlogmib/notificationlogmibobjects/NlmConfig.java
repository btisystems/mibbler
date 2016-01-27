
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.INlmConfig;
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

public class NlmConfig
    extends DeviceEntity
    implements Serializable, INlmConfig, IVariableBindingSetter
{

    private Integer nlmConfigGlobalEntryLimit;
    private Integer nlmConfigGlobalAgeOut;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlmConfig() {
    }

    public int getNlmConfigGlobalEntryLimit() {
        if (this.nlmConfigGlobalEntryLimit == null) {
            return  0;
        }
        return this.nlmConfigGlobalEntryLimit;
    }

    public boolean isNlmConfigGlobalEntryLimitDefined() {
        return (this.nlmConfigGlobalEntryLimit!= null);
    }

    public void setNlmConfigGlobalEntryLimit(int nlmConfigGlobalEntryLimit) {
        int oldValue = getNlmConfigGlobalEntryLimit();
        this.nlmConfigGlobalEntryLimit = nlmConfigGlobalEntryLimit;
        notifyChange(1, oldValue, nlmConfigGlobalEntryLimit);
    }

    public int getNlmConfigGlobalAgeOut() {
        if (this.nlmConfigGlobalAgeOut == null) {
            return  1440;
        }
        return this.nlmConfigGlobalAgeOut;
    }

    public boolean isNlmConfigGlobalAgeOutDefined() {
        return (this.nlmConfigGlobalAgeOut!= null);
    }

    public void setNlmConfigGlobalAgeOut(int nlmConfigGlobalAgeOut) {
        int oldValue = getNlmConfigGlobalAgeOut();
        this.nlmConfigGlobalAgeOut = nlmConfigGlobalAgeOut;
        notifyChange(2, oldValue, nlmConfigGlobalAgeOut);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setNlmConfigGlobalEntryLimit(binding.getVariable().toInt());
                break;
            case  2 :
                setNlmConfigGlobalAgeOut(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlmConfigGlobalEntryLimit", nlmConfigGlobalEntryLimit).append("nlmConfigGlobalAgeOut", nlmConfigGlobalAgeOut).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlmConfigGlobalEntryLimit).append(nlmConfigGlobalAgeOut).toHashCode();
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
        NlmConfig rhs = ((NlmConfig) obj);
        return new EqualsBuilder().append(nlmConfigGlobalEntryLimit, rhs.nlmConfigGlobalEntryLimit).append(nlmConfigGlobalAgeOut, rhs.nlmConfigGlobalAgeOut).isEquals();
    }

    public NlmConfig clone() {
        NlmConfig _copy = new NlmConfig();
        _copy.nlmConfigGlobalEntryLimit = nlmConfigGlobalEntryLimit;
        _copy.nlmConfigGlobalAgeOut = nlmConfigGlobalAgeOut;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.92.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlmConfigGlobalEntryLimit", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "nlmConfigGlobalAgeOut", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
