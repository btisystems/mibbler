
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerexistencetable.IMteTriggerExistenceEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteTriggerExistenceTable
    extends IDeviceEntity
{


    Map<String, IMteTriggerExistenceEntry> getMteTriggerExistenceEntry();

    IMteTriggerExistenceTable clone();

}
