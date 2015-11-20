
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.dot1dbase.dot1dbaseporttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.dot1dbase.Dot1dBasePortTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.dot1dbase.dot1dbaseporttable.IDot1dBasePortEntry;
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

public class Dot1dBasePortEntry
    extends DeviceEntity
    implements Serializable, IDot1dBasePortEntry, IIndexed, IVariableBindingSetter
{

    private int dot1dBasePort;
    private int dot1dBasePortIfIndex;
    private String dot1dBasePortCircuit;
    private int dot1dBasePortDelayExceededDiscards;
    private int dot1dBasePortMtuExceededDiscards;
    private String _index;
    private Dot1dBasePortTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dBasePortEntry() {
    }

    public int getDot1dBasePort() {
        return this.dot1dBasePort;
    }

    public void setDot1dBasePort(int dot1dBasePort) {
        int oldValue = getDot1dBasePort();
        this.dot1dBasePort = dot1dBasePort;
        notifyChange(1, oldValue, dot1dBasePort);
    }

    public int getDot1dBasePortIfIndex() {
        return this.dot1dBasePortIfIndex;
    }

    public void setDot1dBasePortIfIndex(int dot1dBasePortIfIndex) {
        int oldValue = getDot1dBasePortIfIndex();
        this.dot1dBasePortIfIndex = dot1dBasePortIfIndex;
        notifyChange(2, oldValue, dot1dBasePortIfIndex);
    }

    public String getDot1dBasePortCircuit() {
        return this.dot1dBasePortCircuit;
    }

    public void setDot1dBasePortCircuit(String dot1dBasePortCircuit) {
        String oldValue = getDot1dBasePortCircuit();
        this.dot1dBasePortCircuit = dot1dBasePortCircuit;
        notifyChange(3, oldValue, dot1dBasePortCircuit);
    }

    public int getDot1dBasePortDelayExceededDiscards() {
        return this.dot1dBasePortDelayExceededDiscards;
    }

    public void setDot1dBasePortDelayExceededDiscards(int dot1dBasePortDelayExceededDiscards) {
        int oldValue = getDot1dBasePortDelayExceededDiscards();
        this.dot1dBasePortDelayExceededDiscards = dot1dBasePortDelayExceededDiscards;
        notifyChange(4, oldValue, dot1dBasePortDelayExceededDiscards);
    }

    public int getDot1dBasePortMtuExceededDiscards() {
        return this.dot1dBasePortMtuExceededDiscards;
    }

    public void setDot1dBasePortMtuExceededDiscards(int dot1dBasePortMtuExceededDiscards) {
        int oldValue = getDot1dBasePortMtuExceededDiscards();
        this.dot1dBasePortMtuExceededDiscards = dot1dBasePortMtuExceededDiscards;
        notifyChange(5, oldValue, dot1dBasePortMtuExceededDiscards);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot1dBasePort(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1dBasePortIfIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1dBasePortCircuit(binding.getVariable().toString());
                break;
            case  4 :
                setDot1dBasePortDelayExceededDiscards(binding.getVariable().toInt());
                break;
            case  5 :
                setDot1dBasePortMtuExceededDiscards(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setDot1dBasePort(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1dBasePortTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dBasePort", dot1dBasePort).append("dot1dBasePortIfIndex", dot1dBasePortIfIndex).append("dot1dBasePortCircuit", dot1dBasePortCircuit).append("dot1dBasePortDelayExceededDiscards", dot1dBasePortDelayExceededDiscards).append("dot1dBasePortMtuExceededDiscards", dot1dBasePortMtuExceededDiscards).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dBasePort).append(dot1dBasePortIfIndex).append(dot1dBasePortCircuit).append(dot1dBasePortDelayExceededDiscards).append(dot1dBasePortMtuExceededDiscards).append(_index).toHashCode();
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
        Dot1dBasePortEntry rhs = ((Dot1dBasePortEntry) obj);
        return new EqualsBuilder().append(dot1dBasePort, rhs.dot1dBasePort).append(dot1dBasePortIfIndex, rhs.dot1dBasePortIfIndex).append(dot1dBasePortCircuit, rhs.dot1dBasePortCircuit).append(dot1dBasePortDelayExceededDiscards, rhs.dot1dBasePortDelayExceededDiscards).append(dot1dBasePortMtuExceededDiscards, rhs.dot1dBasePortMtuExceededDiscards).append(_index, rhs._index).isEquals();
    }

    public Dot1dBasePortEntry clone() {
        Dot1dBasePortEntry _copy = new Dot1dBasePortEntry();
        _copy.dot1dBasePort = dot1dBasePort;
        _copy.dot1dBasePortIfIndex = dot1dBasePortIfIndex;
        _copy.dot1dBasePortCircuit = dot1dBasePortCircuit;
        _copy.dot1dBasePortDelayExceededDiscards = dot1dBasePortDelayExceededDiscards;
        _copy.dot1dBasePortMtuExceededDiscards = dot1dBasePortMtuExceededDiscards;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.1.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dBasePort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dBasePortIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1dBasePortCircuit", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1dBasePortDelayExceededDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot1dBasePortMtuExceededDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
