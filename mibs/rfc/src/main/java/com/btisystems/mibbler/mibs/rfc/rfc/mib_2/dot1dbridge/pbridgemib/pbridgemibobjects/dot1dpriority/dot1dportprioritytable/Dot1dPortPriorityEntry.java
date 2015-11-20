
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dportprioritytable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dportprioritytable.IDot1dPortPriorityEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.Dot1dPortPriorityTable;
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

public class Dot1dPortPriorityEntry
    extends DeviceEntity
    implements Serializable, IDot1dPortPriorityEntry, IIndexed, IVariableBindingSetter
{

    private int dot1dPortDefaultUserPriority;
    private int dot1dPortNumTrafficClasses;
    private String _index;
    private Dot1dPortPriorityTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dPortPriorityEntry() {
    }

    public int getDot1dPortDefaultUserPriority() {
        return this.dot1dPortDefaultUserPriority;
    }

    public void setDot1dPortDefaultUserPriority(int dot1dPortDefaultUserPriority) {
        int oldValue = getDot1dPortDefaultUserPriority();
        this.dot1dPortDefaultUserPriority = dot1dPortDefaultUserPriority;
        notifyChange(1, oldValue, dot1dPortDefaultUserPriority);
    }

    public int getDot1dPortNumTrafficClasses() {
        return this.dot1dPortNumTrafficClasses;
    }

    public void setDot1dPortNumTrafficClasses(int dot1dPortNumTrafficClasses) {
        int oldValue = getDot1dPortNumTrafficClasses();
        this.dot1dPortNumTrafficClasses = dot1dPortNumTrafficClasses;
        notifyChange(2, oldValue, dot1dPortNumTrafficClasses);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1dPortDefaultUserPriority(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1dPortNumTrafficClasses(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 13;
        int _len;
        _index = new OID(_oidInts, 13, (oid.size()- 13)).toString();
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1dPortPriorityTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dPortDefaultUserPriority", dot1dPortDefaultUserPriority).append("dot1dPortNumTrafficClasses", dot1dPortNumTrafficClasses).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dPortDefaultUserPriority).append(dot1dPortNumTrafficClasses).append(_index).toHashCode();
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
        Dot1dPortPriorityEntry rhs = ((Dot1dPortPriorityEntry) obj);
        return new EqualsBuilder().append(dot1dPortDefaultUserPriority, rhs.dot1dPortDefaultUserPriority).append(dot1dPortNumTrafficClasses, rhs.dot1dPortNumTrafficClasses).append(_index, rhs._index).isEquals();
    }

    public Dot1dPortPriorityEntry clone() {
        Dot1dPortPriorityEntry _copy = new Dot1dPortPriorityEntry();
        _copy.dot1dPortDefaultUserPriority = dot1dPortDefaultUserPriority;
        _copy.dot1dPortNumTrafficClasses = dot1dPortNumTrafficClasses;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.2.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dPortDefaultUserPriority", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dPortNumTrafficClasses", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
