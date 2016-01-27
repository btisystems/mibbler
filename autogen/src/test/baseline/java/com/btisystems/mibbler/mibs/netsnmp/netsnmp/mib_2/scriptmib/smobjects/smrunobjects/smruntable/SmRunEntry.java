
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smrunobjects.smruntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smrunobjects.smruntable.ISmRunEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smrunobjects.SmRunTable;
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

public class SmRunEntry
    extends DeviceEntity
    implements Serializable, ISmRunEntry, IIndexed, IVariableBindingSetter
{

    private int smRunIndex;
    private String smRunArgument;
    private String smRunStartTime;
    private String smRunEndTime;
    private int smRunLifeTime;
    private int smRunExpireTime;
    private Integer smRunExitCode;
    private String smRunResult;
    private Integer smRunControl;
    private int smRunState;
    private String smRunError;
    private String smRunResultTime;
    private String smRunErrorTime;
    private String _index;
    private SmRunTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmRunEntry() {
    }

    public int getSmRunIndex() {
        return this.smRunIndex;
    }

    public void setSmRunIndex(int smRunIndex) {
        int oldValue = getSmRunIndex();
        this.smRunIndex = smRunIndex;
        notifyChange(1, oldValue, smRunIndex);
    }

    public String getSmRunArgument() {
        return this.smRunArgument;
    }

    public void setSmRunArgument(String smRunArgument) {
        String oldValue = getSmRunArgument();
        this.smRunArgument = smRunArgument;
        notifyChange(2, oldValue, smRunArgument);
    }

    public String getSmRunStartTime() {
        return this.smRunStartTime;
    }

    public void setSmRunStartTime(String smRunStartTime) {
        String oldValue = getSmRunStartTime();
        this.smRunStartTime = smRunStartTime;
        notifyChange(3, oldValue, smRunStartTime);
    }

    public String getSmRunEndTime() {
        return this.smRunEndTime;
    }

    public void setSmRunEndTime(String smRunEndTime) {
        String oldValue = getSmRunEndTime();
        this.smRunEndTime = smRunEndTime;
        notifyChange(4, oldValue, smRunEndTime);
    }

    public int getSmRunLifeTime() {
        return this.smRunLifeTime;
    }

    public void setSmRunLifeTime(int smRunLifeTime) {
        int oldValue = getSmRunLifeTime();
        this.smRunLifeTime = smRunLifeTime;
        notifyChange(5, oldValue, smRunLifeTime);
    }

    public int getSmRunExpireTime() {
        return this.smRunExpireTime;
    }

    public void setSmRunExpireTime(int smRunExpireTime) {
        int oldValue = getSmRunExpireTime();
        this.smRunExpireTime = smRunExpireTime;
        notifyChange(6, oldValue, smRunExpireTime);
    }

    public int getSmRunExitCode() {
        if (this.smRunExitCode == null) {
            return  1;
        }
        return this.smRunExitCode;
    }

    public boolean isSmRunExitCodeDefined() {
        return (this.smRunExitCode!= null);
    }

    public void setSmRunExitCode(int smRunExitCode) {
        int oldValue = getSmRunExitCode();
        this.smRunExitCode = smRunExitCode;
        notifyChange(7, oldValue, smRunExitCode);
    }

    public String getSmRunResult() {
        return this.smRunResult;
    }

    public void setSmRunResult(String smRunResult) {
        String oldValue = getSmRunResult();
        this.smRunResult = smRunResult;
        notifyChange(8, oldValue, smRunResult);
    }

    public int getSmRunControl() {
        if (this.smRunControl == null) {
            return  4;
        }
        return this.smRunControl;
    }

    public boolean isSmRunControlDefined() {
        return (this.smRunControl!= null);
    }

    public void setSmRunControl(int smRunControl) {
        int oldValue = getSmRunControl();
        this.smRunControl = smRunControl;
        notifyChange(9, oldValue, smRunControl);
    }

    public int getSmRunState() {
        return this.smRunState;
    }

    public void setSmRunState(int smRunState) {
        int oldValue = getSmRunState();
        this.smRunState = smRunState;
        notifyChange(10, oldValue, smRunState);
    }

    public String getSmRunError() {
        return this.smRunError;
    }

    public void setSmRunError(String smRunError) {
        String oldValue = getSmRunError();
        this.smRunError = smRunError;
        notifyChange(11, oldValue, smRunError);
    }

    public String getSmRunResultTime() {
        return this.smRunResultTime;
    }

    public void setSmRunResultTime(String smRunResultTime) {
        String oldValue = getSmRunResultTime();
        this.smRunResultTime = smRunResultTime;
        notifyChange(12, oldValue, smRunResultTime);
    }

    public String getSmRunErrorTime() {
        return this.smRunErrorTime;
    }

    public void setSmRunErrorTime(String smRunErrorTime) {
        String oldValue = getSmRunErrorTime();
        this.smRunErrorTime = smRunErrorTime;
        notifyChange(13, oldValue, smRunErrorTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setSmRunIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setSmRunArgument(binding.getVariable().toString());
                break;
            case  3 :
                setSmRunStartTime(binding.getVariable().toString());
                break;
            case  4 :
                setSmRunEndTime(binding.getVariable().toString());
                break;
            case  5 :
                setSmRunLifeTime(binding.getVariable().toInt());
                break;
            case  6 :
                setSmRunExpireTime(binding.getVariable().toInt());
                break;
            case  7 :
                setSmRunExitCode(binding.getVariable().toInt());
                break;
            case  8 :
                setSmRunResult(binding.getVariable().toString());
                break;
            case  9 :
                setSmRunControl(binding.getVariable().toInt());
                break;
            case  10 :
                setSmRunState(binding.getVariable().toInt());
                break;
            case  11 :
                setSmRunError(binding.getVariable().toString());
                break;
            case  12 :
                setSmRunResultTime(binding.getVariable().toString());
                break;
            case  13 :
                setSmRunErrorTime(binding.getVariable().toString());
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
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        arrayOffset += _len;
        setSmRunIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SmRunTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smRunIndex", smRunIndex).append("smRunArgument", smRunArgument).append("smRunStartTime", smRunStartTime).append("smRunEndTime", smRunEndTime).append("smRunLifeTime", smRunLifeTime).append("smRunExpireTime", smRunExpireTime).append("smRunExitCode", smRunExitCode).append("smRunResult", smRunResult).append("smRunControl", smRunControl).append("smRunState", smRunState).append("smRunError", smRunError).append("smRunResultTime", smRunResultTime).append("smRunErrorTime", smRunErrorTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smRunIndex).append(smRunArgument).append(smRunStartTime).append(smRunEndTime).append(smRunLifeTime).append(smRunExpireTime).append(smRunExitCode).append(smRunResult).append(smRunControl).append(smRunState).append(smRunError).append(smRunResultTime).append(smRunErrorTime).append(_index).toHashCode();
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
        SmRunEntry rhs = ((SmRunEntry) obj);
        return new EqualsBuilder().append(smRunIndex, rhs.smRunIndex).append(smRunArgument, rhs.smRunArgument).append(smRunStartTime, rhs.smRunStartTime).append(smRunEndTime, rhs.smRunEndTime).append(smRunLifeTime, rhs.smRunLifeTime).append(smRunExpireTime, rhs.smRunExpireTime).append(smRunExitCode, rhs.smRunExitCode).append(smRunResult, rhs.smRunResult).append(smRunControl, rhs.smRunControl).append(smRunState, rhs.smRunState).append(smRunError, rhs.smRunError).append(smRunResultTime, rhs.smRunResultTime).append(smRunErrorTime, rhs.smRunErrorTime).append(_index, rhs._index).isEquals();
    }

    public SmRunEntry clone() {
        SmRunEntry _copy = new SmRunEntry();
        _copy.smRunIndex = smRunIndex;
        _copy.smRunArgument = smRunArgument;
        _copy.smRunStartTime = smRunStartTime;
        _copy.smRunEndTime = smRunEndTime;
        _copy.smRunLifeTime = smRunLifeTime;
        _copy.smRunExpireTime = smRunExpireTime;
        _copy.smRunExitCode = smRunExitCode;
        _copy.smRunResult = smRunResult;
        _copy.smRunControl = smRunControl;
        _copy.smRunState = smRunState;
        _copy.smRunError = smRunError;
        _copy.smRunResultTime = smRunResultTime;
        _copy.smRunErrorTime = smRunErrorTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.1.4.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "smRunIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "smRunArgument", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "smRunStartTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "smRunEndTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "smRunLifeTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "smRunExpireTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "smRunExitCode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "smRunResult", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "smRunControl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "smRunState", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "smRunError", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "smRunResultTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "smRunErrorTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
