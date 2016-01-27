
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.system.sysortable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.system.sysortable.ISysOREntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.system.SysORTable;
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

public class SysOREntry
    extends DeviceEntity
    implements Serializable, ISysOREntry, IIndexed, IVariableBindingSetter
{

    private int sysORIndex;
    private String sysORID;
    private String sysORDescr;
    private int sysORUpTime;
    private String _index;
    private SysORTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SysOREntry() {
    }

    public int getSysORIndex() {
        return this.sysORIndex;
    }

    public void setSysORIndex(int sysORIndex) {
        int oldValue = getSysORIndex();
        this.sysORIndex = sysORIndex;
        notifyChange(1, oldValue, sysORIndex);
    }

    public String getSysORID() {
        return this.sysORID;
    }

    public void setSysORID(String sysORID) {
        String oldValue = getSysORID();
        this.sysORID = sysORID;
        notifyChange(2, oldValue, sysORID);
    }

    public String getSysORDescr() {
        return this.sysORDescr;
    }

    public void setSysORDescr(String sysORDescr) {
        String oldValue = getSysORDescr();
        this.sysORDescr = sysORDescr;
        notifyChange(3, oldValue, sysORDescr);
    }

    public int getSysORUpTime() {
        return this.sysORUpTime;
    }

    public void setSysORUpTime(int sysORUpTime) {
        int oldValue = getSysORUpTime();
        this.sysORUpTime = sysORUpTime;
        notifyChange(4, oldValue, sysORUpTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setSysORIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setSysORID(binding.getVariable().toString());
                break;
            case  3 :
                setSysORDescr(binding.getVariable().toString());
                break;
            case  4 :
                setSysORUpTime(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setSysORIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SysORTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sysORIndex", sysORIndex).append("sysORID", sysORID).append("sysORDescr", sysORDescr).append("sysORUpTime", sysORUpTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sysORIndex).append(sysORID).append(sysORDescr).append(sysORUpTime).append(_index).toHashCode();
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
        SysOREntry rhs = ((SysOREntry) obj);
        return new EqualsBuilder().append(sysORIndex, rhs.sysORIndex).append(sysORID, rhs.sysORID).append(sysORDescr, rhs.sysORDescr).append(sysORUpTime, rhs.sysORUpTime).append(_index, rhs._index).isEquals();
    }

    public SysOREntry clone() {
        SysOREntry _copy = new SysOREntry();
        _copy.sysORIndex = sysORIndex;
        _copy.sysORID = sysORID;
        _copy.sysORDescr = sysORDescr;
        _copy.sysORUpTime = sysORUpTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.1.9.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sysORIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "sysORID", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "sysORDescr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "sysORUpTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
