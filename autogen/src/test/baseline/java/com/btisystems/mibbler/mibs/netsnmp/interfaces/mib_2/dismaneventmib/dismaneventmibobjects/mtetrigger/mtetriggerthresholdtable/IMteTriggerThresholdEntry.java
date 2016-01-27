
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerthresholdtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteTriggerThresholdEntry
    extends IDeviceEntity
{


    void setMteTriggerThresholdStartup(int mteTriggerThresholdStartup);

    int getMteTriggerThresholdStartup();

    boolean isMteTriggerThresholdStartupDefined();

    void setMteTriggerThresholdRising(int mteTriggerThresholdRising);

    int getMteTriggerThresholdRising();

    boolean isMteTriggerThresholdRisingDefined();

    void setMteTriggerThresholdFalling(int mteTriggerThresholdFalling);

    int getMteTriggerThresholdFalling();

    boolean isMteTriggerThresholdFallingDefined();

    void setMteTriggerThresholdDeltaRising(int mteTriggerThresholdDeltaRising);

    int getMteTriggerThresholdDeltaRising();

    boolean isMteTriggerThresholdDeltaRisingDefined();

    void setMteTriggerThresholdDeltaFalling(int mteTriggerThresholdDeltaFalling);

    int getMteTriggerThresholdDeltaFalling();

    boolean isMteTriggerThresholdDeltaFallingDefined();

    void setMteTriggerThresholdObjectsOwner(String mteTriggerThresholdObjectsOwner);

    String getMteTriggerThresholdObjectsOwner();

    void setMteTriggerThresholdObjects(String mteTriggerThresholdObjects);

    String getMteTriggerThresholdObjects();

    void setMteTriggerThresholdRisingEventOwner(String mteTriggerThresholdRisingEventOwner);

    String getMteTriggerThresholdRisingEventOwner();

    void setMteTriggerThresholdRisingEvent(String mteTriggerThresholdRisingEvent);

    String getMteTriggerThresholdRisingEvent();

    void setMteTriggerThresholdFallingEventOwner(String mteTriggerThresholdFallingEventOwner);

    String getMteTriggerThresholdFallingEventOwner();

    void setMteTriggerThresholdFallingEvent(String mteTriggerThresholdFallingEvent);

    String getMteTriggerThresholdFallingEvent();

    void setMteTriggerThresholdDeltaRisingEventOwner(String mteTriggerThresholdDeltaRisingEventOwner);

    String getMteTriggerThresholdDeltaRisingEventOwner();

    void setMteTriggerThresholdDeltaRisingEvent(String mteTriggerThresholdDeltaRisingEvent);

    String getMteTriggerThresholdDeltaRisingEvent();

    void setMteTriggerThresholdDeltaFallingEventOwner(String mteTriggerThresholdDeltaFallingEventOwner);

    String getMteTriggerThresholdDeltaFallingEventOwner();

    void setMteTriggerThresholdDeltaFallingEvent(String mteTriggerThresholdDeltaFallingEvent);

    String getMteTriggerThresholdDeltaFallingEvent();

    IMteTriggerThresholdEntry clone();

}
