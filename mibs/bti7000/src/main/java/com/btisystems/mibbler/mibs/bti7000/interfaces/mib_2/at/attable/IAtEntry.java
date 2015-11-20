
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.at.attable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAtEntry
    extends IDeviceEntity
{


    void setAtIfIndex(int atIfIndex);

    int getAtIfIndex();

    void setAtPhysAddress(String atPhysAddress);

    String getAtPhysAddress();

    void setAtNetAddress(String atNetAddress);

    String getAtNetAddress();

    IAtEntry clone();

}
