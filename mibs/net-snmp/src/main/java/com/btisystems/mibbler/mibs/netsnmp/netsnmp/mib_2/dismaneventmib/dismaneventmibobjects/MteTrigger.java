
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.IMteTrigger;
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

public class MteTrigger
    extends DeviceEntity
    implements Serializable, IMteTrigger, IVariableBindingSetter
{

    private int mteTriggerFailures;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteTrigger() {
    }

    public int getMteTriggerFailures() {
        return this.mteTriggerFailures;
    }

    public void setMteTriggerFailures(int mteTriggerFailures) {
        int oldValue = getMteTriggerFailures();
        this.mteTriggerFailures = mteTriggerFailures;
        notifyChange(1, oldValue, mteTriggerFailures);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setMteTriggerFailures(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteTriggerFailures", mteTriggerFailures).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteTriggerFailures).toHashCode();
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
        MteTrigger rhs = ((MteTrigger) obj);
        return new EqualsBuilder().append(mteTriggerFailures, rhs.mteTriggerFailures).isEquals();
    }

    public MteTrigger clone() {
        MteTrigger _copy = new MteTrigger();
        _copy.mteTriggerFailures = mteTriggerFailures;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteTriggerFailures", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
