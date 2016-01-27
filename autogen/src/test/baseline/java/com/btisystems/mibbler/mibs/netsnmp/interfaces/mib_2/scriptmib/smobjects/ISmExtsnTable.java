
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smextsntable.ISmExtsnEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISmExtsnTable
    extends IDeviceEntity
{


    Map<String, ISmExtsnEntry> getSmExtsnEntry();

    ISmExtsnTable clone();

}
