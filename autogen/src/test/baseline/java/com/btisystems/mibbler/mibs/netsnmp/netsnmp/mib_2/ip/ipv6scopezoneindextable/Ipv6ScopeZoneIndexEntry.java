
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipv6scopezoneindextable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv6scopezoneindextable.IIpv6ScopeZoneIndexEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.Ipv6ScopeZoneIndexTable;
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

public class Ipv6ScopeZoneIndexEntry
    extends DeviceEntity
    implements Serializable, IIpv6ScopeZoneIndexEntry, IIndexed, IVariableBindingSetter
{

    private int ipv6ScopeZoneIndexIfIndex;
    private int ipv6ScopeZoneIndexLinkLocal;
    private int ipv6ScopeZoneIndex3;
    private int ipv6ScopeZoneIndexAdminLocal;
    private int ipv6ScopeZoneIndexSiteLocal;
    private int ipv6ScopeZoneIndex6;
    private int ipv6ScopeZoneIndex7;
    private int ipv6ScopeZoneIndexOrganizationLocal;
    private int ipv6ScopeZoneIndex9;
    private int ipv6ScopeZoneIndexA;
    private int ipv6ScopeZoneIndexB;
    private int ipv6ScopeZoneIndexC;
    private int ipv6ScopeZoneIndexD;
    private String _index;
    private Ipv6ScopeZoneIndexTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6ScopeZoneIndexEntry() {
    }

    public int getIpv6ScopeZoneIndexIfIndex() {
        return this.ipv6ScopeZoneIndexIfIndex;
    }

    public void setIpv6ScopeZoneIndexIfIndex(int ipv6ScopeZoneIndexIfIndex) {
        int oldValue = getIpv6ScopeZoneIndexIfIndex();
        this.ipv6ScopeZoneIndexIfIndex = ipv6ScopeZoneIndexIfIndex;
        notifyChange(1, oldValue, ipv6ScopeZoneIndexIfIndex);
    }

    public int getIpv6ScopeZoneIndexLinkLocal() {
        return this.ipv6ScopeZoneIndexLinkLocal;
    }

    public void setIpv6ScopeZoneIndexLinkLocal(int ipv6ScopeZoneIndexLinkLocal) {
        int oldValue = getIpv6ScopeZoneIndexLinkLocal();
        this.ipv6ScopeZoneIndexLinkLocal = ipv6ScopeZoneIndexLinkLocal;
        notifyChange(2, oldValue, ipv6ScopeZoneIndexLinkLocal);
    }

    public int getIpv6ScopeZoneIndex3() {
        return this.ipv6ScopeZoneIndex3;
    }

    public void setIpv6ScopeZoneIndex3(int ipv6ScopeZoneIndex3) {
        int oldValue = getIpv6ScopeZoneIndex3();
        this.ipv6ScopeZoneIndex3 = ipv6ScopeZoneIndex3;
        notifyChange(3, oldValue, ipv6ScopeZoneIndex3);
    }

    public int getIpv6ScopeZoneIndexAdminLocal() {
        return this.ipv6ScopeZoneIndexAdminLocal;
    }

    public void setIpv6ScopeZoneIndexAdminLocal(int ipv6ScopeZoneIndexAdminLocal) {
        int oldValue = getIpv6ScopeZoneIndexAdminLocal();
        this.ipv6ScopeZoneIndexAdminLocal = ipv6ScopeZoneIndexAdminLocal;
        notifyChange(4, oldValue, ipv6ScopeZoneIndexAdminLocal);
    }

    public int getIpv6ScopeZoneIndexSiteLocal() {
        return this.ipv6ScopeZoneIndexSiteLocal;
    }

    public void setIpv6ScopeZoneIndexSiteLocal(int ipv6ScopeZoneIndexSiteLocal) {
        int oldValue = getIpv6ScopeZoneIndexSiteLocal();
        this.ipv6ScopeZoneIndexSiteLocal = ipv6ScopeZoneIndexSiteLocal;
        notifyChange(5, oldValue, ipv6ScopeZoneIndexSiteLocal);
    }

    public int getIpv6ScopeZoneIndex6() {
        return this.ipv6ScopeZoneIndex6;
    }

    public void setIpv6ScopeZoneIndex6(int ipv6ScopeZoneIndex6) {
        int oldValue = getIpv6ScopeZoneIndex6();
        this.ipv6ScopeZoneIndex6 = ipv6ScopeZoneIndex6;
        notifyChange(6, oldValue, ipv6ScopeZoneIndex6);
    }

    public int getIpv6ScopeZoneIndex7() {
        return this.ipv6ScopeZoneIndex7;
    }

    public void setIpv6ScopeZoneIndex7(int ipv6ScopeZoneIndex7) {
        int oldValue = getIpv6ScopeZoneIndex7();
        this.ipv6ScopeZoneIndex7 = ipv6ScopeZoneIndex7;
        notifyChange(7, oldValue, ipv6ScopeZoneIndex7);
    }

    public int getIpv6ScopeZoneIndexOrganizationLocal() {
        return this.ipv6ScopeZoneIndexOrganizationLocal;
    }

    public void setIpv6ScopeZoneIndexOrganizationLocal(int ipv6ScopeZoneIndexOrganizationLocal) {
        int oldValue = getIpv6ScopeZoneIndexOrganizationLocal();
        this.ipv6ScopeZoneIndexOrganizationLocal = ipv6ScopeZoneIndexOrganizationLocal;
        notifyChange(8, oldValue, ipv6ScopeZoneIndexOrganizationLocal);
    }

    public int getIpv6ScopeZoneIndex9() {
        return this.ipv6ScopeZoneIndex9;
    }

    public void setIpv6ScopeZoneIndex9(int ipv6ScopeZoneIndex9) {
        int oldValue = getIpv6ScopeZoneIndex9();
        this.ipv6ScopeZoneIndex9 = ipv6ScopeZoneIndex9;
        notifyChange(9, oldValue, ipv6ScopeZoneIndex9);
    }

    public int getIpv6ScopeZoneIndexA() {
        return this.ipv6ScopeZoneIndexA;
    }

    public void setIpv6ScopeZoneIndexA(int ipv6ScopeZoneIndexA) {
        int oldValue = getIpv6ScopeZoneIndexA();
        this.ipv6ScopeZoneIndexA = ipv6ScopeZoneIndexA;
        notifyChange(10, oldValue, ipv6ScopeZoneIndexA);
    }

    public int getIpv6ScopeZoneIndexB() {
        return this.ipv6ScopeZoneIndexB;
    }

    public void setIpv6ScopeZoneIndexB(int ipv6ScopeZoneIndexB) {
        int oldValue = getIpv6ScopeZoneIndexB();
        this.ipv6ScopeZoneIndexB = ipv6ScopeZoneIndexB;
        notifyChange(11, oldValue, ipv6ScopeZoneIndexB);
    }

    public int getIpv6ScopeZoneIndexC() {
        return this.ipv6ScopeZoneIndexC;
    }

    public void setIpv6ScopeZoneIndexC(int ipv6ScopeZoneIndexC) {
        int oldValue = getIpv6ScopeZoneIndexC();
        this.ipv6ScopeZoneIndexC = ipv6ScopeZoneIndexC;
        notifyChange(12, oldValue, ipv6ScopeZoneIndexC);
    }

    public int getIpv6ScopeZoneIndexD() {
        return this.ipv6ScopeZoneIndexD;
    }

    public void setIpv6ScopeZoneIndexD(int ipv6ScopeZoneIndexD) {
        int oldValue = getIpv6ScopeZoneIndexD();
        this.ipv6ScopeZoneIndexD = ipv6ScopeZoneIndexD;
        notifyChange(13, oldValue, ipv6ScopeZoneIndexD);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpv6ScopeZoneIndexIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setIpv6ScopeZoneIndexLinkLocal(binding.getVariable().toInt());
                break;
            case  3 :
                setIpv6ScopeZoneIndex3(binding.getVariable().toInt());
                break;
            case  4 :
                setIpv6ScopeZoneIndexAdminLocal(binding.getVariable().toInt());
                break;
            case  5 :
                setIpv6ScopeZoneIndexSiteLocal(binding.getVariable().toInt());
                break;
            case  6 :
                setIpv6ScopeZoneIndex6(binding.getVariable().toInt());
                break;
            case  7 :
                setIpv6ScopeZoneIndex7(binding.getVariable().toInt());
                break;
            case  8 :
                setIpv6ScopeZoneIndexOrganizationLocal(binding.getVariable().toInt());
                break;
            case  9 :
                setIpv6ScopeZoneIndex9(binding.getVariable().toInt());
                break;
            case  10 :
                setIpv6ScopeZoneIndexA(binding.getVariable().toInt());
                break;
            case  11 :
                setIpv6ScopeZoneIndexB(binding.getVariable().toInt());
                break;
            case  12 :
                setIpv6ScopeZoneIndexC(binding.getVariable().toInt());
                break;
            case  13 :
                setIpv6ScopeZoneIndexD(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpv6ScopeZoneIndexIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Ipv6ScopeZoneIndexTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6ScopeZoneIndexIfIndex", ipv6ScopeZoneIndexIfIndex).append("ipv6ScopeZoneIndexLinkLocal", ipv6ScopeZoneIndexLinkLocal).append("ipv6ScopeZoneIndex3", ipv6ScopeZoneIndex3).append("ipv6ScopeZoneIndexAdminLocal", ipv6ScopeZoneIndexAdminLocal).append("ipv6ScopeZoneIndexSiteLocal", ipv6ScopeZoneIndexSiteLocal).append("ipv6ScopeZoneIndex6", ipv6ScopeZoneIndex6).append("ipv6ScopeZoneIndex7", ipv6ScopeZoneIndex7).append("ipv6ScopeZoneIndexOrganizationLocal", ipv6ScopeZoneIndexOrganizationLocal).append("ipv6ScopeZoneIndex9", ipv6ScopeZoneIndex9).append("ipv6ScopeZoneIndexA", ipv6ScopeZoneIndexA).append("ipv6ScopeZoneIndexB", ipv6ScopeZoneIndexB).append("ipv6ScopeZoneIndexC", ipv6ScopeZoneIndexC).append("ipv6ScopeZoneIndexD", ipv6ScopeZoneIndexD).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6ScopeZoneIndexIfIndex).append(ipv6ScopeZoneIndexLinkLocal).append(ipv6ScopeZoneIndex3).append(ipv6ScopeZoneIndexAdminLocal).append(ipv6ScopeZoneIndexSiteLocal).append(ipv6ScopeZoneIndex6).append(ipv6ScopeZoneIndex7).append(ipv6ScopeZoneIndexOrganizationLocal).append(ipv6ScopeZoneIndex9).append(ipv6ScopeZoneIndexA).append(ipv6ScopeZoneIndexB).append(ipv6ScopeZoneIndexC).append(ipv6ScopeZoneIndexD).append(_index).toHashCode();
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
        Ipv6ScopeZoneIndexEntry rhs = ((Ipv6ScopeZoneIndexEntry) obj);
        return new EqualsBuilder().append(ipv6ScopeZoneIndexIfIndex, rhs.ipv6ScopeZoneIndexIfIndex).append(ipv6ScopeZoneIndexLinkLocal, rhs.ipv6ScopeZoneIndexLinkLocal).append(ipv6ScopeZoneIndex3, rhs.ipv6ScopeZoneIndex3).append(ipv6ScopeZoneIndexAdminLocal, rhs.ipv6ScopeZoneIndexAdminLocal).append(ipv6ScopeZoneIndexSiteLocal, rhs.ipv6ScopeZoneIndexSiteLocal).append(ipv6ScopeZoneIndex6, rhs.ipv6ScopeZoneIndex6).append(ipv6ScopeZoneIndex7, rhs.ipv6ScopeZoneIndex7).append(ipv6ScopeZoneIndexOrganizationLocal, rhs.ipv6ScopeZoneIndexOrganizationLocal).append(ipv6ScopeZoneIndex9, rhs.ipv6ScopeZoneIndex9).append(ipv6ScopeZoneIndexA, rhs.ipv6ScopeZoneIndexA).append(ipv6ScopeZoneIndexB, rhs.ipv6ScopeZoneIndexB).append(ipv6ScopeZoneIndexC, rhs.ipv6ScopeZoneIndexC).append(ipv6ScopeZoneIndexD, rhs.ipv6ScopeZoneIndexD).append(_index, rhs._index).isEquals();
    }

    public Ipv6ScopeZoneIndexEntry clone() {
        Ipv6ScopeZoneIndexEntry _copy = new Ipv6ScopeZoneIndexEntry();
        _copy.ipv6ScopeZoneIndexIfIndex = ipv6ScopeZoneIndexIfIndex;
        _copy.ipv6ScopeZoneIndexLinkLocal = ipv6ScopeZoneIndexLinkLocal;
        _copy.ipv6ScopeZoneIndex3 = ipv6ScopeZoneIndex3;
        _copy.ipv6ScopeZoneIndexAdminLocal = ipv6ScopeZoneIndexAdminLocal;
        _copy.ipv6ScopeZoneIndexSiteLocal = ipv6ScopeZoneIndexSiteLocal;
        _copy.ipv6ScopeZoneIndex6 = ipv6ScopeZoneIndex6;
        _copy.ipv6ScopeZoneIndex7 = ipv6ScopeZoneIndex7;
        _copy.ipv6ScopeZoneIndexOrganizationLocal = ipv6ScopeZoneIndexOrganizationLocal;
        _copy.ipv6ScopeZoneIndex9 = ipv6ScopeZoneIndex9;
        _copy.ipv6ScopeZoneIndexA = ipv6ScopeZoneIndexA;
        _copy.ipv6ScopeZoneIndexB = ipv6ScopeZoneIndexB;
        _copy.ipv6ScopeZoneIndexC = ipv6ScopeZoneIndexC;
        _copy.ipv6ScopeZoneIndexD = ipv6ScopeZoneIndexD;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.36.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6ScopeZoneIndexIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6ScopeZoneIndexLinkLocal", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6ScopeZoneIndex3", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipv6ScopeZoneIndexAdminLocal", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipv6ScopeZoneIndexSiteLocal", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipv6ScopeZoneIndex6", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipv6ScopeZoneIndex7", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipv6ScopeZoneIndexOrganizationLocal", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipv6ScopeZoneIndex9", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipv6ScopeZoneIndexA", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipv6ScopeZoneIndexB", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ipv6ScopeZoneIndexC", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ipv6ScopeZoneIndexD", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
