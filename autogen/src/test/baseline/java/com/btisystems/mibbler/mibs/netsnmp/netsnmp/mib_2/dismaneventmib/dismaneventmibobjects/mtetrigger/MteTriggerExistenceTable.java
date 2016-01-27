
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.IMteTriggerExistenceTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerexistencetable.IMteTriggerExistenceEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerexistencetable.MteTriggerExistenceEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MteTriggerExistenceTable
    extends DeviceEntity
    implements Serializable, IMteTriggerExistenceTable, ITableAccess<IMteTriggerExistenceEntry>
{

    private Map<String, IMteTriggerExistenceEntry> mteTriggerExistenceEntry = new TreeMap<String, IMteTriggerExistenceEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteTriggerExistenceTable() {
    }

    public Map<String, IMteTriggerExistenceEntry> getMteTriggerExistenceEntry() {
        return this.mteTriggerExistenceEntry;
    }

    public IMteTriggerExistenceEntry getEntry(String key) {
        return mteTriggerExistenceEntry.get(key);
    }

    public void setEntry(String key, IMteTriggerExistenceEntry value) {
        mteTriggerExistenceEntry.put(key, value);
        ((MteTriggerExistenceEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMteTriggerExistenceEntry> getEntries() {
        return mteTriggerExistenceEntry;
    }

    public MteTriggerExistenceEntry createEntry(String entryIndex) {
        MteTriggerExistenceEntry newEntry = new MteTriggerExistenceEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.88.1.2.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteTriggerExistenceEntry", mteTriggerExistenceEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteTriggerExistenceEntry).toHashCode();
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
        MteTriggerExistenceTable rhs = ((MteTriggerExistenceTable) obj);
        return new EqualsBuilder().append(mteTriggerExistenceEntry, rhs.mteTriggerExistenceEntry).isEquals();
    }

    public MteTriggerExistenceTable clone() {
        MteTriggerExistenceTable _copy = new MteTriggerExistenceTable();
        for (Map.Entry<String, IMteTriggerExistenceEntry> _entry: mteTriggerExistenceEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.2.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteTriggerExistenceEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
