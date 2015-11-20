
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipforward.ipcidrroutetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipforward.ipcidrroutetable.IIpCidrRouteEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipforward.IpCidrRouteTable;
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

public class IpCidrRouteEntry
    extends DeviceEntity
    implements Serializable, IIpCidrRouteEntry, IIndexed, IVariableBindingSetter
{

    private String ipCidrRouteDest;
    private String ipCidrRouteMask;
    private int ipCidrRouteTos;
    private String ipCidrRouteNextHop;
    private Integer ipCidrRouteIfIndex;
    private int ipCidrRouteType;
    private int ipCidrRouteProto;
    private Integer ipCidrRouteAge;
    private String ipCidrRouteInfo;
    private Integer ipCidrRouteNextHopAS;
    private Integer ipCidrRouteMetric1;
    private Integer ipCidrRouteMetric2;
    private Integer ipCidrRouteMetric3;
    private Integer ipCidrRouteMetric4;
    private Integer ipCidrRouteMetric5;
    private int ipCidrRouteStatus;
    private String _index;
    private IpCidrRouteTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpCidrRouteEntry() {
    }

    public String getIpCidrRouteDest() {
        return this.ipCidrRouteDest;
    }

    public void setIpCidrRouteDest(String ipCidrRouteDest) {
        String oldValue = getIpCidrRouteDest();
        this.ipCidrRouteDest = ipCidrRouteDest;
        notifyChange(1, oldValue, ipCidrRouteDest);
    }

    public String getIpCidrRouteMask() {
        return this.ipCidrRouteMask;
    }

    public void setIpCidrRouteMask(String ipCidrRouteMask) {
        String oldValue = getIpCidrRouteMask();
        this.ipCidrRouteMask = ipCidrRouteMask;
        notifyChange(2, oldValue, ipCidrRouteMask);
    }

    public int getIpCidrRouteTos() {
        return this.ipCidrRouteTos;
    }

    public void setIpCidrRouteTos(int ipCidrRouteTos) {
        int oldValue = getIpCidrRouteTos();
        this.ipCidrRouteTos = ipCidrRouteTos;
        notifyChange(3, oldValue, ipCidrRouteTos);
    }

    public String getIpCidrRouteNextHop() {
        return this.ipCidrRouteNextHop;
    }

    public void setIpCidrRouteNextHop(String ipCidrRouteNextHop) {
        String oldValue = getIpCidrRouteNextHop();
        this.ipCidrRouteNextHop = ipCidrRouteNextHop;
        notifyChange(4, oldValue, ipCidrRouteNextHop);
    }

    public int getIpCidrRouteIfIndex() {
        if (this.ipCidrRouteIfIndex == null) {
            return  0;
        }
        return this.ipCidrRouteIfIndex;
    }

    public boolean isIpCidrRouteIfIndexDefined() {
        return (this.ipCidrRouteIfIndex!= null);
    }

    public void setIpCidrRouteIfIndex(int ipCidrRouteIfIndex) {
        int oldValue = getIpCidrRouteIfIndex();
        this.ipCidrRouteIfIndex = ipCidrRouteIfIndex;
        notifyChange(5, oldValue, ipCidrRouteIfIndex);
    }

    public int getIpCidrRouteType() {
        return this.ipCidrRouteType;
    }

    public void setIpCidrRouteType(int ipCidrRouteType) {
        int oldValue = getIpCidrRouteType();
        this.ipCidrRouteType = ipCidrRouteType;
        notifyChange(6, oldValue, ipCidrRouteType);
    }

    public int getIpCidrRouteProto() {
        return this.ipCidrRouteProto;
    }

    public void setIpCidrRouteProto(int ipCidrRouteProto) {
        int oldValue = getIpCidrRouteProto();
        this.ipCidrRouteProto = ipCidrRouteProto;
        notifyChange(7, oldValue, ipCidrRouteProto);
    }

    public int getIpCidrRouteAge() {
        if (this.ipCidrRouteAge == null) {
            return  0;
        }
        return this.ipCidrRouteAge;
    }

    public boolean isIpCidrRouteAgeDefined() {
        return (this.ipCidrRouteAge!= null);
    }

    public void setIpCidrRouteAge(int ipCidrRouteAge) {
        int oldValue = getIpCidrRouteAge();
        this.ipCidrRouteAge = ipCidrRouteAge;
        notifyChange(8, oldValue, ipCidrRouteAge);
    }

    public String getIpCidrRouteInfo() {
        return this.ipCidrRouteInfo;
    }

    public void setIpCidrRouteInfo(String ipCidrRouteInfo) {
        String oldValue = getIpCidrRouteInfo();
        this.ipCidrRouteInfo = ipCidrRouteInfo;
        notifyChange(9, oldValue, ipCidrRouteInfo);
    }

    public int getIpCidrRouteNextHopAS() {
        if (this.ipCidrRouteNextHopAS == null) {
            return  0;
        }
        return this.ipCidrRouteNextHopAS;
    }

    public boolean isIpCidrRouteNextHopASDefined() {
        return (this.ipCidrRouteNextHopAS!= null);
    }

    public void setIpCidrRouteNextHopAS(int ipCidrRouteNextHopAS) {
        int oldValue = getIpCidrRouteNextHopAS();
        this.ipCidrRouteNextHopAS = ipCidrRouteNextHopAS;
        notifyChange(10, oldValue, ipCidrRouteNextHopAS);
    }

    public int getIpCidrRouteMetric1() {
        if (this.ipCidrRouteMetric1 == null) {
            return -1;
        }
        return this.ipCidrRouteMetric1;
    }

    public boolean isIpCidrRouteMetric1Defined() {
        return (this.ipCidrRouteMetric1 != null);
    }

    public void setIpCidrRouteMetric1(int ipCidrRouteMetric1) {
        int oldValue = getIpCidrRouteMetric1();
        this.ipCidrRouteMetric1 = ipCidrRouteMetric1;
        notifyChange(11, oldValue, ipCidrRouteMetric1);
    }

    public int getIpCidrRouteMetric2() {
        if (this.ipCidrRouteMetric2 == null) {
            return -1;
        }
        return this.ipCidrRouteMetric2;
    }

    public boolean isIpCidrRouteMetric2Defined() {
        return (this.ipCidrRouteMetric2 != null);
    }

    public void setIpCidrRouteMetric2(int ipCidrRouteMetric2) {
        int oldValue = getIpCidrRouteMetric2();
        this.ipCidrRouteMetric2 = ipCidrRouteMetric2;
        notifyChange(12, oldValue, ipCidrRouteMetric2);
    }

    public int getIpCidrRouteMetric3() {
        if (this.ipCidrRouteMetric3 == null) {
            return -1;
        }
        return this.ipCidrRouteMetric3;
    }

    public boolean isIpCidrRouteMetric3Defined() {
        return (this.ipCidrRouteMetric3 != null);
    }

    public void setIpCidrRouteMetric3(int ipCidrRouteMetric3) {
        int oldValue = getIpCidrRouteMetric3();
        this.ipCidrRouteMetric3 = ipCidrRouteMetric3;
        notifyChange(13, oldValue, ipCidrRouteMetric3);
    }

    public int getIpCidrRouteMetric4() {
        if (this.ipCidrRouteMetric4 == null) {
            return -1;
        }
        return this.ipCidrRouteMetric4;
    }

    public boolean isIpCidrRouteMetric4Defined() {
        return (this.ipCidrRouteMetric4 != null);
    }

    public void setIpCidrRouteMetric4(int ipCidrRouteMetric4) {
        int oldValue = getIpCidrRouteMetric4();
        this.ipCidrRouteMetric4 = ipCidrRouteMetric4;
        notifyChange(14, oldValue, ipCidrRouteMetric4);
    }

    public int getIpCidrRouteMetric5() {
        if (this.ipCidrRouteMetric5 == null) {
            return -1;
        }
        return this.ipCidrRouteMetric5;
    }

    public boolean isIpCidrRouteMetric5Defined() {
        return (this.ipCidrRouteMetric5 != null);
    }

    public void setIpCidrRouteMetric5(int ipCidrRouteMetric5) {
        int oldValue = getIpCidrRouteMetric5();
        this.ipCidrRouteMetric5 = ipCidrRouteMetric5;
        notifyChange(15, oldValue, ipCidrRouteMetric5);
    }

    public int getIpCidrRouteStatus() {
        return this.ipCidrRouteStatus;
    }

    public void setIpCidrRouteStatus(int ipCidrRouteStatus) {
        int oldValue = getIpCidrRouteStatus();
        this.ipCidrRouteStatus = ipCidrRouteStatus;
        notifyChange(16, oldValue, ipCidrRouteStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIpCidrRouteDest(binding.getVariable().toString());
                break;
            case  2 :
                setIpCidrRouteMask(binding.getVariable().toString());
                break;
            case  3 :
                setIpCidrRouteTos(binding.getVariable().toInt());
                break;
            case  4 :
                setIpCidrRouteNextHop(binding.getVariable().toString());
                break;
            case  5 :
                setIpCidrRouteIfIndex(binding.getVariable().toInt());
                break;
            case  6 :
                setIpCidrRouteType(binding.getVariable().toInt());
                break;
            case  7 :
                setIpCidrRouteProto(binding.getVariable().toInt());
                break;
            case  8 :
                setIpCidrRouteAge(binding.getVariable().toInt());
                break;
            case  9 :
                setIpCidrRouteInfo(binding.getVariable().toString());
                break;
            case  10 :
                setIpCidrRouteNextHopAS(binding.getVariable().toInt());
                break;
            case  11 :
                setIpCidrRouteMetric1(binding.getVariable().toInt());
                break;
            case  12 :
                setIpCidrRouteMetric2(binding.getVariable().toInt());
                break;
            case  13 :
                setIpCidrRouteMetric3(binding.getVariable().toInt());
                break;
            case  14 :
                setIpCidrRouteMetric4(binding.getVariable().toInt());
                break;
            case  15 :
                setIpCidrRouteMetric5(binding.getVariable().toInt());
                break;
            case  16 :
                setIpCidrRouteStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setIpCidrRouteDest(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
        setIpCidrRouteMask(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
        setIpCidrRouteTos(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIpCidrRouteNextHop(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IpCidrRouteTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipCidrRouteDest", ipCidrRouteDest).append("ipCidrRouteMask", ipCidrRouteMask).append("ipCidrRouteTos", ipCidrRouteTos).append("ipCidrRouteNextHop", ipCidrRouteNextHop).append("ipCidrRouteIfIndex", ipCidrRouteIfIndex).append("ipCidrRouteType", ipCidrRouteType).append("ipCidrRouteProto", ipCidrRouteProto).append("ipCidrRouteAge", ipCidrRouteAge).append("ipCidrRouteInfo", ipCidrRouteInfo).append("ipCidrRouteNextHopAS", ipCidrRouteNextHopAS).append("ipCidrRouteMetric1", ipCidrRouteMetric1).append("ipCidrRouteMetric2", ipCidrRouteMetric2).append("ipCidrRouteMetric3", ipCidrRouteMetric3).append("ipCidrRouteMetric4", ipCidrRouteMetric4).append("ipCidrRouteMetric5", ipCidrRouteMetric5).append("ipCidrRouteStatus", ipCidrRouteStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipCidrRouteDest).append(ipCidrRouteMask).append(ipCidrRouteTos).append(ipCidrRouteNextHop).append(ipCidrRouteIfIndex).append(ipCidrRouteType).append(ipCidrRouteProto).append(ipCidrRouteAge).append(ipCidrRouteInfo).append(ipCidrRouteNextHopAS).append(ipCidrRouteMetric1).append(ipCidrRouteMetric2).append(ipCidrRouteMetric3).append(ipCidrRouteMetric4).append(ipCidrRouteMetric5).append(ipCidrRouteStatus).append(_index).toHashCode();
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
        IpCidrRouteEntry rhs = ((IpCidrRouteEntry) obj);
        return new EqualsBuilder().append(ipCidrRouteDest, rhs.ipCidrRouteDest).append(ipCidrRouteMask, rhs.ipCidrRouteMask).append(ipCidrRouteTos, rhs.ipCidrRouteTos).append(ipCidrRouteNextHop, rhs.ipCidrRouteNextHop).append(ipCidrRouteIfIndex, rhs.ipCidrRouteIfIndex).append(ipCidrRouteType, rhs.ipCidrRouteType).append(ipCidrRouteProto, rhs.ipCidrRouteProto).append(ipCidrRouteAge, rhs.ipCidrRouteAge).append(ipCidrRouteInfo, rhs.ipCidrRouteInfo).append(ipCidrRouteNextHopAS, rhs.ipCidrRouteNextHopAS).append(ipCidrRouteMetric1, rhs.ipCidrRouteMetric1).append(ipCidrRouteMetric2, rhs.ipCidrRouteMetric2).append(ipCidrRouteMetric3, rhs.ipCidrRouteMetric3).append(ipCidrRouteMetric4, rhs.ipCidrRouteMetric4).append(ipCidrRouteMetric5, rhs.ipCidrRouteMetric5).append(ipCidrRouteStatus, rhs.ipCidrRouteStatus).append(_index, rhs._index).isEquals();
    }

    public IpCidrRouteEntry clone() {
        IpCidrRouteEntry _copy = new IpCidrRouteEntry();
        _copy.ipCidrRouteDest = ipCidrRouteDest;
        _copy.ipCidrRouteMask = ipCidrRouteMask;
        _copy.ipCidrRouteTos = ipCidrRouteTos;
        _copy.ipCidrRouteNextHop = ipCidrRouteNextHop;
        _copy.ipCidrRouteIfIndex = ipCidrRouteIfIndex;
        _copy.ipCidrRouteType = ipCidrRouteType;
        _copy.ipCidrRouteProto = ipCidrRouteProto;
        _copy.ipCidrRouteAge = ipCidrRouteAge;
        _copy.ipCidrRouteInfo = ipCidrRouteInfo;
        _copy.ipCidrRouteNextHopAS = ipCidrRouteNextHopAS;
        _copy.ipCidrRouteMetric1 = ipCidrRouteMetric1;
        _copy.ipCidrRouteMetric2 = ipCidrRouteMetric2;
        _copy.ipCidrRouteMetric3 = ipCidrRouteMetric3;
        _copy.ipCidrRouteMetric4 = ipCidrRouteMetric4;
        _copy.ipCidrRouteMetric5 = ipCidrRouteMetric5;
        _copy.ipCidrRouteStatus = ipCidrRouteStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.24.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipCidrRouteDest", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipCidrRouteMask", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipCidrRouteTos", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipCidrRouteNextHop", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipCidrRouteIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipCidrRouteType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipCidrRouteProto", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipCidrRouteAge", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipCidrRouteInfo", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipCidrRouteNextHopAS", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipCidrRouteMetric1", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ipCidrRouteMetric2", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ipCidrRouteMetric3", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ipCidrRouteMetric4", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ipCidrRouteMetric5", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "ipCidrRouteStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
