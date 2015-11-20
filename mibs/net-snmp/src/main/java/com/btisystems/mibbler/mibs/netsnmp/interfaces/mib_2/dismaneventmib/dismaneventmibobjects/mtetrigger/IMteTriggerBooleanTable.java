
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerbooleantable.IMteTriggerBooleanEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteTriggerBooleanTable
    extends IDeviceEntity
{


    Map<String, IMteTriggerBooleanEntry> getMteTriggerBooleanEntry();

    IMteTriggerBooleanTable clone();

}
