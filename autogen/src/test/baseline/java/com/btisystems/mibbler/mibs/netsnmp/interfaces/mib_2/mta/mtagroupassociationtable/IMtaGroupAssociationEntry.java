
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtagroupassociationtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMtaGroupAssociationEntry
    extends IDeviceEntity
{


    void setMtaGroupAssociationIndex(int mtaGroupAssociationIndex);

    int getMtaGroupAssociationIndex();

    IMtaGroupAssociationEntry clone();

}
