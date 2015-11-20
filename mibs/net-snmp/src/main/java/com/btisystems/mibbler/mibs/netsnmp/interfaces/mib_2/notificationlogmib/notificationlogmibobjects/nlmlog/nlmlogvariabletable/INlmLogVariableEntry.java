
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.nlmlogvariabletable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface INlmLogVariableEntry
    extends IDeviceEntity
{


    void setNlmLogVariableIndex(int nlmLogVariableIndex);

    int getNlmLogVariableIndex();

    void setNlmLogVariableID(String nlmLogVariableID);

    String getNlmLogVariableID();

    void setNlmLogVariableValueType(int nlmLogVariableValueType);

    int getNlmLogVariableValueType();

    void setNlmLogVariableCounter32Val(int nlmLogVariableCounter32Val);

    int getNlmLogVariableCounter32Val();

    void setNlmLogVariableUnsigned32Val(int nlmLogVariableUnsigned32Val);

    int getNlmLogVariableUnsigned32Val();

    void setNlmLogVariableTimeTicksVal(int nlmLogVariableTimeTicksVal);

    int getNlmLogVariableTimeTicksVal();

    void setNlmLogVariableInteger32Val(int nlmLogVariableInteger32Val);

    int getNlmLogVariableInteger32Val();

    void setNlmLogVariableOctetStringVal(String nlmLogVariableOctetStringVal);

    String getNlmLogVariableOctetStringVal();

    void setNlmLogVariableIpAddressVal(String nlmLogVariableIpAddressVal);

    String getNlmLogVariableIpAddressVal();

    void setNlmLogVariableOidVal(String nlmLogVariableOidVal);

    String getNlmLogVariableOidVal();

    void setNlmLogVariableCounter64Val(long nlmLogVariableCounter64Val);

    long getNlmLogVariableCounter64Val();

    void setNlmLogVariableOpaqueVal(String nlmLogVariableOpaqueVal);

    String getNlmLogVariableOpaqueVal();

    INlmLogVariableEntry clone();

}
