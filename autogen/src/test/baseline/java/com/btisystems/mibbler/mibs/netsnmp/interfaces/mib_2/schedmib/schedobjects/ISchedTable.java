
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.schedmib.schedobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.schedmib.schedobjects.schedtable.ISchedEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISchedTable
    extends IDeviceEntity
{


    Map<String, ISchedEntry> getSchedEntry();

    ISchedTable clone();

}
