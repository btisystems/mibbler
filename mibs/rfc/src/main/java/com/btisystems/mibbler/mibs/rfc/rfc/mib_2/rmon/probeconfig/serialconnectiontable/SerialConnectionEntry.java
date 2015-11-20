
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.probeconfig.serialconnectiontable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.probeconfig.serialconnectiontable.ISerialConnectionEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.probeconfig.SerialConnectionTable;
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

public class SerialConnectionEntry
    extends DeviceEntity
    implements Serializable, ISerialConnectionEntry, IIndexed, IVariableBindingSetter
{

    private int serialConnectIndex;
    private String serialConnectDestIpAddress;
    private Integer serialConnectType;
    private String serialConnectDialString;
    private String serialConnectSwitchConnectSeq;
    private String serialConnectSwitchDisconnectSeq;
    private String serialConnectSwitchResetSeq;
    private String serialConnectOwner;
    private int serialConnectStatus;
    private String _index;
    private SerialConnectionTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SerialConnectionEntry() {
    }

    public int getSerialConnectIndex() {
        return this.serialConnectIndex;
    }

    public void setSerialConnectIndex(int serialConnectIndex) {
        int oldValue = getSerialConnectIndex();
        this.serialConnectIndex = serialConnectIndex;
        notifyChange(1, oldValue, serialConnectIndex);
    }

    public String getSerialConnectDestIpAddress() {
        return this.serialConnectDestIpAddress;
    }

    public void setSerialConnectDestIpAddress(String serialConnectDestIpAddress) {
        String oldValue = getSerialConnectDestIpAddress();
        this.serialConnectDestIpAddress = serialConnectDestIpAddress;
        notifyChange(2, oldValue, serialConnectDestIpAddress);
    }

    public int getSerialConnectType() {
        if (this.serialConnectType == null) {
            return  1;
        }
        return this.serialConnectType;
    }

    public boolean isSerialConnectTypeDefined() {
        return (this.serialConnectType!= null);
    }

    public void setSerialConnectType(int serialConnectType) {
        int oldValue = getSerialConnectType();
        this.serialConnectType = serialConnectType;
        notifyChange(3, oldValue, serialConnectType);
    }

    public String getSerialConnectDialString() {
        return this.serialConnectDialString;
    }

    public void setSerialConnectDialString(String serialConnectDialString) {
        String oldValue = getSerialConnectDialString();
        this.serialConnectDialString = serialConnectDialString;
        notifyChange(4, oldValue, serialConnectDialString);
    }

    public String getSerialConnectSwitchConnectSeq() {
        return this.serialConnectSwitchConnectSeq;
    }

    public void setSerialConnectSwitchConnectSeq(String serialConnectSwitchConnectSeq) {
        String oldValue = getSerialConnectSwitchConnectSeq();
        this.serialConnectSwitchConnectSeq = serialConnectSwitchConnectSeq;
        notifyChange(5, oldValue, serialConnectSwitchConnectSeq);
    }

    public String getSerialConnectSwitchDisconnectSeq() {
        return this.serialConnectSwitchDisconnectSeq;
    }

    public void setSerialConnectSwitchDisconnectSeq(String serialConnectSwitchDisconnectSeq) {
        String oldValue = getSerialConnectSwitchDisconnectSeq();
        this.serialConnectSwitchDisconnectSeq = serialConnectSwitchDisconnectSeq;
        notifyChange(6, oldValue, serialConnectSwitchDisconnectSeq);
    }

    public String getSerialConnectSwitchResetSeq() {
        return this.serialConnectSwitchResetSeq;
    }

    public void setSerialConnectSwitchResetSeq(String serialConnectSwitchResetSeq) {
        String oldValue = getSerialConnectSwitchResetSeq();
        this.serialConnectSwitchResetSeq = serialConnectSwitchResetSeq;
        notifyChange(7, oldValue, serialConnectSwitchResetSeq);
    }

    public String getSerialConnectOwner() {
        return this.serialConnectOwner;
    }

    public void setSerialConnectOwner(String serialConnectOwner) {
        String oldValue = getSerialConnectOwner();
        this.serialConnectOwner = serialConnectOwner;
        notifyChange(8, oldValue, serialConnectOwner);
    }

    public int getSerialConnectStatus() {
        return this.serialConnectStatus;
    }

    public void setSerialConnectStatus(int serialConnectStatus) {
        int oldValue = getSerialConnectStatus();
        this.serialConnectStatus = serialConnectStatus;
        notifyChange(9, oldValue, serialConnectStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSerialConnectIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setSerialConnectDestIpAddress(binding.getVariable().toString());
                break;
            case  3 :
                setSerialConnectType(binding.getVariable().toInt());
                break;
            case  4 :
                setSerialConnectDialString(binding.getVariable().toString());
                break;
            case  5 :
                setSerialConnectSwitchConnectSeq(binding.getVariable().toString());
                break;
            case  6 :
                setSerialConnectSwitchDisconnectSeq(binding.getVariable().toString());
                break;
            case  7 :
                setSerialConnectSwitchResetSeq(binding.getVariable().toString());
                break;
            case  8 :
                setSerialConnectOwner(binding.getVariable().toString());
                break;
            case  9 :
                setSerialConnectStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setSerialConnectIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SerialConnectionTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("serialConnectIndex", serialConnectIndex).append("serialConnectDestIpAddress", serialConnectDestIpAddress).append("serialConnectType", serialConnectType).append("serialConnectDialString", serialConnectDialString).append("serialConnectSwitchConnectSeq", serialConnectSwitchConnectSeq).append("serialConnectSwitchDisconnectSeq", serialConnectSwitchDisconnectSeq).append("serialConnectSwitchResetSeq", serialConnectSwitchResetSeq).append("serialConnectOwner", serialConnectOwner).append("serialConnectStatus", serialConnectStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(serialConnectIndex).append(serialConnectDestIpAddress).append(serialConnectType).append(serialConnectDialString).append(serialConnectSwitchConnectSeq).append(serialConnectSwitchDisconnectSeq).append(serialConnectSwitchResetSeq).append(serialConnectOwner).append(serialConnectStatus).append(_index).toHashCode();
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
        SerialConnectionEntry rhs = ((SerialConnectionEntry) obj);
        return new EqualsBuilder().append(serialConnectIndex, rhs.serialConnectIndex).append(serialConnectDestIpAddress, rhs.serialConnectDestIpAddress).append(serialConnectType, rhs.serialConnectType).append(serialConnectDialString, rhs.serialConnectDialString).append(serialConnectSwitchConnectSeq, rhs.serialConnectSwitchConnectSeq).append(serialConnectSwitchDisconnectSeq, rhs.serialConnectSwitchDisconnectSeq).append(serialConnectSwitchResetSeq, rhs.serialConnectSwitchResetSeq).append(serialConnectOwner, rhs.serialConnectOwner).append(serialConnectStatus, rhs.serialConnectStatus).append(_index, rhs._index).isEquals();
    }

    public SerialConnectionEntry clone() {
        SerialConnectionEntry _copy = new SerialConnectionEntry();
        _copy.serialConnectIndex = serialConnectIndex;
        _copy.serialConnectDestIpAddress = serialConnectDestIpAddress;
        _copy.serialConnectType = serialConnectType;
        _copy.serialConnectDialString = serialConnectDialString;
        _copy.serialConnectSwitchConnectSeq = serialConnectSwitchConnectSeq;
        _copy.serialConnectSwitchDisconnectSeq = serialConnectSwitchDisconnectSeq;
        _copy.serialConnectSwitchResetSeq = serialConnectSwitchResetSeq;
        _copy.serialConnectOwner = serialConnectOwner;
        _copy.serialConnectStatus = serialConnectStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.19.14.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "serialConnectIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "serialConnectDestIpAddress", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "serialConnectType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "serialConnectDialString", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "serialConnectSwitchConnectSeq", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "serialConnectSwitchDisconnectSeq", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "serialConnectSwitchResetSeq", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "serialConnectOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "serialConnectStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
