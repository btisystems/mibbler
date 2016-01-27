
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.nlmlogvariabletable.INlmLogVariableEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlmLogVariableTable
    extends IDeviceEntity
{


    Map<String, INlmLogVariableEntry> getNlmLogVariableEntry();

    INlmLogVariableTable clone();

}
