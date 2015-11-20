
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.ringstationconfigtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.RingStationConfigTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationconfigtable.IRingStationConfigEntry;
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

public class RingStationConfigEntry
    extends DeviceEntity
    implements Serializable, IRingStationConfigEntry, IIndexed, IVariableBindingSetter
{

    private int ringStationConfigIfIndex;
    private String ringStationConfigMacAddress;
    private int ringStationConfigUpdateTime;
    private String ringStationConfigLocation;
    private String ringStationConfigMicrocode;
    private String ringStationConfigGroupAddress;
    private String ringStationConfigFunctionalAddress;
    private String _index;
    private RingStationConfigTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RingStationConfigEntry() {
    }

    public int getRingStationConfigIfIndex() {
        return this.ringStationConfigIfIndex;
    }

    public void setRingStationConfigIfIndex(int ringStationConfigIfIndex) {
        int oldValue = getRingStationConfigIfIndex();
        this.ringStationConfigIfIndex = ringStationConfigIfIndex;
        notifyChange(1, oldValue, ringStationConfigIfIndex);
    }

    public String getRingStationConfigMacAddress() {
        return this.ringStationConfigMacAddress;
    }

    public void setRingStationConfigMacAddress(String ringStationConfigMacAddress) {
        String oldValue = getRingStationConfigMacAddress();
        this.ringStationConfigMacAddress = ringStationConfigMacAddress;
        notifyChange(2, oldValue, ringStationConfigMacAddress);
    }

    public int getRingStationConfigUpdateTime() {
        return this.ringStationConfigUpdateTime;
    }

    public void setRingStationConfigUpdateTime(int ringStationConfigUpdateTime) {
        int oldValue = getRingStationConfigUpdateTime();
        this.ringStationConfigUpdateTime = ringStationConfigUpdateTime;
        notifyChange(3, oldValue, ringStationConfigUpdateTime);
    }

    public String getRingStationConfigLocation() {
        return this.ringStationConfigLocation;
    }

    public void setRingStationConfigLocation(String ringStationConfigLocation) {
        String oldValue = getRingStationConfigLocation();
        this.ringStationConfigLocation = ringStationConfigLocation;
        notifyChange(4, oldValue, ringStationConfigLocation);
    }

    public String getRingStationConfigMicrocode() {
        return this.ringStationConfigMicrocode;
    }

    public void setRingStationConfigMicrocode(String ringStationConfigMicrocode) {
        String oldValue = getRingStationConfigMicrocode();
        this.ringStationConfigMicrocode = ringStationConfigMicrocode;
        notifyChange(5, oldValue, ringStationConfigMicrocode);
    }

    public String getRingStationConfigGroupAddress() {
        return this.ringStationConfigGroupAddress;
    }

    public void setRingStationConfigGroupAddress(String ringStationConfigGroupAddress) {
        String oldValue = getRingStationConfigGroupAddress();
        this.ringStationConfigGroupAddress = ringStationConfigGroupAddress;
        notifyChange(6, oldValue, ringStationConfigGroupAddress);
    }

    public String getRingStationConfigFunctionalAddress() {
        return this.ringStationConfigFunctionalAddress;
    }

    public void setRingStationConfigFunctionalAddress(String ringStationConfigFunctionalAddress) {
        String oldValue = getRingStationConfigFunctionalAddress();
        this.ringStationConfigFunctionalAddress = ringStationConfigFunctionalAddress;
        notifyChange(7, oldValue, ringStationConfigFunctionalAddress);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setRingStationConfigIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setRingStationConfigMacAddress(binding.getVariable().toString());
                break;
            case  3 :
                setRingStationConfigUpdateTime(binding.getVariable().toInt());
                break;
            case  4 :
                setRingStationConfigLocation(binding.getVariable().toString());
                break;
            case  5 :
                setRingStationConfigMicrocode(binding.getVariable().toString());
                break;
            case  6 :
                setRingStationConfigGroupAddress(binding.getVariable().toString());
                break;
            case  7 :
                setRingStationConfigFunctionalAddress(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setRingStationConfigIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setRingStationConfigMacAddress(_getMacAddress(_oidInts, arrayOffset, 6));
        arrayOffset += 6;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(RingStationConfigTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ringStationConfigIfIndex", ringStationConfigIfIndex).append("ringStationConfigMacAddress", ringStationConfigMacAddress).append("ringStationConfigUpdateTime", ringStationConfigUpdateTime).append("ringStationConfigLocation", ringStationConfigLocation).append("ringStationConfigMicrocode", ringStationConfigMicrocode).append("ringStationConfigGroupAddress", ringStationConfigGroupAddress).append("ringStationConfigFunctionalAddress", ringStationConfigFunctionalAddress).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ringStationConfigIfIndex).append(ringStationConfigMacAddress).append(ringStationConfigUpdateTime).append(ringStationConfigLocation).append(ringStationConfigMicrocode).append(ringStationConfigGroupAddress).append(ringStationConfigFunctionalAddress).append(_index).toHashCode();
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
        RingStationConfigEntry rhs = ((RingStationConfigEntry) obj);
        return new EqualsBuilder().append(ringStationConfigIfIndex, rhs.ringStationConfigIfIndex).append(ringStationConfigMacAddress, rhs.ringStationConfigMacAddress).append(ringStationConfigUpdateTime, rhs.ringStationConfigUpdateTime).append(ringStationConfigLocation, rhs.ringStationConfigLocation).append(ringStationConfigMicrocode, rhs.ringStationConfigMicrocode).append(ringStationConfigGroupAddress, rhs.ringStationConfigGroupAddress).append(ringStationConfigFunctionalAddress, rhs.ringStationConfigFunctionalAddress).append(_index, rhs._index).isEquals();
    }

    public RingStationConfigEntry clone() {
        RingStationConfigEntry _copy = new RingStationConfigEntry();
        _copy.ringStationConfigIfIndex = ringStationConfigIfIndex;
        _copy.ringStationConfigMacAddress = ringStationConfigMacAddress;
        _copy.ringStationConfigUpdateTime = ringStationConfigUpdateTime;
        _copy.ringStationConfigLocation = ringStationConfigLocation;
        _copy.ringStationConfigMicrocode = ringStationConfigMicrocode;
        _copy.ringStationConfigGroupAddress = ringStationConfigGroupAddress;
        _copy.ringStationConfigFunctionalAddress = ringStationConfigFunctionalAddress;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ringStationConfigIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ringStationConfigMacAddress", DeviceEntityDescription.FieldType.STRING, 24));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ringStationConfigUpdateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ringStationConfigLocation", DeviceEntityDescription.FieldType.STRING, 16));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ringStationConfigMicrocode", DeviceEntityDescription.FieldType.STRING, 40));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ringStationConfigGroupAddress", DeviceEntityDescription.FieldType.STRING, 16));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ringStationConfigFunctionalAddress", DeviceEntityDescription.FieldType.STRING, 16));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
