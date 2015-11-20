
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.icmp.icmpstatstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.icmp.icmpstatstable.IIcmpStatsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.icmp.IcmpStatsTable;
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

public class IcmpStatsEntry
    extends DeviceEntity
    implements Serializable, IIcmpStatsEntry, IIndexed, IVariableBindingSetter
{

    private int icmpStatsIPVersion;
    private int icmpStatsInMsgs;
    private int icmpStatsInErrors;
    private int icmpStatsOutMsgs;
    private int icmpStatsOutErrors;
    private String _index;
    private IcmpStatsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IcmpStatsEntry() {
    }

    public int getIcmpStatsIPVersion() {
        return this.icmpStatsIPVersion;
    }

    public void setIcmpStatsIPVersion(int icmpStatsIPVersion) {
        int oldValue = getIcmpStatsIPVersion();
        this.icmpStatsIPVersion = icmpStatsIPVersion;
        notifyChange(1, oldValue, icmpStatsIPVersion);
    }

    public int getIcmpStatsInMsgs() {
        return this.icmpStatsInMsgs;
    }

    public void setIcmpStatsInMsgs(int icmpStatsInMsgs) {
        int oldValue = getIcmpStatsInMsgs();
        this.icmpStatsInMsgs = icmpStatsInMsgs;
        notifyChange(2, oldValue, icmpStatsInMsgs);
    }

    public int getIcmpStatsInErrors() {
        return this.icmpStatsInErrors;
    }

    public void setIcmpStatsInErrors(int icmpStatsInErrors) {
        int oldValue = getIcmpStatsInErrors();
        this.icmpStatsInErrors = icmpStatsInErrors;
        notifyChange(3, oldValue, icmpStatsInErrors);
    }

    public int getIcmpStatsOutMsgs() {
        return this.icmpStatsOutMsgs;
    }

    public void setIcmpStatsOutMsgs(int icmpStatsOutMsgs) {
        int oldValue = getIcmpStatsOutMsgs();
        this.icmpStatsOutMsgs = icmpStatsOutMsgs;
        notifyChange(4, oldValue, icmpStatsOutMsgs);
    }

    public int getIcmpStatsOutErrors() {
        return this.icmpStatsOutErrors;
    }

    public void setIcmpStatsOutErrors(int icmpStatsOutErrors) {
        int oldValue = getIcmpStatsOutErrors();
        this.icmpStatsOutErrors = icmpStatsOutErrors;
        notifyChange(5, oldValue, icmpStatsOutErrors);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIcmpStatsIPVersion(binding.getVariable().toInt());
                break;
            case  2 :
                setIcmpStatsInMsgs(binding.getVariable().toInt());
                break;
            case  3 :
                setIcmpStatsInErrors(binding.getVariable().toInt());
                break;
            case  4 :
                setIcmpStatsOutMsgs(binding.getVariable().toInt());
                break;
            case  5 :
                setIcmpStatsOutErrors(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIcmpStatsIPVersion(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IcmpStatsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("icmpStatsIPVersion", icmpStatsIPVersion).append("icmpStatsInMsgs", icmpStatsInMsgs).append("icmpStatsInErrors", icmpStatsInErrors).append("icmpStatsOutMsgs", icmpStatsOutMsgs).append("icmpStatsOutErrors", icmpStatsOutErrors).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(icmpStatsIPVersion).append(icmpStatsInMsgs).append(icmpStatsInErrors).append(icmpStatsOutMsgs).append(icmpStatsOutErrors).append(_index).toHashCode();
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
        IcmpStatsEntry rhs = ((IcmpStatsEntry) obj);
        return new EqualsBuilder().append(icmpStatsIPVersion, rhs.icmpStatsIPVersion).append(icmpStatsInMsgs, rhs.icmpStatsInMsgs).append(icmpStatsInErrors, rhs.icmpStatsInErrors).append(icmpStatsOutMsgs, rhs.icmpStatsOutMsgs).append(icmpStatsOutErrors, rhs.icmpStatsOutErrors).append(_index, rhs._index).isEquals();
    }

    public IcmpStatsEntry clone() {
        IcmpStatsEntry _copy = new IcmpStatsEntry();
        _copy.icmpStatsIPVersion = icmpStatsIPVersion;
        _copy.icmpStatsInMsgs = icmpStatsInMsgs;
        _copy.icmpStatsInErrors = icmpStatsInErrors;
        _copy.icmpStatsOutMsgs = icmpStatsOutMsgs;
        _copy.icmpStatsOutErrors = icmpStatsOutErrors;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.5.29.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "icmpStatsIPVersion", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "icmpStatsInMsgs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "icmpStatsInErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "icmpStatsOutMsgs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "icmpStatsOutErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
