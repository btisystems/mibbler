
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.fetable.FeEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IFeTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.fetable.IFeEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class FeTable
    extends DeviceEntity
    implements Serializable, IFeTable, ITableAccess<IFeEntry>
{

    private Map<String, IFeEntry> feEntry = new TreeMap<String, IFeEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public FeTable() {
    }

    public Map<String, IFeEntry> getFeEntry() {
        return this.feEntry;
    }

    public IFeEntry getEntry(String key) {
        return feEntry.get(key);
    }

    public void setEntry(String key, IFeEntry value) {
        feEntry.put(key, value);
        ((FeEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IFeEntry> getEntries() {
        return feEntry;
    }

    public FeEntry createEntry(String entryIndex) {
        FeEntry newEntry = new FeEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.10.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("feEntry", feEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(feEntry).toHashCode();
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
        FeTable rhs = ((FeTable) obj);
        return new EqualsBuilder().append(feEntry, rhs.feEntry).isEquals();
    }

    public FeTable clone() {
        FeTable _copy = new FeTable();
        for (Map.Entry<String, IFeEntry> _entry: feEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.10"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "feEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
