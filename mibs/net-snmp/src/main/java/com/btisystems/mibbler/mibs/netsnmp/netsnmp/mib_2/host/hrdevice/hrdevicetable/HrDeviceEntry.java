
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrdevicetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrdevicetable.IHrDeviceEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrDeviceTable;
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

public class HrDeviceEntry
    extends DeviceEntity
    implements Serializable, IHrDeviceEntry, IIndexed, IVariableBindingSetter
{

    private int hrDeviceIndex;
    private String hrDeviceType;
    private String hrDeviceDescr;
    private String hrDeviceID;
    private int hrDeviceStatus;
    private int hrDeviceErrors;
    private String _index;
    private HrDeviceTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrDeviceEntry() {
    }

    public int getHrDeviceIndex() {
        return this.hrDeviceIndex;
    }

    public void setHrDeviceIndex(int hrDeviceIndex) {
        int oldValue = getHrDeviceIndex();
        this.hrDeviceIndex = hrDeviceIndex;
        notifyChange(1, oldValue, hrDeviceIndex);
    }

    public String getHrDeviceType() {
        return this.hrDeviceType;
    }

    public void setHrDeviceType(String hrDeviceType) {
        String oldValue = getHrDeviceType();
        this.hrDeviceType = hrDeviceType;
        notifyChange(2, oldValue, hrDeviceType);
    }

    public String getHrDeviceDescr() {
        return this.hrDeviceDescr;
    }

    public void setHrDeviceDescr(String hrDeviceDescr) {
        String oldValue = getHrDeviceDescr();
        this.hrDeviceDescr = hrDeviceDescr;
        notifyChange(3, oldValue, hrDeviceDescr);
    }

    public String getHrDeviceID() {
        return this.hrDeviceID;
    }

    public void setHrDeviceID(String hrDeviceID) {
        String oldValue = getHrDeviceID();
        this.hrDeviceID = hrDeviceID;
        notifyChange(4, oldValue, hrDeviceID);
    }

    public int getHrDeviceStatus() {
        return this.hrDeviceStatus;
    }

    public void setHrDeviceStatus(int hrDeviceStatus) {
        int oldValue = getHrDeviceStatus();
        this.hrDeviceStatus = hrDeviceStatus;
        notifyChange(5, oldValue, hrDeviceStatus);
    }

    public int getHrDeviceErrors() {
        return this.hrDeviceErrors;
    }

    public void setHrDeviceErrors(int hrDeviceErrors) {
        int oldValue = getHrDeviceErrors();
        this.hrDeviceErrors = hrDeviceErrors;
        notifyChange(6, oldValue, hrDeviceErrors);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHrDeviceIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setHrDeviceType(binding.getVariable().toString());
                break;
            case  3 :
                setHrDeviceDescr(binding.getVariable().toString());
                break;
            case  4 :
                setHrDeviceID(binding.getVariable().toString());
                break;
            case  5 :
                setHrDeviceStatus(binding.getVariable().toInt());
                break;
            case  6 :
                setHrDeviceErrors(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHrDeviceIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HrDeviceTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrDeviceIndex", hrDeviceIndex).append("hrDeviceType", hrDeviceType).append("hrDeviceDescr", hrDeviceDescr).append("hrDeviceID", hrDeviceID).append("hrDeviceStatus", hrDeviceStatus).append("hrDeviceErrors", hrDeviceErrors).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrDeviceIndex).append(hrDeviceType).append(hrDeviceDescr).append(hrDeviceID).append(hrDeviceStatus).append(hrDeviceErrors).append(_index).toHashCode();
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
        HrDeviceEntry rhs = ((HrDeviceEntry) obj);
        return new EqualsBuilder().append(hrDeviceIndex, rhs.hrDeviceIndex).append(hrDeviceType, rhs.hrDeviceType).append(hrDeviceDescr, rhs.hrDeviceDescr).append(hrDeviceID, rhs.hrDeviceID).append(hrDeviceStatus, rhs.hrDeviceStatus).append(hrDeviceErrors, rhs.hrDeviceErrors).append(_index, rhs._index).isEquals();
    }

    public HrDeviceEntry clone() {
        HrDeviceEntry _copy = new HrDeviceEntry();
        _copy.hrDeviceIndex = hrDeviceIndex;
        _copy.hrDeviceType = hrDeviceType;
        _copy.hrDeviceDescr = hrDeviceDescr;
        _copy.hrDeviceID = hrDeviceID;
        _copy.hrDeviceStatus = hrDeviceStatus;
        _copy.hrDeviceErrors = hrDeviceErrors;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrDeviceIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrDeviceType", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hrDeviceDescr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hrDeviceID", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hrDeviceStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "hrDeviceErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
