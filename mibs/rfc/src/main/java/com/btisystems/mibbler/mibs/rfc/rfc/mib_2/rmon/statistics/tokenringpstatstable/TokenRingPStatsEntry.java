
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.tokenringpstatstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics.tokenringpstatstable.ITokenRingPStatsEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.TokenRingPStatsTable;
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

public class TokenRingPStatsEntry
    extends DeviceEntity
    implements Serializable, ITokenRingPStatsEntry, IIndexed, IVariableBindingSetter
{

    private int tokenRingPStatsIndex;
    private String tokenRingPStatsDataSource;
    private int tokenRingPStatsDropEvents;
    private int tokenRingPStatsDataOctets;
    private int tokenRingPStatsDataPkts;
    private int tokenRingPStatsDataBroadcastPkts;
    private int tokenRingPStatsDataMulticastPkts;
    private int tokenRingPStatsDataPkts18to63Octets;
    private int tokenRingPStatsDataPkts64to127Octets;
    private int tokenRingPStatsDataPkts128to255Octets;
    private int tokenRingPStatsDataPkts256to511Octets;
    private int tokenRingPStatsDataPkts512to1023Octets;
    private int tokenRingPStatsDataPkts1024to2047Octets;
    private int tokenRingPStatsDataPkts2048to4095Octets;
    private int tokenRingPStatsDataPkts4096to8191Octets;
    private int tokenRingPStatsDataPkts8192to18000Octets;
    private int tokenRingPStatsDataPktsGreaterThan18000Octets;
    private String tokenRingPStatsOwner;
    private int tokenRingPStatsStatus;
    private String _index;
    private TokenRingPStatsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TokenRingPStatsEntry() {
    }

    public int getTokenRingPStatsIndex() {
        return this.tokenRingPStatsIndex;
    }

    public void setTokenRingPStatsIndex(int tokenRingPStatsIndex) {
        int oldValue = getTokenRingPStatsIndex();
        this.tokenRingPStatsIndex = tokenRingPStatsIndex;
        notifyChange(1, oldValue, tokenRingPStatsIndex);
    }

    public String getTokenRingPStatsDataSource() {
        return this.tokenRingPStatsDataSource;
    }

    public void setTokenRingPStatsDataSource(String tokenRingPStatsDataSource) {
        String oldValue = getTokenRingPStatsDataSource();
        this.tokenRingPStatsDataSource = tokenRingPStatsDataSource;
        notifyChange(2, oldValue, tokenRingPStatsDataSource);
    }

    public int getTokenRingPStatsDropEvents() {
        return this.tokenRingPStatsDropEvents;
    }

    public void setTokenRingPStatsDropEvents(int tokenRingPStatsDropEvents) {
        int oldValue = getTokenRingPStatsDropEvents();
        this.tokenRingPStatsDropEvents = tokenRingPStatsDropEvents;
        notifyChange(3, oldValue, tokenRingPStatsDropEvents);
    }

    public int getTokenRingPStatsDataOctets() {
        return this.tokenRingPStatsDataOctets;
    }

    public void setTokenRingPStatsDataOctets(int tokenRingPStatsDataOctets) {
        int oldValue = getTokenRingPStatsDataOctets();
        this.tokenRingPStatsDataOctets = tokenRingPStatsDataOctets;
        notifyChange(4, oldValue, tokenRingPStatsDataOctets);
    }

    public int getTokenRingPStatsDataPkts() {
        return this.tokenRingPStatsDataPkts;
    }

    public void setTokenRingPStatsDataPkts(int tokenRingPStatsDataPkts) {
        int oldValue = getTokenRingPStatsDataPkts();
        this.tokenRingPStatsDataPkts = tokenRingPStatsDataPkts;
        notifyChange(5, oldValue, tokenRingPStatsDataPkts);
    }

    public int getTokenRingPStatsDataBroadcastPkts() {
        return this.tokenRingPStatsDataBroadcastPkts;
    }

    public void setTokenRingPStatsDataBroadcastPkts(int tokenRingPStatsDataBroadcastPkts) {
        int oldValue = getTokenRingPStatsDataBroadcastPkts();
        this.tokenRingPStatsDataBroadcastPkts = tokenRingPStatsDataBroadcastPkts;
        notifyChange(6, oldValue, tokenRingPStatsDataBroadcastPkts);
    }

    public int getTokenRingPStatsDataMulticastPkts() {
        return this.tokenRingPStatsDataMulticastPkts;
    }

    public void setTokenRingPStatsDataMulticastPkts(int tokenRingPStatsDataMulticastPkts) {
        int oldValue = getTokenRingPStatsDataMulticastPkts();
        this.tokenRingPStatsDataMulticastPkts = tokenRingPStatsDataMulticastPkts;
        notifyChange(7, oldValue, tokenRingPStatsDataMulticastPkts);
    }

    public int getTokenRingPStatsDataPkts18to63Octets() {
        return this.tokenRingPStatsDataPkts18to63Octets;
    }

    public void setTokenRingPStatsDataPkts18to63Octets(int tokenRingPStatsDataPkts18to63Octets) {
        int oldValue = getTokenRingPStatsDataPkts18to63Octets();
        this.tokenRingPStatsDataPkts18to63Octets = tokenRingPStatsDataPkts18to63Octets;
        notifyChange(8, oldValue, tokenRingPStatsDataPkts18to63Octets);
    }

    public int getTokenRingPStatsDataPkts64to127Octets() {
        return this.tokenRingPStatsDataPkts64to127Octets;
    }

    public void setTokenRingPStatsDataPkts64to127Octets(int tokenRingPStatsDataPkts64to127Octets) {
        int oldValue = getTokenRingPStatsDataPkts64to127Octets();
        this.tokenRingPStatsDataPkts64to127Octets = tokenRingPStatsDataPkts64to127Octets;
        notifyChange(9, oldValue, tokenRingPStatsDataPkts64to127Octets);
    }

    public int getTokenRingPStatsDataPkts128to255Octets() {
        return this.tokenRingPStatsDataPkts128to255Octets;
    }

    public void setTokenRingPStatsDataPkts128to255Octets(int tokenRingPStatsDataPkts128to255Octets) {
        int oldValue = getTokenRingPStatsDataPkts128to255Octets();
        this.tokenRingPStatsDataPkts128to255Octets = tokenRingPStatsDataPkts128to255Octets;
        notifyChange(10, oldValue, tokenRingPStatsDataPkts128to255Octets);
    }

    public int getTokenRingPStatsDataPkts256to511Octets() {
        return this.tokenRingPStatsDataPkts256to511Octets;
    }

    public void setTokenRingPStatsDataPkts256to511Octets(int tokenRingPStatsDataPkts256to511Octets) {
        int oldValue = getTokenRingPStatsDataPkts256to511Octets();
        this.tokenRingPStatsDataPkts256to511Octets = tokenRingPStatsDataPkts256to511Octets;
        notifyChange(11, oldValue, tokenRingPStatsDataPkts256to511Octets);
    }

    public int getTokenRingPStatsDataPkts512to1023Octets() {
        return this.tokenRingPStatsDataPkts512to1023Octets;
    }

    public void setTokenRingPStatsDataPkts512to1023Octets(int tokenRingPStatsDataPkts512to1023Octets) {
        int oldValue = getTokenRingPStatsDataPkts512to1023Octets();
        this.tokenRingPStatsDataPkts512to1023Octets = tokenRingPStatsDataPkts512to1023Octets;
        notifyChange(12, oldValue, tokenRingPStatsDataPkts512to1023Octets);
    }

    public int getTokenRingPStatsDataPkts1024to2047Octets() {
        return this.tokenRingPStatsDataPkts1024to2047Octets;
    }

    public void setTokenRingPStatsDataPkts1024to2047Octets(int tokenRingPStatsDataPkts1024to2047Octets) {
        int oldValue = getTokenRingPStatsDataPkts1024to2047Octets();
        this.tokenRingPStatsDataPkts1024to2047Octets = tokenRingPStatsDataPkts1024to2047Octets;
        notifyChange(13, oldValue, tokenRingPStatsDataPkts1024to2047Octets);
    }

    public int getTokenRingPStatsDataPkts2048to4095Octets() {
        return this.tokenRingPStatsDataPkts2048to4095Octets;
    }

    public void setTokenRingPStatsDataPkts2048to4095Octets(int tokenRingPStatsDataPkts2048to4095Octets) {
        int oldValue = getTokenRingPStatsDataPkts2048to4095Octets();
        this.tokenRingPStatsDataPkts2048to4095Octets = tokenRingPStatsDataPkts2048to4095Octets;
        notifyChange(14, oldValue, tokenRingPStatsDataPkts2048to4095Octets);
    }

    public int getTokenRingPStatsDataPkts4096to8191Octets() {
        return this.tokenRingPStatsDataPkts4096to8191Octets;
    }

    public void setTokenRingPStatsDataPkts4096to8191Octets(int tokenRingPStatsDataPkts4096to8191Octets) {
        int oldValue = getTokenRingPStatsDataPkts4096to8191Octets();
        this.tokenRingPStatsDataPkts4096to8191Octets = tokenRingPStatsDataPkts4096to8191Octets;
        notifyChange(15, oldValue, tokenRingPStatsDataPkts4096to8191Octets);
    }

    public int getTokenRingPStatsDataPkts8192to18000Octets() {
        return this.tokenRingPStatsDataPkts8192to18000Octets;
    }

    public void setTokenRingPStatsDataPkts8192to18000Octets(int tokenRingPStatsDataPkts8192to18000Octets) {
        int oldValue = getTokenRingPStatsDataPkts8192to18000Octets();
        this.tokenRingPStatsDataPkts8192to18000Octets = tokenRingPStatsDataPkts8192to18000Octets;
        notifyChange(16, oldValue, tokenRingPStatsDataPkts8192to18000Octets);
    }

    public int getTokenRingPStatsDataPktsGreaterThan18000Octets() {
        return this.tokenRingPStatsDataPktsGreaterThan18000Octets;
    }

    public void setTokenRingPStatsDataPktsGreaterThan18000Octets(int tokenRingPStatsDataPktsGreaterThan18000Octets) {
        int oldValue = getTokenRingPStatsDataPktsGreaterThan18000Octets();
        this.tokenRingPStatsDataPktsGreaterThan18000Octets = tokenRingPStatsDataPktsGreaterThan18000Octets;
        notifyChange(17, oldValue, tokenRingPStatsDataPktsGreaterThan18000Octets);
    }

    public String getTokenRingPStatsOwner() {
        return this.tokenRingPStatsOwner;
    }

    public void setTokenRingPStatsOwner(String tokenRingPStatsOwner) {
        String oldValue = getTokenRingPStatsOwner();
        this.tokenRingPStatsOwner = tokenRingPStatsOwner;
        notifyChange(18, oldValue, tokenRingPStatsOwner);
    }

    public int getTokenRingPStatsStatus() {
        return this.tokenRingPStatsStatus;
    }

    public void setTokenRingPStatsStatus(int tokenRingPStatsStatus) {
        int oldValue = getTokenRingPStatsStatus();
        this.tokenRingPStatsStatus = tokenRingPStatsStatus;
        notifyChange(19, oldValue, tokenRingPStatsStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setTokenRingPStatsIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setTokenRingPStatsDataSource(binding.getVariable().toString());
                break;
            case  3 :
                setTokenRingPStatsDropEvents(binding.getVariable().toInt());
                break;
            case  4 :
                setTokenRingPStatsDataOctets(binding.getVariable().toInt());
                break;
            case  5 :
                setTokenRingPStatsDataPkts(binding.getVariable().toInt());
                break;
            case  6 :
                setTokenRingPStatsDataBroadcastPkts(binding.getVariable().toInt());
                break;
            case  7 :
                setTokenRingPStatsDataMulticastPkts(binding.getVariable().toInt());
                break;
            case  8 :
                setTokenRingPStatsDataPkts18to63Octets(binding.getVariable().toInt());
                break;
            case  9 :
                setTokenRingPStatsDataPkts64to127Octets(binding.getVariable().toInt());
                break;
            case  10 :
                setTokenRingPStatsDataPkts128to255Octets(binding.getVariable().toInt());
                break;
            case  11 :
                setTokenRingPStatsDataPkts256to511Octets(binding.getVariable().toInt());
                break;
            case  12 :
                setTokenRingPStatsDataPkts512to1023Octets(binding.getVariable().toInt());
                break;
            case  13 :
                setTokenRingPStatsDataPkts1024to2047Octets(binding.getVariable().toInt());
                break;
            case  14 :
                setTokenRingPStatsDataPkts2048to4095Octets(binding.getVariable().toInt());
                break;
            case  15 :
                setTokenRingPStatsDataPkts4096to8191Octets(binding.getVariable().toInt());
                break;
            case  16 :
                setTokenRingPStatsDataPkts8192to18000Octets(binding.getVariable().toInt());
                break;
            case  17 :
                setTokenRingPStatsDataPktsGreaterThan18000Octets(binding.getVariable().toInt());
                break;
            case  18 :
                setTokenRingPStatsOwner(binding.getVariable().toString());
                break;
            case  19 :
                setTokenRingPStatsStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setTokenRingPStatsIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(TokenRingPStatsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tokenRingPStatsIndex", tokenRingPStatsIndex).append("tokenRingPStatsDataSource", tokenRingPStatsDataSource).append("tokenRingPStatsDropEvents", tokenRingPStatsDropEvents).append("tokenRingPStatsDataOctets", tokenRingPStatsDataOctets).append("tokenRingPStatsDataPkts", tokenRingPStatsDataPkts).append("tokenRingPStatsDataBroadcastPkts", tokenRingPStatsDataBroadcastPkts).append("tokenRingPStatsDataMulticastPkts", tokenRingPStatsDataMulticastPkts).append("tokenRingPStatsDataPkts18to63Octets", tokenRingPStatsDataPkts18to63Octets).append("tokenRingPStatsDataPkts64to127Octets", tokenRingPStatsDataPkts64to127Octets).append("tokenRingPStatsDataPkts128to255Octets", tokenRingPStatsDataPkts128to255Octets).append("tokenRingPStatsDataPkts256to511Octets", tokenRingPStatsDataPkts256to511Octets).append("tokenRingPStatsDataPkts512to1023Octets", tokenRingPStatsDataPkts512to1023Octets).append("tokenRingPStatsDataPkts1024to2047Octets", tokenRingPStatsDataPkts1024to2047Octets).append("tokenRingPStatsDataPkts2048to4095Octets", tokenRingPStatsDataPkts2048to4095Octets).append("tokenRingPStatsDataPkts4096to8191Octets", tokenRingPStatsDataPkts4096to8191Octets).append("tokenRingPStatsDataPkts8192to18000Octets", tokenRingPStatsDataPkts8192to18000Octets).append("tokenRingPStatsDataPktsGreaterThan18000Octets", tokenRingPStatsDataPktsGreaterThan18000Octets).append("tokenRingPStatsOwner", tokenRingPStatsOwner).append("tokenRingPStatsStatus", tokenRingPStatsStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tokenRingPStatsIndex).append(tokenRingPStatsDataSource).append(tokenRingPStatsDropEvents).append(tokenRingPStatsDataOctets).append(tokenRingPStatsDataPkts).append(tokenRingPStatsDataBroadcastPkts).append(tokenRingPStatsDataMulticastPkts).append(tokenRingPStatsDataPkts18to63Octets).append(tokenRingPStatsDataPkts64to127Octets).append(tokenRingPStatsDataPkts128to255Octets).append(tokenRingPStatsDataPkts256to511Octets).append(tokenRingPStatsDataPkts512to1023Octets).append(tokenRingPStatsDataPkts1024to2047Octets).append(tokenRingPStatsDataPkts2048to4095Octets).append(tokenRingPStatsDataPkts4096to8191Octets).append(tokenRingPStatsDataPkts8192to18000Octets).append(tokenRingPStatsDataPktsGreaterThan18000Octets).append(tokenRingPStatsOwner).append(tokenRingPStatsStatus).append(_index).toHashCode();
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
        TokenRingPStatsEntry rhs = ((TokenRingPStatsEntry) obj);
        return new EqualsBuilder().append(tokenRingPStatsIndex, rhs.tokenRingPStatsIndex).append(tokenRingPStatsDataSource, rhs.tokenRingPStatsDataSource).append(tokenRingPStatsDropEvents, rhs.tokenRingPStatsDropEvents).append(tokenRingPStatsDataOctets, rhs.tokenRingPStatsDataOctets).append(tokenRingPStatsDataPkts, rhs.tokenRingPStatsDataPkts).append(tokenRingPStatsDataBroadcastPkts, rhs.tokenRingPStatsDataBroadcastPkts).append(tokenRingPStatsDataMulticastPkts, rhs.tokenRingPStatsDataMulticastPkts).append(tokenRingPStatsDataPkts18to63Octets, rhs.tokenRingPStatsDataPkts18to63Octets).append(tokenRingPStatsDataPkts64to127Octets, rhs.tokenRingPStatsDataPkts64to127Octets).append(tokenRingPStatsDataPkts128to255Octets, rhs.tokenRingPStatsDataPkts128to255Octets).append(tokenRingPStatsDataPkts256to511Octets, rhs.tokenRingPStatsDataPkts256to511Octets).append(tokenRingPStatsDataPkts512to1023Octets, rhs.tokenRingPStatsDataPkts512to1023Octets).append(tokenRingPStatsDataPkts1024to2047Octets, rhs.tokenRingPStatsDataPkts1024to2047Octets).append(tokenRingPStatsDataPkts2048to4095Octets, rhs.tokenRingPStatsDataPkts2048to4095Octets).append(tokenRingPStatsDataPkts4096to8191Octets, rhs.tokenRingPStatsDataPkts4096to8191Octets).append(tokenRingPStatsDataPkts8192to18000Octets, rhs.tokenRingPStatsDataPkts8192to18000Octets).append(tokenRingPStatsDataPktsGreaterThan18000Octets, rhs.tokenRingPStatsDataPktsGreaterThan18000Octets).append(tokenRingPStatsOwner, rhs.tokenRingPStatsOwner).append(tokenRingPStatsStatus, rhs.tokenRingPStatsStatus).append(_index, rhs._index).isEquals();
    }

    public TokenRingPStatsEntry clone() {
        TokenRingPStatsEntry _copy = new TokenRingPStatsEntry();
        _copy.tokenRingPStatsIndex = tokenRingPStatsIndex;
        _copy.tokenRingPStatsDataSource = tokenRingPStatsDataSource;
        _copy.tokenRingPStatsDropEvents = tokenRingPStatsDropEvents;
        _copy.tokenRingPStatsDataOctets = tokenRingPStatsDataOctets;
        _copy.tokenRingPStatsDataPkts = tokenRingPStatsDataPkts;
        _copy.tokenRingPStatsDataBroadcastPkts = tokenRingPStatsDataBroadcastPkts;
        _copy.tokenRingPStatsDataMulticastPkts = tokenRingPStatsDataMulticastPkts;
        _copy.tokenRingPStatsDataPkts18to63Octets = tokenRingPStatsDataPkts18to63Octets;
        _copy.tokenRingPStatsDataPkts64to127Octets = tokenRingPStatsDataPkts64to127Octets;
        _copy.tokenRingPStatsDataPkts128to255Octets = tokenRingPStatsDataPkts128to255Octets;
        _copy.tokenRingPStatsDataPkts256to511Octets = tokenRingPStatsDataPkts256to511Octets;
        _copy.tokenRingPStatsDataPkts512to1023Octets = tokenRingPStatsDataPkts512to1023Octets;
        _copy.tokenRingPStatsDataPkts1024to2047Octets = tokenRingPStatsDataPkts1024to2047Octets;
        _copy.tokenRingPStatsDataPkts2048to4095Octets = tokenRingPStatsDataPkts2048to4095Octets;
        _copy.tokenRingPStatsDataPkts4096to8191Octets = tokenRingPStatsDataPkts4096to8191Octets;
        _copy.tokenRingPStatsDataPkts8192to18000Octets = tokenRingPStatsDataPkts8192to18000Octets;
        _copy.tokenRingPStatsDataPktsGreaterThan18000Octets = tokenRingPStatsDataPktsGreaterThan18000Octets;
        _copy.tokenRingPStatsOwner = tokenRingPStatsOwner;
        _copy.tokenRingPStatsStatus = tokenRingPStatsStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tokenRingPStatsIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "tokenRingPStatsDataSource", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "tokenRingPStatsDropEvents", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "tokenRingPStatsDataOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "tokenRingPStatsDataPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "tokenRingPStatsDataBroadcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "tokenRingPStatsDataMulticastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "tokenRingPStatsDataPkts18to63Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "tokenRingPStatsDataPkts64to127Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "tokenRingPStatsDataPkts128to255Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "tokenRingPStatsDataPkts256to511Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "tokenRingPStatsDataPkts512to1023Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "tokenRingPStatsDataPkts1024to2047Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "tokenRingPStatsDataPkts2048to4095Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "tokenRingPStatsDataPkts4096to8191Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "tokenRingPStatsDataPkts8192to18000Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "tokenRingPStatsDataPktsGreaterThan18000Octets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "tokenRingPStatsOwner", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "tokenRingPStatsStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
