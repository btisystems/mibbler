
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects.ifxtable.IIfXEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIfXTable
    extends IDeviceEntity
{


    Map<String, IIfXEntry> getIfXEntry();

    IIfXTable clone();

}
