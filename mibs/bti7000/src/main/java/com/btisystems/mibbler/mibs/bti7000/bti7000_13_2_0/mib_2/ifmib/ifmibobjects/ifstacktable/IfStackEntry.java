
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.ifmib.ifmibobjects.ifstacktable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.ifmib.ifmibobjects.IfStackTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ifmib.ifmibobjects.ifstacktable.IIfStackEntry;
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

public class IfStackEntry
    extends DeviceEntity
    implements Serializable, IIfStackEntry, IIndexed, IVariableBindingSetter
{

    private int ifStackHigherLayer;
    private int ifStackLowerLayer;
    private int ifStackStatus;
    private String _index;
    private IfStackTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfStackEntry() {
    }

    public int getIfStackHigherLayer() {
        return this.ifStackHigherLayer;
    }

    public void setIfStackHigherLayer(int ifStackHigherLayer) {
        int oldValue = getIfStackHigherLayer();
        this.ifStackHigherLayer = ifStackHigherLayer;
        notifyChange(1, oldValue, ifStackHigherLayer);
    }

    public int getIfStackLowerLayer() {
        return this.ifStackLowerLayer;
    }

    public void setIfStackLowerLayer(int ifStackLowerLayer) {
        int oldValue = getIfStackLowerLayer();
        this.ifStackLowerLayer = ifStackLowerLayer;
        notifyChange(2, oldValue, ifStackLowerLayer);
    }

    public int getIfStackStatus() {
        return this.ifStackStatus;
    }

    public void setIfStackStatus(int ifStackStatus) {
        int oldValue = getIfStackStatus();
        this.ifStackStatus = ifStackStatus;
        notifyChange(3, oldValue, ifStackStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIfStackHigherLayer(binding.getVariable().toInt());
                break;
            case  2 :
                setIfStackLowerLayer(binding.getVariable().toInt());
                break;
            case  3 :
                setIfStackStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setIfStackHigherLayer(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIfStackLowerLayer(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IfStackTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifStackHigherLayer", ifStackHigherLayer).append("ifStackLowerLayer", ifStackLowerLayer).append("ifStackStatus", ifStackStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifStackHigherLayer).append(ifStackLowerLayer).append(ifStackStatus).append(_index).toHashCode();
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
        IfStackEntry rhs = ((IfStackEntry) obj);
        return new EqualsBuilder().append(ifStackHigherLayer, rhs.ifStackHigherLayer).append(ifStackLowerLayer, rhs.ifStackLowerLayer).append(ifStackStatus, rhs.ifStackStatus).append(_index, rhs._index).isEquals();
    }

    public IfStackEntry clone() {
        IfStackEntry _copy = new IfStackEntry();
        _copy.ifStackHigherLayer = ifStackHigherLayer;
        _copy.ifStackLowerLayer = ifStackLowerLayer;
        _copy.ifStackStatus = ifStackStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.31.1.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifStackHigherLayer", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ifStackLowerLayer", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ifStackStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
