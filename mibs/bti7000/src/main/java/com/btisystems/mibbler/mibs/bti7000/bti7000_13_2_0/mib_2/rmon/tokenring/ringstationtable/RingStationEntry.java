
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.ringstationtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.RingStationTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationtable.IRingStationEntry;
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

public class RingStationEntry
    extends DeviceEntity
    implements Serializable, IRingStationEntry, IIndexed, IVariableBindingSetter
{

    private int ringStationIfIndex;
    private String ringStationMacAddress;
    private String ringStationLastNAUN;
    private int ringStationStationStatus;
    private int ringStationLastEnterTime;
    private int ringStationLastExitTime;
    private int ringStationDuplicateAddresses;
    private int ringStationInLineErrors;
    private int ringStationOutLineErrors;
    private int ringStationInternalErrors;
    private int ringStationInBurstErrors;
    private int ringStationOutBurstErrors;
    private int ringStationACErrors;
    private int ringStationAbortErrors;
    private int ringStationLostFrameErrors;
    private int ringStationCongestionErrors;
    private int ringStationFrameCopiedErrors;
    private int ringStationFrequencyErrors;
    private int ringStationTokenErrors;
    private int ringStationInBeaconErrors;
    private int ringStationOutBeaconErrors;
    private int ringStationInsertions;
    private String _index;
    private RingStationTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RingStationEntry() {
    }

    public int getRingStationIfIndex() {
        return this.ringStationIfIndex;
    }

    public void setRingStationIfIndex(int ringStationIfIndex) {
        int oldValue = getRingStationIfIndex();
        this.ringStationIfIndex = ringStationIfIndex;
        notifyChange(1, oldValue, ringStationIfIndex);
    }

    public String getRingStationMacAddress() {
        return this.ringStationMacAddress;
    }

    public void setRingStationMacAddress(String ringStationMacAddress) {
        String oldValue = getRingStationMacAddress();
        this.ringStationMacAddress = ringStationMacAddress;
        notifyChange(2, oldValue, ringStationMacAddress);
    }

    public String getRingStationLastNAUN() {
        return this.ringStationLastNAUN;
    }

    public void setRingStationLastNAUN(String ringStationLastNAUN) {
        String oldValue = getRingStationLastNAUN();
        this.ringStationLastNAUN = ringStationLastNAUN;
        notifyChange(3, oldValue, ringStationLastNAUN);
    }

    public int getRingStationStationStatus() {
        return this.ringStationStationStatus;
    }

    public void setRingStationStationStatus(int ringStationStationStatus) {
        int oldValue = getRingStationStationStatus();
        this.ringStationStationStatus = ringStationStationStatus;
        notifyChange(4, oldValue, ringStationStationStatus);
    }

    public int getRingStationLastEnterTime() {
        return this.ringStationLastEnterTime;
    }

    public void setRingStationLastEnterTime(int ringStationLastEnterTime) {
        int oldValue = getRingStationLastEnterTime();
        this.ringStationLastEnterTime = ringStationLastEnterTime;
        notifyChange(5, oldValue, ringStationLastEnterTime);
    }

    public int getRingStationLastExitTime() {
        return this.ringStationLastExitTime;
    }

    public void setRingStationLastExitTime(int ringStationLastExitTime) {
        int oldValue = getRingStationLastExitTime();
        this.ringStationLastExitTime = ringStationLastExitTime;
        notifyChange(6, oldValue, ringStationLastExitTime);
    }

    public int getRingStationDuplicateAddresses() {
        return this.ringStationDuplicateAddresses;
    }

    public void setRingStationDuplicateAddresses(int ringStationDuplicateAddresses) {
        int oldValue = getRingStationDuplicateAddresses();
        this.ringStationDuplicateAddresses = ringStationDuplicateAddresses;
        notifyChange(7, oldValue, ringStationDuplicateAddresses);
    }

    public int getRingStationInLineErrors() {
        return this.ringStationInLineErrors;
    }

    public void setRingStationInLineErrors(int ringStationInLineErrors) {
        int oldValue = getRingStationInLineErrors();
        this.ringStationInLineErrors = ringStationInLineErrors;
        notifyChange(8, oldValue, ringStationInLineErrors);
    }

    public int getRingStationOutLineErrors() {
        return this.ringStationOutLineErrors;
    }

    public void setRingStationOutLineErrors(int ringStationOutLineErrors) {
        int oldValue = getRingStationOutLineErrors();
        this.ringStationOutLineErrors = ringStationOutLineErrors;
        notifyChange(9, oldValue, ringStationOutLineErrors);
    }

    public int getRingStationInternalErrors() {
        return this.ringStationInternalErrors;
    }

    public void setRingStationInternalErrors(int ringStationInternalErrors) {
        int oldValue = getRingStationInternalErrors();
        this.ringStationInternalErrors = ringStationInternalErrors;
        notifyChange(10, oldValue, ringStationInternalErrors);
    }

    public int getRingStationInBurstErrors() {
        return this.ringStationInBurstErrors;
    }

    public void setRingStationInBurstErrors(int ringStationInBurstErrors) {
        int oldValue = getRingStationInBurstErrors();
        this.ringStationInBurstErrors = ringStationInBurstErrors;
        notifyChange(11, oldValue, ringStationInBurstErrors);
    }

    public int getRingStationOutBurstErrors() {
        return this.ringStationOutBurstErrors;
    }

    public void setRingStationOutBurstErrors(int ringStationOutBurstErrors) {
        int oldValue = getRingStationOutBurstErrors();
        this.ringStationOutBurstErrors = ringStationOutBurstErrors;
        notifyChange(12, oldValue, ringStationOutBurstErrors);
    }

    public int getRingStationACErrors() {
        return this.ringStationACErrors;
    }

    public void setRingStationACErrors(int ringStationACErrors) {
        int oldValue = getRingStationACErrors();
        this.ringStationACErrors = ringStationACErrors;
        notifyChange(13, oldValue, ringStationACErrors);
    }

    public int getRingStationAbortErrors() {
        return this.ringStationAbortErrors;
    }

    public void setRingStationAbortErrors(int ringStationAbortErrors) {
        int oldValue = getRingStationAbortErrors();
        this.ringStationAbortErrors = ringStationAbortErrors;
        notifyChange(14, oldValue, ringStationAbortErrors);
    }

    public int getRingStationLostFrameErrors() {
        return this.ringStationLostFrameErrors;
    }

    public void setRingStationLostFrameErrors(int ringStationLostFrameErrors) {
        int oldValue = getRingStationLostFrameErrors();
        this.ringStationLostFrameErrors = ringStationLostFrameErrors;
        notifyChange(15, oldValue, ringStationLostFrameErrors);
    }

    public int getRingStationCongestionErrors() {
        return this.ringStationCongestionErrors;
    }

    public void setRingStationCongestionErrors(int ringStationCongestionErrors) {
        int oldValue = getRingStationCongestionErrors();
        this.ringStationCongestionErrors = ringStationCongestionErrors;
        notifyChange(16, oldValue, ringStationCongestionErrors);
    }

    public int getRingStationFrameCopiedErrors() {
        return this.ringStationFrameCopiedErrors;
    }

    public void setRingStationFrameCopiedErrors(int ringStationFrameCopiedErrors) {
        int oldValue = getRingStationFrameCopiedErrors();
        this.ringStationFrameCopiedErrors = ringStationFrameCopiedErrors;
        notifyChange(17, oldValue, ringStationFrameCopiedErrors);
    }

    public int getRingStationFrequencyErrors() {
        return this.ringStationFrequencyErrors;
    }

    public void setRingStationFrequencyErrors(int ringStationFrequencyErrors) {
        int oldValue = getRingStationFrequencyErrors();
        this.ringStationFrequencyErrors = ringStationFrequencyErrors;
        notifyChange(18, oldValue, ringStationFrequencyErrors);
    }

    public int getRingStationTokenErrors() {
        return this.ringStationTokenErrors;
    }

    public void setRingStationTokenErrors(int ringStationTokenErrors) {
        int oldValue = getRingStationTokenErrors();
        this.ringStationTokenErrors = ringStationTokenErrors;
        notifyChange(19, oldValue, ringStationTokenErrors);
    }

    public int getRingStationInBeaconErrors() {
        return this.ringStationInBeaconErrors;
    }

    public void setRingStationInBeaconErrors(int ringStationInBeaconErrors) {
        int oldValue = getRingStationInBeaconErrors();
        this.ringStationInBeaconErrors = ringStationInBeaconErrors;
        notifyChange(20, oldValue, ringStationInBeaconErrors);
    }

    public int getRingStationOutBeaconErrors() {
        return this.ringStationOutBeaconErrors;
    }

    public void setRingStationOutBeaconErrors(int ringStationOutBeaconErrors) {
        int oldValue = getRingStationOutBeaconErrors();
        this.ringStationOutBeaconErrors = ringStationOutBeaconErrors;
        notifyChange(21, oldValue, ringStationOutBeaconErrors);
    }

    public int getRingStationInsertions() {
        return this.ringStationInsertions;
    }

    public void setRingStationInsertions(int ringStationInsertions) {
        int oldValue = getRingStationInsertions();
        this.ringStationInsertions = ringStationInsertions;
        notifyChange(22, oldValue, ringStationInsertions);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setRingStationIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setRingStationMacAddress(binding.getVariable().toString());
                break;
            case  3 :
                setRingStationLastNAUN(binding.getVariable().toString());
                break;
            case  4 :
                setRingStationStationStatus(binding.getVariable().toInt());
                break;
            case  5 :
                setRingStationLastEnterTime(binding.getVariable().toInt());
                break;
            case  6 :
                setRingStationLastExitTime(binding.getVariable().toInt());
                break;
            case  7 :
                setRingStationDuplicateAddresses(binding.getVariable().toInt());
                break;
            case  8 :
                setRingStationInLineErrors(binding.getVariable().toInt());
                break;
            case  9 :
                setRingStationOutLineErrors(binding.getVariable().toInt());
                break;
            case  10 :
                setRingStationInternalErrors(binding.getVariable().toInt());
                break;
            case  11 :
                setRingStationInBurstErrors(binding.getVariable().toInt());
                break;
            case  12 :
                setRingStationOutBurstErrors(binding.getVariable().toInt());
                break;
            case  13 :
                setRingStationACErrors(binding.getVariable().toInt());
                break;
            case  14 :
                setRingStationAbortErrors(binding.getVariable().toInt());
                break;
            case  15 :
                setRingStationLostFrameErrors(binding.getVariable().toInt());
                break;
            case  16 :
                setRingStationCongestionErrors(binding.getVariable().toInt());
                break;
            case  17 :
                setRingStationFrameCopiedErrors(binding.getVariable().toInt());
                break;
            case  18 :
                setRingStationFrequencyErrors(binding.getVariable().toInt());
                break;
            case  19 :
                setRingStationTokenErrors(binding.getVariable().toInt());
                break;
            case  20 :
                setRingStationInBeaconErrors(binding.getVariable().toInt());
                break;
            case  21 :
                setRingStationOutBeaconErrors(binding.getVariable().toInt());
                break;
            case  22 :
                setRingStationInsertions(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setRingStationIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setRingStationMacAddress(_getMacAddress(_oidInts, arrayOffset, 6));
        arrayOffset += 6;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(RingStationTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ringStationIfIndex", ringStationIfIndex).append("ringStationMacAddress", ringStationMacAddress).append("ringStationLastNAUN", ringStationLastNAUN).append("ringStationStationStatus", ringStationStationStatus).append("ringStationLastEnterTime", ringStationLastEnterTime).append("ringStationLastExitTime", ringStationLastExitTime).append("ringStationDuplicateAddresses", ringStationDuplicateAddresses).append("ringStationInLineErrors", ringStationInLineErrors).append("ringStationOutLineErrors", ringStationOutLineErrors).append("ringStationInternalErrors", ringStationInternalErrors).append("ringStationInBurstErrors", ringStationInBurstErrors).append("ringStationOutBurstErrors", ringStationOutBurstErrors).append("ringStationACErrors", ringStationACErrors).append("ringStationAbortErrors", ringStationAbortErrors).append("ringStationLostFrameErrors", ringStationLostFrameErrors).append("ringStationCongestionErrors", ringStationCongestionErrors).append("ringStationFrameCopiedErrors", ringStationFrameCopiedErrors).append("ringStationFrequencyErrors", ringStationFrequencyErrors).append("ringStationTokenErrors", ringStationTokenErrors).append("ringStationInBeaconErrors", ringStationInBeaconErrors).append("ringStationOutBeaconErrors", ringStationOutBeaconErrors).append("ringStationInsertions", ringStationInsertions).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ringStationIfIndex).append(ringStationMacAddress).append(ringStationLastNAUN).append(ringStationStationStatus).append(ringStationLastEnterTime).append(ringStationLastExitTime).append(ringStationDuplicateAddresses).append(ringStationInLineErrors).append(ringStationOutLineErrors).append(ringStationInternalErrors).append(ringStationInBurstErrors).append(ringStationOutBurstErrors).append(ringStationACErrors).append(ringStationAbortErrors).append(ringStationLostFrameErrors).append(ringStationCongestionErrors).append(ringStationFrameCopiedErrors).append(ringStationFrequencyErrors).append(ringStationTokenErrors).append(ringStationInBeaconErrors).append(ringStationOutBeaconErrors).append(ringStationInsertions).append(_index).toHashCode();
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
        RingStationEntry rhs = ((RingStationEntry) obj);
        return new EqualsBuilder().append(ringStationIfIndex, rhs.ringStationIfIndex).append(ringStationMacAddress, rhs.ringStationMacAddress).append(ringStationLastNAUN, rhs.ringStationLastNAUN).append(ringStationStationStatus, rhs.ringStationStationStatus).append(ringStationLastEnterTime, rhs.ringStationLastEnterTime).append(ringStationLastExitTime, rhs.ringStationLastExitTime).append(ringStationDuplicateAddresses, rhs.ringStationDuplicateAddresses).append(ringStationInLineErrors, rhs.ringStationInLineErrors).append(ringStationOutLineErrors, rhs.ringStationOutLineErrors).append(ringStationInternalErrors, rhs.ringStationInternalErrors).append(ringStationInBurstErrors, rhs.ringStationInBurstErrors).append(ringStationOutBurstErrors, rhs.ringStationOutBurstErrors).append(ringStationACErrors, rhs.ringStationACErrors).append(ringStationAbortErrors, rhs.ringStationAbortErrors).append(ringStationLostFrameErrors, rhs.ringStationLostFrameErrors).append(ringStationCongestionErrors, rhs.ringStationCongestionErrors).append(ringStationFrameCopiedErrors, rhs.ringStationFrameCopiedErrors).append(ringStationFrequencyErrors, rhs.ringStationFrequencyErrors).append(ringStationTokenErrors, rhs.ringStationTokenErrors).append(ringStationInBeaconErrors, rhs.ringStationInBeaconErrors).append(ringStationOutBeaconErrors, rhs.ringStationOutBeaconErrors).append(ringStationInsertions, rhs.ringStationInsertions).append(_index, rhs._index).isEquals();
    }

    public RingStationEntry clone() {
        RingStationEntry _copy = new RingStationEntry();
        _copy.ringStationIfIndex = ringStationIfIndex;
        _copy.ringStationMacAddress = ringStationMacAddress;
        _copy.ringStationLastNAUN = ringStationLastNAUN;
        _copy.ringStationStationStatus = ringStationStationStatus;
        _copy.ringStationLastEnterTime = ringStationLastEnterTime;
        _copy.ringStationLastExitTime = ringStationLastExitTime;
        _copy.ringStationDuplicateAddresses = ringStationDuplicateAddresses;
        _copy.ringStationInLineErrors = ringStationInLineErrors;
        _copy.ringStationOutLineErrors = ringStationOutLineErrors;
        _copy.ringStationInternalErrors = ringStationInternalErrors;
        _copy.ringStationInBurstErrors = ringStationInBurstErrors;
        _copy.ringStationOutBurstErrors = ringStationOutBurstErrors;
        _copy.ringStationACErrors = ringStationACErrors;
        _copy.ringStationAbortErrors = ringStationAbortErrors;
        _copy.ringStationLostFrameErrors = ringStationLostFrameErrors;
        _copy.ringStationCongestionErrors = ringStationCongestionErrors;
        _copy.ringStationFrameCopiedErrors = ringStationFrameCopiedErrors;
        _copy.ringStationFrequencyErrors = ringStationFrequencyErrors;
        _copy.ringStationTokenErrors = ringStationTokenErrors;
        _copy.ringStationInBeaconErrors = ringStationInBeaconErrors;
        _copy.ringStationOutBeaconErrors = ringStationOutBeaconErrors;
        _copy.ringStationInsertions = ringStationInsertions;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ringStationIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ringStationMacAddress", DeviceEntityDescription.FieldType.STRING, 24));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ringStationLastNAUN", DeviceEntityDescription.FieldType.STRING, 24));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ringStationStationStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ringStationLastEnterTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ringStationLastExitTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ringStationDuplicateAddresses", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ringStationInLineErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ringStationOutLineErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ringStationInternalErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ringStationInBurstErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ringStationOutBurstErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ringStationACErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ringStationAbortErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ringStationLostFrameErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "ringStationCongestionErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "ringStationFrameCopiedErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "ringStationFrequencyErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "ringStationTokenErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "ringStationInBeaconErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "ringStationOutBeaconErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "ringStationInsertions", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
