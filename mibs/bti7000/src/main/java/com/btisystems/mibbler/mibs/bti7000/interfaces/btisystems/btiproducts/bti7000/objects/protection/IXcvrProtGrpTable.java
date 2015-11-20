
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.xcvrprotgrptable.IXcvrProtGrpEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IXcvrProtGrpTable
    extends IDeviceEntity
{


    Map<String, IXcvrProtGrpEntry> getXcvrProtGrpEntry();

    IXcvrProtGrpTable clone();

}
