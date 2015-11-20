
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctplookupremhostnametable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremhostnametable.ISctpLookupRemHostNameEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpLookupRemHostNameTable;
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

public class SctpLookupRemHostNameEntry
    extends DeviceEntity
    implements Serializable, ISctpLookupRemHostNameEntry, IIndexed, IVariableBindingSetter
{

    private int sctpLookupRemHostNameStartTime;
    private String _index;
    private SctpLookupRemHostNameTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpLookupRemHostNameEntry() {
    }

    public int getSctpLookupRemHostNameStartTime() {
        return this.sctpLookupRemHostNameStartTime;
    }

    public void setSctpLookupRemHostNameStartTime(int sctpLookupRemHostNameStartTime) {
        int oldValue = getSctpLookupRemHostNameStartTime();
        this.sctpLookupRemHostNameStartTime = sctpLookupRemHostNameStartTime;
        notifyChange(1, oldValue, sctpLookupRemHostNameStartTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSctpLookupRemHostNameStartTime(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        _len = _oidInts[arrayOffset ++];
        arrayOffset += _len;
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SctpLookupRemHostNameTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpLookupRemHostNameStartTime", sctpLookupRemHostNameStartTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpLookupRemHostNameStartTime).append(_index).toHashCode();
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
        SctpLookupRemHostNameEntry rhs = ((SctpLookupRemHostNameEntry) obj);
        return new EqualsBuilder().append(sctpLookupRemHostNameStartTime, rhs.sctpLookupRemHostNameStartTime).append(_index, rhs._index).isEquals();
    }

    public SctpLookupRemHostNameEntry clone() {
        SctpLookupRemHostNameEntry _copy = new SctpLookupRemHostNameEntry();
        _copy.sctpLookupRemHostNameStartTime = sctpLookupRemHostNameStartTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.8.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpLookupRemHostNameStartTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
