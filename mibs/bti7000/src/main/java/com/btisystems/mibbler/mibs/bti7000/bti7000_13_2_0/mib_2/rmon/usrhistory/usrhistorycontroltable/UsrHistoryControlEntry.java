
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.usrhistory.usrhistorycontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.usrhistory.UsrHistoryControlTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.usrhistory.usrhistorycontroltable.IUsrHistoryControlEntry;
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

public class UsrHistoryControlEntry
    extends DeviceEntity
    implements Serializable, IUsrHistoryControlEntry, IIndexed, IVariableBindingSetter
{

    private int usrHistoryControlIndex;
    private int usrHistoryControlObjects;
    private Integer usrHistoryControlBucketsRequested;
    private int usrHistoryControlBucketsGranted;
    private Integer usrHistoryControlInterval;
    private String usrHistoryControlOwner;
    private int usrHistoryControlStatus;
    private String _index;
    private UsrHistoryControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public UsrHistoryControlEntry() {
    }

    public int getUsrHistoryControlIndex() {
        return this.usrHistoryControlIndex;
    }

    public void setUsrHistoryControlIndex(int usrHistoryControlIndex) {
        int oldValue = getUsrHistoryControlIndex();
        this.usrHistoryControlIndex = usrHistoryControlIndex;
        notifyChange(1, oldValue, usrHistoryControlIndex);
    }

    public int getUsrHistoryControlObjects() {
        return this.usrHistoryControlObjects;
    }

    public void setUsrHistoryControlObjects(int usrHistoryControlObjects) {
        int oldValue = getUsrHistoryControlObjects();
        this.usrHistoryControlObjects = usrHistoryControlObjects;
        notifyChange(2, oldValue, usrHistoryControlObjects);
    }

    public int getUsrHistoryControlBucketsRequested() {
        if (this.usrHistoryControlBucketsRequested == null) {
            return  50;
        }
        return this.usrHistoryControlBucketsRequested;
    }

    public boolean isUsrHistoryControlBucketsRequestedDefined() {
        return (this.usrHistoryControlBucketsRequested!= null);
    }

    public void setUsrHistoryControlBucketsRequested(int usrHistoryControlBucketsRequested) {
        int oldValue = getUsrHistoryControlBucketsRequested();
        this.usrHistoryControlBucketsRequested = usrHistoryControlBucketsRequested;
        notifyChange(3, oldValue, usrHistoryControlBucketsRequested);
    }

    public int getUsrHistoryControlBucketsGranted() {
        return this.usrHistoryControlBucketsGranted;
    }

    public void setUsrHistoryControlBucketsGranted(int usrHistoryControlBucketsGranted) {
        int oldValue = getUsrHistoryControlBucketsGranted();
        this.usrHistoryControlBucketsGranted = usrHistoryControlBucketsGranted;
        notifyChange(4, oldValue, usrHistoryControlBucketsGranted);
    }

    public int getUsrHistoryControlInterval() {
        if (this.usrHistoryControlInterval == null) {
            return  1800;
        }
        return this.usrHistoryControlInterval;
    }

    public boolean isUsrHistoryControlIntervalDefined() {
        return (this.usrHistoryControlInterval!= null);
    }

    public void setUsrHistoryControlInterval(int usrHistoryControlInterval) {
        int oldValue = getUsrHistoryControlInterval();
        this.usrHistoryControlInterval = usrHistoryControlInterval;
        notifyChange(5, oldValue, usrHistoryControlInterval);
    }

    public String getUsrHistoryControlOwner() {
        return this.usrHistoryControlOwner;
    }

    public void setUsrHistoryControlOwner(String usrHistoryControlOwner) {
        String oldValue = getUsrHistoryControlOwner();
        this.usrHistoryControlOwner = usrHistoryControlOwner;
        notifyChange(6, oldValue, usrHistoryControlOwner);
    }

    public int getUsrHistoryControlStatus() {
        return this.usrHistoryControlStatus;
    }

    public void setUsrHistoryControlStatus(int usrHistoryControlStatus) {
        int oldValue = getUsrHistoryControlStatus();
        this.usrHistoryControlStatus = usrHistoryControlStatus;
        notifyChange(7, oldValue, usrHistoryControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setUsrHistoryControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setUsrHistoryControlObjects(binding.getVariable().toInt());
                break;
            case  3 :
                setUsrHistoryControlBucketsRequested(binding.getVariable().toInt());
                break;
            case  4 :
                setUsrHistoryControlBucketsGranted(binding.getVariable().toInt());
                break;
            case  5 :
                setUsrHistoryControlInterval(binding.getVariable().toInt());
                break;
            case  6 :
                setUsrHistoryControlOwner(binding.getVariable().toString());
                break;
            case  7 :
                setUsrHistoryControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setUsrHistoryControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(UsrHistoryControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("usrHistoryControlIndex", usrHistoryControlIndex).append("usrHistoryControlObjects", usrHistoryControlObjects).append("usrHistoryControlBucketsRequested", usrHistoryControlBucketsRequested).append("usrHistoryControlBucketsGranted", usrHistoryControlBucketsGranted).append("usrHistoryControlInterval", usrHistoryControlInterval).append("usrHistoryControlOwner", usrHistoryControlOwner).append("usrHistoryControlStatus", usrHistoryControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(usrHistoryControlIndex).append(usrHistoryControlObjects).append(usrHistoryControlBucketsRequested).append(usrHistoryControlBucketsGranted).append(usrHistoryControlInterval).append(usrHistoryControlOwner).append(usrHistoryControlStatus).append(_index).toHashCode();
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
        UsrHistoryControlEntry rhs = ((UsrHistoryControlEntry) obj);
        return new EqualsBuilder().append(usrHistoryControlIndex, rhs.usrHistoryControlIndex).append(usrHistoryControlObjects, rhs.usrHistoryControlObjects).append(usrHistoryControlBucketsRequested, rhs.usrHistoryControlBucketsRequested).append(usrHistoryControlBucketsGranted, rhs.usrHistoryControlBucketsGranted).append(usrHistoryControlInterval, rhs.usrHistoryControlInterval).append(usrHistoryControlOwner, rhs.usrHistoryControlOwner).append(usrHistoryControlStatus, rhs.usrHistoryControlStatus).append(_index, rhs._index).isEquals();
    }

    public UsrHistoryControlEntry clone() {
        UsrHistoryControlEntry _copy = new UsrHistoryControlEntry();
        _copy.usrHistoryControlIndex = usrHistoryControlIndex;
        _copy.usrHistoryControlObjects = usrHistoryControlObjects;
        _copy.usrHistoryControlBucketsRequested = usrHistoryControlBucketsRequested;
        _copy.usrHistoryControlBucketsGranted = usrHistoryControlBucketsGranted;
        _copy.usrHistoryControlInterval = usrHistoryControlInterval;
        _copy.usrHistoryControlOwner = usrHistoryControlOwner;
        _copy.usrHistoryControlStatus = usrHistoryControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.18.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "usrHistoryControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "usrHistoryControlObjects", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "usrHistoryControlBucketsRequested", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "usrHistoryControlBucketsGranted", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "usrHistoryControlInterval", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "usrHistoryControlOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "usrHistoryControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
