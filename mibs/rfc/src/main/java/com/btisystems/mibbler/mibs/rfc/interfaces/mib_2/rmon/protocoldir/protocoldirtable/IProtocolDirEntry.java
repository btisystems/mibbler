
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.protocoldir.protocoldirtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IProtocolDirEntry
    extends IDeviceEntity
{


    void setProtocolDirID(String protocolDirID);

    String getProtocolDirID();

    void setProtocolDirParameters(String protocolDirParameters);

    String getProtocolDirParameters();

    void setProtocolDirLocalIndex(int protocolDirLocalIndex);

    int getProtocolDirLocalIndex();

    void setProtocolDirDescr(String protocolDirDescr);

    String getProtocolDirDescr();

    void setProtocolDirType(String protocolDirType);

    String getProtocolDirType();

    void setProtocolDirAddressMapConfig(int protocolDirAddressMapConfig);

    int getProtocolDirAddressMapConfig();

    void setProtocolDirHostConfig(int protocolDirHostConfig);

    int getProtocolDirHostConfig();

    void setProtocolDirMatrixConfig(int protocolDirMatrixConfig);

    int getProtocolDirMatrixConfig();

    void setProtocolDirOwner(String protocolDirOwner);

    String getProtocolDirOwner();

    void setProtocolDirStatus(int protocolDirStatus);

    int getProtocolDirStatus();

    IProtocolDirEntry clone();

}
