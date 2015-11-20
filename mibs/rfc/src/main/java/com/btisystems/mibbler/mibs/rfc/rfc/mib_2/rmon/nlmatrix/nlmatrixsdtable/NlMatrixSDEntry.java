
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.nlmatrixsdtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.nlmatrixsdtable.INlMatrixSDEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.NlMatrixSDTable;
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

public class NlMatrixSDEntry
    extends DeviceEntity
    implements Serializable, INlMatrixSDEntry, IIndexed, IVariableBindingSetter
{

    private int nlMatrixSDTimeMark;
    private String nlMatrixSDSourceAddress;
    private String nlMatrixSDDestAddress;
    private int nlMatrixSDPkts;
    private int nlMatrixSDOctets;
    private int nlMatrixSDCreateTime;
    private String _index;
    private NlMatrixSDTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlMatrixSDEntry() {
    }

    public int getNlMatrixSDTimeMark() {
        return this.nlMatrixSDTimeMark;
    }

    public void setNlMatrixSDTimeMark(int nlMatrixSDTimeMark) {
        int oldValue = getNlMatrixSDTimeMark();
        this.nlMatrixSDTimeMark = nlMatrixSDTimeMark;
        notifyChange(1, oldValue, nlMatrixSDTimeMark);
    }

    public String getNlMatrixSDSourceAddress() {
        return this.nlMatrixSDSourceAddress;
    }

    public void setNlMatrixSDSourceAddress(String nlMatrixSDSourceAddress) {
        String oldValue = getNlMatrixSDSourceAddress();
        this.nlMatrixSDSourceAddress = nlMatrixSDSourceAddress;
        notifyChange(2, oldValue, nlMatrixSDSourceAddress);
    }

    public String getNlMatrixSDDestAddress() {
        return this.nlMatrixSDDestAddress;
    }

    public void setNlMatrixSDDestAddress(String nlMatrixSDDestAddress) {
        String oldValue = getNlMatrixSDDestAddress();
        this.nlMatrixSDDestAddress = nlMatrixSDDestAddress;
        notifyChange(3, oldValue, nlMatrixSDDestAddress);
    }

    public int getNlMatrixSDPkts() {
        return this.nlMatrixSDPkts;
    }

    public void setNlMatrixSDPkts(int nlMatrixSDPkts) {
        int oldValue = getNlMatrixSDPkts();
        this.nlMatrixSDPkts = nlMatrixSDPkts;
        notifyChange(4, oldValue, nlMatrixSDPkts);
    }

    public int getNlMatrixSDOctets() {
        return this.nlMatrixSDOctets;
    }

    public void setNlMatrixSDOctets(int nlMatrixSDOctets) {
        int oldValue = getNlMatrixSDOctets();
        this.nlMatrixSDOctets = nlMatrixSDOctets;
        notifyChange(5, oldValue, nlMatrixSDOctets);
    }

    public int getNlMatrixSDCreateTime() {
        return this.nlMatrixSDCreateTime;
    }

    public void setNlMatrixSDCreateTime(int nlMatrixSDCreateTime) {
        int oldValue = getNlMatrixSDCreateTime();
        this.nlMatrixSDCreateTime = nlMatrixSDCreateTime;
        notifyChange(6, oldValue, nlMatrixSDCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setNlMatrixSDTimeMark(binding.getVariable().toInt());
                break;
            case  2 :
                setNlMatrixSDSourceAddress(binding.getVariable().toString());
                break;
            case  3 :
                setNlMatrixSDDestAddress(binding.getVariable().toString());
                break;
            case  4 :
                setNlMatrixSDPkts(binding.getVariable().toInt());
                break;
            case  5 :
                setNlMatrixSDOctets(binding.getVariable().toInt());
                break;
            case  6 :
                setNlMatrixSDCreateTime(binding.getVariable().toInt());
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
        setNlMatrixSDTimeMark(_oidInts[arrayOffset]);
        arrayOffset += 1;
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setNlMatrixSDSourceAddress(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setNlMatrixSDDestAddress(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(NlMatrixSDTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlMatrixSDTimeMark", nlMatrixSDTimeMark).append("nlMatrixSDSourceAddress", nlMatrixSDSourceAddress).append("nlMatrixSDDestAddress", nlMatrixSDDestAddress).append("nlMatrixSDPkts", nlMatrixSDPkts).append("nlMatrixSDOctets", nlMatrixSDOctets).append("nlMatrixSDCreateTime", nlMatrixSDCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlMatrixSDTimeMark).append(nlMatrixSDSourceAddress).append(nlMatrixSDDestAddress).append(nlMatrixSDPkts).append(nlMatrixSDOctets).append(nlMatrixSDCreateTime).append(_index).toHashCode();
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
        NlMatrixSDEntry rhs = ((NlMatrixSDEntry) obj);
        return new EqualsBuilder().append(nlMatrixSDTimeMark, rhs.nlMatrixSDTimeMark).append(nlMatrixSDSourceAddress, rhs.nlMatrixSDSourceAddress).append(nlMatrixSDDestAddress, rhs.nlMatrixSDDestAddress).append(nlMatrixSDPkts, rhs.nlMatrixSDPkts).append(nlMatrixSDOctets, rhs.nlMatrixSDOctets).append(nlMatrixSDCreateTime, rhs.nlMatrixSDCreateTime).append(_index, rhs._index).isEquals();
    }

    public NlMatrixSDEntry clone() {
        NlMatrixSDEntry _copy = new NlMatrixSDEntry();
        _copy.nlMatrixSDTimeMark = nlMatrixSDTimeMark;
        _copy.nlMatrixSDSourceAddress = nlMatrixSDSourceAddress;
        _copy.nlMatrixSDDestAddress = nlMatrixSDDestAddress;
        _copy.nlMatrixSDPkts = nlMatrixSDPkts;
        _copy.nlMatrixSDOctets = nlMatrixSDOctets;
        _copy.nlMatrixSDCreateTime = nlMatrixSDCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.15.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlMatrixSDTimeMark", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "nlMatrixSDSourceAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "nlMatrixSDDestAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "nlMatrixSDPkts", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "nlMatrixSDOctets", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "nlMatrixSDCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
