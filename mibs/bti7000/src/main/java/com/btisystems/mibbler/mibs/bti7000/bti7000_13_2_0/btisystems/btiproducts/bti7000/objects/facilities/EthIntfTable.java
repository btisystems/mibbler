
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.facilities.ethintftable.EthIntfEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.IEthIntfTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.facilities.ethintftable.IEthIntfEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class EthIntfTable
    extends DeviceEntity
    implements Serializable, IEthIntfTable, ITableAccess<IEthIntfEntry>
{

    private Map<String, IEthIntfEntry> ethIntfEntry = new TreeMap<String, IEthIntfEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public EthIntfTable() {
    }

    public Map<String, IEthIntfEntry> getEthIntfEntry() {
        return this.ethIntfEntry;
    }

    public IEthIntfEntry getEntry(String key) {
        return ethIntfEntry.get(key);
    }

    public void setEntry(String key, IEthIntfEntry value) {
        ethIntfEntry.put(key, value);
        ((EthIntfEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IEthIntfEntry> getEntries() {
        return ethIntfEntry;
    }

    public EthIntfEntry createEntry(String entryIndex) {
        EthIntfEntry newEntry = new EthIntfEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.4.14.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ethIntfEntry", ethIntfEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ethIntfEntry).toHashCode();
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
        EthIntfTable rhs = ((EthIntfTable) obj);
        return new EqualsBuilder().append(ethIntfEntry, rhs.ethIntfEntry).isEquals();
    }

    public EthIntfTable clone() {
        EthIntfTable _copy = new EthIntfTable();
        for (Map.Entry<String, IEthIntfEntry> _entry: ethIntfEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.4.14"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ethIntfEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
