
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.IInterfaces;
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

public class Interfaces
    extends DeviceEntity
    implements Serializable, IInterfaces, IVariableBindingSetter
{

    private int ifNumber;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Interfaces() {
    }

    public int getIfNumber() {
        return this.ifNumber;
    }

    public void setIfNumber(int ifNumber) {
        int oldValue = getIfNumber();
        this.ifNumber = ifNumber;
        notifyChange(1, oldValue, ifNumber);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(7)) {
            case  1 :
                setIfNumber(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifNumber", ifNumber).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifNumber).toHashCode();
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
        Interfaces rhs = ((Interfaces) obj);
        return new EqualsBuilder().append(ifNumber, rhs.ifNumber).isEquals();
    }

    public Interfaces clone() {
        Interfaces _copy = new Interfaces();
        _copy.ifNumber = ifNumber;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifNumber", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
