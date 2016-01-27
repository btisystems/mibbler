
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.IMteTriggerThresholdTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerthresholdtable.IMteTriggerThresholdEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerthresholdtable.MteTriggerThresholdEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MteTriggerThresholdTable
    extends DeviceEntity
    implements Serializable, IMteTriggerThresholdTable, ITableAccess<IMteTriggerThresholdEntry>
{

    private Map<String, IMteTriggerThresholdEntry> mteTriggerThresholdEntry = new TreeMap<String, IMteTriggerThresholdEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteTriggerThresholdTable() {
    }

    public Map<String, IMteTriggerThresholdEntry> getMteTriggerThresholdEntry() {
        return this.mteTriggerThresholdEntry;
    }

    public IMteTriggerThresholdEntry getEntry(String key) {
        return mteTriggerThresholdEntry.get(key);
    }

    public void setEntry(String key, IMteTriggerThresholdEntry value) {
        mteTriggerThresholdEntry.put(key, value);
        ((MteTriggerThresholdEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMteTriggerThresholdEntry> getEntries() {
        return mteTriggerThresholdEntry;
    }

    public MteTriggerThresholdEntry createEntry(String entryIndex) {
        MteTriggerThresholdEntry newEntry = new MteTriggerThresholdEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.88.1.2.6.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteTriggerThresholdEntry", mteTriggerThresholdEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteTriggerThresholdEntry).toHashCode();
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
        MteTriggerThresholdTable rhs = ((MteTriggerThresholdTable) obj);
        return new EqualsBuilder().append(mteTriggerThresholdEntry, rhs.mteTriggerThresholdEntry).isEquals();
    }

    public MteTriggerThresholdTable clone() {
        MteTriggerThresholdTable _copy = new MteTriggerThresholdTable();
        for (Map.Entry<String, IMteTriggerThresholdEntry> _entry: mteTriggerThresholdEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.2.6"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteTriggerThresholdEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
