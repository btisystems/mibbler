
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctpassocremaddrtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpAssocRemAddrEntry
    extends IDeviceEntity
{


    void setSctpAssocRemAddrType(int sctpAssocRemAddrType);

    int getSctpAssocRemAddrType();

    void setSctpAssocRemAddr(String sctpAssocRemAddr);

    String getSctpAssocRemAddr();

    void setSctpAssocRemAddrActive(int sctpAssocRemAddrActive);

    int getSctpAssocRemAddrActive();

    void setSctpAssocRemAddrHBActive(int sctpAssocRemAddrHBActive);

    int getSctpAssocRemAddrHBActive();

    void setSctpAssocRemAddrRTO(int sctpAssocRemAddrRTO);

    int getSctpAssocRemAddrRTO();

    void setSctpAssocRemAddrMaxPathRtx(int sctpAssocRemAddrMaxPathRtx);

    int getSctpAssocRemAddrMaxPathRtx();

    boolean isSctpAssocRemAddrMaxPathRtxDefined();

    void setSctpAssocRemAddrRtx(int sctpAssocRemAddrRtx);

    int getSctpAssocRemAddrRtx();

    void setSctpAssocRemAddrStartTime(int sctpAssocRemAddrStartTime);

    int getSctpAssocRemAddrStartTime();

    ISctpAssocRemAddrEntry clone();

}
