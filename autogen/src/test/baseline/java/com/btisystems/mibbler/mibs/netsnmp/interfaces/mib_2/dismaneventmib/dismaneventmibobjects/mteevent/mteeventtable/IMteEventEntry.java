
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteEventEntry
    extends IDeviceEntity
{


    void setMteEventName(String mteEventName);

    String getMteEventName();

    void setMteEventComment(String mteEventComment);

    String getMteEventComment();

    void setMteEventActions(String mteEventActions);

    String getMteEventActions();

    void setMteEventEnabled(int mteEventEnabled);

    int getMteEventEnabled();

    boolean isMteEventEnabledDefined();

    void setMteEventEntryStatus(int mteEventEntryStatus);

    int getMteEventEntryStatus();

    IMteEventEntry clone();

}
