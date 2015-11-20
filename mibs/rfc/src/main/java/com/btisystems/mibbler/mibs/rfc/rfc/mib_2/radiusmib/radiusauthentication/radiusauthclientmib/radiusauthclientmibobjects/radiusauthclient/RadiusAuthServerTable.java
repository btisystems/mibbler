
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.radiusauthclient;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.radiusauthclient.IRadiusAuthServerTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.radiusauthclient.radiusauthservertable.IRadiusAuthServerEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.radiusauthclient.radiusauthservertable.RadiusAuthServerEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class RadiusAuthServerTable
    extends DeviceEntity
    implements Serializable, IRadiusAuthServerTable, ITableAccess<IRadiusAuthServerEntry>
{

    private Map<String, IRadiusAuthServerEntry> radiusAuthServerEntry = new TreeMap<String, IRadiusAuthServerEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RadiusAuthServerTable() {
    }

    public Map<String, IRadiusAuthServerEntry> getRadiusAuthServerEntry() {
        return this.radiusAuthServerEntry;
    }

    public IRadiusAuthServerEntry getEntry(String key) {
        return radiusAuthServerEntry.get(key);
    }

    public void setEntry(String key, IRadiusAuthServerEntry value) {
        radiusAuthServerEntry.put(key, value);
        ((RadiusAuthServerEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IRadiusAuthServerEntry> getEntries() {
        return radiusAuthServerEntry;
    }

    public RadiusAuthServerEntry createEntry(String entryIndex) {
        RadiusAuthServerEntry newEntry = new RadiusAuthServerEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.67.1.2.1.1.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("radiusAuthServerEntry", radiusAuthServerEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(radiusAuthServerEntry).toHashCode();
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
        RadiusAuthServerTable rhs = ((RadiusAuthServerTable) obj);
        return new EqualsBuilder().append(radiusAuthServerEntry, rhs.radiusAuthServerEntry).isEquals();
    }

    public RadiusAuthServerTable clone() {
        RadiusAuthServerTable _copy = new RadiusAuthServerTable();
        for (Map.Entry<String, IRadiusAuthServerEntry> _entry: radiusAuthServerEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.67.1.2.1.1.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "radiusAuthServerEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
