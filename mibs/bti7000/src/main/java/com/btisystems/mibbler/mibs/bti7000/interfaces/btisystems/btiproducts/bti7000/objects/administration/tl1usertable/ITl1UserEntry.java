
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.administration.tl1usertable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITl1UserEntry
    extends IDeviceEntity
{


    void setTl1UserIdx(String tl1UserIdx);

    String getTl1UserIdx();

    ITl1UserEntry clone();

}
