
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctplookuplocalporttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookuplocalporttable.ISctpLookupLocalPortEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpLookupLocalPortTable;
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

public class SctpLookupLocalPortEntry
    extends DeviceEntity
    implements Serializable, ISctpLookupLocalPortEntry, IIndexed, IVariableBindingSetter
{

    private int sctpLookupLocalPortStartTime;
    private String _index;
    private SctpLookupLocalPortTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpLookupLocalPortEntry() {
    }

    public int getSctpLookupLocalPortStartTime() {
        return this.sctpLookupLocalPortStartTime;
    }

    public void setSctpLookupLocalPortStartTime(int sctpLookupLocalPortStartTime) {
        int oldValue = getSctpLookupLocalPortStartTime();
        this.sctpLookupLocalPortStartTime = sctpLookupLocalPortStartTime;
        notifyChange(1, oldValue, sctpLookupLocalPortStartTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSctpLookupLocalPortStartTime(binding.getVariable().toInt());
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
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SctpLookupLocalPortTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpLookupLocalPortStartTime", sctpLookupLocalPortStartTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpLookupLocalPortStartTime).append(_index).toHashCode();
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
        SctpLookupLocalPortEntry rhs = ((SctpLookupLocalPortEntry) obj);
        return new EqualsBuilder().append(sctpLookupLocalPortStartTime, rhs.sctpLookupLocalPortStartTime).append(_index, rhs._index).isEquals();
    }

    public SctpLookupLocalPortEntry clone() {
        SctpLookupLocalPortEntry _copy = new SctpLookupLocalPortEntry();
        _copy.sctpLookupLocalPortStartTime = sctpLookupLocalPortStartTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpLookupLocalPortStartTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
