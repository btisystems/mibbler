
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.capture.buffercontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.capture.buffercontroltable.IBufferControlEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.capture.BufferControlTable;
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

public class BufferControlEntry
    extends DeviceEntity
    implements Serializable, IBufferControlEntry, IIndexed, IVariableBindingSetter
{

    private int bufferControlIndex;
    private int bufferControlChannelIndex;
    private int bufferControlFullStatus;
    private int bufferControlFullAction;
    private Integer bufferControlCaptureSliceSize;
    private Integer bufferControlDownloadSliceSize;
    private Integer bufferControlDownloadOffset;
    private Integer bufferControlMaxOctetsRequested;
    private int bufferControlMaxOctetsGranted;
    private int bufferControlCapturedPackets;
    private int bufferControlTurnOnTime;
    private String bufferControlOwner;
    private int bufferControlStatus;
    private String _index;
    private BufferControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public BufferControlEntry() {
    }

    public int getBufferControlIndex() {
        return this.bufferControlIndex;
    }

    public void setBufferControlIndex(int bufferControlIndex) {
        int oldValue = getBufferControlIndex();
        this.bufferControlIndex = bufferControlIndex;
        notifyChange(1, oldValue, bufferControlIndex);
    }

    public int getBufferControlChannelIndex() {
        return this.bufferControlChannelIndex;
    }

    public void setBufferControlChannelIndex(int bufferControlChannelIndex) {
        int oldValue = getBufferControlChannelIndex();
        this.bufferControlChannelIndex = bufferControlChannelIndex;
        notifyChange(2, oldValue, bufferControlChannelIndex);
    }

    public int getBufferControlFullStatus() {
        return this.bufferControlFullStatus;
    }

    public void setBufferControlFullStatus(int bufferControlFullStatus) {
        int oldValue = getBufferControlFullStatus();
        this.bufferControlFullStatus = bufferControlFullStatus;
        notifyChange(3, oldValue, bufferControlFullStatus);
    }

    public int getBufferControlFullAction() {
        return this.bufferControlFullAction;
    }

    public void setBufferControlFullAction(int bufferControlFullAction) {
        int oldValue = getBufferControlFullAction();
        this.bufferControlFullAction = bufferControlFullAction;
        notifyChange(4, oldValue, bufferControlFullAction);
    }

    public int getBufferControlCaptureSliceSize() {
        if (this.bufferControlCaptureSliceSize == null) {
            return  100;
        }
        return this.bufferControlCaptureSliceSize;
    }

    public boolean isBufferControlCaptureSliceSizeDefined() {
        return (this.bufferControlCaptureSliceSize!= null);
    }

    public void setBufferControlCaptureSliceSize(int bufferControlCaptureSliceSize) {
        int oldValue = getBufferControlCaptureSliceSize();
        this.bufferControlCaptureSliceSize = bufferControlCaptureSliceSize;
        notifyChange(5, oldValue, bufferControlCaptureSliceSize);
    }

    public int getBufferControlDownloadSliceSize() {
        if (this.bufferControlDownloadSliceSize == null) {
            return  100;
        }
        return this.bufferControlDownloadSliceSize;
    }

    public boolean isBufferControlDownloadSliceSizeDefined() {
        return (this.bufferControlDownloadSliceSize!= null);
    }

    public void setBufferControlDownloadSliceSize(int bufferControlDownloadSliceSize) {
        int oldValue = getBufferControlDownloadSliceSize();
        this.bufferControlDownloadSliceSize = bufferControlDownloadSliceSize;
        notifyChange(6, oldValue, bufferControlDownloadSliceSize);
    }

    public int getBufferControlDownloadOffset() {
        if (this.bufferControlDownloadOffset == null) {
            return  0;
        }
        return this.bufferControlDownloadOffset;
    }

    public boolean isBufferControlDownloadOffsetDefined() {
        return (this.bufferControlDownloadOffset!= null);
    }

    public void setBufferControlDownloadOffset(int bufferControlDownloadOffset) {
        int oldValue = getBufferControlDownloadOffset();
        this.bufferControlDownloadOffset = bufferControlDownloadOffset;
        notifyChange(7, oldValue, bufferControlDownloadOffset);
    }

    public int getBufferControlMaxOctetsRequested() {
        if (this.bufferControlMaxOctetsRequested == null) {
            return -1;
        }
        return this.bufferControlMaxOctetsRequested;
    }

    public boolean isBufferControlMaxOctetsRequestedDefined() {
        return (this.bufferControlMaxOctetsRequested!= null);
    }

    public void setBufferControlMaxOctetsRequested(int bufferControlMaxOctetsRequested) {
        int oldValue = getBufferControlMaxOctetsRequested();
        this.bufferControlMaxOctetsRequested = bufferControlMaxOctetsRequested;
        notifyChange(8, oldValue, bufferControlMaxOctetsRequested);
    }

    public int getBufferControlMaxOctetsGranted() {
        return this.bufferControlMaxOctetsGranted;
    }

    public void setBufferControlMaxOctetsGranted(int bufferControlMaxOctetsGranted) {
        int oldValue = getBufferControlMaxOctetsGranted();
        this.bufferControlMaxOctetsGranted = bufferControlMaxOctetsGranted;
        notifyChange(9, oldValue, bufferControlMaxOctetsGranted);
    }

    public int getBufferControlCapturedPackets() {
        return this.bufferControlCapturedPackets;
    }

    public void setBufferControlCapturedPackets(int bufferControlCapturedPackets) {
        int oldValue = getBufferControlCapturedPackets();
        this.bufferControlCapturedPackets = bufferControlCapturedPackets;
        notifyChange(10, oldValue, bufferControlCapturedPackets);
    }

    public int getBufferControlTurnOnTime() {
        return this.bufferControlTurnOnTime;
    }

    public void setBufferControlTurnOnTime(int bufferControlTurnOnTime) {
        int oldValue = getBufferControlTurnOnTime();
        this.bufferControlTurnOnTime = bufferControlTurnOnTime;
        notifyChange(11, oldValue, bufferControlTurnOnTime);
    }

    public String getBufferControlOwner() {
        return this.bufferControlOwner;
    }

    public void setBufferControlOwner(String bufferControlOwner) {
        String oldValue = getBufferControlOwner();
        this.bufferControlOwner = bufferControlOwner;
        notifyChange(12, oldValue, bufferControlOwner);
    }

    public int getBufferControlStatus() {
        return this.bufferControlStatus;
    }

    public void setBufferControlStatus(int bufferControlStatus) {
        int oldValue = getBufferControlStatus();
        this.bufferControlStatus = bufferControlStatus;
        notifyChange(13, oldValue, bufferControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setBufferControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setBufferControlChannelIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setBufferControlFullStatus(binding.getVariable().toInt());
                break;
            case  4 :
                setBufferControlFullAction(binding.getVariable().toInt());
                break;
            case  5 :
                setBufferControlCaptureSliceSize(binding.getVariable().toInt());
                break;
            case  6 :
                setBufferControlDownloadSliceSize(binding.getVariable().toInt());
                break;
            case  7 :
                setBufferControlDownloadOffset(binding.getVariable().toInt());
                break;
            case  8 :
                setBufferControlMaxOctetsRequested(binding.getVariable().toInt());
                break;
            case  9 :
                setBufferControlMaxOctetsGranted(binding.getVariable().toInt());
                break;
            case  10 :
                setBufferControlCapturedPackets(binding.getVariable().toInt());
                break;
            case  11 :
                setBufferControlTurnOnTime(binding.getVariable().toInt());
                break;
            case  12 :
                setBufferControlOwner(binding.getVariable().toString());
                break;
            case  13 :
                setBufferControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setBufferControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(BufferControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("bufferControlIndex", bufferControlIndex).append("bufferControlChannelIndex", bufferControlChannelIndex).append("bufferControlFullStatus", bufferControlFullStatus).append("bufferControlFullAction", bufferControlFullAction).append("bufferControlCaptureSliceSize", bufferControlCaptureSliceSize).append("bufferControlDownloadSliceSize", bufferControlDownloadSliceSize).append("bufferControlDownloadOffset", bufferControlDownloadOffset).append("bufferControlMaxOctetsRequested", bufferControlMaxOctetsRequested).append("bufferControlMaxOctetsGranted", bufferControlMaxOctetsGranted).append("bufferControlCapturedPackets", bufferControlCapturedPackets).append("bufferControlTurnOnTime", bufferControlTurnOnTime).append("bufferControlOwner", bufferControlOwner).append("bufferControlStatus", bufferControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(bufferControlIndex).append(bufferControlChannelIndex).append(bufferControlFullStatus).append(bufferControlFullAction).append(bufferControlCaptureSliceSize).append(bufferControlDownloadSliceSize).append(bufferControlDownloadOffset).append(bufferControlMaxOctetsRequested).append(bufferControlMaxOctetsGranted).append(bufferControlCapturedPackets).append(bufferControlTurnOnTime).append(bufferControlOwner).append(bufferControlStatus).append(_index).toHashCode();
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
        BufferControlEntry rhs = ((BufferControlEntry) obj);
        return new EqualsBuilder().append(bufferControlIndex, rhs.bufferControlIndex).append(bufferControlChannelIndex, rhs.bufferControlChannelIndex).append(bufferControlFullStatus, rhs.bufferControlFullStatus).append(bufferControlFullAction, rhs.bufferControlFullAction).append(bufferControlCaptureSliceSize, rhs.bufferControlCaptureSliceSize).append(bufferControlDownloadSliceSize, rhs.bufferControlDownloadSliceSize).append(bufferControlDownloadOffset, rhs.bufferControlDownloadOffset).append(bufferControlMaxOctetsRequested, rhs.bufferControlMaxOctetsRequested).append(bufferControlMaxOctetsGranted, rhs.bufferControlMaxOctetsGranted).append(bufferControlCapturedPackets, rhs.bufferControlCapturedPackets).append(bufferControlTurnOnTime, rhs.bufferControlTurnOnTime).append(bufferControlOwner, rhs.bufferControlOwner).append(bufferControlStatus, rhs.bufferControlStatus).append(_index, rhs._index).isEquals();
    }

    public BufferControlEntry clone() {
        BufferControlEntry _copy = new BufferControlEntry();
        _copy.bufferControlIndex = bufferControlIndex;
        _copy.bufferControlChannelIndex = bufferControlChannelIndex;
        _copy.bufferControlFullStatus = bufferControlFullStatus;
        _copy.bufferControlFullAction = bufferControlFullAction;
        _copy.bufferControlCaptureSliceSize = bufferControlCaptureSliceSize;
        _copy.bufferControlDownloadSliceSize = bufferControlDownloadSliceSize;
        _copy.bufferControlDownloadOffset = bufferControlDownloadOffset;
        _copy.bufferControlMaxOctetsRequested = bufferControlMaxOctetsRequested;
        _copy.bufferControlMaxOctetsGranted = bufferControlMaxOctetsGranted;
        _copy.bufferControlCapturedPackets = bufferControlCapturedPackets;
        _copy.bufferControlTurnOnTime = bufferControlTurnOnTime;
        _copy.bufferControlOwner = bufferControlOwner;
        _copy.bufferControlStatus = bufferControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.8.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "bufferControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "bufferControlChannelIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "bufferControlFullStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "bufferControlFullAction", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "bufferControlCaptureSliceSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "bufferControlDownloadSliceSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "bufferControlDownloadOffset", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "bufferControlMaxOctetsRequested", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "bufferControlMaxOctetsGranted", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "bufferControlCapturedPackets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "bufferControlTurnOnTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "bufferControlOwner", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "bufferControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
