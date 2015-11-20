
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.networkelement;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INtpClient
    extends IDeviceEntity
{


    void setNtpClientPollingRate(String ntpClientPollingRate);

    String getNtpClientPollingRate();

    void setNtpClientAuthKey(int ntpClientAuthKey);

    int getNtpClientAuthKey();

    void setNtpClientSyncState(String ntpClientSyncState);

    String getNtpClientSyncState();

    void setNtpClientStratum(int ntpClientStratum);

    int getNtpClientStratum();

    void setNtpClientRefIPAddr(String ntpClientRefIPAddr);

    String getNtpClientRefIPAddr();

    void setNtpOldTimeAndDate(String ntpOldTimeAndDate);

    String getNtpOldTimeAndDate();

    void setNtpNewTimeAndDate(String ntpNewTimeAndDate);

    String getNtpNewTimeAndDate();

    void setNtpRefIP(String ntpRefIP);

    String getNtpRefIP();

    void setNtpRefStratum(int ntpRefStratum);

    int getNtpRefStratum();

    INtpClient clone();

}
