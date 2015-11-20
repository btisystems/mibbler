
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteobjects.mteobjectstable.IMteObjectsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteObjectsTable
    extends IDeviceEntity
{


    Map<String, IMteObjectsEntry> getMteObjectsEntry();

    IMteObjectsTable clone();

}
