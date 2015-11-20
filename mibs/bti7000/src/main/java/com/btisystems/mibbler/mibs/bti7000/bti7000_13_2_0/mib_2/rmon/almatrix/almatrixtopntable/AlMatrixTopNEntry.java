
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.almatrix.almatrixtopntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.almatrix.AlMatrixTopNTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.almatrix.almatrixtopntable.IAlMatrixTopNEntry;
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

public class AlMatrixTopNEntry
    extends DeviceEntity
    implements Serializable, IAlMatrixTopNEntry, IIndexed, IVariableBindingSetter
{

    private int alMatrixTopNIndex;
    private int alMatrixTopNProtocolDirLocalIndex;
    private String alMatrixTopNSourceAddress;
    private String alMatrixTopNDestAddress;
    private int alMatrixTopNAppProtocolDirLocalIndex;
    private int alMatrixTopNPktRate;
    private int alMatrixTopNReversePktRate;
    private int alMatrixTopNOctetRate;
    private int alMatrixTopNReverseOctetRate;
    private String _index;
    private AlMatrixTopNTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AlMatrixTopNEntry() {
    }

    public int getAlMatrixTopNIndex() {
        return this.alMatrixTopNIndex;
    }

    public void setAlMatrixTopNIndex(int alMatrixTopNIndex) {
        int oldValue = getAlMatrixTopNIndex();
        this.alMatrixTopNIndex = alMatrixTopNIndex;
        notifyChange(1, oldValue, alMatrixTopNIndex);
    }

    public int getAlMatrixTopNProtocolDirLocalIndex() {
        return this.alMatrixTopNProtocolDirLocalIndex;
    }

    public void setAlMatrixTopNProtocolDirLocalIndex(int alMatrixTopNProtocolDirLocalIndex) {
        int oldValue = getAlMatrixTopNProtocolDirLocalIndex();
        this.alMatrixTopNProtocolDirLocalIndex = alMatrixTopNProtocolDirLocalIndex;
        notifyChange(2, oldValue, alMatrixTopNProtocolDirLocalIndex);
    }

    public String getAlMatrixTopNSourceAddress() {
        return this.alMatrixTopNSourceAddress;
    }

    public void setAlMatrixTopNSourceAddress(String alMatrixTopNSourceAddress) {
        String oldValue = getAlMatrixTopNSourceAddress();
        this.alMatrixTopNSourceAddress = alMatrixTopNSourceAddress;
        notifyChange(3, oldValue, alMatrixTopNSourceAddress);
    }

    public String getAlMatrixTopNDestAddress() {
        return this.alMatrixTopNDestAddress;
    }

    public void setAlMatrixTopNDestAddress(String alMatrixTopNDestAddress) {
        String oldValue = getAlMatrixTopNDestAddress();
        this.alMatrixTopNDestAddress = alMatrixTopNDestAddress;
        notifyChange(4, oldValue, alMatrixTopNDestAddress);
    }

    public int getAlMatrixTopNAppProtocolDirLocalIndex() {
        return this.alMatrixTopNAppProtocolDirLocalIndex;
    }

    public void setAlMatrixTopNAppProtocolDirLocalIndex(int alMatrixTopNAppProtocolDirLocalIndex) {
        int oldValue = getAlMatrixTopNAppProtocolDirLocalIndex();
        this.alMatrixTopNAppProtocolDirLocalIndex = alMatrixTopNAppProtocolDirLocalIndex;
        notifyChange(5, oldValue, alMatrixTopNAppProtocolDirLocalIndex);
    }

    public int getAlMatrixTopNPktRate() {
        return this.alMatrixTopNPktRate;
    }

    public void setAlMatrixTopNPktRate(int alMatrixTopNPktRate) {
        int oldValue = getAlMatrixTopNPktRate();
        this.alMatrixTopNPktRate = alMatrixTopNPktRate;
        notifyChange(6, oldValue, alMatrixTopNPktRate);
    }

    public int getAlMatrixTopNReversePktRate() {
        return this.alMatrixTopNReversePktRate;
    }

    public void setAlMatrixTopNReversePktRate(int alMatrixTopNReversePktRate) {
        int oldValue = getAlMatrixTopNReversePktRate();
        this.alMatrixTopNReversePktRate = alMatrixTopNReversePktRate;
        notifyChange(7, oldValue, alMatrixTopNReversePktRate);
    }

    public int getAlMatrixTopNOctetRate() {
        return this.alMatrixTopNOctetRate;
    }

    public void setAlMatrixTopNOctetRate(int alMatrixTopNOctetRate) {
        int oldValue = getAlMatrixTopNOctetRate();
        this.alMatrixTopNOctetRate = alMatrixTopNOctetRate;
        notifyChange(8, oldValue, alMatrixTopNOctetRate);
    }

    public int getAlMatrixTopNReverseOctetRate() {
        return this.alMatrixTopNReverseOctetRate;
    }

    public void setAlMatrixTopNReverseOctetRate(int alMatrixTopNReverseOctetRate) {
        int oldValue = getAlMatrixTopNReverseOctetRate();
        this.alMatrixTopNReverseOctetRate = alMatrixTopNReverseOctetRate;
        notifyChange(9, oldValue, alMatrixTopNReverseOctetRate);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setAlMatrixTopNIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setAlMatrixTopNProtocolDirLocalIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setAlMatrixTopNSourceAddress(binding.getVariable().toString());
                break;
            case  4 :
                setAlMatrixTopNDestAddress(binding.getVariable().toString());
                break;
            case  5 :
                setAlMatrixTopNAppProtocolDirLocalIndex(binding.getVariable().toInt());
                break;
            case  6 :
                setAlMatrixTopNPktRate(binding.getVariable().toInt());
                break;
            case  7 :
                setAlMatrixTopNReversePktRate(binding.getVariable().toInt());
                break;
            case  8 :
                setAlMatrixTopNOctetRate(binding.getVariable().toInt());
                break;
            case  9 :
                setAlMatrixTopNReverseOctetRate(binding.getVariable().toInt());
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
        setAlMatrixTopNIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AlMatrixTopNTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alMatrixTopNIndex", alMatrixTopNIndex).append("alMatrixTopNProtocolDirLocalIndex", alMatrixTopNProtocolDirLocalIndex).append("alMatrixTopNSourceAddress", alMatrixTopNSourceAddress).append("alMatrixTopNDestAddress", alMatrixTopNDestAddress).append("alMatrixTopNAppProtocolDirLocalIndex", alMatrixTopNAppProtocolDirLocalIndex).append("alMatrixTopNPktRate", alMatrixTopNPktRate).append("alMatrixTopNReversePktRate", alMatrixTopNReversePktRate).append("alMatrixTopNOctetRate", alMatrixTopNOctetRate).append("alMatrixTopNReverseOctetRate", alMatrixTopNReverseOctetRate).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alMatrixTopNIndex).append(alMatrixTopNProtocolDirLocalIndex).append(alMatrixTopNSourceAddress).append(alMatrixTopNDestAddress).append(alMatrixTopNAppProtocolDirLocalIndex).append(alMatrixTopNPktRate).append(alMatrixTopNReversePktRate).append(alMatrixTopNOctetRate).append(alMatrixTopNReverseOctetRate).append(_index).toHashCode();
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
        AlMatrixTopNEntry rhs = ((AlMatrixTopNEntry) obj);
        return new EqualsBuilder().append(alMatrixTopNIndex, rhs.alMatrixTopNIndex).append(alMatrixTopNProtocolDirLocalIndex, rhs.alMatrixTopNProtocolDirLocalIndex).append(alMatrixTopNSourceAddress, rhs.alMatrixTopNSourceAddress).append(alMatrixTopNDestAddress, rhs.alMatrixTopNDestAddress).append(alMatrixTopNAppProtocolDirLocalIndex, rhs.alMatrixTopNAppProtocolDirLocalIndex).append(alMatrixTopNPktRate, rhs.alMatrixTopNPktRate).append(alMatrixTopNReversePktRate, rhs.alMatrixTopNReversePktRate).append(alMatrixTopNOctetRate, rhs.alMatrixTopNOctetRate).append(alMatrixTopNReverseOctetRate, rhs.alMatrixTopNReverseOctetRate).append(_index, rhs._index).isEquals();
    }

    public AlMatrixTopNEntry clone() {
        AlMatrixTopNEntry _copy = new AlMatrixTopNEntry();
        _copy.alMatrixTopNIndex = alMatrixTopNIndex;
        _copy.alMatrixTopNProtocolDirLocalIndex = alMatrixTopNProtocolDirLocalIndex;
        _copy.alMatrixTopNSourceAddress = alMatrixTopNSourceAddress;
        _copy.alMatrixTopNDestAddress = alMatrixTopNDestAddress;
        _copy.alMatrixTopNAppProtocolDirLocalIndex = alMatrixTopNAppProtocolDirLocalIndex;
        _copy.alMatrixTopNPktRate = alMatrixTopNPktRate;
        _copy.alMatrixTopNReversePktRate = alMatrixTopNReversePktRate;
        _copy.alMatrixTopNOctetRate = alMatrixTopNOctetRate;
        _copy.alMatrixTopNReverseOctetRate = alMatrixTopNReverseOctetRate;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.17.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alMatrixTopNIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "alMatrixTopNProtocolDirLocalIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "alMatrixTopNSourceAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "alMatrixTopNDestAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "alMatrixTopNAppProtocolDirLocalIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "alMatrixTopNPktRate", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "alMatrixTopNReversePktRate", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "alMatrixTopNOctetRate", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "alMatrixTopNReverseOctetRate", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
