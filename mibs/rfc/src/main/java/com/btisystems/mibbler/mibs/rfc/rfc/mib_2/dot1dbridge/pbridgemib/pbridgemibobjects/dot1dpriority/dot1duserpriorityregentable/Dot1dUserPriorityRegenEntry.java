
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1duserpriorityregentable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1duserpriorityregentable.IDot1dUserPriorityRegenEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.Dot1dUserPriorityRegenTable;
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

public class Dot1dUserPriorityRegenEntry
    extends DeviceEntity
    implements Serializable, IDot1dUserPriorityRegenEntry, IIndexed, IVariableBindingSetter
{

    private int dot1dUserPriority;
    private int dot1dRegenUserPriority;
    private String _index;
    private Dot1dUserPriorityRegenTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dUserPriorityRegenEntry() {
    }

    public int getDot1dUserPriority() {
        return this.dot1dUserPriority;
    }

    public void setDot1dUserPriority(int dot1dUserPriority) {
        int oldValue = getDot1dUserPriority();
        this.dot1dUserPriority = dot1dUserPriority;
        notifyChange(1, oldValue, dot1dUserPriority);
    }

    public int getDot1dRegenUserPriority() {
        return this.dot1dRegenUserPriority;
    }

    public void setDot1dRegenUserPriority(int dot1dRegenUserPriority) {
        int oldValue = getDot1dRegenUserPriority();
        this.dot1dRegenUserPriority = dot1dRegenUserPriority;
        notifyChange(2, oldValue, dot1dRegenUserPriority);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1dUserPriority(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1dRegenUserPriority(binding.getVariable().toInt());
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
        setDot1dUserPriority(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1dUserPriorityRegenTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dUserPriority", dot1dUserPriority).append("dot1dRegenUserPriority", dot1dRegenUserPriority).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dUserPriority).append(dot1dRegenUserPriority).append(_index).toHashCode();
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
        Dot1dUserPriorityRegenEntry rhs = ((Dot1dUserPriorityRegenEntry) obj);
        return new EqualsBuilder().append(dot1dUserPriority, rhs.dot1dUserPriority).append(dot1dRegenUserPriority, rhs.dot1dRegenUserPriority).append(_index, rhs._index).isEquals();
    }

    public Dot1dUserPriorityRegenEntry clone() {
        Dot1dUserPriorityRegenEntry _copy = new Dot1dUserPriorityRegenEntry();
        _copy.dot1dUserPriority = dot1dUserPriority;
        _copy.dot1dRegenUserPriority = dot1dRegenUserPriority;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.2.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dUserPriority", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dRegenUserPriority", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
