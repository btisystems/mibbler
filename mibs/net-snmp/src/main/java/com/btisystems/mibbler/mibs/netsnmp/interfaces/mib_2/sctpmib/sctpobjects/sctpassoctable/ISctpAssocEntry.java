
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctpassoctable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpAssocEntry
    extends IDeviceEntity
{


    void setSctpAssocId(int sctpAssocId);

    int getSctpAssocId();

    void setSctpAssocRemHostName(String sctpAssocRemHostName);

    String getSctpAssocRemHostName();

    void setSctpAssocLocalPort(int sctpAssocLocalPort);

    int getSctpAssocLocalPort();

    void setSctpAssocRemPort(int sctpAssocRemPort);

    int getSctpAssocRemPort();

    void setSctpAssocRemPrimAddrType(int sctpAssocRemPrimAddrType);

    int getSctpAssocRemPrimAddrType();

    void setSctpAssocRemPrimAddr(String sctpAssocRemPrimAddr);

    String getSctpAssocRemPrimAddr();

    void setSctpAssocHeartBeatInterval(int sctpAssocHeartBeatInterval);

    int getSctpAssocHeartBeatInterval();

    boolean isSctpAssocHeartBeatIntervalDefined();

    void setSctpAssocState(int sctpAssocState);

    int getSctpAssocState();

    void setSctpAssocInStreams(int sctpAssocInStreams);

    int getSctpAssocInStreams();

    void setSctpAssocOutStreams(int sctpAssocOutStreams);

    int getSctpAssocOutStreams();

    void setSctpAssocMaxRetr(int sctpAssocMaxRetr);

    int getSctpAssocMaxRetr();

    boolean isSctpAssocMaxRetrDefined();

    void setSctpAssocPrimProcess(int sctpAssocPrimProcess);

    int getSctpAssocPrimProcess();

    void setSctpAssocT1expireds(int sctpAssocT1expireds);

    int getSctpAssocT1expireds();

    void setSctpAssocT2expireds(int sctpAssocT2expireds);

    int getSctpAssocT2expireds();

    void setSctpAssocRtxChunks(int sctpAssocRtxChunks);

    int getSctpAssocRtxChunks();

    void setSctpAssocStartTime(int sctpAssocStartTime);

    int getSctpAssocStartTime();

    void setSctpAssocDiscontinuityTime(int sctpAssocDiscontinuityTime);

    int getSctpAssocDiscontinuityTime();

    ISctpAssocEntry clone();

}
