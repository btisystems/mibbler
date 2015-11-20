
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosts.hostcontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.hosts.hostcontroltable.IHostControlEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.hosts.HostControlTable;
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

public class HostControlEntry
    extends DeviceEntity
    implements Serializable, IHostControlEntry, IIndexed, IVariableBindingSetter
{

    private int hostControlIndex;
    private String hostControlDataSource;
    private int hostControlTableSize;
    private int hostControlLastDeleteTime;
    private String hostControlOwner;
    private int hostControlStatus;
    private String _index;
    private HostControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HostControlEntry() {
    }

    public int getHostControlIndex() {
        return this.hostControlIndex;
    }

    public void setHostControlIndex(int hostControlIndex) {
        int oldValue = getHostControlIndex();
        this.hostControlIndex = hostControlIndex;
        notifyChange(1, oldValue, hostControlIndex);
    }

    public String getHostControlDataSource() {
        return this.hostControlDataSource;
    }

    public void setHostControlDataSource(String hostControlDataSource) {
        String oldValue = getHostControlDataSource();
        this.hostControlDataSource = hostControlDataSource;
        notifyChange(2, oldValue, hostControlDataSource);
    }

    public int getHostControlTableSize() {
        return this.hostControlTableSize;
    }

    public void setHostControlTableSize(int hostControlTableSize) {
        int oldValue = getHostControlTableSize();
        this.hostControlTableSize = hostControlTableSize;
        notifyChange(3, oldValue, hostControlTableSize);
    }

    public int getHostControlLastDeleteTime() {
        return this.hostControlLastDeleteTime;
    }

    public void setHostControlLastDeleteTime(int hostControlLastDeleteTime) {
        int oldValue = getHostControlLastDeleteTime();
        this.hostControlLastDeleteTime = hostControlLastDeleteTime;
        notifyChange(4, oldValue, hostControlLastDeleteTime);
    }

    public String getHostControlOwner() {
        return this.hostControlOwner;
    }

    public void setHostControlOwner(String hostControlOwner) {
        String oldValue = getHostControlOwner();
        this.hostControlOwner = hostControlOwner;
        notifyChange(5, oldValue, hostControlOwner);
    }

    public int getHostControlStatus() {
        return this.hostControlStatus;
    }

    public void setHostControlStatus(int hostControlStatus) {
        int oldValue = getHostControlStatus();
        this.hostControlStatus = hostControlStatus;
        notifyChange(6, oldValue, hostControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHostControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setHostControlDataSource(binding.getVariable().toString());
                break;
            case  3 :
                setHostControlTableSize(binding.getVariable().toInt());
                break;
            case  4 :
                setHostControlLastDeleteTime(binding.getVariable().toInt());
                break;
            case  5 :
                setHostControlOwner(binding.getVariable().toString());
                break;
            case  6 :
                setHostControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHostControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HostControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hostControlIndex", hostControlIndex).append("hostControlDataSource", hostControlDataSource).append("hostControlTableSize", hostControlTableSize).append("hostControlLastDeleteTime", hostControlLastDeleteTime).append("hostControlOwner", hostControlOwner).append("hostControlStatus", hostControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hostControlIndex).append(hostControlDataSource).append(hostControlTableSize).append(hostControlLastDeleteTime).append(hostControlOwner).append(hostControlStatus).append(_index).toHashCode();
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
        HostControlEntry rhs = ((HostControlEntry) obj);
        return new EqualsBuilder().append(hostControlIndex, rhs.hostControlIndex).append(hostControlDataSource, rhs.hostControlDataSource).append(hostControlTableSize, rhs.hostControlTableSize).append(hostControlLastDeleteTime, rhs.hostControlLastDeleteTime).append(hostControlOwner, rhs.hostControlOwner).append(hostControlStatus, rhs.hostControlStatus).append(_index, rhs._index).isEquals();
    }

    public HostControlEntry clone() {
        HostControlEntry _copy = new HostControlEntry();
        _copy.hostControlIndex = hostControlIndex;
        _copy.hostControlDataSource = hostControlDataSource;
        _copy.hostControlTableSize = hostControlTableSize;
        _copy.hostControlLastDeleteTime = hostControlLastDeleteTime;
        _copy.hostControlOwner = hostControlOwner;
        _copy.hostControlStatus = hostControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.4.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hostControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hostControlDataSource", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hostControlTableSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hostControlLastDeleteTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hostControlOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "hostControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
