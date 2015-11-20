
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qvlanstatictable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qvlanstatictable.IDot1qVlanStaticEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.Dot1qVlanStaticTable;
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

public class Dot1qVlanStaticEntry
    extends DeviceEntity
    implements Serializable, IDot1qVlanStaticEntry, IIndexed, IVariableBindingSetter
{

    private String dot1qVlanStaticName;
    private String dot1qVlanStaticEgressPorts;
    private String dot1qVlanForbiddenEgressPorts;
    private String dot1qVlanStaticUntaggedPorts;
    private int dot1qVlanStaticRowStatus;
    private String _index;
    private Dot1qVlanStaticTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qVlanStaticEntry() {
    }

    public String getDot1qVlanStaticName() {
        return this.dot1qVlanStaticName;
    }

    public void setDot1qVlanStaticName(String dot1qVlanStaticName) {
        String oldValue = getDot1qVlanStaticName();
        this.dot1qVlanStaticName = dot1qVlanStaticName;
        notifyChange(1, oldValue, dot1qVlanStaticName);
    }

    public String getDot1qVlanStaticEgressPorts() {
        return this.dot1qVlanStaticEgressPorts;
    }

    public void setDot1qVlanStaticEgressPorts(String dot1qVlanStaticEgressPorts) {
        String oldValue = getDot1qVlanStaticEgressPorts();
        this.dot1qVlanStaticEgressPorts = dot1qVlanStaticEgressPorts;
        notifyChange(2, oldValue, dot1qVlanStaticEgressPorts);
    }

    public String getDot1qVlanForbiddenEgressPorts() {
        return this.dot1qVlanForbiddenEgressPorts;
    }

    public void setDot1qVlanForbiddenEgressPorts(String dot1qVlanForbiddenEgressPorts) {
        String oldValue = getDot1qVlanForbiddenEgressPorts();
        this.dot1qVlanForbiddenEgressPorts = dot1qVlanForbiddenEgressPorts;
        notifyChange(3, oldValue, dot1qVlanForbiddenEgressPorts);
    }

    public String getDot1qVlanStaticUntaggedPorts() {
        return this.dot1qVlanStaticUntaggedPorts;
    }

    public void setDot1qVlanStaticUntaggedPorts(String dot1qVlanStaticUntaggedPorts) {
        String oldValue = getDot1qVlanStaticUntaggedPorts();
        this.dot1qVlanStaticUntaggedPorts = dot1qVlanStaticUntaggedPorts;
        notifyChange(4, oldValue, dot1qVlanStaticUntaggedPorts);
    }

    public int getDot1qVlanStaticRowStatus() {
        return this.dot1qVlanStaticRowStatus;
    }

    public void setDot1qVlanStaticRowStatus(int dot1qVlanStaticRowStatus) {
        int oldValue = getDot1qVlanStaticRowStatus();
        this.dot1qVlanStaticRowStatus = dot1qVlanStaticRowStatus;
        notifyChange(5, oldValue, dot1qVlanStaticRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qVlanStaticName(binding.getVariable().toString());
                break;
            case  2 :
                setDot1qVlanStaticEgressPorts(binding.getVariable().toString());
                break;
            case  3 :
                setDot1qVlanForbiddenEgressPorts(binding.getVariable().toString());
                break;
            case  4 :
                setDot1qVlanStaticUntaggedPorts(binding.getVariable().toString());
                break;
            case  5 :
                setDot1qVlanStaticRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 13;
        int _len;
        _index = new OID(_oidInts, 13, (oid.size()- 13)).toString();
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1qVlanStaticTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qVlanStaticName", dot1qVlanStaticName).append("dot1qVlanStaticEgressPorts", dot1qVlanStaticEgressPorts).append("dot1qVlanForbiddenEgressPorts", dot1qVlanForbiddenEgressPorts).append("dot1qVlanStaticUntaggedPorts", dot1qVlanStaticUntaggedPorts).append("dot1qVlanStaticRowStatus", dot1qVlanStaticRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qVlanStaticName).append(dot1qVlanStaticEgressPorts).append(dot1qVlanForbiddenEgressPorts).append(dot1qVlanStaticUntaggedPorts).append(dot1qVlanStaticRowStatus).append(_index).toHashCode();
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
        Dot1qVlanStaticEntry rhs = ((Dot1qVlanStaticEntry) obj);
        return new EqualsBuilder().append(dot1qVlanStaticName, rhs.dot1qVlanStaticName).append(dot1qVlanStaticEgressPorts, rhs.dot1qVlanStaticEgressPorts).append(dot1qVlanForbiddenEgressPorts, rhs.dot1qVlanForbiddenEgressPorts).append(dot1qVlanStaticUntaggedPorts, rhs.dot1qVlanStaticUntaggedPorts).append(dot1qVlanStaticRowStatus, rhs.dot1qVlanStaticRowStatus).append(_index, rhs._index).isEquals();
    }

    public Dot1qVlanStaticEntry clone() {
        Dot1qVlanStaticEntry _copy = new Dot1qVlanStaticEntry();
        _copy.dot1qVlanStaticName = dot1qVlanStaticName;
        _copy.dot1qVlanStaticEgressPorts = dot1qVlanStaticEgressPorts;
        _copy.dot1qVlanForbiddenEgressPorts = dot1qVlanForbiddenEgressPorts;
        _copy.dot1qVlanStaticUntaggedPorts = dot1qVlanStaticUntaggedPorts;
        _copy.dot1qVlanStaticRowStatus = dot1qVlanStaticRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qVlanStaticName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qVlanStaticEgressPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qVlanForbiddenEgressPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1qVlanStaticUntaggedPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot1qVlanStaticRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
