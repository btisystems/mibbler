
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerexistencetable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteTriggerExistenceEntry
    extends IDeviceEntity
{


    void setMteTriggerExistenceTest(String mteTriggerExistenceTest);

    String getMteTriggerExistenceTest();

    void setMteTriggerExistenceStartup(String mteTriggerExistenceStartup);

    String getMteTriggerExistenceStartup();

    void setMteTriggerExistenceObjectsOwner(String mteTriggerExistenceObjectsOwner);

    String getMteTriggerExistenceObjectsOwner();

    void setMteTriggerExistenceObjects(String mteTriggerExistenceObjects);

    String getMteTriggerExistenceObjects();

    void setMteTriggerExistenceEventOwner(String mteTriggerExistenceEventOwner);

    String getMteTriggerExistenceEventOwner();

    void setMteTriggerExistenceEvent(String mteTriggerExistenceEvent);

    String getMteTriggerExistenceEvent();

    IMteTriggerExistenceEntry clone();

}
