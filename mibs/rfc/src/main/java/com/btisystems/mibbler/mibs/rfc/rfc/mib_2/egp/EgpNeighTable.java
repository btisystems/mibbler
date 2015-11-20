
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.egp;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.egp.IEgpNeighTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.egp.egpneightable.IEgpNeighEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.egp.egpneightable.EgpNeighEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class EgpNeighTable
    extends DeviceEntity
    implements Serializable, IEgpNeighTable, ITableAccess<IEgpNeighEntry>
{

    private Map<String, IEgpNeighEntry> egpNeighEntry = new TreeMap<String, IEgpNeighEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public EgpNeighTable() {
    }

    public Map<String, IEgpNeighEntry> getEgpNeighEntry() {
        return this.egpNeighEntry;
    }

    public IEgpNeighEntry getEntry(String key) {
        return egpNeighEntry.get(key);
    }

    public void setEntry(String key, IEgpNeighEntry value) {
        egpNeighEntry.put(key, value);
        ((EgpNeighEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IEgpNeighEntry> getEntries() {
        return egpNeighEntry;
    }

    public EgpNeighEntry createEntry(String entryIndex) {
        EgpNeighEntry newEntry = new EgpNeighEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.8.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("egpNeighEntry", egpNeighEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(egpNeighEntry).toHashCode();
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
        EgpNeighTable rhs = ((EgpNeighTable) obj);
        return new EqualsBuilder().append(egpNeighEntry, rhs.egpNeighEntry).isEquals();
    }

    public EgpNeighTable clone() {
        EgpNeighTable _copy = new EgpNeighTable();
        for (Map.Entry<String, IEgpNeighEntry> _entry: egpNeighEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.8.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "egpNeighEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
