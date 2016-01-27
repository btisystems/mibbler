
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.application.assoctable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAssocEntry
    extends IDeviceEntity
{


    void setAssocIndex(int assocIndex);

    int getAssocIndex();

    void setAssocRemoteApplication(String assocRemoteApplication);

    String getAssocRemoteApplication();

    void setAssocApplicationProtocol(String assocApplicationProtocol);

    String getAssocApplicationProtocol();

    void setAssocApplicationType(int assocApplicationType);

    int getAssocApplicationType();

    void setAssocDuration(int assocDuration);

    int getAssocDuration();

    IAssocEntry clone();

}
