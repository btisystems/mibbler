
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtagrouptable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMtaGroupEntry
    extends IDeviceEntity
{


    void setMtaGroupIndex(int mtaGroupIndex);

    int getMtaGroupIndex();

    void setMtaGroupReceivedMessages(int mtaGroupReceivedMessages);

    int getMtaGroupReceivedMessages();

    void setMtaGroupRejectedMessages(int mtaGroupRejectedMessages);

    int getMtaGroupRejectedMessages();

    void setMtaGroupStoredMessages(int mtaGroupStoredMessages);

    int getMtaGroupStoredMessages();

    void setMtaGroupTransmittedMessages(int mtaGroupTransmittedMessages);

    int getMtaGroupTransmittedMessages();

    void setMtaGroupReceivedVolume(int mtaGroupReceivedVolume);

    int getMtaGroupReceivedVolume();

    void setMtaGroupStoredVolume(int mtaGroupStoredVolume);

    int getMtaGroupStoredVolume();

    void setMtaGroupTransmittedVolume(int mtaGroupTransmittedVolume);

    int getMtaGroupTransmittedVolume();

    void setMtaGroupReceivedRecipients(int mtaGroupReceivedRecipients);

    int getMtaGroupReceivedRecipients();

    void setMtaGroupStoredRecipients(int mtaGroupStoredRecipients);

    int getMtaGroupStoredRecipients();

    void setMtaGroupTransmittedRecipients(int mtaGroupTransmittedRecipients);

    int getMtaGroupTransmittedRecipients();

    void setMtaGroupOldestMessageStored(int mtaGroupOldestMessageStored);

    int getMtaGroupOldestMessageStored();

    void setMtaGroupInboundAssociations(int mtaGroupInboundAssociations);

    int getMtaGroupInboundAssociations();

    void setMtaGroupOutboundAssociations(int mtaGroupOutboundAssociations);

    int getMtaGroupOutboundAssociations();

    void setMtaGroupAccumulatedInboundAssociations(int mtaGroupAccumulatedInboundAssociations);

    int getMtaGroupAccumulatedInboundAssociations();

    void setMtaGroupAccumulatedOutboundAssociations(int mtaGroupAccumulatedOutboundAssociations);

    int getMtaGroupAccumulatedOutboundAssociations();

    void setMtaGroupLastInboundActivity(int mtaGroupLastInboundActivity);

    int getMtaGroupLastInboundActivity();

    void setMtaGroupLastOutboundActivity(int mtaGroupLastOutboundActivity);

    int getMtaGroupLastOutboundActivity();

    void setMtaGroupRejectedInboundAssociations(int mtaGroupRejectedInboundAssociations);

    int getMtaGroupRejectedInboundAssociations();

    void setMtaGroupFailedOutboundAssociations(int mtaGroupFailedOutboundAssociations);

    int getMtaGroupFailedOutboundAssociations();

    void setMtaGroupInboundRejectionReason(String mtaGroupInboundRejectionReason);

    String getMtaGroupInboundRejectionReason();

    void setMtaGroupOutboundConnectFailureReason(String mtaGroupOutboundConnectFailureReason);

    String getMtaGroupOutboundConnectFailureReason();

    void setMtaGroupScheduledRetry(int mtaGroupScheduledRetry);

    int getMtaGroupScheduledRetry();

    void setMtaGroupMailProtocol(String mtaGroupMailProtocol);

    String getMtaGroupMailProtocol();

    void setMtaGroupName(String mtaGroupName);

    String getMtaGroupName();

    void setMtaGroupSuccessfulConvertedMessages(int mtaGroupSuccessfulConvertedMessages);

    int getMtaGroupSuccessfulConvertedMessages();

    void setMtaGroupFailedConvertedMessages(int mtaGroupFailedConvertedMessages);

    int getMtaGroupFailedConvertedMessages();

    void setMtaGroupDescription(String mtaGroupDescription);

    String getMtaGroupDescription();

    void setMtaGroupURL(String mtaGroupURL);

    String getMtaGroupURL();

    void setMtaGroupCreationTime(int mtaGroupCreationTime);

    int getMtaGroupCreationTime();

    void setMtaGroupHierarchy(int mtaGroupHierarchy);

    int getMtaGroupHierarchy();

    void setMtaGroupOldestMessageId(String mtaGroupOldestMessageId);

    String getMtaGroupOldestMessageId();

    void setMtaGroupLoopsDetected(int mtaGroupLoopsDetected);

    int getMtaGroupLoopsDetected();

    void setMtaGroupLastOutboundAssociationAttempt(int mtaGroupLastOutboundAssociationAttempt);

    int getMtaGroupLastOutboundAssociationAttempt();

    IMtaGroupEntry clone();

}
