
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.protocoldist.protocoldiststatstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.protocoldist.ProtocolDistStatsTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.protocoldist.protocoldiststatstable.IProtocolDistStatsEntry;
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

public class ProtocolDistStatsEntry
    extends DeviceEntity
    implements Serializable, IProtocolDistStatsEntry, IIndexed, IVariableBindingSetter
{

    private int protocolDistStatsPkts;
    private int protocolDistStatsOctets;
    private String _index;
    private ProtocolDistStatsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ProtocolDistStatsEntry() {
    }

    public int getProtocolDistStatsPkts() {
        return this.protocolDistStatsPkts;
    }

    public void setProtocolDistStatsPkts(int protocolDistStatsPkts) {
        int oldValue = getProtocolDistStatsPkts();
        this.protocolDistStatsPkts = protocolDistStatsPkts;
        notifyChange(1, oldValue, protocolDistStatsPkts);
    }

    public int getProtocolDistStatsOctets() {
        return this.protocolDistStatsOctets;
    }

    public void setProtocolDistStatsOctets(int protocolDistStatsOctets) {
        int oldValue = getProtocolDistStatsOctets();
        this.protocolDistStatsOctets = protocolDistStatsOctets;
        notifyChange(2, oldValue, protocolDistStatsOctets);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setProtocolDistStatsPkts(binding.getVariable().toInt());
                break;
            case  2 :
                setProtocolDistStatsOctets(binding.getVariable().toInt());
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

    public void _setTable(ProtocolDistStatsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("protocolDistStatsPkts", protocolDistStatsPkts).append("protocolDistStatsOctets", protocolDistStatsOctets).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(protocolDistStatsPkts).append(protocolDistStatsOctets).append(_index).toHashCode();
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
        ProtocolDistStatsEntry rhs = ((ProtocolDistStatsEntry) obj);
        return new EqualsBuilder().append(protocolDistStatsPkts, rhs.protocolDistStatsPkts).append(protocolDistStatsOctets, rhs.protocolDistStatsOctets).append(_index, rhs._index).isEquals();
    }

    public ProtocolDistStatsEntry clone() {
        ProtocolDistStatsEntry _copy = new ProtocolDistStatsEntry();
        _copy.protocolDistStatsPkts = protocolDistStatsPkts;
        _copy.protocolDistStatsOctets = protocolDistStatsOctets;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.12.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "protocolDistStatsPkts", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "protocolDistStatsOctets", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
