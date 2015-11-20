
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smlangtable.ISmLangEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISmLangTable
    extends IDeviceEntity
{


    Map<String, ISmLangEntry> getSmLangEntry();

    ISmLangTable clone();

}
