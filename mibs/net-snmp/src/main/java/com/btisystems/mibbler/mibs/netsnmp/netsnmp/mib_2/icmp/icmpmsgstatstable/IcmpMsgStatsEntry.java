
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.icmp.icmpmsgstatstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.icmp.icmpmsgstatstable.IIcmpMsgStatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.icmp.IcmpMsgStatsTable;
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

public class IcmpMsgStatsEntry
    extends DeviceEntity
    implements Serializable, IIcmpMsgStatsEntry, IIndexed, IVariableBindingSetter
{

    private int icmpMsgStatsIPVersion;
    private int icmpMsgStatsType;
    private int icmpMsgStatsInPkts;
    private int icmpMsgStatsOutPkts;
    private String _index;
    private IcmpMsgStatsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IcmpMsgStatsEntry() {
    }

    public int getIcmpMsgStatsIPVersion() {
        return this.icmpMsgStatsIPVersion;
    }

    public void setIcmpMsgStatsIPVersion(int icmpMsgStatsIPVersion) {
        int oldValue = getIcmpMsgStatsIPVersion();
        this.icmpMsgStatsIPVersion = icmpMsgStatsIPVersion;
        notifyChange(1, oldValue, icmpMsgStatsIPVersion);
    }

    public int getIcmpMsgStatsType() {
        return this.icmpMsgStatsType;
    }

    public void setIcmpMsgStatsType(int icmpMsgStatsType) {
        int oldValue = getIcmpMsgStatsType();
        this.icmpMsgStatsType = icmpMsgStatsType;
        notifyChange(2, oldValue, icmpMsgStatsType);
    }

    public int getIcmpMsgStatsInPkts() {
        return this.icmpMsgStatsInPkts;
    }

    public void setIcmpMsgStatsInPkts(int icmpMsgStatsInPkts) {
        int oldValue = getIcmpMsgStatsInPkts();
        this.icmpMsgStatsInPkts = icmpMsgStatsInPkts;
        notifyChange(3, oldValue, icmpMsgStatsInPkts);
    }

    public int getIcmpMsgStatsOutPkts() {
        return this.icmpMsgStatsOutPkts;
    }

    public void setIcmpMsgStatsOutPkts(int icmpMsgStatsOutPkts) {
        int oldValue = getIcmpMsgStatsOutPkts();
        this.icmpMsgStatsOutPkts = icmpMsgStatsOutPkts;
        notifyChange(4, oldValue, icmpMsgStatsOutPkts);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIcmpMsgStatsIPVersion(binding.getVariable().toInt());
                break;
            case  2 :
                setIcmpMsgStatsType(binding.getVariable().toInt());
                break;
            case  3 :
                setIcmpMsgStatsInPkts(binding.getVariable().toInt());
                break;
            case  4 :
                setIcmpMsgStatsOutPkts(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIcmpMsgStatsIPVersion(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIcmpMsgStatsType(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IcmpMsgStatsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("icmpMsgStatsIPVersion", icmpMsgStatsIPVersion).append("icmpMsgStatsType", icmpMsgStatsType).append("icmpMsgStatsInPkts", icmpMsgStatsInPkts).append("icmpMsgStatsOutPkts", icmpMsgStatsOutPkts).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(icmpMsgStatsIPVersion).append(icmpMsgStatsType).append(icmpMsgStatsInPkts).append(icmpMsgStatsOutPkts).append(_index).toHashCode();
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
        IcmpMsgStatsEntry rhs = ((IcmpMsgStatsEntry) obj);
        return new EqualsBuilder().append(icmpMsgStatsIPVersion, rhs.icmpMsgStatsIPVersion).append(icmpMsgStatsType, rhs.icmpMsgStatsType).append(icmpMsgStatsInPkts, rhs.icmpMsgStatsInPkts).append(icmpMsgStatsOutPkts, rhs.icmpMsgStatsOutPkts).append(_index, rhs._index).isEquals();
    }

    public IcmpMsgStatsEntry clone() {
        IcmpMsgStatsEntry _copy = new IcmpMsgStatsEntry();
        _copy.icmpMsgStatsIPVersion = icmpMsgStatsIPVersion;
        _copy.icmpMsgStatsType = icmpMsgStatsType;
        _copy.icmpMsgStatsInPkts = icmpMsgStatsInPkts;
        _copy.icmpMsgStatsOutPkts = icmpMsgStatsOutPkts;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.5.30.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "icmpMsgStatsIPVersion", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "icmpMsgStatsType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "icmpMsgStatsInPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "icmpMsgStatsOutPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
