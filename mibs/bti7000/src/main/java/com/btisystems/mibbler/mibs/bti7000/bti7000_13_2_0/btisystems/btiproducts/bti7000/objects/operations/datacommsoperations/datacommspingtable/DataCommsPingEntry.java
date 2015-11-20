
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.datacommsoperations.datacommspingtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.datacommsoperations.DataCommsPingTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.datacommsoperations.datacommspingtable.IDataCommsPingEntry;
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

public class DataCommsPingEntry
    extends DeviceEntity
    implements Serializable, IDataCommsPingEntry, IIndexed, IVariableBindingSetter
{

    private int dataCommsPingCpTypeIdx;
    private int dataCommsPingShelfIdx;
    private int dataCommsPingSlotIdx;
    private int dataCommsPingCmd;
    private String dataCommsPingAddress;
    private int dataCommsPingNumAttempts;
    private int dataCommsPingNumSuccesses;
    private String _index;
    private DataCommsPingTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public DataCommsPingEntry() {
    }

    public int getDataCommsPingCpTypeIdx() {
        return this.dataCommsPingCpTypeIdx;
    }

    public void setDataCommsPingCpTypeIdx(int dataCommsPingCpTypeIdx) {
        int oldValue = getDataCommsPingCpTypeIdx();
        this.dataCommsPingCpTypeIdx = dataCommsPingCpTypeIdx;
        notifyChange(1, oldValue, dataCommsPingCpTypeIdx);
    }

    public int getDataCommsPingShelfIdx() {
        return this.dataCommsPingShelfIdx;
    }

    public void setDataCommsPingShelfIdx(int dataCommsPingShelfIdx) {
        int oldValue = getDataCommsPingShelfIdx();
        this.dataCommsPingShelfIdx = dataCommsPingShelfIdx;
        notifyChange(2, oldValue, dataCommsPingShelfIdx);
    }

    public int getDataCommsPingSlotIdx() {
        return this.dataCommsPingSlotIdx;
    }

    public void setDataCommsPingSlotIdx(int dataCommsPingSlotIdx) {
        int oldValue = getDataCommsPingSlotIdx();
        this.dataCommsPingSlotIdx = dataCommsPingSlotIdx;
        notifyChange(3, oldValue, dataCommsPingSlotIdx);
    }

    public int getDataCommsPingCmd() {
        return this.dataCommsPingCmd;
    }

    public void setDataCommsPingCmd(int dataCommsPingCmd) {
        int oldValue = getDataCommsPingCmd();
        this.dataCommsPingCmd = dataCommsPingCmd;
        notifyChange(4, oldValue, dataCommsPingCmd);
    }

    public String getDataCommsPingAddress() {
        return this.dataCommsPingAddress;
    }

    public void setDataCommsPingAddress(String dataCommsPingAddress) {
        String oldValue = getDataCommsPingAddress();
        this.dataCommsPingAddress = dataCommsPingAddress;
        notifyChange(5, oldValue, dataCommsPingAddress);
    }

    public int getDataCommsPingNumAttempts() {
        return this.dataCommsPingNumAttempts;
    }

    public void setDataCommsPingNumAttempts(int dataCommsPingNumAttempts) {
        int oldValue = getDataCommsPingNumAttempts();
        this.dataCommsPingNumAttempts = dataCommsPingNumAttempts;
        notifyChange(6, oldValue, dataCommsPingNumAttempts);
    }

    public int getDataCommsPingNumSuccesses() {
        return this.dataCommsPingNumSuccesses;
    }

    public void setDataCommsPingNumSuccesses(int dataCommsPingNumSuccesses) {
        int oldValue = getDataCommsPingNumSuccesses();
        this.dataCommsPingNumSuccesses = dataCommsPingNumSuccesses;
        notifyChange(7, oldValue, dataCommsPingNumSuccesses);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setDataCommsPingCpTypeIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setDataCommsPingShelfIdx(binding.getVariable().toInt());
                break;
            case  3 :
                setDataCommsPingSlotIdx(binding.getVariable().toInt());
                break;
            case  4 :
                setDataCommsPingCmd(binding.getVariable().toInt());
                break;
            case  5 :
                setDataCommsPingAddress(binding.getVariable().toString());
                break;
            case  6 :
                setDataCommsPingNumAttempts(binding.getVariable().toInt());
                break;
            case  7 :
                setDataCommsPingNumSuccesses(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setDataCommsPingCpTypeIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setDataCommsPingShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setDataCommsPingSlotIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(DataCommsPingTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dataCommsPingCpTypeIdx", dataCommsPingCpTypeIdx).append("dataCommsPingShelfIdx", dataCommsPingShelfIdx).append("dataCommsPingSlotIdx", dataCommsPingSlotIdx).append("dataCommsPingCmd", dataCommsPingCmd).append("dataCommsPingAddress", dataCommsPingAddress).append("dataCommsPingNumAttempts", dataCommsPingNumAttempts).append("dataCommsPingNumSuccesses", dataCommsPingNumSuccesses).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dataCommsPingCpTypeIdx).append(dataCommsPingShelfIdx).append(dataCommsPingSlotIdx).append(dataCommsPingCmd).append(dataCommsPingAddress).append(dataCommsPingNumAttempts).append(dataCommsPingNumSuccesses).append(_index).toHashCode();
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
        DataCommsPingEntry rhs = ((DataCommsPingEntry) obj);
        return new EqualsBuilder().append(dataCommsPingCpTypeIdx, rhs.dataCommsPingCpTypeIdx).append(dataCommsPingShelfIdx, rhs.dataCommsPingShelfIdx).append(dataCommsPingSlotIdx, rhs.dataCommsPingSlotIdx).append(dataCommsPingCmd, rhs.dataCommsPingCmd).append(dataCommsPingAddress, rhs.dataCommsPingAddress).append(dataCommsPingNumAttempts, rhs.dataCommsPingNumAttempts).append(dataCommsPingNumSuccesses, rhs.dataCommsPingNumSuccesses).append(_index, rhs._index).isEquals();
    }

    public DataCommsPingEntry clone() {
        DataCommsPingEntry _copy = new DataCommsPingEntry();
        _copy.dataCommsPingCpTypeIdx = dataCommsPingCpTypeIdx;
        _copy.dataCommsPingShelfIdx = dataCommsPingShelfIdx;
        _copy.dataCommsPingSlotIdx = dataCommsPingSlotIdx;
        _copy.dataCommsPingCmd = dataCommsPingCmd;
        _copy.dataCommsPingAddress = dataCommsPingAddress;
        _copy.dataCommsPingNumAttempts = dataCommsPingNumAttempts;
        _copy.dataCommsPingNumSuccesses = dataCommsPingNumSuccesses;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.7.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dataCommsPingCpTypeIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dataCommsPingShelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dataCommsPingSlotIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dataCommsPingCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dataCommsPingAddress", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "dataCommsPingNumAttempts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "dataCommsPingNumSuccesses", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
