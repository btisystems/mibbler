
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IProbeConfig
    extends IDeviceEntity
{


    void setProbeCapabilities(String probeCapabilities);

    String getProbeCapabilities();

    void setProbeSoftwareRev(String probeSoftwareRev);

    String getProbeSoftwareRev();

    void setProbeHardwareRev(String probeHardwareRev);

    String getProbeHardwareRev();

    void setProbeDateTime(String probeDateTime);

    String getProbeDateTime();

    void setProbeResetControl(int probeResetControl);

    int getProbeResetControl();

    void setProbeDownloadFile(String probeDownloadFile);

    String getProbeDownloadFile();

    void setProbeDownloadTFTPServer(String probeDownloadTFTPServer);

    String getProbeDownloadTFTPServer();

    void setProbeDownloadAction(int probeDownloadAction);

    int getProbeDownloadAction();

    void setProbeDownloadStatus(int probeDownloadStatus);

    int getProbeDownloadStatus();

    void setNetDefaultGateway(String netDefaultGateway);

    String getNetDefaultGateway();

    IProbeConfig clone();

}
