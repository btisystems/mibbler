
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventsettable.IMteEventSetEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteEventSetTable
    extends IDeviceEntity
{


    Map<String, IMteEventSetEntry> getMteEventSetEntry();

    IMteEventSetTable clone();

}
