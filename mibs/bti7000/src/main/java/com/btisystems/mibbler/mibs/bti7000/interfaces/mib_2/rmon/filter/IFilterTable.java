
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.filter;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.filter.filtertable.IFilterEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IFilterTable
    extends IDeviceEntity
{


    Map<String, IFilterEntry> getFilterEntry();

    IFilterTable clone();

}
