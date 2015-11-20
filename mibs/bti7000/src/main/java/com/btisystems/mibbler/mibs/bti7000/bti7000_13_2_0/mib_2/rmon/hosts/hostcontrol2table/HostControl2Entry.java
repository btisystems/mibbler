
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.hosts.hostcontrol2table;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.hosts.HostControl2Table;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.hosts.hostcontrol2table.IHostControl2Entry;
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

public class HostControl2Entry
    extends DeviceEntity
    implements Serializable, IHostControl2Entry, IIndexed, IVariableBindingSetter
{

    private int hostControlDroppedFrames;
    private int hostControlCreateTime;
    private String _index;
    private HostControl2Table parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HostControl2Entry() {
    }

    public int getHostControlDroppedFrames() {
        return this.hostControlDroppedFrames;
    }

    public void setHostControlDroppedFrames(int hostControlDroppedFrames) {
        int oldValue = getHostControlDroppedFrames();
        this.hostControlDroppedFrames = hostControlDroppedFrames;
        notifyChange(1, oldValue, hostControlDroppedFrames);
    }

    public int getHostControlCreateTime() {
        return this.hostControlCreateTime;
    }

    public void setHostControlCreateTime(int hostControlCreateTime) {
        int oldValue = getHostControlCreateTime();
        this.hostControlCreateTime = hostControlCreateTime;
        notifyChange(2, oldValue, hostControlCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHostControlDroppedFrames(binding.getVariable().toInt());
                break;
            case  2 :
                setHostControlCreateTime(binding.getVariable().toInt());
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

    public void _setTable(HostControl2Table table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hostControlDroppedFrames", hostControlDroppedFrames).append("hostControlCreateTime", hostControlCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hostControlDroppedFrames).append(hostControlCreateTime).append(_index).toHashCode();
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
        HostControl2Entry rhs = ((HostControl2Entry) obj);
        return new EqualsBuilder().append(hostControlDroppedFrames, rhs.hostControlDroppedFrames).append(hostControlCreateTime, rhs.hostControlCreateTime).append(_index, rhs._index).isEquals();
    }

    public HostControl2Entry clone() {
        HostControl2Entry _copy = new HostControl2Entry();
        _copy.hostControlDroppedFrames = hostControlDroppedFrames;
        _copy.hostControlCreateTime = hostControlCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.4.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hostControlDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hostControlCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
