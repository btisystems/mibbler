
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.tokenringmlstatstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics.tokenringmlstatstable.ITokenRingMLStatsEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.TokenRingMLStatsTable;
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

public class TokenRingMLStatsEntry
    extends DeviceEntity
    implements Serializable, ITokenRingMLStatsEntry, IIndexed, IVariableBindingSetter
{

    private int tokenRingMLStatsIndex;
    private String tokenRingMLStatsDataSource;
    private int tokenRingMLStatsDropEvents;
    private int tokenRingMLStatsMacOctets;
    private int tokenRingMLStatsMacPkts;
    private int tokenRingMLStatsRingPurgeEvents;
    private int tokenRingMLStatsRingPurgePkts;
    private int tokenRingMLStatsBeaconEvents;
    private int tokenRingMLStatsBeaconTime;
    private int tokenRingMLStatsBeaconPkts;
    private int tokenRingMLStatsClaimTokenEvents;
    private int tokenRingMLStatsClaimTokenPkts;
    private int tokenRingMLStatsNAUNChanges;
    private int tokenRingMLStatsLineErrors;
    private int tokenRingMLStatsInternalErrors;
    private int tokenRingMLStatsBurstErrors;
    private int tokenRingMLStatsACErrors;
    private int tokenRingMLStatsAbortErrors;
    private int tokenRingMLStatsLostFrameErrors;
    private int tokenRingMLStatsCongestionErrors;
    private int tokenRingMLStatsFrameCopiedErrors;
    private int tokenRingMLStatsFrequencyErrors;
    private int tokenRingMLStatsTokenErrors;
    private int tokenRingMLStatsSoftErrorReports;
    private int tokenRingMLStatsRingPollEvents;
    private String tokenRingMLStatsOwner;
    private int tokenRingMLStatsStatus;
    private String _index;
    private TokenRingMLStatsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TokenRingMLStatsEntry() {
    }

    public int getTokenRingMLStatsIndex() {
        return this.tokenRingMLStatsIndex;
    }

    public void setTokenRingMLStatsIndex(int tokenRingMLStatsIndex) {
        int oldValue = getTokenRingMLStatsIndex();
        this.tokenRingMLStatsIndex = tokenRingMLStatsIndex;
        notifyChange(1, oldValue, tokenRingMLStatsIndex);
    }

    public String getTokenRingMLStatsDataSource() {
        return this.tokenRingMLStatsDataSource;
    }

    public void setTokenRingMLStatsDataSource(String tokenRingMLStatsDataSource) {
        String oldValue = getTokenRingMLStatsDataSource();
        this.tokenRingMLStatsDataSource = tokenRingMLStatsDataSource;
        notifyChange(2, oldValue, tokenRingMLStatsDataSource);
    }

    public int getTokenRingMLStatsDropEvents() {
        return this.tokenRingMLStatsDropEvents;
    }

    public void setTokenRingMLStatsDropEvents(int tokenRingMLStatsDropEvents) {
        int oldValue = getTokenRingMLStatsDropEvents();
        this.tokenRingMLStatsDropEvents = tokenRingMLStatsDropEvents;
        notifyChange(3, oldValue, tokenRingMLStatsDropEvents);
    }

    public int getTokenRingMLStatsMacOctets() {
        return this.tokenRingMLStatsMacOctets;
    }

    public void setTokenRingMLStatsMacOctets(int tokenRingMLStatsMacOctets) {
        int oldValue = getTokenRingMLStatsMacOctets();
        this.tokenRingMLStatsMacOctets = tokenRingMLStatsMacOctets;
        notifyChange(4, oldValue, tokenRingMLStatsMacOctets);
    }

    public int getTokenRingMLStatsMacPkts() {
        return this.tokenRingMLStatsMacPkts;
    }

    public void setTokenRingMLStatsMacPkts(int tokenRingMLStatsMacPkts) {
        int oldValue = getTokenRingMLStatsMacPkts();
        this.tokenRingMLStatsMacPkts = tokenRingMLStatsMacPkts;
        notifyChange(5, oldValue, tokenRingMLStatsMacPkts);
    }

    public int getTokenRingMLStatsRingPurgeEvents() {
        return this.tokenRingMLStatsRingPurgeEvents;
    }

    public void setTokenRingMLStatsRingPurgeEvents(int tokenRingMLStatsRingPurgeEvents) {
        int oldValue = getTokenRingMLStatsRingPurgeEvents();
        this.tokenRingMLStatsRingPurgeEvents = tokenRingMLStatsRingPurgeEvents;
        notifyChange(6, oldValue, tokenRingMLStatsRingPurgeEvents);
    }

    public int getTokenRingMLStatsRingPurgePkts() {
        return this.tokenRingMLStatsRingPurgePkts;
    }

    public void setTokenRingMLStatsRingPurgePkts(int tokenRingMLStatsRingPurgePkts) {
        int oldValue = getTokenRingMLStatsRingPurgePkts();
        this.tokenRingMLStatsRingPurgePkts = tokenRingMLStatsRingPurgePkts;
        notifyChange(7, oldValue, tokenRingMLStatsRingPurgePkts);
    }

    public int getTokenRingMLStatsBeaconEvents() {
        return this.tokenRingMLStatsBeaconEvents;
    }

    public void setTokenRingMLStatsBeaconEvents(int tokenRingMLStatsBeaconEvents) {
        int oldValue = getTokenRingMLStatsBeaconEvents();
        this.tokenRingMLStatsBeaconEvents = tokenRingMLStatsBeaconEvents;
        notifyChange(8, oldValue, tokenRingMLStatsBeaconEvents);
    }

    public int getTokenRingMLStatsBeaconTime() {
        return this.tokenRingMLStatsBeaconTime;
    }

    public void setTokenRingMLStatsBeaconTime(int tokenRingMLStatsBeaconTime) {
        int oldValue = getTokenRingMLStatsBeaconTime();
        this.tokenRingMLStatsBeaconTime = tokenRingMLStatsBeaconTime;
        notifyChange(9, oldValue, tokenRingMLStatsBeaconTime);
    }

    public int getTokenRingMLStatsBeaconPkts() {
        return this.tokenRingMLStatsBeaconPkts;
    }

    public void setTokenRingMLStatsBeaconPkts(int tokenRingMLStatsBeaconPkts) {
        int oldValue = getTokenRingMLStatsBeaconPkts();
        this.tokenRingMLStatsBeaconPkts = tokenRingMLStatsBeaconPkts;
        notifyChange(10, oldValue, tokenRingMLStatsBeaconPkts);
    }

    public int getTokenRingMLStatsClaimTokenEvents() {
        return this.tokenRingMLStatsClaimTokenEvents;
    }

    public void setTokenRingMLStatsClaimTokenEvents(int tokenRingMLStatsClaimTokenEvents) {
        int oldValue = getTokenRingMLStatsClaimTokenEvents();
        this.tokenRingMLStatsClaimTokenEvents = tokenRingMLStatsClaimTokenEvents;
        notifyChange(11, oldValue, tokenRingMLStatsClaimTokenEvents);
    }

    public int getTokenRingMLStatsClaimTokenPkts() {
        return this.tokenRingMLStatsClaimTokenPkts;
    }

    public void setTokenRingMLStatsClaimTokenPkts(int tokenRingMLStatsClaimTokenPkts) {
        int oldValue = getTokenRingMLStatsClaimTokenPkts();
        this.tokenRingMLStatsClaimTokenPkts = tokenRingMLStatsClaimTokenPkts;
        notifyChange(12, oldValue, tokenRingMLStatsClaimTokenPkts);
    }

    public int getTokenRingMLStatsNAUNChanges() {
        return this.tokenRingMLStatsNAUNChanges;
    }

    public void setTokenRingMLStatsNAUNChanges(int tokenRingMLStatsNAUNChanges) {
        int oldValue = getTokenRingMLStatsNAUNChanges();
        this.tokenRingMLStatsNAUNChanges = tokenRingMLStatsNAUNChanges;
        notifyChange(13, oldValue, tokenRingMLStatsNAUNChanges);
    }

    public int getTokenRingMLStatsLineErrors() {
        return this.tokenRingMLStatsLineErrors;
    }

    public void setTokenRingMLStatsLineErrors(int tokenRingMLStatsLineErrors) {
        int oldValue = getTokenRingMLStatsLineErrors();
        this.tokenRingMLStatsLineErrors = tokenRingMLStatsLineErrors;
        notifyChange(14, oldValue, tokenRingMLStatsLineErrors);
    }

    public int getTokenRingMLStatsInternalErrors() {
        return this.tokenRingMLStatsInternalErrors;
    }

    public void setTokenRingMLStatsInternalErrors(int tokenRingMLStatsInternalErrors) {
        int oldValue = getTokenRingMLStatsInternalErrors();
        this.tokenRingMLStatsInternalErrors = tokenRingMLStatsInternalErrors;
        notifyChange(15, oldValue, tokenRingMLStatsInternalErrors);
    }

    public int getTokenRingMLStatsBurstErrors() {
        return this.tokenRingMLStatsBurstErrors;
    }

    public void setTokenRingMLStatsBurstErrors(int tokenRingMLStatsBurstErrors) {
        int oldValue = getTokenRingMLStatsBurstErrors();
        this.tokenRingMLStatsBurstErrors = tokenRingMLStatsBurstErrors;
        notifyChange(16, oldValue, tokenRingMLStatsBurstErrors);
    }

    public int getTokenRingMLStatsACErrors() {
        return this.tokenRingMLStatsACErrors;
    }

    public void setTokenRingMLStatsACErrors(int tokenRingMLStatsACErrors) {
        int oldValue = getTokenRingMLStatsACErrors();
        this.tokenRingMLStatsACErrors = tokenRingMLStatsACErrors;
        notifyChange(17, oldValue, tokenRingMLStatsACErrors);
    }

    public int getTokenRingMLStatsAbortErrors() {
        return this.tokenRingMLStatsAbortErrors;
    }

    public void setTokenRingMLStatsAbortErrors(int tokenRingMLStatsAbortErrors) {
        int oldValue = getTokenRingMLStatsAbortErrors();
        this.tokenRingMLStatsAbortErrors = tokenRingMLStatsAbortErrors;
        notifyChange(18, oldValue, tokenRingMLStatsAbortErrors);
    }

    public int getTokenRingMLStatsLostFrameErrors() {
        return this.tokenRingMLStatsLostFrameErrors;
    }

    public void setTokenRingMLStatsLostFrameErrors(int tokenRingMLStatsLostFrameErrors) {
        int oldValue = getTokenRingMLStatsLostFrameErrors();
        this.tokenRingMLStatsLostFrameErrors = tokenRingMLStatsLostFrameErrors;
        notifyChange(19, oldValue, tokenRingMLStatsLostFrameErrors);
    }

    public int getTokenRingMLStatsCongestionErrors() {
        return this.tokenRingMLStatsCongestionErrors;
    }

    public void setTokenRingMLStatsCongestionErrors(int tokenRingMLStatsCongestionErrors) {
        int oldValue = getTokenRingMLStatsCongestionErrors();
        this.tokenRingMLStatsCongestionErrors = tokenRingMLStatsCongestionErrors;
        notifyChange(20, oldValue, tokenRingMLStatsCongestionErrors);
    }

    public int getTokenRingMLStatsFrameCopiedErrors() {
        return this.tokenRingMLStatsFrameCopiedErrors;
    }

    public void setTokenRingMLStatsFrameCopiedErrors(int tokenRingMLStatsFrameCopiedErrors) {
        int oldValue = getTokenRingMLStatsFrameCopiedErrors();
        this.tokenRingMLStatsFrameCopiedErrors = tokenRingMLStatsFrameCopiedErrors;
        notifyChange(21, oldValue, tokenRingMLStatsFrameCopiedErrors);
    }

    public int getTokenRingMLStatsFrequencyErrors() {
        return this.tokenRingMLStatsFrequencyErrors;
    }

    public void setTokenRingMLStatsFrequencyErrors(int tokenRingMLStatsFrequencyErrors) {
        int oldValue = getTokenRingMLStatsFrequencyErrors();
        this.tokenRingMLStatsFrequencyErrors = tokenRingMLStatsFrequencyErrors;
        notifyChange(22, oldValue, tokenRingMLStatsFrequencyErrors);
    }

    public int getTokenRingMLStatsTokenErrors() {
        return this.tokenRingMLStatsTokenErrors;
    }

    public void setTokenRingMLStatsTokenErrors(int tokenRingMLStatsTokenErrors) {
        int oldValue = getTokenRingMLStatsTokenErrors();
        this.tokenRingMLStatsTokenErrors = tokenRingMLStatsTokenErrors;
        notifyChange(23, oldValue, tokenRingMLStatsTokenErrors);
    }

    public int getTokenRingMLStatsSoftErrorReports() {
        return this.tokenRingMLStatsSoftErrorReports;
    }

    public void setTokenRingMLStatsSoftErrorReports(int tokenRingMLStatsSoftErrorReports) {
        int oldValue = getTokenRingMLStatsSoftErrorReports();
        this.tokenRingMLStatsSoftErrorReports = tokenRingMLStatsSoftErrorReports;
        notifyChange(24, oldValue, tokenRingMLStatsSoftErrorReports);
    }

    public int getTokenRingMLStatsRingPollEvents() {
        return this.tokenRingMLStatsRingPollEvents;
    }

    public void setTokenRingMLStatsRingPollEvents(int tokenRingMLStatsRingPollEvents) {
        int oldValue = getTokenRingMLStatsRingPollEvents();
        this.tokenRingMLStatsRingPollEvents = tokenRingMLStatsRingPollEvents;
        notifyChange(25, oldValue, tokenRingMLStatsRingPollEvents);
    }

    public String getTokenRingMLStatsOwner() {
        return this.tokenRingMLStatsOwner;
    }

    public void setTokenRingMLStatsOwner(String tokenRingMLStatsOwner) {
        String oldValue = getTokenRingMLStatsOwner();
        this.tokenRingMLStatsOwner = tokenRingMLStatsOwner;
        notifyChange(26, oldValue, tokenRingMLStatsOwner);
    }

    public int getTokenRingMLStatsStatus() {
        return this.tokenRingMLStatsStatus;
    }

    public void setTokenRingMLStatsStatus(int tokenRingMLStatsStatus) {
        int oldValue = getTokenRingMLStatsStatus();
        this.tokenRingMLStatsStatus = tokenRingMLStatsStatus;
        notifyChange(27, oldValue, tokenRingMLStatsStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setTokenRingMLStatsIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setTokenRingMLStatsDataSource(binding.getVariable().toString());
                break;
            case  3 :
                setTokenRingMLStatsDropEvents(binding.getVariable().toInt());
                break;
            case  4 :
                setTokenRingMLStatsMacOctets(binding.getVariable().toInt());
                break;
            case  5 :
                setTokenRingMLStatsMacPkts(binding.getVariable().toInt());
                break;
            case  6 :
                setTokenRingMLStatsRingPurgeEvents(binding.getVariable().toInt());
                break;
            case  7 :
                setTokenRingMLStatsRingPurgePkts(binding.getVariable().toInt());
                break;
            case  8 :
                setTokenRingMLStatsBeaconEvents(binding.getVariable().toInt());
                break;
            case  9 :
                setTokenRingMLStatsBeaconTime(binding.getVariable().toInt());
                break;
            case  10 :
                setTokenRingMLStatsBeaconPkts(binding.getVariable().toInt());
                break;
            case  11 :
                setTokenRingMLStatsClaimTokenEvents(binding.getVariable().toInt());
                break;
            case  12 :
                setTokenRingMLStatsClaimTokenPkts(binding.getVariable().toInt());
                break;
            case  13 :
                setTokenRingMLStatsNAUNChanges(binding.getVariable().toInt());
                break;
            case  14 :
                setTokenRingMLStatsLineErrors(binding.getVariable().toInt());
                break;
            case  15 :
                setTokenRingMLStatsInternalErrors(binding.getVariable().toInt());
                break;
            case  16 :
                setTokenRingMLStatsBurstErrors(binding.getVariable().toInt());
                break;
            case  17 :
                setTokenRingMLStatsACErrors(binding.getVariable().toInt());
                break;
            case  18 :
                setTokenRingMLStatsAbortErrors(binding.getVariable().toInt());
                break;
            case  19 :
                setTokenRingMLStatsLostFrameErrors(binding.getVariable().toInt());
                break;
            case  20 :
                setTokenRingMLStatsCongestionErrors(binding.getVariable().toInt());
                break;
            case  21 :
                setTokenRingMLStatsFrameCopiedErrors(binding.getVariable().toInt());
                break;
            case  22 :
                setTokenRingMLStatsFrequencyErrors(binding.getVariable().toInt());
                break;
            case  23 :
                setTokenRingMLStatsTokenErrors(binding.getVariable().toInt());
                break;
            case  24 :
                setTokenRingMLStatsSoftErrorReports(binding.getVariable().toInt());
                break;
            case  25 :
                setTokenRingMLStatsRingPollEvents(binding.getVariable().toInt());
                break;
            case  26 :
                setTokenRingMLStatsOwner(binding.getVariable().toString());
                break;
            case  27 :
                setTokenRingMLStatsStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setTokenRingMLStatsIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(TokenRingMLStatsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tokenRingMLStatsIndex", tokenRingMLStatsIndex).append("tokenRingMLStatsDataSource", tokenRingMLStatsDataSource).append("tokenRingMLStatsDropEvents", tokenRingMLStatsDropEvents).append("tokenRingMLStatsMacOctets", tokenRingMLStatsMacOctets).append("tokenRingMLStatsMacPkts", tokenRingMLStatsMacPkts).append("tokenRingMLStatsRingPurgeEvents", tokenRingMLStatsRingPurgeEvents).append("tokenRingMLStatsRingPurgePkts", tokenRingMLStatsRingPurgePkts).append("tokenRingMLStatsBeaconEvents", tokenRingMLStatsBeaconEvents).append("tokenRingMLStatsBeaconTime", tokenRingMLStatsBeaconTime).append("tokenRingMLStatsBeaconPkts", tokenRingMLStatsBeaconPkts).append("tokenRingMLStatsClaimTokenEvents", tokenRingMLStatsClaimTokenEvents).append("tokenRingMLStatsClaimTokenPkts", tokenRingMLStatsClaimTokenPkts).append("tokenRingMLStatsNAUNChanges", tokenRingMLStatsNAUNChanges).append("tokenRingMLStatsLineErrors", tokenRingMLStatsLineErrors).append("tokenRingMLStatsInternalErrors", tokenRingMLStatsInternalErrors).append("tokenRingMLStatsBurstErrors", tokenRingMLStatsBurstErrors).append("tokenRingMLStatsACErrors", tokenRingMLStatsACErrors).append("tokenRingMLStatsAbortErrors", tokenRingMLStatsAbortErrors).append("tokenRingMLStatsLostFrameErrors", tokenRingMLStatsLostFrameErrors).append("tokenRingMLStatsCongestionErrors", tokenRingMLStatsCongestionErrors).append("tokenRingMLStatsFrameCopiedErrors", tokenRingMLStatsFrameCopiedErrors).append("tokenRingMLStatsFrequencyErrors", tokenRingMLStatsFrequencyErrors).append("tokenRingMLStatsTokenErrors", tokenRingMLStatsTokenErrors).append("tokenRingMLStatsSoftErrorReports", tokenRingMLStatsSoftErrorReports).append("tokenRingMLStatsRingPollEvents", tokenRingMLStatsRingPollEvents).append("tokenRingMLStatsOwner", tokenRingMLStatsOwner).append("tokenRingMLStatsStatus", tokenRingMLStatsStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tokenRingMLStatsIndex).append(tokenRingMLStatsDataSource).append(tokenRingMLStatsDropEvents).append(tokenRingMLStatsMacOctets).append(tokenRingMLStatsMacPkts).append(tokenRingMLStatsRingPurgeEvents).append(tokenRingMLStatsRingPurgePkts).append(tokenRingMLStatsBeaconEvents).append(tokenRingMLStatsBeaconTime).append(tokenRingMLStatsBeaconPkts).append(tokenRingMLStatsClaimTokenEvents).append(tokenRingMLStatsClaimTokenPkts).append(tokenRingMLStatsNAUNChanges).append(tokenRingMLStatsLineErrors).append(tokenRingMLStatsInternalErrors).append(tokenRingMLStatsBurstErrors).append(tokenRingMLStatsACErrors).append(tokenRingMLStatsAbortErrors).append(tokenRingMLStatsLostFrameErrors).append(tokenRingMLStatsCongestionErrors).append(tokenRingMLStatsFrameCopiedErrors).append(tokenRingMLStatsFrequencyErrors).append(tokenRingMLStatsTokenErrors).append(tokenRingMLStatsSoftErrorReports).append(tokenRingMLStatsRingPollEvents).append(tokenRingMLStatsOwner).append(tokenRingMLStatsStatus).append(_index).toHashCode();
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
        TokenRingMLStatsEntry rhs = ((TokenRingMLStatsEntry) obj);
        return new EqualsBuilder().append(tokenRingMLStatsIndex, rhs.tokenRingMLStatsIndex).append(tokenRingMLStatsDataSource, rhs.tokenRingMLStatsDataSource).append(tokenRingMLStatsDropEvents, rhs.tokenRingMLStatsDropEvents).append(tokenRingMLStatsMacOctets, rhs.tokenRingMLStatsMacOctets).append(tokenRingMLStatsMacPkts, rhs.tokenRingMLStatsMacPkts).append(tokenRingMLStatsRingPurgeEvents, rhs.tokenRingMLStatsRingPurgeEvents).append(tokenRingMLStatsRingPurgePkts, rhs.tokenRingMLStatsRingPurgePkts).append(tokenRingMLStatsBeaconEvents, rhs.tokenRingMLStatsBeaconEvents).append(tokenRingMLStatsBeaconTime, rhs.tokenRingMLStatsBeaconTime).append(tokenRingMLStatsBeaconPkts, rhs.tokenRingMLStatsBeaconPkts).append(tokenRingMLStatsClaimTokenEvents, rhs.tokenRingMLStatsClaimTokenEvents).append(tokenRingMLStatsClaimTokenPkts, rhs.tokenRingMLStatsClaimTokenPkts).append(tokenRingMLStatsNAUNChanges, rhs.tokenRingMLStatsNAUNChanges).append(tokenRingMLStatsLineErrors, rhs.tokenRingMLStatsLineErrors).append(tokenRingMLStatsInternalErrors, rhs.tokenRingMLStatsInternalErrors).append(tokenRingMLStatsBurstErrors, rhs.tokenRingMLStatsBurstErrors).append(tokenRingMLStatsACErrors, rhs.tokenRingMLStatsACErrors).append(tokenRingMLStatsAbortErrors, rhs.tokenRingMLStatsAbortErrors).append(tokenRingMLStatsLostFrameErrors, rhs.tokenRingMLStatsLostFrameErrors).append(tokenRingMLStatsCongestionErrors, rhs.tokenRingMLStatsCongestionErrors).append(tokenRingMLStatsFrameCopiedErrors, rhs.tokenRingMLStatsFrameCopiedErrors).append(tokenRingMLStatsFrequencyErrors, rhs.tokenRingMLStatsFrequencyErrors).append(tokenRingMLStatsTokenErrors, rhs.tokenRingMLStatsTokenErrors).append(tokenRingMLStatsSoftErrorReports, rhs.tokenRingMLStatsSoftErrorReports).append(tokenRingMLStatsRingPollEvents, rhs.tokenRingMLStatsRingPollEvents).append(tokenRingMLStatsOwner, rhs.tokenRingMLStatsOwner).append(tokenRingMLStatsStatus, rhs.tokenRingMLStatsStatus).append(_index, rhs._index).isEquals();
    }

    public TokenRingMLStatsEntry clone() {
        TokenRingMLStatsEntry _copy = new TokenRingMLStatsEntry();
        _copy.tokenRingMLStatsIndex = tokenRingMLStatsIndex;
        _copy.tokenRingMLStatsDataSource = tokenRingMLStatsDataSource;
        _copy.tokenRingMLStatsDropEvents = tokenRingMLStatsDropEvents;
        _copy.tokenRingMLStatsMacOctets = tokenRingMLStatsMacOctets;
        _copy.tokenRingMLStatsMacPkts = tokenRingMLStatsMacPkts;
        _copy.tokenRingMLStatsRingPurgeEvents = tokenRingMLStatsRingPurgeEvents;
        _copy.tokenRingMLStatsRingPurgePkts = tokenRingMLStatsRingPurgePkts;
        _copy.tokenRingMLStatsBeaconEvents = tokenRingMLStatsBeaconEvents;
        _copy.tokenRingMLStatsBeaconTime = tokenRingMLStatsBeaconTime;
        _copy.tokenRingMLStatsBeaconPkts = tokenRingMLStatsBeaconPkts;
        _copy.tokenRingMLStatsClaimTokenEvents = tokenRingMLStatsClaimTokenEvents;
        _copy.tokenRingMLStatsClaimTokenPkts = tokenRingMLStatsClaimTokenPkts;
        _copy.tokenRingMLStatsNAUNChanges = tokenRingMLStatsNAUNChanges;
        _copy.tokenRingMLStatsLineErrors = tokenRingMLStatsLineErrors;
        _copy.tokenRingMLStatsInternalErrors = tokenRingMLStatsInternalErrors;
        _copy.tokenRingMLStatsBurstErrors = tokenRingMLStatsBurstErrors;
        _copy.tokenRingMLStatsACErrors = tokenRingMLStatsACErrors;
        _copy.tokenRingMLStatsAbortErrors = tokenRingMLStatsAbortErrors;
        _copy.tokenRingMLStatsLostFrameErrors = tokenRingMLStatsLostFrameErrors;
        _copy.tokenRingMLStatsCongestionErrors = tokenRingMLStatsCongestionErrors;
        _copy.tokenRingMLStatsFrameCopiedErrors = tokenRingMLStatsFrameCopiedErrors;
        _copy.tokenRingMLStatsFrequencyErrors = tokenRingMLStatsFrequencyErrors;
        _copy.tokenRingMLStatsTokenErrors = tokenRingMLStatsTokenErrors;
        _copy.tokenRingMLStatsSoftErrorReports = tokenRingMLStatsSoftErrorReports;
        _copy.tokenRingMLStatsRingPollEvents = tokenRingMLStatsRingPollEvents;
        _copy.tokenRingMLStatsOwner = tokenRingMLStatsOwner;
        _copy.tokenRingMLStatsStatus = tokenRingMLStatsStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.1.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tokenRingMLStatsIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "tokenRingMLStatsDataSource", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "tokenRingMLStatsDropEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "tokenRingMLStatsMacOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "tokenRingMLStatsMacPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "tokenRingMLStatsRingPurgeEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "tokenRingMLStatsRingPurgePkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "tokenRingMLStatsBeaconEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "tokenRingMLStatsBeaconTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "tokenRingMLStatsBeaconPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "tokenRingMLStatsClaimTokenEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "tokenRingMLStatsClaimTokenPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "tokenRingMLStatsNAUNChanges", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "tokenRingMLStatsLineErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "tokenRingMLStatsInternalErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "tokenRingMLStatsBurstErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "tokenRingMLStatsACErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "tokenRingMLStatsAbortErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "tokenRingMLStatsLostFrameErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "tokenRingMLStatsCongestionErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "tokenRingMLStatsFrameCopiedErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "tokenRingMLStatsFrequencyErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "tokenRingMLStatsTokenErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "tokenRingMLStatsSoftErrorReports", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "tokenRingMLStatsRingPollEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "tokenRingMLStatsOwner", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "tokenRingMLStatsStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
