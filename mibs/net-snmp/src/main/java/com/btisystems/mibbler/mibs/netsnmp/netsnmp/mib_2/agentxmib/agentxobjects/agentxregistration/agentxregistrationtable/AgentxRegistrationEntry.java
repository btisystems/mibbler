
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxregistration.agentxregistrationtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxregistration.agentxregistrationtable.IAgentxRegistrationEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxregistration.AgentxRegistrationTable;
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

public class AgentxRegistrationEntry
    extends DeviceEntity
    implements Serializable, IAgentxRegistrationEntry, IIndexed, IVariableBindingSetter
{

    private int agentxRegIndex;
    private String agentxRegContext;
    private String agentxRegStart;
    private int agentxRegRangeSubId;
    private int agentxRegUpperBound;
    private int agentxRegPriority;
    private int agentxRegTimeout;
    private int agentxRegInstance;
    private String _index;
    private AgentxRegistrationTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AgentxRegistrationEntry() {
    }

    public int getAgentxRegIndex() {
        return this.agentxRegIndex;
    }

    public void setAgentxRegIndex(int agentxRegIndex) {
        int oldValue = getAgentxRegIndex();
        this.agentxRegIndex = agentxRegIndex;
        notifyChange(1, oldValue, agentxRegIndex);
    }

    public String getAgentxRegContext() {
        return this.agentxRegContext;
    }

    public void setAgentxRegContext(String agentxRegContext) {
        String oldValue = getAgentxRegContext();
        this.agentxRegContext = agentxRegContext;
        notifyChange(2, oldValue, agentxRegContext);
    }

    public String getAgentxRegStart() {
        return this.agentxRegStart;
    }

    public void setAgentxRegStart(String agentxRegStart) {
        String oldValue = getAgentxRegStart();
        this.agentxRegStart = agentxRegStart;
        notifyChange(3, oldValue, agentxRegStart);
    }

    public int getAgentxRegRangeSubId() {
        return this.agentxRegRangeSubId;
    }

    public void setAgentxRegRangeSubId(int agentxRegRangeSubId) {
        int oldValue = getAgentxRegRangeSubId();
        this.agentxRegRangeSubId = agentxRegRangeSubId;
        notifyChange(4, oldValue, agentxRegRangeSubId);
    }

    public int getAgentxRegUpperBound() {
        return this.agentxRegUpperBound;
    }

    public void setAgentxRegUpperBound(int agentxRegUpperBound) {
        int oldValue = getAgentxRegUpperBound();
        this.agentxRegUpperBound = agentxRegUpperBound;
        notifyChange(5, oldValue, agentxRegUpperBound);
    }

    public int getAgentxRegPriority() {
        return this.agentxRegPriority;
    }

    public void setAgentxRegPriority(int agentxRegPriority) {
        int oldValue = getAgentxRegPriority();
        this.agentxRegPriority = agentxRegPriority;
        notifyChange(6, oldValue, agentxRegPriority);
    }

    public int getAgentxRegTimeout() {
        return this.agentxRegTimeout;
    }

    public void setAgentxRegTimeout(int agentxRegTimeout) {
        int oldValue = getAgentxRegTimeout();
        this.agentxRegTimeout = agentxRegTimeout;
        notifyChange(7, oldValue, agentxRegTimeout);
    }

    public int getAgentxRegInstance() {
        return this.agentxRegInstance;
    }

    public void setAgentxRegInstance(int agentxRegInstance) {
        int oldValue = getAgentxRegInstance();
        this.agentxRegInstance = agentxRegInstance;
        notifyChange(8, oldValue, agentxRegInstance);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setAgentxRegIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setAgentxRegContext(binding.getVariable().toString());
                break;
            case  3 :
                setAgentxRegStart(binding.getVariable().toString());
                break;
            case  4 :
                setAgentxRegRangeSubId(binding.getVariable().toInt());
                break;
            case  5 :
                setAgentxRegUpperBound(binding.getVariable().toInt());
                break;
            case  6 :
                setAgentxRegPriority(binding.getVariable().toInt());
                break;
            case  7 :
                setAgentxRegTimeout(binding.getVariable().toInt());
                break;
            case  8 :
                setAgentxRegInstance(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 12;
        int _len;
        _index = new OID(_oidInts, 12, (oid.size()- 12)).toString();
        arrayOffset += 1;
        arrayOffset += 1;
        setAgentxRegIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AgentxRegistrationTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("agentxRegIndex", agentxRegIndex).append("agentxRegContext", agentxRegContext).append("agentxRegStart", agentxRegStart).append("agentxRegRangeSubId", agentxRegRangeSubId).append("agentxRegUpperBound", agentxRegUpperBound).append("agentxRegPriority", agentxRegPriority).append("agentxRegTimeout", agentxRegTimeout).append("agentxRegInstance", agentxRegInstance).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(agentxRegIndex).append(agentxRegContext).append(agentxRegStart).append(agentxRegRangeSubId).append(agentxRegUpperBound).append(agentxRegPriority).append(agentxRegTimeout).append(agentxRegInstance).append(_index).toHashCode();
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
        AgentxRegistrationEntry rhs = ((AgentxRegistrationEntry) obj);
        return new EqualsBuilder().append(agentxRegIndex, rhs.agentxRegIndex).append(agentxRegContext, rhs.agentxRegContext).append(agentxRegStart, rhs.agentxRegStart).append(agentxRegRangeSubId, rhs.agentxRegRangeSubId).append(agentxRegUpperBound, rhs.agentxRegUpperBound).append(agentxRegPriority, rhs.agentxRegPriority).append(agentxRegTimeout, rhs.agentxRegTimeout).append(agentxRegInstance, rhs.agentxRegInstance).append(_index, rhs._index).isEquals();
    }

    public AgentxRegistrationEntry clone() {
        AgentxRegistrationEntry _copy = new AgentxRegistrationEntry();
        _copy.agentxRegIndex = agentxRegIndex;
        _copy.agentxRegContext = agentxRegContext;
        _copy.agentxRegStart = agentxRegStart;
        _copy.agentxRegRangeSubId = agentxRegRangeSubId;
        _copy.agentxRegUpperBound = agentxRegUpperBound;
        _copy.agentxRegPriority = agentxRegPriority;
        _copy.agentxRegTimeout = agentxRegTimeout;
        _copy.agentxRegInstance = agentxRegInstance;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.74.1.4.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "agentxRegIndex", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "agentxRegContext", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "agentxRegStart", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "agentxRegRangeSubId", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "agentxRegUpperBound", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "agentxRegPriority", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "agentxRegTimeout", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "agentxRegInstance", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
