
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.schedmib;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.schedmib.ISchedObjects;
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

public class SchedObjects
    extends DeviceEntity
    implements Serializable, ISchedObjects, IVariableBindingSetter
{

    private String schedLocalTime;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SchedObjects() {
    }

    public String getSchedLocalTime() {
        return this.schedLocalTime;
    }

    public void setSchedLocalTime(String schedLocalTime) {
        String oldValue = getSchedLocalTime();
        this.schedLocalTime = schedLocalTime;
        notifyChange(1, oldValue, schedLocalTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  1 :
                setSchedLocalTime(binding.getVariable().toString());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("schedLocalTime", schedLocalTime).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(schedLocalTime).toHashCode();
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
        SchedObjects rhs = ((SchedObjects) obj);
        return new EqualsBuilder().append(schedLocalTime, rhs.schedLocalTime).isEquals();
    }

    public SchedObjects clone() {
        SchedObjects _copy = new SchedObjects();
        _copy.schedLocalTime = schedLocalTime;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.63.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "schedLocalTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
