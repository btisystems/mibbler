
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.IIfMIBObjects;
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

public class IfMIBObjects
    extends DeviceEntity
    implements Serializable, IIfMIBObjects, IVariableBindingSetter
{

    private int ifTableLastChange;
    private int ifStackLastChange;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfMIBObjects() {
    }

    public int getIfTableLastChange() {
        return this.ifTableLastChange;
    }

    public void setIfTableLastChange(int ifTableLastChange) {
        int oldValue = getIfTableLastChange();
        this.ifTableLastChange = ifTableLastChange;
        notifyChange(5, oldValue, ifTableLastChange);
    }

    public int getIfStackLastChange() {
        return this.ifStackLastChange;
    }

    public void setIfStackLastChange(int ifStackLastChange) {
        int oldValue = getIfStackLastChange();
        this.ifStackLastChange = ifStackLastChange;
        notifyChange(6, oldValue, ifStackLastChange);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  5 :
                setIfTableLastChange(binding.getVariable().toInt());
                break;
            case  6 :
                setIfStackLastChange(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifTableLastChange", ifTableLastChange).append("ifStackLastChange", ifStackLastChange).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifTableLastChange).append(ifStackLastChange).toHashCode();
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
        IfMIBObjects rhs = ((IfMIBObjects) obj);
        return new EqualsBuilder().append(ifTableLastChange, rhs.ifTableLastChange).append(ifStackLastChange, rhs.ifStackLastChange).isEquals();
    }

    public IfMIBObjects clone() {
        IfMIBObjects _copy = new IfMIBObjects();
        _copy.ifTableLastChange = ifTableLastChange;
        _copy.ifStackLastChange = ifStackLastChange;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.31.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ifTableLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ifStackLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
