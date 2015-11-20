
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history.tokenringmlhistorytable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history.TokenRingMLHistoryTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.tokenringmlhistorytable.ITokenRingMLHistoryEntry;
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

public class TokenRingMLHistoryEntry
    extends DeviceEntity
    implements Serializable, ITokenRingMLHistoryEntry, IIndexed, IVariableBindingSetter
{

    private int tokenRingMLHistoryIndex;
    private int tokenRingMLHistorySampleIndex;
    private int tokenRingMLHistoryIntervalStart;
    private int tokenRingMLHistoryDropEvents;
    private int tokenRingMLHistoryMacOctets;
    private int tokenRingMLHistoryMacPkts;
    private int tokenRingMLHistoryRingPurgeEvents;
    private int tokenRingMLHistoryRingPurgePkts;
    private int tokenRingMLHistoryBeaconEvents;
    private int tokenRingMLHistoryBeaconTime;
    private int tokenRingMLHistoryBeaconPkts;
    private int tokenRingMLHistoryClaimTokenEvents;
    private int tokenRingMLHistoryClaimTokenPkts;
    private int tokenRingMLHistoryNAUNChanges;
    private int tokenRingMLHistoryLineErrors;
    private int tokenRingMLHistoryInternalErrors;
    private int tokenRingMLHistoryBurstErrors;
    private int tokenRingMLHistoryACErrors;
    private int tokenRingMLHistoryAbortErrors;
    private int tokenRingMLHistoryLostFrameErrors;
    private int tokenRingMLHistoryCongestionErrors;
    private int tokenRingMLHistoryFrameCopiedErrors;
    private int tokenRingMLHistoryFrequencyErrors;
    private int tokenRingMLHistoryTokenErrors;
    private int tokenRingMLHistorySoftErrorReports;
    private int tokenRingMLHistoryRingPollEvents;
    private int tokenRingMLHistoryActiveStations;
    private String _index;
    private TokenRingMLHistoryTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TokenRingMLHistoryEntry() {
    }

    public int getTokenRingMLHistoryIndex() {
        return this.tokenRingMLHistoryIndex;
    }

    public void setTokenRingMLHistoryIndex(int tokenRingMLHistoryIndex) {
        int oldValue = getTokenRingMLHistoryIndex();
        this.tokenRingMLHistoryIndex = tokenRingMLHistoryIndex;
        notifyChange(1, oldValue, tokenRingMLHistoryIndex);
    }

    public int getTokenRingMLHistorySampleIndex() {
        return this.tokenRingMLHistorySampleIndex;
    }

    public void setTokenRingMLHistorySampleIndex(int tokenRingMLHistorySampleIndex) {
        int oldValue = getTokenRingMLHistorySampleIndex();
        this.tokenRingMLHistorySampleIndex = tokenRingMLHistorySampleIndex;
        notifyChange(2, oldValue, tokenRingMLHistorySampleIndex);
    }

    public int getTokenRingMLHistoryIntervalStart() {
        return this.tokenRingMLHistoryIntervalStart;
    }

    public void setTokenRingMLHistoryIntervalStart(int tokenRingMLHistoryIntervalStart) {
        int oldValue = getTokenRingMLHistoryIntervalStart();
        this.tokenRingMLHistoryIntervalStart = tokenRingMLHistoryIntervalStart;
        notifyChange(3, oldValue, tokenRingMLHistoryIntervalStart);
    }

    public int getTokenRingMLHistoryDropEvents() {
        return this.tokenRingMLHistoryDropEvents;
    }

    public void setTokenRingMLHistoryDropEvents(int tokenRingMLHistoryDropEvents) {
        int oldValue = getTokenRingMLHistoryDropEvents();
        this.tokenRingMLHistoryDropEvents = tokenRingMLHistoryDropEvents;
        notifyChange(4, oldValue, tokenRingMLHistoryDropEvents);
    }

    public int getTokenRingMLHistoryMacOctets() {
        return this.tokenRingMLHistoryMacOctets;
    }

    public void setTokenRingMLHistoryMacOctets(int tokenRingMLHistoryMacOctets) {
        int oldValue = getTokenRingMLHistoryMacOctets();
        this.tokenRingMLHistoryMacOctets = tokenRingMLHistoryMacOctets;
        notifyChange(5, oldValue, tokenRingMLHistoryMacOctets);
    }

    public int getTokenRingMLHistoryMacPkts() {
        return this.tokenRingMLHistoryMacPkts;
    }

    public void setTokenRingMLHistoryMacPkts(int tokenRingMLHistoryMacPkts) {
        int oldValue = getTokenRingMLHistoryMacPkts();
        this.tokenRingMLHistoryMacPkts = tokenRingMLHistoryMacPkts;
        notifyChange(6, oldValue, tokenRingMLHistoryMacPkts);
    }

    public int getTokenRingMLHistoryRingPurgeEvents() {
        return this.tokenRingMLHistoryRingPurgeEvents;
    }

    public void setTokenRingMLHistoryRingPurgeEvents(int tokenRingMLHistoryRingPurgeEvents) {
        int oldValue = getTokenRingMLHistoryRingPurgeEvents();
        this.tokenRingMLHistoryRingPurgeEvents = tokenRingMLHistoryRingPurgeEvents;
        notifyChange(7, oldValue, tokenRingMLHistoryRingPurgeEvents);
    }

    public int getTokenRingMLHistoryRingPurgePkts() {
        return this.tokenRingMLHistoryRingPurgePkts;
    }

    public void setTokenRingMLHistoryRingPurgePkts(int tokenRingMLHistoryRingPurgePkts) {
        int oldValue = getTokenRingMLHistoryRingPurgePkts();
        this.tokenRingMLHistoryRingPurgePkts = tokenRingMLHistoryRingPurgePkts;
        notifyChange(8, oldValue, tokenRingMLHistoryRingPurgePkts);
    }

    public int getTokenRingMLHistoryBeaconEvents() {
        return this.tokenRingMLHistoryBeaconEvents;
    }

    public void setTokenRingMLHistoryBeaconEvents(int tokenRingMLHistoryBeaconEvents) {
        int oldValue = getTokenRingMLHistoryBeaconEvents();
        this.tokenRingMLHistoryBeaconEvents = tokenRingMLHistoryBeaconEvents;
        notifyChange(9, oldValue, tokenRingMLHistoryBeaconEvents);
    }

    public int getTokenRingMLHistoryBeaconTime() {
        return this.tokenRingMLHistoryBeaconTime;
    }

    public void setTokenRingMLHistoryBeaconTime(int tokenRingMLHistoryBeaconTime) {
        int oldValue = getTokenRingMLHistoryBeaconTime();
        this.tokenRingMLHistoryBeaconTime = tokenRingMLHistoryBeaconTime;
        notifyChange(10, oldValue, tokenRingMLHistoryBeaconTime);
    }

    public int getTokenRingMLHistoryBeaconPkts() {
        return this.tokenRingMLHistoryBeaconPkts;
    }

    public void setTokenRingMLHistoryBeaconPkts(int tokenRingMLHistoryBeaconPkts) {
        int oldValue = getTokenRingMLHistoryBeaconPkts();
        this.tokenRingMLHistoryBeaconPkts = tokenRingMLHistoryBeaconPkts;
        notifyChange(11, oldValue, tokenRingMLHistoryBeaconPkts);
    }

    public int getTokenRingMLHistoryClaimTokenEvents() {
        return this.tokenRingMLHistoryClaimTokenEvents;
    }

    public void setTokenRingMLHistoryClaimTokenEvents(int tokenRingMLHistoryClaimTokenEvents) {
        int oldValue = getTokenRingMLHistoryClaimTokenEvents();
        this.tokenRingMLHistoryClaimTokenEvents = tokenRingMLHistoryClaimTokenEvents;
        notifyChange(12, oldValue, tokenRingMLHistoryClaimTokenEvents);
    }

    public int getTokenRingMLHistoryClaimTokenPkts() {
        return this.tokenRingMLHistoryClaimTokenPkts;
    }

    public void setTokenRingMLHistoryClaimTokenPkts(int tokenRingMLHistoryClaimTokenPkts) {
        int oldValue = getTokenRingMLHistoryClaimTokenPkts();
        this.tokenRingMLHistoryClaimTokenPkts = tokenRingMLHistoryClaimTokenPkts;
        notifyChange(13, oldValue, tokenRingMLHistoryClaimTokenPkts);
    }

    public int getTokenRingMLHistoryNAUNChanges() {
        return this.tokenRingMLHistoryNAUNChanges;
    }

    public void setTokenRingMLHistoryNAUNChanges(int tokenRingMLHistoryNAUNChanges) {
        int oldValue = getTokenRingMLHistoryNAUNChanges();
        this.tokenRingMLHistoryNAUNChanges = tokenRingMLHistoryNAUNChanges;
        notifyChange(14, oldValue, tokenRingMLHistoryNAUNChanges);
    }

    public int getTokenRingMLHistoryLineErrors() {
        return this.tokenRingMLHistoryLineErrors;
    }

    public void setTokenRingMLHistoryLineErrors(int tokenRingMLHistoryLineErrors) {
        int oldValue = getTokenRingMLHistoryLineErrors();
        this.tokenRingMLHistoryLineErrors = tokenRingMLHistoryLineErrors;
        notifyChange(15, oldValue, tokenRingMLHistoryLineErrors);
    }

    public int getTokenRingMLHistoryInternalErrors() {
        return this.tokenRingMLHistoryInternalErrors;
    }

    public void setTokenRingMLHistoryInternalErrors(int tokenRingMLHistoryInternalErrors) {
        int oldValue = getTokenRingMLHistoryInternalErrors();
        this.tokenRingMLHistoryInternalErrors = tokenRingMLHistoryInternalErrors;
        notifyChange(16, oldValue, tokenRingMLHistoryInternalErrors);
    }

    public int getTokenRingMLHistoryBurstErrors() {
        return this.tokenRingMLHistoryBurstErrors;
    }

    public void setTokenRingMLHistoryBurstErrors(int tokenRingMLHistoryBurstErrors) {
        int oldValue = getTokenRingMLHistoryBurstErrors();
        this.tokenRingMLHistoryBurstErrors = tokenRingMLHistoryBurstErrors;
        notifyChange(17, oldValue, tokenRingMLHistoryBurstErrors);
    }

    public int getTokenRingMLHistoryACErrors() {
        return this.tokenRingMLHistoryACErrors;
    }

    public void setTokenRingMLHistoryACErrors(int tokenRingMLHistoryACErrors) {
        int oldValue = getTokenRingMLHistoryACErrors();
        this.tokenRingMLHistoryACErrors = tokenRingMLHistoryACErrors;
        notifyChange(18, oldValue, tokenRingMLHistoryACErrors);
    }

    public int getTokenRingMLHistoryAbortErrors() {
        return this.tokenRingMLHistoryAbortErrors;
    }

    public void setTokenRingMLHistoryAbortErrors(int tokenRingMLHistoryAbortErrors) {
        int oldValue = getTokenRingMLHistoryAbortErrors();
        this.tokenRingMLHistoryAbortErrors = tokenRingMLHistoryAbortErrors;
        notifyChange(19, oldValue, tokenRingMLHistoryAbortErrors);
    }

    public int getTokenRingMLHistoryLostFrameErrors() {
        return this.tokenRingMLHistoryLostFrameErrors;
    }

    public void setTokenRingMLHistoryLostFrameErrors(int tokenRingMLHistoryLostFrameErrors) {
        int oldValue = getTokenRingMLHistoryLostFrameErrors();
        this.tokenRingMLHistoryLostFrameErrors = tokenRingMLHistoryLostFrameErrors;
        notifyChange(20, oldValue, tokenRingMLHistoryLostFrameErrors);
    }

    public int getTokenRingMLHistoryCongestionErrors() {
        return this.tokenRingMLHistoryCongestionErrors;
    }

    public void setTokenRingMLHistoryCongestionErrors(int tokenRingMLHistoryCongestionErrors) {
        int oldValue = getTokenRingMLHistoryCongestionErrors();
        this.tokenRingMLHistoryCongestionErrors = tokenRingMLHistoryCongestionErrors;
        notifyChange(21, oldValue, tokenRingMLHistoryCongestionErrors);
    }

    public int getTokenRingMLHistoryFrameCopiedErrors() {
        return this.tokenRingMLHistoryFrameCopiedErrors;
    }

    public void setTokenRingMLHistoryFrameCopiedErrors(int tokenRingMLHistoryFrameCopiedErrors) {
        int oldValue = getTokenRingMLHistoryFrameCopiedErrors();
        this.tokenRingMLHistoryFrameCopiedErrors = tokenRingMLHistoryFrameCopiedErrors;
        notifyChange(22, oldValue, tokenRingMLHistoryFrameCopiedErrors);
    }

    public int getTokenRingMLHistoryFrequencyErrors() {
        return this.tokenRingMLHistoryFrequencyErrors;
    }

    public void setTokenRingMLHistoryFrequencyErrors(int tokenRingMLHistoryFrequencyErrors) {
        int oldValue = getTokenRingMLHistoryFrequencyErrors();
        this.tokenRingMLHistoryFrequencyErrors = tokenRingMLHistoryFrequencyErrors;
        notifyChange(23, oldValue, tokenRingMLHistoryFrequencyErrors);
    }

    public int getTokenRingMLHistoryTokenErrors() {
        return this.tokenRingMLHistoryTokenErrors;
    }

    public void setTokenRingMLHistoryTokenErrors(int tokenRingMLHistoryTokenErrors) {
        int oldValue = getTokenRingMLHistoryTokenErrors();
        this.tokenRingMLHistoryTokenErrors = tokenRingMLHistoryTokenErrors;
        notifyChange(24, oldValue, tokenRingMLHistoryTokenErrors);
    }

    public int getTokenRingMLHistorySoftErrorReports() {
        return this.tokenRingMLHistorySoftErrorReports;
    }

    public void setTokenRingMLHistorySoftErrorReports(int tokenRingMLHistorySoftErrorReports) {
        int oldValue = getTokenRingMLHistorySoftErrorReports();
        this.tokenRingMLHistorySoftErrorReports = tokenRingMLHistorySoftErrorReports;
        notifyChange(25, oldValue, tokenRingMLHistorySoftErrorReports);
    }

    public int getTokenRingMLHistoryRingPollEvents() {
        return this.tokenRingMLHistoryRingPollEvents;
    }

    public void setTokenRingMLHistoryRingPollEvents(int tokenRingMLHistoryRingPollEvents) {
        int oldValue = getTokenRingMLHistoryRingPollEvents();
        this.tokenRingMLHistoryRingPollEvents = tokenRingMLHistoryRingPollEvents;
        notifyChange(26, oldValue, tokenRingMLHistoryRingPollEvents);
    }

    public int getTokenRingMLHistoryActiveStations() {
        return this.tokenRingMLHistoryActiveStations;
    }

    public void setTokenRingMLHistoryActiveStations(int tokenRingMLHistoryActiveStations) {
        int oldValue = getTokenRingMLHistoryActiveStations();
        this.tokenRingMLHistoryActiveStations = tokenRingMLHistoryActiveStations;
        notifyChange(27, oldValue, tokenRingMLHistoryActiveStations);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setTokenRingMLHistoryIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setTokenRingMLHistorySampleIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setTokenRingMLHistoryIntervalStart(binding.getVariable().toInt());
                break;
            case  4 :
                setTokenRingMLHistoryDropEvents(binding.getVariable().toInt());
                break;
            case  5 :
                setTokenRingMLHistoryMacOctets(binding.getVariable().toInt());
                break;
            case  6 :
                setTokenRingMLHistoryMacPkts(binding.getVariable().toInt());
                break;
            case  7 :
                setTokenRingMLHistoryRingPurgeEvents(binding.getVariable().toInt());
                break;
            case  8 :
                setTokenRingMLHistoryRingPurgePkts(binding.getVariable().toInt());
                break;
            case  9 :
                setTokenRingMLHistoryBeaconEvents(binding.getVariable().toInt());
                break;
            case  10 :
                setTokenRingMLHistoryBeaconTime(binding.getVariable().toInt());
                break;
            case  11 :
                setTokenRingMLHistoryBeaconPkts(binding.getVariable().toInt());
                break;
            case  12 :
                setTokenRingMLHistoryClaimTokenEvents(binding.getVariable().toInt());
                break;
            case  13 :
                setTokenRingMLHistoryClaimTokenPkts(binding.getVariable().toInt());
                break;
            case  14 :
                setTokenRingMLHistoryNAUNChanges(binding.getVariable().toInt());
                break;
            case  15 :
                setTokenRingMLHistoryLineErrors(binding.getVariable().toInt());
                break;
            case  16 :
                setTokenRingMLHistoryInternalErrors(binding.getVariable().toInt());
                break;
            case  17 :
                setTokenRingMLHistoryBurstErrors(binding.getVariable().toInt());
                break;
            case  18 :
                setTokenRingMLHistoryACErrors(binding.getVariable().toInt());
                break;
            case  19 :
                setTokenRingMLHistoryAbortErrors(binding.getVariable().toInt());
                break;
            case  20 :
                setTokenRingMLHistoryLostFrameErrors(binding.getVariable().toInt());
                break;
            case  21 :
                setTokenRingMLHistoryCongestionErrors(binding.getVariable().toInt());
                break;
            case  22 :
                setTokenRingMLHistoryFrameCopiedErrors(binding.getVariable().toInt());
                break;
            case  23 :
                setTokenRingMLHistoryFrequencyErrors(binding.getVariable().toInt());
                break;
            case  24 :
                setTokenRingMLHistoryTokenErrors(binding.getVariable().toInt());
                break;
            case  25 :
                setTokenRingMLHistorySoftErrorReports(binding.getVariable().toInt());
                break;
            case  26 :
                setTokenRingMLHistoryRingPollEvents(binding.getVariable().toInt());
                break;
            case  27 :
                setTokenRingMLHistoryActiveStations(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setTokenRingMLHistoryIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setTokenRingMLHistorySampleIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(TokenRingMLHistoryTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tokenRingMLHistoryIndex", tokenRingMLHistoryIndex).append("tokenRingMLHistorySampleIndex", tokenRingMLHistorySampleIndex).append("tokenRingMLHistoryIntervalStart", tokenRingMLHistoryIntervalStart).append("tokenRingMLHistoryDropEvents", tokenRingMLHistoryDropEvents).append("tokenRingMLHistoryMacOctets", tokenRingMLHistoryMacOctets).append("tokenRingMLHistoryMacPkts", tokenRingMLHistoryMacPkts).append("tokenRingMLHistoryRingPurgeEvents", tokenRingMLHistoryRingPurgeEvents).append("tokenRingMLHistoryRingPurgePkts", tokenRingMLHistoryRingPurgePkts).append("tokenRingMLHistoryBeaconEvents", tokenRingMLHistoryBeaconEvents).append("tokenRingMLHistoryBeaconTime", tokenRingMLHistoryBeaconTime).append("tokenRingMLHistoryBeaconPkts", tokenRingMLHistoryBeaconPkts).append("tokenRingMLHistoryClaimTokenEvents", tokenRingMLHistoryClaimTokenEvents).append("tokenRingMLHistoryClaimTokenPkts", tokenRingMLHistoryClaimTokenPkts).append("tokenRingMLHistoryNAUNChanges", tokenRingMLHistoryNAUNChanges).append("tokenRingMLHistoryLineErrors", tokenRingMLHistoryLineErrors).append("tokenRingMLHistoryInternalErrors", tokenRingMLHistoryInternalErrors).append("tokenRingMLHistoryBurstErrors", tokenRingMLHistoryBurstErrors).append("tokenRingMLHistoryACErrors", tokenRingMLHistoryACErrors).append("tokenRingMLHistoryAbortErrors", tokenRingMLHistoryAbortErrors).append("tokenRingMLHistoryLostFrameErrors", tokenRingMLHistoryLostFrameErrors).append("tokenRingMLHistoryCongestionErrors", tokenRingMLHistoryCongestionErrors).append("tokenRingMLHistoryFrameCopiedErrors", tokenRingMLHistoryFrameCopiedErrors).append("tokenRingMLHistoryFrequencyErrors", tokenRingMLHistoryFrequencyErrors).append("tokenRingMLHistoryTokenErrors", tokenRingMLHistoryTokenErrors).append("tokenRingMLHistorySoftErrorReports", tokenRingMLHistorySoftErrorReports).append("tokenRingMLHistoryRingPollEvents", tokenRingMLHistoryRingPollEvents).append("tokenRingMLHistoryActiveStations", tokenRingMLHistoryActiveStations).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tokenRingMLHistoryIndex).append(tokenRingMLHistorySampleIndex).append(tokenRingMLHistoryIntervalStart).append(tokenRingMLHistoryDropEvents).append(tokenRingMLHistoryMacOctets).append(tokenRingMLHistoryMacPkts).append(tokenRingMLHistoryRingPurgeEvents).append(tokenRingMLHistoryRingPurgePkts).append(tokenRingMLHistoryBeaconEvents).append(tokenRingMLHistoryBeaconTime).append(tokenRingMLHistoryBeaconPkts).append(tokenRingMLHistoryClaimTokenEvents).append(tokenRingMLHistoryClaimTokenPkts).append(tokenRingMLHistoryNAUNChanges).append(tokenRingMLHistoryLineErrors).append(tokenRingMLHistoryInternalErrors).append(tokenRingMLHistoryBurstErrors).append(tokenRingMLHistoryACErrors).append(tokenRingMLHistoryAbortErrors).append(tokenRingMLHistoryLostFrameErrors).append(tokenRingMLHistoryCongestionErrors).append(tokenRingMLHistoryFrameCopiedErrors).append(tokenRingMLHistoryFrequencyErrors).append(tokenRingMLHistoryTokenErrors).append(tokenRingMLHistorySoftErrorReports).append(tokenRingMLHistoryRingPollEvents).append(tokenRingMLHistoryActiveStations).append(_index).toHashCode();
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
        TokenRingMLHistoryEntry rhs = ((TokenRingMLHistoryEntry) obj);
        return new EqualsBuilder().append(tokenRingMLHistoryIndex, rhs.tokenRingMLHistoryIndex).append(tokenRingMLHistorySampleIndex, rhs.tokenRingMLHistorySampleIndex).append(tokenRingMLHistoryIntervalStart, rhs.tokenRingMLHistoryIntervalStart).append(tokenRingMLHistoryDropEvents, rhs.tokenRingMLHistoryDropEvents).append(tokenRingMLHistoryMacOctets, rhs.tokenRingMLHistoryMacOctets).append(tokenRingMLHistoryMacPkts, rhs.tokenRingMLHistoryMacPkts).append(tokenRingMLHistoryRingPurgeEvents, rhs.tokenRingMLHistoryRingPurgeEvents).append(tokenRingMLHistoryRingPurgePkts, rhs.tokenRingMLHistoryRingPurgePkts).append(tokenRingMLHistoryBeaconEvents, rhs.tokenRingMLHistoryBeaconEvents).append(tokenRingMLHistoryBeaconTime, rhs.tokenRingMLHistoryBeaconTime).append(tokenRingMLHistoryBeaconPkts, rhs.tokenRingMLHistoryBeaconPkts).append(tokenRingMLHistoryClaimTokenEvents, rhs.tokenRingMLHistoryClaimTokenEvents).append(tokenRingMLHistoryClaimTokenPkts, rhs.tokenRingMLHistoryClaimTokenPkts).append(tokenRingMLHistoryNAUNChanges, rhs.tokenRingMLHistoryNAUNChanges).append(tokenRingMLHistoryLineErrors, rhs.tokenRingMLHistoryLineErrors).append(tokenRingMLHistoryInternalErrors, rhs.tokenRingMLHistoryInternalErrors).append(tokenRingMLHistoryBurstErrors, rhs.tokenRingMLHistoryBurstErrors).append(tokenRingMLHistoryACErrors, rhs.tokenRingMLHistoryACErrors).append(tokenRingMLHistoryAbortErrors, rhs.tokenRingMLHistoryAbortErrors).append(tokenRingMLHistoryLostFrameErrors, rhs.tokenRingMLHistoryLostFrameErrors).append(tokenRingMLHistoryCongestionErrors, rhs.tokenRingMLHistoryCongestionErrors).append(tokenRingMLHistoryFrameCopiedErrors, rhs.tokenRingMLHistoryFrameCopiedErrors).append(tokenRingMLHistoryFrequencyErrors, rhs.tokenRingMLHistoryFrequencyErrors).append(tokenRingMLHistoryTokenErrors, rhs.tokenRingMLHistoryTokenErrors).append(tokenRingMLHistorySoftErrorReports, rhs.tokenRingMLHistorySoftErrorReports).append(tokenRingMLHistoryRingPollEvents, rhs.tokenRingMLHistoryRingPollEvents).append(tokenRingMLHistoryActiveStations, rhs.tokenRingMLHistoryActiveStations).append(_index, rhs._index).isEquals();
    }

    public TokenRingMLHistoryEntry clone() {
        TokenRingMLHistoryEntry _copy = new TokenRingMLHistoryEntry();
        _copy.tokenRingMLHistoryIndex = tokenRingMLHistoryIndex;
        _copy.tokenRingMLHistorySampleIndex = tokenRingMLHistorySampleIndex;
        _copy.tokenRingMLHistoryIntervalStart = tokenRingMLHistoryIntervalStart;
        _copy.tokenRingMLHistoryDropEvents = tokenRingMLHistoryDropEvents;
        _copy.tokenRingMLHistoryMacOctets = tokenRingMLHistoryMacOctets;
        _copy.tokenRingMLHistoryMacPkts = tokenRingMLHistoryMacPkts;
        _copy.tokenRingMLHistoryRingPurgeEvents = tokenRingMLHistoryRingPurgeEvents;
        _copy.tokenRingMLHistoryRingPurgePkts = tokenRingMLHistoryRingPurgePkts;
        _copy.tokenRingMLHistoryBeaconEvents = tokenRingMLHistoryBeaconEvents;
        _copy.tokenRingMLHistoryBeaconTime = tokenRingMLHistoryBeaconTime;
        _copy.tokenRingMLHistoryBeaconPkts = tokenRingMLHistoryBeaconPkts;
        _copy.tokenRingMLHistoryClaimTokenEvents = tokenRingMLHistoryClaimTokenEvents;
        _copy.tokenRingMLHistoryClaimTokenPkts = tokenRingMLHistoryClaimTokenPkts;
        _copy.tokenRingMLHistoryNAUNChanges = tokenRingMLHistoryNAUNChanges;
        _copy.tokenRingMLHistoryLineErrors = tokenRingMLHistoryLineErrors;
        _copy.tokenRingMLHistoryInternalErrors = tokenRingMLHistoryInternalErrors;
        _copy.tokenRingMLHistoryBurstErrors = tokenRingMLHistoryBurstErrors;
        _copy.tokenRingMLHistoryACErrors = tokenRingMLHistoryACErrors;
        _copy.tokenRingMLHistoryAbortErrors = tokenRingMLHistoryAbortErrors;
        _copy.tokenRingMLHistoryLostFrameErrors = tokenRingMLHistoryLostFrameErrors;
        _copy.tokenRingMLHistoryCongestionErrors = tokenRingMLHistoryCongestionErrors;
        _copy.tokenRingMLHistoryFrameCopiedErrors = tokenRingMLHistoryFrameCopiedErrors;
        _copy.tokenRingMLHistoryFrequencyErrors = tokenRingMLHistoryFrequencyErrors;
        _copy.tokenRingMLHistoryTokenErrors = tokenRingMLHistoryTokenErrors;
        _copy.tokenRingMLHistorySoftErrorReports = tokenRingMLHistorySoftErrorReports;
        _copy.tokenRingMLHistoryRingPollEvents = tokenRingMLHistoryRingPollEvents;
        _copy.tokenRingMLHistoryActiveStations = tokenRingMLHistoryActiveStations;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.2.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tokenRingMLHistoryIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "tokenRingMLHistorySampleIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "tokenRingMLHistoryIntervalStart", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "tokenRingMLHistoryDropEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "tokenRingMLHistoryMacOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "tokenRingMLHistoryMacPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "tokenRingMLHistoryRingPurgeEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "tokenRingMLHistoryRingPurgePkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "tokenRingMLHistoryBeaconEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "tokenRingMLHistoryBeaconTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "tokenRingMLHistoryBeaconPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "tokenRingMLHistoryClaimTokenEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "tokenRingMLHistoryClaimTokenPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "tokenRingMLHistoryNAUNChanges", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "tokenRingMLHistoryLineErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "tokenRingMLHistoryInternalErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "tokenRingMLHistoryBurstErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "tokenRingMLHistoryACErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "tokenRingMLHistoryAbortErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "tokenRingMLHistoryLostFrameErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "tokenRingMLHistoryCongestionErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "tokenRingMLHistoryFrameCopiedErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "tokenRingMLHistoryFrequencyErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "tokenRingMLHistoryTokenErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "tokenRingMLHistorySoftErrorReports", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "tokenRingMLHistoryRingPollEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "tokenRingMLHistoryActiveStations", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
