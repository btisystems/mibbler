
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qforwardalltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.Dot1qForwardAllTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qforwardalltable.IDot1qForwardAllEntry;
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

public class Dot1qForwardAllEntry
    extends DeviceEntity
    implements Serializable, IDot1qForwardAllEntry, IIndexed, IVariableBindingSetter
{

    private String dot1qForwardAllPorts;
    private String dot1qForwardAllStaticPorts;
    private String dot1qForwardAllForbiddenPorts;
    private String _index;
    private Dot1qForwardAllTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qForwardAllEntry() {
    }

    public String getDot1qForwardAllPorts() {
        return this.dot1qForwardAllPorts;
    }

    public void setDot1qForwardAllPorts(String dot1qForwardAllPorts) {
        String oldValue = getDot1qForwardAllPorts();
        this.dot1qForwardAllPorts = dot1qForwardAllPorts;
        notifyChange(1, oldValue, dot1qForwardAllPorts);
    }

    public String getDot1qForwardAllStaticPorts() {
        return this.dot1qForwardAllStaticPorts;
    }

    public void setDot1qForwardAllStaticPorts(String dot1qForwardAllStaticPorts) {
        String oldValue = getDot1qForwardAllStaticPorts();
        this.dot1qForwardAllStaticPorts = dot1qForwardAllStaticPorts;
        notifyChange(2, oldValue, dot1qForwardAllStaticPorts);
    }

    public String getDot1qForwardAllForbiddenPorts() {
        return this.dot1qForwardAllForbiddenPorts;
    }

    public void setDot1qForwardAllForbiddenPorts(String dot1qForwardAllForbiddenPorts) {
        String oldValue = getDot1qForwardAllForbiddenPorts();
        this.dot1qForwardAllForbiddenPorts = dot1qForwardAllForbiddenPorts;
        notifyChange(3, oldValue, dot1qForwardAllForbiddenPorts);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qForwardAllPorts(binding.getVariable().toString());
                break;
            case  2 :
                setDot1qForwardAllStaticPorts(binding.getVariable().toString());
                break;
            case  3 :
                setDot1qForwardAllForbiddenPorts(binding.getVariable().toString());
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

    public void _setTable(Dot1qForwardAllTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qForwardAllPorts", dot1qForwardAllPorts).append("dot1qForwardAllStaticPorts", dot1qForwardAllStaticPorts).append("dot1qForwardAllForbiddenPorts", dot1qForwardAllForbiddenPorts).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qForwardAllPorts).append(dot1qForwardAllStaticPorts).append(dot1qForwardAllForbiddenPorts).append(_index).toHashCode();
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
        Dot1qForwardAllEntry rhs = ((Dot1qForwardAllEntry) obj);
        return new EqualsBuilder().append(dot1qForwardAllPorts, rhs.dot1qForwardAllPorts).append(dot1qForwardAllStaticPorts, rhs.dot1qForwardAllStaticPorts).append(dot1qForwardAllForbiddenPorts, rhs.dot1qForwardAllForbiddenPorts).append(_index, rhs._index).isEquals();
    }

    public Dot1qForwardAllEntry clone() {
        Dot1qForwardAllEntry _copy = new Dot1qForwardAllEntry();
        _copy.dot1qForwardAllPorts = dot1qForwardAllPorts;
        _copy.dot1qForwardAllStaticPorts = dot1qForwardAllStaticPorts;
        _copy.dot1qForwardAllForbiddenPorts = dot1qForwardAllForbiddenPorts;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.2.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qForwardAllPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qForwardAllStaticPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qForwardAllForbiddenPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
