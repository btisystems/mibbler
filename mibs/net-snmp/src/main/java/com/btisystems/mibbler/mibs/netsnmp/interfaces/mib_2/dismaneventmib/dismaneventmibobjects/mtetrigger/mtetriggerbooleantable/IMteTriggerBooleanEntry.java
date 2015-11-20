
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerbooleantable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteTriggerBooleanEntry
    extends IDeviceEntity
{


    void setMteTriggerBooleanComparison(int mteTriggerBooleanComparison);

    int getMteTriggerBooleanComparison();

    boolean isMteTriggerBooleanComparisonDefined();

    void setMteTriggerBooleanValue(int mteTriggerBooleanValue);

    int getMteTriggerBooleanValue();

    boolean isMteTriggerBooleanValueDefined();

    void setMteTriggerBooleanStartup(int mteTriggerBooleanStartup);

    int getMteTriggerBooleanStartup();

    boolean isMteTriggerBooleanStartupDefined();

    void setMteTriggerBooleanObjectsOwner(String mteTriggerBooleanObjectsOwner);

    String getMteTriggerBooleanObjectsOwner();

    void setMteTriggerBooleanObjects(String mteTriggerBooleanObjects);

    String getMteTriggerBooleanObjects();

    void setMteTriggerBooleanEventOwner(String mteTriggerBooleanEventOwner);

    String getMteTriggerBooleanEventOwner();

    void setMteTriggerBooleanEvent(String mteTriggerBooleanEvent);

    String getMteTriggerBooleanEvent();

    IMteTriggerBooleanEntry clone();

}
