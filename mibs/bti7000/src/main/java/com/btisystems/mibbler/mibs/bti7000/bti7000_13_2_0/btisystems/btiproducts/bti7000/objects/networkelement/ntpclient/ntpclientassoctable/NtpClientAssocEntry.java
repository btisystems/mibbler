
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.networkelement.ntpclient.ntpclientassoctable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.networkelement.ntpclient.NtpClientAssocTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.networkelement.ntpclient.ntpclientassoctable.INtpClientAssocEntry;
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

public class NtpClientAssocEntry
    extends DeviceEntity
    implements Serializable, INtpClientAssocEntry, IIndexed, IVariableBindingSetter
{

    private String ntpClientAssocIdx;
    private int ntpClientAssocRowStatus;
    private String _index;
    private NtpClientAssocTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NtpClientAssocEntry() {
    }

    public String getNtpClientAssocIdx() {
        return this.ntpClientAssocIdx;
    }

    public void setNtpClientAssocIdx(String ntpClientAssocIdx) {
        String oldValue = getNtpClientAssocIdx();
        this.ntpClientAssocIdx = ntpClientAssocIdx;
        notifyChange(1, oldValue, ntpClientAssocIdx);
    }

    public int getNtpClientAssocRowStatus() {
        return this.ntpClientAssocRowStatus;
    }

    public void setNtpClientAssocRowStatus(int ntpClientAssocRowStatus) {
        int oldValue = getNtpClientAssocRowStatus();
        this.ntpClientAssocRowStatus = ntpClientAssocRowStatus;
        notifyChange(100, oldValue, ntpClientAssocRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(14)) {
            case  1 :
                setNtpClientAssocIdx(binding.getVariable().toString());
                break;
            case  100 :
                setNtpClientAssocRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 15;
        int _len;
        _index = new OID(_oidInts, 15, (oid.size()- 15)).toString();
        setNtpClientAssocIdx(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(NtpClientAssocTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ntpClientAssocIdx", ntpClientAssocIdx).append("ntpClientAssocRowStatus", ntpClientAssocRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ntpClientAssocIdx).append(ntpClientAssocRowStatus).append(_index).toHashCode();
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
        NtpClientAssocEntry rhs = ((NtpClientAssocEntry) obj);
        return new EqualsBuilder().append(ntpClientAssocIdx, rhs.ntpClientAssocIdx).append(ntpClientAssocRowStatus, rhs.ntpClientAssocRowStatus).append(_index, rhs._index).isEquals();
    }

    public NtpClientAssocEntry clone() {
        NtpClientAssocEntry _copy = new NtpClientAssocEntry();
        _copy.ntpClientAssocIdx = ntpClientAssocIdx;
        _copy.ntpClientAssocRowStatus = ntpClientAssocRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.1.13.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ntpClientAssocIdx", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "ntpClientAssocRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
