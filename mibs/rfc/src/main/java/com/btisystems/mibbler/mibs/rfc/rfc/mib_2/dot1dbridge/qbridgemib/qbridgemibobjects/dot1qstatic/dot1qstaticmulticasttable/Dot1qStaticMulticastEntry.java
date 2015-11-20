
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.dot1qstaticmulticasttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.dot1qstaticmulticasttable.IDot1qStaticMulticastEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.Dot1qStaticMulticastTable;
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

public class Dot1qStaticMulticastEntry
    extends DeviceEntity
    implements Serializable, IDot1qStaticMulticastEntry, IIndexed, IVariableBindingSetter
{

    private String dot1qStaticMulticastAddress;
    private int dot1qStaticMulticastReceivePort;
    private String dot1qStaticMulticastStaticEgressPorts;
    private String dot1qStaticMulticastForbiddenEgressPorts;
    private Integer dot1qStaticMulticastStatus;
    private String _index;
    private Dot1qStaticMulticastTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qStaticMulticastEntry() {
    }

    public String getDot1qStaticMulticastAddress() {
        return this.dot1qStaticMulticastAddress;
    }

    public void setDot1qStaticMulticastAddress(String dot1qStaticMulticastAddress) {
        String oldValue = getDot1qStaticMulticastAddress();
        this.dot1qStaticMulticastAddress = dot1qStaticMulticastAddress;
        notifyChange(1, oldValue, dot1qStaticMulticastAddress);
    }

    public int getDot1qStaticMulticastReceivePort() {
        return this.dot1qStaticMulticastReceivePort;
    }

    public void setDot1qStaticMulticastReceivePort(int dot1qStaticMulticastReceivePort) {
        int oldValue = getDot1qStaticMulticastReceivePort();
        this.dot1qStaticMulticastReceivePort = dot1qStaticMulticastReceivePort;
        notifyChange(2, oldValue, dot1qStaticMulticastReceivePort);
    }

    public String getDot1qStaticMulticastStaticEgressPorts() {
        return this.dot1qStaticMulticastStaticEgressPorts;
    }

    public void setDot1qStaticMulticastStaticEgressPorts(String dot1qStaticMulticastStaticEgressPorts) {
        String oldValue = getDot1qStaticMulticastStaticEgressPorts();
        this.dot1qStaticMulticastStaticEgressPorts = dot1qStaticMulticastStaticEgressPorts;
        notifyChange(3, oldValue, dot1qStaticMulticastStaticEgressPorts);
    }

    public String getDot1qStaticMulticastForbiddenEgressPorts() {
        return this.dot1qStaticMulticastForbiddenEgressPorts;
    }

    public void setDot1qStaticMulticastForbiddenEgressPorts(String dot1qStaticMulticastForbiddenEgressPorts) {
        String oldValue = getDot1qStaticMulticastForbiddenEgressPorts();
        this.dot1qStaticMulticastForbiddenEgressPorts = dot1qStaticMulticastForbiddenEgressPorts;
        notifyChange(4, oldValue, dot1qStaticMulticastForbiddenEgressPorts);
    }

    public int getDot1qStaticMulticastStatus() {
        if (this.dot1qStaticMulticastStatus == null) {
            return  3;
        }
        return this.dot1qStaticMulticastStatus;
    }

    public boolean isDot1qStaticMulticastStatusDefined() {
        return (this.dot1qStaticMulticastStatus!= null);
    }

    public void setDot1qStaticMulticastStatus(int dot1qStaticMulticastStatus) {
        int oldValue = getDot1qStaticMulticastStatus();
        this.dot1qStaticMulticastStatus = dot1qStaticMulticastStatus;
        notifyChange(5, oldValue, dot1qStaticMulticastStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qStaticMulticastAddress(binding.getVariable().toString());
                break;
            case  2 :
                setDot1qStaticMulticastReceivePort(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1qStaticMulticastStaticEgressPorts(binding.getVariable().toString());
                break;
            case  4 :
                setDot1qStaticMulticastForbiddenEgressPorts(binding.getVariable().toString());
                break;
            case  5 :
                setDot1qStaticMulticastStatus(binding.getVariable().toInt());
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
        setDot1qStaticMulticastAddress(_getMacAddress(_oidInts, arrayOffset, 6));
        arrayOffset += 6;
        setDot1qStaticMulticastReceivePort(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1qStaticMulticastTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qStaticMulticastAddress", dot1qStaticMulticastAddress).append("dot1qStaticMulticastReceivePort", dot1qStaticMulticastReceivePort).append("dot1qStaticMulticastStaticEgressPorts", dot1qStaticMulticastStaticEgressPorts).append("dot1qStaticMulticastForbiddenEgressPorts", dot1qStaticMulticastForbiddenEgressPorts).append("dot1qStaticMulticastStatus", dot1qStaticMulticastStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qStaticMulticastAddress).append(dot1qStaticMulticastReceivePort).append(dot1qStaticMulticastStaticEgressPorts).append(dot1qStaticMulticastForbiddenEgressPorts).append(dot1qStaticMulticastStatus).append(_index).toHashCode();
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
        Dot1qStaticMulticastEntry rhs = ((Dot1qStaticMulticastEntry) obj);
        return new EqualsBuilder().append(dot1qStaticMulticastAddress, rhs.dot1qStaticMulticastAddress).append(dot1qStaticMulticastReceivePort, rhs.dot1qStaticMulticastReceivePort).append(dot1qStaticMulticastStaticEgressPorts, rhs.dot1qStaticMulticastStaticEgressPorts).append(dot1qStaticMulticastForbiddenEgressPorts, rhs.dot1qStaticMulticastForbiddenEgressPorts).append(dot1qStaticMulticastStatus, rhs.dot1qStaticMulticastStatus).append(_index, rhs._index).isEquals();
    }

    public Dot1qStaticMulticastEntry clone() {
        Dot1qStaticMulticastEntry _copy = new Dot1qStaticMulticastEntry();
        _copy.dot1qStaticMulticastAddress = dot1qStaticMulticastAddress;
        _copy.dot1qStaticMulticastReceivePort = dot1qStaticMulticastReceivePort;
        _copy.dot1qStaticMulticastStaticEgressPorts = dot1qStaticMulticastStaticEgressPorts;
        _copy.dot1qStaticMulticastForbiddenEgressPorts = dot1qStaticMulticastForbiddenEgressPorts;
        _copy.dot1qStaticMulticastStatus = dot1qStaticMulticastStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.3.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qStaticMulticastAddress", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qStaticMulticastReceivePort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qStaticMulticastStaticEgressPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1qStaticMulticastForbiddenEgressPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot1qStaticMulticastStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
