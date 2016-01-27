
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxsession.agentxsessiontable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.agentxmib.agentxobjects.agentxsession.agentxsessiontable.IAgentxSessionEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.agentxmib.agentxobjects.agentxsession.AgentxSessionTable;
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

public class AgentxSessionEntry
    extends DeviceEntity
    implements Serializable, IAgentxSessionEntry, IIndexed, IVariableBindingSetter
{

    private int agentxSessionIndex;
    private String agentxSessionObjectID;
    private String agentxSessionDescr;
    private int agentxSessionAdminStatus;
    private int agentxSessionOpenTime;
    private int agentxSessionAgentXVer;
    private int agentxSessionTimeout;
    private String _index;
    private AgentxSessionTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AgentxSessionEntry() {
    }

    public int getAgentxSessionIndex() {
        return this.agentxSessionIndex;
    }

    public void setAgentxSessionIndex(int agentxSessionIndex) {
        int oldValue = getAgentxSessionIndex();
        this.agentxSessionIndex = agentxSessionIndex;
        notifyChange(1, oldValue, agentxSessionIndex);
    }

    public String getAgentxSessionObjectID() {
        return this.agentxSessionObjectID;
    }

    public void setAgentxSessionObjectID(String agentxSessionObjectID) {
        String oldValue = getAgentxSessionObjectID();
        this.agentxSessionObjectID = agentxSessionObjectID;
        notifyChange(2, oldValue, agentxSessionObjectID);
    }

    public String getAgentxSessionDescr() {
        return this.agentxSessionDescr;
    }

    public void setAgentxSessionDescr(String agentxSessionDescr) {
        String oldValue = getAgentxSessionDescr();
        this.agentxSessionDescr = agentxSessionDescr;
        notifyChange(3, oldValue, agentxSessionDescr);
    }

    public int getAgentxSessionAdminStatus() {
        return this.agentxSessionAdminStatus;
    }

    public void setAgentxSessionAdminStatus(int agentxSessionAdminStatus) {
        int oldValue = getAgentxSessionAdminStatus();
        this.agentxSessionAdminStatus = agentxSessionAdminStatus;
        notifyChange(4, oldValue, agentxSessionAdminStatus);
    }

    public int getAgentxSessionOpenTime() {
        return this.agentxSessionOpenTime;
    }

    public void setAgentxSessionOpenTime(int agentxSessionOpenTime) {
        int oldValue = getAgentxSessionOpenTime();
        this.agentxSessionOpenTime = agentxSessionOpenTime;
        notifyChange(5, oldValue, agentxSessionOpenTime);
    }

    public int getAgentxSessionAgentXVer() {
        return this.agentxSessionAgentXVer;
    }

    public void setAgentxSessionAgentXVer(int agentxSessionAgentXVer) {
        int oldValue = getAgentxSessionAgentXVer();
        this.agentxSessionAgentXVer = agentxSessionAgentXVer;
        notifyChange(6, oldValue, agentxSessionAgentXVer);
    }

    public int getAgentxSessionTimeout() {
        return this.agentxSessionTimeout;
    }

    public void setAgentxSessionTimeout(int agentxSessionTimeout) {
        int oldValue = getAgentxSessionTimeout();
        this.agentxSessionTimeout = agentxSessionTimeout;
        notifyChange(7, oldValue, agentxSessionTimeout);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setAgentxSessionIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setAgentxSessionObjectID(binding.getVariable().toString());
                break;
            case  3 :
                setAgentxSessionDescr(binding.getVariable().toString());
                break;
            case  4 :
                setAgentxSessionAdminStatus(binding.getVariable().toInt());
                break;
            case  5 :
                setAgentxSessionOpenTime(binding.getVariable().toInt());
                break;
            case  6 :
                setAgentxSessionAgentXVer(binding.getVariable().toInt());
                break;
            case  7 :
                setAgentxSessionTimeout(binding.getVariable().toInt());
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
        setAgentxSessionIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AgentxSessionTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("agentxSessionIndex", agentxSessionIndex).append("agentxSessionObjectID", agentxSessionObjectID).append("agentxSessionDescr", agentxSessionDescr).append("agentxSessionAdminStatus", agentxSessionAdminStatus).append("agentxSessionOpenTime", agentxSessionOpenTime).append("agentxSessionAgentXVer", agentxSessionAgentXVer).append("agentxSessionTimeout", agentxSessionTimeout).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(agentxSessionIndex).append(agentxSessionObjectID).append(agentxSessionDescr).append(agentxSessionAdminStatus).append(agentxSessionOpenTime).append(agentxSessionAgentXVer).append(agentxSessionTimeout).append(_index).toHashCode();
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
        AgentxSessionEntry rhs = ((AgentxSessionEntry) obj);
        return new EqualsBuilder().append(agentxSessionIndex, rhs.agentxSessionIndex).append(agentxSessionObjectID, rhs.agentxSessionObjectID).append(agentxSessionDescr, rhs.agentxSessionDescr).append(agentxSessionAdminStatus, rhs.agentxSessionAdminStatus).append(agentxSessionOpenTime, rhs.agentxSessionOpenTime).append(agentxSessionAgentXVer, rhs.agentxSessionAgentXVer).append(agentxSessionTimeout, rhs.agentxSessionTimeout).append(_index, rhs._index).isEquals();
    }

    public AgentxSessionEntry clone() {
        AgentxSessionEntry _copy = new AgentxSessionEntry();
        _copy.agentxSessionIndex = agentxSessionIndex;
        _copy.agentxSessionObjectID = agentxSessionObjectID;
        _copy.agentxSessionDescr = agentxSessionDescr;
        _copy.agentxSessionAdminStatus = agentxSessionAdminStatus;
        _copy.agentxSessionOpenTime = agentxSessionOpenTime;
        _copy.agentxSessionAgentXVer = agentxSessionAgentXVer;
        _copy.agentxSessionTimeout = agentxSessionTimeout;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.74.1.3.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "agentxSessionIndex", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "agentxSessionObjectID", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "agentxSessionDescr", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "agentxSessionAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "agentxSessionOpenTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "agentxSessionAgentXVer", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "agentxSessionTimeout", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
