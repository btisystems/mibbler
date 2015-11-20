
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.dot3controltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3controltable.IDot3ControlEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.Dot3ControlTable;
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

public class Dot3ControlEntry
    extends DeviceEntity
    implements Serializable, IDot3ControlEntry, IIndexed, IVariableBindingSetter
{

    private String dot3ControlFunctionsSupported;
    private int dot3ControlInUnknownOpcodes;
    private long dot3HCControlInUnknownOpcodes;
    private String _index;
    private Dot3ControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot3ControlEntry() {
    }

    public String getDot3ControlFunctionsSupported() {
        return this.dot3ControlFunctionsSupported;
    }

    public void setDot3ControlFunctionsSupported(String dot3ControlFunctionsSupported) {
        String oldValue = getDot3ControlFunctionsSupported();
        this.dot3ControlFunctionsSupported = dot3ControlFunctionsSupported;
        notifyChange(1, oldValue, dot3ControlFunctionsSupported);
    }

    public int getDot3ControlInUnknownOpcodes() {
        return this.dot3ControlInUnknownOpcodes;
    }

    public void setDot3ControlInUnknownOpcodes(int dot3ControlInUnknownOpcodes) {
        int oldValue = getDot3ControlInUnknownOpcodes();
        this.dot3ControlInUnknownOpcodes = dot3ControlInUnknownOpcodes;
        notifyChange(2, oldValue, dot3ControlInUnknownOpcodes);
    }

    public long getDot3HCControlInUnknownOpcodes() {
        return this.dot3HCControlInUnknownOpcodes;
    }

    public void setDot3HCControlInUnknownOpcodes(long dot3HCControlInUnknownOpcodes) {
        long oldValue = getDot3HCControlInUnknownOpcodes();
        this.dot3HCControlInUnknownOpcodes = dot3HCControlInUnknownOpcodes;
        notifyChange(3, oldValue, dot3HCControlInUnknownOpcodes);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot3ControlFunctionsSupported(binding.getVariable().toString());
                break;
            case  2 :
                setDot3ControlInUnknownOpcodes(binding.getVariable().toInt());
                break;
            case  3 :
                setDot3HCControlInUnknownOpcodes(binding.getVariable().toLong());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot3ControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot3ControlFunctionsSupported", dot3ControlFunctionsSupported).append("dot3ControlInUnknownOpcodes", dot3ControlInUnknownOpcodes).append("dot3HCControlInUnknownOpcodes", dot3HCControlInUnknownOpcodes).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot3ControlFunctionsSupported).append(dot3ControlInUnknownOpcodes).append(dot3HCControlInUnknownOpcodes).append(_index).toHashCode();
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
        Dot3ControlEntry rhs = ((Dot3ControlEntry) obj);
        return new EqualsBuilder().append(dot3ControlFunctionsSupported, rhs.dot3ControlFunctionsSupported).append(dot3ControlInUnknownOpcodes, rhs.dot3ControlInUnknownOpcodes).append(dot3HCControlInUnknownOpcodes, rhs.dot3HCControlInUnknownOpcodes).append(_index, rhs._index).isEquals();
    }

    public Dot3ControlEntry clone() {
        Dot3ControlEntry _copy = new Dot3ControlEntry();
        _copy.dot3ControlFunctionsSupported = dot3ControlFunctionsSupported;
        _copy.dot3ControlInUnknownOpcodes = dot3ControlInUnknownOpcodes;
        _copy.dot3HCControlInUnknownOpcodes = dot3HCControlInUnknownOpcodes;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.10.7.9.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot3ControlFunctionsSupported", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot3ControlInUnknownOpcodes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot3HCControlInUnknownOpcodes", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
