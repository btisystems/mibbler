
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrpartitiontable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrpartitiontable.IHrPartitionEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrPartitionTable;
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

public class HrPartitionEntry
    extends DeviceEntity
    implements Serializable, IHrPartitionEntry, IIndexed, IVariableBindingSetter
{

    private int hrPartitionIndex;
    private String hrPartitionLabel;
    private String hrPartitionID;
    private int hrPartitionSize;
    private int hrPartitionFSIndex;
    private String _index;
    private HrPartitionTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrPartitionEntry() {
    }

    public int getHrPartitionIndex() {
        return this.hrPartitionIndex;
    }

    public void setHrPartitionIndex(int hrPartitionIndex) {
        int oldValue = getHrPartitionIndex();
        this.hrPartitionIndex = hrPartitionIndex;
        notifyChange(1, oldValue, hrPartitionIndex);
    }

    public String getHrPartitionLabel() {
        return this.hrPartitionLabel;
    }

    public void setHrPartitionLabel(String hrPartitionLabel) {
        String oldValue = getHrPartitionLabel();
        this.hrPartitionLabel = hrPartitionLabel;
        notifyChange(2, oldValue, hrPartitionLabel);
    }

    public String getHrPartitionID() {
        return this.hrPartitionID;
    }

    public void setHrPartitionID(String hrPartitionID) {
        String oldValue = getHrPartitionID();
        this.hrPartitionID = hrPartitionID;
        notifyChange(3, oldValue, hrPartitionID);
    }

    public int getHrPartitionSize() {
        return this.hrPartitionSize;
    }

    public void setHrPartitionSize(int hrPartitionSize) {
        int oldValue = getHrPartitionSize();
        this.hrPartitionSize = hrPartitionSize;
        notifyChange(4, oldValue, hrPartitionSize);
    }

    public int getHrPartitionFSIndex() {
        return this.hrPartitionFSIndex;
    }

    public void setHrPartitionFSIndex(int hrPartitionFSIndex) {
        int oldValue = getHrPartitionFSIndex();
        this.hrPartitionFSIndex = hrPartitionFSIndex;
        notifyChange(5, oldValue, hrPartitionFSIndex);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHrPartitionIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setHrPartitionLabel(binding.getVariable().toString());
                break;
            case  3 :
                setHrPartitionID(binding.getVariable().toString());
                break;
            case  4 :
                setHrPartitionSize(binding.getVariable().toInt());
                break;
            case  5 :
                setHrPartitionFSIndex(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        arrayOffset += 1;
        setHrPartitionIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HrPartitionTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrPartitionIndex", hrPartitionIndex).append("hrPartitionLabel", hrPartitionLabel).append("hrPartitionID", hrPartitionID).append("hrPartitionSize", hrPartitionSize).append("hrPartitionFSIndex", hrPartitionFSIndex).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrPartitionIndex).append(hrPartitionLabel).append(hrPartitionID).append(hrPartitionSize).append(hrPartitionFSIndex).append(_index).toHashCode();
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
        HrPartitionEntry rhs = ((HrPartitionEntry) obj);
        return new EqualsBuilder().append(hrPartitionIndex, rhs.hrPartitionIndex).append(hrPartitionLabel, rhs.hrPartitionLabel).append(hrPartitionID, rhs.hrPartitionID).append(hrPartitionSize, rhs.hrPartitionSize).append(hrPartitionFSIndex, rhs.hrPartitionFSIndex).append(_index, rhs._index).isEquals();
    }

    public HrPartitionEntry clone() {
        HrPartitionEntry _copy = new HrPartitionEntry();
        _copy.hrPartitionIndex = hrPartitionIndex;
        _copy.hrPartitionLabel = hrPartitionLabel;
        _copy.hrPartitionID = hrPartitionID;
        _copy.hrPartitionSize = hrPartitionSize;
        _copy.hrPartitionFSIndex = hrPartitionFSIndex;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.7.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrPartitionIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrPartitionLabel", DeviceEntityDescription.FieldType.STRING, 128));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hrPartitionID", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hrPartitionSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hrPartitionFSIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
