
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlhost;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlhost.nlhosttable.NlHostEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlhost.INlHostTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlhost.nlhosttable.INlHostEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NlHostTable
    extends DeviceEntity
    implements Serializable, INlHostTable, ITableAccess<INlHostEntry>
{

    private Map<String, INlHostEntry> nlHostEntry = new TreeMap<String, INlHostEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlHostTable() {
    }

    public Map<String, INlHostEntry> getNlHostEntry() {
        return this.nlHostEntry;
    }

    public INlHostEntry getEntry(String key) {
        return nlHostEntry.get(key);
    }

    public void setEntry(String key, INlHostEntry value) {
        nlHostEntry.put(key, value);
        ((NlHostEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, INlHostEntry> getEntries() {
        return nlHostEntry;
    }

    public NlHostEntry createEntry(String entryIndex) {
        NlHostEntry newEntry = new NlHostEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.14.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlHostEntry", nlHostEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlHostEntry).toHashCode();
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
        NlHostTable rhs = ((NlHostTable) obj);
        return new EqualsBuilder().append(nlHostEntry, rhs.nlHostEntry).isEquals();
    }

    public NlHostTable clone() {
        NlHostTable _copy = new NlHostTable();
        for (Map.Entry<String, INlHostEntry> _entry: nlHostEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.14.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlHostEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
