
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrfstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrfstable.IHrFSEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrFSTable;
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

public class HrFSEntry
    extends DeviceEntity
    implements Serializable, IHrFSEntry, IIndexed, IVariableBindingSetter
{

    private int hrFSIndex;
    private String hrFSMountPoint;
    private String hrFSRemoteMountPoint;
    private String hrFSType;
    private int hrFSAccess;
    private int hrFSBootable;
    private int hrFSStorageIndex;
    private String hrFSLastFullBackupDate;
    private String hrFSLastPartialBackupDate;
    private String _index;
    private HrFSTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrFSEntry() {
    }

    public int getHrFSIndex() {
        return this.hrFSIndex;
    }

    public void setHrFSIndex(int hrFSIndex) {
        int oldValue = getHrFSIndex();
        this.hrFSIndex = hrFSIndex;
        notifyChange(1, oldValue, hrFSIndex);
    }

    public String getHrFSMountPoint() {
        return this.hrFSMountPoint;
    }

    public void setHrFSMountPoint(String hrFSMountPoint) {
        String oldValue = getHrFSMountPoint();
        this.hrFSMountPoint = hrFSMountPoint;
        notifyChange(2, oldValue, hrFSMountPoint);
    }

    public String getHrFSRemoteMountPoint() {
        return this.hrFSRemoteMountPoint;
    }

    public void setHrFSRemoteMountPoint(String hrFSRemoteMountPoint) {
        String oldValue = getHrFSRemoteMountPoint();
        this.hrFSRemoteMountPoint = hrFSRemoteMountPoint;
        notifyChange(3, oldValue, hrFSRemoteMountPoint);
    }

    public String getHrFSType() {
        return this.hrFSType;
    }

    public void setHrFSType(String hrFSType) {
        String oldValue = getHrFSType();
        this.hrFSType = hrFSType;
        notifyChange(4, oldValue, hrFSType);
    }

    public int getHrFSAccess() {
        return this.hrFSAccess;
    }

    public void setHrFSAccess(int hrFSAccess) {
        int oldValue = getHrFSAccess();
        this.hrFSAccess = hrFSAccess;
        notifyChange(5, oldValue, hrFSAccess);
    }

    public int getHrFSBootable() {
        return this.hrFSBootable;
    }

    public void setHrFSBootable(int hrFSBootable) {
        int oldValue = getHrFSBootable();
        this.hrFSBootable = hrFSBootable;
        notifyChange(6, oldValue, hrFSBootable);
    }

    public int getHrFSStorageIndex() {
        return this.hrFSStorageIndex;
    }

    public void setHrFSStorageIndex(int hrFSStorageIndex) {
        int oldValue = getHrFSStorageIndex();
        this.hrFSStorageIndex = hrFSStorageIndex;
        notifyChange(7, oldValue, hrFSStorageIndex);
    }

    public String getHrFSLastFullBackupDate() {
        return this.hrFSLastFullBackupDate;
    }

    public void setHrFSLastFullBackupDate(String hrFSLastFullBackupDate) {
        String oldValue = getHrFSLastFullBackupDate();
        this.hrFSLastFullBackupDate = hrFSLastFullBackupDate;
        notifyChange(8, oldValue, hrFSLastFullBackupDate);
    }

    public String getHrFSLastPartialBackupDate() {
        return this.hrFSLastPartialBackupDate;
    }

    public void setHrFSLastPartialBackupDate(String hrFSLastPartialBackupDate) {
        String oldValue = getHrFSLastPartialBackupDate();
        this.hrFSLastPartialBackupDate = hrFSLastPartialBackupDate;
        notifyChange(9, oldValue, hrFSLastPartialBackupDate);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHrFSIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setHrFSMountPoint(binding.getVariable().toString());
                break;
            case  3 :
                setHrFSRemoteMountPoint(binding.getVariable().toString());
                break;
            case  4 :
                setHrFSType(binding.getVariable().toString());
                break;
            case  5 :
                setHrFSAccess(binding.getVariable().toInt());
                break;
            case  6 :
                setHrFSBootable(binding.getVariable().toInt());
                break;
            case  7 :
                setHrFSStorageIndex(binding.getVariable().toInt());
                break;
            case  8 :
                setHrFSLastFullBackupDate(binding.getVariable().toString());
                break;
            case  9 :
                setHrFSLastPartialBackupDate(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHrFSIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HrFSTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrFSIndex", hrFSIndex).append("hrFSMountPoint", hrFSMountPoint).append("hrFSRemoteMountPoint", hrFSRemoteMountPoint).append("hrFSType", hrFSType).append("hrFSAccess", hrFSAccess).append("hrFSBootable", hrFSBootable).append("hrFSStorageIndex", hrFSStorageIndex).append("hrFSLastFullBackupDate", hrFSLastFullBackupDate).append("hrFSLastPartialBackupDate", hrFSLastPartialBackupDate).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrFSIndex).append(hrFSMountPoint).append(hrFSRemoteMountPoint).append(hrFSType).append(hrFSAccess).append(hrFSBootable).append(hrFSStorageIndex).append(hrFSLastFullBackupDate).append(hrFSLastPartialBackupDate).append(_index).toHashCode();
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
        HrFSEntry rhs = ((HrFSEntry) obj);
        return new EqualsBuilder().append(hrFSIndex, rhs.hrFSIndex).append(hrFSMountPoint, rhs.hrFSMountPoint).append(hrFSRemoteMountPoint, rhs.hrFSRemoteMountPoint).append(hrFSType, rhs.hrFSType).append(hrFSAccess, rhs.hrFSAccess).append(hrFSBootable, rhs.hrFSBootable).append(hrFSStorageIndex, rhs.hrFSStorageIndex).append(hrFSLastFullBackupDate, rhs.hrFSLastFullBackupDate).append(hrFSLastPartialBackupDate, rhs.hrFSLastPartialBackupDate).append(_index, rhs._index).isEquals();
    }

    public HrFSEntry clone() {
        HrFSEntry _copy = new HrFSEntry();
        _copy.hrFSIndex = hrFSIndex;
        _copy.hrFSMountPoint = hrFSMountPoint;
        _copy.hrFSRemoteMountPoint = hrFSRemoteMountPoint;
        _copy.hrFSType = hrFSType;
        _copy.hrFSAccess = hrFSAccess;
        _copy.hrFSBootable = hrFSBootable;
        _copy.hrFSStorageIndex = hrFSStorageIndex;
        _copy.hrFSLastFullBackupDate = hrFSLastFullBackupDate;
        _copy.hrFSLastPartialBackupDate = hrFSLastPartialBackupDate;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.8.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrFSIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrFSMountPoint", DeviceEntityDescription.FieldType.STRING, 128));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hrFSRemoteMountPoint", DeviceEntityDescription.FieldType.STRING, 128));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hrFSType", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hrFSAccess", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "hrFSBootable", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "hrFSStorageIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "hrFSLastFullBackupDate", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "hrFSLastPartialBackupDate", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
