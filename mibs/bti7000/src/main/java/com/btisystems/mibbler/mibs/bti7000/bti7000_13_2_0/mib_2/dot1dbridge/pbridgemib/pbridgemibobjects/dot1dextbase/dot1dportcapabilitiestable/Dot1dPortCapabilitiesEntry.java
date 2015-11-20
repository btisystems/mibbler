
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dextbase.dot1dportcapabilitiestable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dextbase.Dot1dPortCapabilitiesTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dextbase.dot1dportcapabilitiestable.IDot1dPortCapabilitiesEntry;
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

public class Dot1dPortCapabilitiesEntry
    extends DeviceEntity
    implements Serializable, IDot1dPortCapabilitiesEntry, IIndexed, IVariableBindingSetter
{

    private String dot1dPortCapabilities;
    private String _index;
    private Dot1dPortCapabilitiesTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dPortCapabilitiesEntry() {
    }

    public String getDot1dPortCapabilities() {
        return this.dot1dPortCapabilities;
    }

    public void setDot1dPortCapabilities(String dot1dPortCapabilities) {
        String oldValue = getDot1dPortCapabilities();
        this.dot1dPortCapabilities = dot1dPortCapabilities;
        notifyChange(1, oldValue, dot1dPortCapabilities);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1dPortCapabilities(binding.getVariable().toString());
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

    public void _setTable(Dot1dPortCapabilitiesTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dPortCapabilities", dot1dPortCapabilities).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dPortCapabilities).append(_index).toHashCode();
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
        Dot1dPortCapabilitiesEntry rhs = ((Dot1dPortCapabilitiesEntry) obj);
        return new EqualsBuilder().append(dot1dPortCapabilities, rhs.dot1dPortCapabilities).append(_index, rhs._index).isEquals();
    }

    public Dot1dPortCapabilitiesEntry clone() {
        Dot1dPortCapabilitiesEntry _copy = new Dot1dPortCapabilitiesEntry();
        _copy.dot1dPortCapabilities = dot1dPortCapabilities;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.1.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dPortCapabilities", DeviceEntityDescription.FieldType.BITS, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
