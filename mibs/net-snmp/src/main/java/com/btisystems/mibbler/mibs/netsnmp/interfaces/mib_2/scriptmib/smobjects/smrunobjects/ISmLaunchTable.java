
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smrunobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smrunobjects.smlaunchtable.ISmLaunchEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISmLaunchTable
    extends IDeviceEntity
{


    Map<String, ISmLaunchEntry> getSmLaunchEntry();

    ISmLaunchTable clone();

}
