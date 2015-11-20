
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.radiusauthclient.radiusauthservertable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRadiusAuthServerEntry
    extends IDeviceEntity
{


    void setRadiusAuthServerIndex(int radiusAuthServerIndex);

    int getRadiusAuthServerIndex();

    void setRadiusAuthServerAddress(String radiusAuthServerAddress);

    String getRadiusAuthServerAddress();

    void setRadiusAuthClientServerPortNumber(int radiusAuthClientServerPortNumber);

    int getRadiusAuthClientServerPortNumber();

    void setRadiusAuthClientRoundTripTime(int radiusAuthClientRoundTripTime);

    int getRadiusAuthClientRoundTripTime();

    void setRadiusAuthClientAccessRequests(int radiusAuthClientAccessRequests);

    int getRadiusAuthClientAccessRequests();

    void setRadiusAuthClientAccessRetransmissions(int radiusAuthClientAccessRetransmissions);

    int getRadiusAuthClientAccessRetransmissions();

    void setRadiusAuthClientAccessAccepts(int radiusAuthClientAccessAccepts);

    int getRadiusAuthClientAccessAccepts();

    void setRadiusAuthClientAccessRejects(int radiusAuthClientAccessRejects);

    int getRadiusAuthClientAccessRejects();

    void setRadiusAuthClientAccessChallenges(int radiusAuthClientAccessChallenges);

    int getRadiusAuthClientAccessChallenges();

    void setRadiusAuthClientMalformedAccessResponses(int radiusAuthClientMalformedAccessResponses);

    int getRadiusAuthClientMalformedAccessResponses();

    void setRadiusAuthClientBadAuthenticators(int radiusAuthClientBadAuthenticators);

    int getRadiusAuthClientBadAuthenticators();

    void setRadiusAuthClientPendingRequests(int radiusAuthClientPendingRequests);

    int getRadiusAuthClientPendingRequests();

    void setRadiusAuthClientTimeouts(int radiusAuthClientTimeouts);

    int getRadiusAuthClientTimeouts();

    void setRadiusAuthClientUnknownTypes(int radiusAuthClientUnknownTypes);

    int getRadiusAuthClientUnknownTypes();

    void setRadiusAuthClientPacketsDropped(int radiusAuthClientPacketsDropped);

    int getRadiusAuthClientPacketsDropped();

    IRadiusAuthServerEntry clone();

}
