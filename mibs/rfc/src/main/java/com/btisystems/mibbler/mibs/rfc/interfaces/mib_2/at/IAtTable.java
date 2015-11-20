
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.at;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.at.attable.IAtEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IAtTable
    extends IDeviceEntity
{


    Map<String, IAtEntry> getAtEntry();

    IAtTable clone();

}
