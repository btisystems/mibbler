
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.INlMatrixDSTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.nlmatrixdstable.INlMatrixDSEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.nlmatrixdstable.NlMatrixDSEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NlMatrixDSTable
    extends DeviceEntity
    implements Serializable, INlMatrixDSTable, ITableAccess<INlMatrixDSEntry>
{

    private Map<String, INlMatrixDSEntry> nlMatrixDSEntry = new TreeMap<String, INlMatrixDSEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlMatrixDSTable() {
    }

    public Map<String, INlMatrixDSEntry> getNlMatrixDSEntry() {
        return this.nlMatrixDSEntry;
    }

    public INlMatrixDSEntry getEntry(String key) {
        return nlMatrixDSEntry.get(key);
    }

    public void setEntry(String key, INlMatrixDSEntry value) {
        nlMatrixDSEntry.put(key, value);
        ((NlMatrixDSEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, INlMatrixDSEntry> getEntries() {
        return nlMatrixDSEntry;
    }

    public NlMatrixDSEntry createEntry(String entryIndex) {
        NlMatrixDSEntry newEntry = new NlMatrixDSEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.15.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlMatrixDSEntry", nlMatrixDSEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlMatrixDSEntry).toHashCode();
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
        NlMatrixDSTable rhs = ((NlMatrixDSTable) obj);
        return new EqualsBuilder().append(nlMatrixDSEntry, rhs.nlMatrixDSEntry).isEquals();
    }

    public NlMatrixDSTable clone() {
        NlMatrixDSTable _copy = new NlMatrixDSTable();
        for (Map.Entry<String, INlMatrixDSEntry> _entry: nlMatrixDSEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.15.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlMatrixDSEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
