
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.IConditions;
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

public class Conditions
    extends DeviceEntity
    implements Serializable, IConditions, IVariableBindingSetter
{

    private int actCondSummary;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Conditions() {
    }

    public int getActCondSummary() {
        return this.actCondSummary;
    }

    public void setActCondSummary(int actCondSummary) {
        int oldValue = getActCondSummary();
        this.actCondSummary = actCondSummary;
        notifyChange(3, oldValue, actCondSummary);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  3 :
                setActCondSummary(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("actCondSummary", actCondSummary).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(actCondSummary).toHashCode();
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
        Conditions rhs = ((Conditions) obj);
        return new EqualsBuilder().append(actCondSummary, rhs.actCondSummary).isEquals();
    }

    public Conditions clone() {
        Conditions _copy = new Conditions();
        _copy.actCondSummary = actCondSummary;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.7"));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "actCondSummary", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
