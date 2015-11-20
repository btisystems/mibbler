
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgarp.dot1dportgarptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgarp.Dot1dPortGarpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgarp.dot1dportgarptable.IDot1dPortGarpEntry;
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

public class Dot1dPortGarpEntry
    extends DeviceEntity
    implements Serializable, IDot1dPortGarpEntry, IIndexed, IVariableBindingSetter
{

    private Integer dot1dPortGarpJoinTime;
    private Integer dot1dPortGarpLeaveTime;
    private Integer dot1dPortGarpLeaveAllTime;
    private String _index;
    private Dot1dPortGarpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dPortGarpEntry() {
    }

    public int getDot1dPortGarpJoinTime() {
        if (this.dot1dPortGarpJoinTime == null) {
            return  20;
        }
        return this.dot1dPortGarpJoinTime;
    }

    public boolean isDot1dPortGarpJoinTimeDefined() {
        return (this.dot1dPortGarpJoinTime!= null);
    }

    public void setDot1dPortGarpJoinTime(int dot1dPortGarpJoinTime) {
        int oldValue = getDot1dPortGarpJoinTime();
        this.dot1dPortGarpJoinTime = dot1dPortGarpJoinTime;
        notifyChange(1, oldValue, dot1dPortGarpJoinTime);
    }

    public int getDot1dPortGarpLeaveTime() {
        if (this.dot1dPortGarpLeaveTime == null) {
            return  60;
        }
        return this.dot1dPortGarpLeaveTime;
    }

    public boolean isDot1dPortGarpLeaveTimeDefined() {
        return (this.dot1dPortGarpLeaveTime!= null);
    }

    public void setDot1dPortGarpLeaveTime(int dot1dPortGarpLeaveTime) {
        int oldValue = getDot1dPortGarpLeaveTime();
        this.dot1dPortGarpLeaveTime = dot1dPortGarpLeaveTime;
        notifyChange(2, oldValue, dot1dPortGarpLeaveTime);
    }

    public int getDot1dPortGarpLeaveAllTime() {
        if (this.dot1dPortGarpLeaveAllTime == null) {
            return  1000;
        }
        return this.dot1dPortGarpLeaveAllTime;
    }

    public boolean isDot1dPortGarpLeaveAllTimeDefined() {
        return (this.dot1dPortGarpLeaveAllTime!= null);
    }

    public void setDot1dPortGarpLeaveAllTime(int dot1dPortGarpLeaveAllTime) {
        int oldValue = getDot1dPortGarpLeaveAllTime();
        this.dot1dPortGarpLeaveAllTime = dot1dPortGarpLeaveAllTime;
        notifyChange(3, oldValue, dot1dPortGarpLeaveAllTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1dPortGarpJoinTime(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1dPortGarpLeaveTime(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1dPortGarpLeaveAllTime(binding.getVariable().toInt());
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

    public void _setTable(Dot1dPortGarpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dPortGarpJoinTime", dot1dPortGarpJoinTime).append("dot1dPortGarpLeaveTime", dot1dPortGarpLeaveTime).append("dot1dPortGarpLeaveAllTime", dot1dPortGarpLeaveAllTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dPortGarpJoinTime).append(dot1dPortGarpLeaveTime).append(dot1dPortGarpLeaveAllTime).append(_index).toHashCode();
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
        Dot1dPortGarpEntry rhs = ((Dot1dPortGarpEntry) obj);
        return new EqualsBuilder().append(dot1dPortGarpJoinTime, rhs.dot1dPortGarpJoinTime).append(dot1dPortGarpLeaveTime, rhs.dot1dPortGarpLeaveTime).append(dot1dPortGarpLeaveAllTime, rhs.dot1dPortGarpLeaveAllTime).append(_index, rhs._index).isEquals();
    }

    public Dot1dPortGarpEntry clone() {
        Dot1dPortGarpEntry _copy = new Dot1dPortGarpEntry();
        _copy.dot1dPortGarpJoinTime = dot1dPortGarpJoinTime;
        _copy.dot1dPortGarpLeaveTime = dot1dPortGarpLeaveTime;
        _copy.dot1dPortGarpLeaveAllTime = dot1dPortGarpLeaveAllTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.3.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dPortGarpJoinTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dPortGarpLeaveTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1dPortGarpLeaveAllTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
