
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.IHrStorage;
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

public class HrStorage
    extends DeviceEntity
    implements Serializable, IHrStorage, IVariableBindingSetter
{

    private int hrMemorySize;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrStorage() {
    }

    public int getHrMemorySize() {
        return this.hrMemorySize;
    }

    public void setHrMemorySize(int hrMemorySize) {
        int oldValue = getHrMemorySize();
        this.hrMemorySize = hrMemorySize;
        notifyChange(2, oldValue, hrMemorySize);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  2 :
                setHrMemorySize(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrMemorySize", hrMemorySize).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrMemorySize).toHashCode();
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
        HrStorage rhs = ((HrStorage) obj);
        return new EqualsBuilder().append(hrMemorySize, rhs.hrMemorySize).isEquals();
    }

    public HrStorage clone() {
        HrStorage _copy = new HrStorage();
        _copy.hrMemorySize = hrMemorySize;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrMemorySize", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
