
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookupremporttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpLookupRemPortEntry
    extends IDeviceEntity
{


    void setSctpLookupRemPortStartTime(int sctpLookupRemPortStartTime);

    int getSctpLookupRemPortStartTime();

    ISctpLookupRemPortEntry clone();

}
