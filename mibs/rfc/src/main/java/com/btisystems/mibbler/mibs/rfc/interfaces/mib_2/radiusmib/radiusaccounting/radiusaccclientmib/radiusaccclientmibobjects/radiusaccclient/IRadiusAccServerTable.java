
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.radiusaccclient;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.radiusaccclient.radiusaccservertable.IRadiusAccServerEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IRadiusAccServerTable
    extends IDeviceEntity
{


    Map<String, IRadiusAccServerEntry> getRadiusAccServerEntry();

    IRadiusAccServerTable clone();

}
