
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.dot1qstaticunicasttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.dot1qstaticunicasttable.IDot1qStaticUnicastEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.Dot1qStaticUnicastTable;
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

public class Dot1qStaticUnicastEntry
    extends DeviceEntity
    implements Serializable, IDot1qStaticUnicastEntry, IIndexed, IVariableBindingSetter
{

    private String dot1qStaticUnicastAddress;
    private int dot1qStaticUnicastReceivePort;
    private String dot1qStaticUnicastAllowedToGoTo;
    private Integer dot1qStaticUnicastStatus;
    private String _index;
    private Dot1qStaticUnicastTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qStaticUnicastEntry() {
    }

    public String getDot1qStaticUnicastAddress() {
        return this.dot1qStaticUnicastAddress;
    }

    public void setDot1qStaticUnicastAddress(String dot1qStaticUnicastAddress) {
        String oldValue = getDot1qStaticUnicastAddress();
        this.dot1qStaticUnicastAddress = dot1qStaticUnicastAddress;
        notifyChange(1, oldValue, dot1qStaticUnicastAddress);
    }

    public int getDot1qStaticUnicastReceivePort() {
        return this.dot1qStaticUnicastReceivePort;
    }

    public void setDot1qStaticUnicastReceivePort(int dot1qStaticUnicastReceivePort) {
        int oldValue = getDot1qStaticUnicastReceivePort();
        this.dot1qStaticUnicastReceivePort = dot1qStaticUnicastReceivePort;
        notifyChange(2, oldValue, dot1qStaticUnicastReceivePort);
    }

    public String getDot1qStaticUnicastAllowedToGoTo() {
        return this.dot1qStaticUnicastAllowedToGoTo;
    }

    public void setDot1qStaticUnicastAllowedToGoTo(String dot1qStaticUnicastAllowedToGoTo) {
        String oldValue = getDot1qStaticUnicastAllowedToGoTo();
        this.dot1qStaticUnicastAllowedToGoTo = dot1qStaticUnicastAllowedToGoTo;
        notifyChange(3, oldValue, dot1qStaticUnicastAllowedToGoTo);
    }

    public int getDot1qStaticUnicastStatus() {
        if (this.dot1qStaticUnicastStatus == null) {
            return  3;
        }
        return this.dot1qStaticUnicastStatus;
    }

    public boolean isDot1qStaticUnicastStatusDefined() {
        return (this.dot1qStaticUnicastStatus!= null);
    }

    public void setDot1qStaticUnicastStatus(int dot1qStaticUnicastStatus) {
        int oldValue = getDot1qStaticUnicastStatus();
        this.dot1qStaticUnicastStatus = dot1qStaticUnicastStatus;
        notifyChange(4, oldValue, dot1qStaticUnicastStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qStaticUnicastAddress(binding.getVariable().toString());
                break;
            case  2 :
                setDot1qStaticUnicastReceivePort(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1qStaticUnicastAllowedToGoTo(binding.getVariable().toString());
                break;
            case  4 :
                setDot1qStaticUnicastStatus(binding.getVariable().toInt());
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
        setDot1qStaticUnicastAddress(_getMacAddress(_oidInts, arrayOffset, 6));
        arrayOffset += 6;
        setDot1qStaticUnicastReceivePort(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1qStaticUnicastTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qStaticUnicastAddress", dot1qStaticUnicastAddress).append("dot1qStaticUnicastReceivePort", dot1qStaticUnicastReceivePort).append("dot1qStaticUnicastAllowedToGoTo", dot1qStaticUnicastAllowedToGoTo).append("dot1qStaticUnicastStatus", dot1qStaticUnicastStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qStaticUnicastAddress).append(dot1qStaticUnicastReceivePort).append(dot1qStaticUnicastAllowedToGoTo).append(dot1qStaticUnicastStatus).append(_index).toHashCode();
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
        Dot1qStaticUnicastEntry rhs = ((Dot1qStaticUnicastEntry) obj);
        return new EqualsBuilder().append(dot1qStaticUnicastAddress, rhs.dot1qStaticUnicastAddress).append(dot1qStaticUnicastReceivePort, rhs.dot1qStaticUnicastReceivePort).append(dot1qStaticUnicastAllowedToGoTo, rhs.dot1qStaticUnicastAllowedToGoTo).append(dot1qStaticUnicastStatus, rhs.dot1qStaticUnicastStatus).append(_index, rhs._index).isEquals();
    }

    public Dot1qStaticUnicastEntry clone() {
        Dot1qStaticUnicastEntry _copy = new Dot1qStaticUnicastEntry();
        _copy.dot1qStaticUnicastAddress = dot1qStaticUnicastAddress;
        _copy.dot1qStaticUnicastReceivePort = dot1qStaticUnicastReceivePort;
        _copy.dot1qStaticUnicastAllowedToGoTo = dot1qStaticUnicastAllowedToGoTo;
        _copy.dot1qStaticUnicastStatus = dot1qStaticUnicastStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.3.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qStaticUnicastAddress", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qStaticUnicastReceivePort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qStaticUnicastAllowedToGoTo", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1qStaticUnicastStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
