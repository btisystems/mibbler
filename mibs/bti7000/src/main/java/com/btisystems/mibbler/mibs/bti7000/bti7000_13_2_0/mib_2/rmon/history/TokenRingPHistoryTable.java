
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history.tokenringphistorytable.TokenRingPHistoryEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.ITokenRingPHistoryTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.tokenringphistorytable.ITokenRingPHistoryEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class TokenRingPHistoryTable
    extends DeviceEntity
    implements Serializable, ITokenRingPHistoryTable, ITableAccess<ITokenRingPHistoryEntry>
{

    private Map<String, ITokenRingPHistoryEntry> tokenRingPHistoryEntry = new TreeMap<String, ITokenRingPHistoryEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TokenRingPHistoryTable() {
    }

    public Map<String, ITokenRingPHistoryEntry> getTokenRingPHistoryEntry() {
        return this.tokenRingPHistoryEntry;
    }

    public ITokenRingPHistoryEntry getEntry(String key) {
        return tokenRingPHistoryEntry.get(key);
    }

    public void setEntry(String key, ITokenRingPHistoryEntry value) {
        tokenRingPHistoryEntry.put(key, value);
        ((TokenRingPHistoryEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ITokenRingPHistoryEntry> getEntries() {
        return tokenRingPHistoryEntry;
    }

    public TokenRingPHistoryEntry createEntry(String entryIndex) {
        TokenRingPHistoryEntry newEntry = new TokenRingPHistoryEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.2.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tokenRingPHistoryEntry", tokenRingPHistoryEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tokenRingPHistoryEntry).toHashCode();
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
        TokenRingPHistoryTable rhs = ((TokenRingPHistoryTable) obj);
        return new EqualsBuilder().append(tokenRingPHistoryEntry, rhs.tokenRingPHistoryEntry).isEquals();
    }

    public TokenRingPHistoryTable clone() {
        TokenRingPHistoryTable _copy = new TokenRingPHistoryTable();
        for (Map.Entry<String, ITokenRingPHistoryEntry> _entry: tokenRingPHistoryEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.2.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tokenRingPHistoryEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
