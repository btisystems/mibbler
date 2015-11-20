
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.IHrPrinterTable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrprintertable.IHrPrinterEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrprintertable.HrPrinterEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class HrPrinterTable
    extends DeviceEntity
    implements Serializable, IHrPrinterTable, ITableAccess<IHrPrinterEntry>
{

    private Map<String, IHrPrinterEntry> hrPrinterEntry = new TreeMap<String, IHrPrinterEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrPrinterTable() {
    }

    public Map<String, IHrPrinterEntry> getHrPrinterEntry() {
        return this.hrPrinterEntry;
    }

    public IHrPrinterEntry getEntry(String key) {
        return hrPrinterEntry.get(key);
    }

    public void setEntry(String key, IHrPrinterEntry value) {
        hrPrinterEntry.put(key, value);
        ((HrPrinterEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IHrPrinterEntry> getEntries() {
        return hrPrinterEntry;
    }

    public HrPrinterEntry createEntry(String entryIndex) {
        HrPrinterEntry newEntry = new HrPrinterEntry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.25.3.5.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrPrinterEntry", hrPrinterEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrPrinterEntry).toHashCode();
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
        HrPrinterTable rhs = ((HrPrinterTable) obj);
        return new EqualsBuilder().append(hrPrinterEntry, rhs.hrPrinterEntry).isEquals();
    }

    public HrPrinterTable clone() {
        HrPrinterTable _copy = new HrPrinterTable();
        for (Map.Entry<String, IHrPrinterEntry> _entry: hrPrinterEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrPrinterEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
