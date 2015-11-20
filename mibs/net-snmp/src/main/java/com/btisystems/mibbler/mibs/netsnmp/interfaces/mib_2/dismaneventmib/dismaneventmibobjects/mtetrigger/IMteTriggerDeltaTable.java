
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerdeltatable.IMteTriggerDeltaEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteTriggerDeltaTable
    extends IDeviceEntity
{


    Map<String, IMteTriggerDeltaEntry> getMteTriggerDeltaEntry();

    IMteTriggerDeltaTable clone();

}
