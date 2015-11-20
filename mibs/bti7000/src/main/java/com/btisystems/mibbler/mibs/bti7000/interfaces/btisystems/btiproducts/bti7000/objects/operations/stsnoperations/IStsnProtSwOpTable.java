
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stsnoperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.stsnoperations.stsnprotswoptable.IStsnProtSwOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IStsnProtSwOpTable
    extends IDeviceEntity
{


    Map<String, IStsnProtSwOpEntry> getStsnProtSwOpEntry();

    IStsnProtSwOpTable clone();

}
