
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.IMtaGroupAssociationTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtagroupassociationtable.IMtaGroupAssociationEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.mtagroupassociationtable.MtaGroupAssociationEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class MtaGroupAssociationTable
    extends DeviceEntity
    implements Serializable, IMtaGroupAssociationTable, ITableAccess<IMtaGroupAssociationEntry>
{

    private Map<String, IMtaGroupAssociationEntry> mtaGroupAssociationEntry = new TreeMap<String, IMtaGroupAssociationEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MtaGroupAssociationTable() {
    }

    public Map<String, IMtaGroupAssociationEntry> getMtaGroupAssociationEntry() {
        return this.mtaGroupAssociationEntry;
    }

    public IMtaGroupAssociationEntry getEntry(String key) {
        return mtaGroupAssociationEntry.get(key);
    }

    public void setEntry(String key, IMtaGroupAssociationEntry value) {
        mtaGroupAssociationEntry.put(key, value);
        ((MtaGroupAssociationEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IMtaGroupAssociationEntry> getEntries() {
        return mtaGroupAssociationEntry;
    }

    public MtaGroupAssociationEntry createEntry(String entryIndex) {
        MtaGroupAssociationEntry newEntry = new MtaGroupAssociationEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.28.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mtaGroupAssociationEntry", mtaGroupAssociationEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mtaGroupAssociationEntry).toHashCode();
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
        MtaGroupAssociationTable rhs = ((MtaGroupAssociationTable) obj);
        return new EqualsBuilder().append(mtaGroupAssociationEntry, rhs.mtaGroupAssociationEntry).isEquals();
    }

    public MtaGroupAssociationTable clone() {
        MtaGroupAssociationTable _copy = new MtaGroupAssociationTable();
        for (Map.Entry<String, IMtaGroupAssociationEntry> _entry: mtaGroupAssociationEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.28.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mtaGroupAssociationEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
