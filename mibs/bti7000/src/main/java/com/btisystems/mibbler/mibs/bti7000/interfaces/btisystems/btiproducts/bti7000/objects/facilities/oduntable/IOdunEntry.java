
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.oduntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOdunEntry
    extends IDeviceEntity
{


    void setOdunTypeIdx(int odunTypeIdx);

    int getOdunTypeIdx();

    void setOdunShelfIdx(int odunShelfIdx);

    int getOdunShelfIdx();

    void setOdunSlotIdx(int odunSlotIdx);

    int getOdunSlotIdx();

    void setOdunPortIdx(int odunPortIdx);

    int getOdunPortIdx();

    void setOdunIdx(int odunIdx);

    int getOdunIdx();

    IOdunEntry clone();

}
