
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qlearningconstraintstable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qLearningConstraintsEntry
    extends IDeviceEntity
{


    void setDot1qConstraintVlan(int dot1qConstraintVlan);

    int getDot1qConstraintVlan();

    void setDot1qConstraintSet(int dot1qConstraintSet);

    int getDot1qConstraintSet();

    void setDot1qConstraintType(int dot1qConstraintType);

    int getDot1qConstraintType();

    void setDot1qConstraintStatus(int dot1qConstraintStatus);

    int getDot1qConstraintStatus();

    IDot1qLearningConstraintsEntry clone();

}
