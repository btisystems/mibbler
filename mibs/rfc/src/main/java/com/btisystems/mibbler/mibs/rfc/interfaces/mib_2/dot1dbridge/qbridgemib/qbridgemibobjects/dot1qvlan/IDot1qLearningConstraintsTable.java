
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qlearningconstraintstable.IDot1qLearningConstraintsEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qLearningConstraintsTable
    extends IDeviceEntity
{


    Map<String, IDot1qLearningConstraintsEntry> getDot1qLearningConstraintsEntry();

    IDot1qLearningConstraintsTable clone();

}
