
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctplookuplocalporttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpLookupLocalPortEntry
    extends IDeviceEntity
{


    void setSctpLookupLocalPortStartTime(int sctpLookupLocalPortStartTime);

    int getSctpLookupLocalPortStartTime();

    ISctpLookupLocalPortEntry clone();

}
