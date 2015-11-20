
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smscriptobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smscriptobjects.smscripttable.ISmScriptEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISmScriptTable
    extends IDeviceEntity
{


    Map<String, ISmScriptEntry> getSmScriptEntry();

    ISmScriptTable clone();

}
