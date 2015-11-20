
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlmatrix;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlmatrix.nlmatrixsdtable.NlMatrixSDEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlmatrix.INlMatrixSDTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlmatrix.nlmatrixsdtable.INlMatrixSDEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NlMatrixSDTable
    extends DeviceEntity
    implements Serializable, INlMatrixSDTable, ITableAccess<INlMatrixSDEntry>
{

    private Map<String, INlMatrixSDEntry> nlMatrixSDEntry = new TreeMap<String, INlMatrixSDEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlMatrixSDTable() {
    }

    public Map<String, INlMatrixSDEntry> getNlMatrixSDEntry() {
        return this.nlMatrixSDEntry;
    }

    public INlMatrixSDEntry getEntry(String key) {
        return nlMatrixSDEntry.get(key);
    }

    public void setEntry(String key, INlMatrixSDEntry value) {
        nlMatrixSDEntry.put(key, value);
        ((NlMatrixSDEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, INlMatrixSDEntry> getEntries() {
        return nlMatrixSDEntry;
    }

    public NlMatrixSDEntry createEntry(String entryIndex) {
        NlMatrixSDEntry newEntry = new NlMatrixSDEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.15.2.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlMatrixSDEntry", nlMatrixSDEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlMatrixSDEntry).toHashCode();
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
        NlMatrixSDTable rhs = ((NlMatrixSDTable) obj);
        return new EqualsBuilder().append(nlMatrixSDEntry, rhs.nlMatrixSDEntry).isEquals();
    }

    public NlMatrixSDTable clone() {
        NlMatrixSDTable _copy = new NlMatrixSDTable();
        for (Map.Entry<String, INlMatrixSDEntry> _entry: nlMatrixSDEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.15.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlMatrixSDEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
