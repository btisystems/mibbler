
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctplookupremprimipaddrtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremprimipaddrtable.ISctpLookupRemPrimIPAddrEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpLookupRemPrimIPAddrTable;
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

public class SctpLookupRemPrimIPAddrEntry
    extends DeviceEntity
    implements Serializable, ISctpLookupRemPrimIPAddrEntry, IIndexed, IVariableBindingSetter
{

    private int sctpLookupRemPrimIPAddrStartTime;
    private String _index;
    private SctpLookupRemPrimIPAddrTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpLookupRemPrimIPAddrEntry() {
    }

    public int getSctpLookupRemPrimIPAddrStartTime() {
        return this.sctpLookupRemPrimIPAddrStartTime;
    }

    public void setSctpLookupRemPrimIPAddrStartTime(int sctpLookupRemPrimIPAddrStartTime) {
        int oldValue = getSctpLookupRemPrimIPAddrStartTime();
        this.sctpLookupRemPrimIPAddrStartTime = sctpLookupRemPrimIPAddrStartTime;
        notifyChange(1, oldValue, sctpLookupRemPrimIPAddrStartTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSctpLookupRemPrimIPAddrStartTime(binding.getVariable().toInt());
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
        _len = _oidInts[arrayOffset ++];
        arrayOffset += _len;
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SctpLookupRemPrimIPAddrTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpLookupRemPrimIPAddrStartTime", sctpLookupRemPrimIPAddrStartTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpLookupRemPrimIPAddrStartTime).append(_index).toHashCode();
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
        SctpLookupRemPrimIPAddrEntry rhs = ((SctpLookupRemPrimIPAddrEntry) obj);
        return new EqualsBuilder().append(sctpLookupRemPrimIPAddrStartTime, rhs.sctpLookupRemPrimIPAddrStartTime).append(_index, rhs._index).isEquals();
    }

    public SctpLookupRemPrimIPAddrEntry clone() {
        SctpLookupRemPrimIPAddrEntry _copy = new SctpLookupRemPrimIPAddrEntry();
        _copy.sctpLookupRemPrimIPAddrStartTime = sctpLookupRemPrimIPAddrStartTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.9.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpLookupRemPrimIPAddrStartTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
