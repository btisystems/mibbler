
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.hosttopn.hosttopntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.hosttopn.HostTopNTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.hosttopn.hosttopntable.IHostTopNEntry;
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

public class HostTopNEntry
    extends DeviceEntity
    implements Serializable, IHostTopNEntry, IIndexed, IVariableBindingSetter
{

    private int hostTopNReport;
    private int hostTopNIndex;
    private String hostTopNAddress;
    private int hostTopNRate;
    private String _index;
    private HostTopNTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HostTopNEntry() {
    }

    public int getHostTopNReport() {
        return this.hostTopNReport;
    }

    public void setHostTopNReport(int hostTopNReport) {
        int oldValue = getHostTopNReport();
        this.hostTopNReport = hostTopNReport;
        notifyChange(1, oldValue, hostTopNReport);
    }

    public int getHostTopNIndex() {
        return this.hostTopNIndex;
    }

    public void setHostTopNIndex(int hostTopNIndex) {
        int oldValue = getHostTopNIndex();
        this.hostTopNIndex = hostTopNIndex;
        notifyChange(2, oldValue, hostTopNIndex);
    }

    public String getHostTopNAddress() {
        return this.hostTopNAddress;
    }

    public void setHostTopNAddress(String hostTopNAddress) {
        String oldValue = getHostTopNAddress();
        this.hostTopNAddress = hostTopNAddress;
        notifyChange(3, oldValue, hostTopNAddress);
    }

    public int getHostTopNRate() {
        return this.hostTopNRate;
    }

    public void setHostTopNRate(int hostTopNRate) {
        int oldValue = getHostTopNRate();
        this.hostTopNRate = hostTopNRate;
        notifyChange(4, oldValue, hostTopNRate);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHostTopNReport(binding.getVariable().toInt());
                break;
            case  2 :
                setHostTopNIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setHostTopNAddress(binding.getVariable().toString());
                break;
            case  4 :
                setHostTopNRate(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHostTopNReport(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setHostTopNIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HostTopNTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hostTopNReport", hostTopNReport).append("hostTopNIndex", hostTopNIndex).append("hostTopNAddress", hostTopNAddress).append("hostTopNRate", hostTopNRate).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hostTopNReport).append(hostTopNIndex).append(hostTopNAddress).append(hostTopNRate).append(_index).toHashCode();
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
        HostTopNEntry rhs = ((HostTopNEntry) obj);
        return new EqualsBuilder().append(hostTopNReport, rhs.hostTopNReport).append(hostTopNIndex, rhs.hostTopNIndex).append(hostTopNAddress, rhs.hostTopNAddress).append(hostTopNRate, rhs.hostTopNRate).append(_index, rhs._index).isEquals();
    }

    public HostTopNEntry clone() {
        HostTopNEntry _copy = new HostTopNEntry();
        _copy.hostTopNReport = hostTopNReport;
        _copy.hostTopNIndex = hostTopNIndex;
        _copy.hostTopNAddress = hostTopNAddress;
        _copy.hostTopNRate = hostTopNRate;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.5.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hostTopNReport", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hostTopNIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hostTopNAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hostTopNRate", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
