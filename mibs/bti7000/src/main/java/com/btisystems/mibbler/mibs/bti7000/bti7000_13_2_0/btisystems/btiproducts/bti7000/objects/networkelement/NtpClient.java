
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.networkelement;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.networkelement.INtpClient;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class NtpClient
    extends DeviceEntity
    implements Serializable, INtpClient, IVariableBindingSetter
{

    private String ntpClientPollingRate;
    private int ntpClientAuthKey;
    private String ntpClientSyncState;
    private int ntpClientStratum;
    private String ntpClientRefIPAddr;
    private String ntpOldTimeAndDate;
    private String ntpNewTimeAndDate;
    private String ntpRefIP;
    private int ntpRefStratum;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NtpClient() {
    }

    public String getNtpClientPollingRate() {
        return this.ntpClientPollingRate;
    }

    public void setNtpClientPollingRate(String ntpClientPollingRate) {
        String oldValue = getNtpClientPollingRate();
        this.ntpClientPollingRate = ntpClientPollingRate;
        notifyChange(1, oldValue, ntpClientPollingRate);
    }

    public int getNtpClientAuthKey() {
        return this.ntpClientAuthKey;
    }

    public void setNtpClientAuthKey(int ntpClientAuthKey) {
        int oldValue = getNtpClientAuthKey();
        this.ntpClientAuthKey = ntpClientAuthKey;
        notifyChange(2, oldValue, ntpClientAuthKey);
    }

    public String getNtpClientSyncState() {
        return this.ntpClientSyncState;
    }

    public void setNtpClientSyncState(String ntpClientSyncState) {
        String oldValue = getNtpClientSyncState();
        this.ntpClientSyncState = ntpClientSyncState;
        notifyChange(3, oldValue, ntpClientSyncState);
    }

    public int getNtpClientStratum() {
        return this.ntpClientStratum;
    }

    public void setNtpClientStratum(int ntpClientStratum) {
        int oldValue = getNtpClientStratum();
        this.ntpClientStratum = ntpClientStratum;
        notifyChange(4, oldValue, ntpClientStratum);
    }

    public String getNtpClientRefIPAddr() {
        return this.ntpClientRefIPAddr;
    }

    public void setNtpClientRefIPAddr(String ntpClientRefIPAddr) {
        String oldValue = getNtpClientRefIPAddr();
        this.ntpClientRefIPAddr = ntpClientRefIPAddr;
        notifyChange(5, oldValue, ntpClientRefIPAddr);
    }

    public String getNtpOldTimeAndDate() {
        return this.ntpOldTimeAndDate;
    }

    public void setNtpOldTimeAndDate(String ntpOldTimeAndDate) {
        String oldValue = getNtpOldTimeAndDate();
        this.ntpOldTimeAndDate = ntpOldTimeAndDate;
        notifyChange(7, oldValue, ntpOldTimeAndDate);
    }

    public String getNtpNewTimeAndDate() {
        return this.ntpNewTimeAndDate;
    }

    public void setNtpNewTimeAndDate(String ntpNewTimeAndDate) {
        String oldValue = getNtpNewTimeAndDate();
        this.ntpNewTimeAndDate = ntpNewTimeAndDate;
        notifyChange(8, oldValue, ntpNewTimeAndDate);
    }

    public String getNtpRefIP() {
        return this.ntpRefIP;
    }

    public void setNtpRefIP(String ntpRefIP) {
        String oldValue = getNtpRefIP();
        this.ntpRefIP = ntpRefIP;
        notifyChange(9, oldValue, ntpRefIP);
    }

    public int getNtpRefStratum() {
        return this.ntpRefStratum;
    }

    public void setNtpRefStratum(int ntpRefStratum) {
        int oldValue = getNtpRefStratum();
        this.ntpRefStratum = ntpRefStratum;
        notifyChange(10, oldValue, ntpRefStratum);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setNtpClientPollingRate(binding.getVariable().toString());
                break;
            case  2 :
                setNtpClientAuthKey(binding.getVariable().toInt());
                break;
            case  3 :
                setNtpClientSyncState(binding.getVariable().toString());
                break;
            case  4 :
                setNtpClientStratum(binding.getVariable().toInt());
                break;
            case  5 :
                setNtpClientRefIPAddr(binding.getVariable().toString());
                break;
            case  7 :
                setNtpOldTimeAndDate(binding.getVariable().toString());
                break;
            case  8 :
                setNtpNewTimeAndDate(binding.getVariable().toString());
                break;
            case  9 :
                setNtpRefIP(binding.getVariable().toString());
                break;
            case  10 :
                setNtpRefStratum(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ntpClientPollingRate", ntpClientPollingRate).append("ntpClientAuthKey", ntpClientAuthKey).append("ntpClientSyncState", ntpClientSyncState).append("ntpClientStratum", ntpClientStratum).append("ntpClientRefIPAddr", ntpClientRefIPAddr).append("ntpOldTimeAndDate", ntpOldTimeAndDate).append("ntpNewTimeAndDate", ntpNewTimeAndDate).append("ntpRefIP", ntpRefIP).append("ntpRefStratum", ntpRefStratum).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ntpClientPollingRate).append(ntpClientAuthKey).append(ntpClientSyncState).append(ntpClientStratum).append(ntpClientRefIPAddr).append(ntpOldTimeAndDate).append(ntpNewTimeAndDate).append(ntpRefIP).append(ntpRefStratum).toHashCode();
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
        NtpClient rhs = ((NtpClient) obj);
        return new EqualsBuilder().append(ntpClientPollingRate, rhs.ntpClientPollingRate).append(ntpClientAuthKey, rhs.ntpClientAuthKey).append(ntpClientSyncState, rhs.ntpClientSyncState).append(ntpClientStratum, rhs.ntpClientStratum).append(ntpClientRefIPAddr, rhs.ntpClientRefIPAddr).append(ntpOldTimeAndDate, rhs.ntpOldTimeAndDate).append(ntpNewTimeAndDate, rhs.ntpNewTimeAndDate).append(ntpRefIP, rhs.ntpRefIP).append(ntpRefStratum, rhs.ntpRefStratum).isEquals();
    }

    public NtpClient clone() {
        NtpClient _copy = new NtpClient();
        _copy.ntpClientPollingRate = ntpClientPollingRate;
        _copy.ntpClientAuthKey = ntpClientAuthKey;
        _copy.ntpClientSyncState = ntpClientSyncState;
        _copy.ntpClientStratum = ntpClientStratum;
        _copy.ntpClientRefIPAddr = ntpClientRefIPAddr;
        _copy.ntpOldTimeAndDate = ntpOldTimeAndDate;
        _copy.ntpNewTimeAndDate = ntpNewTimeAndDate;
        _copy.ntpRefIP = ntpRefIP;
        _copy.ntpRefStratum = ntpRefStratum;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.1.13"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ntpClientPollingRate", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ntpClientAuthKey", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ntpClientSyncState", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ntpClientStratum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ntpClientRefIPAddr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ntpOldTimeAndDate", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ntpNewTimeAndDate", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ntpRefIP", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ntpRefStratum", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
