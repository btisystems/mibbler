
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dextbase.dot1dportcapabilitiestable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1dPortCapabilitiesEntry
    extends IDeviceEntity
{


    void setDot1dPortCapabilities(String dot1dPortCapabilities);

    String getDot1dPortCapabilities();

    IDot1dPortCapabilitiesEntry clone();

}
