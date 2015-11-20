
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.filter.filter2table;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.filter.Filter2Table;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.filter.filter2table.IFilter2Entry;
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

public class Filter2Entry
    extends DeviceEntity
    implements Serializable, IFilter2Entry, IIndexed, IVariableBindingSetter
{

    private Integer filterProtocolDirDataLocalIndex;
    private Integer filterProtocolDirLocalIndex;
    private String _index;
    private Filter2Table parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Filter2Entry() {
    }

    public int getFilterProtocolDirDataLocalIndex() {
        if (this.filterProtocolDirDataLocalIndex == null) {
            return  0;
        }
        return this.filterProtocolDirDataLocalIndex;
    }

    public boolean isFilterProtocolDirDataLocalIndexDefined() {
        return (this.filterProtocolDirDataLocalIndex!= null);
    }

    public void setFilterProtocolDirDataLocalIndex(int filterProtocolDirDataLocalIndex) {
        int oldValue = getFilterProtocolDirDataLocalIndex();
        this.filterProtocolDirDataLocalIndex = filterProtocolDirDataLocalIndex;
        notifyChange(1, oldValue, filterProtocolDirDataLocalIndex);
    }

    public int getFilterProtocolDirLocalIndex() {
        if (this.filterProtocolDirLocalIndex == null) {
            return  0;
        }
        return this.filterProtocolDirLocalIndex;
    }

    public boolean isFilterProtocolDirLocalIndexDefined() {
        return (this.filterProtocolDirLocalIndex!= null);
    }

    public void setFilterProtocolDirLocalIndex(int filterProtocolDirLocalIndex) {
        int oldValue = getFilterProtocolDirLocalIndex();
        this.filterProtocolDirLocalIndex = filterProtocolDirLocalIndex;
        notifyChange(2, oldValue, filterProtocolDirLocalIndex);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setFilterProtocolDirDataLocalIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setFilterProtocolDirLocalIndex(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Filter2Table table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("filterProtocolDirDataLocalIndex", filterProtocolDirDataLocalIndex).append("filterProtocolDirLocalIndex", filterProtocolDirLocalIndex).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(filterProtocolDirDataLocalIndex).append(filterProtocolDirLocalIndex).append(_index).toHashCode();
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
        Filter2Entry rhs = ((Filter2Entry) obj);
        return new EqualsBuilder().append(filterProtocolDirDataLocalIndex, rhs.filterProtocolDirDataLocalIndex).append(filterProtocolDirLocalIndex, rhs.filterProtocolDirLocalIndex).append(_index, rhs._index).isEquals();
    }

    public Filter2Entry clone() {
        Filter2Entry _copy = new Filter2Entry();
        _copy.filterProtocolDirDataLocalIndex = filterProtocolDirDataLocalIndex;
        _copy.filterProtocolDirLocalIndex = filterProtocolDirLocalIndex;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.7.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "filterProtocolDirDataLocalIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "filterProtocolDirLocalIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
