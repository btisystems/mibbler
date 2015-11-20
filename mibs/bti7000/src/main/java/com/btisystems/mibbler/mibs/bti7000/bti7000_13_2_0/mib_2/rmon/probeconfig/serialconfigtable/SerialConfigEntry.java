
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.probeconfig.serialconfigtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.probeconfig.SerialConfigTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.probeconfig.serialconfigtable.ISerialConfigEntry;
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

public class SerialConfigEntry
    extends DeviceEntity
    implements Serializable, ISerialConfigEntry, IIndexed, IVariableBindingSetter
{

    private Integer serialMode;
    private Integer serialProtocol;
    private Integer serialTimeout;
    private String serialModemInitString;
    private String serialModemHangUpString;
    private String serialModemConnectResp;
    private String serialModemNoConnectResp;
    private Integer serialDialoutTimeout;
    private int serialStatus;
    private String _index;
    private SerialConfigTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SerialConfigEntry() {
    }

    public int getSerialMode() {
        if (this.serialMode == null) {
            return  1;
        }
        return this.serialMode;
    }

    public boolean isSerialModeDefined() {
        return (this.serialMode!= null);
    }

    public void setSerialMode(int serialMode) {
        int oldValue = getSerialMode();
        this.serialMode = serialMode;
        notifyChange(1, oldValue, serialMode);
    }

    public int getSerialProtocol() {
        if (this.serialProtocol == null) {
            return  2;
        }
        return this.serialProtocol;
    }

    public boolean isSerialProtocolDefined() {
        return (this.serialProtocol!= null);
    }

    public void setSerialProtocol(int serialProtocol) {
        int oldValue = getSerialProtocol();
        this.serialProtocol = serialProtocol;
        notifyChange(2, oldValue, serialProtocol);
    }

    public int getSerialTimeout() {
        if (this.serialTimeout == null) {
            return  300;
        }
        return this.serialTimeout;
    }

    public boolean isSerialTimeoutDefined() {
        return (this.serialTimeout!= null);
    }

    public void setSerialTimeout(int serialTimeout) {
        int oldValue = getSerialTimeout();
        this.serialTimeout = serialTimeout;
        notifyChange(3, oldValue, serialTimeout);
    }

    public String getSerialModemInitString() {
        return this.serialModemInitString;
    }

    public void setSerialModemInitString(String serialModemInitString) {
        String oldValue = getSerialModemInitString();
        this.serialModemInitString = serialModemInitString;
        notifyChange(4, oldValue, serialModemInitString);
    }

    public String getSerialModemHangUpString() {
        return this.serialModemHangUpString;
    }

    public void setSerialModemHangUpString(String serialModemHangUpString) {
        String oldValue = getSerialModemHangUpString();
        this.serialModemHangUpString = serialModemHangUpString;
        notifyChange(5, oldValue, serialModemHangUpString);
    }

    public String getSerialModemConnectResp() {
        return this.serialModemConnectResp;
    }

    public void setSerialModemConnectResp(String serialModemConnectResp) {
        String oldValue = getSerialModemConnectResp();
        this.serialModemConnectResp = serialModemConnectResp;
        notifyChange(6, oldValue, serialModemConnectResp);
    }

    public String getSerialModemNoConnectResp() {
        return this.serialModemNoConnectResp;
    }

    public void setSerialModemNoConnectResp(String serialModemNoConnectResp) {
        String oldValue = getSerialModemNoConnectResp();
        this.serialModemNoConnectResp = serialModemNoConnectResp;
        notifyChange(7, oldValue, serialModemNoConnectResp);
    }

    public int getSerialDialoutTimeout() {
        if (this.serialDialoutTimeout == null) {
            return  20;
        }
        return this.serialDialoutTimeout;
    }

    public boolean isSerialDialoutTimeoutDefined() {
        return (this.serialDialoutTimeout!= null);
    }

    public void setSerialDialoutTimeout(int serialDialoutTimeout) {
        int oldValue = getSerialDialoutTimeout();
        this.serialDialoutTimeout = serialDialoutTimeout;
        notifyChange(8, oldValue, serialDialoutTimeout);
    }

    public int getSerialStatus() {
        return this.serialStatus;
    }

    public void setSerialStatus(int serialStatus) {
        int oldValue = getSerialStatus();
        this.serialStatus = serialStatus;
        notifyChange(9, oldValue, serialStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSerialMode(binding.getVariable().toInt());
                break;
            case  2 :
                setSerialProtocol(binding.getVariable().toInt());
                break;
            case  3 :
                setSerialTimeout(binding.getVariable().toInt());
                break;
            case  4 :
                setSerialModemInitString(binding.getVariable().toString());
                break;
            case  5 :
                setSerialModemHangUpString(binding.getVariable().toString());
                break;
            case  6 :
                setSerialModemConnectResp(binding.getVariable().toString());
                break;
            case  7 :
                setSerialModemNoConnectResp(binding.getVariable().toString());
                break;
            case  8 :
                setSerialDialoutTimeout(binding.getVariable().toInt());
                break;
            case  9 :
                setSerialStatus(binding.getVariable().toInt());
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

    public void _setTable(SerialConfigTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("serialMode", serialMode).append("serialProtocol", serialProtocol).append("serialTimeout", serialTimeout).append("serialModemInitString", serialModemInitString).append("serialModemHangUpString", serialModemHangUpString).append("serialModemConnectResp", serialModemConnectResp).append("serialModemNoConnectResp", serialModemNoConnectResp).append("serialDialoutTimeout", serialDialoutTimeout).append("serialStatus", serialStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(serialMode).append(serialProtocol).append(serialTimeout).append(serialModemInitString).append(serialModemHangUpString).append(serialModemConnectResp).append(serialModemNoConnectResp).append(serialDialoutTimeout).append(serialStatus).append(_index).toHashCode();
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
        SerialConfigEntry rhs = ((SerialConfigEntry) obj);
        return new EqualsBuilder().append(serialMode, rhs.serialMode).append(serialProtocol, rhs.serialProtocol).append(serialTimeout, rhs.serialTimeout).append(serialModemInitString, rhs.serialModemInitString).append(serialModemHangUpString, rhs.serialModemHangUpString).append(serialModemConnectResp, rhs.serialModemConnectResp).append(serialModemNoConnectResp, rhs.serialModemNoConnectResp).append(serialDialoutTimeout, rhs.serialDialoutTimeout).append(serialStatus, rhs.serialStatus).append(_index, rhs._index).isEquals();
    }

    public SerialConfigEntry clone() {
        SerialConfigEntry _copy = new SerialConfigEntry();
        _copy.serialMode = serialMode;
        _copy.serialProtocol = serialProtocol;
        _copy.serialTimeout = serialTimeout;
        _copy.serialModemInitString = serialModemInitString;
        _copy.serialModemHangUpString = serialModemHangUpString;
        _copy.serialModemConnectResp = serialModemConnectResp;
        _copy.serialModemNoConnectResp = serialModemNoConnectResp;
        _copy.serialDialoutTimeout = serialDialoutTimeout;
        _copy.serialStatus = serialStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.19.10.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "serialMode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "serialProtocol", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "serialTimeout", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "serialModemInitString", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "serialModemHangUpString", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "serialModemConnectResp", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "serialModemNoConnectResp", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "serialDialoutTimeout", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "serialStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
