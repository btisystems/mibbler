
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.filter.filter2table;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IFilter2Entry
    extends IDeviceEntity
{


    void setFilterProtocolDirDataLocalIndex(int filterProtocolDirDataLocalIndex);

    int getFilterProtocolDirDataLocalIndex();

    boolean isFilterProtocolDirDataLocalIndexDefined();

    void setFilterProtocolDirLocalIndex(int filterProtocolDirLocalIndex);

    int getFilterProtocolDirLocalIndex();

    boolean isFilterProtocolDirLocalIndexDefined();

    IFilter2Entry clone();

}
