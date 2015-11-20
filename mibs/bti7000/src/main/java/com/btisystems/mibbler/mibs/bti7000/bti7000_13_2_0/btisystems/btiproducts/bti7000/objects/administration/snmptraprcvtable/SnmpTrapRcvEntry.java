
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.administration.snmptraprcvtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.administration.SnmpTrapRcvTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.administration.snmptraprcvtable.ISnmpTrapRcvEntry;
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

public class SnmpTrapRcvEntry
    extends DeviceEntity
    implements Serializable, ISnmpTrapRcvEntry, IIndexed, IVariableBindingSetter
{

    private String snmpTrapRcvIdx;
    private String snmpTrapRcvIPAddr;
    private Integer snmpTrapRcvPort;
    private Integer snmpTrapRcvNotifType;
    private int snmpTrapRcvVersion;
    private String snmpTrapRcvCommunity;
    private String snmpTrapRcvTTL;
    private int snmpTrapRcvRowStatus;
    private String _index;
    private SnmpTrapRcvTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SnmpTrapRcvEntry() {
    }

    public String getSnmpTrapRcvIdx() {
        return this.snmpTrapRcvIdx;
    }

    public void setSnmpTrapRcvIdx(String snmpTrapRcvIdx) {
        String oldValue = getSnmpTrapRcvIdx();
        this.snmpTrapRcvIdx = snmpTrapRcvIdx;
        notifyChange(1, oldValue, snmpTrapRcvIdx);
    }

    public String getSnmpTrapRcvIPAddr() {
        return this.snmpTrapRcvIPAddr;
    }

    public void setSnmpTrapRcvIPAddr(String snmpTrapRcvIPAddr) {
        String oldValue = getSnmpTrapRcvIPAddr();
        this.snmpTrapRcvIPAddr = snmpTrapRcvIPAddr;
        notifyChange(2, oldValue, snmpTrapRcvIPAddr);
    }

    public int getSnmpTrapRcvPort() {
        if (this.snmpTrapRcvPort == null) {
            return  162;
        }
        return this.snmpTrapRcvPort;
    }

    public boolean isSnmpTrapRcvPortDefined() {
        return (this.snmpTrapRcvPort!= null);
    }

    public void setSnmpTrapRcvPort(int snmpTrapRcvPort) {
        int oldValue = getSnmpTrapRcvPort();
        this.snmpTrapRcvPort = snmpTrapRcvPort;
        notifyChange(3, oldValue, snmpTrapRcvPort);
    }

    public int getSnmpTrapRcvNotifType() {
        if (this.snmpTrapRcvNotifType == null) {
            return  1;
        }
        return this.snmpTrapRcvNotifType;
    }

    public boolean isSnmpTrapRcvNotifTypeDefined() {
        return (this.snmpTrapRcvNotifType!= null);
    }

    public void setSnmpTrapRcvNotifType(int snmpTrapRcvNotifType) {
        int oldValue = getSnmpTrapRcvNotifType();
        this.snmpTrapRcvNotifType = snmpTrapRcvNotifType;
        notifyChange(4, oldValue, snmpTrapRcvNotifType);
    }

    public int getSnmpTrapRcvVersion() {
        return this.snmpTrapRcvVersion;
    }

    public void setSnmpTrapRcvVersion(int snmpTrapRcvVersion) {
        int oldValue = getSnmpTrapRcvVersion();
        this.snmpTrapRcvVersion = snmpTrapRcvVersion;
        notifyChange(5, oldValue, snmpTrapRcvVersion);
    }

    public String getSnmpTrapRcvCommunity() {
        return this.snmpTrapRcvCommunity;
    }

    public void setSnmpTrapRcvCommunity(String snmpTrapRcvCommunity) {
        String oldValue = getSnmpTrapRcvCommunity();
        this.snmpTrapRcvCommunity = snmpTrapRcvCommunity;
        notifyChange(6, oldValue, snmpTrapRcvCommunity);
    }

    public String getSnmpTrapRcvTTL() {
        if (this.snmpTrapRcvTTL == null) {
            return "000-00";
        }
        return this.snmpTrapRcvTTL;
    }

    public boolean isSnmpTrapRcvTTLDefined() {
        return (this.snmpTrapRcvTTL!= null);
    }

    public void setSnmpTrapRcvTTL(String snmpTrapRcvTTL) {
        String oldValue = getSnmpTrapRcvTTL();
        this.snmpTrapRcvTTL = snmpTrapRcvTTL;
        notifyChange(7, oldValue, snmpTrapRcvTTL);
    }

    public int getSnmpTrapRcvRowStatus() {
        return this.snmpTrapRcvRowStatus;
    }

    public void setSnmpTrapRcvRowStatus(int snmpTrapRcvRowStatus) {
        int oldValue = getSnmpTrapRcvRowStatus();
        this.snmpTrapRcvRowStatus = snmpTrapRcvRowStatus;
        notifyChange(100, oldValue, snmpTrapRcvRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setSnmpTrapRcvIdx(binding.getVariable().toString());
                break;
            case  2 :
                setSnmpTrapRcvIPAddr(binding.getVariable().toString());
                break;
            case  3 :
                setSnmpTrapRcvPort(binding.getVariable().toInt());
                break;
            case  4 :
                setSnmpTrapRcvNotifType(binding.getVariable().toInt());
                break;
            case  5 :
                setSnmpTrapRcvVersion(binding.getVariable().toInt());
                break;
            case  6 :
                setSnmpTrapRcvCommunity(binding.getVariable().toString());
                break;
            case  7 :
                setSnmpTrapRcvTTL(binding.getVariable().toString());
                break;
            case  100 :
                setSnmpTrapRcvRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        _len = _oidInts[arrayOffset ++];
        setSnmpTrapRcvIdx(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SnmpTrapRcvTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("snmpTrapRcvIdx", snmpTrapRcvIdx).append("snmpTrapRcvIPAddr", snmpTrapRcvIPAddr).append("snmpTrapRcvPort", snmpTrapRcvPort).append("snmpTrapRcvNotifType", snmpTrapRcvNotifType).append("snmpTrapRcvVersion", snmpTrapRcvVersion).append("snmpTrapRcvCommunity", snmpTrapRcvCommunity).append("snmpTrapRcvTTL", snmpTrapRcvTTL).append("snmpTrapRcvRowStatus", snmpTrapRcvRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(snmpTrapRcvIdx).append(snmpTrapRcvIPAddr).append(snmpTrapRcvPort).append(snmpTrapRcvNotifType).append(snmpTrapRcvVersion).append(snmpTrapRcvCommunity).append(snmpTrapRcvTTL).append(snmpTrapRcvRowStatus).append(_index).toHashCode();
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
        SnmpTrapRcvEntry rhs = ((SnmpTrapRcvEntry) obj);
        return new EqualsBuilder().append(snmpTrapRcvIdx, rhs.snmpTrapRcvIdx).append(snmpTrapRcvIPAddr, rhs.snmpTrapRcvIPAddr).append(snmpTrapRcvPort, rhs.snmpTrapRcvPort).append(snmpTrapRcvNotifType, rhs.snmpTrapRcvNotifType).append(snmpTrapRcvVersion, rhs.snmpTrapRcvVersion).append(snmpTrapRcvCommunity, rhs.snmpTrapRcvCommunity).append(snmpTrapRcvTTL, rhs.snmpTrapRcvTTL).append(snmpTrapRcvRowStatus, rhs.snmpTrapRcvRowStatus).append(_index, rhs._index).isEquals();
    }

    public SnmpTrapRcvEntry clone() {
        SnmpTrapRcvEntry _copy = new SnmpTrapRcvEntry();
        _copy.snmpTrapRcvIdx = snmpTrapRcvIdx;
        _copy.snmpTrapRcvIPAddr = snmpTrapRcvIPAddr;
        _copy.snmpTrapRcvPort = snmpTrapRcvPort;
        _copy.snmpTrapRcvNotifType = snmpTrapRcvNotifType;
        _copy.snmpTrapRcvVersion = snmpTrapRcvVersion;
        _copy.snmpTrapRcvCommunity = snmpTrapRcvCommunity;
        _copy.snmpTrapRcvTTL = snmpTrapRcvTTL;
        _copy.snmpTrapRcvRowStatus = snmpTrapRcvRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.8.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "snmpTrapRcvIdx", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "snmpTrapRcvIPAddr", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "snmpTrapRcvPort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "snmpTrapRcvNotifType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "snmpTrapRcvVersion", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "snmpTrapRcvCommunity", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "snmpTrapRcvTTL", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "snmpTrapRcvRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
