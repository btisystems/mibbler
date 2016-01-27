
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventtable.IMteEventEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.MteEventTable;
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

public class MteEventEntry
    extends DeviceEntity
    implements Serializable, IMteEventEntry, IIndexed, IVariableBindingSetter
{

    private String mteEventName;
    private String mteEventComment;
    private String mteEventActions;
    private Integer mteEventEnabled;
    private int mteEventEntryStatus;
    private String _index;
    private MteEventTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteEventEntry() {
    }

    public String getMteEventName() {
        return this.mteEventName;
    }

    public void setMteEventName(String mteEventName) {
        String oldValue = getMteEventName();
        this.mteEventName = mteEventName;
        notifyChange(1, oldValue, mteEventName);
    }

    public String getMteEventComment() {
        return this.mteEventComment;
    }

    public void setMteEventComment(String mteEventComment) {
        String oldValue = getMteEventComment();
        this.mteEventComment = mteEventComment;
        notifyChange(2, oldValue, mteEventComment);
    }

    public String getMteEventActions() {
        return this.mteEventActions;
    }

    public void setMteEventActions(String mteEventActions) {
        String oldValue = getMteEventActions();
        this.mteEventActions = mteEventActions;
        notifyChange(3, oldValue, mteEventActions);
    }

    public int getMteEventEnabled() {
        if (this.mteEventEnabled == null) {
            return  2;
        }
        return this.mteEventEnabled;
    }

    public boolean isMteEventEnabledDefined() {
        return (this.mteEventEnabled!= null);
    }

    public void setMteEventEnabled(int mteEventEnabled) {
        int oldValue = getMteEventEnabled();
        this.mteEventEnabled = mteEventEnabled;
        notifyChange(4, oldValue, mteEventEnabled);
    }

    public int getMteEventEntryStatus() {
        return this.mteEventEntryStatus;
    }

    public void setMteEventEntryStatus(int mteEventEntryStatus) {
        int oldValue = getMteEventEntryStatus();
        this.mteEventEntryStatus = mteEventEntryStatus;
        notifyChange(5, oldValue, mteEventEntryStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setMteEventName(binding.getVariable().toString());
                break;
            case  2 :
                setMteEventComment(binding.getVariable().toString());
                break;
            case  3 :
                setMteEventActions(binding.getVariable().toString());
                break;
            case  4 :
                setMteEventEnabled(binding.getVariable().toInt());
                break;
            case  5 :
                setMteEventEntryStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 12;
        int _len;
        _index = new OID(_oidInts, 12, (oid.size()- 12)).toString();
        _len = _oidInts[arrayOffset ++];
        arrayOffset += _len;
        _len = (_oidBytes.length-arrayOffset);
        setMteEventName(new String(_oidBytes, arrayOffset, _len));
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MteEventTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteEventName", mteEventName).append("mteEventComment", mteEventComment).append("mteEventActions", mteEventActions).append("mteEventEnabled", mteEventEnabled).append("mteEventEntryStatus", mteEventEntryStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteEventName).append(mteEventComment).append(mteEventActions).append(mteEventEnabled).append(mteEventEntryStatus).append(_index).toHashCode();
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
        MteEventEntry rhs = ((MteEventEntry) obj);
        return new EqualsBuilder().append(mteEventName, rhs.mteEventName).append(mteEventComment, rhs.mteEventComment).append(mteEventActions, rhs.mteEventActions).append(mteEventEnabled, rhs.mteEventEnabled).append(mteEventEntryStatus, rhs.mteEventEntryStatus).append(_index, rhs._index).isEquals();
    }

    public MteEventEntry clone() {
        MteEventEntry _copy = new MteEventEntry();
        _copy.mteEventName = mteEventName;
        _copy.mteEventComment = mteEventComment;
        _copy.mteEventActions = mteEventActions;
        _copy.mteEventEnabled = mteEventEnabled;
        _copy.mteEventEntryStatus = mteEventEntryStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.4.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteEventName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mteEventComment", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mteEventActions", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mteEventEnabled", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "mteEventEntryStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
