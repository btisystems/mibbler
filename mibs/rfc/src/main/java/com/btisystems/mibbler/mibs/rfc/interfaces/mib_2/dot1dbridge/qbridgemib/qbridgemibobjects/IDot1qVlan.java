
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qVlan
    extends IDeviceEntity
{


    void setDot1qVlanNumDeletes(int dot1qVlanNumDeletes);

    int getDot1qVlanNumDeletes();

    void setDot1qNextFreeLocalVlanIndex(int dot1qNextFreeLocalVlanIndex);

    int getDot1qNextFreeLocalVlanIndex();

    void setDot1qConstraintSetDefault(int dot1qConstraintSetDefault);

    int getDot1qConstraintSetDefault();

    void setDot1qConstraintTypeDefault(int dot1qConstraintTypeDefault);

    int getDot1qConstraintTypeDefault();

    IDot1qVlan clone();

}
