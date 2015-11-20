
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qlearningconstraintstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.Dot1qLearningConstraintsTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qlearningconstraintstable.IDot1qLearningConstraintsEntry;
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

public class Dot1qLearningConstraintsEntry
    extends DeviceEntity
    implements Serializable, IDot1qLearningConstraintsEntry, IIndexed, IVariableBindingSetter
{

    private int dot1qConstraintVlan;
    private int dot1qConstraintSet;
    private int dot1qConstraintType;
    private int dot1qConstraintStatus;
    private String _index;
    private Dot1qLearningConstraintsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qLearningConstraintsEntry() {
    }

    public int getDot1qConstraintVlan() {
        return this.dot1qConstraintVlan;
    }

    public void setDot1qConstraintVlan(int dot1qConstraintVlan) {
        int oldValue = getDot1qConstraintVlan();
        this.dot1qConstraintVlan = dot1qConstraintVlan;
        notifyChange(1, oldValue, dot1qConstraintVlan);
    }

    public int getDot1qConstraintSet() {
        return this.dot1qConstraintSet;
    }

    public void setDot1qConstraintSet(int dot1qConstraintSet) {
        int oldValue = getDot1qConstraintSet();
        this.dot1qConstraintSet = dot1qConstraintSet;
        notifyChange(2, oldValue, dot1qConstraintSet);
    }

    public int getDot1qConstraintType() {
        return this.dot1qConstraintType;
    }

    public void setDot1qConstraintType(int dot1qConstraintType) {
        int oldValue = getDot1qConstraintType();
        this.dot1qConstraintType = dot1qConstraintType;
        notifyChange(3, oldValue, dot1qConstraintType);
    }

    public int getDot1qConstraintStatus() {
        return this.dot1qConstraintStatus;
    }

    public void setDot1qConstraintStatus(int dot1qConstraintStatus) {
        int oldValue = getDot1qConstraintStatus();
        this.dot1qConstraintStatus = dot1qConstraintStatus;
        notifyChange(4, oldValue, dot1qConstraintStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qConstraintVlan(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1qConstraintSet(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1qConstraintType(binding.getVariable().toInt());
                break;
            case  4 :
                setDot1qConstraintStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 13;
        int _len;
        _index = new OID(_oidInts, 13, (oid.size()- 13)).toString();
        setDot1qConstraintVlan(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setDot1qConstraintSet(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1qLearningConstraintsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qConstraintVlan", dot1qConstraintVlan).append("dot1qConstraintSet", dot1qConstraintSet).append("dot1qConstraintType", dot1qConstraintType).append("dot1qConstraintStatus", dot1qConstraintStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qConstraintVlan).append(dot1qConstraintSet).append(dot1qConstraintType).append(dot1qConstraintStatus).append(_index).toHashCode();
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
        Dot1qLearningConstraintsEntry rhs = ((Dot1qLearningConstraintsEntry) obj);
        return new EqualsBuilder().append(dot1qConstraintVlan, rhs.dot1qConstraintVlan).append(dot1qConstraintSet, rhs.dot1qConstraintSet).append(dot1qConstraintType, rhs.dot1qConstraintType).append(dot1qConstraintStatus, rhs.dot1qConstraintStatus).append(_index, rhs._index).isEquals();
    }

    public Dot1qLearningConstraintsEntry clone() {
        Dot1qLearningConstraintsEntry _copy = new Dot1qLearningConstraintsEntry();
        _copy.dot1qConstraintVlan = dot1qConstraintVlan;
        _copy.dot1qConstraintSet = dot1qConstraintSet;
        _copy.dot1qConstraintType = dot1qConstraintType;
        _copy.dot1qConstraintStatus = dot1qConstraintStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4.8.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qConstraintVlan", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qConstraintSet", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qConstraintType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1qConstraintStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
