
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history.tokenringphistorytable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history.TokenRingPHistoryTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.tokenringphistorytable.ITokenRingPHistoryEntry;
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

public class TokenRingPHistoryEntry
    extends DeviceEntity
    implements Serializable, ITokenRingPHistoryEntry, IIndexed, IVariableBindingSetter
{

    private int tokenRingPHistoryIndex;
    private int tokenRingPHistorySampleIndex;
    private int tokenRingPHistoryIntervalStart;
    private int tokenRingPHistoryDropEvents;
    private int tokenRingPHistoryDataOctets;
    private int tokenRingPHistoryDataPkts;
    private int tokenRingPHistoryDataBroadcastPkts;
    private int tokenRingPHistoryDataMulticastPkts;
    private int tokenRingPHistoryDataPkts18to63Octets;
    private int tokenRingPHistoryDataPkts64to127Octets;
    private int tokenRingPHistoryDataPkts128to255Octets;
    private int tokenRingPHistoryDataPkts256to511Octets;
    private int tokenRingPHistoryDataPkts512to1023Octets;
    private int tokenRingPHistoryDataPkts1024to2047Octets;
    private int tokenRingPHistoryDataPkts2048to4095Octets;
    private int tokenRingPHistoryDataPkts4096to8191Octets;
    private int tokenRingPHistoryDataPkts8192to18000Octets;
    private int tokenRingPHistoryDataPktsGreaterThan18000Octets;
    private String _index;
    private TokenRingPHistoryTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TokenRingPHistoryEntry() {
    }

    public int getTokenRingPHistoryIndex() {
        return this.tokenRingPHistoryIndex;
    }

    public void setTokenRingPHistoryIndex(int tokenRingPHistoryIndex) {
        int oldValue = getTokenRingPHistoryIndex();
        this.tokenRingPHistoryIndex = tokenRingPHistoryIndex;
        notifyChange(1, oldValue, tokenRingPHistoryIndex);
    }

    public int getTokenRingPHistorySampleIndex() {
        return this.tokenRingPHistorySampleIndex;
    }

    public void setTokenRingPHistorySampleIndex(int tokenRingPHistorySampleIndex) {
        int oldValue = getTokenRingPHistorySampleIndex();
        this.tokenRingPHistorySampleIndex = tokenRingPHistorySampleIndex;
        notifyChange(2, oldValue, tokenRingPHistorySampleIndex);
    }

    public int getTokenRingPHistoryIntervalStart() {
        return this.tokenRingPHistoryIntervalStart;
    }

    public void setTokenRingPHistoryIntervalStart(int tokenRingPHistoryIntervalStart) {
        int oldValue = getTokenRingPHistoryIntervalStart();
        this.tokenRingPHistoryIntervalStart = tokenRingPHistoryIntervalStart;
        notifyChange(3, oldValue, tokenRingPHistoryIntervalStart);
    }

    public int getTokenRingPHistoryDropEvents() {
        return this.tokenRingPHistoryDropEvents;
    }

    public void setTokenRingPHistoryDropEvents(int tokenRingPHistoryDropEvents) {
        int oldValue = getTokenRingPHistoryDropEvents();
        this.tokenRingPHistoryDropEvents = tokenRingPHistoryDropEvents;
        notifyChange(4, oldValue, tokenRingPHistoryDropEvents);
    }

    public int getTokenRingPHistoryDataOctets() {
        return this.tokenRingPHistoryDataOctets;
    }

    public void setTokenRingPHistoryDataOctets(int tokenRingPHistoryDataOctets) {
        int oldValue = getTokenRingPHistoryDataOctets();
        this.tokenRingPHistoryDataOctets = tokenRingPHistoryDataOctets;
        notifyChange(5, oldValue, tokenRingPHistoryDataOctets);
    }

    public int getTokenRingPHistoryDataPkts() {
        return this.tokenRingPHistoryDataPkts;
    }

    public void setTokenRingPHistoryDataPkts(int tokenRingPHistoryDataPkts) {
        int oldValue = getTokenRingPHistoryDataPkts();
        this.tokenRingPHistoryDataPkts = tokenRingPHistoryDataPkts;
        notifyChange(6, oldValue, tokenRingPHistoryDataPkts);
    }

    public int getTokenRingPHistoryDataBroadcastPkts() {
        return this.tokenRingPHistoryDataBroadcastPkts;
    }

    public void setTokenRingPHistoryDataBroadcastPkts(int tokenRingPHistoryDataBroadcastPkts) {
        int oldValue = getTokenRingPHistoryDataBroadcastPkts();
        this.tokenRingPHistoryDataBroadcastPkts = tokenRingPHistoryDataBroadcastPkts;
        notifyChange(7, oldValue, tokenRingPHistoryDataBroadcastPkts);
    }

    public int getTokenRingPHistoryDataMulticastPkts() {
        return this.tokenRingPHistoryDataMulticastPkts;
    }

    public void setTokenRingPHistoryDataMulticastPkts(int tokenRingPHistoryDataMulticastPkts) {
        int oldValue = getTokenRingPHistoryDataMulticastPkts();
        this.tokenRingPHistoryDataMulticastPkts = tokenRingPHistoryDataMulticastPkts;
        notifyChange(8, oldValue, tokenRingPHistoryDataMulticastPkts);
    }

    public int getTokenRingPHistoryDataPkts18to63Octets() {
        return this.tokenRingPHistoryDataPkts18to63Octets;
    }

    public void setTokenRingPHistoryDataPkts18to63Octets(int tokenRingPHistoryDataPkts18to63Octets) {
        int oldValue = getTokenRingPHistoryDataPkts18to63Octets();
        this.tokenRingPHistoryDataPkts18to63Octets = tokenRingPHistoryDataPkts18to63Octets;
        notifyChange(9, oldValue, tokenRingPHistoryDataPkts18to63Octets);
    }

    public int getTokenRingPHistoryDataPkts64to127Octets() {
        return this.tokenRingPHistoryDataPkts64to127Octets;
    }

    public void setTokenRingPHistoryDataPkts64to127Octets(int tokenRingPHistoryDataPkts64to127Octets) {
        int oldValue = getTokenRingPHistoryDataPkts64to127Octets();
        this.tokenRingPHistoryDataPkts64to127Octets = tokenRingPHistoryDataPkts64to127Octets;
        notifyChange(10, oldValue, tokenRingPHistoryDataPkts64to127Octets);
    }

    public int getTokenRingPHistoryDataPkts128to255Octets() {
        return this.tokenRingPHistoryDataPkts128to255Octets;
    }

    public void setTokenRingPHistoryDataPkts128to255Octets(int tokenRingPHistoryDataPkts128to255Octets) {
        int oldValue = getTokenRingPHistoryDataPkts128to255Octets();
        this.tokenRingPHistoryDataPkts128to255Octets = tokenRingPHistoryDataPkts128to255Octets;
        notifyChange(11, oldValue, tokenRingPHistoryDataPkts128to255Octets);
    }

    public int getTokenRingPHistoryDataPkts256to511Octets() {
        return this.tokenRingPHistoryDataPkts256to511Octets;
    }

    public void setTokenRingPHistoryDataPkts256to511Octets(int tokenRingPHistoryDataPkts256to511Octets) {
        int oldValue = getTokenRingPHistoryDataPkts256to511Octets();
        this.tokenRingPHistoryDataPkts256to511Octets = tokenRingPHistoryDataPkts256to511Octets;
        notifyChange(12, oldValue, tokenRingPHistoryDataPkts256to511Octets);
    }

    public int getTokenRingPHistoryDataPkts512to1023Octets() {
        return this.tokenRingPHistoryDataPkts512to1023Octets;
    }

    public void setTokenRingPHistoryDataPkts512to1023Octets(int tokenRingPHistoryDataPkts512to1023Octets) {
        int oldValue = getTokenRingPHistoryDataPkts512to1023Octets();
        this.tokenRingPHistoryDataPkts512to1023Octets = tokenRingPHistoryDataPkts512to1023Octets;
        notifyChange(13, oldValue, tokenRingPHistoryDataPkts512to1023Octets);
    }

    public int getTokenRingPHistoryDataPkts1024to2047Octets() {
        return this.tokenRingPHistoryDataPkts1024to2047Octets;
    }

    public void setTokenRingPHistoryDataPkts1024to2047Octets(int tokenRingPHistoryDataPkts1024to2047Octets) {
        int oldValue = getTokenRingPHistoryDataPkts1024to2047Octets();
        this.tokenRingPHistoryDataPkts1024to2047Octets = tokenRingPHistoryDataPkts1024to2047Octets;
        notifyChange(14, oldValue, tokenRingPHistoryDataPkts1024to2047Octets);
    }

    public int getTokenRingPHistoryDataPkts2048to4095Octets() {
        return this.tokenRingPHistoryDataPkts2048to4095Octets;
    }

    public void setTokenRingPHistoryDataPkts2048to4095Octets(int tokenRingPHistoryDataPkts2048to4095Octets) {
        int oldValue = getTokenRingPHistoryDataPkts2048to4095Octets();
        this.tokenRingPHistoryDataPkts2048to4095Octets = tokenRingPHistoryDataPkts2048to4095Octets;
        notifyChange(15, oldValue, tokenRingPHistoryDataPkts2048to4095Octets);
    }

    public int getTokenRingPHistoryDataPkts4096to8191Octets() {
        return this.tokenRingPHistoryDataPkts4096to8191Octets;
    }

    public void setTokenRingPHistoryDataPkts4096to8191Octets(int tokenRingPHistoryDataPkts4096to8191Octets) {
        int oldValue = getTokenRingPHistoryDataPkts4096to8191Octets();
        this.tokenRingPHistoryDataPkts4096to8191Octets = tokenRingPHistoryDataPkts4096to8191Octets;
        notifyChange(16, oldValue, tokenRingPHistoryDataPkts4096to8191Octets);
    }

    public int getTokenRingPHistoryDataPkts8192to18000Octets() {
        return this.tokenRingPHistoryDataPkts8192to18000Octets;
    }

    public void setTokenRingPHistoryDataPkts8192to18000Octets(int tokenRingPHistoryDataPkts8192to18000Octets) {
        int oldValue = getTokenRingPHistoryDataPkts8192to18000Octets();
        this.tokenRingPHistoryDataPkts8192to18000Octets = tokenRingPHistoryDataPkts8192to18000Octets;
        notifyChange(17, oldValue, tokenRingPHistoryDataPkts8192to18000Octets);
    }

    public int getTokenRingPHistoryDataPktsGreaterThan18000Octets() {
        return this.tokenRingPHistoryDataPktsGreaterThan18000Octets;
    }

    public void setTokenRingPHistoryDataPktsGreaterThan18000Octets(int tokenRingPHistoryDataPktsGreaterThan18000Octets) {
        int oldValue = getTokenRingPHistoryDataPktsGreaterThan18000Octets();
        this.tokenRingPHistoryDataPktsGreaterThan18000Octets = tokenRingPHistoryDataPktsGreaterThan18000Octets;
        notifyChange(18, oldValue, tokenRingPHistoryDataPktsGreaterThan18000Octets);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setTokenRingPHistoryIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setTokenRingPHistorySampleIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setTokenRingPHistoryIntervalStart(binding.getVariable().toInt());
                break;
            case  4 :
                setTokenRingPHistoryDropEvents(binding.getVariable().toInt());
                break;
            case  5 :
                setTokenRingPHistoryDataOctets(binding.getVariable().toInt());
                break;
            case  6 :
                setTokenRingPHistoryDataPkts(binding.getVariable().toInt());
                break;
            case  7 :
                setTokenRingPHistoryDataBroadcastPkts(binding.getVariable().toInt());
                break;
            case  8 :
                setTokenRingPHistoryDataMulticastPkts(binding.getVariable().toInt());
                break;
            case  9 :
                setTokenRingPHistoryDataPkts18to63Octets(binding.getVariable().toInt());
                break;
            case  10 :
                setTokenRingPHistoryDataPkts64to127Octets(binding.getVariable().toInt());
                break;
            case  11 :
                setTokenRingPHistoryDataPkts128to255Octets(binding.getVariable().toInt());
                break;
            case  12 :
                setTokenRingPHistoryDataPkts256to511Octets(binding.getVariable().toInt());
                break;
            case  13 :
                setTokenRingPHistoryDataPkts512to1023Octets(binding.getVariable().toInt());
                break;
            case  14 :
                setTokenRingPHistoryDataPkts1024to2047Octets(binding.getVariable().toInt());
                break;
            case  15 :
                setTokenRingPHistoryDataPkts2048to4095Octets(binding.getVariable().toInt());
                break;
            case  16 :
                setTokenRingPHistoryDataPkts4096to8191Octets(binding.getVariable().toInt());
                break;
            case  17 :
                setTokenRingPHistoryDataPkts8192to18000Octets(binding.getVariable().toInt());
                break;
            case  18 :
                setTokenRingPHistoryDataPktsGreaterThan18000Octets(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setTokenRingPHistoryIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setTokenRingPHistorySampleIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(TokenRingPHistoryTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tokenRingPHistoryIndex", tokenRingPHistoryIndex).append("tokenRingPHistorySampleIndex", tokenRingPHistorySampleIndex).append("tokenRingPHistoryIntervalStart", tokenRingPHistoryIntervalStart).append("tokenRingPHistoryDropEvents", tokenRingPHistoryDropEvents).append("tokenRingPHistoryDataOctets", tokenRingPHistoryDataOctets).append("tokenRingPHistoryDataPkts", tokenRingPHistoryDataPkts).append("tokenRingPHistoryDataBroadcastPkts", tokenRingPHistoryDataBroadcastPkts).append("tokenRingPHistoryDataMulticastPkts", tokenRingPHistoryDataMulticastPkts).append("tokenRingPHistoryDataPkts18to63Octets", tokenRingPHistoryDataPkts18to63Octets).append("tokenRingPHistoryDataPkts64to127Octets", tokenRingPHistoryDataPkts64to127Octets).append("tokenRingPHistoryDataPkts128to255Octets", tokenRingPHistoryDataPkts128to255Octets).append("tokenRingPHistoryDataPkts256to511Octets", tokenRingPHistoryDataPkts256to511Octets).append("tokenRingPHistoryDataPkts512to1023Octets", tokenRingPHistoryDataPkts512to1023Octets).append("tokenRingPHistoryDataPkts1024to2047Octets", tokenRingPHistoryDataPkts1024to2047Octets).append("tokenRingPHistoryDataPkts2048to4095Octets", tokenRingPHistoryDataPkts2048to4095Octets).append("tokenRingPHistoryDataPkts4096to8191Octets", tokenRingPHistoryDataPkts4096to8191Octets).append("tokenRingPHistoryDataPkts8192to18000Octets", tokenRingPHistoryDataPkts8192to18000Octets).append("tokenRingPHistoryDataPktsGreaterThan18000Octets", tokenRingPHistoryDataPktsGreaterThan18000Octets).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tokenRingPHistoryIndex).append(tokenRingPHistorySampleIndex).append(tokenRingPHistoryIntervalStart).append(tokenRingPHistoryDropEvents).append(tokenRingPHistoryDataOctets).append(tokenRingPHistoryDataPkts).append(tokenRingPHistoryDataBroadcastPkts).append(tokenRingPHistoryDataMulticastPkts).append(tokenRingPHistoryDataPkts18to63Octets).append(tokenRingPHistoryDataPkts64to127Octets).append(tokenRingPHistoryDataPkts128to255Octets).append(tokenRingPHistoryDataPkts256to511Octets).append(tokenRingPHistoryDataPkts512to1023Octets).append(tokenRingPHistoryDataPkts1024to2047Octets).append(tokenRingPHistoryDataPkts2048to4095Octets).append(tokenRingPHistoryDataPkts4096to8191Octets).append(tokenRingPHistoryDataPkts8192to18000Octets).append(tokenRingPHistoryDataPktsGreaterThan18000Octets).append(_index).toHashCode();
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
        TokenRingPHistoryEntry rhs = ((TokenRingPHistoryEntry) obj);
        return new EqualsBuilder().append(tokenRingPHistoryIndex, rhs.tokenRingPHistoryIndex).append(tokenRingPHistorySampleIndex, rhs.tokenRingPHistorySampleIndex).append(tokenRingPHistoryIntervalStart, rhs.tokenRingPHistoryIntervalStart).append(tokenRingPHistoryDropEvents, rhs.tokenRingPHistoryDropEvents).append(tokenRingPHistoryDataOctets, rhs.tokenRingPHistoryDataOctets).append(tokenRingPHistoryDataPkts, rhs.tokenRingPHistoryDataPkts).append(tokenRingPHistoryDataBroadcastPkts, rhs.tokenRingPHistoryDataBroadcastPkts).append(tokenRingPHistoryDataMulticastPkts, rhs.tokenRingPHistoryDataMulticastPkts).append(tokenRingPHistoryDataPkts18to63Octets, rhs.tokenRingPHistoryDataPkts18to63Octets).append(tokenRingPHistoryDataPkts64to127Octets, rhs.tokenRingPHistoryDataPkts64to127Octets).append(tokenRingPHistoryDataPkts128to255Octets, rhs.tokenRingPHistoryDataPkts128to255Octets).append(tokenRingPHistoryDataPkts256to511Octets, rhs.tokenRingPHistoryDataPkts256to511Octets).append(tokenRingPHistoryDataPkts512to1023Octets, rhs.tokenRingPHistoryDataPkts512to1023Octets).append(tokenRingPHistoryDataPkts1024to2047Octets, rhs.tokenRingPHistoryDataPkts1024to2047Octets).append(tokenRingPHistoryDataPkts2048to4095Octets, rhs.tokenRingPHistoryDataPkts2048to4095Octets).append(tokenRingPHistoryDataPkts4096to8191Octets, rhs.tokenRingPHistoryDataPkts4096to8191Octets).append(tokenRingPHistoryDataPkts8192to18000Octets, rhs.tokenRingPHistoryDataPkts8192to18000Octets).append(tokenRingPHistoryDataPktsGreaterThan18000Octets, rhs.tokenRingPHistoryDataPktsGreaterThan18000Octets).append(_index, rhs._index).isEquals();
    }

    public TokenRingPHistoryEntry clone() {
        TokenRingPHistoryEntry _copy = new TokenRingPHistoryEntry();
        _copy.tokenRingPHistoryIndex = tokenRingPHistoryIndex;
        _copy.tokenRingPHistorySampleIndex = tokenRingPHistorySampleIndex;
        _copy.tokenRingPHistoryIntervalStart = tokenRingPHistoryIntervalStart;
        _copy.tokenRingPHistoryDropEvents = tokenRingPHistoryDropEvents;
        _copy.tokenRingPHistoryDataOctets = tokenRingPHistoryDataOctets;
        _copy.tokenRingPHistoryDataPkts = tokenRingPHistoryDataPkts;
        _copy.tokenRingPHistoryDataBroadcastPkts = tokenRingPHistoryDataBroadcastPkts;
        _copy.tokenRingPHistoryDataMulticastPkts = tokenRingPHistoryDataMulticastPkts;
        _copy.tokenRingPHistoryDataPkts18to63Octets = tokenRingPHistoryDataPkts18to63Octets;
        _copy.tokenRingPHistoryDataPkts64to127Octets = tokenRingPHistoryDataPkts64to127Octets;
        _copy.tokenRingPHistoryDataPkts128to255Octets = tokenRingPHistoryDataPkts128to255Octets;
        _copy.tokenRingPHistoryDataPkts256to511Octets = tokenRingPHistoryDataPkts256to511Octets;
        _copy.tokenRingPHistoryDataPkts512to1023Octets = tokenRingPHistoryDataPkts512to1023Octets;
        _copy.tokenRingPHistoryDataPkts1024to2047Octets = tokenRingPHistoryDataPkts1024to2047Octets;
        _copy.tokenRingPHistoryDataPkts2048to4095Octets = tokenRingPHistoryDataPkts2048to4095Octets;
        _copy.tokenRingPHistoryDataPkts4096to8191Octets = tokenRingPHistoryDataPkts4096to8191Octets;
        _copy.tokenRingPHistoryDataPkts8192to18000Octets = tokenRingPHistoryDataPkts8192to18000Octets;
        _copy.tokenRingPHistoryDataPktsGreaterThan18000Octets = tokenRingPHistoryDataPktsGreaterThan18000Octets;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.2.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tokenRingPHistoryIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "tokenRingPHistorySampleIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "tokenRingPHistoryIntervalStart", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "tokenRingPHistoryDropEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "tokenRingPHistoryDataOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "tokenRingPHistoryDataPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "tokenRingPHistoryDataBroadcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "tokenRingPHistoryDataMulticastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "tokenRingPHistoryDataPkts18to63Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "tokenRingPHistoryDataPkts64to127Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "tokenRingPHistoryDataPkts128to255Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "tokenRingPHistoryDataPkts256to511Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "tokenRingPHistoryDataPkts512to1023Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "tokenRingPHistoryDataPkts1024to2047Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "tokenRingPHistoryDataPkts2048to4095Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "tokenRingPHistoryDataPkts4096to8191Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "tokenRingPHistoryDataPkts8192to18000Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "tokenRingPHistoryDataPktsGreaterThan18000Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
