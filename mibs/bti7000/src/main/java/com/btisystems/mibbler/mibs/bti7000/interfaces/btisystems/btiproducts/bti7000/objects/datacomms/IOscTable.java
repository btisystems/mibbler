
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.osctable.IOscEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IOscTable
    extends IDeviceEntity
{


    Map<String, IOscEntry> getOscEntry();

    IOscTable clone();

}
