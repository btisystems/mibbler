
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dtp.dot1dtpportoverflowtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtpportoverflowtable.IDot1dTpPortOverflowEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dtp.Dot1dTpPortOverflowTable;
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

public class Dot1dTpPortOverflowEntry
    extends DeviceEntity
    implements Serializable, IDot1dTpPortOverflowEntry, IIndexed, IVariableBindingSetter
{

    private int dot1dTpPortInOverflowFrames;
    private int dot1dTpPortOutOverflowFrames;
    private int dot1dTpPortInOverflowDiscards;
    private String _index;
    private Dot1dTpPortOverflowTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dTpPortOverflowEntry() {
    }

    public int getDot1dTpPortInOverflowFrames() {
        return this.dot1dTpPortInOverflowFrames;
    }

    public void setDot1dTpPortInOverflowFrames(int dot1dTpPortInOverflowFrames) {
        int oldValue = getDot1dTpPortInOverflowFrames();
        this.dot1dTpPortInOverflowFrames = dot1dTpPortInOverflowFrames;
        notifyChange(1, oldValue, dot1dTpPortInOverflowFrames);
    }

    public int getDot1dTpPortOutOverflowFrames() {
        return this.dot1dTpPortOutOverflowFrames;
    }

    public void setDot1dTpPortOutOverflowFrames(int dot1dTpPortOutOverflowFrames) {
        int oldValue = getDot1dTpPortOutOverflowFrames();
        this.dot1dTpPortOutOverflowFrames = dot1dTpPortOutOverflowFrames;
        notifyChange(2, oldValue, dot1dTpPortOutOverflowFrames);
    }

    public int getDot1dTpPortInOverflowDiscards() {
        return this.dot1dTpPortInOverflowDiscards;
    }

    public void setDot1dTpPortInOverflowDiscards(int dot1dTpPortInOverflowDiscards) {
        int oldValue = getDot1dTpPortInOverflowDiscards();
        this.dot1dTpPortInOverflowDiscards = dot1dTpPortInOverflowDiscards;
        notifyChange(3, oldValue, dot1dTpPortInOverflowDiscards);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot1dTpPortInOverflowFrames(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1dTpPortOutOverflowFrames(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1dTpPortInOverflowDiscards(binding.getVariable().toInt());
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

    public void _setTable(Dot1dTpPortOverflowTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dTpPortInOverflowFrames", dot1dTpPortInOverflowFrames).append("dot1dTpPortOutOverflowFrames", dot1dTpPortOutOverflowFrames).append("dot1dTpPortInOverflowDiscards", dot1dTpPortInOverflowDiscards).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dTpPortInOverflowFrames).append(dot1dTpPortOutOverflowFrames).append(dot1dTpPortInOverflowDiscards).append(_index).toHashCode();
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
        Dot1dTpPortOverflowEntry rhs = ((Dot1dTpPortOverflowEntry) obj);
        return new EqualsBuilder().append(dot1dTpPortInOverflowFrames, rhs.dot1dTpPortInOverflowFrames).append(dot1dTpPortOutOverflowFrames, rhs.dot1dTpPortOutOverflowFrames).append(dot1dTpPortInOverflowDiscards, rhs.dot1dTpPortInOverflowDiscards).append(_index, rhs._index).isEquals();
    }

    public Dot1dTpPortOverflowEntry clone() {
        Dot1dTpPortOverflowEntry _copy = new Dot1dTpPortOverflowEntry();
        _copy.dot1dTpPortInOverflowFrames = dot1dTpPortInOverflowFrames;
        _copy.dot1dTpPortOutOverflowFrames = dot1dTpPortOutOverflowFrames;
        _copy.dot1dTpPortInOverflowDiscards = dot1dTpPortInOverflowDiscards;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.4.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dTpPortInOverflowFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dTpPortOutOverflowFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1dTpPortInOverflowDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
