
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISctpParams
    extends IDeviceEntity
{


    void setSctpRtoAlgorithm(int sctpRtoAlgorithm);

    int getSctpRtoAlgorithm();

    boolean isSctpRtoAlgorithmDefined();

    void setSctpRtoMin(int sctpRtoMin);

    int getSctpRtoMin();

    boolean isSctpRtoMinDefined();

    void setSctpRtoMax(int sctpRtoMax);

    int getSctpRtoMax();

    boolean isSctpRtoMaxDefined();

    void setSctpRtoInitial(int sctpRtoInitial);

    int getSctpRtoInitial();

    boolean isSctpRtoInitialDefined();

    void setSctpMaxAssocs(int sctpMaxAssocs);

    int getSctpMaxAssocs();

    void setSctpValCookieLife(int sctpValCookieLife);

    int getSctpValCookieLife();

    boolean isSctpValCookieLifeDefined();

    void setSctpMaxInitRetr(int sctpMaxInitRetr);

    int getSctpMaxInitRetr();

    boolean isSctpMaxInitRetrDefined();

    ISctpParams clone();

}
