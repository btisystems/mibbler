
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlmatrix.nlmatrixdstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlmatrix.NlMatrixDSTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlmatrix.nlmatrixdstable.INlMatrixDSEntry;
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

public class NlMatrixDSEntry
    extends DeviceEntity
    implements Serializable, INlMatrixDSEntry, IIndexed, IVariableBindingSetter
{

    private int nlMatrixDSTimeMark;
    private String nlMatrixDSSourceAddress;
    private String nlMatrixDSDestAddress;
    private int nlMatrixDSPkts;
    private int nlMatrixDSOctets;
    private int nlMatrixDSCreateTime;
    private String _index;
    private NlMatrixDSTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlMatrixDSEntry() {
    }

    public int getNlMatrixDSTimeMark() {
        return this.nlMatrixDSTimeMark;
    }

    public void setNlMatrixDSTimeMark(int nlMatrixDSTimeMark) {
        int oldValue = getNlMatrixDSTimeMark();
        this.nlMatrixDSTimeMark = nlMatrixDSTimeMark;
        notifyChange(1, oldValue, nlMatrixDSTimeMark);
    }

    public String getNlMatrixDSSourceAddress() {
        return this.nlMatrixDSSourceAddress;
    }

    public void setNlMatrixDSSourceAddress(String nlMatrixDSSourceAddress) {
        String oldValue = getNlMatrixDSSourceAddress();
        this.nlMatrixDSSourceAddress = nlMatrixDSSourceAddress;
        notifyChange(2, oldValue, nlMatrixDSSourceAddress);
    }

    public String getNlMatrixDSDestAddress() {
        return this.nlMatrixDSDestAddress;
    }

    public void setNlMatrixDSDestAddress(String nlMatrixDSDestAddress) {
        String oldValue = getNlMatrixDSDestAddress();
        this.nlMatrixDSDestAddress = nlMatrixDSDestAddress;
        notifyChange(3, oldValue, nlMatrixDSDestAddress);
    }

    public int getNlMatrixDSPkts() {
        return this.nlMatrixDSPkts;
    }

    public void setNlMatrixDSPkts(int nlMatrixDSPkts) {
        int oldValue = getNlMatrixDSPkts();
        this.nlMatrixDSPkts = nlMatrixDSPkts;
        notifyChange(4, oldValue, nlMatrixDSPkts);
    }

    public int getNlMatrixDSOctets() {
        return this.nlMatrixDSOctets;
    }

    public void setNlMatrixDSOctets(int nlMatrixDSOctets) {
        int oldValue = getNlMatrixDSOctets();
        this.nlMatrixDSOctets = nlMatrixDSOctets;
        notifyChange(5, oldValue, nlMatrixDSOctets);
    }

    public int getNlMatrixDSCreateTime() {
        return this.nlMatrixDSCreateTime;
    }

    public void setNlMatrixDSCreateTime(int nlMatrixDSCreateTime) {
        int oldValue = getNlMatrixDSCreateTime();
        this.nlMatrixDSCreateTime = nlMatrixDSCreateTime;
        notifyChange(6, oldValue, nlMatrixDSCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setNlMatrixDSTimeMark(binding.getVariable().toInt());
                break;
            case  2 :
                setNlMatrixDSSourceAddress(binding.getVariable().toString());
                break;
            case  3 :
                setNlMatrixDSDestAddress(binding.getVariable().toString());
                break;
            case  4 :
                setNlMatrixDSPkts(binding.getVariable().toInt());
                break;
            case  5 :
                setNlMatrixDSOctets(binding.getVariable().toInt());
                break;
            case  6 :
                setNlMatrixDSCreateTime(binding.getVariable().toInt());
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
        setNlMatrixDSTimeMark(_oidInts[arrayOffset]);
        arrayOffset += 1;
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setNlMatrixDSDestAddress(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setNlMatrixDSSourceAddress(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(NlMatrixDSTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlMatrixDSTimeMark", nlMatrixDSTimeMark).append("nlMatrixDSSourceAddress", nlMatrixDSSourceAddress).append("nlMatrixDSDestAddress", nlMatrixDSDestAddress).append("nlMatrixDSPkts", nlMatrixDSPkts).append("nlMatrixDSOctets", nlMatrixDSOctets).append("nlMatrixDSCreateTime", nlMatrixDSCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlMatrixDSTimeMark).append(nlMatrixDSSourceAddress).append(nlMatrixDSDestAddress).append(nlMatrixDSPkts).append(nlMatrixDSOctets).append(nlMatrixDSCreateTime).append(_index).toHashCode();
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
        NlMatrixDSEntry rhs = ((NlMatrixDSEntry) obj);
        return new EqualsBuilder().append(nlMatrixDSTimeMark, rhs.nlMatrixDSTimeMark).append(nlMatrixDSSourceAddress, rhs.nlMatrixDSSourceAddress).append(nlMatrixDSDestAddress, rhs.nlMatrixDSDestAddress).append(nlMatrixDSPkts, rhs.nlMatrixDSPkts).append(nlMatrixDSOctets, rhs.nlMatrixDSOctets).append(nlMatrixDSCreateTime, rhs.nlMatrixDSCreateTime).append(_index, rhs._index).isEquals();
    }

    public NlMatrixDSEntry clone() {
        NlMatrixDSEntry _copy = new NlMatrixDSEntry();
        _copy.nlMatrixDSTimeMark = nlMatrixDSTimeMark;
        _copy.nlMatrixDSSourceAddress = nlMatrixDSSourceAddress;
        _copy.nlMatrixDSDestAddress = nlMatrixDSDestAddress;
        _copy.nlMatrixDSPkts = nlMatrixDSPkts;
        _copy.nlMatrixDSOctets = nlMatrixDSOctets;
        _copy.nlMatrixDSCreateTime = nlMatrixDSCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.15.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlMatrixDSTimeMark", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "nlMatrixDSSourceAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "nlMatrixDSDestAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "nlMatrixDSPkts", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "nlMatrixDSOctets", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "nlMatrixDSCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
