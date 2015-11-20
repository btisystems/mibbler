
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.networkelement.ntpclient;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.networkelement.ntpclient.ntpclientassoctable.NtpClientAssocEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.networkelement.ntpclient.INtpClientAssocTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.networkelement.ntpclient.ntpclientassoctable.INtpClientAssocEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NtpClientAssocTable
    extends DeviceEntity
    implements Serializable, INtpClientAssocTable, ITableAccess<INtpClientAssocEntry>
{

    private Map<String, INtpClientAssocEntry> ntpClientAssocEntry = new TreeMap<String, INtpClientAssocEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NtpClientAssocTable() {
    }

    public Map<String, INtpClientAssocEntry> getNtpClientAssocEntry() {
        return this.ntpClientAssocEntry;
    }

    public INtpClientAssocEntry getEntry(String key) {
        return ntpClientAssocEntry.get(key);
    }

    public void setEntry(String key, INtpClientAssocEntry value) {
        ntpClientAssocEntry.put(key, value);
        ((NtpClientAssocEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, INtpClientAssocEntry> getEntries() {
        return ntpClientAssocEntry;
    }

    public NtpClientAssocEntry createEntry(String entryIndex) {
        NtpClientAssocEntry newEntry = new NtpClientAssocEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.1.13.6.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ntpClientAssocEntry", ntpClientAssocEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ntpClientAssocEntry).toHashCode();
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
        NtpClientAssocTable rhs = ((NtpClientAssocTable) obj);
        return new EqualsBuilder().append(ntpClientAssocEntry, rhs.ntpClientAssocEntry).isEquals();
    }

    public NtpClientAssocTable clone() {
        NtpClientAssocTable _copy = new NtpClientAssocTable();
        for (Map.Entry<String, INtpClientAssocEntry> _entry: ntpClientAssocEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.1.13.6"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ntpClientAssocEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
