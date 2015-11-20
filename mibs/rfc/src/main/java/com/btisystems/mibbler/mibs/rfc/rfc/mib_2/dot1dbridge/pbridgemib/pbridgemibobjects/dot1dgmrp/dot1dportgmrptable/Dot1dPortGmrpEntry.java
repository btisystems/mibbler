
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgmrp.dot1dportgmrptable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgmrp.dot1dportgmrptable.IDot1dPortGmrpEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.pbridgemib.pbridgemibobjects.dot1dgmrp.Dot1dPortGmrpTable;
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

public class Dot1dPortGmrpEntry
    extends DeviceEntity
    implements Serializable, IDot1dPortGmrpEntry, IIndexed, IVariableBindingSetter
{

    private Integer dot1dPortGmrpStatus;
    private int dot1dPortGmrpFailedRegistrations;
    private String dot1dPortGmrpLastPduOrigin;
    private String _index;
    private Dot1dPortGmrpTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dPortGmrpEntry() {
    }

    public int getDot1dPortGmrpStatus() {
        if (this.dot1dPortGmrpStatus == null) {
            return  1;
        }
        return this.dot1dPortGmrpStatus;
    }

    public boolean isDot1dPortGmrpStatusDefined() {
        return (this.dot1dPortGmrpStatus!= null);
    }

    public void setDot1dPortGmrpStatus(int dot1dPortGmrpStatus) {
        int oldValue = getDot1dPortGmrpStatus();
        this.dot1dPortGmrpStatus = dot1dPortGmrpStatus;
        notifyChange(1, oldValue, dot1dPortGmrpStatus);
    }

    public int getDot1dPortGmrpFailedRegistrations() {
        return this.dot1dPortGmrpFailedRegistrations;
    }

    public void setDot1dPortGmrpFailedRegistrations(int dot1dPortGmrpFailedRegistrations) {
        int oldValue = getDot1dPortGmrpFailedRegistrations();
        this.dot1dPortGmrpFailedRegistrations = dot1dPortGmrpFailedRegistrations;
        notifyChange(2, oldValue, dot1dPortGmrpFailedRegistrations);
    }

    public String getDot1dPortGmrpLastPduOrigin() {
        return this.dot1dPortGmrpLastPduOrigin;
    }

    public void setDot1dPortGmrpLastPduOrigin(String dot1dPortGmrpLastPduOrigin) {
        String oldValue = getDot1dPortGmrpLastPduOrigin();
        this.dot1dPortGmrpLastPduOrigin = dot1dPortGmrpLastPduOrigin;
        notifyChange(3, oldValue, dot1dPortGmrpLastPduOrigin);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1dPortGmrpStatus(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1dPortGmrpFailedRegistrations(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1dPortGmrpLastPduOrigin(binding.getVariable().toString());
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

    public void _setTable(Dot1dPortGmrpTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dPortGmrpStatus", dot1dPortGmrpStatus).append("dot1dPortGmrpFailedRegistrations", dot1dPortGmrpFailedRegistrations).append("dot1dPortGmrpLastPduOrigin", dot1dPortGmrpLastPduOrigin).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dPortGmrpStatus).append(dot1dPortGmrpFailedRegistrations).append(dot1dPortGmrpLastPduOrigin).append(_index).toHashCode();
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
        Dot1dPortGmrpEntry rhs = ((Dot1dPortGmrpEntry) obj);
        return new EqualsBuilder().append(dot1dPortGmrpStatus, rhs.dot1dPortGmrpStatus).append(dot1dPortGmrpFailedRegistrations, rhs.dot1dPortGmrpFailedRegistrations).append(dot1dPortGmrpLastPduOrigin, rhs.dot1dPortGmrpLastPduOrigin).append(_index, rhs._index).isEquals();
    }

    public Dot1dPortGmrpEntry clone() {
        Dot1dPortGmrpEntry _copy = new Dot1dPortGmrpEntry();
        _copy.dot1dPortGmrpStatus = dot1dPortGmrpStatus;
        _copy.dot1dPortGmrpFailedRegistrations = dot1dPortGmrpFailedRegistrations;
        _copy.dot1dPortGmrpLastPduOrigin = dot1dPortGmrpLastPduOrigin;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.6.1.4.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dPortGmrpStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dPortGmrpFailedRegistrations", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1dPortGmrpLastPduOrigin", DeviceEntityDescription.FieldType.STRING, 18));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
