
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.radiusauthclient.radiusauthservertable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.radiusauthclient.RadiusAuthServerTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.radiusauthclient.radiusauthservertable.IRadiusAuthServerEntry;
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

public class RadiusAuthServerEntry
    extends DeviceEntity
    implements Serializable, IRadiusAuthServerEntry, IIndexed, IVariableBindingSetter
{

    private int radiusAuthServerIndex;
    private String radiusAuthServerAddress;
    private int radiusAuthClientServerPortNumber;
    private int radiusAuthClientRoundTripTime;
    private int radiusAuthClientAccessRequests;
    private int radiusAuthClientAccessRetransmissions;
    private int radiusAuthClientAccessAccepts;
    private int radiusAuthClientAccessRejects;
    private int radiusAuthClientAccessChallenges;
    private int radiusAuthClientMalformedAccessResponses;
    private int radiusAuthClientBadAuthenticators;
    private int radiusAuthClientPendingRequests;
    private int radiusAuthClientTimeouts;
    private int radiusAuthClientUnknownTypes;
    private int radiusAuthClientPacketsDropped;
    private String _index;
    private RadiusAuthServerTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RadiusAuthServerEntry() {
    }

    public int getRadiusAuthServerIndex() {
        return this.radiusAuthServerIndex;
    }

    public void setRadiusAuthServerIndex(int radiusAuthServerIndex) {
        int oldValue = getRadiusAuthServerIndex();
        this.radiusAuthServerIndex = radiusAuthServerIndex;
        notifyChange(1, oldValue, radiusAuthServerIndex);
    }

    public String getRadiusAuthServerAddress() {
        return this.radiusAuthServerAddress;
    }

    public void setRadiusAuthServerAddress(String radiusAuthServerAddress) {
        String oldValue = getRadiusAuthServerAddress();
        this.radiusAuthServerAddress = radiusAuthServerAddress;
        notifyChange(2, oldValue, radiusAuthServerAddress);
    }

    public int getRadiusAuthClientServerPortNumber() {
        return this.radiusAuthClientServerPortNumber;
    }

    public void setRadiusAuthClientServerPortNumber(int radiusAuthClientServerPortNumber) {
        int oldValue = getRadiusAuthClientServerPortNumber();
        this.radiusAuthClientServerPortNumber = radiusAuthClientServerPortNumber;
        notifyChange(3, oldValue, radiusAuthClientServerPortNumber);
    }

    public int getRadiusAuthClientRoundTripTime() {
        return this.radiusAuthClientRoundTripTime;
    }

    public void setRadiusAuthClientRoundTripTime(int radiusAuthClientRoundTripTime) {
        int oldValue = getRadiusAuthClientRoundTripTime();
        this.radiusAuthClientRoundTripTime = radiusAuthClientRoundTripTime;
        notifyChange(4, oldValue, radiusAuthClientRoundTripTime);
    }

    public int getRadiusAuthClientAccessRequests() {
        return this.radiusAuthClientAccessRequests;
    }

    public void setRadiusAuthClientAccessRequests(int radiusAuthClientAccessRequests) {
        int oldValue = getRadiusAuthClientAccessRequests();
        this.radiusAuthClientAccessRequests = radiusAuthClientAccessRequests;
        notifyChange(5, oldValue, radiusAuthClientAccessRequests);
    }

    public int getRadiusAuthClientAccessRetransmissions() {
        return this.radiusAuthClientAccessRetransmissions;
    }

    public void setRadiusAuthClientAccessRetransmissions(int radiusAuthClientAccessRetransmissions) {
        int oldValue = getRadiusAuthClientAccessRetransmissions();
        this.radiusAuthClientAccessRetransmissions = radiusAuthClientAccessRetransmissions;
        notifyChange(6, oldValue, radiusAuthClientAccessRetransmissions);
    }

    public int getRadiusAuthClientAccessAccepts() {
        return this.radiusAuthClientAccessAccepts;
    }

    public void setRadiusAuthClientAccessAccepts(int radiusAuthClientAccessAccepts) {
        int oldValue = getRadiusAuthClientAccessAccepts();
        this.radiusAuthClientAccessAccepts = radiusAuthClientAccessAccepts;
        notifyChange(7, oldValue, radiusAuthClientAccessAccepts);
    }

    public int getRadiusAuthClientAccessRejects() {
        return this.radiusAuthClientAccessRejects;
    }

    public void setRadiusAuthClientAccessRejects(int radiusAuthClientAccessRejects) {
        int oldValue = getRadiusAuthClientAccessRejects();
        this.radiusAuthClientAccessRejects = radiusAuthClientAccessRejects;
        notifyChange(8, oldValue, radiusAuthClientAccessRejects);
    }

    public int getRadiusAuthClientAccessChallenges() {
        return this.radiusAuthClientAccessChallenges;
    }

    public void setRadiusAuthClientAccessChallenges(int radiusAuthClientAccessChallenges) {
        int oldValue = getRadiusAuthClientAccessChallenges();
        this.radiusAuthClientAccessChallenges = radiusAuthClientAccessChallenges;
        notifyChange(9, oldValue, radiusAuthClientAccessChallenges);
    }

    public int getRadiusAuthClientMalformedAccessResponses() {
        return this.radiusAuthClientMalformedAccessResponses;
    }

    public void setRadiusAuthClientMalformedAccessResponses(int radiusAuthClientMalformedAccessResponses) {
        int oldValue = getRadiusAuthClientMalformedAccessResponses();
        this.radiusAuthClientMalformedAccessResponses = radiusAuthClientMalformedAccessResponses;
        notifyChange(10, oldValue, radiusAuthClientMalformedAccessResponses);
    }

    public int getRadiusAuthClientBadAuthenticators() {
        return this.radiusAuthClientBadAuthenticators;
    }

    public void setRadiusAuthClientBadAuthenticators(int radiusAuthClientBadAuthenticators) {
        int oldValue = getRadiusAuthClientBadAuthenticators();
        this.radiusAuthClientBadAuthenticators = radiusAuthClientBadAuthenticators;
        notifyChange(11, oldValue, radiusAuthClientBadAuthenticators);
    }

    public int getRadiusAuthClientPendingRequests() {
        return this.radiusAuthClientPendingRequests;
    }

    public void setRadiusAuthClientPendingRequests(int radiusAuthClientPendingRequests) {
        int oldValue = getRadiusAuthClientPendingRequests();
        this.radiusAuthClientPendingRequests = radiusAuthClientPendingRequests;
        notifyChange(12, oldValue, radiusAuthClientPendingRequests);
    }

    public int getRadiusAuthClientTimeouts() {
        return this.radiusAuthClientTimeouts;
    }

    public void setRadiusAuthClientTimeouts(int radiusAuthClientTimeouts) {
        int oldValue = getRadiusAuthClientTimeouts();
        this.radiusAuthClientTimeouts = radiusAuthClientTimeouts;
        notifyChange(13, oldValue, radiusAuthClientTimeouts);
    }

    public int getRadiusAuthClientUnknownTypes() {
        return this.radiusAuthClientUnknownTypes;
    }

    public void setRadiusAuthClientUnknownTypes(int radiusAuthClientUnknownTypes) {
        int oldValue = getRadiusAuthClientUnknownTypes();
        this.radiusAuthClientUnknownTypes = radiusAuthClientUnknownTypes;
        notifyChange(14, oldValue, radiusAuthClientUnknownTypes);
    }

    public int getRadiusAuthClientPacketsDropped() {
        return this.radiusAuthClientPacketsDropped;
    }

    public void setRadiusAuthClientPacketsDropped(int radiusAuthClientPacketsDropped) {
        int oldValue = getRadiusAuthClientPacketsDropped();
        this.radiusAuthClientPacketsDropped = radiusAuthClientPacketsDropped;
        notifyChange(15, oldValue, radiusAuthClientPacketsDropped);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setRadiusAuthServerIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setRadiusAuthServerAddress(binding.getVariable().toString());
                break;
            case  3 :
                setRadiusAuthClientServerPortNumber(binding.getVariable().toInt());
                break;
            case  4 :
                setRadiusAuthClientRoundTripTime(binding.getVariable().toInt());
                break;
            case  5 :
                setRadiusAuthClientAccessRequests(binding.getVariable().toInt());
                break;
            case  6 :
                setRadiusAuthClientAccessRetransmissions(binding.getVariable().toInt());
                break;
            case  7 :
                setRadiusAuthClientAccessAccepts(binding.getVariable().toInt());
                break;
            case  8 :
                setRadiusAuthClientAccessRejects(binding.getVariable().toInt());
                break;
            case  9 :
                setRadiusAuthClientAccessChallenges(binding.getVariable().toInt());
                break;
            case  10 :
                setRadiusAuthClientMalformedAccessResponses(binding.getVariable().toInt());
                break;
            case  11 :
                setRadiusAuthClientBadAuthenticators(binding.getVariable().toInt());
                break;
            case  12 :
                setRadiusAuthClientPendingRequests(binding.getVariable().toInt());
                break;
            case  13 :
                setRadiusAuthClientTimeouts(binding.getVariable().toInt());
                break;
            case  14 :
                setRadiusAuthClientUnknownTypes(binding.getVariable().toInt());
                break;
            case  15 :
                setRadiusAuthClientPacketsDropped(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setRadiusAuthServerIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(RadiusAuthServerTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("radiusAuthServerIndex", radiusAuthServerIndex).append("radiusAuthServerAddress", radiusAuthServerAddress).append("radiusAuthClientServerPortNumber", radiusAuthClientServerPortNumber).append("radiusAuthClientRoundTripTime", radiusAuthClientRoundTripTime).append("radiusAuthClientAccessRequests", radiusAuthClientAccessRequests).append("radiusAuthClientAccessRetransmissions", radiusAuthClientAccessRetransmissions).append("radiusAuthClientAccessAccepts", radiusAuthClientAccessAccepts).append("radiusAuthClientAccessRejects", radiusAuthClientAccessRejects).append("radiusAuthClientAccessChallenges", radiusAuthClientAccessChallenges).append("radiusAuthClientMalformedAccessResponses", radiusAuthClientMalformedAccessResponses).append("radiusAuthClientBadAuthenticators", radiusAuthClientBadAuthenticators).append("radiusAuthClientPendingRequests", radiusAuthClientPendingRequests).append("radiusAuthClientTimeouts", radiusAuthClientTimeouts).append("radiusAuthClientUnknownTypes", radiusAuthClientUnknownTypes).append("radiusAuthClientPacketsDropped", radiusAuthClientPacketsDropped).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(radiusAuthServerIndex).append(radiusAuthServerAddress).append(radiusAuthClientServerPortNumber).append(radiusAuthClientRoundTripTime).append(radiusAuthClientAccessRequests).append(radiusAuthClientAccessRetransmissions).append(radiusAuthClientAccessAccepts).append(radiusAuthClientAccessRejects).append(radiusAuthClientAccessChallenges).append(radiusAuthClientMalformedAccessResponses).append(radiusAuthClientBadAuthenticators).append(radiusAuthClientPendingRequests).append(radiusAuthClientTimeouts).append(radiusAuthClientUnknownTypes).append(radiusAuthClientPacketsDropped).append(_index).toHashCode();
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
        RadiusAuthServerEntry rhs = ((RadiusAuthServerEntry) obj);
        return new EqualsBuilder().append(radiusAuthServerIndex, rhs.radiusAuthServerIndex).append(radiusAuthServerAddress, rhs.radiusAuthServerAddress).append(radiusAuthClientServerPortNumber, rhs.radiusAuthClientServerPortNumber).append(radiusAuthClientRoundTripTime, rhs.radiusAuthClientRoundTripTime).append(radiusAuthClientAccessRequests, rhs.radiusAuthClientAccessRequests).append(radiusAuthClientAccessRetransmissions, rhs.radiusAuthClientAccessRetransmissions).append(radiusAuthClientAccessAccepts, rhs.radiusAuthClientAccessAccepts).append(radiusAuthClientAccessRejects, rhs.radiusAuthClientAccessRejects).append(radiusAuthClientAccessChallenges, rhs.radiusAuthClientAccessChallenges).append(radiusAuthClientMalformedAccessResponses, rhs.radiusAuthClientMalformedAccessResponses).append(radiusAuthClientBadAuthenticators, rhs.radiusAuthClientBadAuthenticators).append(radiusAuthClientPendingRequests, rhs.radiusAuthClientPendingRequests).append(radiusAuthClientTimeouts, rhs.radiusAuthClientTimeouts).append(radiusAuthClientUnknownTypes, rhs.radiusAuthClientUnknownTypes).append(radiusAuthClientPacketsDropped, rhs.radiusAuthClientPacketsDropped).append(_index, rhs._index).isEquals();
    }

    public RadiusAuthServerEntry clone() {
        RadiusAuthServerEntry _copy = new RadiusAuthServerEntry();
        _copy.radiusAuthServerIndex = radiusAuthServerIndex;
        _copy.radiusAuthServerAddress = radiusAuthServerAddress;
        _copy.radiusAuthClientServerPortNumber = radiusAuthClientServerPortNumber;
        _copy.radiusAuthClientRoundTripTime = radiusAuthClientRoundTripTime;
        _copy.radiusAuthClientAccessRequests = radiusAuthClientAccessRequests;
        _copy.radiusAuthClientAccessRetransmissions = radiusAuthClientAccessRetransmissions;
        _copy.radiusAuthClientAccessAccepts = radiusAuthClientAccessAccepts;
        _copy.radiusAuthClientAccessRejects = radiusAuthClientAccessRejects;
        _copy.radiusAuthClientAccessChallenges = radiusAuthClientAccessChallenges;
        _copy.radiusAuthClientMalformedAccessResponses = radiusAuthClientMalformedAccessResponses;
        _copy.radiusAuthClientBadAuthenticators = radiusAuthClientBadAuthenticators;
        _copy.radiusAuthClientPendingRequests = radiusAuthClientPendingRequests;
        _copy.radiusAuthClientTimeouts = radiusAuthClientTimeouts;
        _copy.radiusAuthClientUnknownTypes = radiusAuthClientUnknownTypes;
        _copy.radiusAuthClientPacketsDropped = radiusAuthClientPacketsDropped;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.67.1.2.1.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "radiusAuthServerIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "radiusAuthServerAddress", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "radiusAuthClientServerPortNumber", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "radiusAuthClientRoundTripTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "radiusAuthClientAccessRequests", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "radiusAuthClientAccessRetransmissions", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "radiusAuthClientAccessAccepts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "radiusAuthClientAccessRejects", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "radiusAuthClientAccessChallenges", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "radiusAuthClientMalformedAccessResponses", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "radiusAuthClientBadAuthenticators", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "radiusAuthClientPendingRequests", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "radiusAuthClientTimeouts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "radiusAuthClientUnknownTypes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "radiusAuthClientPacketsDropped", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
