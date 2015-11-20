
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.sourceroutingstats2table;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.SourceRoutingStats2Table;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.sourceroutingstats2table.ISourceRoutingStats2Entry;
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

public class SourceRoutingStats2Entry
    extends DeviceEntity
    implements Serializable, ISourceRoutingStats2Entry, IIndexed, IVariableBindingSetter
{

    private int sourceRoutingStatsDroppedFrames;
    private int sourceRoutingStatsCreateTime;
    private String _index;
    private SourceRoutingStats2Table parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SourceRoutingStats2Entry() {
    }

    public int getSourceRoutingStatsDroppedFrames() {
        return this.sourceRoutingStatsDroppedFrames;
    }

    public void setSourceRoutingStatsDroppedFrames(int sourceRoutingStatsDroppedFrames) {
        int oldValue = getSourceRoutingStatsDroppedFrames();
        this.sourceRoutingStatsDroppedFrames = sourceRoutingStatsDroppedFrames;
        notifyChange(1, oldValue, sourceRoutingStatsDroppedFrames);
    }

    public int getSourceRoutingStatsCreateTime() {
        return this.sourceRoutingStatsCreateTime;
    }

    public void setSourceRoutingStatsCreateTime(int sourceRoutingStatsCreateTime) {
        int oldValue = getSourceRoutingStatsCreateTime();
        this.sourceRoutingStatsCreateTime = sourceRoutingStatsCreateTime;
        notifyChange(2, oldValue, sourceRoutingStatsCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSourceRoutingStatsDroppedFrames(binding.getVariable().toInt());
                break;
            case  2 :
                setSourceRoutingStatsCreateTime(binding.getVariable().toInt());
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

    public void _setTable(SourceRoutingStats2Table table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sourceRoutingStatsDroppedFrames", sourceRoutingStatsDroppedFrames).append("sourceRoutingStatsCreateTime", sourceRoutingStatsCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sourceRoutingStatsDroppedFrames).append(sourceRoutingStatsCreateTime).append(_index).toHashCode();
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
        SourceRoutingStats2Entry rhs = ((SourceRoutingStats2Entry) obj);
        return new EqualsBuilder().append(sourceRoutingStatsDroppedFrames, rhs.sourceRoutingStatsDroppedFrames).append(sourceRoutingStatsCreateTime, rhs.sourceRoutingStatsCreateTime).append(_index, rhs._index).isEquals();
    }

    public SourceRoutingStats2Entry clone() {
        SourceRoutingStats2Entry _copy = new SourceRoutingStats2Entry();
        _copy.sourceRoutingStatsDroppedFrames = sourceRoutingStatsDroppedFrames;
        _copy.sourceRoutingStatsCreateTime = sourceRoutingStatsCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.8.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sourceRoutingStatsDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "sourceRoutingStatsCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
