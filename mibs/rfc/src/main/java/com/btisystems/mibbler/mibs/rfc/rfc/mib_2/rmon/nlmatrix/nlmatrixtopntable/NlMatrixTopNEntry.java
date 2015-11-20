
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.nlmatrixtopntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.nlmatrixtopntable.INlMatrixTopNEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.NlMatrixTopNTable;
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

public class NlMatrixTopNEntry
    extends DeviceEntity
    implements Serializable, INlMatrixTopNEntry, IIndexed, IVariableBindingSetter
{

    private int nlMatrixTopNIndex;
    private int nlMatrixTopNProtocolDirLocalIndex;
    private String nlMatrixTopNSourceAddress;
    private String nlMatrixTopNDestAddress;
    private int nlMatrixTopNPktRate;
    private int nlMatrixTopNReversePktRate;
    private int nlMatrixTopNOctetRate;
    private int nlMatrixTopNReverseOctetRate;
    private String _index;
    private NlMatrixTopNTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlMatrixTopNEntry() {
    }

    public int getNlMatrixTopNIndex() {
        return this.nlMatrixTopNIndex;
    }

    public void setNlMatrixTopNIndex(int nlMatrixTopNIndex) {
        int oldValue = getNlMatrixTopNIndex();
        this.nlMatrixTopNIndex = nlMatrixTopNIndex;
        notifyChange(1, oldValue, nlMatrixTopNIndex);
    }

    public int getNlMatrixTopNProtocolDirLocalIndex() {
        return this.nlMatrixTopNProtocolDirLocalIndex;
    }

    public void setNlMatrixTopNProtocolDirLocalIndex(int nlMatrixTopNProtocolDirLocalIndex) {
        int oldValue = getNlMatrixTopNProtocolDirLocalIndex();
        this.nlMatrixTopNProtocolDirLocalIndex = nlMatrixTopNProtocolDirLocalIndex;
        notifyChange(2, oldValue, nlMatrixTopNProtocolDirLocalIndex);
    }

    public String getNlMatrixTopNSourceAddress() {
        return this.nlMatrixTopNSourceAddress;
    }

    public void setNlMatrixTopNSourceAddress(String nlMatrixTopNSourceAddress) {
        String oldValue = getNlMatrixTopNSourceAddress();
        this.nlMatrixTopNSourceAddress = nlMatrixTopNSourceAddress;
        notifyChange(3, oldValue, nlMatrixTopNSourceAddress);
    }

    public String getNlMatrixTopNDestAddress() {
        return this.nlMatrixTopNDestAddress;
    }

    public void setNlMatrixTopNDestAddress(String nlMatrixTopNDestAddress) {
        String oldValue = getNlMatrixTopNDestAddress();
        this.nlMatrixTopNDestAddress = nlMatrixTopNDestAddress;
        notifyChange(4, oldValue, nlMatrixTopNDestAddress);
    }

    public int getNlMatrixTopNPktRate() {
        return this.nlMatrixTopNPktRate;
    }

    public void setNlMatrixTopNPktRate(int nlMatrixTopNPktRate) {
        int oldValue = getNlMatrixTopNPktRate();
        this.nlMatrixTopNPktRate = nlMatrixTopNPktRate;
        notifyChange(5, oldValue, nlMatrixTopNPktRate);
    }

    public int getNlMatrixTopNReversePktRate() {
        return this.nlMatrixTopNReversePktRate;
    }

    public void setNlMatrixTopNReversePktRate(int nlMatrixTopNReversePktRate) {
        int oldValue = getNlMatrixTopNReversePktRate();
        this.nlMatrixTopNReversePktRate = nlMatrixTopNReversePktRate;
        notifyChange(6, oldValue, nlMatrixTopNReversePktRate);
    }

    public int getNlMatrixTopNOctetRate() {
        return this.nlMatrixTopNOctetRate;
    }

    public void setNlMatrixTopNOctetRate(int nlMatrixTopNOctetRate) {
        int oldValue = getNlMatrixTopNOctetRate();
        this.nlMatrixTopNOctetRate = nlMatrixTopNOctetRate;
        notifyChange(7, oldValue, nlMatrixTopNOctetRate);
    }

    public int getNlMatrixTopNReverseOctetRate() {
        return this.nlMatrixTopNReverseOctetRate;
    }

    public void setNlMatrixTopNReverseOctetRate(int nlMatrixTopNReverseOctetRate) {
        int oldValue = getNlMatrixTopNReverseOctetRate();
        this.nlMatrixTopNReverseOctetRate = nlMatrixTopNReverseOctetRate;
        notifyChange(8, oldValue, nlMatrixTopNReverseOctetRate);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setNlMatrixTopNIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setNlMatrixTopNProtocolDirLocalIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setNlMatrixTopNSourceAddress(binding.getVariable().toString());
                break;
            case  4 :
                setNlMatrixTopNDestAddress(binding.getVariable().toString());
                break;
            case  5 :
                setNlMatrixTopNPktRate(binding.getVariable().toInt());
                break;
            case  6 :
                setNlMatrixTopNReversePktRate(binding.getVariable().toInt());
                break;
            case  7 :
                setNlMatrixTopNOctetRate(binding.getVariable().toInt());
                break;
            case  8 :
                setNlMatrixTopNReverseOctetRate(binding.getVariable().toInt());
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
        setNlMatrixTopNIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(NlMatrixTopNTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlMatrixTopNIndex", nlMatrixTopNIndex).append("nlMatrixTopNProtocolDirLocalIndex", nlMatrixTopNProtocolDirLocalIndex).append("nlMatrixTopNSourceAddress", nlMatrixTopNSourceAddress).append("nlMatrixTopNDestAddress", nlMatrixTopNDestAddress).append("nlMatrixTopNPktRate", nlMatrixTopNPktRate).append("nlMatrixTopNReversePktRate", nlMatrixTopNReversePktRate).append("nlMatrixTopNOctetRate", nlMatrixTopNOctetRate).append("nlMatrixTopNReverseOctetRate", nlMatrixTopNReverseOctetRate).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlMatrixTopNIndex).append(nlMatrixTopNProtocolDirLocalIndex).append(nlMatrixTopNSourceAddress).append(nlMatrixTopNDestAddress).append(nlMatrixTopNPktRate).append(nlMatrixTopNReversePktRate).append(nlMatrixTopNOctetRate).append(nlMatrixTopNReverseOctetRate).append(_index).toHashCode();
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
        NlMatrixTopNEntry rhs = ((NlMatrixTopNEntry) obj);
        return new EqualsBuilder().append(nlMatrixTopNIndex, rhs.nlMatrixTopNIndex).append(nlMatrixTopNProtocolDirLocalIndex, rhs.nlMatrixTopNProtocolDirLocalIndex).append(nlMatrixTopNSourceAddress, rhs.nlMatrixTopNSourceAddress).append(nlMatrixTopNDestAddress, rhs.nlMatrixTopNDestAddress).append(nlMatrixTopNPktRate, rhs.nlMatrixTopNPktRate).append(nlMatrixTopNReversePktRate, rhs.nlMatrixTopNReversePktRate).append(nlMatrixTopNOctetRate, rhs.nlMatrixTopNOctetRate).append(nlMatrixTopNReverseOctetRate, rhs.nlMatrixTopNReverseOctetRate).append(_index, rhs._index).isEquals();
    }

    public NlMatrixTopNEntry clone() {
        NlMatrixTopNEntry _copy = new NlMatrixTopNEntry();
        _copy.nlMatrixTopNIndex = nlMatrixTopNIndex;
        _copy.nlMatrixTopNProtocolDirLocalIndex = nlMatrixTopNProtocolDirLocalIndex;
        _copy.nlMatrixTopNSourceAddress = nlMatrixTopNSourceAddress;
        _copy.nlMatrixTopNDestAddress = nlMatrixTopNDestAddress;
        _copy.nlMatrixTopNPktRate = nlMatrixTopNPktRate;
        _copy.nlMatrixTopNReversePktRate = nlMatrixTopNReversePktRate;
        _copy.nlMatrixTopNOctetRate = nlMatrixTopNOctetRate;
        _copy.nlMatrixTopNReverseOctetRate = nlMatrixTopNReverseOctetRate;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.15.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlMatrixTopNIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "nlMatrixTopNProtocolDirLocalIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "nlMatrixTopNSourceAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "nlMatrixTopNDestAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "nlMatrixTopNPktRate", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "nlMatrixTopNReversePktRate", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "nlMatrixTopNOctetRate", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "nlMatrixTopNReverseOctetRate", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
