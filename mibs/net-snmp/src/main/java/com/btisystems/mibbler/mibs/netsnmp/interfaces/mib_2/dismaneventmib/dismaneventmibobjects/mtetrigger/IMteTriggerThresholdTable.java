
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerthresholdtable.IMteTriggerThresholdEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteTriggerThresholdTable
    extends IDeviceEntity
{


    Map<String, IMteTriggerThresholdEntry> getMteTriggerThresholdEntry();

    IMteTriggerThresholdTable clone();

}
