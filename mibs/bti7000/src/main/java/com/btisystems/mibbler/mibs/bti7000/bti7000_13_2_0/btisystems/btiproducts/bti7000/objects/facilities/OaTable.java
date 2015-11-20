
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.oatable.OaEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IOaTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.oatable.IOaEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class OaTable
    extends DeviceEntity
    implements Serializable, IOaTable, ITableAccess<IOaEntry>
{

    private Map<String, IOaEntry> oaEntry = new TreeMap<String, IOaEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OaTable() {
    }

    public Map<String, IOaEntry> getOaEntry() {
        return this.oaEntry;
    }

    public IOaEntry getEntry(String key) {
        return oaEntry.get(key);
    }

    public void setEntry(String key, IOaEntry value) {
        oaEntry.put(key, value);
        ((OaEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IOaEntry> getEntries() {
        return oaEntry;
    }

    public OaEntry createEntry(String entryIndex) {
        OaEntry newEntry = new OaEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("oaEntry", oaEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(oaEntry).toHashCode();
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
        OaTable rhs = ((OaTable) obj);
        return new EqualsBuilder().append(oaEntry, rhs.oaEntry).isEquals();
    }

    public OaTable clone() {
        OaTable _copy = new OaTable();
        for (Map.Entry<String, IOaEntry> _entry: oaEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "oaEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
