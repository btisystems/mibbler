
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlantable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qPortVlanEntry
    extends IDeviceEntity
{


    void setDot1qPvid(int dot1qPvid);

    int getDot1qPvid();

    boolean isDot1qPvidDefined();

    void setDot1qPortAcceptableFrameTypes(int dot1qPortAcceptableFrameTypes);

    int getDot1qPortAcceptableFrameTypes();

    boolean isDot1qPortAcceptableFrameTypesDefined();

    void setDot1qPortIngressFiltering(int dot1qPortIngressFiltering);

    int getDot1qPortIngressFiltering();

    boolean isDot1qPortIngressFilteringDefined();

    void setDot1qPortGvrpStatus(int dot1qPortGvrpStatus);

    int getDot1qPortGvrpStatus();

    boolean isDot1qPortGvrpStatusDefined();

    void setDot1qPortGvrpFailedRegistrations(int dot1qPortGvrpFailedRegistrations);

    int getDot1qPortGvrpFailedRegistrations();

    void setDot1qPortGvrpLastPduOrigin(String dot1qPortGvrpLastPduOrigin);

    String getDot1qPortGvrpLastPduOrigin();

    IDot1qPortVlanEntry clone();

}
