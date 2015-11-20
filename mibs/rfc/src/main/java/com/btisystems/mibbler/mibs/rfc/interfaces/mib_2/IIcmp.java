
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIcmp
    extends IDeviceEntity
{


    void setIcmpInMsgs(int icmpInMsgs);

    int getIcmpInMsgs();

    void setIcmpInErrors(int icmpInErrors);

    int getIcmpInErrors();

    void setIcmpInDestUnreachs(int icmpInDestUnreachs);

    int getIcmpInDestUnreachs();

    void setIcmpInTimeExcds(int icmpInTimeExcds);

    int getIcmpInTimeExcds();

    void setIcmpInParmProbs(int icmpInParmProbs);

    int getIcmpInParmProbs();

    void setIcmpInSrcQuenchs(int icmpInSrcQuenchs);

    int getIcmpInSrcQuenchs();

    void setIcmpInRedirects(int icmpInRedirects);

    int getIcmpInRedirects();

    void setIcmpInEchos(int icmpInEchos);

    int getIcmpInEchos();

    void setIcmpInEchoReps(int icmpInEchoReps);

    int getIcmpInEchoReps();

    void setIcmpInTimestamps(int icmpInTimestamps);

    int getIcmpInTimestamps();

    void setIcmpInTimestampReps(int icmpInTimestampReps);

    int getIcmpInTimestampReps();

    void setIcmpInAddrMasks(int icmpInAddrMasks);

    int getIcmpInAddrMasks();

    void setIcmpInAddrMaskReps(int icmpInAddrMaskReps);

    int getIcmpInAddrMaskReps();

    void setIcmpOutMsgs(int icmpOutMsgs);

    int getIcmpOutMsgs();

    void setIcmpOutErrors(int icmpOutErrors);

    int getIcmpOutErrors();

    void setIcmpOutDestUnreachs(int icmpOutDestUnreachs);

    int getIcmpOutDestUnreachs();

    void setIcmpOutTimeExcds(int icmpOutTimeExcds);

    int getIcmpOutTimeExcds();

    void setIcmpOutParmProbs(int icmpOutParmProbs);

    int getIcmpOutParmProbs();

    void setIcmpOutSrcQuenchs(int icmpOutSrcQuenchs);

    int getIcmpOutSrcQuenchs();

    void setIcmpOutRedirects(int icmpOutRedirects);

    int getIcmpOutRedirects();

    void setIcmpOutEchos(int icmpOutEchos);

    int getIcmpOutEchos();

    void setIcmpOutEchoReps(int icmpOutEchoReps);

    int getIcmpOutEchoReps();

    void setIcmpOutTimestamps(int icmpOutTimestamps);

    int getIcmpOutTimestamps();

    void setIcmpOutTimestampReps(int icmpOutTimestampReps);

    int getIcmpOutTimestampReps();

    void setIcmpOutAddrMasks(int icmpOutAddrMasks);

    int getIcmpOutAddrMasks();

    void setIcmpOutAddrMaskReps(int icmpOutAddrMaskReps);

    int getIcmpOutAddrMaskReps();

    IIcmp clone();

}
