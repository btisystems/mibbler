
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smrunobjects.smlaunchtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smrunobjects.smlaunchtable.ISmLaunchEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smrunobjects.SmLaunchTable;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IIndexed;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class SmLaunchEntry
    extends DeviceEntity
    implements Serializable, ISmLaunchEntry, IIndexed, IVariableBindingSetter
{

    private String smLaunchOwner;
    private String smLaunchName;
    private String smLaunchScriptOwner;
    private String smLaunchScriptName;
    private String smLaunchArgument;
    private Integer smLaunchMaxRunning;
    private Integer smLaunchMaxCompleted;
    private Integer smLaunchLifeTime;
    private Integer smLaunchExpireTime;
    private Integer smLaunchStart;
    private Integer smLaunchControl;
    private Integer smLaunchAdminStatus;
    private Integer smLaunchOperStatus;
    private int smLaunchRunIndexNext;
    private Integer smLaunchStorageType;
    private int smLaunchRowStatus;
    private String smLaunchError;
    private String smLaunchLastChange;
    private Integer smLaunchRowExpireTime;
    private String _index;
    private SmLaunchTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmLaunchEntry() {
    }

    public String getSmLaunchOwner() {
        return this.smLaunchOwner;
    }

    public void setSmLaunchOwner(String smLaunchOwner) {
        String oldValue = getSmLaunchOwner();
        this.smLaunchOwner = smLaunchOwner;
        notifyChange(1, oldValue, smLaunchOwner);
    }

    public String getSmLaunchName() {
        return this.smLaunchName;
    }

    public void setSmLaunchName(String smLaunchName) {
        String oldValue = getSmLaunchName();
        this.smLaunchName = smLaunchName;
        notifyChange(2, oldValue, smLaunchName);
    }

    public String getSmLaunchScriptOwner() {
        return this.smLaunchScriptOwner;
    }

    public void setSmLaunchScriptOwner(String smLaunchScriptOwner) {
        String oldValue = getSmLaunchScriptOwner();
        this.smLaunchScriptOwner = smLaunchScriptOwner;
        notifyChange(3, oldValue, smLaunchScriptOwner);
    }

    public String getSmLaunchScriptName() {
        return this.smLaunchScriptName;
    }

    public void setSmLaunchScriptName(String smLaunchScriptName) {
        String oldValue = getSmLaunchScriptName();
        this.smLaunchScriptName = smLaunchScriptName;
        notifyChange(4, oldValue, smLaunchScriptName);
    }

    public String getSmLaunchArgument() {
        return this.smLaunchArgument;
    }

    public void setSmLaunchArgument(String smLaunchArgument) {
        String oldValue = getSmLaunchArgument();
        this.smLaunchArgument = smLaunchArgument;
        notifyChange(5, oldValue, smLaunchArgument);
    }

    public int getSmLaunchMaxRunning() {
        if (this.smLaunchMaxRunning == null) {
            return  1;
        }
        return this.smLaunchMaxRunning;
    }

    public boolean isSmLaunchMaxRunningDefined() {
        return (this.smLaunchMaxRunning!= null);
    }

    public void setSmLaunchMaxRunning(int smLaunchMaxRunning) {
        int oldValue = getSmLaunchMaxRunning();
        this.smLaunchMaxRunning = smLaunchMaxRunning;
        notifyChange(6, oldValue, smLaunchMaxRunning);
    }

    public int getSmLaunchMaxCompleted() {
        if (this.smLaunchMaxCompleted == null) {
            return  1;
        }
        return this.smLaunchMaxCompleted;
    }

    public boolean isSmLaunchMaxCompletedDefined() {
        return (this.smLaunchMaxCompleted!= null);
    }

    public void setSmLaunchMaxCompleted(int smLaunchMaxCompleted) {
        int oldValue = getSmLaunchMaxCompleted();
        this.smLaunchMaxCompleted = smLaunchMaxCompleted;
        notifyChange(7, oldValue, smLaunchMaxCompleted);
    }

    public int getSmLaunchLifeTime() {
        if (this.smLaunchLifeTime == null) {
            return  360000;
        }
        return this.smLaunchLifeTime;
    }

    public boolean isSmLaunchLifeTimeDefined() {
        return (this.smLaunchLifeTime!= null);
    }

    public void setSmLaunchLifeTime(int smLaunchLifeTime) {
        int oldValue = getSmLaunchLifeTime();
        this.smLaunchLifeTime = smLaunchLifeTime;
        notifyChange(8, oldValue, smLaunchLifeTime);
    }

    public int getSmLaunchExpireTime() {
        if (this.smLaunchExpireTime == null) {
            return  360000;
        }
        return this.smLaunchExpireTime;
    }

    public boolean isSmLaunchExpireTimeDefined() {
        return (this.smLaunchExpireTime!= null);
    }

    public void setSmLaunchExpireTime(int smLaunchExpireTime) {
        int oldValue = getSmLaunchExpireTime();
        this.smLaunchExpireTime = smLaunchExpireTime;
        notifyChange(9, oldValue, smLaunchExpireTime);
    }

    public int getSmLaunchStart() {
        if (this.smLaunchStart == null) {
            return  0;
        }
        return this.smLaunchStart;
    }

    public boolean isSmLaunchStartDefined() {
        return (this.smLaunchStart!= null);
    }

    public void setSmLaunchStart(int smLaunchStart) {
        int oldValue = getSmLaunchStart();
        this.smLaunchStart = smLaunchStart;
        notifyChange(10, oldValue, smLaunchStart);
    }

    public int getSmLaunchControl() {
        if (this.smLaunchControl == null) {
            return  4;
        }
        return this.smLaunchControl;
    }

    public boolean isSmLaunchControlDefined() {
        return (this.smLaunchControl!= null);
    }

    public void setSmLaunchControl(int smLaunchControl) {
        int oldValue = getSmLaunchControl();
        this.smLaunchControl = smLaunchControl;
        notifyChange(11, oldValue, smLaunchControl);
    }

    public int getSmLaunchAdminStatus() {
        if (this.smLaunchAdminStatus == null) {
            return  2;
        }
        return this.smLaunchAdminStatus;
    }

    public boolean isSmLaunchAdminStatusDefined() {
        return (this.smLaunchAdminStatus!= null);
    }

    public void setSmLaunchAdminStatus(int smLaunchAdminStatus) {
        int oldValue = getSmLaunchAdminStatus();
        this.smLaunchAdminStatus = smLaunchAdminStatus;
        notifyChange(12, oldValue, smLaunchAdminStatus);
    }

    public int getSmLaunchOperStatus() {
        if (this.smLaunchOperStatus == null) {
            return  2;
        }
        return this.smLaunchOperStatus;
    }

    public boolean isSmLaunchOperStatusDefined() {
        return (this.smLaunchOperStatus!= null);
    }

    public void setSmLaunchOperStatus(int smLaunchOperStatus) {
        int oldValue = getSmLaunchOperStatus();
        this.smLaunchOperStatus = smLaunchOperStatus;
        notifyChange(13, oldValue, smLaunchOperStatus);
    }

    public int getSmLaunchRunIndexNext() {
        return this.smLaunchRunIndexNext;
    }

    public void setSmLaunchRunIndexNext(int smLaunchRunIndexNext) {
        int oldValue = getSmLaunchRunIndexNext();
        this.smLaunchRunIndexNext = smLaunchRunIndexNext;
        notifyChange(14, oldValue, smLaunchRunIndexNext);
    }

    public int getSmLaunchStorageType() {
        if (this.smLaunchStorageType == null) {
            return  2;
        }
        return this.smLaunchStorageType;
    }

    public boolean isSmLaunchStorageTypeDefined() {
        return (this.smLaunchStorageType!= null);
    }

    public void setSmLaunchStorageType(int smLaunchStorageType) {
        int oldValue = getSmLaunchStorageType();
        this.smLaunchStorageType = smLaunchStorageType;
        notifyChange(15, oldValue, smLaunchStorageType);
    }

    public int getSmLaunchRowStatus() {
        return this.smLaunchRowStatus;
    }

    public void setSmLaunchRowStatus(int smLaunchRowStatus) {
        int oldValue = getSmLaunchRowStatus();
        this.smLaunchRowStatus = smLaunchRowStatus;
        notifyChange(16, oldValue, smLaunchRowStatus);
    }

    public String getSmLaunchError() {
        return this.smLaunchError;
    }

    public void setSmLaunchError(String smLaunchError) {
        String oldValue = getSmLaunchError();
        this.smLaunchError = smLaunchError;
        notifyChange(17, oldValue, smLaunchError);
    }

    public String getSmLaunchLastChange() {
        return this.smLaunchLastChange;
    }

    public void setSmLaunchLastChange(String smLaunchLastChange) {
        String oldValue = getSmLaunchLastChange();
        this.smLaunchLastChange = smLaunchLastChange;
        notifyChange(18, oldValue, smLaunchLastChange);
    }

    public int getSmLaunchRowExpireTime() {
        if (this.smLaunchRowExpireTime == null) {
            return  2147483647;
        }
        return this.smLaunchRowExpireTime;
    }

    public boolean isSmLaunchRowExpireTimeDefined() {
        return (this.smLaunchRowExpireTime!= null);
    }

    public void setSmLaunchRowExpireTime(int smLaunchRowExpireTime) {
        int oldValue = getSmLaunchRowExpireTime();
        this.smLaunchRowExpireTime = smLaunchRowExpireTime;
        notifyChange(19, oldValue, smLaunchRowExpireTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setSmLaunchOwner(binding.getVariable().toString());
                break;
            case  2 :
                setSmLaunchName(binding.getVariable().toString());
                break;
            case  3 :
                setSmLaunchScriptOwner(binding.getVariable().toString());
                break;
            case  4 :
                setSmLaunchScriptName(binding.getVariable().toString());
                break;
            case  5 :
                setSmLaunchArgument(binding.getVariable().toString());
                break;
            case  6 :
                setSmLaunchMaxRunning(binding.getVariable().toInt());
                break;
            case  7 :
                setSmLaunchMaxCompleted(binding.getVariable().toInt());
                break;
            case  8 :
                setSmLaunchLifeTime(binding.getVariable().toInt());
                break;
            case  9 :
                setSmLaunchExpireTime(binding.getVariable().toInt());
                break;
            case  10 :
                setSmLaunchStart(binding.getVariable().toInt());
                break;
            case  11 :
                setSmLaunchControl(binding.getVariable().toInt());
                break;
            case  12 :
                setSmLaunchAdminStatus(binding.getVariable().toInt());
                break;
            case  13 :
                setSmLaunchOperStatus(binding.getVariable().toInt());
                break;
            case  14 :
                setSmLaunchRunIndexNext(binding.getVariable().toInt());
                break;
            case  15 :
                setSmLaunchStorageType(binding.getVariable().toInt());
                break;
            case  16 :
                setSmLaunchRowStatus(binding.getVariable().toInt());
                break;
            case  17 :
                setSmLaunchError(binding.getVariable().toString());
                break;
            case  18 :
                setSmLaunchLastChange(binding.getVariable().toString());
                break;
            case  19 :
                setSmLaunchRowExpireTime(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 12;
        int _len;
        _index = new OID(_oidInts, 12, (oid.size()- 12)).toString();
        _len = _oidInts[arrayOffset ++];
        setSmLaunchOwner(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setSmLaunchName(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SmLaunchTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smLaunchOwner", smLaunchOwner).append("smLaunchName", smLaunchName).append("smLaunchScriptOwner", smLaunchScriptOwner).append("smLaunchScriptName", smLaunchScriptName).append("smLaunchArgument", smLaunchArgument).append("smLaunchMaxRunning", smLaunchMaxRunning).append("smLaunchMaxCompleted", smLaunchMaxCompleted).append("smLaunchLifeTime", smLaunchLifeTime).append("smLaunchExpireTime", smLaunchExpireTime).append("smLaunchStart", smLaunchStart).append("smLaunchControl", smLaunchControl).append("smLaunchAdminStatus", smLaunchAdminStatus).append("smLaunchOperStatus", smLaunchOperStatus).append("smLaunchRunIndexNext", smLaunchRunIndexNext).append("smLaunchStorageType", smLaunchStorageType).append("smLaunchRowStatus", smLaunchRowStatus).append("smLaunchError", smLaunchError).append("smLaunchLastChange", smLaunchLastChange).append("smLaunchRowExpireTime", smLaunchRowExpireTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smLaunchOwner).append(smLaunchName).append(smLaunchScriptOwner).append(smLaunchScriptName).append(smLaunchArgument).append(smLaunchMaxRunning).append(smLaunchMaxCompleted).append(smLaunchLifeTime).append(smLaunchExpireTime).append(smLaunchStart).append(smLaunchControl).append(smLaunchAdminStatus).append(smLaunchOperStatus).append(smLaunchRunIndexNext).append(smLaunchStorageType).append(smLaunchRowStatus).append(smLaunchError).append(smLaunchLastChange).append(smLaunchRowExpireTime).append(_index).toHashCode();
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
        SmLaunchEntry rhs = ((SmLaunchEntry) obj);
        return new EqualsBuilder().append(smLaunchOwner, rhs.smLaunchOwner).append(smLaunchName, rhs.smLaunchName).append(smLaunchScriptOwner, rhs.smLaunchScriptOwner).append(smLaunchScriptName, rhs.smLaunchScriptName).append(smLaunchArgument, rhs.smLaunchArgument).append(smLaunchMaxRunning, rhs.smLaunchMaxRunning).append(smLaunchMaxCompleted, rhs.smLaunchMaxCompleted).append(smLaunchLifeTime, rhs.smLaunchLifeTime).append(smLaunchExpireTime, rhs.smLaunchExpireTime).append(smLaunchStart, rhs.smLaunchStart).append(smLaunchControl, rhs.smLaunchControl).append(smLaunchAdminStatus, rhs.smLaunchAdminStatus).append(smLaunchOperStatus, rhs.smLaunchOperStatus).append(smLaunchRunIndexNext, rhs.smLaunchRunIndexNext).append(smLaunchStorageType, rhs.smLaunchStorageType).append(smLaunchRowStatus, rhs.smLaunchRowStatus).append(smLaunchError, rhs.smLaunchError).append(smLaunchLastChange, rhs.smLaunchLastChange).append(smLaunchRowExpireTime, rhs.smLaunchRowExpireTime).append(_index, rhs._index).isEquals();
    }

    public SmLaunchEntry clone() {
        SmLaunchEntry _copy = new SmLaunchEntry();
        _copy.smLaunchOwner = smLaunchOwner;
        _copy.smLaunchName = smLaunchName;
        _copy.smLaunchScriptOwner = smLaunchScriptOwner;
        _copy.smLaunchScriptName = smLaunchScriptName;
        _copy.smLaunchArgument = smLaunchArgument;
        _copy.smLaunchMaxRunning = smLaunchMaxRunning;
        _copy.smLaunchMaxCompleted = smLaunchMaxCompleted;
        _copy.smLaunchLifeTime = smLaunchLifeTime;
        _copy.smLaunchExpireTime = smLaunchExpireTime;
        _copy.smLaunchStart = smLaunchStart;
        _copy.smLaunchControl = smLaunchControl;
        _copy.smLaunchAdminStatus = smLaunchAdminStatus;
        _copy.smLaunchOperStatus = smLaunchOperStatus;
        _copy.smLaunchRunIndexNext = smLaunchRunIndexNext;
        _copy.smLaunchStorageType = smLaunchStorageType;
        _copy.smLaunchRowStatus = smLaunchRowStatus;
        _copy.smLaunchError = smLaunchError;
        _copy.smLaunchLastChange = smLaunchLastChange;
        _copy.smLaunchRowExpireTime = smLaunchRowExpireTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.1.4.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "smLaunchOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "smLaunchName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "smLaunchScriptOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "smLaunchScriptName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "smLaunchArgument", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "smLaunchMaxRunning", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "smLaunchMaxCompleted", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "smLaunchLifeTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "smLaunchExpireTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "smLaunchStart", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "smLaunchControl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "smLaunchAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "smLaunchOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "smLaunchRunIndexNext", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "smLaunchStorageType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "smLaunchRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "smLaunchError", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "smLaunchLastChange", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "smLaunchRowExpireTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
