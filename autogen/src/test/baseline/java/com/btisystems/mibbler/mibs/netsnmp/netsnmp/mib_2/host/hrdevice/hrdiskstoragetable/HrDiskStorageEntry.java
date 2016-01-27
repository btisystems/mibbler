
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrdiskstoragetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrdiskstoragetable.IHrDiskStorageEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrDiskStorageTable;
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

public class HrDiskStorageEntry
    extends DeviceEntity
    implements Serializable, IHrDiskStorageEntry, IIndexed, IVariableBindingSetter
{

    private int hrDiskStorageAccess;
    private int hrDiskStorageMedia;
    private int hrDiskStorageRemoveble;
    private int hrDiskStorageCapacity;
    private String _index;
    private HrDiskStorageTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrDiskStorageEntry() {
    }

    public int getHrDiskStorageAccess() {
        return this.hrDiskStorageAccess;
    }

    public void setHrDiskStorageAccess(int hrDiskStorageAccess) {
        int oldValue = getHrDiskStorageAccess();
        this.hrDiskStorageAccess = hrDiskStorageAccess;
        notifyChange(1, oldValue, hrDiskStorageAccess);
    }

    public int getHrDiskStorageMedia() {
        return this.hrDiskStorageMedia;
    }

    public void setHrDiskStorageMedia(int hrDiskStorageMedia) {
        int oldValue = getHrDiskStorageMedia();
        this.hrDiskStorageMedia = hrDiskStorageMedia;
        notifyChange(2, oldValue, hrDiskStorageMedia);
    }

    public int getHrDiskStorageRemoveble() {
        return this.hrDiskStorageRemoveble;
    }

    public void setHrDiskStorageRemoveble(int hrDiskStorageRemoveble) {
        int oldValue = getHrDiskStorageRemoveble();
        this.hrDiskStorageRemoveble = hrDiskStorageRemoveble;
        notifyChange(3, oldValue, hrDiskStorageRemoveble);
    }

    public int getHrDiskStorageCapacity() {
        return this.hrDiskStorageCapacity;
    }

    public void setHrDiskStorageCapacity(int hrDiskStorageCapacity) {
        int oldValue = getHrDiskStorageCapacity();
        this.hrDiskStorageCapacity = hrDiskStorageCapacity;
        notifyChange(4, oldValue, hrDiskStorageCapacity);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHrDiskStorageAccess(binding.getVariable().toInt());
                break;
            case  2 :
                setHrDiskStorageMedia(binding.getVariable().toInt());
                break;
            case  3 :
                setHrDiskStorageRemoveble(binding.getVariable().toInt());
                break;
            case  4 :
                setHrDiskStorageCapacity(binding.getVariable().toInt());
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
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HrDiskStorageTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrDiskStorageAccess", hrDiskStorageAccess).append("hrDiskStorageMedia", hrDiskStorageMedia).append("hrDiskStorageRemoveble", hrDiskStorageRemoveble).append("hrDiskStorageCapacity", hrDiskStorageCapacity).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrDiskStorageAccess).append(hrDiskStorageMedia).append(hrDiskStorageRemoveble).append(hrDiskStorageCapacity).append(_index).toHashCode();
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
        HrDiskStorageEntry rhs = ((HrDiskStorageEntry) obj);
        return new EqualsBuilder().append(hrDiskStorageAccess, rhs.hrDiskStorageAccess).append(hrDiskStorageMedia, rhs.hrDiskStorageMedia).append(hrDiskStorageRemoveble, rhs.hrDiskStorageRemoveble).append(hrDiskStorageCapacity, rhs.hrDiskStorageCapacity).append(_index, rhs._index).isEquals();
    }

    public HrDiskStorageEntry clone() {
        HrDiskStorageEntry _copy = new HrDiskStorageEntry();
        _copy.hrDiskStorageAccess = hrDiskStorageAccess;
        _copy.hrDiskStorageMedia = hrDiskStorageMedia;
        _copy.hrDiskStorageRemoveble = hrDiskStorageRemoveble;
        _copy.hrDiskStorageCapacity = hrDiskStorageCapacity;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrDiskStorageAccess", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrDiskStorageMedia", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hrDiskStorageRemoveble", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hrDiskStorageCapacity", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
