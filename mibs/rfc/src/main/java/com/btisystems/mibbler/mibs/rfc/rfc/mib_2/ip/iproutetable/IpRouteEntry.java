
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ip.iproutetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ip.iproutetable.IIpRouteEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ip.IpRouteTable;
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

public class IpRouteEntry
    extends DeviceEntity
    implements Serializable, IIpRouteEntry, IIndexed, IVariableBindingSetter
{

    private String ipRouteDest;
    private int ipRouteIfIndex;
    private int ipRouteMetric1;
    private int ipRouteMetric2;
    private int ipRouteMetric3;
    private int ipRouteMetric4;
    private String ipRouteNextHop;
    private int ipRouteType;
    private int ipRouteProto;
    private int ipRouteAge;
    private String ipRouteMask;
    private int ipRouteMetric5;
    private String ipRouteInfo;
    private String _index;
    private IpRouteTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpRouteEntry() {
    }

    public String getIpRouteDest() {
        return this.ipRouteDest;
    }

    public void setIpRouteDest(String ipRouteDest) {
        String oldValue = getIpRouteDest();
        this.ipRouteDest = ipRouteDest;
        notifyChange(1, oldValue, ipRouteDest);
    }

    public int getIpRouteIfIndex() {
        return this.ipRouteIfIndex;
    }

    public void setIpRouteIfIndex(int ipRouteIfIndex) {
        int oldValue = getIpRouteIfIndex();
        this.ipRouteIfIndex = ipRouteIfIndex;
        notifyChange(2, oldValue, ipRouteIfIndex);
    }

    public int getIpRouteMetric1() {
        return this.ipRouteMetric1;
    }

    public void setIpRouteMetric1(int ipRouteMetric1) {
        int oldValue = getIpRouteMetric1();
        this.ipRouteMetric1 = ipRouteMetric1;
        notifyChange(3, oldValue, ipRouteMetric1);
    }

    public int getIpRouteMetric2() {
        return this.ipRouteMetric2;
    }

    public void setIpRouteMetric2(int ipRouteMetric2) {
        int oldValue = getIpRouteMetric2();
        this.ipRouteMetric2 = ipRouteMetric2;
        notifyChange(4, oldValue, ipRouteMetric2);
    }

    public int getIpRouteMetric3() {
        return this.ipRouteMetric3;
    }

    public void setIpRouteMetric3(int ipRouteMetric3) {
        int oldValue = getIpRouteMetric3();
        this.ipRouteMetric3 = ipRouteMetric3;
        notifyChange(5, oldValue, ipRouteMetric3);
    }

    public int getIpRouteMetric4() {
        return this.ipRouteMetric4;
    }

    public void setIpRouteMetric4(int ipRouteMetric4) {
        int oldValue = getIpRouteMetric4();
        this.ipRouteMetric4 = ipRouteMetric4;
        notifyChange(6, oldValue, ipRouteMetric4);
    }

    public String getIpRouteNextHop() {
        return this.ipRouteNextHop;
    }

    public void setIpRouteNextHop(String ipRouteNextHop) {
        String oldValue = getIpRouteNextHop();
        this.ipRouteNextHop = ipRouteNextHop;
        notifyChange(7, oldValue, ipRouteNextHop);
    }

    public int getIpRouteType() {
        return this.ipRouteType;
    }

    public void setIpRouteType(int ipRouteType) {
        int oldValue = getIpRouteType();
        this.ipRouteType = ipRouteType;
        notifyChange(8, oldValue, ipRouteType);
    }

    public int getIpRouteProto() {
        return this.ipRouteProto;
    }

    public void setIpRouteProto(int ipRouteProto) {
        int oldValue = getIpRouteProto();
        this.ipRouteProto = ipRouteProto;
        notifyChange(9, oldValue, ipRouteProto);
    }

    public int getIpRouteAge() {
        return this.ipRouteAge;
    }

    public void setIpRouteAge(int ipRouteAge) {
        int oldValue = getIpRouteAge();
        this.ipRouteAge = ipRouteAge;
        notifyChange(10, oldValue, ipRouteAge);
    }

    public String getIpRouteMask() {
        return this.ipRouteMask;
    }

    public void setIpRouteMask(String ipRouteMask) {
        String oldValue = getIpRouteMask();
        this.ipRouteMask = ipRouteMask;
        notifyChange(11, oldValue, ipRouteMask);
    }

    public int getIpRouteMetric5() {
        return this.ipRouteMetric5;
    }

    public void setIpRouteMetric5(int ipRouteMetric5) {
        int oldValue = getIpRouteMetric5();
        this.ipRouteMetric5 = ipRouteMetric5;
        notifyChange(12, oldValue, ipRouteMetric5);
    }

    public String getIpRouteInfo() {
        return this.ipRouteInfo;
    }

    public void setIpRouteInfo(String ipRouteInfo) {
        String oldValue = getIpRouteInfo();
        this.ipRouteInfo = ipRouteInfo;
        notifyChange(13, oldValue, ipRouteInfo);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpRouteDest(binding.getVariable().toString());
                break;
            case  2 :
                setIpRouteIfIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setIpRouteMetric1(binding.getVariable().toInt());
                break;
            case  4 :
                setIpRouteMetric2(binding.getVariable().toInt());
                break;
            case  5 :
                setIpRouteMetric3(binding.getVariable().toInt());
                break;
            case  6 :
                setIpRouteMetric4(binding.getVariable().toInt());
                break;
            case  7 :
                setIpRouteNextHop(binding.getVariable().toString());
                break;
            case  8 :
                setIpRouteType(binding.getVariable().toInt());
                break;
            case  9 :
                setIpRouteProto(binding.getVariable().toInt());
                break;
            case  10 :
                setIpRouteAge(binding.getVariable().toInt());
                break;
            case  11 :
                setIpRouteMask(binding.getVariable().toString());
                break;
            case  12 :
                setIpRouteMetric5(binding.getVariable().toInt());
                break;
            case  13 :
                setIpRouteInfo(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpRouteDest(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IpRouteTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipRouteDest", ipRouteDest).append("ipRouteIfIndex", ipRouteIfIndex).append("ipRouteMetric1", ipRouteMetric1).append("ipRouteMetric2", ipRouteMetric2).append("ipRouteMetric3", ipRouteMetric3).append("ipRouteMetric4", ipRouteMetric4).append("ipRouteNextHop", ipRouteNextHop).append("ipRouteType", ipRouteType).append("ipRouteProto", ipRouteProto).append("ipRouteAge", ipRouteAge).append("ipRouteMask", ipRouteMask).append("ipRouteMetric5", ipRouteMetric5).append("ipRouteInfo", ipRouteInfo).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipRouteDest).append(ipRouteIfIndex).append(ipRouteMetric1).append(ipRouteMetric2).append(ipRouteMetric3).append(ipRouteMetric4).append(ipRouteNextHop).append(ipRouteType).append(ipRouteProto).append(ipRouteAge).append(ipRouteMask).append(ipRouteMetric5).append(ipRouteInfo).append(_index).toHashCode();
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
        IpRouteEntry rhs = ((IpRouteEntry) obj);
        return new EqualsBuilder().append(ipRouteDest, rhs.ipRouteDest).append(ipRouteIfIndex, rhs.ipRouteIfIndex).append(ipRouteMetric1, rhs.ipRouteMetric1).append(ipRouteMetric2, rhs.ipRouteMetric2).append(ipRouteMetric3, rhs.ipRouteMetric3).append(ipRouteMetric4, rhs.ipRouteMetric4).append(ipRouteNextHop, rhs.ipRouteNextHop).append(ipRouteType, rhs.ipRouteType).append(ipRouteProto, rhs.ipRouteProto).append(ipRouteAge, rhs.ipRouteAge).append(ipRouteMask, rhs.ipRouteMask).append(ipRouteMetric5, rhs.ipRouteMetric5).append(ipRouteInfo, rhs.ipRouteInfo).append(_index, rhs._index).isEquals();
    }

    public IpRouteEntry clone() {
        IpRouteEntry _copy = new IpRouteEntry();
        _copy.ipRouteDest = ipRouteDest;
        _copy.ipRouteIfIndex = ipRouteIfIndex;
        _copy.ipRouteMetric1 = ipRouteMetric1;
        _copy.ipRouteMetric2 = ipRouteMetric2;
        _copy.ipRouteMetric3 = ipRouteMetric3;
        _copy.ipRouteMetric4 = ipRouteMetric4;
        _copy.ipRouteNextHop = ipRouteNextHop;
        _copy.ipRouteType = ipRouteType;
        _copy.ipRouteProto = ipRouteProto;
        _copy.ipRouteAge = ipRouteAge;
        _copy.ipRouteMask = ipRouteMask;
        _copy.ipRouteMetric5 = ipRouteMetric5;
        _copy.ipRouteInfo = ipRouteInfo;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.21.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipRouteDest", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipRouteIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipRouteMetric1", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipRouteMetric2", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipRouteMetric3", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipRouteMetric4", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipRouteNextHop", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipRouteType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipRouteProto", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipRouteAge", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipRouteMask", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ipRouteMetric5", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ipRouteInfo", DeviceEntityDescription.FieldType.OID, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
