
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.ringstationcontrol2table;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.tokenring.RingStationControl2Table;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.tokenring.ringstationcontrol2table.IRingStationControl2Entry;
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

public class RingStationControl2Entry
    extends DeviceEntity
    implements Serializable, IRingStationControl2Entry, IIndexed, IVariableBindingSetter
{

    private int ringStationControlDroppedFrames;
    private int ringStationControlCreateTime;
    private String _index;
    private RingStationControl2Table parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RingStationControl2Entry() {
    }

    public int getRingStationControlDroppedFrames() {
        return this.ringStationControlDroppedFrames;
    }

    public void setRingStationControlDroppedFrames(int ringStationControlDroppedFrames) {
        int oldValue = getRingStationControlDroppedFrames();
        this.ringStationControlDroppedFrames = ringStationControlDroppedFrames;
        notifyChange(1, oldValue, ringStationControlDroppedFrames);
    }

    public int getRingStationControlCreateTime() {
        return this.ringStationControlCreateTime;
    }

    public void setRingStationControlCreateTime(int ringStationControlCreateTime) {
        int oldValue = getRingStationControlCreateTime();
        this.ringStationControlCreateTime = ringStationControlCreateTime;
        notifyChange(2, oldValue, ringStationControlCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setRingStationControlDroppedFrames(binding.getVariable().toInt());
                break;
            case  2 :
                setRingStationControlCreateTime(binding.getVariable().toInt());
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

    public void _setTable(RingStationControl2Table table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ringStationControlDroppedFrames", ringStationControlDroppedFrames).append("ringStationControlCreateTime", ringStationControlCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ringStationControlDroppedFrames).append(ringStationControlCreateTime).append(_index).toHashCode();
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
        RingStationControl2Entry rhs = ((RingStationControl2Entry) obj);
        return new EqualsBuilder().append(ringStationControlDroppedFrames, rhs.ringStationControlDroppedFrames).append(ringStationControlCreateTime, rhs.ringStationControlCreateTime).append(_index, rhs._index).isEquals();
    }

    public RingStationControl2Entry clone() {
        RingStationControl2Entry _copy = new RingStationControl2Entry();
        _copy.ringStationControlDroppedFrames = ringStationControlDroppedFrames;
        _copy.ringStationControlCreateTime = ringStationControlCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.10.7.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ringStationControlDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ringStationControlCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
