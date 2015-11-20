
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.statistics.tokenringmlstats2table;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.statistics.TokenRingMLStats2Table;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.tokenringmlstats2table.ITokenRingMLStats2Entry;
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

public class TokenRingMLStats2Entry
    extends DeviceEntity
    implements Serializable, ITokenRingMLStats2Entry, IIndexed, IVariableBindingSetter
{

    private int tokenRingMLStatsDroppedFrames;
    private int tokenRingMLStatsCreateTime;
    private String _index;
    private TokenRingMLStats2Table parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TokenRingMLStats2Entry() {
    }

    public int getTokenRingMLStatsDroppedFrames() {
        return this.tokenRingMLStatsDroppedFrames;
    }

    public void setTokenRingMLStatsDroppedFrames(int tokenRingMLStatsDroppedFrames) {
        int oldValue = getTokenRingMLStatsDroppedFrames();
        this.tokenRingMLStatsDroppedFrames = tokenRingMLStatsDroppedFrames;
        notifyChange(1, oldValue, tokenRingMLStatsDroppedFrames);
    }

    public int getTokenRingMLStatsCreateTime() {
        return this.tokenRingMLStatsCreateTime;
    }

    public void setTokenRingMLStatsCreateTime(int tokenRingMLStatsCreateTime) {
        int oldValue = getTokenRingMLStatsCreateTime();
        this.tokenRingMLStatsCreateTime = tokenRingMLStatsCreateTime;
        notifyChange(2, oldValue, tokenRingMLStatsCreateTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setTokenRingMLStatsDroppedFrames(binding.getVariable().toInt());
                break;
            case  2 :
                setTokenRingMLStatsCreateTime(binding.getVariable().toInt());
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

    public void _setTable(TokenRingMLStats2Table table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tokenRingMLStatsDroppedFrames", tokenRingMLStatsDroppedFrames).append("tokenRingMLStatsCreateTime", tokenRingMLStatsCreateTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tokenRingMLStatsDroppedFrames).append(tokenRingMLStatsCreateTime).append(_index).toHashCode();
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
        TokenRingMLStats2Entry rhs = ((TokenRingMLStats2Entry) obj);
        return new EqualsBuilder().append(tokenRingMLStatsDroppedFrames, rhs.tokenRingMLStatsDroppedFrames).append(tokenRingMLStatsCreateTime, rhs.tokenRingMLStatsCreateTime).append(_index, rhs._index).isEquals();
    }

    public TokenRingMLStats2Entry clone() {
        TokenRingMLStats2Entry _copy = new TokenRingMLStats2Entry();
        _copy.tokenRingMLStatsDroppedFrames = tokenRingMLStatsDroppedFrames;
        _copy.tokenRingMLStatsCreateTime = tokenRingMLStatsCreateTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.1.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tokenRingMLStatsDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "tokenRingMLStatsCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
