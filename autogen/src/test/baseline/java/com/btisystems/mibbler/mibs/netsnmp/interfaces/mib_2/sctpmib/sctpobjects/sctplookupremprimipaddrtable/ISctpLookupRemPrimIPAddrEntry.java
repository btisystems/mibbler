
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremprimipaddrtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpLookupRemPrimIPAddrEntry
    extends IDeviceEntity
{


    void setSctpLookupRemPrimIPAddrStartTime(int sctpLookupRemPrimIPAddrStartTime);

    int getSctpLookupRemPrimIPAddrStartTime();

    ISctpLookupRemPrimIPAddrEntry clone();

}
