
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects.iftesttable.IIfTestEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfTestTable
    extends IDeviceEntity
{


    Map<String, IIfTestEntry> getIfTestEntry();

    IIfTestTable clone();

}
