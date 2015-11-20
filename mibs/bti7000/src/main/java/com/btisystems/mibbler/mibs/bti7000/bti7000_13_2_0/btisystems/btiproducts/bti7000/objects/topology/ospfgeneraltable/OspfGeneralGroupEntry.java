
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.ospfgeneraltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.topology.OspfGeneralTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.topology.ospfgeneraltable.IOspfGeneralGroupEntry;
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

public class OspfGeneralGroupEntry
    extends DeviceEntity
    implements Serializable, IOspfGeneralGroupEntry, IIndexed, IVariableBindingSetter
{

    private Integer ospfIdx;
    private String ospfRouterId;
    private Integer ospfAdminStat;
    private int ospfVersionNumber;
    private int ospfAreaBdrRtrStatus;
    private Integer ospfRouteRedist;
    private String ospfAreaId;
    private int ospfRowStatus;
    private String _index;
    private OspfGeneralTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public OspfGeneralGroupEntry() {
    }

    public int getOspfIdx() {
        if (this.ospfIdx == null) {
            return  1;
        }
        return this.ospfIdx;
    }

    public boolean isOspfIdxDefined() {
        return (this.ospfIdx!= null);
    }

    public void setOspfIdx(int ospfIdx) {
        int oldValue = getOspfIdx();
        this.ospfIdx = ospfIdx;
        notifyChange(1, oldValue, ospfIdx);
    }

    public String getOspfRouterId() {
        return this.ospfRouterId;
    }

    public void setOspfRouterId(String ospfRouterId) {
        String oldValue = getOspfRouterId();
        this.ospfRouterId = ospfRouterId;
        notifyChange(2, oldValue, ospfRouterId);
    }

    public int getOspfAdminStat() {
        if (this.ospfAdminStat == null) {
            return  1;
        }
        return this.ospfAdminStat;
    }

    public boolean isOspfAdminStatDefined() {
        return (this.ospfAdminStat!= null);
    }

    public void setOspfAdminStat(int ospfAdminStat) {
        int oldValue = getOspfAdminStat();
        this.ospfAdminStat = ospfAdminStat;
        notifyChange(3, oldValue, ospfAdminStat);
    }

    public int getOspfVersionNumber() {
        return this.ospfVersionNumber;
    }

    public void setOspfVersionNumber(int ospfVersionNumber) {
        int oldValue = getOspfVersionNumber();
        this.ospfVersionNumber = ospfVersionNumber;
        notifyChange(4, oldValue, ospfVersionNumber);
    }

    public int getOspfAreaBdrRtrStatus() {
        return this.ospfAreaBdrRtrStatus;
    }

    public void setOspfAreaBdrRtrStatus(int ospfAreaBdrRtrStatus) {
        int oldValue = getOspfAreaBdrRtrStatus();
        this.ospfAreaBdrRtrStatus = ospfAreaBdrRtrStatus;
        notifyChange(5, oldValue, ospfAreaBdrRtrStatus);
    }

    public int getOspfRouteRedist() {
        if (this.ospfRouteRedist == null) {
            return  1;
        }
        return this.ospfRouteRedist;
    }

    public boolean isOspfRouteRedistDefined() {
        return (this.ospfRouteRedist!= null);
    }

    public void setOspfRouteRedist(int ospfRouteRedist) {
        int oldValue = getOspfRouteRedist();
        this.ospfRouteRedist = ospfRouteRedist;
        notifyChange(6, oldValue, ospfRouteRedist);
    }

    public String getOspfAreaId() {
        return this.ospfAreaId;
    }

    public void setOspfAreaId(String ospfAreaId) {
        String oldValue = getOspfAreaId();
        this.ospfAreaId = ospfAreaId;
        notifyChange(7, oldValue, ospfAreaId);
    }

    public int getOspfRowStatus() {
        return this.ospfRowStatus;
    }

    public void setOspfRowStatus(int ospfRowStatus) {
        int oldValue = getOspfRowStatus();
        this.ospfRowStatus = ospfRowStatus;
        notifyChange(8, oldValue, ospfRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setOspfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setOspfRouterId(binding.getVariable().toString());
                break;
            case  3 :
                setOspfAdminStat(binding.getVariable().toInt());
                break;
            case  4 :
                setOspfVersionNumber(binding.getVariable().toInt());
                break;
            case  5 :
                setOspfAreaBdrRtrStatus(binding.getVariable().toInt());
                break;
            case  6 :
                setOspfRouteRedist(binding.getVariable().toInt());
                break;
            case  7 :
                setOspfAreaId(binding.getVariable().toString());
                break;
            case  8 :
                setOspfRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setOspfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(OspfGeneralTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ospfIdx", ospfIdx).append("ospfRouterId", ospfRouterId).append("ospfAdminStat", ospfAdminStat).append("ospfVersionNumber", ospfVersionNumber).append("ospfAreaBdrRtrStatus", ospfAreaBdrRtrStatus).append("ospfRouteRedist", ospfRouteRedist).append("ospfAreaId", ospfAreaId).append("ospfRowStatus", ospfRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ospfIdx).append(ospfRouterId).append(ospfAdminStat).append(ospfVersionNumber).append(ospfAreaBdrRtrStatus).append(ospfRouteRedist).append(ospfAreaId).append(ospfRowStatus).append(_index).toHashCode();
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
        OspfGeneralGroupEntry rhs = ((OspfGeneralGroupEntry) obj);
        return new EqualsBuilder().append(ospfIdx, rhs.ospfIdx).append(ospfRouterId, rhs.ospfRouterId).append(ospfAdminStat, rhs.ospfAdminStat).append(ospfVersionNumber, rhs.ospfVersionNumber).append(ospfAreaBdrRtrStatus, rhs.ospfAreaBdrRtrStatus).append(ospfRouteRedist, rhs.ospfRouteRedist).append(ospfAreaId, rhs.ospfAreaId).append(ospfRowStatus, rhs.ospfRowStatus).append(_index, rhs._index).isEquals();
    }

    public OspfGeneralGroupEntry clone() {
        OspfGeneralGroupEntry _copy = new OspfGeneralGroupEntry();
        _copy.ospfIdx = ospfIdx;
        _copy.ospfRouterId = ospfRouterId;
        _copy.ospfAdminStat = ospfAdminStat;
        _copy.ospfVersionNumber = ospfVersionNumber;
        _copy.ospfAreaBdrRtrStatus = ospfAreaBdrRtrStatus;
        _copy.ospfRouteRedist = ospfRouteRedist;
        _copy.ospfAreaId = ospfAreaId;
        _copy.ospfRowStatus = ospfRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.13.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ospfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ospfRouterId", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ospfAdminStat", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ospfVersionNumber", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ospfAreaBdrRtrStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ospfRouteRedist", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ospfAreaId", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ospfRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
