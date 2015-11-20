
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.probeconfig.trapdesttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig.trapdesttable.ITrapDestEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.probeconfig.TrapDestTable;
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

public class TrapDestEntry
    extends DeviceEntity
    implements Serializable, ITrapDestEntry, IIndexed, IVariableBindingSetter
{

    private int trapDestIndex;
    private String trapDestCommunity;
    private int trapDestProtocol;
    private String trapDestAddress;
    private String trapDestOwner;
    private int trapDestStatus;
    private String _index;
    private TrapDestTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TrapDestEntry() {
    }

    public int getTrapDestIndex() {
        return this.trapDestIndex;
    }

    public void setTrapDestIndex(int trapDestIndex) {
        int oldValue = getTrapDestIndex();
        this.trapDestIndex = trapDestIndex;
        notifyChange(1, oldValue, trapDestIndex);
    }

    public String getTrapDestCommunity() {
        return this.trapDestCommunity;
    }

    public void setTrapDestCommunity(String trapDestCommunity) {
        String oldValue = getTrapDestCommunity();
        this.trapDestCommunity = trapDestCommunity;
        notifyChange(2, oldValue, trapDestCommunity);
    }

    public int getTrapDestProtocol() {
        return this.trapDestProtocol;
    }

    public void setTrapDestProtocol(int trapDestProtocol) {
        int oldValue = getTrapDestProtocol();
        this.trapDestProtocol = trapDestProtocol;
        notifyChange(3, oldValue, trapDestProtocol);
    }

    public String getTrapDestAddress() {
        return this.trapDestAddress;
    }

    public void setTrapDestAddress(String trapDestAddress) {
        String oldValue = getTrapDestAddress();
        this.trapDestAddress = trapDestAddress;
        notifyChange(4, oldValue, trapDestAddress);
    }

    public String getTrapDestOwner() {
        return this.trapDestOwner;
    }

    public void setTrapDestOwner(String trapDestOwner) {
        String oldValue = getTrapDestOwner();
        this.trapDestOwner = trapDestOwner;
        notifyChange(5, oldValue, trapDestOwner);
    }

    public int getTrapDestStatus() {
        return this.trapDestStatus;
    }

    public void setTrapDestStatus(int trapDestStatus) {
        int oldValue = getTrapDestStatus();
        this.trapDestStatus = trapDestStatus;
        notifyChange(6, oldValue, trapDestStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setTrapDestIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setTrapDestCommunity(binding.getVariable().toString());
                break;
            case  3 :
                setTrapDestProtocol(binding.getVariable().toInt());
                break;
            case  4 :
                setTrapDestAddress(binding.getVariable().toString());
                break;
            case  5 :
                setTrapDestOwner(binding.getVariable().toString());
                break;
            case  6 :
                setTrapDestStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setTrapDestIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(TrapDestTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("trapDestIndex", trapDestIndex).append("trapDestCommunity", trapDestCommunity).append("trapDestProtocol", trapDestProtocol).append("trapDestAddress", trapDestAddress).append("trapDestOwner", trapDestOwner).append("trapDestStatus", trapDestStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(trapDestIndex).append(trapDestCommunity).append(trapDestProtocol).append(trapDestAddress).append(trapDestOwner).append(trapDestStatus).append(_index).toHashCode();
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
        TrapDestEntry rhs = ((TrapDestEntry) obj);
        return new EqualsBuilder().append(trapDestIndex, rhs.trapDestIndex).append(trapDestCommunity, rhs.trapDestCommunity).append(trapDestProtocol, rhs.trapDestProtocol).append(trapDestAddress, rhs.trapDestAddress).append(trapDestOwner, rhs.trapDestOwner).append(trapDestStatus, rhs.trapDestStatus).append(_index, rhs._index).isEquals();
    }

    public TrapDestEntry clone() {
        TrapDestEntry _copy = new TrapDestEntry();
        _copy.trapDestIndex = trapDestIndex;
        _copy.trapDestCommunity = trapDestCommunity;
        _copy.trapDestProtocol = trapDestProtocol;
        _copy.trapDestAddress = trapDestAddress;
        _copy.trapDestOwner = trapDestOwner;
        _copy.trapDestStatus = trapDestStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.19.13.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "trapDestIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "trapDestCommunity", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "trapDestProtocol", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "trapDestAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "trapDestOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "trapDestStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
