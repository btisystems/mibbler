
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.history.historycontroltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHistoryControlEntry
    extends IDeviceEntity
{


    void setHistoryControlIndex(int historyControlIndex);

    int getHistoryControlIndex();

    void setHistoryControlDataSource(String historyControlDataSource);

    String getHistoryControlDataSource();

    void setHistoryControlBucketsRequested(int historyControlBucketsRequested);

    int getHistoryControlBucketsRequested();

    boolean isHistoryControlBucketsRequestedDefined();

    void setHistoryControlBucketsGranted(int historyControlBucketsGranted);

    int getHistoryControlBucketsGranted();

    void setHistoryControlInterval(int historyControlInterval);

    int getHistoryControlInterval();

    boolean isHistoryControlIntervalDefined();

    void setHistoryControlOwner(String historyControlOwner);

    String getHistoryControlOwner();

    void setHistoryControlStatus(int historyControlStatus);

    int getHistoryControlStatus();

    IHistoryControlEntry clone();

}
