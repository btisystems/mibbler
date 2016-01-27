
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggertable.IMteTriggerEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteTriggerTable
    extends IDeviceEntity
{


    Map<String, IMteTriggerEntry> getMteTriggerEntry();

    IMteTriggerTable clone();

}
