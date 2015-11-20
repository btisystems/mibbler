
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggertable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteTriggerEntry
    extends IDeviceEntity
{


    void setMteOwner(String mteOwner);

    String getMteOwner();

    void setMteTriggerName(String mteTriggerName);

    String getMteTriggerName();

    void setMteTriggerComment(String mteTriggerComment);

    String getMteTriggerComment();

    void setMteTriggerTest(String mteTriggerTest);

    String getMteTriggerTest();

    void setMteTriggerSampleType(int mteTriggerSampleType);

    int getMteTriggerSampleType();

    boolean isMteTriggerSampleTypeDefined();

    void setMteTriggerValueID(String mteTriggerValueID);

    String getMteTriggerValueID();

    void setMteTriggerValueIDWildcard(int mteTriggerValueIDWildcard);

    int getMteTriggerValueIDWildcard();

    boolean isMteTriggerValueIDWildcardDefined();

    void setMteTriggerTargetTag(String mteTriggerTargetTag);

    String getMteTriggerTargetTag();

    void setMteTriggerContextName(String mteTriggerContextName);

    String getMteTriggerContextName();

    void setMteTriggerContextNameWildcard(int mteTriggerContextNameWildcard);

    int getMteTriggerContextNameWildcard();

    boolean isMteTriggerContextNameWildcardDefined();

    void setMteTriggerFrequency(int mteTriggerFrequency);

    int getMteTriggerFrequency();

    boolean isMteTriggerFrequencyDefined();

    void setMteTriggerObjectsOwner(String mteTriggerObjectsOwner);

    String getMteTriggerObjectsOwner();

    void setMteTriggerObjects(String mteTriggerObjects);

    String getMteTriggerObjects();

    void setMteTriggerEnabled(int mteTriggerEnabled);

    int getMteTriggerEnabled();

    boolean isMteTriggerEnabledDefined();

    void setMteTriggerEntryStatus(int mteTriggerEntryStatus);

    int getMteTriggerEntryStatus();

    IMteTriggerEntry clone();

}
