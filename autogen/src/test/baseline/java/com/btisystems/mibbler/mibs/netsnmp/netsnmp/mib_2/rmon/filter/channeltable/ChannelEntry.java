
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.filter.channeltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.rmon.filter.channeltable.IChannelEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.rmon.filter.ChannelTable;
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

public class ChannelEntry
    extends DeviceEntity
    implements Serializable, IChannelEntry, IIndexed, IVariableBindingSetter
{

    private int channelIndex;
    private int channelIfIndex;
    private int channelAcceptType;
    private Integer channelDataControl;
    private int channelTurnOnEventIndex;
    private int channelTurnOffEventIndex;
    private int channelEventIndex;
    private Integer channelEventStatus;
    private int channelMatches;
    private String channelDescription;
    private String channelOwner;
    private int channelStatus;
    private String _index;
    private ChannelTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ChannelEntry() {
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public void setChannelIndex(int channelIndex) {
        int oldValue = getChannelIndex();
        this.channelIndex = channelIndex;
        notifyChange(1, oldValue, channelIndex);
    }

    public int getChannelIfIndex() {
        return this.channelIfIndex;
    }

    public void setChannelIfIndex(int channelIfIndex) {
        int oldValue = getChannelIfIndex();
        this.channelIfIndex = channelIfIndex;
        notifyChange(2, oldValue, channelIfIndex);
    }

    public int getChannelAcceptType() {
        return this.channelAcceptType;
    }

    public void setChannelAcceptType(int channelAcceptType) {
        int oldValue = getChannelAcceptType();
        this.channelAcceptType = channelAcceptType;
        notifyChange(3, oldValue, channelAcceptType);
    }

    public int getChannelDataControl() {
        if (this.channelDataControl == null) {
            return  2;
        }
        return this.channelDataControl;
    }

    public boolean isChannelDataControlDefined() {
        return (this.channelDataControl!= null);
    }

    public void setChannelDataControl(int channelDataControl) {
        int oldValue = getChannelDataControl();
        this.channelDataControl = channelDataControl;
        notifyChange(4, oldValue, channelDataControl);
    }

    public int getChannelTurnOnEventIndex() {
        return this.channelTurnOnEventIndex;
    }

    public void setChannelTurnOnEventIndex(int channelTurnOnEventIndex) {
        int oldValue = getChannelTurnOnEventIndex();
        this.channelTurnOnEventIndex = channelTurnOnEventIndex;
        notifyChange(5, oldValue, channelTurnOnEventIndex);
    }

    public int getChannelTurnOffEventIndex() {
        return this.channelTurnOffEventIndex;
    }

    public void setChannelTurnOffEventIndex(int channelTurnOffEventIndex) {
        int oldValue = getChannelTurnOffEventIndex();
        this.channelTurnOffEventIndex = channelTurnOffEventIndex;
        notifyChange(6, oldValue, channelTurnOffEventIndex);
    }

    public int getChannelEventIndex() {
        return this.channelEventIndex;
    }

    public void setChannelEventIndex(int channelEventIndex) {
        int oldValue = getChannelEventIndex();
        this.channelEventIndex = channelEventIndex;
        notifyChange(7, oldValue, channelEventIndex);
    }

    public int getChannelEventStatus() {
        if (this.channelEventStatus == null) {
            return  1;
        }
        return this.channelEventStatus;
    }

    public boolean isChannelEventStatusDefined() {
        return (this.channelEventStatus!= null);
    }

    public void setChannelEventStatus(int channelEventStatus) {
        int oldValue = getChannelEventStatus();
        this.channelEventStatus = channelEventStatus;
        notifyChange(8, oldValue, channelEventStatus);
    }

    public int getChannelMatches() {
        return this.channelMatches;
    }

    public void setChannelMatches(int channelMatches) {
        int oldValue = getChannelMatches();
        this.channelMatches = channelMatches;
        notifyChange(9, oldValue, channelMatches);
    }

    public String getChannelDescription() {
        return this.channelDescription;
    }

    public void setChannelDescription(String channelDescription) {
        String oldValue = getChannelDescription();
        this.channelDescription = channelDescription;
        notifyChange(10, oldValue, channelDescription);
    }

    public String getChannelOwner() {
        return this.channelOwner;
    }

    public void setChannelOwner(String channelOwner) {
        String oldValue = getChannelOwner();
        this.channelOwner = channelOwner;
        notifyChange(11, oldValue, channelOwner);
    }

    public int getChannelStatus() {
        return this.channelStatus;
    }

    public void setChannelStatus(int channelStatus) {
        int oldValue = getChannelStatus();
        this.channelStatus = channelStatus;
        notifyChange(12, oldValue, channelStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setChannelIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setChannelIfIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setChannelAcceptType(binding.getVariable().toInt());
                break;
            case  4 :
                setChannelDataControl(binding.getVariable().toInt());
                break;
            case  5 :
                setChannelTurnOnEventIndex(binding.getVariable().toInt());
                break;
            case  6 :
                setChannelTurnOffEventIndex(binding.getVariable().toInt());
                break;
            case  7 :
                setChannelEventIndex(binding.getVariable().toInt());
                break;
            case  8 :
                setChannelEventStatus(binding.getVariable().toInt());
                break;
            case  9 :
                setChannelMatches(binding.getVariable().toInt());
                break;
            case  10 :
                setChannelDescription(binding.getVariable().toString());
                break;
            case  11 :
                setChannelOwner(binding.getVariable().toString());
                break;
            case  12 :
                setChannelStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setChannelIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(ChannelTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("channelIndex", channelIndex).append("channelIfIndex", channelIfIndex).append("channelAcceptType", channelAcceptType).append("channelDataControl", channelDataControl).append("channelTurnOnEventIndex", channelTurnOnEventIndex).append("channelTurnOffEventIndex", channelTurnOffEventIndex).append("channelEventIndex", channelEventIndex).append("channelEventStatus", channelEventStatus).append("channelMatches", channelMatches).append("channelDescription", channelDescription).append("channelOwner", channelOwner).append("channelStatus", channelStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(channelIndex).append(channelIfIndex).append(channelAcceptType).append(channelDataControl).append(channelTurnOnEventIndex).append(channelTurnOffEventIndex).append(channelEventIndex).append(channelEventStatus).append(channelMatches).append(channelDescription).append(channelOwner).append(channelStatus).append(_index).toHashCode();
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
        ChannelEntry rhs = ((ChannelEntry) obj);
        return new EqualsBuilder().append(channelIndex, rhs.channelIndex).append(channelIfIndex, rhs.channelIfIndex).append(channelAcceptType, rhs.channelAcceptType).append(channelDataControl, rhs.channelDataControl).append(channelTurnOnEventIndex, rhs.channelTurnOnEventIndex).append(channelTurnOffEventIndex, rhs.channelTurnOffEventIndex).append(channelEventIndex, rhs.channelEventIndex).append(channelEventStatus, rhs.channelEventStatus).append(channelMatches, rhs.channelMatches).append(channelDescription, rhs.channelDescription).append(channelOwner, rhs.channelOwner).append(channelStatus, rhs.channelStatus).append(_index, rhs._index).isEquals();
    }

    public ChannelEntry clone() {
        ChannelEntry _copy = new ChannelEntry();
        _copy.channelIndex = channelIndex;
        _copy.channelIfIndex = channelIfIndex;
        _copy.channelAcceptType = channelAcceptType;
        _copy.channelDataControl = channelDataControl;
        _copy.channelTurnOnEventIndex = channelTurnOnEventIndex;
        _copy.channelTurnOffEventIndex = channelTurnOffEventIndex;
        _copy.channelEventIndex = channelEventIndex;
        _copy.channelEventStatus = channelEventStatus;
        _copy.channelMatches = channelMatches;
        _copy.channelDescription = channelDescription;
        _copy.channelOwner = channelOwner;
        _copy.channelStatus = channelStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.7.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "channelIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "channelIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "channelAcceptType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "channelDataControl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "channelTurnOnEventIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "channelTurnOffEventIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "channelEventIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "channelEventStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "channelMatches", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "channelDescription", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "channelOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "channelStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
