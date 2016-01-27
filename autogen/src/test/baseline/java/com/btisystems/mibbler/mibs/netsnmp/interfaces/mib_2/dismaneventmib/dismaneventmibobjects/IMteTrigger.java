
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteTrigger
    extends IDeviceEntity
{


    void setMteTriggerFailures(int mteTriggerFailures);

    int getMteTriggerFailures();

    IMteTrigger clone();

}
