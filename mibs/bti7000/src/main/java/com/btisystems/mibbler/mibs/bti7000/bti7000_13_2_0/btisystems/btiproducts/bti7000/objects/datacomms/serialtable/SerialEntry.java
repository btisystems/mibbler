
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.serialtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.SerialTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.serialtable.ISerialEntry;
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

public class SerialEntry
    extends DeviceEntity
    implements Serializable, ISerialEntry, IIndexed, IVariableBindingSetter
{

    private int serialPortIdx;
    private int serialBaudRate;
    private int serialDataBits;
    private int serialParity;
    private int serialStopBits;
    private String _index;
    private SerialTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SerialEntry() {
    }

    public int getSerialPortIdx() {
        return this.serialPortIdx;
    }

    public void setSerialPortIdx(int serialPortIdx) {
        int oldValue = getSerialPortIdx();
        this.serialPortIdx = serialPortIdx;
        notifyChange(1, oldValue, serialPortIdx);
    }

    public int getSerialBaudRate() {
        return this.serialBaudRate;
    }

    public void setSerialBaudRate(int serialBaudRate) {
        int oldValue = getSerialBaudRate();
        this.serialBaudRate = serialBaudRate;
        notifyChange(2, oldValue, serialBaudRate);
    }

    public int getSerialDataBits() {
        return this.serialDataBits;
    }

    public void setSerialDataBits(int serialDataBits) {
        int oldValue = getSerialDataBits();
        this.serialDataBits = serialDataBits;
        notifyChange(3, oldValue, serialDataBits);
    }

    public int getSerialParity() {
        return this.serialParity;
    }

    public void setSerialParity(int serialParity) {
        int oldValue = getSerialParity();
        this.serialParity = serialParity;
        notifyChange(4, oldValue, serialParity);
    }

    public int getSerialStopBits() {
        return this.serialStopBits;
    }

    public void setSerialStopBits(int serialStopBits) {
        int oldValue = getSerialStopBits();
        this.serialStopBits = serialStopBits;
        notifyChange(5, oldValue, serialStopBits);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setSerialPortIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setSerialBaudRate(binding.getVariable().toInt());
                break;
            case  3 :
                setSerialDataBits(binding.getVariable().toInt());
                break;
            case  4 :
                setSerialParity(binding.getVariable().toInt());
                break;
            case  5 :
                setSerialStopBits(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setSerialPortIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SerialTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("serialPortIdx", serialPortIdx).append("serialBaudRate", serialBaudRate).append("serialDataBits", serialDataBits).append("serialParity", serialParity).append("serialStopBits", serialStopBits).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(serialPortIdx).append(serialBaudRate).append(serialDataBits).append(serialParity).append(serialStopBits).append(_index).toHashCode();
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
        SerialEntry rhs = ((SerialEntry) obj);
        return new EqualsBuilder().append(serialPortIdx, rhs.serialPortIdx).append(serialBaudRate, rhs.serialBaudRate).append(serialDataBits, rhs.serialDataBits).append(serialParity, rhs.serialParity).append(serialStopBits, rhs.serialStopBits).append(_index, rhs._index).isEquals();
    }

    public SerialEntry clone() {
        SerialEntry _copy = new SerialEntry();
        _copy.serialPortIdx = serialPortIdx;
        _copy.serialBaudRate = serialBaudRate;
        _copy.serialDataBits = serialDataBits;
        _copy.serialParity = serialParity;
        _copy.serialStopBits = serialStopBits;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.5.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "serialPortIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "serialBaudRate", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "serialDataBits", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "serialParity", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "serialStopBits", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
