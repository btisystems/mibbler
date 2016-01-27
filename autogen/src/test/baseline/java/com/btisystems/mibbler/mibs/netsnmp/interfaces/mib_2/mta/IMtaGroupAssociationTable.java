
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtagroupassociationtable.IMtaGroupAssociationEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMtaGroupAssociationTable
    extends IDeviceEntity
{


    Map<String, IMtaGroupAssociationEntry> getMtaGroupAssociationEntry();

    IMtaGroupAssociationTable clone();

}
