
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.application;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.application.appltable.IApplEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IApplTable
    extends IDeviceEntity
{


    Map<String, IApplEntry> getApplEntry();

    IApplTable clone();

}
