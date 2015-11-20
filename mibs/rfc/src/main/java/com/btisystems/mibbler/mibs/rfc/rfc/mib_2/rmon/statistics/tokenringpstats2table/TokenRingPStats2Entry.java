
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.tokenringpstats2table;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics.tokenringpstats2table.ITokenRingPStats2Entry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.TokenRingPStats2Table;
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

public class TokenRingPStats2Entry
    extends DeviceEntity
    implements Serializable, ITokenRingPStats2Entry, IIndexed, IVariableBindingSetter
{

    private int tokenRingPStatsDroppedFrames;
    private int tokenRingPStatsCreateTime;
    private String _index;
    private TokenRingPStats2Table parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TokenRingPStats2Entry() {
    }

    public int getTokenRingPStatsDroppedFrames() {
        return this.tokenRingPStatsDroppedFrames;
    }

    public void setTokenRingPStatsDroppedFrames(int tokenRingPStatsDroppedFrames) {
        int oldValue = getTokenRingPStatsDroppedFrames();
        this.tokenRingPStatsDroppedFrames = tokenRingPStatsDroppedFrames;
        notifyChange(1, oldValue, tokenRingPStatsDroppedFrames);
    }

    public int getTokenRingPStatsCreateTime() {
        return this.tokenRingPStatsCreateTime;
    }

    public void setTokenRingPStatsCreateTime(int tokenRingPStatsCreateTime) {
        int oldValue = getTokenRingPStatsCreateTime();
        this.tokenRingPStatsCreateTime = tokenRingPStatsCreateTime;
        notifyChange(2, oldValue, tokenRingPStatsCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setTokenRingPStatsDroppedFrames(binding.getVariable().toInt());
                break;
            case  2 :
                setTokenRingPStatsCreateTime(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(TokenRingPStats2Table table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tokenRingPStatsDroppedFrames", tokenRingPStatsDroppedFrames).append("tokenRingPStatsCreateTime", tokenRingPStatsCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tokenRingPStatsDroppedFrames).append(tokenRingPStatsCreateTime).append(_index).toHashCode();
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
        TokenRingPStats2Entry rhs = ((TokenRingPStats2Entry) obj);
        return new EqualsBuilder().append(tokenRingPStatsDroppedFrames, rhs.tokenRingPStatsDroppedFrames).append(tokenRingPStatsCreateTime, rhs.tokenRingPStatsCreateTime).append(_index, rhs._index).isEquals();
    }

    public TokenRingPStats2Entry clone() {
        TokenRingPStats2Entry _copy = new TokenRingPStats2Entry();
        _copy.tokenRingPStatsDroppedFrames = tokenRingPStatsDroppedFrames;
        _copy.tokenRingPStatsCreateTime = tokenRingPStatsCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.1.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tokenRingPStatsDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "tokenRingPStatsCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
