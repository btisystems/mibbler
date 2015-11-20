
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.INlMatrixTopNTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.nlmatrixtopntable.INlMatrixTopNEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.nlmatrixtopntable.NlMatrixTopNEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NlMatrixTopNTable
    extends DeviceEntity
    implements Serializable, INlMatrixTopNTable, ITableAccess<INlMatrixTopNEntry>
{

    private Map<String, INlMatrixTopNEntry> nlMatrixTopNEntry = new TreeMap<String, INlMatrixTopNEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlMatrixTopNTable() {
    }

    public Map<String, INlMatrixTopNEntry> getNlMatrixTopNEntry() {
        return this.nlMatrixTopNEntry;
    }

    public INlMatrixTopNEntry getEntry(String key) {
        return nlMatrixTopNEntry.get(key);
    }

    public void setEntry(String key, INlMatrixTopNEntry value) {
        nlMatrixTopNEntry.put(key, value);
        ((NlMatrixTopNEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, INlMatrixTopNEntry> getEntries() {
        return nlMatrixTopNEntry;
    }

    public NlMatrixTopNEntry createEntry(String entryIndex) {
        NlMatrixTopNEntry newEntry = new NlMatrixTopNEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.15.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlMatrixTopNEntry", nlMatrixTopNEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlMatrixTopNEntry).toHashCode();
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
        NlMatrixTopNTable rhs = ((NlMatrixTopNTable) obj);
        return new EqualsBuilder().append(nlMatrixTopNEntry, rhs.nlMatrixTopNEntry).isEquals();
    }

    public NlMatrixTopNTable clone() {
        NlMatrixTopNTable _copy = new NlMatrixTopNTable();
        for (Map.Entry<String, INlMatrixTopNEntry> _entry: nlMatrixTopNEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.15.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlMatrixTopNEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
