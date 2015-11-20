
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctpassoclocaladdrtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpAssocLocalAddrEntry
    extends IDeviceEntity
{


    void setSctpAssocLocalAddrType(int sctpAssocLocalAddrType);

    int getSctpAssocLocalAddrType();

    void setSctpAssocLocalAddr(String sctpAssocLocalAddr);

    String getSctpAssocLocalAddr();

    void setSctpAssocLocalAddrStartTime(int sctpAssocLocalAddrStartTime);

    int getSctpAssocLocalAddrStartTime();

    ISctpAssocLocalAddrEntry clone();

}
