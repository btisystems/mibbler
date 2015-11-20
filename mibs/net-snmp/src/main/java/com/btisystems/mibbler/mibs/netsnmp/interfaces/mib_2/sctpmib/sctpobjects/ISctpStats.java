
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpStats
    extends IDeviceEntity
{


    void setSctpCurrEstab(int sctpCurrEstab);

    int getSctpCurrEstab();

    void setSctpActiveEstabs(int sctpActiveEstabs);

    int getSctpActiveEstabs();

    void setSctpPassiveEstabs(int sctpPassiveEstabs);

    int getSctpPassiveEstabs();

    void setSctpAborteds(int sctpAborteds);

    int getSctpAborteds();

    void setSctpShutdowns(int sctpShutdowns);

    int getSctpShutdowns();

    void setSctpOutOfBlues(int sctpOutOfBlues);

    int getSctpOutOfBlues();

    void setSctpChecksumErrors(int sctpChecksumErrors);

    int getSctpChecksumErrors();

    void setSctpOutCtrlChunks(long sctpOutCtrlChunks);

    long getSctpOutCtrlChunks();

    void setSctpOutOrderChunks(long sctpOutOrderChunks);

    long getSctpOutOrderChunks();

    void setSctpOutUnorderChunks(long sctpOutUnorderChunks);

    long getSctpOutUnorderChunks();

    void setSctpInCtrlChunks(long sctpInCtrlChunks);

    long getSctpInCtrlChunks();

    void setSctpInOrderChunks(long sctpInOrderChunks);

    long getSctpInOrderChunks();

    void setSctpInUnorderChunks(long sctpInUnorderChunks);

    long getSctpInUnorderChunks();

    void setSctpFragUsrMsgs(long sctpFragUsrMsgs);

    long getSctpFragUsrMsgs();

    void setSctpReasmUsrMsgs(long sctpReasmUsrMsgs);

    long getSctpReasmUsrMsgs();

    void setSctpOutSCTPPacks(long sctpOutSCTPPacks);

    long getSctpOutSCTPPacks();

    void setSctpInSCTPPacks(long sctpInSCTPPacks);

    long getSctpInSCTPPacks();

    void setSctpDiscontinuityTime(int sctpDiscontinuityTime);

    int getSctpDiscontinuityTime();

    ISctpStats clone();

}
