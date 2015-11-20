
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qtpgrouptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qtpgrouptable.IDot1qTpGroupEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.Dot1qTpGroupTable;
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

public class Dot1qTpGroupEntry
    extends DeviceEntity
    implements Serializable, IDot1qTpGroupEntry, IIndexed, IVariableBindingSetter
{

    private String dot1qTpGroupAddress;
    private String dot1qTpGroupEgressPorts;
    private String dot1qTpGroupLearnt;
    private String _index;
    private Dot1qTpGroupTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qTpGroupEntry() {
    }

    public String getDot1qTpGroupAddress() {
        return this.dot1qTpGroupAddress;
    }

    public void setDot1qTpGroupAddress(String dot1qTpGroupAddress) {
        String oldValue = getDot1qTpGroupAddress();
        this.dot1qTpGroupAddress = dot1qTpGroupAddress;
        notifyChange(1, oldValue, dot1qTpGroupAddress);
    }

    public String getDot1qTpGroupEgressPorts() {
        return this.dot1qTpGroupEgressPorts;
    }

    public void setDot1qTpGroupEgressPorts(String dot1qTpGroupEgressPorts) {
        String oldValue = getDot1qTpGroupEgressPorts();
        this.dot1qTpGroupEgressPorts = dot1qTpGroupEgressPorts;
        notifyChange(2, oldValue, dot1qTpGroupEgressPorts);
    }

    public String getDot1qTpGroupLearnt() {
        return this.dot1qTpGroupLearnt;
    }

    public void setDot1qTpGroupLearnt(String dot1qTpGroupLearnt) {
        String oldValue = getDot1qTpGroupLearnt();
        this.dot1qTpGroupLearnt = dot1qTpGroupLearnt;
        notifyChange(3, oldValue, dot1qTpGroupLearnt);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qTpGroupAddress(binding.getVariable().toString());
                break;
            case  2 :
                setDot1qTpGroupEgressPorts(binding.getVariable().toString());
                break;
            case  3 :
                setDot1qTpGroupLearnt(binding.getVariable().toString());
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
        setDot1qTpGroupAddress(_getMacAddress(_oidInts, arrayOffset, 6));
        arrayOffset += 6;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1qTpGroupTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qTpGroupAddress", dot1qTpGroupAddress).append("dot1qTpGroupEgressPorts", dot1qTpGroupEgressPorts).append("dot1qTpGroupLearnt", dot1qTpGroupLearnt).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qTpGroupAddress).append(dot1qTpGroupEgressPorts).append(dot1qTpGroupLearnt).append(_index).toHashCode();
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
        Dot1qTpGroupEntry rhs = ((Dot1qTpGroupEntry) obj);
        return new EqualsBuilder().append(dot1qTpGroupAddress, rhs.dot1qTpGroupAddress).append(dot1qTpGroupEgressPorts, rhs.dot1qTpGroupEgressPorts).append(dot1qTpGroupLearnt, rhs.dot1qTpGroupLearnt).append(_index, rhs._index).isEquals();
    }

    public Dot1qTpGroupEntry clone() {
        Dot1qTpGroupEntry _copy = new Dot1qTpGroupEntry();
        _copy.dot1qTpGroupAddress = dot1qTpGroupAddress;
        _copy.dot1qTpGroupEgressPorts = dot1qTpGroupEgressPorts;
        _copy.dot1qTpGroupLearnt = dot1qTpGroupLearnt;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.2.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qTpGroupAddress", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qTpGroupEgressPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qTpGroupLearnt", DeviceEntityDescription.FieldType.STRING, 65535));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
