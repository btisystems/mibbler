
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history.historycontrol2table.HistoryControl2Entry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.IHistoryControl2Table;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.historycontrol2table.IHistoryControl2Entry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HistoryControl2Table
    extends DeviceEntity
    implements Serializable, IHistoryControl2Table, ITableAccess<IHistoryControl2Entry>
{

    private Map<String, IHistoryControl2Entry> historyControl2Entry = new TreeMap<String, IHistoryControl2Entry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HistoryControl2Table() {
    }

    public Map<String, IHistoryControl2Entry> getHistoryControl2Entry() {
        return this.historyControl2Entry;
    }

    public IHistoryControl2Entry getEntry(String key) {
        return historyControl2Entry.get(key);
    }

    public void setEntry(String key, IHistoryControl2Entry value) {
        historyControl2Entry.put(key, value);
        ((HistoryControl2Entry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHistoryControl2Entry> getEntries() {
        return historyControl2Entry;
    }

    public HistoryControl2Entry createEntry(String entryIndex) {
        HistoryControl2Entry newEntry = new HistoryControl2Entry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.2.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("historyControl2Entry", historyControl2Entry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(historyControl2Entry).toHashCode();
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
        HistoryControl2Table rhs = ((HistoryControl2Table) obj);
        return new EqualsBuilder().append(historyControl2Entry, rhs.historyControl2Entry).isEquals();
    }

    public HistoryControl2Table clone() {
        HistoryControl2Table _copy = new HistoryControl2Table();
        for (Map.Entry<String, IHistoryControl2Entry> _entry: historyControl2Entry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.2.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "historyControl2Entry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
