
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.IMteTriggerDeltaTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerdeltatable.IMteTriggerDeltaEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerdeltatable.MteTriggerDeltaEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MteTriggerDeltaTable
    extends DeviceEntity
    implements Serializable, IMteTriggerDeltaTable, ITableAccess<IMteTriggerDeltaEntry>
{

    private Map<String, IMteTriggerDeltaEntry> mteTriggerDeltaEntry = new TreeMap<String, IMteTriggerDeltaEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteTriggerDeltaTable() {
    }

    public Map<String, IMteTriggerDeltaEntry> getMteTriggerDeltaEntry() {
        return this.mteTriggerDeltaEntry;
    }

    public IMteTriggerDeltaEntry getEntry(String key) {
        return mteTriggerDeltaEntry.get(key);
    }

    public void setEntry(String key, IMteTriggerDeltaEntry value) {
        mteTriggerDeltaEntry.put(key, value);
        ((MteTriggerDeltaEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMteTriggerDeltaEntry> getEntries() {
        return mteTriggerDeltaEntry;
    }

    public MteTriggerDeltaEntry createEntry(String entryIndex) {
        MteTriggerDeltaEntry newEntry = new MteTriggerDeltaEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.88.1.2.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteTriggerDeltaEntry", mteTriggerDeltaEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteTriggerDeltaEntry).toHashCode();
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
        MteTriggerDeltaTable rhs = ((MteTriggerDeltaTable) obj);
        return new EqualsBuilder().append(mteTriggerDeltaEntry, rhs.mteTriggerDeltaEntry).isEquals();
    }

    public MteTriggerDeltaTable clone() {
        MteTriggerDeltaTable _copy = new MteTriggerDeltaTable();
        for (Map.Entry<String, IMteTriggerDeltaEntry> _entry: mteTriggerDeltaEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.2.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteTriggerDeltaEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
