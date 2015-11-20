
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.alhost.alhosttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.alhost.AlHostTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.alhost.alhosttable.IAlHostEntry;
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

public class AlHostEntry
    extends DeviceEntity
    implements Serializable, IAlHostEntry, IIndexed, IVariableBindingSetter
{

    private int alHostTimeMark;
    private int alHostInPkts;
    private int alHostOutPkts;
    private int alHostInOctets;
    private int alHostOutOctets;
    private int alHostCreateTime;
    private String _index;
    private AlHostTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AlHostEntry() {
    }

    public int getAlHostTimeMark() {
        return this.alHostTimeMark;
    }

    public void setAlHostTimeMark(int alHostTimeMark) {
        int oldValue = getAlHostTimeMark();
        this.alHostTimeMark = alHostTimeMark;
        notifyChange(1, oldValue, alHostTimeMark);
    }

    public int getAlHostInPkts() {
        return this.alHostInPkts;
    }

    public void setAlHostInPkts(int alHostInPkts) {
        int oldValue = getAlHostInPkts();
        this.alHostInPkts = alHostInPkts;
        notifyChange(2, oldValue, alHostInPkts);
    }

    public int getAlHostOutPkts() {
        return this.alHostOutPkts;
    }

    public void setAlHostOutPkts(int alHostOutPkts) {
        int oldValue = getAlHostOutPkts();
        this.alHostOutPkts = alHostOutPkts;
        notifyChange(3, oldValue, alHostOutPkts);
    }

    public int getAlHostInOctets() {
        return this.alHostInOctets;
    }

    public void setAlHostInOctets(int alHostInOctets) {
        int oldValue = getAlHostInOctets();
        this.alHostInOctets = alHostInOctets;
        notifyChange(4, oldValue, alHostInOctets);
    }

    public int getAlHostOutOctets() {
        return this.alHostOutOctets;
    }

    public void setAlHostOutOctets(int alHostOutOctets) {
        int oldValue = getAlHostOutOctets();
        this.alHostOutOctets = alHostOutOctets;
        notifyChange(5, oldValue, alHostOutOctets);
    }

    public int getAlHostCreateTime() {
        return this.alHostCreateTime;
    }

    public void setAlHostCreateTime(int alHostCreateTime) {
        int oldValue = getAlHostCreateTime();
        this.alHostCreateTime = alHostCreateTime;
        notifyChange(6, oldValue, alHostCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setAlHostTimeMark(binding.getVariable().toInt());
                break;
            case  2 :
                setAlHostInPkts(binding.getVariable().toInt());
                break;
            case  3 :
                setAlHostOutPkts(binding.getVariable().toInt());
                break;
            case  4 :
                setAlHostInOctets(binding.getVariable().toInt());
                break;
            case  5 :
                setAlHostOutOctets(binding.getVariable().toInt());
                break;
            case  6 :
                setAlHostCreateTime(binding.getVariable().toInt());
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
        setAlHostTimeMark(_oidInts[arrayOffset]);
        arrayOffset += 1;
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        arrayOffset += _len;
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AlHostTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alHostTimeMark", alHostTimeMark).append("alHostInPkts", alHostInPkts).append("alHostOutPkts", alHostOutPkts).append("alHostInOctets", alHostInOctets).append("alHostOutOctets", alHostOutOctets).append("alHostCreateTime", alHostCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alHostTimeMark).append(alHostInPkts).append(alHostOutPkts).append(alHostInOctets).append(alHostOutOctets).append(alHostCreateTime).append(_index).toHashCode();
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
        AlHostEntry rhs = ((AlHostEntry) obj);
        return new EqualsBuilder().append(alHostTimeMark, rhs.alHostTimeMark).append(alHostInPkts, rhs.alHostInPkts).append(alHostOutPkts, rhs.alHostOutPkts).append(alHostInOctets, rhs.alHostInOctets).append(alHostOutOctets, rhs.alHostOutOctets).append(alHostCreateTime, rhs.alHostCreateTime).append(_index, rhs._index).isEquals();
    }

    public AlHostEntry clone() {
        AlHostEntry _copy = new AlHostEntry();
        _copy.alHostTimeMark = alHostTimeMark;
        _copy.alHostInPkts = alHostInPkts;
        _copy.alHostOutPkts = alHostOutPkts;
        _copy.alHostInOctets = alHostInOctets;
        _copy.alHostOutOctets = alHostOutOctets;
        _copy.alHostCreateTime = alHostCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.16.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alHostTimeMark", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "alHostInPkts", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "alHostOutPkts", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "alHostInOctets", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "alHostOutOctets", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "alHostCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
