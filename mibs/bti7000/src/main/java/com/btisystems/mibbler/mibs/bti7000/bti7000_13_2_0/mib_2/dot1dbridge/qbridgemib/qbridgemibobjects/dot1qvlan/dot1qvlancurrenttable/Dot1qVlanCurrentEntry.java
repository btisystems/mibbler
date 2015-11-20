
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qvlancurrenttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.Dot1qVlanCurrentTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qvlancurrenttable.IDot1qVlanCurrentEntry;
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

public class Dot1qVlanCurrentEntry
    extends DeviceEntity
    implements Serializable, IDot1qVlanCurrentEntry, IIndexed, IVariableBindingSetter
{

    private int dot1qVlanTimeMark;
    private int dot1qVlanIndex;
    private int dot1qVlanFdbId;
    private String dot1qVlanCurrentEgressPorts;
    private String dot1qVlanCurrentUntaggedPorts;
    private int dot1qVlanStatus;
    private int dot1qVlanCreationTime;
    private String _index;
    private Dot1qVlanCurrentTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qVlanCurrentEntry() {
    }

    public int getDot1qVlanTimeMark() {
        return this.dot1qVlanTimeMark;
    }

    public void setDot1qVlanTimeMark(int dot1qVlanTimeMark) {
        int oldValue = getDot1qVlanTimeMark();
        this.dot1qVlanTimeMark = dot1qVlanTimeMark;
        notifyChange(1, oldValue, dot1qVlanTimeMark);
    }

    public int getDot1qVlanIndex() {
        return this.dot1qVlanIndex;
    }

    public void setDot1qVlanIndex(int dot1qVlanIndex) {
        int oldValue = getDot1qVlanIndex();
        this.dot1qVlanIndex = dot1qVlanIndex;
        notifyChange(2, oldValue, dot1qVlanIndex);
    }

    public int getDot1qVlanFdbId() {
        return this.dot1qVlanFdbId;
    }

    public void setDot1qVlanFdbId(int dot1qVlanFdbId) {
        int oldValue = getDot1qVlanFdbId();
        this.dot1qVlanFdbId = dot1qVlanFdbId;
        notifyChange(3, oldValue, dot1qVlanFdbId);
    }

    public String getDot1qVlanCurrentEgressPorts() {
        return this.dot1qVlanCurrentEgressPorts;
    }

    public void setDot1qVlanCurrentEgressPorts(String dot1qVlanCurrentEgressPorts) {
        String oldValue = getDot1qVlanCurrentEgressPorts();
        this.dot1qVlanCurrentEgressPorts = dot1qVlanCurrentEgressPorts;
        notifyChange(4, oldValue, dot1qVlanCurrentEgressPorts);
    }

    public String getDot1qVlanCurrentUntaggedPorts() {
        return this.dot1qVlanCurrentUntaggedPorts;
    }

    public void setDot1qVlanCurrentUntaggedPorts(String dot1qVlanCurrentUntaggedPorts) {
        String oldValue = getDot1qVlanCurrentUntaggedPorts();
        this.dot1qVlanCurrentUntaggedPorts = dot1qVlanCurrentUntaggedPorts;
        notifyChange(5, oldValue, dot1qVlanCurrentUntaggedPorts);
    }

    public int getDot1qVlanStatus() {
        return this.dot1qVlanStatus;
    }

    public void setDot1qVlanStatus(int dot1qVlanStatus) {
        int oldValue = getDot1qVlanStatus();
        this.dot1qVlanStatus = dot1qVlanStatus;
        notifyChange(6, oldValue, dot1qVlanStatus);
    }

    public int getDot1qVlanCreationTime() {
        return this.dot1qVlanCreationTime;
    }

    public void setDot1qVlanCreationTime(int dot1qVlanCreationTime) {
        int oldValue = getDot1qVlanCreationTime();
        this.dot1qVlanCreationTime = dot1qVlanCreationTime;
        notifyChange(7, oldValue, dot1qVlanCreationTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qVlanTimeMark(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1qVlanIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1qVlanFdbId(binding.getVariable().toInt());
                break;
            case  4 :
                setDot1qVlanCurrentEgressPorts(binding.getVariable().toString());
                break;
            case  5 :
                setDot1qVlanCurrentUntaggedPorts(binding.getVariable().toString());
                break;
            case  6 :
                setDot1qVlanStatus(binding.getVariable().toInt());
                break;
            case  7 :
                setDot1qVlanCreationTime(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 13;
        int _len;
        _index = new OID(_oidInts, 13, (oid.size()- 13)).toString();
        setDot1qVlanTimeMark(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setDot1qVlanIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1qVlanCurrentTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qVlanTimeMark", dot1qVlanTimeMark).append("dot1qVlanIndex", dot1qVlanIndex).append("dot1qVlanFdbId", dot1qVlanFdbId).append("dot1qVlanCurrentEgressPorts", dot1qVlanCurrentEgressPorts).append("dot1qVlanCurrentUntaggedPorts", dot1qVlanCurrentUntaggedPorts).append("dot1qVlanStatus", dot1qVlanStatus).append("dot1qVlanCreationTime", dot1qVlanCreationTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qVlanTimeMark).append(dot1qVlanIndex).append(dot1qVlanFdbId).append(dot1qVlanCurrentEgressPorts).append(dot1qVlanCurrentUntaggedPorts).append(dot1qVlanStatus).append(dot1qVlanCreationTime).append(_index).toHashCode();
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
        Dot1qVlanCurrentEntry rhs = ((Dot1qVlanCurrentEntry) obj);
        return new EqualsBuilder().append(dot1qVlanTimeMark, rhs.dot1qVlanTimeMark).append(dot1qVlanIndex, rhs.dot1qVlanIndex).append(dot1qVlanFdbId, rhs.dot1qVlanFdbId).append(dot1qVlanCurrentEgressPorts, rhs.dot1qVlanCurrentEgressPorts).append(dot1qVlanCurrentUntaggedPorts, rhs.dot1qVlanCurrentUntaggedPorts).append(dot1qVlanStatus, rhs.dot1qVlanStatus).append(dot1qVlanCreationTime, rhs.dot1qVlanCreationTime).append(_index, rhs._index).isEquals();
    }

    public Dot1qVlanCurrentEntry clone() {
        Dot1qVlanCurrentEntry _copy = new Dot1qVlanCurrentEntry();
        _copy.dot1qVlanTimeMark = dot1qVlanTimeMark;
        _copy.dot1qVlanIndex = dot1qVlanIndex;
        _copy.dot1qVlanFdbId = dot1qVlanFdbId;
        _copy.dot1qVlanCurrentEgressPorts = dot1qVlanCurrentEgressPorts;
        _copy.dot1qVlanCurrentUntaggedPorts = dot1qVlanCurrentUntaggedPorts;
        _copy.dot1qVlanStatus = dot1qVlanStatus;
        _copy.dot1qVlanCreationTime = dot1qVlanCreationTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qVlanTimeMark", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qVlanIndex", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qVlanFdbId", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1qVlanCurrentEgressPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot1qVlanCurrentUntaggedPorts", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "dot1qVlanStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "dot1qVlanCreationTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
