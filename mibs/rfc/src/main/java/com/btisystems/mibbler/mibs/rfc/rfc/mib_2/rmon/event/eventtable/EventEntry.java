
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.event.eventtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.event.eventtable.IEventEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.event.EventTable;
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

public class EventEntry
    extends DeviceEntity
    implements Serializable, IEventEntry, IIndexed, IVariableBindingSetter
{

    private int eventIndex;
    private String eventDescription;
    private int eventType;
    private String eventCommunity;
    private int eventLastTimeSent;
    private String eventOwner;
    private int eventStatus;
    private String _index;
    private EventTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public EventEntry() {
    }

    public int getEventIndex() {
        return this.eventIndex;
    }

    public void setEventIndex(int eventIndex) {
        int oldValue = getEventIndex();
        this.eventIndex = eventIndex;
        notifyChange(1, oldValue, eventIndex);
    }

    public String getEventDescription() {
        return this.eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        String oldValue = getEventDescription();
        this.eventDescription = eventDescription;
        notifyChange(2, oldValue, eventDescription);
    }

    public int getEventType() {
        return this.eventType;
    }

    public void setEventType(int eventType) {
        int oldValue = getEventType();
        this.eventType = eventType;
        notifyChange(3, oldValue, eventType);
    }

    public String getEventCommunity() {
        return this.eventCommunity;
    }

    public void setEventCommunity(String eventCommunity) {
        String oldValue = getEventCommunity();
        this.eventCommunity = eventCommunity;
        notifyChange(4, oldValue, eventCommunity);
    }

    public int getEventLastTimeSent() {
        return this.eventLastTimeSent;
    }

    public void setEventLastTimeSent(int eventLastTimeSent) {
        int oldValue = getEventLastTimeSent();
        this.eventLastTimeSent = eventLastTimeSent;
        notifyChange(5, oldValue, eventLastTimeSent);
    }

    public String getEventOwner() {
        return this.eventOwner;
    }

    public void setEventOwner(String eventOwner) {
        String oldValue = getEventOwner();
        this.eventOwner = eventOwner;
        notifyChange(6, oldValue, eventOwner);
    }

    public int getEventStatus() {
        return this.eventStatus;
    }

    public void setEventStatus(int eventStatus) {
        int oldValue = getEventStatus();
        this.eventStatus = eventStatus;
        notifyChange(7, oldValue, eventStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setEventIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setEventDescription(binding.getVariable().toString());
                break;
            case  3 :
                setEventType(binding.getVariable().toInt());
                break;
            case  4 :
                setEventCommunity(binding.getVariable().toString());
                break;
            case  5 :
                setEventLastTimeSent(binding.getVariable().toInt());
                break;
            case  6 :
                setEventOwner(binding.getVariable().toString());
                break;
            case  7 :
                setEventStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setEventIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(EventTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("eventIndex", eventIndex).append("eventDescription", eventDescription).append("eventType", eventType).append("eventCommunity", eventCommunity).append("eventLastTimeSent", eventLastTimeSent).append("eventOwner", eventOwner).append("eventStatus", eventStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(eventIndex).append(eventDescription).append(eventType).append(eventCommunity).append(eventLastTimeSent).append(eventOwner).append(eventStatus).append(_index).toHashCode();
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
        EventEntry rhs = ((EventEntry) obj);
        return new EqualsBuilder().append(eventIndex, rhs.eventIndex).append(eventDescription, rhs.eventDescription).append(eventType, rhs.eventType).append(eventCommunity, rhs.eventCommunity).append(eventLastTimeSent, rhs.eventLastTimeSent).append(eventOwner, rhs.eventOwner).append(eventStatus, rhs.eventStatus).append(_index, rhs._index).isEquals();
    }

    public EventEntry clone() {
        EventEntry _copy = new EventEntry();
        _copy.eventIndex = eventIndex;
        _copy.eventDescription = eventDescription;
        _copy.eventType = eventType;
        _copy.eventCommunity = eventCommunity;
        _copy.eventLastTimeSent = eventLastTimeSent;
        _copy.eventOwner = eventOwner;
        _copy.eventStatus = eventStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.9.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "eventIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "eventDescription", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "eventType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "eventCommunity", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "eventLastTimeSent", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "eventOwner", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "eventStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
