
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmconfig.nlmconfiglogtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmconfig.nlmconfiglogtable.INlmConfigLogEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmconfig.NlmConfigLogTable;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IIndexed;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class NlmConfigLogEntry
    extends DeviceEntity
    implements Serializable, INlmConfigLogEntry, IIndexed, IVariableBindingSetter
{

    private String nlmLogName;
    private String nlmConfigLogFilterName;
    private Integer nlmConfigLogEntryLimit;
    private Integer nlmConfigLogAdminStatus;
    private int nlmConfigLogOperStatus;
    private int nlmConfigLogStorageType;
    private int nlmConfigLogEntryStatus;
    private String _index;
    private NlmConfigLogTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlmConfigLogEntry() {
    }

    public String getNlmLogName() {
        return this.nlmLogName;
    }

    public void setNlmLogName(String nlmLogName) {
        String oldValue = getNlmLogName();
        this.nlmLogName = nlmLogName;
        notifyChange(1, oldValue, nlmLogName);
    }

    public String getNlmConfigLogFilterName() {
        return this.nlmConfigLogFilterName;
    }

    public void setNlmConfigLogFilterName(String nlmConfigLogFilterName) {
        String oldValue = getNlmConfigLogFilterName();
        this.nlmConfigLogFilterName = nlmConfigLogFilterName;
        notifyChange(2, oldValue, nlmConfigLogFilterName);
    }

    public int getNlmConfigLogEntryLimit() {
        if (this.nlmConfigLogEntryLimit == null) {
            return  0;
        }
        return this.nlmConfigLogEntryLimit;
    }

    public boolean isNlmConfigLogEntryLimitDefined() {
        return (this.nlmConfigLogEntryLimit!= null);
    }

    public void setNlmConfigLogEntryLimit(int nlmConfigLogEntryLimit) {
        int oldValue = getNlmConfigLogEntryLimit();
        this.nlmConfigLogEntryLimit = nlmConfigLogEntryLimit;
        notifyChange(3, oldValue, nlmConfigLogEntryLimit);
    }

    public int getNlmConfigLogAdminStatus() {
        if (this.nlmConfigLogAdminStatus == null) {
            return  1;
        }
        return this.nlmConfigLogAdminStatus;
    }

    public boolean isNlmConfigLogAdminStatusDefined() {
        return (this.nlmConfigLogAdminStatus!= null);
    }

    public void setNlmConfigLogAdminStatus(int nlmConfigLogAdminStatus) {
        int oldValue = getNlmConfigLogAdminStatus();
        this.nlmConfigLogAdminStatus = nlmConfigLogAdminStatus;
        notifyChange(4, oldValue, nlmConfigLogAdminStatus);
    }

    public int getNlmConfigLogOperStatus() {
        return this.nlmConfigLogOperStatus;
    }

    public void setNlmConfigLogOperStatus(int nlmConfigLogOperStatus) {
        int oldValue = getNlmConfigLogOperStatus();
        this.nlmConfigLogOperStatus = nlmConfigLogOperStatus;
        notifyChange(5, oldValue, nlmConfigLogOperStatus);
    }

    public int getNlmConfigLogStorageType() {
        return this.nlmConfigLogStorageType;
    }

    public void setNlmConfigLogStorageType(int nlmConfigLogStorageType) {
        int oldValue = getNlmConfigLogStorageType();
        this.nlmConfigLogStorageType = nlmConfigLogStorageType;
        notifyChange(6, oldValue, nlmConfigLogStorageType);
    }

    public int getNlmConfigLogEntryStatus() {
        return this.nlmConfigLogEntryStatus;
    }

    public void setNlmConfigLogEntryStatus(int nlmConfigLogEntryStatus) {
        int oldValue = getNlmConfigLogEntryStatus();
        this.nlmConfigLogEntryStatus = nlmConfigLogEntryStatus;
        notifyChange(7, oldValue, nlmConfigLogEntryStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setNlmLogName(binding.getVariable().toString());
                break;
            case  2 :
                setNlmConfigLogFilterName(binding.getVariable().toString());
                break;
            case  3 :
                setNlmConfigLogEntryLimit(binding.getVariable().toInt());
                break;
            case  4 :
                setNlmConfigLogAdminStatus(binding.getVariable().toInt());
                break;
            case  5 :
                setNlmConfigLogOperStatus(binding.getVariable().toInt());
                break;
            case  6 :
                setNlmConfigLogStorageType(binding.getVariable().toInt());
                break;
            case  7 :
                setNlmConfigLogEntryStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 12;
        int _len;
        _index = new OID(_oidInts, 12, (oid.size()- 12)).toString();
        _len = _oidInts[arrayOffset ++];
        setNlmLogName(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(NlmConfigLogTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlmLogName", nlmLogName).append("nlmConfigLogFilterName", nlmConfigLogFilterName).append("nlmConfigLogEntryLimit", nlmConfigLogEntryLimit).append("nlmConfigLogAdminStatus", nlmConfigLogAdminStatus).append("nlmConfigLogOperStatus", nlmConfigLogOperStatus).append("nlmConfigLogStorageType", nlmConfigLogStorageType).append("nlmConfigLogEntryStatus", nlmConfigLogEntryStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlmLogName).append(nlmConfigLogFilterName).append(nlmConfigLogEntryLimit).append(nlmConfigLogAdminStatus).append(nlmConfigLogOperStatus).append(nlmConfigLogStorageType).append(nlmConfigLogEntryStatus).append(_index).toHashCode();
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
        NlmConfigLogEntry rhs = ((NlmConfigLogEntry) obj);
        return new EqualsBuilder().append(nlmLogName, rhs.nlmLogName).append(nlmConfigLogFilterName, rhs.nlmConfigLogFilterName).append(nlmConfigLogEntryLimit, rhs.nlmConfigLogEntryLimit).append(nlmConfigLogAdminStatus, rhs.nlmConfigLogAdminStatus).append(nlmConfigLogOperStatus, rhs.nlmConfigLogOperStatus).append(nlmConfigLogStorageType, rhs.nlmConfigLogStorageType).append(nlmConfigLogEntryStatus, rhs.nlmConfigLogEntryStatus).append(_index, rhs._index).isEquals();
    }

    public NlmConfigLogEntry clone() {
        NlmConfigLogEntry _copy = new NlmConfigLogEntry();
        _copy.nlmLogName = nlmLogName;
        _copy.nlmConfigLogFilterName = nlmConfigLogFilterName;
        _copy.nlmConfigLogEntryLimit = nlmConfigLogEntryLimit;
        _copy.nlmConfigLogAdminStatus = nlmConfigLogAdminStatus;
        _copy.nlmConfigLogOperStatus = nlmConfigLogOperStatus;
        _copy.nlmConfigLogStorageType = nlmConfigLogStorageType;
        _copy.nlmConfigLogEntryStatus = nlmConfigLogEntryStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.92.1.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlmLogName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "nlmConfigLogFilterName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "nlmConfigLogEntryLimit", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "nlmConfigLogAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "nlmConfigLogOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "nlmConfigLogStorageType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "nlmConfigLogEntryStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
