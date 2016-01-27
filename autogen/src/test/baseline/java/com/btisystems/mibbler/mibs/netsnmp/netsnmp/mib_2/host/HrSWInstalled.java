
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.IHrSWInstalled;
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

public class HrSWInstalled
    extends DeviceEntity
    implements Serializable, IHrSWInstalled, IVariableBindingSetter
{

    private int hrSWInstalledLastChange;
    private int hrSWInstalledLastUpdateTime;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrSWInstalled() {
    }

    public int getHrSWInstalledLastChange() {
        return this.hrSWInstalledLastChange;
    }

    public void setHrSWInstalledLastChange(int hrSWInstalledLastChange) {
        int oldValue = getHrSWInstalledLastChange();
        this.hrSWInstalledLastChange = hrSWInstalledLastChange;
        notifyChange(1, oldValue, hrSWInstalledLastChange);
    }

    public int getHrSWInstalledLastUpdateTime() {
        return this.hrSWInstalledLastUpdateTime;
    }

    public void setHrSWInstalledLastUpdateTime(int hrSWInstalledLastUpdateTime) {
        int oldValue = getHrSWInstalledLastUpdateTime();
        this.hrSWInstalledLastUpdateTime = hrSWInstalledLastUpdateTime;
        notifyChange(2, oldValue, hrSWInstalledLastUpdateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  1 :
                setHrSWInstalledLastChange(binding.getVariable().toInt());
                break;
            case  2 :
                setHrSWInstalledLastUpdateTime(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrSWInstalledLastChange", hrSWInstalledLastChange).append("hrSWInstalledLastUpdateTime", hrSWInstalledLastUpdateTime).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrSWInstalledLastChange).append(hrSWInstalledLastUpdateTime).toHashCode();
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
        HrSWInstalled rhs = ((HrSWInstalled) obj);
        return new EqualsBuilder().append(hrSWInstalledLastChange, rhs.hrSWInstalledLastChange).append(hrSWInstalledLastUpdateTime, rhs.hrSWInstalledLastUpdateTime).isEquals();
    }

    public HrSWInstalled clone() {
        HrSWInstalled _copy = new HrSWInstalled();
        _copy.hrSWInstalledLastChange = hrSWInstalledLastChange;
        _copy.hrSWInstalledLastUpdateTime = hrSWInstalledLastUpdateTime;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.6"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrSWInstalledLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrSWInstalledLastUpdateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
