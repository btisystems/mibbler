
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswrun.hrswruntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswrun.hrswruntable.IHrSWRunEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswrun.HrSWRunTable;
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

public class HrSWRunEntry
    extends DeviceEntity
    implements Serializable, IHrSWRunEntry, IIndexed, IVariableBindingSetter
{

    private int hrSWRunIndex;
    private String hrSWRunName;
    private String hrSWRunID;
    private String hrSWRunPath;
    private String hrSWRunParameters;
    private int hrSWRunType;
    private int hrSWRunStatus;
    private String _index;
    private HrSWRunTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrSWRunEntry() {
    }

    public int getHrSWRunIndex() {
        return this.hrSWRunIndex;
    }

    public void setHrSWRunIndex(int hrSWRunIndex) {
        int oldValue = getHrSWRunIndex();
        this.hrSWRunIndex = hrSWRunIndex;
        notifyChange(1, oldValue, hrSWRunIndex);
    }

    public String getHrSWRunName() {
        return this.hrSWRunName;
    }

    public void setHrSWRunName(String hrSWRunName) {
        String oldValue = getHrSWRunName();
        this.hrSWRunName = hrSWRunName;
        notifyChange(2, oldValue, hrSWRunName);
    }

    public String getHrSWRunID() {
        return this.hrSWRunID;
    }

    public void setHrSWRunID(String hrSWRunID) {
        String oldValue = getHrSWRunID();
        this.hrSWRunID = hrSWRunID;
        notifyChange(3, oldValue, hrSWRunID);
    }

    public String getHrSWRunPath() {
        return this.hrSWRunPath;
    }

    public void setHrSWRunPath(String hrSWRunPath) {
        String oldValue = getHrSWRunPath();
        this.hrSWRunPath = hrSWRunPath;
        notifyChange(4, oldValue, hrSWRunPath);
    }

    public String getHrSWRunParameters() {
        return this.hrSWRunParameters;
    }

    public void setHrSWRunParameters(String hrSWRunParameters) {
        String oldValue = getHrSWRunParameters();
        this.hrSWRunParameters = hrSWRunParameters;
        notifyChange(5, oldValue, hrSWRunParameters);
    }

    public int getHrSWRunType() {
        return this.hrSWRunType;
    }

    public void setHrSWRunType(int hrSWRunType) {
        int oldValue = getHrSWRunType();
        this.hrSWRunType = hrSWRunType;
        notifyChange(6, oldValue, hrSWRunType);
    }

    public int getHrSWRunStatus() {
        return this.hrSWRunStatus;
    }

    public void setHrSWRunStatus(int hrSWRunStatus) {
        int oldValue = getHrSWRunStatus();
        this.hrSWRunStatus = hrSWRunStatus;
        notifyChange(7, oldValue, hrSWRunStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHrSWRunIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setHrSWRunName(binding.getVariable().toString());
                break;
            case  3 :
                setHrSWRunID(binding.getVariable().toString());
                break;
            case  4 :
                setHrSWRunPath(binding.getVariable().toString());
                break;
            case  5 :
                setHrSWRunParameters(binding.getVariable().toString());
                break;
            case  6 :
                setHrSWRunType(binding.getVariable().toInt());
                break;
            case  7 :
                setHrSWRunStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHrSWRunIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HrSWRunTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrSWRunIndex", hrSWRunIndex).append("hrSWRunName", hrSWRunName).append("hrSWRunID", hrSWRunID).append("hrSWRunPath", hrSWRunPath).append("hrSWRunParameters", hrSWRunParameters).append("hrSWRunType", hrSWRunType).append("hrSWRunStatus", hrSWRunStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrSWRunIndex).append(hrSWRunName).append(hrSWRunID).append(hrSWRunPath).append(hrSWRunParameters).append(hrSWRunType).append(hrSWRunStatus).append(_index).toHashCode();
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
        HrSWRunEntry rhs = ((HrSWRunEntry) obj);
        return new EqualsBuilder().append(hrSWRunIndex, rhs.hrSWRunIndex).append(hrSWRunName, rhs.hrSWRunName).append(hrSWRunID, rhs.hrSWRunID).append(hrSWRunPath, rhs.hrSWRunPath).append(hrSWRunParameters, rhs.hrSWRunParameters).append(hrSWRunType, rhs.hrSWRunType).append(hrSWRunStatus, rhs.hrSWRunStatus).append(_index, rhs._index).isEquals();
    }

    public HrSWRunEntry clone() {
        HrSWRunEntry _copy = new HrSWRunEntry();
        _copy.hrSWRunIndex = hrSWRunIndex;
        _copy.hrSWRunName = hrSWRunName;
        _copy.hrSWRunID = hrSWRunID;
        _copy.hrSWRunPath = hrSWRunPath;
        _copy.hrSWRunParameters = hrSWRunParameters;
        _copy.hrSWRunType = hrSWRunType;
        _copy.hrSWRunStatus = hrSWRunStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.4.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrSWRunIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrSWRunName", DeviceEntityDescription.FieldType.STRING, 64));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hrSWRunID", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hrSWRunPath", DeviceEntityDescription.FieldType.STRING, 128));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hrSWRunParameters", DeviceEntityDescription.FieldType.STRING, 128));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "hrSWRunType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "hrSWRunStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
