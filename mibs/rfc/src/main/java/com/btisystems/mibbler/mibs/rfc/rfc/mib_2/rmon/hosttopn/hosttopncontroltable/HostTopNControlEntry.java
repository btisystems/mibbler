
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.hosttopn.hosttopncontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.hosttopn.hosttopncontroltable.IHostTopNControlEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.hosttopn.HostTopNControlTable;
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

public class HostTopNControlEntry
    extends DeviceEntity
    implements Serializable, IHostTopNControlEntry, IIndexed, IVariableBindingSetter
{

    private int hostTopNControlIndex;
    private int hostTopNHostIndex;
    private int hostTopNRateBase;
    private Integer hostTopNTimeRemaining;
    private Integer hostTopNDuration;
    private Integer hostTopNRequestedSize;
    private int hostTopNGrantedSize;
    private int hostTopNStartTime;
    private String hostTopNOwner;
    private int hostTopNStatus;
    private String _index;
    private HostTopNControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HostTopNControlEntry() {
    }

    public int getHostTopNControlIndex() {
        return this.hostTopNControlIndex;
    }

    public void setHostTopNControlIndex(int hostTopNControlIndex) {
        int oldValue = getHostTopNControlIndex();
        this.hostTopNControlIndex = hostTopNControlIndex;
        notifyChange(1, oldValue, hostTopNControlIndex);
    }

    public int getHostTopNHostIndex() {
        return this.hostTopNHostIndex;
    }

    public void setHostTopNHostIndex(int hostTopNHostIndex) {
        int oldValue = getHostTopNHostIndex();
        this.hostTopNHostIndex = hostTopNHostIndex;
        notifyChange(2, oldValue, hostTopNHostIndex);
    }

    public int getHostTopNRateBase() {
        return this.hostTopNRateBase;
    }

    public void setHostTopNRateBase(int hostTopNRateBase) {
        int oldValue = getHostTopNRateBase();
        this.hostTopNRateBase = hostTopNRateBase;
        notifyChange(3, oldValue, hostTopNRateBase);
    }

    public int getHostTopNTimeRemaining() {
        if (this.hostTopNTimeRemaining == null) {
            return  0;
        }
        return this.hostTopNTimeRemaining;
    }

    public boolean isHostTopNTimeRemainingDefined() {
        return (this.hostTopNTimeRemaining!= null);
    }

    public void setHostTopNTimeRemaining(int hostTopNTimeRemaining) {
        int oldValue = getHostTopNTimeRemaining();
        this.hostTopNTimeRemaining = hostTopNTimeRemaining;
        notifyChange(4, oldValue, hostTopNTimeRemaining);
    }

    public int getHostTopNDuration() {
        if (this.hostTopNDuration == null) {
            return  0;
        }
        return this.hostTopNDuration;
    }

    public boolean isHostTopNDurationDefined() {
        return (this.hostTopNDuration!= null);
    }

    public void setHostTopNDuration(int hostTopNDuration) {
        int oldValue = getHostTopNDuration();
        this.hostTopNDuration = hostTopNDuration;
        notifyChange(5, oldValue, hostTopNDuration);
    }

    public int getHostTopNRequestedSize() {
        if (this.hostTopNRequestedSize == null) {
            return  10;
        }
        return this.hostTopNRequestedSize;
    }

    public boolean isHostTopNRequestedSizeDefined() {
        return (this.hostTopNRequestedSize!= null);
    }

    public void setHostTopNRequestedSize(int hostTopNRequestedSize) {
        int oldValue = getHostTopNRequestedSize();
        this.hostTopNRequestedSize = hostTopNRequestedSize;
        notifyChange(6, oldValue, hostTopNRequestedSize);
    }

    public int getHostTopNGrantedSize() {
        return this.hostTopNGrantedSize;
    }

    public void setHostTopNGrantedSize(int hostTopNGrantedSize) {
        int oldValue = getHostTopNGrantedSize();
        this.hostTopNGrantedSize = hostTopNGrantedSize;
        notifyChange(7, oldValue, hostTopNGrantedSize);
    }

    public int getHostTopNStartTime() {
        return this.hostTopNStartTime;
    }

    public void setHostTopNStartTime(int hostTopNStartTime) {
        int oldValue = getHostTopNStartTime();
        this.hostTopNStartTime = hostTopNStartTime;
        notifyChange(8, oldValue, hostTopNStartTime);
    }

    public String getHostTopNOwner() {
        return this.hostTopNOwner;
    }

    public void setHostTopNOwner(String hostTopNOwner) {
        String oldValue = getHostTopNOwner();
        this.hostTopNOwner = hostTopNOwner;
        notifyChange(9, oldValue, hostTopNOwner);
    }

    public int getHostTopNStatus() {
        return this.hostTopNStatus;
    }

    public void setHostTopNStatus(int hostTopNStatus) {
        int oldValue = getHostTopNStatus();
        this.hostTopNStatus = hostTopNStatus;
        notifyChange(10, oldValue, hostTopNStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHostTopNControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setHostTopNHostIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setHostTopNRateBase(binding.getVariable().toInt());
                break;
            case  4 :
                setHostTopNTimeRemaining(binding.getVariable().toInt());
                break;
            case  5 :
                setHostTopNDuration(binding.getVariable().toInt());
                break;
            case  6 :
                setHostTopNRequestedSize(binding.getVariable().toInt());
                break;
            case  7 :
                setHostTopNGrantedSize(binding.getVariable().toInt());
                break;
            case  8 :
                setHostTopNStartTime(binding.getVariable().toInt());
                break;
            case  9 :
                setHostTopNOwner(binding.getVariable().toString());
                break;
            case  10 :
                setHostTopNStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHostTopNControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HostTopNControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hostTopNControlIndex", hostTopNControlIndex).append("hostTopNHostIndex", hostTopNHostIndex).append("hostTopNRateBase", hostTopNRateBase).append("hostTopNTimeRemaining", hostTopNTimeRemaining).append("hostTopNDuration", hostTopNDuration).append("hostTopNRequestedSize", hostTopNRequestedSize).append("hostTopNGrantedSize", hostTopNGrantedSize).append("hostTopNStartTime", hostTopNStartTime).append("hostTopNOwner", hostTopNOwner).append("hostTopNStatus", hostTopNStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hostTopNControlIndex).append(hostTopNHostIndex).append(hostTopNRateBase).append(hostTopNTimeRemaining).append(hostTopNDuration).append(hostTopNRequestedSize).append(hostTopNGrantedSize).append(hostTopNStartTime).append(hostTopNOwner).append(hostTopNStatus).append(_index).toHashCode();
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
        HostTopNControlEntry rhs = ((HostTopNControlEntry) obj);
        return new EqualsBuilder().append(hostTopNControlIndex, rhs.hostTopNControlIndex).append(hostTopNHostIndex, rhs.hostTopNHostIndex).append(hostTopNRateBase, rhs.hostTopNRateBase).append(hostTopNTimeRemaining, rhs.hostTopNTimeRemaining).append(hostTopNDuration, rhs.hostTopNDuration).append(hostTopNRequestedSize, rhs.hostTopNRequestedSize).append(hostTopNGrantedSize, rhs.hostTopNGrantedSize).append(hostTopNStartTime, rhs.hostTopNStartTime).append(hostTopNOwner, rhs.hostTopNOwner).append(hostTopNStatus, rhs.hostTopNStatus).append(_index, rhs._index).isEquals();
    }

    public HostTopNControlEntry clone() {
        HostTopNControlEntry _copy = new HostTopNControlEntry();
        _copy.hostTopNControlIndex = hostTopNControlIndex;
        _copy.hostTopNHostIndex = hostTopNHostIndex;
        _copy.hostTopNRateBase = hostTopNRateBase;
        _copy.hostTopNTimeRemaining = hostTopNTimeRemaining;
        _copy.hostTopNDuration = hostTopNDuration;
        _copy.hostTopNRequestedSize = hostTopNRequestedSize;
        _copy.hostTopNGrantedSize = hostTopNGrantedSize;
        _copy.hostTopNStartTime = hostTopNStartTime;
        _copy.hostTopNOwner = hostTopNOwner;
        _copy.hostTopNStatus = hostTopNStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.5.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hostTopNControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hostTopNHostIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hostTopNRateBase", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hostTopNTimeRemaining", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hostTopNDuration", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "hostTopNRequestedSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "hostTopNGrantedSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "hostTopNStartTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "hostTopNOwner", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "hostTopNStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
