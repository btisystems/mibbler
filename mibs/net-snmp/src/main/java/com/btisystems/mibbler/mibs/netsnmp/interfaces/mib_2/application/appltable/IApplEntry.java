
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.application.appltable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IApplEntry
    extends IDeviceEntity
{


    void setApplIndex(int applIndex);

    int getApplIndex();

    void setApplName(String applName);

    String getApplName();

    void setApplDirectoryName(String applDirectoryName);

    String getApplDirectoryName();

    void setApplVersion(String applVersion);

    String getApplVersion();

    void setApplUptime(int applUptime);

    int getApplUptime();

    void setApplOperStatus(int applOperStatus);

    int getApplOperStatus();

    void setApplLastChange(int applLastChange);

    int getApplLastChange();

    void setApplInboundAssociations(int applInboundAssociations);

    int getApplInboundAssociations();

    void setApplOutboundAssociations(int applOutboundAssociations);

    int getApplOutboundAssociations();

    void setApplAccumulatedInboundAssociations(int applAccumulatedInboundAssociations);

    int getApplAccumulatedInboundAssociations();

    void setApplAccumulatedOutboundAssociations(int applAccumulatedOutboundAssociations);

    int getApplAccumulatedOutboundAssociations();

    void setApplLastInboundActivity(int applLastInboundActivity);

    int getApplLastInboundActivity();

    void setApplLastOutboundActivity(int applLastOutboundActivity);

    int getApplLastOutboundActivity();

    void setApplRejectedInboundAssociations(int applRejectedInboundAssociations);

    int getApplRejectedInboundAssociations();

    void setApplFailedOutboundAssociations(int applFailedOutboundAssociations);

    int getApplFailedOutboundAssociations();

    void setApplDescription(String applDescription);

    String getApplDescription();

    void setApplURL(String applURL);

    String getApplURL();

    IApplEntry clone();

}
