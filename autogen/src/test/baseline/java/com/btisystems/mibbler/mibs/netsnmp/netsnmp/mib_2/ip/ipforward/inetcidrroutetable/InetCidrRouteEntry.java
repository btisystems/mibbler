
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipforward.inetcidrroutetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipforward.inetcidrroutetable.IInetCidrRouteEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipforward.InetCidrRouteTable;
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

public class InetCidrRouteEntry
    extends DeviceEntity
    implements Serializable, IInetCidrRouteEntry, IIndexed, IVariableBindingSetter
{

    private int inetCidrRouteDestType;
    private String inetCidrRouteDest;
    private int inetCidrRoutePfxLen;
    private String inetCidrRoutePolicy;
    private int inetCidrRouteNextHopType;
    private String inetCidrRouteNextHop;
    private int inetCidrRouteIfIndex;
    private int inetCidrRouteType;
    private int inetCidrRouteProto;
    private int inetCidrRouteAge;
    private Integer inetCidrRouteNextHopAS;
    private Integer inetCidrRouteMetric1;
    private Integer inetCidrRouteMetric2;
    private Integer inetCidrRouteMetric3;
    private Integer inetCidrRouteMetric4;
    private Integer inetCidrRouteMetric5;
    private int inetCidrRouteStatus;
    private String _index;
    private InetCidrRouteTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public InetCidrRouteEntry() {
    }

    public int getInetCidrRouteDestType() {
        return this.inetCidrRouteDestType;
    }

    public void setInetCidrRouteDestType(int inetCidrRouteDestType) {
        int oldValue = getInetCidrRouteDestType();
        this.inetCidrRouteDestType = inetCidrRouteDestType;
        notifyChange(1, oldValue, inetCidrRouteDestType);
    }

    public String getInetCidrRouteDest() {
        return this.inetCidrRouteDest;
    }

    public void setInetCidrRouteDest(String inetCidrRouteDest) {
        String oldValue = getInetCidrRouteDest();
        this.inetCidrRouteDest = inetCidrRouteDest;
        notifyChange(2, oldValue, inetCidrRouteDest);
    }

    public int getInetCidrRoutePfxLen() {
        return this.inetCidrRoutePfxLen;
    }

    public void setInetCidrRoutePfxLen(int inetCidrRoutePfxLen) {
        int oldValue = getInetCidrRoutePfxLen();
        this.inetCidrRoutePfxLen = inetCidrRoutePfxLen;
        notifyChange(3, oldValue, inetCidrRoutePfxLen);
    }

    public String getInetCidrRoutePolicy() {
        return this.inetCidrRoutePolicy;
    }

    public void setInetCidrRoutePolicy(String inetCidrRoutePolicy) {
        String oldValue = getInetCidrRoutePolicy();
        this.inetCidrRoutePolicy = inetCidrRoutePolicy;
        notifyChange(4, oldValue, inetCidrRoutePolicy);
    }

    public int getInetCidrRouteNextHopType() {
        return this.inetCidrRouteNextHopType;
    }

    public void setInetCidrRouteNextHopType(int inetCidrRouteNextHopType) {
        int oldValue = getInetCidrRouteNextHopType();
        this.inetCidrRouteNextHopType = inetCidrRouteNextHopType;
        notifyChange(5, oldValue, inetCidrRouteNextHopType);
    }

    public String getInetCidrRouteNextHop() {
        return this.inetCidrRouteNextHop;
    }

    public void setInetCidrRouteNextHop(String inetCidrRouteNextHop) {
        String oldValue = getInetCidrRouteNextHop();
        this.inetCidrRouteNextHop = inetCidrRouteNextHop;
        notifyChange(6, oldValue, inetCidrRouteNextHop);
    }

    public int getInetCidrRouteIfIndex() {
        return this.inetCidrRouteIfIndex;
    }

    public void setInetCidrRouteIfIndex(int inetCidrRouteIfIndex) {
        int oldValue = getInetCidrRouteIfIndex();
        this.inetCidrRouteIfIndex = inetCidrRouteIfIndex;
        notifyChange(7, oldValue, inetCidrRouteIfIndex);
    }

    public int getInetCidrRouteType() {
        return this.inetCidrRouteType;
    }

    public void setInetCidrRouteType(int inetCidrRouteType) {
        int oldValue = getInetCidrRouteType();
        this.inetCidrRouteType = inetCidrRouteType;
        notifyChange(8, oldValue, inetCidrRouteType);
    }

    public int getInetCidrRouteProto() {
        return this.inetCidrRouteProto;
    }

    public void setInetCidrRouteProto(int inetCidrRouteProto) {
        int oldValue = getInetCidrRouteProto();
        this.inetCidrRouteProto = inetCidrRouteProto;
        notifyChange(9, oldValue, inetCidrRouteProto);
    }

    public int getInetCidrRouteAge() {
        return this.inetCidrRouteAge;
    }

    public void setInetCidrRouteAge(int inetCidrRouteAge) {
        int oldValue = getInetCidrRouteAge();
        this.inetCidrRouteAge = inetCidrRouteAge;
        notifyChange(10, oldValue, inetCidrRouteAge);
    }

    public int getInetCidrRouteNextHopAS() {
        if (this.inetCidrRouteNextHopAS == null) {
            return  0;
        }
        return this.inetCidrRouteNextHopAS;
    }

    public boolean isInetCidrRouteNextHopASDefined() {
        return (this.inetCidrRouteNextHopAS!= null);
    }

    public void setInetCidrRouteNextHopAS(int inetCidrRouteNextHopAS) {
        int oldValue = getInetCidrRouteNextHopAS();
        this.inetCidrRouteNextHopAS = inetCidrRouteNextHopAS;
        notifyChange(11, oldValue, inetCidrRouteNextHopAS);
    }

    public int getInetCidrRouteMetric1() {
        if (this.inetCidrRouteMetric1 == null) {
            return -1;
        }
        return this.inetCidrRouteMetric1;
    }

    public boolean isInetCidrRouteMetric1Defined() {
        return (this.inetCidrRouteMetric1 != null);
    }

    public void setInetCidrRouteMetric1(int inetCidrRouteMetric1) {
        int oldValue = getInetCidrRouteMetric1();
        this.inetCidrRouteMetric1 = inetCidrRouteMetric1;
        notifyChange(12, oldValue, inetCidrRouteMetric1);
    }

    public int getInetCidrRouteMetric2() {
        if (this.inetCidrRouteMetric2 == null) {
            return -1;
        }
        return this.inetCidrRouteMetric2;
    }

    public boolean isInetCidrRouteMetric2Defined() {
        return (this.inetCidrRouteMetric2 != null);
    }

    public void setInetCidrRouteMetric2(int inetCidrRouteMetric2) {
        int oldValue = getInetCidrRouteMetric2();
        this.inetCidrRouteMetric2 = inetCidrRouteMetric2;
        notifyChange(13, oldValue, inetCidrRouteMetric2);
    }

    public int getInetCidrRouteMetric3() {
        if (this.inetCidrRouteMetric3 == null) {
            return -1;
        }
        return this.inetCidrRouteMetric3;
    }

    public boolean isInetCidrRouteMetric3Defined() {
        return (this.inetCidrRouteMetric3 != null);
    }

    public void setInetCidrRouteMetric3(int inetCidrRouteMetric3) {
        int oldValue = getInetCidrRouteMetric3();
        this.inetCidrRouteMetric3 = inetCidrRouteMetric3;
        notifyChange(14, oldValue, inetCidrRouteMetric3);
    }

    public int getInetCidrRouteMetric4() {
        if (this.inetCidrRouteMetric4 == null) {
            return -1;
        }
        return this.inetCidrRouteMetric4;
    }

    public boolean isInetCidrRouteMetric4Defined() {
        return (this.inetCidrRouteMetric4 != null);
    }

    public void setInetCidrRouteMetric4(int inetCidrRouteMetric4) {
        int oldValue = getInetCidrRouteMetric4();
        this.inetCidrRouteMetric4 = inetCidrRouteMetric4;
        notifyChange(15, oldValue, inetCidrRouteMetric4);
    }

    public int getInetCidrRouteMetric5() {
        if (this.inetCidrRouteMetric5 == null) {
            return -1;
        }
        return this.inetCidrRouteMetric5;
    }

    public boolean isInetCidrRouteMetric5Defined() {
        return (this.inetCidrRouteMetric5 != null);
    }

    public void setInetCidrRouteMetric5(int inetCidrRouteMetric5) {
        int oldValue = getInetCidrRouteMetric5();
        this.inetCidrRouteMetric5 = inetCidrRouteMetric5;
        notifyChange(16, oldValue, inetCidrRouteMetric5);
    }

    public int getInetCidrRouteStatus() {
        return this.inetCidrRouteStatus;
    }

    public void setInetCidrRouteStatus(int inetCidrRouteStatus) {
        int oldValue = getInetCidrRouteStatus();
        this.inetCidrRouteStatus = inetCidrRouteStatus;
        notifyChange(17, oldValue, inetCidrRouteStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setInetCidrRouteDestType(binding.getVariable().toInt());
                break;
            case  2 :
                setInetCidrRouteDest(binding.getVariable().toString());
                break;
            case  3 :
                setInetCidrRoutePfxLen(binding.getVariable().toInt());
                break;
            case  4 :
                setInetCidrRoutePolicy(binding.getVariable().toString());
                break;
            case  5 :
                setInetCidrRouteNextHopType(binding.getVariable().toInt());
                break;
            case  6 :
                setInetCidrRouteNextHop(binding.getVariable().toString());
                break;
            case  7 :
                setInetCidrRouteIfIndex(binding.getVariable().toInt());
                break;
            case  8 :
                setInetCidrRouteType(binding.getVariable().toInt());
                break;
            case  9 :
                setInetCidrRouteProto(binding.getVariable().toInt());
                break;
            case  10 :
                setInetCidrRouteAge(binding.getVariable().toInt());
                break;
            case  11 :
                setInetCidrRouteNextHopAS(binding.getVariable().toInt());
                break;
            case  12 :
                setInetCidrRouteMetric1(binding.getVariable().toInt());
                break;
            case  13 :
                setInetCidrRouteMetric2(binding.getVariable().toInt());
                break;
            case  14 :
                setInetCidrRouteMetric3(binding.getVariable().toInt());
                break;
            case  15 :
                setInetCidrRouteMetric4(binding.getVariable().toInt());
                break;
            case  16 :
                setInetCidrRouteMetric5(binding.getVariable().toInt());
                break;
            case  17 :
                setInetCidrRouteStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setInetCidrRouteDestType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setInetCidrRouteDest(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        setInetCidrRoutePfxLen(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setInetCidrRoutePolicy(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        setInetCidrRouteNextHopType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setInetCidrRouteNextHop(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(InetCidrRouteTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("inetCidrRouteDestType", inetCidrRouteDestType).append("inetCidrRouteDest", inetCidrRouteDest).append("inetCidrRoutePfxLen", inetCidrRoutePfxLen).append("inetCidrRoutePolicy", inetCidrRoutePolicy).append("inetCidrRouteNextHopType", inetCidrRouteNextHopType).append("inetCidrRouteNextHop", inetCidrRouteNextHop).append("inetCidrRouteIfIndex", inetCidrRouteIfIndex).append("inetCidrRouteType", inetCidrRouteType).append("inetCidrRouteProto", inetCidrRouteProto).append("inetCidrRouteAge", inetCidrRouteAge).append("inetCidrRouteNextHopAS", inetCidrRouteNextHopAS).append("inetCidrRouteMetric1", inetCidrRouteMetric1).append("inetCidrRouteMetric2", inetCidrRouteMetric2).append("inetCidrRouteMetric3", inetCidrRouteMetric3).append("inetCidrRouteMetric4", inetCidrRouteMetric4).append("inetCidrRouteMetric5", inetCidrRouteMetric5).append("inetCidrRouteStatus", inetCidrRouteStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(inetCidrRouteDestType).append(inetCidrRouteDest).append(inetCidrRoutePfxLen).append(inetCidrRoutePolicy).append(inetCidrRouteNextHopType).append(inetCidrRouteNextHop).append(inetCidrRouteIfIndex).append(inetCidrRouteType).append(inetCidrRouteProto).append(inetCidrRouteAge).append(inetCidrRouteNextHopAS).append(inetCidrRouteMetric1).append(inetCidrRouteMetric2).append(inetCidrRouteMetric3).append(inetCidrRouteMetric4).append(inetCidrRouteMetric5).append(inetCidrRouteStatus).append(_index).toHashCode();
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
        InetCidrRouteEntry rhs = ((InetCidrRouteEntry) obj);
        return new EqualsBuilder().append(inetCidrRouteDestType, rhs.inetCidrRouteDestType).append(inetCidrRouteDest, rhs.inetCidrRouteDest).append(inetCidrRoutePfxLen, rhs.inetCidrRoutePfxLen).append(inetCidrRoutePolicy, rhs.inetCidrRoutePolicy).append(inetCidrRouteNextHopType, rhs.inetCidrRouteNextHopType).append(inetCidrRouteNextHop, rhs.inetCidrRouteNextHop).append(inetCidrRouteIfIndex, rhs.inetCidrRouteIfIndex).append(inetCidrRouteType, rhs.inetCidrRouteType).append(inetCidrRouteProto, rhs.inetCidrRouteProto).append(inetCidrRouteAge, rhs.inetCidrRouteAge).append(inetCidrRouteNextHopAS, rhs.inetCidrRouteNextHopAS).append(inetCidrRouteMetric1, rhs.inetCidrRouteMetric1).append(inetCidrRouteMetric2, rhs.inetCidrRouteMetric2).append(inetCidrRouteMetric3, rhs.inetCidrRouteMetric3).append(inetCidrRouteMetric4, rhs.inetCidrRouteMetric4).append(inetCidrRouteMetric5, rhs.inetCidrRouteMetric5).append(inetCidrRouteStatus, rhs.inetCidrRouteStatus).append(_index, rhs._index).isEquals();
    }

    public InetCidrRouteEntry clone() {
        InetCidrRouteEntry _copy = new InetCidrRouteEntry();
        _copy.inetCidrRouteDestType = inetCidrRouteDestType;
        _copy.inetCidrRouteDest = inetCidrRouteDest;
        _copy.inetCidrRoutePfxLen = inetCidrRoutePfxLen;
        _copy.inetCidrRoutePolicy = inetCidrRoutePolicy;
        _copy.inetCidrRouteNextHopType = inetCidrRouteNextHopType;
        _copy.inetCidrRouteNextHop = inetCidrRouteNextHop;
        _copy.inetCidrRouteIfIndex = inetCidrRouteIfIndex;
        _copy.inetCidrRouteType = inetCidrRouteType;
        _copy.inetCidrRouteProto = inetCidrRouteProto;
        _copy.inetCidrRouteAge = inetCidrRouteAge;
        _copy.inetCidrRouteNextHopAS = inetCidrRouteNextHopAS;
        _copy.inetCidrRouteMetric1 = inetCidrRouteMetric1;
        _copy.inetCidrRouteMetric2 = inetCidrRouteMetric2;
        _copy.inetCidrRouteMetric3 = inetCidrRouteMetric3;
        _copy.inetCidrRouteMetric4 = inetCidrRouteMetric4;
        _copy.inetCidrRouteMetric5 = inetCidrRouteMetric5;
        _copy.inetCidrRouteStatus = inetCidrRouteStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.24.7.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "inetCidrRouteDestType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "inetCidrRouteDest", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "inetCidrRoutePfxLen", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "inetCidrRoutePolicy", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "inetCidrRouteNextHopType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "inetCidrRouteNextHop", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "inetCidrRouteIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "inetCidrRouteType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "inetCidrRouteProto", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "inetCidrRouteAge", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "inetCidrRouteNextHopAS", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "inetCidrRouteMetric1", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "inetCidrRouteMetric2", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "inetCidrRouteMetric3", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "inetCidrRouteMetric4", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "inetCidrRouteMetric5", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "inetCidrRouteStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
