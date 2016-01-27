
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventtable.IMteEventEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteEventTable
    extends IDeviceEntity
{


    Map<String, IMteEventEntry> getMteEventEntry();

    IMteEventTable clone();

}
