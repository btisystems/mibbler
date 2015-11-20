
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qtpfdbtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.Dot1qTpFdbTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qtpfdbtable.IDot1qTpFdbEntry;
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

public class Dot1qTpFdbEntry
    extends DeviceEntity
    implements Serializable, IDot1qTpFdbEntry, IIndexed, IVariableBindingSetter
{

    private String dot1qTpFdbAddress;
    private int dot1qTpFdbPort;
    private int dot1qTpFdbStatus;
    private String _index;
    private Dot1qTpFdbTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qTpFdbEntry() {
    }

    public String getDot1qTpFdbAddress() {
        return this.dot1qTpFdbAddress;
    }

    public void setDot1qTpFdbAddress(String dot1qTpFdbAddress) {
        String oldValue = getDot1qTpFdbAddress();
        this.dot1qTpFdbAddress = dot1qTpFdbAddress;
        notifyChange(1, oldValue, dot1qTpFdbAddress);
    }

    public int getDot1qTpFdbPort() {
        return this.dot1qTpFdbPort;
    }

    public void setDot1qTpFdbPort(int dot1qTpFdbPort) {
        int oldValue = getDot1qTpFdbPort();
        this.dot1qTpFdbPort = dot1qTpFdbPort;
        notifyChange(2, oldValue, dot1qTpFdbPort);
    }

    public int getDot1qTpFdbStatus() {
        return this.dot1qTpFdbStatus;
    }

    public void setDot1qTpFdbStatus(int dot1qTpFdbStatus) {
        int oldValue = getDot1qTpFdbStatus();
        this.dot1qTpFdbStatus = dot1qTpFdbStatus;
        notifyChange(3, oldValue, dot1qTpFdbStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qTpFdbAddress(binding.getVariable().toString());
                break;
            case  2 :
                setDot1qTpFdbPort(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1qTpFdbStatus(binding.getVariable().toInt());
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
        setDot1qTpFdbAddress(_getMacAddress(_oidInts, arrayOffset, 6));
        arrayOffset += 6;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1qTpFdbTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qTpFdbAddress", dot1qTpFdbAddress).append("dot1qTpFdbPort", dot1qTpFdbPort).append("dot1qTpFdbStatus", dot1qTpFdbStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qTpFdbAddress).append(dot1qTpFdbPort).append(dot1qTpFdbStatus).append(_index).toHashCode();
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
        Dot1qTpFdbEntry rhs = ((Dot1qTpFdbEntry) obj);
        return new EqualsBuilder().append(dot1qTpFdbAddress, rhs.dot1qTpFdbAddress).append(dot1qTpFdbPort, rhs.dot1qTpFdbPort).append(dot1qTpFdbStatus, rhs.dot1qTpFdbStatus).append(_index, rhs._index).isEquals();
    }

    public Dot1qTpFdbEntry clone() {
        Dot1qTpFdbEntry _copy = new Dot1qTpFdbEntry();
        _copy.dot1qTpFdbAddress = dot1qTpFdbAddress;
        _copy.dot1qTpFdbPort = dot1qTpFdbPort;
        _copy.dot1qTpFdbStatus = dot1qTpFdbStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.2.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qTpFdbAddress", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qTpFdbPort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qTpFdbStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
