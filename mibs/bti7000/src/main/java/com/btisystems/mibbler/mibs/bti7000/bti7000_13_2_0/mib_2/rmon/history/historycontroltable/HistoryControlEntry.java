
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history.historycontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history.HistoryControlTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.historycontroltable.IHistoryControlEntry;
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

public class HistoryControlEntry
    extends DeviceEntity
    implements Serializable, IHistoryControlEntry, IIndexed, IVariableBindingSetter
{

    private int historyControlIndex;
    private String historyControlDataSource;
    private Integer historyControlBucketsRequested;
    private int historyControlBucketsGranted;
    private Integer historyControlInterval;
    private String historyControlOwner;
    private int historyControlStatus;
    private String _index;
    private HistoryControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HistoryControlEntry() {
    }

    public int getHistoryControlIndex() {
        return this.historyControlIndex;
    }

    public void setHistoryControlIndex(int historyControlIndex) {
        int oldValue = getHistoryControlIndex();
        this.historyControlIndex = historyControlIndex;
        notifyChange(1, oldValue, historyControlIndex);
    }

    public String getHistoryControlDataSource() {
        return this.historyControlDataSource;
    }

    public void setHistoryControlDataSource(String historyControlDataSource) {
        String oldValue = getHistoryControlDataSource();
        this.historyControlDataSource = historyControlDataSource;
        notifyChange(2, oldValue, historyControlDataSource);
    }

    public int getHistoryControlBucketsRequested() {
        if (this.historyControlBucketsRequested == null) {
            return  50;
        }
        return this.historyControlBucketsRequested;
    }

    public boolean isHistoryControlBucketsRequestedDefined() {
        return (this.historyControlBucketsRequested!= null);
    }

    public void setHistoryControlBucketsRequested(int historyControlBucketsRequested) {
        int oldValue = getHistoryControlBucketsRequested();
        this.historyControlBucketsRequested = historyControlBucketsRequested;
        notifyChange(3, oldValue, historyControlBucketsRequested);
    }

    public int getHistoryControlBucketsGranted() {
        return this.historyControlBucketsGranted;
    }

    public void setHistoryControlBucketsGranted(int historyControlBucketsGranted) {
        int oldValue = getHistoryControlBucketsGranted();
        this.historyControlBucketsGranted = historyControlBucketsGranted;
        notifyChange(4, oldValue, historyControlBucketsGranted);
    }

    public int getHistoryControlInterval() {
        if (this.historyControlInterval == null) {
            return  1800;
        }
        return this.historyControlInterval;
    }

    public boolean isHistoryControlIntervalDefined() {
        return (this.historyControlInterval!= null);
    }

    public void setHistoryControlInterval(int historyControlInterval) {
        int oldValue = getHistoryControlInterval();
        this.historyControlInterval = historyControlInterval;
        notifyChange(5, oldValue, historyControlInterval);
    }

    public String getHistoryControlOwner() {
        return this.historyControlOwner;
    }

    public void setHistoryControlOwner(String historyControlOwner) {
        String oldValue = getHistoryControlOwner();
        this.historyControlOwner = historyControlOwner;
        notifyChange(6, oldValue, historyControlOwner);
    }

    public int getHistoryControlStatus() {
        return this.historyControlStatus;
    }

    public void setHistoryControlStatus(int historyControlStatus) {
        int oldValue = getHistoryControlStatus();
        this.historyControlStatus = historyControlStatus;
        notifyChange(7, oldValue, historyControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHistoryControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setHistoryControlDataSource(binding.getVariable().toString());
                break;
            case  3 :
                setHistoryControlBucketsRequested(binding.getVariable().toInt());
                break;
            case  4 :
                setHistoryControlBucketsGranted(binding.getVariable().toInt());
                break;
            case  5 :
                setHistoryControlInterval(binding.getVariable().toInt());
                break;
            case  6 :
                setHistoryControlOwner(binding.getVariable().toString());
                break;
            case  7 :
                setHistoryControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHistoryControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HistoryControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("historyControlIndex", historyControlIndex).append("historyControlDataSource", historyControlDataSource).append("historyControlBucketsRequested", historyControlBucketsRequested).append("historyControlBucketsGranted", historyControlBucketsGranted).append("historyControlInterval", historyControlInterval).append("historyControlOwner", historyControlOwner).append("historyControlStatus", historyControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(historyControlIndex).append(historyControlDataSource).append(historyControlBucketsRequested).append(historyControlBucketsGranted).append(historyControlInterval).append(historyControlOwner).append(historyControlStatus).append(_index).toHashCode();
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
        HistoryControlEntry rhs = ((HistoryControlEntry) obj);
        return new EqualsBuilder().append(historyControlIndex, rhs.historyControlIndex).append(historyControlDataSource, rhs.historyControlDataSource).append(historyControlBucketsRequested, rhs.historyControlBucketsRequested).append(historyControlBucketsGranted, rhs.historyControlBucketsGranted).append(historyControlInterval, rhs.historyControlInterval).append(historyControlOwner, rhs.historyControlOwner).append(historyControlStatus, rhs.historyControlStatus).append(_index, rhs._index).isEquals();
    }

    public HistoryControlEntry clone() {
        HistoryControlEntry _copy = new HistoryControlEntry();
        _copy.historyControlIndex = historyControlIndex;
        _copy.historyControlDataSource = historyControlDataSource;
        _copy.historyControlBucketsRequested = historyControlBucketsRequested;
        _copy.historyControlBucketsGranted = historyControlBucketsGranted;
        _copy.historyControlInterval = historyControlInterval;
        _copy.historyControlOwner = historyControlOwner;
        _copy.historyControlStatus = historyControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.2.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "historyControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "historyControlDataSource", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "historyControlBucketsRequested", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "historyControlBucketsGranted", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "historyControlInterval", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "historyControlOwner", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "historyControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
