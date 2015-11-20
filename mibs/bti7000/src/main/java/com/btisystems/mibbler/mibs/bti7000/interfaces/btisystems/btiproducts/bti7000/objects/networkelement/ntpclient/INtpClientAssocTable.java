
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.networkelement.ntpclient;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.networkelement.ntpclient.ntpclientassoctable.INtpClientAssocEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INtpClientAssocTable
    extends IDeviceEntity
{


    Map<String, INtpClientAssocEntry> getNtpClientAssocEntry();

    INtpClientAssocTable clone();

}
