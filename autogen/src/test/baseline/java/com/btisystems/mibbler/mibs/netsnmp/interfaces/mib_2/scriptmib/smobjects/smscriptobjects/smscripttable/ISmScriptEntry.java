
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smscriptobjects.smscripttable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISmScriptEntry
    extends IDeviceEntity
{


    void setSmScriptOwner(String smScriptOwner);

    String getSmScriptOwner();

    void setSmScriptName(String smScriptName);

    String getSmScriptName();

    void setSmScriptDescr(String smScriptDescr);

    String getSmScriptDescr();

    void setSmScriptLanguage(int smScriptLanguage);

    int getSmScriptLanguage();

    void setSmScriptSource(String smScriptSource);

    String getSmScriptSource();

    void setSmScriptAdminStatus(int smScriptAdminStatus);

    int getSmScriptAdminStatus();

    boolean isSmScriptAdminStatusDefined();

    void setSmScriptOperStatus(int smScriptOperStatus);

    int getSmScriptOperStatus();

    boolean isSmScriptOperStatusDefined();

    void setSmScriptStorageType(int smScriptStorageType);

    int getSmScriptStorageType();

    boolean isSmScriptStorageTypeDefined();

    void setSmScriptRowStatus(int smScriptRowStatus);

    int getSmScriptRowStatus();

    void setSmScriptError(String smScriptError);

    String getSmScriptError();

    void setSmScriptLastChange(String smScriptLastChange);

    String getSmScriptLastChange();

    ISmScriptEntry clone();

}
