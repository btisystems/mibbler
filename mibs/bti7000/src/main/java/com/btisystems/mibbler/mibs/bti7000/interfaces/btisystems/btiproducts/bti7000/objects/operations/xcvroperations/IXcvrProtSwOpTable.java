
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.xcvroperations;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.xcvroperations.xcvrprotswoptable.IXcvrProtSwOpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IXcvrProtSwOpTable
    extends IDeviceEntity
{


    Map<String, IXcvrProtSwOpEntry> getXcvrProtSwOpEntry();

    IXcvrProtSwOpTable clone();

}
