
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.filter.channel2table;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.filter.Channel2Table;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.filter.channel2table.IChannel2Entry;
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

public class Channel2Entry
    extends DeviceEntity
    implements Serializable, IChannel2Entry, IIndexed, IVariableBindingSetter
{

    private int channelDroppedFrames;
    private int channelCreateTime;
    private String _index;
    private Channel2Table parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Channel2Entry() {
    }

    public int getChannelDroppedFrames() {
        return this.channelDroppedFrames;
    }

    public void setChannelDroppedFrames(int channelDroppedFrames) {
        int oldValue = getChannelDroppedFrames();
        this.channelDroppedFrames = channelDroppedFrames;
        notifyChange(1, oldValue, channelDroppedFrames);
    }

    public int getChannelCreateTime() {
        return this.channelCreateTime;
    }

    public void setChannelCreateTime(int channelCreateTime) {
        int oldValue = getChannelCreateTime();
        this.channelCreateTime = channelCreateTime;
        notifyChange(2, oldValue, channelCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setChannelDroppedFrames(binding.getVariable().toInt());
                break;
            case  2 :
                setChannelCreateTime(binding.getVariable().toInt());
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

    public void _setTable(Channel2Table table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("channelDroppedFrames", channelDroppedFrames).append("channelCreateTime", channelCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(channelDroppedFrames).append(channelCreateTime).append(_index).toHashCode();
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
        Channel2Entry rhs = ((Channel2Entry) obj);
        return new EqualsBuilder().append(channelDroppedFrames, rhs.channelDroppedFrames).append(channelCreateTime, rhs.channelCreateTime).append(_index, rhs._index).isEquals();
    }

    public Channel2Entry clone() {
        Channel2Entry _copy = new Channel2Entry();
        _copy.channelDroppedFrames = channelDroppedFrames;
        _copy.channelCreateTime = channelCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.7.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "channelDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "channelCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
