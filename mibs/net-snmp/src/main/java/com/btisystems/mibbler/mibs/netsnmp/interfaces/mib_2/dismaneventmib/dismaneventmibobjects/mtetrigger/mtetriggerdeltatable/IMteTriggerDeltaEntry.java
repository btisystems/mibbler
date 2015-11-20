
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerdeltatable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteTriggerDeltaEntry
    extends IDeviceEntity
{


    void setMteTriggerDeltaDiscontinuityID(String mteTriggerDeltaDiscontinuityID);

    String getMteTriggerDeltaDiscontinuityID();

    void setMteTriggerDeltaDiscontinuityIDWildcard(int mteTriggerDeltaDiscontinuityIDWildcard);

    int getMteTriggerDeltaDiscontinuityIDWildcard();

    boolean isMteTriggerDeltaDiscontinuityIDWildcardDefined();

    void setMteTriggerDeltaDiscontinuityIDType(int mteTriggerDeltaDiscontinuityIDType);

    int getMteTriggerDeltaDiscontinuityIDType();

    boolean isMteTriggerDeltaDiscontinuityIDTypeDefined();

    IMteTriggerDeltaEntry clone();

}
