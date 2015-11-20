
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrnetworktable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrnetworktable.IHrNetworkEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrNetworkTable;
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

public class HrNetworkEntry
    extends DeviceEntity
    implements Serializable, IHrNetworkEntry, IIndexed, IVariableBindingSetter
{

    private int hrNetworkIfIndex;
    private String _index;
    private HrNetworkTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrNetworkEntry() {
    }

    public int getHrNetworkIfIndex() {
        return this.hrNetworkIfIndex;
    }

    public void setHrNetworkIfIndex(int hrNetworkIfIndex) {
        int oldValue = getHrNetworkIfIndex();
        this.hrNetworkIfIndex = hrNetworkIfIndex;
        notifyChange(1, oldValue, hrNetworkIfIndex);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHrNetworkIfIndex(binding.getVariable().toInt());
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
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HrNetworkTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrNetworkIfIndex", hrNetworkIfIndex).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrNetworkIfIndex).append(_index).toHashCode();
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
        HrNetworkEntry rhs = ((HrNetworkEntry) obj);
        return new EqualsBuilder().append(hrNetworkIfIndex, rhs.hrNetworkIfIndex).append(_index, rhs._index).isEquals();
    }

    public HrNetworkEntry clone() {
        HrNetworkEntry _copy = new HrNetworkEntry();
        _copy.hrNetworkIfIndex = hrNetworkIfIndex;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrNetworkIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
