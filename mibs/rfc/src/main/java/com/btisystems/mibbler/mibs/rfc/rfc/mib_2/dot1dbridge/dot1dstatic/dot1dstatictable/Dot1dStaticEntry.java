
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dstatic.dot1dstatictable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dstatic.dot1dstatictable.IDot1dStaticEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dstatic.Dot1dStaticTable;
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

public class Dot1dStaticEntry
    extends DeviceEntity
    implements Serializable, IDot1dStaticEntry, IIndexed, IVariableBindingSetter
{

    private String dot1dStaticAddress;
    private int dot1dStaticReceivePort;
    private String dot1dStaticAllowedToGoTo;
    private int dot1dStaticStatus;
    private String _index;
    private Dot1dStaticTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dStaticEntry() {
    }

    public String getDot1dStaticAddress() {
        return this.dot1dStaticAddress;
    }

    public void setDot1dStaticAddress(String dot1dStaticAddress) {
        String oldValue = getDot1dStaticAddress();
        this.dot1dStaticAddress = dot1dStaticAddress;
        notifyChange(1, oldValue, dot1dStaticAddress);
    }

    public int getDot1dStaticReceivePort() {
        return this.dot1dStaticReceivePort;
    }

    public void setDot1dStaticReceivePort(int dot1dStaticReceivePort) {
        int oldValue = getDot1dStaticReceivePort();
        this.dot1dStaticReceivePort = dot1dStaticReceivePort;
        notifyChange(2, oldValue, dot1dStaticReceivePort);
    }

    public String getDot1dStaticAllowedToGoTo() {
        return this.dot1dStaticAllowedToGoTo;
    }

    public void setDot1dStaticAllowedToGoTo(String dot1dStaticAllowedToGoTo) {
        String oldValue = getDot1dStaticAllowedToGoTo();
        this.dot1dStaticAllowedToGoTo = dot1dStaticAllowedToGoTo;
        notifyChange(3, oldValue, dot1dStaticAllowedToGoTo);
    }

    public int getDot1dStaticStatus() {
        return this.dot1dStaticStatus;
    }

    public void setDot1dStaticStatus(int dot1dStaticStatus) {
        int oldValue = getDot1dStaticStatus();
        this.dot1dStaticStatus = dot1dStaticStatus;
        notifyChange(4, oldValue, dot1dStaticStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot1dStaticAddress(binding.getVariable().toString());
                break;
            case  2 :
                setDot1dStaticReceivePort(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1dStaticAllowedToGoTo(binding.getVariable().toString());
                break;
            case  4 :
                setDot1dStaticStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setDot1dStaticAddress(_getMacAddress(_oidInts, arrayOffset, 6));
        arrayOffset += 6;
        setDot1dStaticReceivePort(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1dStaticTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dStaticAddress", dot1dStaticAddress).append("dot1dStaticReceivePort", dot1dStaticReceivePort).append("dot1dStaticAllowedToGoTo", dot1dStaticAllowedToGoTo).append("dot1dStaticStatus", dot1dStaticStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dStaticAddress).append(dot1dStaticReceivePort).append(dot1dStaticAllowedToGoTo).append(dot1dStaticStatus).append(_index).toHashCode();
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
        Dot1dStaticEntry rhs = ((Dot1dStaticEntry) obj);
        return new EqualsBuilder().append(dot1dStaticAddress, rhs.dot1dStaticAddress).append(dot1dStaticReceivePort, rhs.dot1dStaticReceivePort).append(dot1dStaticAllowedToGoTo, rhs.dot1dStaticAllowedToGoTo).append(dot1dStaticStatus, rhs.dot1dStaticStatus).append(_index, rhs._index).isEquals();
    }

    public Dot1dStaticEntry clone() {
        Dot1dStaticEntry _copy = new Dot1dStaticEntry();
        _copy.dot1dStaticAddress = dot1dStaticAddress;
        _copy.dot1dStaticReceivePort = dot1dStaticReceivePort;
        _copy.dot1dStaticAllowedToGoTo = dot1dStaticAllowedToGoTo;
        _copy.dot1dStaticStatus = dot1dStaticStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.5.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dStaticAddress", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dStaticReceivePort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1dStaticAllowedToGoTo", DeviceEntityDescription.FieldType.STRING, 512));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1dStaticStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
