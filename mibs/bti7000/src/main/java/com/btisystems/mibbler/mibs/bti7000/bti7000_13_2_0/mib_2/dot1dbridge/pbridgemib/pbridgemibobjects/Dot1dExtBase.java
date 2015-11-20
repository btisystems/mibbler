
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.IDot1dExtBase;
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

public class Dot1dExtBase
    extends DeviceEntity
    implements Serializable, IDot1dExtBase, IVariableBindingSetter
{

    private String dot1dDeviceCapabilities;
    private Integer dot1dTrafficClassesEnabled;
    private Integer dot1dGmrpStatus;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dExtBase() {
    }

    public String getDot1dDeviceCapabilities() {
        return this.dot1dDeviceCapabilities;
    }

    public void setDot1dDeviceCapabilities(String dot1dDeviceCapabilities) {
        String oldValue = getDot1dDeviceCapabilities();
        this.dot1dDeviceCapabilities = dot1dDeviceCapabilities;
        notifyChange(1, oldValue, dot1dDeviceCapabilities);
    }

    public int getDot1dTrafficClassesEnabled() {
        if (this.dot1dTrafficClassesEnabled == null) {
            return  1;
        }
        return this.dot1dTrafficClassesEnabled;
    }

    public boolean isDot1dTrafficClassesEnabledDefined() {
        return (this.dot1dTrafficClassesEnabled!= null);
    }

    public void setDot1dTrafficClassesEnabled(int dot1dTrafficClassesEnabled) {
        int oldValue = getDot1dTrafficClassesEnabled();
        this.dot1dTrafficClassesEnabled = dot1dTrafficClassesEnabled;
        notifyChange(2, oldValue, dot1dTrafficClassesEnabled);
    }

    public int getDot1dGmrpStatus() {
        if (this.dot1dGmrpStatus == null) {
            return  1;
        }
        return this.dot1dGmrpStatus;
    }

    public boolean isDot1dGmrpStatusDefined() {
        return (this.dot1dGmrpStatus!= null);
    }

    public void setDot1dGmrpStatus(int dot1dGmrpStatus) {
        int oldValue = getDot1dGmrpStatus();
        this.dot1dGmrpStatus = dot1dGmrpStatus;
        notifyChange(3, oldValue, dot1dGmrpStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot1dDeviceCapabilities(binding.getVariable().toString());
                break;
            case  2 :
                setDot1dTrafficClassesEnabled(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1dGmrpStatus(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dDeviceCapabilities", dot1dDeviceCapabilities).append("dot1dTrafficClassesEnabled", dot1dTrafficClassesEnabled).append("dot1dGmrpStatus", dot1dGmrpStatus).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dDeviceCapabilities).append(dot1dTrafficClassesEnabled).append(dot1dGmrpStatus).toHashCode();
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
        Dot1dExtBase rhs = ((Dot1dExtBase) obj);
        return new EqualsBuilder().append(dot1dDeviceCapabilities, rhs.dot1dDeviceCapabilities).append(dot1dTrafficClassesEnabled, rhs.dot1dTrafficClassesEnabled).append(dot1dGmrpStatus, rhs.dot1dGmrpStatus).isEquals();
    }

    public Dot1dExtBase clone() {
        Dot1dExtBase _copy = new Dot1dExtBase();
        _copy.dot1dDeviceCapabilities = dot1dDeviceCapabilities;
        _copy.dot1dTrafficClassesEnabled = dot1dTrafficClassesEnabled;
        _copy.dot1dGmrpStatus = dot1dGmrpStatus;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dDeviceCapabilities", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dTrafficClassesEnabled", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1dGmrpStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
