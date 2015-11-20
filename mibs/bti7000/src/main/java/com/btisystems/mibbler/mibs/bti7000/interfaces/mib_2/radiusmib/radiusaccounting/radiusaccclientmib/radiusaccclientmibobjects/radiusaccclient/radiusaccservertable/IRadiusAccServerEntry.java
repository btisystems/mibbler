
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.radiusaccclient.radiusaccservertable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRadiusAccServerEntry
    extends IDeviceEntity
{


    void setRadiusAccServerIndex(int radiusAccServerIndex);

    int getRadiusAccServerIndex();

    void setRadiusAccServerAddress(String radiusAccServerAddress);

    String getRadiusAccServerAddress();

    void setRadiusAccClientServerPortNumber(int radiusAccClientServerPortNumber);

    int getRadiusAccClientServerPortNumber();

    void setRadiusAccClientRoundTripTime(int radiusAccClientRoundTripTime);

    int getRadiusAccClientRoundTripTime();

    void setRadiusAccClientRequests(int radiusAccClientRequests);

    int getRadiusAccClientRequests();

    void setRadiusAccClientRetransmissions(int radiusAccClientRetransmissions);

    int getRadiusAccClientRetransmissions();

    void setRadiusAccClientResponses(int radiusAccClientResponses);

    int getRadiusAccClientResponses();

    void setRadiusAccClientMalformedResponses(int radiusAccClientMalformedResponses);

    int getRadiusAccClientMalformedResponses();

    void setRadiusAccClientBadAuthenticators(int radiusAccClientBadAuthenticators);

    int getRadiusAccClientBadAuthenticators();

    void setRadiusAccClientPendingRequests(int radiusAccClientPendingRequests);

    int getRadiusAccClientPendingRequests();

    void setRadiusAccClientTimeouts(int radiusAccClientTimeouts);

    int getRadiusAccClientTimeouts();

    void setRadiusAccClientUnknownTypes(int radiusAccClientUnknownTypes);

    int getRadiusAccClientUnknownTypes();

    void setRadiusAccClientPacketsDropped(int radiusAccClientPacketsDropped);

    int getRadiusAccClientPacketsDropped();

    IRadiusAccServerEntry clone();

}
