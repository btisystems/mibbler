
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history.tokenringmlhistorytable.TokenRingMLHistoryEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.ITokenRingMLHistoryTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.tokenringmlhistorytable.ITokenRingMLHistoryEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class TokenRingMLHistoryTable
    extends DeviceEntity
    implements Serializable, ITokenRingMLHistoryTable, ITableAccess<ITokenRingMLHistoryEntry>
{

    private Map<String, ITokenRingMLHistoryEntry> tokenRingMLHistoryEntry = new TreeMap<String, ITokenRingMLHistoryEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TokenRingMLHistoryTable() {
    }

    public Map<String, ITokenRingMLHistoryEntry> getTokenRingMLHistoryEntry() {
        return this.tokenRingMLHistoryEntry;
    }

    public ITokenRingMLHistoryEntry getEntry(String key) {
        return tokenRingMLHistoryEntry.get(key);
    }

    public void setEntry(String key, ITokenRingMLHistoryEntry value) {
        tokenRingMLHistoryEntry.put(key, value);
        ((TokenRingMLHistoryEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ITokenRingMLHistoryEntry> getEntries() {
        return tokenRingMLHistoryEntry;
    }

    public TokenRingMLHistoryEntry createEntry(String entryIndex) {
        TokenRingMLHistoryEntry newEntry = new TokenRingMLHistoryEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.2.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tokenRingMLHistoryEntry", tokenRingMLHistoryEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tokenRingMLHistoryEntry).toHashCode();
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
        TokenRingMLHistoryTable rhs = ((TokenRingMLHistoryTable) obj);
        return new EqualsBuilder().append(tokenRingMLHistoryEntry, rhs.tokenRingMLHistoryEntry).isEquals();
    }

    public TokenRingMLHistoryTable clone() {
        TokenRingMLHistoryTable _copy = new TokenRingMLHistoryTable();
        for (Map.Entry<String, ITokenRingMLHistoryEntry> _entry: tokenRingMLHistoryEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.2.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tokenRingMLHistoryEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
