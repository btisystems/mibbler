
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.filter;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.filter.filter2table.IFilter2Entry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IFilter2Table
    extends IDeviceEntity
{


    Map<String, IFilter2Entry> getFilter2Entry();

    IFilter2Table clone();

}
