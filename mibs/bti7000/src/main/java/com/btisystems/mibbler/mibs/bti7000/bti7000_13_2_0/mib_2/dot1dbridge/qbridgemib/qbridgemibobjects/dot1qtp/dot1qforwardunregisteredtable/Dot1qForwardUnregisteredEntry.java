
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qforwardunregisteredtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.Dot1qForwardUnregisteredTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qforwardunregisteredtable.IDot1qForwardUnregisteredEntry;
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

public class Dot1qForwardUnregisteredEntry
    extends DeviceEntity
    implements Serializable, IDot1qForwardUnregisteredEntry, IIndexed, IVariableBindingSetter
{

    private String dot1qForwardUnregisteredPorts;
    private String dot1qForwardUnregisteredStaticPorts;
    private String dot1qForwardUnregisteredForbiddenPorts;
    private String _index;
    private Dot1qForwardUnregisteredTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qForwardUnregisteredEntry() {
    }

    public String getDot1qForwardUnregisteredPorts() {
        return this.dot1qForwardUnregisteredPorts;
    }

    public void setDot1qForwardUnregisteredPorts(String dot1qForwardUnregisteredPorts) {
        String oldValue = getDot1qForwardUnregisteredPorts();
        this.dot1qForwardUnregisteredPorts = dot1qForwardUnregisteredPorts;
        notifyChange(1, oldValue, dot1qForwardUnregisteredPorts);
    }

    public String getDot1qForwardUnregisteredStaticPorts() {
        return this.dot1qForwardUnregisteredStaticPorts;
    }

    public void setDot1qForwardUnregisteredStaticPorts(String dot1qForwardUnregisteredStaticPorts) {
        String oldValue = getDot1qForwardUnregisteredStaticPorts();
        this.dot1qForwardUnregisteredStaticPorts = dot1qForwardUnregisteredStaticPorts;
        notifyChange(2, oldValue, dot1qForwardUnregisteredStaticPorts);
    }

    public String getDot1qForwardUnregisteredForbiddenPorts() {
        return this.dot1qForwardUnregisteredForbiddenPorts;
    }

    public void setDot1qForwardUnregisteredForbiddenPorts(String dot1qForwardUnregisteredForbiddenPorts) {
        String oldValue = getDot1qForwardUnregisteredForbiddenPorts();
        this.dot1qForwardUnregisteredForbiddenPorts = dot1qForwardUnregisteredForbiddenPorts;
        notifyChange(3, oldValue, dot1qForwardUnregisteredForbiddenPorts);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qForwardUnregisteredPorts(binding.getVariable().toString());
                break;
            case  2 :
                setDot1qForwardUnregisteredStaticPorts(binding.getVariable().toString());
                break;
            case  3 :
                setDot1qForwardUnregisteredForbiddenPorts(binding.getVariable().toString());
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
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1qForwardUnregisteredTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qForwardUnregisteredPorts", dot1qForwardUnregisteredPorts).append("dot1qForwardUnregisteredStaticPorts", dot1qForwardUnregisteredStaticPorts).append("dot1qForwardUnregisteredForbiddenPorts", dot1qForwardUnregisteredForbiddenPorts).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qForwardUnregisteredPorts).append(dot1qForwardUnregisteredStaticPorts).append(dot1qForwardUnregisteredForbiddenPorts).append(_index).toHashCode();
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
        Dot1qForwardUnregisteredEntry rhs = ((Dot1qForwardUnregisteredEntry) obj);
        return new EqualsBuilder().append(dot1qForwardUnregisteredPorts, rhs.dot1qForwardUnregisteredPorts).append(dot1qForwardUnregisteredStaticPorts, rhs.dot1qForwardUnregisteredStaticPorts).append(dot1qForwardUnregisteredForbiddenPorts, rhs.dot1qForwardUnregisteredForbiddenPorts).append(_index, rhs._index).isEquals();
    }

    public Dot1qForwardUnregisteredEntry clone() {
        Dot1qForwardUnregisteredEntry _copy = new Dot1qForwardUnregisteredEntry();
        _copy.dot1qForwardUnregisteredPorts = dot1qForwardUnregisteredPorts;
        _copy.dot1qForwardUnregisteredStaticPorts = dot1qForwardUnregisteredStaticPorts;
        _copy.dot1qForwardUnregisteredForbiddenPorts = dot1qForwardUnregisteredForbiddenPorts;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.2.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qForwardUnregisteredPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qForwardUnregisteredStaticPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qForwardUnregisteredForbiddenPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
