
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.filter.filtertable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.filter.filtertable.IFilterEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.filter.FilterTable;
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

public class FilterEntry
    extends DeviceEntity
    implements Serializable, IFilterEntry, IIndexed, IVariableBindingSetter
{

    private int filterIndex;
    private int filterChannelIndex;
    private Integer filterPktDataOffset;
    private String filterPktData;
    private String filterPktDataMask;
    private String filterPktDataNotMask;
    private int filterPktStatus;
    private int filterPktStatusMask;
    private int filterPktStatusNotMask;
    private String filterOwner;
    private int filterStatus;
    private String _index;
    private FilterTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public FilterEntry() {
    }

    public int getFilterIndex() {
        return this.filterIndex;
    }

    public void setFilterIndex(int filterIndex) {
        int oldValue = getFilterIndex();
        this.filterIndex = filterIndex;
        notifyChange(1, oldValue, filterIndex);
    }

    public int getFilterChannelIndex() {
        return this.filterChannelIndex;
    }

    public void setFilterChannelIndex(int filterChannelIndex) {
        int oldValue = getFilterChannelIndex();
        this.filterChannelIndex = filterChannelIndex;
        notifyChange(2, oldValue, filterChannelIndex);
    }

    public int getFilterPktDataOffset() {
        if (this.filterPktDataOffset == null) {
            return  0;
        }
        return this.filterPktDataOffset;
    }

    public boolean isFilterPktDataOffsetDefined() {
        return (this.filterPktDataOffset!= null);
    }

    public void setFilterPktDataOffset(int filterPktDataOffset) {
        int oldValue = getFilterPktDataOffset();
        this.filterPktDataOffset = filterPktDataOffset;
        notifyChange(3, oldValue, filterPktDataOffset);
    }

    public String getFilterPktData() {
        return this.filterPktData;
    }

    public void setFilterPktData(String filterPktData) {
        String oldValue = getFilterPktData();
        this.filterPktData = filterPktData;
        notifyChange(4, oldValue, filterPktData);
    }

    public String getFilterPktDataMask() {
        return this.filterPktDataMask;
    }

    public void setFilterPktDataMask(String filterPktDataMask) {
        String oldValue = getFilterPktDataMask();
        this.filterPktDataMask = filterPktDataMask;
        notifyChange(5, oldValue, filterPktDataMask);
    }

    public String getFilterPktDataNotMask() {
        return this.filterPktDataNotMask;
    }

    public void setFilterPktDataNotMask(String filterPktDataNotMask) {
        String oldValue = getFilterPktDataNotMask();
        this.filterPktDataNotMask = filterPktDataNotMask;
        notifyChange(6, oldValue, filterPktDataNotMask);
    }

    public int getFilterPktStatus() {
        return this.filterPktStatus;
    }

    public void setFilterPktStatus(int filterPktStatus) {
        int oldValue = getFilterPktStatus();
        this.filterPktStatus = filterPktStatus;
        notifyChange(7, oldValue, filterPktStatus);
    }

    public int getFilterPktStatusMask() {
        return this.filterPktStatusMask;
    }

    public void setFilterPktStatusMask(int filterPktStatusMask) {
        int oldValue = getFilterPktStatusMask();
        this.filterPktStatusMask = filterPktStatusMask;
        notifyChange(8, oldValue, filterPktStatusMask);
    }

    public int getFilterPktStatusNotMask() {
        return this.filterPktStatusNotMask;
    }

    public void setFilterPktStatusNotMask(int filterPktStatusNotMask) {
        int oldValue = getFilterPktStatusNotMask();
        this.filterPktStatusNotMask = filterPktStatusNotMask;
        notifyChange(9, oldValue, filterPktStatusNotMask);
    }

    public String getFilterOwner() {
        return this.filterOwner;
    }

    public void setFilterOwner(String filterOwner) {
        String oldValue = getFilterOwner();
        this.filterOwner = filterOwner;
        notifyChange(10, oldValue, filterOwner);
    }

    public int getFilterStatus() {
        return this.filterStatus;
    }

    public void setFilterStatus(int filterStatus) {
        int oldValue = getFilterStatus();
        this.filterStatus = filterStatus;
        notifyChange(11, oldValue, filterStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setFilterIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setFilterChannelIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setFilterPktDataOffset(binding.getVariable().toInt());
                break;
            case  4 :
                setFilterPktData(binding.getVariable().toString());
                break;
            case  5 :
                setFilterPktDataMask(binding.getVariable().toString());
                break;
            case  6 :
                setFilterPktDataNotMask(binding.getVariable().toString());
                break;
            case  7 :
                setFilterPktStatus(binding.getVariable().toInt());
                break;
            case  8 :
                setFilterPktStatusMask(binding.getVariable().toInt());
                break;
            case  9 :
                setFilterPktStatusNotMask(binding.getVariable().toInt());
                break;
            case  10 :
                setFilterOwner(binding.getVariable().toString());
                break;
            case  11 :
                setFilterStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setFilterIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(FilterTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("filterIndex", filterIndex).append("filterChannelIndex", filterChannelIndex).append("filterPktDataOffset", filterPktDataOffset).append("filterPktData", filterPktData).append("filterPktDataMask", filterPktDataMask).append("filterPktDataNotMask", filterPktDataNotMask).append("filterPktStatus", filterPktStatus).append("filterPktStatusMask", filterPktStatusMask).append("filterPktStatusNotMask", filterPktStatusNotMask).append("filterOwner", filterOwner).append("filterStatus", filterStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(filterIndex).append(filterChannelIndex).append(filterPktDataOffset).append(filterPktData).append(filterPktDataMask).append(filterPktDataNotMask).append(filterPktStatus).append(filterPktStatusMask).append(filterPktStatusNotMask).append(filterOwner).append(filterStatus).append(_index).toHashCode();
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
        FilterEntry rhs = ((FilterEntry) obj);
        return new EqualsBuilder().append(filterIndex, rhs.filterIndex).append(filterChannelIndex, rhs.filterChannelIndex).append(filterPktDataOffset, rhs.filterPktDataOffset).append(filterPktData, rhs.filterPktData).append(filterPktDataMask, rhs.filterPktDataMask).append(filterPktDataNotMask, rhs.filterPktDataNotMask).append(filterPktStatus, rhs.filterPktStatus).append(filterPktStatusMask, rhs.filterPktStatusMask).append(filterPktStatusNotMask, rhs.filterPktStatusNotMask).append(filterOwner, rhs.filterOwner).append(filterStatus, rhs.filterStatus).append(_index, rhs._index).isEquals();
    }

    public FilterEntry clone() {
        FilterEntry _copy = new FilterEntry();
        _copy.filterIndex = filterIndex;
        _copy.filterChannelIndex = filterChannelIndex;
        _copy.filterPktDataOffset = filterPktDataOffset;
        _copy.filterPktData = filterPktData;
        _copy.filterPktDataMask = filterPktDataMask;
        _copy.filterPktDataNotMask = filterPktDataNotMask;
        _copy.filterPktStatus = filterPktStatus;
        _copy.filterPktStatusMask = filterPktStatusMask;
        _copy.filterPktStatusNotMask = filterPktStatusNotMask;
        _copy.filterOwner = filterOwner;
        _copy.filterStatus = filterStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.7.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "filterIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "filterChannelIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "filterPktDataOffset", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "filterPktData", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "filterPktDataMask", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "filterPktDataNotMask", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "filterPktStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "filterPktStatusMask", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "filterPktStatusNotMask", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "filterOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "filterStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
