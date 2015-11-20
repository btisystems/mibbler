
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.ospflsdbtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.OspfLsdbTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospflsdbtable.IOspfLsdbEntry;
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

public class OspfLsdbEntry
    extends DeviceEntity
    implements Serializable, IOspfLsdbEntry, IIndexed, IVariableBindingSetter
{

    private String ospfLsdbAreaId;
    private int ospfLsdbType;
    private String ospfLsdbLsid;
    private String ospfLsdbRouterId;
    private int ospfLsdbSequence;
    private int ospfLsdbAge;
    private int ospfLsdbChecksum;
    private String _index;
    private OspfLsdbTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OspfLsdbEntry() {
    }

    public String getOspfLsdbAreaId() {
        return this.ospfLsdbAreaId;
    }

    public void setOspfLsdbAreaId(String ospfLsdbAreaId) {
        String oldValue = getOspfLsdbAreaId();
        this.ospfLsdbAreaId = ospfLsdbAreaId;
        notifyChange(1, oldValue, ospfLsdbAreaId);
    }

    public int getOspfLsdbType() {
        return this.ospfLsdbType;
    }

    public void setOspfLsdbType(int ospfLsdbType) {
        int oldValue = getOspfLsdbType();
        this.ospfLsdbType = ospfLsdbType;
        notifyChange(2, oldValue, ospfLsdbType);
    }

    public String getOspfLsdbLsid() {
        return this.ospfLsdbLsid;
    }

    public void setOspfLsdbLsid(String ospfLsdbLsid) {
        String oldValue = getOspfLsdbLsid();
        this.ospfLsdbLsid = ospfLsdbLsid;
        notifyChange(3, oldValue, ospfLsdbLsid);
    }

    public String getOspfLsdbRouterId() {
        return this.ospfLsdbRouterId;
    }

    public void setOspfLsdbRouterId(String ospfLsdbRouterId) {
        String oldValue = getOspfLsdbRouterId();
        this.ospfLsdbRouterId = ospfLsdbRouterId;
        notifyChange(4, oldValue, ospfLsdbRouterId);
    }

    public int getOspfLsdbSequence() {
        return this.ospfLsdbSequence;
    }

    public void setOspfLsdbSequence(int ospfLsdbSequence) {
        int oldValue = getOspfLsdbSequence();
        this.ospfLsdbSequence = ospfLsdbSequence;
        notifyChange(5, oldValue, ospfLsdbSequence);
    }

    public int getOspfLsdbAge() {
        return this.ospfLsdbAge;
    }

    public void setOspfLsdbAge(int ospfLsdbAge) {
        int oldValue = getOspfLsdbAge();
        this.ospfLsdbAge = ospfLsdbAge;
        notifyChange(6, oldValue, ospfLsdbAge);
    }

    public int getOspfLsdbChecksum() {
        return this.ospfLsdbChecksum;
    }

    public void setOspfLsdbChecksum(int ospfLsdbChecksum) {
        int oldValue = getOspfLsdbChecksum();
        this.ospfLsdbChecksum = ospfLsdbChecksum;
        notifyChange(7, oldValue, ospfLsdbChecksum);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setOspfLsdbAreaId(binding.getVariable().toString());
                break;
            case  2 :
                setOspfLsdbType(binding.getVariable().toInt());
                break;
            case  3 :
                setOspfLsdbLsid(binding.getVariable().toString());
                break;
            case  4 :
                setOspfLsdbRouterId(binding.getVariable().toString());
                break;
            case  5 :
                setOspfLsdbSequence(binding.getVariable().toInt());
                break;
            case  6 :
                setOspfLsdbAge(binding.getVariable().toInt());
                break;
            case  7 :
                setOspfLsdbChecksum(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setOspfLsdbAreaId(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
        setOspfLsdbType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setOspfLsdbLsid(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
        setOspfLsdbRouterId(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OspfLsdbTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ospfLsdbAreaId", ospfLsdbAreaId).append("ospfLsdbType", ospfLsdbType).append("ospfLsdbLsid", ospfLsdbLsid).append("ospfLsdbRouterId", ospfLsdbRouterId).append("ospfLsdbSequence", ospfLsdbSequence).append("ospfLsdbAge", ospfLsdbAge).append("ospfLsdbChecksum", ospfLsdbChecksum).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ospfLsdbAreaId).append(ospfLsdbType).append(ospfLsdbLsid).append(ospfLsdbRouterId).append(ospfLsdbSequence).append(ospfLsdbAge).append(ospfLsdbChecksum).append(_index).toHashCode();
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
        OspfLsdbEntry rhs = ((OspfLsdbEntry) obj);
        return new EqualsBuilder().append(ospfLsdbAreaId, rhs.ospfLsdbAreaId).append(ospfLsdbType, rhs.ospfLsdbType).append(ospfLsdbLsid, rhs.ospfLsdbLsid).append(ospfLsdbRouterId, rhs.ospfLsdbRouterId).append(ospfLsdbSequence, rhs.ospfLsdbSequence).append(ospfLsdbAge, rhs.ospfLsdbAge).append(ospfLsdbChecksum, rhs.ospfLsdbChecksum).append(_index, rhs._index).isEquals();
    }

    public OspfLsdbEntry clone() {
        OspfLsdbEntry _copy = new OspfLsdbEntry();
        _copy.ospfLsdbAreaId = ospfLsdbAreaId;
        _copy.ospfLsdbType = ospfLsdbType;
        _copy.ospfLsdbLsid = ospfLsdbLsid;
        _copy.ospfLsdbRouterId = ospfLsdbRouterId;
        _copy.ospfLsdbSequence = ospfLsdbSequence;
        _copy.ospfLsdbAge = ospfLsdbAge;
        _copy.ospfLsdbChecksum = ospfLsdbChecksum;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.13.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ospfLsdbAreaId", DeviceEntityDescription.FieldType.STRING, 1024));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ospfLsdbType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ospfLsdbLsid", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ospfLsdbRouterId", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ospfLsdbSequence", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ospfLsdbAge", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ospfLsdbChecksum", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
