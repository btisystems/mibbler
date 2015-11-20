
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.filter.filtertable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IFilterEntry
    extends IDeviceEntity
{


    void setFilterIndex(int filterIndex);

    int getFilterIndex();

    void setFilterChannelIndex(int filterChannelIndex);

    int getFilterChannelIndex();

    void setFilterPktDataOffset(int filterPktDataOffset);

    int getFilterPktDataOffset();

    boolean isFilterPktDataOffsetDefined();

    void setFilterPktData(String filterPktData);

    String getFilterPktData();

    void setFilterPktDataMask(String filterPktDataMask);

    String getFilterPktDataMask();

    void setFilterPktDataNotMask(String filterPktDataNotMask);

    String getFilterPktDataNotMask();

    void setFilterPktStatus(int filterPktStatus);

    int getFilterPktStatus();

    void setFilterPktStatusMask(int filterPktStatusMask);

    int getFilterPktStatusMask();

    void setFilterPktStatusNotMask(int filterPktStatusNotMask);

    int getFilterPktStatusNotMask();

    void setFilterOwner(String filterOwner);

    String getFilterOwner();

    void setFilterStatus(int filterStatus);

    int getFilterStatus();

    IFilterEntry clone();

}
