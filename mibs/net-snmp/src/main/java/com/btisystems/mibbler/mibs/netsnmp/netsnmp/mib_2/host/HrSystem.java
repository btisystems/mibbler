
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.IHrSystem;
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

public class HrSystem
    extends DeviceEntity
    implements Serializable, IHrSystem, IVariableBindingSetter
{

    private int hrSystemUptime;
    private String hrSystemDate;
    private int hrSystemInitialLoadDevice;
    private String hrSystemInitialLoadParameters;
    private int hrSystemNumUsers;
    private int hrSystemProcesses;
    private int hrSystemMaxProcesses;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrSystem() {
    }

    public int getHrSystemUptime() {
        return this.hrSystemUptime;
    }

    public void setHrSystemUptime(int hrSystemUptime) {
        int oldValue = getHrSystemUptime();
        this.hrSystemUptime = hrSystemUptime;
        notifyChange(1, oldValue, hrSystemUptime);
    }

    public String getHrSystemDate() {
        return this.hrSystemDate;
    }

    public void setHrSystemDate(String hrSystemDate) {
        String oldValue = getHrSystemDate();
        this.hrSystemDate = hrSystemDate;
        notifyChange(2, oldValue, hrSystemDate);
    }

    public int getHrSystemInitialLoadDevice() {
        return this.hrSystemInitialLoadDevice;
    }

    public void setHrSystemInitialLoadDevice(int hrSystemInitialLoadDevice) {
        int oldValue = getHrSystemInitialLoadDevice();
        this.hrSystemInitialLoadDevice = hrSystemInitialLoadDevice;
        notifyChange(3, oldValue, hrSystemInitialLoadDevice);
    }

    public String getHrSystemInitialLoadParameters() {
        return this.hrSystemInitialLoadParameters;
    }

    public void setHrSystemInitialLoadParameters(String hrSystemInitialLoadParameters) {
        String oldValue = getHrSystemInitialLoadParameters();
        this.hrSystemInitialLoadParameters = hrSystemInitialLoadParameters;
        notifyChange(4, oldValue, hrSystemInitialLoadParameters);
    }

    public int getHrSystemNumUsers() {
        return this.hrSystemNumUsers;
    }

    public void setHrSystemNumUsers(int hrSystemNumUsers) {
        int oldValue = getHrSystemNumUsers();
        this.hrSystemNumUsers = hrSystemNumUsers;
        notifyChange(5, oldValue, hrSystemNumUsers);
    }

    public int getHrSystemProcesses() {
        return this.hrSystemProcesses;
    }

    public void setHrSystemProcesses(int hrSystemProcesses) {
        int oldValue = getHrSystemProcesses();
        this.hrSystemProcesses = hrSystemProcesses;
        notifyChange(6, oldValue, hrSystemProcesses);
    }

    public int getHrSystemMaxProcesses() {
        return this.hrSystemMaxProcesses;
    }

    public void setHrSystemMaxProcesses(int hrSystemMaxProcesses) {
        int oldValue = getHrSystemMaxProcesses();
        this.hrSystemMaxProcesses = hrSystemMaxProcesses;
        notifyChange(7, oldValue, hrSystemMaxProcesses);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  1 :
                setHrSystemUptime(binding.getVariable().toInt());
                break;
            case  2 :
                setHrSystemDate(binding.getVariable().toString());
                break;
            case  3 :
                setHrSystemInitialLoadDevice(binding.getVariable().toInt());
                break;
            case  4 :
                setHrSystemInitialLoadParameters(binding.getVariable().toString());
                break;
            case  5 :
                setHrSystemNumUsers(binding.getVariable().toInt());
                break;
            case  6 :
                setHrSystemProcesses(binding.getVariable().toInt());
                break;
            case  7 :
                setHrSystemMaxProcesses(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrSystemUptime", hrSystemUptime).append("hrSystemDate", hrSystemDate).append("hrSystemInitialLoadDevice", hrSystemInitialLoadDevice).append("hrSystemInitialLoadParameters", hrSystemInitialLoadParameters).append("hrSystemNumUsers", hrSystemNumUsers).append("hrSystemProcesses", hrSystemProcesses).append("hrSystemMaxProcesses", hrSystemMaxProcesses).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrSystemUptime).append(hrSystemDate).append(hrSystemInitialLoadDevice).append(hrSystemInitialLoadParameters).append(hrSystemNumUsers).append(hrSystemProcesses).append(hrSystemMaxProcesses).toHashCode();
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
        HrSystem rhs = ((HrSystem) obj);
        return new EqualsBuilder().append(hrSystemUptime, rhs.hrSystemUptime).append(hrSystemDate, rhs.hrSystemDate).append(hrSystemInitialLoadDevice, rhs.hrSystemInitialLoadDevice).append(hrSystemInitialLoadParameters, rhs.hrSystemInitialLoadParameters).append(hrSystemNumUsers, rhs.hrSystemNumUsers).append(hrSystemProcesses, rhs.hrSystemProcesses).append(hrSystemMaxProcesses, rhs.hrSystemMaxProcesses).isEquals();
    }

    public HrSystem clone() {
        HrSystem _copy = new HrSystem();
        _copy.hrSystemUptime = hrSystemUptime;
        _copy.hrSystemDate = hrSystemDate;
        _copy.hrSystemInitialLoadDevice = hrSystemInitialLoadDevice;
        _copy.hrSystemInitialLoadParameters = hrSystemInitialLoadParameters;
        _copy.hrSystemNumUsers = hrSystemNumUsers;
        _copy.hrSystemProcesses = hrSystemProcesses;
        _copy.hrSystemMaxProcesses = hrSystemMaxProcesses;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrSystemUptime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrSystemDate", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hrSystemInitialLoadDevice", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hrSystemInitialLoadParameters", DeviceEntityDescription.FieldType.STRING, 128));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hrSystemNumUsers", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "hrSystemProcesses", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "hrSystemMaxProcesses", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
