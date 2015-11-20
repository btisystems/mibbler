
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INetworkElement
    extends IDeviceEntity
{


    void setNeSWVersion(String neSWVersion);

    String getNeSWVersion();

    void setNeNum(int neNum);

    int getNeNum();

    void setNeSiteNum(int neSiteNum);

    int getNeSiteNum();

    void setNeDateAndTime(String neDateAndTime);

    String getNeDateAndTime();

    void setNeTimeZone(int neTimeZone);

    int getNeTimeZone();

    void setNeAutoDST(int neAutoDST);

    int getNeAutoDST();

    void setNeGateway(String neGateway);

    String getNeGateway();

    void setNeSecGateway(String neSecGateway);

    String getNeSecGateway();

    void setNeActiveGateway(String neActiveGateway);

    String getNeActiveGateway();

    void setNeAutoProv(int neAutoProv);

    int getNeAutoProv();

    void setNeAutoDeProv(String neAutoDeProv);

    String getNeAutoDeProv();

    void setNeAutoEnabledTimer(String neAutoEnabledTimer);

    String getNeAutoEnabledTimer();

    void setNeFPDetect(int neFPDetect);

    int getNeFPDetect();

    void setNeHTAutoShutdown(int neHTAutoShutdown);

    int getNeHTAutoShutdown();

    INetworkElement clone();

}
