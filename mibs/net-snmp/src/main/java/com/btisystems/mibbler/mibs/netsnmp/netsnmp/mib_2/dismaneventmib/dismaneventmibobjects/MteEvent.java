
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.IMteEvent;
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

public class MteEvent
    extends DeviceEntity
    implements Serializable, IMteEvent, IVariableBindingSetter
{

    private int mteEventFailures;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteEvent() {
    }

    public int getMteEventFailures() {
        return this.mteEventFailures;
    }

    public void setMteEventFailures(int mteEventFailures) {
        int oldValue = getMteEventFailures();
        this.mteEventFailures = mteEventFailures;
        notifyChange(1, oldValue, mteEventFailures);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setMteEventFailures(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteEventFailures", mteEventFailures).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteEventFailures).toHashCode();
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
        MteEvent rhs = ((MteEvent) obj);
        return new EqualsBuilder().append(mteEventFailures, rhs.mteEventFailures).isEquals();
    }

    public MteEvent clone() {
        MteEvent _copy = new MteEvent();
        _copy.mteEventFailures = mteEventFailures;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteEventFailures", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
