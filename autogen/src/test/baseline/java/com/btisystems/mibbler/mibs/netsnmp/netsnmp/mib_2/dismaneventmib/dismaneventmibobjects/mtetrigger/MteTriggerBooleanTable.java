
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.IMteTriggerBooleanTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerbooleantable.IMteTriggerBooleanEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerbooleantable.MteTriggerBooleanEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MteTriggerBooleanTable
    extends DeviceEntity
    implements Serializable, IMteTriggerBooleanTable, ITableAccess<IMteTriggerBooleanEntry>
{

    private Map<String, IMteTriggerBooleanEntry> mteTriggerBooleanEntry = new TreeMap<String, IMteTriggerBooleanEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteTriggerBooleanTable() {
    }

    public Map<String, IMteTriggerBooleanEntry> getMteTriggerBooleanEntry() {
        return this.mteTriggerBooleanEntry;
    }

    public IMteTriggerBooleanEntry getEntry(String key) {
        return mteTriggerBooleanEntry.get(key);
    }

    public void setEntry(String key, IMteTriggerBooleanEntry value) {
        mteTriggerBooleanEntry.put(key, value);
        ((MteTriggerBooleanEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMteTriggerBooleanEntry> getEntries() {
        return mteTriggerBooleanEntry;
    }

    public MteTriggerBooleanEntry createEntry(String entryIndex) {
        MteTriggerBooleanEntry newEntry = new MteTriggerBooleanEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.88.1.2.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteTriggerBooleanEntry", mteTriggerBooleanEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteTriggerBooleanEntry).toHashCode();
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
        MteTriggerBooleanTable rhs = ((MteTriggerBooleanTable) obj);
        return new EqualsBuilder().append(mteTriggerBooleanEntry, rhs.mteTriggerBooleanEntry).isEquals();
    }

    public MteTriggerBooleanTable clone() {
        MteTriggerBooleanTable _copy = new MteTriggerBooleanTable();
        for (Map.Entry<String, IMteTriggerBooleanEntry> _entry: mteTriggerBooleanEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.2.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteTriggerBooleanEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
