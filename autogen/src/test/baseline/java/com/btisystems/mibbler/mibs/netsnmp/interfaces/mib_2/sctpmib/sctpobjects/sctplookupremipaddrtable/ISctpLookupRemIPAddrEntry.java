
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremipaddrtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpLookupRemIPAddrEntry
    extends IDeviceEntity
{


    void setSctpLookupRemIPAddrStartTime(int sctpLookupRemIPAddrStartTime);

    int getSctpLookupRemIPAddrStartTime();

    ISctpLookupRemIPAddrEntry clone();

}
