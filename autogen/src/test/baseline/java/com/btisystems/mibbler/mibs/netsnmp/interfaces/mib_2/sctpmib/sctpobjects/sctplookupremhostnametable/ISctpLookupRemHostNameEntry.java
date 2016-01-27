
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremhostnametable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpLookupRemHostNameEntry
    extends IDeviceEntity
{


    void setSctpLookupRemHostNameStartTime(int sctpLookupRemHostNameStartTime);

    int getSctpLookupRemHostNameStartTime();

    ISctpLookupRemHostNameEntry clone();

}
