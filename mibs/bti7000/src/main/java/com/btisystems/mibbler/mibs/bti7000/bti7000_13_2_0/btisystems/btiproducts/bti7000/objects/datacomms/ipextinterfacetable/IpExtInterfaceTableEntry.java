
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.ipextinterfacetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.IpExtInterfaceTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.ipextinterfacetable.IIpExtInterfaceTableEntry;
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

public class IpExtInterfaceTableEntry
    extends DeviceEntity
    implements Serializable, IIpExtInterfaceTableEntry, IIndexed, IVariableBindingSetter
{

    private int pvxL2IntfSubPortNumber;
    private int ipExtIntfPrimaryState;
    private String ipExtIntfSecondaryState;
    private int ipExtIntfCmdPrimaryState;
    private int ipExtIntfNumberedStatus;
    private int ipExtIntfAddressType;
    private String ipExtIntfAddress;
    private String ipExtIntfSubnetMask;
    private int ipExtIntfProxyARPStatus;
    private String ipExtIntfDescription;
    private String ipExtIntfMACAddr;
    private int ipExtIntfOperStatus;
    private int ipExtIntfType;
    private String ipExtIntfBroadcastAddress;
    private int ipExtIntfSpeed;
    private int ipExtIntfMode;
    private int ipExtIntfMTUSize;
    private int ipExtIntfLastChange;
    private String ipExtIntfGateway;
    private int ipExtIntfRowStatus;
    private String _index;
    private IpExtInterfaceTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpExtInterfaceTableEntry() {
    }

    public int getPvxL2IntfSubPortNumber() {
        return this.pvxL2IntfSubPortNumber;
    }

    public void setPvxL2IntfSubPortNumber(int pvxL2IntfSubPortNumber) {
        int oldValue = getPvxL2IntfSubPortNumber();
        this.pvxL2IntfSubPortNumber = pvxL2IntfSubPortNumber;
        notifyChange(1, oldValue, pvxL2IntfSubPortNumber);
    }

    public int getIpExtIntfPrimaryState() {
        return this.ipExtIntfPrimaryState;
    }

    public void setIpExtIntfPrimaryState(int ipExtIntfPrimaryState) {
        int oldValue = getIpExtIntfPrimaryState();
        this.ipExtIntfPrimaryState = ipExtIntfPrimaryState;
        notifyChange(2, oldValue, ipExtIntfPrimaryState);
    }

    public String getIpExtIntfSecondaryState() {
        return this.ipExtIntfSecondaryState;
    }

    public void setIpExtIntfSecondaryState(String ipExtIntfSecondaryState) {
        String oldValue = getIpExtIntfSecondaryState();
        this.ipExtIntfSecondaryState = ipExtIntfSecondaryState;
        notifyChange(3, oldValue, ipExtIntfSecondaryState);
    }

    public int getIpExtIntfCmdPrimaryState() {
        return this.ipExtIntfCmdPrimaryState;
    }

    public void setIpExtIntfCmdPrimaryState(int ipExtIntfCmdPrimaryState) {
        int oldValue = getIpExtIntfCmdPrimaryState();
        this.ipExtIntfCmdPrimaryState = ipExtIntfCmdPrimaryState;
        notifyChange(4, oldValue, ipExtIntfCmdPrimaryState);
    }

    public int getIpExtIntfNumberedStatus() {
        return this.ipExtIntfNumberedStatus;
    }

    public void setIpExtIntfNumberedStatus(int ipExtIntfNumberedStatus) {
        int oldValue = getIpExtIntfNumberedStatus();
        this.ipExtIntfNumberedStatus = ipExtIntfNumberedStatus;
        notifyChange(5, oldValue, ipExtIntfNumberedStatus);
    }

    public int getIpExtIntfAddressType() {
        return this.ipExtIntfAddressType;
    }

    public void setIpExtIntfAddressType(int ipExtIntfAddressType) {
        int oldValue = getIpExtIntfAddressType();
        this.ipExtIntfAddressType = ipExtIntfAddressType;
        notifyChange(6, oldValue, ipExtIntfAddressType);
    }

    public String getIpExtIntfAddress() {
        return this.ipExtIntfAddress;
    }

    public void setIpExtIntfAddress(String ipExtIntfAddress) {
        String oldValue = getIpExtIntfAddress();
        this.ipExtIntfAddress = ipExtIntfAddress;
        notifyChange(7, oldValue, ipExtIntfAddress);
    }

    public String getIpExtIntfSubnetMask() {
        return this.ipExtIntfSubnetMask;
    }

    public void setIpExtIntfSubnetMask(String ipExtIntfSubnetMask) {
        String oldValue = getIpExtIntfSubnetMask();
        this.ipExtIntfSubnetMask = ipExtIntfSubnetMask;
        notifyChange(8, oldValue, ipExtIntfSubnetMask);
    }

    public int getIpExtIntfProxyARPStatus() {
        return this.ipExtIntfProxyARPStatus;
    }

    public void setIpExtIntfProxyARPStatus(int ipExtIntfProxyARPStatus) {
        int oldValue = getIpExtIntfProxyARPStatus();
        this.ipExtIntfProxyARPStatus = ipExtIntfProxyARPStatus;
        notifyChange(9, oldValue, ipExtIntfProxyARPStatus);
    }

    public String getIpExtIntfDescription() {
        return this.ipExtIntfDescription;
    }

    public void setIpExtIntfDescription(String ipExtIntfDescription) {
        String oldValue = getIpExtIntfDescription();
        this.ipExtIntfDescription = ipExtIntfDescription;
        notifyChange(10, oldValue, ipExtIntfDescription);
    }

    public String getIpExtIntfMACAddr() {
        return this.ipExtIntfMACAddr;
    }

    public void setIpExtIntfMACAddr(String ipExtIntfMACAddr) {
        String oldValue = getIpExtIntfMACAddr();
        this.ipExtIntfMACAddr = ipExtIntfMACAddr;
        notifyChange(11, oldValue, ipExtIntfMACAddr);
    }

    public int getIpExtIntfOperStatus() {
        return this.ipExtIntfOperStatus;
    }

    public void setIpExtIntfOperStatus(int ipExtIntfOperStatus) {
        int oldValue = getIpExtIntfOperStatus();
        this.ipExtIntfOperStatus = ipExtIntfOperStatus;
        notifyChange(12, oldValue, ipExtIntfOperStatus);
    }

    public int getIpExtIntfType() {
        return this.ipExtIntfType;
    }

    public void setIpExtIntfType(int ipExtIntfType) {
        int oldValue = getIpExtIntfType();
        this.ipExtIntfType = ipExtIntfType;
        notifyChange(13, oldValue, ipExtIntfType);
    }

    public String getIpExtIntfBroadcastAddress() {
        return this.ipExtIntfBroadcastAddress;
    }

    public void setIpExtIntfBroadcastAddress(String ipExtIntfBroadcastAddress) {
        String oldValue = getIpExtIntfBroadcastAddress();
        this.ipExtIntfBroadcastAddress = ipExtIntfBroadcastAddress;
        notifyChange(14, oldValue, ipExtIntfBroadcastAddress);
    }

    public int getIpExtIntfSpeed() {
        return this.ipExtIntfSpeed;
    }

    public void setIpExtIntfSpeed(int ipExtIntfSpeed) {
        int oldValue = getIpExtIntfSpeed();
        this.ipExtIntfSpeed = ipExtIntfSpeed;
        notifyChange(15, oldValue, ipExtIntfSpeed);
    }

    public int getIpExtIntfMode() {
        return this.ipExtIntfMode;
    }

    public void setIpExtIntfMode(int ipExtIntfMode) {
        int oldValue = getIpExtIntfMode();
        this.ipExtIntfMode = ipExtIntfMode;
        notifyChange(16, oldValue, ipExtIntfMode);
    }

    public int getIpExtIntfMTUSize() {
        return this.ipExtIntfMTUSize;
    }

    public void setIpExtIntfMTUSize(int ipExtIntfMTUSize) {
        int oldValue = getIpExtIntfMTUSize();
        this.ipExtIntfMTUSize = ipExtIntfMTUSize;
        notifyChange(17, oldValue, ipExtIntfMTUSize);
    }

    public int getIpExtIntfLastChange() {
        return this.ipExtIntfLastChange;
    }

    public void setIpExtIntfLastChange(int ipExtIntfLastChange) {
        int oldValue = getIpExtIntfLastChange();
        this.ipExtIntfLastChange = ipExtIntfLastChange;
        notifyChange(18, oldValue, ipExtIntfLastChange);
    }

    public String getIpExtIntfGateway() {
        return this.ipExtIntfGateway;
    }

    public void setIpExtIntfGateway(String ipExtIntfGateway) {
        String oldValue = getIpExtIntfGateway();
        this.ipExtIntfGateway = ipExtIntfGateway;
        notifyChange(19, oldValue, ipExtIntfGateway);
    }

    public int getIpExtIntfRowStatus() {
        return this.ipExtIntfRowStatus;
    }

    public void setIpExtIntfRowStatus(int ipExtIntfRowStatus) {
        int oldValue = getIpExtIntfRowStatus();
        this.ipExtIntfRowStatus = ipExtIntfRowStatus;
        notifyChange(100, oldValue, ipExtIntfRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setPvxL2IntfSubPortNumber(binding.getVariable().toInt());
                break;
            case  2 :
                setIpExtIntfPrimaryState(binding.getVariable().toInt());
                break;
            case  3 :
                setIpExtIntfSecondaryState(binding.getVariable().toString());
                break;
            case  4 :
                setIpExtIntfCmdPrimaryState(binding.getVariable().toInt());
                break;
            case  5 :
                setIpExtIntfNumberedStatus(binding.getVariable().toInt());
                break;
            case  6 :
                setIpExtIntfAddressType(binding.getVariable().toInt());
                break;
            case  7 :
                setIpExtIntfAddress(binding.getVariable().toString());
                break;
            case  8 :
                setIpExtIntfSubnetMask(binding.getVariable().toString());
                break;
            case  9 :
                setIpExtIntfProxyARPStatus(binding.getVariable().toInt());
                break;
            case  10 :
                setIpExtIntfDescription(binding.getVariable().toString());
                break;
            case  11 :
                setIpExtIntfMACAddr(binding.getVariable().toString());
                break;
            case  12 :
                setIpExtIntfOperStatus(binding.getVariable().toInt());
                break;
            case  13 :
                setIpExtIntfType(binding.getVariable().toInt());
                break;
            case  14 :
                setIpExtIntfBroadcastAddress(binding.getVariable().toString());
                break;
            case  15 :
                setIpExtIntfSpeed(binding.getVariable().toInt());
                break;
            case  16 :
                setIpExtIntfMode(binding.getVariable().toInt());
                break;
            case  17 :
                setIpExtIntfMTUSize(binding.getVariable().toInt());
                break;
            case  18 :
                setIpExtIntfLastChange(binding.getVariable().toInt());
                break;
            case  19 :
                setIpExtIntfGateway(binding.getVariable().toString());
                break;
            case  100 :
                setIpExtIntfRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        arrayOffset += 1;
        arrayOffset += 1;
        arrayOffset += 1;
        arrayOffset += 1;
        arrayOffset += 1;
        setPvxL2IntfSubPortNumber(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IpExtInterfaceTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("pvxL2IntfSubPortNumber", pvxL2IntfSubPortNumber).append("ipExtIntfPrimaryState", ipExtIntfPrimaryState).append("ipExtIntfSecondaryState", ipExtIntfSecondaryState).append("ipExtIntfCmdPrimaryState", ipExtIntfCmdPrimaryState).append("ipExtIntfNumberedStatus", ipExtIntfNumberedStatus).append("ipExtIntfAddressType", ipExtIntfAddressType).append("ipExtIntfAddress", ipExtIntfAddress).append("ipExtIntfSubnetMask", ipExtIntfSubnetMask).append("ipExtIntfProxyARPStatus", ipExtIntfProxyARPStatus).append("ipExtIntfDescription", ipExtIntfDescription).append("ipExtIntfMACAddr", ipExtIntfMACAddr).append("ipExtIntfOperStatus", ipExtIntfOperStatus).append("ipExtIntfType", ipExtIntfType).append("ipExtIntfBroadcastAddress", ipExtIntfBroadcastAddress).append("ipExtIntfSpeed", ipExtIntfSpeed).append("ipExtIntfMode", ipExtIntfMode).append("ipExtIntfMTUSize", ipExtIntfMTUSize).append("ipExtIntfLastChange", ipExtIntfLastChange).append("ipExtIntfGateway", ipExtIntfGateway).append("ipExtIntfRowStatus", ipExtIntfRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(pvxL2IntfSubPortNumber).append(ipExtIntfPrimaryState).append(ipExtIntfSecondaryState).append(ipExtIntfCmdPrimaryState).append(ipExtIntfNumberedStatus).append(ipExtIntfAddressType).append(ipExtIntfAddress).append(ipExtIntfSubnetMask).append(ipExtIntfProxyARPStatus).append(ipExtIntfDescription).append(ipExtIntfMACAddr).append(ipExtIntfOperStatus).append(ipExtIntfType).append(ipExtIntfBroadcastAddress).append(ipExtIntfSpeed).append(ipExtIntfMode).append(ipExtIntfMTUSize).append(ipExtIntfLastChange).append(ipExtIntfGateway).append(ipExtIntfRowStatus).append(_index).toHashCode();
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
        IpExtInterfaceTableEntry rhs = ((IpExtInterfaceTableEntry) obj);
        return new EqualsBuilder().append(pvxL2IntfSubPortNumber, rhs.pvxL2IntfSubPortNumber).append(ipExtIntfPrimaryState, rhs.ipExtIntfPrimaryState).append(ipExtIntfSecondaryState, rhs.ipExtIntfSecondaryState).append(ipExtIntfCmdPrimaryState, rhs.ipExtIntfCmdPrimaryState).append(ipExtIntfNumberedStatus, rhs.ipExtIntfNumberedStatus).append(ipExtIntfAddressType, rhs.ipExtIntfAddressType).append(ipExtIntfAddress, rhs.ipExtIntfAddress).append(ipExtIntfSubnetMask, rhs.ipExtIntfSubnetMask).append(ipExtIntfProxyARPStatus, rhs.ipExtIntfProxyARPStatus).append(ipExtIntfDescription, rhs.ipExtIntfDescription).append(ipExtIntfMACAddr, rhs.ipExtIntfMACAddr).append(ipExtIntfOperStatus, rhs.ipExtIntfOperStatus).append(ipExtIntfType, rhs.ipExtIntfType).append(ipExtIntfBroadcastAddress, rhs.ipExtIntfBroadcastAddress).append(ipExtIntfSpeed, rhs.ipExtIntfSpeed).append(ipExtIntfMode, rhs.ipExtIntfMode).append(ipExtIntfMTUSize, rhs.ipExtIntfMTUSize).append(ipExtIntfLastChange, rhs.ipExtIntfLastChange).append(ipExtIntfGateway, rhs.ipExtIntfGateway).append(ipExtIntfRowStatus, rhs.ipExtIntfRowStatus).append(_index, rhs._index).isEquals();
    }

    public IpExtInterfaceTableEntry clone() {
        IpExtInterfaceTableEntry _copy = new IpExtInterfaceTableEntry();
        _copy.pvxL2IntfSubPortNumber = pvxL2IntfSubPortNumber;
        _copy.ipExtIntfPrimaryState = ipExtIntfPrimaryState;
        _copy.ipExtIntfSecondaryState = ipExtIntfSecondaryState;
        _copy.ipExtIntfCmdPrimaryState = ipExtIntfCmdPrimaryState;
        _copy.ipExtIntfNumberedStatus = ipExtIntfNumberedStatus;
        _copy.ipExtIntfAddressType = ipExtIntfAddressType;
        _copy.ipExtIntfAddress = ipExtIntfAddress;
        _copy.ipExtIntfSubnetMask = ipExtIntfSubnetMask;
        _copy.ipExtIntfProxyARPStatus = ipExtIntfProxyARPStatus;
        _copy.ipExtIntfDescription = ipExtIntfDescription;
        _copy.ipExtIntfMACAddr = ipExtIntfMACAddr;
        _copy.ipExtIntfOperStatus = ipExtIntfOperStatus;
        _copy.ipExtIntfType = ipExtIntfType;
        _copy.ipExtIntfBroadcastAddress = ipExtIntfBroadcastAddress;
        _copy.ipExtIntfSpeed = ipExtIntfSpeed;
        _copy.ipExtIntfMode = ipExtIntfMode;
        _copy.ipExtIntfMTUSize = ipExtIntfMTUSize;
        _copy.ipExtIntfLastChange = ipExtIntfLastChange;
        _copy.ipExtIntfGateway = ipExtIntfGateway;
        _copy.ipExtIntfRowStatus = ipExtIntfRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.5.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "pvxL2IntfSubPortNumber", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipExtIntfPrimaryState", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipExtIntfSecondaryState", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipExtIntfCmdPrimaryState", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipExtIntfNumberedStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipExtIntfAddressType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipExtIntfAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipExtIntfSubnetMask", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipExtIntfProxyARPStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipExtIntfDescription", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipExtIntfMACAddr", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ipExtIntfOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ipExtIntfType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ipExtIntfBroadcastAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ipExtIntfSpeed", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "ipExtIntfMode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "ipExtIntfMTUSize", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "ipExtIntfLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "ipExtIntfGateway", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "ipExtIntfRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
