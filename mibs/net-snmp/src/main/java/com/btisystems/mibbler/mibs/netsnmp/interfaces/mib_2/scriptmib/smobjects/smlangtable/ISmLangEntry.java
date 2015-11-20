
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smlangtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISmLangEntry
    extends IDeviceEntity
{


    void setSmLangIndex(int smLangIndex);

    int getSmLangIndex();

    void setSmLangLanguage(String smLangLanguage);

    String getSmLangLanguage();

    void setSmLangVersion(String smLangVersion);

    String getSmLangVersion();

    void setSmLangVendor(String smLangVendor);

    String getSmLangVendor();

    void setSmLangRevision(String smLangRevision);

    String getSmLangRevision();

    void setSmLangDescr(String smLangDescr);

    String getSmLangDescr();

    ISmLangEntry clone();

}
