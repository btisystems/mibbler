
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.almatrix;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix.IAlMatrixSDTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.almatrix.almatrixsdtable.IAlMatrixSDEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.almatrix.almatrixsdtable.AlMatrixSDEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class AlMatrixSDTable
    extends DeviceEntity
    implements Serializable, IAlMatrixSDTable, ITableAccess<IAlMatrixSDEntry>
{

    private Map<String, IAlMatrixSDEntry> alMatrixSDEntry = new TreeMap<String, IAlMatrixSDEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AlMatrixSDTable() {
    }

    public Map<String, IAlMatrixSDEntry> getAlMatrixSDEntry() {
        return this.alMatrixSDEntry;
    }

    public IAlMatrixSDEntry getEntry(String key) {
        return alMatrixSDEntry.get(key);
    }

    public void setEntry(String key, IAlMatrixSDEntry value) {
        alMatrixSDEntry.put(key, value);
        ((AlMatrixSDEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IAlMatrixSDEntry> getEntries() {
        return alMatrixSDEntry;
    }

    public AlMatrixSDEntry createEntry(String entryIndex) {
        AlMatrixSDEntry newEntry = new AlMatrixSDEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.17.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("alMatrixSDEntry", alMatrixSDEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(alMatrixSDEntry).toHashCode();
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
        AlMatrixSDTable rhs = ((AlMatrixSDTable) obj);
        return new EqualsBuilder().append(alMatrixSDEntry, rhs.alMatrixSDEntry).isEquals();
    }

    public AlMatrixSDTable clone() {
        AlMatrixSDTable _copy = new AlMatrixSDTable();
        for (Map.Entry<String, IAlMatrixSDEntry> _entry: alMatrixSDEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.17.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "alMatrixSDEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
