
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.gcc0configtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IGcc0ConfigEntry
    extends IDeviceEntity
{


    void setGcc0ConfigCpTypeIdx(int gcc0ConfigCpTypeIdx);

    int getGcc0ConfigCpTypeIdx();

    void setGcc0ConfigShelfIdx(int gcc0ConfigShelfIdx);

    int getGcc0ConfigShelfIdx();

    void setGcc0ConfigSlotIdx(int gcc0ConfigSlotIdx);

    int getGcc0ConfigSlotIdx();

    void setGcc0ConfigPortIdx(int gcc0ConfigPortIdx);

    int getGcc0ConfigPortIdx();

    void setGcc0ConfigMode(int gcc0ConfigMode);

    int getGcc0ConfigMode();

    boolean isGcc0ConfigModeDefined();

    void setGcc0ConfigAdminStatus(int gcc0ConfigAdminStatus);

    int getGcc0ConfigAdminStatus();

    boolean isGcc0ConfigAdminStatusDefined();

    void setGcc0ConfigOperStatus(int gcc0ConfigOperStatus);

    int getGcc0ConfigOperStatus();

    void setGcc0ConfigOperStatQlfr(String gcc0ConfigOperStatQlfr);

    String getGcc0ConfigOperStatQlfr();

    void setGcc0ConfigRowStatus(int gcc0ConfigRowStatus);

    int getGcc0ConfigRowStatus();

    IGcc0ConfigEntry clone();

}
