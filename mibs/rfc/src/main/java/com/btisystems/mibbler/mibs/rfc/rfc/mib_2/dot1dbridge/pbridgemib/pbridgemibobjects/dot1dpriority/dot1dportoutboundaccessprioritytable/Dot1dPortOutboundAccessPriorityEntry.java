
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dportoutboundaccessprioritytable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dportoutboundaccessprioritytable.IDot1dPortOutboundAccessPriorityEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.Dot1dPortOutboundAccessPriorityTable;
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

public class Dot1dPortOutboundAccessPriorityEntry
    extends DeviceEntity
    implements Serializable, IDot1dPortOutboundAccessPriorityEntry, IIndexed, IVariableBindingSetter
{

    private int dot1dPortOutboundAccessPriority;
    private String _index;
    private Dot1dPortOutboundAccessPriorityTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dPortOutboundAccessPriorityEntry() {
    }

    public int getDot1dPortOutboundAccessPriority() {
        return this.dot1dPortOutboundAccessPriority;
    }

    public void setDot1dPortOutboundAccessPriority(int dot1dPortOutboundAccessPriority) {
        int oldValue = getDot1dPortOutboundAccessPriority();
        this.dot1dPortOutboundAccessPriority = dot1dPortOutboundAccessPriority;
        notifyChange(1, oldValue, dot1dPortOutboundAccessPriority);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1dPortOutboundAccessPriority(binding.getVariable().toInt());
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
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1dPortOutboundAccessPriorityTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dPortOutboundAccessPriority", dot1dPortOutboundAccessPriority).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dPortOutboundAccessPriority).append(_index).toHashCode();
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
        Dot1dPortOutboundAccessPriorityEntry rhs = ((Dot1dPortOutboundAccessPriorityEntry) obj);
        return new EqualsBuilder().append(dot1dPortOutboundAccessPriority, rhs.dot1dPortOutboundAccessPriority).append(_index, rhs._index).isEquals();
    }

    public Dot1dPortOutboundAccessPriorityEntry clone() {
        Dot1dPortOutboundAccessPriorityEntry _copy = new Dot1dPortOutboundAccessPriorityEntry();
        _copy.dot1dPortOutboundAccessPriority = dot1dPortOutboundAccessPriority;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.2.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dPortOutboundAccessPriority", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
