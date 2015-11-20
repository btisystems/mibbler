
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dtp.dot1dtphcporttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtphcporttable.IDot1dTpHCPortEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dtp.Dot1dTpHCPortTable;
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

public class Dot1dTpHCPortEntry
    extends DeviceEntity
    implements Serializable, IDot1dTpHCPortEntry, IIndexed, IVariableBindingSetter
{

    private long dot1dTpHCPortInFrames;
    private long dot1dTpHCPortOutFrames;
    private long dot1dTpHCPortInDiscards;
    private String _index;
    private Dot1dTpHCPortTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dTpHCPortEntry() {
    }

    public long getDot1dTpHCPortInFrames() {
        return this.dot1dTpHCPortInFrames;
    }

    public void setDot1dTpHCPortInFrames(long dot1dTpHCPortInFrames) {
        long oldValue = getDot1dTpHCPortInFrames();
        this.dot1dTpHCPortInFrames = dot1dTpHCPortInFrames;
        notifyChange(1, oldValue, dot1dTpHCPortInFrames);
    }

    public long getDot1dTpHCPortOutFrames() {
        return this.dot1dTpHCPortOutFrames;
    }

    public void setDot1dTpHCPortOutFrames(long dot1dTpHCPortOutFrames) {
        long oldValue = getDot1dTpHCPortOutFrames();
        this.dot1dTpHCPortOutFrames = dot1dTpHCPortOutFrames;
        notifyChange(2, oldValue, dot1dTpHCPortOutFrames);
    }

    public long getDot1dTpHCPortInDiscards() {
        return this.dot1dTpHCPortInDiscards;
    }

    public void setDot1dTpHCPortInDiscards(long dot1dTpHCPortInDiscards) {
        long oldValue = getDot1dTpHCPortInDiscards();
        this.dot1dTpHCPortInDiscards = dot1dTpHCPortInDiscards;
        notifyChange(3, oldValue, dot1dTpHCPortInDiscards);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot1dTpHCPortInFrames(binding.getVariable().toLong());
                break;
            case  2 :
                setDot1dTpHCPortOutFrames(binding.getVariable().toLong());
                break;
            case  3 :
                setDot1dTpHCPortInDiscards(binding.getVariable().toLong());
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

    public void _setTable(Dot1dTpHCPortTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dTpHCPortInFrames", dot1dTpHCPortInFrames).append("dot1dTpHCPortOutFrames", dot1dTpHCPortOutFrames).append("dot1dTpHCPortInDiscards", dot1dTpHCPortInDiscards).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dTpHCPortInFrames).append(dot1dTpHCPortOutFrames).append(dot1dTpHCPortInDiscards).append(_index).toHashCode();
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
        Dot1dTpHCPortEntry rhs = ((Dot1dTpHCPortEntry) obj);
        return new EqualsBuilder().append(dot1dTpHCPortInFrames, rhs.dot1dTpHCPortInFrames).append(dot1dTpHCPortOutFrames, rhs.dot1dTpHCPortOutFrames).append(dot1dTpHCPortInDiscards, rhs.dot1dTpHCPortInDiscards).append(_index, rhs._index).isEquals();
    }

    public Dot1dTpHCPortEntry clone() {
        Dot1dTpHCPortEntry _copy = new Dot1dTpHCPortEntry();
        _copy.dot1dTpHCPortInFrames = dot1dTpHCPortInFrames;
        _copy.dot1dTpHCPortOutFrames = dot1dTpHCPortOutFrames;
        _copy.dot1dTpHCPortInDiscards = dot1dTpHCPortInDiscards;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.4.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dTpHCPortInFrames", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dTpHCPortOutFrames", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1dTpHCPortInDiscards", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
