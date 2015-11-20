
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qstatic.dot1qstaticunicasttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qStaticUnicastEntry
    extends IDeviceEntity
{


    void setDot1qStaticUnicastAddress(String dot1qStaticUnicastAddress);

    String getDot1qStaticUnicastAddress();

    void setDot1qStaticUnicastReceivePort(int dot1qStaticUnicastReceivePort);

    int getDot1qStaticUnicastReceivePort();

    void setDot1qStaticUnicastAllowedToGoTo(String dot1qStaticUnicastAllowedToGoTo);

    String getDot1qStaticUnicastAllowedToGoTo();

    void setDot1qStaticUnicastStatus(int dot1qStaticUnicastStatus);

    int getDot1qStaticUnicastStatus();

    boolean isDot1qStaticUnicastStatusDefined();

    IDot1qStaticUnicastEntry clone();

}
