
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smscriptobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smscriptobjects.smcodetable.ISmCodeEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISmCodeTable
    extends IDeviceEntity
{


    Map<String, ISmCodeEntry> getSmCodeEntry();

    ISmCodeTable clone();

}
