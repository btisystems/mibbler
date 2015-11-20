
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.netmgmttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.datacomms.NetMgmtTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.datacomms.netmgmttable.INetMgmtEntry;
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

public class NetMgmtEntry
    extends DeviceEntity
    implements Serializable, INetMgmtEntry, IIndexed, IVariableBindingSetter
{

    private int netMgmtIdx;
    private Integer netMgmtAdminStatus;
    private int netMgmtOperStatus;
    private String netMgmtOperStatQlfr;
    private String netMgmtIPAddr;
    private String netMgmtIPMask;
    private String netMgmtIPBcast;
    private String netMgmtCustom1;
    private int netMgmtType;
    private int netMgmtUnmbrd;
    private int netMgmtSpeed;
    private int netMgmtDuplex;
    private int netMgmtMediaRate;
    private int netMgmtMTU;
    private String netMgmtMACAddr;
    private String _index;
    private NetMgmtTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NetMgmtEntry() {
    }

    public int getNetMgmtIdx() {
        return this.netMgmtIdx;
    }

    public void setNetMgmtIdx(int netMgmtIdx) {
        int oldValue = getNetMgmtIdx();
        this.netMgmtIdx = netMgmtIdx;
        notifyChange(1, oldValue, netMgmtIdx);
    }

    public int getNetMgmtAdminStatus() {
        if (this.netMgmtAdminStatus == null) {
            return  1;
        }
        return this.netMgmtAdminStatus;
    }

    public boolean isNetMgmtAdminStatusDefined() {
        return (this.netMgmtAdminStatus!= null);
    }

    public void setNetMgmtAdminStatus(int netMgmtAdminStatus) {
        int oldValue = getNetMgmtAdminStatus();
        this.netMgmtAdminStatus = netMgmtAdminStatus;
        notifyChange(2, oldValue, netMgmtAdminStatus);
    }

    public int getNetMgmtOperStatus() {
        return this.netMgmtOperStatus;
    }

    public void setNetMgmtOperStatus(int netMgmtOperStatus) {
        int oldValue = getNetMgmtOperStatus();
        this.netMgmtOperStatus = netMgmtOperStatus;
        notifyChange(3, oldValue, netMgmtOperStatus);
    }

    public String getNetMgmtOperStatQlfr() {
        return this.netMgmtOperStatQlfr;
    }

    public void setNetMgmtOperStatQlfr(String netMgmtOperStatQlfr) {
        String oldValue = getNetMgmtOperStatQlfr();
        this.netMgmtOperStatQlfr = netMgmtOperStatQlfr;
        notifyChange(4, oldValue, netMgmtOperStatQlfr);
    }

    public String getNetMgmtIPAddr() {
        return this.netMgmtIPAddr;
    }

    public void setNetMgmtIPAddr(String netMgmtIPAddr) {
        String oldValue = getNetMgmtIPAddr();
        this.netMgmtIPAddr = netMgmtIPAddr;
        notifyChange(5, oldValue, netMgmtIPAddr);
    }

    public String getNetMgmtIPMask() {
        return this.netMgmtIPMask;
    }

    public void setNetMgmtIPMask(String netMgmtIPMask) {
        String oldValue = getNetMgmtIPMask();
        this.netMgmtIPMask = netMgmtIPMask;
        notifyChange(6, oldValue, netMgmtIPMask);
    }

    public String getNetMgmtIPBcast() {
        return this.netMgmtIPBcast;
    }

    public void setNetMgmtIPBcast(String netMgmtIPBcast) {
        String oldValue = getNetMgmtIPBcast();
        this.netMgmtIPBcast = netMgmtIPBcast;
        notifyChange(7, oldValue, netMgmtIPBcast);
    }

    public String getNetMgmtCustom1() {
        if (this.netMgmtCustom1 == null) {
            return "";
        }
        return this.netMgmtCustom1;
    }

    public boolean isNetMgmtCustom1Defined() {
        return (this.netMgmtCustom1 != null);
    }

    public void setNetMgmtCustom1(String netMgmtCustom1) {
        String oldValue = getNetMgmtCustom1();
        this.netMgmtCustom1 = netMgmtCustom1;
        notifyChange(8, oldValue, netMgmtCustom1);
    }

    public int getNetMgmtType() {
        return this.netMgmtType;
    }

    public void setNetMgmtType(int netMgmtType) {
        int oldValue = getNetMgmtType();
        this.netMgmtType = netMgmtType;
        notifyChange(9, oldValue, netMgmtType);
    }

    public int getNetMgmtUnmbrd() {
        return this.netMgmtUnmbrd;
    }

    public void setNetMgmtUnmbrd(int netMgmtUnmbrd) {
        int oldValue = getNetMgmtUnmbrd();
        this.netMgmtUnmbrd = netMgmtUnmbrd;
        notifyChange(10, oldValue, netMgmtUnmbrd);
    }

    public int getNetMgmtSpeed() {
        return this.netMgmtSpeed;
    }

    public void setNetMgmtSpeed(int netMgmtSpeed) {
        int oldValue = getNetMgmtSpeed();
        this.netMgmtSpeed = netMgmtSpeed;
        notifyChange(11, oldValue, netMgmtSpeed);
    }

    public int getNetMgmtDuplex() {
        return this.netMgmtDuplex;
    }

    public void setNetMgmtDuplex(int netMgmtDuplex) {
        int oldValue = getNetMgmtDuplex();
        this.netMgmtDuplex = netMgmtDuplex;
        notifyChange(12, oldValue, netMgmtDuplex);
    }

    public int getNetMgmtMediaRate() {
        return this.netMgmtMediaRate;
    }

    public void setNetMgmtMediaRate(int netMgmtMediaRate) {
        int oldValue = getNetMgmtMediaRate();
        this.netMgmtMediaRate = netMgmtMediaRate;
        notifyChange(13, oldValue, netMgmtMediaRate);
    }

    public int getNetMgmtMTU() {
        return this.netMgmtMTU;
    }

    public void setNetMgmtMTU(int netMgmtMTU) {
        int oldValue = getNetMgmtMTU();
        this.netMgmtMTU = netMgmtMTU;
        notifyChange(14, oldValue, netMgmtMTU);
    }

    public String getNetMgmtMACAddr() {
        return this.netMgmtMACAddr;
    }

    public void setNetMgmtMACAddr(String netMgmtMACAddr) {
        String oldValue = getNetMgmtMACAddr();
        this.netMgmtMACAddr = netMgmtMACAddr;
        notifyChange(15, oldValue, netMgmtMACAddr);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setNetMgmtIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setNetMgmtAdminStatus(binding.getVariable().toInt());
                break;
            case  3 :
                setNetMgmtOperStatus(binding.getVariable().toInt());
                break;
            case  4 :
                setNetMgmtOperStatQlfr(binding.getVariable().toString());
                break;
            case  5 :
                setNetMgmtIPAddr(binding.getVariable().toString());
                break;
            case  6 :
                setNetMgmtIPMask(binding.getVariable().toString());
                break;
            case  7 :
                setNetMgmtIPBcast(binding.getVariable().toString());
                break;
            case  8 :
                setNetMgmtCustom1(binding.getVariable().toString());
                break;
            case  9 :
                setNetMgmtType(binding.getVariable().toInt());
                break;
            case  10 :
                setNetMgmtUnmbrd(binding.getVariable().toInt());
                break;
            case  11 :
                setNetMgmtSpeed(binding.getVariable().toInt());
                break;
            case  12 :
                setNetMgmtDuplex(binding.getVariable().toInt());
                break;
            case  13 :
                setNetMgmtMediaRate(binding.getVariable().toInt());
                break;
            case  14 :
                setNetMgmtMTU(binding.getVariable().toInt());
                break;
            case  15 :
                setNetMgmtMACAddr(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setNetMgmtIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(NetMgmtTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("netMgmtIdx", netMgmtIdx).append("netMgmtAdminStatus", netMgmtAdminStatus).append("netMgmtOperStatus", netMgmtOperStatus).append("netMgmtOperStatQlfr", netMgmtOperStatQlfr).append("netMgmtIPAddr", netMgmtIPAddr).append("netMgmtIPMask", netMgmtIPMask).append("netMgmtIPBcast", netMgmtIPBcast).append("netMgmtCustom1", netMgmtCustom1).append("netMgmtType", netMgmtType).append("netMgmtUnmbrd", netMgmtUnmbrd).append("netMgmtSpeed", netMgmtSpeed).append("netMgmtDuplex", netMgmtDuplex).append("netMgmtMediaRate", netMgmtMediaRate).append("netMgmtMTU", netMgmtMTU).append("netMgmtMACAddr", netMgmtMACAddr).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(netMgmtIdx).append(netMgmtAdminStatus).append(netMgmtOperStatus).append(netMgmtOperStatQlfr).append(netMgmtIPAddr).append(netMgmtIPMask).append(netMgmtIPBcast).append(netMgmtCustom1).append(netMgmtType).append(netMgmtUnmbrd).append(netMgmtSpeed).append(netMgmtDuplex).append(netMgmtMediaRate).append(netMgmtMTU).append(netMgmtMACAddr).append(_index).toHashCode();
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
        NetMgmtEntry rhs = ((NetMgmtEntry) obj);
        return new EqualsBuilder().append(netMgmtIdx, rhs.netMgmtIdx).append(netMgmtAdminStatus, rhs.netMgmtAdminStatus).append(netMgmtOperStatus, rhs.netMgmtOperStatus).append(netMgmtOperStatQlfr, rhs.netMgmtOperStatQlfr).append(netMgmtIPAddr, rhs.netMgmtIPAddr).append(netMgmtIPMask, rhs.netMgmtIPMask).append(netMgmtIPBcast, rhs.netMgmtIPBcast).append(netMgmtCustom1, rhs.netMgmtCustom1).append(netMgmtType, rhs.netMgmtType).append(netMgmtUnmbrd, rhs.netMgmtUnmbrd).append(netMgmtSpeed, rhs.netMgmtSpeed).append(netMgmtDuplex, rhs.netMgmtDuplex).append(netMgmtMediaRate, rhs.netMgmtMediaRate).append(netMgmtMTU, rhs.netMgmtMTU).append(netMgmtMACAddr, rhs.netMgmtMACAddr).append(_index, rhs._index).isEquals();
    }

    public NetMgmtEntry clone() {
        NetMgmtEntry _copy = new NetMgmtEntry();
        _copy.netMgmtIdx = netMgmtIdx;
        _copy.netMgmtAdminStatus = netMgmtAdminStatus;
        _copy.netMgmtOperStatus = netMgmtOperStatus;
        _copy.netMgmtOperStatQlfr = netMgmtOperStatQlfr;
        _copy.netMgmtIPAddr = netMgmtIPAddr;
        _copy.netMgmtIPMask = netMgmtIPMask;
        _copy.netMgmtIPBcast = netMgmtIPBcast;
        _copy.netMgmtCustom1 = netMgmtCustom1;
        _copy.netMgmtType = netMgmtType;
        _copy.netMgmtUnmbrd = netMgmtUnmbrd;
        _copy.netMgmtSpeed = netMgmtSpeed;
        _copy.netMgmtDuplex = netMgmtDuplex;
        _copy.netMgmtMediaRate = netMgmtMediaRate;
        _copy.netMgmtMTU = netMgmtMTU;
        _copy.netMgmtMACAddr = netMgmtMACAddr;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.5.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "netMgmtIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "netMgmtAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "netMgmtOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "netMgmtOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "netMgmtIPAddr", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "netMgmtIPMask", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "netMgmtIPBcast", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "netMgmtCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "netMgmtType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "netMgmtUnmbrd", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "netMgmtSpeed", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "netMgmtDuplex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "netMgmtMediaRate", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "netMgmtMTU", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "netMgmtMACAddr", DeviceEntityDescription.FieldType.STRING, 18));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
