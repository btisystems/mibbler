
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.statistics.etherstats2table;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.statistics.EtherStats2Table;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.etherstats2table.IEtherStats2Entry;
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

public class EtherStats2Entry
    extends DeviceEntity
    implements Serializable, IEtherStats2Entry, IIndexed, IVariableBindingSetter
{

    private int etherStatsDroppedFrames;
    private int etherStatsCreateTime;
    private String _index;
    private EtherStats2Table parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public EtherStats2Entry() {
    }

    public int getEtherStatsDroppedFrames() {
        return this.etherStatsDroppedFrames;
    }

    public void setEtherStatsDroppedFrames(int etherStatsDroppedFrames) {
        int oldValue = getEtherStatsDroppedFrames();
        this.etherStatsDroppedFrames = etherStatsDroppedFrames;
        notifyChange(1, oldValue, etherStatsDroppedFrames);
    }

    public int getEtherStatsCreateTime() {
        return this.etherStatsCreateTime;
    }

    public void setEtherStatsCreateTime(int etherStatsCreateTime) {
        int oldValue = getEtherStatsCreateTime();
        this.etherStatsCreateTime = etherStatsCreateTime;
        notifyChange(2, oldValue, etherStatsCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setEtherStatsDroppedFrames(binding.getVariable().toInt());
                break;
            case  2 :
                setEtherStatsCreateTime(binding.getVariable().toInt());
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

    public void _setTable(EtherStats2Table table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("etherStatsDroppedFrames", etherStatsDroppedFrames).append("etherStatsCreateTime", etherStatsCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(etherStatsDroppedFrames).append(etherStatsCreateTime).append(_index).toHashCode();
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
        EtherStats2Entry rhs = ((EtherStats2Entry) obj);
        return new EqualsBuilder().append(etherStatsDroppedFrames, rhs.etherStatsDroppedFrames).append(etherStatsCreateTime, rhs.etherStatsCreateTime).append(_index, rhs._index).isEquals();
    }

    public EtherStats2Entry clone() {
        EtherStats2Entry _copy = new EtherStats2Entry();
        _copy.etherStatsDroppedFrames = etherStatsDroppedFrames;
        _copy.etherStatsCreateTime = etherStatsCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.1.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "etherStatsDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "etherStatsCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
