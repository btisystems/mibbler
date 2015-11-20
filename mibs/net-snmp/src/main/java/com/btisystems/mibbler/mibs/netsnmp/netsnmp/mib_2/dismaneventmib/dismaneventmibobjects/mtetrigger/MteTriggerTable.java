
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.IMteTriggerTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggertable.IMteTriggerEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggertable.MteTriggerEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MteTriggerTable
    extends DeviceEntity
    implements Serializable, IMteTriggerTable, ITableAccess<IMteTriggerEntry>
{

    private Map<String, IMteTriggerEntry> mteTriggerEntry = new TreeMap<String, IMteTriggerEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteTriggerTable() {
    }

    public Map<String, IMteTriggerEntry> getMteTriggerEntry() {
        return this.mteTriggerEntry;
    }

    public IMteTriggerEntry getEntry(String key) {
        return mteTriggerEntry.get(key);
    }

    public void setEntry(String key, IMteTriggerEntry value) {
        mteTriggerEntry.put(key, value);
        ((MteTriggerEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMteTriggerEntry> getEntries() {
        return mteTriggerEntry;
    }

    public MteTriggerEntry createEntry(String entryIndex) {
        MteTriggerEntry newEntry = new MteTriggerEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.88.1.2.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteTriggerEntry", mteTriggerEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteTriggerEntry).toHashCode();
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
        MteTriggerTable rhs = ((MteTriggerTable) obj);
        return new EqualsBuilder().append(mteTriggerEntry, rhs.mteTriggerEntry).isEquals();
    }

    public MteTriggerTable clone() {
        MteTriggerTable _copy = new MteTriggerTable();
        for (Map.Entry<String, IMteTriggerEntry> _entry: mteTriggerEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.2.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteTriggerEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
