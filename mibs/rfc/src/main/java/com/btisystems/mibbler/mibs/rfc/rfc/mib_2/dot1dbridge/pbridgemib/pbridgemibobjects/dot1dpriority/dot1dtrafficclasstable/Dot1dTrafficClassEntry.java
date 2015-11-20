
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dtrafficclasstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.dot1dtrafficclasstable.IDot1dTrafficClassEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dpriority.Dot1dTrafficClassTable;
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

public class Dot1dTrafficClassEntry
    extends DeviceEntity
    implements Serializable, IDot1dTrafficClassEntry, IIndexed, IVariableBindingSetter
{

    private int dot1dTrafficClassPriority;
    private int dot1dTrafficClass;
    private String _index;
    private Dot1dTrafficClassTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dTrafficClassEntry() {
    }

    public int getDot1dTrafficClassPriority() {
        return this.dot1dTrafficClassPriority;
    }

    public void setDot1dTrafficClassPriority(int dot1dTrafficClassPriority) {
        int oldValue = getDot1dTrafficClassPriority();
        this.dot1dTrafficClassPriority = dot1dTrafficClassPriority;
        notifyChange(1, oldValue, dot1dTrafficClassPriority);
    }

    public int getDot1dTrafficClass() {
        return this.dot1dTrafficClass;
    }

    public void setDot1dTrafficClass(int dot1dTrafficClass) {
        int oldValue = getDot1dTrafficClass();
        this.dot1dTrafficClass = dot1dTrafficClass;
        notifyChange(2, oldValue, dot1dTrafficClass);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1dTrafficClassPriority(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1dTrafficClass(binding.getVariable().toInt());
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
        setDot1dTrafficClassPriority(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1dTrafficClassTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dTrafficClassPriority", dot1dTrafficClassPriority).append("dot1dTrafficClass", dot1dTrafficClass).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dTrafficClassPriority).append(dot1dTrafficClass).append(_index).toHashCode();
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
        Dot1dTrafficClassEntry rhs = ((Dot1dTrafficClassEntry) obj);
        return new EqualsBuilder().append(dot1dTrafficClassPriority, rhs.dot1dTrafficClassPriority).append(dot1dTrafficClass, rhs.dot1dTrafficClass).append(_index, rhs._index).isEquals();
    }

    public Dot1dTrafficClassEntry clone() {
        Dot1dTrafficClassEntry _copy = new Dot1dTrafficClassEntry();
        _copy.dot1dTrafficClassPriority = dot1dTrafficClassPriority;
        _copy.dot1dTrafficClass = dot1dTrafficClass;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.2.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dTrafficClassPriority", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dTrafficClass", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
