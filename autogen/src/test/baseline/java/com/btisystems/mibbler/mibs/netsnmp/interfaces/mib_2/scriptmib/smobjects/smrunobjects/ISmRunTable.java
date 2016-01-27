
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smrunobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smrunobjects.smruntable.ISmRunEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISmRunTable
    extends IDeviceEntity
{


    Map<String, ISmRunEntry> getSmRunEntry();

    ISmRunTable clone();

}
