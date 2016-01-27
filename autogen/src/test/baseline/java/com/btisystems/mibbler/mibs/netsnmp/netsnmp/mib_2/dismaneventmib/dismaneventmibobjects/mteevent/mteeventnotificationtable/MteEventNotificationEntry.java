
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventnotificationtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventnotificationtable.IMteEventNotificationEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.MteEventNotificationTable;
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

public class MteEventNotificationEntry
    extends DeviceEntity
    implements Serializable, IMteEventNotificationEntry, IIndexed, IVariableBindingSetter
{

    private String mteEventNotification;
    private String mteEventNotificationObjectsOwner;
    private String mteEventNotificationObjects;
    private String _index;
    private MteEventNotificationTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteEventNotificationEntry() {
    }

    public String getMteEventNotification() {
        return this.mteEventNotification;
    }

    public void setMteEventNotification(String mteEventNotification) {
        String oldValue = getMteEventNotification();
        this.mteEventNotification = mteEventNotification;
        notifyChange(1, oldValue, mteEventNotification);
    }

    public String getMteEventNotificationObjectsOwner() {
        return this.mteEventNotificationObjectsOwner;
    }

    public void setMteEventNotificationObjectsOwner(String mteEventNotificationObjectsOwner) {
        String oldValue = getMteEventNotificationObjectsOwner();
        this.mteEventNotificationObjectsOwner = mteEventNotificationObjectsOwner;
        notifyChange(2, oldValue, mteEventNotificationObjectsOwner);
    }

    public String getMteEventNotificationObjects() {
        return this.mteEventNotificationObjects;
    }

    public void setMteEventNotificationObjects(String mteEventNotificationObjects) {
        String oldValue = getMteEventNotificationObjects();
        this.mteEventNotificationObjects = mteEventNotificationObjects;
        notifyChange(3, oldValue, mteEventNotificationObjects);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setMteEventNotification(binding.getVariable().toString());
                break;
            case  2 :
                setMteEventNotificationObjectsOwner(binding.getVariable().toString());
                break;
            case  3 :
                setMteEventNotificationObjects(binding.getVariable().toString());
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
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MteEventNotificationTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteEventNotification", mteEventNotification).append("mteEventNotificationObjectsOwner", mteEventNotificationObjectsOwner).append("mteEventNotificationObjects", mteEventNotificationObjects).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteEventNotification).append(mteEventNotificationObjectsOwner).append(mteEventNotificationObjects).append(_index).toHashCode();
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
        MteEventNotificationEntry rhs = ((MteEventNotificationEntry) obj);
        return new EqualsBuilder().append(mteEventNotification, rhs.mteEventNotification).append(mteEventNotificationObjectsOwner, rhs.mteEventNotificationObjectsOwner).append(mteEventNotificationObjects, rhs.mteEventNotificationObjects).append(_index, rhs._index).isEquals();
    }

    public MteEventNotificationEntry clone() {
        MteEventNotificationEntry _copy = new MteEventNotificationEntry();
        _copy.mteEventNotification = mteEventNotification;
        _copy.mteEventNotificationObjectsOwner = mteEventNotificationObjectsOwner;
        _copy.mteEventNotificationObjects = mteEventNotificationObjects;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.4.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteEventNotification", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mteEventNotificationObjectsOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mteEventNotificationObjects", DeviceEntityDescription.FieldType.STRING, 765));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
