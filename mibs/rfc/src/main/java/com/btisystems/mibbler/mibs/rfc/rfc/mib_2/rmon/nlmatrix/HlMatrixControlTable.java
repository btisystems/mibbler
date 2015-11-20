
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.IHlMatrixControlTable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.nlmatrix.hlmatrixcontroltable.IHlMatrixControlEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.nlmatrix.hlmatrixcontroltable.HlMatrixControlEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HlMatrixControlTable
    extends DeviceEntity
    implements Serializable, IHlMatrixControlTable, ITableAccess<IHlMatrixControlEntry>
{

    private Map<String, IHlMatrixControlEntry> hlMatrixControlEntry = new TreeMap<String, IHlMatrixControlEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HlMatrixControlTable() {
    }

    public Map<String, IHlMatrixControlEntry> getHlMatrixControlEntry() {
        return this.hlMatrixControlEntry;
    }

    public IHlMatrixControlEntry getEntry(String key) {
        return hlMatrixControlEntry.get(key);
    }

    public void setEntry(String key, IHlMatrixControlEntry value) {
        hlMatrixControlEntry.put(key, value);
        ((HlMatrixControlEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHlMatrixControlEntry> getEntries() {
        return hlMatrixControlEntry;
    }

    public HlMatrixControlEntry createEntry(String entryIndex) {
        HlMatrixControlEntry newEntry = new HlMatrixControlEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.15.1.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hlMatrixControlEntry", hlMatrixControlEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hlMatrixControlEntry).toHashCode();
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
        HlMatrixControlTable rhs = ((HlMatrixControlTable) obj);
        return new EqualsBuilder().append(hlMatrixControlEntry, rhs.hlMatrixControlEntry).isEquals();
    }

    public HlMatrixControlTable clone() {
        HlMatrixControlTable _copy = new HlMatrixControlTable();
        for (Map.Entry<String, IHlMatrixControlEntry> _entry: hlMatrixControlEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.15.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hlMatrixControlEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
