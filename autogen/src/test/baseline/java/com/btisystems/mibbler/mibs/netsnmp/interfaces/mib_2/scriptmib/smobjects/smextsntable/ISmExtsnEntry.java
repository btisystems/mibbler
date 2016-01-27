
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smextsntable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISmExtsnEntry
    extends IDeviceEntity
{


    void setSmExtsnIndex(int smExtsnIndex);

    int getSmExtsnIndex();

    void setSmExtsnExtension(String smExtsnExtension);

    String getSmExtsnExtension();

    void setSmExtsnVersion(String smExtsnVersion);

    String getSmExtsnVersion();

    void setSmExtsnVendor(String smExtsnVendor);

    String getSmExtsnVendor();

    void setSmExtsnRevision(String smExtsnRevision);

    String getSmExtsnRevision();

    void setSmExtsnDescr(String smExtsnDescr);

    String getSmExtsnDescr();

    ISmExtsnEntry clone();

}
