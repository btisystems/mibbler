
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtagrouperrortable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMtaGroupErrorEntry
    extends IDeviceEntity
{


    void setMtaGroupInboundErrorCount(int mtaGroupInboundErrorCount);

    int getMtaGroupInboundErrorCount();

    void setMtaGroupInternalErrorCount(int mtaGroupInternalErrorCount);

    int getMtaGroupInternalErrorCount();

    void setMtaGroupOutboundErrorCount(int mtaGroupOutboundErrorCount);

    int getMtaGroupOutboundErrorCount();

    void setMtaStatusCode(int mtaStatusCode);

    int getMtaStatusCode();

    IMtaGroupErrorEntry clone();

}
