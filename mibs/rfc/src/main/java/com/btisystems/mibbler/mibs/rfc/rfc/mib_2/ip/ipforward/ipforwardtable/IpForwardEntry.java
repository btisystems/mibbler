
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ip.ipforward.ipforwardtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ip.ipforward.ipforwardtable.IIpForwardEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ip.ipforward.IpForwardTable;
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

public class IpForwardEntry
    extends DeviceEntity
    implements Serializable, IIpForwardEntry, IIndexed, IVariableBindingSetter
{

    private String ipForwardDest;
    private String ipForwardMask;
    private int ipForwardPolicy;
    private String ipForwardNextHop;
    private Integer ipForwardIfIndex;
    private Integer ipForwardType;
    private int ipForwardProto;
    private Integer ipForwardAge;
    private String ipForwardInfo;
    private Integer ipForwardNextHopAS;
    private Integer ipForwardMetric1;
    private Integer ipForwardMetric2;
    private Integer ipForwardMetric3;
    private Integer ipForwardMetric4;
    private Integer ipForwardMetric5;
    private String _index;
    private IpForwardTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpForwardEntry() {
    }

    public String getIpForwardDest() {
        return this.ipForwardDest;
    }

    public void setIpForwardDest(String ipForwardDest) {
        String oldValue = getIpForwardDest();
        this.ipForwardDest = ipForwardDest;
        notifyChange(1, oldValue, ipForwardDest);
    }

    public String getIpForwardMask() {
        return this.ipForwardMask;
    }

    public void setIpForwardMask(String ipForwardMask) {
        String oldValue = getIpForwardMask();
        this.ipForwardMask = ipForwardMask;
        notifyChange(2, oldValue, ipForwardMask);
    }

    public int getIpForwardPolicy() {
        return this.ipForwardPolicy;
    }

    public void setIpForwardPolicy(int ipForwardPolicy) {
        int oldValue = getIpForwardPolicy();
        this.ipForwardPolicy = ipForwardPolicy;
        notifyChange(3, oldValue, ipForwardPolicy);
    }

    public String getIpForwardNextHop() {
        return this.ipForwardNextHop;
    }

    public void setIpForwardNextHop(String ipForwardNextHop) {
        String oldValue = getIpForwardNextHop();
        this.ipForwardNextHop = ipForwardNextHop;
        notifyChange(4, oldValue, ipForwardNextHop);
    }

    public int getIpForwardIfIndex() {
        if (this.ipForwardIfIndex == null) {
            return  0;
        }
        return this.ipForwardIfIndex;
    }

    public boolean isIpForwardIfIndexDefined() {
        return (this.ipForwardIfIndex!= null);
    }

    public void setIpForwardIfIndex(int ipForwardIfIndex) {
        int oldValue = getIpForwardIfIndex();
        this.ipForwardIfIndex = ipForwardIfIndex;
        notifyChange(5, oldValue, ipForwardIfIndex);
    }

    public int getIpForwardType() {
        if (this.ipForwardType == null) {
            return  2;
        }
        return this.ipForwardType;
    }

    public boolean isIpForwardTypeDefined() {
        return (this.ipForwardType!= null);
    }

    public void setIpForwardType(int ipForwardType) {
        int oldValue = getIpForwardType();
        this.ipForwardType = ipForwardType;
        notifyChange(6, oldValue, ipForwardType);
    }

    public int getIpForwardProto() {
        return this.ipForwardProto;
    }

    public void setIpForwardProto(int ipForwardProto) {
        int oldValue = getIpForwardProto();
        this.ipForwardProto = ipForwardProto;
        notifyChange(7, oldValue, ipForwardProto);
    }

    public int getIpForwardAge() {
        if (this.ipForwardAge == null) {
            return  0;
        }
        return this.ipForwardAge;
    }

    public boolean isIpForwardAgeDefined() {
        return (this.ipForwardAge!= null);
    }

    public void setIpForwardAge(int ipForwardAge) {
        int oldValue = getIpForwardAge();
        this.ipForwardAge = ipForwardAge;
        notifyChange(8, oldValue, ipForwardAge);
    }

    public String getIpForwardInfo() {
        return this.ipForwardInfo;
    }

    public void setIpForwardInfo(String ipForwardInfo) {
        String oldValue = getIpForwardInfo();
        this.ipForwardInfo = ipForwardInfo;
        notifyChange(9, oldValue, ipForwardInfo);
    }

    public int getIpForwardNextHopAS() {
        if (this.ipForwardNextHopAS == null) {
            return  0;
        }
        return this.ipForwardNextHopAS;
    }

    public boolean isIpForwardNextHopASDefined() {
        return (this.ipForwardNextHopAS!= null);
    }

    public void setIpForwardNextHopAS(int ipForwardNextHopAS) {
        int oldValue = getIpForwardNextHopAS();
        this.ipForwardNextHopAS = ipForwardNextHopAS;
        notifyChange(10, oldValue, ipForwardNextHopAS);
    }

    public int getIpForwardMetric1() {
        if (this.ipForwardMetric1 == null) {
            return -1;
        }
        return this.ipForwardMetric1;
    }

    public boolean isIpForwardMetric1Defined() {
        return (this.ipForwardMetric1 != null);
    }

    public void setIpForwardMetric1(int ipForwardMetric1) {
        int oldValue = getIpForwardMetric1();
        this.ipForwardMetric1 = ipForwardMetric1;
        notifyChange(11, oldValue, ipForwardMetric1);
    }

    public int getIpForwardMetric2() {
        if (this.ipForwardMetric2 == null) {
            return -1;
        }
        return this.ipForwardMetric2;
    }

    public boolean isIpForwardMetric2Defined() {
        return (this.ipForwardMetric2 != null);
    }

    public void setIpForwardMetric2(int ipForwardMetric2) {
        int oldValue = getIpForwardMetric2();
        this.ipForwardMetric2 = ipForwardMetric2;
        notifyChange(12, oldValue, ipForwardMetric2);
    }

    public int getIpForwardMetric3() {
        if (this.ipForwardMetric3 == null) {
            return -1;
        }
        return this.ipForwardMetric3;
    }

    public boolean isIpForwardMetric3Defined() {
        return (this.ipForwardMetric3 != null);
    }

    public void setIpForwardMetric3(int ipForwardMetric3) {
        int oldValue = getIpForwardMetric3();
        this.ipForwardMetric3 = ipForwardMetric3;
        notifyChange(13, oldValue, ipForwardMetric3);
    }

    public int getIpForwardMetric4() {
        if (this.ipForwardMetric4 == null) {
            return -1;
        }
        return this.ipForwardMetric4;
    }

    public boolean isIpForwardMetric4Defined() {
        return (this.ipForwardMetric4 != null);
    }

    public void setIpForwardMetric4(int ipForwardMetric4) {
        int oldValue = getIpForwardMetric4();
        this.ipForwardMetric4 = ipForwardMetric4;
        notifyChange(14, oldValue, ipForwardMetric4);
    }

    public int getIpForwardMetric5() {
        if (this.ipForwardMetric5 == null) {
            return -1;
        }
        return this.ipForwardMetric5;
    }

    public boolean isIpForwardMetric5Defined() {
        return (this.ipForwardMetric5 != null);
    }

    public void setIpForwardMetric5(int ipForwardMetric5) {
        int oldValue = getIpForwardMetric5();
        this.ipForwardMetric5 = ipForwardMetric5;
        notifyChange(15, oldValue, ipForwardMetric5);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIpForwardDest(binding.getVariable().toString());
                break;
            case  2 :
                setIpForwardMask(binding.getVariable().toString());
                break;
            case  3 :
                setIpForwardPolicy(binding.getVariable().toInt());
                break;
            case  4 :
                setIpForwardNextHop(binding.getVariable().toString());
                break;
            case  5 :
                setIpForwardIfIndex(binding.getVariable().toInt());
                break;
            case  6 :
                setIpForwardType(binding.getVariable().toInt());
                break;
            case  7 :
                setIpForwardProto(binding.getVariable().toInt());
                break;
            case  8 :
                setIpForwardAge(binding.getVariable().toInt());
                break;
            case  9 :
                setIpForwardInfo(binding.getVariable().toString());
                break;
            case  10 :
                setIpForwardNextHopAS(binding.getVariable().toInt());
                break;
            case  11 :
                setIpForwardMetric1(binding.getVariable().toInt());
                break;
            case  12 :
                setIpForwardMetric2(binding.getVariable().toInt());
                break;
            case  13 :
                setIpForwardMetric3(binding.getVariable().toInt());
                break;
            case  14 :
                setIpForwardMetric4(binding.getVariable().toInt());
                break;
            case  15 :
                setIpForwardMetric5(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setIpForwardDest(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
        setIpForwardProto(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIpForwardPolicy(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIpForwardNextHop(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IpForwardTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipForwardDest", ipForwardDest).append("ipForwardMask", ipForwardMask).append("ipForwardPolicy", ipForwardPolicy).append("ipForwardNextHop", ipForwardNextHop).append("ipForwardIfIndex", ipForwardIfIndex).append("ipForwardType", ipForwardType).append("ipForwardProto", ipForwardProto).append("ipForwardAge", ipForwardAge).append("ipForwardInfo", ipForwardInfo).append("ipForwardNextHopAS", ipForwardNextHopAS).append("ipForwardMetric1", ipForwardMetric1).append("ipForwardMetric2", ipForwardMetric2).append("ipForwardMetric3", ipForwardMetric3).append("ipForwardMetric4", ipForwardMetric4).append("ipForwardMetric5", ipForwardMetric5).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipForwardDest).append(ipForwardMask).append(ipForwardPolicy).append(ipForwardNextHop).append(ipForwardIfIndex).append(ipForwardType).append(ipForwardProto).append(ipForwardAge).append(ipForwardInfo).append(ipForwardNextHopAS).append(ipForwardMetric1).append(ipForwardMetric2).append(ipForwardMetric3).append(ipForwardMetric4).append(ipForwardMetric5).append(_index).toHashCode();
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
        IpForwardEntry rhs = ((IpForwardEntry) obj);
        return new EqualsBuilder().append(ipForwardDest, rhs.ipForwardDest).append(ipForwardMask, rhs.ipForwardMask).append(ipForwardPolicy, rhs.ipForwardPolicy).append(ipForwardNextHop, rhs.ipForwardNextHop).append(ipForwardIfIndex, rhs.ipForwardIfIndex).append(ipForwardType, rhs.ipForwardType).append(ipForwardProto, rhs.ipForwardProto).append(ipForwardAge, rhs.ipForwardAge).append(ipForwardInfo, rhs.ipForwardInfo).append(ipForwardNextHopAS, rhs.ipForwardNextHopAS).append(ipForwardMetric1, rhs.ipForwardMetric1).append(ipForwardMetric2, rhs.ipForwardMetric2).append(ipForwardMetric3, rhs.ipForwardMetric3).append(ipForwardMetric4, rhs.ipForwardMetric4).append(ipForwardMetric5, rhs.ipForwardMetric5).append(_index, rhs._index).isEquals();
    }

    public IpForwardEntry clone() {
        IpForwardEntry _copy = new IpForwardEntry();
        _copy.ipForwardDest = ipForwardDest;
        _copy.ipForwardMask = ipForwardMask;
        _copy.ipForwardPolicy = ipForwardPolicy;
        _copy.ipForwardNextHop = ipForwardNextHop;
        _copy.ipForwardIfIndex = ipForwardIfIndex;
        _copy.ipForwardType = ipForwardType;
        _copy.ipForwardProto = ipForwardProto;
        _copy.ipForwardAge = ipForwardAge;
        _copy.ipForwardInfo = ipForwardInfo;
        _copy.ipForwardNextHopAS = ipForwardNextHopAS;
        _copy.ipForwardMetric1 = ipForwardMetric1;
        _copy.ipForwardMetric2 = ipForwardMetric2;
        _copy.ipForwardMetric3 = ipForwardMetric3;
        _copy.ipForwardMetric4 = ipForwardMetric4;
        _copy.ipForwardMetric5 = ipForwardMetric5;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.24.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipForwardDest", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipForwardMask", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipForwardPolicy", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipForwardNextHop", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipForwardIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipForwardType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipForwardProto", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipForwardAge", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipForwardInfo", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipForwardNextHopAS", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipForwardMetric1", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ipForwardMetric2", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ipForwardMetric3", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ipForwardMetric4", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ipForwardMetric5", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
