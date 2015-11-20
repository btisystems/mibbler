
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.ospfnbrtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.OspfNbrTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospfnbrtable.IOspfNbrEntry;
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

public class OspfNbrEntry
    extends DeviceEntity
    implements Serializable, IOspfNbrEntry, IIndexed, IVariableBindingSetter
{

    private String ospfNbrIpAddr;
    private int ospfNbrAddressLessIndex;
    private String ospfNbrRtrId;
    private int ospfNbrOptions;
    private int ospfNbrPriority;
    private int ospfNbrState;
    private String _index;
    private OspfNbrTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OspfNbrEntry() {
    }

    public String getOspfNbrIpAddr() {
        return this.ospfNbrIpAddr;
    }

    public void setOspfNbrIpAddr(String ospfNbrIpAddr) {
        String oldValue = getOspfNbrIpAddr();
        this.ospfNbrIpAddr = ospfNbrIpAddr;
        notifyChange(1, oldValue, ospfNbrIpAddr);
    }

    public int getOspfNbrAddressLessIndex() {
        return this.ospfNbrAddressLessIndex;
    }

    public void setOspfNbrAddressLessIndex(int ospfNbrAddressLessIndex) {
        int oldValue = getOspfNbrAddressLessIndex();
        this.ospfNbrAddressLessIndex = ospfNbrAddressLessIndex;
        notifyChange(2, oldValue, ospfNbrAddressLessIndex);
    }

    public String getOspfNbrRtrId() {
        return this.ospfNbrRtrId;
    }

    public void setOspfNbrRtrId(String ospfNbrRtrId) {
        String oldValue = getOspfNbrRtrId();
        this.ospfNbrRtrId = ospfNbrRtrId;
        notifyChange(3, oldValue, ospfNbrRtrId);
    }

    public int getOspfNbrOptions() {
        return this.ospfNbrOptions;
    }

    public void setOspfNbrOptions(int ospfNbrOptions) {
        int oldValue = getOspfNbrOptions();
        this.ospfNbrOptions = ospfNbrOptions;
        notifyChange(4, oldValue, ospfNbrOptions);
    }

    public int getOspfNbrPriority() {
        return this.ospfNbrPriority;
    }

    public void setOspfNbrPriority(int ospfNbrPriority) {
        int oldValue = getOspfNbrPriority();
        this.ospfNbrPriority = ospfNbrPriority;
        notifyChange(5, oldValue, ospfNbrPriority);
    }

    public int getOspfNbrState() {
        return this.ospfNbrState;
    }

    public void setOspfNbrState(int ospfNbrState) {
        int oldValue = getOspfNbrState();
        this.ospfNbrState = ospfNbrState;
        notifyChange(6, oldValue, ospfNbrState);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setOspfNbrIpAddr(binding.getVariable().toString());
                break;
            case  2 :
                setOspfNbrAddressLessIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setOspfNbrRtrId(binding.getVariable().toString());
                break;
            case  4 :
                setOspfNbrOptions(binding.getVariable().toInt());
                break;
            case  5 :
                setOspfNbrPriority(binding.getVariable().toInt());
                break;
            case  6 :
                setOspfNbrState(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setOspfNbrIpAddr(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
        setOspfNbrAddressLessIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OspfNbrTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ospfNbrIpAddr", ospfNbrIpAddr).append("ospfNbrAddressLessIndex", ospfNbrAddressLessIndex).append("ospfNbrRtrId", ospfNbrRtrId).append("ospfNbrOptions", ospfNbrOptions).append("ospfNbrPriority", ospfNbrPriority).append("ospfNbrState", ospfNbrState).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ospfNbrIpAddr).append(ospfNbrAddressLessIndex).append(ospfNbrRtrId).append(ospfNbrOptions).append(ospfNbrPriority).append(ospfNbrState).append(_index).toHashCode();
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
        OspfNbrEntry rhs = ((OspfNbrEntry) obj);
        return new EqualsBuilder().append(ospfNbrIpAddr, rhs.ospfNbrIpAddr).append(ospfNbrAddressLessIndex, rhs.ospfNbrAddressLessIndex).append(ospfNbrRtrId, rhs.ospfNbrRtrId).append(ospfNbrOptions, rhs.ospfNbrOptions).append(ospfNbrPriority, rhs.ospfNbrPriority).append(ospfNbrState, rhs.ospfNbrState).append(_index, rhs._index).isEquals();
    }

    public OspfNbrEntry clone() {
        OspfNbrEntry _copy = new OspfNbrEntry();
        _copy.ospfNbrIpAddr = ospfNbrIpAddr;
        _copy.ospfNbrAddressLessIndex = ospfNbrAddressLessIndex;
        _copy.ospfNbrRtrId = ospfNbrRtrId;
        _copy.ospfNbrOptions = ospfNbrOptions;
        _copy.ospfNbrPriority = ospfNbrPriority;
        _copy.ospfNbrState = ospfNbrState;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.13.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ospfNbrIpAddr", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ospfNbrAddressLessIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ospfNbrRtrId", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ospfNbrOptions", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ospfNbrPriority", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ospfNbrState", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
