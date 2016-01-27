
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.dot3colltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3colltable.IDot3CollEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.Dot3CollTable;
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

public class Dot3CollEntry
    extends DeviceEntity
    implements Serializable, IDot3CollEntry, IIndexed, IVariableBindingSetter
{

    private int dot3CollCount;
    private int dot3CollFrequencies;
    private String _index;
    private Dot3CollTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot3CollEntry() {
    }

    public int getDot3CollCount() {
        return this.dot3CollCount;
    }

    public void setDot3CollCount(int dot3CollCount) {
        int oldValue = getDot3CollCount();
        this.dot3CollCount = dot3CollCount;
        notifyChange(2, oldValue, dot3CollCount);
    }

    public int getDot3CollFrequencies() {
        return this.dot3CollFrequencies;
    }

    public void setDot3CollFrequencies(int dot3CollFrequencies) {
        int oldValue = getDot3CollFrequencies();
        this.dot3CollFrequencies = dot3CollFrequencies;
        notifyChange(3, oldValue, dot3CollFrequencies);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  2 :
                setDot3CollCount(binding.getVariable().toInt());
                break;
            case  3 :
                setDot3CollFrequencies(binding.getVariable().toInt());
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
        setDot3CollCount(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot3CollTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot3CollCount", dot3CollCount).append("dot3CollFrequencies", dot3CollFrequencies).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot3CollCount).append(dot3CollFrequencies).append(_index).toHashCode();
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
        Dot3CollEntry rhs = ((Dot3CollEntry) obj);
        return new EqualsBuilder().append(dot3CollCount, rhs.dot3CollCount).append(dot3CollFrequencies, rhs.dot3CollFrequencies).append(_index, rhs._index).isEquals();
    }

    public Dot3CollEntry clone() {
        Dot3CollEntry _copy = new Dot3CollEntry();
        _copy.dot3CollCount = dot3CollCount;
        _copy.dot3CollFrequencies = dot3CollFrequencies;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.10.7.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot3CollCount", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot3CollFrequencies", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
