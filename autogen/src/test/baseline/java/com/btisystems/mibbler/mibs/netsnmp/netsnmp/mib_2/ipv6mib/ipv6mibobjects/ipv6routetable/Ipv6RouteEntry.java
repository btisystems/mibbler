
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.ipv6routetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6routetable.IIpv6RouteEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.Ipv6RouteTable;
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

public class Ipv6RouteEntry
    extends DeviceEntity
    implements Serializable, IIpv6RouteEntry, IIndexed, IVariableBindingSetter
{

    private String ipv6RouteDest;
    private int ipv6RoutePfxLength;
    private int ipv6RouteIndex;
    private int ipv6RouteIfIndex;
    private String ipv6RouteNextHop;
    private int ipv6RouteType;
    private int ipv6RouteProtocol;
    private int ipv6RoutePolicy;
    private int ipv6RouteAge;
    private int ipv6RouteNextHopRDI;
    private int ipv6RouteMetric;
    private int ipv6RouteWeight;
    private String ipv6RouteInfo;
    private Integer ipv6RouteValid;
    private String _index;
    private Ipv6RouteTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6RouteEntry() {
    }

    public String getIpv6RouteDest() {
        return this.ipv6RouteDest;
    }

    public void setIpv6RouteDest(String ipv6RouteDest) {
        String oldValue = getIpv6RouteDest();
        this.ipv6RouteDest = ipv6RouteDest;
        notifyChange(1, oldValue, ipv6RouteDest);
    }

    public int getIpv6RoutePfxLength() {
        return this.ipv6RoutePfxLength;
    }

    public void setIpv6RoutePfxLength(int ipv6RoutePfxLength) {
        int oldValue = getIpv6RoutePfxLength();
        this.ipv6RoutePfxLength = ipv6RoutePfxLength;
        notifyChange(2, oldValue, ipv6RoutePfxLength);
    }

    public int getIpv6RouteIndex() {
        return this.ipv6RouteIndex;
    }

    public void setIpv6RouteIndex(int ipv6RouteIndex) {
        int oldValue = getIpv6RouteIndex();
        this.ipv6RouteIndex = ipv6RouteIndex;
        notifyChange(3, oldValue, ipv6RouteIndex);
    }

    public int getIpv6RouteIfIndex() {
        return this.ipv6RouteIfIndex;
    }

    public void setIpv6RouteIfIndex(int ipv6RouteIfIndex) {
        int oldValue = getIpv6RouteIfIndex();
        this.ipv6RouteIfIndex = ipv6RouteIfIndex;
        notifyChange(4, oldValue, ipv6RouteIfIndex);
    }

    public String getIpv6RouteNextHop() {
        return this.ipv6RouteNextHop;
    }

    public void setIpv6RouteNextHop(String ipv6RouteNextHop) {
        String oldValue = getIpv6RouteNextHop();
        this.ipv6RouteNextHop = ipv6RouteNextHop;
        notifyChange(5, oldValue, ipv6RouteNextHop);
    }

    public int getIpv6RouteType() {
        return this.ipv6RouteType;
    }

    public void setIpv6RouteType(int ipv6RouteType) {
        int oldValue = getIpv6RouteType();
        this.ipv6RouteType = ipv6RouteType;
        notifyChange(6, oldValue, ipv6RouteType);
    }

    public int getIpv6RouteProtocol() {
        return this.ipv6RouteProtocol;
    }

    public void setIpv6RouteProtocol(int ipv6RouteProtocol) {
        int oldValue = getIpv6RouteProtocol();
        this.ipv6RouteProtocol = ipv6RouteProtocol;
        notifyChange(7, oldValue, ipv6RouteProtocol);
    }

    public int getIpv6RoutePolicy() {
        return this.ipv6RoutePolicy;
    }

    public void setIpv6RoutePolicy(int ipv6RoutePolicy) {
        int oldValue = getIpv6RoutePolicy();
        this.ipv6RoutePolicy = ipv6RoutePolicy;
        notifyChange(8, oldValue, ipv6RoutePolicy);
    }

    public int getIpv6RouteAge() {
        return this.ipv6RouteAge;
    }

    public void setIpv6RouteAge(int ipv6RouteAge) {
        int oldValue = getIpv6RouteAge();
        this.ipv6RouteAge = ipv6RouteAge;
        notifyChange(9, oldValue, ipv6RouteAge);
    }

    public int getIpv6RouteNextHopRDI() {
        return this.ipv6RouteNextHopRDI;
    }

    public void setIpv6RouteNextHopRDI(int ipv6RouteNextHopRDI) {
        int oldValue = getIpv6RouteNextHopRDI();
        this.ipv6RouteNextHopRDI = ipv6RouteNextHopRDI;
        notifyChange(10, oldValue, ipv6RouteNextHopRDI);
    }

    public int getIpv6RouteMetric() {
        return this.ipv6RouteMetric;
    }

    public void setIpv6RouteMetric(int ipv6RouteMetric) {
        int oldValue = getIpv6RouteMetric();
        this.ipv6RouteMetric = ipv6RouteMetric;
        notifyChange(11, oldValue, ipv6RouteMetric);
    }

    public int getIpv6RouteWeight() {
        return this.ipv6RouteWeight;
    }

    public void setIpv6RouteWeight(int ipv6RouteWeight) {
        int oldValue = getIpv6RouteWeight();
        this.ipv6RouteWeight = ipv6RouteWeight;
        notifyChange(12, oldValue, ipv6RouteWeight);
    }

    public String getIpv6RouteInfo() {
        return this.ipv6RouteInfo;
    }

    public void setIpv6RouteInfo(String ipv6RouteInfo) {
        String oldValue = getIpv6RouteInfo();
        this.ipv6RouteInfo = ipv6RouteInfo;
        notifyChange(13, oldValue, ipv6RouteInfo);
    }

    public int getIpv6RouteValid() {
        if (this.ipv6RouteValid == null) {
            return  1;
        }
        return this.ipv6RouteValid;
    }

    public boolean isIpv6RouteValidDefined() {
        return (this.ipv6RouteValid!= null);
    }

    public void setIpv6RouteValid(int ipv6RouteValid) {
        int oldValue = getIpv6RouteValid();
        this.ipv6RouteValid = ipv6RouteValid;
        notifyChange(14, oldValue, ipv6RouteValid);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIpv6RouteDest(binding.getVariable().toString());
                break;
            case  2 :
                setIpv6RoutePfxLength(binding.getVariable().toInt());
                break;
            case  3 :
                setIpv6RouteIndex(binding.getVariable().toInt());
                break;
            case  4 :
                setIpv6RouteIfIndex(binding.getVariable().toInt());
                break;
            case  5 :
                setIpv6RouteNextHop(binding.getVariable().toString());
                break;
            case  6 :
                setIpv6RouteType(binding.getVariable().toInt());
                break;
            case  7 :
                setIpv6RouteProtocol(binding.getVariable().toInt());
                break;
            case  8 :
                setIpv6RoutePolicy(binding.getVariable().toInt());
                break;
            case  9 :
                setIpv6RouteAge(binding.getVariable().toInt());
                break;
            case  10 :
                setIpv6RouteNextHopRDI(binding.getVariable().toInt());
                break;
            case  11 :
                setIpv6RouteMetric(binding.getVariable().toInt());
                break;
            case  12 :
                setIpv6RouteWeight(binding.getVariable().toInt());
                break;
            case  13 :
                setIpv6RouteInfo(binding.getVariable().toString());
                break;
            case  14 :
                setIpv6RouteValid(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setIpv6RouteDest(new String(_oidBytes, arrayOffset, 16));
        arrayOffset += 16;
        setIpv6RoutePfxLength(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIpv6RouteIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Ipv6RouteTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6RouteDest", ipv6RouteDest).append("ipv6RoutePfxLength", ipv6RoutePfxLength).append("ipv6RouteIndex", ipv6RouteIndex).append("ipv6RouteIfIndex", ipv6RouteIfIndex).append("ipv6RouteNextHop", ipv6RouteNextHop).append("ipv6RouteType", ipv6RouteType).append("ipv6RouteProtocol", ipv6RouteProtocol).append("ipv6RoutePolicy", ipv6RoutePolicy).append("ipv6RouteAge", ipv6RouteAge).append("ipv6RouteNextHopRDI", ipv6RouteNextHopRDI).append("ipv6RouteMetric", ipv6RouteMetric).append("ipv6RouteWeight", ipv6RouteWeight).append("ipv6RouteInfo", ipv6RouteInfo).append("ipv6RouteValid", ipv6RouteValid).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6RouteDest).append(ipv6RoutePfxLength).append(ipv6RouteIndex).append(ipv6RouteIfIndex).append(ipv6RouteNextHop).append(ipv6RouteType).append(ipv6RouteProtocol).append(ipv6RoutePolicy).append(ipv6RouteAge).append(ipv6RouteNextHopRDI).append(ipv6RouteMetric).append(ipv6RouteWeight).append(ipv6RouteInfo).append(ipv6RouteValid).append(_index).toHashCode();
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
        Ipv6RouteEntry rhs = ((Ipv6RouteEntry) obj);
        return new EqualsBuilder().append(ipv6RouteDest, rhs.ipv6RouteDest).append(ipv6RoutePfxLength, rhs.ipv6RoutePfxLength).append(ipv6RouteIndex, rhs.ipv6RouteIndex).append(ipv6RouteIfIndex, rhs.ipv6RouteIfIndex).append(ipv6RouteNextHop, rhs.ipv6RouteNextHop).append(ipv6RouteType, rhs.ipv6RouteType).append(ipv6RouteProtocol, rhs.ipv6RouteProtocol).append(ipv6RoutePolicy, rhs.ipv6RoutePolicy).append(ipv6RouteAge, rhs.ipv6RouteAge).append(ipv6RouteNextHopRDI, rhs.ipv6RouteNextHopRDI).append(ipv6RouteMetric, rhs.ipv6RouteMetric).append(ipv6RouteWeight, rhs.ipv6RouteWeight).append(ipv6RouteInfo, rhs.ipv6RouteInfo).append(ipv6RouteValid, rhs.ipv6RouteValid).append(_index, rhs._index).isEquals();
    }

    public Ipv6RouteEntry clone() {
        Ipv6RouteEntry _copy = new Ipv6RouteEntry();
        _copy.ipv6RouteDest = ipv6RouteDest;
        _copy.ipv6RoutePfxLength = ipv6RoutePfxLength;
        _copy.ipv6RouteIndex = ipv6RouteIndex;
        _copy.ipv6RouteIfIndex = ipv6RouteIfIndex;
        _copy.ipv6RouteNextHop = ipv6RouteNextHop;
        _copy.ipv6RouteType = ipv6RouteType;
        _copy.ipv6RouteProtocol = ipv6RouteProtocol;
        _copy.ipv6RoutePolicy = ipv6RoutePolicy;
        _copy.ipv6RouteAge = ipv6RouteAge;
        _copy.ipv6RouteNextHopRDI = ipv6RouteNextHopRDI;
        _copy.ipv6RouteMetric = ipv6RouteMetric;
        _copy.ipv6RouteWeight = ipv6RouteWeight;
        _copy.ipv6RouteInfo = ipv6RouteInfo;
        _copy.ipv6RouteValid = ipv6RouteValid;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1.11.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6RouteDest", DeviceEntityDescription.FieldType.STRING, 40));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6RoutePfxLength", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6RouteIndex", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipv6RouteIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipv6RouteNextHop", DeviceEntityDescription.FieldType.STRING, 40));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipv6RouteType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipv6RouteProtocol", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipv6RoutePolicy", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipv6RouteAge", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipv6RouteNextHopRDI", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipv6RouteMetric", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ipv6RouteWeight", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ipv6RouteInfo", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ipv6RouteValid", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
