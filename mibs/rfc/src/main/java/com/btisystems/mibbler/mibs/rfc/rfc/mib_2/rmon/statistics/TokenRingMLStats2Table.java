
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics.ITokenRingMLStats2Table;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.statistics.tokenringmlstats2table.ITokenRingMLStats2Entry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.statistics.tokenringmlstats2table.TokenRingMLStats2Entry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class TokenRingMLStats2Table
    extends DeviceEntity
    implements Serializable, ITokenRingMLStats2Table, ITableAccess<ITokenRingMLStats2Entry>
{

    private Map<String, ITokenRingMLStats2Entry> tokenRingMLStats2Entry = new TreeMap<String, ITokenRingMLStats2Entry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TokenRingMLStats2Table() {
    }

    public Map<String, ITokenRingMLStats2Entry> getTokenRingMLStats2Entry() {
        return this.tokenRingMLStats2Entry;
    }

    public ITokenRingMLStats2Entry getEntry(String key) {
        return tokenRingMLStats2Entry.get(key);
    }

    public void setEntry(String key, ITokenRingMLStats2Entry value) {
        tokenRingMLStats2Entry.put(key, value);
        ((TokenRingMLStats2Entry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ITokenRingMLStats2Entry> getEntries() {
        return tokenRingMLStats2Entry;
    }

    public TokenRingMLStats2Entry createEntry(String entryIndex) {
        TokenRingMLStats2Entry newEntry = new TokenRingMLStats2Entry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.1.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tokenRingMLStats2Entry", tokenRingMLStats2Entry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tokenRingMLStats2Entry).toHashCode();
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
        TokenRingMLStats2Table rhs = ((TokenRingMLStats2Table) obj);
        return new EqualsBuilder().append(tokenRingMLStats2Entry, rhs.tokenRingMLStats2Entry).isEquals();
    }

    public TokenRingMLStats2Table clone() {
        TokenRingMLStats2Table _copy = new TokenRingMLStats2Table();
        for (Map.Entry<String, ITokenRingMLStats2Entry> _entry: tokenRingMLStats2Entry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.1.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tokenRingMLStats2Entry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
