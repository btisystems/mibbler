
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrstorage.hrstoragetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrstorage.hrstoragetable.IHrStorageEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrstorage.HrStorageTable;
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

public class HrStorageEntry
    extends DeviceEntity
    implements Serializable, IHrStorageEntry, IIndexed, IVariableBindingSetter
{

    private int hrStorageIndex;
    private String hrStorageType;
    private String hrStorageDescr;
    private int hrStorageAllocationUnits;
    private int hrStorageSize;
    private int hrStorageUsed;
    private int hrStorageAllocationFailures;
    private String _index;
    private HrStorageTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrStorageEntry() {
    }

    public int getHrStorageIndex() {
        return this.hrStorageIndex;
    }

    public void setHrStorageIndex(int hrStorageIndex) {
        int oldValue = getHrStorageIndex();
        this.hrStorageIndex = hrStorageIndex;
        notifyChange(1, oldValue, hrStorageIndex);
    }

    public String getHrStorageType() {
        return this.hrStorageType;
    }

    public void setHrStorageType(String hrStorageType) {
        String oldValue = getHrStorageType();
        this.hrStorageType = hrStorageType;
        notifyChange(2, oldValue, hrStorageType);
    }

    public String getHrStorageDescr() {
        return this.hrStorageDescr;
    }

    public void setHrStorageDescr(String hrStorageDescr) {
        String oldValue = getHrStorageDescr();
        this.hrStorageDescr = hrStorageDescr;
        notifyChange(3, oldValue, hrStorageDescr);
    }

    public int getHrStorageAllocationUnits() {
        return this.hrStorageAllocationUnits;
    }

    public void setHrStorageAllocationUnits(int hrStorageAllocationUnits) {
        int oldValue = getHrStorageAllocationUnits();
        this.hrStorageAllocationUnits = hrStorageAllocationUnits;
        notifyChange(4, oldValue, hrStorageAllocationUnits);
    }

    public int getHrStorageSize() {
        return this.hrStorageSize;
    }

    public void setHrStorageSize(int hrStorageSize) {
        int oldValue = getHrStorageSize();
        this.hrStorageSize = hrStorageSize;
        notifyChange(5, oldValue, hrStorageSize);
    }

    public int getHrStorageUsed() {
        return this.hrStorageUsed;
    }

    public void setHrStorageUsed(int hrStorageUsed) {
        int oldValue = getHrStorageUsed();
        this.hrStorageUsed = hrStorageUsed;
        notifyChange(6, oldValue, hrStorageUsed);
    }

    public int getHrStorageAllocationFailures() {
        return this.hrStorageAllocationFailures;
    }

    public void setHrStorageAllocationFailures(int hrStorageAllocationFailures) {
        int oldValue = getHrStorageAllocationFailures();
        this.hrStorageAllocationFailures = hrStorageAllocationFailures;
        notifyChange(7, oldValue, hrStorageAllocationFailures);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHrStorageIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setHrStorageType(binding.getVariable().toString());
                break;
            case  3 :
                setHrStorageDescr(binding.getVariable().toString());
                break;
            case  4 :
                setHrStorageAllocationUnits(binding.getVariable().toInt());
                break;
            case  5 :
                setHrStorageSize(binding.getVariable().toInt());
                break;
            case  6 :
                setHrStorageUsed(binding.getVariable().toInt());
                break;
            case  7 :
                setHrStorageAllocationFailures(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHrStorageIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HrStorageTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrStorageIndex", hrStorageIndex).append("hrStorageType", hrStorageType).append("hrStorageDescr", hrStorageDescr).append("hrStorageAllocationUnits", hrStorageAllocationUnits).append("hrStorageSize", hrStorageSize).append("hrStorageUsed", hrStorageUsed).append("hrStorageAllocationFailures", hrStorageAllocationFailures).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrStorageIndex).append(hrStorageType).append(hrStorageDescr).append(hrStorageAllocationUnits).append(hrStorageSize).append(hrStorageUsed).append(hrStorageAllocationFailures).append(_index).toHashCode();
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
        HrStorageEntry rhs = ((HrStorageEntry) obj);
        return new EqualsBuilder().append(hrStorageIndex, rhs.hrStorageIndex).append(hrStorageType, rhs.hrStorageType).append(hrStorageDescr, rhs.hrStorageDescr).append(hrStorageAllocationUnits, rhs.hrStorageAllocationUnits).append(hrStorageSize, rhs.hrStorageSize).append(hrStorageUsed, rhs.hrStorageUsed).append(hrStorageAllocationFailures, rhs.hrStorageAllocationFailures).append(_index, rhs._index).isEquals();
    }

    public HrStorageEntry clone() {
        HrStorageEntry _copy = new HrStorageEntry();
        _copy.hrStorageIndex = hrStorageIndex;
        _copy.hrStorageType = hrStorageType;
        _copy.hrStorageDescr = hrStorageDescr;
        _copy.hrStorageAllocationUnits = hrStorageAllocationUnits;
        _copy.hrStorageSize = hrStorageSize;
        _copy.hrStorageUsed = hrStorageUsed;
        _copy.hrStorageAllocationFailures = hrStorageAllocationFailures;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.2.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrStorageIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrStorageType", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hrStorageDescr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hrStorageAllocationUnits", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hrStorageSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "hrStorageUsed", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "hrStorageAllocationFailures", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
