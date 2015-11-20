
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlanstatisticstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.Dot1qPortVlanStatisticsTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlanstatisticstable.IDot1qPortVlanStatisticsEntry;
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

public class Dot1qPortVlanStatisticsEntry
    extends DeviceEntity
    implements Serializable, IDot1qPortVlanStatisticsEntry, IIndexed, IVariableBindingSetter
{

    private int dot1qTpVlanPortInFrames;
    private int dot1qTpVlanPortOutFrames;
    private int dot1qTpVlanPortInDiscards;
    private int dot1qTpVlanPortInOverflowFrames;
    private int dot1qTpVlanPortOutOverflowFrames;
    private int dot1qTpVlanPortInOverflowDiscards;
    private String _index;
    private Dot1qPortVlanStatisticsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qPortVlanStatisticsEntry() {
    }

    public int getDot1qTpVlanPortInFrames() {
        return this.dot1qTpVlanPortInFrames;
    }

    public void setDot1qTpVlanPortInFrames(int dot1qTpVlanPortInFrames) {
        int oldValue = getDot1qTpVlanPortInFrames();
        this.dot1qTpVlanPortInFrames = dot1qTpVlanPortInFrames;
        notifyChange(1, oldValue, dot1qTpVlanPortInFrames);
    }

    public int getDot1qTpVlanPortOutFrames() {
        return this.dot1qTpVlanPortOutFrames;
    }

    public void setDot1qTpVlanPortOutFrames(int dot1qTpVlanPortOutFrames) {
        int oldValue = getDot1qTpVlanPortOutFrames();
        this.dot1qTpVlanPortOutFrames = dot1qTpVlanPortOutFrames;
        notifyChange(2, oldValue, dot1qTpVlanPortOutFrames);
    }

    public int getDot1qTpVlanPortInDiscards() {
        return this.dot1qTpVlanPortInDiscards;
    }

    public void setDot1qTpVlanPortInDiscards(int dot1qTpVlanPortInDiscards) {
        int oldValue = getDot1qTpVlanPortInDiscards();
        this.dot1qTpVlanPortInDiscards = dot1qTpVlanPortInDiscards;
        notifyChange(3, oldValue, dot1qTpVlanPortInDiscards);
    }

    public int getDot1qTpVlanPortInOverflowFrames() {
        return this.dot1qTpVlanPortInOverflowFrames;
    }

    public void setDot1qTpVlanPortInOverflowFrames(int dot1qTpVlanPortInOverflowFrames) {
        int oldValue = getDot1qTpVlanPortInOverflowFrames();
        this.dot1qTpVlanPortInOverflowFrames = dot1qTpVlanPortInOverflowFrames;
        notifyChange(4, oldValue, dot1qTpVlanPortInOverflowFrames);
    }

    public int getDot1qTpVlanPortOutOverflowFrames() {
        return this.dot1qTpVlanPortOutOverflowFrames;
    }

    public void setDot1qTpVlanPortOutOverflowFrames(int dot1qTpVlanPortOutOverflowFrames) {
        int oldValue = getDot1qTpVlanPortOutOverflowFrames();
        this.dot1qTpVlanPortOutOverflowFrames = dot1qTpVlanPortOutOverflowFrames;
        notifyChange(5, oldValue, dot1qTpVlanPortOutOverflowFrames);
    }

    public int getDot1qTpVlanPortInOverflowDiscards() {
        return this.dot1qTpVlanPortInOverflowDiscards;
    }

    public void setDot1qTpVlanPortInOverflowDiscards(int dot1qTpVlanPortInOverflowDiscards) {
        int oldValue = getDot1qTpVlanPortInOverflowDiscards();
        this.dot1qTpVlanPortInOverflowDiscards = dot1qTpVlanPortInOverflowDiscards;
        notifyChange(6, oldValue, dot1qTpVlanPortInOverflowDiscards);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qTpVlanPortInFrames(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1qTpVlanPortOutFrames(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1qTpVlanPortInDiscards(binding.getVariable().toInt());
                break;
            case  4 :
                setDot1qTpVlanPortInOverflowFrames(binding.getVariable().toInt());
                break;
            case  5 :
                setDot1qTpVlanPortOutOverflowFrames(binding.getVariable().toInt());
                break;
            case  6 :
                setDot1qTpVlanPortInOverflowDiscards(binding.getVariable().toInt());
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
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1qPortVlanStatisticsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qTpVlanPortInFrames", dot1qTpVlanPortInFrames).append("dot1qTpVlanPortOutFrames", dot1qTpVlanPortOutFrames).append("dot1qTpVlanPortInDiscards", dot1qTpVlanPortInDiscards).append("dot1qTpVlanPortInOverflowFrames", dot1qTpVlanPortInOverflowFrames).append("dot1qTpVlanPortOutOverflowFrames", dot1qTpVlanPortOutOverflowFrames).append("dot1qTpVlanPortInOverflowDiscards", dot1qTpVlanPortInOverflowDiscards).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qTpVlanPortInFrames).append(dot1qTpVlanPortOutFrames).append(dot1qTpVlanPortInDiscards).append(dot1qTpVlanPortInOverflowFrames).append(dot1qTpVlanPortOutOverflowFrames).append(dot1qTpVlanPortInOverflowDiscards).append(_index).toHashCode();
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
        Dot1qPortVlanStatisticsEntry rhs = ((Dot1qPortVlanStatisticsEntry) obj);
        return new EqualsBuilder().append(dot1qTpVlanPortInFrames, rhs.dot1qTpVlanPortInFrames).append(dot1qTpVlanPortOutFrames, rhs.dot1qTpVlanPortOutFrames).append(dot1qTpVlanPortInDiscards, rhs.dot1qTpVlanPortInDiscards).append(dot1qTpVlanPortInOverflowFrames, rhs.dot1qTpVlanPortInOverflowFrames).append(dot1qTpVlanPortOutOverflowFrames, rhs.dot1qTpVlanPortOutOverflowFrames).append(dot1qTpVlanPortInOverflowDiscards, rhs.dot1qTpVlanPortInOverflowDiscards).append(_index, rhs._index).isEquals();
    }

    public Dot1qPortVlanStatisticsEntry clone() {
        Dot1qPortVlanStatisticsEntry _copy = new Dot1qPortVlanStatisticsEntry();
        _copy.dot1qTpVlanPortInFrames = dot1qTpVlanPortInFrames;
        _copy.dot1qTpVlanPortOutFrames = dot1qTpVlanPortOutFrames;
        _copy.dot1qTpVlanPortInDiscards = dot1qTpVlanPortInDiscards;
        _copy.dot1qTpVlanPortInOverflowFrames = dot1qTpVlanPortInOverflowFrames;
        _copy.dot1qTpVlanPortOutOverflowFrames = dot1qTpVlanPortOutOverflowFrames;
        _copy.dot1qTpVlanPortInOverflowDiscards = dot1qTpVlanPortInOverflowDiscards;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qTpVlanPortInFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qTpVlanPortOutFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qTpVlanPortInDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1qTpVlanPortInOverflowFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot1qTpVlanPortOutOverflowFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "dot1qTpVlanPortInOverflowDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
