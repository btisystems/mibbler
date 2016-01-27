
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.nlmlogtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.nlmlogtable.INlmLogEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmlog.NlmLogTable;
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

public class NlmLogEntry
    extends DeviceEntity
    implements Serializable, INlmLogEntry, IIndexed, IVariableBindingSetter
{

    private int nlmLogIndex;
    private int nlmLogTime;
    private String nlmLogDateAndTime;
    private String nlmLogEngineID;
    private String nlmLogEngineTAddress;
    private String nlmLogEngineTDomain;
    private String nlmLogContextEngineID;
    private String nlmLogContextName;
    private String nlmLogNotificationID;
    private String _index;
    private NlmLogTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlmLogEntry() {
    }

    public int getNlmLogIndex() {
        return this.nlmLogIndex;
    }

    public void setNlmLogIndex(int nlmLogIndex) {
        int oldValue = getNlmLogIndex();
        this.nlmLogIndex = nlmLogIndex;
        notifyChange(1, oldValue, nlmLogIndex);
    }

    public int getNlmLogTime() {
        return this.nlmLogTime;
    }

    public void setNlmLogTime(int nlmLogTime) {
        int oldValue = getNlmLogTime();
        this.nlmLogTime = nlmLogTime;
        notifyChange(2, oldValue, nlmLogTime);
    }

    public String getNlmLogDateAndTime() {
        return this.nlmLogDateAndTime;
    }

    public void setNlmLogDateAndTime(String nlmLogDateAndTime) {
        String oldValue = getNlmLogDateAndTime();
        this.nlmLogDateAndTime = nlmLogDateAndTime;
        notifyChange(3, oldValue, nlmLogDateAndTime);
    }

    public String getNlmLogEngineID() {
        return this.nlmLogEngineID;
    }

    public void setNlmLogEngineID(String nlmLogEngineID) {
        String oldValue = getNlmLogEngineID();
        this.nlmLogEngineID = nlmLogEngineID;
        notifyChange(4, oldValue, nlmLogEngineID);
    }

    public String getNlmLogEngineTAddress() {
        return this.nlmLogEngineTAddress;
    }

    public void setNlmLogEngineTAddress(String nlmLogEngineTAddress) {
        String oldValue = getNlmLogEngineTAddress();
        this.nlmLogEngineTAddress = nlmLogEngineTAddress;
        notifyChange(5, oldValue, nlmLogEngineTAddress);
    }

    public String getNlmLogEngineTDomain() {
        return this.nlmLogEngineTDomain;
    }

    public void setNlmLogEngineTDomain(String nlmLogEngineTDomain) {
        String oldValue = getNlmLogEngineTDomain();
        this.nlmLogEngineTDomain = nlmLogEngineTDomain;
        notifyChange(6, oldValue, nlmLogEngineTDomain);
    }

    public String getNlmLogContextEngineID() {
        return this.nlmLogContextEngineID;
    }

    public void setNlmLogContextEngineID(String nlmLogContextEngineID) {
        String oldValue = getNlmLogContextEngineID();
        this.nlmLogContextEngineID = nlmLogContextEngineID;
        notifyChange(7, oldValue, nlmLogContextEngineID);
    }

    public String getNlmLogContextName() {
        return this.nlmLogContextName;
    }

    public void setNlmLogContextName(String nlmLogContextName) {
        String oldValue = getNlmLogContextName();
        this.nlmLogContextName = nlmLogContextName;
        notifyChange(8, oldValue, nlmLogContextName);
    }

    public String getNlmLogNotificationID() {
        return this.nlmLogNotificationID;
    }

    public void setNlmLogNotificationID(String nlmLogNotificationID) {
        String oldValue = getNlmLogNotificationID();
        this.nlmLogNotificationID = nlmLogNotificationID;
        notifyChange(9, oldValue, nlmLogNotificationID);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setNlmLogIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setNlmLogTime(binding.getVariable().toInt());
                break;
            case  3 :
                setNlmLogDateAndTime(binding.getVariable().toString());
                break;
            case  4 :
                setNlmLogEngineID(binding.getVariable().toString());
                break;
            case  5 :
                setNlmLogEngineTAddress(binding.getVariable().toString());
                break;
            case  6 :
                setNlmLogEngineTDomain(binding.getVariable().toString());
                break;
            case  7 :
                setNlmLogContextEngineID(binding.getVariable().toString());
                break;
            case  8 :
                setNlmLogContextName(binding.getVariable().toString());
                break;
            case  9 :
                setNlmLogNotificationID(binding.getVariable().toString());
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
        arrayOffset += _len;
        setNlmLogIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(NlmLogTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlmLogIndex", nlmLogIndex).append("nlmLogTime", nlmLogTime).append("nlmLogDateAndTime", nlmLogDateAndTime).append("nlmLogEngineID", nlmLogEngineID).append("nlmLogEngineTAddress", nlmLogEngineTAddress).append("nlmLogEngineTDomain", nlmLogEngineTDomain).append("nlmLogContextEngineID", nlmLogContextEngineID).append("nlmLogContextName", nlmLogContextName).append("nlmLogNotificationID", nlmLogNotificationID).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlmLogIndex).append(nlmLogTime).append(nlmLogDateAndTime).append(nlmLogEngineID).append(nlmLogEngineTAddress).append(nlmLogEngineTDomain).append(nlmLogContextEngineID).append(nlmLogContextName).append(nlmLogNotificationID).append(_index).toHashCode();
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
        NlmLogEntry rhs = ((NlmLogEntry) obj);
        return new EqualsBuilder().append(nlmLogIndex, rhs.nlmLogIndex).append(nlmLogTime, rhs.nlmLogTime).append(nlmLogDateAndTime, rhs.nlmLogDateAndTime).append(nlmLogEngineID, rhs.nlmLogEngineID).append(nlmLogEngineTAddress, rhs.nlmLogEngineTAddress).append(nlmLogEngineTDomain, rhs.nlmLogEngineTDomain).append(nlmLogContextEngineID, rhs.nlmLogContextEngineID).append(nlmLogContextName, rhs.nlmLogContextName).append(nlmLogNotificationID, rhs.nlmLogNotificationID).append(_index, rhs._index).isEquals();
    }

    public NlmLogEntry clone() {
        NlmLogEntry _copy = new NlmLogEntry();
        _copy.nlmLogIndex = nlmLogIndex;
        _copy.nlmLogTime = nlmLogTime;
        _copy.nlmLogDateAndTime = nlmLogDateAndTime;
        _copy.nlmLogEngineID = nlmLogEngineID;
        _copy.nlmLogEngineTAddress = nlmLogEngineTAddress;
        _copy.nlmLogEngineTDomain = nlmLogEngineTDomain;
        _copy.nlmLogContextEngineID = nlmLogContextEngineID;
        _copy.nlmLogContextName = nlmLogContextName;
        _copy.nlmLogNotificationID = nlmLogNotificationID;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.92.1.3.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlmLogIndex", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "nlmLogTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "nlmLogDateAndTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "nlmLogEngineID", DeviceEntityDescription.FieldType.STRING, 32));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "nlmLogEngineTAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "nlmLogEngineTDomain", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "nlmLogContextEngineID", DeviceEntityDescription.FieldType.STRING, 32));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "nlmLogContextName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "nlmLogNotificationID", DeviceEntityDescription.FieldType.OID, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
