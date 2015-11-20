
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.radiusaccclient;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.radiusaccclient.IRadiusAccServerTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.radiusaccclient.radiusaccservertable.IRadiusAccServerEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.radiusaccclient.radiusaccservertable.RadiusAccServerEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class RadiusAccServerTable
    extends DeviceEntity
    implements Serializable, IRadiusAccServerTable, ITableAccess<IRadiusAccServerEntry>
{

    private Map<String, IRadiusAccServerEntry> radiusAccServerEntry = new TreeMap<String, IRadiusAccServerEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RadiusAccServerTable() {
    }

    public Map<String, IRadiusAccServerEntry> getRadiusAccServerEntry() {
        return this.radiusAccServerEntry;
    }

    public IRadiusAccServerEntry getEntry(String key) {
        return radiusAccServerEntry.get(key);
    }

    public void setEntry(String key, IRadiusAccServerEntry value) {
        radiusAccServerEntry.put(key, value);
        ((RadiusAccServerEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IRadiusAccServerEntry> getEntries() {
        return radiusAccServerEntry;
    }

    public RadiusAccServerEntry createEntry(String entryIndex) {
        RadiusAccServerEntry newEntry = new RadiusAccServerEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.67.2.2.1.1.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("radiusAccServerEntry", radiusAccServerEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(radiusAccServerEntry).toHashCode();
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
        RadiusAccServerTable rhs = ((RadiusAccServerTable) obj);
        return new EqualsBuilder().append(radiusAccServerEntry, rhs.radiusAccServerEntry).isEquals();
    }

    public RadiusAccServerTable clone() {
        RadiusAccServerTable _copy = new RadiusAccServerTable();
        for (Map.Entry<String, IRadiusAccServerEntry> _entry: radiusAccServerEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.67.2.2.1.1.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "radiusAccServerEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
