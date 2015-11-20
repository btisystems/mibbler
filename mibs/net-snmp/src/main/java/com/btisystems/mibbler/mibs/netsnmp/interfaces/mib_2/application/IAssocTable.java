
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.application;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.application.assoctable.IAssocEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAssocTable
    extends IDeviceEntity
{


    Map<String, IAssocEntry> getAssocEntry();

    IAssocTable clone();

}
