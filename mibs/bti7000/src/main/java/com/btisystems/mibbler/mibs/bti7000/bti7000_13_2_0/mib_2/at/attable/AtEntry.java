
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.at.attable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.at.AtTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.at.attable.IAtEntry;
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

public class AtEntry
    extends DeviceEntity
    implements Serializable, IAtEntry, IIndexed, IVariableBindingSetter
{

    private int atIfIndex;
    private String atPhysAddress;
    private String atNetAddress;
    private String _index;
    private AtTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AtEntry() {
    }

    public int getAtIfIndex() {
        return this.atIfIndex;
    }

    public void setAtIfIndex(int atIfIndex) {
        int oldValue = getAtIfIndex();
        this.atIfIndex = atIfIndex;
        notifyChange(1, oldValue, atIfIndex);
    }

    public String getAtPhysAddress() {
        return this.atPhysAddress;
    }

    public void setAtPhysAddress(String atPhysAddress) {
        String oldValue = getAtPhysAddress();
        this.atPhysAddress = atPhysAddress;
        notifyChange(2, oldValue, atPhysAddress);
    }

    public String getAtNetAddress() {
        return this.atNetAddress;
    }

    public void setAtNetAddress(String atNetAddress) {
        String oldValue = getAtNetAddress();
        this.atNetAddress = atNetAddress;
        notifyChange(3, oldValue, atNetAddress);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setAtIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setAtPhysAddress(binding.getVariable().toString());
                break;
            case  3 :
                setAtNetAddress(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setAtIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setAtNetAddress(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AtTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("atIfIndex", atIfIndex).append("atPhysAddress", atPhysAddress).append("atNetAddress", atNetAddress).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(atIfIndex).append(atPhysAddress).append(atNetAddress).append(_index).toHashCode();
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
        AtEntry rhs = ((AtEntry) obj);
        return new EqualsBuilder().append(atIfIndex, rhs.atIfIndex).append(atPhysAddress, rhs.atPhysAddress).append(atNetAddress, rhs.atNetAddress).append(_index, rhs._index).isEquals();
    }

    public AtEntry clone() {
        AtEntry _copy = new AtEntry();
        _copy.atIfIndex = atIfIndex;
        _copy.atPhysAddress = atPhysAddress;
        _copy.atNetAddress = atNetAddress;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.3.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "atIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "atPhysAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "atNetAddress", DeviceEntityDescription.FieldType.STRING, 1024));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
