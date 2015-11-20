
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.egp;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.egp.egpneightable.IEgpNeighEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IEgpNeighTable
    extends IDeviceEntity
{


    Map<String, IEgpNeighEntry> getEgpNeighEntry();

    IEgpNeighTable clone();

}
