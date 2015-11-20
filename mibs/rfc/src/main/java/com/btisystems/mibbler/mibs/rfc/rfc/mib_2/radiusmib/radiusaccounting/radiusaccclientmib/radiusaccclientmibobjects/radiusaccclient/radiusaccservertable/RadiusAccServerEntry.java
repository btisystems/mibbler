
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.radiusaccclient.radiusaccservertable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.radiusaccclient.radiusaccservertable.IRadiusAccServerEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.radiusaccclient.RadiusAccServerTable;
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

public class RadiusAccServerEntry
    extends DeviceEntity
    implements Serializable, IRadiusAccServerEntry, IIndexed, IVariableBindingSetter
{

    private int radiusAccServerIndex;
    private String radiusAccServerAddress;
    private int radiusAccClientServerPortNumber;
    private int radiusAccClientRoundTripTime;
    private int radiusAccClientRequests;
    private int radiusAccClientRetransmissions;
    private int radiusAccClientResponses;
    private int radiusAccClientMalformedResponses;
    private int radiusAccClientBadAuthenticators;
    private int radiusAccClientPendingRequests;
    private int radiusAccClientTimeouts;
    private int radiusAccClientUnknownTypes;
    private int radiusAccClientPacketsDropped;
    private String _index;
    private RadiusAccServerTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RadiusAccServerEntry() {
    }

    public int getRadiusAccServerIndex() {
        return this.radiusAccServerIndex;
    }

    public void setRadiusAccServerIndex(int radiusAccServerIndex) {
        int oldValue = getRadiusAccServerIndex();
        this.radiusAccServerIndex = radiusAccServerIndex;
        notifyChange(1, oldValue, radiusAccServerIndex);
    }

    public String getRadiusAccServerAddress() {
        return this.radiusAccServerAddress;
    }

    public void setRadiusAccServerAddress(String radiusAccServerAddress) {
        String oldValue = getRadiusAccServerAddress();
        this.radiusAccServerAddress = radiusAccServerAddress;
        notifyChange(2, oldValue, radiusAccServerAddress);
    }

    public int getRadiusAccClientServerPortNumber() {
        return this.radiusAccClientServerPortNumber;
    }

    public void setRadiusAccClientServerPortNumber(int radiusAccClientServerPortNumber) {
        int oldValue = getRadiusAccClientServerPortNumber();
        this.radiusAccClientServerPortNumber = radiusAccClientServerPortNumber;
        notifyChange(3, oldValue, radiusAccClientServerPortNumber);
    }

    public int getRadiusAccClientRoundTripTime() {
        return this.radiusAccClientRoundTripTime;
    }

    public void setRadiusAccClientRoundTripTime(int radiusAccClientRoundTripTime) {
        int oldValue = getRadiusAccClientRoundTripTime();
        this.radiusAccClientRoundTripTime = radiusAccClientRoundTripTime;
        notifyChange(4, oldValue, radiusAccClientRoundTripTime);
    }

    public int getRadiusAccClientRequests() {
        return this.radiusAccClientRequests;
    }

    public void setRadiusAccClientRequests(int radiusAccClientRequests) {
        int oldValue = getRadiusAccClientRequests();
        this.radiusAccClientRequests = radiusAccClientRequests;
        notifyChange(5, oldValue, radiusAccClientRequests);
    }

    public int getRadiusAccClientRetransmissions() {
        return this.radiusAccClientRetransmissions;
    }

    public void setRadiusAccClientRetransmissions(int radiusAccClientRetransmissions) {
        int oldValue = getRadiusAccClientRetransmissions();
        this.radiusAccClientRetransmissions = radiusAccClientRetransmissions;
        notifyChange(6, oldValue, radiusAccClientRetransmissions);
    }

    public int getRadiusAccClientResponses() {
        return this.radiusAccClientResponses;
    }

    public void setRadiusAccClientResponses(int radiusAccClientResponses) {
        int oldValue = getRadiusAccClientResponses();
        this.radiusAccClientResponses = radiusAccClientResponses;
        notifyChange(7, oldValue, radiusAccClientResponses);
    }

    public int getRadiusAccClientMalformedResponses() {
        return this.radiusAccClientMalformedResponses;
    }

    public void setRadiusAccClientMalformedResponses(int radiusAccClientMalformedResponses) {
        int oldValue = getRadiusAccClientMalformedResponses();
        this.radiusAccClientMalformedResponses = radiusAccClientMalformedResponses;
        notifyChange(8, oldValue, radiusAccClientMalformedResponses);
    }

    public int getRadiusAccClientBadAuthenticators() {
        return this.radiusAccClientBadAuthenticators;
    }

    public void setRadiusAccClientBadAuthenticators(int radiusAccClientBadAuthenticators) {
        int oldValue = getRadiusAccClientBadAuthenticators();
        this.radiusAccClientBadAuthenticators = radiusAccClientBadAuthenticators;
        notifyChange(9, oldValue, radiusAccClientBadAuthenticators);
    }

    public int getRadiusAccClientPendingRequests() {
        return this.radiusAccClientPendingRequests;
    }

    public void setRadiusAccClientPendingRequests(int radiusAccClientPendingRequests) {
        int oldValue = getRadiusAccClientPendingRequests();
        this.radiusAccClientPendingRequests = radiusAccClientPendingRequests;
        notifyChange(10, oldValue, radiusAccClientPendingRequests);
    }

    public int getRadiusAccClientTimeouts() {
        return this.radiusAccClientTimeouts;
    }

    public void setRadiusAccClientTimeouts(int radiusAccClientTimeouts) {
        int oldValue = getRadiusAccClientTimeouts();
        this.radiusAccClientTimeouts = radiusAccClientTimeouts;
        notifyChange(11, oldValue, radiusAccClientTimeouts);
    }

    public int getRadiusAccClientUnknownTypes() {
        return this.radiusAccClientUnknownTypes;
    }

    public void setRadiusAccClientUnknownTypes(int radiusAccClientUnknownTypes) {
        int oldValue = getRadiusAccClientUnknownTypes();
        this.radiusAccClientUnknownTypes = radiusAccClientUnknownTypes;
        notifyChange(12, oldValue, radiusAccClientUnknownTypes);
    }

    public int getRadiusAccClientPacketsDropped() {
        return this.radiusAccClientPacketsDropped;
    }

    public void setRadiusAccClientPacketsDropped(int radiusAccClientPacketsDropped) {
        int oldValue = getRadiusAccClientPacketsDropped();
        this.radiusAccClientPacketsDropped = radiusAccClientPacketsDropped;
        notifyChange(13, oldValue, radiusAccClientPacketsDropped);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setRadiusAccServerIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setRadiusAccServerAddress(binding.getVariable().toString());
                break;
            case  3 :
                setRadiusAccClientServerPortNumber(binding.getVariable().toInt());
                break;
            case  4 :
                setRadiusAccClientRoundTripTime(binding.getVariable().toInt());
                break;
            case  5 :
                setRadiusAccClientRequests(binding.getVariable().toInt());
                break;
            case  6 :
                setRadiusAccClientRetransmissions(binding.getVariable().toInt());
                break;
            case  7 :
                setRadiusAccClientResponses(binding.getVariable().toInt());
                break;
            case  8 :
                setRadiusAccClientMalformedResponses(binding.getVariable().toInt());
                break;
            case  9 :
                setRadiusAccClientBadAuthenticators(binding.getVariable().toInt());
                break;
            case  10 :
                setRadiusAccClientPendingRequests(binding.getVariable().toInt());
                break;
            case  11 :
                setRadiusAccClientTimeouts(binding.getVariable().toInt());
                break;
            case  12 :
                setRadiusAccClientUnknownTypes(binding.getVariable().toInt());
                break;
            case  13 :
                setRadiusAccClientPacketsDropped(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setRadiusAccServerIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(RadiusAccServerTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("radiusAccServerIndex", radiusAccServerIndex).append("radiusAccServerAddress", radiusAccServerAddress).append("radiusAccClientServerPortNumber", radiusAccClientServerPortNumber).append("radiusAccClientRoundTripTime", radiusAccClientRoundTripTime).append("radiusAccClientRequests", radiusAccClientRequests).append("radiusAccClientRetransmissions", radiusAccClientRetransmissions).append("radiusAccClientResponses", radiusAccClientResponses).append("radiusAccClientMalformedResponses", radiusAccClientMalformedResponses).append("radiusAccClientBadAuthenticators", radiusAccClientBadAuthenticators).append("radiusAccClientPendingRequests", radiusAccClientPendingRequests).append("radiusAccClientTimeouts", radiusAccClientTimeouts).append("radiusAccClientUnknownTypes", radiusAccClientUnknownTypes).append("radiusAccClientPacketsDropped", radiusAccClientPacketsDropped).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(radiusAccServerIndex).append(radiusAccServerAddress).append(radiusAccClientServerPortNumber).append(radiusAccClientRoundTripTime).append(radiusAccClientRequests).append(radiusAccClientRetransmissions).append(radiusAccClientResponses).append(radiusAccClientMalformedResponses).append(radiusAccClientBadAuthenticators).append(radiusAccClientPendingRequests).append(radiusAccClientTimeouts).append(radiusAccClientUnknownTypes).append(radiusAccClientPacketsDropped).append(_index).toHashCode();
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
        RadiusAccServerEntry rhs = ((RadiusAccServerEntry) obj);
        return new EqualsBuilder().append(radiusAccServerIndex, rhs.radiusAccServerIndex).append(radiusAccServerAddress, rhs.radiusAccServerAddress).append(radiusAccClientServerPortNumber, rhs.radiusAccClientServerPortNumber).append(radiusAccClientRoundTripTime, rhs.radiusAccClientRoundTripTime).append(radiusAccClientRequests, rhs.radiusAccClientRequests).append(radiusAccClientRetransmissions, rhs.radiusAccClientRetransmissions).append(radiusAccClientResponses, rhs.radiusAccClientResponses).append(radiusAccClientMalformedResponses, rhs.radiusAccClientMalformedResponses).append(radiusAccClientBadAuthenticators, rhs.radiusAccClientBadAuthenticators).append(radiusAccClientPendingRequests, rhs.radiusAccClientPendingRequests).append(radiusAccClientTimeouts, rhs.radiusAccClientTimeouts).append(radiusAccClientUnknownTypes, rhs.radiusAccClientUnknownTypes).append(radiusAccClientPacketsDropped, rhs.radiusAccClientPacketsDropped).append(_index, rhs._index).isEquals();
    }

    public RadiusAccServerEntry clone() {
        RadiusAccServerEntry _copy = new RadiusAccServerEntry();
        _copy.radiusAccServerIndex = radiusAccServerIndex;
        _copy.radiusAccServerAddress = radiusAccServerAddress;
        _copy.radiusAccClientServerPortNumber = radiusAccClientServerPortNumber;
        _copy.radiusAccClientRoundTripTime = radiusAccClientRoundTripTime;
        _copy.radiusAccClientRequests = radiusAccClientRequests;
        _copy.radiusAccClientRetransmissions = radiusAccClientRetransmissions;
        _copy.radiusAccClientResponses = radiusAccClientResponses;
        _copy.radiusAccClientMalformedResponses = radiusAccClientMalformedResponses;
        _copy.radiusAccClientBadAuthenticators = radiusAccClientBadAuthenticators;
        _copy.radiusAccClientPendingRequests = radiusAccClientPendingRequests;
        _copy.radiusAccClientTimeouts = radiusAccClientTimeouts;
        _copy.radiusAccClientUnknownTypes = radiusAccClientUnknownTypes;
        _copy.radiusAccClientPacketsDropped = radiusAccClientPacketsDropped;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.67.2.2.1.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "radiusAccServerIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "radiusAccServerAddress", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "radiusAccClientServerPortNumber", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "radiusAccClientRoundTripTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "radiusAccClientRequests", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "radiusAccClientRetransmissions", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "radiusAccClientResponses", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "radiusAccClientMalformedResponses", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "radiusAccClientBadAuthenticators", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "radiusAccClientPendingRequests", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "radiusAccClientTimeouts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "radiusAccClientUnknownTypes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "radiusAccClientPacketsDropped", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
