
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.protocoldist.protocoldistcontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IProtocolDistControlEntry
    extends IDeviceEntity
{


    void setProtocolDistControlIndex(int protocolDistControlIndex);

    int getProtocolDistControlIndex();

    void setProtocolDistControlDataSource(String protocolDistControlDataSource);

    String getProtocolDistControlDataSource();

    void setProtocolDistControlDroppedFrames(int protocolDistControlDroppedFrames);

    int getProtocolDistControlDroppedFrames();

    void setProtocolDistControlCreateTime(int protocolDistControlCreateTime);

    int getProtocolDistControlCreateTime();

    void setProtocolDistControlOwner(String protocolDistControlOwner);

    String getProtocolDistControlOwner();

    void setProtocolDistControlStatus(int protocolDistControlStatus);

    int getProtocolDistControlStatus();

    IProtocolDistControlEntry clone();

}
