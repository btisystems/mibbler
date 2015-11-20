
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics.ITokenRingPStatsTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics.tokenringpstatstable.ITokenRingPStatsEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.tokenringpstatstable.TokenRingPStatsEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class TokenRingPStatsTable
    extends DeviceEntity
    implements Serializable, ITokenRingPStatsTable, ITableAccess<ITokenRingPStatsEntry>
{

    private Map<String, ITokenRingPStatsEntry> tokenRingPStatsEntry = new TreeMap<String, ITokenRingPStatsEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TokenRingPStatsTable() {
    }

    public Map<String, ITokenRingPStatsEntry> getTokenRingPStatsEntry() {
        return this.tokenRingPStatsEntry;
    }

    public ITokenRingPStatsEntry getEntry(String key) {
        return tokenRingPStatsEntry.get(key);
    }

    public void setEntry(String key, ITokenRingPStatsEntry value) {
        tokenRingPStatsEntry.put(key, value);
        ((TokenRingPStatsEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ITokenRingPStatsEntry> getEntries() {
        return tokenRingPStatsEntry;
    }

    public TokenRingPStatsEntry createEntry(String entryIndex) {
        TokenRingPStatsEntry newEntry = new TokenRingPStatsEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.1.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tokenRingPStatsEntry", tokenRingPStatsEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tokenRingPStatsEntry).toHashCode();
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
        TokenRingPStatsTable rhs = ((TokenRingPStatsTable) obj);
        return new EqualsBuilder().append(tokenRingPStatsEntry, rhs.tokenRingPStatsEntry).isEquals();
    }

    public TokenRingPStatsTable clone() {
        TokenRingPStatsTable _copy = new TokenRingPStatsTable();
        for (Map.Entry<String, ITokenRingPStatsEntry> _entry: tokenRingPStatsEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.1.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tokenRingPStatsEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
