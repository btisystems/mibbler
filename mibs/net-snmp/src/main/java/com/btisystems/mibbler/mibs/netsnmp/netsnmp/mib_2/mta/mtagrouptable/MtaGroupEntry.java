
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.mtagrouptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtagrouptable.IMtaGroupEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.MtaGroupTable;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IIndexed;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class MtaGroupEntry
    extends DeviceEntity
    implements Serializable, IMtaGroupEntry, IIndexed, IVariableBindingSetter
{

    private int mtaGroupIndex;
    private int mtaGroupReceivedMessages;
    private int mtaGroupRejectedMessages;
    private int mtaGroupStoredMessages;
    private int mtaGroupTransmittedMessages;
    private int mtaGroupReceivedVolume;
    private int mtaGroupStoredVolume;
    private int mtaGroupTransmittedVolume;
    private int mtaGroupReceivedRecipients;
    private int mtaGroupStoredRecipients;
    private int mtaGroupTransmittedRecipients;
    private int mtaGroupOldestMessageStored;
    private int mtaGroupInboundAssociations;
    private int mtaGroupOutboundAssociations;
    private int mtaGroupAccumulatedInboundAssociations;
    private int mtaGroupAccumulatedOutboundAssociations;
    private int mtaGroupLastInboundActivity;
    private int mtaGroupLastOutboundActivity;
    private int mtaGroupRejectedInboundAssociations;
    private int mtaGroupFailedOutboundAssociations;
    private String mtaGroupInboundRejectionReason;
    private String mtaGroupOutboundConnectFailureReason;
    private int mtaGroupScheduledRetry;
    private String mtaGroupMailProtocol;
    private String mtaGroupName;
    private int mtaGroupSuccessfulConvertedMessages;
    private int mtaGroupFailedConvertedMessages;
    private String mtaGroupDescription;
    private String mtaGroupURL;
    private int mtaGroupCreationTime;
    private int mtaGroupHierarchy;
    private String mtaGroupOldestMessageId;
    private int mtaGroupLoopsDetected;
    private int mtaGroupLastOutboundAssociationAttempt;
    private String _index;
    private MtaGroupTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MtaGroupEntry() {
    }

    public int getMtaGroupIndex() {
        return this.mtaGroupIndex;
    }

    public void setMtaGroupIndex(int mtaGroupIndex) {
        int oldValue = getMtaGroupIndex();
        this.mtaGroupIndex = mtaGroupIndex;
        notifyChange(1, oldValue, mtaGroupIndex);
    }

    public int getMtaGroupReceivedMessages() {
        return this.mtaGroupReceivedMessages;
    }

    public void setMtaGroupReceivedMessages(int mtaGroupReceivedMessages) {
        int oldValue = getMtaGroupReceivedMessages();
        this.mtaGroupReceivedMessages = mtaGroupReceivedMessages;
        notifyChange(2, oldValue, mtaGroupReceivedMessages);
    }

    public int getMtaGroupRejectedMessages() {
        return this.mtaGroupRejectedMessages;
    }

    public void setMtaGroupRejectedMessages(int mtaGroupRejectedMessages) {
        int oldValue = getMtaGroupRejectedMessages();
        this.mtaGroupRejectedMessages = mtaGroupRejectedMessages;
        notifyChange(3, oldValue, mtaGroupRejectedMessages);
    }

    public int getMtaGroupStoredMessages() {
        return this.mtaGroupStoredMessages;
    }

    public void setMtaGroupStoredMessages(int mtaGroupStoredMessages) {
        int oldValue = getMtaGroupStoredMessages();
        this.mtaGroupStoredMessages = mtaGroupStoredMessages;
        notifyChange(4, oldValue, mtaGroupStoredMessages);
    }

    public int getMtaGroupTransmittedMessages() {
        return this.mtaGroupTransmittedMessages;
    }

    public void setMtaGroupTransmittedMessages(int mtaGroupTransmittedMessages) {
        int oldValue = getMtaGroupTransmittedMessages();
        this.mtaGroupTransmittedMessages = mtaGroupTransmittedMessages;
        notifyChange(5, oldValue, mtaGroupTransmittedMessages);
    }

    public int getMtaGroupReceivedVolume() {
        return this.mtaGroupReceivedVolume;
    }

    public void setMtaGroupReceivedVolume(int mtaGroupReceivedVolume) {
        int oldValue = getMtaGroupReceivedVolume();
        this.mtaGroupReceivedVolume = mtaGroupReceivedVolume;
        notifyChange(6, oldValue, mtaGroupReceivedVolume);
    }

    public int getMtaGroupStoredVolume() {
        return this.mtaGroupStoredVolume;
    }

    public void setMtaGroupStoredVolume(int mtaGroupStoredVolume) {
        int oldValue = getMtaGroupStoredVolume();
        this.mtaGroupStoredVolume = mtaGroupStoredVolume;
        notifyChange(7, oldValue, mtaGroupStoredVolume);
    }

    public int getMtaGroupTransmittedVolume() {
        return this.mtaGroupTransmittedVolume;
    }

    public void setMtaGroupTransmittedVolume(int mtaGroupTransmittedVolume) {
        int oldValue = getMtaGroupTransmittedVolume();
        this.mtaGroupTransmittedVolume = mtaGroupTransmittedVolume;
        notifyChange(8, oldValue, mtaGroupTransmittedVolume);
    }

    public int getMtaGroupReceivedRecipients() {
        return this.mtaGroupReceivedRecipients;
    }

    public void setMtaGroupReceivedRecipients(int mtaGroupReceivedRecipients) {
        int oldValue = getMtaGroupReceivedRecipients();
        this.mtaGroupReceivedRecipients = mtaGroupReceivedRecipients;
        notifyChange(9, oldValue, mtaGroupReceivedRecipients);
    }

    public int getMtaGroupStoredRecipients() {
        return this.mtaGroupStoredRecipients;
    }

    public void setMtaGroupStoredRecipients(int mtaGroupStoredRecipients) {
        int oldValue = getMtaGroupStoredRecipients();
        this.mtaGroupStoredRecipients = mtaGroupStoredRecipients;
        notifyChange(10, oldValue, mtaGroupStoredRecipients);
    }

    public int getMtaGroupTransmittedRecipients() {
        return this.mtaGroupTransmittedRecipients;
    }

    public void setMtaGroupTransmittedRecipients(int mtaGroupTransmittedRecipients) {
        int oldValue = getMtaGroupTransmittedRecipients();
        this.mtaGroupTransmittedRecipients = mtaGroupTransmittedRecipients;
        notifyChange(11, oldValue, mtaGroupTransmittedRecipients);
    }

    public int getMtaGroupOldestMessageStored() {
        return this.mtaGroupOldestMessageStored;
    }

    public void setMtaGroupOldestMessageStored(int mtaGroupOldestMessageStored) {
        int oldValue = getMtaGroupOldestMessageStored();
        this.mtaGroupOldestMessageStored = mtaGroupOldestMessageStored;
        notifyChange(12, oldValue, mtaGroupOldestMessageStored);
    }

    public int getMtaGroupInboundAssociations() {
        return this.mtaGroupInboundAssociations;
    }

    public void setMtaGroupInboundAssociations(int mtaGroupInboundAssociations) {
        int oldValue = getMtaGroupInboundAssociations();
        this.mtaGroupInboundAssociations = mtaGroupInboundAssociations;
        notifyChange(13, oldValue, mtaGroupInboundAssociations);
    }

    public int getMtaGroupOutboundAssociations() {
        return this.mtaGroupOutboundAssociations;
    }

    public void setMtaGroupOutboundAssociations(int mtaGroupOutboundAssociations) {
        int oldValue = getMtaGroupOutboundAssociations();
        this.mtaGroupOutboundAssociations = mtaGroupOutboundAssociations;
        notifyChange(14, oldValue, mtaGroupOutboundAssociations);
    }

    public int getMtaGroupAccumulatedInboundAssociations() {
        return this.mtaGroupAccumulatedInboundAssociations;
    }

    public void setMtaGroupAccumulatedInboundAssociations(int mtaGroupAccumulatedInboundAssociations) {
        int oldValue = getMtaGroupAccumulatedInboundAssociations();
        this.mtaGroupAccumulatedInboundAssociations = mtaGroupAccumulatedInboundAssociations;
        notifyChange(15, oldValue, mtaGroupAccumulatedInboundAssociations);
    }

    public int getMtaGroupAccumulatedOutboundAssociations() {
        return this.mtaGroupAccumulatedOutboundAssociations;
    }

    public void setMtaGroupAccumulatedOutboundAssociations(int mtaGroupAccumulatedOutboundAssociations) {
        int oldValue = getMtaGroupAccumulatedOutboundAssociations();
        this.mtaGroupAccumulatedOutboundAssociations = mtaGroupAccumulatedOutboundAssociations;
        notifyChange(16, oldValue, mtaGroupAccumulatedOutboundAssociations);
    }

    public int getMtaGroupLastInboundActivity() {
        return this.mtaGroupLastInboundActivity;
    }

    public void setMtaGroupLastInboundActivity(int mtaGroupLastInboundActivity) {
        int oldValue = getMtaGroupLastInboundActivity();
        this.mtaGroupLastInboundActivity = mtaGroupLastInboundActivity;
        notifyChange(17, oldValue, mtaGroupLastInboundActivity);
    }

    public int getMtaGroupLastOutboundActivity() {
        return this.mtaGroupLastOutboundActivity;
    }

    public void setMtaGroupLastOutboundActivity(int mtaGroupLastOutboundActivity) {
        int oldValue = getMtaGroupLastOutboundActivity();
        this.mtaGroupLastOutboundActivity = mtaGroupLastOutboundActivity;
        notifyChange(18, oldValue, mtaGroupLastOutboundActivity);
    }

    public int getMtaGroupRejectedInboundAssociations() {
        return this.mtaGroupRejectedInboundAssociations;
    }

    public void setMtaGroupRejectedInboundAssociations(int mtaGroupRejectedInboundAssociations) {
        int oldValue = getMtaGroupRejectedInboundAssociations();
        this.mtaGroupRejectedInboundAssociations = mtaGroupRejectedInboundAssociations;
        notifyChange(19, oldValue, mtaGroupRejectedInboundAssociations);
    }

    public int getMtaGroupFailedOutboundAssociations() {
        return this.mtaGroupFailedOutboundAssociations;
    }

    public void setMtaGroupFailedOutboundAssociations(int mtaGroupFailedOutboundAssociations) {
        int oldValue = getMtaGroupFailedOutboundAssociations();
        this.mtaGroupFailedOutboundAssociations = mtaGroupFailedOutboundAssociations;
        notifyChange(20, oldValue, mtaGroupFailedOutboundAssociations);
    }

    public String getMtaGroupInboundRejectionReason() {
        return this.mtaGroupInboundRejectionReason;
    }

    public void setMtaGroupInboundRejectionReason(String mtaGroupInboundRejectionReason) {
        String oldValue = getMtaGroupInboundRejectionReason();
        this.mtaGroupInboundRejectionReason = mtaGroupInboundRejectionReason;
        notifyChange(21, oldValue, mtaGroupInboundRejectionReason);
    }

    public String getMtaGroupOutboundConnectFailureReason() {
        return this.mtaGroupOutboundConnectFailureReason;
    }

    public void setMtaGroupOutboundConnectFailureReason(String mtaGroupOutboundConnectFailureReason) {
        String oldValue = getMtaGroupOutboundConnectFailureReason();
        this.mtaGroupOutboundConnectFailureReason = mtaGroupOutboundConnectFailureReason;
        notifyChange(22, oldValue, mtaGroupOutboundConnectFailureReason);
    }

    public int getMtaGroupScheduledRetry() {
        return this.mtaGroupScheduledRetry;
    }

    public void setMtaGroupScheduledRetry(int mtaGroupScheduledRetry) {
        int oldValue = getMtaGroupScheduledRetry();
        this.mtaGroupScheduledRetry = mtaGroupScheduledRetry;
        notifyChange(23, oldValue, mtaGroupScheduledRetry);
    }

    public String getMtaGroupMailProtocol() {
        return this.mtaGroupMailProtocol;
    }

    public void setMtaGroupMailProtocol(String mtaGroupMailProtocol) {
        String oldValue = getMtaGroupMailProtocol();
        this.mtaGroupMailProtocol = mtaGroupMailProtocol;
        notifyChange(24, oldValue, mtaGroupMailProtocol);
    }

    public String getMtaGroupName() {
        return this.mtaGroupName;
    }

    public void setMtaGroupName(String mtaGroupName) {
        String oldValue = getMtaGroupName();
        this.mtaGroupName = mtaGroupName;
        notifyChange(25, oldValue, mtaGroupName);
    }

    public int getMtaGroupSuccessfulConvertedMessages() {
        return this.mtaGroupSuccessfulConvertedMessages;
    }

    public void setMtaGroupSuccessfulConvertedMessages(int mtaGroupSuccessfulConvertedMessages) {
        int oldValue = getMtaGroupSuccessfulConvertedMessages();
        this.mtaGroupSuccessfulConvertedMessages = mtaGroupSuccessfulConvertedMessages;
        notifyChange(26, oldValue, mtaGroupSuccessfulConvertedMessages);
    }

    public int getMtaGroupFailedConvertedMessages() {
        return this.mtaGroupFailedConvertedMessages;
    }

    public void setMtaGroupFailedConvertedMessages(int mtaGroupFailedConvertedMessages) {
        int oldValue = getMtaGroupFailedConvertedMessages();
        this.mtaGroupFailedConvertedMessages = mtaGroupFailedConvertedMessages;
        notifyChange(27, oldValue, mtaGroupFailedConvertedMessages);
    }

    public String getMtaGroupDescription() {
        return this.mtaGroupDescription;
    }

    public void setMtaGroupDescription(String mtaGroupDescription) {
        String oldValue = getMtaGroupDescription();
        this.mtaGroupDescription = mtaGroupDescription;
        notifyChange(28, oldValue, mtaGroupDescription);
    }

    public String getMtaGroupURL() {
        return this.mtaGroupURL;
    }

    public void setMtaGroupURL(String mtaGroupURL) {
        String oldValue = getMtaGroupURL();
        this.mtaGroupURL = mtaGroupURL;
        notifyChange(29, oldValue, mtaGroupURL);
    }

    public int getMtaGroupCreationTime() {
        return this.mtaGroupCreationTime;
    }

    public void setMtaGroupCreationTime(int mtaGroupCreationTime) {
        int oldValue = getMtaGroupCreationTime();
        this.mtaGroupCreationTime = mtaGroupCreationTime;
        notifyChange(30, oldValue, mtaGroupCreationTime);
    }

    public int getMtaGroupHierarchy() {
        return this.mtaGroupHierarchy;
    }

    public void setMtaGroupHierarchy(int mtaGroupHierarchy) {
        int oldValue = getMtaGroupHierarchy();
        this.mtaGroupHierarchy = mtaGroupHierarchy;
        notifyChange(31, oldValue, mtaGroupHierarchy);
    }

    public String getMtaGroupOldestMessageId() {
        return this.mtaGroupOldestMessageId;
    }

    public void setMtaGroupOldestMessageId(String mtaGroupOldestMessageId) {
        String oldValue = getMtaGroupOldestMessageId();
        this.mtaGroupOldestMessageId = mtaGroupOldestMessageId;
        notifyChange(32, oldValue, mtaGroupOldestMessageId);
    }

    public int getMtaGroupLoopsDetected() {
        return this.mtaGroupLoopsDetected;
    }

    public void setMtaGroupLoopsDetected(int mtaGroupLoopsDetected) {
        int oldValue = getMtaGroupLoopsDetected();
        this.mtaGroupLoopsDetected = mtaGroupLoopsDetected;
        notifyChange(33, oldValue, mtaGroupLoopsDetected);
    }

    public int getMtaGroupLastOutboundAssociationAttempt() {
        return this.mtaGroupLastOutboundAssociationAttempt;
    }

    public void setMtaGroupLastOutboundAssociationAttempt(int mtaGroupLastOutboundAssociationAttempt) {
        int oldValue = getMtaGroupLastOutboundAssociationAttempt();
        this.mtaGroupLastOutboundAssociationAttempt = mtaGroupLastOutboundAssociationAttempt;
        notifyChange(34, oldValue, mtaGroupLastOutboundAssociationAttempt);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setMtaGroupIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setMtaGroupReceivedMessages(binding.getVariable().toInt());
                break;
            case  3 :
                setMtaGroupRejectedMessages(binding.getVariable().toInt());
                break;
            case  4 :
                setMtaGroupStoredMessages(binding.getVariable().toInt());
                break;
            case  5 :
                setMtaGroupTransmittedMessages(binding.getVariable().toInt());
                break;
            case  6 :
                setMtaGroupReceivedVolume(binding.getVariable().toInt());
                break;
            case  7 :
                setMtaGroupStoredVolume(binding.getVariable().toInt());
                break;
            case  8 :
                setMtaGroupTransmittedVolume(binding.getVariable().toInt());
                break;
            case  9 :
                setMtaGroupReceivedRecipients(binding.getVariable().toInt());
                break;
            case  10 :
                setMtaGroupStoredRecipients(binding.getVariable().toInt());
                break;
            case  11 :
                setMtaGroupTransmittedRecipients(binding.getVariable().toInt());
                break;
            case  12 :
                setMtaGroupOldestMessageStored(binding.getVariable().toInt());
                break;
            case  13 :
                setMtaGroupInboundAssociations(binding.getVariable().toInt());
                break;
            case  14 :
                setMtaGroupOutboundAssociations(binding.getVariable().toInt());
                break;
            case  15 :
                setMtaGroupAccumulatedInboundAssociations(binding.getVariable().toInt());
                break;
            case  16 :
                setMtaGroupAccumulatedOutboundAssociations(binding.getVariable().toInt());
                break;
            case  17 :
                setMtaGroupLastInboundActivity(binding.getVariable().toInt());
                break;
            case  18 :
                setMtaGroupLastOutboundActivity(binding.getVariable().toInt());
                break;
            case  19 :
                setMtaGroupRejectedInboundAssociations(binding.getVariable().toInt());
                break;
            case  20 :
                setMtaGroupFailedOutboundAssociations(binding.getVariable().toInt());
                break;
            case  21 :
                setMtaGroupInboundRejectionReason(binding.getVariable().toString());
                break;
            case  22 :
                setMtaGroupOutboundConnectFailureReason(binding.getVariable().toString());
                break;
            case  23 :
                setMtaGroupScheduledRetry(binding.getVariable().toInt());
                break;
            case  24 :
                setMtaGroupMailProtocol(binding.getVariable().toString());
                break;
            case  25 :
                setMtaGroupName(binding.getVariable().toString());
                break;
            case  26 :
                setMtaGroupSuccessfulConvertedMessages(binding.getVariable().toInt());
                break;
            case  27 :
                setMtaGroupFailedConvertedMessages(binding.getVariable().toInt());
                break;
            case  28 :
                setMtaGroupDescription(binding.getVariable().toString());
                break;
            case  29 :
                setMtaGroupURL(binding.getVariable().toString());
                break;
            case  30 :
                setMtaGroupCreationTime(binding.getVariable().toInt());
                break;
            case  31 :
                setMtaGroupHierarchy(binding.getVariable().toInt());
                break;
            case  32 :
                setMtaGroupOldestMessageId(binding.getVariable().toString());
                break;
            case  33 :
                setMtaGroupLoopsDetected(binding.getVariable().toInt());
                break;
            case  34 :
                setMtaGroupLastOutboundAssociationAttempt(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        arrayOffset += 1;
        setMtaGroupIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MtaGroupTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mtaGroupIndex", mtaGroupIndex).append("mtaGroupReceivedMessages", mtaGroupReceivedMessages).append("mtaGroupRejectedMessages", mtaGroupRejectedMessages).append("mtaGroupStoredMessages", mtaGroupStoredMessages).append("mtaGroupTransmittedMessages", mtaGroupTransmittedMessages).append("mtaGroupReceivedVolume", mtaGroupReceivedVolume).append("mtaGroupStoredVolume", mtaGroupStoredVolume).append("mtaGroupTransmittedVolume", mtaGroupTransmittedVolume).append("mtaGroupReceivedRecipients", mtaGroupReceivedRecipients).append("mtaGroupStoredRecipients", mtaGroupStoredRecipients).append("mtaGroupTransmittedRecipients", mtaGroupTransmittedRecipients).append("mtaGroupOldestMessageStored", mtaGroupOldestMessageStored).append("mtaGroupInboundAssociations", mtaGroupInboundAssociations).append("mtaGroupOutboundAssociations", mtaGroupOutboundAssociations).append("mtaGroupAccumulatedInboundAssociations", mtaGroupAccumulatedInboundAssociations).append("mtaGroupAccumulatedOutboundAssociations", mtaGroupAccumulatedOutboundAssociations).append("mtaGroupLastInboundActivity", mtaGroupLastInboundActivity).append("mtaGroupLastOutboundActivity", mtaGroupLastOutboundActivity).append("mtaGroupRejectedInboundAssociations", mtaGroupRejectedInboundAssociations).append("mtaGroupFailedOutboundAssociations", mtaGroupFailedOutboundAssociations).append("mtaGroupInboundRejectionReason", mtaGroupInboundRejectionReason).append("mtaGroupOutboundConnectFailureReason", mtaGroupOutboundConnectFailureReason).append("mtaGroupScheduledRetry", mtaGroupScheduledRetry).append("mtaGroupMailProtocol", mtaGroupMailProtocol).append("mtaGroupName", mtaGroupName).append("mtaGroupSuccessfulConvertedMessages", mtaGroupSuccessfulConvertedMessages).append("mtaGroupFailedConvertedMessages", mtaGroupFailedConvertedMessages).append("mtaGroupDescription", mtaGroupDescription).append("mtaGroupURL", mtaGroupURL).append("mtaGroupCreationTime", mtaGroupCreationTime).append("mtaGroupHierarchy", mtaGroupHierarchy).append("mtaGroupOldestMessageId", mtaGroupOldestMessageId).append("mtaGroupLoopsDetected", mtaGroupLoopsDetected).append("mtaGroupLastOutboundAssociationAttempt", mtaGroupLastOutboundAssociationAttempt).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mtaGroupIndex).append(mtaGroupReceivedMessages).append(mtaGroupRejectedMessages).append(mtaGroupStoredMessages).append(mtaGroupTransmittedMessages).append(mtaGroupReceivedVolume).append(mtaGroupStoredVolume).append(mtaGroupTransmittedVolume).append(mtaGroupReceivedRecipients).append(mtaGroupStoredRecipients).append(mtaGroupTransmittedRecipients).append(mtaGroupOldestMessageStored).append(mtaGroupInboundAssociations).append(mtaGroupOutboundAssociations).append(mtaGroupAccumulatedInboundAssociations).append(mtaGroupAccumulatedOutboundAssociations).append(mtaGroupLastInboundActivity).append(mtaGroupLastOutboundActivity).append(mtaGroupRejectedInboundAssociations).append(mtaGroupFailedOutboundAssociations).append(mtaGroupInboundRejectionReason).append(mtaGroupOutboundConnectFailureReason).append(mtaGroupScheduledRetry).append(mtaGroupMailProtocol).append(mtaGroupName).append(mtaGroupSuccessfulConvertedMessages).append(mtaGroupFailedConvertedMessages).append(mtaGroupDescription).append(mtaGroupURL).append(mtaGroupCreationTime).append(mtaGroupHierarchy).append(mtaGroupOldestMessageId).append(mtaGroupLoopsDetected).append(mtaGroupLastOutboundAssociationAttempt).append(_index).toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass()!= this.getClass()) {
            return false;
        }
        MtaGroupEntry rhs = ((MtaGroupEntry) obj);
        return new EqualsBuilder().append(mtaGroupIndex, rhs.mtaGroupIndex).append(mtaGroupReceivedMessages, rhs.mtaGroupReceivedMessages).append(mtaGroupRejectedMessages, rhs.mtaGroupRejectedMessages).append(mtaGroupStoredMessages, rhs.mtaGroupStoredMessages).append(mtaGroupTransmittedMessages, rhs.mtaGroupTransmittedMessages).append(mtaGroupReceivedVolume, rhs.mtaGroupReceivedVolume).append(mtaGroupStoredVolume, rhs.mtaGroupStoredVolume).append(mtaGroupTransmittedVolume, rhs.mtaGroupTransmittedVolume).append(mtaGroupReceivedRecipients, rhs.mtaGroupReceivedRecipients).append(mtaGroupStoredRecipients, rhs.mtaGroupStoredRecipients).append(mtaGroupTransmittedRecipients, rhs.mtaGroupTransmittedRecipients).append(mtaGroupOldestMessageStored, rhs.mtaGroupOldestMessageStored).append(mtaGroupInboundAssociations, rhs.mtaGroupInboundAssociations).append(mtaGroupOutboundAssociations, rhs.mtaGroupOutboundAssociations).append(mtaGroupAccumulatedInboundAssociations, rhs.mtaGroupAccumulatedInboundAssociations).append(mtaGroupAccumulatedOutboundAssociations, rhs.mtaGroupAccumulatedOutboundAssociations).append(mtaGroupLastInboundActivity, rhs.mtaGroupLastInboundActivity).append(mtaGroupLastOutboundActivity, rhs.mtaGroupLastOutboundActivity).append(mtaGroupRejectedInboundAssociations, rhs.mtaGroupRejectedInboundAssociations).append(mtaGroupFailedOutboundAssociations, rhs.mtaGroupFailedOutboundAssociations).append(mtaGroupInboundRejectionReason, rhs.mtaGroupInboundRejectionReason).append(mtaGroupOutboundConnectFailureReason, rhs.mtaGroupOutboundConnectFailureReason).append(mtaGroupScheduledRetry, rhs.mtaGroupScheduledRetry).append(mtaGroupMailProtocol, rhs.mtaGroupMailProtocol).append(mtaGroupName, rhs.mtaGroupName).append(mtaGroupSuccessfulConvertedMessages, rhs.mtaGroupSuccessfulConvertedMessages).append(mtaGroupFailedConvertedMessages, rhs.mtaGroupFailedConvertedMessages).append(mtaGroupDescription, rhs.mtaGroupDescription).append(mtaGroupURL, rhs.mtaGroupURL).append(mtaGroupCreationTime, rhs.mtaGroupCreationTime).append(mtaGroupHierarchy, rhs.mtaGroupHierarchy).append(mtaGroupOldestMessageId, rhs.mtaGroupOldestMessageId).append(mtaGroupLoopsDetected, rhs.mtaGroupLoopsDetected).append(mtaGroupLastOutboundAssociationAttempt, rhs.mtaGroupLastOutboundAssociationAttempt).append(_index, rhs._index).isEquals();
    }

    public MtaGroupEntry clone() {
        MtaGroupEntry _copy = new MtaGroupEntry();
        _copy.mtaGroupIndex = mtaGroupIndex;
        _copy.mtaGroupReceivedMessages = mtaGroupReceivedMessages;
        _copy.mtaGroupRejectedMessages = mtaGroupRejectedMessages;
        _copy.mtaGroupStoredMessages = mtaGroupStoredMessages;
        _copy.mtaGroupTransmittedMessages = mtaGroupTransmittedMessages;
        _copy.mtaGroupReceivedVolume = mtaGroupReceivedVolume;
        _copy.mtaGroupStoredVolume = mtaGroupStoredVolume;
        _copy.mtaGroupTransmittedVolume = mtaGroupTransmittedVolume;
        _copy.mtaGroupReceivedRecipients = mtaGroupReceivedRecipients;
        _copy.mtaGroupStoredRecipients = mtaGroupStoredRecipients;
        _copy.mtaGroupTransmittedRecipients = mtaGroupTransmittedRecipients;
        _copy.mtaGroupOldestMessageStored = mtaGroupOldestMessageStored;
        _copy.mtaGroupInboundAssociations = mtaGroupInboundAssociations;
        _copy.mtaGroupOutboundAssociations = mtaGroupOutboundAssociations;
        _copy.mtaGroupAccumulatedInboundAssociations = mtaGroupAccumulatedInboundAssociations;
        _copy.mtaGroupAccumulatedOutboundAssociations = mtaGroupAccumulatedOutboundAssociations;
        _copy.mtaGroupLastInboundActivity = mtaGroupLastInboundActivity;
        _copy.mtaGroupLastOutboundActivity = mtaGroupLastOutboundActivity;
        _copy.mtaGroupRejectedInboundAssociations = mtaGroupRejectedInboundAssociations;
        _copy.mtaGroupFailedOutboundAssociations = mtaGroupFailedOutboundAssociations;
        _copy.mtaGroupInboundRejectionReason = mtaGroupInboundRejectionReason;
        _copy.mtaGroupOutboundConnectFailureReason = mtaGroupOutboundConnectFailureReason;
        _copy.mtaGroupScheduledRetry = mtaGroupScheduledRetry;
        _copy.mtaGroupMailProtocol = mtaGroupMailProtocol;
        _copy.mtaGroupName = mtaGroupName;
        _copy.mtaGroupSuccessfulConvertedMessages = mtaGroupSuccessfulConvertedMessages;
        _copy.mtaGroupFailedConvertedMessages = mtaGroupFailedConvertedMessages;
        _copy.mtaGroupDescription = mtaGroupDescription;
        _copy.mtaGroupURL = mtaGroupURL;
        _copy.mtaGroupCreationTime = mtaGroupCreationTime;
        _copy.mtaGroupHierarchy = mtaGroupHierarchy;
        _copy.mtaGroupOldestMessageId = mtaGroupOldestMessageId;
        _copy.mtaGroupLoopsDetected = mtaGroupLoopsDetected;
        _copy.mtaGroupLastOutboundAssociationAttempt = mtaGroupLastOutboundAssociationAttempt;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.28.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mtaGroupIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mtaGroupReceivedMessages", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mtaGroupRejectedMessages", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mtaGroupStoredMessages", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "mtaGroupTransmittedMessages", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "mtaGroupReceivedVolume", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "mtaGroupStoredVolume", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "mtaGroupTransmittedVolume", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "mtaGroupReceivedRecipients", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "mtaGroupStoredRecipients", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "mtaGroupTransmittedRecipients", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "mtaGroupOldestMessageStored", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "mtaGroupInboundAssociations", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "mtaGroupOutboundAssociations", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "mtaGroupAccumulatedInboundAssociations", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "mtaGroupAccumulatedOutboundAssociations", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "mtaGroupLastInboundActivity", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "mtaGroupLastOutboundActivity", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "mtaGroupRejectedInboundAssociations", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "mtaGroupFailedOutboundAssociations", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "mtaGroupInboundRejectionReason", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "mtaGroupOutboundConnectFailureReason", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "mtaGroupScheduledRetry", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "mtaGroupMailProtocol", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "mtaGroupName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "mtaGroupSuccessfulConvertedMessages", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "mtaGroupFailedConvertedMessages", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "mtaGroupDescription", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "mtaGroupURL", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(30, "mtaGroupCreationTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(31, "mtaGroupHierarchy", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(32, "mtaGroupOldestMessageId", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(33, "mtaGroupLoopsDetected", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(34, "mtaGroupLastOutboundAssociationAttempt", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
