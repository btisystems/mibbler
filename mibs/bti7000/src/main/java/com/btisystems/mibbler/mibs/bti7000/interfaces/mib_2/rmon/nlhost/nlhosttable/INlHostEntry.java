
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlhost.nlhosttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlHostEntry
    extends IDeviceEntity
{


    void setNlHostTimeMark(int nlHostTimeMark);

    int getNlHostTimeMark();

    void setNlHostAddress(String nlHostAddress);

    String getNlHostAddress();

    void setNlHostInPkts(int nlHostInPkts);

    int getNlHostInPkts();

    void setNlHostOutPkts(int nlHostOutPkts);

    int getNlHostOutPkts();

    void setNlHostInOctets(int nlHostInOctets);

    int getNlHostInOctets();

    void setNlHostOutOctets(int nlHostOutOctets);

    int getNlHostOutOctets();

    void setNlHostOutMacNonUnicastPkts(int nlHostOutMacNonUnicastPkts);

    int getNlHostOutMacNonUnicastPkts();

    void setNlHostCreateTime(int nlHostCreateTime);

    int getNlHostCreateTime();

    INlHostEntry clone();

}
