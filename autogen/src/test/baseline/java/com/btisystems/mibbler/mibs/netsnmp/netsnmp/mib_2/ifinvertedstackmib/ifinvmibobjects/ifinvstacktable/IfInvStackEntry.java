
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifinvertedstackmib.ifinvmibobjects.ifinvstacktable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifinvertedstackmib.ifinvmibobjects.ifinvstacktable.IIfInvStackEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifinvertedstackmib.ifinvmibobjects.IfInvStackTable;
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

public class IfInvStackEntry
    extends DeviceEntity
    implements Serializable, IIfInvStackEntry, IIndexed, IVariableBindingSetter
{

    private int ifInvStackStatus;
    private String _index;
    private IfInvStackTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfInvStackEntry() {
    }

    public int getIfInvStackStatus() {
        return this.ifInvStackStatus;
    }

    public void setIfInvStackStatus(int ifInvStackStatus) {
        int oldValue = getIfInvStackStatus();
        this.ifInvStackStatus = ifInvStackStatus;
        notifyChange(1, oldValue, ifInvStackStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIfInvStackStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        arrayOffset += 1;
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IfInvStackTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifInvStackStatus", ifInvStackStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifInvStackStatus).append(_index).toHashCode();
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
        IfInvStackEntry rhs = ((IfInvStackEntry) obj);
        return new EqualsBuilder().append(ifInvStackStatus, rhs.ifInvStackStatus).append(_index, rhs._index).isEquals();
    }

    public IfInvStackEntry clone() {
        IfInvStackEntry _copy = new IfInvStackEntry();
        _copy.ifInvStackStatus = ifInvStackStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.77.1.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifInvStackStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
