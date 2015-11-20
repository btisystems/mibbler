
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.interfaces.iftable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.interfaces.iftable.IIfEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.interfaces.IfTable;
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

public class IfEntry
    extends DeviceEntity
    implements Serializable, IIfEntry, IIndexed, IVariableBindingSetter
{

    private int ifIndex;
    private String ifDescr;
    private int ifType;
    private int ifMtu;
    private int ifSpeed;
    private String ifPhysAddress;
    private int ifAdminStatus;
    private int ifOperStatus;
    private int ifLastChange;
    private int ifInOctets;
    private int ifInUcastPkts;
    private int ifInNUcastPkts;
    private int ifInDiscards;
    private int ifInErrors;
    private int ifInUnknownProtos;
    private int ifOutOctets;
    private int ifOutUcastPkts;
    private int ifOutNUcastPkts;
    private int ifOutDiscards;
    private int ifOutErrors;
    private int ifOutQLen;
    private String ifSpecific;
    private String _index;
    private IfTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfEntry() {
    }

    public int getIfIndex() {
        return this.ifIndex;
    }

    public void setIfIndex(int ifIndex) {
        int oldValue = getIfIndex();
        this.ifIndex = ifIndex;
        notifyChange(1, oldValue, ifIndex);
    }

    public String getIfDescr() {
        return this.ifDescr;
    }

    public void setIfDescr(String ifDescr) {
        String oldValue = getIfDescr();
        this.ifDescr = ifDescr;
        notifyChange(2, oldValue, ifDescr);
    }

    public int getIfType() {
        return this.ifType;
    }

    public void setIfType(int ifType) {
        int oldValue = getIfType();
        this.ifType = ifType;
        notifyChange(3, oldValue, ifType);
    }

    public int getIfMtu() {
        return this.ifMtu;
    }

    public void setIfMtu(int ifMtu) {
        int oldValue = getIfMtu();
        this.ifMtu = ifMtu;
        notifyChange(4, oldValue, ifMtu);
    }

    public int getIfSpeed() {
        return this.ifSpeed;
    }

    public void setIfSpeed(int ifSpeed) {
        int oldValue = getIfSpeed();
        this.ifSpeed = ifSpeed;
        notifyChange(5, oldValue, ifSpeed);
    }

    public String getIfPhysAddress() {
        return this.ifPhysAddress;
    }

    public void setIfPhysAddress(String ifPhysAddress) {
        String oldValue = getIfPhysAddress();
        this.ifPhysAddress = ifPhysAddress;
        notifyChange(6, oldValue, ifPhysAddress);
    }

    public int getIfAdminStatus() {
        return this.ifAdminStatus;
    }

    public void setIfAdminStatus(int ifAdminStatus) {
        int oldValue = getIfAdminStatus();
        this.ifAdminStatus = ifAdminStatus;
        notifyChange(7, oldValue, ifAdminStatus);
    }

    public int getIfOperStatus() {
        return this.ifOperStatus;
    }

    public void setIfOperStatus(int ifOperStatus) {
        int oldValue = getIfOperStatus();
        this.ifOperStatus = ifOperStatus;
        notifyChange(8, oldValue, ifOperStatus);
    }

    public int getIfLastChange() {
        return this.ifLastChange;
    }

    public void setIfLastChange(int ifLastChange) {
        int oldValue = getIfLastChange();
        this.ifLastChange = ifLastChange;
        notifyChange(9, oldValue, ifLastChange);
    }

    public int getIfInOctets() {
        return this.ifInOctets;
    }

    public void setIfInOctets(int ifInOctets) {
        int oldValue = getIfInOctets();
        this.ifInOctets = ifInOctets;
        notifyChange(10, oldValue, ifInOctets);
    }

    public int getIfInUcastPkts() {
        return this.ifInUcastPkts;
    }

    public void setIfInUcastPkts(int ifInUcastPkts) {
        int oldValue = getIfInUcastPkts();
        this.ifInUcastPkts = ifInUcastPkts;
        notifyChange(11, oldValue, ifInUcastPkts);
    }

    public int getIfInNUcastPkts() {
        return this.ifInNUcastPkts;
    }

    public void setIfInNUcastPkts(int ifInNUcastPkts) {
        int oldValue = getIfInNUcastPkts();
        this.ifInNUcastPkts = ifInNUcastPkts;
        notifyChange(12, oldValue, ifInNUcastPkts);
    }

    public int getIfInDiscards() {
        return this.ifInDiscards;
    }

    public void setIfInDiscards(int ifInDiscards) {
        int oldValue = getIfInDiscards();
        this.ifInDiscards = ifInDiscards;
        notifyChange(13, oldValue, ifInDiscards);
    }

    public int getIfInErrors() {
        return this.ifInErrors;
    }

    public void setIfInErrors(int ifInErrors) {
        int oldValue = getIfInErrors();
        this.ifInErrors = ifInErrors;
        notifyChange(14, oldValue, ifInErrors);
    }

    public int getIfInUnknownProtos() {
        return this.ifInUnknownProtos;
    }

    public void setIfInUnknownProtos(int ifInUnknownProtos) {
        int oldValue = getIfInUnknownProtos();
        this.ifInUnknownProtos = ifInUnknownProtos;
        notifyChange(15, oldValue, ifInUnknownProtos);
    }

    public int getIfOutOctets() {
        return this.ifOutOctets;
    }

    public void setIfOutOctets(int ifOutOctets) {
        int oldValue = getIfOutOctets();
        this.ifOutOctets = ifOutOctets;
        notifyChange(16, oldValue, ifOutOctets);
    }

    public int getIfOutUcastPkts() {
        return this.ifOutUcastPkts;
    }

    public void setIfOutUcastPkts(int ifOutUcastPkts) {
        int oldValue = getIfOutUcastPkts();
        this.ifOutUcastPkts = ifOutUcastPkts;
        notifyChange(17, oldValue, ifOutUcastPkts);
    }

    public int getIfOutNUcastPkts() {
        return this.ifOutNUcastPkts;
    }

    public void setIfOutNUcastPkts(int ifOutNUcastPkts) {
        int oldValue = getIfOutNUcastPkts();
        this.ifOutNUcastPkts = ifOutNUcastPkts;
        notifyChange(18, oldValue, ifOutNUcastPkts);
    }

    public int getIfOutDiscards() {
        return this.ifOutDiscards;
    }

    public void setIfOutDiscards(int ifOutDiscards) {
        int oldValue = getIfOutDiscards();
        this.ifOutDiscards = ifOutDiscards;
        notifyChange(19, oldValue, ifOutDiscards);
    }

    public int getIfOutErrors() {
        return this.ifOutErrors;
    }

    public void setIfOutErrors(int ifOutErrors) {
        int oldValue = getIfOutErrors();
        this.ifOutErrors = ifOutErrors;
        notifyChange(20, oldValue, ifOutErrors);
    }

    public int getIfOutQLen() {
        return this.ifOutQLen;
    }

    public void setIfOutQLen(int ifOutQLen) {
        int oldValue = getIfOutQLen();
        this.ifOutQLen = ifOutQLen;
        notifyChange(21, oldValue, ifOutQLen);
    }

    public String getIfSpecific() {
        return this.ifSpecific;
    }

    public void setIfSpecific(String ifSpecific) {
        String oldValue = getIfSpecific();
        this.ifSpecific = ifSpecific;
        notifyChange(22, oldValue, ifSpecific);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setIfDescr(binding.getVariable().toString());
                break;
            case  3 :
                setIfType(binding.getVariable().toInt());
                break;
            case  4 :
                setIfMtu(binding.getVariable().toInt());
                break;
            case  5 :
                setIfSpeed(binding.getVariable().toInt());
                break;
            case  6 :
                setIfPhysAddress(binding.getVariable().toString());
                break;
            case  7 :
                setIfAdminStatus(binding.getVariable().toInt());
                break;
            case  8 :
                setIfOperStatus(binding.getVariable().toInt());
                break;
            case  9 :
                setIfLastChange(binding.getVariable().toInt());
                break;
            case  10 :
                setIfInOctets(binding.getVariable().toInt());
                break;
            case  11 :
                setIfInUcastPkts(binding.getVariable().toInt());
                break;
            case  12 :
                setIfInNUcastPkts(binding.getVariable().toInt());
                break;
            case  13 :
                setIfInDiscards(binding.getVariable().toInt());
                break;
            case  14 :
                setIfInErrors(binding.getVariable().toInt());
                break;
            case  15 :
                setIfInUnknownProtos(binding.getVariable().toInt());
                break;
            case  16 :
                setIfOutOctets(binding.getVariable().toInt());
                break;
            case  17 :
                setIfOutUcastPkts(binding.getVariable().toInt());
                break;
            case  18 :
                setIfOutNUcastPkts(binding.getVariable().toInt());
                break;
            case  19 :
                setIfOutDiscards(binding.getVariable().toInt());
                break;
            case  20 :
                setIfOutErrors(binding.getVariable().toInt());
                break;
            case  21 :
                setIfOutQLen(binding.getVariable().toInt());
                break;
            case  22 :
                setIfSpecific(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IfTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifIndex", ifIndex).append("ifDescr", ifDescr).append("ifType", ifType).append("ifMtu", ifMtu).append("ifSpeed", ifSpeed).append("ifPhysAddress", ifPhysAddress).append("ifAdminStatus", ifAdminStatus).append("ifOperStatus", ifOperStatus).append("ifLastChange", ifLastChange).append("ifInOctets", ifInOctets).append("ifInUcastPkts", ifInUcastPkts).append("ifInNUcastPkts", ifInNUcastPkts).append("ifInDiscards", ifInDiscards).append("ifInErrors", ifInErrors).append("ifInUnknownProtos", ifInUnknownProtos).append("ifOutOctets", ifOutOctets).append("ifOutUcastPkts", ifOutUcastPkts).append("ifOutNUcastPkts", ifOutNUcastPkts).append("ifOutDiscards", ifOutDiscards).append("ifOutErrors", ifOutErrors).append("ifOutQLen", ifOutQLen).append("ifSpecific", ifSpecific).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifIndex).append(ifDescr).append(ifType).append(ifMtu).append(ifSpeed).append(ifPhysAddress).append(ifAdminStatus).append(ifOperStatus).append(ifLastChange).append(ifInOctets).append(ifInUcastPkts).append(ifInNUcastPkts).append(ifInDiscards).append(ifInErrors).append(ifInUnknownProtos).append(ifOutOctets).append(ifOutUcastPkts).append(ifOutNUcastPkts).append(ifOutDiscards).append(ifOutErrors).append(ifOutQLen).append(ifSpecific).append(_index).toHashCode();
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
        IfEntry rhs = ((IfEntry) obj);
        return new EqualsBuilder().append(ifIndex, rhs.ifIndex).append(ifDescr, rhs.ifDescr).append(ifType, rhs.ifType).append(ifMtu, rhs.ifMtu).append(ifSpeed, rhs.ifSpeed).append(ifPhysAddress, rhs.ifPhysAddress).append(ifAdminStatus, rhs.ifAdminStatus).append(ifOperStatus, rhs.ifOperStatus).append(ifLastChange, rhs.ifLastChange).append(ifInOctets, rhs.ifInOctets).append(ifInUcastPkts, rhs.ifInUcastPkts).append(ifInNUcastPkts, rhs.ifInNUcastPkts).append(ifInDiscards, rhs.ifInDiscards).append(ifInErrors, rhs.ifInErrors).append(ifInUnknownProtos, rhs.ifInUnknownProtos).append(ifOutOctets, rhs.ifOutOctets).append(ifOutUcastPkts, rhs.ifOutUcastPkts).append(ifOutNUcastPkts, rhs.ifOutNUcastPkts).append(ifOutDiscards, rhs.ifOutDiscards).append(ifOutErrors, rhs.ifOutErrors).append(ifOutQLen, rhs.ifOutQLen).append(ifSpecific, rhs.ifSpecific).append(_index, rhs._index).isEquals();
    }

    public IfEntry clone() {
        IfEntry _copy = new IfEntry();
        _copy.ifIndex = ifIndex;
        _copy.ifDescr = ifDescr;
        _copy.ifType = ifType;
        _copy.ifMtu = ifMtu;
        _copy.ifSpeed = ifSpeed;
        _copy.ifPhysAddress = ifPhysAddress;
        _copy.ifAdminStatus = ifAdminStatus;
        _copy.ifOperStatus = ifOperStatus;
        _copy.ifLastChange = ifLastChange;
        _copy.ifInOctets = ifInOctets;
        _copy.ifInUcastPkts = ifInUcastPkts;
        _copy.ifInNUcastPkts = ifInNUcastPkts;
        _copy.ifInDiscards = ifInDiscards;
        _copy.ifInErrors = ifInErrors;
        _copy.ifInUnknownProtos = ifInUnknownProtos;
        _copy.ifOutOctets = ifOutOctets;
        _copy.ifOutUcastPkts = ifOutUcastPkts;
        _copy.ifOutNUcastPkts = ifOutNUcastPkts;
        _copy.ifOutDiscards = ifOutDiscards;
        _copy.ifOutErrors = ifOutErrors;
        _copy.ifOutQLen = ifOutQLen;
        _copy.ifSpecific = ifSpecific;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.2.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ifDescr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ifType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ifMtu", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ifSpeed", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ifPhysAddress", DeviceEntityDescription.FieldType.STRING, 65535));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ifAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ifOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ifLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ifInOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ifInUcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ifInNUcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ifInDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ifInErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ifInUnknownProtos", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "ifOutOctets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "ifOutUcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "ifOutNUcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "ifOutDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "ifOutErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "ifOutQLen", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "ifSpecific", DeviceEntityDescription.FieldType.OID, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
