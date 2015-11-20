
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qforwardalltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qForwardAllEntry
    extends IDeviceEntity
{


    void setDot1qForwardAllPorts(String dot1qForwardAllPorts);

    String getDot1qForwardAllPorts();

    void setDot1qForwardAllStaticPorts(String dot1qForwardAllStaticPorts);

    String getDot1qForwardAllStaticPorts();

    void setDot1qForwardAllForbiddenPorts(String dot1qForwardAllForbiddenPorts);

    String getDot1qForwardAllForbiddenPorts();

    IDot1qForwardAllEntry clone();

}
