
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxconnection.agentxconnectiontable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxconnection.agentxconnectiontable.IAgentxConnectionEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxconnection.AgentxConnectionTable;
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

public class AgentxConnectionEntry
    extends DeviceEntity
    implements Serializable, IAgentxConnectionEntry, IIndexed, IVariableBindingSetter
{

    private int agentxConnIndex;
    private int agentxConnOpenTime;
    private String agentxConnTransportDomain;
    private String agentxConnTransportAddress;
    private String _index;
    private AgentxConnectionTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AgentxConnectionEntry() {
    }

    public int getAgentxConnIndex() {
        return this.agentxConnIndex;
    }

    public void setAgentxConnIndex(int agentxConnIndex) {
        int oldValue = getAgentxConnIndex();
        this.agentxConnIndex = agentxConnIndex;
        notifyChange(1, oldValue, agentxConnIndex);
    }

    public int getAgentxConnOpenTime() {
        return this.agentxConnOpenTime;
    }

    public void setAgentxConnOpenTime(int agentxConnOpenTime) {
        int oldValue = getAgentxConnOpenTime();
        this.agentxConnOpenTime = agentxConnOpenTime;
        notifyChange(2, oldValue, agentxConnOpenTime);
    }

    public String getAgentxConnTransportDomain() {
        return this.agentxConnTransportDomain;
    }

    public void setAgentxConnTransportDomain(String agentxConnTransportDomain) {
        String oldValue = getAgentxConnTransportDomain();
        this.agentxConnTransportDomain = agentxConnTransportDomain;
        notifyChange(3, oldValue, agentxConnTransportDomain);
    }

    public String getAgentxConnTransportAddress() {
        return this.agentxConnTransportAddress;
    }

    public void setAgentxConnTransportAddress(String agentxConnTransportAddress) {
        String oldValue = getAgentxConnTransportAddress();
        this.agentxConnTransportAddress = agentxConnTransportAddress;
        notifyChange(4, oldValue, agentxConnTransportAddress);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setAgentxConnIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setAgentxConnOpenTime(binding.getVariable().toInt());
                break;
            case  3 :
                setAgentxConnTransportDomain(binding.getVariable().toString());
                break;
            case  4 :
                setAgentxConnTransportAddress(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 12;
        int _len;
        _index = new OID(_oidInts, 12, (oid.size()- 12)).toString();
        setAgentxConnIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AgentxConnectionTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("agentxConnIndex", agentxConnIndex).append("agentxConnOpenTime", agentxConnOpenTime).append("agentxConnTransportDomain", agentxConnTransportDomain).append("agentxConnTransportAddress", agentxConnTransportAddress).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(agentxConnIndex).append(agentxConnOpenTime).append(agentxConnTransportDomain).append(agentxConnTransportAddress).append(_index).toHashCode();
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
        AgentxConnectionEntry rhs = ((AgentxConnectionEntry) obj);
        return new EqualsBuilder().append(agentxConnIndex, rhs.agentxConnIndex).append(agentxConnOpenTime, rhs.agentxConnOpenTime).append(agentxConnTransportDomain, rhs.agentxConnTransportDomain).append(agentxConnTransportAddress, rhs.agentxConnTransportAddress).append(_index, rhs._index).isEquals();
    }

    public AgentxConnectionEntry clone() {
        AgentxConnectionEntry _copy = new AgentxConnectionEntry();
        _copy.agentxConnIndex = agentxConnIndex;
        _copy.agentxConnOpenTime = agentxConnOpenTime;
        _copy.agentxConnTransportDomain = agentxConnTransportDomain;
        _copy.agentxConnTransportAddress = agentxConnTransportAddress;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.74.1.2.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "agentxConnIndex", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "agentxConnOpenTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "agentxConnTransportDomain", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "agentxConnTransportAddress", DeviceEntityDescription.FieldType.STRING, 255));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
