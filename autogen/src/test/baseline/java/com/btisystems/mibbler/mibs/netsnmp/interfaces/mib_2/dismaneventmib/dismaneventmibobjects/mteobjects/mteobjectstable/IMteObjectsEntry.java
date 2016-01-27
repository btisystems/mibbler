
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteobjects.mteobjectstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteObjectsEntry
    extends IDeviceEntity
{


    void setMteObjectsName(String mteObjectsName);

    String getMteObjectsName();

    void setMteObjectsIndex(int mteObjectsIndex);

    int getMteObjectsIndex();

    void setMteObjectsID(String mteObjectsID);

    String getMteObjectsID();

    void setMteObjectsIDWildcard(int mteObjectsIDWildcard);

    int getMteObjectsIDWildcard();

    boolean isMteObjectsIDWildcardDefined();

    void setMteObjectsEntryStatus(int mteObjectsEntryStatus);

    int getMteObjectsEntryStatus();

    IMteObjectsEntry clone();

}
