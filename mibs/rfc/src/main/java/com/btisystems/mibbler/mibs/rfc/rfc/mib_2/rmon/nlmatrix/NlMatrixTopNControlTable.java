
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.INlMatrixTopNControlTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.nlmatrixtopncontroltable.INlMatrixTopNControlEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.nlmatrixtopncontroltable.NlMatrixTopNControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NlMatrixTopNControlTable
    extends DeviceEntity
    implements Serializable, INlMatrixTopNControlTable, ITableAccess<INlMatrixTopNControlEntry>
{

    private Map<String, INlMatrixTopNControlEntry> nlMatrixTopNControlEntry = new TreeMap<String, INlMatrixTopNControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlMatrixTopNControlTable() {
    }

    public Map<String, INlMatrixTopNControlEntry> getNlMatrixTopNControlEntry() {
        return this.nlMatrixTopNControlEntry;
    }

    public INlMatrixTopNControlEntry getEntry(String key) {
        return nlMatrixTopNControlEntry.get(key);
    }

    public void setEntry(String key, INlMatrixTopNControlEntry value) {
        nlMatrixTopNControlEntry.put(key, value);
        ((NlMatrixTopNControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, INlMatrixTopNControlEntry> getEntries() {
        return nlMatrixTopNControlEntry;
    }

    public NlMatrixTopNControlEntry createEntry(String entryIndex) {
        NlMatrixTopNControlEntry newEntry = new NlMatrixTopNControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.15.4.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlMatrixTopNControlEntry", nlMatrixTopNControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlMatrixTopNControlEntry).toHashCode();
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
        NlMatrixTopNControlTable rhs = ((NlMatrixTopNControlTable) obj);
        return new EqualsBuilder().append(nlMatrixTopNControlEntry, rhs.nlMatrixTopNControlEntry).isEquals();
    }

    public NlMatrixTopNControlTable clone() {
        NlMatrixTopNControlTable _copy = new NlMatrixTopNControlTable();
        for (Map.Entry<String, INlMatrixTopNControlEntry> _entry: nlMatrixTopNControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.15.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlMatrixTopNControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
