
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.dot1dtp.dot1dtpfdbtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.dot1dtp.Dot1dTpFdbTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtpfdbtable.IDot1dTpFdbEntry;
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

public class Dot1dTpFdbEntry
    extends DeviceEntity
    implements Serializable, IDot1dTpFdbEntry, IIndexed, IVariableBindingSetter
{

    private String dot1dTpFdbAddress;
    private int dot1dTpFdbPort;
    private int dot1dTpFdbStatus;
    private String _index;
    private Dot1dTpFdbTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dTpFdbEntry() {
    }

    public String getDot1dTpFdbAddress() {
        return this.dot1dTpFdbAddress;
    }

    public void setDot1dTpFdbAddress(String dot1dTpFdbAddress) {
        String oldValue = getDot1dTpFdbAddress();
        this.dot1dTpFdbAddress = dot1dTpFdbAddress;
        notifyChange(1, oldValue, dot1dTpFdbAddress);
    }

    public int getDot1dTpFdbPort() {
        return this.dot1dTpFdbPort;
    }

    public void setDot1dTpFdbPort(int dot1dTpFdbPort) {
        int oldValue = getDot1dTpFdbPort();
        this.dot1dTpFdbPort = dot1dTpFdbPort;
        notifyChange(2, oldValue, dot1dTpFdbPort);
    }

    public int getDot1dTpFdbStatus() {
        return this.dot1dTpFdbStatus;
    }

    public void setDot1dTpFdbStatus(int dot1dTpFdbStatus) {
        int oldValue = getDot1dTpFdbStatus();
        this.dot1dTpFdbStatus = dot1dTpFdbStatus;
        notifyChange(3, oldValue, dot1dTpFdbStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot1dTpFdbAddress(binding.getVariable().toString());
                break;
            case  2 :
                setDot1dTpFdbPort(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1dTpFdbStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setDot1dTpFdbAddress(_getMacAddress(_oidInts, arrayOffset, 6));
        arrayOffset += 6;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1dTpFdbTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dTpFdbAddress", dot1dTpFdbAddress).append("dot1dTpFdbPort", dot1dTpFdbPort).append("dot1dTpFdbStatus", dot1dTpFdbStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dTpFdbAddress).append(dot1dTpFdbPort).append(dot1dTpFdbStatus).append(_index).toHashCode();
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
        Dot1dTpFdbEntry rhs = ((Dot1dTpFdbEntry) obj);
        return new EqualsBuilder().append(dot1dTpFdbAddress, rhs.dot1dTpFdbAddress).append(dot1dTpFdbPort, rhs.dot1dTpFdbPort).append(dot1dTpFdbStatus, rhs.dot1dTpFdbStatus).append(_index, rhs._index).isEquals();
    }

    public Dot1dTpFdbEntry clone() {
        Dot1dTpFdbEntry _copy = new Dot1dTpFdbEntry();
        _copy.dot1dTpFdbAddress = dot1dTpFdbAddress;
        _copy.dot1dTpFdbPort = dot1dTpFdbPort;
        _copy.dot1dTpFdbStatus = dot1dTpFdbStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.4.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dTpFdbAddress", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dTpFdbPort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1dTpFdbStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
