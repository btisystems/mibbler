
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.alhost.alhosttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAlHostEntry
    extends IDeviceEntity
{


    void setAlHostTimeMark(int alHostTimeMark);

    int getAlHostTimeMark();

    void setAlHostInPkts(int alHostInPkts);

    int getAlHostInPkts();

    void setAlHostOutPkts(int alHostOutPkts);

    int getAlHostOutPkts();

    void setAlHostInOctets(int alHostInOctets);

    int getAlHostInOctets();

    void setAlHostOutOctets(int alHostOutOctets);

    int getAlHostOutOctets();

    void setAlHostCreateTime(int alHostCreateTime);

    int getAlHostCreateTime();

    IAlHostEntry clone();

}
