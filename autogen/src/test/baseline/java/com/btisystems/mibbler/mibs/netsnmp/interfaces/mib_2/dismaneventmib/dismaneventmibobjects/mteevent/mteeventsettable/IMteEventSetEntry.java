
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventsettable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteEventSetEntry
    extends IDeviceEntity
{


    void setMteEventSetObject(String mteEventSetObject);

    String getMteEventSetObject();

    void setMteEventSetObjectWildcard(int mteEventSetObjectWildcard);

    int getMteEventSetObjectWildcard();

    boolean isMteEventSetObjectWildcardDefined();

    void setMteEventSetValue(int mteEventSetValue);

    int getMteEventSetValue();

    boolean isMteEventSetValueDefined();

    void setMteEventSetTargetTag(String mteEventSetTargetTag);

    String getMteEventSetTargetTag();

    void setMteEventSetContextName(String mteEventSetContextName);

    String getMteEventSetContextName();

    void setMteEventSetContextNameWildcard(int mteEventSetContextNameWildcard);

    int getMteEventSetContextNameWildcard();

    boolean isMteEventSetContextNameWildcardDefined();

    IMteEventSetEntry clone();

}
