
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlantable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlantable.IDot1qPortVlanEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.Dot1qPortVlanTable;
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

public class Dot1qPortVlanEntry
    extends DeviceEntity
    implements Serializable, IDot1qPortVlanEntry, IIndexed, IVariableBindingSetter
{

    private Integer dot1qPvid;
    private Integer dot1qPortAcceptableFrameTypes;
    private Integer dot1qPortIngressFiltering;
    private Integer dot1qPortGvrpStatus;
    private int dot1qPortGvrpFailedRegistrations;
    private String dot1qPortGvrpLastPduOrigin;
    private String _index;
    private Dot1qPortVlanTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qPortVlanEntry() {
    }

    public int getDot1qPvid() {
        if (this.dot1qPvid == null) {
            return  1;
        }
        return this.dot1qPvid;
    }

    public boolean isDot1qPvidDefined() {
        return (this.dot1qPvid!= null);
    }

    public void setDot1qPvid(int dot1qPvid) {
        int oldValue = getDot1qPvid();
        this.dot1qPvid = dot1qPvid;
        notifyChange(1, oldValue, dot1qPvid);
    }

    public int getDot1qPortAcceptableFrameTypes() {
        if (this.dot1qPortAcceptableFrameTypes == null) {
            return  1;
        }
        return this.dot1qPortAcceptableFrameTypes;
    }

    public boolean isDot1qPortAcceptableFrameTypesDefined() {
        return (this.dot1qPortAcceptableFrameTypes!= null);
    }

    public void setDot1qPortAcceptableFrameTypes(int dot1qPortAcceptableFrameTypes) {
        int oldValue = getDot1qPortAcceptableFrameTypes();
        this.dot1qPortAcceptableFrameTypes = dot1qPortAcceptableFrameTypes;
        notifyChange(2, oldValue, dot1qPortAcceptableFrameTypes);
    }

    public int getDot1qPortIngressFiltering() {
        if (this.dot1qPortIngressFiltering == null) {
            return  2;
        }
        return this.dot1qPortIngressFiltering;
    }

    public boolean isDot1qPortIngressFilteringDefined() {
        return (this.dot1qPortIngressFiltering!= null);
    }

    public void setDot1qPortIngressFiltering(int dot1qPortIngressFiltering) {
        int oldValue = getDot1qPortIngressFiltering();
        this.dot1qPortIngressFiltering = dot1qPortIngressFiltering;
        notifyChange(3, oldValue, dot1qPortIngressFiltering);
    }

    public int getDot1qPortGvrpStatus() {
        if (this.dot1qPortGvrpStatus == null) {
            return  1;
        }
        return this.dot1qPortGvrpStatus;
    }

    public boolean isDot1qPortGvrpStatusDefined() {
        return (this.dot1qPortGvrpStatus!= null);
    }

    public void setDot1qPortGvrpStatus(int dot1qPortGvrpStatus) {
        int oldValue = getDot1qPortGvrpStatus();
        this.dot1qPortGvrpStatus = dot1qPortGvrpStatus;
        notifyChange(4, oldValue, dot1qPortGvrpStatus);
    }

    public int getDot1qPortGvrpFailedRegistrations() {
        return this.dot1qPortGvrpFailedRegistrations;
    }

    public void setDot1qPortGvrpFailedRegistrations(int dot1qPortGvrpFailedRegistrations) {
        int oldValue = getDot1qPortGvrpFailedRegistrations();
        this.dot1qPortGvrpFailedRegistrations = dot1qPortGvrpFailedRegistrations;
        notifyChange(5, oldValue, dot1qPortGvrpFailedRegistrations);
    }

    public String getDot1qPortGvrpLastPduOrigin() {
        return this.dot1qPortGvrpLastPduOrigin;
    }

    public void setDot1qPortGvrpLastPduOrigin(String dot1qPortGvrpLastPduOrigin) {
        String oldValue = getDot1qPortGvrpLastPduOrigin();
        this.dot1qPortGvrpLastPduOrigin = dot1qPortGvrpLastPduOrigin;
        notifyChange(6, oldValue, dot1qPortGvrpLastPduOrigin);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qPvid(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1qPortAcceptableFrameTypes(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1qPortIngressFiltering(binding.getVariable().toInt());
                break;
            case  4 :
                setDot1qPortGvrpStatus(binding.getVariable().toInt());
                break;
            case  5 :
                setDot1qPortGvrpFailedRegistrations(binding.getVariable().toInt());
                break;
            case  6 :
                setDot1qPortGvrpLastPduOrigin(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 13;
        int _len;
        _index = new OID(_oidInts, 13, (oid.size()- 13)).toString();
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1qPortVlanTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qPvid", dot1qPvid).append("dot1qPortAcceptableFrameTypes", dot1qPortAcceptableFrameTypes).append("dot1qPortIngressFiltering", dot1qPortIngressFiltering).append("dot1qPortGvrpStatus", dot1qPortGvrpStatus).append("dot1qPortGvrpFailedRegistrations", dot1qPortGvrpFailedRegistrations).append("dot1qPortGvrpLastPduOrigin", dot1qPortGvrpLastPduOrigin).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qPvid).append(dot1qPortAcceptableFrameTypes).append(dot1qPortIngressFiltering).append(dot1qPortGvrpStatus).append(dot1qPortGvrpFailedRegistrations).append(dot1qPortGvrpLastPduOrigin).append(_index).toHashCode();
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
        Dot1qPortVlanEntry rhs = ((Dot1qPortVlanEntry) obj);
        return new EqualsBuilder().append(dot1qPvid, rhs.dot1qPvid).append(dot1qPortAcceptableFrameTypes, rhs.dot1qPortAcceptableFrameTypes).append(dot1qPortIngressFiltering, rhs.dot1qPortIngressFiltering).append(dot1qPortGvrpStatus, rhs.dot1qPortGvrpStatus).append(dot1qPortGvrpFailedRegistrations, rhs.dot1qPortGvrpFailedRegistrations).append(dot1qPortGvrpLastPduOrigin, rhs.dot1qPortGvrpLastPduOrigin).append(_index, rhs._index).isEquals();
    }

    public Dot1qPortVlanEntry clone() {
        Dot1qPortVlanEntry _copy = new Dot1qPortVlanEntry();
        _copy.dot1qPvid = dot1qPvid;
        _copy.dot1qPortAcceptableFrameTypes = dot1qPortAcceptableFrameTypes;
        _copy.dot1qPortIngressFiltering = dot1qPortIngressFiltering;
        _copy.dot1qPortGvrpStatus = dot1qPortGvrpStatus;
        _copy.dot1qPortGvrpFailedRegistrations = dot1qPortGvrpFailedRegistrations;
        _copy.dot1qPortGvrpLastPduOrigin = dot1qPortGvrpLastPduOrigin;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.4.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qPvid", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qPortAcceptableFrameTypes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1qPortIngressFiltering", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1qPortGvrpStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot1qPortGvrpFailedRegistrations", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "dot1qPortGvrpLastPduOrigin", DeviceEntityDescription.FieldType.STRING, 18));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
