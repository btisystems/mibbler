
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.capture.capturebuffertable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.capture.CaptureBufferTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.capture.capturebuffertable.ICaptureBufferEntry;
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

public class CaptureBufferEntry
    extends DeviceEntity
    implements Serializable, ICaptureBufferEntry, IIndexed, IVariableBindingSetter
{

    private int captureBufferControlIndex;
    private int captureBufferIndex;
    private int captureBufferPacketID;
    private String captureBufferPacketData;
    private int captureBufferPacketLength;
    private int captureBufferPacketTime;
    private int captureBufferPacketStatus;
    private String _index;
    private CaptureBufferTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public CaptureBufferEntry() {
    }

    public int getCaptureBufferControlIndex() {
        return this.captureBufferControlIndex;
    }

    public void setCaptureBufferControlIndex(int captureBufferControlIndex) {
        int oldValue = getCaptureBufferControlIndex();
        this.captureBufferControlIndex = captureBufferControlIndex;
        notifyChange(1, oldValue, captureBufferControlIndex);
    }

    public int getCaptureBufferIndex() {
        return this.captureBufferIndex;
    }

    public void setCaptureBufferIndex(int captureBufferIndex) {
        int oldValue = getCaptureBufferIndex();
        this.captureBufferIndex = captureBufferIndex;
        notifyChange(2, oldValue, captureBufferIndex);
    }

    public int getCaptureBufferPacketID() {
        return this.captureBufferPacketID;
    }

    public void setCaptureBufferPacketID(int captureBufferPacketID) {
        int oldValue = getCaptureBufferPacketID();
        this.captureBufferPacketID = captureBufferPacketID;
        notifyChange(3, oldValue, captureBufferPacketID);
    }

    public String getCaptureBufferPacketData() {
        return this.captureBufferPacketData;
    }

    public void setCaptureBufferPacketData(String captureBufferPacketData) {
        String oldValue = getCaptureBufferPacketData();
        this.captureBufferPacketData = captureBufferPacketData;
        notifyChange(4, oldValue, captureBufferPacketData);
    }

    public int getCaptureBufferPacketLength() {
        return this.captureBufferPacketLength;
    }

    public void setCaptureBufferPacketLength(int captureBufferPacketLength) {
        int oldValue = getCaptureBufferPacketLength();
        this.captureBufferPacketLength = captureBufferPacketLength;
        notifyChange(5, oldValue, captureBufferPacketLength);
    }

    public int getCaptureBufferPacketTime() {
        return this.captureBufferPacketTime;
    }

    public void setCaptureBufferPacketTime(int captureBufferPacketTime) {
        int oldValue = getCaptureBufferPacketTime();
        this.captureBufferPacketTime = captureBufferPacketTime;
        notifyChange(6, oldValue, captureBufferPacketTime);
    }

    public int getCaptureBufferPacketStatus() {
        return this.captureBufferPacketStatus;
    }

    public void setCaptureBufferPacketStatus(int captureBufferPacketStatus) {
        int oldValue = getCaptureBufferPacketStatus();
        this.captureBufferPacketStatus = captureBufferPacketStatus;
        notifyChange(7, oldValue, captureBufferPacketStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setCaptureBufferControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setCaptureBufferIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setCaptureBufferPacketID(binding.getVariable().toInt());
                break;
            case  4 :
                setCaptureBufferPacketData(binding.getVariable().toString());
                break;
            case  5 :
                setCaptureBufferPacketLength(binding.getVariable().toInt());
                break;
            case  6 :
                setCaptureBufferPacketTime(binding.getVariable().toInt());
                break;
            case  7 :
                setCaptureBufferPacketStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setCaptureBufferControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setCaptureBufferIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(CaptureBufferTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("captureBufferControlIndex", captureBufferControlIndex).append("captureBufferIndex", captureBufferIndex).append("captureBufferPacketID", captureBufferPacketID).append("captureBufferPacketData", captureBufferPacketData).append("captureBufferPacketLength", captureBufferPacketLength).append("captureBufferPacketTime", captureBufferPacketTime).append("captureBufferPacketStatus", captureBufferPacketStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(captureBufferControlIndex).append(captureBufferIndex).append(captureBufferPacketID).append(captureBufferPacketData).append(captureBufferPacketLength).append(captureBufferPacketTime).append(captureBufferPacketStatus).append(_index).toHashCode();
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
        CaptureBufferEntry rhs = ((CaptureBufferEntry) obj);
        return new EqualsBuilder().append(captureBufferControlIndex, rhs.captureBufferControlIndex).append(captureBufferIndex, rhs.captureBufferIndex).append(captureBufferPacketID, rhs.captureBufferPacketID).append(captureBufferPacketData, rhs.captureBufferPacketData).append(captureBufferPacketLength, rhs.captureBufferPacketLength).append(captureBufferPacketTime, rhs.captureBufferPacketTime).append(captureBufferPacketStatus, rhs.captureBufferPacketStatus).append(_index, rhs._index).isEquals();
    }

    public CaptureBufferEntry clone() {
        CaptureBufferEntry _copy = new CaptureBufferEntry();
        _copy.captureBufferControlIndex = captureBufferControlIndex;
        _copy.captureBufferIndex = captureBufferIndex;
        _copy.captureBufferPacketID = captureBufferPacketID;
        _copy.captureBufferPacketData = captureBufferPacketData;
        _copy.captureBufferPacketLength = captureBufferPacketLength;
        _copy.captureBufferPacketTime = captureBufferPacketTime;
        _copy.captureBufferPacketStatus = captureBufferPacketStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.8.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "captureBufferControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "captureBufferIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "captureBufferPacketID", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "captureBufferPacketData", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "captureBufferPacketLength", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "captureBufferPacketTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "captureBufferPacketStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
