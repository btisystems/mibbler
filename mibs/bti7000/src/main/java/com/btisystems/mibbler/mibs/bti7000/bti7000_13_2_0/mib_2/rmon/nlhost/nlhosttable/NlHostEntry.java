
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlhost.nlhosttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlhost.NlHostTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlhost.nlhosttable.INlHostEntry;
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

public class NlHostEntry
    extends DeviceEntity
    implements Serializable, INlHostEntry, IIndexed, IVariableBindingSetter
{

    private int nlHostTimeMark;
    private String nlHostAddress;
    private int nlHostInPkts;
    private int nlHostOutPkts;
    private int nlHostInOctets;
    private int nlHostOutOctets;
    private int nlHostOutMacNonUnicastPkts;
    private int nlHostCreateTime;
    private String _index;
    private NlHostTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlHostEntry() {
    }

    public int getNlHostTimeMark() {
        return this.nlHostTimeMark;
    }

    public void setNlHostTimeMark(int nlHostTimeMark) {
        int oldValue = getNlHostTimeMark();
        this.nlHostTimeMark = nlHostTimeMark;
        notifyChange(1, oldValue, nlHostTimeMark);
    }

    public String getNlHostAddress() {
        return this.nlHostAddress;
    }

    public void setNlHostAddress(String nlHostAddress) {
        String oldValue = getNlHostAddress();
        this.nlHostAddress = nlHostAddress;
        notifyChange(2, oldValue, nlHostAddress);
    }

    public int getNlHostInPkts() {
        return this.nlHostInPkts;
    }

    public void setNlHostInPkts(int nlHostInPkts) {
        int oldValue = getNlHostInPkts();
        this.nlHostInPkts = nlHostInPkts;
        notifyChange(3, oldValue, nlHostInPkts);
    }

    public int getNlHostOutPkts() {
        return this.nlHostOutPkts;
    }

    public void setNlHostOutPkts(int nlHostOutPkts) {
        int oldValue = getNlHostOutPkts();
        this.nlHostOutPkts = nlHostOutPkts;
        notifyChange(4, oldValue, nlHostOutPkts);
    }

    public int getNlHostInOctets() {
        return this.nlHostInOctets;
    }

    public void setNlHostInOctets(int nlHostInOctets) {
        int oldValue = getNlHostInOctets();
        this.nlHostInOctets = nlHostInOctets;
        notifyChange(5, oldValue, nlHostInOctets);
    }

    public int getNlHostOutOctets() {
        return this.nlHostOutOctets;
    }

    public void setNlHostOutOctets(int nlHostOutOctets) {
        int oldValue = getNlHostOutOctets();
        this.nlHostOutOctets = nlHostOutOctets;
        notifyChange(6, oldValue, nlHostOutOctets);
    }

    public int getNlHostOutMacNonUnicastPkts() {
        return this.nlHostOutMacNonUnicastPkts;
    }

    public void setNlHostOutMacNonUnicastPkts(int nlHostOutMacNonUnicastPkts) {
        int oldValue = getNlHostOutMacNonUnicastPkts();
        this.nlHostOutMacNonUnicastPkts = nlHostOutMacNonUnicastPkts;
        notifyChange(7, oldValue, nlHostOutMacNonUnicastPkts);
    }

    public int getNlHostCreateTime() {
        return this.nlHostCreateTime;
    }

    public void setNlHostCreateTime(int nlHostCreateTime) {
        int oldValue = getNlHostCreateTime();
        this.nlHostCreateTime = nlHostCreateTime;
        notifyChange(8, oldValue, nlHostCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setNlHostTimeMark(binding.getVariable().toInt());
                break;
            case  2 :
                setNlHostAddress(binding.getVariable().toString());
                break;
            case  3 :
                setNlHostInPkts(binding.getVariable().toInt());
                break;
            case  4 :
                setNlHostOutPkts(binding.getVariable().toInt());
                break;
            case  5 :
                setNlHostInOctets(binding.getVariable().toInt());
                break;
            case  6 :
                setNlHostOutOctets(binding.getVariable().toInt());
                break;
            case  7 :
                setNlHostOutMacNonUnicastPkts(binding.getVariable().toInt());
                break;
            case  8 :
                setNlHostCreateTime(binding.getVariable().toInt());
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
        setNlHostTimeMark(_oidInts[arrayOffset]);
        arrayOffset += 1;
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setNlHostAddress(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(NlHostTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlHostTimeMark", nlHostTimeMark).append("nlHostAddress", nlHostAddress).append("nlHostInPkts", nlHostInPkts).append("nlHostOutPkts", nlHostOutPkts).append("nlHostInOctets", nlHostInOctets).append("nlHostOutOctets", nlHostOutOctets).append("nlHostOutMacNonUnicastPkts", nlHostOutMacNonUnicastPkts).append("nlHostCreateTime", nlHostCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlHostTimeMark).append(nlHostAddress).append(nlHostInPkts).append(nlHostOutPkts).append(nlHostInOctets).append(nlHostOutOctets).append(nlHostOutMacNonUnicastPkts).append(nlHostCreateTime).append(_index).toHashCode();
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
        NlHostEntry rhs = ((NlHostEntry) obj);
        return new EqualsBuilder().append(nlHostTimeMark, rhs.nlHostTimeMark).append(nlHostAddress, rhs.nlHostAddress).append(nlHostInPkts, rhs.nlHostInPkts).append(nlHostOutPkts, rhs.nlHostOutPkts).append(nlHostInOctets, rhs.nlHostInOctets).append(nlHostOutOctets, rhs.nlHostOutOctets).append(nlHostOutMacNonUnicastPkts, rhs.nlHostOutMacNonUnicastPkts).append(nlHostCreateTime, rhs.nlHostCreateTime).append(_index, rhs._index).isEquals();
    }

    public NlHostEntry clone() {
        NlHostEntry _copy = new NlHostEntry();
        _copy.nlHostTimeMark = nlHostTimeMark;
        _copy.nlHostAddress = nlHostAddress;
        _copy.nlHostInPkts = nlHostInPkts;
        _copy.nlHostOutPkts = nlHostOutPkts;
        _copy.nlHostInOctets = nlHostInOctets;
        _copy.nlHostOutOctets = nlHostOutOctets;
        _copy.nlHostOutMacNonUnicastPkts = nlHostOutMacNonUnicastPkts;
        _copy.nlHostCreateTime = nlHostCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.14.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlHostTimeMark", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "nlHostAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "nlHostInPkts", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "nlHostOutPkts", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "nlHostInOctets", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "nlHostOutOctets", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "nlHostOutMacNonUnicastPkts", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "nlHostCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
