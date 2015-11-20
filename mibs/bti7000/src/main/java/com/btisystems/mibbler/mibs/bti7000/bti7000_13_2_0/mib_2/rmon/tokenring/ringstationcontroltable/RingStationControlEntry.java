
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.ringstationcontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.RingStationControlTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationcontroltable.IRingStationControlEntry;
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

public class RingStationControlEntry
    extends DeviceEntity
    implements Serializable, IRingStationControlEntry, IIndexed, IVariableBindingSetter
{

    private int ringStationControlIfIndex;
    private int ringStationControlTableSize;
    private int ringStationControlActiveStations;
    private int ringStationControlRingState;
    private String ringStationControlBeaconSender;
    private String ringStationControlBeaconNAUN;
    private String ringStationControlActiveMonitor;
    private int ringStationControlOrderChanges;
    private String ringStationControlOwner;
    private int ringStationControlStatus;
    private String _index;
    private RingStationControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RingStationControlEntry() {
    }

    public int getRingStationControlIfIndex() {
        return this.ringStationControlIfIndex;
    }

    public void setRingStationControlIfIndex(int ringStationControlIfIndex) {
        int oldValue = getRingStationControlIfIndex();
        this.ringStationControlIfIndex = ringStationControlIfIndex;
        notifyChange(1, oldValue, ringStationControlIfIndex);
    }

    public int getRingStationControlTableSize() {
        return this.ringStationControlTableSize;
    }

    public void setRingStationControlTableSize(int ringStationControlTableSize) {
        int oldValue = getRingStationControlTableSize();
        this.ringStationControlTableSize = ringStationControlTableSize;
        notifyChange(2, oldValue, ringStationControlTableSize);
    }

    public int getRingStationControlActiveStations() {
        return this.ringStationControlActiveStations;
    }

    public void setRingStationControlActiveStations(int ringStationControlActiveStations) {
        int oldValue = getRingStationControlActiveStations();
        this.ringStationControlActiveStations = ringStationControlActiveStations;
        notifyChange(3, oldValue, ringStationControlActiveStations);
    }

    public int getRingStationControlRingState() {
        return this.ringStationControlRingState;
    }

    public void setRingStationControlRingState(int ringStationControlRingState) {
        int oldValue = getRingStationControlRingState();
        this.ringStationControlRingState = ringStationControlRingState;
        notifyChange(4, oldValue, ringStationControlRingState);
    }

    public String getRingStationControlBeaconSender() {
        return this.ringStationControlBeaconSender;
    }

    public void setRingStationControlBeaconSender(String ringStationControlBeaconSender) {
        String oldValue = getRingStationControlBeaconSender();
        this.ringStationControlBeaconSender = ringStationControlBeaconSender;
        notifyChange(5, oldValue, ringStationControlBeaconSender);
    }

    public String getRingStationControlBeaconNAUN() {
        return this.ringStationControlBeaconNAUN;
    }

    public void setRingStationControlBeaconNAUN(String ringStationControlBeaconNAUN) {
        String oldValue = getRingStationControlBeaconNAUN();
        this.ringStationControlBeaconNAUN = ringStationControlBeaconNAUN;
        notifyChange(6, oldValue, ringStationControlBeaconNAUN);
    }

    public String getRingStationControlActiveMonitor() {
        return this.ringStationControlActiveMonitor;
    }

    public void setRingStationControlActiveMonitor(String ringStationControlActiveMonitor) {
        String oldValue = getRingStationControlActiveMonitor();
        this.ringStationControlActiveMonitor = ringStationControlActiveMonitor;
        notifyChange(7, oldValue, ringStationControlActiveMonitor);
    }

    public int getRingStationControlOrderChanges() {
        return this.ringStationControlOrderChanges;
    }

    public void setRingStationControlOrderChanges(int ringStationControlOrderChanges) {
        int oldValue = getRingStationControlOrderChanges();
        this.ringStationControlOrderChanges = ringStationControlOrderChanges;
        notifyChange(8, oldValue, ringStationControlOrderChanges);
    }

    public String getRingStationControlOwner() {
        return this.ringStationControlOwner;
    }

    public void setRingStationControlOwner(String ringStationControlOwner) {
        String oldValue = getRingStationControlOwner();
        this.ringStationControlOwner = ringStationControlOwner;
        notifyChange(9, oldValue, ringStationControlOwner);
    }

    public int getRingStationControlStatus() {
        return this.ringStationControlStatus;
    }

    public void setRingStationControlStatus(int ringStationControlStatus) {
        int oldValue = getRingStationControlStatus();
        this.ringStationControlStatus = ringStationControlStatus;
        notifyChange(10, oldValue, ringStationControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setRingStationControlIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setRingStationControlTableSize(binding.getVariable().toInt());
                break;
            case  3 :
                setRingStationControlActiveStations(binding.getVariable().toInt());
                break;
            case  4 :
                setRingStationControlRingState(binding.getVariable().toInt());
                break;
            case  5 :
                setRingStationControlBeaconSender(binding.getVariable().toString());
                break;
            case  6 :
                setRingStationControlBeaconNAUN(binding.getVariable().toString());
                break;
            case  7 :
                setRingStationControlActiveMonitor(binding.getVariable().toString());
                break;
            case  8 :
                setRingStationControlOrderChanges(binding.getVariable().toInt());
                break;
            case  9 :
                setRingStationControlOwner(binding.getVariable().toString());
                break;
            case  10 :
                setRingStationControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setRingStationControlIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(RingStationControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ringStationControlIfIndex", ringStationControlIfIndex).append("ringStationControlTableSize", ringStationControlTableSize).append("ringStationControlActiveStations", ringStationControlActiveStations).append("ringStationControlRingState", ringStationControlRingState).append("ringStationControlBeaconSender", ringStationControlBeaconSender).append("ringStationControlBeaconNAUN", ringStationControlBeaconNAUN).append("ringStationControlActiveMonitor", ringStationControlActiveMonitor).append("ringStationControlOrderChanges", ringStationControlOrderChanges).append("ringStationControlOwner", ringStationControlOwner).append("ringStationControlStatus", ringStationControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ringStationControlIfIndex).append(ringStationControlTableSize).append(ringStationControlActiveStations).append(ringStationControlRingState).append(ringStationControlBeaconSender).append(ringStationControlBeaconNAUN).append(ringStationControlActiveMonitor).append(ringStationControlOrderChanges).append(ringStationControlOwner).append(ringStationControlStatus).append(_index).toHashCode();
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
        RingStationControlEntry rhs = ((RingStationControlEntry) obj);
        return new EqualsBuilder().append(ringStationControlIfIndex, rhs.ringStationControlIfIndex).append(ringStationControlTableSize, rhs.ringStationControlTableSize).append(ringStationControlActiveStations, rhs.ringStationControlActiveStations).append(ringStationControlRingState, rhs.ringStationControlRingState).append(ringStationControlBeaconSender, rhs.ringStationControlBeaconSender).append(ringStationControlBeaconNAUN, rhs.ringStationControlBeaconNAUN).append(ringStationControlActiveMonitor, rhs.ringStationControlActiveMonitor).append(ringStationControlOrderChanges, rhs.ringStationControlOrderChanges).append(ringStationControlOwner, rhs.ringStationControlOwner).append(ringStationControlStatus, rhs.ringStationControlStatus).append(_index, rhs._index).isEquals();
    }

    public RingStationControlEntry clone() {
        RingStationControlEntry _copy = new RingStationControlEntry();
        _copy.ringStationControlIfIndex = ringStationControlIfIndex;
        _copy.ringStationControlTableSize = ringStationControlTableSize;
        _copy.ringStationControlActiveStations = ringStationControlActiveStations;
        _copy.ringStationControlRingState = ringStationControlRingState;
        _copy.ringStationControlBeaconSender = ringStationControlBeaconSender;
        _copy.ringStationControlBeaconNAUN = ringStationControlBeaconNAUN;
        _copy.ringStationControlActiveMonitor = ringStationControlActiveMonitor;
        _copy.ringStationControlOrderChanges = ringStationControlOrderChanges;
        _copy.ringStationControlOwner = ringStationControlOwner;
        _copy.ringStationControlStatus = ringStationControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ringStationControlIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ringStationControlTableSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ringStationControlActiveStations", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ringStationControlRingState", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ringStationControlBeaconSender", DeviceEntityDescription.FieldType.STRING, 24));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ringStationControlBeaconNAUN", DeviceEntityDescription.FieldType.STRING, 24));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ringStationControlActiveMonitor", DeviceEntityDescription.FieldType.STRING, 24));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ringStationControlOrderChanges", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ringStationControlOwner", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ringStationControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
