
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.networkelement.ntpclient.ntpclientassoctable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INtpClientAssocEntry
    extends IDeviceEntity
{


    void setNtpClientAssocIdx(String ntpClientAssocIdx);

    String getNtpClientAssocIdx();

    void setNtpClientAssocRowStatus(int ntpClientAssocRowStatus);

    int getNtpClientAssocRowStatus();

    INtpClientAssocEntry clone();

}
